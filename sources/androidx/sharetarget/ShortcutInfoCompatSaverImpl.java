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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends qga {
    public static final Object h = new Object();
    public static volatile ShortcutInfoCompatSaverImpl i;
    public final Context a;
    public final ps b = new ps(0);
    public final ps c = new ps(0);
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
        threadPoolExecutor.submit(new rld((Object) this, (Object) file, false, (byte) 10));
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

    @Override // qga
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oga ogaVar = (oga) it.next();
            oga ogaVar2 = new oga();
            ogaVar2.a = ogaVar.a;
            ogaVar2.b = ogaVar.b;
            Intent[] intentArr = ogaVar.c;
            ogaVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            ogaVar2.d = ogaVar.d;
            ogaVar2.e = ogaVar.e;
            ogaVar2.f = ogaVar.f;
            ogaVar2.g = ogaVar.g;
            ogaVar2.h = ogaVar.h;
            ogaVar2.k = ogaVar.k;
            ogaVar2.l = ogaVar.l;
            ogaVar2.m = ogaVar.m;
            l38[] l38VarArr = ogaVar.i;
            if (l38VarArr != null) {
                ogaVar2.i = (l38[]) Arrays.copyOf(l38VarArr, l38VarArr.length);
            }
            if (ogaVar.j != null) {
                ogaVar2.j = new HashSet(ogaVar.j);
            }
            PersistableBundle persistableBundle = ogaVar.n;
            if (persistableBundle != null) {
                ogaVar2.n = persistableBundle;
            }
            if (TextUtils.isEmpty(ogaVar2.e)) {
                w26.j("Shortcut must have a non-empty label");
                return null;
            }
            Intent[] intentArr2 = ogaVar2.c;
            if (intentArr2 == null || intentArr2.length == 0) {
                w26.j("Shortcut must have an intent");
                return null;
            }
            arrayList.add(ogaVar2);
        }
        ea9 ea9Var = new ea9();
        this.d.submit(new rga(this, arrayList, ea9Var, (byte) 1));
        return ea9Var;
    }

    @Override // qga
    public final List b() {
        return (List) this.d.submit(new ke7(this, (byte) 1)).get();
    }

    @Override // qga
    public final Object c() {
        ea9 ea9Var = new ea9();
        this.d.submit(new tq4(this, ea9Var, false, (byte) 13));
        return ea9Var;
    }

    @Override // qga
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        ea9 ea9Var = new ea9();
        this.d.submit(new rga(this, arrayList, ea9Var, (byte) 0));
        return ea9Var;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            uga ugaVar = (uga) obj;
            if (!TextUtils.isEmpty(ugaVar.b)) {
                arrayList2.add(ugaVar.b);
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
        uga ugaVar = (uga) this.d.submit(new sga(this, str)).get();
        if (ugaVar == null) {
            return null;
        }
        String str2 = ugaVar.a;
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
        if (TextUtils.isEmpty(ugaVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new ke7(ugaVar, (byte) 2)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(ea9 ea9Var) {
        rld rldVar = new rld((Object) this, (Object) new ArrayList(this.b.values()), false, (byte) 9);
        ea9 ea9Var2 = new ea9();
        this.e.submit(new tq4((Object) ea9Var2, (Object) rldVar, (byte) 14));
        ea9Var2.b(new tq4((Object) ea9Var2, (Object) ea9Var, (byte) 12), this.d);
    }
}
