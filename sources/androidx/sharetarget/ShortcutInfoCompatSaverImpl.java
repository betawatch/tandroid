package androidx.sharetarget;

import a0.f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c0.m;
import e0.j0;
import g0.b;
import g0.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pb.l;
import x4.e;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends d {
    public static final Object h = new Object();
    public static volatile ShortcutInfoCompatSaverImpl i;
    public final Context a;
    public final f b = new f(0);
    public final f c = new f(0);
    public final ThreadPoolExecutor d;
    public final ThreadPoolExecutor e;
    public final File f;
    public final File g;

    public ShortcutInfoCompatSaverImpl(Context context, ThreadPoolExecutor threadPoolExecutor, ThreadPoolExecutor threadPoolExecutor2) {
        this.a = context.getApplicationContext();
        this.d = threadPoolExecutor;
        this.e = threadPoolExecutor2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.g = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.f = new File(file, "targets.xml");
        threadPoolExecutor.submit(new l(this, file, false, 9));
    }

    public static void f(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        i = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return i;
    }

    @Override // g0.d
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            b bVar2 = new b();
            bVar2.a = bVar.a;
            bVar2.b = bVar.b;
            Intent[] intentArr = bVar.c;
            bVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            bVar2.d = bVar.d;
            bVar2.e = bVar.e;
            bVar2.f = bVar.f;
            bVar2.g = bVar.g;
            bVar2.h = bVar.h;
            bVar2.k = bVar.k;
            bVar2.l = bVar.l;
            bVar2.m = bVar.m;
            j0[] j0VarArr = bVar.i;
            if (j0VarArr != null) {
                bVar2.i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
            }
            if (bVar.j != null) {
                bVar2.j = new HashSet(bVar.j);
            }
            PersistableBundle persistableBundle = bVar.n;
            if (persistableBundle != null) {
                bVar2.n = persistableBundle;
            }
            if (TextUtils.isEmpty(bVar2.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr2 = bVar2.c;
            if (intentArr2 == null || intentArr2.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(bVar2);
        }
        m mVar = new m();
        this.d.submit(new e(this, arrayList, mVar, 1));
        return mVar;
    }

    @Override // g0.d
    public final List b() {
        return (List) this.d.submit(new a2.b(this, 6)).get();
    }

    @Override // g0.d
    public final Object c() {
        m mVar = new m();
        this.d.submit(new l(this, mVar, false, 10));
        return mVar;
    }

    @Override // g0.d
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        m mVar = new m();
        this.d.submit(new e(this, arrayList, mVar, 0));
        return mVar;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x4.f fVar = (x4.f) obj;
            if (!TextUtils.isEmpty(fVar.b)) {
                arrayList2.add(fVar.b);
            }
        }
        for (File file : this.g.listFiles()) {
            if (!arrayList2.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public final IconCompat g(String str) {
        int i7;
        Context context = this.a;
        x4.f fVar = (x4.f) this.d.submit(new vb.d(this, str)).get();
        if (fVar == null) {
            return null;
        }
        String str2 = fVar.a;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i7 = context.getResources().getIdentifier(str2, null, null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 != 0) {
                return IconCompat.d(context, i7);
            }
        }
        if (TextUtils.isEmpty(fVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new a2.b(fVar, 7)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(m mVar) {
        l lVar = new l(this, new ArrayList(this.b.values()), false, 7);
        m mVar2 = new m();
        this.e.submit(new l(11, mVar2, lVar));
        mVar2.b(new l(8, mVar2, mVar), this.d);
    }
}
