package ag;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.us;
import org.telegram.messenger.v5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.up;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 extends org.telegram.ui.ActionBar.k2 implements us {
    public boolean D;
    public int E;
    public boolean F;
    public u51 a;
    public l5 b;
    public boolean c;
    public FrameLayout d;
    public a2 e;
    public FrameLayout f;
    public e2 h;
    public up n;
    public d2 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public f2() {
        super(null);
        this.E = -4;
    }

    public final void Y(boolean z10) {
        if (this.b == null) {
            return;
        }
        this.b.a(Z(), z10);
        u51 u51Var = this.a;
        if (u51Var == null || u51Var.f3 == null) {
            return;
        }
        if (this.F != ((this.w == null || (this.x == null && TextUtils.isEmpty(this.y))) ? false : true)) {
            this.a.f3.O(true);
        }
    }

    public final boolean Z() {
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

    public final void a0() {
        if (this.b.y.f) {
            return;
        }
        boolean z10 = this.x == null && TextUtils.isEmpty(this.y);
        if (!z10) {
            if (!Z()) {
                finishFragment();
                return;
            }
            String str = this.y;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                org.telegram.messenger.t2.D.a();
                a2 a2Var = this.e;
                int i10 = -this.E;
                this.E = i10;
                org.telegram.messenger.i0.F3(i10, a2Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
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
            if (a2 != null) {
                a2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                a2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = a2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (a2 != null) {
            a2.flags2 &= -3;
            a2.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new z1(this, 0));
        getMessagesStorage().j2(a2, false);
    }

    public final void b0() {
        p51 p51Var;
        if (this.s) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = a2.business_location;
        this.w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.x = tL_businessLocation.geo_point;
            this.y = tL_businessLocation.address;
        } else {
            this.x = null;
            this.y = "";
        }
        a2 a2Var = this.e;
        if (a2Var != null) {
            this.c = true;
            a2Var.setText(this.y);
            a2 a2Var2 = this.e;
            a2Var2.setSelection(a2Var2.getText().length());
            this.c = false;
        }
        c0();
        u51 u51Var = this.a;
        if (u51Var != null && (p51Var = u51Var.f3) != null) {
            p51Var.O(true);
        }
        this.s = true;
    }

    public final void c0() {
        d2 d2Var;
        e2 e2Var = this.h;
        if (e2Var == null || (d2Var = this.r) == null) {
            return;
        }
        if (this.x == null) {
            d2Var.setImageBitmap(null);
            return;
        }
        e2Var.setAlpha(0.0f);
        this.h.setTranslationY(-org.telegram.messenger.i0.L(12.0f));
        int measuredWidth = this.r.getMeasuredWidth() <= 0 ? org.telegram.messenger.i0.q.x : this.r.getMeasuredWidth();
        float f7 = org.telegram.messenger.i0.p;
        int i10 = (int) (measuredWidth / f7);
        int min = Math.min(2, (int) Math.ceil(f7));
        d2 d2Var2 = this.r;
        TLRPC.GeoPoint geoPoint = this.x;
        d2Var2.p(ic.p(b30.a(geoPoint.lat, geoPoint._long, 0L, min * i10, min * zs.P3, 15, min)), a1.g.k(i10, "_240"), this.n, null);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(cd.L0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 4));
        this.b = this.simpleActionBar.n(cd.L0(2131745963, null));
        int i10 = 0;
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a2 a2Var = new a2(this, getParentActivity());
        this.e = a2Var;
        a2Var.setTextSize(1, 17.0f);
        a7.E(this.e, t6.H6, null);
        a2 a2Var2 = this.e;
        int i11 = t6.G6;
        a7.V(a2Var2, i11, null);
        this.e.setBackgroundDrawable(null);
        int i12 = 5;
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        this.e.setGravity((cd.X ? 5 : 3) | 48);
        this.e.setInputType(180225);
        this.e.setHint(cd.L0(2131752697, null));
        a7.w(this.e, i11, null);
        this.e.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new a1(this, 2));
        this.e.setFilters(new InputFilter[]{new b2(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, b6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i13 = t6.d6;
        a7.i(i13, frameLayout3, getResourceProvider());
        a2 a2Var3 = this.e;
        if (a2Var3 != null) {
            this.c = true;
            a2Var3.setText(this.y);
            a2 a2Var4 = this.e;
            a2Var4.setSelection(a2Var4.getText().length());
            this.c = false;
        }
        this.r = new d2(this, context, i10);
        c00 c10 = v5.c(0.2f, t6.Dc);
        p6 resourceProvider = getResourceProvider();
        c10.m = i11;
        c10.o = resourceProvider;
        c10.t = true;
        c10.k = this.r.getImageReceiver();
        up upVar = new up(c10);
        this.n = upVar;
        upVar.setCallback(this.r);
        a7.i(i13, this.r, getResourceProvider());
        this.h = new e2(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, b6.c(-1.0f, -1));
        this.f.addView(this.h, b6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        c0();
        u51 u51Var = new u51(this, new a(this, i12), new y1(this, i10), null);
        this.a = u51Var;
        u51Var.r1();
        this.a.setSectionsDrawBackground(true);
        u51 u51Var2 = this.a;
        u51Var2.f3.r = false;
        frameLayout.addView(u51Var2, b6.c(-1.0f, -1));
        b0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.E0) {
            b0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Z();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        int i10 = 1;
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!Z() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = cd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131752690, null);
            alertDialog$Builder.k(cd.L0(2131754216, null), new y1(this, i10));
            alertDialog$Builder.h(cd.L0(2131747596, null), new y1(this, 2));
            showDialog(x1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
