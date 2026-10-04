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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jl extends pi implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.v0 E;
    public final gl F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final ai.f0 N;
    public final gg.t0 O;
    public final ai.w0 P;
    public final zl0 Q;
    public final dl R;
    public final ImageView S;
    public final hg.e0 T;
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
    public il h0;
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
    public final org.telegram.ui.ActionBar.v0 r;
    public Location r0;
    public final hl s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public final LinearLayout v;
    public boolean v0;
    public final ImageView w;
    public boolean w0;
    public final TextView x;
    public el x0;
    public final TextView y;
    public final int y0;
    public int z0;

    public jl(xi xiVar, Context context, final org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, xiVar);
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
        xi xiVar2 = this.b;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar2.f0;
        final org.telegram.ui.yn ynVar = n2Var instanceof org.telegram.ui.yn ? (org.telegram.ui.yn) n2Var : null;
        long l1 = xiVar2.l1();
        this.c0 = l1;
        if (this.b.O) {
            this.y0 = 7;
        } else if (!z10 || ynVar == null || ynVar.h != null || ynVar.c() || UserObject.isUserSelf(ynVar.i())) {
            this.y0 = 0;
        } else {
            this.y0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.l0 = false;
        this.n0 = false;
        gg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        dl dlVar = this.R;
        if (dlVar != null) {
            dlVar.F();
        }
        this.a0 = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        this.F = new gl(this, context);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 7);
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
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vd, this.a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ai.f0 f0Var = new ai.f0(this, context, 9);
        this.N = f0Var;
        f0Var.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new fd(org.telegram.ui.ActionBar.i6.A0().q()));
        hl hlVar = new hl(context, 0);
        this.s = hlVar;
        hlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        hlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.i6.wi;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.i6.xi;
        int v03 = org.telegram.ui.ActionBar.i6.v0(i13, this.a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, v02, v03, v03);
        w7.b6.a(hlVar);
        hlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ai.k2 k2Var = yf.f0.a;
        hlVar.setOutlineProvider(k2Var);
        hlVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        hlVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, this.a));
        hlVar.setTextSize(1, 14.0f);
        hlVar.setTypeface(AndroidUtilities.bold());
        hlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        hlVar.setGravity(17);
        hlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        f0Var.addView(hlVar, w7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 1;
        hlVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ jl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        jl.O(this.b);
                        break;
                    case 1:
                        jl jlVar = this.b;
                        jlVar.d0(false);
                        jlVar.O.H(null, jlVar.r0, true);
                        jlVar.v0 = true;
                        jlVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, this.a), false, d6Var);
        this.r = v0Var;
        v0Var.setClickable(true);
        v0Var.setSubMenuOpenSide(2);
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        v0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), d6Var);
        v0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), d6Var);
        v0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), d6Var);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.v0(i12, this.a), org.telegram.ui.ActionBar.i6.v0(i13, this.a));
        w7.b6.a(v0Var);
        v0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        v0Var.setOutlineProvider(k2Var);
        v0Var.setBackground(h02);
        v0Var.setIcon(R.drawable.msg_map_type);
        f0Var.addView(v0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 2;
        v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ jl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        jl.O(this.b);
                        break;
                    case 1:
                        jl jlVar = this.b;
                        jlVar.d0(false);
                        jlVar.O.H(null, jlVar.r0, true);
                        jlVar.v0 = true;
                        jlVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        v0Var.setDelegate(new uk(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.v0(i12, this.a), org.telegram.ui.ActionBar.i6.v0(i13, this.a));
        w7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(k2Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.i6.v0(i14, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        f0Var.addView(imageView, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk
            public final /* synthetic */ jl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        jl.O(this.b);
                        break;
                    case 1:
                        jl jlVar = this.b;
                        jlVar.d0(false);
                        jlVar.O.H(null, jlVar.r0, true);
                        jlVar.v0 = true;
                        jlVar.c0();
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
        addView(linearLayout, w7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(15));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, this.a), mode));
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.x = textView;
        int i18 = org.telegram.ui.ActionBar.i6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, this.a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.y = h;
        h.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, this.a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 13);
        this.P = w0Var;
        setBlur3Capture(w0Var);
        this.d = w0Var;
        this.f = true;
        w0Var.setClipToPadding(false);
        gg.t0 t0Var2 = new gg.t0(context, this.y0, l1, true, d6Var, this.b.O, false, false);
        this.O = t0Var2;
        w0Var.setAdapter(t0Var2);
        xi xiVar3 = this.b;
        t0Var2.f0 = xiVar3 != null && (xiVar3.H || xiVar3.P);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(tr.h);
        jVar.C = false;
        jVar.m = false;
        w0Var.setItemAnimator(jVar);
        t0Var2.O(this.a0, this.W);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.s1();
        hg.e0 e0Var = new hg.e0(this, w0Var);
        this.T = e0Var;
        w0Var.setLayoutManager(e0Var);
        addView(w0Var, w7.z5.e(-1, -1, 51));
        w0Var.setOnScrollListener(new cl(this));
        final int i19 = 0;
        w0Var.setOnItemClickListener(new ml0(this) { // from class: org.telegram.ui.Components.wk
            public final /* synthetic */ jl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.ml0
            public final void d(int i20, View view2) {
                switch (i19) {
                    case 0:
                        jl.L(this.b, ynVar, d6Var, i20);
                        break;
                    default:
                        jl.M(this.b, ynVar, d6Var, i20);
                        break;
                }
            }
        });
        uk ukVar = new uk(this, 1);
        t0Var2.H = l1;
        t0Var2.y = ukVar;
        t0Var2.P(AndroidUtilities.dp(16.0f) + this.z0);
        addView(f0Var, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new uk(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new uk(this, 3));
        new Thread(new yk(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        f0Var.addView(imageView3, w7.z5.e(28, 48, 49));
        zl0 zl0Var = new zl0(context, d6Var);
        this.Q = zl0Var;
        zl0Var.setSections(true);
        zl0Var.setClipToPadding(false);
        zl0Var.setVisibility(8);
        zl0Var.setLayoutManager(new s4.c0(1, false));
        dl dlVar2 = new dl(this, context, d6Var, this.b.O);
        this.R = dlVar2;
        boolean z11 = this.a0;
        if (dlVar2.M != z11) {
            dlVar2.M = z11;
        }
        uk ukVar2 = new uk(this, 7);
        dlVar2.H = 0L;
        dlVar2.y = ukVar2;
        zl0Var.setItemAnimator(null);
        addView(zl0Var, w7.z5.e(-1, -1, 51));
        zl0Var.setOnScrollListener(new ai.r(this, 22));
        final int i20 = 1;
        zl0Var.setOnItemClickListener(new ml0(this) { // from class: org.telegram.ui.Components.wk
            public final /* synthetic */ jl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.ml0
            public final void d(int i202, View view2) {
                switch (i20) {
                    case 0:
                        jl.L(this.b, ynVar, d6Var, i202);
                        break;
                    default:
                        jl.M(this.b, ynVar, d6Var, i202);
                        break;
                }
            }
        });
        f0();
    }

    public static void I(jl jlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        jlVar.H = iMap;
        iMap.setOnMapLoadedCallback(new tk(jlVar, 3));
        if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, jlVar.a)) < 0.721f) {
            jlVar.U = true;
            jlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (jlVar.H == null) {
            return;
        }
        Location location = new Location("network");
        jlVar.r0 = location;
        location.setLatitude(20.659322d);
        jlVar.r0.setLongitude(-11.40625d);
        try {
            jlVar.H.setMyLocationEnabled(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        jlVar.H.getUiSettings().setMyLocationButtonEnabled(false);
        jlVar.H.getUiSettings().setZoomControlsEnabled(false);
        jlVar.H.getUiSettings().setCompassEnabled(false);
        jlVar.H.setOnCameraMoveStartedListener(new uk(jlVar, 4));
        jlVar.H.setOnCameraIdleListener(new tk(jlVar, 5));
        jlVar.H.setOnMyLocationChangeListener(new al(jlVar, 1));
        jlVar.H.setOnMarkerClickListener(new uk(jlVar, 5));
        jlVar.H.setOnCameraMoveListener(new tk(jlVar, 6));
        jlVar.Y();
        AndroidUtilities.runOnUIThread(new tk(jlVar, 7), 200L);
        if (jlVar.V && jlVar.getParentActivity() != null) {
            jlVar.V = false;
            Activity parentActivity = jlVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jlVar.getParentActivity(), 0, jlVar.a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L5, jlVar.a), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new uk(jlVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        jlVar.e0();
    }

    public static /* synthetic */ void J(jl jlVar, org.telegram.ui.yn ynVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.d6 d6Var, Long l4) {
        if (ynVar != null && ynVar.c()) {
            e5.M(jlVar.getParentActivity(), ynVar.a(), new ai.q5(jlVar, tL_messageMediaGeo, l4, 25), d6Var);
        } else {
            jlVar.x0.b(tL_messageMediaGeo, jlVar.y0, true, 0, l4.longValue());
            jlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void K(jl jlVar) {
        int i10;
        Activity parentActivity;
        gg.t0 t0Var = jlVar.O;
        xi xiVar = jlVar.b;
        if (!jlVar.j0 || (i10 = Build.VERSION.SDK_INT) < 23 || (parentActivity = jlVar.getParentActivity()) == null) {
            return;
        }
        jlVar.j0 = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            String[] strArr = (!xiVar.O || xiVar.w2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            jlVar.W = true;
            if (t0Var != null) {
                t0Var.O(jlVar.a0, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i10 < 29 || !xiVar.O || xiVar.w2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        jlVar.W = true;
        if (t0Var != null) {
            t0Var.O(jlVar.a0, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public static /* synthetic */ void L(jl jlVar, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        jl jlVar2;
        org.telegram.ui.yn ynVar2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = jlVar.c0;
        gg.t0 t0Var = jlVar.O;
        xi xiVar = jlVar.b;
        int i11 = jlVar.y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = t0Var.d0) != null) {
                jlVar.x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                xiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = t0Var.e0) != null) {
                jlVar.x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                xiVar.dismiss(true);
                return;
            } else {
                jlVar2 = jlVar;
                ynVar2 = ynVar;
                d6Var2 = d6Var;
            }
        } else {
            if (i10 == 1) {
                if (jlVar.x0 == null || jlVar.r0 == null) {
                    if (jlVar.a0) {
                        e5.D(jlVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = jlVar.i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(jlVar.r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(jlVar.r0.getLongitude());
                e5.a0(xiVar.J1, xiVar.h1() + 1, xiVar.l1(), new ai.e4(jlVar, ynVar, tL_messageMediaGeo, d6Var, 6));
                return;
            }
            jlVar2 = jlVar;
            ynVar2 = ynVar;
            d6Var2 = d6Var;
            if (i10 == 2 && i11 == 1) {
                if (jlVar2.getLocationController().isSharingLocation(j3)) {
                    jlVar2.getLocationController().removeSharingLocation(j3);
                    xiVar.dismiss(true);
                    return;
                } else if (jlVar2.q0 == null && jlVar2.a0) {
                    e5.D(jlVar2.getParentActivity()).show();
                    return;
                } else {
                    jlVar2.X();
                    return;
                }
            }
        }
        Object J = t0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            e5.a0(xiVar.J1, xiVar.h1() + 1, xiVar.l1(), new ai.e4(jlVar2, ynVar2, (TLRPC.TL_messageMediaVenue) J, d6Var2, 7));
        }
    }

    public static /* synthetic */ void M(jl jlVar, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = jlVar.R.I(i10);
        if (I == null || jlVar.x0 == null) {
            return;
        }
        if (ynVar != null && ynVar.c()) {
            e5.M(jlVar.getParentActivity(), ynVar.a(), new zk(jlVar, I, 0), d6Var);
        } else {
            jlVar.x0.b(I, jlVar.y0, true, 0, 0L);
            jlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void N(jl jlVar, org.telegram.ui.yn ynVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.d6 d6Var) {
        if (ynVar != null && ynVar.c()) {
            e5.M(jlVar.getParentActivity(), ynVar.a(), new zk(jlVar, tL_messageMediaVenue, 1), d6Var);
        } else {
            jlVar.x0.b(tL_messageMediaVenue, jlVar.y0, true, 0, 0L);
            jlVar.b.dismiss(true);
        }
    }

    public static void O(jl jlVar) {
        Activity parentActivity;
        gg.t0 t0Var = jlVar.O;
        ImageView imageView = jlVar.n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = jlVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            e5.D(jlVar.getParentActivity()).show();
            return;
        }
        if (jlVar.q0 != null && jlVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.i6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, jlVar.a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            t0Var.L(null);
            jlVar.u0 = false;
            jlVar.d0(false);
            jlVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(jlVar.q0.getLatitude(), jlVar.q0.getLongitude())));
            if (jlVar.v0) {
                Location location = jlVar.q0;
                if (location != null && jlVar.y0 != 8) {
                    t0Var.H(null, location, true);
                }
                jlVar.v0 = false;
                jlVar.c0();
            }
        }
        if (jlVar.g0 != null) {
            jlVar.S.setVisibility(0);
            gl glVar = jlVar.F;
            IMapsProvider.IMarker iMarker = jlVar.g0;
            HashMap hashMap = glVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                glVar.removeView(view);
                hashMap.remove(iMarker);
            }
            jlVar.g0 = null;
            jlVar.h0 = null;
            jlVar.i0 = null;
        }
    }

    public static /* synthetic */ void P(jl jlVar, Location location) {
        int i10;
        xi xiVar = jlVar.b;
        if (xiVar == null || xiVar.f0 == null) {
            return;
        }
        jlVar.Z(location);
        gg.t0 t0Var = jlVar.O;
        if (t0Var != null && (((i10 = jlVar.y0) == 7 || i10 == 8) && !jlVar.u0)) {
            t0Var.L(jlVar.r0);
        }
        jlVar.getLocationController().setMapLocation(location, jlVar.b0);
        jlVar.b0 = false;
    }

    public static /* synthetic */ void Q(jl jlVar, IMapsProvider.IMapView iMapView) {
        if (jlVar.I == null || jlVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            jlVar.I.getMapAsync(new al(jlVar, 0));
            jlVar.o0 = true;
            if (jlVar.p0) {
                jlVar.I.onResume();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static /* synthetic */ void R(jl jlVar) {
        if (jlVar.getParentActivity() == null) {
            return;
        }
        try {
            jlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        xi xiVar = this.b;
        if (xiVar == null || (n2Var = xiVar.f0) == null) {
            return null;
        }
        return n2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.f0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.pi
    public final void C(pi piVar) {
        xi xiVar = this.b;
        xiVar.X0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e7 = w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.z0, 51);
            ai.f0 f0Var = this.N;
            f0Var.addView(view, 0, e7);
            f0Var.addView(this.F, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.z0, 51));
            f0Var.addView(this.M, 2, w7.z5.c(-1.0f, -1));
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        U();
        AndroidUtilities.runOnUIThread(new tk(this, 1), xiVar.Z1.a0() ? 200L : 0L);
        this.T.h1(0, 0);
        e0();
    }

    @Override // org.telegram.ui.Components.pi
    public final void E() {
        this.P.y0(0);
    }

    @Override // org.telegram.ui.Components.pi
    public final boolean H() {
        return !this.a0;
    }

    public final Bitmap T(int i10) {
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
            paint.setColor(org.telegram.ui.Cells.u4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    public final void U() {
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
        if (!this.a0 || !W()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.A0 = Math.max(dp3, dp2);
        if (this.a0 && W()) {
            this.z0 = this.A0;
        }
        ai.w0 w0Var = this.P;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        w0Var.setLayoutParams(layoutParams2);
        ai.f0 f0Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) f0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.A0;
        f0Var.setLayoutParams(layoutParams3);
        zl0 zl0Var = this.Q;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) zl0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        zl0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.a0 && W()) ? this.z0 - w0Var.getPaddingTop() : this.z0);
        gg.t0 t0Var = this.O;
        t0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
            this.I.getView().setLayoutParams(layoutParams5);
        }
        gl glVar = this.F;
        if (glVar != null && (layoutParams = (FrameLayout.LayoutParams) glVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
            glVar.setLayoutParams(layoutParams);
        }
        t0Var.l();
        e0();
    }

    public final boolean W() {
        int i10 = this.y0;
        return i10 == 0 || i10 == 1;
    }

    public final void X() {
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
                e5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new tk(this, 2), d6Var).o();
                return;
            }
        }
        long j3 = this.c0;
        e5.E(getParentActivity(), false, DialogObject.isUserDialog(j3) ? this.b.f0.getMessagesController().getUser(Long.valueOf(j3)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.xk
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                jl jlVar = jl.this;
                xi xiVar = jlVar.b;
                e5.a0(xiVar.J1, xiVar.h1() + 1, xiVar.l1(), new ci.l4(jlVar, i10, 4));
            }
        }, d6Var).show();
    }

    public final void Y() {
        jl jlVar;
        xi xiVar = this.b;
        if (!xiVar.O) {
            Location lastLocation = getLastLocation();
            this.q0 = lastLocation;
            Z(lastLocation);
            return;
        }
        if (xiVar.x2 != null) {
            AndroidUtilities.runOnUIThread(new tk(this, 0));
            return;
        }
        if (this.a0) {
            AndroidUtilities.runOnUIThread(new tk(this, 8));
            return;
        }
        File file = xiVar.w2;
        boolean z10 = xiVar.v2;
        if (file != null) {
            if (!z10) {
                jlVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new be(13, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                jlVar.q0 = lastLocation2;
                Z(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.v7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        jlVar = this;
        Location lastLocation22 = getLastLocation();
        jlVar.q0 = lastLocation22;
        Z(lastLocation22);
    }

    public final void Z(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.q0 = location2;
        IMapsProvider.IMap iMap = this.H;
        gg.t0 t0Var = this.O;
        if (iMap == null) {
            t0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (t0Var != null) {
            if (!this.v0 && this.y0 != 8) {
                t0Var.H(null, this.q0, true);
            }
            t0Var.M(this.q0);
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

    public final void b0(double d, double d10) {
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
        gg.t0 t0Var = this.O;
        if (d == 0.0d || d10 == 0.0d) {
            t0Var.M(this.q0);
        } else {
            t0Var.L(this.r0);
        }
        t0Var.I();
        this.P.w0(0, 1, null);
        this.t0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.u0 = true;
        d0(false);
        if (this.y0 != 8) {
            t0Var.H(null, this.r0, true);
        }
        this.v0 = true;
        c0();
    }

    public final void c0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            ai.w0 w0Var = this.P;
            View childAt = w0Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            w0Var.w0(0, top, null);
        }
    }

    public final void d0(boolean z10) {
        Location location;
        Location location2;
        if (this.a0) {
            z10 = false;
        }
        hl hlVar = this.s;
        if (z10 && hlVar != null && hlVar.getTag() == null && ((location = this.q0) == null || (location2 = this.r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.y0 == 8) {
            z10 = false;
        }
        if (hlVar != null) {
            if (!z10 || hlVar.getTag() == null) {
                if (z10 || hlVar.getTag() != null) {
                    hlVar.setVisibility(z10 ? 0 : 4);
                    hlVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hlVar, (Property<hl, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(tr.g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        dl dlVar = this.R;
        gg.t0 t0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.a0 = false;
            this.W = false;
            Y();
            if (t0Var != null) {
                t0Var.O(this.a0, this.W);
            }
            if (dlVar != null && dlVar.M != (z11 = this.a0)) {
                dlVar.M = z11;
            }
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.a0 = true;
            this.W = false;
            if (t0Var != null) {
                t0Var.O(true, false);
            }
            if (dlVar != null && dlVar.M != (z10 = this.a0)) {
                dlVar.M = z10;
            }
        }
        U();
        boolean z12 = this.a0;
        xi xiVar = this.b;
        if (!z12 || xiVar.O) {
            xiVar.getClass();
        } else {
            i13 = 8;
        }
        this.E.setVisibility(i13);
    }

    public final void e0() {
        ai.f0 f0Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I == null || (f0Var = this.N) == null) {
            return;
        }
        ai.w0 w0Var = this.P;
        s4.c1 K = w0Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.z0;
        } else {
            i10 = -f0Var.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) f0Var.getLayoutParams()) != null) {
            gl glVar = this.F;
            if (i11 <= 0) {
                if (this.I.getView().getVisibility() == 0) {
                    this.I.getView().setVisibility(4);
                    f0Var.setVisibility(4);
                    if (glVar != null) {
                        glVar.setVisibility(4);
                    }
                }
                this.I.getView().setTranslationY(i10);
                return;
            }
            if (this.I.getView().getVisibility() == 4) {
                this.I.getView().setVisibility(0);
                f0Var.setVisibility(0);
                if (glVar != null) {
                    glVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.A0) + this.z0)) / 2);
            int i12 = this.A0 - this.z0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (w0Var.getPaddingTop() - i10) / (w0Var.getPaddingTop() - i12)));
            int i13 = this.B0;
            if (this.a0 && W()) {
                i12 += Math.min(i10, w0Var.getPaddingTop());
            }
            this.B0 = (int) (i12 * max2);
            float f7 = max;
            this.I.getView().setTranslationY(f7);
            this.C0 = i12 - this.B0;
            f0Var.invalidate();
            f0Var.setTranslationY(i10 - this.C0);
            IMapsProvider.IMap iMap2 = this.H;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.B0);
            }
            if (glVar != null) {
                glVar.setTranslationY(f7);
            }
            int max3 = Math.max(this.C0 - i10, 0);
            int i14 = this.A0;
            org.telegram.ui.ActionBar.v0 v0Var = this.r;
            float C = org.telegram.messenger.ok.C(80.0f, i14 - v0Var.getMeasuredHeight(), max3);
            v0Var.setTranslationY(C);
            hl hlVar = this.s;
            hlVar.c = C;
            hlVar.setTranslationY(C + hlVar.b);
            this.n.setTranslationY(-this.B0);
            int D = org.telegram.messenger.ok.D(48.0f, (this.A0 - this.B0) / 2, max);
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
            if (this.a0 && W()) {
                int h = this.O.h();
                for (int i15 = 1; i15 < h; i15++) {
                    s4.c1 K2 = w0Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(w0Var.getPaddingTop() - i10);
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.l0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.n0;
        zl0 zl0Var = this.Q;
        if (!z11) {
            zl0Var.setEmptyView(linearLayout);
        } else {
            zl0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.pi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.pi
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.P;
        if (w0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        il0 il0Var = (il0) w0Var.K(0);
        return AndroidUtilities.dp(56.0f) + (il0Var != null ? Math.max(((int) il0Var.a.getY()) - this.C0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.pi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.pi
    public int getListTopPadding() {
        return this.P.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.pi
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        y6 y6Var = new y6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.h5));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        ai.w0 w0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.v0 v0Var = this.E;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        int i11 = org.telegram.ui.ActionBar.i6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.ui;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.i6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.i6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, y6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.r0, y6Var, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.si));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.pi));
        int i17 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        zl0 zl0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(zl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.pi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.pi
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.G = true;
        ai.f0 f0Var = this.N;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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
        gg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        dl dlVar = this.R;
        if (dlVar != null) {
            dlVar.F();
        }
        xi xiVar = this.b;
        xiVar.X0.h(true);
        xiVar.X0.n().removeView(this.E);
    }

    @Override // org.telegram.ui.Components.pi
    public final boolean n() {
        m();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            U();
        }
    }

    @Override // org.telegram.ui.Components.pi
    public final void r() {
        this.E.setVisibility(8);
    }

    public void setDelegate(el elVar) {
        this.x0 = elVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        e0();
    }

    @Override // org.telegram.ui.Components.pi
    public final void v() {
        xi xiVar = this.b;
        this.O.c0 = (xiVar == null || xiVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.pi
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.O.c0 = false;
        }
    }

    @Override // org.telegram.ui.Components.pi
    public final void x() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.o0) {
            try {
                iMapView.onPause();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.p0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.pi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        xi xiVar = this.b;
        if (xiVar.X0.n0 || xiVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = this.A0 - this.z0;
            xiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i13 = (int) (i11 / 3.5f);
                    i12 = i13 - AndroidUtilities.dp(52.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    xiVar.setAllowNestedScroll(true);
                }
            }
            i13 = (i11 / 5) * 2;
            i12 = i13 - AndroidUtilities.dp(52.0f);
            if (i12 < 0) {
            }
            xiVar.setAllowNestedScroll(true);
        }
        this.P.r1(0, i12, 0, this.e);
        this.Q.r1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.pi
    public final void z() {
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
}
