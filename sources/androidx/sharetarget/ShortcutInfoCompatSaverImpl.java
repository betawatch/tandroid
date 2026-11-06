package androidx.sharetarget;

import a0.f;
import a2.b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c0.m;
import e0.j0;
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
import org.telegram.ui.fx;
import vb.d;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        threadPoolExecutor.submit(new fx(9, this, file));
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
            j0[] j0VarArr = cVar.i;
            if (j0VarArr != null) {
                cVar2.i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
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
        this.d.submit(new x4.e(this, arrayList, mVar, 1));
        return mVar;
    }

    @Override // g0.e
    public final List b() {
        return (List) this.d.submit(new b(this, 6)).get();
    }

    @Override // g0.e
    public final Object c() {
        m mVar = new m();
        this.d.submit(new fx(10, this, mVar));
        return mVar;
    }

    @Override // g0.e
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        m mVar = new m();
        this.d.submit(new x4.e(this, arrayList, mVar, 0));
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
        x4.f fVar = (x4.f) this.d.submit(new d(this, str)).get();
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
        Bitmap bitmap = (Bitmap) this.e.submit(new b(fVar, 7)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(m mVar) {
        fx fxVar = new fx(7, this, new ArrayList(this.b.values()));
        m mVar2 = new m();
        this.e.submit(new fx(mVar2, fxVar, false, 11));
        mVar2.b(new fx(mVar2, mVar, false, 8), this.d);
    }
}
