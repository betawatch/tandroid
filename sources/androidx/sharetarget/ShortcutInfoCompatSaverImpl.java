package androidx.sharetarget;

import a0.f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b8.dg;
import c0.m;
import e0.k0;
import g0.c;
import g0.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import sb.d;
import u9.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends e {
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
        threadPoolExecutor.submit(new k(3, this, file));
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

    @Override // g0.e
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            c cVar2 = new c();
            cVar2.a = cVar.a;
            cVar2.b = cVar.b;
            Intent[] intentArr = cVar.c;
            cVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            cVar2.d = cVar.d;
            cVar2.e = cVar.e;
            cVar2.f = cVar.f;
            cVar2.g = cVar.g;
            cVar2.h = cVar.h;
            cVar2.k = cVar.k;
            cVar2.l = cVar.l;
            cVar2.m = cVar.m;
            k0[] k0VarArr = cVar.i;
            if (k0VarArr != null) {
                cVar2.i = (k0[]) Arrays.copyOf(k0VarArr, k0VarArr.length);
            }
            if (cVar.j != null) {
                cVar2.j = new HashSet(cVar.j);
            }
            PersistableBundle persistableBundle = cVar.n;
            if (persistableBundle != null) {
                cVar2.n = persistableBundle;
            }
            if (TextUtils.isEmpty(cVar2.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr2 = cVar2.c;
            if (intentArr2 == null || intentArr2.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(cVar2);
        }
        m mVar = new m();
        this.d.submit(new w4.e(this, arrayList, mVar, 1));
        return mVar;
    }

    @Override // g0.e
    public final List b() {
        return (List) this.d.submit(new dg(this, 4)).get();
    }

    @Override // g0.e
    public final Object c() {
        m mVar = new m();
        this.d.submit(new k(4, this, mVar));
        return mVar;
    }

    @Override // g0.e
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        m mVar = new m();
        this.d.submit(new w4.e(this, arrayList, mVar, 0));
        return mVar;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w4.f fVar = (w4.f) obj;
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
        int i3;
        Context context = this.a;
        w4.f fVar = (w4.f) this.d.submit(new d(this, str)).get();
        if (fVar == null) {
            return null;
        }
        String str2 = fVar.a;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i3 = context.getResources().getIdentifier(str2, null, null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 != 0) {
                return IconCompat.d(context, i3);
            }
        }
        if (TextUtils.isEmpty(fVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new dg(fVar, 5)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(m mVar) {
        k kVar = new k(1, this, new ArrayList(this.b.values()));
        m mVar2 = new m();
        this.e.submit(new k(5, mVar2, kVar));
        mVar2.b(new k(mVar2, mVar, false, 2), this.d);
    }
}
