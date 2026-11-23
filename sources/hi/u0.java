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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class u0 implements og.n, sg.s0, rb, i6.a, com.google.android.gms.common.api.internal.q, jg.y1, m.e2, l.w, m.k, ce.c, o0.a, org.telegram.ui.Components.z4, oi.h0, oi.r3, oi.e1, org.telegram.messenger.va, org.telegram.messenger.pa, vy {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u0(int i7) {
        this.a = i7;
    }

    public int A0() {
        return ((org.telegram.messenger.j0) this.b).c;
    }

    @Override // oi.r3
    public void B(oi.a aVar) {
        oi.b2 b2Var = (oi.b2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(b2Var)) {
            ti tiVar = new ti(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            tiVar.X3 = new sa.d(16);
            tiVar.K1 = true;
            tiVar.v3.setVisibility(8);
            tiVar.u4 = new a3.h(b2Var, aVar, tiVar, 16);
            tiVar.f1();
            tiVar.show();
        }
    }

    public LongSparseArray B0(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    @Override // o0.a
    public Cursor C(Uri uri, String[] strArr, String[] strArr2) {
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

    public u0 C0(org.telegram.messenger.ab abVar) {
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

    @Override // hi.rb
    public void D(boolean z10) {
        f6 f6Var = (f6) this.b;
        if (f6Var.j()) {
            f6Var.F.getClass();
        }
        f6Var.x(-4, z10);
    }

    public ia.b D0(JSONObject jSONObject) {
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

    @Override // oi.r3
    public void E() {
        oi.b2 b2Var = (oi.b2) this.b;
        b2Var.J0 = b2Var.L0;
        oi.b2.e0(b2Var, false, false);
        b2Var.C0(2, true);
    }

    public void E0(long j3, long j10, long j11, Object obj) {
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

    public Object F0(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    @Override // og.n
    public void G() {
        ((w0) this.b).e.invalidate();
    }

    @Override // hi.rb
    public void H(float f10, int i7) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null || (arrayList = x7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((x7) f6Var.d.T.get(i7)).P = f10;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        ((oi.p) this.b).M(z10, i7, i10, 0L, false);
        oi.p pVar = (oi.p) this.b;
        dg0 dg0Var = pVar.P;
        if (dg0Var != null) {
            dg0Var.i();
            pVar.P = null;
        }
    }

    @Override // ce.c
    public Object J(ce.d dVar, kd.c cVar) {
        Object J = ((q4.q) this.b).J(new gb.z0(dVar, 1), cVar);
        return J == jd.a.a ? J : gd.k.a;
    }

    @Override // oi.h0
    public org.telegram.ui.Cells.i9 K() {
        switch (this.a) {
            case 20:
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

    @Override // hi.rb
    public void L(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.P = f10;
        f6Var.c();
    }

    @Override // oi.h0
    public void M(CharSequence charSequence) {
        switch (this.a) {
            case 20:
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

    @Override // org.telegram.messenger.vy
    public void O() {
        zy zyVar = (zy) this.b;
        HashMap hashMap = zyVar.n;
        zyVar.getNotificationCenter().k(ks.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // oi.h0
    public org.telegram.ui.Cells.h9 P() {
        switch (this.a) {
            case 20:
                return (oi.w0) this.b;
            default:
                return (oi.m4) this.b;
        }
    }

    @Override // oi.r3
    public void Q(oi.a6 a6Var, String str) {
        oi.b2 b2Var = (oi.b2) this.b;
        if (b2Var.A0 == null) {
            b2Var.A0 = new m.o3(new kg.f1(this, 23), b2Var.getResourceProvider());
        }
        b2Var.A0.g(a6Var, str);
    }

    @Override // oi.e1
    public void T(CharSequence charSequence) {
        oi.b3 b3Var = ((oi.m5) this.b).F;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    @Override // hi.rb
    public void U(long j3) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.r0 = j3;
        x7Var.j = true;
        f6Var.y(true);
    }

    @Override // oi.h0
    public oi.a V() {
        switch (this.a) {
            case 20:
                return ((oi.w0) this.b).a;
            default:
                return ((oi.m4) this.b).a;
        }
    }

    @Override // oi.h0
    public boolean W() {
        switch (this.a) {
            case 20:
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

    @Override // jg.y1
    public /* synthetic */ boolean W1(int i7) {
        return true;
    }

    @Override // hi.rb
    public void X(boolean z10) {
        tg.w1 w1Var;
        nb nbVar = ((bb) ((f6) this.b)).D0;
        pa paVar = nbVar.w1;
        if (paVar == null) {
            return;
        }
        tg.w1 w1Var2 = null;
        if (!z10 && (paVar.getSelectedEntity() instanceof tg.w1)) {
            nbVar.w1.D0(null, true);
            return;
        }
        if (!z10 || (nbVar.w1.getSelectedEntity() instanceof tg.w1)) {
            return;
        }
        q5 q5Var = nbVar.w1.B0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= q5Var.getChildCount()) {
                w1Var = null;
                break;
            }
            View childAt = q5Var.getChildAt(i10);
            if (childAt instanceof tg.w1) {
                w1Var = (tg.w1) childAt;
                break;
            }
            i10++;
        }
        if (w1Var != null) {
            pa paVar2 = nbVar.w1;
            q5 q5Var2 = paVar2.B0;
            while (true) {
                if (i7 >= q5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = q5Var2.getChildAt(i7);
                if (childAt2 instanceof tg.w1) {
                    w1Var2 = (tg.w1) childAt2;
                    break;
                }
                i7++;
            }
            paVar2.D0(w1Var2, true);
        }
    }

    @Override // oi.h0
    public void Y(int i7, int i10) {
        switch (this.a) {
            case 20:
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

    @Override // jg.y1
    public /* synthetic */ a0.h Y0() {
        return null;
    }

    @Override // m.e2
    public void Z(l.k kVar, l.m mVar) {
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

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                j6.s sVar = new j6.s(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.u) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, sVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 6);
                break;
            case 7:
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                a6.e eVar = (a6.e) this.b;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, eVar);
                iVar2.m1(l1, 1);
                break;
            case 8:
                j7.g gVar = (j7.g) this.b;
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                k7.d dVar = (k7.d) ((k7.e) obj).n();
                com.google.android.gms.common.api.g gVar2 = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar2.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = t7.a.a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, gVar);
                t7.a.b(obtain, gVar2);
                ((k7.b) dVar).h1(obtain, 6);
                break;
        }
    }

    @Override // hi.rb
    public void b0(float f10, int i7) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null || (arrayList = x7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((x7) f6Var.d.T.get(i7)).V = f10;
    }

    @Override // oi.r3
    public void c(oi.q3 q3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.b;
        x60 I = x60.I(b2Var, view);
        I.T = true;
        b2Var.y0 = oi.h4.c(I, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), q3Var, false);
    }

    @Override // org.telegram.messenger.vy
    public void c0(Location location) {
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

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // oi.h0, oi.e1
    public void d(oi.f1 f1Var) {
        switch (this.a) {
            case 20:
                oi.o3 o3Var = ((oi.w0) this.b).T;
                if (o3Var != null) {
                    oi.t3 t3Var = o3Var.a;
                    oi.t3.Q1(t3Var, f1Var);
                    t3Var.p3.b(f1Var, true);
                    break;
                }
                break;
            case 21:
            default:
                oi.b3 b3Var = ((oi.m5) this.b).F;
                if (b3Var != null) {
                    oi.t3 t3Var2 = b3Var.a;
                    oi.t3.Q1(t3Var2, f1Var);
                    t3Var2.p3.b(f1Var, true);
                    break;
                }
                break;
            case 22:
                oi.k4 k4Var = ((oi.m4) this.b).H;
                if (k4Var != null) {
                    oi.t3 t3Var3 = ((oi.p3) k4Var).a;
                    oi.t3.Q1(t3Var3, f1Var);
                    t3Var3.p3.b(f1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // hi.rb
    public void d0(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.F = f10;
        x7Var.j = true;
        f6Var.w(true);
    }

    @Override // hi.rb
    public void e(int i7) {
        n0 n0Var = ((f6) this.b).F;
        if (n0Var != null) {
            ArrayList arrayList = n0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m0 m0Var = (m0) obj;
                if (m0Var.a == i7) {
                    m0Var.b.e(true, 1.0f);
                    n0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // oi.e1
    public void e0(oi.f1 f1Var, int i7, int i10) {
        oi.b3 b3Var;
        org.telegram.ui.Cells.i9 textSelectionHelper;
        oi.m5 m5Var = (oi.m5) this.b;
        if (m5Var.H || i7 == i10 || (b3Var = m5Var.F) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == m5Var) {
            return;
        }
        m5Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 4));
    }

    @Override // l.w
    public void f(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.f(kVar, z10);
        }
    }

    @Override // oi.r3
    public void f0() {
        oi.b2 b2Var = (oi.b2) this.b;
        oi.b2.e0(b2Var, false, true);
        int i7 = b2Var.J0;
        b2Var.C0(i7 != 2 ? i7 : 0, true);
    }

    @Override // oi.h0
    public void g() {
        switch (this.a) {
            case 20:
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

    @Override // oi.e1
    public void g0(Editable editable) {
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

    @Override // oi.h0
    public void h0() {
        switch (this.a) {
            case 20:
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

    @Override // oi.e1
    public boolean i() {
        oi.m5 m5Var = (oi.m5) this.b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // oi.r3
    public x60 i0(View view) {
        return x60.I((oi.b2) this.b, view);
    }

    @Override // m.e2
    public void j(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // hi.rb
    public void j0(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.E = f10;
        x7Var.j = true;
        f6Var.w(true);
    }

    @Override // hi.rb
    public void k(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.u0 = f10;
        x7Var.j = true;
        f6Var.c();
    }

    @Override // sg.s0
    public void k0() {
        pa paVar = (pa) this.b;
        paVar.n0.a.v();
        paVar.N0.setViewHidden(false);
    }

    @Override // sg.s0
    public void l() {
        bi.o3 o3Var = ((pa) this.b).z0;
        if (o3Var != null) {
            o3Var.invalidate();
        }
    }

    @Override // oi.r3
    public void l0(oi.s3 s3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.b;
        x60 I = x60.I(b2Var, view);
        I.T = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.y0 = oi.h4.b(I, b2Var, s3Var, false);
    }

    @Override // oi.e1
    public void m(int i7, int i10) {
        oi.g2 g2Var;
        oi.m5 m5Var = (oi.m5) this.b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null || (g2Var = b3Var.a.R3) == null) {
            return;
        }
        g2Var.f(i7, i10);
    }

    @Override // oi.e1
    public /* synthetic */ boolean m0(boolean z10) {
        return false;
    }

    @Override // jg.y1
    public void m2(ArrayList arrayList) {
        jg.h1 h1Var = (jg.h1) this.b;
        String str = h1Var.a0;
        if (str != null) {
            h1Var.U(str, h1Var.d0, h1Var.e0, h1Var.c0, h1Var.b0);
        }
    }

    @Override // hi.rb
    public void n(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.G = f10;
        x7Var.j = true;
        f6Var.c();
    }

    @Override // hi.rb
    public void n0(float f10, int i7) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null || (arrayList = x7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((x7) f6Var.d.T.get(i7)).W = f10;
    }

    @Override // oi.e1
    public /* synthetic */ boolean o(oi.f1 f1Var) {
        return false;
    }

    @Override // hi.rb
    public void o0(float f10) {
        x7 x7Var = ((f6) this.b).d;
        if (x7Var == null) {
            return;
        }
        x7Var.a0 = f10;
        x7Var.j = true;
    }

    @Override // oi.r3
    public void onContentChanged() {
        oi.b2 b2Var = (oi.b2) this.b;
        if (b2Var.z0 != null) {
            boolean p32 = b2Var.Q.p3();
            b2Var.M0 = p32;
            b2Var.z0.h(p32);
            b2Var.z0.invalidate();
        }
        b2Var.H0();
        Runnable runnable = b2Var.N0;
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

    @Override // hi.rb
    public void p(long j3, boolean z10) {
        f6 f6Var = (f6) this.b;
        if (!z10) {
            f6Var.m(j3);
            return;
        }
        h61 h61Var = f6Var.e;
        if (h61Var != null) {
            h61Var.q0(j3, true);
            return;
        }
        if (f6Var.j()) {
            f6Var.F.m(j3, true);
            return;
        }
        h61 h61Var2 = f6Var.E;
        if (h61Var2 != null) {
            h61Var2.q0(j3, false);
        }
    }

    @Override // hi.rb
    public void p0() {
        ((f6) this.b).q(null);
    }

    @Override // sg.s0
    public void q() {
        pa paVar = (pa) this.b;
        if (paVar.M0) {
            paVar.M0 = false;
        } else {
            paVar.U0.b(1);
            paVar.w((sg.h) sg.h.a.get(0));
        }
    }

    @Override // oi.r3
    public void r(int i7) {
        ((oi.b2) this.b).t0(74, i7);
    }

    @Override // hi.rb
    public void r0(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.t0 = f10;
        x7Var.j = true;
        f6Var.y(true);
    }

    @Override // sg.s0
    public boolean s() {
        pa paVar = (pa) this.b;
        boolean z10 = paVar.t0 == null;
        if (!z10) {
            paVar.D0(null, true);
        }
        return z10;
    }

    @Override // oi.r3
    public void s0() {
        oi.b2 b2Var = (oi.b2) this.b;
        b2Var.E0();
        b2Var.H0();
    }

    @Override // hi.rb
    public void t() {
        f6 f6Var = (f6) this.b;
        f6Var.s(null, null, true);
        nb nbVar = ((bb) f6Var).D0;
        bb bbVar = nbVar.Y0;
        if (bbVar != null) {
            bbVar.s(null, null, true);
        }
        pa paVar = nbVar.w1;
        if (paVar != null) {
            paVar.p0();
        }
        db dbVar = nbVar.d1;
        if (dbVar != null) {
            dbVar.setHasRoundVideo(false);
        }
        x7 x7Var = nbVar.L1;
        if (x7Var != null) {
            File file = x7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                nbVar.L1.o0 = null;
            }
            if (nbVar.L1.p0 != null) {
                try {
                    new File(nbVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                nbVar.L1.p0 = null;
            }
        }
    }

    @Override // oi.e1
    public /* synthetic */ boolean t0(oi.f1 f1Var) {
        return false;
    }

    @Override // l.w
    public boolean u(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.e;
        if (wVar != null) {
            return wVar.u(kVar);
        }
        return false;
    }

    @Override // hi.rb
    public void u0(int i7, long j3) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null || (arrayList = x7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((x7) f6Var.d.T.get(i7)).X = j3;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h u1() {
        return null;
    }

    @Override // jg.y1
    public void v(int i7) {
        ((jg.h1) this.b).f();
    }

    @Override // i6.a
    public void w(Bitmap bitmap) {
        ((i6.i) this.b).e(3, bitmap);
    }

    @Override // oi.h0
    public void w0() {
        switch (this.a) {
            case 20:
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

    @Override // hi.rb
    public void x(boolean z10, float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.Z = f10;
        x7Var.j = true;
        h61 h61Var = f6Var.e;
        if (h61Var == null || h61Var.U() == -9223372036854775807L) {
            return;
        }
        f6Var.m((long) (f10 * f6Var.e.U()));
    }

    @Override // sg.s0
    public void x0() {
        pa paVar = (pa) this.b;
        if (paVar.t0 != null) {
            paVar.D0(null, true);
        }
        paVar.N0.setViewHidden(true);
    }

    @Override // oi.r3
    public void y() {
        oi.b2 b2Var = (oi.b2) this.b;
        oi.h3 h3Var = b2Var.Q.v3;
        b2Var.C0((h3Var != null && h3Var.x() && b2Var.Q.F4()) ? 1 : 0, true);
        b2Var.D0();
        b2Var.B0();
    }

    @Override // hi.rb
    public void y0(long j3) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.D = j3;
        x7Var.j = true;
        f6Var.w(true);
    }

    @Override // hi.rb
    public void z(float f10) {
        f6 f6Var = (f6) this.b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.s0 = f10;
        x7Var.j = true;
        f6Var.y(true);
    }

    public org.telegram.messenger.ba z0() {
        m8.d dVar = (m8.d) this.b;
        q6.m.j("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.b, dVar.d), new LatLng(dVar.c, dVar.e));
        org.telegram.messenger.ba baVar = new org.telegram.messenger.ba();
        baVar.a = latLngBounds;
        return baVar;
    }

    public /* synthetic */ u0(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ u0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public u0(a7.a aVar) {
        this.a = 16;
        q6.m.h(aVar);
        this.b = aVar;
    }

    public u0(String str, int i7) {
        this.a = 24;
        this.b = new org.telegram.messenger.j0(str, i7);
    }

    public u0(Context context, Uri uri) {
        this.a = 18;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public u0(String str, String str2) {
        this.a = 25;
        this.b = new org.telegram.messenger.n0(str, str2);
    }

    public u0() {
        this.a = 26;
        this.b = new LongSparseArray();
    }

    @Override // oi.e1
    public /* synthetic */ void F() {
    }

    @Override // oi.r3
    public void N() {
    }

    @Override // sg.s0
    public void h() {
    }

    @Override // og.n
    public void v0() {
    }

    @Override // oi.e1
    public /* synthetic */ void A(oi.f1 f1Var) {
    }

    @Override // og.n
    public void R(boolean z10) {
    }

    @Override // oi.r3
    public void S(int i7) {
    }

    @Override // og.n
    public void q0(boolean z10) {
    }

    @Override // oi.r3
    public void b(oi.f1 f1Var, boolean z10) {
    }
}
