package kg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.c4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a1 extends f2 implements ls {
    public boolean D;
    public int E;
    public boolean F;
    public q41 a;
    public b5 b;
    public boolean c;
    public FrameLayout d;
    public x0 e;
    public FrameLayout f;
    public z0 h;
    public np n;
    public c4 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public a1() {
        super(null);
        this.E = -4;
    }

    public final void Z(boolean z9) {
        if (this.b == null) {
            return;
        }
        this.b.a(a0(), z9);
        q41 q41Var = this.a;
        if (q41Var == null || q41Var.f3 == null) {
            return;
        }
        if (this.F != ((this.w == null || (this.x == null && TextUtils.isEmpty(this.y))) ? false : true)) {
            this.a.f3.O(true);
        }
    }

    public final boolean a0() {
        TLRPC.GeoPoint geoPoint;
        if (((this.x == null && TextUtils.isEmpty(this.y)) ? false : true) != (this.w != null)) {
            return true;
        }
        boolean z9 = (this.x == null && TextUtils.isEmpty(this.y)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.w;
        if (z9 != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.y, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.x;
        boolean z10 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w;
        if (z10 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    public final void b0() {
        if (this.b.y.f) {
            return;
        }
        boolean z9 = this.x == null && TextUtils.isEmpty(this.y);
        if (!z9) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.y;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                p2.D.a();
                x0 x0Var = this.e;
                int i7 = -this.E;
                this.E = i7;
                org.telegram.messenger.g0.G3(i7, x0Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z9) {
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
            if (b22 != null) {
                b22.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                b22.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = b22.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -3;
            b22.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new w0(this, 0));
        getMessagesStorage().j2(b22, false);
    }

    public final void c0() {
        l41 l41Var;
        if (this.s) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = b22.business_location;
        this.w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.x = tL_businessLocation.geo_point;
            this.y = tL_businessLocation.address;
        } else {
            this.x = null;
            this.y = "";
        }
        x0 x0Var = this.e;
        if (x0Var != null) {
            this.c = true;
            x0Var.setText(this.y);
            x0 x0Var2 = this.e;
            x0Var2.setSelection(x0Var2.getText().length());
            this.c = false;
        }
        d0();
        q41 q41Var = this.a;
        if (q41Var != null && (l41Var = q41Var.f3) != null) {
            l41Var.O(true);
        }
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 15));
        this.b = this.simpleActionBar.n(hd.M0(2131745947, null));
        int i10 = 0;
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, getParentActivity());
        this.e = x0Var;
        x0Var.setTextSize(1, 17.0f);
        r6.E(this.e, k6.H6, null);
        x0 x0Var2 = this.e;
        int i11 = k6.G6;
        r6.V(x0Var2, i11, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        this.e.setGravity((hd.a0 ? 5 : 3) | 48);
        this.e.setInputType(180225);
        this.e.setHint(hd.M0(2131752697, null));
        r6.w(this.e, i11, null);
        this.e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.e.setCursorWidth(1.5f);
        int i12 = 10;
        this.e.addTextChangedListener(new ah.j(this, i12));
        this.e.setFilters(new InputFilter[]{new y0(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, ha.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i13 = k6.d6;
        r6.i(i13, frameLayout3, getResourceProvider());
        x0 x0Var3 = this.e;
        if (x0Var3 != null) {
            this.c = true;
            x0Var3.setText(this.y);
            x0 x0Var4 = this.e;
            x0Var4.setSelection(x0Var4.getText().length());
            this.c = false;
        }
        this.r = new c4(i7, context, this);
        rz c10 = t5.c(0.2f, k6.Dc);
        f6 resourceProvider = getResourceProvider();
        c10.m = i11;
        c10.o = resourceProvider;
        c10.t = true;
        c10.k = this.r.getImageReceiver();
        np npVar = new np(c10);
        this.n = npVar;
        npVar.setCallback(this.r);
        r6.i(i13, this.r, getResourceProvider());
        this.h = new z0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, ha.c(-1.0f, -1));
        this.f.addView(this.h, ha.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        q41 q41Var = new q41(this, new hi.u1(this, i12), new v0(this, i10), null);
        this.a = q41Var;
        q41Var.r1();
        this.a.setSectionsDrawBackground(true);
        q41 q41Var2 = this.a;
        q41Var2.f3.r = false;
        frameLayout.addView(q41Var2, ha.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        c4 c4Var;
        z0 z0Var = this.h;
        if (z0Var == null || (c4Var = this.r) == null) {
            return;
        }
        if (this.x == null) {
            c4Var.setImageBitmap(null);
            return;
        }
        z0Var.setAlpha(0.0f);
        this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
        int measuredWidth = this.r.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x : this.r.getMeasuredWidth();
        float f10 = org.telegram.messenger.g0.p;
        int i7 = (int) (measuredWidth / f10);
        int min = Math.min(2, (int) Math.ceil(f10));
        c4 c4Var2 = this.r;
        TLRPC.GeoPoint geoPoint = this.x;
        c4Var2.p(hc.p(m20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * qs.P3, 15, min)), com.google.android.recaptcha.internal.a.i(i7, "_240"), this.n, null);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.E0) {
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        int i7 = 1;
        boolean z10 = this.x == null && TextUtils.isEmpty(this.y);
        if (!a0() || z10) {
            return super.onBackPressed(z9);
        }
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = hd.M0(2131743836, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = hd.M0(2131752690, null);
            alertDialog$Builder.k(hd.M0(2131754216, null), new v0(this, i7));
            alertDialog$Builder.h(hd.M0(2131747579, null), new v0(this, 2));
            showDialog(u1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
