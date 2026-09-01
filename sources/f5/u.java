package f5;

import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import h5.d0;
import j3.c1;
import j3.e1;
import j3.f2;
import j3.m0;
import j3.n0;
import j3.o0;
import j3.t0;
import j3.u0;
import j3.x0;
import j3.y0;
import j3.y1;
import j3.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import o4.s0;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.uc0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements j3.f, ba.a, c2, uc0, Continuation, r8.i, r8.e, h5.j {
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return ShortcutManager.class;
    }

    @Override // r8.e
    public Object apply(Object obj) {
        return new k3.f((h5.y) obj);
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                Bundle bundle2 = bundle.getBundle(v.c);
                bundle2.getClass();
                s0 s0Var = (s0) s0.n.c(bundle2);
                int[] intArray = bundle.getIntArray(v.d);
                intArray.getClass();
                return new v(s0Var, intArray.length == 0 ? Collections.EMPTY_LIST : new u8.a(0, intArray.length, intArray));
            case 18:
                return new i5.b(bundle.getInt(i5.b.h, -1), bundle.getInt(i5.b.n, -1), bundle.getInt(i5.b.r, -1), bundle.getByteArray(i5.b.s));
            case 27:
                n0 n0Var = n0.Z;
                m0 m0Var = new m0();
                if (bundle != null) {
                    ClassLoader classLoader = h5.a.class.getClassLoader();
                    int i11 = d0.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(n0.a0);
                String str = n0Var.a;
                if (string == null) {
                    string = str;
                }
                m0Var.a = string;
                String string2 = bundle.getString(n0.b0);
                String str2 = n0Var.b;
                if (string2 == null) {
                    string2 = str2;
                }
                m0Var.b = string2;
                String string3 = bundle.getString(n0.c0);
                String str3 = n0Var.c;
                if (string3 == null) {
                    string3 = str3;
                }
                m0Var.c = string3;
                m0Var.d = bundle.getInt(n0.d0, n0Var.d);
                m0Var.e = bundle.getInt(n0.e0, n0Var.e);
                m0Var.f = bundle.getInt(n0.f0, n0Var.f);
                m0Var.g = bundle.getInt(n0.g0, n0Var.h);
                String string4 = bundle.getString(n0.h0);
                String str4 = n0Var.r;
                if (string4 == null) {
                    string4 = str4;
                }
                m0Var.h = string4;
                e4.c cVar = (e4.c) bundle.getParcelable(n0.i0);
                e4.c cVar2 = n0Var.s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                m0Var.i = cVar;
                String string5 = bundle.getString(n0.j0);
                String str5 = n0Var.B;
                if (string5 == null) {
                    string5 = str5;
                }
                m0Var.n = string5;
                String string6 = bundle.getString(n0.k0);
                String str6 = n0Var.C;
                if (string6 == null) {
                    string6 = str6;
                }
                m0Var.o = string6;
                m0Var.p = bundle.getInt(n0.l0, n0Var.D);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(n0.m0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        m0Var.q = arrayList;
                        m0Var.r = (o3.g) bundle.getParcelable(n0.n0);
                        m0Var.s = bundle.getLong(n0.o0, n0Var.G);
                        m0Var.t = bundle.getInt(n0.p0, n0Var.H);
                        m0Var.u = bundle.getInt(n0.q0, n0Var.I);
                        m0Var.v = bundle.getFloat(n0.r0, n0Var.J);
                        m0Var.w = bundle.getInt(n0.s0, n0Var.K);
                        m0Var.x = bundle.getFloat(n0.t0, n0Var.L);
                        m0Var.y = bundle.getByteArray(n0.u0);
                        m0Var.z = bundle.getInt(n0.v0, n0Var.N);
                        Bundle bundle3 = bundle.getBundle(n0.w0);
                        if (bundle3 != null) {
                            m0Var.A = (i5.b) i5.b.v.c(bundle3);
                        }
                        m0Var.B = bundle.getInt(n0.x0, n0Var.P);
                        m0Var.C = bundle.getInt(n0.y0, n0Var.Q);
                        m0Var.D = bundle.getInt(n0.z0, n0Var.R);
                        m0Var.E = bundle.getInt(n0.A0, n0Var.S);
                        m0Var.F = bundle.getInt(n0.B0, n0Var.T);
                        m0Var.G = bundle.getInt(n0.C0, n0Var.U);
                        m0Var.H = bundle.getInt(n0.E0, n0Var.V);
                        m0Var.I = bundle.getInt(n0.F0, n0Var.W);
                        m0Var.J = bundle.getInt(n0.D0, n0Var.X);
                        return new n0(m0Var);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 28:
                h5.a.f(bundle.getInt(f2.a, -1) == 0);
                return bundle.getBoolean(o0.e, false) ? new o0(bundle.getBoolean(o0.f, false)) : new o0();
            default:
                String string7 = bundle.getString(c1.n, "");
                string7.getClass();
                Bundle bundle4 = bundle.getBundle(c1.r);
                x0 x0Var = bundle4 == null ? x0.f : (x0) x0.w.c(bundle4);
                Bundle bundle5 = bundle.getBundle(c1.s);
                e1 e1Var = bundle5 == null ? e1.V : (e1) e1.D0.c(bundle5);
                Bundle bundle6 = bundle.getBundle(c1.v);
                u0 u0Var = bundle6 == null ? u0.x : (u0) t0.w.c(bundle6);
                Bundle bundle7 = bundle.getBundle(c1.w);
                z0 z0Var = bundle7 == null ? z0.c : (z0) z0.h.c(bundle7);
                Bundle bundle8 = bundle.getBundle(c1.x);
                return new c1(string7, u0Var, bundle8 == null ? null : (y0) y0.C.c(bundle8), x0Var, e1Var, z0Var);
        }
    }

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        switch (this.a) {
            case 10:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // ba.a
    public void f(ba.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // r8.i
    public Object get() {
        return new j3.j(new g5.q(), 2500, 5000);
    }

    @Override // h5.j
    public void invoke(Object obj) {
        y1 y1Var = (y1) obj;
        switch (this.a) {
            case 23:
                y1Var.onPlayerError(new j3.n(2, new a7.b("Player release timed out."), 1003));
                break;
            default:
                y1Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                d2Var.dismiss();
                break;
            case 3:
                d2Var.dismiss();
                break;
            case 9:
                break;
            case 12:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z4;
        if (task.isSuccessful()) {
            i9.b bVar = (i9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            f9.b bVar2 = f9.b.a;
            bVar2.b(str);
            File file = bVar.c;
            z4 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    public /* synthetic */ u(a9.a aVar) {
        this.a = 20;
    }

    private final void m(d2 d2Var, int i10) {
    }
}
