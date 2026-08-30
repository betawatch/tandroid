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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class al extends di implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int B0 = 0;
    public final Bitmap[] A0;
    public final org.telegram.ui.ActionBar.w0 B;
    public final xk C;
    public boolean D;
    public IMapsProvider.IMap E;
    public IMapsProvider.IMapView F;
    public IMapsProvider.ICameraUpdate G;
    public float H;
    public boolean I;
    public final View J;
    public final dg.u2 K;
    public final tf.h0 L;
    public final lh.e1 M;
    public final sl0 N;
    public final tk O;
    public final ImageView P;
    public final ej Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint a0;
    public final ArrayList b0;
    public AnimatorSet c0;
    public IMapsProvider.IMarker d0;
    public zk e0;
    public FrameLayout f0;
    public boolean g0;
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
    public final yk s;
    public boolean s0;
    public boolean t0;
    public uk u0;
    public final LinearLayout v;
    public final int v0;
    public final ImageView w;
    public int w0;
    public final TextView x;
    public int x0;
    public final TextView y;
    public int y0;
    public int z0;

    public al(li liVar, Context context, final org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, liVar);
        int i10;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.a0 = new Paint();
        this.b0 = new ArrayList();
        this.g0 = true;
        this.h0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.w0 = currentActionBarHeight;
        this.x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        li liVar2 = this.b;
        org.telegram.ui.ActionBar.p2 p2Var = liVar2.c0;
        final org.telegram.ui.xn xnVar = p2Var instanceof org.telegram.ui.xn ? (org.telegram.ui.xn) p2Var : null;
        long n12 = liVar2.n1();
        this.W = n12;
        if (this.b.L) {
            this.v0 = 7;
        } else if (!z4 || xnVar == null || xnVar.h != null || xnVar.c() || UserObject.isUserSelf(xnVar.i())) {
            this.v0 = 0;
        } else {
            this.v0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.j0 = false;
        this.i0 = false;
        this.k0 = false;
        tf.h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.F();
        }
        tk tkVar = this.O;
        if (tkVar != null) {
            tkVar.F();
        }
        this.U = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z n10 = this.b.U0.n();
        this.C = new xk(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.fb(this, 5);
        this.B = a2;
        if (!this.U || this.b.L) {
            this.b.getClass();
            i10 = 0;
        } else {
            i10 = 8;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        dg.u2 u2Var = new dg.u2(this, context, 15);
        this.K = u2Var;
        u2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new ef.g(org.telegram.ui.ActionBar.j6.A0().q()));
        yk ykVar = new yk(context, 0);
        this.s = ykVar;
        ykVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        ykVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.j6.wi;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.j6.xi;
        int v03 = org.telegram.ui.ActionBar.j6.v0(i13, this.a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03);
        k7.d6.a(ykVar);
        ykVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        gg.j1 j1Var = lf.q0.a;
        ykVar.setOutlineProvider(j1Var);
        ykVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        ykVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.a));
        ykVar.setTextSize(1, 14.0f);
        ykVar.setTypeface(AndroidUtilities.bold());
        ykVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        ykVar.setGravity(17);
        ykVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        u2Var.addView(ykVar, k7.b6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 1;
        ykVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        al.Q(this.b);
                        break;
                    case 1:
                        al alVar = this.b;
                        alVar.d0(false);
                        alVar.L.H(null, alVar.o0, true);
                        alVar.s0 = true;
                        alVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, this.a), false, f6Var);
        this.r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), f6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), f6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), f6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.a), org.telegram.ui.ActionBar.j6.v0(i13, this.a));
        k7.d6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(j1Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        u2Var.addView(w0Var, k7.b6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 2;
        w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        al.Q(this.b);
                        break;
                    case 1:
                        al alVar = this.b;
                        alVar.d0(false);
                        alVar.L.H(null, alVar.o0, true);
                        alVar.s0 = true;
                        alVar.c0();
                        break;
                    default:
                        this.b.r.M(null, null);
                        break;
                }
            }
        });
        w0Var.setDelegate(new kk(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.a), org.telegram.ui.ActionBar.j6.v0(i13, this.a));
        k7.d6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(j1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.j6.v0(i14, this.a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        u2Var.addView(imageView, k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        al.Q(this.b);
                        break;
                    case 1:
                        al alVar = this.b;
                        alVar.d0(false);
                        alVar.L.H(null, alVar.o0, true);
                        alVar.s0 = true;
                        alVar.c0();
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
        addView(linearLayout, k7.b6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new oh.d(15));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.a), mode));
        linearLayout.addView(imageView2, k7.b6.n(-2, -2));
        TextView textView = new TextView(context);
        this.x = textView;
        int i18 = org.telegram.ui.ActionBar.j6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, this.a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView j10 = org.telegram.ui.yh.j(linearLayout, textView, k7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.y = j10;
        j10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, this.a));
        j10.setGravity(17);
        j10.setTextSize(1, 15.0f);
        j10.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(j10, k7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 11);
        this.M = e1Var;
        this.c = e1Var;
        this.d = e1Var;
        this.f = true;
        e1Var.setClipToPadding(false);
        tf.h0 h0Var2 = new tf.h0(context, this.v0, n12, true, f6Var, this.b.L, false, false);
        this.L = h0Var2;
        e1Var.setAdapter(h0Var2);
        li liVar3 = this.b;
        h0Var2.c0 = liVar3 != null && (liVar3.E || liVar3.M);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(nr.h);
        lVar.C = false;
        lVar.m = false;
        e1Var.setItemAnimator(lVar);
        h0Var2.O(this.U, this.T);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.p1();
        ej ejVar = new ej(this, e1Var);
        this.Q = ejVar;
        e1Var.setLayoutManager(ejVar);
        addView(e1Var, k7.b6.e(-1, -1, 51));
        e1Var.setOnScrollListener(new sk(this));
        final int i19 = 0;
        e1Var.setOnItemClickListener(new il0(this) { // from class: org.telegram.ui.Components.mk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i20, View view2) {
                switch (i19) {
                    case 0:
                        al.N(this.b, xnVar, f6Var, i20);
                        break;
                    default:
                        al.O(this.b, xnVar, f6Var, i20);
                        break;
                }
            }
        });
        kk kkVar = new kk(this, 1);
        h0Var2.E = n12;
        h0Var2.y = kkVar;
        h0Var2.P(AndroidUtilities.dp(16.0f) + this.w0);
        addView(u2Var, k7.b6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.F = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new kk(this, 2));
        this.F.setOnInterceptTouchEventInterceptor(new kk(this, 3));
        new Thread(new ok(this, this.F, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        u2Var.addView(imageView3, k7.b6.e(28, 48, 49));
        sl0 sl0Var = new sl0(context, f6Var);
        this.N = sl0Var;
        sl0Var.setSections(true);
        sl0Var.setClipToPadding(false);
        sl0Var.setVisibility(8);
        sl0Var.setLayoutManager(new f2.i0(1, false));
        tk tkVar2 = new tk(this, context, f6Var, this.b.L);
        this.O = tkVar2;
        boolean z10 = this.U;
        if (tkVar2.J != z10) {
            tkVar2.J = z10;
        }
        kk kkVar2 = new kk(this, 7);
        tkVar2.E = 0L;
        tkVar2.y = kkVar2;
        sl0Var.setItemAnimator(null);
        addView(sl0Var, k7.b6.e(-1, -1, 51));
        sl0Var.setOnScrollListener(new eg.f2(this, 22));
        final int i20 = 1;
        sl0Var.setOnItemClickListener(new il0(this) { // from class: org.telegram.ui.Components.mk
            public final /* synthetic */ al b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i202, View view2) {
                switch (i20) {
                    case 0:
                        al.N(this.b, xnVar, f6Var, i202);
                        break;
                    default:
                        al.O(this.b, xnVar, f6Var, i202);
                        break;
                }
            }
        });
        f0();
    }

    public static void J(al alVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        alVar.E = iMap;
        iMap.setOnMapLoadedCallback(new jk(alVar, 3));
        if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, alVar.a)) < 0.721f) {
            alVar.R = true;
            alVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (alVar.E == null) {
            return;
        }
        Location location = new Location("network");
        alVar.o0 = location;
        location.setLatitude(20.659322d);
        alVar.o0.setLongitude(-11.40625d);
        try {
            alVar.E.setMyLocationEnabled(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        alVar.E.getUiSettings().setMyLocationButtonEnabled(false);
        alVar.E.getUiSettings().setZoomControlsEnabled(false);
        alVar.E.getUiSettings().setCompassEnabled(false);
        alVar.E.setOnCameraMoveStartedListener(new kk(alVar, 4));
        alVar.E.setOnCameraIdleListener(new jk(alVar, 5));
        alVar.E.setOnMyLocationChangeListener(new qk(alVar, 1));
        alVar.E.setOnMarkerClickListener(new kk(alVar, 5));
        alVar.E.setOnCameraMoveListener(new jk(alVar, 6));
        alVar.Z();
        AndroidUtilities.runOnUIThread(new jk(alVar, 7), 200L);
        if (alVar.S && alVar.getParentActivity() != null) {
            alVar.S = false;
            Activity parentActivity = alVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(alVar.getParentActivity(), 0, alVar.a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L5, alVar.a), null);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new kk(alVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        alVar.e0();
    }

    public static /* synthetic */ void K(al alVar, org.telegram.ui.xn xnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.f6 f6Var, Long l10) {
        if (xnVar != null && xnVar.c()) {
            z4.M(alVar.getParentActivity(), xnVar.a(), new androidx.car.app.utils.a(alVar, tL_messageMediaGeo, l10, 20), f6Var);
        } else {
            alVar.u0.d(tL_messageMediaGeo, alVar.v0, true, 0, l10.longValue());
            alVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void M(al alVar) {
        int i10;
        Activity parentActivity;
        tf.h0 h0Var = alVar.L;
        li liVar = alVar.b;
        if (!alVar.g0 || (i10 = Build.VERSION.SDK_INT) < 23 || (parentActivity = alVar.getParentActivity()) == null) {
            return;
        }
        alVar.g0 = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            String[] strArr = (!liVar.L || liVar.t2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            alVar.T = true;
            if (h0Var != null) {
                h0Var.O(alVar.U, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i10 < 29 || !liVar.L || liVar.t2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        alVar.T = true;
        if (h0Var != null) {
            h0Var.O(alVar.U, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public static /* synthetic */ void N(al alVar, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        al alVar2;
        org.telegram.ui.xn xnVar2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = alVar.W;
        tf.h0 h0Var = alVar.L;
        li liVar = alVar.b;
        int i11 = alVar.v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.a0) != null) {
                alVar.u0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                liVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.b0) != null) {
                alVar.u0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                liVar.dismiss(true);
                return;
            } else {
                alVar2 = alVar;
                xnVar2 = xnVar;
                f6Var2 = f6Var;
            }
        } else {
            if (i10 == 1) {
                if (alVar.u0 == null || alVar.o0 == null) {
                    if (alVar.U) {
                        z4.D(alVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = alVar.f0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(alVar.o0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(alVar.o0.getLongitude());
                z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new gg.c1(alVar, xnVar, tL_messageMediaGeo, f6Var, 7));
                return;
            }
            alVar2 = alVar;
            xnVar2 = xnVar;
            f6Var2 = f6Var;
            if (i10 == 2 && i11 == 1) {
                if (alVar2.getLocationController().isSharingLocation(j10)) {
                    alVar2.getLocationController().removeSharingLocation(j10);
                    liVar.dismiss(true);
                    return;
                } else if (alVar2.n0 == null && alVar2.U) {
                    z4.D(alVar2.getParentActivity()).show();
                    return;
                } else {
                    alVar2.Y();
                    return;
                }
            }
        }
        Object J = h0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new gg.c1(alVar2, xnVar2, (TLRPC.TL_messageMediaVenue) J, f6Var2, 8));
        }
    }

    public static /* synthetic */ void O(al alVar, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = alVar.O.I(i10);
        if (I == null || alVar.u0 == null) {
            return;
        }
        if (xnVar != null && xnVar.c()) {
            z4.M(alVar.getParentActivity(), xnVar.a(), new pk(alVar, I, 0), f6Var);
        } else {
            alVar.u0.d(I, alVar.v0, true, 0, 0L);
            alVar.b.dismiss(true);
        }
    }

    public static /* synthetic */ void P(al alVar, org.telegram.ui.xn xnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.f6 f6Var) {
        if (xnVar != null && xnVar.c()) {
            z4.M(alVar.getParentActivity(), xnVar.a(), new pk(alVar, tL_messageMediaVenue, 1), f6Var);
        } else {
            alVar.u0.d(tL_messageMediaVenue, alVar.v0, true, 0, 0L);
            alVar.b.dismiss(true);
        }
    }

    public static void Q(al alVar) {
        Activity parentActivity;
        tf.h0 h0Var = alVar.L;
        ImageView imageView = alVar.n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = alVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z4.D(alVar.getParentActivity()).show();
            return;
        }
        if (alVar.n0 != null && alVar.E != null) {
            int i10 = org.telegram.ui.ActionBar.j6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, alVar.a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            h0Var.L(null);
            alVar.r0 = false;
            alVar.d0(false);
            alVar.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(alVar.n0.getLatitude(), alVar.n0.getLongitude())));
            if (alVar.s0) {
                Location location = alVar.n0;
                if (location != null && alVar.v0 != 8) {
                    h0Var.H(null, location, true);
                }
                alVar.s0 = false;
                alVar.c0();
            }
        }
        if (alVar.d0 != null) {
            alVar.P.setVisibility(0);
            xk xkVar = alVar.C;
            IMapsProvider.IMarker iMarker = alVar.d0;
            HashMap hashMap = xkVar.a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                xkVar.removeView(view);
                hashMap.remove(iMarker);
            }
            alVar.d0 = null;
            alVar.e0 = null;
            alVar.f0 = null;
        }
    }

    public static /* synthetic */ void R(al alVar, Location location) {
        int i10;
        li liVar = alVar.b;
        if (liVar == null || liVar.c0 == null) {
            return;
        }
        alVar.a0(location);
        tf.h0 h0Var = alVar.L;
        if (h0Var != null && (((i10 = alVar.v0) == 7 || i10 == 8) && !alVar.r0)) {
            h0Var.L(alVar.o0);
        }
        alVar.getLocationController().setMapLocation(location, alVar.V);
        alVar.V = false;
    }

    public static /* synthetic */ void S(al alVar, IMapsProvider.IMapView iMapView) {
        if (alVar.F == null || alVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            alVar.F.getMapAsync(new qk(alVar, 0));
            alVar.l0 = true;
            if (alVar.m0) {
                alVar.F.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void T(al alVar) {
        if (alVar.getParentActivity() == null) {
            return;
        }
        try {
            alVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.b.c0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.b.c0.getMessagesController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.p2 p2Var;
        li liVar = this.b;
        if (liVar == null || (p2Var = liVar.c0) == null) {
            return null;
        }
        return p2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.b.c0.getUserConfig();
    }

    @Override // org.telegram.ui.Components.di
    public final void A() {
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
    }

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
        li liVar = this.b;
        liVar.U0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.F.getView().getParent() == null) {
            View view = this.F.getView();
            FrameLayout.LayoutParams e = k7.b6.e(-1, AndroidUtilities.dp(10.0f) + this.w0, 51);
            dg.u2 u2Var = this.K;
            u2Var.addView(view, 0, e);
            u2Var.addView(this.C, 1, k7.b6.e(-1, AndroidUtilities.dp(10.0f) + this.w0, 51));
            u2Var.addView(this.J, 2, k7.b6.c(-1.0f, -1));
        }
        this.B.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
        IMapsProvider.IMap iMap = this.E;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        W();
        AndroidUtilities.runOnUIThread(new jk(this, 1), liVar.W1.k() ? 200L : 0L);
        this.Q.h1(0, 0);
        e0();
    }

    @Override // org.telegram.ui.Components.di
    public final void F() {
        this.M.x0(0);
    }

    @Override // org.telegram.ui.Components.di
    public final boolean I() {
        return !this.U;
    }

    public final Bitmap V(int i10) {
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
        if (getMeasuredHeight() == 0 || this.F == null) {
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
        if (!this.U || !X()) {
            dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
        }
        this.x0 = Math.max(dp3, dp2);
        if (this.U && X()) {
            this.w0 = this.x0;
        }
        lh.e1 e1Var = this.M;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        e1Var.setLayoutParams(layoutParams2);
        dg.u2 u2Var = this.K;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) u2Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.x0;
        u2Var.setLayoutParams(layoutParams3);
        sl0 sl0Var = this.N;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) sl0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        sl0Var.setLayoutParams(layoutParams4);
        int dp4 = AndroidUtilities.dp(16.0f) + ((this.U && X()) ? this.w0 - e1Var.getPaddingTop() : this.w0);
        tf.h0 h0Var = this.L;
        h0Var.P(dp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.F.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.x0;
            this.F.getView().setLayoutParams(layoutParams5);
        }
        xk xkVar = this.C;
        if (xkVar != null && (layoutParams = (FrameLayout.LayoutParams) xkVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.x0;
            xkVar.setLayoutParams(layoutParams);
        }
        h0Var.l();
        e0();
    }

    public final boolean X() {
        int i10 = this.v0;
        return i10 == 0 || i10 == 1;
    }

    public final void Y() {
        Activity parentActivity;
        if (this.u0 == null || getParentActivity() == null || this.n0 == null) {
            return;
        }
        boolean z4 = this.h0;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        if (z4 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.h0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                z4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new jk(this, 2), f6Var).o();
                return;
            }
        }
        long j10 = this.W;
        z4.E(getParentActivity(), false, DialogObject.isUserDialog(j10) ? this.b.c0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Components.nk
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                al alVar = al.this;
                li liVar = alVar.b;
                z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new org.telegram.ui.Cells.qa(alVar, i10, 1));
            }
        }, f6Var).show();
    }

    public final void Z() {
        al alVar;
        li liVar = this.b;
        if (!liVar.L) {
            Location lastLocation = getLastLocation();
            this.n0 = lastLocation;
            a0(lastLocation);
            return;
        }
        if (liVar.u2 != null) {
            AndroidUtilities.runOnUIThread(new jk(this, 0));
            return;
        }
        if (this.U) {
            AndroidUtilities.runOnUIThread(new jk(this, 8));
            return;
        }
        File file = liVar.t2;
        boolean z4 = liVar.s2;
        if (file != null) {
            if (!z4) {
                alVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.hp(28, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                alVar.n0 = lastLocation2;
                a0(lastLocation2);
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
        alVar = this;
        Location lastLocation22 = getLastLocation();
        alVar.n0 = lastLocation22;
        a0(lastLocation22);
    }

    public final void a0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.n0 = location2;
        IMapsProvider.IMap iMap = this.E;
        tf.h0 h0Var = this.L;
        if (iMap == null) {
            h0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (h0Var != null) {
            if (!this.s0 && this.v0 != 8) {
                h0Var.H(null, this.n0, true);
            }
            h0Var.M(this.n0);
        }
        if (this.r0) {
            return;
        }
        this.o0 = new Location(location);
        if (this.t0) {
            this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
        } else {
            this.t0 = true;
            this.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMaxZoomLevel() - 4.0f));
        }
    }

    public final void b0(double d, double d10) {
        if (this.E == null) {
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
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom = (d == 0.0d || d10 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMaxZoomLevel() - 4.0f);
        this.G = newCameraUpdateLatLngZoom;
        this.E.moveCamera(newCameraUpdateLatLngZoom);
        tf.h0 h0Var = this.L;
        if (d == 0.0d || d10 == 0.0d) {
            h0Var.M(this.n0);
        } else {
            h0Var.L(this.o0);
        }
        h0Var.I();
        this.M.v0(0, 1, null);
        this.q0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.r0 = true;
        d0(false);
        if (this.v0 != 8) {
            h0Var.H(null, this.o0, true);
        }
        this.s0 = true;
        c0();
    }

    public final void c0() {
        if (this.L.h() != 0 && this.Q.L0() == 0) {
            lh.e1 e1Var = this.M;
            View childAt = e1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            e1Var.v0(0, top, null);
        }
    }

    public final void d0(boolean z4) {
        Location location;
        Location location2;
        if (this.U) {
            z4 = false;
        }
        yk ykVar = this.s;
        if (z4 && ykVar != null && ykVar.getTag() == null && ((location = this.n0) == null || (location2 = this.o0) == null || location2.distanceTo(location) < 300.0f)) {
            z4 = false;
        }
        if (this.v0 == 8) {
            z4 = false;
        }
        if (ykVar != null) {
            if (!z4 || ykVar.getTag() == null) {
                if (z4 || ykVar.getTag() != null) {
                    ykVar.setVisibility(z4 ? 0 : 4);
                    ykVar.setTag(z4 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ykVar, (Property<yk, Float>) View.TRANSLATION_X, z4 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(nr.g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        boolean z10;
        int i12 = NotificationCenter.locationPermissionGranted;
        tk tkVar = this.O;
        tf.h0 h0Var = this.L;
        int i13 = 0;
        if (i10 == i12) {
            this.U = false;
            this.T = false;
            Z();
            if (h0Var != null) {
                h0Var.O(this.U, this.T);
            }
            if (tkVar != null && tkVar.J != (z10 = this.U)) {
                tkVar.J = z10;
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.U = true;
            this.T = false;
            if (h0Var != null) {
                h0Var.O(true, false);
            }
            if (tkVar != null && tkVar.J != (z4 = this.U)) {
                tkVar.J = z4;
            }
        }
        W();
        boolean z11 = this.U;
        li liVar = this.b;
        if (!z11 || liVar.L) {
            liVar.getClass();
        } else {
            i13 = 8;
        }
        this.B.setVisibility(i13);
    }

    public final void e0() {
        dg.u2 u2Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.F == null || (u2Var = this.K) == null) {
            return;
        }
        lh.e1 e1Var = this.M;
        f2.l1 K = e1Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.w0;
        } else {
            i10 = -u2Var.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) u2Var.getLayoutParams()) != null) {
            xk xkVar = this.C;
            if (i11 <= 0) {
                if (this.F.getView().getVisibility() == 0) {
                    this.F.getView().setVisibility(4);
                    u2Var.setVisibility(4);
                    if (xkVar != null) {
                        xkVar.setVisibility(4);
                    }
                }
                this.F.getView().setTranslationY(i10);
                return;
            }
            if (this.F.getView().getVisibility() == 4) {
                this.F.getView().setVisibility(0);
                u2Var.setVisibility(0);
                if (xkVar != null) {
                    xkVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.x0) + this.w0)) / 2);
            int i12 = this.x0 - this.w0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (e1Var.getPaddingTop() - i10) / (e1Var.getPaddingTop() - i12)));
            int i13 = this.y0;
            if (this.U && X()) {
                i12 += Math.min(i10, e1Var.getPaddingTop());
            }
            this.y0 = (int) (i12 * max2);
            float f10 = max;
            this.F.getView().setTranslationY(f10);
            this.z0 = i12 - this.y0;
            u2Var.invalidate();
            u2Var.setTranslationY(i10 - this.z0);
            IMapsProvider.IMap iMap2 = this.E;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.y0);
            }
            if (xkVar != null) {
                xkVar.setTranslationY(f10);
            }
            int max3 = Math.max(this.z0 - i10, 0);
            int i14 = this.x0;
            org.telegram.ui.ActionBar.w0 w0Var = this.r;
            float min = Math.min(max3, (i14 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            w0Var.setTranslationY(min);
            yk ykVar = this.s;
            ykVar.c = min;
            ykVar.setTranslationY(min + ykVar.b);
            this.n.setTranslationY(-this.y0);
            int C = org.telegram.ui.b.C(48.0f, (this.x0 - this.y0) / 2, max);
            this.p0 = C;
            this.P.setTranslationY(C);
            if (i13 != this.y0) {
                IMapsProvider.IMarker iMarker = this.d0;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.d0.getPosition().longitude);
                } else if (!this.r0 || (location = this.o0) == null) {
                    Location location2 = this.n0;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.n0.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.o0.getLongitude());
                }
                if (latLng != null && (iMap = this.E) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.U && X()) {
                int h = this.L.h();
                for (int i15 = 1; i15 < h; i15++) {
                    f2.l1 K2 = e1Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(e1Var.getPaddingTop() - i10);
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z4 = this.i0;
        LinearLayout linearLayout = this.v;
        if (!z4) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z10 = this.k0;
        sl0 sl0Var = this.N;
        if (!z10) {
            sl0Var.setEmptyView(linearLayout);
        } else {
            sl0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.di
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        lh.e1 e1Var = this.M;
        if (e1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        el0 el0Var = (el0) e1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (el0Var != null ? Math.max(((int) el0Var.a.getY()) - this.z0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.di
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        t6 t6Var = new t6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.h5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        lh.e1 e1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i11 = org.telegram.ui.ActionBar.j6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.ui;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, t6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, t6Var, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i17 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        sl0 sl0Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.di
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.D = true;
        dg.u2 u2Var = this.K;
        if (u2Var != null) {
            u2Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.F;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.F;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        tf.h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.F();
        }
        tk tkVar = this.O;
        if (tkVar != null) {
            tkVar.F();
        }
        li liVar = this.b;
        liVar.U0.h(true);
        liVar.U0.n().removeView(this.B);
    }

    @Override // org.telegram.ui.Components.di
    public final boolean n() {
        m();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4) {
            W();
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void r() {
        this.B.setVisibility(8);
    }

    public void setDelegate(uk ukVar) {
        this.u0 = ukVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
        e0();
    }

    @Override // org.telegram.ui.Components.di
    public final void v() {
        li liVar = this.b;
        this.L.Z = (liVar == null || liVar.isKeyboardVisible()) ? false : true;
    }

    @Override // org.telegram.ui.Components.di
    public final void w(int i10, boolean z4) {
        if (z4) {
            this.L.Z = false;
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void x() {
        IMapsProvider.IMapView iMapView = this.F;
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
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        int i13;
        li liVar = this.b;
        if (liVar.U0.k0 || liVar.o1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = this.x0 - this.w0;
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i13 = (int) (i11 / 3.5f);
                    i12 = i13 - AndroidUtilities.dp(52.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    liVar.setAllowNestedScroll(true);
                }
            }
            i13 = (i11 / 5) * 2;
            i12 = i13 - AndroidUtilities.dp(52.0f);
            if (i12 < 0) {
            }
            liVar.setAllowNestedScroll(true);
        }
        this.M.o1(0, i12, 0, this.e);
        this.N.o1(0, 0, 0, this.e);
    }
}
