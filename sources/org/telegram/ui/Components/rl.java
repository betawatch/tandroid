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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rl extends li implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.u0 E;
    public final ol F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final ah.x N;
    public final hg.s0 O;
    public final ai.u1 P;
    public final im0 Q;
    public final ll R;
    public final ImageView S;
    public final ig.e0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public final long c0;
    public final Paint d0;
    public final ArrayList e0;
    public AnimatorSet f0;
    public IMapsProvider.IMarker g0;
    public ql h0;
    public FrameLayout i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final ImageView n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public Location q0;
    public final org.telegram.ui.ActionBar.u0 r;
    public Location r0;
    public final pl s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public final LinearLayout v;
    public boolean v0;
    public final ImageView w;
    public boolean w0;
    public final TextView x;
    public ml x0;
    public final TextView y;
    public final int y0;
    public int z0;

    public rl(ti tiVar, Context context, final org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, tiVar);
        int i10;
        this.V = true;
        this.W = false;
        this.a0 = false;
        this.b0 = true;
        this.d0 = new Paint();
        this.e0 = new ArrayList();
        this.j0 = true;
        this.k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ti tiVar2 = this.b;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar2.f0;
        final org.telegram.ui.sn snVar = n2Var instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) n2Var : null;
        long p12 = tiVar2.p1();
        this.c0 = p12;
        if (this.b.O) {
            this.y0 = 7;
        } else if (!z10 || snVar == null || snVar.h != null || snVar.c() || UserObject.isUserSelf(snVar.i())) {
            this.y0 = 0;
        } else {
            this.y0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.l0 = false;
        this.n0 = false;
        hg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.R;
        if (llVar != null) {
            llVar.F();
        }
        this.a0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.y n10 = this.b.a1.n();
        this.F = new ol(this, context);
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 6);
        this.E = a2;
        if (!this.a0 || this.b.O) {
            this.b.getClass();
            i10 = 0;
        } else {
            i10 = 8;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vd, this.a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.x xVar = new ah.x(this, context, 13);
        this.N = xVar;
        xVar.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new ed(org.telegram.ui.ActionBar.h6.B0().q()));
        pl plVar = new pl(context, 0);
        this.s = plVar;
        plVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        plVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.h6.wi;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.h6.xi;
        int w03 = org.telegram.ui.ActionBar.h6.w0(i13, this.a);
        org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.b6.a(plVar);
        plVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ci.n1 n1Var = zf.j0.a;
        plVar.setOutlineProvider(n1Var);
        plVar.setBackground(j02);
        int i14 = org.telegram.ui.ActionBar.h6.vi;
        plVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, this.a));
        plVar.setTextSize(1, 14.0f);
        plVar.setTypeface(AndroidUtilities.bold());
        plVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        plVar.setGravity(17);
        plVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xVar.addView(plVar, w7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 2;
        plVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.b.r.M(null, null);
                        break;
                    case 1:
                        rl.T(this.b);
                        break;
                    default:
                        rl rlVar = this.b;
                        rlVar.g0(false);
                        rlVar.O.H(null, rlVar.r0, true);
                        rlVar.v0 = true;
                        rlVar.f0();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ui, this.a), false, d6Var);
        this.r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), d6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), d6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), d6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.h6.w0(i12, this.a), org.telegram.ui.ActionBar.h6.w0(i13, this.a));
        w7.b6.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(n1Var);
        u0Var.setBackground(i02);
        u0Var.setIcon(R.drawable.msg_map_type);
        xVar.addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 0;
        u0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.b.r.M(null, null);
                        break;
                    case 1:
                        rl.T(this.b);
                        break;
                    default:
                        rl rlVar = this.b;
                        rlVar.g0(false);
                        rlVar.O.H(null, rlVar.r0, true);
                        rlVar.v0 = true;
                        rlVar.f0();
                        break;
                }
            }
        });
        u0Var.setDelegate(new cl(this, i16));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.h6.w0(i12, this.a), org.telegram.ui.ActionBar.h6.w0(i13, this.a));
        w7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(n1Var);
        imageView.setBackground(i03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w04 = org.telegram.ui.ActionBar.h6.w0(i14, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        xVar.addView(imageView, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i17 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.b.r.M(null, null);
                        break;
                    case 1:
                        rl.T(this.b);
                        break;
                    default:
                        rl rlVar = this.b;
                        rlVar.g0(false);
                        rlVar.O.H(null, rlVar.r0, true);
                        rlVar.v0 = true;
                        rlVar.f0();
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
        addView(linearLayout, w7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new di.d(15));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, this.a), mode));
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.x = textView;
        int i18 = org.telegram.ui.ActionBar.h6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, this.a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i19 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.y = i19;
        org.telegram.ui.Cells.c1.q(i18, this.a, i19, 17);
        i19.setTextSize(1, 15.0f);
        i19.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i19, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.u1 u1Var = new ai.u1(this, context, d6Var, 14);
        this.P = u1Var;
        this.c = u1Var;
        this.d = u1Var;
        this.f = true;
        u1Var.setClipToPadding(false);
        hg.s0 s0Var2 = new hg.s0(context, this.y0, p12, true, d6Var, this.b.O, false, false);
        this.O = s0Var2;
        u1Var.setAdapter(s0Var2);
        ti tiVar3 = this.b;
        s0Var2.f0 = tiVar3 != null && (tiVar3.H || tiVar3.P);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.m = false;
        u1Var.setItemAnimator(kVar);
        s0Var2.O(this.a0, this.W);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.p1();
        ig.e0 e0Var = new ig.e0(this, u1Var);
        this.T = e0Var;
        u1Var.setLayoutManager(e0Var);
        addView(u1Var, w7.z5.e(-1, -1, 51));
        u1Var.setOnScrollListener(new kl(this));
        final int i20 = 0;
        u1Var.setOnItemClickListener(new wl0(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.wl0
            public final void a(int i21, View view2) {
                switch (i20) {
                    case 0:
                        rl.Q(this.b, snVar, d6Var, i21);
                        break;
                    default:
                        rl.R(this.b, snVar, d6Var, i21);
                        break;
                }
            }
        });
        cl clVar = new cl(this, 1);
        s0Var2.H = p12;
        s0Var2.y = clVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.z0);
        addView(xVar, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new cl(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new cl(this, 3));
        new Thread(new gl(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        xVar.addView(imageView3, w7.z5.e(28, 48, 49));
        im0 im0Var = new im0(context, d6Var);
        this.Q = im0Var;
        im0Var.setSections(true);
        im0Var.setClipToPadding(false);
        im0Var.setVisibility(8);
        im0Var.setLayoutManager(new s4.b0(1, false));
        ll llVar2 = new ll(this, context, d6Var, this.b.O);
        this.R = llVar2;
        boolean z11 = this.a0;
        if (llVar2.M != z11) {
            llVar2.M = z11;
        }
        cl clVar2 = new cl(this, 7);
        llVar2.H = 0L;
        llVar2.y = clVar2;
        im0Var.setItemAnimator(null);
        addView(im0Var, w7.z5.e(-1, -1, 51));
        im0Var.setOnScrollListener(new ah.d0(this, 26));
        final int i21 = 1;
        im0Var.setOnItemClickListener(new wl0(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.wl0
            public final void a(int i212, View view2) {
                switch (i21) {
                    case 0:
                        rl.Q(this.b, snVar, d6Var, i212);
                        break;
                    default:
                        rl.R(this.b, snVar, d6Var, i212);
                        break;
                }
            }
        });
        i0();
    }

    public static void N(rl rlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        rlVar.H = iMap;
        iMap.setOnMapLoadedCallback(new el(rlVar, 3));
        if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, rlVar.a)) < 0.721f) {
            rlVar.U = true;
            rlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (rlVar.H == null) {
            return;
        }
        Location location = new Location("network");
        rlVar.r0 = location;
        location.setLatitude(20.659322d);
        rlVar.r0.setLongitude(-11.40625d);
        try {
            rlVar.H.setMyLocationEnabled(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        rlVar.H.getUiSettings().setMyLocationButtonEnabled(false);
        rlVar.H.getUiSettings().setZoomControlsEnabled(false);
        rlVar.H.getUiSettings().setCompassEnabled(false);
        rlVar.H.setOnCameraMoveStartedListener(new cl(rlVar, 4));
        rlVar.H.setOnCameraIdleListener(new el(rlVar, 5));
        rlVar.H.setOnMyLocationChangeListener(new il(rlVar, 1));
        rlVar.H.setOnMarkerClickListener(new cl(rlVar, 5));
        rlVar.H.setOnCameraMoveListener(new el(rlVar, 6));
        rlVar.c0();
        AndroidUtilities.runOnUIThread(new el(rlVar, 7), 200L);
        if (rlVar.V && rlVar.getParentActivity() != null) {
            rlVar.V = false;
            Activity parentActivity = rlVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rlVar.getParentActivity(), 0, rlVar.a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L5, rlVar.a), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new cl(rlVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        rlVar.h0();
    }

    public static /* synthetic */ void O(rl rlVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.d6 d6Var, Long l4) {
        if (snVar != null && snVar.c()) {
            f5.L(rlVar.getParentActivity(), snVar.a(), new ai.r2(rlVar, tL_messageMediaGeo, l4, 27), d6Var);
        } else {
            rlVar.x0.b(tL_messageMediaGeo, rlVar.y0, true, 0, l4.longValue());
            rlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void P(rl rlVar) {
        hg.s0 s0Var = rlVar.O;
        ti tiVar = rlVar.b;
        if (rlVar.j0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = rlVar.getParentActivity();
            if (parentActivity != null) {
                rlVar.j0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!tiVar.O || tiVar.z2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    rlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(rlVar.a0, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i10 < 29 || !tiVar.O || tiVar.z2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                rlVar.W = true;
                if (s0Var != null) {
                    s0Var.O(rlVar.a0, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static /* synthetic */ void Q(rl rlVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        rl rlVar2;
        org.telegram.ui.sn snVar2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = rlVar.c0;
        hg.s0 s0Var = rlVar.O;
        ti tiVar = rlVar.b;
        int i11 = rlVar.y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.d0) != null) {
                rlVar.x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.e0) != null) {
                rlVar.x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else {
                rlVar2 = rlVar;
                snVar2 = snVar;
                d6Var2 = d6Var;
            }
        } else {
            if (i10 == 1) {
                if (rlVar.x0 == null || rlVar.r0 == null) {
                    if (rlVar.a0) {
                        f5.C(rlVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = rlVar.i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rlVar.r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rlVar.r0.getLongitude());
                f5.Z(tiVar.M1, tiVar.l1() + 1, tiVar.p1(), new ci.y2(rlVar, snVar, tL_messageMediaGeo, d6Var, 6));
                return;
            }
            rlVar2 = rlVar;
            snVar2 = snVar;
            d6Var2 = d6Var;
            if (i10 == 2 && i11 == 1) {
                if (rlVar2.getLocationController().isSharingLocation(j10)) {
                    rlVar2.getLocationController().removeSharingLocation(j10);
                    tiVar.dismiss(true);
                    return;
                } else if (rlVar2.q0 == null && rlVar2.a0) {
                    f5.C(rlVar2.getParentActivity()).show();
                    return;
                } else {
                    rlVar2.b0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            f5.Z(tiVar.M1, tiVar.l1() + 1, tiVar.p1(), new ci.y2(rlVar2, snVar2, (TLRPC.TL_messageMediaVenue) J, d6Var2, 7));
        }
    }

    public static /* synthetic */ void R(rl rlVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = rlVar.R.I(i10);
        if (I == null || rlVar.x0 == null) {
            return;
        }
        if (snVar != null && snVar.c()) {
            f5.L(rlVar.getParentActivity(), snVar.a(), new hl(rlVar, I, 0), d6Var);
        } else {
            rlVar.x0.b(I, rlVar.y0, true, 0, 0L);
            rlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void S(rl rlVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.d6 d6Var) {
        if (snVar != null && snVar.c()) {
            f5.L(rlVar.getParentActivity(), snVar.a(), new hl(rlVar, tL_messageMediaVenue, 1), d6Var);
        } else {
            rlVar.x0.b(tL_messageMediaVenue, rlVar.y0, true, 0, 0L);
            rlVar.b.dismiss(true);
        }
    }

    public static void T(rl rlVar) {
        hg.s0 s0Var = rlVar.O;
        ImageView imageView = rlVar.n;
        Activity parentActivity = rlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            f5.C(rlVar.getParentActivity()).show();
            return;
        }
        if (rlVar.q0 != null && rlVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.h6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, rlVar.a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            rlVar.u0 = false;
            rlVar.g0(false);
            rlVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rlVar.q0.getLatitude(), rlVar.q0.getLongitude())));
            if (rlVar.v0) {
                Location location = rlVar.q0;
                if (location != null && rlVar.y0 != 8) {
                    s0Var.H(null, location, true);
                }
                rlVar.v0 = false;
                rlVar.f0();
            }
        }
        if (rlVar.g0 != null) {
            rlVar.S.setVisibility(0);
            ol olVar = rlVar.F;
            IMapsProvider.IMarker iMarker = rlVar.g0;
            HashMap hashMap = olVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                olVar.removeView(view);
                hashMap.remove(iMarker);
            }
            rlVar.g0 = null;
            rlVar.h0 = null;
            rlVar.i0 = null;
        }
    }

    public static /* synthetic */ void U(rl rlVar, Location location) {
        int i10;
        ti tiVar = rlVar.b;
        if (tiVar == null || tiVar.f0 == null) {
            return;
        }
        rlVar.d0(location);
        hg.s0 s0Var = rlVar.O;
        if (s0Var != null && (((i10 = rlVar.y0) == 7 || i10 == 8) && !rlVar.u0)) {
            s0Var.L(rlVar.r0);
        }
        rlVar.getLocationController().setMapLocation(location, rlVar.b0);
        rlVar.b0 = false;
    }

    public static /* synthetic */ void V(rl rlVar, IMapsProvider.IMapView iMapView) {
        if (rlVar.I == null || rlVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            rlVar.I.getMapAsync(new il(rlVar, 0));
            rlVar.o0 = true;
            if (rlVar.p0) {
                rlVar.I.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void W(rl rlVar) {
        if (rlVar.getParentActivity() == null) {
            return;
        }
        try {
            rlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.b.f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.b.f0.getMessagesController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.n2 n2Var;
        ti tiVar = this.b;
        if (tiVar == null || (n2Var = tiVar.f0) == null) {
            return null;
        }
        return n2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.f0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.li
    public final void A() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.o0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.p0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int i13;
        ti tiVar = this.b;
        if (tiVar.a1.n0 || tiVar.u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = this.A0 - this.z0;
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i13 = (int) (i11 / 3.5f);
                    i12 = i13 - AndroidUtilities.dp(52.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i13 = (i11 / 5) * 2;
            i12 = i13 - AndroidUtilities.dp(52.0f);
            if (i12 < 0) {
            }
            tiVar.setAllowNestedScroll(true);
        }
        this.P.o1(0, i12, 0, this.e);
        this.Q.o1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.li
    public final void C() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.p0 = true;
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        ti tiVar = this.b;
        tiVar.a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.z0, 51);
            ah.x xVar = this.N;
            xVar.addView(view, 0, e);
            xVar.addView(this.F, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.z0, 51));
            xVar.addView(this.M, 2, w7.z5.c(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Z();
        AndroidUtilities.runOnUIThread(new el(this, 0), tiVar.c2.v() ? 200L : 0L);
        this.T.h1(0, 0);
        h0();
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.P.x0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean L() {
        return !this.a0;
    }

    public final Bitmap Y(int i10) {
        Bitmap[] bitmapArr = this.D0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.t4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    public final void Z() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.I == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int i10 = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int dp = AndroidUtilities.dp(66.0f);
        int i11 = this.y0;
        if (i11 == 1 || i11 == 7 || i11 == 8) {
            dp += AndroidUtilities.dp(66.0f);
        }
        int dp2 = (i10 - dp) - AndroidUtilities.dp(90.0f);
        int dp3 = AndroidUtilities.dp(189.0f);
        this.z0 = dp3;
        if (!this.a0 || !a0()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.A0 = Math.max(dp3, dp2);
        if (this.a0 && a0()) {
            this.z0 = this.A0;
        }
        ai.u1 u1Var = this.P;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        u1Var.setLayoutParams(layoutParams2);
        ah.x xVar = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xVar.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.A0;
        xVar.setLayoutParams(layoutParams3);
        im0 im0Var = this.Q;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) im0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        im0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.a0 && a0()) ? this.z0 - u1Var.getPaddingTop() : this.z0);
        hg.s0 s0Var = this.O;
        s0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
            this.I.getView().setLayoutParams(layoutParams5);
        }
        ol olVar = this.F;
        if (olVar != null && (layoutParams = (FrameLayout.LayoutParams) olVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
            olVar.setLayoutParams(layoutParams);
        }
        s0Var.l();
        h0();
    }

    public final boolean a0() {
        int i10 = this.y0;
        return i10 == 0 || i10 == 1;
    }

    public final void b0() {
        Activity parentActivity;
        if (this.x0 == null || getParentActivity() == null || this.q0 == null) {
            return;
        }
        boolean z10 = this.k0;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.k0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                f5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new el(this, 1), d6Var).o();
                return;
            }
        }
        long j10 = this.c0;
        f5.D(getParentActivity(), false, DialogObject.isUserDialog(j10) ? this.b.f0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.fl
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                rl rlVar = rl.this;
                ti tiVar = rlVar.b;
                f5.Z(tiVar.M1, tiVar.l1() + 1, tiVar.p1(), new ei.e4(rlVar, i10, 4));
            }
        }, d6Var).show();
    }

    public final void c0() {
        rl rlVar;
        ti tiVar = this.b;
        if (!tiVar.O) {
            Location lastLocation = getLastLocation();
            this.q0 = lastLocation;
            d0(lastLocation);
            return;
        }
        if (tiVar.A2 != null) {
            AndroidUtilities.runOnUIThread(new el(this, 2));
            return;
        }
        if (this.a0) {
            AndroidUtilities.runOnUIThread(new el(this, 8));
            return;
        }
        File file = tiVar.z2;
        boolean z10 = tiVar.y2;
        if (file != null) {
            if (!z10) {
                rlVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new ee(16, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                rlVar.q0 = lastLocation2;
                d0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.u7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        rlVar = this;
        Location lastLocation22 = getLastLocation();
        rlVar.q0 = lastLocation22;
        d0(lastLocation22);
    }

    public final void d0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.q0 = location2;
        IMapsProvider.IMap iMap = this.H;
        hg.s0 s0Var = this.O;
        if (iMap == null) {
            s0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (s0Var != null) {
            if (!this.v0 && this.y0 != 8) {
                s0Var.H(null, this.q0, true);
            }
            s0Var.M(this.q0);
        }
        if (this.u0) {
            return;
        }
        this.r0 = new Location(location);
        if (this.w0) {
            this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
        } else {
            this.w0 = true;
            this.H.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        ll llVar = this.R;
        hg.s0 s0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.a0 = false;
            this.W = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.a0, this.W);
            }
            if (llVar != null && llVar.M != (z11 = this.a0)) {
                llVar.M = z11;
            }
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.a0 = true;
            this.W = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (llVar != null && llVar.M != (z10 = this.a0)) {
                llVar.M = z10;
            }
        }
        Z();
        boolean z12 = this.a0;
        ti tiVar = this.b;
        if (!z12 || tiVar.O) {
            tiVar.getClass();
        } else {
            i13 = 8;
        }
        this.E.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        if (this.H == null) {
            return;
        }
        if (d == 0.0d || d10 == 0.0d) {
            Location location = new Location("");
            this.q0 = location;
            location.reset();
            this.q0.setLatitude(d);
            this.q0.setLongitude(d10);
        } else {
            Location location2 = new Location("");
            this.r0 = location2;
            location2.reset();
            this.r0.setLatitude(d);
            this.r0.setLongitude(d10);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom = (d == 0.0d || d10 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f);
        this.J = newCameraUpdateLatLngZoom;
        this.H.moveCamera(newCameraUpdateLatLngZoom);
        hg.s0 s0Var = this.O;
        if (d == 0.0d || d10 == 0.0d) {
            s0Var.M(this.q0);
        } else {
            s0Var.L(this.r0);
        }
        s0Var.I();
        this.P.v0(0, 1, null);
        this.t0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.u0 = true;
        g0(false);
        if (this.y0 != 8) {
            s0Var.H(null, this.r0, true);
        }
        this.v0 = true;
        f0();
    }

    public final void f0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            ai.u1 u1Var = this.P;
            View childAt = u1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            u1Var.v0(0, top, null);
        }
    }

    public final void g0(boolean z10) {
        Location location;
        Location location2;
        if (this.a0) {
            z10 = false;
        }
        pl plVar = this.s;
        if (z10 && plVar != null && plVar.getTag() == null && ((location = this.q0) == null || (location2 = this.r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.y0 == 8) {
            z10 = false;
        }
        if (plVar != null) {
            if (!z10 || plVar.getTag() == null) {
                if (z10 || plVar.getTag() != null) {
                    plVar.setVisibility(z10 ? 0 : 4);
                    plVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(plVar, (Property<pl, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(bs.g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.P;
        if (u1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        sl0 sl0Var = (sl0) u1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (sl0Var != null ? Math.max(((int) sl0Var.a.getY()) - this.C0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.P.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        z6 z6Var = new z6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.h5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.u1 u1Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.E;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var != null ? u0Var.getSearchField() : null, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        int i11 = org.telegram.ui.ActionBar.h6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.ui;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.h6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, z6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.r0, z6Var, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.si));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.pi));
        int i17 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 131072, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        im0 im0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.j6(im0Var, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(im0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(im0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    public final void h0() {
        ah.x xVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I == null || (xVar = this.N) == null) {
            return;
        }
        ai.u1 u1Var = this.P;
        s4.b1 K = u1Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.z0;
        } else {
            i10 = -xVar.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) xVar.getLayoutParams()) != null) {
            ol olVar = this.F;
            if (i11 <= 0) {
                if (this.I.getView().getVisibility() == 0) {
                    this.I.getView().setVisibility(4);
                    xVar.setVisibility(4);
                    if (olVar != null) {
                        olVar.setVisibility(4);
                    }
                }
                this.I.getView().setTranslationY(i10);
                return;
            }
            if (this.I.getView().getVisibility() == 4) {
                this.I.getView().setVisibility(0);
                xVar.setVisibility(0);
                if (olVar != null) {
                    olVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.A0) + this.z0)) / 2);
            int i12 = this.A0 - this.z0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (u1Var.getPaddingTop() - i10) / (u1Var.getPaddingTop() - i12)));
            int i13 = this.B0;
            if (this.a0 && a0()) {
                i12 += Math.min(i10, u1Var.getPaddingTop());
            }
            this.B0 = (int) (i12 * max2);
            float f7 = max;
            this.I.getView().setTranslationY(f7);
            this.C0 = i12 - this.B0;
            xVar.invalidate();
            xVar.setTranslationY(i10 - this.C0);
            IMapsProvider.IMap iMap2 = this.H;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.B0);
            }
            if (olVar != null) {
                olVar.setTranslationY(f7);
            }
            int max3 = Math.max(this.C0 - i10, 0);
            int i14 = this.A0;
            org.telegram.ui.ActionBar.u0 u0Var = this.r;
            float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            u0Var.setTranslationY(min);
            pl plVar = this.s;
            plVar.c = min;
            plVar.setTranslationY(min + plVar.b);
            this.n.setTranslationY(-this.B0);
            int D = org.telegram.messenger.lk.D(48.0f, (this.A0 - this.B0) / 2, max);
            this.s0 = D;
            this.S.setTranslationY(D);
            if (i13 != this.B0) {
                IMapsProvider.IMarker iMarker = this.g0;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.g0.getPosition().longitude);
                } else if (!this.u0 || (location = this.r0) == null) {
                    Location location2 = this.q0;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.q0.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.r0.getLongitude());
                }
                if (latLng != null && (iMap = this.H) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.a0 && a0()) {
                int h = this.O.h();
                for (int i15 = 1; i15 < h; i15++) {
                    s4.b1 K2 = u1Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(u1Var.getPaddingTop() - i10);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    public final void i0() {
        boolean z10 = this.l0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.n0;
        im0 im0Var = this.Q;
        if (!z11) {
            im0Var.setEmptyView(linearLayout);
        } else {
            im0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.G = true;
        ah.x xVar = this.N;
        if (xVar != null) {
            xVar.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.I;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.I;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.I = null;
            }
        } catch (Exception unused2) {
        }
        hg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.R;
        if (llVar != null) {
            llVar.F();
        }
        ti tiVar = this.b;
        tiVar.a1.h(true);
        tiVar.a1.n().removeView(this.E);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Z();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean p() {
        o();
        return false;
    }

    public void setDelegate(ml mlVar) {
        this.x0 = mlVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        h0();
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        this.E.setVisibility(8);
    }

    @Override // org.telegram.ui.Components.li
    public final void y() {
        ti tiVar = this.b;
        this.O.c0 = (tiVar == null || tiVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.li
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.O.c0 = false;
        }
    }
}
