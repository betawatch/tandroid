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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wk extends vh implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls {
    public static final /* synthetic */ int F0 = 0;
    public final rk A0;
    public int B0;
    public int C0;
    public org.telegram.messenger.fa D;
    public int D0;
    public org.telegram.messenger.za E;
    public int E0;
    public org.telegram.messenger.ua F;
    public float G;
    public boolean H;
    public final View I;
    public final bi.e5 J;
    public final jg.r0 K;
    public final bi.q1 L;
    public final pj0 M;
    public final uk N;
    public final ImageView O;
    public final kg.c0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final long V;
    public final Paint W;
    public AnimatorSet a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public Location h0;
    public Location i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final ImageView n;
    public vk n0;
    public final int o0;
    public int p0;
    public int q0;
    public final org.telegram.ui.ActionBar.r0 r;
    public int r0;
    public final LinearLayout s;
    public int s0;
    public float t0;
    public float u0;
    public final int[] v0;
    public final TextView w;
    public int w0;
    public final org.telegram.ui.ActionBar.r0 x;
    public int x0;
    public boolean y;
    public int y0;
    public float z0;

    public wk(di diVar, Context context, final org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, diVar);
        this.R = true;
        final int i7 = 0;
        this.S = false;
        this.T = false;
        this.U = true;
        this.W = new Paint();
        this.b0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.p0 = currentActionBarHeight;
        this.q0 = currentActionBarHeight;
        this.r0 = -1;
        this.s0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.t0 = Float.NaN;
        this.u0 = 1.0f;
        this.v0 = new int[2];
        this.x0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z0 = -1.0f;
        this.A0 = new rk(i7, this);
        this.D0 = -1;
        this.E0 = -1;
        org.telegram.messenger.g0.a0();
        di diVar2 = this.b;
        org.telegram.ui.ActionBar.f2 f2Var = diVar2.W1;
        final org.telegram.ui.an anVar = f2Var instanceof org.telegram.ui.an ? (org.telegram.ui.an) f2Var : null;
        long b12 = diVar2.b1();
        this.V = b12;
        int i10 = 7;
        if (this.b.F1) {
            this.o0 = 7;
        } else if (!z9 || anVar == null || anVar.h != null || anVar.c() || org.telegram.messenger.t10.B(anVar.j())) {
            this.o0 = 0;
        } else {
            this.o0 = 1;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.w4);
        this.d0 = false;
        this.c0 = false;
        this.e0 = false;
        jg.r0 r0Var = this.K;
        if (r0Var != null) {
            r0Var.F();
        }
        uk ukVar = this.N;
        if (ukVar != null) {
            ukVar.F();
        }
        this.T = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.r0 a10 = this.b.R2.q().a(0, R.drawable.outline_header_search);
        a10.N();
        a10.H = new kg.v1(this, i10);
        this.x = a10;
        this.b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i11, f6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i11, f6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, f6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.e5 e5Var = new bi.e5(14, context, this);
        this.J = e5Var;
        e5Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new oc(org.telegram.ui.ActionBar.k6.D0().q()));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.a), false, f6Var);
        this.r = r0Var2;
        r0Var2.setClickable(true);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        r0Var2.d(2, R.drawable.msg_map, null, org.telegram.messenger.hd.M0(2131748689, null), true, false, f6Var);
        r0Var2.d(3, R.drawable.msg_satellite, null, org.telegram.messenger.hd.M0(2131745949, null), true, false, f6Var);
        r0Var2.d(4, R.drawable.msg_hybrid, null, org.telegram.messenger.hd.M0(2131749274, null), true, false, f6Var);
        r0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i12 = org.telegram.ui.ActionBar.k6.kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.a);
        int i13 = org.telegram.ui.ActionBar.k6.lj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, w02, org.telegram.ui.ActionBar.k6.w0(i13, this.a));
        c8.ka.a(r0Var2);
        r0Var2.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.q0 q0Var = bg.u0.a;
        r0Var2.setOutlineProvider(q0Var);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
        r0Var2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(r0Var2, j02, N, N2, f6Var);
        r0Var2.setIcon(R.drawable.msg_map_type);
        e5Var.addView(r0Var2, c8.ha.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        r0Var2.setOnClickListener(new h0(this, 6));
        r0Var2.setDelegate(new kk(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.a), org.telegram.ui.ActionBar.k6.w0(i13, this.a));
        c8.ka.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(q0Var);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i13);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.r6.k(imageView, j03, N3, N4, f6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i14 = org.telegram.ui.ActionBar.k6.jj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, f6Var, mode);
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754831, null));
        e5Var.addView(imageView, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new lk(i7, this, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ha.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.b(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, f6Var, mode);
        linearLayout.addView(imageView2, c8.ha.o(-2, -2));
        TextView textView = new TextView(context);
        int i15 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView, i15, f6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        jg.g.v(textView, 1, 17.0f, null, 2131748178);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = f10;
        org.telegram.ui.ActionBar.r6.V(f10, i15, f6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 16);
        this.L = q1Var;
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.f = true;
        q1Var.setClipToPadding(false);
        jg.r0 r0Var3 = new jg.r0(context, this.o0, b12, true, f6Var, this.b.F1, false, false);
        this.K = r0Var3;
        q1Var.setAdapter(r0Var3);
        di diVar3 = this.b;
        r0Var3.W = diVar3 != null && (diVar3.y1 || diVar3.G1);
        q1Var.setItemAnimator(null);
        r0Var3.O(this.T, this.S);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.r1();
        kg.c0 c0Var = new kg.c0(this, q1Var);
        this.P = c0Var;
        q1Var.setLayoutManager(c0Var);
        addView(q1Var, c8.ha.e(-1, -1, 51));
        q1Var.setOnScrollListener(new tk(this, i7));
        q1Var.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.mk
            public final /* synthetic */ wk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i16, View view2) {
                switch (i7) {
                    case 0:
                        wk.T(this.b, anVar, f6Var, i16);
                        break;
                    default:
                        wk.V(this.b, anVar, f6Var, i16);
                        break;
                }
            }
        });
        r0Var3.P(this.p0);
        addView(e5Var, indexOfChild(q1Var), c8.ha.e(-1, -1, 51));
        org.telegram.messenger.za onCreateMapView = ((nb.a) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.E = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.c = new kk(this);
        r7Var.d = new f2(6, this, f6Var);
        new Thread(new nk(this, onCreateMapView, i7)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        e5Var.addView(imageView3, c8.ha.e(28, 48, 49));
        pj0 pj0Var = new pj0(context, f6Var);
        this.M = pj0Var;
        pj0Var.setSections(true);
        pj0Var.setClipToPadding(false);
        pj0Var.setVisibility(8);
        pj0Var.setLayoutManager(new v4.b0(1, false));
        uk ukVar2 = new uk(this, context, f6Var, this.b.F1);
        this.N = ukVar2;
        ukVar2.n = new kk(this);
        pj0Var.setItemAnimator(null);
        addView(pj0Var, c8.ha.e(-1, -1, 51));
        final int i16 = 1;
        pj0Var.setOnScrollListener(new tk(this, i16));
        pj0Var.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.mk
            public final /* synthetic */ wk b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i162, View view2) {
                switch (i16) {
                    case 0:
                        wk.T(this.b, anVar, f6Var, i162);
                        break;
                    default:
                        wk.V(this.b, anVar, f6Var, i162);
                        break;
                }
            }
        });
        j0();
    }

    public static /* synthetic */ void O(wk wkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        ImageView imageView = wkVar.n;
        Activity parentActivity = wkVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            v4.A(wkVar.getParentActivity()).show();
            return;
        }
        if (wkVar.h0 == null || wkVar.D == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.jj;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setTag(Integer.valueOf(i7));
        wkVar.K.L(null);
        wkVar.l0 = false;
        wkVar.D.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(wkVar.h0.getLatitude(), wkVar.h0.getLongitude())));
    }

    public static /* synthetic */ void P(wk wkVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.f6 f6Var) {
        if (anVar != null && anVar.c()) {
            v4.J(wkVar.getParentActivity(), anVar.a(), new ok(wkVar, tL_messageMediaVenue, 1), f6Var);
        } else {
            wkVar.n0.d(tL_messageMediaVenue, wkVar.o0, true, 0, 0L);
            wkVar.b.a(true);
        }
    }

    public static /* synthetic */ void Q(wk wkVar) {
        if (wkVar.getParentActivity() == null) {
            return;
        }
        try {
            wkVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public static void R(wk wkVar, org.telegram.messenger.za zaVar) {
        if (wkVar.E == null || wkVar.getParentActivity() == null) {
            return;
        }
        try {
            ((a8.r7) zaVar).u();
            ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
            ((a8.r7) wkVar.E).p(new pk(wkVar, 0));
            wkVar.f0 = true;
            if (wkVar.g0) {
                ((a8.r7) wkVar.E).z();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void S(wk wkVar) {
        bi.q1 q1Var = wkVar.L;
        bi.e5 e5Var = wkVar.J;
        if (wkVar.E == null || e5Var == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.height;
            int i10 = wkVar.q0;
            if (i7 != i10) {
                layoutParams.height = i10;
                e5Var.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) wkVar.E).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != wkVar.getMapContentHeight()) {
            layoutParams2.height = wkVar.getMapContentHeight();
            ((bi.x5) ((a8.r7) wkVar.E).b).setLayoutParams(layoutParams2);
        }
        wkVar.K.P(wkVar.p0);
        v4.d1 K = q1Var.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != wkVar.p0) {
                view.getLayoutParams().height = wkVar.p0;
                view.requestLayout();
            }
        }
        kg.c0 c0Var = wkVar.P;
        c0Var.M = 0;
        c0Var.p1();
        q1Var.requestLayout();
        wkVar.i0();
    }

    public static void T(wk wkVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        final wk wkVar2;
        org.telegram.ui.an anVar2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = wkVar.V;
        jg.r0 r0Var = wkVar.K;
        di diVar = wkVar.b;
        int i10 = wkVar.o0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.U) != null) {
                wkVar.n0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                diVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.V) != null) {
                wkVar.n0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                diVar.a(true);
                return;
            } else {
                wkVar2 = wkVar;
                anVar2 = anVar;
                f6Var2 = f6Var;
            }
        } else {
            if (i7 == 1) {
                if (wkVar.n0 == null || wkVar.i0 == null) {
                    if (wkVar.T) {
                        v4.A(wkVar.getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(wkVar.i0.getLatitude());
                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(wkVar.i0.getLongitude());
                    v4.X(diVar.D3, diVar.X0() + 1, diVar.b1(), new di.s2(wkVar, anVar, tL_messageMediaGeo, f6Var, 6));
                    return;
                }
            }
            wkVar2 = wkVar;
            anVar2 = anVar;
            f6Var2 = f6Var;
            if (i7 == 2 && i10 == 1) {
                if (wkVar2.getLocationController().i(j3)) {
                    wkVar2.getLocationController().k(j3);
                    diVar.a(true);
                    return;
                } else if (wkVar2.h0 == null && wkVar2.T) {
                    v4.A(wkVar2.getParentActivity()).show();
                    return;
                } else {
                    if (wkVar2.n0 == null || wkVar2.getParentActivity() == null || wkVar2.h0 == null) {
                        return;
                    }
                    v4.B(wkVar2.getParentActivity(), false, org.telegram.messenger.m5.E(j3) ? diVar.W1.getMessagesController().a2(Long.valueOf(j3)) : null, new org.telegram.messenger.sr() { // from class: org.telegram.ui.Components.qk
                        @Override // org.telegram.messenger.sr
                        public final void a(int i11) {
                            wk wkVar3 = wk.this;
                            di diVar2 = wkVar3.b;
                            v4.X(diVar2.D3, diVar2.X0() + 1, diVar2.b1(), new fi.t3(wkVar3, i11, 4));
                        }
                    }, wkVar2.a).show();
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            v4.X(diVar.D3, diVar.X0() + 1, diVar.b1(), new di.s2(wkVar2, anVar2, (TLRPC.TL_messageMediaVenue) I, f6Var2, 7));
        }
    }

    public static /* synthetic */ void U(wk wkVar) {
        jg.r0 r0Var = wkVar.K;
        di diVar = wkVar.b;
        if (wkVar.b0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = wkVar.getParentActivity();
            if (parentActivity != null) {
                wkVar.b0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!diVar.F1 || diVar.t4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    wkVar.S = true;
                    if (r0Var != null) {
                        r0Var.O(wkVar.T, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i7 < 29 || !diVar.F1 || diVar.t4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                wkVar.S = true;
                if (r0Var != null) {
                    r0Var.O(wkVar.T, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, org.telegram.messenger.qs.o3);
            }
        }
    }

    public static void V(wk wkVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        di diVar = wkVar.b;
        TLRPC.TL_messageMediaVenue H = wkVar.N.H(i7);
        if (H != null && wkVar.o0 != 7) {
            diVar.R2.l(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            wkVar.h0(geoPoint.lat, geoPoint._long);
        } else {
            if (H == null || wkVar.n0 == null) {
                return;
            }
            if (anVar != null && anVar.c()) {
                v4.J(wkVar.getParentActivity(), anVar.a(), new ok(wkVar, H, 0), f6Var);
            } else {
                wkVar.n0.d(H, wkVar.o0, true, 0, 0L);
                diVar.a(true);
            }
        }
    }

    public static /* synthetic */ void W(wk wkVar, Location location) {
        int i7;
        di diVar = wkVar.b;
        if (diVar == null || diVar.W1 == null) {
            return;
        }
        wkVar.g0(location);
        jg.r0 r0Var = wkVar.K;
        if (r0Var != null && (((i7 = wkVar.o0) == 7 || i7 == 8) && !wkVar.l0)) {
            r0Var.L(wkVar.i0);
        }
        wkVar.getLocationController().n(location, wkVar.U);
        wkVar.U = false;
    }

    public static /* synthetic */ void X(wk wkVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.f6 f6Var, Long l10) {
        if (anVar != null && anVar.c()) {
            v4.J(wkVar.getParentActivity(), anVar.a(), new a3.h(wkVar, tL_messageMediaGeo, l10, 27), f6Var);
        } else {
            wkVar.n0.d(tL_messageMediaGeo, wkVar.o0, true, 0, l10.longValue());
            wkVar.b.a(true);
        }
    }

    public static void Z(wk wkVar, org.telegram.messenger.fa faVar) {
        PackageManager packageManager;
        wkVar.D = faVar;
        jk jkVar = new jk(wkVar, 3);
        wf.b bVar = faVar.a;
        int i7 = 5;
        org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(jkVar, i7);
        l8.e eVar = (l8.e) bVar.b;
        try {
            k8.c cVar = new k8.c(p1Var);
            Parcel P0 = eVar.P0();
            v7.b.c(P0, cVar);
            eVar.T0(P0, 42);
            int i10 = 1;
            if (org.telegram.ui.ActionBar.k6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, wkVar.a)) < 0.721f) {
                wkVar.Q = true;
                wkVar.D.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
            }
            if (wkVar.D == null) {
                return;
            }
            Location location = new Location("network");
            wkVar.i0 = location;
            location.setLatitude(20.659322d);
            wkVar.i0.setLongitude(-11.40625d);
            try {
                wkVar.D.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            wkVar.D.g().Z1();
            wkVar.D.g().d2();
            wkVar.D.g().X1();
            wkVar.D.l(new kk(wkVar));
            org.telegram.messenger.fa faVar2 = wkVar.D;
            jk jkVar2 = new jk(wkVar, 4);
            wf.b bVar2 = faVar2.a;
            org.telegram.messenger.p1 p1Var2 = new org.telegram.messenger.p1(jkVar2, 7);
            l8.e eVar2 = (l8.e) bVar2.b;
            try {
                k8.c cVar2 = new k8.c(p1Var2, 0);
                Parcel P02 = eVar2.P0();
                v7.b.c(P02, cVar2);
                eVar2.T0(P02, 99);
                wkVar.D.n(new pk(wkVar, i10));
                wkVar.D.m(new k2(15));
                wkVar.f0();
                org.telegram.messenger.g0.i3(new jk(wkVar, i7), 200L);
                if (wkVar.R && wkVar.getParentActivity() != null) {
                    wkVar.R = false;
                    Activity parentActivity = wkVar.getParentActivity();
                    if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                        return;
                    }
                    try {
                        if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wkVar.getParentActivity(), wkVar.a);
                            int i11 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.w0(i11, wkVar.a), null);
                            alertDialog$Builder.n(i11, wkVar.a);
                            alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131749529, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, null), new kk(wkVar));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                wkVar.i0();
            } catch (RemoteException e12) {
                throw new androidx.car.app.j(e12);
            }
        } catch (RemoteException e13) {
            throw new androidx.car.app.j(e13);
        }
    }

    public static void a0(wk wkVar) {
        jg.r0 r0Var = wkVar.K;
        bi.q1 q1Var = wkVar.L;
        if (wkVar.E == null || wkVar.J == null || wkVar.getMeasuredHeight() == 0) {
            return;
        }
        v4.d1 K = q1Var.K(0);
        if (K != null) {
            View view = K.a;
            int bottom = view.getBottom();
            int b10 = r0Var.b();
            int i7 = 1;
            while (true) {
                if (i7 >= b10) {
                    wkVar.r0 = bottom - view.getBottom();
                    break;
                }
                if (r0Var.d(i7) != 11) {
                    v4.d1 K2 = q1Var.K(i7);
                    if (K2 == null) {
                        break;
                    } else {
                        bottom = Math.max(bottom, K2.a.getBottom());
                    }
                }
                i7++;
            }
        }
        int i10 = wkVar.r0;
        if (i10 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i11 = wkVar.o0;
            i10 = (i11 == 1 || i11 == 7 || i11 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (q1Var.getMeasuredHeight() - wkVar.getDefaultBottomInset()) - i10;
        int measuredHeight2 = wkVar.getMeasuredHeight() + wkVar.getMapExtraTop();
        int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - q1Var.getPaddingTop());
        if (measuredHeight2 == wkVar.q0 && max == wkVar.p0) {
            return;
        }
        wkVar.q0 = measuredHeight2;
        wkVar.p0 = max;
        org.telegram.messenger.g0.h3(new jk(wkVar, 0));
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

    private org.telegram.messenger.sd getLocationController() {
        return this.b.W1.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.q0 + this.C0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m;
    }

    private org.telegram.messenger.cb getMapTarget() {
        Location location;
        if (this.l0 && (location = this.i0) != null) {
            return new org.telegram.messenger.cb(location.getLatitude(), this.i0.getLongitude());
        }
        Location location2 = this.h0;
        if (location2 != null) {
            return new org.telegram.messenger.cb(location2.getLatitude(), this.h0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.qp getMessagesController() {
        return this.b.W1.getMessagesController();
    }

    private int getMinBottomInset() {
        return d0() ? getDefaultBottomInset() : Math.min(this.e, org.telegram.messenger.g0.n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.f2 f2Var;
        di diVar = this.b;
        if (diVar == null || (f2Var = diVar.W1) == null) {
            return null;
        }
        return f2Var.getParentActivity();
    }

    private org.telegram.messenger.p10 getUserConfig() {
        return this.b.W1.getUserConfig();
    }

    @Override // org.telegram.ui.Components.vh
    public final void A() {
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null && this.f0) {
            try {
                ((a8.r7) zaVar).x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.g0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        di diVar = this.b;
        if (diVar.R2.n0 || diVar.l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            diVar.q0 = false;
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
                    diVar.q0 = true;
                }
            }
            i12 = (i10 / 5) * 2;
            i11 = i12 - org.telegram.messenger.g0.L(52.0f);
            if (i11 < 0) {
            }
            diVar.q0 = true;
        }
        this.L.q1(0, i11, 0, getMinBottomInset());
        this.M.q1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.vh
    public final void C() {
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null && this.f0) {
            try {
                ((a8.r7) zaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.g0 = true;
    }

    @Override // org.telegram.ui.Components.vh
    public final void E(float f10, float f11) {
        if (this.t0 == f10 && this.u0 == f11) {
            return;
        }
        this.t0 = f10;
        this.u0 = f11;
        e0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        di diVar = this.b;
        diVar.R2.setTitle(org.telegram.messenger.hd.M0(2131745457, null));
        int i7 = 1;
        if (((bi.x5) ((a8.r7) this.E).b).getParent() == null) {
            bi.x5 x5Var = (bi.x5) ((a8.r7) this.E).b;
            FrameLayout.LayoutParams e10 = c8.ha.e(-1, org.telegram.messenger.g0.L(10.0f) + this.p0, 51);
            bi.e5 e5Var = this.J;
            e5Var.addView(x5Var, 0, e10);
            e5Var.addView(this.I, 1, c8.ha.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null && this.f0) {
            try {
                ((a8.r7) zaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.g0 = true;
        org.telegram.messenger.fa faVar = this.D;
        if (faVar != null) {
            try {
                faVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        org.telegram.messenger.g0.i3(new jk(this, i7), diVar.T3.f0() ? 200L : 0L);
        this.P.h1(0, 0);
        i0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.L.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.a6
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
        org.telegram.ui.ActionBar.r0 r0Var = this.r;
        if (r0Var != null) {
            r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.a));
            this.r.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.a));
            this.r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.a), true);
            this.r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.a), false);
        }
        if (this.D != null) {
            if (!org.telegram.ui.ActionBar.k6.I.q() && org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.a)) >= 0.721f) {
                if (this.Q) {
                    this.Q = false;
                    this.D.i(null);
                    return;
                }
                return;
            }
            if (this.Q) {
                return;
            }
            this.Q = true;
            this.D.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
        }
    }

    public final void c0() {
        if (getMeasuredHeight() == 0 || this.E == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        bi.q1 q1Var = this.L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q1Var.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        q1Var.setLayoutParams(layoutParams);
        bi.e5 e5Var = this.J;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e5Var.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.q0;
        e5Var.setLayoutParams(layoutParams2);
        pj0 pj0Var = this.M;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) pj0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        pj0Var.setLayoutParams(layoutParams3);
        int i7 = this.p0;
        jg.r0 r0Var = this.K;
        r0Var.P(i7);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) this.E).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.q0;
            ((bi.x5) ((a8.r7) this.E).b).setLayoutParams(layoutParams4);
        }
        r0Var.f();
        i0();
    }

    public final boolean d0() {
        dh dhVar = this.b.r3;
        return (dhVar == null || dhVar.getVisibility() == 8) ? false : true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.v4;
        jg.r0 r0Var = this.K;
        if (i7 == i11) {
            this.T = false;
            this.S = false;
            f0();
            if (r0Var != null) {
                r0Var.O(this.T, this.S);
            }
            org.telegram.messenger.fa faVar = this.D;
            if (faVar != null) {
                try {
                    faVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.w4) {
            this.T = true;
            this.S = false;
            if (r0Var != null) {
                r0Var.O(true, false);
            }
        }
        c0();
        this.b.getClass();
        this.x.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.e5 e5Var;
        bi.q1 q1Var;
        org.telegram.messenger.cb cbVar;
        if (this.E == null || (e5Var = this.J) == null || (q1Var = this.L) == null) {
            return;
        }
        v4.d1 K = q1Var.K(0);
        int top = K != null ? K.a.getTop() + q1Var.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((bi.x5) ((a8.r7) this.E).b).getVisibility() == 0) {
                ((bi.x5) ((a8.r7) this.E).b).setVisibility(4);
                e5Var.setVisibility(4);
                return;
            }
            return;
        }
        if (((bi.x5) ((a8.r7) this.E).b).getVisibility() == 4) {
            ((bi.x5) ((a8.r7) this.E).b).setVisibility(0);
            e5Var.setVisibility(0);
        }
        float f10 = top;
        if (this.u0 < 1.0f) {
            int[] iArr = this.v0;
            getLocationInWindow(iArr);
            f10 = Math.min(top, org.telegram.messenger.g0.W1(this.u0, -iArr[1], top));
        }
        int max = (int) Math.max(f10, -getMapExtraTop());
        int max2 = (Math.max(0, K.a.getTop()) + q1Var.getTop()) - max;
        int min = (Math.min(this.s0, q1Var.getMeasuredHeight()) + q1Var.getTop()) - max;
        this.w0 = org.telegram.messenger.g0.L(32.0f) + max2;
        this.x0 = min;
        this.y0 = Math.max(0, this.q0 - (getMeasuredHeight() - max));
        float f11 = max;
        e5Var.setTranslationY(f11);
        e5Var.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.q0 - min));
        int top2 = q1Var.getTop();
        int i7 = min + max;
        float f12 = (top2 + i7) / 2.0f;
        float max3 = Math.max(f12, ((q1Var.getPaddingTop() + top2) + i7) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f12);
        if (ceil != this.C0) {
            this.C0 = ceil;
            org.telegram.messenger.g0.h3(new jk(this, 0));
        }
        float max4 = Math.max(f12, Math.min(max3, ((max + max2) + i7) / 2.0f));
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f13 = max4 - ceil2;
        ((bi.x5) ((a8.r7) this.E).b).setTranslationY(f13 - f11);
        int L = ((int) (max4 - f11)) - org.telegram.messenger.g0.L(48.0f);
        if (L != this.j0) {
            this.j0 = L;
            this.O.setTranslationY(L);
        }
        int measuredHeight = ((bi.x5) ((a8.r7) this.E).b).getMeasuredHeight() > 0 ? ((bi.x5) ((a8.r7) this.E).b).getMeasuredHeight() : getMapContentHeight();
        int max5 = Math.max(0, (int) (measuredHeight - (i7 - f13)));
        int i10 = ((ceil2 * 2) - measuredHeight) + max5;
        org.telegram.messenger.fa faVar = this.D;
        if (faVar != null) {
            int i11 = this.D0;
            if (i10 == i11 && max5 == this.E0) {
                return;
            }
            if (i11 < 0) {
                cbVar = getMapTarget();
            } else if (ceil2 != this.B0) {
                faVar.d();
                cbVar = (org.telegram.messenger.cb) this.D.d().b;
            } else {
                cbVar = null;
            }
            this.B0 = ceil2;
            this.D0 = i10;
            this.E0 = max5;
            this.D.o(0, org.telegram.messenger.g0.L(6.0f) + i10, 0, org.telegram.messenger.g0.L(6.0f) + max5);
            if (cbVar != null) {
                this.D.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(cbVar));
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean f() {
        return true;
    }

    public final void f0() {
        wk wkVar;
        di diVar = this.b;
        if (!diVar.F1) {
            Location lastLocation = getLastLocation();
            this.h0 = lastLocation;
            g0(lastLocation);
            return;
        }
        if (diVar.u4 != null) {
            org.telegram.messenger.g0.h3(new jk(this, 2));
            return;
        }
        if (this.T) {
            org.telegram.messenger.g0.h3(new jk(this, 7));
            return;
        }
        File file = diVar.t4;
        boolean z9 = diVar.s4;
        if (file != null) {
            if (!z9) {
                wkVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    org.telegram.messenger.g0.h3(new f(23, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                wkVar.h0 = lastLocation2;
                g0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.q7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        wkVar = this;
        Location lastLocation22 = getLastLocation();
        wkVar.h0 = lastLocation22;
        g0(lastLocation22);
    }

    public final void g0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.h0 = location2;
        org.telegram.messenger.fa faVar = this.D;
        jg.r0 r0Var = this.K;
        if (faVar == null) {
            r0Var.M(location2);
            return;
        }
        org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
        if (r0Var != null) {
            r0Var.M(this.h0);
        }
        if (this.l0) {
            return;
        }
        this.i0 = new Location(location);
        if (this.m0) {
            this.D.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(cbVar));
            return;
        }
        this.m0 = true;
        this.D.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, this.D.e() - 4.0f));
    }

    @Override // org.telegram.ui.Components.vh
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.L;
        if (q1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        xi0 xi0Var = (xi0) q1Var.K(0);
        return org.telegram.messenger.g0.L(56.0f) + (xi0Var != null ? Math.max((int) xi0Var.a.getY(), 0) : 0);
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.L.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.vh
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        s6 s6Var = new s6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        int i7 = org.telegram.ui.ActionBar.k6.A5;
        bi.q1 q1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var != null ? r0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        int i10 = org.telegram.ui.ActionBar.k6.kj;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.lj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.ij;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.ua newCameraUpdateLatLngZoom;
        if (this.D == null) {
            return;
        }
        if (d == 0.0d || d2 == 0.0d) {
            Location location = new Location("");
            this.h0 = location;
            location.reset();
            this.h0.setLatitude(d);
            this.h0.setLongitude(d2);
        } else {
            Location location2 = new Location("");
            this.i0 = location2;
            location2.reset();
            this.i0.setLatitude(d);
            this.i0.setLongitude(d2);
        }
        org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(d, d2);
        if (d == 0.0d || d2 == 0.0d) {
            newCameraUpdateLatLngZoom = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, this.D.f());
        } else {
            newCameraUpdateLatLngZoom = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, this.D.e() - 4.0f);
        }
        this.F = newCameraUpdateLatLngZoom;
        this.D.h(newCameraUpdateLatLngZoom);
        jg.r0 r0Var = this.K;
        if (d == 0.0d || d2 == 0.0d) {
            r0Var.M(this.h0);
        } else {
            r0Var.L(this.i0);
        }
        r0Var.H();
        this.L.w0(0, 1, null);
        this.k0 = true;
        if (d == 0.0d || d2 == 0.0d) {
            return;
        }
        this.l0 = true;
    }

    public final void i0() {
        bi.e5 e5Var;
        if (this.E == null || (e5Var = this.J) == null) {
            return;
        }
        bi.q1 q1Var = this.L;
        v4.d1 K = q1Var.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            e5Var.getMeasuredHeight();
        }
        int i7 = this.r0;
        if (i7 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i10 = this.o0;
            i7 = (i10 == 1 || i10 == 7 || i10 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (q1Var.getMeasuredHeight() - getBottomInset()) - i7;
        this.s0 = measuredHeight;
        if (K != null) {
            int bottom = measuredHeight - K.a.getBottom();
            int childCount = q1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = q1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    childAt.setTranslationY(bottom);
                }
            }
        }
        e0();
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    public final void j0() {
        boolean z9 = this.c0;
        LinearLayout linearLayout = this.s;
        if (!z9) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z10 = this.e0;
        pj0 pj0Var = this.M;
        if (!z10) {
            pj0Var.setEmptyView(linearLayout);
        } else {
            pj0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.A0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.A0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9) {
            c0();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.w4);
        this.y = true;
        bi.e5 e5Var = this.J;
        if (e5Var != null) {
            e5Var.invalidate();
        }
        try {
            org.telegram.messenger.fa faVar = this.D;
            if (faVar != null) {
                faVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null) {
            ((bi.x5) ((a8.r7) zaVar).b).setTranslationY((-org.telegram.messenger.g0.q.y) * 3);
        }
        try {
            org.telegram.messenger.za zaVar2 = this.E;
            if (zaVar2 != null) {
                ((a8.r7) zaVar2).x();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.za zaVar3 = this.E;
            if (zaVar3 != null) {
                ((a8.r7) zaVar3).w();
                this.E = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.K;
        if (r0Var != null) {
            r0Var.F();
        }
        uk ukVar = this.N;
        if (ukVar != null) {
            ukVar.F();
        }
        di diVar = this.b;
        diVar.R2.l(true);
        diVar.R2.q().removeView(this.x);
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(vk vkVar) {
        this.n0 = vkVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        i0();
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        this.x.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.x;
        if (r0Var != null) {
            try {
                if (r0Var.getSearchField() != null) {
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void y() {
        di diVar = this.b;
        this.K.T = (diVar == null || diVar.d) ? false : true;
    }

    @Override // org.telegram.ui.Components.vh
    public final void z(int i7, boolean z9) {
        if (z9) {
            this.K.T = false;
        }
    }
}
