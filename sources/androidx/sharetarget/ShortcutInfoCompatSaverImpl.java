package androidx.sharetarget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends jka {
    public static final Object h = new Object();
    public static volatile ShortcutInfoCompatSaverImpl i;
    public final Context a;
    public final qs b = new qs(0);
    public final qs c = new qs(0);
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
        threadPoolExecutor.submit(new iqd((Object) this, (Object) file, false, (byte) 10));
    }

    public static void f(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (i == null) {
            synchronized (h) {
                if (i == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    i = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return i;
    }

    @Override // jka
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hka hkaVar = (hka) it.next();
            hka hkaVar2 = new hka();
            hkaVar2.a = hkaVar.a;
            hkaVar2.b = hkaVar.b;
            Intent[] intentArr = hkaVar.c;
            hkaVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            hkaVar2.d = hkaVar.d;
            hkaVar2.e = hkaVar.e;
            hkaVar2.f = hkaVar.f;
            hkaVar2.g = hkaVar.g;
            hkaVar2.h = hkaVar.h;
            hkaVar2.k = hkaVar.k;
            hkaVar2.l = hkaVar.l;
            hkaVar2.m = hkaVar.m;
            b78[] b78VarArr = hkaVar.i;
            if (b78VarArr != null) {
                hkaVar2.i = (b78[]) Arrays.copyOf(b78VarArr, b78VarArr.length);
            }
            if (hkaVar.j != null) {
                hkaVar2.j = new HashSet(hkaVar.j);
            }
            PersistableBundle persistableBundle = hkaVar.n;
            if (persistableBundle != null) {
                hkaVar2.n = persistableBundle;
            }
            if (TextUtils.isEmpty(hkaVar2.e)) {
                lq5.j("Shortcut must have a non-empty label");
                return null;
            }
            Intent[] intentArr2 = hkaVar2.c;
            if (intentArr2 == null || intentArr2.length == 0) {
                lq5.j("Shortcut must have an intent");
                return null;
            }
            arrayList.add(hkaVar2);
        }
        sd9 sd9Var = new sd9();
        this.d.submit(new kka(this, arrayList, sd9Var, (byte) 1));
        return sd9Var;
    }

    @Override // jka
    public final List b() {
        return (List) this.d.submit(new tg7(this, (byte) 1)).get();
    }

    @Override // jka
    public final Object c() {
        sd9 sd9Var = new sd9();
        this.d.submit(new xs4(this, sd9Var, false, (byte) 13));
        return sd9Var;
    }

    @Override // jka
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        sd9 sd9Var = new sd9();
        this.d.submit(new kka(this, arrayList, sd9Var, (byte) 0));
        return sd9Var;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            nka nkaVar = (nka) obj;
            if (!TextUtils.isEmpty(nkaVar.b)) {
                arrayList2.add(nkaVar.b);
            }
        }
        for (File file : this.g.listFiles()) {
            if (!arrayList2.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public final IconCompat g(String str) {
        int i2;
        Context context = this.a;
        nka nkaVar = (nka) this.d.submit(new lka(this, str)).get();
        if (nkaVar == null) {
            return null;
        }
        String str2 = nkaVar.a;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i2 = context.getResources().getIdentifier(str2, null, null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 != 0) {
                return IconCompat.d(context, i2);
            }
        }
        if (TextUtils.isEmpty(nkaVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new tg7(nkaVar, (byte) 2)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(sd9 sd9Var) {
        iqd iqdVar = new iqd((Object) this, (Object) new ArrayList(this.b.values()), false, (byte) 9);
        sd9 sd9Var2 = new sd9();
        this.e.submit(new xs4((Object) sd9Var2, (Object) iqdVar, (byte) 14));
        sd9Var2.b(new xs4((Object) sd9Var2, (Object) sd9Var, (byte) 12), this.d);
    }
}
