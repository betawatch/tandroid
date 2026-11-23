package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ml extends mi implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs {
    public static final /* synthetic */ int G0 = 0;
    public float A0;
    public final hl B0;
    public int C0;
    public int D0;
    public org.telegram.messenger.ea E;
    public int E0;
    public org.telegram.messenger.ya F;
    public int F0;
    public org.telegram.messenger.ta G;
    public float H;
    public boolean I;
    public final View J;
    public final bi.e3 K;
    public final jg.r0 L;
    public final di.b1 M;
    public final ek0 N;
    public final kl O;
    public final ImageView P;
    public final kg.d0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint a0;
    public AnimatorSet b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public Location i0;
    public Location j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final ImageView n;
    public boolean n0;
    public ll o0;
    public final int p0;
    public int q0;
    public final org.telegram.ui.ActionBar.q0 r;
    public int r0;
    public final LinearLayout s;
    public int s0;
    public int t0;
    public float u0;
    public float v0;
    public final TextView w;
    public final int[] w0;
    public final org.telegram.ui.ActionBar.q0 x;
    public int x0;
    public boolean y;
    public int y0;
    public int z0;

    public ml(ui uiVar, Context context, final org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, uiVar);
        this.S = true;
        final int i7 = 0;
        this.T = false;
        this.U = false;
        this.V = true;
        this.a0 = new Paint();
        this.c0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.q0 = currentActionBarHeight;
        this.r0 = currentActionBarHeight;
        this.s0 = -1;
        this.t0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u0 = Float.NaN;
        this.v0 = 1.0f;
        this.w0 = new int[2];
        this.y0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.A0 = -1.0f;
        this.B0 = new hl(i7, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        ui uiVar2 = this.b;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar2.a2;
        final org.telegram.ui.bn bnVar = g2Var instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) g2Var : null;
        long c12 = uiVar2.c1();
        this.W = c12;
        if (this.b.J1) {
            this.p0 = 7;
        } else if (!z10 || bnVar == null || bnVar.h != null || bnVar.c() || org.telegram.messenger.p10.C(bnVar.j())) {
            this.p0 = 0;
        } else {
            this.p0 = 1;
        }
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.y4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.z4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        kl klVar = this.O;
        if (klVar != null) {
            klVar.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.q0 a10 = this.b.V2.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.w1(this, 8);
        this.x = a10;
        this.b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        a10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(searchField, i10, h6Var);
        org.telegram.ui.ActionBar.t6.v(searchField, i10, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Me, h6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.e3 e3Var = new bi.e3(15, context, this);
        this.K = e3Var;
        e3Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new sc(org.telegram.ui.ActionBar.m6.D0().q()));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lj, this.a), false, h6Var);
        this.r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, R.drawable.msg_map, null, org.telegram.messenger.hd.N0(2131748497, null), true, false, h6Var);
        q0Var.d(3, R.drawable.msg_satellite, null, org.telegram.messenger.hd.N0(2131745752, null), true, false, h6Var);
        q0Var.d(4, R.drawable.msg_hybrid, null, org.telegram.messenger.hd.N0(2131749082, null), true, false, h6Var);
        q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i11 = org.telegram.ui.ActionBar.m6.nj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.a);
        int i12 = org.telegram.ui.ActionBar.m6.oj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.m6.j0(L, w02, org.telegram.ui.ActionBar.m6.w0(i12, this.a));
        c8.ra.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.q0 q0Var2 = bg.u0.a;
        q0Var.setOutlineProvider(q0Var2);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.t6.j(q0Var, j02, M, M2, h6Var);
        q0Var.setIcon(R.drawable.msg_map_type);
        e3Var.addView(q0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        q0Var.setOnClickListener(new o0(this, 7));
        q0Var.setDelegate(new bl(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.m6.w0(i11, this.a), org.telegram.ui.ActionBar.m6.w0(i12, this.a));
        c8.ra.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(q0Var2);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i12);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.t6.j(imageView, j03, M3, M4, h6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i13 = org.telegram.ui.ActionBar.m6.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i13, h6Var, mode);
        imageView.setTag(Integer.valueOf(i13));
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754830, null));
        e3Var.addView(imageView, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new m8(2, this, h6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ma.c(-1.0f, -1));
        int i14 = 16;
        linearLayout.setOnTouchListener(new gi.a(i14));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, mode);
        linearLayout.addView(imageView2, c8.ma.o(-2, -2));
        TextView textView = new TextView(context);
        int i15 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView, i15, h6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5.c.r(17.0f, 1, 2131747986, textView, null);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = f10;
        org.telegram.ui.ActionBar.t6.U(f10, i15, h6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ma.t(-2, -2, 17, 0, 6, 0, 0));
        di.b1 b1Var = new di.b1(this, context, h6Var, i14);
        this.M = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.f = true;
        b1Var.setClipToPadding(false);
        jg.r0 r0Var2 = new jg.r0(context, this.p0, c12, true, h6Var, this.b.J1, false, false);
        this.L = r0Var2;
        b1Var.setAdapter(r0Var2);
        ui uiVar3 = this.b;
        r0Var2.X = uiVar3 != null && (uiVar3.C1 || uiVar3.K1);
        b1Var.setItemAnimator(null);
        r0Var2.O(this.U, this.T);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.r1();
        kg.d0 d0Var = new kg.d0(this, b1Var);
        this.Q = d0Var;
        b1Var.setLayoutManager(d0Var);
        addView(b1Var, c8.ma.e(-1, -1, 51));
        b1Var.setOnScrollListener(new jl(this, i7));
        b1Var.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.cl
            public final /* synthetic */ ml b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i16, View view2) {
                switch (i7) {
                    case 0:
                        ml.U(this.b, bnVar, h6Var, i16);
                        break;
                    default:
                        ml.W(this.b, bnVar, h6Var, i16);
                        break;
                }
            }
        });
        r0Var2.P(this.q0);
        addView(e3Var, indexOfChild(b1Var), c8.ma.e(-1, -1, 51));
        org.telegram.messenger.ya onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.c = new bl(this);
        r7Var.d = new h2(9, this, h6Var);
        new Thread(new dl(this, onCreateMapView, i7)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        e3Var.addView(imageView3, c8.ma.e(28, 48, 49));
        ek0 ek0Var = new ek0(context, h6Var);
        this.N = ek0Var;
        ek0Var.setSections(true);
        ek0Var.setClipToPadding(false);
        ek0Var.setVisibility(8);
        ek0Var.setLayoutManager(new v4.c0(1, false));
        kl klVar2 = new kl(this, context, h6Var, this.b.J1);
        this.O = klVar2;
        klVar2.n = new bl(this);
        ek0Var.setItemAnimator(null);
        addView(ek0Var, c8.ma.e(-1, -1, 51));
        final int i16 = 1;
        ek0Var.setOnScrollListener(new jl(this, i16));
        ek0Var.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.cl
            public final /* synthetic */ ml b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i162, View view2) {
                switch (i16) {
                    case 0:
                        ml.U(this.b, bnVar, h6Var, i162);
                        break;
                    default:
                        ml.W(this.b, bnVar, h6Var, i162);
                        break;
                }
            }
        });
        j0();
    }

    public static /* synthetic */ void P(ml mlVar, org.telegram.ui.ActionBar.h6 h6Var) {
        ImageView imageView = mlVar.n;
        Activity parentActivity = mlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            c5.A(mlVar.getParentActivity()).show();
            return;
        }
        if (mlVar.i0 == null || mlVar.E == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.mj;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setTag(Integer.valueOf(i7));
        mlVar.L.L(null);
        mlVar.m0 = false;
        mlVar.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.bb(mlVar.i0.getLatitude(), mlVar.i0.getLongitude())));
    }

    public static /* synthetic */ void Q(ml mlVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.h6 h6Var) {
        if (bnVar != null && bnVar.c()) {
            c5.J(mlVar.getParentActivity(), bnVar.a(), new el(mlVar, tL_messageMediaVenue, 1), h6Var);
        } else {
            mlVar.o0.b(tL_messageMediaVenue, mlVar.p0, true, 0, 0L);
            mlVar.b.a(true);
        }
    }

    public static /* synthetic */ void R(ml mlVar) {
        if (mlVar.getParentActivity() == null) {
            return;
        }
        try {
            mlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public static void S(ml mlVar, org.telegram.messenger.ya yaVar) {
        if (mlVar.F == null || mlVar.getParentActivity() == null) {
            return;
        }
        try {
            ((a8.r7) yaVar).y();
            ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
            ((a8.r7) mlVar.F).t(new fl(mlVar, 0));
            mlVar.g0 = true;
            if (mlVar.h0) {
                ((a8.r7) mlVar.F).F();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void T(ml mlVar) {
        di.b1 b1Var = mlVar.M;
        bi.e3 e3Var = mlVar.K;
        if (mlVar.F == null || e3Var == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.height;
            int i10 = mlVar.r0;
            if (i7 != i10) {
                layoutParams.height = i10;
                e3Var.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.l0) ((a8.r7) mlVar.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != mlVar.getMapContentHeight()) {
            layoutParams2.height = mlVar.getMapContentHeight();
            ((ai.l0) ((a8.r7) mlVar.F).b).setLayoutParams(layoutParams2);
        }
        mlVar.L.P(mlVar.q0);
        v4.f1 K = b1Var.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != mlVar.q0) {
                view.getLayoutParams().height = mlVar.q0;
                view.requestLayout();
            }
        }
        kg.d0 d0Var = mlVar.Q;
        d0Var.M = 0;
        d0Var.p1();
        b1Var.requestLayout();
        mlVar.i0();
    }

    public static void U(ml mlVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        final ml mlVar2;
        org.telegram.ui.bn bnVar2;
        org.telegram.ui.ActionBar.h6 h6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = mlVar.W;
        jg.r0 r0Var = mlVar.L;
        ui uiVar = mlVar.b;
        int i10 = mlVar.p0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.V) != null) {
                mlVar.o0.b(tL_messageMediaVenue2, i10, true, 0, 0L);
                uiVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.W) != null) {
                mlVar.o0.b(tL_messageMediaVenue, i10, true, 0, 0L);
                uiVar.a(true);
                return;
            } else {
                mlVar2 = mlVar;
                bnVar2 = bnVar;
                h6Var2 = h6Var;
            }
        } else {
            if (i7 == 1) {
                if (mlVar.o0 == null || mlVar.j0 == null) {
                    if (mlVar.U) {
                        c5.A(mlVar.getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(mlVar.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(mlVar.j0.getLongitude());
                    c5.X(uiVar.H3, uiVar.Y0() + 1, uiVar.c1(), new bi.m2(mlVar, bnVar, tL_messageMediaGeo, h6Var, 7));
                    return;
                }
            }
            mlVar2 = mlVar;
            bnVar2 = bnVar;
            h6Var2 = h6Var;
            if (i7 == 2 && i10 == 1) {
                if (mlVar2.getLocationController().i(j3)) {
                    mlVar2.getLocationController().k(j3);
                    uiVar.a(true);
                    return;
                } else if (mlVar2.i0 == null && mlVar2.U) {
                    c5.A(mlVar2.getParentActivity()).show();
                    return;
                } else {
                    if (mlVar2.o0 == null || mlVar2.getParentActivity() == null || mlVar2.i0 == null) {
                        return;
                    }
                    c5.B(mlVar2.getParentActivity(), false, org.telegram.messenger.n5.E(j3) ? uiVar.a2.getMessagesController().c2(Long.valueOf(j3)) : null, new org.telegram.messenger.or() { // from class: org.telegram.ui.Components.gl
                        @Override // org.telegram.messenger.or
                        public final void a(int i11) {
                            ml mlVar3 = ml.this;
                            ui uiVar2 = mlVar3.b;
                            c5.X(uiVar2.H3, uiVar2.Y0() + 1, uiVar2.c1(), new ai.b2(mlVar3, i11, 6));
                        }
                    }, mlVar2.a).show();
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            c5.X(uiVar.H3, uiVar.Y0() + 1, uiVar.c1(), new bi.m2(mlVar2, bnVar2, (TLRPC.TL_messageMediaVenue) I, h6Var2, 8));
        }
    }

    public static /* synthetic */ void V(ml mlVar) {
        jg.r0 r0Var = mlVar.L;
        ui uiVar = mlVar.b;
        if (mlVar.c0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = mlVar.getParentActivity();
            if (parentActivity != null) {
                mlVar.c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!uiVar.J1 || uiVar.x4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    mlVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(mlVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i7 < 29 || !uiVar.J1 || uiVar.x4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                mlVar.T = true;
                if (r0Var != null) {
                    r0Var.O(mlVar.U, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, org.telegram.messenger.ls.o3);
            }
        }
    }

    public static void W(ml mlVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        ui uiVar = mlVar.b;
        TLRPC.TL_messageMediaVenue H = mlVar.O.H(i7);
        if (H != null && mlVar.p0 != 7) {
            uiVar.V2.n(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            mlVar.h0(geoPoint.lat, geoPoint._long);
        } else {
            if (H == null || mlVar.o0 == null) {
                return;
            }
            if (bnVar != null && bnVar.c()) {
                c5.J(mlVar.getParentActivity(), bnVar.a(), new el(mlVar, H, 0), h6Var);
            } else {
                mlVar.o0.b(H, mlVar.p0, true, 0, 0L);
                uiVar.a(true);
            }
        }
    }

    public static /* synthetic */ void X(ml mlVar, Location location) {
        int i7;
        ui uiVar = mlVar.b;
        if (uiVar == null || uiVar.a2 == null) {
            return;
        }
        mlVar.g0(location);
        jg.r0 r0Var = mlVar.L;
        if (r0Var != null && (((i7 = mlVar.p0) == 7 || i7 == 8) && !mlVar.m0)) {
            r0Var.L(mlVar.j0);
        }
        mlVar.getLocationController().n(location, mlVar.V);
        mlVar.V = false;
    }

    public static /* synthetic */ void Y(ml mlVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.h6 h6Var, Long l10) {
        if (bnVar != null && bnVar.c()) {
            c5.J(mlVar.getParentActivity(), bnVar.a(), new a3.h(mlVar, tL_messageMediaGeo, l10, 28), h6Var);
        } else {
            mlVar.o0.b(tL_messageMediaGeo, mlVar.p0, true, 0, l10.longValue());
            mlVar.b.a(true);
        }
    }

    public static void Z(ml mlVar, org.telegram.messenger.ea eaVar) {
        PackageManager packageManager;
        mlVar.E = eaVar;
        al alVar = new al(mlVar, 3);
        k8.a aVar = eaVar.a;
        int i7 = 5;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(alVar, i7);
        l8.e eVar = (l8.e) aVar.b;
        try {
            k8.c cVar = new k8.c(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 42);
            int i10 = 1;
            if (org.telegram.ui.ActionBar.m6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, mlVar.a)) < 0.721f) {
                mlVar.R = true;
                mlVar.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
            }
            if (mlVar.E == null) {
                return;
            }
            Location location = new Location("network");
            mlVar.j0 = location;
            location.setLatitude(20.659322d);
            mlVar.j0.setLongitude(-11.40625d);
            try {
                mlVar.E.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            mlVar.E.g().w2();
            mlVar.E.g().B2();
            mlVar.E.g().r2();
            mlVar.E.l(new bl(mlVar));
            org.telegram.messenger.ea eaVar2 = mlVar.E;
            al alVar2 = new al(mlVar, 4);
            k8.a aVar2 = eaVar2.a;
            org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(alVar2, 8);
            l8.e eVar2 = (l8.e) aVar2.b;
            try {
                k8.c cVar2 = new k8.c(j1Var2, (short) 0);
                Parcel p13 = eVar2.p1();
                v7.b.c(p13, cVar2);
                eVar2.t1(p13, 99);
                org.telegram.messenger.ea eaVar3 = mlVar.E;
                fl flVar = new fl(mlVar, i10);
                k8.a aVar3 = eaVar3.a;
                org.telegram.messenger.j1 j1Var3 = new org.telegram.messenger.j1(flVar, 6);
                l8.e eVar3 = (l8.e) aVar3.b;
                try {
                    k8.c cVar3 = new k8.c(j1Var3);
                    Parcel p14 = eVar3.p1();
                    v7.b.c(p14, cVar3);
                    eVar3.t1(p14, 36);
                    mlVar.E.m(new l2(20));
                    mlVar.f0();
                    org.telegram.messenger.g0.h3(new al(mlVar, i7), 200L);
                    if (mlVar.S && mlVar.getParentActivity() != null) {
                        mlVar.S = false;
                        Activity parentActivity = mlVar.getParentActivity();
                        if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                            return;
                        }
                        try {
                            if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mlVar.getParentActivity(), mlVar.a);
                                int i11 = org.telegram.ui.ActionBar.m6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.m6.w0(i11, mlVar.a), null);
                                alertDialog$Builder.n(i11, mlVar.a);
                                alertDialog$Builder.a.U = org.telegram.messenger.hd.N0(2131749354, null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751794, null), new bl(mlVar));
                                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder.p();
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                    mlVar.i0();
                } catch (RemoteException e12) {
                    throw new androidx.car.app.j(e12);
                }
            } catch (RemoteException e13) {
                throw new androidx.car.app.j(e13);
            }
        } catch (RemoteException e14) {
            throw new androidx.car.app.j(e14);
        }
    }

    public static void a0(ml mlVar) {
        jg.r0 r0Var = mlVar.L;
        di.b1 b1Var = mlVar.M;
        if (mlVar.F == null || mlVar.K == null || mlVar.getMeasuredHeight() == 0) {
            return;
        }
        v4.f1 K = b1Var.K(0);
        if (K != null) {
            View view = K.a;
            int bottom = view.getBottom();
            int b10 = r0Var.b();
            int i7 = 1;
            while (true) {
                if (i7 >= b10) {
                    mlVar.s0 = bottom - view.getBottom();
                    break;
                }
                if (r0Var.d(i7) != 11) {
                    v4.f1 K2 = b1Var.K(i7);
                    if (K2 == null) {
                        break;
                    } else {
                        bottom = Math.max(bottom, K2.a.getBottom());
                    }
                }
                i7++;
            }
        }
        int i10 = mlVar.s0;
        if (i10 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i11 = mlVar.p0;
            i10 = (i11 == 1 || i11 == 7 || i11 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (b1Var.getMeasuredHeight() - mlVar.getDefaultBottomInset()) - i10;
        int measuredHeight2 = mlVar.getMeasuredHeight() + mlVar.getMapExtraTop();
        int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - b1Var.getPaddingTop());
        if (measuredHeight2 == mlVar.r0 && max == mlVar.q0) {
            return;
        }
        mlVar.r0 = measuredHeight2;
        mlVar.q0 = max;
        org.telegram.messenger.g0.g3(new al(mlVar, 0));
    }

    private int getBottomInset() {
        d0();
        return org.telegram.messenger.g0.W1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (!d0()) {
            return getMinBottomInset();
        }
        return org.telegram.messenger.g0.L(8.0f) + this.e;
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
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

    private org.telegram.messenger.rd getLocationController() {
        return this.b.a2.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m;
    }

    private org.telegram.messenger.bb getMapTarget() {
        Location location;
        if (this.m0 && (location = this.j0) != null) {
            return new org.telegram.messenger.bb(location.getLatitude(), this.j0.getLongitude());
        }
        Location location2 = this.i0;
        if (location2 != null) {
            return new org.telegram.messenger.bb(location2.getLatitude(), this.i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.np getMessagesController() {
        return this.b.a2.getMessagesController();
    }

    private int getMinBottomInset() {
        return d0() ? getDefaultBottomInset() : Math.min(this.e, org.telegram.messenger.g0.n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.g2 g2Var;
        ui uiVar = this.b;
        if (uiVar == null || (g2Var = uiVar.a2) == null) {
            return null;
        }
        return g2Var.getParentActivity();
    }

    private org.telegram.messenger.k10 getUserConfig() {
        return this.b.a2.getUserConfig();
    }

    @Override // org.telegram.ui.Components.mi
    public final void A() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.g0) {
            try {
                ((a8.r7) yaVar).B();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        ui uiVar = this.b;
        if (uiVar.V2.o0 || uiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            uiVar.r0 = false;
            i11 = 0;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i12 = (int) (i10 / 3.5f);
                    i11 = i12 - org.telegram.messenger.g0.L(52.0f);
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    uiVar.r0 = true;
                }
            }
            i12 = (i10 / 5) * 2;
            i11 = i12 - org.telegram.messenger.g0.L(52.0f);
            if (i11 < 0) {
            }
            uiVar.r0 = true;
        }
        this.M.q1(0, i11, 0, getMinBottomInset());
        this.N.q1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.mi
    public final void C() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.g0) {
            try {
                ((a8.r7) yaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
    }

    @Override // org.telegram.ui.Components.mi
    public final void F(float f10, float f11) {
        if (this.u0 == f10 && this.v0 == f11) {
            return;
        }
        this.u0 = f10;
        this.v0 = f11;
        e0();
    }

    @Override // org.telegram.ui.Components.mi
    public final void I(mi miVar) {
        ui uiVar = this.b;
        uiVar.V2.setTitle(org.telegram.messenger.hd.N0(2131745260, null));
        int i7 = 1;
        if (((ai.l0) ((a8.r7) this.F).b).getParent() == null) {
            ai.l0 l0Var = (ai.l0) ((a8.r7) this.F).b;
            FrameLayout.LayoutParams e10 = c8.ma.e(-1, org.telegram.messenger.g0.L(10.0f) + this.q0, 51);
            bi.e3 e3Var = this.K;
            e3Var.addView(l0Var, 0, e10);
            e3Var.addView(this.J, 1, c8.ma.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.g0) {
            try {
                ((a8.r7) yaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
        org.telegram.messenger.ea eaVar = this.E;
        if (eaVar != null) {
            try {
                eaVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        org.telegram.messenger.g0.h3(new al(this, i7), uiVar.X3.g0() ? 200L : 0L);
        this.Q.h1(0, 0);
        i0();
    }

    @Override // org.telegram.ui.Components.mi
    public final void K() {
        this.M.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lj, this.a));
            this.r.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.a));
            this.r.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.a), true);
            this.r.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.a), false);
        }
        if (this.E != null) {
            if (!org.telegram.ui.ActionBar.m6.I.q() && org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.a)) >= 0.721f) {
                if (this.R) {
                    this.R = false;
                    this.E.i(null);
                    return;
                }
                return;
            }
            if (this.R) {
                return;
            }
            this.R = true;
            this.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
        }
    }

    public final void c0() {
        if (getMeasuredHeight() == 0 || this.F == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        di.b1 b1Var = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        b1Var.setLayoutParams(layoutParams);
        bi.e3 e3Var = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        e3Var.setLayoutParams(layoutParams2);
        ek0 ek0Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ek0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        ek0Var.setLayoutParams(layoutParams3);
        int i7 = this.q0;
        jg.r0 r0Var = this.L;
        r0Var.P(i7);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.l0) ((a8.r7) this.F).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.r0;
            ((ai.l0) ((a8.r7) this.F).b).setLayoutParams(layoutParams4);
        }
        r0Var.f();
        i0();
    }

    public final boolean d0() {
        uh uhVar = this.b.v3;
        return (uhVar == null || uhVar.getVisibility() == 8) ? false : true;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.y4;
        jg.r0 r0Var = this.L;
        if (i7 == i11) {
            this.U = false;
            this.T = false;
            f0();
            if (r0Var != null) {
                r0Var.O(this.U, this.T);
            }
            org.telegram.messenger.ea eaVar = this.E;
            if (eaVar != null) {
                try {
                    eaVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ls.z4) {
            this.U = true;
            this.T = false;
            if (r0Var != null) {
                r0Var.O(true, false);
            }
        }
        c0();
        this.b.getClass();
        this.x.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.e3 e3Var;
        di.b1 b1Var;
        org.telegram.messenger.bb bbVar;
        if (this.F == null || (e3Var = this.K) == null || (b1Var = this.M) == null) {
            return;
        }
        v4.f1 K = b1Var.K(0);
        int top = K != null ? K.a.getTop() + b1Var.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((ai.l0) ((a8.r7) this.F).b).getVisibility() == 0) {
                ((ai.l0) ((a8.r7) this.F).b).setVisibility(4);
                e3Var.setVisibility(4);
                return;
            }
            return;
        }
        if (((ai.l0) ((a8.r7) this.F).b).getVisibility() == 4) {
            ((ai.l0) ((a8.r7) this.F).b).setVisibility(0);
            e3Var.setVisibility(0);
        }
        float f10 = top;
        if (this.v0 < 1.0f) {
            int[] iArr = this.w0;
            getLocationInWindow(iArr);
            f10 = Math.min(top, org.telegram.messenger.g0.W1(this.v0, -iArr[1], top));
        }
        int max = (int) Math.max(f10, -getMapExtraTop());
        int max2 = (Math.max(0, K.a.getTop()) + b1Var.getTop()) - max;
        int min = (Math.min(this.t0, b1Var.getMeasuredHeight()) + b1Var.getTop()) - max;
        this.x0 = org.telegram.messenger.g0.L(32.0f) + max2;
        this.y0 = min;
        this.z0 = Math.max(0, this.r0 - (getMeasuredHeight() - max));
        float f11 = max;
        e3Var.setTranslationY(f11);
        e3Var.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = b1Var.getTop();
        int i7 = min + max;
        float f12 = (top2 + i7) / 2.0f;
        float max3 = Math.max(f12, ((b1Var.getPaddingTop() + top2) + i7) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f12);
        if (ceil != this.D0) {
            this.D0 = ceil;
            org.telegram.messenger.g0.g3(new al(this, 0));
        }
        float C = a8.p0.C(max + max2 + i7, 2.0f, max3, f12);
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f13 = C - ceil2;
        ((ai.l0) ((a8.r7) this.F).b).setTranslationY(f13 - f11);
        int L = ((int) (C - f11)) - org.telegram.messenger.g0.L(48.0f);
        if (L != this.k0) {
            this.k0 = L;
            this.P.setTranslationY(L);
        }
        int measuredHeight = ((ai.l0) ((a8.r7) this.F).b).getMeasuredHeight() > 0 ? ((ai.l0) ((a8.r7) this.F).b).getMeasuredHeight() : getMapContentHeight();
        int max4 = Math.max(0, (int) (measuredHeight - (i7 - f13)));
        int i10 = ((ceil2 * 2) - measuredHeight) + max4;
        org.telegram.messenger.ea eaVar = this.E;
        if (eaVar != null) {
            int i11 = this.E0;
            if (i10 == i11 && max4 == this.F0) {
                return;
            }
            if (i11 < 0) {
                bbVar = getMapTarget();
            } else if (ceil2 != this.C0) {
                eaVar.d();
                bbVar = (org.telegram.messenger.bb) this.E.d().b;
            } else {
                bbVar = null;
            }
            this.C0 = ceil2;
            this.E0 = i10;
            this.F0 = max4;
            this.E.n(0, org.telegram.messenger.g0.L(6.0f) + i10, 0, org.telegram.messenger.g0.L(6.0f) + max4);
            if (bbVar != null) {
                this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
            }
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean f() {
        return true;
    }

    public final void f0() {
        ml mlVar;
        ui uiVar = this.b;
        if (!uiVar.J1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            g0(lastLocation);
            return;
        }
        if (uiVar.y4 != null) {
            org.telegram.messenger.g0.g3(new al(this, 2));
            return;
        }
        if (this.U) {
            org.telegram.messenger.g0.g3(new al(this, 7));
            return;
        }
        File file = uiVar.x4;
        boolean z10 = uiVar.w4;
        if (file != null) {
            if (!z10) {
                mlVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    org.telegram.messenger.g0.g3(new mf(15, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                mlVar.i0 = lastLocation2;
                g0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.r7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        mlVar = this;
        Location lastLocation22 = getLastLocation();
        mlVar.i0 = lastLocation22;
        g0(lastLocation22);
    }

    public final void g0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.i0 = location2;
        org.telegram.messenger.ea eaVar = this.E;
        jg.r0 r0Var = this.L;
        if (eaVar == null) {
            r0Var.M(location2);
            return;
        }
        org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(location.getLatitude(), location.getLongitude());
        if (r0Var != null) {
            r0Var.M(this.i0);
        }
        if (this.m0) {
            return;
        }
        this.j0 = new Location(location);
        if (this.n0) {
            this.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
            return;
        }
        this.n0 = true;
        this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, this.E.e() - 4.0f));
    }

    @Override // org.telegram.ui.Components.mi
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // org.telegram.ui.Components.mi
    public int getCurrentItemTop() {
        di.b1 b1Var = this.M;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        mj0 mj0Var = (mj0) b1Var.K(0);
        return org.telegram.messenger.g0.L(56.0f) + (mj0Var != null ? Math.max((int) mj0Var.a.getY(), 0) : 0);
    }

    @Override // org.telegram.ui.Components.mi
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.mi
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.mi
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        x6 x6Var = new x6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        di.b1 b1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var != null ? q0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        int i10 = org.telegram.ui.ActionBar.m6.nj;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.oj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        int i12 = org.telegram.ui.ActionBar.m6.lj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 196608, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hi));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.ta newCameraUpdateLatLngZoom;
        if (this.E == null) {
            return;
        }
        if (d == 0.0d || d2 == 0.0d) {
            Location location = new Location("");
            this.i0 = location;
            location.reset();
            this.i0.setLatitude(d);
            this.i0.setLongitude(d2);
        } else {
            Location location2 = new Location("");
            this.j0 = location2;
            location2.reset();
            this.j0.setLatitude(d);
            this.j0.setLongitude(d2);
        }
        org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(d, d2);
        if (d == 0.0d || d2 == 0.0d) {
            newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, this.E.f());
        } else {
            newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, this.E.e() - 4.0f);
        }
        this.G = newCameraUpdateLatLngZoom;
        this.E.h(newCameraUpdateLatLngZoom);
        jg.r0 r0Var = this.L;
        if (d == 0.0d || d2 == 0.0d) {
            r0Var.M(this.i0);
        } else {
            r0Var.L(this.j0);
        }
        r0Var.H();
        this.M.w0(0, 1, null);
        this.l0 = true;
        if (d == 0.0d || d2 == 0.0d) {
            return;
        }
        this.m0 = true;
    }

    public final void i0() {
        bi.e3 e3Var;
        if (this.F == null || (e3Var = this.K) == null) {
            return;
        }
        di.b1 b1Var = this.M;
        v4.f1 K = b1Var.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            e3Var.getMeasuredHeight();
        }
        int i7 = this.s0;
        if (i7 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i10 = this.p0;
            i7 = (i10 == 1 || i10 == 7 || i10 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (b1Var.getMeasuredHeight() - getBottomInset()) - i7;
        this.t0 = measuredHeight;
        if (K != null) {
            int bottom = measuredHeight - K.a.getBottom();
            int childCount = b1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = b1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    childAt.setTranslationY(bottom);
                }
            }
        }
        e0();
    }

    @Override // org.telegram.ui.Components.mi
    public final int j() {
        return 1;
    }

    public final void j0() {
        boolean z10 = this.d0;
        LinearLayout linearLayout = this.s;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.f0;
        ek0 ek0Var = this.N;
        if (!z11) {
            ek0Var.setEmptyView(linearLayout);
        } else {
            ek0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.B0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (z10) {
            c0();
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void p() {
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.y4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.z4);
        this.y = true;
        bi.e3 e3Var = this.K;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        try {
            org.telegram.messenger.ea eaVar = this.E;
            if (eaVar != null) {
                eaVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null) {
            ((ai.l0) ((a8.r7) yaVar).b).setTranslationY((-org.telegram.messenger.g0.q.y) * 3);
        }
        try {
            org.telegram.messenger.ya yaVar2 = this.F;
            if (yaVar2 != null) {
                ((a8.r7) yaVar2).B();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.ya yaVar3 = this.F;
            if (yaVar3 != null) {
                ((a8.r7) yaVar3).A();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        kl klVar = this.O;
        if (klVar != null) {
            klVar.F();
        }
        ui uiVar = this.b;
        uiVar.V2.n(true);
        uiVar.V2.s().removeView(this.x);
    }

    @Override // org.telegram.ui.Components.mi
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(ll llVar) {
        this.o0 = llVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        i0();
    }

    @Override // org.telegram.ui.Components.mi
    public final void u() {
        this.x.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.x;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.j5, this.a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void y() {
        ui uiVar = this.b;
        this.L.U = (uiVar == null || uiVar.d) ? false : true;
    }

    @Override // org.telegram.ui.Components.mi
    public final void z(int i7, boolean z10) {
        if (z10) {
            this.L.U = false;
        }
    }
}
