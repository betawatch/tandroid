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
import android.os.Parcel;
import android.os.RemoteException;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bl extends uh implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us {
    public static final /* synthetic */ int B0 = 0;
    public final Bitmap[] A0;
    public final yk D;
    public boolean E;
    public org.telegram.messenger.ga F;
    public org.telegram.messenger.za G;
    public org.telegram.messenger.ua H;
    public float I;
    public boolean J;
    public final View K;
    public final jg.l0 L;
    public final zf.h0 M;
    public final ag.b1 N;
    public final tk0 O;
    public final vk P;
    public final ImageView Q;
    public final ag.d1 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final long a0;
    public final Paint b0;
    public final ArrayList c0;
    public AnimatorSet d0;
    public org.telegram.messenger.fa e0;
    public al f0;
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
    public final org.telegram.ui.ActionBar.t0 r;
    public boolean r0;
    public final zk s;
    public boolean s0;
    public boolean t0;
    public wk u0;
    public final int v0;
    public final LinearLayout w;
    public int w0;
    public final TextView x;
    public int x0;
    public final org.telegram.ui.ActionBar.t0 y;
    public int y0;
    public int z0;

    public bl(bi biVar, Context context, final org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, biVar);
        int i10;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.b0 = new Paint();
        this.c0 = new ArrayList();
        this.h0 = true;
        int currentActionBarHeight = (org.telegram.messenger.i0.q.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(66.0f);
        this.w0 = currentActionBarHeight;
        this.x0 = currentActionBarHeight;
        int i11 = 7;
        this.A0 = new Bitmap[7];
        org.telegram.messenger.i0.a0();
        bi biVar2 = this.b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar2.W1;
        final org.telegram.ui.un unVar = k2Var instanceof org.telegram.ui.un ? (org.telegram.ui.un) k2Var : null;
        long a12 = biVar2.a1();
        this.a0 = a12;
        if (this.b.F1) {
            this.v0 = 7;
        } else if (!z10 || unVar == null || unVar.h != null || unVar.c() || org.telegram.messenger.h20.B(unVar.j())) {
            this.v0 = 0;
        } else {
            this.v0 = 1;
        }
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.v4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.w4);
        this.j0 = false;
        this.i0 = false;
        this.k0 = false;
        zf.h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.F();
        }
        vk vkVar = this.P;
        if (vkVar != null) {
            vkVar.F();
        }
        this.V = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.y p5 = this.b.R2.p();
        this.D = new yk(this, context);
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new ag.l3(this, i11);
        this.y = a2;
        if (!this.V || this.b.F1) {
            this.b.getClass();
            i10 = 0;
        } else {
            i10 = 8;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(searchField, i12, p6Var);
        org.telegram.ui.ActionBar.a7.w(searchField, i12, p6Var);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, p6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(21.0f)).gravity = 83;
        jg.l0 l0Var = new jg.l0(this, context, 13);
        this.L = l0Var;
        l0Var.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new jh.g(org.telegram.ui.ActionBar.t6.D0().q()));
        zk zkVar = new zk(context);
        this.s = zkVar;
        zkVar.setTranslationX(-org.telegram.messenger.i0.L(80.0f));
        zkVar.setVisibility(4);
        int L = org.telegram.messenger.i0.L(40.0f);
        int i13 = org.telegram.ui.ActionBar.t6.kj;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i13, this.a);
        int i14 = org.telegram.ui.ActionBar.t6.lj;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i14, this.a);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
        w7.e6.a(zkVar);
        zkVar.setTranslationZ(org.telegram.messenger.i0.L(2.0f));
        bi.d2 d2Var = rf.e0.a;
        zkVar.setOutlineProvider(d2Var);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
        zkVar.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(zkVar, k02, N, N2, p6Var);
        int i15 = org.telegram.ui.ActionBar.t6.jj;
        org.telegram.ui.ActionBar.a7.V(zkVar, i15, p6Var);
        zkVar.setTextSize(1, 14.0f);
        zkVar.setTypeface(org.telegram.messenger.i0.o());
        zkVar.setText(org.telegram.messenger.cd.L0(2131747237, null));
        zkVar.setGravity(17);
        final int i16 = 0;
        zkVar.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        l0Var.addView(zkVar, w7.b6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        zkVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        bl blVar = this.b;
                        blVar.g0(false);
                        blVar.M.H(null, blVar.o0, true);
                        blVar.s0 = true;
                        blVar.f0();
                        break;
                    default:
                        this.b.r.U(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ij, this.a), false, p6Var);
        this.r = t0Var;
        t0Var.setClickable(true);
        t0Var.setSubMenuOpenSide(2);
        t0Var.setAdditionalXOffset(org.telegram.messenger.i0.L(10.0f));
        t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(10.0f));
        t0Var.d(2, R.drawable.msg_map, null, org.telegram.messenger.cd.L0(2131748705, null), true, false, p6Var);
        t0Var.d(3, R.drawable.msg_satellite, null, org.telegram.messenger.cd.L0(2131745965, null), true, false, p6Var);
        t0Var.d(4, R.drawable.msg_hybrid, null, org.telegram.messenger.cd.L0(2131749284, null), true, false, p6Var);
        t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(40.0f), org.telegram.ui.ActionBar.t6.w0(i13, this.a), org.telegram.ui.ActionBar.t6.w0(i14, this.a));
        w7.e6.a(t0Var);
        t0Var.setTranslationZ(org.telegram.messenger.i0.L(2.0f));
        t0Var.setOutlineProvider(d2Var);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i14);
        t0Var.setBackground(j02);
        org.telegram.ui.ActionBar.a7.k(t0Var, j02, N3, N4, p6Var);
        t0Var.setIcon(R.drawable.msg_map_type);
        l0Var.addView(t0Var, w7.b6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i17 = 1;
        t0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        bl blVar = this.b;
                        blVar.g0(false);
                        blVar.M.H(null, blVar.o0, true);
                        blVar.s0 = true;
                        blVar.f0();
                        break;
                    default:
                        this.b.r.U(null, null);
                        break;
                }
            }
        });
        t0Var.setDelegate(new mk(this, 0));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(40.0f), org.telegram.ui.ActionBar.t6.w0(i13, this.a), org.telegram.ui.ActionBar.t6.w0(i14, this.a));
        w7.e6.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.i0.L(2.0f));
        imageView.setOutlineProvider(d2Var);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i13);
        org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i14);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.a7.k(imageView, j03, N5, N6, p6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i15, p6Var, mode);
        imageView.setTag(Integer.valueOf(i15));
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754831, null));
        l0Var.addView(imageView, w7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new org.telegram.ui.ud(22, this, p6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.b6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new org.telegram.ui.ActionBar.n2(14));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.W5, p6Var, mode);
        linearLayout.addView(imageView2, w7.b6.o(-2, -2));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.t6.X5;
        org.telegram.ui.ActionBar.a7.V(textView, i18, p6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.i0.o());
        sc.e.u(textView, 1, 17.0f, null, 2131748196);
        TextView f7 = org.telegram.messenger.z20.f(linearLayout, textView, w7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.x = f7;
        org.telegram.ui.ActionBar.a7.V(f7, i18, p6Var);
        f7.setGravity(17);
        f7.setTextSize(1, 15.0f);
        f7.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        linearLayout.addView(f7, w7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 11);
        this.N = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.f = true;
        b1Var.setClipToPadding(false);
        zf.h0 h0Var2 = new zf.h0(context, this.v0, a12, true, p6Var, this.b.F1, false, false);
        this.M = h0Var2;
        b1Var.setAdapter(h0Var2);
        bi biVar3 = this.b;
        h0Var2.f0 = biVar3 != null && (biVar3.y1 || biVar3.G1);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(gr.h);
        final int i19 = 0;
        jVar.C = false;
        jVar.m = false;
        b1Var.setItemAnimator(jVar);
        h0Var2.P(this.V, this.U);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.r1();
        ag.d1 d1Var = new ag.d1(this, b1Var);
        this.R = d1Var;
        b1Var.setLayoutManager(d1Var);
        addView(b1Var, w7.b6.e(-1, -1, 51));
        b1Var.setOnScrollListener(new uk(this, i19));
        b1Var.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.nk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i20, View view2) {
                switch (i19) {
                    case 0:
                        bl.Q(this.b, unVar, p6Var, i20);
                        break;
                    default:
                        bl.R(this.b, unVar, p6Var, i20);
                        break;
                }
            }
        });
        mk mkVar = new mk(this, 1);
        h0Var2.H = a12;
        h0Var2.D = mkVar;
        h0Var2.Q(org.telegram.messenger.i0.L(16.0f) + this.w0);
        addView(l0Var, w7.b6.e(-1, -1, 51));
        org.telegram.messenger.za onCreateMapView = ((t7.u) org.telegram.messenger.w0.k()).onCreateMapView(context);
        this.G = onCreateMapView;
        bh.d dVar = (bh.d) onCreateMapView;
        dVar.b = new mk(this, 2);
        int i20 = 6;
        dVar.c = new f2(i20, this, p6Var);
        new Thread(new ok(this, onCreateMapView, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        l0Var.addView(imageView3, w7.b6.e(28, 48, 49));
        tk0 tk0Var = new tk0(context, p6Var);
        this.O = tk0Var;
        tk0Var.setSections(true);
        tk0Var.setClipToPadding(false);
        tk0Var.setVisibility(8);
        tk0Var.setLayoutManager(new s4.a0(1, false));
        vk vkVar2 = new vk(this, context, p6Var, this.b.F1);
        this.P = vkVar2;
        boolean z11 = this.V;
        if (vkVar2.M != z11) {
            vkVar2.M = z11;
        }
        mk mkVar2 = new mk(this, i20);
        vkVar2.H = 0L;
        vkVar2.D = mkVar2;
        tk0Var.setItemAnimator(null);
        addView(tk0Var, w7.b6.e(-1, -1, 51));
        final int i21 = 1;
        tk0Var.setOnScrollListener(new uk(this, i21));
        tk0Var.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.nk
            public final /* synthetic */ bl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i202, View view2) {
                switch (i21) {
                    case 0:
                        bl.Q(this.b, unVar, p6Var, i202);
                        break;
                    default:
                        bl.R(this.b, unVar, p6Var, i202);
                        break;
                }
            }
        });
        i0();
    }

    public static void N(bl blVar, org.telegram.messenger.ga gaVar) {
        PackageManager packageManager;
        blVar.F = gaVar;
        lk lkVar = new lk(blVar, 2);
        n4.q qVar = gaVar.a;
        int i10 = 4;
        org.telegram.messenger.s1 s1Var = new org.telegram.messenger.s1(lkVar, i10);
        i8.f fVar = (i8.f) qVar.a;
        try {
            h8.b bVar = new h8.b(s1Var);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 42);
            int i11 = 1;
            if (org.telegram.ui.ActionBar.t6.I.q() || org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, blVar.a)) < 0.721f) {
                blVar.S = true;
                blVar.F.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.b, R.raw.mapstyle_night));
            }
            if (blVar.F == null) {
                return;
            }
            Location location = new Location("network");
            blVar.o0 = location;
            location.setLatitude(20.659322d);
            blVar.o0.setLongitude(-11.40625d);
            try {
                blVar.F.l(true);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            blVar.F.h().u0();
            blVar.F.h().v0();
            blVar.F.h().t0();
            blVar.F.n(new mk(blVar, 3));
            org.telegram.messenger.ga gaVar2 = blVar.F;
            lk lkVar2 = new lk(blVar, i10);
            n4.q qVar2 = gaVar2.a;
            int i12 = 6;
            org.telegram.messenger.s1 s1Var2 = new org.telegram.messenger.s1(lkVar2, i12);
            i8.f fVar2 = (i8.f) qVar2.a;
            try {
                h8.b bVar2 = new h8.b(s1Var2, 0);
                Parcel P02 = fVar2.P0();
                s7.b.c(P02, bVar2);
                fVar2.T0(P02, 99);
                blVar.F.p(new rk(blVar, i11));
                blVar.F.o(new mk(blVar, i10));
                int i13 = 5;
                blVar.F.m(new lk(blVar, i13));
                blVar.c0();
                org.telegram.messenger.i0.h3(new lk(blVar, i12), 200L);
                if (blVar.T && blVar.getParentActivity() != null) {
                    blVar.T = false;
                    Activity parentActivity = blVar.getParentActivity();
                    if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                        return;
                    }
                    try {
                        if (!((LocationManager) org.telegram.messenger.w0.b.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, blVar.getParentActivity(), blVar.a);
                            int i14 = org.telegram.ui.ActionBar.t6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.t6.w0(i14, blVar.a), null);
                            alertDialog$Builder.n(i14, blVar.a);
                            alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131749539, null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751806, null), new mk(blVar, i13));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                        }
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                blVar.h0();
            } catch (RemoteException e10) {
                throw new ad.d(e10);
            }
        } catch (RemoteException e11) {
            throw new ad.d(e11);
        }
    }

    public static /* synthetic */ void O(bl blVar, org.telegram.ui.un unVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.p6 p6Var, Long l4) {
        if (unVar != null && unVar.c()) {
            s4.L(blVar.getParentActivity(), unVar.a(), new androidx.car.app.utils.a(blVar, tL_messageMediaGeo, l4, 19), p6Var);
        } else {
            blVar.u0.d(tL_messageMediaGeo, blVar.v0, true, 0, l4.longValue());
            blVar.b.a(true);
        }
    }

    public static /* synthetic */ void P(bl blVar) {
        zf.h0 h0Var = blVar.M;
        bi biVar = blVar.b;
        if (blVar.h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = blVar.getParentActivity();
            if (parentActivity != null) {
                blVar.h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!biVar.F1 || biVar.t4 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    blVar.U = true;
                    if (h0Var != null) {
                        h0Var.P(blVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i10 < 29 || !biVar.F1 || biVar.t4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                blVar.U = true;
                if (h0Var != null) {
                    h0Var.P(blVar.V, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, org.telegram.messenger.zs.o3);
            }
        }
    }

    public static void Q(bl blVar, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        final bl blVar2;
        org.telegram.ui.un unVar2;
        org.telegram.ui.ActionBar.p6 p6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = blVar.a0;
        zf.h0 h0Var = blVar.M;
        bi biVar = blVar.b;
        int i11 = blVar.v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.d0) != null) {
                blVar.u0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                biVar.a(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.e0) != null) {
                blVar.u0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                biVar.a(true);
                return;
            } else {
                blVar2 = blVar;
                unVar2 = unVar;
                p6Var2 = p6Var;
            }
        } else {
            if (i10 == 1) {
                if (blVar.u0 == null || blVar.o0 == null) {
                    if (blVar.V) {
                        s4.C(blVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = blVar.g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.i0.b0(blVar.o0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.i0.b0(blVar.o0.getLongitude());
                s4.Z(biVar.D3, biVar.W0() + 1, biVar.a1(), new ag.m2(blVar, unVar, tL_messageMediaGeo, p6Var, 6));
                return;
            }
            blVar2 = blVar;
            unVar2 = unVar;
            p6Var2 = p6Var;
            if (i10 == 2 && i11 == 1) {
                if (blVar2.getLocationController().i(j10)) {
                    blVar2.getLocationController().k(j10);
                    biVar.a(true);
                    return;
                } else if (blVar2.n0 == null && blVar2.V) {
                    s4.C(blVar2.getParentActivity()).show();
                    return;
                } else {
                    if (blVar2.u0 == null || blVar2.getParentActivity() == null || blVar2.n0 == null) {
                        return;
                    }
                    s4.D(blVar2.getParentActivity(), false, org.telegram.messenger.o5.E(j10) ? biVar.W1.getMessagesController().Z1(Long.valueOf(j10)) : null, new org.telegram.messenger.bs() { // from class: org.telegram.ui.Components.qk
                        @Override // org.telegram.messenger.bs
                        public final void a(int i12) {
                            bl blVar3 = bl.this;
                            bi biVar2 = blVar3.b;
                            s4.Z(biVar2.D3, biVar2.W0() + 1, biVar2.a1(), new ag.s2(blVar3, i12, 2));
                        }
                    }, blVar2.a).show();
                    return;
                }
            }
        }
        Object J = h0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            s4.Z(biVar.D3, biVar.W0() + 1, biVar.a1(), new ag.m2(blVar2, unVar2, (TLRPC.TL_messageMediaVenue) J, p6Var2, 7));
        }
    }

    public static /* synthetic */ void R(bl blVar, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = blVar.P.I(i10);
        if (I == null || blVar.u0 == null) {
            return;
        }
        if (unVar != null && unVar.c()) {
            s4.L(blVar.getParentActivity(), unVar.a(), new pk(blVar, I, 0), p6Var);
        } else {
            blVar.u0.d(I, blVar.v0, true, 0, 0L);
            blVar.b.a(true);
        }
    }

    public static /* synthetic */ void S(bl blVar, org.telegram.ui.un unVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.p6 p6Var) {
        if (unVar != null && unVar.c()) {
            s4.L(blVar.getParentActivity(), unVar.a(), new pk(blVar, tL_messageMediaVenue, 1), p6Var);
        } else {
            blVar.u0.d(tL_messageMediaVenue, blVar.v0, true, 0, 0L);
            blVar.b.a(true);
        }
    }

    public static /* synthetic */ void T(bl blVar, Location location) {
        int i10;
        bi biVar = blVar.b;
        if (biVar == null || biVar.W1 == null) {
            return;
        }
        blVar.d0(location);
        zf.h0 h0Var = blVar.M;
        if (h0Var != null && (((i10 = blVar.v0) == 7 || i10 == 8) && !blVar.r0)) {
            h0Var.M(blVar.o0);
        }
        blVar.getLocationController().n(location, blVar.W);
        blVar.W = false;
    }

    public static void U(bl blVar, org.telegram.messenger.za zaVar) {
        if (blVar.G == null || blVar.getParentActivity() == null) {
            return;
        }
        try {
            ((bh.d) zaVar).z();
            ((t7.u) org.telegram.messenger.w0.k()).initializeMaps(org.telegram.messenger.w0.b);
            ((bh.d) blVar.G).w(new rk(blVar, 0));
            blVar.l0 = true;
            if (blVar.m0) {
                ((bh.d) blVar.G).F();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void V(bl blVar, org.telegram.ui.ActionBar.p6 p6Var) {
        zf.h0 h0Var = blVar.M;
        ImageView imageView = blVar.n;
        Activity parentActivity = blVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            s4.C(blVar.getParentActivity()).show();
            return;
        }
        if (blVar.n0 != null && blVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.t6.jj;
            org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            h0Var.M(null);
            blVar.r0 = false;
            blVar.g0(false);
            blVar.F.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(blVar.n0.getLatitude(), blVar.n0.getLongitude())));
            if (blVar.s0) {
                Location location = blVar.n0;
                if (location != null && blVar.v0 != 8) {
                    h0Var.H(null, location, true);
                }
                blVar.s0 = false;
                blVar.f0();
            }
        }
        if (blVar.e0 != null) {
            blVar.Q.setVisibility(0);
            yk ykVar = blVar.D;
            org.telegram.messenger.fa faVar = blVar.e0;
            HashMap hashMap = ykVar.a;
            View view = (View) hashMap.get(faVar);
            if (view != null) {
                ykVar.removeView(view);
                hashMap.remove(faVar);
            }
            blVar.e0 = null;
            blVar.f0 = null;
            blVar.g0 = null;
        }
    }

    public static /* synthetic */ void W(bl blVar) {
        if (blVar.getParentActivity() == null) {
            return;
        }
        try {
            blVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
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

    private org.telegram.messenger.nd getLocationController() {
        return this.b.W1.getLocationController();
    }

    private org.telegram.messenger.vp getMessagesController() {
        return this.b.W1.getMessagesController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.k2 k2Var;
        bi biVar = this.b;
        if (biVar == null || (k2Var = biVar.W1) == null) {
            return null;
        }
        return k2Var.getParentActivity();
    }

    private org.telegram.messenger.d20 getUserConfig() {
        return this.b.W1.getUserConfig();
    }

    @Override // org.telegram.ui.Components.uh
    public final void A() {
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.l0) {
            try {
                ((bh.d) zaVar).D();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        this.m0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int i13;
        bi biVar = this.b;
        if (biVar.R2.n0 || biVar.l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i12 = this.x0 - this.w0;
            biVar.q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.q;
                if (point.x > point.y) {
                    i13 = (int) (i11 / 3.5f);
                    i12 = i13 - org.telegram.messenger.i0.L(52.0f);
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    biVar.q0 = true;
                }
            }
            i13 = (i11 / 5) * 2;
            i12 = i13 - org.telegram.messenger.i0.L(52.0f);
            if (i12 < 0) {
            }
            biVar.q0 = true;
        }
        this.N.q1(0, i12, 0, this.e);
        this.O.q1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.uh
    public final void C() {
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.l0) {
            try {
                ((bh.d) zaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.m0 = true;
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        bi biVar = this.b;
        biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131745474, null));
        int i10 = 1;
        if (((fg.i) ((bh.d) this.G).a).getParent() == null) {
            fg.i iVar = (fg.i) ((bh.d) this.G).a;
            FrameLayout.LayoutParams e = w7.b6.e(-1, org.telegram.messenger.i0.L(10.0f) + this.w0, 51);
            jg.l0 l0Var = this.L;
            l0Var.addView(iVar, 0, e);
            l0Var.addView(this.D, 1, w7.b6.e(-1, org.telegram.messenger.i0.L(10.0f) + this.w0, 51));
            l0Var.addView(this.K, 2, w7.b6.c(-1.0f, -1));
        }
        this.y.setVisibility(0);
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.l0) {
            try {
                ((bh.d) zaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.m0 = true;
        org.telegram.messenger.ga gaVar = this.F;
        if (gaVar != null) {
            try {
                gaVar.l(true);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        a0();
        org.telegram.messenger.i0.h3(new lk(this, i10), biVar.T3.D() ? 200L : 0L);
        this.R.h1(0, 0);
        h0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.N.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean L() {
        return !this.V;
    }

    public final void Y() {
        org.telegram.ui.ActionBar.t0 t0Var = this.r;
        if (t0Var != null) {
            t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ij, this.a));
            this.r.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.a));
            this.r.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.a), true);
            this.r.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.a), false);
        }
        if (this.F != null) {
            if (!org.telegram.ui.ActionBar.t6.I.q() && org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.a)) >= 0.721f) {
                if (this.S) {
                    this.S = false;
                    this.F.j(null);
                    return;
                }
                return;
            }
            if (this.S) {
                return;
            }
            this.S = true;
            this.F.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.b, R.raw.mapstyle_night));
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
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.x4.a(i10));
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            return null;
        }
    }

    public final void a0() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.G == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int i10 = org.telegram.messenger.i0.q.y - currentActionBarHeight;
        int L = org.telegram.messenger.i0.L(66.0f);
        int i11 = this.v0;
        if (i11 == 1 || i11 == 7 || i11 == 8) {
            L += org.telegram.messenger.i0.L(66.0f);
        }
        int L2 = (i10 - L) - org.telegram.messenger.i0.L(90.0f);
        int L3 = org.telegram.messenger.i0.L(189.0f);
        this.w0 = L3;
        if (!this.V || !b0()) {
            L2 = Math.min(org.telegram.messenger.i0.L(310.0f), L2);
        }
        this.x0 = Math.max(L3, L2);
        if (this.V && b0()) {
            this.w0 = this.x0;
        }
        ag.b1 b1Var = this.N;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        b1Var.setLayoutParams(layoutParams2);
        jg.l0 l0Var = this.L;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.x0;
        l0Var.setLayoutParams(layoutParams3);
        tk0 tk0Var = this.O;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) tk0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        tk0Var.setLayoutParams(layoutParams4);
        int L4 = org.telegram.messenger.i0.L(16.0f) + ((this.V && b0()) ? this.w0 - b1Var.getPaddingTop() : this.w0);
        zf.h0 h0Var = this.M;
        h0Var.Q(L4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.G).a).getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = org.telegram.messenger.i0.L(10.0f) + this.x0;
            ((fg.i) ((bh.d) this.G).a).setLayoutParams(layoutParams5);
        }
        yk ykVar = this.D;
        if (ykVar != null && (layoutParams = (FrameLayout.LayoutParams) ykVar.getLayoutParams()) != null) {
            layoutParams.height = org.telegram.messenger.i0.L(10.0f) + this.x0;
            ykVar.setLayoutParams(layoutParams);
        }
        h0Var.f();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
    }

    public final boolean b0() {
        int i10 = this.v0;
        return i10 == 0 || i10 == 1;
    }

    public final void c0() {
        bl blVar;
        bi biVar = this.b;
        if (!biVar.F1) {
            Location lastLocation = getLastLocation();
            this.n0 = lastLocation;
            d0(lastLocation);
            return;
        }
        if (biVar.u4 != null) {
            org.telegram.messenger.i0.g3(new lk(this, 0));
            return;
        }
        if (this.V) {
            org.telegram.messenger.i0.g3(new lk(this, 7));
            return;
        }
        File file = biVar.t4;
        boolean z10 = biVar.s4;
        if (file != null) {
            if (!z10) {
                blVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    org.telegram.messenger.i0.g3(new cd(17, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                blVar.n0 = lastLocation2;
                d0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.u7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        blVar = this;
        Location lastLocation22 = getLastLocation();
        blVar.n0 = lastLocation22;
        d0(lastLocation22);
    }

    public final void d0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.n0 = location2;
        org.telegram.messenger.ga gaVar = this.F;
        zf.h0 h0Var = this.M;
        if (gaVar == null) {
            h0Var.N(location2);
            return;
        }
        org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
        if (h0Var != null) {
            if (!this.s0 && this.v0 != 8) {
                h0Var.H(null, this.n0, true);
            }
            h0Var.N(this.n0);
        }
        if (this.r0) {
            return;
        }
        this.o0 = new Location(location);
        if (this.t0) {
            this.F.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(cbVar));
            return;
        }
        this.t0 = true;
        this.F.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar, this.F.e() - 4.0f));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = org.telegram.messenger.zs.v4;
        vk vkVar = this.P;
        zf.h0 h0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            c0();
            if (h0Var != null) {
                h0Var.P(this.V, this.U);
            }
            if (vkVar != null && vkVar.M != (z11 = this.V)) {
                vkVar.M = z11;
            }
            org.telegram.messenger.ga gaVar = this.F;
            if (gaVar != null) {
                try {
                    gaVar.l(true);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.w4) {
            this.V = true;
            this.U = false;
            if (h0Var != null) {
                h0Var.P(true, false);
            }
            if (vkVar != null && vkVar.M != (z10 = this.V)) {
                vkVar.M = z10;
            }
        }
        a0();
        boolean z12 = this.V;
        bi biVar = this.b;
        if (!z12 || biVar.F1) {
            biVar.getClass();
        } else {
            i13 = 8;
        }
        this.y.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        org.telegram.messenger.ua newCameraUpdateLatLngZoom;
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
        org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(d, d10);
        if (d == 0.0d || d10 == 0.0d) {
            newCameraUpdateLatLngZoom = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar, this.F.f());
        } else {
            newCameraUpdateLatLngZoom = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar, this.F.e() - 4.0f);
        }
        this.H = newCameraUpdateLatLngZoom;
        this.F.i(newCameraUpdateLatLngZoom);
        zf.h0 h0Var = this.M;
        if (d == 0.0d || d10 == 0.0d) {
            h0Var.N(this.n0);
        } else {
            h0Var.M(this.o0);
        }
        h0Var.I();
        this.N.w0(0, 1, null);
        this.q0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.r0 = true;
        g0(false);
        if (this.v0 != 8) {
            h0Var.H(null, this.o0, true);
        }
        this.s0 = true;
        f0();
    }

    public final void f0() {
        if (this.M.b() != 0 && this.R.L0() == 0) {
            ag.b1 b1Var = this.N;
            View childAt = b1Var.getChildAt(0);
            int top = childAt.getTop() + org.telegram.messenger.i0.L(258.0f);
            if (top < 0 || top > org.telegram.messenger.i0.L(258.0f)) {
                return;
            }
            b1Var.w0(0, top, null);
        }
    }

    public final void g0(boolean z10) {
        Location location;
        Location location2;
        if (this.V) {
            z10 = false;
        }
        zk zkVar = this.s;
        if (z10 && zkVar != null && zkVar.getTag() == null && ((location = this.n0) == null || (location2 = this.o0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.v0 == 8) {
            z10 = false;
        }
        if (zkVar != null) {
            if (!z10 || zkVar.getTag() == null) {
                if (z10 || zkVar.getTag() != null) {
                    zkVar.setVisibility(z10 ? 0 : 4);
                    zkVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zkVar, (Property<zk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -org.telegram.messenger.i0.L(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(gr.g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.N;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ck0 ck0Var = (ck0) b1Var.K(0);
        return org.telegram.messenger.i0.L(56.0f) + (ck0Var != null ? Math.max(((int) ck0Var.a.getY()) - this.z0, 0) : 0);
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.N.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.uh
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        o6 o6Var = new o6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        ag.b1 b1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.ActionBar.t0 t0Var = this.y;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var != null ? t0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        int i11 = org.telegram.ui.ActionBar.t6.kj;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.lj;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        int i13 = org.telegram.ui.ActionBar.t6.ij;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 196608, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X5));
        return arrayList;
    }

    public final void h0() {
        jg.l0 l0Var;
        int i10;
        int i11;
        org.telegram.messenger.cb cbVar;
        Location location;
        org.telegram.messenger.ga gaVar;
        if (this.G == null || (l0Var = this.L) == null) {
            return;
        }
        ag.b1 b1Var = this.N;
        s4.c1 K = b1Var.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.w0;
        } else {
            i10 = -l0Var.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) l0Var.getLayoutParams()) != null) {
            yk ykVar = this.D;
            if (i11 <= 0) {
                if (((fg.i) ((bh.d) this.G).a).getVisibility() == 0) {
                    ((fg.i) ((bh.d) this.G).a).setVisibility(4);
                    l0Var.setVisibility(4);
                    if (ykVar != null) {
                        ykVar.setVisibility(4);
                    }
                }
                ((fg.i) ((bh.d) this.G).a).setTranslationY(i10);
                return;
            }
            if (((fg.i) ((bh.d) this.G).a).getVisibility() == 4) {
                ((fg.i) ((bh.d) this.G).a).setVisibility(0);
                l0Var.setVisibility(0);
                if (ykVar != null) {
                    ykVar.setVisibility(0);
                }
            }
            int max = Math.max(0, (-((i10 - this.x0) + this.w0)) / 2);
            int i12 = this.x0 - this.w0;
            float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (b1Var.getPaddingTop() - i10) / (b1Var.getPaddingTop() - i12)));
            int i13 = this.y0;
            if (this.V && b0()) {
                i12 += Math.min(i10, b1Var.getPaddingTop());
            }
            this.y0 = (int) (i12 * max2);
            float f7 = max;
            ((fg.i) ((bh.d) this.G).a).setTranslationY(f7);
            this.z0 = i12 - this.y0;
            l0Var.invalidate();
            l0Var.setTranslationY(i10 - this.z0);
            org.telegram.messenger.ga gaVar2 = this.F;
            if (gaVar2 != null) {
                gaVar2.q(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f) + this.y0);
            }
            if (ykVar != null) {
                ykVar.setTranslationY(f7);
            }
            int max3 = Math.max(this.z0 - i10, 0);
            int i14 = this.x0;
            org.telegram.ui.ActionBar.t0 t0Var = this.r;
            float C = org.telegram.messenger.z20.C(80.0f, i14 - t0Var.getMeasuredHeight(), max3);
            t0Var.setTranslationY(C);
            zk zkVar = this.s;
            zkVar.b = C;
            zkVar.setTranslationY(C + zkVar.a);
            this.n.setTranslationY(-this.y0);
            int D = org.telegram.messenger.z20.D(48.0f, (this.x0 - this.y0) / 2, max);
            this.p0 = D;
            this.Q.setTranslationY(D);
            if (i13 != this.y0) {
                org.telegram.messenger.fa faVar = this.e0;
                if (faVar != null) {
                    cbVar = new org.telegram.messenger.cb(faVar.a().a, this.e0.a().b);
                } else if (!this.r0 || (location = this.o0) == null) {
                    Location location2 = this.n0;
                    cbVar = location2 != null ? new org.telegram.messenger.cb(location2.getLatitude(), this.n0.getLongitude()) : null;
                } else {
                    cbVar = new org.telegram.messenger.cb(location.getLatitude(), this.o0.getLongitude());
                }
                if (cbVar != null && (gaVar = this.F) != null) {
                    gaVar.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(cbVar));
                }
            }
            if (this.V && b0()) {
                int b10 = this.M.b();
                for (int i15 = 1; i15 < b10; i15++) {
                    s4.c1 K2 = b1Var.K(i15);
                    if (K2 != null) {
                        K2.a.setTranslationY(b1Var.getPaddingTop() - i10);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    public final void i0() {
        boolean z10 = this.i0;
        LinearLayout linearLayout = this.w;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.k0;
        tk0 tk0Var = this.O;
        if (!z11) {
            tk0Var.setEmptyView(linearLayout);
        } else {
            tk0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void o() {
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.v4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.w4);
        this.E = true;
        jg.l0 l0Var = this.L;
        if (l0Var != null) {
            l0Var.invalidate();
        }
        try {
            org.telegram.messenger.ga gaVar = this.F;
            if (gaVar != null) {
                gaVar.l(false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null) {
            ((fg.i) ((bh.d) zaVar).a).setTranslationY((-org.telegram.messenger.i0.q.y) * 3);
        }
        try {
            org.telegram.messenger.za zaVar2 = this.G;
            if (zaVar2 != null) {
                ((bh.d) zaVar2).D();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.za zaVar3 = this.G;
            if (zaVar3 != null) {
                ((bh.d) zaVar3).B();
                this.G = null;
            }
        } catch (Exception unused2) {
        }
        zf.h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.F();
        }
        vk vkVar = this.P;
        if (vkVar != null) {
            vkVar.F();
        }
        bi biVar = this.b;
        biVar.R2.k(true);
        biVar.R2.p().removeView(this.y);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a0();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean p() {
        o();
        return false;
    }

    public void setDelegate(wk wkVar) {
        this.u0 = wkVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.b.invalidate();
        h0();
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        this.y.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.y;
        if (t0Var != null) {
            try {
                if (t0Var.getSearchField() != null) {
                    t0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.j5, this.a));
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void y() {
        bi biVar = this.b;
        this.M.c0 = (biVar == null || biVar.d) ? false : true;
    }

    @Override // org.telegram.ui.Components.uh
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.M.c0 = false;
        }
    }
}
