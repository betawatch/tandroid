package hg;

import ai.y5;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ci.i2;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zl0;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class e1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public e71 a;
    public sr b;
    public org.telegram.ui.ActionBar.v0 c;
    public boolean d;
    public FrameLayout e;
    public b1 f;
    public FrameLayout h;
    public d1 n;
    public hq r;
    public y5 s;
    public boolean v;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public e1() {
        super(null);
        this.F = -4;
    }

    public final void S(boolean z10) {
        if (this.c == null) {
            return;
        }
        boolean T = T();
        this.c.setEnabled(T);
        if (z10) {
            this.c.animate().alpha(T ? 1.0f : 0.0f).scaleX(T ? 1.0f : 0.0f).scaleY(T ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.c.setAlpha(T ? 1.0f : 0.0f);
            this.c.setScaleX(T ? 1.0f : 0.0f);
            this.c.setScaleY(T ? 1.0f : 0.0f);
        }
        e71 e71Var = this.a;
        if (e71Var == null || e71Var.f3 == null) {
            return;
        }
        if (this.G != ((this.w == null || (this.x == null && TextUtils.isEmpty(this.y))) ? false : true)) {
            this.a.f3.N(true);
        }
    }

    public final boolean T() {
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

    public final void U() {
        if (this.b.c > 0.0f) {
            return;
        }
        boolean z10 = this.x == null && TextUtils.isEmpty(this.y);
        if (!z10) {
            if (!T()) {
                finishFragment();
                return;
            }
            String str = this.y;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                b1 b1Var = this.f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(b1Var, i10);
                return;
            }
        }
        this.b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
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
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new a1(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void W() {
        w61 w61Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.x = tL_businessLocation.geo_point;
            this.y = tL_businessLocation.address;
        } else {
            this.x = null;
            this.y = "";
        }
        b1 b1Var = this.f;
        if (b1Var != null) {
            this.d = true;
            b1Var.setText(this.y);
            b1 b1Var2 = this.f;
            b1Var2.setSelection(b1Var2.getText().length());
            this.d = false;
        }
        X();
        e71 e71Var = this.a;
        if (e71Var != null && (w61Var = e71Var.f3) != null) {
            w61Var.N(true);
        }
        this.v = true;
    }

    public final void X() {
        y5 y5Var;
        d1 d1Var = this.n;
        if (d1Var == null || (y5Var = this.s) == null) {
            return;
        }
        if (this.x == null) {
            y5Var.setImageBitmap(null);
            return;
        }
        d1Var.setAlpha(0.0f);
        this.n.setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.s.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.s.getMeasuredWidth();
        float f7 = AndroidUtilities.density;
        int i10 = (int) (measuredWidth / f7);
        int min = Math.min(2, (int) Math.ceil(f7));
        y5 y5Var2 = this.s;
        TLRPC.GeoPoint geoPoint = this.x;
        y5Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a4.a.n(i10, "_240"), this.r, null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = i6.v8;
        int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.b = new sr(mutate, new wp(i6.w0(null, i11, false)));
        this.c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        S(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b1 b1Var = new b1(this, getParentActivity());
        this.f = b1Var;
        b1Var.setTextSize(1, 17.0f);
        this.f.setHintTextColor(i6.w0(null, i6.H6, false));
        b1 b1Var2 = this.f;
        int i13 = i6.G6;
        b1Var2.setTextColor(i6.w0(null, i13, false));
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(5);
        this.f.setSingleLine(false);
        this.f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        int i14 = 3;
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180225);
        this.f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f.setCursorColor(i6.w0(null, i13, false));
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.addTextChangedListener(new i2(this, i14));
        this.f.setFilters(new InputFilter[]{new c1()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i15 = i6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i15));
        b1 b1Var3 = this.f;
        if (b1Var3 != null) {
            this.d = true;
            b1Var3.setText(this.y);
            b1 b1Var4 = this.f;
            b1Var4.setSelection(b1Var4.getText().length());
            this.d = false;
        }
        this.s = new y5(this, context, i10);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, i6.Pb, 0.2f);
        svgThumb.setColorKey(i13, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.s.getImageReceiver());
        hq hqVar = new hq(svgThumb);
        this.r = hqVar;
        hqVar.setCallback(this.s);
        this.s.setBackgroundColor(getThemedColor(i15));
        this.n = new d1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.s, z5.c(-1.0f, -1));
        this.h.addView(this.n, z5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        X();
        e71 e71Var = new e71(this, new bi.v(this, 26), new z0(this, i12), null);
        this.a = e71Var;
        e71Var.r1();
        this.a.setSectionsDrawBackground(true);
        e71 e71Var2 = this.a;
        e71Var2.f3.r = false;
        frameLayout.addView(e71Var2, z5.c(-1.0f, -1));
        W();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            W();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final zl0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !T();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!T() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new z0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new z0(this, 2));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }
}
