package f9;

import android.content.pm.ShortcutManager;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d5.g0;
import gh.x5;
import h3.b1;
import h3.d1;
import h3.f1;
import h3.g1;
import h3.g2;
import h3.h1;
import h3.l2;
import h3.n2;
import h3.p2;
import h3.s0;
import h3.t0;
import h3.u1;
import h3.v0;
import h3.x0;
import h3.y0;
import h3.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Continuation, z8.d, Vector.TLDeserializer, a2, GenericProvider, o8.e, d5.k, h3.f {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ FingerprintManager c(Object obj) {
        return (FingerprintManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h3.f
    public h3.g a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        int i10 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 18:
                t0 t0Var = t0.Y;
                s0 s0Var = new s0();
                if (bundle != null) {
                    ClassLoader classLoader = d5.a.class.getClassLoader();
                    int i11 = g0.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(t0.Z);
                String str = t0Var.a;
                if (string == null) {
                    string = str;
                }
                s0Var.a = string;
                String string2 = bundle.getString(t0.a0);
                String str2 = t0Var.b;
                if (string2 == null) {
                    string2 = str2;
                }
                s0Var.b = string2;
                String string3 = bundle.getString(t0.b0);
                String str3 = t0Var.c;
                if (string3 == null) {
                    string3 = str3;
                }
                s0Var.c = string3;
                s0Var.d = bundle.getInt(t0.c0, t0Var.d);
                s0Var.e = bundle.getInt(t0.d0, t0Var.e);
                s0Var.f = bundle.getInt(t0.e0, t0Var.f);
                s0Var.g = bundle.getInt(t0.f0, t0Var.h);
                String string4 = bundle.getString(t0.g0);
                String str4 = t0Var.r;
                if (string4 == null) {
                    string4 = str4;
                }
                s0Var.h = string4;
                z3.c cVar = (z3.c) bundle.getParcelable(t0.h0);
                z3.c cVar2 = t0Var.s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                s0Var.i = cVar;
                String string5 = bundle.getString(t0.i0);
                String str5 = t0Var.A;
                if (string5 == null) {
                    string5 = str5;
                }
                s0Var.n = string5;
                String string6 = bundle.getString(t0.j0);
                String str6 = t0Var.B;
                if (string6 == null) {
                    string6 = str6;
                }
                s0Var.o = string6;
                s0Var.p = bundle.getInt(t0.k0, t0Var.C);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(t0.l0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        s0Var.q = arrayList;
                        s0Var.r = (l3.d) bundle.getParcelable(t0.m0);
                        s0Var.s = bundle.getLong(t0.n0, t0Var.F);
                        s0Var.t = bundle.getInt(t0.o0, t0Var.G);
                        s0Var.u = bundle.getInt(t0.p0, t0Var.H);
                        s0Var.v = bundle.getFloat(t0.q0, t0Var.I);
                        s0Var.w = bundle.getInt(t0.r0, t0Var.J);
                        s0Var.x = bundle.getFloat(t0.s0, t0Var.K);
                        s0Var.y = bundle.getByteArray(t0.t0);
                        s0Var.z = bundle.getInt(t0.u0, t0Var.M);
                        Bundle bundle4 = bundle.getBundle(t0.v0);
                        if (bundle4 != null) {
                            s0Var.A = (e5.b) e5.b.s.a(bundle4);
                        }
                        s0Var.B = bundle.getInt(t0.w0, t0Var.O);
                        s0Var.C = bundle.getInt(t0.x0, t0Var.P);
                        s0Var.D = bundle.getInt(t0.y0, t0Var.Q);
                        s0Var.E = bundle.getInt(t0.z0, t0Var.R);
                        s0Var.F = bundle.getInt(t0.A0, t0Var.S);
                        s0Var.G = bundle.getInt(t0.B0, t0Var.T);
                        s0Var.H = bundle.getInt(t0.D0, t0Var.U);
                        s0Var.I = bundle.getInt(t0.E0, t0Var.V);
                        s0Var.J = bundle.getInt(t0.C0, t0Var.W);
                        return new t0(s0Var);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 19:
                d5.a.f(bundle.getInt(g2.a, -1) == 0);
                return bundle.getBoolean(v0.e, false) ? new v0(bundle.getBoolean(v0.f, false)) : new v0();
            case 20:
                String string7 = bundle.getString(f1.n, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(f1.r);
                b1 b1Var = bundle5 == null ? b1.f : (b1) b1.w.a(bundle5);
                Bundle bundle6 = bundle.getBundle(f1.s);
                h1 h1Var = bundle6 == null ? h1.U : (h1) h1.C0.a(bundle6);
                Bundle bundle7 = bundle.getBundle(f1.v);
                z0 z0Var = bundle7 == null ? z0.x : (z0) y0.w.a(bundle7);
                Bundle bundle8 = bundle.getBundle(f1.w);
                return new f1(string7, z0Var, null, b1Var, h1Var, bundle8 == null ? d1.c : (d1) d1.h.a(bundle8));
            case 21:
                x0 x0Var = new x0();
                String str7 = y0.h;
                z0 z0Var2 = y0.f;
                long j10 = bundle.getLong(str7, z0Var2.a);
                d5.a.f(j10 >= 0);
                x0Var.a = j10;
                long j11 = bundle.getLong(y0.n, z0Var2.b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    r11 = false;
                }
                d5.a.f(r11);
                x0Var.b = j11;
                x0Var.c = bundle.getBoolean(y0.r, z0Var2.c);
                x0Var.d = bundle.getBoolean(y0.s, z0Var2.d);
                x0Var.e = bundle.getBoolean(y0.v, z0Var2.e);
                return new z0(x0Var);
            case 22:
                return new b1(bundle.getLong(b1.h, -9223372036854775807L), bundle.getLong(b1.n, -9223372036854775807L), bundle.getLong(b1.r, -9223372036854775807L), bundle.getFloat(b1.s, -3.4028235E38f), bundle.getFloat(b1.v, -3.4028235E38f));
            case 23:
                a5.n nVar = new a5.n(18, (boolean) (objArr == true ? 1 : 0));
                nVar.b = (Uri) bundle.getParcelable(d1.d);
                nVar.c = bundle.getString(d1.e);
                nVar.d = bundle.getBundle(d1.f);
                return new d1(nVar);
            case 24:
                g1 g1Var = new g1();
                g1Var.a = bundle.getCharSequence(h1.V);
                g1Var.b = bundle.getCharSequence(h1.W);
                g1Var.c = bundle.getCharSequence(h1.X);
                g1Var.d = bundle.getCharSequence(h1.Y);
                g1Var.e = bundle.getCharSequence(h1.Z);
                g1Var.f = bundle.getCharSequence(h1.a0);
                g1Var.g = bundle.getCharSequence(h1.b0);
                byte[] byteArray2 = bundle.getByteArray(h1.e0);
                String str8 = h1.x0;
                Integer valueOf = bundle.containsKey(str8) ? Integer.valueOf(bundle.getInt(str8)) : null;
                g1Var.j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                g1Var.k = valueOf;
                g1Var.l = (Uri) bundle.getParcelable(h1.f0);
                g1Var.x = bundle.getCharSequence(h1.q0);
                g1Var.y = bundle.getCharSequence(h1.r0);
                g1Var.z = bundle.getCharSequence(h1.s0);
                g1Var.C = bundle.getCharSequence(h1.v0);
                g1Var.D = bundle.getCharSequence(h1.w0);
                g1Var.E = bundle.getCharSequence(h1.y0);
                g1Var.G = bundle.getBundle(h1.B0);
                String str9 = h1.c0;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    g1Var.h = (g2) g2.b.a(bundle3);
                }
                String str10 = h1.d0;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    g1Var.i = (g2) g2.b.a(bundle2);
                }
                String str11 = h1.g0;
                if (bundle.containsKey(str11)) {
                    g1Var.m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = h1.h0;
                if (bundle.containsKey(str12)) {
                    g1Var.n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = h1.i0;
                if (bundle.containsKey(str13)) {
                    g1Var.o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = h1.A0;
                if (bundle.containsKey(str14)) {
                    g1Var.p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = h1.j0;
                if (bundle.containsKey(str15)) {
                    g1Var.q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = h1.k0;
                if (bundle.containsKey(str16)) {
                    g1Var.r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = h1.l0;
                if (bundle.containsKey(str17)) {
                    g1Var.s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = h1.m0;
                if (bundle.containsKey(str18)) {
                    g1Var.t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = h1.n0;
                if (bundle.containsKey(str19)) {
                    g1Var.u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = h1.o0;
                if (bundle.containsKey(str20)) {
                    g1Var.v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = h1.p0;
                if (bundle.containsKey(str21)) {
                    g1Var.w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = h1.t0;
                if (bundle.containsKey(str22)) {
                    g1Var.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = h1.u0;
                if (bundle.containsKey(str23)) {
                    g1Var.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = h1.z0;
                if (bundle.containsKey(str24)) {
                    g1Var.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new h1(g1Var);
            case 25:
                d5.a.f(bundle.getInt(g2.a, -1) == 1);
                float f10 = bundle.getFloat(u1.d, -1.0f);
                return f10 == -1.0f ? new u1() : new u1(f10);
            case 26:
                int i12 = bundle.getInt(g2.a, -1);
                if (i12 == 0) {
                    return (g2) v0.h.a(bundle);
                }
                if (i12 == 1) {
                    return (g2) u1.e.a(bundle);
                }
                if (i12 == 2) {
                    return (g2) l2.h.a(bundle);
                }
                if (i12 == 3) {
                    return (g2) n2.h.a(bundle);
                }
                throw new IllegalArgumentException(i0.a.k(i12, "Unknown RatingType: "));
            case 27:
                d5.a.f(bundle.getInt(g2.a, -1) == 2);
                int i13 = bundle.getInt(l2.e, 5);
                float f11 = bundle.getFloat(l2.f, -1.0f);
                return f11 == -1.0f ? new l2(i13) : new l2(i13, f11);
            case 28:
                d5.a.f(bundle.getInt(g2.a, -1) == 3);
                return bundle.getBoolean(n2.e, false) ? new n2(bundle.getBoolean(n2.f, false)) : new n2();
            default:
                int i14 = bundle.getInt(p2.n, 0);
                long j12 = bundle.getLong(p2.r, -9223372036854775807L);
                long j13 = bundle.getLong(p2.s, 0L);
                boolean z10 = bundle.getBoolean(p2.v, false);
                Bundle bundle9 = bundle.getBundle(p2.w);
                k4.b bVar = bundle9 != null ? (k4.b) k4.b.w.a(bundle9) : k4.b.f;
                p2 p2Var = new p2();
                p2Var.h(null, null, i14, j12, j13, bVar, z10);
                return p2Var;
        }
    }

    @Override // o8.e
    public Object apply(Object obj) {
        return new i3.f((d5.b0) obj);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 9:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        h3.a2 a2Var = (h3.a2) obj;
        switch (this.a) {
            case 13:
                a2Var.onPlayerError(new h3.n(2, new a7.c("Player release timed out."), 1003));
                break;
            case 14:
                a2Var.onSeekProcessed();
                break;
            default:
                a2Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = x5.g0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            b bVar = (b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            c9.c cVar = c9.c.a;
            cVar.b(str);
            File file = bVar.c;
            z10 = true;
            if (file.delete()) {
                cVar.b("Deleted report file: " + file.getPath());
            } else {
                cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        Set y10 = hVar.y(ga.a.class);
        ga.c cVar = ga.c.c;
        if (cVar == null) {
            synchronized (ga.c.class) {
                try {
                    cVar = ga.c.c;
                    if (cVar == null) {
                        cVar = new ga.c(0);
                        ga.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new ga.b(y10, cVar);
    }

    public /* synthetic */ z(com.google.firebase.messaging.m mVar) {
        this.a = 0;
    }
}
