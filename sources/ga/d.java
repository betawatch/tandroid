package ga;

import ah.g;
import android.content.Context;
import android.opengl.Matrix;
import android.util.Log;
import android.widget.LinearLayout;
import c8.ha;
import da.e1;
import gb.d0;
import gb.j1;
import gb.r0;
import gb.v0;
import id.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import jb.l;
import kg.u1;
import l2.a0;
import li.a6;
import li.l0;
import li.m0;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.l60;
import org.telegram.ui.ky0;
import w7.s;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class d implements ib.b, q5.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;
    public Object n;

    public /* synthetic */ d(fd.a aVar, fd.a aVar2, fd.a aVar3, fd.a aVar4, fd.a aVar5, fd.a aVar6, fd.a aVar7, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.h = aVar6;
        this.n = aVar7;
    }

    public static synchronized void e(File file) {
        synchronized (d.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        return file.delete();
    }

    public static List i(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && h(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void c() {
        j(null);
        l60 l60Var = (l60) this.d;
        if (l60Var != null) {
            l60Var.u();
            this.d = null;
        }
        this.e = null;
        this.f = null;
        this.h = null;
    }

    public void d(a6 a6Var, ArrayList arrayList) {
        g6 g6Var = (g6) this.c;
        LinearLayout linearLayout = (LinearLayout) this.e;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            l0 l0Var = (l0) obj;
            u1 u1Var = new u1(a6Var.getContext(), l0Var, g6Var);
            u1Var.setPadding(g0.L(8.0f), 0, g0.L(12.0f), 0);
            u1Var.setBackground(l6.a0(l6.w0(l6.i6, g6Var), 0, 0));
            u1Var.setOnClickListener(new g(this, a6Var, l0Var, 14));
            ((LinearLayout) this.e).addView(u1Var, ha.o(-1, 48));
        }
    }

    public void f(int i7, int i10, float f10, float f11, boolean z9, float[] fArr) {
        float[] fArr2 = (float[]) this.b;
        float f12 = (i7 - i10) / 0.3902439f;
        if (f12 <= 0.0f || f12 > i7) {
            f12 = i7;
        }
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f12 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.c, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.d;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.c, 0, (float[]) this.d, 0);
        Matrix.multiplyMM((float[]) this.f, 0, (float[]) this.b, 0, (float[]) this.e, 0);
        float f13 = z9 ? 0.0125f : -0.0125f;
        float f14 = z9 ? 1.0f : -1.0f;
        float f15 = -f14;
        g(f13, 0.618561f, f14, i7, i10, fArr, 0);
        g(f13, 0.618561f, f15, i7, i10, fArr, 2);
        g(f13, -0.593561f, f15, i7, i10, fArr, 4);
        g(f13, -0.593561f, f14, i7, i10, fArr, 6);
    }

    public float g(float f10, float f11, float f12, int i7, int i10, float[] fArr, int i11) {
        float[] fArr2 = (float[]) this.h;
        fArr2[0] = f10;
        fArr2[1] = f11;
        fArr2[2] = f12;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.n, 0, (float[]) this.f, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.n;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = com.google.android.recaptcha.internal.a.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = f1.x(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 2:
                return new gb.f1((l) ((ib.c) this.b).get(), (v0) ((ib.c) this.c).get(), (r0) ((ib.c) this.d).get(), (j1) ((ib.c) this.e).get(), (m1.g) ((ib.c) this.f).get(), (d0) ((ib.c) this.h).get(), (h) ((ib.c) this.n).get());
            default:
                Context context = (Context) ((fd.a) this.b).get();
                p5.d dVar = (p5.d) ((fd.a) this.c).get();
                v5.d dVar2 = (v5.d) ((fd.a) this.d).get();
                ky0 ky0Var = (ky0) ((ky0) this.e).get();
                Executor executor = (Executor) ((fd.a) this.f).get();
                w5.c cVar = (w5.c) ((fd.a) this.h).get();
                nb.a aVar = new nb.a(28);
                s sVar = new s(27, false);
                v5.c cVar2 = (v5.c) ((fd.a) this.n).get();
                ia.c cVar3 = new ia.c();
                cVar3.a = context;
                cVar3.b = dVar;
                cVar3.c = dVar2;
                cVar3.d = ky0Var;
                cVar3.e = executor;
                cVar3.f = cVar;
                cVar3.g = aVar;
                cVar3.h = sVar;
                cVar3.i = cVar2;
                return cVar3;
        }
    }

    public void j(a6 a6Var) {
        a6 a6Var2 = (a6) this.n;
        if (a6Var2 == a6Var) {
            return;
        }
        if (a6Var2 != null) {
            a6Var2.setShowCommandBackground(false);
        }
        this.n = a6Var;
        if (a6Var != null) {
            a6Var.setShowCommandBackground(true);
        }
    }

    public void k(a6 a6Var, String str) {
        l60 l60Var;
        l60 l60Var2;
        if (str == null) {
            c();
            return;
        }
        ArrayList a10 = l0.a(str);
        if (a10.isEmpty()) {
            c();
            return;
        }
        j(a6Var);
        if (((a6) this.h) == a6Var && a10.equals((ArrayList) this.f) && (l60Var2 = (l60) this.d) != null && l60Var2.D()) {
            return;
        }
        if (((a6) this.h) == a6Var && (l60Var = (l60) this.d) != null && l60Var.D() && ((LinearLayout) this.e) != null) {
            this.f = a10;
            d(a6Var, a10);
            ((l60) this.d).O();
            return;
        }
        c();
        j(a6Var);
        this.h = a6Var;
        this.f = a10;
        LinearLayout linearLayout = new LinearLayout(a6Var.getContext());
        this.e = linearLayout;
        linearLayout.setOrientation(1);
        d(a6Var, a10);
        l60 a11 = ((m0) this.b).a(a6Var.getEditText());
        a11.Q = true;
        a11.s = 0;
        a11.t = false;
        a11.r((LinearLayout) this.e, ha.o(qs.x3, -2));
        a11.X = g0.L(240.0f);
        a11.i = 3;
        a11.a0(-g0.L(12.0f), 0.0f);
        a11.p = new a0(this, 5);
        a11.d0 = true;
        if (a11.D()) {
            a11.C();
        }
        a11.Z();
        this.d = a11;
    }

    public d(int i7) {
        this.a = i7;
        switch (i7) {
            case 4:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new float[16];
                this.e = new float[16];
                this.f = new float[16];
                this.h = new float[4];
                this.n = new float[4];
                break;
        }
    }

    public d(m0 m0Var, g6 g6Var) {
        this.a = 3;
        this.b = m0Var;
        this.c = g6Var;
    }

    public d(Context context) {
        String str;
        String replaceAll;
        this.a = 0;
        String str2 = ((e1) x9.c.a.b(context)).a;
        this.b = str2;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = aa.g.i(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb2.append(replaceAll);
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        e(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        e(file2);
        this.e = file2;
        File file3 = new File(file, "reports");
        e(file3);
        this.f = file3;
        File file4 = new File(file, "priority-reports");
        e(file4);
        this.h = file4;
        File file5 = new File(file, "native-reports");
        e(file5);
        this.n = file5;
    }
}
