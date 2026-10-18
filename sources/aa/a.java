package aa;

import ab.g0;
import ab.m;
import ab.r0;
import ab.t;
import ai.k7;
import android.net.Uri;
import android.os.Bundle;
import b2.a0;
import b2.i1;
import b2.m0;
import b2.n;
import b2.n0;
import b2.p1;
import b2.q1;
import b2.s;
import b2.u1;
import b2.v;
import b2.v0;
import b2.w;
import c3.o;
import cb.h;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d9.k;
import e2.e;
import e9.k0;
import e9.l0;
import e9.x1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.xf1;
import r9.d;
import v7.b8;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, a2, k, NativeInstance.AudioLevelsCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public Constructor a() {
        switch (this.a) {
            case 27:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(o.class).getConstructor(null);
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        x1 f7;
        x1 b10;
        int i10 = 0;
        switch (this.a) {
            case 19:
                a0 a0Var = (a0) obj;
                return a0Var.a + ": " + a0Var.b;
            case 20:
                i1 i1Var = (i1) obj;
                i1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = i1Var.a;
                if (i11 != 0) {
                    bundle.putInt(i1.d, i11);
                }
                int i12 = i1Var.b;
                if (i12 != 0) {
                    bundle.putInt(i1.e, i12);
                }
                int i13 = i1Var.c;
                if (i13 != 0) {
                    bundle.putInt(i1.f, i13);
                }
                return bundle;
            case 21:
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(n0.h, n0Var.a);
                String str = n0Var.b;
                if (str != null) {
                    bundle2.putString(n0.i, str);
                }
                String str2 = n0Var.c;
                if (str2 != null) {
                    bundle2.putString(n0.j, str2);
                }
                int i14 = n0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(n0.k, i14);
                }
                int i15 = n0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(n0.l, i15);
                }
                String str3 = n0Var.f;
                if (str3 != null) {
                    bundle2.putString(n0.m, str3);
                }
                String str4 = n0Var.g;
                if (str4 != null) {
                    bundle2.putString(n0.n, str4);
                }
                return bundle2;
            case 22:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(n0.h);
                uri.getClass();
                String string = bundle3.getString(n0.i);
                String string2 = bundle3.getString(n0.j);
                int i16 = bundle3.getInt(n0.k, 0);
                int i17 = bundle3.getInt(n0.l, 0);
                String string3 = bundle3.getString(n0.m);
                String string4 = bundle3.getString(n0.n);
                m0 m0Var = new m0();
                m0Var.c = uri;
                m0Var.d = v0.n(string);
                m0Var.e = string2;
                m0Var.a = i16;
                m0Var.b = i17;
                m0Var.f = string3;
                m0Var.g = string4;
                return new n0(m0Var);
            case 23:
                Bundle bundle4 = (Bundle) obj;
                w wVar = w.V;
                v vVar = new v();
                if (bundle4 != null) {
                    ClassLoader classLoader = e.class.getClassLoader();
                    String str5 = e2.m0.a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(w.W);
                String str6 = wVar.a;
                if (string5 == null) {
                    string5 = str6;
                }
                vVar.a = string5;
                String string6 = bundle4.getString(w.X);
                String str7 = wVar.b;
                if (string6 == null) {
                    string6 = str7;
                }
                vVar.b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(w.B0);
                if (parcelableArrayList == null) {
                    f7 = x1.e;
                } else {
                    k0 t10 = e9.n0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(a0.c);
                        String string8 = bundle5.getString(a0.d);
                        string8.getClass();
                        t10.c(new a0(string7, string8));
                    }
                    f7 = t10.f();
                }
                vVar.c = e9.n0.u(f7);
                String string9 = bundle4.getString(w.Y);
                String str8 = wVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                vVar.d = string9;
                vVar.e = bundle4.getInt(w.Z, wVar.e);
                vVar.f = bundle4.getInt(w.a0, wVar.f);
                vVar.g = bundle4.getInt(w.C0, wVar.g);
                vVar.h = bundle4.getInt(w.b0, wVar.h);
                vVar.i = bundle4.getInt(w.c0, wVar.i);
                String string10 = bundle4.getString(w.d0);
                String str9 = wVar.k;
                if (string10 == null) {
                    string10 = str9;
                }
                vVar.j = string10;
                String string11 = bundle4.getString(w.G0);
                String str10 = wVar.m;
                if (string11 == null) {
                    string11 = str10;
                }
                vVar.l = string11;
                String string12 = bundle4.getString(w.e0);
                String str11 = wVar.r;
                if (string12 == null) {
                    string12 = str11;
                }
                vVar.q = v0.n(string12);
                String string13 = bundle4.getString(w.f0);
                String str12 = wVar.s;
                if (string13 == null) {
                    string13 = str12;
                }
                vVar.r = v0.n(string13);
                vVar.s = bundle4.getInt(w.g0, wVar.t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(w.h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        vVar.u = arrayList;
                        vVar.v = (s) bundle4.getParcelable(w.i0);
                        vVar.w = bundle4.getLong(w.j0, wVar.x);
                        vVar.y = bundle4.getInt(w.k0, wVar.z);
                        vVar.z = bundle4.getInt(w.l0, wVar.A);
                        vVar.A = bundle4.getInt(w.E0, wVar.B);
                        vVar.B = bundle4.getInt(w.F0, wVar.C);
                        vVar.C = bundle4.getFloat(w.m0, wVar.D);
                        vVar.D = bundle4.getInt(w.n0, wVar.E);
                        vVar.E = bundle4.getFloat(w.o0, wVar.F);
                        vVar.F = bundle4.getByteArray(w.p0);
                        vVar.G = bundle4.getInt(w.q0, wVar.H);
                        vVar.I = bundle4.getInt(w.D0, wVar.J);
                        Bundle bundle6 = bundle4.getBundle(w.r0);
                        if (bundle6 != null) {
                            vVar.H = new n(bundle6.getInt(n.i, -1), bundle6.getInt(n.j, -1), bundle6.getInt(n.k, -1), bundle6.getByteArray(n.l), bundle6.getInt(n.m, -1), bundle6.getInt(n.n, -1));
                        }
                        vVar.J = bundle4.getInt(w.s0, wVar.K);
                        vVar.K = bundle4.getInt(w.t0, wVar.L);
                        vVar.L = bundle4.getInt(w.u0, wVar.M);
                        vVar.M = bundle4.getInt(w.v0, wVar.N);
                        vVar.N = bundle4.getInt(w.w0, wVar.O);
                        vVar.O = bundle4.getInt(w.x0, wVar.P);
                        vVar.Q = bundle4.getInt(w.z0, wVar.R);
                        vVar.R = bundle4.getInt(w.A0, wVar.S);
                        vVar.S = bundle4.getInt(w.y0, wVar.T);
                        return new w(vVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 24:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(q1.c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(p1.f);
                if (parcelableArrayList2 == null) {
                    l0 l0Var = e9.n0.b;
                    b10 = x1.e;
                } else {
                    b10 = e.b(new a(23), parcelableArrayList2);
                }
                p1 p1Var = new p1(bundle8.getString(p1.g, ""), (w[]) b10.toArray(new w[0]));
                int[] intArray = bundle7.getIntArray(q1.d);
                intArray.getClass();
                return new q1(p1Var, b8.a(intArray));
            default:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(u1.f, u1Var.b.c());
                bundle9.putIntArray(u1.g, u1Var.d);
                bundle9.putBooleanArray(u1.h, u1Var.e);
                bundle9.putBoolean(u1.i, u1Var.c);
                return bundle9;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 13:
                int i11 = k7.A1;
                break;
            default:
                k7.x2(new xf1(6, null));
                break;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        m mVar;
        ab.m0 m0Var;
        g0 g0Var;
        h hVar;
        t tVar;
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

    public /* synthetic */ a(k7 k7Var) {
        this.a = 14;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
