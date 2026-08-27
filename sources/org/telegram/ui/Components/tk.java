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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tk extends yh implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int A0 = 0;
    public final org.telegram.ui.ActionBar.v0 A;
    public final qk B;
    public boolean C;
    public IMapsProvider.IMap D;
    public IMapsProvider.IMapView E;
    public IMapsProvider.ICameraUpdate F;
    public float G;
    public boolean H;
    public final View I;
    public final ag.p1 J;
    public final pf.h0 K;
    public final hh.f1 L;
    public final zk0 M;
    public final nk N;
    public final ImageView O;
    public final zi P;
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
    public sk d0;
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
    public final org.telegram.ui.ActionBar.v0 r;
    public boolean r0;
    public final rk s;
    public boolean s0;
    public ok t0;
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

    public tk(gi giVar, Context context, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, giVar);
        int i10;
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
        gi giVar2 = this.b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar2.b0;
        final org.telegram.ui.rn rnVar = n2Var instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var : null;
        long n12 = giVar2.n1();
        this.V = n12;
        if (this.b.K) {
            this.u0 = 7;
        } else if (!z10 || rnVar == null || rnVar.h != null || rnVar.c() || UserObject.isUserSelf(rnVar.i())) {
            this.u0 = 0;
        } else {
            this.u0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.i0 = false;
        this.h0 = false;
        this.j0 = false;
        pf.h0 h0Var = this.K;
        if (h0Var != null) {
            h0Var.F();
        }
        nk nkVar = this.N;
        if (nkVar != null) {
            nkVar.F();
        }
        this.T = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z n10 = this.b.T0.n();
        this.B = new qk(this, context);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.db(this, 5);
        this.A = a2;
        if (!this.T || this.b.K) {
            this.b.getClass();
            i10 = 0;
        } else {
            i10 = 8;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ag.p1 p1Var = new ag.p1(this, context, 15);
        this.J = p1Var;
        p1Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new af.g(org.telegram.ui.ActionBar.g6.A0().q()));
        rk rkVar = new rk(context, 0);
        this.s = rkVar;
        rkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        rkVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.g6.wi;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.g6.xi;
        int v03 = org.telegram.ui.ActionBar.g6.v0(i13, this.a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03);
        h7.b6.a(rkVar);
        rkVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        cg.l1 l1Var = gf.r0.a;
        rkVar.setOutlineProvider(l1Var);
        rkVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        rkVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.a));
        rkVar.setTextSize(1, 14.0f);
        rkVar.setTypeface(AndroidUtilities.bold());
        rkVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        rkVar.setGravity(17);
        rkVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        p1Var.addView(rkVar, h7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 1;
        rkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        tk.Q(this.b);
                        break;
                    case 1:
                        tk tkVar = this.b;
                        tkVar.d0(false);
                        tkVar.K.H(null, tkVar.n0, true);
                        tkVar.r0 = true;
                        tkVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, this.a), false, c6Var);
        this.r = v0Var;
        v0Var.setClickable(true);
        v0Var.setSubMenuOpenSide(2);
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        v0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), c6Var);
        v0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), c6Var);
        v0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), c6Var);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.v0(i12, this.a), org.telegram.ui.ActionBar.g6.v0(i13, this.a));
        h7.b6.a(v0Var);
        v0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        v0Var.setOutlineProvider(l1Var);
        v0Var.setBackground(h02);
        v0Var.setIcon(R.drawable.msg_map_type);
        p1Var.addView(v0Var, h7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 2;
        v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        tk.Q(this.b);
                        break;
                    case 1:
                        tk tkVar = this.b;
                        tkVar.d0(false);
                        tkVar.K.H(null, tkVar.n0, true);
                        tkVar.r0 = true;
                        tkVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        v0Var.setDelegate(new ek(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.v0(i12, this.a), org.telegram.ui.ActionBar.g6.v0(i13, this.a));
        h7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(l1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.g6.v0(i14, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        p1Var.addView(imageView, h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        tk.Q(this.b);
                        break;
                    case 1:
                        tk tkVar = this.b;
                        tkVar.d0(false);
                        tkVar.K.H(null, tkVar.n0, true);
                        tkVar.r0 = true;
                        tkVar.c0();
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
        addView(linearLayout, h7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new kh.e(15));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, this.a), mode));
        linearLayout.addView(imageView2, h7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.x = textView;
        int i18 = org.telegram.ui.ActionBar.g6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i19 = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.y = i19;
        i19.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.a));
        i19.setGravity(17);
        i19.setTextSize(1, 15.0f);
        i19.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i19, h7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        hh.f1 f1Var = new hh.f1(this, context, c6Var, 13);
        this.L = f1Var;
        this.c = f1Var;
        this.d = f1Var;
        this.f = true;
        f1Var.setClipToPadding(false);
        pf.h0 h0Var2 = new pf.h0(context, this.u0, n12, true, c6Var, this.b.K, false, false);
        this.K = h0Var2;
        f1Var.setAdapter(h0Var2);
        gi giVar3 = this.b;
        h0Var2.b0 = giVar3 != null && (giVar3.D || giVar3.L);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(er.h);
        lVar.C = false;
        lVar.m = false;
        f1Var.setItemAnimator(lVar);
        h0Var2.O(this.T, this.S);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.p1();
        zi ziVar = new zi(this, f1Var);
        this.P = ziVar;
        f1Var.setLayoutManager(ziVar);
        addView(f1Var, h7.z5.e(-1, -1, 51));
        f1Var.setOnScrollListener(new mk(this));
        final int i20 = 0;
        f1Var.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.gk
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.pk0
            public final void a(int i21, View view2) {
                switch (i20) {
                    case 0:
                        tk.N(this.b, rnVar, c6Var, i21);
                        break;
                    default:
                        tk.O(this.b, rnVar, c6Var, i21);
                        break;
                }
            }
        });
        ek ekVar = new ek(this, 1);
        h0Var2.D = n12;
        h0Var2.y = ekVar;
        h0Var2.P(AndroidUtilities.dp(16.0f) + this.v0);
        addView(p1Var, h7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.E = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new ek(this, 2));
        this.E.setOnInterceptTouchEventInterceptor(new ek(this, 3));
        new Thread(new ik(this, this.E, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        p1Var.addView(imageView3, h7.z5.e(28, 48, 49));
        zk0 zk0Var = new zk0(context, c6Var);
        this.M = zk0Var;
        zk0Var.setSections(true);
        zk0Var.setClipToPadding(false);
        zk0Var.setVisibility(8);
        zk0Var.setLayoutManager(new f2.k0(1, false));
        nk nkVar2 = new nk(this, context, c6Var, this.b.K);
        this.N = nkVar2;
        boolean z11 = this.T;
        if (nkVar2.I != z11) {
            nkVar2.I = z11;
        }
        ek ekVar2 = new ek(this, 7);
        nkVar2.D = 0L;
        nkVar2.y = ekVar2;
        zk0Var.setItemAnimator(null);
        addView(zk0Var, h7.z5.e(-1, -1, 51));
        zk0Var.setOnScrollListener(new ag.z2(this, 29));
        final int i21 = 1;
        zk0Var.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.gk
            public final /* synthetic */ tk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.pk0
            public final void a(int i212, View view2) {
                switch (i21) {
                    case 0:
                        tk.N(this.b, rnVar, c6Var, i212);
                        break;
                    default:
                        tk.O(this.b, rnVar, c6Var, i212);
                        break;
                }
            }
        });
        f0();
    }

    public static void K(tk tkVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        tkVar.D = iMap;
        iMap.setOnMapLoadedCallback(new dk(tkVar, 3));
        if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, tkVar.a)) < 0.721f) {
            tkVar.Q = true;
            tkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (tkVar.D == null) {
            return;
        }
        Location location = new Location("network");
        tkVar.n0 = location;
        location.setLatitude(20.659322d);
        tkVar.n0.setLongitude(-11.40625d);
        try {
            tkVar.D.setMyLocationEnabled(true);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        tkVar.D.getUiSettings().setMyLocationButtonEnabled(false);
        tkVar.D.getUiSettings().setZoomControlsEnabled(false);
        tkVar.D.getUiSettings().setCompassEnabled(false);
        tkVar.D.setOnCameraMoveStartedListener(new ek(tkVar, 4));
        tkVar.D.setOnCameraIdleListener(new dk(tkVar, 5));
        tkVar.D.setOnMyLocationChangeListener(new kk(tkVar, 1));
        tkVar.D.setOnMarkerClickListener(new ek(tkVar, 5));
        tkVar.D.setOnCameraMoveListener(new dk(tkVar, 6));
        tkVar.Z();
        AndroidUtilities.runOnUIThread(new dk(tkVar, 7), 200L);
        if (tkVar.R && tkVar.getParentActivity() != null) {
            tkVar.R = false;
            Activity parentActivity = tkVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tkVar.getParentActivity(), 0, tkVar.a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L5, tkVar.a), null);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new ek(tkVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        tkVar.e0();
    }

    public static /* synthetic */ void L(tk tkVar, org.telegram.ui.rn rnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.c6 c6Var, Long l10) {
        if (rnVar != null && rnVar.c()) {
            y4.M(tkVar.getParentActivity(), rnVar.a(), new ag.l0(tkVar, tL_messageMediaGeo, l10, 24), c6Var);
        } else {
            tkVar.t0.d(tL_messageMediaGeo, tkVar.u0, true, 0, l10.longValue());
            tkVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void M(tk tkVar) {
        int i10;
        Activity parentActivity;
        pf.h0 h0Var = tkVar.K;
        gi giVar = tkVar.b;
        if (!tkVar.f0 || (i10 = Build.VERSION.SDK_INT) < 23 || (parentActivity = tkVar.getParentActivity()) == null) {
            return;
        }
        tkVar.f0 = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            String[] strArr = (!giVar.K || giVar.s2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            tkVar.S = true;
            if (h0Var != null) {
                h0Var.O(tkVar.T, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i10 < 29 || !giVar.K || giVar.s2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        tkVar.S = true;
        if (h0Var != null) {
            h0Var.O(tkVar.T, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public static /* synthetic */ void N(tk tkVar, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        tk tkVar2;
        org.telegram.ui.rn rnVar2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = tkVar.V;
        pf.h0 h0Var = tkVar.K;
        gi giVar = tkVar.b;
        int i11 = tkVar.u0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.Z) != null) {
                tkVar.t0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                giVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.a0) != null) {
                tkVar.t0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                giVar.dismiss(true);
                return;
            } else {
                tkVar2 = tkVar;
                rnVar2 = rnVar;
                c6Var2 = c6Var;
            }
        } else {
            if (i10 == 1) {
                if (tkVar.t0 == null || tkVar.n0 == null) {
                    if (tkVar.T) {
                        y4.D(tkVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = tkVar.e0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tkVar.n0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(tkVar.n0.getLongitude());
                y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new cg.e1(tkVar, rnVar, tL_messageMediaGeo, c6Var, 7));
                return;
            }
            tkVar2 = tkVar;
            rnVar2 = rnVar;
            c6Var2 = c6Var;
            if (i10 == 2 && i11 == 1) {
                if (tkVar2.getLocationController().isSharingLocation(j10)) {
                    tkVar2.getLocationController().removeSharingLocation(j10);
                    giVar.dismiss(true);
                    return;
                } else if (tkVar2.m0 == null && tkVar2.T) {
                    y4.D(tkVar2.getParentActivity()).show();
                    return;
                } else {
                    tkVar2.Y();
                    return;
                }
            }
        }
        Object J = h0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new cg.e1(tkVar2, rnVar2, (TLRPC.TL_messageMediaVenue) J, c6Var2, 8));
        }
    }

    public static /* synthetic */ void O(tk tkVar, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = tkVar.N.I(i10);
        if (I == null || tkVar.t0 == null) {
            return;
        }
        if (rnVar != null && rnVar.c()) {
            y4.M(tkVar.getParentActivity(), rnVar.a(), new jk(tkVar, I, 0), c6Var);
        } else {
            tkVar.t0.d(I, tkVar.u0, true, 0, 0L);
            tkVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void P(tk tkVar, org.telegram.ui.rn rnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.c6 c6Var) {
        if (rnVar != null && rnVar.c()) {
            y4.M(tkVar.getParentActivity(), rnVar.a(), new jk(tkVar, tL_messageMediaVenue, 1), c6Var);
        } else {
            tkVar.t0.d(tL_messageMediaVenue, tkVar.u0, true, 0, 0L);
            tkVar.b.dismiss(true);
        }
    }

    public static void Q(tk tkVar) {
        Activity parentActivity;
        pf.h0 h0Var = tkVar.K;
        ImageView imageView = tkVar.n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = tkVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            y4.D(tkVar.getParentActivity()).show();
            return;
        }
        if (tkVar.m0 != null && tkVar.D != null) {
            int i10 = org.telegram.ui.ActionBar.g6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, tkVar.a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            h0Var.L(null);
            tkVar.q0 = false;
            tkVar.d0(false);
            tkVar.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(tkVar.m0.getLatitude(), tkVar.m0.getLongitude())));
            if (tkVar.r0) {
                Location location = tkVar.m0;
                if (location != null && tkVar.u0 != 8) {
                    h0Var.H(null, location, true);
                }
                tkVar.r0 = false;
                tkVar.c0();
            }
        }
        if (tkVar.c0 != null) {
            tkVar.O.setVisibility(0);
            qk qkVar = tkVar.B;
            IMapsProvider.IMarker iMarker = tkVar.c0;
            HashMap hashMap = qkVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                qkVar.removeView(view);
                hashMap.remove(iMarker);
            }
            tkVar.c0 = null;
            tkVar.d0 = null;
            tkVar.e0 = null;
        }
    }

    public static /* synthetic */ void R(tk tkVar, Location location) {
        int i10;
        gi giVar = tkVar.b;
        if (giVar == null || giVar.b0 == null) {
            return;
        }
        tkVar.a0(location);
        pf.h0 h0Var = tkVar.K;
        if (h0Var != null && (((i10 = tkVar.u0) == 7 || i10 == 8) && !tkVar.q0)) {
            h0Var.L(tkVar.n0);
        }
        tkVar.getLocationController().setMapLocation(location, tkVar.U);
        tkVar.U = false;
    }

    public static /* synthetic */ void S(tk tkVar, IMapsProvider.IMapView iMapView) {
        if (tkVar.E == null || tkVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            tkVar.E.getMapAsync(new kk(tkVar, 0));
            tkVar.k0 = true;
            if (tkVar.l0) {
                tkVar.E.onResume();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static /* synthetic */ void T(tk tkVar) {
        if (tkVar.getParentActivity() == null) {
            return;
        }
        try {
            tkVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        org.telegram.ui.ActionBar.n2 n2Var;
        gi giVar = this.b;
        if (giVar == null || (n2Var = giVar.b0) == null) {
            return null;
        }
        return n2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.b0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.yh
    public final void B() {
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

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
        gi giVar = this.b;
        giVar.T0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.E.getView().getParent() == null) {
            View view = this.E.getView();
            FrameLayout.LayoutParams e9 = h7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.v0, 51);
            ag.p1 p1Var = this.J;
            p1Var.addView(view, 0, e9);
            p1Var.addView(this.B, 1, h7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.v0, 51));
            p1Var.addView(this.I, 2, h7.z5.c(-1.0f, -1));
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        W();
        AndroidUtilities.runOnUIThread(new dk(this, 1), giVar.V1.s() ? 200L : 0L);
        this.P.h1(0, 0);
        e0();
    }

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        this.L.x0(0);
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean J() {
        return !this.T;
    }

    public final Bitmap V(int i10) {
        Bitmap[] bitmapArr = this.z0;
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
            paint.setColor(org.telegram.ui.Cells.r4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final void W() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.E == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int i10 = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int dp = AndroidUtilities.dp(66.0f);
        int i11 = this.u0;
        if (i11 == 1 || i11 == 7 || i11 == 8) {
            dp += AndroidUtilities.dp(66.0f);
        }
        int dp2 = (i10 - dp) - AndroidUtilities.dp(90.0f);
        int dp3 = AndroidUtilities.dp(189.0f);
        this.v0 = dp3;
        if (!this.T || !X()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.w0 = Math.max(dp3, dp2);
        if (this.T && X()) {
            this.v0 = this.w0;
        }
        hh.f1 f1Var = this.L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        f1Var.setLayoutParams(layoutParams2);
        ag.p1 p1Var = this.J;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p1Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.w0;
        p1Var.setLayoutParams(layoutParams3);
        zk0 zk0Var = this.M;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) zk0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        zk0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.T && X()) ? this.v0 - f1Var.getPaddingTop() : this.v0);
        pf.h0 h0Var = this.K;
        h0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.E.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.w0;
            this.E.getView().setLayoutParams(layoutParams5);
        }
        qk qkVar = this.B;
        if (qkVar != null && (layoutParams = (FrameLayout.LayoutParams) qkVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.w0;
            qkVar.setLayoutParams(layoutParams);
        }
        h0Var.l();
        e0();
    }

    public final boolean X() {
        int i10 = this.u0;
        return i10 == 0 || i10 == 1;
    }

    public final void Y() {
        Activity parentActivity;
        if (this.t0 == null || getParentActivity() == null || this.m0 == null) {
            return;
        }
        boolean z10 = this.g0;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.g0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                y4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new dk(this, 2), c6Var).o();
                return;
            }
        }
        long j10 = this.V;
        y4.E(getParentActivity(), false, DialogObject.isUserDialog(j10) ? this.b.b0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.hk
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                tk tkVar = tk.this;
                gi giVar = tkVar.b;
                y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new lh.o6(tkVar, i10, 2));
            }
        }, c6Var).show();
    }

    public final void Z() {
        tk tkVar;
        gi giVar = this.b;
        if (!giVar.K) {
            Location lastLocation = getLastLocation();
            this.m0 = lastLocation;
            a0(lastLocation);
            return;
        }
        if (giVar.t2 != null) {
            AndroidUtilities.runOnUIThread(new dk(this, 0));
            return;
        }
        if (this.T) {
            AndroidUtilities.runOnUIThread(new dk(this, 8));
            return;
        }
        File file = giVar.s2;
        boolean z10 = giVar.r2;
        if (file != null) {
            if (!z10) {
                tkVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(22, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                tkVar.m0 = lastLocation2;
                a0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        tkVar = this;
        Location lastLocation22 = getLastLocation();
        tkVar.m0 = lastLocation22;
        a0(lastLocation22);
    }

    public final void a0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.m0 = location2;
        IMapsProvider.IMap iMap = this.D;
        pf.h0 h0Var = this.K;
        if (iMap == null) {
            h0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (h0Var != null) {
            if (!this.r0 && this.u0 != 8) {
                h0Var.H(null, this.m0, true);
            }
            h0Var.M(this.m0);
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

    public final void b0(double d, double d10) {
        if (this.D == null) {
            return;
        }
        if (d == 0.0d || d10 == 0.0d) {
            Location location = new Location("");
            this.m0 = location;
            location.reset();
            this.m0.setLatitude(d);
            this.m0.setLongitude(d10);
        } else {
            Location location2 = new Location("");
            this.n0 = location2;
            location2.reset();
            this.n0.setLatitude(d);
            this.n0.setLongitude(d10);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom = (d == 0.0d || d10 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f);
        this.F = newCameraUpdateLatLngZoom;
        this.D.moveCamera(newCameraUpdateLatLngZoom);
        pf.h0 h0Var = this.K;
        if (d == 0.0d || d10 == 0.0d) {
            h0Var.M(this.m0);
        } else {
            h0Var.L(this.n0);
        }
        h0Var.I();
        this.L.v0(0, 1, null);
        this.p0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.q0 = true;
        d0(false);
        if (this.u0 != 8) {
            h0Var.H(null, this.n0, true);
        }
        this.r0 = true;
        c0();
    }

    public final void c0() {
        if (this.K.h() != 0 && this.P.L0() == 0) {
            hh.f1 f1Var = this.L;
            View childAt = f1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            f1Var.v0(0, top, null);
        }
    }

    public final void d0(boolean z10) {
        Location location;
        Location location2;
        if (this.T) {
            z10 = false;
        }
        rk rkVar = this.s;
        if (z10 && rkVar != null && rkVar.getTag() == null && ((location = this.m0) == null || (location2 = this.n0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.u0 == 8) {
            z10 = false;
        }
        if (rkVar != null) {
            if (!z10 || rkVar.getTag() == null) {
                if (z10 || rkVar.getTag() != null) {
                    rkVar.setVisibility(z10 ? 0 : 4);
                    rkVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rkVar, (Property<rk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(er.g);
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
        nk nkVar = this.N;
        pf.h0 h0Var = this.K;
        int i13 = 0;
        if (i10 == i12) {
            this.T = false;
            this.S = false;
            Z();
            if (h0Var != null) {
                h0Var.O(this.T, this.S);
            }
            if (nkVar != null && nkVar.I != (z11 = this.T)) {
                nkVar.I = z11;
            }
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.T = true;
            this.S = false;
            if (h0Var != null) {
                h0Var.O(true, false);
            }
            if (nkVar != null && nkVar.I != (z10 = this.T)) {
                nkVar.I = z10;
            }
        }
        W();
        boolean z12 = this.T;
        gi giVar = this.b;
        if (!z12 || giVar.K) {
            giVar.getClass();
        } else {
            i13 = 8;
        }
        this.A.setVisibility(i13);
    }

    public final void e0() {
        ag.p1 p1Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.E == null || (p1Var = this.J) == null) {
            return;
        }
        hh.f1 f1Var = this.L;
        f2.o1 K = f1Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.v0;
        } else {
            i10 = -p1Var.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) p1Var.getLayoutParams()) != null) {
            qk qkVar = this.B;
            if (i11 <= 0) {
                if (this.E.getView().getVisibility() == 0) {
                    this.E.getView().setVisibility(4);
                    p1Var.setVisibility(4);
                    if (qkVar != null) {
                        qkVar.setVisibility(4);
                    }
                }
                this.E.getView().setTranslationY(i10);
                return;
            }
            if (this.E.getView().getVisibility() == 4) {
                this.E.getView().setVisibility(0);
                p1Var.setVisibility(0);
                if (qkVar != null) {
                    qkVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.w0) + this.v0)) / 2);
            int i12 = this.w0 - this.v0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (f1Var.getPaddingTop() - i10) / (f1Var.getPaddingTop() - i12)));
            int i13 = this.x0;
            if (this.T && X()) {
                i12 += Math.min(i10, f1Var.getPaddingTop());
            }
            this.x0 = (int) (i12 * max2);
            float f10 = max;
            this.E.getView().setTranslationY(f10);
            this.y0 = i12 - this.x0;
            p1Var.invalidate();
            p1Var.setTranslationY(i10 - this.y0);
            IMapsProvider.IMap iMap2 = this.D;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.x0);
            }
            if (qkVar != null) {
                qkVar.setTranslationY(f10);
            }
            int max3 = Math.max(this.y0 - i10, 0);
            int i14 = this.w0;
            org.telegram.ui.ActionBar.v0 v0Var = this.r;
            float min = Math.min(max3, (i14 - v0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            v0Var.setTranslationY(min);
            rk rkVar = this.s;
            rkVar.c = min;
            rkVar.setTranslationY(min + rkVar.b);
            this.n.setTranslationY(-this.x0);
            int C = org.telegram.messenger.rl.C(48.0f, (this.w0 - this.x0) / 2, max);
            this.o0 = C;
            this.O.setTranslationY(C);
            if (i13 != this.x0) {
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
            if (this.T && X()) {
                int h = this.K.h();
                for (int i15 = 1; i15 < h; i15++) {
                    f2.o1 K2 = f1Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(f1Var.getPaddingTop() - i10);
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.h0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.j0;
        zk0 zk0Var = this.M;
        if (!z11) {
            zk0Var.setEmptyView(linearLayout);
        } else {
            zk0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.yh
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        hh.f1 f1Var = this.L;
        if (f1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        lk0 lk0Var = (lk0) f1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (lk0Var != null ? Math.max(((int) lk0Var.a.getY()) - this.y0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
    public int getListTopPadding() {
        return this.L.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.yh
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        s6 s6Var = new s6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.h5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        hh.f1 f1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.v0 v0Var = this.A;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        int i11 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.ui;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, s6Var, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.pi));
        int i17 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 131072, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 196608, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        zk0 zk0Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 32, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.yh
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.yh
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.C = true;
        ag.p1 p1Var = this.J;
        if (p1Var != null) {
            p1Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
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
        pf.h0 h0Var = this.K;
        if (h0Var != null) {
            h0Var.F();
        }
        nk nkVar = this.N;
        if (nkVar != null) {
            nkVar.F();
        }
        gi giVar = this.b;
        giVar.T0.h(true);
        giVar.T0.n().removeView(this.A);
    }

    @Override // org.telegram.ui.Components.yh
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

    @Override // org.telegram.ui.Components.yh
    public final void s() {
        this.A.setVisibility(8);
    }

    public void setDelegate(ok okVar) {
        this.t0 = okVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        e0();
    }

    @Override // org.telegram.ui.Components.yh
    public final void w() {
        gi giVar = this.b;
        this.K.Y = (giVar == null || giVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.yh
    public final void x(int i10, boolean z10) {
        if (z10) {
            this.K.Y = false;
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void y() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.k0) {
            try {
                iMapView.onPause();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        this.l0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i10, int i11) {
        int i12;
        int i13;
        gi giVar = this.b;
        if (giVar.T0.j0 || giVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = this.w0 - this.v0;
            giVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i13 = (int) (i11 / 3.5f);
                    i12 = i13 - AndroidUtilities.dp(52.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    giVar.setAllowNestedScroll(true);
                }
            }
            i13 = (i11 / 5) * 2;
            i12 = i13 - AndroidUtilities.dp(52.0f);
            if (i12 < 0) {
            }
            giVar.setAllowNestedScroll(true);
        }
        this.L.o1(0, i12, 0, this.e);
        this.M.o1(0, 0, 0, this.e);
    }
}
