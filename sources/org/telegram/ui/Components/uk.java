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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uk extends th implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs {
    public static final /* synthetic */ int G0 = 0;
    public float A0;
    public final pk B0;
    public int C0;
    public int D0;
    public org.telegram.messenger.z9 E;
    public int E0;
    public org.telegram.messenger.sa F;
    public int F0;
    public org.telegram.messenger.na G;
    public float H;
    public boolean I;
    public final View J;
    public final ai.o2 K;
    public final kg.o0 L;
    public final ci.j1 M;
    public final tj0 N;
    public final sk O;
    public final ImageView P;
    public final lg.d0 Q;
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
    public tk o0;
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

    public uk(bi biVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, biVar);
        this.S = true;
        final int i3 = 0;
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
        this.B0 = new pk(i3, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        bi biVar2 = this.b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar2.X1;
        final org.telegram.ui.wm wmVar = d2Var instanceof org.telegram.ui.wm ? (org.telegram.ui.wm) d2Var : null;
        long b12 = biVar2.b1();
        this.W = b12;
        int i10 = 7;
        if (this.b.G1) {
            this.p0 = 7;
        } else if (!z10 || wmVar == null || wmVar.h != null || wmVar.c() || org.telegram.messenger.l10.B(wmVar.j())) {
            this.p0 = 0;
        } else {
            this.p0 = 1;
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.v4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.w4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        kg.o0 o0Var = this.L;
        if (o0Var != null) {
            o0Var.F();
        }
        sk skVar = this.O;
        if (skVar != null) {
            skVar.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.q0 a10 = this.b.S2.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.I = new lg.w1(this, i10);
        this.x = a10;
        this.b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i11, e6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i11, e6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, e6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        ai.o2 o2Var = new ai.o2(16, context, this);
        this.K = o2Var;
        o2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new mc(org.telegram.ui.ActionBar.k6.D0().q()));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.a), false, e6Var);
        this.r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, R.drawable.msg_map, null, org.telegram.messenger.bd.M0(2131748698, null), true, false, e6Var);
        q0Var.d(3, R.drawable.msg_satellite, null, org.telegram.messenger.bd.M0(2131745958, null), true, false, e6Var);
        q0Var.d(4, R.drawable.msg_hybrid, null, org.telegram.messenger.bd.M0(2131749283, null), true, false, e6Var);
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i12 = org.telegram.ui.ActionBar.k6.kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.k6.lj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, w02, org.telegram.ui.ActionBar.k6.w0(i13, this.a));
        b8.pf.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        cg.p0 p0Var = cg.t0.a;
        q0Var.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(q0Var, j02, N, N2, e6Var);
        q0Var.setIcon(R.drawable.msg_map_type);
        o2Var.addView(q0Var, b8.mf.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        int i14 = 6;
        q0Var.setOnClickListener(new f0(this, i14));
        q0Var.setDelegate(new jk(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.a), org.telegram.ui.ActionBar.k6.w0(i13, this.a));
        b8.pf.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i13);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.r6.k(imageView, j03, N3, N4, e6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i15 = org.telegram.ui.ActionBar.k6.jj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, mode);
        imageView.setTag(Integer.valueOf(i15));
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754831, null));
        o2Var.addView(imageView, b8.mf.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new q2(i14, this, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, b8.mf.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new fi.a(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, e6Var, mode);
        linearLayout.addView(imageView2, b8.mf.o(-2, -2));
        TextView textView = new TextView(context);
        int i16 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView, i16, e6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        k2.p1.u(textView, 1, 17.0f, null, 2131748187);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = f10;
        org.telegram.ui.ActionBar.r6.V(f10, i16, e6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, b8.mf.t(-2, -2, 17, 0, 6, 0, 0));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 16);
        this.M = j1Var;
        setBlur3Capture(j1Var);
        this.d = j1Var;
        this.f = true;
        j1Var.setClipToPadding(false);
        kg.o0 o0Var2 = new kg.o0(context, this.p0, b12, true, e6Var, this.b.G1, false, false);
        this.L = o0Var2;
        j1Var.setAdapter(o0Var2);
        bi biVar3 = this.b;
        o0Var2.X = biVar3 != null && (biVar3.z1 || biVar3.H1);
        j1Var.setItemAnimator(null);
        o0Var2.O(this.U, this.T);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.r1();
        lg.d0 d0Var = new lg.d0(this, j1Var);
        this.Q = d0Var;
        j1Var.setLayoutManager(d0Var);
        addView(j1Var, b8.mf.e(-1, -1, 51));
        j1Var.setOnScrollListener(new rk(this, i3));
        j1Var.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.kk
            public final /* synthetic */ uk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i17, View view2) {
                switch (i3) {
                    case 0:
                        uk.T(this.b, wmVar, e6Var, i17);
                        break;
                    default:
                        uk.V(this.b, wmVar, e6Var, i17);
                        break;
                }
            }
        });
        o0Var2.P(this.q0);
        addView(o2Var, indexOfChild(j1Var), b8.mf.e(-1, -1, 51));
        org.telegram.messenger.sa onCreateMapView = ((mb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        b8.ke keVar = (b8.ke) onCreateMapView;
        keVar.c = new jk(this);
        keVar.d = new org.telegram.ui.jo(16, this, e6Var);
        new Thread(new lk(this, onCreateMapView, i3)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        o2Var.addView(imageView3, b8.mf.e(28, 48, 49));
        tj0 tj0Var = new tj0(context, e6Var);
        this.N = tj0Var;
        tj0Var.setSections(true);
        tj0Var.setClipToPadding(false);
        tj0Var.setVisibility(8);
        tj0Var.setLayoutManager(new u4.b0(1, false));
        sk skVar2 = new sk(this, context, e6Var, this.b.G1);
        this.O = skVar2;
        skVar2.n = new jk(this);
        tj0Var.setItemAnimator(null);
        addView(tj0Var, b8.mf.e(-1, -1, 51));
        final int i17 = 1;
        tj0Var.setOnScrollListener(new rk(this, i17));
        tj0Var.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.kk
            public final /* synthetic */ uk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i172, View view2) {
                switch (i17) {
                    case 0:
                        uk.T(this.b, wmVar, e6Var, i172);
                        break;
                    default:
                        uk.V(this.b, wmVar, e6Var, i172);
                        break;
                }
            }
        });
        j0();
    }

    public static /* synthetic */ void O(uk ukVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ImageView imageView = ukVar.n;
        Activity parentActivity = ukVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            t4.C(ukVar.getParentActivity()).show();
            return;
        }
        if (ukVar.i0 == null || ukVar.E == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.jj;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setTag(Integer.valueOf(i3));
        ukVar.L.L(null);
        ukVar.m0 = false;
        ukVar.E.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.va(ukVar.i0.getLatitude(), ukVar.i0.getLongitude())));
    }

    public static /* synthetic */ void P(uk ukVar, org.telegram.ui.wm wmVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (wmVar != null && wmVar.c()) {
            t4.L(ukVar.getParentActivity(), wmVar.a(), new mk(ukVar, tL_messageMediaVenue, 1), e6Var);
        } else {
            ukVar.o0.d(tL_messageMediaVenue, ukVar.p0, true, 0, 0L);
            ukVar.b.a(true);
        }
    }

    public static /* synthetic */ void Q(uk ukVar) {
        if (ukVar.getParentActivity() == null) {
            return;
        }
        try {
            ukVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public static void R(uk ukVar, org.telegram.messenger.sa saVar) {
        if (ukVar.F == null || ukVar.getParentActivity() == null) {
            return;
        }
        try {
            ((b8.ke) saVar).w();
            ((mb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
            ((b8.ke) ukVar.F).o(new nk(ukVar, 0));
            ukVar.g0 = true;
            if (ukVar.h0) {
                ((b8.ke) ukVar.F).A();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void S(uk ukVar) {
        ci.j1 j1Var = ukVar.M;
        ai.o2 o2Var = ukVar.K;
        if (ukVar.F == null || o2Var == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
        if (layoutParams != null) {
            int i3 = layoutParams.height;
            int i10 = ukVar.r0;
            if (i3 != i10) {
                layoutParams.height = i10;
                o2Var.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) ukVar.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != ukVar.getMapContentHeight()) {
            layoutParams2.height = ukVar.getMapContentHeight();
            ((ai.c0) ((b8.ke) ukVar.F).b).setLayoutParams(layoutParams2);
        }
        ukVar.L.P(ukVar.q0);
        u4.d1 K = j1Var.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != ukVar.q0) {
                view.getLayoutParams().height = ukVar.q0;
                view.requestLayout();
            }
        }
        lg.d0 d0Var = ukVar.Q;
        d0Var.M = 0;
        d0Var.p1();
        j1Var.requestLayout();
        ukVar.i0();
    }

    public static void T(uk ukVar, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        final uk ukVar2;
        org.telegram.ui.wm wmVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = ukVar.W;
        kg.o0 o0Var = ukVar.L;
        bi biVar = ukVar.b;
        int i10 = ukVar.p0;
        if (i10 == 7) {
            if (i3 == 1 && (tL_messageMediaVenue2 = o0Var.V) != null) {
                ukVar.o0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                biVar.a(true);
                return;
            } else if (i3 == 2 && (tL_messageMediaVenue = o0Var.W) != null) {
                ukVar.o0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                biVar.a(true);
                return;
            } else {
                ukVar2 = ukVar;
                wmVar2 = wmVar;
                e6Var2 = e6Var;
            }
        } else {
            if (i3 == 1) {
                if (ukVar.o0 == null || ukVar.j0 == null) {
                    if (ukVar.U) {
                        t4.C(ukVar.getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(ukVar.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(ukVar.j0.getLongitude());
                    t4.Z(biVar.E3, biVar.X0() + 1, biVar.b1(), new ai.v1(ukVar, wmVar, tL_messageMediaGeo, e6Var, 7));
                    return;
                }
            }
            ukVar2 = ukVar;
            wmVar2 = wmVar;
            e6Var2 = e6Var;
            if (i3 == 2 && i10 == 1) {
                if (ukVar2.getLocationController().i(j10)) {
                    ukVar2.getLocationController().k(j10);
                    biVar.a(true);
                    return;
                } else if (ukVar2.i0 == null && ukVar2.U) {
                    t4.C(ukVar2.getParentActivity()).show();
                    return;
                } else {
                    if (ukVar2.o0 == null || ukVar2.getParentActivity() == null || ukVar2.i0 == null) {
                        return;
                    }
                    t4.D(ukVar2.getParentActivity(), false, org.telegram.messenger.m5.E(j10) ? biVar.X1.getMessagesController().a2(Long.valueOf(j10)) : null, new org.telegram.messenger.kr() { // from class: org.telegram.ui.Components.ok
                        @Override // org.telegram.messenger.kr
                        public final void a(int i11) {
                            uk ukVar3 = uk.this;
                            bi biVar2 = ukVar3.b;
                            t4.Z(biVar2.E3, biVar2.X0() + 1, biVar2.b1(), new gi.s3(ukVar3, i11, 4));
                        }
                    }, ukVar2.a).show();
                    return;
                }
            }
        }
        Object I = o0Var.I(i3);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            t4.Z(biVar.E3, biVar.X0() + 1, biVar.b1(), new ai.v1(ukVar2, wmVar2, (TLRPC.TL_messageMediaVenue) I, e6Var2, 8));
        }
    }

    public static /* synthetic */ void U(uk ukVar) {
        kg.o0 o0Var = ukVar.L;
        bi biVar = ukVar.b;
        if (ukVar.c0) {
            int i3 = Build.VERSION.SDK_INT;
            Activity parentActivity = ukVar.getParentActivity();
            if (parentActivity != null) {
                ukVar.c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!biVar.G1 || biVar.u4 == null || i3 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    ukVar.T = true;
                    if (o0Var != null) {
                        o0Var.O(ukVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i3 < 29 || !biVar.G1 || biVar.u4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                ukVar.T = true;
                if (o0Var != null) {
                    o0Var.O(ukVar.U, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, org.telegram.messenger.hs.o3);
            }
        }
    }

    public static void V(uk ukVar, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        bi biVar = ukVar.b;
        TLRPC.TL_messageMediaVenue H = ukVar.O.H(i3);
        if (H != null && ukVar.p0 != 7) {
            biVar.S2.l(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            ukVar.h0(geoPoint.lat, geoPoint._long);
        } else {
            if (H == null || ukVar.o0 == null) {
                return;
            }
            if (wmVar != null && wmVar.c()) {
                t4.L(ukVar.getParentActivity(), wmVar.a(), new mk(ukVar, H, 0), e6Var);
            } else {
                ukVar.o0.d(H, ukVar.p0, true, 0, 0L);
                biVar.a(true);
            }
        }
    }

    public static /* synthetic */ void W(uk ukVar, Location location) {
        int i3;
        bi biVar = ukVar.b;
        if (biVar == null || biVar.X1 == null) {
            return;
        }
        ukVar.g0(location);
        kg.o0 o0Var = ukVar.L;
        if (o0Var != null && (((i3 = ukVar.p0) == 7 || i3 == 8) && !ukVar.m0)) {
            o0Var.L(ukVar.j0);
        }
        ukVar.getLocationController().n(location, ukVar.V);
        ukVar.V = false;
    }

    public static /* synthetic */ void X(uk ukVar, org.telegram.ui.wm wmVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l10) {
        if (wmVar != null && wmVar.c()) {
            t4.L(ukVar.getParentActivity(), wmVar.a(), new aa.a(ukVar, tL_messageMediaGeo, l10, 27), e6Var);
        } else {
            ukVar.o0.d(tL_messageMediaGeo, ukVar.p0, true, 0, l10.longValue());
            ukVar.b.a(true);
        }
    }

    public static void Z(uk ukVar, org.telegram.messenger.z9 z9Var) {
        PackageManager packageManager;
        ukVar.E = z9Var;
        ik ikVar = new ik(ukVar, 3);
        p4.q qVar = z9Var.a;
        int i3 = 4;
        org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(ikVar, i3);
        k8.e eVar = (k8.e) qVar.a;
        try {
            j8.b bVar = new j8.b(p1Var);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 42);
            int i10 = 1;
            if (org.telegram.ui.ActionBar.k6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, ukVar.a)) < 0.721f) {
                ukVar.R = true;
                ukVar.E.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
            }
            if (ukVar.E == null) {
                return;
            }
            Location location = new Location("network");
            ukVar.j0 = location;
            location.setLatitude(20.659322d);
            ukVar.j0.setLongitude(-11.40625d);
            try {
                ukVar.E.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ukVar.E.g().n2();
            ukVar.E.g().s2();
            ukVar.E.g().k2();
            ukVar.E.l(new jk(ukVar));
            org.telegram.messenger.z9 z9Var2 = ukVar.E;
            ik ikVar2 = new ik(ukVar, i3);
            p4.q qVar2 = z9Var2.a;
            org.telegram.messenger.p1 p1Var2 = new org.telegram.messenger.p1(ikVar2, 6);
            k8.e eVar2 = (k8.e) qVar2.a;
            try {
                j8.b bVar2 = new j8.b(p1Var2, 0);
                Parcel P02 = eVar2.P0();
                u7.b.c(P02, bVar2);
                eVar2.T0(P02, 99);
                ukVar.E.n(new nk(ukVar, i10));
                ukVar.E.m(new a3(12));
                ukVar.f0();
                org.telegram.messenger.g0.i3(new ik(ukVar, 5), 200L);
                if (ukVar.S && ukVar.getParentActivity() != null) {
                    ukVar.S = false;
                    Activity parentActivity = ukVar.getParentActivity();
                    if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                        return;
                    }
                    try {
                        if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ukVar.getParentActivity(), ukVar.a);
                            int i11 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.w0(i11, ukVar.a), null);
                            alertDialog$Builder.n(i11, ukVar.a);
                            alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131749538, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751806, null), new jk(ukVar));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                ukVar.i0();
            } catch (RemoteException e12) {
                throw new androidx.car.app.j(e12);
            }
        } catch (RemoteException e13) {
            throw new androidx.car.app.j(e13);
        }
    }

    public static void a0(uk ukVar) {
        kg.o0 o0Var = ukVar.L;
        ci.j1 j1Var = ukVar.M;
        if (ukVar.F == null || ukVar.K == null || ukVar.getMeasuredHeight() == 0) {
            return;
        }
        u4.d1 K = j1Var.K(0);
        if (K != null) {
            View view = K.a;
            int bottom = view.getBottom();
            int b10 = o0Var.b();
            int i3 = 1;
            while (true) {
                if (i3 >= b10) {
                    ukVar.s0 = bottom - view.getBottom();
                    break;
                }
                if (o0Var.d(i3) != 11) {
                    u4.d1 K2 = j1Var.K(i3);
                    if (K2 == null) {
                        break;
                    } else {
                        bottom = Math.max(bottom, K2.a.getBottom());
                    }
                }
                i3++;
            }
        }
        int i10 = ukVar.s0;
        if (i10 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i11 = ukVar.p0;
            i10 = (i11 == 1 || i11 == 7 || i11 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (j1Var.getMeasuredHeight() - ukVar.getDefaultBottomInset()) - i10;
        int measuredHeight2 = ukVar.getMeasuredHeight() + ukVar.getMapExtraTop();
        int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - j1Var.getPaddingTop());
        if (measuredHeight2 == ukVar.r0 && max == ukVar.q0) {
            return;
        }
        ukVar.r0 = measuredHeight2;
        ukVar.q0 = max;
        org.telegram.messenger.g0.h3(new ik(ukVar, 0));
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

    private org.telegram.messenger.ld getLocationController() {
        return this.b.X1.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m;
    }

    private org.telegram.messenger.va getMapTarget() {
        Location location;
        if (this.m0 && (location = this.j0) != null) {
            return new org.telegram.messenger.va(location.getLatitude(), this.j0.getLongitude());
        }
        Location location2 = this.i0;
        if (location2 != null) {
            return new org.telegram.messenger.va(location2.getLatitude(), this.i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.hp getMessagesController() {
        return this.b.X1.getMessagesController();
    }

    private int getMinBottomInset() {
        return d0() ? getDefaultBottomInset() : Math.min(this.e, org.telegram.messenger.g0.n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.d2 d2Var;
        bi biVar = this.b;
        if (biVar == null || (d2Var = biVar.X1) == null) {
            return null;
        }
        return d2Var.getParentActivity();
    }

    private org.telegram.messenger.h10 getUserConfig() {
        return this.b.X1.getUserConfig();
    }

    @Override // org.telegram.ui.Components.th
    public final void A() {
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null && this.g0) {
            try {
                ((b8.ke) saVar).y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int i11;
        int i12;
        bi biVar = this.b;
        if (biVar.S2.o0 || biVar.m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            biVar.r0 = false;
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
                    biVar.r0 = true;
                }
            }
            i12 = (i10 / 5) * 2;
            i11 = i12 - org.telegram.messenger.g0.L(52.0f);
            if (i11 < 0) {
            }
            biVar.r0 = true;
        }
        this.M.q1(0, i11, 0, getMinBottomInset());
        this.N.q1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.th
    public final void C() {
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null && this.g0) {
            try {
                ((b8.ke) saVar).A();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
    }

    @Override // org.telegram.ui.Components.th
    public final void E(float f10, float f11) {
        if (this.u0 == f10 && this.v0 == f11) {
            return;
        }
        this.u0 = f10;
        this.v0 = f11;
        e0();
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        bi biVar = this.b;
        biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131745466, null));
        int i3 = 1;
        if (((ai.c0) ((b8.ke) this.F).b).getParent() == null) {
            ai.c0 c0Var = (ai.c0) ((b8.ke) this.F).b;
            FrameLayout.LayoutParams e10 = b8.mf.e(-1, org.telegram.messenger.g0.L(10.0f) + this.q0, 51);
            ai.o2 o2Var = this.K;
            o2Var.addView(c0Var, 0, e10);
            o2Var.addView(this.J, 1, b8.mf.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null && this.g0) {
            try {
                ((b8.ke) saVar).A();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
        org.telegram.messenger.z9 z9Var = this.E;
        if (z9Var != null) {
            try {
                z9Var.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        org.telegram.messenger.g0.i3(new ik(this, i3), biVar.U3.g0() ? 200L : 0L);
        this.Q.h1(0, 0);
        i0();
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.M.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fj));
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

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.a));
            this.r.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.a));
            this.r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.a), true);
            this.r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.a), false);
        }
        if (this.E != null) {
            if (!org.telegram.ui.ActionBar.k6.I.q() && org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a)) >= 0.721f) {
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
            this.E.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
        }
    }

    public final void c0() {
        if (getMeasuredHeight() == 0 || this.F == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ci.j1 j1Var = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j1Var.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        j1Var.setLayoutParams(layoutParams);
        ai.o2 o2Var = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        o2Var.setLayoutParams(layoutParams2);
        tj0 tj0Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) tj0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        tj0Var.setLayoutParams(layoutParams3);
        int i3 = this.q0;
        kg.o0 o0Var = this.L;
        o0Var.P(i3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) this.F).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.r0;
            ((ai.c0) ((b8.ke) this.F).b).setLayoutParams(layoutParams4);
        }
        o0Var.f();
        i0();
    }

    public final boolean d0() {
        ah ahVar = this.b.s3;
        return (ahVar == null || ahVar.getVisibility() == 8) ? false : true;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.v4;
        kg.o0 o0Var = this.L;
        if (i3 == i11) {
            this.U = false;
            this.T = false;
            f0();
            if (o0Var != null) {
                o0Var.O(this.U, this.T);
            }
            org.telegram.messenger.z9 z9Var = this.E;
            if (z9Var != null) {
                try {
                    z9Var.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.w4) {
            this.U = true;
            this.T = false;
            if (o0Var != null) {
                o0Var.O(true, false);
            }
        }
        c0();
        this.b.getClass();
        this.x.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        ai.o2 o2Var;
        ci.j1 j1Var;
        org.telegram.messenger.va vaVar;
        if (this.F == null || (o2Var = this.K) == null || (j1Var = this.M) == null) {
            return;
        }
        u4.d1 K = j1Var.K(0);
        int top = K != null ? K.a.getTop() + j1Var.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((ai.c0) ((b8.ke) this.F).b).getVisibility() == 0) {
                ((ai.c0) ((b8.ke) this.F).b).setVisibility(4);
                o2Var.setVisibility(4);
                return;
            }
            return;
        }
        if (((ai.c0) ((b8.ke) this.F).b).getVisibility() == 4) {
            ((ai.c0) ((b8.ke) this.F).b).setVisibility(0);
            o2Var.setVisibility(0);
        }
        float f10 = top;
        if (this.v0 < 1.0f) {
            int[] iArr = this.w0;
            getLocationInWindow(iArr);
            f10 = Math.min(top, org.telegram.messenger.g0.W1(this.v0, -iArr[1], top));
        }
        int max = (int) Math.max(f10, -getMapExtraTop());
        int max2 = (Math.max(0, K.a.getTop()) + j1Var.getTop()) - max;
        int min = (Math.min(this.t0, j1Var.getMeasuredHeight()) + j1Var.getTop()) - max;
        this.x0 = org.telegram.messenger.g0.L(32.0f) + max2;
        this.y0 = min;
        this.z0 = Math.max(0, this.r0 - (getMeasuredHeight() - max));
        float f11 = max;
        o2Var.setTranslationY(f11);
        o2Var.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = j1Var.getTop();
        int i3 = min + max;
        float f12 = (top2 + i3) / 2.0f;
        float max3 = Math.max(f12, ((j1Var.getPaddingTop() + top2) + i3) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f12);
        if (ceil != this.D0) {
            this.D0 = ceil;
            org.telegram.messenger.g0.h3(new ik(this, 0));
        }
        float max4 = Math.max(f12, Math.min(max3, ((max + max2) + i3) / 2.0f));
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f13 = max4 - ceil2;
        ((ai.c0) ((b8.ke) this.F).b).setTranslationY(f13 - f11);
        int L = ((int) (max4 - f11)) - org.telegram.messenger.g0.L(48.0f);
        if (L != this.k0) {
            this.k0 = L;
            this.P.setTranslationY(L);
        }
        int measuredHeight = ((ai.c0) ((b8.ke) this.F).b).getMeasuredHeight() > 0 ? ((ai.c0) ((b8.ke) this.F).b).getMeasuredHeight() : getMapContentHeight();
        int max5 = Math.max(0, (int) (measuredHeight - (i3 - f13)));
        int i10 = ((ceil2 * 2) - measuredHeight) + max5;
        org.telegram.messenger.z9 z9Var = this.E;
        if (z9Var != null) {
            int i11 = this.E0;
            if (i10 == i11 && max5 == this.F0) {
                return;
            }
            if (i11 < 0) {
                vaVar = getMapTarget();
            } else if (ceil2 != this.C0) {
                z9Var.d();
                vaVar = (org.telegram.messenger.va) this.E.d().b;
            } else {
                vaVar = null;
            }
            this.C0 = ceil2;
            this.E0 = i10;
            this.F0 = max5;
            this.E.o(0, org.telegram.messenger.g0.L(6.0f) + i10, 0, org.telegram.messenger.g0.L(6.0f) + max5);
            if (vaVar != null) {
                this.E.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(vaVar));
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public final boolean f() {
        return true;
    }

    public final void f0() {
        uk ukVar;
        bi biVar = this.b;
        if (!biVar.G1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            g0(lastLocation);
            return;
        }
        if (biVar.v4 != null) {
            org.telegram.messenger.g0.h3(new ik(this, 2));
            return;
        }
        if (this.U) {
            org.telegram.messenger.g0.h3(new ik(this, 7));
            return;
        }
        File file = biVar.u4;
        boolean z10 = biVar.t4;
        if (file != null) {
            if (!z10) {
                ukVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.lo(28, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                ukVar.i0 = lastLocation2;
                g0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.p7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        ukVar = this;
        Location lastLocation22 = getLastLocation();
        ukVar.i0 = lastLocation22;
        g0(lastLocation22);
    }

    public final void g0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.i0 = location2;
        org.telegram.messenger.z9 z9Var = this.E;
        kg.o0 o0Var = this.L;
        if (z9Var == null) {
            o0Var.M(location2);
            return;
        }
        org.telegram.messenger.va vaVar = new org.telegram.messenger.va(location.getLatitude(), location.getLongitude());
        if (o0Var != null) {
            o0Var.M(this.i0);
        }
        if (this.m0) {
            return;
        }
        this.j0 = new Location(location);
        if (this.n0) {
            this.E.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(vaVar));
            return;
        }
        this.n0 = true;
        this.E.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, this.E.e() - 4.0f));
    }

    @Override // org.telegram.ui.Components.th
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        ci.j1 j1Var = this.M;
        if (j1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        bj0 bj0Var = (bj0) j1Var.K(0);
        return org.telegram.messenger.g0.L(56.0f) + (bj0Var != null ? Math.max((int) bj0Var.a.getY(), 0) : 0);
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.th
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        q6 q6Var = new q6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        ci.j1 j1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.ActionBar.q0 q0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var != null ? q0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i10 = org.telegram.ui.ActionBar.k6.kj;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.lj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.ij;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final void h0(double d, double d10) {
        org.telegram.messenger.na newCameraUpdateLatLngZoom;
        if (this.E == null) {
            return;
        }
        if (d == 0.0d || d10 == 0.0d) {
            Location location = new Location("");
            this.i0 = location;
            location.reset();
            this.i0.setLatitude(d);
            this.i0.setLongitude(d10);
        } else {
            Location location2 = new Location("");
            this.j0 = location2;
            location2.reset();
            this.j0.setLatitude(d);
            this.j0.setLongitude(d10);
        }
        org.telegram.messenger.va vaVar = new org.telegram.messenger.va(d, d10);
        if (d == 0.0d || d10 == 0.0d) {
            newCameraUpdateLatLngZoom = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, this.E.f());
        } else {
            newCameraUpdateLatLngZoom = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, this.E.e() - 4.0f);
        }
        this.G = newCameraUpdateLatLngZoom;
        this.E.h(newCameraUpdateLatLngZoom);
        kg.o0 o0Var = this.L;
        if (d == 0.0d || d10 == 0.0d) {
            o0Var.M(this.i0);
        } else {
            o0Var.L(this.j0);
        }
        o0Var.H();
        this.M.w0(0, 1, null);
        this.l0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.m0 = true;
    }

    public final void i0() {
        ai.o2 o2Var;
        if (this.F == null || (o2Var = this.K) == null) {
            return;
        }
        ci.j1 j1Var = this.M;
        u4.d1 K = j1Var.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            o2Var.getMeasuredHeight();
        }
        int i3 = this.s0;
        if (i3 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i10 = this.p0;
            i3 = (i10 == 1 || i10 == 7 || i10 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (j1Var.getMeasuredHeight() - getBottomInset()) - i3;
        this.t0 = measuredHeight;
        if (K != null) {
            int bottom = measuredHeight - K.a.getBottom();
            int childCount = j1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = j1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    childAt.setTranslationY(bottom);
                }
            }
        }
        e0();
    }

    @Override // org.telegram.ui.Components.th
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
        tj0 tj0Var = this.N;
        if (!z11) {
            tj0Var.setEmptyView(linearLayout);
        } else {
            tj0Var.setEmptyView(null);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10) {
            c0();
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void p() {
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.v4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.w4);
        this.y = true;
        ai.o2 o2Var = this.K;
        if (o2Var != null) {
            o2Var.invalidate();
        }
        try {
            org.telegram.messenger.z9 z9Var = this.E;
            if (z9Var != null) {
                z9Var.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null) {
            ((ai.c0) ((b8.ke) saVar).b).setTranslationY((-org.telegram.messenger.g0.q.y) * 3);
        }
        try {
            org.telegram.messenger.sa saVar2 = this.F;
            if (saVar2 != null) {
                ((b8.ke) saVar2).y();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.sa saVar3 = this.F;
            if (saVar3 != null) {
                ((b8.ke) saVar3).x();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        kg.o0 o0Var = this.L;
        if (o0Var != null) {
            o0Var.F();
        }
        sk skVar = this.O;
        if (skVar != null) {
            skVar.F();
        }
        bi biVar = this.b;
        biVar.S2.l(true);
        biVar.S2.q().removeView(this.x);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(tk tkVar) {
        this.o0 = tkVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        i0();
    }

    @Override // org.telegram.ui.Components.th
    public final void u() {
        this.x.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.z5
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
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void y() {
        bi biVar = this.b;
        this.L.U = (biVar == null || biVar.d) ? false : true;
    }

    @Override // org.telegram.ui.Components.th
    public final void z(int i3, boolean z10) {
        if (z10) {
            this.L.U = false;
        }
    }
}
