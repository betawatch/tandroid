package jg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import di.k4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d1 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public boolean F;
    public s71 a;
    public u5 b;
    public boolean c;
    public FrameLayout d;
    public a1 e;
    public FrameLayout f;
    public c1 h;
    public qq n;
    public k4 r;
    public boolean s;
    public TLRPC.TL_businessLocation v;
    public TLRPC.GeoPoint w;
    public String x;
    public boolean y;

    public d1() {
        super(null);
        this.E = -4;
    }

    public final void V(boolean z10) {
        if (this.b == null) {
            return;
        }
        this.b.a(W(), z10);
        s71 s71Var = this.a;
        if (s71Var == null || s71Var.g3 == null) {
            return;
        }
        if (this.F != ((this.v == null || (this.w == null && TextUtils.isEmpty(this.x))) ? false : true)) {
            this.a.g3.O(true);
        }
    }

    public final boolean W() {
        TLRPC.GeoPoint geoPoint;
        if (((this.w == null && TextUtils.isEmpty(this.x)) ? false : true) != (this.v != null)) {
            return true;
        }
        boolean z10 = (this.w == null && TextUtils.isEmpty(this.x)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.v;
        if (z10 != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.x, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.w;
        boolean z11 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.v;
        if (z11 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    public final void X() {
        if (this.b.x.f) {
            return;
        }
        boolean z10 = this.w == null && TextUtils.isEmpty(this.x);
        if (!z10) {
            if (!W()) {
                finishFragment();
                return;
            }
            String str = this.x;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                a1 a1Var = this.e;
                int i10 = -this.E;
                this.E = i10;
                AndroidUtilities.shakeViewSpring(a1Var, i10);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.w != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.w;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.x;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.x;
                if (this.w != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.w;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new z0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void Y() {
        k71 k71Var;
        if (this.s) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.v = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.w = tL_businessLocation.geo_point;
            this.x = tL_businessLocation.address;
        } else {
            this.w = null;
            this.x = "";
        }
        a1 a1Var = this.e;
        if (a1Var != null) {
            this.c = true;
            a1Var.setText(this.x);
            a1 a1Var2 = this.e;
            a1Var2.setSelection(a1Var2.getText().length());
            this.c = false;
        }
        Z();
        s71 s71Var = this.a;
        if (s71Var != null && (k71Var = s71Var.g3) != null) {
            k71Var.O(true);
        }
        this.s = true;
    }

    public final void Z() {
        k4 k4Var;
        c1 c1Var = this.h;
        if (c1Var == null || (k4Var = this.r) == null) {
            return;
        }
        if (this.w == null) {
            k4Var.setImageBitmap(null);
            return;
        }
        c1Var.setAlpha(0.0f);
        this.h.setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.r.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.r.getMeasuredWidth();
        float f7 = AndroidUtilities.density;
        int i10 = (int) (measuredWidth / f7);
        int min = Math.min(2, (int) Math.ceil(f7));
        k4 k4Var2 = this.r;
        TLRPC.GeoPoint geoPoint = this.w;
        k4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.m(i10, "_240"), this.n, null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 15));
        this.b = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        int i11 = 0;
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a1 a1Var = new a1(this, getParentActivity());
        this.e = a1Var;
        a1Var.setTextSize(1, 17.0f);
        f7.E(this.e, y6.H6, null);
        a1 a1Var2 = this.e;
        int i12 = y6.G6;
        f7.V(a1Var2, i12, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        this.e.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.e.setInputType(180225);
        this.e.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        f7.w(this.e, i12, null);
        this.e.setCursorSize(AndroidUtilities.dp(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new bi.u(this, 4));
        this.e.setFilters(new InputFilter[]{new b1()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, kb1.h(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i13 = y6.d6;
        f7.i(i13, frameLayout3, getResourceProvider());
        a1 a1Var3 = this.e;
        if (a1Var3 != null) {
            this.c = true;
            a1Var3.setText(this.x);
            a1 a1Var4 = this.e;
            a1Var4.setSelection(a1Var4.getText().length());
            this.c = false;
        }
        this.r = new k4(this, context, i10);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, y6.Pb, 0.2f);
        svgThumb.setColorKey(i12, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.r.getImageReceiver());
        qq qqVar = new qq(svgThumb);
        this.n = qqVar;
        qqVar.setCallback(this.r);
        f7.i(i13, this.r, getResourceProvider());
        this.h = new c1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, kb1.g(-1.0f, -1));
        this.f.addView(this.h, kb1.h(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Z();
        s71 s71Var = new s71(this, new hi.e2(this, 10), new y0(this, i11), null);
        this.a = s71Var;
        s71Var.u1();
        this.a.setSectionsDrawBackground(true);
        s71 s71Var2 = this.a;
        s71Var2.g3.r = false;
        frameLayout.addView(s71Var2, kb1.g(-1.0f, -1));
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            Y();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !W();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.w == null && TextUtils.isEmpty(this.x);
        if (!W() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new y0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new y0(this, 2));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
