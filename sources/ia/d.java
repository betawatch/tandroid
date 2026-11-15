package ia;

import a3.h;
import android.animation.AnimatorSet;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
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
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.l;
import gb.y0;
import j6.i;
import j6.r;
import j6.t;
import j7.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jg.h1;
import jg.o1;
import jg.y1;
import l.m;
import l.w;
import m.e2;
import m.k;
import oi.d1;
import oi.d2;
import oi.e1;
import oi.e3;
import oi.e4;
import oi.g0;
import oi.h4;
import oi.j4;
import oi.k5;
import oi.l3;
import oi.m3;
import oi.n3;
import oi.o;
import oi.o3;
import oi.p3;
import oi.q3;
import oi.v0;
import oi.y2;
import oi.y5;
import oi.z1;
import org.json.JSONObject;
import org.telegram.messenger.az;
import org.telegram.messenger.bb;
import org.telegram.messenger.ca;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.messenger.n0;
import org.telegram.messenger.ns;
import org.telegram.messenger.qa;
import org.telegram.messenger.wa;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.d0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.x40;
import org.telegram.ui.bg0;
import org.telegram.ui.ys;
import w7.s;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d implements q, ib.b, y1, e2, w, k, ce.c, o0.a, r4, g0, o3, d1, wa, qa, az, gh.a, pm0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    public static d H(float f10, int i7) {
        Point point = org.telegram.messenger.g0.q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new d(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new d(i10, i11, new int[]{i11, i10});
        }
        return (i7 == 1) == (i10 < i11) ? new d(i10, i11, new int[0]) : new d(i11, i10, new int[0]);
    }

    @Override // oi.o3
    public void A(oi.a aVar) {
        z1 z1Var = (z1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(z1Var)) {
            ki kiVar = new ki(z1Var.getParentActivity(), z1Var, false, false, false, z1Var.getResourceProvider());
            kiVar.X3 = new sa.d(16);
            kiVar.K1 = true;
            kiVar.v3.setVisibility(8);
            kiVar.u4 = new h(z1Var, aVar, kiVar, 16);
            kiVar.e1();
            kiVar.show();
        }
    }

    @Override // gh.a
    public float A1() {
        gh.a k10 = k();
        gh.a t6 = t();
        float A1 = k10 != null ? k10.A1() : 0.0f;
        return t6 != null ? org.telegram.messenger.g0.T1(t6.A1(), A1, ((g5) this.b).a) : A1;
    }

    @Override // gh.a
    public int A2() {
        q4 q4Var;
        g5 g5Var = (g5) this.b;
        gh.a k10 = k();
        int A2 = k10 != null ? k10.A2() : 0;
        return (g5Var.a >= 1.0f || (q4Var = g5Var.d) == null) ? A2 : i0.a.f(g5Var.a, q4Var.getButtonsGlassBackgroundColor(), A2);
    }

    @Override // oi.o3
    public void D() {
        z1 z1Var = (z1) this.b;
        z1Var.J0 = z1Var.L0;
        z1.e0(z1Var, false, false);
        z1Var.C0(2, true);
    }

    @Override // gh.a
    public int D1() {
        gh.a k10 = k();
        gh.a t6 = t();
        int D1 = k10 != null ? k10.D1() : 0;
        if (t6 != null) {
            return i0.a.f(((g5) this.b).a, t6.D1(), D1);
        }
        return D1;
    }

    @Override // oi.g0
    public h9 E() {
        switch (this.a) {
            case 16:
                l3 l3Var = ((v0) this.b).T;
                if (l3Var == null) {
                    return null;
                }
                return l3Var.a.getTextSelectionHelper();
            default:
                h4 h4Var = ((j4) this.b).H;
                if (h4Var != null) {
                    return ((m3) h4Var).a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // ce.c
    public Object G(ce.d dVar, kd.c cVar) {
        Object G = ((q4.q) this.b).G(new y0(dVar, 1), cVar);
        return G == jd.a.a ? G : gd.k.a;
    }

    @Override // oi.d1
    public void I(CharSequence charSequence) {
        y2 y2Var = ((k5) this.b).F;
        if (y2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        y2Var.a.w4(charSequence.toString());
    }

    @Override // oi.g0
    public void J(CharSequence charSequence) {
        switch (this.a) {
            case 16:
                l3 l3Var = ((v0) this.b).T;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                h4 h4Var = ((j4) this.b).H;
                if (h4Var != null) {
                    m3 m3Var = (m3) h4Var;
                    m3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        m3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 15:
                ((o) this.b).M(z10, i7, i10, 0L, false);
                o oVar = (o) this.b;
                bg0 bg0Var = oVar.P;
                if (bg0Var != null) {
                    bg0Var.i();
                    oVar.P = null;
                    break;
                }
                break;
            default:
                d0 d0Var = (d0) this.b;
                d0Var.q1(i7, i10, z10);
                d0Var.dismiss();
                break;
        }
    }

    @Override // oi.o3
    public void M(y5 y5Var, String str) {
        z1 z1Var = (z1) this.b;
        if (z1Var.A0 == null) {
            z1Var.A0 = new ga.d(new ki.e(this, 19), z1Var.getResourceProvider());
        }
        z1Var.A0.k(y5Var, str);
    }

    @Override // gh.a
    public int M0() {
        gh.a k10 = k();
        gh.a t6 = t();
        int M0 = k10 != null ? k10.M0() : 0;
        if (t6 != null) {
            return i0.a.f(((g5) this.b).a, t6.M0(), M0);
        }
        return M0;
    }

    @Override // oi.g0
    public g9 N() {
        switch (this.a) {
            case 16:
                return (v0) this.b;
            default:
                return (j4) this.b;
        }
    }

    @Override // oi.g0
    public oi.a P() {
        switch (this.a) {
            case 16:
                return ((v0) this.b).a;
            default:
                return ((j4) this.b).a;
        }
    }

    @Override // oi.g0
    public boolean R() {
        switch (this.a) {
            case 16:
                v0 v0Var = (v0) this.b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.a;
                    if (l3Var.a.V4()) {
                    }
                }
                break;
            default:
                j4 j4Var = (j4) this.b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.a;
                    if (((m3) h4Var).a.V4()) {
                    }
                }
                break;
        }
        return false;
    }

    public b S(JSONObject jSONObject) {
        e aVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            aVar = new pb.b(11);
        } else {
            aVar = new qb.a(11);
        }
        return aVar.d((s) this.b, jSONObject);
    }

    public void T(long j3, long j10, long j11, Object obj) {
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

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // gh.a
    public int U0() {
        g5 g5Var = (g5) this.b;
        gh.a k10 = k();
        int U0 = (k10 == null || !g5Var.d.e()) ? 0 : k10.U0();
        gh.a t6 = t();
        if (t6 != null) {
            return i0.a.f(g5Var.a, t6.U0(), U0);
        }
        return U0;
    }

    @Override // oi.g0
    public void V(int i7, int i10) {
        switch (this.a) {
            case 16:
                v0 v0Var = (v0) this.b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.a;
                    d2 d2Var = l3Var.a.R3;
                    if (d2Var != null) {
                        d2Var.f(i7, i10);
                        break;
                    }
                }
                break;
            default:
                j4 j4Var = (j4) this.b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.a;
                    d2 d2Var2 = ((m3) h4Var).a.R3;
                    if (d2Var2 != null) {
                        d2Var2.f(i7, i10);
                        break;
                    }
                }
                break;
        }
    }

    public Object W(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    @Override // gh.a
    public int W1() {
        gh.a k10 = k();
        gh.a t6 = t();
        int W1 = k10 != null ? k10.W1() : 0;
        if (t6 != null) {
            return i0.a.f(((g5) this.b).a, t6.W1(), W1);
        }
        return W1;
    }

    @Override // oi.o3
    public void Y() {
        z1 z1Var = (z1) this.b;
        z1.e0(z1Var, false, true);
        int i7 = z1Var.J0;
        z1Var.C0(i7 != 2 ? i7 : 0, true);
    }

    @Override // gh.a
    public float Y0() {
        g5 g5Var = (g5) this.b;
        gh.a k10 = k();
        gh.a t6 = t();
        float Y0 = k10 != null ? k10.Y0() : -1.0f;
        float Y02 = t6 != null ? t6.Y0() : Y0;
        return (Y02 < 0.0f || Y0 < 0.0f) ? g5Var.a < 0.5f ? Y02 : Y0 : org.telegram.messenger.g0.T1(Y02, Y0, g5Var.a);
    }

    @Override // oi.d1
    public void Z(e1 e1Var, int i7, int i10) {
        y2 y2Var;
        h9 textSelectionHelper;
        k5 k5Var = (k5) this.b;
        if (k5Var.H || i7 == i10 || (y2Var = k5Var.F) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == k5Var) {
            return;
        }
        k5Var.post(new o1(this, e1Var, i10, textSelectionHelper, i7, 4));
    }

    @Override // gh.a
    public float Z0() {
        g5 g5Var = (g5) this.b;
        gh.a k10 = k();
        gh.a t6 = t();
        float Z0 = k10 != null ? k10.Z0() : -1.0f;
        float Z02 = t6 != null ? t6.Z0() : Z0;
        return (Z02 < 0.0f || Z0 < 0.0f) ? g5Var.a < 0.5f ? Z02 : Z0 : org.telegram.messenger.g0.T1(Z02, Z0, g5Var.a);
    }

    @Override // oi.o3
    public boolean a(float f10) {
        boolean z10;
        z1 z1Var = (z1) this.b;
        FrameLayout frameLayout = z1Var.w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z10 = true;
                z1.e0(z1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        z1.e0(z1Var, z10, true);
        return z10;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                r rVar = new r(1, (TaskCompletionSource) obj2);
                i iVar = (i) ((t) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 6);
                break;
            case 4:
                g gVar = (g) this.b;
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
                l lVar = new l((TaskCompletionSource) obj2);
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

    @Override // oi.d1
    public void b0(Editable editable) {
        k5 k5Var = (k5) this.b;
        oi.a aVar = k5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = k5Var.r.q2;
        }
        k5Var.w();
        y2 y2Var = k5Var.F;
        if (y2Var == null || k5Var.a == null) {
            return;
        }
        y2Var.a();
    }

    @Override // org.telegram.messenger.az
    public void c() {
        ez ezVar = (ez) this.b;
        HashMap hashMap = ezVar.n;
        ezVar.getNotificationCenter().k(ns.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // oi.g0
    public void c0() {
        switch (this.a) {
            case 16:
                v0 v0Var = (v0) this.b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.a;
                    q3 q3Var = l3Var.a;
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.g();
                    }
                    q3Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                j4 j4Var = (j4) this.b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.a;
                    q3 q3Var2 = ((m3) h4Var).a;
                    d2 d2Var2 = q3Var2.R3;
                    if (d2Var2 != null) {
                        d2Var2.g();
                    }
                    q3Var2.p3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // oi.g0, oi.d1
    public void d(e1 e1Var) {
        switch (this.a) {
            case 16:
                l3 l3Var = ((v0) this.b).T;
                if (l3Var != null) {
                    q3 q3Var = l3Var.a;
                    q3.Q1(q3Var, e1Var);
                    q3Var.p3.b(e1Var, true);
                    break;
                }
                break;
            case 17:
            default:
                y2 y2Var = ((k5) this.b).F;
                if (y2Var != null) {
                    q3 q3Var2 = y2Var.a;
                    q3.Q1(q3Var2, e1Var);
                    q3Var2.p3.b(e1Var, true);
                    break;
                }
                break;
            case 18:
                h4 h4Var = ((j4) this.b).H;
                if (h4Var != null) {
                    q3 q3Var3 = ((m3) h4Var).a;
                    q3.Q1(q3Var3, e1Var);
                    q3Var3.p3.b(e1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // l.w
    public void e(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.e(kVar, z10);
        }
    }

    @Override // jg.y1
    public /* synthetic */ boolean e0(int i7) {
        return true;
    }

    @Override // org.telegram.messenger.az
    public void f(Location location) {
        ez ezVar = (ez) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = ezVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            gj gjVar = (gj) ((Map.Entry) it.next()).getValue();
            ezVar.r0(cz.d(tL_messageMediaGeo, gj.B0(gjVar.k), gjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // oi.d1
    public boolean g() {
        k5 k5Var = (k5) this.b;
        y2 y2Var = k5Var.F;
        if (y2Var == null || k5Var.a == null) {
            return false;
        }
        return y2Var.a.V4();
    }

    @Override // oi.o3
    public m60 g0(View view) {
        return m60.H((z1) this.b, view);
    }

    @Override // fd.a
    public Object get() {
        return new jb.a((Context) ((d9.o) this.b).b);
    }

    @Override // org.telegram.ui.Components.pm0
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ys ysVar = (ys) this.b;
        sb2.append((Object) ysVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) ysVar.b.getText());
        return sb2.toString();
    }

    @Override // oi.g0
    public void h() {
        switch (this.a) {
            case 16:
                v0 v0Var = (v0) this.b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    q3.T1(l3Var.a, v0Var.a);
                    break;
                }
                break;
            default:
                j4 j4Var = (j4) this.b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    q3.T1(((m3) h4Var).a, j4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // oi.d1
    public /* synthetic */ boolean h0(boolean z10) {
        return false;
    }

    @Override // jg.y1
    public void i(int i7) {
        ((h1) this.b).f();
    }

    @Override // m.e2
    public void j(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    public gh.a k() {
        q4 q4Var = ((g5) this.b).d;
        if (q4Var != null) {
            return q4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // oi.o3
    public void k0(p3 p3Var, View view) {
        z1 z1Var = (z1) this.b;
        m60 H = m60.H(z1Var, view);
        H.Q = true;
        z1Var.getParentActivity();
        z1Var.getResourceProvider();
        z1Var.y0 = e4.b(H, z1Var, p3Var, false);
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        float c10;
        int i7;
        ys ysVar = (ys) this.b;
        if (f10 <= 0.25f) {
            c10 = com.google.android.gms.internal.vision.e2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.gms.internal.vision.e2.c(f11, 0.25f, 9437184.0f, TLObject.FLAG_20);
            } else {
                float f12 = f11 - 0.25f;
                c10 = f12 <= 0.25f ? com.google.android.gms.internal.vision.e2.c(f12, 0.25f, 9.437184E7f, 10485760) : com.google.android.gms.internal.vision.e2.c(f12 - 0.25f, 0.25f, 2097152000 - 104857600, 104857600);
            }
        }
        int i10 = (int) c10;
        long j3 = i10;
        ysVar.b.setText(hd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.g0.i0(j3, false, false)));
        ysVar.d = j3;
        q8[] q8VarArr = ysVar.h;
        AnimatorSet[] animatorSetArr = ysVar.n;
        int i11 = ysVar.e;
        i7 = ysVar.r.videosRow;
        if (i11 == i7) {
            ysVar.f.setText(hd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(j3, false, false)));
            boolean z11 = i10 > 2097152;
            if (z11 != q8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                q8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new w9(ysVar, 23));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // jg.y1
    public void l0(ArrayList arrayList) {
        h1 h1Var = (h1) this.b;
        String str = h1Var.a0;
        if (str != null) {
            h1Var.U(str, h1Var.d0, h1Var.e0, h1Var.c0, h1Var.b0);
        }
    }

    @Override // oi.d1
    public void m(int i7, int i10) {
        d2 d2Var;
        k5 k5Var = (k5) this.b;
        y2 y2Var = k5Var.F;
        if (y2Var == null || k5Var.a == null || (d2Var = y2Var.a.R3) == null) {
            return;
        }
        d2Var.f(i7, i10);
    }

    @Override // oi.o3
    public void m0() {
        z1 z1Var = (z1) this.b;
        z1Var.E0();
        z1Var.H0();
    }

    @Override // oi.o3
    public void n(n3 n3Var, View view) {
        z1 z1Var = (z1) this.b;
        m60 H = m60.H(z1Var, view);
        H.Q = true;
        z1Var.y0 = e4.c(H, z1Var, z1Var.getParentActivity(), z1Var.getResourceProvider(), n3Var, false);
    }

    @Override // oi.d1
    public /* synthetic */ boolean o(e1 e1Var) {
        return false;
    }

    @Override // oi.o3
    public void onContentChanged() {
        z1 z1Var = (z1) this.b;
        if (z1Var.z0 != null) {
            boolean p32 = z1Var.Q.p3();
            z1Var.M0 = p32;
            z1Var.z0.g(p32);
            z1Var.z0.invalidate();
        }
        z1Var.H0();
        Runnable runnable = z1Var.N0;
        org.telegram.messenger.g0.r(runnable);
        org.telegram.messenger.g0.i3(runnable, 1000L);
    }

    @Override // o0.a
    public Cursor p(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // org.telegram.ui.Components.pm0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // m.e2
    public void q(l.k kVar, m mVar) {
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

    @Override // oi.d1
    public /* synthetic */ boolean q0(e1 e1Var) {
        return false;
    }

    public ca r() {
        m8.d dVar = (m8.d) this.b;
        q6.m.i("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.b, dVar.d), new LatLng(dVar.c, dVar.e));
        ca caVar = new ca();
        caVar.a = latLngBounds;
        return caVar;
    }

    @Override // oi.o3
    public void s(int i7) {
        ((z1) this.b).t0(74, i7);
    }

    public gh.a t() {
        q4 q4Var;
        g5 g5Var = (g5) this.b;
        if (g5Var.a >= 1.0f || (q4Var = g5Var.d) == null) {
            return null;
        }
        return q4Var.getButtonsGlassColorProvider();
    }

    @Override // gh.a
    public int t0() {
        g5 g5Var = (g5) this.b;
        gh.a k10 = k();
        int t02 = (k10 == null || !g5Var.d.e()) ? 0 : k10.t0();
        gh.a t6 = t();
        if (t6 != null) {
            return i0.a.f(g5Var.a, t6.t0(), t02);
        }
        return t02;
    }

    public int u() {
        return ((j0) this.b).c;
    }

    @Override // oi.g0
    public void u0() {
        switch (this.a) {
            case 16:
                v0 v0Var = (v0) this.b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.a;
                    q3.S1(l3Var.a);
                    break;
                }
                break;
            default:
                j4 j4Var = (j4) this.b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.a;
                    q3.S1(((m3) h4Var).a);
                    break;
                }
                break;
        }
    }

    @Override // oi.o3
    public void v() {
        z1 z1Var = (z1) this.b;
        e3 e3Var = z1Var.Q.v3;
        z1Var.C0((e3Var != null && e3Var.x() && z1Var.Q.F4()) ? 1 : 0, true);
        z1Var.D0();
        z1Var.B0();
    }

    public LongSparseArray w(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    public d x(bb bbVar) {
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

    @Override // l.w
    public boolean y(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar != null) {
            return wVar.y(kVar);
        }
        return false;
    }

    public /* synthetic */ d(j jVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public d(a7.a aVar) {
        this.a = 12;
        q6.m.g(aVar);
        this.b = aVar;
    }

    public d(int i7, int i10, int[] iArr) {
        this.a = 29;
        x40[] x40VarArr = new x40[(iArr.length / 2) + 1];
        this.b = x40VarArr;
        x40 x40Var = new x40(i7, i10);
        int i11 = 0;
        x40VarArr[0] = x40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((x40[]) this.b)[i12] = new x40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public d(String str, int i7) {
        this.a = 20;
        this.b = new j0(str, i7);
    }

    public d(String str, String str2) {
        this.a = 21;
        this.b = new n0(str, str2);
    }

    public d(Context context, Uri uri) {
        this.a = 14;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d() {
        this.a = 22;
        this.b = new LongSparseArray();
    }

    @Override // oi.d1
    public /* synthetic */ void B() {
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
    }

    @Override // oi.o3
    public void F() {
    }

    @Override // oi.o3
    public void O(int i7) {
    }

    @Override // oi.d1
    public /* synthetic */ void z(e1 e1Var) {
    }

    @Override // oi.o3
    public void b(e1 e1Var, boolean z10) {
    }
}
