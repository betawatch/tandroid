package aa;

import ab.g0;
import ab.m;
import ab.r0;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import b2.b0;
import b2.j1;
import b2.n0;
import b2.o;
import b2.o0;
import b2.q1;
import b2.r1;
import b2.t;
import b2.v1;
import b2.w;
import b2.w0;
import b2.x;
import bi.b2;
import cb.h;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d9.k;
import e2.e;
import e2.m0;
import e9.k0;
import e9.l0;
import e9.x1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import r9.d;
import v7.b8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, k, NativeInstance.AudioLevelsCallback, fw0, gw0, z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // d9.k
    public Object apply(Object obj) {
        x1 f7;
        x1 b10;
        int i10 = 0;
        switch (this.a) {
            case 17:
                b0 b0Var = (b0) obj;
                return b0Var.a + ": " + b0Var.b;
            case 18:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = j1Var.a;
                if (i11 != 0) {
                    bundle.putInt(j1.d, i11);
                }
                int i12 = j1Var.b;
                if (i12 != 0) {
                    bundle.putInt(j1.e, i12);
                }
                int i13 = j1Var.c;
                if (i13 != 0) {
                    bundle.putInt(j1.f, i13);
                }
                return bundle;
            case 19:
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(o0.h, o0Var.a);
                String str = o0Var.b;
                if (str != null) {
                    bundle2.putString(o0.i, str);
                }
                String str2 = o0Var.c;
                if (str2 != null) {
                    bundle2.putString(o0.j, str2);
                }
                int i14 = o0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(o0.k, i14);
                }
                int i15 = o0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(o0.l, i15);
                }
                String str3 = o0Var.f;
                if (str3 != null) {
                    bundle2.putString(o0.m, str3);
                }
                String str4 = o0Var.g;
                if (str4 != null) {
                    bundle2.putString(o0.n, str4);
                }
                return bundle2;
            case 20:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(o0.h);
                uri.getClass();
                String string = bundle3.getString(o0.i);
                String string2 = bundle3.getString(o0.j);
                int i16 = bundle3.getInt(o0.k, 0);
                int i17 = bundle3.getInt(o0.l, 0);
                String string3 = bundle3.getString(o0.m);
                String string4 = bundle3.getString(o0.n);
                n0 n0Var = new n0();
                n0Var.c = uri;
                n0Var.d = w0.n(string);
                n0Var.e = string2;
                n0Var.a = i16;
                n0Var.b = i17;
                n0Var.f = string3;
                n0Var.g = string4;
                return new o0(n0Var);
            case 21:
                Bundle bundle4 = (Bundle) obj;
                x xVar = x.V;
                w wVar = new w();
                if (bundle4 != null) {
                    ClassLoader classLoader = e.class.getClassLoader();
                    String str5 = m0.a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(x.W);
                String str6 = xVar.a;
                if (string5 == null) {
                    string5 = str6;
                }
                wVar.a = string5;
                String string6 = bundle4.getString(x.X);
                String str7 = xVar.b;
                if (string6 == null) {
                    string6 = str7;
                }
                wVar.b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(x.B0);
                if (parcelableArrayList == null) {
                    f7 = x1.e;
                } else {
                    k0 t10 = e9.n0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b0.c);
                        String string8 = bundle5.getString(b0.d);
                        string8.getClass();
                        t10.c(new b0(string7, string8));
                    }
                    f7 = t10.f();
                }
                wVar.c = e9.n0.u(f7);
                String string9 = bundle4.getString(x.Y);
                String str8 = xVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                wVar.d = string9;
                wVar.e = bundle4.getInt(x.Z, xVar.e);
                wVar.f = bundle4.getInt(x.a0, xVar.f);
                wVar.g = bundle4.getInt(x.C0, xVar.g);
                wVar.h = bundle4.getInt(x.b0, xVar.h);
                wVar.i = bundle4.getInt(x.c0, xVar.i);
                String string10 = bundle4.getString(x.d0);
                String str9 = xVar.k;
                if (string10 == null) {
                    string10 = str9;
                }
                wVar.j = string10;
                String string11 = bundle4.getString(x.G0);
                String str10 = xVar.m;
                if (string11 == null) {
                    string11 = str10;
                }
                wVar.l = string11;
                String string12 = bundle4.getString(x.e0);
                String str11 = xVar.r;
                if (string12 == null) {
                    string12 = str11;
                }
                wVar.q = w0.n(string12);
                String string13 = bundle4.getString(x.f0);
                String str12 = xVar.s;
                if (string13 == null) {
                    string13 = str12;
                }
                wVar.r = w0.n(string13);
                wVar.s = bundle4.getInt(x.g0, xVar.t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(x.h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        wVar.u = arrayList;
                        wVar.v = (t) bundle4.getParcelable(x.i0);
                        wVar.w = bundle4.getLong(x.j0, xVar.x);
                        wVar.y = bundle4.getInt(x.k0, xVar.z);
                        wVar.z = bundle4.getInt(x.l0, xVar.A);
                        wVar.A = bundle4.getInt(x.E0, xVar.B);
                        wVar.B = bundle4.getInt(x.F0, xVar.C);
                        wVar.C = bundle4.getFloat(x.m0, xVar.D);
                        wVar.D = bundle4.getInt(x.n0, xVar.E);
                        wVar.E = bundle4.getFloat(x.o0, xVar.F);
                        wVar.F = bundle4.getByteArray(x.p0);
                        wVar.G = bundle4.getInt(x.q0, xVar.H);
                        wVar.I = bundle4.getInt(x.D0, xVar.J);
                        Bundle bundle6 = bundle4.getBundle(x.r0);
                        if (bundle6 != null) {
                            wVar.H = new o(bundle6.getInt(o.i, -1), bundle6.getInt(o.j, -1), bundle6.getInt(o.k, -1), bundle6.getByteArray(o.l), bundle6.getInt(o.m, -1), bundle6.getInt(o.n, -1));
                        }
                        wVar.J = bundle4.getInt(x.s0, xVar.K);
                        wVar.K = bundle4.getInt(x.t0, xVar.L);
                        wVar.L = bundle4.getInt(x.u0, xVar.M);
                        wVar.M = bundle4.getInt(x.v0, xVar.N);
                        wVar.N = bundle4.getInt(x.w0, xVar.O);
                        wVar.O = bundle4.getInt(x.x0, xVar.P);
                        wVar.Q = bundle4.getInt(x.z0, xVar.R);
                        wVar.R = bundle4.getInt(x.A0, xVar.S);
                        wVar.S = bundle4.getInt(x.y0, xVar.T);
                        return new x(wVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 22:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(r1.c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(q1.f);
                if (parcelableArrayList2 == null) {
                    l0 l0Var = e9.n0.b;
                    b10 = x1.e;
                } else {
                    b10 = e.b(new a(21), parcelableArrayList2);
                }
                q1 q1Var = new q1(bundle8.getString(q1.g, ""), (x[]) b10.toArray(new x[0]));
                int[] intArray = bundle7.getIntArray(r1.d);
                intArray.getClass();
                return new r1(q1Var, b8.a(intArray));
            default:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(v1.f, v1Var.b.c());
                bundle9.putIntArray(v1.g, v1Var.d);
                bundle9.putBooleanArray(v1.h, v1Var.e);
                bundle9.putBoolean(v1.i, v1Var.c);
                return bundle9;
        }
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        b2 b2Var = (b2) obj;
        switch (this.a) {
            case 26:
                WindowManager.LayoutParams layoutParams = b2Var.c;
                b2Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(b2Var.b, b2Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = b2Var.c;
                b2Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(b2Var.b, b2Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        b2 b2Var = (b2) obj;
        switch (this.a) {
            case 25:
                return b2Var.N;
            default:
                return b2Var.O;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        m mVar;
        ab.m0 m0Var;
        g0 g0Var;
        h hVar;
        ab.t tVar;
        r0 r0Var;
        switch (this.a) {
            case 7:
                mVar = FirebaseSessionsRegistrar.getComponents$lambda-0(z5Var);
                return mVar;
            case 8:
                m0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(z5Var);
                return m0Var;
            case 9:
                g0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(z5Var);
                return g0Var;
            case 10:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(z5Var);
                return hVar;
            case 11:
                tVar = FirebaseSessionsRegistrar.getComponents$lambda-4(z5Var);
                return tVar;
            default:
                r0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(z5Var);
                return r0Var;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
