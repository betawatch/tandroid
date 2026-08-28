package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xk extends ci implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int A0 = 0;
    public final org.telegram.ui.ActionBar.w0 A;
    public final uk B;
    public boolean C;
    public IMapsProvider.IMap D;
    public IMapsProvider.IMapView E;
    public IMapsProvider.ICameraUpdate F;
    public float G;
    public boolean H;
    public final View I;
    public final fh.d2 J;
    public final of.p0 K;
    public final gh.f1 L;
    public final wk0 M;
    public final rk N;
    public final ImageView O;
    public final dj P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final long V;
    public final Paint W;
    public final ArrayList a0;
    public AnimatorSet b0;
    public IMapsProvider.IMarker c0;
    public wk d0;
    public FrameLayout e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public Location m0;
    public final ImageView n;
    public Location n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final org.telegram.ui.ActionBar.w0 r;
    public boolean r0;
    public final vk s;
    public boolean s0;
    public sk t0;
    public final int u0;
    public final LinearLayout v;
    public int v0;
    public final ImageView w;
    public int w0;
    public final TextView x;
    public int x0;
    public final TextView y;
    public int y0;
    public final Bitmap[] z0;

    public xk(ki kiVar, Context context, final org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, kiVar);
        int i9;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = true;
        this.W = new Paint();
        this.a0 = new ArrayList();
        this.f0 = true;
        this.g0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.v0 = currentActionBarHeight;
        this.w0 = currentActionBarHeight;
        this.z0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ki kiVar2 = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar2.b0;
        final org.telegram.ui.qn qnVar = o2Var instanceof org.telegram.ui.qn ? (org.telegram.ui.qn) o2Var : null;
        long n12 = kiVar2.n1();
        this.V = n12;
        if (this.b.K) {
            this.u0 = 7;
        } else if (!z10 || qnVar == null || qnVar.h != null || qnVar.c() || UserObject.isUserSelf(qnVar.i())) {
            this.u0 = 0;
        } else {
            this.u0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.i0 = false;
        this.h0 = false;
        this.j0 = false;
        of.p0 p0Var = this.K;
        if (p0Var != null) {
            p0Var.F();
        }
        rk rkVar = this.N;
        if (rkVar != null) {
            rkVar.F();
        }
        this.T = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        this.B = new uk(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.cb(this, 5);
        this.A = a2;
        if (!this.T || this.b.K) {
            this.b.getClass();
            i9 = 0;
        } else {
            i9 = 8;
        }
        a2.setVisibility(i9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vd, this.a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        fh.d2 d2Var = new fh.d2(this, context, 12);
        this.J = d2Var;
        d2Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new vc(org.telegram.ui.ActionBar.f6.A0().q()));
        vk vkVar = new vk(context, 0);
        this.s = vkVar;
        vkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        vkVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i11 = org.telegram.ui.ActionBar.f6.wi;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i11, this.a);
        int i12 = org.telegram.ui.ActionBar.f6.xi;
        int v03 = org.telegram.ui.ActionBar.f6.v0(i12, this.a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, v03, v03);
        g7.g6.a(vkVar);
        vkVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        bg.q1 q1Var = ff.r0.a;
        vkVar.setOutlineProvider(q1Var);
        vkVar.setBackground(i02);
        int i13 = org.telegram.ui.ActionBar.f6.vi;
        vkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.a));
        vkVar.setTextSize(1, 14.0f);
        vkVar.setTypeface(AndroidUtilities.bold());
        vkVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        vkVar.setGravity(17);
        vkVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        d2Var.addView(vkVar, g7.e6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i14 = 1;
        vkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jk
            public final /* synthetic */ xk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        xk.P(this.b);
                        break;
                    case 1:
                        xk xkVar = this.b;
                        xkVar.c0(false);
                        xkVar.K.H(null, xkVar.n0, true);
                        xkVar.r0 = true;
                        xkVar.b0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ui, this.a), false, b6Var);
        this.r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), b6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), b6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), b6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.f6.v0(i11, this.a), org.telegram.ui.ActionBar.f6.v0(i12, this.a));
        g7.g6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(q1Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        d2Var.addView(w0Var, g7.e6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i15 = 2;
        w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jk
            public final /* synthetic */ xk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        xk.P(this.b);
                        break;
                    case 1:
                        xk xkVar = this.b;
                        xkVar.c0(false);
                        xkVar.K.H(null, xkVar.n0, true);
                        xkVar.r0 = true;
                        xkVar.b0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        w0Var.setDelegate(new ik(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.f6.v0(i11, this.a), org.telegram.ui.ActionBar.f6.v0(i12, this.a));
        g7.g6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(q1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.f6.v0(i13, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i13));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        d2Var.addView(imageView, g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i16 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jk
            public final /* synthetic */ xk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        xk.P(this.b);
                        break;
                    case 1:
                        xk xkVar = this.b;
                        xkVar.c0(false);
                        xkVar.K.H(null, xkVar.n0, true);
                        xkVar.r0 = true;
                        xkVar.b0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, g7.e6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new jh.d(15));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, this.a), mode));
        linearLayout.addView(imageView2, g7.e6.n(-2, -2));
        TextView textView = new TextView(context);
        this.x = textView;
        int i17 = org.telegram.ui.ActionBar.f6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i17, this.a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.y = h;
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i17, this.a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, g7.e6.t(-2, -2, 17, 0, 6, 0, 0));
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 13);
        this.L = f1Var;
        this.c = f1Var;
        this.d = f1Var;
        this.f = true;
        f1Var.setClipToPadding(false);
        of.p0 p0Var2 = new of.p0(context, this.u0, n12, true, b6Var, this.b.K, false, false);
        this.K = p0Var2;
        f1Var.setAdapter(p0Var2);
        ki kiVar3 = this.b;
        p0Var2.b0 = kiVar3 != null && (kiVar3.D || kiVar3.L);
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.C = false;
        nVar.m = false;
        f1Var.setItemAnimator(nVar);
        p0Var2.O(this.T, this.S);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.p1();
        dj djVar = new dj(this, f1Var);
        this.P = djVar;
        f1Var.setLayoutManager(djVar);
        addView(f1Var, g7.e6.e(-1, -1, 51));
        f1Var.setOnScrollListener(new qk(this));
        final int i18 = 0;
        f1Var.setOnItemClickListener(new mk0(this) { // from class: org.telegram.ui.Components.kk
            public final /* synthetic */ xk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.mk0
            public final void a(int i19, View view2) {
                switch (i18) {
                    case 0:
                        xk.M(this.b, qnVar, b6Var, i19);
                        break;
                    default:
                        xk.N(this.b, qnVar, b6Var, i19);
                        break;
                }
            }
        });
        ik ikVar = new ik(this, 1);
        p0Var2.D = n12;
        p0Var2.y = ikVar;
        p0Var2.P(AndroidUtilities.dp(16.0f) + this.v0);
        addView(d2Var, g7.e6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.E = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new ik(this, 2));
        this.E.setOnInterceptTouchEventInterceptor(new ik(this, 3));
        new Thread(new mk(this, this.E, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        d2Var.addView(imageView3, g7.e6.e(28, 48, 49));
        wk0 wk0Var = new wk0(context, b6Var);
        this.M = wk0Var;
        wk0Var.setSections(true);
        wk0Var.setClipToPadding(false);
        wk0Var.setVisibility(8);
        wk0Var.setLayoutManager(new f2.m0(1, false));
        rk rkVar2 = new rk(this, context, b6Var, this.b.K);
        this.N = rkVar2;
        boolean z11 = this.T;
        if (rkVar2.I != z11) {
            rkVar2.I = z11;
        }
        ik ikVar2 = new ik(this, 7);
        rkVar2.D = 0L;
        rkVar2.y = ikVar2;
        wk0Var.setItemAnimator(null);
        addView(wk0Var, g7.e6.e(-1, -1, 51));
        wk0Var.setOnScrollListener(new bg.o2(this, 28));
        final int i19 = 1;
        wk0Var.setOnItemClickListener(new mk0(this) { // from class: org.telegram.ui.Components.kk
            public final /* synthetic */ xk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.mk0
            public final void a(int i192, View view2) {
                switch (i19) {
                    case 0:
                        xk.M(this.b, qnVar, b6Var, i192);
                        break;
                    default:
                        xk.N(this.b, qnVar, b6Var, i192);
                        break;
                }
            }
        });
        e0();
    }

    public static void J(xk xkVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        xkVar.D = iMap;
        iMap.setOnMapLoadedCallback(new hk(xkVar, 3));
        if (org.telegram.ui.ActionBar.f6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, xkVar.a)) < 0.721f) {
            xkVar.Q = true;
            xkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (xkVar.D == null) {
            return;
        }
        Location location = new Location("network");
        xkVar.n0 = location;
        location.setLatitude(20.659322d);
        xkVar.n0.setLongitude(-11.40625d);
        try {
            xkVar.D.setMyLocationEnabled(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        xkVar.D.getUiSettings().setMyLocationButtonEnabled(false);
        xkVar.D.getUiSettings().setZoomControlsEnabled(false);
        xkVar.D.getUiSettings().setCompassEnabled(false);
        xkVar.D.setOnCameraMoveStartedListener(new ik(xkVar, 4));
        xkVar.D.setOnCameraIdleListener(new hk(xkVar, 5));
        xkVar.D.setOnMyLocationChangeListener(new ok(xkVar, 1));
        xkVar.D.setOnMarkerClickListener(new ik(xkVar, 5));
        xkVar.D.setOnCameraMoveListener(new hk(xkVar, 6));
        xkVar.Y();
        AndroidUtilities.runOnUIThread(new hk(xkVar, 7), 200L);
        if (xkVar.R && xkVar.getParentActivity() != null) {
            xkVar.R = false;
            Activity parentActivity = xkVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xkVar.getParentActivity(), 0, xkVar.a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L5, xkVar.a), null);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new ik(xkVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        xkVar.d0();
    }

    public static /* synthetic */ void K(xk xkVar, org.telegram.ui.qn qnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.b6 b6Var, Long l10) {
        if (qnVar != null && qnVar.c()) {
            y4.M(xkVar.getParentActivity(), qnVar.a(), new androidx.car.app.utils.a(xkVar, tL_messageMediaGeo, l10, 24), b6Var);
        } else {
            xkVar.t0.d(tL_messageMediaGeo, xkVar.u0, true, 0, l10.longValue());
            xkVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void L(xk xkVar) {
        int i9;
        Activity parentActivity;
        of.p0 p0Var = xkVar.K;
        ki kiVar = xkVar.b;
        if (!xkVar.f0 || (i9 = Build.VERSION.SDK_INT) < 23 || (parentActivity = xkVar.getParentActivity()) == null) {
            return;
        }
        xkVar.f0 = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            String[] strArr = (!kiVar.K || kiVar.s2 == null || i9 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            xkVar.S = true;
            if (p0Var != null) {
                p0Var.O(xkVar.T, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i9 < 29 || !kiVar.K || kiVar.s2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        xkVar.S = true;
        if (p0Var != null) {
            p0Var.O(xkVar.T, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public static /* synthetic */ void M(xk xkVar, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        xk xkVar2;
        org.telegram.ui.qn qnVar2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = xkVar.V;
        of.p0 p0Var = xkVar.K;
        ki kiVar = xkVar.b;
        int i10 = xkVar.u0;
        if (i10 == 7) {
            if (i9 == 1 && (tL_messageMediaVenue2 = p0Var.Z) != null) {
                xkVar.t0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                kiVar.dismiss(true);
                return;
            } else if (i9 == 2 && (tL_messageMediaVenue = p0Var.a0) != null) {
                xkVar.t0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                kiVar.dismiss(true);
                return;
            } else {
                xkVar2 = xkVar;
                qnVar2 = qnVar;
                b6Var2 = b6Var;
            }
        } else {
            if (i9 == 1) {
                if (xkVar.t0 == null || xkVar.n0 == null) {
                    if (xkVar.T) {
                        y4.D(xkVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = xkVar.e0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(xkVar.n0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(xkVar.n0.getLongitude());
                y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new bg.j1(xkVar, qnVar, tL_messageMediaGeo, b6Var, 7));
                return;
            }
            xkVar2 = xkVar;
            qnVar2 = qnVar;
            b6Var2 = b6Var;
            if (i9 == 2 && i10 == 1) {
                if (xkVar2.getLocationController().isSharingLocation(j10)) {
                    xkVar2.getLocationController().removeSharingLocation(j10);
                    kiVar.dismiss(true);
                    return;
                } else if (xkVar2.m0 == null && xkVar2.T) {
                    y4.D(xkVar2.getParentActivity()).show();
                    return;
                } else {
                    xkVar2.X();
                    return;
                }
            }
        }
        Object J = p0Var.J(i9);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new bg.j1(xkVar2, qnVar2, (TLRPC.TL_messageMediaVenue) J, b6Var2, 8));
        }
    }

    public static /* synthetic */ void N(xk xkVar, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        TLRPC.TL_messageMediaVenue I = xkVar.N.I(i9);
        if (I == null || xkVar.t0 == null) {
            return;
        }
        if (qnVar != null && qnVar.c()) {
            y4.M(xkVar.getParentActivity(), qnVar.a(), new nk(xkVar, I, 0), b6Var);
        } else {
            xkVar.t0.d(I, xkVar.u0, true, 0, 0L);
            xkVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void O(xk xkVar, org.telegram.ui.qn qnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.b6 b6Var) {
        if (qnVar != null && qnVar.c()) {
            y4.M(xkVar.getParentActivity(), qnVar.a(), new nk(xkVar, tL_messageMediaVenue, 1), b6Var);
        } else {
            xkVar.t0.d(tL_messageMediaVenue, xkVar.u0, true, 0, 0L);
            xkVar.b.dismiss(true);
        }
    }

    public static void P(xk xkVar) {
        Activity parentActivity;
        of.p0 p0Var = xkVar.K;
        ImageView imageView = xkVar.n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = xkVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            y4.D(xkVar.getParentActivity()).show();
            return;
        }
        if (xkVar.m0 != null && xkVar.D != null) {
            int i9 = org.telegram.ui.ActionBar.f6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, xkVar.a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i9));
            p0Var.L(null);
            xkVar.q0 = false;
            xkVar.c0(false);
            xkVar.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(xkVar.m0.getLatitude(), xkVar.m0.getLongitude())));
            if (xkVar.r0) {
                Location location = xkVar.m0;
                if (location != null && xkVar.u0 != 8) {
                    p0Var.H(null, location, true);
                }
                xkVar.r0 = false;
                xkVar.b0();
            }
        }
        if (xkVar.c0 != null) {
            xkVar.O.setVisibility(0);
            uk ukVar = xkVar.B;
            IMapsProvider.IMarker iMarker = xkVar.c0;
            HashMap hashMap = ukVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                ukVar.removeView(view);
                hashMap.remove(iMarker);
            }
            xkVar.c0 = null;
            xkVar.d0 = null;
            xkVar.e0 = null;
        }
    }

    public static /* synthetic */ void Q(xk xkVar, Location location) {
        int i9;
        ki kiVar = xkVar.b;
        if (kiVar == null || kiVar.b0 == null) {
            return;
        }
        xkVar.Z(location);
        of.p0 p0Var = xkVar.K;
        if (p0Var != null && (((i9 = xkVar.u0) == 7 || i9 == 8) && !xkVar.q0)) {
            p0Var.L(xkVar.n0);
        }
        xkVar.getLocationController().setMapLocation(location, xkVar.U);
        xkVar.U = false;
    }

    public static /* synthetic */ void R(xk xkVar, IMapsProvider.IMapView iMapView) {
        if (xkVar.E == null || xkVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            xkVar.E.getMapAsync(new ok(xkVar, 0));
            xkVar.k0 = true;
            if (xkVar.l0) {
                xkVar.E.onResume();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static /* synthetic */ void S(xk xkVar) {
        if (xkVar.getParentActivity() == null) {
            return;
        }
        try {
            xkVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                return location;
            }
        }
        return location;
    }

    private LocationController getLocationController() {
        return this.b.b0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.b.b0.getMessagesController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.o2 o2Var;
        ki kiVar = this.b;
        if (kiVar == null || (o2Var = kiVar.b0) == null) {
            return null;
        }
        return o2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.b0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        ki kiVar = this.b;
        kiVar.T0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.E.getView().getParent() == null) {
            View view = this.E.getView();
            FrameLayout.LayoutParams e10 = g7.e6.e(-1, AndroidUtilities.dp(10.0f) + this.v0, 51);
            fh.d2 d2Var = this.J;
            d2Var.addView(view, 0, e10);
            d2Var.addView(this.B, 1, g7.e6.e(-1, AndroidUtilities.dp(10.0f) + this.v0, 51));
            d2Var.addView(this.I, 2, g7.e6.c(-1.0f, -1));
        }
        this.A.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.l0 = true;
        IMapsProvider.IMap iMap = this.D;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        V();
        AndroidUtilities.runOnUIThread(new hk(this, 1), kiVar.V1.j() ? 200L : 0L);
        this.P.h1(0, 0);
        d0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.L.x0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean I() {
        return !this.T;
    }

    public final Bitmap U(int i9) {
        Bitmap[] bitmapArr = this.z0;
        Bitmap bitmap = bitmapArr[i9 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.u4.a(i9));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i9 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final void V() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.E == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int i9 = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int dp = AndroidUtilities.dp(66.0f);
        int i10 = this.u0;
        if (i10 == 1 || i10 == 7 || i10 == 8) {
            dp += AndroidUtilities.dp(66.0f);
        }
        int dp2 = (i9 - dp) - AndroidUtilities.dp(90.0f);
        int dp3 = AndroidUtilities.dp(189.0f);
        this.v0 = dp3;
        if (!this.T || !W()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.w0 = Math.max(dp3, dp2);
        if (this.T && W()) {
            this.v0 = this.w0;
        }
        gh.f1 f1Var = this.L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        f1Var.setLayoutParams(layoutParams2);
        fh.d2 d2Var = this.J;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.w0;
        d2Var.setLayoutParams(layoutParams3);
        wk0 wk0Var = this.M;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wk0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        wk0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.T && W()) ? this.v0 - f1Var.getPaddingTop() : this.v0);
        of.p0 p0Var = this.K;
        p0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.E.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.w0;
            this.E.getView().setLayoutParams(layoutParams5);
        }
        uk ukVar = this.B;
        if (ukVar != null && (layoutParams = (FrameLayout.LayoutParams) ukVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.w0;
            ukVar.setLayoutParams(layoutParams);
        }
        p0Var.l();
        d0();
    }

    public final boolean W() {
        int i9 = this.u0;
        return i9 == 0 || i9 == 1;
    }

    public final void X() {
        Activity parentActivity;
        if (this.t0 == null || getParentActivity() == null || this.m0 == null) {
            return;
        }
        boolean z10 = this.g0;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.g0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                y4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new hk(this, 2), b6Var).o();
                return;
            }
        }
        long j10 = this.V;
        y4.E(getParentActivity(), false, DialogObject.isUserDialog(j10) ? this.b.b0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.lk
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i9) {
                xk xkVar = xk.this;
                ki kiVar = xkVar.b;
                y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new kh.p6(xkVar, i9, 2));
            }
        }, b6Var).show();
    }

    public final void Y() {
        xk xkVar;
        ki kiVar = this.b;
        if (!kiVar.K) {
            Location lastLocation = getLastLocation();
            this.m0 = lastLocation;
            Z(lastLocation);
            return;
        }
        if (kiVar.t2 != null) {
            AndroidUtilities.runOnUIThread(new hk(this, 0));
            return;
        }
        if (this.T) {
            AndroidUtilities.runOnUIThread(new hk(this, 8));
            return;
        }
        File file = kiVar.s2;
        boolean z10 = kiVar.r2;
        if (file != null) {
            if (!z10) {
                xkVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(22, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                xkVar.m0 = lastLocation2;
                Z(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.t7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        xkVar = this;
        Location lastLocation22 = getLastLocation();
        xkVar.m0 = lastLocation22;
        Z(lastLocation22);
    }

    public final void Z(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.m0 = location2;
        IMapsProvider.IMap iMap = this.D;
        of.p0 p0Var = this.K;
        if (iMap == null) {
            p0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (p0Var != null) {
            if (!this.r0 && this.u0 != 8) {
                p0Var.H(null, this.m0, true);
            }
            p0Var.M(this.m0);
        }
        if (this.q0) {
            return;
        }
        this.n0 = new Location(location);
        if (this.s0) {
            this.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
        } else {
            this.s0 = true;
            this.D.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f));
        }
    }

    public final void a0(double d, double d9) {
        if (this.D == null) {
            return;
        }
        if (d == 0.0d || d9 == 0.0d) {
            Location location = new Location("");
            this.m0 = location;
            location.reset();
            this.m0.setLatitude(d);
            this.m0.setLongitude(d9);
        } else {
            Location location2 = new Location("");
            this.n0 = location2;
            location2.reset();
            this.n0.setLatitude(d);
            this.n0.setLongitude(d9);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d9);
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom = (d == 0.0d || d9 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f);
        this.F = newCameraUpdateLatLngZoom;
        this.D.moveCamera(newCameraUpdateLatLngZoom);
        of.p0 p0Var = this.K;
        if (d == 0.0d || d9 == 0.0d) {
            p0Var.M(this.m0);
        } else {
            p0Var.L(this.n0);
        }
        p0Var.I();
        this.L.v0(0, 1, null);
        this.p0 = true;
        if (d == 0.0d || d9 == 0.0d) {
            return;
        }
        this.q0 = true;
        c0(false);
        if (this.u0 != 8) {
            p0Var.H(null, this.n0, true);
        }
        this.r0 = true;
        b0();
    }

    public final void b0() {
        if (this.K.h() != 0 && this.P.L0() == 0) {
            gh.f1 f1Var = this.L;
            View childAt = f1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            f1Var.v0(0, top, null);
        }
    }

    public final void c0(boolean z10) {
        Location location;
        Location location2;
        if (this.T) {
            z10 = false;
        }
        vk vkVar = this.s;
        if (z10 && vkVar != null && vkVar.getTag() == null && ((location = this.m0) == null || (location2 = this.n0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.u0 == 8) {
            z10 = false;
        }
        if (vkVar != null) {
            if (!z10 || vkVar.getTag() == null) {
                if (z10 || vkVar.getTag() != null) {
                    vkVar.setVisibility(z10 ? 0 : 4);
                    vkVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(vkVar, (Property<vk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(gr.g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void d0() {
        fh.d2 d2Var;
        int i9;
        int i10;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.E == null || (d2Var = this.J) == null) {
            return;
        }
        gh.f1 f1Var = this.L;
        f2.q1 K = f1Var.K(0);
        if (K != null) {
            i9 = (int) K.a.getY();
            i10 = Math.min(i9, 0) + this.v0;
        } else {
            i9 = -d2Var.getMeasuredHeight();
            i10 = 0;
        }
        if (((FrameLayout.LayoutParams) d2Var.getLayoutParams()) != null) {
            uk ukVar = this.B;
            if (i10 <= 0) {
                if (this.E.getView().getVisibility() == 0) {
                    this.E.getView().setVisibility(4);
                    d2Var.setVisibility(4);
                    if (ukVar != null) {
                        ukVar.setVisibility(4);
                    }
                }
                this.E.getView().setTranslationY(i9);
                return;
            }
            if (this.E.getView().getVisibility() == 4) {
                this.E.getView().setVisibility(0);
                d2Var.setVisibility(0);
                if (ukVar != null) {
                    ukVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i9 - this.w0) + this.v0)) / 2);
            int i11 = this.w0 - this.v0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (f1Var.getPaddingTop() - i9) / (f1Var.getPaddingTop() - i11)));
            int i12 = this.x0;
            if (this.T && W()) {
                i11 += Math.min(i9, f1Var.getPaddingTop());
            }
            this.x0 = (int) (i11 * max2);
            float f10 = max;
            this.E.getView().setTranslationY(f10);
            this.y0 = i11 - this.x0;
            d2Var.invalidate();
            d2Var.setTranslationY(i9 - this.y0);
            IMapsProvider.IMap iMap2 = this.D;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.x0);
            }
            if (ukVar != null) {
                ukVar.setTranslationY(f10);
            }
            int max3 = Math.max(this.y0 - i9, 0);
            int i13 = this.w0;
            org.telegram.ui.ActionBar.w0 w0Var = this.r;
            float min = Math.min(max3, (i13 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            w0Var.setTranslationY(min);
            vk vkVar = this.s;
            vkVar.c = min;
            vkVar.setTranslationY(min + vkVar.b);
            this.n.setTranslationY(-this.x0);
            int D = org.telegram.messenger.ll.D(48.0f, (this.w0 - this.x0) / 2, max);
            this.o0 = D;
            this.O.setTranslationY(D);
            if (i12 != this.x0) {
                IMapsProvider.IMarker iMarker = this.c0;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.c0.getPosition().longitude);
                } else if (!this.q0 || (location = this.n0) == null) {
                    Location location2 = this.m0;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.m0.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.n0.getLongitude());
                }
                if (latLng != null && (iMap = this.D) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.T && W()) {
                int h = this.K.h();
                for (int i14 = 1; i14 < h; i14++) {
                    f2.q1 K2 = f1Var.K(i14);
                    if (K2 != null) {
                        K2.a.setTranslationY(f1Var.getPaddingTop() - i9);
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        boolean z11;
        int i11 = NotificationCenter.locationPermissionGranted;
        rk rkVar = this.N;
        of.p0 p0Var = this.K;
        int i12 = 0;
        if (i9 == i11) {
            this.T = false;
            this.S = false;
            Y();
            if (p0Var != null) {
                p0Var.O(this.T, this.S);
            }
            if (rkVar != null && rkVar.I != (z11 = this.T)) {
                rkVar.I = z11;
            }
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i9 == NotificationCenter.locationPermissionDenied) {
            this.T = true;
            this.S = false;
            if (p0Var != null) {
                p0Var.O(true, false);
            }
            if (rkVar != null && rkVar.I != (z10 = this.T)) {
                rkVar.I = z10;
            }
        }
        V();
        boolean z12 = this.T;
        ki kiVar = this.b;
        if (!z12 || kiVar.K) {
            kiVar.getClass();
        } else {
            i12 = 8;
        }
        this.A.setVisibility(i12);
    }

    public final void e0() {
        boolean z10 = this.h0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.j0;
        wk0 wk0Var = this.M;
        if (!z11) {
            wk0Var.setEmptyView(linearLayout);
        } else {
            wk0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        gh.f1 f1Var = this.L;
        if (f1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ik0 ik0Var = (ik0) f1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (ik0Var != null ? Math.max(((int) ik0Var.a.getY()) - this.y0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.L.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        s6 s6Var = new s6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.h5));
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        gh.f1 f1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32768, null, null, null, null, i9));
        org.telegram.ui.ActionBar.w0 w0Var = this.A;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        int i10 = org.telegram.ui.ActionBar.f6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.y, 4, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.ui;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 262152, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.f6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 32, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 65568, null, null, null, null, i15));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 32, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 65568, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 32, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 65568, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.r0, s6Var, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.si));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.pi));
        int i16 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i16));
        wk0 wk0Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.C = true;
        fh.d2 d2Var = this.J;
        if (d2Var != null) {
            d2Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.E;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.E;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.E = null;
            }
        } catch (Exception unused2) {
        }
        of.p0 p0Var = this.K;
        if (p0Var != null) {
            p0Var.F();
        }
        rk rkVar = this.N;
        if (rkVar != null) {
            rkVar.F();
        }
        ki kiVar = this.b;
        kiVar.T0.h(true);
        kiVar.T0.n().removeView(this.A);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean n() {
        m();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (z10) {
            V();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void r() {
        this.A.setVisibility(8);
    }

    public void setDelegate(sk skVar) {
        this.t0 = skVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        d0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void v() {
        ki kiVar = this.b;
        this.K.Y = (kiVar == null || kiVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i9, boolean z10) {
        if (z10) {
            this.K.Y = false;
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void x() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.k0) {
            try {
                iMapView.onPause();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.l0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int i11;
        int i12;
        ki kiVar = this.b;
        if (kiVar.T0.j0 || kiVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i11 = this.w0 - this.v0;
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i10 / 3.5f);
                    i11 = i12 - AndroidUtilities.dp(52.0f);
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i10 / 5) * 2;
            i11 = i12 - AndroidUtilities.dp(52.0f);
            if (i11 < 0) {
            }
            kiVar.setAllowNestedScroll(true);
        }
        this.L.o1(0, i11, 0, this.e);
        this.M.o1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ci
    public final void z() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.l0 = true;
    }
}
