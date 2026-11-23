package hi;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.rd;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ui;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class t5 implements wa, i6.a, com.google.android.gms.common.api.internal.q, ib.b, jg.y1, m.e2, l.w, m.k, ce.c, o0.a, org.telegram.ui.Components.a5, oi.h0, oi.r3, oi.e1, org.telegram.messenger.wa, org.telegram.messenger.qa, wy, gh.a {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t5(int i7) {
        this.a = i7;
    }

    @Override // oi.e1
    public void A(int i7, int i10) {
        oi.g2 g2Var;
        oi.m5 m5Var = (oi.m5) this.b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null || (g2Var = b3Var.a.R3) == null) {
            return;
        }
        g2Var.f(i7, i10);
    }

    @Override // gh.a
    public float A1() {
        gh.a i7 = i();
        gh.a l10 = l();
        float A1 = i7 != null ? i7.A1() : 0.0f;
        return l10 != null ? org.telegram.messenger.g0.T1(l10.A1(), A1, ((org.telegram.ui.ActionBar.j5) this.b).a) : A1;
    }

    @Override // gh.a
    public int A2() {
        org.telegram.ui.ActionBar.t4 t4Var;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.b;
        gh.a i7 = i();
        int A2 = i7 != null ? i7.A2() : 0;
        return (j5Var.a >= 1.0f || (t4Var = j5Var.d) == null) ? A2 : i0.a.f(j5Var.a, t4Var.getButtonsGlassBackgroundColor(), A2);
    }

    @Override // l.w
    public boolean C(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.e;
        if (wVar != null) {
            return wVar.C(kVar);
        }
        return false;
    }

    @Override // oi.r3
    public void D(int i7) {
        ((oi.b2) this.b).t0(74, i7);
    }

    @Override // hi.wa
    public void D0(boolean z10) {
        v5 v5Var = (v5) this.b;
        if (v5Var.j()) {
            v5Var.F.getClass();
        }
        v5Var.x(-4, z10);
    }

    @Override // gh.a
    public int D1() {
        gh.a i7 = i();
        gh.a l10 = l();
        int D1 = i7 != null ? i7.D1() : 0;
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.j5) this.b).a, l10.D1(), D1);
        }
        return D1;
    }

    @Override // oi.e1
    public /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // hi.wa
    public void F(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.G = f10;
        c7Var.j = true;
        v5Var.c();
    }

    @Override // oi.r3
    public void G() {
        oi.b2 b2Var = (oi.b2) this.b;
        oi.h3 h3Var = b2Var.Q.v3;
        b2Var.C0((h3Var != null && h3Var.x() && b2Var.Q.F4()) ? 1 : 0, true);
        b2Var.D0();
        b2Var.B0();
    }

    @Override // oi.r3
    public a70 G0(View view) {
        return a70.I((oi.b2) this.b, view);
    }

    @Override // hi.wa
    public void G1(float f10, int i7) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null || (arrayList = c7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((c7) v5Var.d.T.get(i7)).W = f10;
    }

    @Override // oi.r3
    public void H(oi.a aVar) {
        oi.b2 b2Var = (oi.b2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(b2Var)) {
            ui uiVar = new ui(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            uiVar.X3 = new sa.d(16);
            uiVar.K1 = true;
            uiVar.v3.setVisibility(8);
            uiVar.u4 = new a3.h(b2Var, aVar, uiVar, 16);
            uiVar.f1();
            uiVar.show();
        }
    }

    @Override // oi.e1
    public /* synthetic */ boolean J(oi.f1 f1Var) {
        return false;
    }

    @Override // hi.wa
    public void J0(float f10, int i7) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null || (arrayList = c7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((c7) v5Var.d.T.get(i7)).P = f10;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // hi.wa
    public void M(long j3, boolean z10) {
        v5 v5Var = (v5) this.b;
        if (!z10) {
            v5Var.m(j3);
            return;
        }
        i61 i61Var = v5Var.e;
        if (i61Var != null) {
            i61Var.q0(j3, true);
            return;
        }
        if (v5Var.j()) {
            v5Var.F.m(j3, true);
            return;
        }
        i61 i61Var2 = v5Var.E;
        if (i61Var2 != null) {
            i61Var2.q0(j3, false);
        }
    }

    @Override // gh.a
    public int M0() {
        gh.a i7 = i();
        gh.a l10 = l();
        int M0 = i7 != null ? i7.M0() : 0;
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.j5) this.b).a, l10.M0(), M0);
        }
        return M0;
    }

    @Override // hi.wa
    public void M1(float f10) {
        c7 c7Var = ((v5) this.b).d;
        if (c7Var == null) {
            return;
        }
        c7Var.a0 = f10;
        c7Var.j = true;
    }

    @Override // hi.wa
    public void N1() {
        ((v5) this.b).q(null);
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        ((oi.o) this.b).M(z10, i7, i10, 0L, false);
        oi.o oVar = (oi.o) this.b;
        eg0 eg0Var = oVar.P;
        if (eg0Var != null) {
            eg0Var.i();
            oVar.P = null;
        }
    }

    @Override // oi.h0
    public org.telegram.ui.Cells.j9 P0() {
        switch (this.a) {
            case 19:
                oi.o3 o3Var = ((oi.w0) this.b).T;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.a.getTextSelectionHelper();
            default:
                oi.k4 k4Var = ((oi.m4) this.b).H;
                if (k4Var != null) {
                    return ((oi.p3) k4Var).a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // jg.y1
    public void P1(ArrayList arrayList) {
        jg.h1 h1Var = (jg.h1) this.b;
        String str = h1Var.a0;
        if (str != null) {
            h1Var.U(str, h1Var.d0, h1Var.e0, h1Var.c0, h1Var.b0);
        }
    }

    @Override // oi.r3
    public void Q() {
        oi.b2 b2Var = (oi.b2) this.b;
        b2Var.J0 = b2Var.L0;
        oi.b2.e0(b2Var, false, false);
        b2Var.C0(2, true);
    }

    @Override // hi.wa
    public void Q0(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.P = f10;
        v5Var.c();
    }

    @Override // oi.r3
    public void R0(oi.s3 s3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.b;
        a70 I = a70.I(b2Var, view);
        I.T = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.y0 = oi.h4.b(I, b2Var, s3Var, false);
    }

    @Override // oi.h0
    public void S0(CharSequence charSequence) {
        switch (this.a) {
            case 19:
                oi.o3 o3Var = ((oi.w0) this.b).T;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                oi.k4 k4Var = ((oi.m4) this.b).H;
                if (k4Var != null) {
                    oi.p3 p3Var = (oi.p3) k4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // gh.a
    public int U0() {
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.b;
        gh.a i7 = i();
        int U0 = (i7 == null || !j5Var.d.e()) ? 0 : i7.U0();
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(j5Var.a, l10.U0(), U0);
        }
        return U0;
    }

    @Override // gh.a
    public int W1() {
        gh.a i7 = i();
        gh.a l10 = l();
        int W1 = i7 != null ? i7.W1() : 0;
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.j5) this.b).a, l10.W1(), W1);
        }
        return W1;
    }

    @Override // gh.a
    public float Y0() {
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.b;
        gh.a i7 = i();
        gh.a l10 = l();
        float Y0 = i7 != null ? i7.Y0() : -1.0f;
        float Y02 = l10 != null ? l10.Y0() : Y0;
        return (Y02 < 0.0f || Y0 < 0.0f) ? j5Var.a < 0.5f ? Y02 : Y0 : org.telegram.messenger.g0.T1(Y02, Y0, j5Var.a);
    }

    @Override // gh.a
    public float Z0() {
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.b;
        gh.a i7 = i();
        gh.a l10 = l();
        float Z0 = i7 != null ? i7.Z0() : -1.0f;
        float Z02 = l10 != null ? l10.Z0() : Z0;
        return (Z02 < 0.0f || Z0 < 0.0f) ? j5Var.a < 0.5f ? Z02 : Z0 : org.telegram.messenger.g0.T1(Z02, Z0, j5Var.a);
    }

    @Override // oi.r3
    public boolean a(float f10) {
        boolean z10;
        oi.b2 b2Var = (oi.b2) this.b;
        FrameLayout frameLayout = b2Var.w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z10 = true;
                oi.b2.e0(b2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        oi.b2.e0(b2Var, z10, true);
        return z10;
    }

    @Override // oi.r3
    public void a0(oi.a6 a6Var, String str) {
        oi.b2 b2Var = (oi.b2) this.b;
        if (b2Var.A0 == null) {
            b2Var.A0 = new ga.d(new kg.x1(this, 21), b2Var.getResourceProvider());
        }
        b2Var.A0.k(a6Var, str);
    }

    @Override // oi.h0
    public org.telegram.ui.Cells.i9 a1() {
        switch (this.a) {
            case 19:
                return (oi.w0) this.b;
            default:
                return (oi.m4) this.b;
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                j6.r rVar = new j6.r(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.t) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 6);
                break;
            case 7:
                j7.g gVar = (j7.g) this.b;
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                k7.d dVar = (k7.d) ((k7.e) obj).n();
                com.google.android.gms.common.api.g gVar2 = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar2.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, gVar);
                t7.a.b(obtain, gVar2);
                ((k7.b) dVar).h1(obtain, 6);
                break;
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                a6.e eVar = (a6.e) this.b;
                Parcel l1 = iVar2.l1();
                int i10 = l7.f.a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, eVar);
                iVar2.m1(l1, 1);
                break;
        }
    }

    @Override // org.telegram.messenger.wy
    public void b() {
        az azVar = (az) this.b;
        HashMap hashMap = azVar.n;
        azVar.getNotificationCenter().k(ls.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // oi.e1
    public void b1(CharSequence charSequence) {
        oi.b3 b3Var = ((oi.m5) this.b).F;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    @Override // hi.wa
    public void b2(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.t0 = f10;
        c7Var.j = true;
        v5Var.y(true);
    }

    @Override // o0.a
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // oi.h0
    public oi.a c1() {
        switch (this.a) {
            case 19:
                return ((oi.w0) this.b).a;
            default:
                return ((oi.m4) this.b).a;
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // oi.e1
    public /* synthetic */ boolean d2(oi.f1 f1Var) {
        return false;
    }

    @Override // oi.h0
    public void e(oi.f1 f1Var) {
        switch (this.a) {
            case 19:
                oi.o3 o3Var = ((oi.w0) this.b).T;
                if (o3Var != null) {
                    oi.t3 t3Var = o3Var.a;
                    oi.t3.Q1(t3Var, f1Var);
                    t3Var.p3.k(f1Var, true);
                    break;
                }
                break;
            case 20:
            default:
                oi.b3 b3Var = ((oi.m5) this.b).F;
                if (b3Var != null) {
                    oi.t3 t3Var2 = b3Var.a;
                    oi.t3.Q1(t3Var2, f1Var);
                    t3Var2.p3.k(f1Var, true);
                    break;
                }
                break;
            case 21:
                oi.k4 k4Var = ((oi.m4) this.b).H;
                if (k4Var != null) {
                    oi.t3 t3Var3 = ((oi.p3) k4Var).a;
                    oi.t3.Q1(t3Var3, f1Var);
                    t3Var3.p3.k(f1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // hi.wa
    public void e1(long j3) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.r0 = j3;
        c7Var.j = true;
        v5Var.y(true);
    }

    @Override // org.telegram.messenger.wy
    public void f(Location location) {
        az azVar = (az) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = azVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            gj gjVar = (gj) ((Map.Entry) it.next()).getValue();
            azVar.r0(yy.d(tL_messageMediaGeo, gj.B0(gjVar.k), gjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // hi.wa
    public void f0() {
        v5 v5Var = (v5) this.b;
        v5Var.s(null, null, true);
        sa saVar = ((ga) v5Var).D0;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.s(null, null, true);
        }
        u9 u9Var = saVar.w1;
        if (u9Var != null) {
            u9Var.n0();
        }
        ia iaVar = saVar.d1;
        if (iaVar != null) {
            iaVar.setHasRoundVideo(false);
        }
        c7 c7Var = saVar.L1;
        if (c7Var != null) {
            File file = c7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.L1.o0 = null;
            }
            if (saVar.L1.p0 != null) {
                try {
                    new File(saVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                saVar.L1.p0 = null;
            }
        }
    }

    @Override // hi.wa
    public void g(int i7) {
        g0 g0Var = ((v5) this.b).F;
        if (g0Var != null) {
            ArrayList arrayList = g0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f0 f0Var = (f0) obj;
                if (f0Var.a == i7) {
                    f0Var.b.e(true, 1.0f);
                    g0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // hi.wa
    public void g0(boolean z10, float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.Z = f10;
        c7Var.j = true;
        i61 i61Var = v5Var.e;
        if (i61Var == null || i61Var.U() == -9223372036854775807L) {
            return;
        }
        v5Var.m((long) (f10 * v5Var.e.U()));
    }

    @Override // oi.h0
    public boolean g1() {
        switch (this.a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.a;
                    if (o3Var.a.V4()) {
                    }
                }
                break;
            default:
                oi.m4 m4Var = (oi.m4) this.b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.a;
                    if (((oi.p3) k4Var).a.V4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // fd.a
    public Object get() {
        return new jb.a((Context) ((d9.o) this.b).a);
    }

    @Override // m.e2
    public void h(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // hi.wa
    public void h1(boolean z10) {
        tg.t1 t1Var;
        sa saVar = ((ga) ((v5) this.b)).D0;
        u9 u9Var = saVar.w1;
        if (u9Var == null) {
            return;
        }
        tg.t1 t1Var2 = null;
        if (!z10 && (u9Var.getSelectedEntity() instanceof tg.t1)) {
            saVar.w1.A0(null, true);
            return;
        }
        if (!z10 || (saVar.w1.getSelectedEntity() instanceof tg.t1)) {
            return;
        }
        f5 f5Var = saVar.w1.B0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= f5Var.getChildCount()) {
                t1Var = null;
                break;
            }
            View childAt = f5Var.getChildAt(i10);
            if (childAt instanceof tg.t1) {
                t1Var = (tg.t1) childAt;
                break;
            }
            i10++;
        }
        if (t1Var != null) {
            u9 u9Var2 = saVar.w1;
            f5 f5Var2 = u9Var2.B0;
            while (true) {
                if (i7 >= f5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = f5Var2.getChildAt(i7);
                if (childAt2 instanceof tg.t1) {
                    t1Var2 = (tg.t1) childAt2;
                    break;
                }
                i7++;
            }
            u9Var2.A0(t1Var2, true);
        }
    }

    public gh.a i() {
        org.telegram.ui.ActionBar.t4 t4Var = ((org.telegram.ui.ActionBar.j5) this.b).d;
        if (t4Var != null) {
            return t4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // hi.wa
    public void i2(int i7, long j3) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null || (arrayList = c7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((c7) v5Var.d.T.get(i7)).X = j3;
    }

    public org.telegram.messenger.ca j() {
        m8.d dVar = (m8.d) this.b;
        q6.m.j("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.b, dVar.d), new LatLng(dVar.c, dVar.e));
        org.telegram.messenger.ca caVar = new org.telegram.messenger.ca();
        caVar.a = latLngBounds;
        return caVar;
    }

    @Override // oi.r3
    public void j1() {
        oi.b2 b2Var = (oi.b2) this.b;
        b2Var.E0();
        b2Var.H0();
    }

    @Override // oi.h0
    public void k2() {
        switch (this.a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.a;
                    oi.t3.S1(o3Var.a);
                    break;
                }
                break;
            default:
                oi.m4 m4Var = (oi.m4) this.b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.a;
                    oi.t3.S1(((oi.p3) k4Var).a);
                    break;
                }
                break;
        }
    }

    public gh.a l() {
        org.telegram.ui.ActionBar.t4 t4Var;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.b;
        if (j5Var.a >= 1.0f || (t4Var = j5Var.d) == null) {
            return null;
        }
        return t4Var.getButtonsGlassColorProvider();
    }

    @Override // oi.h0
    public void l1(int i7, int i10) {
        switch (this.a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.a;
                    oi.g2 g2Var = o3Var.a.R3;
                    if (g2Var != null) {
                        g2Var.f(i7, i10);
                        break;
                    }
                }
                break;
            default:
                oi.m4 m4Var = (oi.m4) this.b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.a;
                    oi.g2 g2Var2 = ((oi.p3) k4Var).a.R3;
                    if (g2Var2 != null) {
                        g2Var2.f(i7, i10);
                        break;
                    }
                }
                break;
        }
    }

    public int m() {
        return ((org.telegram.messenger.j0) this.b).c;
    }

    @Override // oi.r3
    public void m0() {
        oi.b2 b2Var = (oi.b2) this.b;
        oi.b2.e0(b2Var, false, true);
        int i7 = b2Var.J0;
        b2Var.C0(i7 != 2 ? i7 : 0, true);
    }

    @Override // hi.wa
    public void m2(long j3) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.D = j3;
        c7Var.j = true;
        v5Var.w(true);
    }

    @Override // m.e2
    public void n(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i7)).b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        handler.postAtTime(new a8.qa(this, i10 < arrayList.size() ? (l.d) arrayList.get(i10) : null, mVar, kVar, false, 3), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // hi.wa
    public void n1(float f10, int i7) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null || (arrayList = c7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((c7) v5Var.d.T.get(i7)).V = f10;
    }

    @Override // oi.e1
    public boolean o() {
        oi.m5 m5Var = (oi.m5) this.b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // oi.r3
    public void onContentChanged() {
        oi.b2 b2Var = (oi.b2) this.b;
        if (b2Var.z0 != null) {
            boolean p32 = b2Var.Q.p3();
            b2Var.M0 = p32;
            b2Var.z0.g(p32);
            b2Var.z0.invalidate();
        }
        b2Var.H0();
        Runnable runnable = b2Var.N0;
        org.telegram.messenger.g0.r(runnable);
        org.telegram.messenger.g0.h3(runnable, 1000L);
    }

    @Override // org.telegram.messenger.qa
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((rd) this.b).m(location);
    }

    public LongSparseArray p(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    public t5 q(org.telegram.messenger.bb bbVar) {
        m8.d dVar = (m8.d) this.b;
        LatLng latLng = new LatLng(bbVar.a, bbVar.b);
        dVar.getClass();
        double d = dVar.b;
        double d2 = latLng.a;
        dVar.b = Math.min(d, d2);
        dVar.c = Math.max(dVar.c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.b;
        if (isNaN) {
            dVar.d = d10;
            dVar.e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.e = d10;
        }
        return this;
    }

    @Override // hi.wa
    public void q1(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.F = f10;
        c7Var.j = true;
        v5Var.w(true);
    }

    @Override // jg.y1
    public void r(int i7) {
        ((jg.h1) this.b).f();
    }

    @Override // oi.e1
    public void r1(oi.f1 f1Var, int i7, int i10) {
        oi.b3 b3Var;
        org.telegram.ui.Cells.j9 textSelectionHelper;
        oi.m5 m5Var = (oi.m5) this.b;
        if (m5Var.H || i7 == i10 || (b3Var = m5Var.F) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == m5Var) {
            return;
        }
        m5Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 4));
    }

    public ia.b s(JSONObject jSONObject) {
        ia.d aVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            aVar = new pb.b(11);
        } else {
            aVar = new qb.a(11);
        }
        return aVar.g((w7.s) this.b, jSONObject);
    }

    @Override // hi.wa
    public void s0(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.s0 = f10;
        c7Var.j = true;
        v5Var.y(true);
    }

    @Override // oi.e1
    public void s1(Editable editable) {
        oi.m5 m5Var = (oi.m5) this.b;
        oi.a aVar = m5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = m5Var.r.q2;
        }
        m5Var.w();
        oi.b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // hi.wa
    public void t(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.u0 = f10;
        c7Var.j = true;
        v5Var.c();
    }

    @Override // gh.a
    public int t0() {
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.b;
        gh.a i7 = i();
        int t02 = (i7 == null || !j5Var.d.e()) ? 0 : i7.t0();
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(j5Var.a, l10.t0(), t02);
        }
        return t02;
    }

    @Override // oi.h0
    public void u() {
        switch (this.a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.t3.T1(o3Var.a, w0Var.a);
                    break;
                }
                break;
            default:
                oi.m4 m4Var = (oi.m4) this.b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.t3.T1(((oi.p3) k4Var).a, m4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // oi.h0
    public void u1() {
        switch (this.a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.a;
                    oi.t3 t3Var = o3Var.a;
                    oi.g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.g();
                    }
                    t3Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                oi.m4 m4Var = (oi.m4) this.b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.a;
                    oi.t3 t3Var2 = ((oi.p3) k4Var).a;
                    oi.g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.g();
                    }
                    t3Var2.p3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // ce.c
    public Object v(ce.d dVar, kd.c cVar) {
        Object v = ((q4.q) this.b).v(new gb.y0(dVar, 1), cVar);
        return v == jd.a.a ? v : gd.k.a;
    }

    @Override // i6.a
    public void v0(Bitmap bitmap) {
        ((i6.h) this.b).e(3, bitmap);
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    public void w(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j3, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j10);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
        }
        longSparseArray3.get(j11);
        longSparseArray3.put(j11, obj);
    }

    @Override // hi.wa
    public void w1(float f10) {
        v5 v5Var = (v5) this.b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.E = f10;
        c7Var.j = true;
        v5Var.w(true);
    }

    @Override // oi.r3
    public void x(oi.q3 q3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.b;
        a70 I = a70.I(b2Var, view);
        I.T = true;
        b2Var.y0 = oi.h4.c(I, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), q3Var, false);
    }

    public Object y(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    public /* synthetic */ t5(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ t5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public t5(a7.a aVar) {
        this.a = 15;
        q6.m.h(aVar);
        this.b = aVar;
    }

    public t5(String str, int i7) {
        this.a = 23;
        this.b = new org.telegram.messenger.j0(str, i7);
    }

    public t5(Context context, Uri uri) {
        this.a = 17;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public t5(String str, String str2) {
        this.a = 24;
        this.b = new org.telegram.messenger.n0(str, str2);
    }

    public t5() {
        this.a = 25;
        this.b = new LongSparseArray();
    }

    @Override // oi.e1
    public /* synthetic */ void E0() {
    }

    @Override // oi.r3
    public void V() {
    }

    @Override // oi.r3
    public void b0(int i7) {
    }

    @Override // oi.e1
    public /* synthetic */ void x0(oi.f1 f1Var) {
    }

    @Override // oi.r3
    public void k(oi.f1 f1Var, boolean z10) {
    }
}
