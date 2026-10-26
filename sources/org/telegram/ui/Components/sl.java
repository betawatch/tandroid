package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sl extends li implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int B0 = 0;
    public final Bitmap[] A0;
    public boolean E;
    public IMapsProvider.IMap F;
    public IMapsProvider.IMapView G;
    public IMapsProvider.ICameraUpdate H;
    public float I;
    public boolean J;
    public final View K;
    public final bh.r L;
    public final ig.s0 M;
    public final bi.r1 N;
    public final mm0 O;
    public final ll P;
    public final ImageView Q;
    public final jg.e0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final long a0;
    public final Paint b0;
    public final ArrayList c0;
    public AnimatorSet d0;
    public IMapsProvider.IMarker e0;
    public rl f0;
    public FrameLayout g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final ImageView n;
    public Location n0;
    public Location o0;
    public int p0;
    public boolean q0;
    public final org.telegram.ui.ActionBar.w0 r;
    public boolean r0;
    public final ql s;
    public boolean s0;
    public boolean t0;
    public nl u0;
    public final LinearLayout v;
    public final int v0;
    public final TextView w;
    public int w0;
    public final org.telegram.ui.ActionBar.w0 x;
    public int x0;
    public final pl y;
    public int y0;
    public int z0;

    public sl(ti tiVar, Context context, final org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, tiVar);
        int i10;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.b0 = new Paint();
        this.c0 = new ArrayList();
        this.h0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.w0 = currentActionBarHeight;
        this.x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ti tiVar2 = this.b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar2.f0;
        final org.telegram.ui.un unVar = r2Var instanceof org.telegram.ui.un ? (org.telegram.ui.un) r2Var : null;
        long s12 = tiVar2.s1();
        this.a0 = s12;
        if (this.b.O) {
            this.v0 = 7;
        } else if (!z10 || unVar == null || unVar.h != null || unVar.c() || UserObject.isUserSelf(unVar.i())) {
            this.v0 = 0;
        } else {
            this.v0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.j0 = false;
        this.i0 = false;
        this.k0 = false;
        ig.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        this.V = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z l4 = this.b.a1.l();
        this.y = new pl(this, context);
        org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 7);
        this.x = a2;
        if (!this.V || this.b.O) {
            this.b.getClass();
            i10 = 0;
        } else {
            i10 = 8;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(searchField, i11, u6Var);
        org.telegram.ui.ActionBar.f7.w(searchField, i11, u6Var);
        org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Vd, u6Var);
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        bh.r rVar = new bh.r(this, context, 12);
        this.L = rVar;
        rVar.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new dd(org.telegram.ui.ActionBar.y6.C0().q()));
        ql qlVar = new ql(context, 0);
        this.s = qlVar;
        qlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        qlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.y6.wi;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.y6.xi;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i13, this.a);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        gb1.b(qlVar);
        qlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ag.v0 v0Var = ag.z0.a;
        qlVar.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        qlVar.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(qlVar, j02, N, N2, u6Var);
        int i14 = org.telegram.ui.ActionBar.y6.vi;
        org.telegram.ui.ActionBar.f7.V(qlVar, i14, u6Var);
        qlVar.setTextSize(1, 14.0f);
        qlVar.setTypeface(AndroidUtilities.bold());
        qlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        qlVar.setGravity(17);
        qlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        rVar.addView(qlVar, gb1.h(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 0;
        qlVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.il
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        sl slVar = this.b;
                        slVar.g0(false);
                        slVar.M.H(null, slVar.o0, true);
                        slVar.s0 = true;
                        slVar.f0();
                        break;
                    default:
                        this.b.r.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ui, this.a), false, u6Var);
        this.r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), u6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), u6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), u6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.y6.w0(i12, this.a), org.telegram.ui.ActionBar.y6.w0(i13, this.a));
        gb1.b(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i13);
        w0Var.setBackground(i02);
        org.telegram.ui.ActionBar.f7.k(w0Var, i02, N3, N4, u6Var);
        w0Var.setIcon(R.drawable.msg_map_type);
        rVar.addView(w0Var, gb1.h(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 1;
        w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.il
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        sl slVar = this.b;
                        slVar.g0(false);
                        slVar.M.H(null, slVar.o0, true);
                        slVar.s0 = true;
                        slVar.f0();
                        break;
                    default:
                        this.b.r.U(null, null);
                        break;
                }
            }
        });
        w0Var.setDelegate(new cl(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.y6.w0(i12, this.a), org.telegram.ui.ActionBar.y6.w0(i13, this.a));
        gb1.b(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i13);
        imageView.setBackground(i03);
        org.telegram.ui.ActionBar.f7.k(imageView, i03, N5, N6, u6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i14, u6Var, mode);
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        rVar.addView(imageView, gb1.h(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new ga(3, this, u6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, gb1.g(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.d(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.W5, u6Var, mode);
        linearLayout.addView(imageView2, gb1.r(-2, -2));
        TextView textView = new TextView(context);
        int i17 = org.telegram.ui.ActionBar.y6.X5;
        org.telegram.ui.ActionBar.f7.V(textView, i17, u6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, gb1.x(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = e;
        org.telegram.ui.ActionBar.f7.V(e, i17, u6Var);
        e.setGravity(17);
        e.setTextSize(1, 15.0f);
        e.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(e, gb1.x(-2, -2, 17, 0, 6, 0, 0));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 14);
        this.N = r1Var;
        setBlur3Capture(r1Var);
        this.d = r1Var;
        this.f = true;
        r1Var.setClipToPadding(false);
        ig.s0 s0Var2 = new ig.s0(context, this.v0, s12, true, u6Var, this.b.O, false, false);
        this.M = s0Var2;
        r1Var.setAdapter(s0Var2);
        ti tiVar3 = this.b;
        s0Var2.f0 = tiVar3 != null && (tiVar3.H || tiVar3.P);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.C = false;
        lVar.m = false;
        r1Var.setItemAnimator(lVar);
        s0Var2.O(this.V, this.U);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.u1();
        jg.e0 e0Var = new jg.e0(this, r1Var);
        this.R = e0Var;
        r1Var.setLayoutManager(e0Var);
        addView(r1Var, gb1.i(-1, -1, 51));
        r1Var.setOnScrollListener(new kl(this));
        final int i18 = 0;
        r1Var.setOnItemClickListener(new zl0(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zl0
            public final void c(int i19, View view2) {
                switch (i18) {
                    case 0:
                        sl.Q(this.b, unVar, u6Var, i19);
                        break;
                    default:
                        sl.R(this.b, unVar, u6Var, i19);
                        break;
                }
            }
        });
        cl clVar = new cl(this, 1);
        s0Var2.H = s12;
        s0Var2.y = clVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.w0);
        addView(rVar, gb1.i(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new cl(this, 2));
        this.G.setOnInterceptTouchEventInterceptor(new p1(11, this, u6Var));
        new Thread(new el(this, this.G, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        rVar.addView(imageView3, gb1.i(28, 48, 49));
        mm0 mm0Var = new mm0(context, u6Var);
        this.O = mm0Var;
        mm0Var.setSections(true);
        mm0Var.setClipToPadding(false);
        mm0Var.setVisibility(8);
        mm0Var.setLayoutManager(new s4.c0(1, false));
        ll llVar2 = new ll(this, context, u6Var, this.b.O);
        this.P = llVar2;
        boolean z11 = this.V;
        if (llVar2.M != z11) {
            llVar2.M = z11;
        }
        cl clVar2 = new cl(this, 6);
        llVar2.H = 0L;
        llVar2.y = clVar2;
        mm0Var.setItemAnimator(null);
        addView(mm0Var, gb1.i(-1, -1, 51));
        mm0Var.setOnScrollListener(new ml(this, 0));
        final int i19 = 1;
        mm0Var.setOnItemClickListener(new zl0(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ sl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zl0
            public final void c(int i192, View view2) {
                switch (i19) {
                    case 0:
                        sl.Q(this.b, unVar, u6Var, i192);
                        break;
                    default:
                        sl.R(this.b, unVar, u6Var, i192);
                        break;
                }
            }
        });
        i0();
    }

    public static void N(sl slVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        slVar.F = iMap;
        iMap.setOnMapLoadedCallback(new bl(slVar, 2));
        if (org.telegram.ui.ActionBar.y6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, slVar.a)) < 0.721f) {
            slVar.S = true;
            slVar.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (slVar.F == null) {
            return;
        }
        Location location = new Location("network");
        slVar.o0 = location;
        location.setLatitude(20.659322d);
        slVar.o0.setLongitude(-11.40625d);
        try {
            slVar.F.setMyLocationEnabled(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        slVar.F.getUiSettings().setMyLocationButtonEnabled(false);
        slVar.F.getUiSettings().setZoomControlsEnabled(false);
        slVar.F.getUiSettings().setCompassEnabled(false);
        slVar.F.setOnCameraMoveStartedListener(new cl(slVar, 3));
        slVar.F.setOnCameraIdleListener(new bl(slVar, 4));
        slVar.F.setOnMyLocationChangeListener(new hl(slVar, 1));
        slVar.F.setOnMarkerClickListener(new cl(slVar, 4));
        slVar.F.setOnCameraMoveListener(new bl(slVar, 5));
        slVar.c0();
        AndroidUtilities.runOnUIThread(new bl(slVar, 6), 200L);
        if (slVar.T && slVar.getParentActivity() != null) {
            slVar.T = false;
            Activity parentActivity = slVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(slVar.getParentActivity(), 0, slVar.a);
                    int i10 = R.raw.permission_request_location;
                    int i11 = org.telegram.ui.ActionBar.y6.L5;
                    alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.w0(i11, slVar.a), null);
                    alertDialog$Builder.n(i11, slVar.a);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new cl(slVar, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.p();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        slVar.h0();
    }

    public static /* synthetic */ void O(sl slVar, org.telegram.ui.un unVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.u6 u6Var, Long l4) {
        if (unVar != null && unVar.c()) {
            g5.L(slVar.getParentActivity(), unVar.a(), new androidx.car.app.utils.a(slVar, tL_messageMediaGeo, l4, 27), u6Var);
        } else {
            slVar.u0.d(tL_messageMediaGeo, slVar.v0, true, 0, l4.longValue());
            slVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void P(sl slVar) {
        ig.s0 s0Var = slVar.M;
        ti tiVar = slVar.b;
        if (slVar.h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = slVar.getParentActivity();
            if (parentActivity != null) {
                slVar.h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!tiVar.O || tiVar.C2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    slVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(slVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i10 < 29 || !tiVar.O || tiVar.C2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                slVar.U = true;
                if (s0Var != null) {
                    s0Var.O(slVar.V, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void Q(sl slVar, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        final sl slVar2;
        org.telegram.ui.un unVar2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = slVar.a0;
        ig.s0 s0Var = slVar.M;
        ti tiVar = slVar.b;
        int i11 = slVar.v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.d0) != null) {
                slVar.u0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.e0) != null) {
                slVar.u0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else {
                slVar2 = slVar;
                unVar2 = unVar;
                u6Var2 = u6Var;
            }
        } else {
            if (i10 == 1) {
                if (slVar.u0 == null || slVar.o0 == null) {
                    if (slVar.V) {
                        g5.C(slVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = slVar.g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(slVar.o0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(slVar.o0.getLongitude());
                g5.Z(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new di.y2(slVar, unVar, tL_messageMediaGeo, u6Var, 6));
                return;
            }
            slVar2 = slVar;
            unVar2 = unVar;
            u6Var2 = u6Var;
            if (i10 == 2 && i11 == 1) {
                if (slVar2.getLocationController().isSharingLocation(j10)) {
                    slVar2.getLocationController().removeSharingLocation(j10);
                    tiVar.dismiss(true);
                    return;
                } else if (slVar2.n0 == null && slVar2.V) {
                    g5.C(slVar2.getParentActivity()).show();
                    return;
                } else {
                    if (slVar2.u0 == null || slVar2.getParentActivity() == null || slVar2.n0 == null) {
                        return;
                    }
                    g5.D(slVar2.getParentActivity(), false, DialogObject.isUserDialog(j10) ? tiVar.f0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.gl
                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                        public final void run(int i12) {
                            sl slVar3 = sl.this;
                            ti tiVar2 = slVar3.b;
                            g5.Z(tiVar2.M1, tiVar2.o1() + 1, tiVar2.s1(), new fi.c4(slVar3, i12, 4));
                        }
                    }, slVar2.a).show();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            g5.Z(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new di.y2(slVar2, unVar2, (TLRPC.TL_messageMediaVenue) J, u6Var2, 7));
        }
    }

    public static /* synthetic */ void R(sl slVar, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = slVar.P.I(i10);
        if (I == null || slVar.u0 == null) {
            return;
        }
        if (unVar != null && unVar.c()) {
            g5.L(slVar.getParentActivity(), unVar.a(), new fl(slVar, I, 0), u6Var);
        } else {
            slVar.u0.d(I, slVar.v0, true, 0, 0L);
            slVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void S(sl slVar, org.telegram.ui.un unVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.u6 u6Var) {
        if (unVar != null && unVar.c()) {
            g5.L(slVar.getParentActivity(), unVar.a(), new fl(slVar, tL_messageMediaVenue, 1), u6Var);
        } else {
            slVar.u0.d(tL_messageMediaVenue, slVar.v0, true, 0, 0L);
            slVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void T(sl slVar, Location location) {
        int i10;
        ti tiVar = slVar.b;
        if (tiVar == null || tiVar.f0 == null) {
            return;
        }
        slVar.d0(location);
        ig.s0 s0Var = slVar.M;
        if (s0Var != null && (((i10 = slVar.v0) == 7 || i10 == 8) && !slVar.r0)) {
            s0Var.L(slVar.o0);
        }
        slVar.getLocationController().setMapLocation(location, slVar.W);
        slVar.W = false;
    }

    public static /* synthetic */ void U(sl slVar, IMapsProvider.IMapView iMapView) {
        if (slVar.G == null || slVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            slVar.G.getMapAsync(new hl(slVar, 0));
            slVar.l0 = true;
            if (slVar.m0) {
                slVar.G.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void V(sl slVar, org.telegram.ui.ActionBar.u6 u6Var) {
        ig.s0 s0Var = slVar.M;
        ImageView imageView = slVar.n;
        Activity parentActivity = slVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            g5.C(slVar.getParentActivity()).show();
            return;
        }
        if (slVar.n0 != null && slVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.y6.vi;
            org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            slVar.r0 = false;
            slVar.g0(false);
            slVar.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(slVar.n0.getLatitude(), slVar.n0.getLongitude())));
            if (slVar.s0) {
                Location location = slVar.n0;
                if (location != null && slVar.v0 != 8) {
                    s0Var.H(null, location, true);
                }
                slVar.s0 = false;
                slVar.f0();
            }
        }
        if (slVar.e0 != null) {
            slVar.Q.setVisibility(0);
            pl plVar = slVar.y;
            IMapsProvider.IMarker iMarker = slVar.e0;
            HashMap hashMap = plVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                plVar.removeView(view);
                hashMap.remove(iMarker);
            }
            slVar.e0 = null;
            slVar.f0 = null;
            slVar.g0 = null;
        }
    }

    public static /* synthetic */ void W(sl slVar) {
        if (slVar.getParentActivity() == null) {
            return;
        }
        try {
            slVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        org.telegram.ui.ActionBar.r2 r2Var;
        ti tiVar = this.b;
        if (tiVar == null || (r2Var = tiVar.f0) == null) {
            return null;
        }
        return r2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.f0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.li
    public final void A() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.l0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.m0 = false;
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
        if (tiVar.a1.n0 || tiVar.u1.Q() > AndroidUtilities.dp(20.0f)) {
            i12 = this.x0 - this.w0;
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
        this.N.t1(0, i12, 0, this.e);
        this.O.t1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.li
    public final void C() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        ti tiVar = this.b;
        tiVar.a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.G.getView().getParent() == null) {
            View view = this.G.getView();
            FrameLayout.LayoutParams i10 = gb1.i(-1, AndroidUtilities.dp(10.0f) + this.w0, 51);
            bh.r rVar = this.L;
            rVar.addView(view, 0, i10);
            rVar.addView(this.y, 1, gb1.i(-1, AndroidUtilities.dp(10.0f) + this.w0, 51));
            rVar.addView(this.K, 2, gb1.g(-1.0f, -1));
        }
        this.x.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
        IMapsProvider.IMap iMap = this.F;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        a0();
        AndroidUtilities.runOnUIThread(new bl(this, 1), tiVar.c2.E() ? 200L : 0L);
        this.R.h1(0, 0);
        h0();
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.N.y0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean L() {
        return !this.V;
    }

    public final void Y() {
        org.telegram.ui.ActionBar.w0 w0Var = this.r;
        if (w0Var != null) {
            w0Var.setIconColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ui, this.a));
            this.r.H(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.a));
            this.r.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.a), true);
            this.r.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.a), false);
        }
        if (this.F != null) {
            if (!org.telegram.ui.ActionBar.y6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.a)) >= 0.721f) {
                if (this.S) {
                    this.S = false;
                    this.F.setMapStyle(null);
                    return;
                }
                return;
            }
            if (this.S) {
                return;
            }
            this.S = true;
            this.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
    }

    public final Bitmap Z(int i10) {
        Bitmap[] bitmapArr = this.A0;
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
            paint.setColor(org.telegram.ui.Cells.y4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    public final void a0() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.G == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int i10 = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int dp = AndroidUtilities.dp(66.0f);
        int i11 = this.v0;
        if (i11 == 1 || i11 == 7 || i11 == 8) {
            dp += AndroidUtilities.dp(66.0f);
        }
        int dp2 = (i10 - dp) - AndroidUtilities.dp(90.0f);
        int dp3 = AndroidUtilities.dp(189.0f);
        this.w0 = dp3;
        if (!this.V || !b0()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.x0 = Math.max(dp3, dp2);
        if (this.V && b0()) {
            this.w0 = this.x0;
        }
        bi.r1 r1Var = this.N;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        r1Var.setLayoutParams(layoutParams2);
        bh.r rVar = this.L;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) rVar.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.x0;
        rVar.setLayoutParams(layoutParams3);
        mm0 mm0Var = this.O;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        mm0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.V && b0()) ? this.w0 - r1Var.getPaddingTop() : this.w0);
        ig.s0 s0Var = this.M;
        s0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.x0;
            this.G.getView().setLayoutParams(layoutParams5);
        }
        pl plVar = this.y;
        if (plVar != null && (layoutParams = (FrameLayout.LayoutParams) plVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.x0;
            plVar.setLayoutParams(layoutParams);
        }
        s0Var.l();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
    }

    public final boolean b0() {
        int i10 = this.v0;
        return i10 == 0 || i10 == 1;
    }

    public final void c0() {
        sl slVar;
        ti tiVar = this.b;
        if (!tiVar.O) {
            Location lastLocation = getLastLocation();
            this.n0 = lastLocation;
            d0(lastLocation);
            return;
        }
        if (tiVar.D2 != null) {
            AndroidUtilities.runOnUIThread(new bl(this, 0));
            return;
        }
        if (this.V) {
            AndroidUtilities.runOnUIThread(new bl(this, 7));
            return;
        }
        File file = tiVar.C2;
        boolean z10 = tiVar.B2;
        if (file != null) {
            if (!z10) {
                slVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(26, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                slVar.n0 = lastLocation2;
                d0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.y7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        slVar = this;
        Location lastLocation22 = getLastLocation();
        slVar.n0 = lastLocation22;
        d0(lastLocation22);
    }

    public final void d0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.n0 = location2;
        IMapsProvider.IMap iMap = this.F;
        ig.s0 s0Var = this.M;
        if (iMap == null) {
            s0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (s0Var != null) {
            if (!this.s0 && this.v0 != 8) {
                s0Var.H(null, this.n0, true);
            }
            s0Var.M(this.n0);
        }
        if (this.r0) {
            return;
        }
        this.o0 = new Location(location);
        if (this.t0) {
            this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
        } else {
            this.t0 = true;
            this.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        ll llVar = this.P;
        ig.s0 s0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.V, this.U);
            }
            if (llVar != null && llVar.M != (z11 = this.V)) {
                llVar.M = z11;
            }
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.V = true;
            this.U = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (llVar != null && llVar.M != (z10 = this.V)) {
                llVar.M = z10;
            }
        }
        a0();
        boolean z12 = this.V;
        ti tiVar = this.b;
        if (!z12 || tiVar.O) {
            tiVar.getClass();
        } else {
            i13 = 8;
        }
        this.x.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        if (this.F == null) {
            return;
        }
        if (d == 0.0d || d10 == 0.0d) {
            Location location = new Location("");
            this.n0 = location;
            location.reset();
            this.n0.setLatitude(d);
            this.n0.setLongitude(d10);
        } else {
            Location location2 = new Location("");
            this.o0 = location2;
            location2.reset();
            this.o0.setLatitude(d);
            this.o0.setLongitude(d10);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom = (d == 0.0d || d10 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f);
        this.H = newCameraUpdateLatLngZoom;
        this.F.moveCamera(newCameraUpdateLatLngZoom);
        ig.s0 s0Var = this.M;
        if (d == 0.0d || d10 == 0.0d) {
            s0Var.M(this.n0);
        } else {
            s0Var.L(this.o0);
        }
        s0Var.I();
        this.N.w0(0, 1, null);
        this.q0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.r0 = true;
        g0(false);
        if (this.v0 != 8) {
            s0Var.H(null, this.o0, true);
        }
        this.s0 = true;
        f0();
    }

    public final void f0() {
        if (this.M.h() != 0 && this.R.L0() == 0) {
            bi.r1 r1Var = this.N;
            View childAt = r1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            r1Var.w0(0, top, null);
        }
    }

    public final void g0(boolean z10) {
        Location location;
        Location location2;
        if (this.V) {
            z10 = false;
        }
        ql qlVar = this.s;
        if (z10 && qlVar != null && qlVar.getTag() == null && ((location = this.n0) == null || (location2 = this.o0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.v0 == 8) {
            z10 = false;
        }
        if (qlVar != null) {
            if (!z10 || qlVar.getTag() == null) {
                if (z10 || qlVar.getTag() != null) {
                    qlVar.setVisibility(z10 ? 0 : 4);
                    qlVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qlVar, (Property<ql, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(ds.g);
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
        bi.r1 r1Var = this.N;
        if (r1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        vl0 vl0Var = (vl0) r1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (vl0Var != null ? Math.max(((int) vl0Var.a.getY()) - this.z0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.N.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.li
    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        b7 b7Var = new b7(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h5));
        int i10 = org.telegram.ui.ActionBar.y6.A5;
        bi.r1 r1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var != null ? w0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.j5));
        int i11 = org.telegram.ui.ActionBar.y6.wi;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        int i13 = org.telegram.ui.ActionBar.y6.ui;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.si));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393216, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393216, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393248, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393248, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.pi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 196608, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.X5));
        return arrayList;
    }

    public final void h0() {
        bh.r rVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.G == null || (rVar = this.L) == null) {
            return;
        }
        bi.r1 r1Var = this.N;
        s4.e1 K = r1Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.w0;
        } else {
            i10 = -rVar.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) rVar.getLayoutParams()) != null) {
            pl plVar = this.y;
            if (i11 <= 0) {
                if (this.G.getView().getVisibility() == 0) {
                    this.G.getView().setVisibility(4);
                    rVar.setVisibility(4);
                    if (plVar != null) {
                        plVar.setVisibility(4);
                    }
                }
                this.G.getView().setTranslationY(i10);
                return;
            }
            if (this.G.getView().getVisibility() == 4) {
                this.G.getView().setVisibility(0);
                rVar.setVisibility(0);
                if (plVar != null) {
                    plVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.x0) + this.w0)) / 2);
            int i12 = this.x0 - this.w0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (r1Var.getPaddingTop() - i10) / (r1Var.getPaddingTop() - i12)));
            int i13 = this.y0;
            if (this.V && b0()) {
                i12 += Math.min(i10, r1Var.getPaddingTop());
            }
            this.y0 = (int) (i12 * max2);
            float f7 = max;
            this.G.getView().setTranslationY(f7);
            this.z0 = i12 - this.y0;
            rVar.invalidate();
            rVar.setTranslationY(i10 - this.z0);
            IMapsProvider.IMap iMap2 = this.F;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.y0);
            }
            if (plVar != null) {
                plVar.setTranslationY(f7);
            }
            int max3 = Math.max(this.z0 - i10, 0);
            int i14 = this.x0;
            org.telegram.ui.ActionBar.w0 w0Var = this.r;
            float g7 = org.telegram.ui.d3.g(80.0f, i14 - w0Var.getMeasuredHeight(), max3);
            w0Var.setTranslationY(g7);
            ql qlVar = this.s;
            qlVar.c = g7;
            qlVar.setTranslationY(g7 + qlVar.b);
            this.n.setTranslationY(-this.y0);
            int w10 = org.telegram.ui.d3.w(48.0f, (this.x0 - this.y0) / 2, max);
            this.p0 = w10;
            this.Q.setTranslationY(w10);
            if (i13 != this.y0) {
                IMapsProvider.IMarker iMarker = this.e0;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.e0.getPosition().longitude);
                } else if (!this.r0 || (location = this.o0) == null) {
                    Location location2 = this.n0;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.n0.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.o0.getLongitude());
                }
                if (latLng != null && (iMap = this.F) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.V && b0()) {
                int h = this.M.h();
                for (int i15 = 1; i15 < h; i15++) {
                    s4.e1 K2 = r1Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(r1Var.getPaddingTop() - i10);
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
        boolean z10 = this.i0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.k0;
        mm0 mm0Var = this.O;
        if (!z11) {
            mm0Var.setEmptyView(linearLayout);
        } else {
            mm0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.E = true;
        bh.r rVar = this.L;
        if (rVar != null) {
            rVar.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.G;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.G;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.G = null;
            }
        } catch (Exception unused2) {
        }
        ig.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        ti tiVar = this.b;
        tiVar.a1.g(true);
        tiVar.a1.l().removeView(this.x);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a0();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean p() {
        o();
        return false;
    }

    public void setDelegate(nl nlVar) {
        this.u0 = nlVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        h0();
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        this.x.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.x;
        if (w0Var != null) {
            try {
                if (w0Var.getSearchField() != null) {
                    w0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.j5, this.a));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void x() {
        ti tiVar = this.b;
        this.M.c0 = (tiVar == null || tiVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.li
    public final void y(int i10, boolean z10) {
        if (z10) {
            this.M.c0 = false;
        }
    }
}
