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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gl extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.v0 E;
    public final dl F;
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
    public final ll0 Q;
    public final al R;
    public final ImageView S;
    public final hg.g0 T;
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
    public fl h0;
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
    public final el s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public final LinearLayout v;
    public boolean v0;
    public final ImageView w;
    public boolean w0;
    public final TextView x;
    public bl x0;
    public final TextView y;
    public final int y0;
    public int z0;

    public gl(vi viVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, viVar);
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
        vi viVar2 = this.b;
        org.telegram.ui.ActionBar.n2 n2Var = viVar2.f0;
        final org.telegram.ui.bo boVar = n2Var instanceof org.telegram.ui.bo ? (org.telegram.ui.bo) n2Var : null;
        long n12 = viVar2.n1();
        this.c0 = n12;
        if (this.b.O) {
            this.y0 = 7;
        } else if (!z10 || boVar == null || boVar.h != null || boVar.c() || UserObject.isUserSelf(boVar.i())) {
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
        al alVar = this.R;
        if (alVar != null) {
            alVar.F();
        }
        this.a0 = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z n10 = this.b.X0.n();
        this.F = new dl(this, context);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 6);
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
        view.setBackgroundDrawable(new cd(org.telegram.ui.ActionBar.i6.A0().q()));
        el elVar = new el(context, 0);
        this.s = elVar;
        elVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        elVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.i6.wi;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.i6.xi;
        int v03 = org.telegram.ui.ActionBar.i6.v0(i13, this.a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, v02, v03, v03);
        w7.z5.a(elVar);
        elVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ai.k2 k2Var = yf.i0.a;
        elVar.setOutlineProvider(k2Var);
        elVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        elVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, this.a));
        elVar.setTextSize(1, 14.0f);
        elVar.setTypeface(AndroidUtilities.bold());
        elVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        elVar.setGravity(17);
        elVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        f0Var.addView(elVar, w7.x5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 1;
        elVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk
            public final /* synthetic */ gl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        gl.Q(this.b);
                        break;
                    case 1:
                        gl glVar = this.b;
                        glVar.d0(false);
                        glVar.O.H(null, glVar.r0, true);
                        glVar.v0 = true;
                        glVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, this.a), false, e6Var);
        this.r = v0Var;
        v0Var.setClickable(true);
        v0Var.setSubMenuOpenSide(2);
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        v0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), e6Var);
        v0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), e6Var);
        v0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), e6Var);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.v0(i12, this.a), org.telegram.ui.ActionBar.i6.v0(i13, this.a));
        w7.z5.a(v0Var);
        v0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        v0Var.setOutlineProvider(k2Var);
        v0Var.setBackground(h02);
        v0Var.setIcon(R.drawable.msg_map_type);
        f0Var.addView(v0Var, w7.x5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 2;
        v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk
            public final /* synthetic */ gl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        gl.Q(this.b);
                        break;
                    case 1:
                        gl glVar = this.b;
                        glVar.d0(false);
                        glVar.O.H(null, glVar.r0, true);
                        glVar.v0 = true;
                        glVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        v0Var.setDelegate(new rk(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.v0(i12, this.a), org.telegram.ui.ActionBar.i6.v0(i13, this.a));
        w7.z5.a(imageView);
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
        f0Var.addView(imageView, w7.x5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk
            public final /* synthetic */ gl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        gl.Q(this.b);
                        break;
                    case 1:
                        gl glVar = this.b;
                        glVar.d0(false);
                        glVar.O.H(null, glVar.r0, true);
                        glVar.v0 = true;
                        glVar.c0();
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
        addView(linearLayout, w7.x5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(15));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, this.a), mode));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView = new TextView(context);
        this.x = textView;
        int i18 = org.telegram.ui.ActionBar.i6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, this.a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.y = h;
        h.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, this.a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 13);
        this.P = w0Var;
        this.c = w0Var;
        this.d = w0Var;
        this.f = true;
        w0Var.setClipToPadding(false);
        gg.t0 t0Var2 = new gg.t0(context, this.y0, n12, true, e6Var, this.b.O, false, false);
        this.O = t0Var2;
        w0Var.setAdapter(t0Var2);
        vi viVar3 = this.b;
        t0Var2.f0 = viVar3 != null && (viVar3.H || viVar3.P);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(qr.h);
        jVar.C = false;
        jVar.m = false;
        w0Var.setItemAnimator(jVar);
        t0Var2.O(this.a0, this.W);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.p1();
        hg.g0 g0Var = new hg.g0(this, w0Var);
        this.T = g0Var;
        w0Var.setLayoutManager(g0Var);
        addView(w0Var, w7.x5.e(-1, -1, 51));
        w0Var.setOnScrollListener(new zk(this));
        final int i19 = 0;
        w0Var.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.tk
            public final /* synthetic */ gl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void d(int i20, View view2) {
                switch (i19) {
                    case 0:
                        gl.N(this.b, boVar, e6Var, i20);
                        break;
                    default:
                        gl.O(this.b, boVar, e6Var, i20);
                        break;
                }
            }
        });
        rk rkVar = new rk(this, 1);
        t0Var2.H = n12;
        t0Var2.y = rkVar;
        t0Var2.P(AndroidUtilities.dp(16.0f) + this.z0);
        addView(f0Var, w7.x5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new rk(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new rk(this, 3));
        new Thread(new vk(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        f0Var.addView(imageView3, w7.x5.e(28, 48, 49));
        ll0 ll0Var = new ll0(context, e6Var);
        this.Q = ll0Var;
        ll0Var.setSections(true);
        ll0Var.setClipToPadding(false);
        ll0Var.setVisibility(8);
        ll0Var.setLayoutManager(new s4.c0(1, false));
        al alVar2 = new al(this, context, e6Var, this.b.O);
        this.R = alVar2;
        boolean z11 = this.a0;
        if (alVar2.M != z11) {
            alVar2.M = z11;
        }
        rk rkVar2 = new rk(this, 7);
        alVar2.H = 0L;
        alVar2.y = rkVar2;
        ll0Var.setItemAnimator(null);
        addView(ll0Var, w7.x5.e(-1, -1, 51));
        ll0Var.setOnScrollListener(new ai.r(this, 22));
        final int i20 = 1;
        ll0Var.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.tk
            public final /* synthetic */ gl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void d(int i202, View view2) {
                switch (i20) {
                    case 0:
                        gl.N(this.b, boVar, e6Var, i202);
                        break;
                    default:
                        gl.O(this.b, boVar, e6Var, i202);
                        break;
                }
            }
        });
        f0();
    }

    public static void K(gl glVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        glVar.H = iMap;
        iMap.setOnMapLoadedCallback(new qk(glVar, 3));
        if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, glVar.a)) < 0.721f) {
            glVar.U = true;
            glVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (glVar.H == null) {
            return;
        }
        Location location = new Location("network");
        glVar.r0 = location;
        location.setLatitude(20.659322d);
        glVar.r0.setLongitude(-11.40625d);
        try {
            glVar.H.setMyLocationEnabled(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        glVar.H.getUiSettings().setMyLocationButtonEnabled(false);
        glVar.H.getUiSettings().setZoomControlsEnabled(false);
        glVar.H.getUiSettings().setCompassEnabled(false);
        glVar.H.setOnCameraMoveStartedListener(new rk(glVar, 4));
        glVar.H.setOnCameraIdleListener(new qk(glVar, 5));
        glVar.H.setOnMyLocationChangeListener(new xk(glVar, 1));
        glVar.H.setOnMarkerClickListener(new rk(glVar, 5));
        glVar.H.setOnCameraMoveListener(new qk(glVar, 6));
        glVar.Z();
        AndroidUtilities.runOnUIThread(new qk(glVar, 7), 200L);
        if (glVar.V && glVar.getParentActivity() != null) {
            glVar.V = false;
            Activity parentActivity = glVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(glVar.getParentActivity(), 0, glVar.a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L5, glVar.a), null);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new rk(glVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        glVar.e0();
    }

    public static /* synthetic */ void L(gl glVar, org.telegram.ui.bo boVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l4) {
        if (boVar != null && boVar.c()) {
            c5.M(glVar.getParentActivity(), boVar.a(), new ai.r5(glVar, tL_messageMediaGeo, l4, 25), e6Var);
        } else {
            glVar.x0.b(tL_messageMediaGeo, glVar.y0, true, 0, l4.longValue());
            glVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void M(gl glVar) {
        int i10;
        Activity parentActivity;
        gg.t0 t0Var = glVar.O;
        vi viVar = glVar.b;
        if (!glVar.j0 || (i10 = Build.VERSION.SDK_INT) < 23 || (parentActivity = glVar.getParentActivity()) == null) {
            return;
        }
        glVar.j0 = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            String[] strArr = (!viVar.O || viVar.w2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            glVar.W = true;
            if (t0Var != null) {
                t0Var.O(glVar.a0, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i10 < 29 || !viVar.O || viVar.w2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        glVar.W = true;
        if (t0Var != null) {
            t0Var.O(glVar.a0, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public static /* synthetic */ void N(gl glVar, org.telegram.ui.bo boVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        gl glVar2;
        org.telegram.ui.bo boVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = glVar.c0;
        gg.t0 t0Var = glVar.O;
        vi viVar = glVar.b;
        int i11 = glVar.y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = t0Var.d0) != null) {
                glVar.x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = t0Var.e0) != null) {
                glVar.x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else {
                glVar2 = glVar;
                boVar2 = boVar;
                e6Var2 = e6Var;
            }
        } else {
            if (i10 == 1) {
                if (glVar.x0 == null || glVar.r0 == null) {
                    if (glVar.a0) {
                        c5.D(glVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = glVar.i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(glVar.r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(glVar.r0.getLongitude());
                c5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new ai.e4(glVar, boVar, tL_messageMediaGeo, e6Var, 5));
                return;
            }
            glVar2 = glVar;
            boVar2 = boVar;
            e6Var2 = e6Var;
            if (i10 == 2 && i11 == 1) {
                if (glVar2.getLocationController().isSharingLocation(j3)) {
                    glVar2.getLocationController().removeSharingLocation(j3);
                    viVar.dismiss(true);
                    return;
                } else if (glVar2.q0 == null && glVar2.a0) {
                    c5.D(glVar2.getParentActivity()).show();
                    return;
                } else {
                    glVar2.Y();
                    return;
                }
            }
        }
        Object J = t0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            c5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new ai.e4(glVar2, boVar2, (TLRPC.TL_messageMediaVenue) J, e6Var2, 6));
        }
    }

    public static /* synthetic */ void O(gl glVar, org.telegram.ui.bo boVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = glVar.R.I(i10);
        if (I == null || glVar.x0 == null) {
            return;
        }
        if (boVar != null && boVar.c()) {
            c5.M(glVar.getParentActivity(), boVar.a(), new wk(glVar, I, 0), e6Var);
        } else {
            glVar.x0.b(I, glVar.y0, true, 0, 0L);
            glVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void P(gl glVar, org.telegram.ui.bo boVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (boVar != null && boVar.c()) {
            c5.M(glVar.getParentActivity(), boVar.a(), new wk(glVar, tL_messageMediaVenue, 1), e6Var);
        } else {
            glVar.x0.b(tL_messageMediaVenue, glVar.y0, true, 0, 0L);
            glVar.b.dismiss(true);
        }
    }

    public static void Q(gl glVar) {
        Activity parentActivity;
        gg.t0 t0Var = glVar.O;
        ImageView imageView = glVar.n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = glVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            c5.D(glVar.getParentActivity()).show();
            return;
        }
        if (glVar.q0 != null && glVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.i6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, glVar.a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            t0Var.L(null);
            glVar.u0 = false;
            glVar.d0(false);
            glVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(glVar.q0.getLatitude(), glVar.q0.getLongitude())));
            if (glVar.v0) {
                Location location = glVar.q0;
                if (location != null && glVar.y0 != 8) {
                    t0Var.H(null, location, true);
                }
                glVar.v0 = false;
                glVar.c0();
            }
        }
        if (glVar.g0 != null) {
            glVar.S.setVisibility(0);
            dl dlVar = glVar.F;
            IMapsProvider.IMarker iMarker = glVar.g0;
            HashMap hashMap = dlVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                dlVar.removeView(view);
                hashMap.remove(iMarker);
            }
            glVar.g0 = null;
            glVar.h0 = null;
            glVar.i0 = null;
        }
    }

    public static /* synthetic */ void R(gl glVar, Location location) {
        int i10;
        vi viVar = glVar.b;
        if (viVar == null || viVar.f0 == null) {
            return;
        }
        glVar.a0(location);
        gg.t0 t0Var = glVar.O;
        if (t0Var != null && (((i10 = glVar.y0) == 7 || i10 == 8) && !glVar.u0)) {
            t0Var.L(glVar.r0);
        }
        glVar.getLocationController().setMapLocation(location, glVar.b0);
        glVar.b0 = false;
    }

    public static /* synthetic */ void S(gl glVar, IMapsProvider.IMapView iMapView) {
        if (glVar.I == null || glVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            glVar.I.getMapAsync(new xk(glVar, 0));
            glVar.o0 = true;
            if (glVar.p0) {
                glVar.I.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void T(gl glVar) {
        if (glVar.getParentActivity() == null) {
            return;
        }
        try {
            glVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        vi viVar = this.b;
        if (viVar == null || (n2Var = viVar.f0) == null) {
            return null;
        }
        return n2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.f0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.ni
    public final void E(ni niVar) {
        vi viVar = this.b;
        viVar.X0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.z0, 51);
            ai.f0 f0Var = this.N;
            f0Var.addView(view, 0, e);
            f0Var.addView(this.F, 1, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.z0, 51));
            f0Var.addView(this.M, 2, w7.x5.c(-1.0f, -1));
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
        W();
        AndroidUtilities.runOnUIThread(new qk(this, 1), viVar.Z1.c0() ? 200L : 0L);
        this.T.h1(0, 0);
        e0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.P.x0(0);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean J() {
        return !this.a0;
    }

    public final Bitmap V(int i10) {
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

    public final void W() {
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
        if (!this.a0 || !X()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.A0 = Math.max(dp3, dp2);
        if (this.a0 && X()) {
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
        ll0 ll0Var = this.Q;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ll0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        ll0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.a0 && X()) ? this.z0 - w0Var.getPaddingTop() : this.z0);
        gg.t0 t0Var = this.O;
        t0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
            this.I.getView().setLayoutParams(layoutParams5);
        }
        dl dlVar = this.F;
        if (dlVar != null && (layoutParams = (FrameLayout.LayoutParams) dlVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
            dlVar.setLayoutParams(layoutParams);
        }
        t0Var.l();
        e0();
    }

    public final boolean X() {
        int i10 = this.y0;
        return i10 == 0 || i10 == 1;
    }

    public final void Y() {
        Activity parentActivity;
        if (this.x0 == null || getParentActivity() == null || this.q0 == null) {
            return;
        }
        boolean z10 = this.k0;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.k0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                c5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new qk(this, 2), e6Var).o();
                return;
            }
        }
        long j3 = this.c0;
        c5.E(getParentActivity(), false, DialogObject.isUserDialog(j3) ? this.b.f0.getMessagesController().getUser(Long.valueOf(j3)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.uk
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                gl glVar = gl.this;
                vi viVar = glVar.b;
                c5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new ci.b7(glVar, i10, 3));
            }
        }, e6Var).show();
    }

    public final void Z() {
        gl glVar;
        vi viVar = this.b;
        if (!viVar.O) {
            Location lastLocation = getLastLocation();
            this.q0 = lastLocation;
            a0(lastLocation);
            return;
        }
        if (viVar.x2 != null) {
            AndroidUtilities.runOnUIThread(new qk(this, 0));
            return;
        }
        if (this.a0) {
            AndroidUtilities.runOnUIThread(new qk(this, 8));
            return;
        }
        File file = viVar.w2;
        boolean z10 = viVar.v2;
        if (file != null) {
            if (!z10) {
                glVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new oh(10, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                glVar.q0 = lastLocation2;
                a0(lastLocation2);
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
        glVar = this;
        Location lastLocation22 = getLastLocation();
        glVar.q0 = lastLocation22;
        a0(lastLocation22);
    }

    public final void a0(Location location) {
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
        this.P.v0(0, 1, null);
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
            w0Var.v0(0, top, null);
        }
    }

    public final void d0(boolean z10) {
        Location location;
        Location location2;
        if (this.a0) {
            z10 = false;
        }
        el elVar = this.s;
        if (z10 && elVar != null && elVar.getTag() == null && ((location = this.q0) == null || (location2 = this.r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.y0 == 8) {
            z10 = false;
        }
        if (elVar != null) {
            if (!z10 || elVar.getTag() == null) {
                if (z10 || elVar.getTag() != null) {
                    elVar.setVisibility(z10 ? 0 : 4);
                    elVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(elVar, (Property<el, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(qr.g);
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
        al alVar = this.R;
        gg.t0 t0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.a0 = false;
            this.W = false;
            Z();
            if (t0Var != null) {
                t0Var.O(this.a0, this.W);
            }
            if (alVar != null && alVar.M != (z11 = this.a0)) {
                alVar.M = z11;
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
            if (t0Var != null) {
                t0Var.O(true, false);
            }
            if (alVar != null && alVar.M != (z10 = this.a0)) {
                alVar.M = z10;
            }
        }
        W();
        boolean z12 = this.a0;
        vi viVar = this.b;
        if (!z12 || viVar.O) {
            viVar.getClass();
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
            dl dlVar = this.F;
            if (i11 <= 0) {
                if (this.I.getView().getVisibility() == 0) {
                    this.I.getView().setVisibility(4);
                    f0Var.setVisibility(4);
                    if (dlVar != null) {
                        dlVar.setVisibility(4);
                    }
                }
                this.I.getView().setTranslationY(i10);
                return;
            }
            if (this.I.getView().getVisibility() == 4) {
                this.I.getView().setVisibility(0);
                f0Var.setVisibility(0);
                if (dlVar != null) {
                    dlVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.A0) + this.z0)) / 2);
            int i12 = this.A0 - this.z0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (w0Var.getPaddingTop() - i10) / (w0Var.getPaddingTop() - i12)));
            int i13 = this.B0;
            if (this.a0 && X()) {
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
            if (dlVar != null) {
                dlVar.setTranslationY(f7);
            }
            int max3 = Math.max(this.C0 - i10, 0);
            int i14 = this.A0;
            org.telegram.ui.ActionBar.v0 v0Var = this.r;
            float min = Math.min(max3, (i14 - v0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            v0Var.setTranslationY(min);
            el elVar = this.s;
            elVar.c = min;
            elVar.setTranslationY(min + elVar.b);
            this.n.setTranslationY(-this.B0);
            int D = org.telegram.messenger.vl.D(48.0f, (this.A0 - this.B0) / 2, max);
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
            if (this.a0 && X()) {
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
        ll0 ll0Var = this.Q;
        if (!z11) {
            ll0Var.setEmptyView(linearLayout);
        } else {
            ll0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.P;
        if (w0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        vk0 vk0Var = (vk0) w0Var.K(0);
        return AndroidUtilities.dp(56.0f) + (vk0Var != null ? Math.max(((int) vk0Var.a.getY()) - this.C0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return this.P.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ni
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        w6 w6Var = new w6(this, 2);
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, w6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.r0, w6Var, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, w6Var, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.si));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.pi));
        int i17 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.i6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.i6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        ll0 ll0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.k6(ll0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(ll0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(ll0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
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

    @Override // org.telegram.ui.Components.ni
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ni
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
        gg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        al alVar = this.R;
        if (alVar != null) {
            alVar.F();
        }
        vi viVar = this.b;
        viVar.X0.h(true);
        viVar.X0.n().removeView(this.E);
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean n() {
        m();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            W();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void r() {
        this.E.setVisibility(8);
    }

    public void setDelegate(bl blVar) {
        this.x0 = blVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        e0();
    }

    @Override // org.telegram.ui.Components.ni
    public final void v() {
        vi viVar = this.b;
        this.O.c0 = (viVar == null || viVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.ni
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.O.c0 = false;
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void x() {
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
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        vi viVar = this.b;
        if (viVar.X0.n0 || viVar.r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = this.A0 - this.z0;
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i13 = (int) (i11 / 3.5f);
                    i12 = i13 - AndroidUtilities.dp(52.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    viVar.setAllowNestedScroll(true);
                }
            }
            i13 = (i11 / 5) * 2;
            i12 = i13 - AndroidUtilities.dp(52.0f);
            if (i12 < 0) {
            }
            viVar.setAllowNestedScroll(true);
        }
        this.P.o1(0, i12, 0, this.e);
        this.Q.o1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ni
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
