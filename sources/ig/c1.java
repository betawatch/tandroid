package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ci.j4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.oq;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public boolean F;
    public int G;
    public boolean H;
    public j71 a;
    public as b;
    public eq c;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean e;
    public FrameLayout f;
    public z0 h;
    public FrameLayout n;
    public b1 r;
    public oq s;
    public j4 v;
    public boolean w;
    public TLRPC.TL_businessLocation x;
    public TLRPC.GeoPoint y;

    public c1() {
        super(null);
        this.G = -4;
    }

    public final void U(boolean z10) {
        if (this.d == null) {
            return;
        }
        boolean V = V();
        this.d.setEnabled(V);
        if (z10) {
            this.d.animate().alpha(V ? 1.0f : 0.0f).scaleX(V ? 1.0f : 0.0f).scaleY(V ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.d.setAlpha(V ? 1.0f : 0.0f);
            this.d.setScaleX(V ? 1.0f : 0.0f);
            this.d.setScaleY(V ? 1.0f : 0.0f);
        }
        j71 j71Var = this.a;
        if (j71Var == null || j71Var.Z2 == null) {
            return;
        }
        if (this.H != ((this.x == null || (this.y == null && TextUtils.isEmpty(this.E))) ? false : true)) {
            this.a.Z2.N(true);
        }
    }

    public final boolean V() {
        TLRPC.GeoPoint geoPoint;
        if (((this.y == null && TextUtils.isEmpty(this.E)) ? false : true) != (this.x != null)) {
            return true;
        }
        boolean z10 = (this.y == null && TextUtils.isEmpty(this.E)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.x;
        if (z10 != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.E, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.y;
        boolean z11 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.x;
        if (z11 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    public final void W() {
        if (this.b.c > 0.0f) {
            return;
        }
        boolean z10 = this.y == null && TextUtils.isEmpty(this.E);
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.E;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                z0 z0Var = this.h;
                int i10 = -this.G;
                this.G = i10;
                AndroidUtilities.shakeViewSpring(z0Var, i10);
                return;
            }
        }
        this.b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.y != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.y;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.E;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.E;
                if (this.y != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.y;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new y0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        b71 b71Var;
        if (this.w) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.x = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.y = tL_businessLocation.geo_point;
            this.E = tL_businessLocation.address;
        } else {
            this.y = null;
            this.E = "";
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            this.e = true;
            z0Var.setText(this.E);
            z0 z0Var2 = this.h;
            z0Var2.setSelection(z0Var2.getText().length());
            this.e = false;
        }
        Y();
        j71 j71Var = this.a;
        if (j71Var != null && (b71Var = j71Var.Z2) != null) {
            b71Var.N(true);
        }
        this.w = true;
    }

    public final void Y() {
        j4 j4Var;
        b1 b1Var = this.r;
        if (b1Var == null || (j4Var = this.v) == null) {
            return;
        }
        if (this.y == null) {
            j4Var.setImageBitmap(null);
            return;
        }
        b1Var.setAlpha(0.0f);
        this.r.setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.v.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.v.getMeasuredWidth();
        float f7 = AndroidUtilities.density;
        int i10 = (int) (measuredWidth / f7);
        int min = Math.min(2, (int) Math.ceil(f7));
        j4 j4Var2 = this.v;
        TLRPC.GeoPoint geoPoint = this.y;
        j4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.m(i10, "_240"), this.s, null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 15));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = k6.v8;
        r6.z(kVar, mutate, i11, null, PorterDuff.Mode.MULTIPLY);
        int i12 = 0;
        eq eqVar = new eq(k6.x0(null, i11, false));
        this.c = eqVar;
        this.b = new as(mutate, eqVar);
        this.d = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        z0 z0Var = new z0(this, getParentActivity());
        this.h = z0Var;
        z0Var.setTextSize(1, 17.0f);
        r6.F(this.h, k6.H6, null);
        z0 z0Var2 = this.h;
        int i13 = k6.G6;
        r6.W(z0Var2, i13, null);
        this.h.setBackgroundDrawable(null);
        this.h.setMaxLines(5);
        this.h.setSingleLine(false);
        this.h.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        this.h.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.h.setInputType(180225);
        this.h.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        r6.x(this.h, i13, null);
        this.h.setCursorSize(AndroidUtilities.dp(19.0f));
        this.h.setCursorWidth(1.5f);
        this.h.addTextChangedListener(new ai.u(this, 4));
        this.h.setFilters(new InputFilter[]{new a1()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f = frameLayout2;
        frameLayout2.addView(this.h, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f;
        int i14 = k6.d6;
        r6.i(i14, frameLayout3, getResourceProvider());
        z0 z0Var3 = this.h;
        if (z0Var3 != null) {
            this.e = true;
            z0Var3.setText(this.E);
            z0 z0Var4 = this.h;
            z0Var4.setSelection(z0Var4.getText().length());
            this.e = false;
        }
        this.v = new j4(this, context, i10);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, k6.Pb, 0.2f);
        svgThumb.setColorKey(i13, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.v.getImageReceiver());
        oq oqVar = new oq(svgThumb);
        this.s = oqVar;
        oqVar.setCallback(this.v);
        r6.i(i14, this.v, getResourceProvider());
        this.r = new b1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.n = frameLayout4;
        frameLayout4.addView(this.v, z5.c(-1.0f, -1));
        this.n.addView(this.r, z5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        j71 j71Var = new j71(this, new hg.o(this, 7), new x0(this, i12), null);
        this.a = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.a;
        j71Var2.Z2.r = false;
        frameLayout.addView(j71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !V();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.y == null && TextUtils.isEmpty(this.E);
        if (!V() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new x0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new x0(this, 2));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                eq eqVar = this.c;
                if (eqVar != null) {
                    eqVar.b(k6.x0(null, k6.v8, false));
                    as asVar = this.b;
                    if (asVar != null) {
                        asVar.invalidateSelf();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
