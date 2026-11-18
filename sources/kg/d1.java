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
import hi.e7;
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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d1 extends h2 implements fs {
    public boolean E;
    public int F;
    public boolean G;
    public e51 a;
    public d5 b;
    public boolean c;
    public FrameLayout d;
    public a1 e;
    public FrameLayout f;
    public c1 h;
    public cq n;
    public t3 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public d1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        if (this.b == null) {
            return;
        }
        this.b.a(a0(), z10);
        e51 e51Var = this.a;
        if (e51Var == null || e51Var.g3 == null) {
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
                a1 a1Var = this.e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.E3(i7, a1Var, null);
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
        getConnectionsManager().sendRequest(updatebusinesslocation, new z0(this, 0));
        getMessagesStorage().j2(d2, false);
    }

    public final void c0() {
        z41 z41Var;
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
        a1 a1Var = this.e;
        if (a1Var != null) {
            this.c = true;
            a1Var.setText(this.y);
            a1 a1Var2 = this.e;
            a1Var2.setSelection(a1Var2.getText().length());
            this.c = false;
        }
        d0();
        e51 e51Var = this.a;
        if (e51Var != null && (z41Var = e51Var.g3) != null) {
            z41Var.O(true);
        }
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.M0(2131752687, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 10));
        this.b = this.simpleActionBar.s(gd.M0(2131745751, null));
        int i10 = 0;
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a1 a1Var = new a1(this, getParentActivity());
        this.e = a1Var;
        a1Var.setTextSize(1, 17.0f);
        u6.D(this.e, n6.H6, null);
        a1 a1Var2 = this.e;
        int i11 = n6.G6;
        u6.U(a1Var2, i11, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        this.e.setGravity((gd.a0 ? 5 : 3) | 48);
        this.e.setInputType(180225);
        this.e.setHint(gd.M0(2131752686, null));
        u6.v(this.e, i11, null);
        this.e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.e.setCursorWidth(1.5f);
        int i12 = 12;
        this.e.addTextChangedListener(new ah.j(this, i12));
        this.e.setFilters(new InputFilter[]{new b1(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, ma.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i13 = n6.d6;
        u6.h(i13, frameLayout3, getResourceProvider());
        a1 a1Var3 = this.e;
        if (a1Var3 != null) {
            this.c = true;
            a1Var3.setText(this.y);
            a1 a1Var4 = this.e;
            a1Var4.setSelection(a1Var4.getText().length());
            this.c = false;
        }
        this.r = new t3(i7, context, this);
        lz c10 = u5.c(0.2f, n6.Gc);
        i6 resourceProvider = getResourceProvider();
        c10.m = i11;
        c10.o = resourceProvider;
        c10.t = true;
        c10.k = this.r.getImageReceiver();
        cq cqVar = new cq(c10);
        this.n = cqVar;
        cqVar.setCallback(this.r);
        u6.h(i13, this.r, getResourceProvider());
        this.h = new c1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, ma.c(-1.0f, -1));
        this.f.addView(this.h, ma.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        e51 e51Var = new e51(this, new e7(this, i12), new y0(this, i10), null);
        this.a = e51Var;
        e51Var.r1();
        this.a.setSectionsDrawBackground(true);
        e51 e51Var2 = this.a;
        e51Var2.g3.r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        t3 t3Var;
        c1 c1Var = this.h;
        if (c1Var == null || (t3Var = this.r) == null) {
            return;
        }
        if (this.x == null) {
            t3Var.setImageBitmap(null);
            return;
        }
        c1Var.setAlpha(0.0f);
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

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        int i7 = 1;
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!a0() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = gd.M0(2131743598, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131752679, null);
            alertDialog$Builder.k(gd.M0(2131754214, null), new y0(this, i7));
            alertDialog$Builder.h(gd.M0(2131747387, null), new y0(this, 2));
            showDialog(u1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.E0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
