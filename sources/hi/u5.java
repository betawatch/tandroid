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
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.qd;
import org.telegram.messenger.vy;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u5 implements xa, i6.a, com.google.android.gms.common.api.internal.q, ib.b, jg.y1, m.e2, l.w, m.k, ce.c, o0.a, org.telegram.ui.Components.z4, oi.g0, oi.q3, oi.d1, org.telegram.messenger.va, org.telegram.messenger.pa, vy, gh.a {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u5(int i7) {
        this.a = i7;
    }

    @Override // oi.d1
    public void A(int i7, int i10) {
        oi.e2 e2Var;
        oi.l5 l5Var = (oi.l5) this.b;
        oi.a3 a3Var = l5Var.F;
        if (a3Var == null || l5Var.a == null || (e2Var = a3Var.a.R3) == null) {
            return;
        }
        e2Var.f(i7, i10);
    }

    @Override // gh.a
    public float A1() {
        gh.a i7 = i();
        gh.a l10 = l();
        float A1 = i7 != null ? i7.A1() : 0.0f;
        return l10 != null ? org.telegram.messenger.g0.T1(l10.A1(), A1, ((org.telegram.ui.ActionBar.k5) this.b).a) : A1;
    }

    @Override // gh.a
    public int A2() {
        org.telegram.ui.ActionBar.u4 u4Var;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.b;
        gh.a i7 = i();
        int A2 = i7 != null ? i7.A2() : 0;
        return (k5Var.a >= 1.0f || (u4Var = k5Var.d) == null) ? A2 : i0.a.f(k5Var.a, u4Var.getButtonsGlassBackgroundColor(), A2);
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

    @Override // oi.q3
    public void D(int i7) {
        ((oi.z1) this.b).t0(74, i7);
    }

    @Override // hi.xa
    public void D0(boolean z10) {
        w5 w5Var = (w5) this.b;
        if (w5Var.j()) {
            w5Var.F.getClass();
        }
        w5Var.x(-4, z10);
    }

    @Override // gh.a
    public int D1() {
        gh.a i7 = i();
        gh.a l10 = l();
        int D1 = i7 != null ? i7.D1() : 0;
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.k5) this.b).a, l10.D1(), D1);
        }
        return D1;
    }

    @Override // oi.d1
    public /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // hi.xa
    public void F(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.G = f10;
        d7Var.j = true;
        w5Var.c();
    }

    @Override // oi.q3
    public void G() {
        oi.z1 z1Var = (oi.z1) this.b;
        oi.g3 g3Var = z1Var.Q.v3;
        z1Var.C0((g3Var != null && g3Var.x() && z1Var.Q.F4()) ? 1 : 0, true);
        z1Var.D0();
        z1Var.B0();
    }

    @Override // oi.q3
    public y60 G0(View view) {
        return y60.I((oi.z1) this.b, view);
    }

    @Override // hi.xa
    public void G1(float f10, int i7) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) w5Var.d.T.get(i7)).W = f10;
    }

    @Override // oi.q3
    public void H(oi.a aVar) {
        oi.z1 z1Var = (oi.z1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(z1Var)) {
            si siVar = new si(z1Var.getParentActivity(), z1Var, false, false, false, z1Var.getResourceProvider());
            siVar.X3 = new sa.d(16);
            siVar.K1 = true;
            siVar.v3.setVisibility(8);
            siVar.u4 = new a3.h(z1Var, aVar, siVar, 16);
            siVar.f1();
            siVar.show();
        }
    }

    @Override // oi.d1
    public /* synthetic */ boolean J(oi.e1 e1Var) {
        return false;
    }

    @Override // hi.xa
    public void J0(float f10, int i7) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) w5Var.d.T.get(i7)).P = f10;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // hi.xa
    public void M(long j3, boolean z10) {
        w5 w5Var = (w5) this.b;
        if (!z10) {
            w5Var.m(j3);
            return;
        }
        f61 f61Var = w5Var.e;
        if (f61Var != null) {
            f61Var.q0(j3, true);
            return;
        }
        if (w5Var.j()) {
            w5Var.F.m(j3, true);
            return;
        }
        f61 f61Var2 = w5Var.E;
        if (f61Var2 != null) {
            f61Var2.q0(j3, false);
        }
    }

    @Override // gh.a
    public int M0() {
        gh.a i7 = i();
        gh.a l10 = l();
        int M0 = i7 != null ? i7.M0() : 0;
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.k5) this.b).a, l10.M0(), M0);
        }
        return M0;
    }

    @Override // hi.xa
    public void M1(float f10) {
        d7 d7Var = ((w5) this.b).d;
        if (d7Var == null) {
            return;
        }
        d7Var.a0 = f10;
        d7Var.j = true;
    }

    @Override // hi.xa
    public void N1() {
        ((w5) this.b).q(null);
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        ((oi.o) this.b).M(z10, i7, i10, 0L, false);
        oi.o oVar = (oi.o) this.b;
        eg0 eg0Var = oVar.P;
        if (eg0Var != null) {
            eg0Var.i();
            oVar.P = null;
        }
    }

    @Override // oi.g0
    public org.telegram.ui.Cells.i9 P0() {
        switch (this.a) {
            case 19:
                oi.n3 n3Var = ((oi.v0) this.b).T;
                if (n3Var == null) {
                    return null;
                }
                return n3Var.a.getTextSelectionHelper();
            default:
                oi.j4 j4Var = ((oi.l4) this.b).H;
                if (j4Var != null) {
                    return ((oi.o3) j4Var).a.getTextSelectionHelper();
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

    @Override // oi.q3
    public void Q() {
        oi.z1 z1Var = (oi.z1) this.b;
        z1Var.J0 = z1Var.L0;
        oi.z1.e0(z1Var, false, false);
        z1Var.C0(2, true);
    }

    @Override // hi.xa
    public void Q0(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.P = f10;
        w5Var.c();
    }

    @Override // oi.q3
    public void R0(oi.r3 r3Var, View view) {
        oi.z1 z1Var = (oi.z1) this.b;
        y60 I = y60.I(z1Var, view);
        I.T = true;
        z1Var.getParentActivity();
        z1Var.getResourceProvider();
        z1Var.y0 = oi.g4.b(I, z1Var, r3Var, false);
    }

    @Override // oi.g0
    public void S0(CharSequence charSequence) {
        switch (this.a) {
            case 19:
                oi.n3 n3Var = ((oi.v0) this.b).T;
                if (n3Var != null) {
                    n3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        n3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                oi.j4 j4Var = ((oi.l4) this.b).H;
                if (j4Var != null) {
                    oi.o3 o3Var = (oi.o3) j4Var;
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // gh.a
    public int U0() {
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.b;
        gh.a i7 = i();
        int U0 = (i7 == null || !k5Var.d.e()) ? 0 : i7.U0();
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(k5Var.a, l10.U0(), U0);
        }
        return U0;
    }

    @Override // gh.a
    public int W1() {
        gh.a i7 = i();
        gh.a l10 = l();
        int W1 = i7 != null ? i7.W1() : 0;
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.k5) this.b).a, l10.W1(), W1);
        }
        return W1;
    }

    @Override // gh.a
    public float Y0() {
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.b;
        gh.a i7 = i();
        gh.a l10 = l();
        float Y0 = i7 != null ? i7.Y0() : -1.0f;
        float Y02 = l10 != null ? l10.Y0() : Y0;
        return (Y02 < 0.0f || Y0 < 0.0f) ? k5Var.a < 0.5f ? Y02 : Y0 : org.telegram.messenger.g0.T1(Y02, Y0, k5Var.a);
    }

    @Override // gh.a
    public float Z0() {
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.b;
        gh.a i7 = i();
        gh.a l10 = l();
        float Z0 = i7 != null ? i7.Z0() : -1.0f;
        float Z02 = l10 != null ? l10.Z0() : Z0;
        return (Z02 < 0.0f || Z0 < 0.0f) ? k5Var.a < 0.5f ? Z02 : Z0 : org.telegram.messenger.g0.T1(Z02, Z0, k5Var.a);
    }

    @Override // oi.q3
    public boolean a(float f10) {
        boolean z10;
        oi.z1 z1Var = (oi.z1) this.b;
        FrameLayout frameLayout = z1Var.w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z10 = true;
                oi.z1.e0(z1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        oi.z1.e0(z1Var, z10, true);
        return z10;
    }

    @Override // oi.q3
    public void a0(oi.z5 z5Var, String str) {
        oi.z1 z1Var = (oi.z1) this.b;
        if (z1Var.A0 == null) {
            z1Var.A0 = new ga.d(new ki.e(this, 20), z1Var.getResourceProvider());
        }
        z1Var.A0.k(z5Var, str);
    }

    @Override // oi.g0
    public org.telegram.ui.Cells.h9 a1() {
        switch (this.a) {
            case 19:
                return (oi.v0) this.b;
            default:
                return (oi.l4) this.b;
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

    @Override // org.telegram.messenger.vy
    public void b() {
        zy zyVar = (zy) this.b;
        HashMap hashMap = zyVar.n;
        zyVar.getNotificationCenter().k(ks.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // oi.d1
    public void b1(CharSequence charSequence) {
        oi.a3 a3Var = ((oi.l5) this.b).F;
        if (a3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        a3Var.a.w4(charSequence.toString());
    }

    @Override // hi.xa
    public void b2(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.t0 = f10;
        d7Var.j = true;
        w5Var.y(true);
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

    @Override // oi.g0
    public oi.a c1() {
        switch (this.a) {
            case 19:
                return ((oi.v0) this.b).a;
            default:
                return ((oi.l4) this.b).a;
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

    @Override // oi.d1
    public /* synthetic */ boolean d2(oi.e1 e1Var) {
        return false;
    }

    @Override // oi.g0
    public void e(oi.e1 e1Var) {
        switch (this.a) {
            case 19:
                oi.n3 n3Var = ((oi.v0) this.b).T;
                if (n3Var != null) {
                    oi.s3 s3Var = n3Var.a;
                    oi.s3.Q1(s3Var, e1Var);
                    s3Var.p3.k(e1Var, true);
                    break;
                }
                break;
            case 20:
            default:
                oi.a3 a3Var = ((oi.l5) this.b).F;
                if (a3Var != null) {
                    oi.s3 s3Var2 = a3Var.a;
                    oi.s3.Q1(s3Var2, e1Var);
                    s3Var2.p3.k(e1Var, true);
                    break;
                }
                break;
            case 21:
                oi.j4 j4Var = ((oi.l4) this.b).H;
                if (j4Var != null) {
                    oi.s3 s3Var3 = ((oi.o3) j4Var).a;
                    oi.s3.Q1(s3Var3, e1Var);
                    s3Var3.p3.k(e1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // hi.xa
    public void e1(long j3) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.r0 = j3;
        d7Var.j = true;
        w5Var.y(true);
    }

    @Override // org.telegram.messenger.vy
    public void f(Location location) {
        zy zyVar = (zy) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = zyVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            fj fjVar = (fj) ((Map.Entry) it.next()).getValue();
            zyVar.r0(xy.d(tL_messageMediaGeo, fj.B0(fjVar.k), fjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // hi.xa
    public void f0() {
        w5 w5Var = (w5) this.b;
        w5Var.s(null, null, true);
        ta taVar = ((ha) w5Var).D0;
        ha haVar = taVar.Y0;
        if (haVar != null) {
            haVar.s(null, null, true);
        }
        v9 v9Var = taVar.w1;
        if (v9Var != null) {
            v9Var.n0();
        }
        ja jaVar = taVar.d1;
        if (jaVar != null) {
            jaVar.setHasRoundVideo(false);
        }
        d7 d7Var = taVar.L1;
        if (d7Var != null) {
            File file = d7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                taVar.L1.o0 = null;
            }
            if (taVar.L1.p0 != null) {
                try {
                    new File(taVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                taVar.L1.p0 = null;
            }
        }
    }

    @Override // hi.xa
    public void g(int i7) {
        f0 f0Var = ((w5) this.b).F;
        if (f0Var != null) {
            ArrayList arrayList = f0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                e0 e0Var = (e0) obj;
                if (e0Var.a == i7) {
                    e0Var.b.e(true, 1.0f);
                    f0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // hi.xa
    public void g0(boolean z10, float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.Z = f10;
        d7Var.j = true;
        f61 f61Var = w5Var.e;
        if (f61Var == null || f61Var.U() == -9223372036854775807L) {
            return;
        }
        w5Var.m((long) (f10 * w5Var.e.U()));
    }

    @Override // oi.g0
    public boolean g1() {
        switch (this.a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.a;
                    if (n3Var.a.V4()) {
                    }
                }
                break;
            default:
                oi.l4 l4Var = (oi.l4) this.b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.a;
                    if (((oi.o3) j4Var).a.V4()) {
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

    @Override // hi.xa
    public void h1(boolean z10) {
        tg.r1 r1Var;
        ta taVar = ((ha) ((w5) this.b)).D0;
        v9 v9Var = taVar.w1;
        if (v9Var == null) {
            return;
        }
        tg.r1 r1Var2 = null;
        if (!z10 && (v9Var.getSelectedEntity() instanceof tg.r1)) {
            taVar.w1.A0(null, true);
            return;
        }
        if (!z10 || (taVar.w1.getSelectedEntity() instanceof tg.r1)) {
            return;
        }
        g5 g5Var = taVar.w1.B0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= g5Var.getChildCount()) {
                r1Var = null;
                break;
            }
            View childAt = g5Var.getChildAt(i10);
            if (childAt instanceof tg.r1) {
                r1Var = (tg.r1) childAt;
                break;
            }
            i10++;
        }
        if (r1Var != null) {
            v9 v9Var2 = taVar.w1;
            g5 g5Var2 = v9Var2.B0;
            while (true) {
                if (i7 >= g5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = g5Var2.getChildAt(i7);
                if (childAt2 instanceof tg.r1) {
                    r1Var2 = (tg.r1) childAt2;
                    break;
                }
                i7++;
            }
            v9Var2.A0(r1Var2, true);
        }
    }

    public gh.a i() {
        org.telegram.ui.ActionBar.u4 u4Var = ((org.telegram.ui.ActionBar.k5) this.b).d;
        if (u4Var != null) {
            return u4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // hi.xa
    public void i2(int i7, long j3) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) w5Var.d.T.get(i7)).X = j3;
    }

    public org.telegram.messenger.ba j() {
        m8.d dVar = (m8.d) this.b;
        q6.m.j("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.b, dVar.d), new LatLng(dVar.c, dVar.e));
        org.telegram.messenger.ba baVar = new org.telegram.messenger.ba();
        baVar.a = latLngBounds;
        return baVar;
    }

    @Override // oi.q3
    public void j1() {
        oi.z1 z1Var = (oi.z1) this.b;
        z1Var.E0();
        z1Var.H0();
    }

    @Override // oi.g0
    public void k2() {
        switch (this.a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.a;
                    oi.s3.S1(n3Var.a);
                    break;
                }
                break;
            default:
                oi.l4 l4Var = (oi.l4) this.b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.a;
                    oi.s3.S1(((oi.o3) j4Var).a);
                    break;
                }
                break;
        }
    }

    public gh.a l() {
        org.telegram.ui.ActionBar.u4 u4Var;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.b;
        if (k5Var.a >= 1.0f || (u4Var = k5Var.d) == null) {
            return null;
        }
        return u4Var.getButtonsGlassColorProvider();
    }

    @Override // oi.g0
    public void l1(int i7, int i10) {
        switch (this.a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.a;
                    oi.e2 e2Var = n3Var.a.R3;
                    if (e2Var != null) {
                        e2Var.f(i7, i10);
                        break;
                    }
                }
                break;
            default:
                oi.l4 l4Var = (oi.l4) this.b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.a;
                    oi.e2 e2Var2 = ((oi.o3) j4Var).a.R3;
                    if (e2Var2 != null) {
                        e2Var2.f(i7, i10);
                        break;
                    }
                }
                break;
        }
    }

    public int m() {
        return ((org.telegram.messenger.j0) this.b).c;
    }

    @Override // oi.q3
    public void m0() {
        oi.z1 z1Var = (oi.z1) this.b;
        oi.z1.e0(z1Var, false, true);
        int i7 = z1Var.J0;
        z1Var.C0(i7 != 2 ? i7 : 0, true);
    }

    @Override // hi.xa
    public void m2(long j3) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.D = j3;
        d7Var.j = true;
        w5Var.w(true);
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

    @Override // hi.xa
    public void n1(float f10, int i7) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null || (arrayList = d7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((d7) w5Var.d.T.get(i7)).V = f10;
    }

    @Override // oi.d1
    public boolean o() {
        oi.l5 l5Var = (oi.l5) this.b;
        oi.a3 a3Var = l5Var.F;
        if (a3Var == null || l5Var.a == null) {
            return false;
        }
        return a3Var.a.V4();
    }

    @Override // oi.q3
    public void onContentChanged() {
        oi.z1 z1Var = (oi.z1) this.b;
        if (z1Var.z0 != null) {
            boolean p32 = z1Var.Q.p3();
            z1Var.M0 = p32;
            z1Var.z0.g(p32);
            z1Var.z0.invalidate();
        }
        z1Var.H0();
        Runnable runnable = z1Var.N0;
        org.telegram.messenger.g0.r(runnable);
        org.telegram.messenger.g0.h3(runnable, 1000L);
    }

    @Override // org.telegram.messenger.pa
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((qd) this.b).m(location);
    }

    public LongSparseArray p(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    public u5 q(org.telegram.messenger.ab abVar) {
        m8.d dVar = (m8.d) this.b;
        LatLng latLng = new LatLng(abVar.a, abVar.b);
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

    @Override // hi.xa
    public void q1(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.F = f10;
        d7Var.j = true;
        w5Var.w(true);
    }

    @Override // jg.y1
    public void r(int i7) {
        ((jg.h1) this.b).f();
    }

    @Override // oi.d1
    public void r1(oi.e1 e1Var, int i7, int i10) {
        oi.a3 a3Var;
        org.telegram.ui.Cells.i9 textSelectionHelper;
        oi.l5 l5Var = (oi.l5) this.b;
        if (l5Var.H || i7 == i10 || (a3Var = l5Var.F) == null || (textSelectionHelper = a3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == l5Var) {
            return;
        }
        l5Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 4));
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

    @Override // hi.xa
    public void s0(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.s0 = f10;
        d7Var.j = true;
        w5Var.y(true);
    }

    @Override // oi.d1
    public void s1(Editable editable) {
        oi.l5 l5Var = (oi.l5) this.b;
        oi.a aVar = l5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = l5Var.r.q2;
        }
        l5Var.w();
        oi.a3 a3Var = l5Var.F;
        if (a3Var == null || l5Var.a == null) {
            return;
        }
        a3Var.a();
    }

    @Override // hi.xa
    public void t(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.u0 = f10;
        d7Var.j = true;
        w5Var.c();
    }

    @Override // gh.a
    public int t0() {
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.b;
        gh.a i7 = i();
        int t02 = (i7 == null || !k5Var.d.e()) ? 0 : i7.t0();
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(k5Var.a, l10.t0(), t02);
        }
        return t02;
    }

    @Override // oi.g0
    public void u() {
        switch (this.a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.s3.T1(n3Var.a, v0Var.a);
                    break;
                }
                break;
            default:
                oi.l4 l4Var = (oi.l4) this.b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.s3.T1(((oi.o3) j4Var).a, l4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // oi.g0
    public void u1() {
        switch (this.a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.a;
                    oi.s3 s3Var = n3Var.a;
                    oi.e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.g();
                    }
                    s3Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                oi.l4 l4Var = (oi.l4) this.b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.a;
                    oi.s3 s3Var2 = ((oi.o3) j4Var).a;
                    oi.e2 e2Var2 = s3Var2.R3;
                    if (e2Var2 != null) {
                        e2Var2.g();
                    }
                    s3Var2.p3.onContentChanged();
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

    @Override // hi.xa
    public void w1(float f10) {
        w5 w5Var = (w5) this.b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.E = f10;
        d7Var.j = true;
        w5Var.w(true);
    }

    @Override // oi.q3
    public void x(oi.p3 p3Var, View view) {
        oi.z1 z1Var = (oi.z1) this.b;
        y60 I = y60.I(z1Var, view);
        I.T = true;
        z1Var.y0 = oi.g4.c(I, z1Var, z1Var.getParentActivity(), z1Var.getResourceProvider(), p3Var, false);
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

    public /* synthetic */ u5(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ u5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public u5(a7.a aVar) {
        this.a = 15;
        q6.m.h(aVar);
        this.b = aVar;
    }

    public u5(String str, int i7) {
        this.a = 23;
        this.b = new org.telegram.messenger.j0(str, i7);
    }

    public u5(Context context, Uri uri) {
        this.a = 17;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public u5(String str, String str2) {
        this.a = 24;
        this.b = new org.telegram.messenger.n0(str, str2);
    }

    public u5() {
        this.a = 25;
        this.b = new LongSparseArray();
    }

    @Override // oi.d1
    public /* synthetic */ void E0() {
    }

    @Override // oi.q3
    public void V() {
    }

    @Override // oi.q3
    public void b0(int i7) {
    }

    @Override // oi.d1
    public /* synthetic */ void x0(oi.e1 e1Var) {
    }

    @Override // oi.q3
    public void k(oi.e1 e1Var, boolean z10) {
    }
}
