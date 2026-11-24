// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ize implements aq2, k13, f69, yyb, rzd, lf5, lt8, IMapsProvider, a5c, bb2, rdc, p30 {
    public static ize G;
    public static ize b;
    public final /* synthetic */ byte a;
    public static final ize c = new ize((byte) 1);
    public static final ize d = new ize((byte) 2);
    public static final ize e = new ize((byte) 3);
    public static final /* synthetic */ ize f = new ize((byte) 4);
    public static final ize h = new ize((byte) 5);
    public static final ize n = new ize((byte) 6);
    public static final /* synthetic */ ize r = new ize((byte) 7);
    public static final ize s = new ize((byte) 8);
    public static final ize w = new ize((byte) 9);
    public static final ize x = new ize((byte) 10);
    public static final /* synthetic */ ize y = new ize((byte) 11);
    public static final ize E = new ize((byte) 12);
    public static final /* synthetic */ ize F = new ize((byte) 13);

    public ize(Context context) {
        this.a = (byte) 29;
    }

    public static synchronized void k() {
        synchronized (ize.class) {
            if (b == null) {
                b = new ize((byte) 0);
            }
        }
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override // bb2
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // bb2
    public final gib E2() {
        return null;
    }

    @Override // bb2
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override // bb2
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // bb2
    public final boolean J0(long j) {
        return false;
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        switch (this.a) {
            case 1:
                Object i = gl2Var.i(new xw8(md0.class, Executor.class));
                i.getClass();
                return new t44((Executor) i);
            default:
                return new ktd((ae7) gl2Var.a(ae7.class));
        }
    }

    @Override // bb2
    public final boolean N1() {
        return false;
    }

    @Override // bb2
    public final boolean O() {
        return false;
    }

    @Override // bb2
    public final boolean Q() {
        return false;
    }

    @Override // bb2
    public final int R() {
        return 0;
    }

    @Override // bb2
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // bb2
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override // bb2
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override // bb2
    public final vu1 X() {
        return null;
    }

    @Override // bb2
    public final ma8 Z1() {
        return null;
    }

    public final void a(r24 r24Var) {
        r24Var.a(hie.class, mud.a);
        r24Var.a(bte.class, c7e.a);
        r24Var.a(iie.class, qud.a);
        r24Var.a(aje.class, bvd.a);
        r24Var.a(oie.class, avd.a);
        r24Var.a(wie.class, kvd.a);
        r24Var.a(mde.class, jqd.a);
        r24Var.a(jde.class, fqd.a);
        r24Var.a(jfe.class, lsd.a);
        r24Var.a(sre.class, r4e.a);
        r24Var.a(ide.class, zpd.a);
        r24Var.a(ade.class, tpd.a);
        r24Var.a(ske.class, gxd.a);
        r24Var.a(zve.class, trd.a);
        r24Var.a(qee.class, fsd.a);
        r24Var.a(kee.class, ord.a);
        r24Var.a(tke.class, oxd.a);
        r24Var.a(fre.class, c4e.a);
        r24Var.a(gre.class, h4e.a);
        r24Var.a(are.class, v3e.a);
        r24Var.a(rje.class, mwd.a);
        r24Var.a(uve.class, uld.a);
        r24Var.a(zje.class, rwd.a);
        r24Var.a(ble.class, txd.a);
        r24Var.a(ple.class, eyd.a);
        r24Var.a(hle.class, cyd.a);
        r24Var.a(gle.class, uxd.a);
        r24Var.a(loe.class, vzd.a);
        r24Var.a(moe.class, a0e.a);
        r24Var.a(ape.class, m0e.a);
        r24Var.a(voe.class, g0e.a);
        r24Var.a(qje.class, iwd.a);
        r24Var.a(bpe.class, r0e.a);
        r24Var.a(lpe.class, y1e.a);
        r24Var.a(qpe.class, d2e.a);
        r24Var.a(rpe.class, n2e.a);
        r24Var.a(rqe.class, j3e.a);
        r24Var.a(qqe.class, p3e.a);
        r24Var.a(goe.class, kyd.a);
        r24Var.a(mge.class, aud.a);
        r24Var.a(hne.class, gzd.a);
        r24Var.a(eme.class, zyd.a);
        r24Var.a(xne.class, mzd.a);
        r24Var.a(nre.class, m4e.a);
        r24Var.a(nte.class, y7e.a);
        r24Var.a(aae.class, umd.a);
        r24Var.a(n9e.class, jmd.a);
        r24Var.a(h9e.class, emd.a);
        r24Var.a(s9e.class, pmd.a);
        r24Var.a(lae.class, xnd.a);
        r24Var.a(fae.class, rnd.a);
        r24Var.a(rae.class, cod.a);
        r24Var.a(cbe.class, kod.a);
        r24Var.a(hbe.class, pod.a);
        r24Var.a(lbe.class, uod.a);
        r24Var.a(vbe.class, apd.a);
        r24Var.a(ked.class, dld.a);
        r24Var.a(wed.class, lld.a);
        r24Var.a(ped.class, jld.a);
        r24Var.a(tfe.class, otd.a);
        r24Var.a(rde.class, qqd.a);
        r24Var.a(ead.class, ffd.a);
        r24Var.a(w9d.class, kfd.a);
        r24Var.a(yde.class, brd.a);
        r24Var.a(pad.class, pfd.a);
        r24Var.a(kad.class, ufd.a);
        r24Var.a(icd.class, yhd.a);
        r24Var.a(acd.class, eid.a);
        r24Var.a(yad.class, yfd.a);
        r24Var.a(tad.class, egd.a);
        r24Var.a(rcd.class, iid.a);
        r24Var.a(lcd.class, nid.a);
        r24Var.a(ycd.class, wid.a);
        r24Var.a(wcd.class, ajd.a);
        r24Var.a(hed.class, rkd.a);
        r24Var.a(eed.class, xkd.a);
        r24Var.a(kdd.class, gjd.a);
        r24Var.a(ddd.class, ojd.a);
        r24Var.a(rdd.class, wjd.a);
        r24Var.a(odd.class, ckd.a);
        r24Var.a(zue.class, k5e.a);
        r24Var.a(u4a.class, uqd.a);
        r24Var.a(lue.class, dwd.a);
        r24Var.a(hue.class, yvd.a);
        r24Var.a(yte.class, yrd.a);
        r24Var.a(uue.class, c5e.a);
        r24Var.a(nue.class, w4e.a);
        r24Var.a(ave.class, p5e.a);
        r24Var.a(zte.class, psd.a);
        r24Var.a(lve.class, h8e.a);
        r24Var.a(kve.class, n8e.a);
        r24Var.a(gve.class, g8e.a);
        r24Var.a(tre.class, j6e.a);
        r24Var.a(ofe.class, wsd.a);
        r24Var.a(uge.class, hud.a);
        r24Var.a(c9e.class, zld.a);
        r24Var.a(vee.class, ksd.a);
        r24Var.a(yfe.class, utd.a);
        r24Var.a(eee.class, hrd.a);
        r24Var.a(kje.class, tvd.a);
        r24Var.a(bje.class, pvd.a);
        r24Var.a(q9d.class, cfd.a);
        r24Var.a(cte.class, i7e.a);
        r24Var.a(mte.class, u7e.a);
        r24Var.a(jte.class, n7e.a);
        r24Var.a(w8e.class, pld.a);
        r24Var.a(uce.class, mpd.a);
        r24Var.a(nce.class, gpd.a);
        r24Var.a(wbe.class, fpd.a);
        r24Var.a(eke.class, vwd.a);
        r24Var.a(nke.class, cxd.a);
        r24Var.a(fke.class, bxd.a);
        r24Var.a(wbd.class, lhd.a);
        r24Var.a(rbd.class, rhd.a);
        r24Var.a(aqe.class, o2e.a);
        r24Var.a(lqe.class, d3e.a);
        r24Var.a(eqe.class, s2e.a);
        r24Var.a(fqe.class, c3e.a);
        r24Var.a(aed.class, ikd.a);
        r24Var.a(udd.class, okd.a);
        r24Var.a(ose.class, w6e.a);
        r24Var.a(kse.class, q6e.a);
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        dc6 dc6Var = afd.H;
        x6d x6dVar = (x6d) ((lhf) obj).k();
        x6dVar.W(x6dVar.R(), 19);
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }

    @Override // yyb
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // bb2
    public final boolean b() {
        return false;
    }

    @Override // bb2
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override // bb2
    public final boolean c2(long j) {
        return false;
    }

    @Override // lf5
    public final bv7 d(hf5 hf5Var, df5 df5Var) {
        return new kf5(hf5Var, df5Var);
    }

    @Override // rdc
    public final odc e(Class cls, l13 l13Var) {
        l13Var.getClass();
        return new zp9();
    }

    @Override // bb2
    public final boolean e0() {
        return false;
    }

    @Override // rdc
    public final /* synthetic */ odc f(oh2 oh2Var, l13 l13Var) {
        return yjb.a(this, oh2Var, l13Var);
    }

    @Override // bb2
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    public final fue g(fm4 fm4Var) {
        byte b2;
        byte b3;
        String str = fm4Var.t;
        if (str != null) {
            b2 = 1;
            b3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new qr(b3);
                case "application/x-icy":
                    return new oj5();
                case "application/id3":
                    return new tj5(null);
                case "application/x-emsg":
                    return new qr(b2);
                case "application/x-scte35":
                    return new gla();
            }
        }
        w26.j(b00.h("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override // lt8
    public final Object get() {
        return new mc5(Executors.newSingleThreadExecutor(), (byte) 1);
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final int getInstallMapsString() {
        return 2131749004;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // p30
    public final void i(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i > i2) {
            w26.j("Illegal use of UpsampleAudioResampler");
            return;
        }
        if (i3 != 1 && i3 != 2) {
            w26.j(de9.k(i3, "Illegal use of UpsampleAudioResampler. Channels:"));
            return;
        }
        int remaining = shortBuffer.remaining() / i3;
        int ceil = ((int) Math.ceil((i2 / i) * remaining)) - remaining;
        float f2 = remaining;
        float f3 = f2 / f2;
        float f4 = ceil;
        float f5 = f4 / f4;
        while (remaining > 0 && ceil > 0) {
            if (f3 >= f5) {
                shortBuffer2.put(shortBuffer.get());
                if (i3 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f3 = remaining / f2;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i3));
                if (i3 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i3));
                }
                ceil--;
                f5 = ceil / f4;
            }
        }
    }

    @Override // bb2
    public final boolean i0() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final void initializeMaps(Context context) {
        synchronized (pi6.class) {
            pi6.a(context);
        }
    }

    public final boolean j(fm4 fm4Var) {
        String str = fm4Var.t;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // bb2
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override // bb2
    public final boolean l() {
        return true;
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final uh5 loadRawResourceStyle(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        fke.a(openRawResource);
                        fke.a(byteArrayOutputStream);
                        gi6 gi6Var = new gi6(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                        uy4 uy4Var = new uy4();
                        uy4Var.a = gi6Var;
                        return uy4Var;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    fke.a(openRawResource);
                    fke.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            throw new Resources.NotFoundException(mue.d("Failed to read resource ", i, ": ", e2.toString()));
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final qh5 newCameraUpdateLatLng(yh5 yh5Var) {
        LatLng latLng = new LatLng(yh5Var.a, yh5Var.b);
        try {
            hbd hbdVar = hqd.a;
            fre.i(hbdVar, "CameraUpdateFactory is not initialized");
            Parcel R = hbdVar.R();
            sgd.b(R, latLng);
            Parcel Q = hbdVar.Q(R, 8);
            yi5 T = bo7.T(Q.readStrongBinder());
            Q.recycle();
            return new py4(new qx4(T));
        } catch (RemoteException e2) {
            fvc.g(e2);
            return null;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final qh5 newCameraUpdateLatLngBounds(sh5 sh5Var, int i) {
        LatLngBounds latLngBounds = ((qy4) sh5Var).a;
        try {
            hbd hbdVar = hqd.a;
            fre.i(hbdVar, "CameraUpdateFactory is not initialized");
            Parcel R = hbdVar.R();
            sgd.b(R, latLngBounds);
            R.writeInt(i);
            Parcel Q = hbdVar.Q(R, 10);
            yi5 T = bo7.T(Q.readStrongBinder());
            Q.recycle();
            return new py4(new qx4(T));
        } catch (RemoteException e2) {
            fvc.g(e2);
            return null;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final qh5 newCameraUpdateLatLngZoom(yh5 yh5Var, float f2) {
        LatLng latLng = new LatLng(yh5Var.a, yh5Var.b);
        try {
            hbd hbdVar = hqd.a;
            fre.i(hbdVar, "CameraUpdateFactory is not initialized");
            Parcel R = hbdVar.R();
            sgd.b(R, latLng);
            R.writeFloat(f2);
            Parcel Q = hbdVar.Q(R, 9);
            yi5 T = bo7.T(Q.readStrongBinder());
            Q.recycle();
            return new py4(new qx4(T));
        } catch (RemoteException e2) {
            fvc.g(e2);
            return null;
        }
    }

    @Override // lf5
    public final bv7 o() {
        return new kf5(hf5.o, null);
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final rh5 onCreateCircleOptions() {
        pj4 pj4Var = new pj4((byte) 4);
        hh2 hh2Var = new hh2();
        hh2Var.a = null;
        hh2Var.b = 0.0d;
        hh2Var.c = 10.0f;
        hh2Var.d = -16777216;
        hh2Var.e = 0;
        hh2Var.f = 0.0f;
        hh2Var.h = true;
        hh2Var.n = false;
        hh2Var.r = null;
        pj4Var.b = hh2Var;
        return pj4Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final th5 onCreateLatLngBoundsBuilder() {
        gi3 gi3Var = new gi3();
        kx5 kx5Var = new kx5((byte) 0);
        kx5Var.b = Double.POSITIVE_INFINITY;
        kx5Var.c = Double.NEGATIVE_INFINITY;
        kx5Var.d = Double.NaN;
        kx5Var.e = Double.NaN;
        gi3Var.a = kx5Var;
        return gi3Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final vh5 onCreateMapView(Context context) {
        gl2 gl2Var = new gl2((byte) 7, false);
        gl2Var.b = new st(gl2Var, context);
        return gl2Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final wh5 onCreateMarkerOptions() {
        z24 z24Var = new z24((byte) 7, false);
        zi6 zi6Var = new zi6();
        zi6Var.e = 0.5f;
        zi6Var.f = 1.0f;
        zi6Var.n = true;
        zi6Var.r = false;
        zi6Var.s = 0.0f;
        zi6Var.w = 0.5f;
        zi6Var.x = 0.0f;
        zi6Var.y = 1.0f;
        z24Var.b = zi6Var;
        return z24Var;
    }

    @Override // bb2
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override // bb2
    public final String x(long j) {
        return null;
    }

    @Override // bb2
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // bb2
    public final boolean y1() {
        return false;
    }

    @Override // bb2
    public final boolean y2(int i) {
        return false;
    }

    @Override // bb2
    public final /* synthetic */ boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override // rzd
    public final Object zza() {
        dc6 dc6Var = mhf.n;
        dc6 dc6Var2 = ad1.l;
        fre.e("Must be called from the main thread.");
        ad1 ad1Var = ad1.n;
        fre.h(ad1Var);
        fre.e("Must be called from the main thread.");
        return ad1Var.e.a;
    }

    public /* synthetic */ ize(byte b2) {
        this.a = b2;
    }

    @Override // bb2
    public final void B0() {
    }

    @Override // bb2
    public final void C2() {
    }

    @Override // bb2
    public final void R1() {
    }

    @Override // bb2
    public final void c() {
    }

    @Override // a5c
    public final void h() {
    }

    @Override // bb2
    public final void i1() {
    }

    @Override // bb2
    public final void p() {
    }

    @Override // bb2
    public final void t() {
    }

    @Override // bb2
    public final void u2() {
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
    }

    @Override // bb2
    public final void F(gb2 gb2Var) {
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void J(gb2 gb2Var) {
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void N0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void T(gb2 gb2Var) {
    }

    @Override // bb2
    public final void W(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void Y(k27 k27Var) {
    }

    @Override // bb2
    public final void Y1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void c1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void d0(int i) {
    }

    @Override // bb2
    public final void e2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void j0(k27 k27Var) {
    }

    @Override // bb2
    public final void l0(String str) {
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void r0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override // bb2
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override // bb2
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override // bb2
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // bb2
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // bb2
    public final void b2(String str, String str2) {
    }

    @Override // bb2
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override // bb2
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // bb2
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // bb2
    public final void A(gb2 gb2Var, float f2, float f3) {
    }

    @Override // bb2
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // bb2
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // bb2
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override // bb2
    public final void Y0(gb2 gb2Var, float f2, float f3) {
    }

    @Override // bb2
    public final void s2(gb2 gb2Var, float f2, float f3) {
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f2, float f3) {
    }

    @Override // bb2
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void A0(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    @Override // bb2
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // bb2
    public final void c0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // bb2
    public final void N(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
