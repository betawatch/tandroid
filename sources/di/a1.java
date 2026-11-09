package di;

import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.id;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.r1, g9.k, u9.d, org.telegram.messenger.k9, w10, e20 {
    public final /* synthetic */ int a;

    public /* synthetic */ a1(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return ShortcutManager.class;
    }

    public Constructor a() {
        switch (this.a) {
            case 19:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(f3.o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(f3.o.class).getConstructor(null);
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        h9.t1 f10;
        h9.t1 b10;
        int i7 = 0;
        switch (this.a) {
            case 4:
                e2.x xVar = (e2.x) obj;
                return xVar.a + ": " + xVar.b;
            case 5:
                e2.f1 f1Var = (e2.f1) obj;
                f1Var.getClass();
                Bundle bundle = new Bundle();
                int i10 = f1Var.a;
                if (i10 != 0) {
                    bundle.putInt(e2.f1.d, i10);
                }
                int i11 = f1Var.b;
                if (i11 != 0) {
                    bundle.putInt(e2.f1.e, i11);
                }
                int i12 = f1Var.c;
                if (i12 != 0) {
                    bundle.putInt(e2.f1.f, i12);
                }
                return bundle;
            case 6:
                e2.k0 k0Var = (e2.k0) obj;
                k0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(e2.k0.h, k0Var.a);
                String str = k0Var.b;
                if (str != null) {
                    bundle2.putString(e2.k0.i, str);
                }
                String str2 = k0Var.c;
                if (str2 != null) {
                    bundle2.putString(e2.k0.j, str2);
                }
                int i13 = k0Var.d;
                if (i13 != 0) {
                    bundle2.putInt(e2.k0.k, i13);
                }
                int i14 = k0Var.e;
                if (i14 != 0) {
                    bundle2.putInt(e2.k0.l, i14);
                }
                String str3 = k0Var.f;
                if (str3 != null) {
                    bundle2.putString(e2.k0.m, str3);
                }
                String str4 = k0Var.g;
                if (str4 != null) {
                    bundle2.putString(e2.k0.n, str4);
                }
                return bundle2;
            case 7:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(e2.k0.h);
                uri.getClass();
                String string = bundle3.getString(e2.k0.i);
                String string2 = bundle3.getString(e2.k0.j);
                int i15 = bundle3.getInt(e2.k0.k, 0);
                int i16 = bundle3.getInt(e2.k0.l, 0);
                String string3 = bundle3.getString(e2.k0.m);
                String string4 = bundle3.getString(e2.k0.n);
                e2.j0 j0Var = new e2.j0();
                j0Var.c = uri;
                j0Var.d = e2.s0.n(string);
                j0Var.e = string2;
                j0Var.a = i15;
                j0Var.b = i16;
                j0Var.f = string3;
                j0Var.g = string4;
                return new e2.k0(j0Var);
            case 8:
                Bundle bundle4 = (Bundle) obj;
                e2.u uVar = e2.u.V;
                e2.t tVar = new e2.t();
                if (bundle4 != null) {
                    ClassLoader classLoader = h2.e.class.getClassLoader();
                    String str5 = h2.m0.a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(e2.u.W);
                String str6 = uVar.a;
                if (string5 == null) {
                    string5 = str6;
                }
                tVar.a = string5;
                String string6 = bundle4.getString(e2.u.X);
                String str7 = uVar.b;
                if (string6 == null) {
                    string6 = str7;
                }
                tVar.b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(e2.u.B0);
                if (parcelableArrayList == null) {
                    f10 = h9.t1.e;
                } else {
                    h9.f0 p10 = h9.i0.p();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i17);
                        bundle5.getClass();
                        String string7 = bundle5.getString(e2.x.c);
                        String string8 = bundle5.getString(e2.x.d);
                        string8.getClass();
                        p10.c(new e2.x(string7, string8));
                    }
                    f10 = p10.f();
                }
                tVar.c = h9.i0.q(f10);
                String string9 = bundle4.getString(e2.u.Y);
                String str8 = uVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                tVar.d = string9;
                tVar.e = bundle4.getInt(e2.u.Z, uVar.e);
                tVar.f = bundle4.getInt(e2.u.a0, uVar.f);
                tVar.g = bundle4.getInt(e2.u.C0, uVar.g);
                tVar.h = bundle4.getInt(e2.u.b0, uVar.h);
                tVar.i = bundle4.getInt(e2.u.c0, uVar.i);
                String string10 = bundle4.getString(e2.u.d0);
                String str9 = uVar.k;
                if (string10 == null) {
                    string10 = str9;
                }
                tVar.j = string10;
                String string11 = bundle4.getString(e2.u.G0);
                String str10 = uVar.m;
                if (string11 == null) {
                    string11 = str10;
                }
                tVar.l = string11;
                String string12 = bundle4.getString(e2.u.e0);
                String str11 = uVar.r;
                if (string12 == null) {
                    string12 = str11;
                }
                tVar.q = e2.s0.n(string12);
                String string13 = bundle4.getString(e2.u.f0);
                String str12 = uVar.s;
                if (string13 == null) {
                    string13 = str12;
                }
                tVar.r = e2.s0.n(string13);
                tVar.s = bundle4.getInt(e2.u.g0, uVar.t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(e2.u.h0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        tVar.u = arrayList;
                        tVar.v = (e2.r) bundle4.getParcelable(e2.u.i0);
                        tVar.w = bundle4.getLong(e2.u.j0, uVar.x);
                        tVar.y = bundle4.getInt(e2.u.k0, uVar.z);
                        tVar.z = bundle4.getInt(e2.u.l0, uVar.A);
                        tVar.A = bundle4.getInt(e2.u.E0, uVar.B);
                        tVar.B = bundle4.getInt(e2.u.F0, uVar.C);
                        tVar.C = bundle4.getFloat(e2.u.m0, uVar.D);
                        tVar.D = bundle4.getInt(e2.u.n0, uVar.E);
                        tVar.E = bundle4.getFloat(e2.u.o0, uVar.F);
                        tVar.F = bundle4.getByteArray(e2.u.p0);
                        tVar.G = bundle4.getInt(e2.u.q0, uVar.H);
                        tVar.I = bundle4.getInt(e2.u.D0, uVar.J);
                        Bundle bundle6 = bundle4.getBundle(e2.u.r0);
                        if (bundle6 != null) {
                            tVar.H = new e2.m(bundle6.getInt(e2.m.i, -1), bundle6.getInt(e2.m.j, -1), bundle6.getInt(e2.m.k, -1), bundle6.getByteArray(e2.m.l), bundle6.getInt(e2.m.m, -1), bundle6.getInt(e2.m.n, -1));
                        }
                        tVar.J = bundle4.getInt(e2.u.s0, uVar.K);
                        tVar.K = bundle4.getInt(e2.u.t0, uVar.L);
                        tVar.L = bundle4.getInt(e2.u.u0, uVar.M);
                        tVar.M = bundle4.getInt(e2.u.v0, uVar.N);
                        tVar.N = bundle4.getInt(e2.u.w0, uVar.O);
                        tVar.O = bundle4.getInt(e2.u.x0, uVar.P);
                        tVar.Q = bundle4.getInt(e2.u.z0, uVar.R);
                        tVar.R = bundle4.getInt(e2.u.A0, uVar.S);
                        tVar.S = bundle4.getInt(e2.u.y0, uVar.T);
                        return new e2.u(tVar);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 9:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(e2.n1.c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(e2.m1.f);
                if (parcelableArrayList2 == null) {
                    h9.g0 g0Var = h9.i0.b;
                    b10 = h9.t1.e;
                } else {
                    b10 = h2.e.b(new a1(8), parcelableArrayList2);
                }
                e2.m1 m1Var = new e2.m1(bundle8.getString(e2.m1.g, ""), (e2.u[]) b10.toArray(new e2.u[0]));
                int[] intArray = bundle7.getIntArray(e2.n1.d);
                intArray.getClass();
                return new e2.n1(m1Var, c8.e1.a(intArray));
            default:
                e2.r1 r1Var = (e2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(e2.r1.f, r1Var.b.c());
                bundle9.putIntArray(e2.r1.g, r1Var.d);
                bundle9.putBooleanArray(e2.r1.h, r1Var.e);
                bundle9.putBoolean(e2.r1.i, r1Var.c);
                return bundle9;
        }
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return num.intValue() == 0 ? id.M0(2131748805, null) : id.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // u9.d
    public Object e(a8.r7 r7Var) {
        db.a components$lambda$0;
        components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(r7Var);
        return components$lambda$0;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        we weVar = fi.f3.j0;
        return 0;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
