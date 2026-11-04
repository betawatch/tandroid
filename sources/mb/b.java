package mb;

import ai.c0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b8.fd;
import b8.ke;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d2.v;
import e3.b0;
import e3.i0;
import gi.v5;
import gi.w5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k2.p1;
import l.w;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.aa;
import org.telegram.messenger.g10;
import org.telegram.messenger.na;
import org.telegram.messenger.o2;
import org.telegram.messenger.oa;
import org.telegram.messenger.pa;
import org.telegram.messenger.qa;
import org.telegram.messenger.ra;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.va;
import org.telegram.messenger.w9;
import org.telegram.messenger.wi;
import org.telegram.messenger.x9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class b implements a7.c, s0, b4.k, com.google.android.gms.common.api.internal.q, e3.q, fg.a, gg.a, hf.b, t9.d, w, zh, IMapsProvider, hh.a, l1, p6.l, r0.q, p5.b, t4.d, x2.m, SuccessContinuation {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    @Override // hf.b
    public hf.a A(p4.q qVar) {
        return new df.k(qVar);
    }

    public Signature[] C0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // x2.m
    public long D() {
        throw new NoSuchElementException();
    }

    @Override // l.w
    public boolean E(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override // hh.a
    public /* synthetic */ int F() {
        return 0;
    }

    @Override // androidx.lifecycle.s0
    public p0 G(Class cls, x1.b bVar) {
        switch (this.a) {
        }
        return a(cls);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override // fg.a
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s6 = shortBuffer.get();
            shortBuffer2.put(s6);
            shortBuffer2.put(s6);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean L1() {
        return false;
    }

    @Override // hh.a
    public int M() {
        return 0;
    }

    @Override // hh.a
    public /* synthetic */ float O() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(long j10) {
        return false;
    }

    @Override // hh.a
    public /* synthetic */ float W() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override // org.telegram.ui.Components.zh
    public void Y(ng ngVar) {
        ngVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) {
        switch (this.a) {
            case 3:
                return new m0(true);
            default:
                return new y1.b();
        }
    }

    @Override // hh.a
    public /* synthetic */ float a0() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // hh.a
    public /* synthetic */ int c0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // a7.c
    public int e(Context context, String str, boolean z10) {
        return a7.f.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // cd.a
    public Object get() {
        kb.a aVar = new kb.a(27);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(k5.d.a, new t5.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(k5.d.c, new t5.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(t5.c.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(k5.d.b, new t5.b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < k5.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new t5.a(aVar, hashMap);
    }

    @Override // org.telegram.messenger.IMapsProvider
    public int getInstallMapsString() {
        return 2131749204;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // b4.k
    public b4.m h(v vVar) {
        String str = vVar.s;
        List list = vVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new d4.i(list);
                case "application/pgs":
                    return new ui.f(3);
                case "application/x-mp4-vtt":
                    return new v5();
                case "text/vtt":
                    return new p4.q(27);
                case "application/x-quicktime-tx3g":
                    return new i4.a(list);
                case "text/x-ssa":
                    return new f4.a(list);
                case "application/vobsub":
                    return new j4.b(list);
                case "application/x-subrip":
                    return new g4.a();
                case "application/ttml+xml":
                    return new h4.d();
            }
        }
        throw new IllegalArgumentException(t4.c.f("Unsupported MIME type: ", str));
    }

    @Override // e3.q
    public i0 i0(int i3, int i10) {
        return new e3.n();
    }

    @Override // org.telegram.messenger.IMapsProvider
    public void initializeMaps(Context context) {
        synchronized (j8.a.class) {
            j8.a.a(context);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(q1 q1Var) {
        return 0;
    }

    @Override // a7.c
    public int k(Context context, String str) {
        return a7.f.a(context, str);
    }

    @Override // b4.k
    public boolean l(v vVar) {
        String str = vVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // gg.a
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 > i10) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(p1.i(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = ((int) Math.ceil((i10 / i3) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ra loadRawResourceStyle(Context context, int i3) {
        InputStream openRawResource = context.getResources().openRawResource(i3);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        w6.b.a(openRawResource);
                        w6.b.a(byteArrayOutputStream);
                        l8.e eVar = new l8.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                        aa aaVar = new aa();
                        aaVar.a = eVar;
                        return aaVar;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    w6.b.a(openRawResource);
                    w6.b.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            throw new Resources.NotFoundException("Failed to read resource " + i3 + ": " + e10.toString());
        }
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ Object m(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public na newCameraUpdateLatLng(va vaVar) {
        LatLng latLng = new LatLng(vaVar.a, vaVar.b);
        try {
            k8.a aVar = fd.a;
            p6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            u7.b.b(P0, latLng);
            Parcel O0 = aVar.O0(P0, 8);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new w9(new w5(M0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public na newCameraUpdateLatLngBounds(pa paVar, int i3) {
        LatLngBounds latLngBounds = ((x9) paVar).a;
        try {
            k8.a aVar = fd.a;
            p6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            u7.b.b(P0, latLngBounds);
            P0.writeInt(i3);
            Parcel O0 = aVar.O0(P0, 10);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new w9(new w5(M0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public na newCameraUpdateLatLngZoom(va vaVar, float f10) {
        LatLng latLng = new LatLng(vaVar.a, vaVar.b);
        try {
            k8.a aVar = fd.a;
            p6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            u7.b.b(P0, latLng);
            P0.writeFloat(f10);
            Parcel O0 = aVar.O0(P0, 9);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new w9(new w5(M0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // x2.m
    public boolean next() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public Exception o(Status status) {
        return p6.m.l(status);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public oa onCreateCircleOptions() {
        hi.d dVar = new hi.d(23, false);
        l8.b bVar = new l8.b();
        bVar.a = null;
        bVar.b = 0.0d;
        bVar.c = 10.0f;
        bVar.d = -16777216;
        bVar.e = 0;
        bVar.f = 0.0f;
        bVar.h = true;
        bVar.n = false;
        bVar.r = null;
        dVar.b = bVar;
        return dVar;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public qa onCreateLatLngBoundsBuilder() {
        w5 w5Var = new w5(24, false);
        l8.d dVar = new l8.d(0);
        dVar.b = Double.POSITIVE_INFINITY;
        dVar.c = Double.NEGATIVE_INFINITY;
        dVar.d = Double.NaN;
        dVar.e = Double.NaN;
        w5Var.b = dVar;
        return w5Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public sa onCreateMapView(Context context) {
        ke keVar = new ke(10);
        keVar.b = new c0(keVar, context);
        return keVar;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ta onCreateMarkerOptions() {
        v5 v5Var = new v5(24);
        l8.g gVar = new l8.g();
        gVar.e = 0.5f;
        gVar.f = 1.0f;
        gVar.n = true;
        gVar.r = false;
        gVar.s = 0.0f;
        gVar.w = 0.5f;
        gVar.x = 0.0f;
        gVar.y = 1.0f;
        v5Var.b = gVar;
        return v5Var;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override // b4.k
    public int q0(v vVar) {
        String str = vVar.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(t4.c.f("Unsupported MIME type: ", str));
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        switch (this.a) {
            case 11:
                return new nb.a(0);
            default:
                return new b(0);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ i9 q2() {
        return null;
    }

    @Override // t4.d
    public void r() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // x2.m
    public long t() {
        throw new NoSuchElementException();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // t4.d
    public void u(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // hh.a
    public int u0() {
        return 0;
    }

    @Override // fg.a
    public int v1(int i3, int i10, int i11) {
        return i3 * 2;
    }

    @Override // hh.a
    public int w0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // hh.a
    public int x() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(zi ziVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    public b() {
        this.a = 13;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
    }

    @Override // e3.q
    public void L() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(wi wiVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
    }

    @Override // e3.q
    public void f(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, long j10) {
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(q1 q1Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override // r0.q
    public void onScrollLimit(int i3, int i10, int i11, boolean z10) {
    }

    @Override // r0.q
    public void onScrollProgress(int i3, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.zh
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
