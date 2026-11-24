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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k1f implements lr2, w23, h89, z0c, u1e, kh5, mv8, IMapsProvider, a7c, mc2, sfc, p40 {
    public static k1f G;
    public static k1f b;
    public final /* synthetic */ byte a;
    public static final k1f c = new k1f((byte) 1);
    public static final k1f d = new k1f((byte) 2);
    public static final k1f e = new k1f((byte) 3);
    public static final /* synthetic */ k1f f = new k1f((byte) 4);
    public static final k1f h = new k1f((byte) 5);
    public static final k1f n = new k1f((byte) 6);
    public static final /* synthetic */ k1f r = new k1f((byte) 7);
    public static final k1f s = new k1f((byte) 8);
    public static final k1f w = new k1f((byte) 9);
    public static final k1f x = new k1f((byte) 10);
    public static final /* synthetic */ k1f y = new k1f((byte) 11);
    public static final k1f E = new k1f((byte) 12);
    public static final /* synthetic */ k1f F = new k1f((byte) 13);

    public k1f(Context context) {
        this.a = (byte) 29;
    }

    public static synchronized void o() {
        synchronized (k1f.class) {
            if (b == null) {
                b = new k1f((byte) 0);
            }
        }
    }

    @Override // mc2
    public final boolean A0(long j) {
        return false;
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean K() {
        return false;
    }

    @Override // mc2
    public final pc8 M1() {
        return null;
    }

    @Override // mc2
    public final boolean N() {
        return false;
    }

    @Override // mc2
    public final int O() {
        return 0;
    }

    @Override // mc2
    public final boolean O1(long j) {
        return false;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override // mc2
    public final hw1 S() {
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 1:
                Object i = sm2Var.i(new yy8(me0.class, Executor.class));
                i.getClass();
                return new e64((Executor) i);
            default:
                return new nvd((cg7) sm2Var.a(cg7.class));
        }
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        return false;
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override // kh5
    public final cx7 a(gh5 gh5Var, ch5 ch5Var) {
        return new jh5(gh5Var, ch5Var);
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        ce6 ce6Var = bhd.H;
        z8d z8dVar = (z8d) ((mjf) obj).k();
        z8dVar.W(z8dVar.R(), 19);
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }

    @Override // z0c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // mc2
    public final boolean b() {
        return false;
    }

    @Override // sfc
    public final pfc d(Class cls, x23 x23Var) {
        x23Var.getClass();
        return new as9();
    }

    @Override // mc2
    public final boolean d0() {
        return false;
    }

    @Override // kh5
    public final cx7 e() {
        return new jh5(gh5.o, null);
    }

    @Override // mc2
    public final boolean f() {
        return true;
    }

    @Override // sfc
    public final /* synthetic */ pfc g(cj2 cj2Var, x23 x23Var) {
        return mlb.a(this, cj2Var, x23Var);
    }

    @Override // mv8
    public final Object get() {
        return new ke5(Executors.newSingleThreadExecutor(), (byte) 1);
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final int getInstallMapsString() {
        return 2131748953;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final void initializeMaps(Context context) {
        synchronized (rk6.class) {
            rk6.a(context);
        }
    }

    public final void j(c44 c44Var) {
        c44Var.a(ike.class, pwd.a);
        c44Var.a(eve.class, d9e.a);
        c44Var.a(jke.class, twd.a);
        c44Var.a(ble.class, exd.a);
        c44Var.a(pke.class, dxd.a);
        c44Var.a(xke.class, nxd.a);
        c44Var.a(nfe.class, msd.a);
        c44Var.a(kfe.class, isd.a);
        c44Var.a(khe.class, oud.a);
        c44Var.a(vte.class, u6e.a);
        c44Var.a(jfe.class, csd.a);
        c44Var.a(bfe.class, wrd.a);
        c44Var.a(ume.class, jzd.a);
        c44Var.a(bye.class, wtd.a);
        c44Var.a(rge.class, iud.a);
        c44Var.a(lge.class, rtd.a);
        c44Var.a(vme.class, rzd.a);
        c44Var.a(ite.class, f6e.a);
        c44Var.a(jte.class, k6e.a);
        c44Var.a(dte.class, y5e.a);
        c44Var.a(tle.class, pyd.a);
        c44Var.a(wxe.class, wnd.a);
        c44Var.a(bme.class, uyd.a);
        c44Var.a(dne.class, wzd.a);
        c44Var.a(rne.class, h0e.a);
        c44Var.a(jne.class, f0e.a);
        c44Var.a(ine.class, xzd.a);
        c44Var.a(oqe.class, y1e.a);
        c44Var.a(pqe.class, d2e.a);
        c44Var.a(dre.class, p2e.a);
        c44Var.a(yqe.class, j2e.a);
        c44Var.a(sle.class, lyd.a);
        c44Var.a(ere.class, u2e.a);
        c44Var.a(ore.class, b4e.a);
        c44Var.a(tre.class, g4e.a);
        c44Var.a(ure.class, q4e.a);
        c44Var.a(use.class, m5e.a);
        c44Var.a(tse.class, s5e.a);
        c44Var.a(jqe.class, n0e.a);
        c44Var.a(nie.class, dwd.a);
        c44Var.a(kpe.class, j1e.a);
        c44Var.a(goe.class, c1e.a);
        c44Var.a(aqe.class, p1e.a);
        c44Var.a(qte.class, p6e.a);
        c44Var.a(qve.class, z9e.a);
        c44Var.a(bce.class, xod.a);
        c44Var.a(obe.class, mod.a);
        c44Var.a(ibe.class, hod.a);
        c44Var.a(tbe.class, sod.a);
        c44Var.a(mce.class, aqd.a);
        c44Var.a(gce.class, upd.a);
        c44Var.a(sce.class, fqd.a);
        c44Var.a(dde.class, nqd.a);
        c44Var.a(ide.class, sqd.a);
        c44Var.a(mde.class, xqd.a);
        c44Var.a(wde.class, drd.a);
        c44Var.a(lgd.class, fnd.a);
        c44Var.a(xgd.class, nnd.a);
        c44Var.a(qgd.class, lnd.a);
        c44Var.a(uhe.class, rvd.a);
        c44Var.a(sfe.class, tsd.a);
        c44Var.a(gcd.class, ghd.a);
        c44Var.a(ybd.class, lhd.a);
        c44Var.a(zfe.class, etd.a);
        c44Var.a(rcd.class, qhd.a);
        c44Var.a(mcd.class, vhd.a);
        c44Var.a(ked.class, zjd.a);
        c44Var.a(ced.class, gkd.a);
        c44Var.a(add.class, zhd.a);
        c44Var.a(vcd.class, fid.a);
        c44Var.a(ted.class, kkd.a);
        c44Var.a(ned.class, pkd.a);
        c44Var.a(afd.class, ykd.a);
        c44Var.a(yed.class, cld.a);
        c44Var.a(igd.class, tmd.a);
        c44Var.a(fgd.class, zmd.a);
        c44Var.a(mfd.class, ild.a);
        c44Var.a(ffd.class, qld.a);
        c44Var.a(tfd.class, yld.a);
        c44Var.a(qfd.class, emd.a);
        c44Var.a(bxe.class, n7e.a);
        c44Var.a(w6a.class, xsd.a);
        c44Var.a(owe.class, gyd.a);
        c44Var.a(kwe.class, byd.a);
        c44Var.a(bwe.class, bud.a);
        c44Var.a(wwe.class, f7e.a);
        c44Var.a(pwe.class, z6e.a);
        c44Var.a(cxe.class, s7e.a);
        c44Var.a(cwe.class, sud.a);
        c44Var.a(nxe.class, iae.a);
        c44Var.a(mxe.class, oae.a);
        c44Var.a(ixe.class, hae.a);
        c44Var.a(wte.class, k8e.a);
        c44Var.a(phe.class, zud.a);
        c44Var.a(vie.class, kwd.a);
        c44Var.a(dbe.class, bod.a);
        c44Var.a(wge.class, nud.a);
        c44Var.a(zhe.class, xvd.a);
        c44Var.a(fge.class, ktd.a);
        c44Var.a(lle.class, wxd.a);
        c44Var.a(cle.class, sxd.a);
        c44Var.a(sbd.class, dhd.a);
        c44Var.a(fve.class, j9e.a);
        c44Var.a(pve.class, v9e.a);
        c44Var.a(mve.class, o9e.a);
        c44Var.a(xae.class, rnd.a);
        c44Var.a(vee.class, prd.a);
        c44Var.a(oee.class, jrd.a);
        c44Var.a(xde.class, ird.a);
        c44Var.a(gme.class, yyd.a);
        c44Var.a(pme.class, fzd.a);
        c44Var.a(hme.class, ezd.a);
        c44Var.a(ydd.class, mjd.a);
        c44Var.a(tdd.class, sjd.a);
        c44Var.a(dse.class, r4e.a);
        c44Var.a(ose.class, g5e.a);
        c44Var.a(hse.class, v4e.a);
        c44Var.a(ise.class, f5e.a);
        c44Var.a(bgd.class, kmd.a);
        c44Var.a(wfd.class, qmd.a);
        c44Var.a(rue.class, x8e.a);
        c44Var.a(nue.class, r8e.a);
    }

    public final iwe l(go4 go4Var) {
        byte b2;
        byte b3;
        String str = go4Var.t;
        if (str != null) {
            b2 = 1;
            b3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new qs(b3);
                case "application/x-icy":
                    return new nl5();
                case "application/id3":
                    return new sl5(null);
                case "application/x-emsg":
                    return new qs(b2);
                case "application/x-scte35":
                    return new hna();
            }
        }
        u36.j(b10.h("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final tj5 loadRawResourceStyle(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        hme.a(openRawResource);
                        hme.a(byteArrayOutputStream);
                        ik6 ik6Var = new ik6(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                        t05 t05Var = new t05();
                        t05Var.a = ik6Var;
                        return t05Var;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    hme.a(openRawResource);
                    hme.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            throw new Resources.NotFoundException(mle.d("Failed to read resource ", i, ": ", e2.toString()));
        }
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        return false;
    }

    public final boolean n(go4 go4Var) {
        String str = go4Var.t;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final pj5 newCameraUpdateLatLng(xj5 xj5Var) {
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        try {
            jdd jddVar = ksd.a;
            ite.i(jddVar, "CameraUpdateFactory is not initialized");
            Parcel R = jddVar.R();
            tid.b(R, latLng);
            Parcel Q = jddVar.Q(R, 8);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new p05(new sz4(T));
        } catch (RemoteException e2) {
            i2d.h(e2);
            return null;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final pj5 newCameraUpdateLatLngBounds(rj5 rj5Var, int i) {
        LatLngBounds latLngBounds = ((q05) rj5Var).a;
        try {
            jdd jddVar = ksd.a;
            ite.i(jddVar, "CameraUpdateFactory is not initialized");
            Parcel R = jddVar.R();
            tid.b(R, latLngBounds);
            R.writeInt(i);
            Parcel Q = jddVar.Q(R, 10);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new p05(new sz4(T));
        } catch (RemoteException e2) {
            i2d.h(e2);
            return null;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final pj5 newCameraUpdateLatLngZoom(xj5 xj5Var, float f2) {
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        try {
            jdd jddVar = ksd.a;
            ite.i(jddVar, "CameraUpdateFactory is not initialized");
            Parcel R = jddVar.R();
            tid.b(R, latLng);
            R.writeFloat(f2);
            Parcel Q = jddVar.Q(R, 9);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new p05(new sz4(T));
        } catch (RemoteException e2) {
            i2d.h(e2);
            return null;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final qj5 onCreateCircleOptions() {
        k44 k44Var = new k44((byte) 7);
        vi2 vi2Var = new vi2();
        vi2Var.a = null;
        vi2Var.b = 0.0d;
        vi2Var.c = 10.0f;
        vi2Var.d = -16777216;
        vi2Var.e = 0;
        vi2Var.f = 0.0f;
        vi2Var.h = true;
        vi2Var.n = false;
        vi2Var.r = null;
        k44Var.b = vi2Var;
        return k44Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final sj5 onCreateLatLngBoundsBuilder() {
        lj4 lj4Var = new lj4();
        kz5 kz5Var = new kz5((byte) 0);
        kz5Var.b = Double.POSITIVE_INFINITY;
        kz5Var.c = Double.NEGATIVE_INFINITY;
        kz5Var.d = Double.NaN;
        kz5Var.e = Double.NaN;
        lj4Var.a = kz5Var;
        return lj4Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final uj5 onCreateMapView(Context context) {
        sm2 sm2Var = new sm2((byte) 8, false);
        sm2Var.b = new su(sm2Var, context);
        return sm2Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public final vj5 onCreateMarkerOptions() {
        ai4 ai4Var = new ai4((byte) 5, false);
        cl6 cl6Var = new cl6();
        cl6Var.e = 0.5f;
        cl6Var.f = 1.0f;
        cl6Var.n = true;
        cl6Var.r = false;
        cl6Var.s = 0.0f;
        cl6Var.w = 0.5f;
        cl6Var.x = 0.0f;
        cl6Var.y = 1.0f;
        ai4Var.b = cl6Var;
        return ai4Var;
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // mc2
    public final hkb p2() {
        return null;
    }

    @Override // p40
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i > i2) {
            u36.j("Illegal use of UpsampleAudioResampler");
            return;
        }
        if (i3 != 1 && i3 != 2) {
            u36.j(hg9.j(i3, "Illegal use of UpsampleAudioResampler. Channels:"));
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

    @Override // mc2
    public final String t(long j) {
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override // mc2
    public final boolean z1() {
        return false;
    }

    @Override // u1e
    public final Object zza() {
        ce6 ce6Var = njf.n;
        ce6 ce6Var2 = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        ite.h(ie1Var);
        ite.e("Must be called from the main thread.");
        return ie1Var.e.a;
    }

    public /* synthetic */ k1f(byte b2) {
        this.a = b2;
    }

    @Override // mc2
    public final void C1() {
    }

    @Override // mc2
    public final void T0() {
    }

    @Override // mc2
    public final void c() {
    }

    @Override // mc2
    public final void g2() {
    }

    @Override // a7c
    public final void h() {
    }

    @Override // mc2
    public final void i() {
    }

    @Override // mc2
    public final void o2() {
    }

    @Override // mc2
    public final void q() {
    }

    @Override // mc2
    public final void s0() {
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
    }

    @Override // mc2
    public final void T(k47 k47Var) {
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Y(int i) {
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
    }

    @Override // mc2
    public final void h0(String str) {
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void N1(String str, String str2) {
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f2, float f3) {
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // mc2
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
