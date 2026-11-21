package kg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import fi.t3;
import hi.d7;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.q2;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c1 extends g2 implements fs {
    public boolean E;
    public int F;
    public boolean G;
    public h51 a;
    public c5 b;
    public boolean c;
    public FrameLayout d;
    public z0 e;
    public FrameLayout f;
    public b1 h;
    public eq n;
    public t3 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public c1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        if (this.b == null) {
            return;
        }
        this.b.a(a0(), z10);
        h51 h51Var = this.a;
        if (h51Var == null || h51Var.g3 == null) {
            return;
        }
        if (this.G != ((this.w == null || (this.x == null && TextUtils.isEmpty(this.y))) ? false : true)) {
            this.a.g3.O(true);
        }
    }

    public final boolean a0() {
        TLRPC.GeoPoint geoPoint;
        if (((this.x == null && TextUtils.isEmpty(this.y)) ? false : true) != (this.w != null)) {
            return true;
        }
        boolean z10 = (this.x == null && TextUtils.isEmpty(this.y)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.w;
        if (z10 != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.y, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.x;
        boolean z11 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w;
        if (z11 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    public final void b0() {
        if (this.b.y.f) {
            return;
        }
        boolean z10 = this.x == null && TextUtils.isEmpty(this.y);
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.y;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                q2.E.a();
                z0 z0Var = this.e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.E3(i7, z0Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.y;
            if (d2 != null) {
                d2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                d2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = d2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (d2 != null) {
            d2.flags2 &= -3;
            d2.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new y0(this, 0));
        getMessagesStorage().j2(d2, false);
    }

    public final void c0() {
        c51 c51Var;
        if (this.s) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = d2.business_location;
        this.w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.x = tL_businessLocation.geo_point;
            this.y = tL_businessLocation.address;
        } else {
            this.x = null;
            this.y = "";
        }
        z0 z0Var = this.e;
        if (z0Var != null) {
            this.c = true;
            z0Var.setText(this.y);
            z0 z0Var2 = this.e;
            z0Var2.setSelection(z0Var2.getText().length());
            this.c = false;
        }
        d0();
        h51 h51Var = this.a;
        if (h51Var != null && (c51Var = h51Var.g3) != null) {
            c51Var.O(true);
        }
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.N0(2131752686, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 10));
        this.b = this.simpleActionBar.s(gd.N0(2131745750, null));
        int i10 = 0;
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        z0 z0Var = new z0(this, getParentActivity());
        this.e = z0Var;
        z0Var.setTextSize(1, 17.0f);
        t6.D(this.e, m6.H6, null);
        z0 z0Var2 = this.e;
        int i11 = m6.G6;
        t6.U(z0Var2, i11, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        this.e.setGravity((gd.a0 ? 5 : 3) | 48);
        this.e.setInputType(180225);
        this.e.setHint(gd.N0(2131752685, null));
        t6.v(this.e, i11, null);
        this.e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.e.setCursorWidth(1.5f);
        int i12 = 12;
        this.e.addTextChangedListener(new ah.j(this, i12));
        this.e.setFilters(new InputFilter[]{new a1(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, ma.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i13 = m6.d6;
        t6.h(i13, frameLayout3, getResourceProvider());
        z0 z0Var3 = this.e;
        if (z0Var3 != null) {
            this.c = true;
            z0Var3.setText(this.y);
            z0 z0Var4 = this.e;
            z0Var4.setSelection(z0Var4.getText().length());
            this.c = false;
        }
        this.r = new t3(i7, context, this);
        lz c10 = u5.c(0.2f, m6.Gc);
        h6 resourceProvider = getResourceProvider();
        c10.m = i11;
        c10.o = resourceProvider;
        c10.t = true;
        c10.k = this.r.getImageReceiver();
        eq eqVar = new eq(c10);
        this.n = eqVar;
        eqVar.setCallback(this.r);
        t6.h(i13, this.r, getResourceProvider());
        this.h = new b1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, ma.c(-1.0f, -1));
        this.f.addView(this.h, ma.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        h51 h51Var = new h51(this, new d7(this, i12), new x0(this, i10), null);
        this.a = h51Var;
        h51Var.r1();
        this.a.setSectionsDrawBackground(true);
        h51 h51Var2 = this.a;
        h51Var2.g3.r = false;
        frameLayout.addView(h51Var2, ma.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        t3 t3Var;
        b1 b1Var = this.h;
        if (b1Var == null || (t3Var = this.r) == null) {
            return;
        }
        if (this.x == null) {
            t3Var.setImageBitmap(null);
            return;
        }
        b1Var.setAlpha(0.0f);
        this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
        int measuredWidth = this.r.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x : this.r.getMeasuredWidth();
        float f10 = org.telegram.messenger.g0.p;
        int i7 = (int) (measuredWidth / f10);
        int min = Math.min(2, (int) Math.ceil(f10));
        t3 t3Var2 = this.r;
        TLRPC.GeoPoint geoPoint = this.x;
        t3Var2.p(fc.p(h20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * ks.P3, 15, min)), e2.i(i7, "_240"), this.n, null);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.E0) {
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        int i7 = 1;
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!a0() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = gd.N0(2131743592, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.N0(2131752678, null);
            alertDialog$Builder.k(gd.N0(2131754213, null), new x0(this, i7));
            alertDialog$Builder.h(gd.N0(2131747386, null), new x0(this, 2));
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
