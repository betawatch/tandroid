package lg;

import ai.g5;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.d4;
import gi.q4;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.p2;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b1 extends d2 implements cs {
    public boolean E;
    public int F;
    public boolean G;
    public l41 a;
    public b5 b;
    public boolean c;
    public FrameLayout d;
    public y0 e;
    public FrameLayout f;
    public a1 h;
    public np n;
    public d4 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public b1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        if (this.b == null) {
            return;
        }
        this.b.a(a0(), z10);
        l41 l41Var = this.a;
        if (l41Var == null || l41Var.g3 == null) {
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
                p2.E.a();
                y0 y0Var = this.e;
                int i3 = -this.F;
                this.F = i3;
                org.telegram.messenger.g0.G3(i3, y0Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
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
        getConnectionsManager().sendRequest(updatebusinesslocation, new x0(this, 0));
        getMessagesStorage().j2(b22, false);
    }

    public final void c0() {
        f41 f41Var;
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
        y0 y0Var = this.e;
        if (y0Var != null) {
            this.c = true;
            y0Var.setText(this.y);
            y0 y0Var2 = this.e;
            y0Var2.setSelection(y0Var2.getText().length());
            this.c = false;
        }
        d0();
        l41 l41Var = this.a;
        if (l41Var != null && (f41Var = l41Var.g3) != null) {
            f41Var.O(true);
        }
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(bd.M0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 16));
        this.b = this.simpleActionBar.n(bd.M0(2131745956, null));
        int i10 = 0;
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        y0 y0Var = new y0(this, getParentActivity());
        this.e = y0Var;
        y0Var.setTextSize(1, 17.0f);
        r6.E(this.e, k6.H6, null);
        y0 y0Var2 = this.e;
        int i11 = k6.G6;
        r6.V(y0Var2, i11, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        this.e.setGravity((bd.a0 ? 5 : 3) | 48);
        this.e.setInputType(180225);
        this.e.setHint(bd.M0(2131752697, null));
        r6.w(this.e, i11, null);
        this.e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new bh.h(this, 10));
        this.e.setFilters(new InputFilter[]{new z0(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, mf.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i12 = k6.d6;
        r6.i(i12, frameLayout3, getResourceProvider());
        y0 y0Var3 = this.e;
        if (y0Var3 != null) {
            this.c = true;
            y0Var3.setText(this.y);
            y0 y0Var4 = this.e;
            y0Var4.setSelection(y0Var4.getText().length());
            this.c = false;
        }
        this.r = new d4(i3, context, this);
        jz c2 = t5.c(0.2f, k6.Dc);
        e6 resourceProvider = getResourceProvider();
        c2.m = i11;
        c2.o = resourceProvider;
        c2.t = true;
        c2.k = this.r.getImageReceiver();
        np npVar = new np(c2);
        this.n = npVar;
        npVar.setCallback(this.r);
        r6.i(i12, this.r, getResourceProvider());
        this.h = new a1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, mf.c(-1.0f, -1));
        this.f.addView(this.h, mf.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        l41 l41Var = new l41(this, new q4(this, 20), new w0(this, i10), null);
        this.a = l41Var;
        l41Var.r1();
        this.a.setSectionsDrawBackground(true);
        l41 l41Var2 = this.a;
        l41Var2.g3.r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        d4 d4Var;
        a1 a1Var = this.h;
        if (a1Var == null || (d4Var = this.r) == null) {
            return;
        }
        if (this.x == null) {
            d4Var.setImageBitmap(null);
            return;
        }
        a1Var.setAlpha(0.0f);
        this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
        int measuredWidth = this.r.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x : this.r.getMeasuredWidth();
        float f10 = org.telegram.messenger.g0.p;
        int i3 = (int) (measuredWidth / f10);
        int min = Math.min(2, (int) Math.ceil(f10));
        d4 d4Var2 = this.r;
        TLRPC.GeoPoint geoPoint = this.x;
        d4Var2.p(ac.p(e20.a(geoPoint.lat, geoPoint._long, 0L, min * i3, min * hs.P3, 15, min)), com.google.android.recaptcha.internal.a.h(i3, "_240"), this.n, null);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.E0) {
            c0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        int i3 = 1;
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!a0() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = bd.M0(2131743845, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131752690, null);
            alertDialog$Builder.k(bd.M0(2131754216, null), new w0(this, i3));
            alertDialog$Builder.h(bd.M0(2131747588, null), new w0(this, 2));
            showDialog(s1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
