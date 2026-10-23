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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class rl extends li implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int C0 = 0;
    public int A0;
    public final Bitmap[] B0;
    public boolean E;
    public IMapsProvider.IMap F;
    public IMapsProvider.IMapView G;
    public IMapsProvider.ICameraUpdate H;
    public float I;
    public boolean J;
    public final View K;
    public final ah.x L;
    public final hg.s0 M;
    public final ai.u1 N;
    public final mm0 O;
    public final ll P;
    public final ImageView Q;
    public final ig.d0 R;
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
    public ql f0;
    public FrameLayout g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final ImageView n;
    public boolean n0;
    public Location o0;
    public Location p0;
    public int q0;
    public final org.telegram.ui.ActionBar.u0 r;
    public boolean r0;
    public final pl s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final LinearLayout v;
    public ml v0;
    public final TextView w;
    public final int w0;
    public final org.telegram.ui.ActionBar.u0 x;
    public int x0;
    public final ol y;
    public int y0;
    public int z0;

    public rl(ti tiVar, Context context, final org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, tiVar);
        int i10;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.b0 = new Paint();
        this.c0 = new ArrayList();
        this.h0 = true;
        this.i0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.x0 = currentActionBarHeight;
        this.y0 = currentActionBarHeight;
        this.B0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ti tiVar2 = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar2.f0;
        final org.telegram.ui.sn snVar = o2Var instanceof org.telegram.ui.sn ? (org.telegram.ui.sn) o2Var : null;
        long s12 = tiVar2.s1();
        this.a0 = s12;
        if (this.b.O) {
            this.w0 = 7;
        } else if (!z10 || snVar == null || snVar.h != null || snVar.c() || UserObject.isUserSelf(snVar.i())) {
            this.w0 = 0;
        } else {
            this.w0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.k0 = false;
        this.j0 = false;
        this.l0 = false;
        hg.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        this.V = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.y m10 = this.b.a1.m();
        this.y = new ol(this, context);
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 6);
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
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.x(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, g6Var);
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.x xVar = new ah.x(this, context, 12);
        this.L = xVar;
        xVar.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new ed(org.telegram.ui.ActionBar.k6.C0().q()));
        pl plVar = new pl(context, 0);
        this.s = plVar;
        plVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        plVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.k6.wi;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.k6.xi;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i13, this.a);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.b6.a(plVar);
        plVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ci.n1 n1Var = zf.j0.a;
        plVar.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        plVar.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(plVar, j02, O, O2, g6Var);
        int i14 = org.telegram.ui.ActionBar.k6.vi;
        org.telegram.ui.ActionBar.r6.W(plVar, i14, g6Var);
        plVar.setTextSize(1, 14.0f);
        plVar.setTypeface(AndroidUtilities.bold());
        plVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        plVar.setGravity(17);
        plVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xVar.addView(plVar, w7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 0;
        plVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.il
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        rl rlVar = this.b;
                        rlVar.h0(false);
                        rlVar.M.H(null, rlVar.p0, true);
                        rlVar.t0 = true;
                        rlVar.g0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ui, this.a), false, g6Var);
        this.r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), g6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), g6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), g6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.a), org.telegram.ui.ActionBar.k6.w0(i13, this.a));
        w7.b6.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i13);
        u0Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(u0Var, i02, O3, O4, g6Var);
        u0Var.setIcon(R.drawable.msg_map_type);
        xVar.addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 1;
        u0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.il
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        rl rlVar = this.b;
                        rlVar.h0(false);
                        rlVar.M.H(null, rlVar.p0, true);
                        rlVar.t0 = true;
                        rlVar.g0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        u0Var.setDelegate(new cl(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.a), org.telegram.ui.ActionBar.k6.w0(i13, this.a));
        w7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O6 = org.telegram.ui.ActionBar.r6.O(i13);
        imageView.setBackground(i03);
        org.telegram.ui.ActionBar.r6.k(imageView, i03, O5, O6, g6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, g6Var, mode);
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        xVar.addView(imageView, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new ca(2, this, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new di.d(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, g6Var, mode);
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        int i17 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.W(textView, i17, g6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = f7;
        org.telegram.ui.ActionBar.r6.W(f7, i17, g6Var);
        f7.setGravity(17);
        f7.setTextSize(1, 15.0f);
        f7.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(f7, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 14);
        this.N = u1Var;
        this.c = u1Var;
        this.d = u1Var;
        this.f = true;
        u1Var.setClipToPadding(false);
        hg.s0 s0Var2 = new hg.s0(context, this.w0, s12, true, g6Var, this.b.O, false, false);
        this.M = s0Var2;
        u1Var.setAdapter(s0Var2);
        ti tiVar3 = this.b;
        s0Var2.f0 = tiVar3 != null && (tiVar3.H || tiVar3.P);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.m = false;
        u1Var.setItemAnimator(kVar);
        s0Var2.O(this.V, this.U);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.t1();
        ig.d0 d0Var = new ig.d0(this, u1Var);
        this.R = d0Var;
        u1Var.setLayoutManager(d0Var);
        addView(u1Var, w7.z5.e(-1, -1, 51));
        u1Var.setOnScrollListener(new kl(this));
        final int i18 = 0;
        u1Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void d(int i19, View view2) {
                switch (i18) {
                    case 0:
                        rl.Q(this.b, snVar, g6Var, i19);
                        break;
                    default:
                        rl.R(this.b, snVar, g6Var, i19);
                        break;
                }
            }
        });
        cl clVar = new cl(this, 1);
        s0Var2.H = s12;
        s0Var2.y = clVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.x0);
        addView(xVar, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new cl(this, 2));
        this.G.setOnInterceptTouchEventInterceptor(new p2(8, this, g6Var));
        new Thread(new fl(this, this.G, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        xVar.addView(imageView3, w7.z5.e(28, 48, 49));
        mm0 mm0Var = new mm0(context, g6Var);
        this.O = mm0Var;
        mm0Var.setSections(true);
        mm0Var.setClipToPadding(false);
        mm0Var.setVisibility(8);
        mm0Var.setLayoutManager(new s4.b0(1, false));
        ll llVar2 = new ll(this, context, g6Var, this.b.O);
        this.P = llVar2;
        boolean z11 = this.V;
        if (llVar2.M != z11) {
            llVar2.M = z11;
        }
        cl clVar2 = new cl(this, 6);
        llVar2.H = 0L;
        llVar2.y = clVar2;
        mm0Var.setItemAnimator(null);
        addView(mm0Var, w7.z5.e(-1, -1, 51));
        mm0Var.setOnScrollListener(new ah.d0(this, 26));
        final int i19 = 1;
        mm0Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.dl
            public final /* synthetic */ rl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.am0
            public final void d(int i192, View view2) {
                switch (i19) {
                    case 0:
                        rl.Q(this.b, snVar, g6Var, i192);
                        break;
                    default:
                        rl.R(this.b, snVar, g6Var, i192);
                        break;
                }
            }
        });
        j0();
    }

    public static void N(rl rlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        rlVar.F = iMap;
        iMap.setOnMapLoadedCallback(new bl(rlVar, 3));
        if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, rlVar.a)) < 0.721f) {
            rlVar.S = true;
            rlVar.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (rlVar.F == null) {
            return;
        }
        Location location = new Location("network");
        rlVar.p0 = location;
        location.setLatitude(20.659322d);
        rlVar.p0.setLongitude(-11.40625d);
        try {
            rlVar.F.setMyLocationEnabled(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        rlVar.F.getUiSettings().setMyLocationButtonEnabled(false);
        rlVar.F.getUiSettings().setZoomControlsEnabled(false);
        rlVar.F.getUiSettings().setCompassEnabled(false);
        rlVar.F.setOnCameraMoveStartedListener(new cl(rlVar, 3));
        rlVar.F.setOnCameraIdleListener(new bl(rlVar, 5));
        rlVar.F.setOnMyLocationChangeListener(new hl(rlVar, 1));
        rlVar.F.setOnMarkerClickListener(new cl(rlVar, 4));
        rlVar.F.setOnCameraMoveListener(new bl(rlVar, 6));
        rlVar.d0();
        AndroidUtilities.runOnUIThread(new bl(rlVar, 7), 200L);
        if (rlVar.T && rlVar.getParentActivity() != null) {
            rlVar.T = false;
            Activity parentActivity = rlVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rlVar.getParentActivity(), 0, rlVar.a);
                    int i10 = R.raw.permission_request_location;
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.w0(i11, rlVar.a), null);
                    alertDialog$Builder.n(i11, rlVar.a);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new cl(rlVar, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.p();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        rlVar.i0();
    }

    public static /* synthetic */ void O(rl rlVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.g6 g6Var, Long l4) {
        if (snVar != null && snVar.c()) {
            f5.M(rlVar.getParentActivity(), snVar.a(), new ai.u2(rlVar, tL_messageMediaGeo, l4, 27), g6Var);
        } else {
            rlVar.v0.b(tL_messageMediaGeo, rlVar.w0, true, 0, l4.longValue());
            rlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void P(rl rlVar) {
        hg.s0 s0Var = rlVar.M;
        ti tiVar = rlVar.b;
        if (rlVar.h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = rlVar.getParentActivity();
            if (parentActivity != null) {
                rlVar.h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!tiVar.O || tiVar.C2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    rlVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(rlVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i10 < 29 || !tiVar.O || tiVar.C2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                rlVar.U = true;
                if (s0Var != null) {
                    s0Var.O(rlVar.V, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static /* synthetic */ void Q(rl rlVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        rl rlVar2;
        org.telegram.ui.sn snVar2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = rlVar.a0;
        hg.s0 s0Var = rlVar.M;
        ti tiVar = rlVar.b;
        int i11 = rlVar.w0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.d0) != null) {
                rlVar.v0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.e0) != null) {
                rlVar.v0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else {
                rlVar2 = rlVar;
                snVar2 = snVar;
                g6Var2 = g6Var;
            }
        } else {
            if (i10 == 1) {
                if (rlVar.v0 == null || rlVar.p0 == null) {
                    if (rlVar.V) {
                        f5.D(rlVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = rlVar.g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rlVar.p0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rlVar.p0.getLongitude());
                f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new ci.y2(rlVar, snVar, tL_messageMediaGeo, g6Var, 6));
                return;
            }
            rlVar2 = rlVar;
            snVar2 = snVar;
            g6Var2 = g6Var;
            if (i10 == 2 && i11 == 1) {
                if (rlVar2.getLocationController().isSharingLocation(j10)) {
                    rlVar2.getLocationController().removeSharingLocation(j10);
                    tiVar.dismiss(true);
                    return;
                } else if (rlVar2.o0 == null && rlVar2.V) {
                    f5.D(rlVar2.getParentActivity()).show();
                    return;
                } else {
                    rlVar2.c0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new ci.y2(rlVar2, snVar2, (TLRPC.TL_messageMediaVenue) J, g6Var2, 7));
        }
    }

    public static /* synthetic */ void R(rl rlVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = rlVar.P.I(i10);
        if (I == null || rlVar.v0 == null) {
            return;
        }
        if (snVar != null && snVar.c()) {
            f5.M(rlVar.getParentActivity(), snVar.a(), new gl(rlVar, I, 0), g6Var);
        } else {
            rlVar.v0.b(I, rlVar.w0, true, 0, 0L);
            rlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void S(rl rlVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.g6 g6Var) {
        if (snVar != null && snVar.c()) {
            f5.M(rlVar.getParentActivity(), snVar.a(), new gl(rlVar, tL_messageMediaVenue, 1), g6Var);
        } else {
            rlVar.v0.b(tL_messageMediaVenue, rlVar.w0, true, 0, 0L);
            rlVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void T(rl rlVar, Location location) {
        int i10;
        ti tiVar = rlVar.b;
        if (tiVar == null || tiVar.f0 == null) {
            return;
        }
        rlVar.e0(location);
        hg.s0 s0Var = rlVar.M;
        if (s0Var != null && (((i10 = rlVar.w0) == 7 || i10 == 8) && !rlVar.s0)) {
            s0Var.L(rlVar.p0);
        }
        rlVar.getLocationController().setMapLocation(location, rlVar.W);
        rlVar.W = false;
    }

    public static /* synthetic */ void U(rl rlVar, IMapsProvider.IMapView iMapView) {
        if (rlVar.G == null || rlVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            rlVar.G.getMapAsync(new hl(rlVar, 0));
            rlVar.m0 = true;
            if (rlVar.n0) {
                rlVar.G.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void V(rl rlVar, org.telegram.ui.ActionBar.g6 g6Var) {
        hg.s0 s0Var = rlVar.M;
        ImageView imageView = rlVar.n;
        Activity parentActivity = rlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            f5.D(rlVar.getParentActivity()).show();
            return;
        }
        if (rlVar.o0 != null && rlVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.k6.vi;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            rlVar.s0 = false;
            rlVar.h0(false);
            rlVar.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rlVar.o0.getLatitude(), rlVar.o0.getLongitude())));
            if (rlVar.t0) {
                Location location = rlVar.o0;
                if (location != null && rlVar.w0 != 8) {
                    s0Var.H(null, location, true);
                }
                rlVar.t0 = false;
                rlVar.g0();
            }
        }
        if (rlVar.e0 != null) {
            rlVar.Q.setVisibility(0);
            ol olVar = rlVar.y;
            IMapsProvider.IMarker iMarker = rlVar.e0;
            HashMap hashMap = olVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                olVar.removeView(view);
                hashMap.remove(iMarker);
            }
            rlVar.e0 = null;
            rlVar.f0 = null;
            rlVar.g0 = null;
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
        org.telegram.ui.ActionBar.o2 o2Var;
        ti tiVar = this.b;
        if (tiVar == null || (o2Var = tiVar.f0) == null) {
            return null;
        }
        return o2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.f0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.li
    public final void A() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.m0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.n0 = false;
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
            i12 = this.y0 - this.x0;
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
        this.N.s1(0, i12, 0, this.e);
        this.O.s1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.li
    public final void C() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.m0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.n0 = true;
    }

    @Override // org.telegram.ui.Components.li
    public final void F(li liVar) {
        ti tiVar = this.b;
        tiVar.a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.G.getView().getParent() == null) {
            View view = this.G.getView();
            FrameLayout.LayoutParams e = w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.x0, 51);
            ah.x xVar = this.L;
            xVar.addView(view, 0, e);
            xVar.addView(this.y, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.x0, 51));
            xVar.addView(this.K, 2, w7.z5.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.m0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.n0 = true;
        IMapsProvider.IMap iMap = this.F;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        a0();
        AndroidUtilities.runOnUIThread(new bl(this, 1), tiVar.c2.u() ? 200L : 0L);
        this.R.h1(0, 0);
        i0();
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.N.x0(0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean L() {
        return !this.V;
    }

    public final void Y() {
        org.telegram.ui.ActionBar.u0 u0Var = this.r;
        if (u0Var != null) {
            u0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ui, this.a));
            this.r.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.a));
            this.r.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.a), true);
            this.r.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.a), false);
        }
        if (this.F != null) {
            if (!org.telegram.ui.ActionBar.k6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a)) >= 0.721f) {
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
        Bitmap[] bitmapArr = this.B0;
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

    public final void a0() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.G == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int i10 = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int dp = AndroidUtilities.dp(66.0f);
        int i11 = this.w0;
        if (i11 == 1 || i11 == 7 || i11 == 8) {
            dp += AndroidUtilities.dp(66.0f);
        }
        int dp2 = (i10 - dp) - AndroidUtilities.dp(90.0f);
        int dp3 = AndroidUtilities.dp(189.0f);
        this.x0 = dp3;
        if (!this.V || !b0()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.y0 = Math.max(dp3, dp2);
        if (this.V && b0()) {
            this.x0 = this.y0;
        }
        ai.u1 u1Var = this.N;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        u1Var.setLayoutParams(layoutParams2);
        ah.x xVar = this.L;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xVar.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.y0;
        xVar.setLayoutParams(layoutParams3);
        mm0 mm0Var = this.O;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        mm0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.V && b0()) ? this.x0 - u1Var.getPaddingTop() : this.x0);
        hg.s0 s0Var = this.M;
        s0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.y0;
            this.G.getView().setLayoutParams(layoutParams5);
        }
        ol olVar = this.y;
        if (olVar != null && (layoutParams = (FrameLayout.LayoutParams) olVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.y0;
            olVar.setLayoutParams(layoutParams);
        }
        s0Var.l();
        i0();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
    }

    public final boolean b0() {
        int i10 = this.w0;
        return i10 == 0 || i10 == 1;
    }

    public final void c0() {
        Activity parentActivity;
        if (this.v0 == null || getParentActivity() == null || this.o0 == null) {
            return;
        }
        boolean z10 = this.i0;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.i0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                f5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new bl(this, 2), g6Var).p();
                return;
            }
        }
        long j10 = this.a0;
        f5.E(getParentActivity(), false, DialogObject.isUserDialog(j10) ? this.b.f0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.el
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                rl rlVar = rl.this;
                ti tiVar = rlVar.b;
                f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new ei.e4(rlVar, i10, 4));
            }
        }, g6Var).show();
    }

    public final void d0() {
        rl rlVar;
        ti tiVar = this.b;
        if (!tiVar.O) {
            Location lastLocation = getLastLocation();
            this.o0 = lastLocation;
            e0(lastLocation);
            return;
        }
        if (tiVar.D2 != null) {
            AndroidUtilities.runOnUIThread(new bl(this, 0));
            return;
        }
        if (this.V) {
            AndroidUtilities.runOnUIThread(new bl(this, 8));
            return;
        }
        File file = tiVar.C2;
        boolean z10 = tiVar.B2;
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
                rlVar.o0 = lastLocation2;
                e0(lastLocation2);
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
        rlVar.o0 = lastLocation22;
        e0(lastLocation22);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        ll llVar = this.P;
        hg.s0 s0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            d0();
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

    public final void e0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.o0 = location2;
        IMapsProvider.IMap iMap = this.F;
        hg.s0 s0Var = this.M;
        if (iMap == null) {
            s0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (s0Var != null) {
            if (!this.t0 && this.w0 != 8) {
                s0Var.H(null, this.o0, true);
            }
            s0Var.M(this.o0);
        }
        if (this.s0) {
            return;
        }
        this.p0 = new Location(location);
        if (this.u0) {
            this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
        } else {
            this.u0 = true;
            this.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f));
        }
    }

    public final void f0(double d, double d10) {
        if (this.F == null) {
            return;
        }
        if (d == 0.0d || d10 == 0.0d) {
            Location location = new Location("");
            this.o0 = location;
            location.reset();
            this.o0.setLatitude(d);
            this.o0.setLongitude(d10);
        } else {
            Location location2 = new Location("");
            this.p0 = location2;
            location2.reset();
            this.p0.setLatitude(d);
            this.p0.setLongitude(d10);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom = (d == 0.0d || d10 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f);
        this.H = newCameraUpdateLatLngZoom;
        this.F.moveCamera(newCameraUpdateLatLngZoom);
        hg.s0 s0Var = this.M;
        if (d == 0.0d || d10 == 0.0d) {
            s0Var.M(this.o0);
        } else {
            s0Var.L(this.p0);
        }
        s0Var.I();
        this.N.v0(0, 1, null);
        this.r0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.s0 = true;
        h0(false);
        if (this.w0 != 8) {
            s0Var.H(null, this.p0, true);
        }
        this.t0 = true;
        g0();
    }

    public final void g0() {
        if (this.M.h() != 0 && this.R.L0() == 0) {
            ai.u1 u1Var = this.N;
            View childAt = u1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            u1Var.v0(0, top, null);
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.N;
        if (u1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        wl0 wl0Var = (wl0) u1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (wl0Var != null ? Math.max(((int) wl0Var.a.getY()) - this.A0, 0) : 0);
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
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        z6 z6Var = new z6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ai.u1 u1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var != null ? u0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i11 = org.telegram.ui.ActionBar.k6.wi;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.ui;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.si));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X5));
        return arrayList;
    }

    public final void h0(boolean z10) {
        Location location;
        Location location2;
        if (this.V) {
            z10 = false;
        }
        pl plVar = this.s;
        if (z10 && plVar != null && plVar.getTag() == null && ((location = this.o0) == null || (location2 = this.p0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.w0 == 8) {
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
    public final int i() {
        return 1;
    }

    public final void i0() {
        ah.x xVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.G == null || (xVar = this.L) == null) {
            return;
        }
        ai.u1 u1Var = this.N;
        s4.b1 K = u1Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.x0;
        } else {
            i10 = -xVar.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) xVar.getLayoutParams()) != null) {
            ol olVar = this.y;
            if (i11 <= 0) {
                if (this.G.getView().getVisibility() == 0) {
                    this.G.getView().setVisibility(4);
                    xVar.setVisibility(4);
                    if (olVar != null) {
                        olVar.setVisibility(4);
                    }
                }
                this.G.getView().setTranslationY(i10);
                return;
            }
            if (this.G.getView().getVisibility() == 4) {
                this.G.getView().setVisibility(0);
                xVar.setVisibility(0);
                if (olVar != null) {
                    olVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.y0) + this.x0)) / 2);
            int i12 = this.y0 - this.x0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (u1Var.getPaddingTop() - i10) / (u1Var.getPaddingTop() - i12)));
            int i13 = this.z0;
            if (this.V && b0()) {
                i12 += Math.min(i10, u1Var.getPaddingTop());
            }
            this.z0 = (int) (i12 * max2);
            float f7 = max;
            this.G.getView().setTranslationY(f7);
            this.A0 = i12 - this.z0;
            xVar.invalidate();
            xVar.setTranslationY(i10 - this.A0);
            IMapsProvider.IMap iMap2 = this.F;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.z0);
            }
            if (olVar != null) {
                olVar.setTranslationY(f7);
            }
            int max3 = Math.max(this.A0 - i10, 0);
            int i14 = this.y0;
            org.telegram.ui.ActionBar.u0 u0Var = this.r;
            float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            u0Var.setTranslationY(min);
            pl plVar = this.s;
            plVar.c = min;
            plVar.setTranslationY(min + plVar.b);
            this.n.setTranslationY(-this.z0);
            int D = org.telegram.messenger.sl.D(48.0f, (this.y0 - this.z0) / 2, max);
            this.q0 = D;
            this.Q.setTranslationY(D);
            if (i13 != this.z0) {
                IMapsProvider.IMarker iMarker = this.e0;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.e0.getPosition().longitude);
                } else if (!this.s0 || (location = this.p0) == null) {
                    Location location2 = this.o0;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.o0.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.p0.getLongitude());
                }
                if (latLng != null && (iMap = this.F) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.V && b0()) {
                int h = this.M.h();
                for (int i15 = 1; i15 < h; i15++) {
                    s4.b1 K2 = u1Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(u1Var.getPaddingTop() - i10);
                    }
                }
            }
        }
    }

    public final void j0() {
        boolean z10 = this.j0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.l0;
        mm0 mm0Var = this.O;
        if (!z11) {
            mm0Var.setEmptyView(linearLayout);
        } else {
            mm0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a0();
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void p() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.E = true;
        ah.x xVar = this.L;
        if (xVar != null) {
            xVar.invalidate();
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
        hg.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        ti tiVar = this.b;
        tiVar.a1.g(true);
        tiVar.a1.m().removeView(this.x);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(ml mlVar) {
        this.v0 = mlVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
        i0();
    }

    @Override // org.telegram.ui.Components.li
    public final void u() {
        this.x.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.x;
        if (u0Var != null) {
            try {
                if (u0Var.getSearchField() != null) {
                    u0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void y() {
        ti tiVar = this.b;
        this.M.c0 = (tiVar == null || tiVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.li
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.M.c0 = false;
        }
    }
}
