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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kl extends ki implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public static final /* synthetic */ int G0 = 0;
    public float A0;
    public final fl B0;
    public int C0;
    public int D0;
    public org.telegram.messenger.da E;
    public int E0;
    public org.telegram.messenger.xa F;
    public int F0;
    public org.telegram.messenger.sa G;
    public float H;
    public boolean I;
    public final View J;
    public final bi.a3 K;
    public final jg.r0 L;
    public final di.b1 M;
    public final ck0 N;
    public final il O;
    public final ImageView P;
    public final kg.c0 Q;
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
    public jl o0;
    public final int p0;
    public int q0;
    public final org.telegram.ui.ActionBar.r0 r;
    public int r0;
    public final LinearLayout s;
    public int s0;
    public int t0;
    public float u0;
    public float v0;
    public final TextView w;
    public final int[] w0;
    public final org.telegram.ui.ActionBar.r0 x;
    public int x0;
    public boolean y;
    public int y0;
    public int z0;

    public kl(si siVar, Context context, final org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, siVar);
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
        this.B0 = new fl(i7, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        si siVar2 = this.b;
        org.telegram.ui.ActionBar.h2 h2Var = siVar2.a2;
        final org.telegram.ui.bn bnVar = h2Var instanceof org.telegram.ui.bn ? (org.telegram.ui.bn) h2Var : null;
        long c12 = siVar2.c1();
        this.W = c12;
        if (this.b.J1) {
            this.p0 = 7;
        } else if (!z10 || bnVar == null || bnVar.h != null || bnVar.c() || org.telegram.messenger.o10.C(bnVar.j())) {
            this.p0 = 0;
        } else {
            this.p0 = 1;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.z4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        il ilVar = this.O;
        if (ilVar != null) {
            ilVar.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.r0 a10 = this.b.V2.t().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new bi.s1(this, 8);
        this.x = a10;
        this.b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        a10.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(searchField, i10, i6Var);
        org.telegram.ui.ActionBar.u6.v(searchField, i10, i6Var);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, i6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.a3 a3Var = new bi.a3(15, context, this);
        this.K = a3Var;
        a3Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new sc(org.telegram.ui.ActionBar.n6.D0().q()));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lj, this.a), false, i6Var);
        this.r = r0Var2;
        r0Var2.setClickable(true);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        r0Var2.d(2, R.drawable.msg_map, null, org.telegram.messenger.gd.M0(2131748498, null), true, false, i6Var);
        r0Var2.d(3, R.drawable.msg_satellite, null, org.telegram.messenger.gd.M0(2131745753, null), true, false, i6Var);
        r0Var2.d(4, R.drawable.msg_hybrid, null, org.telegram.messenger.gd.M0(2131749083, null), true, false, i6Var);
        r0Var2.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i11 = org.telegram.ui.ActionBar.n6.nj;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, this.a);
        int i12 = org.telegram.ui.ActionBar.n6.oj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(L, w02, org.telegram.ui.ActionBar.n6.w0(i12, this.a));
        c8.ra.a(r0Var2);
        r0Var2.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.q0 q0Var = bg.u0.a;
        r0Var2.setOutlineProvider(q0Var);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        r0Var2.setBackground(j02);
        org.telegram.ui.ActionBar.u6.j(r0Var2, j02, M, M2, i6Var);
        r0Var2.setIcon(R.drawable.msg_map_type);
        a3Var.addView(r0Var2, c8.ma.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        r0Var2.setOnClickListener(new n0(this, 7));
        r0Var2.setDelegate(new zk(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.n6.w0(i11, this.a), org.telegram.ui.ActionBar.n6.w0(i12, this.a));
        c8.ra.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(q0Var);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i11);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i12);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.u6.j(imageView, j03, M3, M4, i6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i13 = org.telegram.ui.ActionBar.n6.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i13, i6Var, mode);
        imageView.setTag(Integer.valueOf(i13));
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131754831, null));
        a3Var.addView(imageView, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new y7(3, this, i6Var));
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
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.W5, i6Var, mode);
        linearLayout.addView(imageView2, c8.ma.o(-2, -2));
        TextView textView = new TextView(context);
        int i15 = org.telegram.ui.ActionBar.n6.X5;
        org.telegram.ui.ActionBar.u6.U(textView, i15, i6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5.c.r(17.0f, 1, 2131747987, textView, null);
        TextView f10 = org.telegram.messenger.n10.f(linearLayout, textView, c8.ma.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = f10;
        org.telegram.ui.ActionBar.u6.U(f10, i15, i6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ma.t(-2, -2, 17, 0, 6, 0, 0));
        di.b1 b1Var = new di.b1(this, context, i6Var, i14);
        this.M = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.f = true;
        b1Var.setClipToPadding(false);
        jg.r0 r0Var3 = new jg.r0(context, this.p0, c12, true, i6Var, this.b.J1, false, false);
        this.L = r0Var3;
        b1Var.setAdapter(r0Var3);
        si siVar3 = this.b;
        r0Var3.X = siVar3 != null && (siVar3.C1 || siVar3.K1);
        b1Var.setItemAnimator(null);
        r0Var3.O(this.U, this.T);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.r1();
        kg.c0 c0Var = new kg.c0(this, b1Var);
        this.Q = c0Var;
        b1Var.setLayoutManager(c0Var);
        addView(b1Var, c8.ma.e(-1, -1, 51));
        b1Var.setOnScrollListener(new hl(this, i7));
        b1Var.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.al
            public final /* synthetic */ kl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.oj0
            public final void c(int i16, View view2) {
                switch (i7) {
                    case 0:
                        kl.U(this.b, bnVar, i6Var, i16);
                        break;
                    default:
                        kl.W(this.b, bnVar, i6Var, i16);
                        break;
                }
            }
        });
        r0Var3.P(this.q0);
        addView(a3Var, indexOfChild(b1Var), c8.ma.e(-1, -1, 51));
        org.telegram.messenger.xa onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.c = new zk(this);
        r7Var.d = new g2(9, this, i6Var);
        new Thread(new bl(this, onCreateMapView, i7)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        a3Var.addView(imageView3, c8.ma.e(28, 48, 49));
        ck0 ck0Var = new ck0(context, i6Var);
        this.N = ck0Var;
        ck0Var.setSections(true);
        ck0Var.setClipToPadding(false);
        ck0Var.setVisibility(8);
        ck0Var.setLayoutManager(new v4.c0(1, false));
        il ilVar2 = new il(this, context, i6Var, this.b.J1);
        this.O = ilVar2;
        ilVar2.n = new zk(this);
        ck0Var.setItemAnimator(null);
        addView(ck0Var, c8.ma.e(-1, -1, 51));
        final int i16 = 1;
        ck0Var.setOnScrollListener(new hl(this, i16));
        ck0Var.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.al
            public final /* synthetic */ kl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.oj0
            public final void c(int i162, View view2) {
                switch (i16) {
                    case 0:
                        kl.U(this.b, bnVar, i6Var, i162);
                        break;
                    default:
                        kl.W(this.b, bnVar, i6Var, i162);
                        break;
                }
            }
        });
        j0();
    }

    public static /* synthetic */ void P(kl klVar, org.telegram.ui.ActionBar.i6 i6Var) {
        ImageView imageView = klVar.n;
        Activity parentActivity = klVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            b5.A(klVar.getParentActivity()).show();
            return;
        }
        if (klVar.i0 == null || klVar.E == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.mj;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setTag(Integer.valueOf(i7));
        klVar.L.L(null);
        klVar.m0 = false;
        klVar.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.ab(klVar.i0.getLatitude(), klVar.i0.getLongitude())));
    }

    public static /* synthetic */ void Q(kl klVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.i6 i6Var) {
        if (bnVar != null && bnVar.c()) {
            b5.J(klVar.getParentActivity(), bnVar.a(), new cl(klVar, tL_messageMediaVenue, 1), i6Var);
        } else {
            klVar.o0.b(tL_messageMediaVenue, klVar.p0, true, 0, 0L);
            klVar.b.a(true);
        }
    }

    public static /* synthetic */ void R(kl klVar) {
        if (klVar.getParentActivity() == null) {
            return;
        }
        try {
            klVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public static void S(kl klVar, org.telegram.messenger.xa xaVar) {
        if (klVar.F == null || klVar.getParentActivity() == null) {
            return;
        }
        try {
            ((a8.r7) xaVar).y();
            ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
            ((a8.r7) klVar.F).t(new dl(klVar, 0));
            klVar.g0 = true;
            if (klVar.h0) {
                ((a8.r7) klVar.F).F();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void T(kl klVar) {
        di.b1 b1Var = klVar.M;
        bi.a3 a3Var = klVar.K;
        if (klVar.F == null || a3Var == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a3Var.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.height;
            int i10 = klVar.r0;
            if (i7 != i10) {
                layoutParams.height = i10;
                a3Var.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) klVar.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != klVar.getMapContentHeight()) {
            layoutParams2.height = klVar.getMapContentHeight();
            ((ai.k0) ((a8.r7) klVar.F).b).setLayoutParams(layoutParams2);
        }
        klVar.L.P(klVar.q0);
        v4.f1 K = b1Var.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != klVar.q0) {
                view.getLayoutParams().height = klVar.q0;
                view.requestLayout();
            }
        }
        kg.c0 c0Var = klVar.Q;
        c0Var.M = 0;
        c0Var.p1();
        b1Var.requestLayout();
        klVar.i0();
    }

    public static void U(kl klVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        final kl klVar2;
        org.telegram.ui.bn bnVar2;
        org.telegram.ui.ActionBar.i6 i6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = klVar.W;
        jg.r0 r0Var = klVar.L;
        si siVar = klVar.b;
        int i10 = klVar.p0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.V) != null) {
                klVar.o0.b(tL_messageMediaVenue2, i10, true, 0, 0L);
                siVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.W) != null) {
                klVar.o0.b(tL_messageMediaVenue, i10, true, 0, 0L);
                siVar.a(true);
                return;
            } else {
                klVar2 = klVar;
                bnVar2 = bnVar;
                i6Var2 = i6Var;
            }
        } else {
            if (i7 == 1) {
                if (klVar.o0 == null || klVar.j0 == null) {
                    if (klVar.U) {
                        b5.A(klVar.getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(klVar.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(klVar.j0.getLongitude());
                    b5.X(siVar.H3, siVar.Y0() + 1, siVar.c1(), new bi.i2(klVar, bnVar, tL_messageMediaGeo, i6Var, 7));
                    return;
                }
            }
            klVar2 = klVar;
            bnVar2 = bnVar;
            i6Var2 = i6Var;
            if (i7 == 2 && i10 == 1) {
                if (klVar2.getLocationController().i(j3)) {
                    klVar2.getLocationController().k(j3);
                    siVar.a(true);
                    return;
                } else if (klVar2.i0 == null && klVar2.U) {
                    b5.A(klVar2.getParentActivity()).show();
                    return;
                } else {
                    if (klVar2.o0 == null || klVar2.getParentActivity() == null || klVar2.i0 == null) {
                        return;
                    }
                    b5.B(klVar2.getParentActivity(), false, org.telegram.messenger.n5.E(j3) ? siVar.a2.getMessagesController().c2(Long.valueOf(j3)) : null, new org.telegram.messenger.nr() { // from class: org.telegram.ui.Components.el
                        @Override // org.telegram.messenger.nr
                        public final void a(int i11) {
                            kl klVar3 = kl.this;
                            si siVar2 = klVar3.b;
                            b5.X(siVar2.H3, siVar2.Y0() + 1, siVar2.c1(), new ai.y1(klVar3, i11, 6));
                        }
                    }, klVar2.a).show();
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            b5.X(siVar.H3, siVar.Y0() + 1, siVar.c1(), new bi.i2(klVar2, bnVar2, (TLRPC.TL_messageMediaVenue) I, i6Var2, 8));
        }
    }

    public static /* synthetic */ void V(kl klVar) {
        jg.r0 r0Var = klVar.L;
        si siVar = klVar.b;
        if (klVar.c0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = klVar.getParentActivity();
            if (parentActivity != null) {
                klVar.c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!siVar.J1 || siVar.x4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    klVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(klVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i7 < 29 || !siVar.J1 || siVar.x4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                klVar.T = true;
                if (r0Var != null) {
                    r0Var.O(klVar.U, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, org.telegram.messenger.ks.o3);
            }
        }
    }

    public static void W(kl klVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        si siVar = klVar.b;
        TLRPC.TL_messageMediaVenue H = klVar.O.H(i7);
        if (H != null && klVar.p0 != 7) {
            siVar.V2.o(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            klVar.h0(geoPoint.lat, geoPoint._long);
        } else {
            if (H == null || klVar.o0 == null) {
                return;
            }
            if (bnVar != null && bnVar.c()) {
                b5.J(klVar.getParentActivity(), bnVar.a(), new cl(klVar, H, 0), i6Var);
            } else {
                klVar.o0.b(H, klVar.p0, true, 0, 0L);
                siVar.a(true);
            }
        }
    }

    public static /* synthetic */ void X(kl klVar, Location location) {
        int i7;
        si siVar = klVar.b;
        if (siVar == null || siVar.a2 == null) {
            return;
        }
        klVar.g0(location);
        jg.r0 r0Var = klVar.L;
        if (r0Var != null && (((i7 = klVar.p0) == 7 || i7 == 8) && !klVar.m0)) {
            r0Var.L(klVar.j0);
        }
        klVar.getLocationController().n(location, klVar.V);
        klVar.V = false;
    }

    public static /* synthetic */ void Y(kl klVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.i6 i6Var, Long l10) {
        if (bnVar != null && bnVar.c()) {
            b5.J(klVar.getParentActivity(), bnVar.a(), new a3.h(klVar, tL_messageMediaGeo, l10, 28), i6Var);
        } else {
            klVar.o0.b(tL_messageMediaGeo, klVar.p0, true, 0, l10.longValue());
            klVar.b.a(true);
        }
    }

    public static void Z(kl klVar, org.telegram.messenger.da daVar) {
        PackageManager packageManager;
        klVar.E = daVar;
        yk ykVar = new yk(klVar, 3);
        k8.a aVar = daVar.a;
        int i7 = 5;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(ykVar, i7);
        l8.e eVar = (l8.e) aVar.b;
        try {
            k8.c cVar = new k8.c(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 42);
            int i10 = 1;
            if (org.telegram.ui.ActionBar.n6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, klVar.a)) < 0.721f) {
                klVar.R = true;
                klVar.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
            }
            if (klVar.E == null) {
                return;
            }
            Location location = new Location("network");
            klVar.j0 = location;
            location.setLatitude(20.659322d);
            klVar.j0.setLongitude(-11.40625d);
            try {
                klVar.E.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            klVar.E.g().w2();
            klVar.E.g().B2();
            klVar.E.g().r2();
            klVar.E.l(new zk(klVar));
            org.telegram.messenger.da daVar2 = klVar.E;
            yk ykVar2 = new yk(klVar, 4);
            k8.a aVar2 = daVar2.a;
            org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(ykVar2, 8);
            l8.e eVar2 = (l8.e) aVar2.b;
            try {
                k8.c cVar2 = new k8.c(j1Var2, (short) 0);
                Parcel p13 = eVar2.p1();
                v7.b.c(p13, cVar2);
                eVar2.t1(p13, 99);
                org.telegram.messenger.da daVar3 = klVar.E;
                dl dlVar = new dl(klVar, i10);
                k8.a aVar3 = daVar3.a;
                org.telegram.messenger.j1 j1Var3 = new org.telegram.messenger.j1(dlVar, 6);
                l8.e eVar3 = (l8.e) aVar3.b;
                try {
                    k8.c cVar3 = new k8.c(j1Var3);
                    Parcel p14 = eVar3.p1();
                    v7.b.c(p14, cVar3);
                    eVar3.t1(p14, 36);
                    klVar.E.m(new k2(20));
                    klVar.f0();
                    org.telegram.messenger.g0.h3(new yk(klVar, i7), 200L);
                    if (klVar.S && klVar.getParentActivity() != null) {
                        klVar.S = false;
                        Activity parentActivity = klVar.getParentActivity();
                        if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                            return;
                        }
                        try {
                            if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, klVar.getParentActivity(), klVar.a);
                                int i11 = org.telegram.ui.ActionBar.n6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.n6.w0(i11, klVar.a), null);
                                alertDialog$Builder.n(i11, klVar.a);
                                alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131749355, null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751795, null), new zk(klVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.p();
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                    klVar.i0();
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

    public static void a0(kl klVar) {
        jg.r0 r0Var = klVar.L;
        di.b1 b1Var = klVar.M;
        if (klVar.F == null || klVar.K == null || klVar.getMeasuredHeight() == 0) {
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
                    klVar.s0 = bottom - view.getBottom();
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
        int i10 = klVar.s0;
        if (i10 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i11 = klVar.p0;
            i10 = (i11 == 1 || i11 == 7 || i11 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (b1Var.getMeasuredHeight() - klVar.getDefaultBottomInset()) - i10;
        int measuredHeight2 = klVar.getMeasuredHeight() + klVar.getMapExtraTop();
        int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - b1Var.getPaddingTop());
        if (measuredHeight2 == klVar.r0 && max == klVar.q0) {
            return;
        }
        klVar.r0 = measuredHeight2;
        klVar.q0 = max;
        org.telegram.messenger.g0.g3(new yk(klVar, 0));
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

    private org.telegram.messenger.qd getLocationController() {
        return this.b.a2.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m;
    }

    private org.telegram.messenger.ab getMapTarget() {
        Location location;
        if (this.m0 && (location = this.j0) != null) {
            return new org.telegram.messenger.ab(location.getLatitude(), this.j0.getLongitude());
        }
        Location location2 = this.i0;
        if (location2 != null) {
            return new org.telegram.messenger.ab(location2.getLatitude(), this.i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.mp getMessagesController() {
        return this.b.a2.getMessagesController();
    }

    private int getMinBottomInset() {
        return d0() ? getDefaultBottomInset() : Math.min(this.e, org.telegram.messenger.g0.n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.h2 h2Var;
        si siVar = this.b;
        if (siVar == null || (h2Var = siVar.a2) == null) {
            return null;
        }
        return h2Var.getParentActivity();
    }

    private org.telegram.messenger.j10 getUserConfig() {
        return this.b.a2.getUserConfig();
    }

    @Override // org.telegram.ui.Components.ki
    public final void A() {
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null && this.g0) {
            try {
                ((a8.r7) xaVar).B();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        si siVar = this.b;
        if (siVar.V2.o0 || siVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            siVar.r0 = false;
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
                    siVar.r0 = true;
                }
            }
            i12 = (i10 / 5) * 2;
            i11 = i12 - org.telegram.messenger.g0.L(52.0f);
            if (i11 < 0) {
            }
            siVar.r0 = true;
        }
        this.M.q1(0, i11, 0, getMinBottomInset());
        this.N.q1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ki
    public final void C() {
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null && this.g0) {
            try {
                ((a8.r7) xaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
    }

    @Override // org.telegram.ui.Components.ki
    public final void F(float f10, float f11) {
        if (this.u0 == f10 && this.v0 == f11) {
            return;
        }
        this.u0 = f10;
        this.v0 = f11;
        e0();
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        si siVar = this.b;
        siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131745261, null));
        int i7 = 1;
        if (((ai.k0) ((a8.r7) this.F).b).getParent() == null) {
            ai.k0 k0Var = (ai.k0) ((a8.r7) this.F).b;
            FrameLayout.LayoutParams e10 = c8.ma.e(-1, org.telegram.messenger.g0.L(10.0f) + this.q0, 51);
            bi.a3 a3Var = this.K;
            a3Var.addView(k0Var, 0, e10);
            a3Var.addView(this.J, 1, c8.ma.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null && this.g0) {
            try {
                ((a8.r7) xaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
        org.telegram.messenger.da daVar = this.E;
        if (daVar != null) {
            try {
                daVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        org.telegram.messenger.g0.h3(new yk(this, i7), siVar.X3.g0() ? 200L : 0L);
        this.Q.h1(0, 0);
        i0();
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.M.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.r;
        if (r0Var != null) {
            r0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lj, this.a));
            this.r.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.a));
            this.r.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, this.a), true);
            this.r.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.a), false);
        }
        if (this.E != null) {
            if (!org.telegram.ui.ActionBar.n6.I.q() && org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.a)) >= 0.721f) {
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
        bi.a3 a3Var = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a3Var.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        a3Var.setLayoutParams(layoutParams2);
        ck0 ck0Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ck0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        ck0Var.setLayoutParams(layoutParams3);
        int i7 = this.q0;
        jg.r0 r0Var = this.L;
        r0Var.P(i7);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) this.F).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.r0;
            ((ai.k0) ((a8.r7) this.F).b).setLayoutParams(layoutParams4);
        }
        r0Var.f();
        i0();
    }

    public final boolean d0() {
        sh shVar = this.b.v3;
        return (shVar == null || shVar.getVisibility() == 8) ? false : true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.y4;
        jg.r0 r0Var = this.L;
        if (i7 == i11) {
            this.U = false;
            this.T = false;
            f0();
            if (r0Var != null) {
                r0Var.O(this.U, this.T);
            }
            org.telegram.messenger.da daVar = this.E;
            if (daVar != null) {
                try {
                    daVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.z4) {
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

    @Override // org.telegram.ui.Components.ki
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.a3 a3Var;
        di.b1 b1Var;
        org.telegram.messenger.ab abVar;
        if (this.F == null || (a3Var = this.K) == null || (b1Var = this.M) == null) {
            return;
        }
        v4.f1 K = b1Var.K(0);
        int top = K != null ? K.a.getTop() + b1Var.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((ai.k0) ((a8.r7) this.F).b).getVisibility() == 0) {
                ((ai.k0) ((a8.r7) this.F).b).setVisibility(4);
                a3Var.setVisibility(4);
                return;
            }
            return;
        }
        if (((ai.k0) ((a8.r7) this.F).b).getVisibility() == 4) {
            ((ai.k0) ((a8.r7) this.F).b).setVisibility(0);
            a3Var.setVisibility(0);
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
        a3Var.setTranslationY(f11);
        a3Var.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = b1Var.getTop();
        int i7 = min + max;
        float f12 = (top2 + i7) / 2.0f;
        float max3 = Math.max(f12, ((b1Var.getPaddingTop() + top2) + i7) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f12);
        if (ceil != this.D0) {
            this.D0 = ceil;
            org.telegram.messenger.g0.g3(new yk(this, 0));
        }
        float C = a8.p0.C(max + max2 + i7, 2.0f, max3, f12);
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f13 = C - ceil2;
        ((ai.k0) ((a8.r7) this.F).b).setTranslationY(f13 - f11);
        int L = ((int) (C - f11)) - org.telegram.messenger.g0.L(48.0f);
        if (L != this.k0) {
            this.k0 = L;
            this.P.setTranslationY(L);
        }
        int measuredHeight = ((ai.k0) ((a8.r7) this.F).b).getMeasuredHeight() > 0 ? ((ai.k0) ((a8.r7) this.F).b).getMeasuredHeight() : getMapContentHeight();
        int max4 = Math.max(0, (int) (measuredHeight - (i7 - f13)));
        int i10 = ((ceil2 * 2) - measuredHeight) + max4;
        org.telegram.messenger.da daVar = this.E;
        if (daVar != null) {
            int i11 = this.E0;
            if (i10 == i11 && max4 == this.F0) {
                return;
            }
            if (i11 < 0) {
                abVar = getMapTarget();
            } else if (ceil2 != this.C0) {
                daVar.d();
                abVar = (org.telegram.messenger.ab) this.E.d().b;
            } else {
                abVar = null;
            }
            this.C0 = ceil2;
            this.E0 = i10;
            this.F0 = max4;
            this.E.n(0, org.telegram.messenger.g0.L(6.0f) + i10, 0, org.telegram.messenger.g0.L(6.0f) + max4);
            if (abVar != null) {
                this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(abVar));
            }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean f() {
        return true;
    }

    public final void f0() {
        kl klVar;
        si siVar = this.b;
        if (!siVar.J1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            g0(lastLocation);
            return;
        }
        if (siVar.y4 != null) {
            org.telegram.messenger.g0.g3(new yk(this, 2));
            return;
        }
        if (this.U) {
            org.telegram.messenger.g0.g3(new yk(this, 7));
            return;
        }
        File file = siVar.x4;
        boolean z10 = siVar.w4;
        if (file != null) {
            if (!z10) {
                klVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    org.telegram.messenger.g0.g3(new mg(13, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                klVar.i0 = lastLocation2;
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
        klVar = this;
        Location lastLocation22 = getLastLocation();
        klVar.i0 = lastLocation22;
        g0(lastLocation22);
    }

    public final void g0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.i0 = location2;
        org.telegram.messenger.da daVar = this.E;
        jg.r0 r0Var = this.L;
        if (daVar == null) {
            r0Var.M(location2);
            return;
        }
        org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
        if (r0Var != null) {
            r0Var.M(this.i0);
        }
        if (this.m0) {
            return;
        }
        this.j0 = new Location(location);
        if (this.n0) {
            this.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(abVar));
            return;
        }
        this.n0 = true;
        this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, this.E.e() - 4.0f));
    }

    @Override // org.telegram.ui.Components.ki
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        di.b1 b1Var = this.M;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        kj0 kj0Var = (kj0) b1Var.K(0);
        return org.telegram.messenger.g0.L(56.0f) + (kj0Var != null ? Math.max((int) kj0Var.a.getY(), 0) : 0);
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ki
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        w6 w6Var = new w6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h5));
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        di.b1 b1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var != null ? r0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.j5));
        int i10 = org.telegram.ui.ActionBar.n6.nj;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.oj;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.lj;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 196608, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.sa newCameraUpdateLatLngZoom;
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
        org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(d, d2);
        if (d == 0.0d || d2 == 0.0d) {
            newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, this.E.f());
        } else {
            newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, this.E.e() - 4.0f);
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
        bi.a3 a3Var;
        if (this.F == null || (a3Var = this.K) == null) {
            return;
        }
        di.b1 b1Var = this.M;
        v4.f1 K = b1Var.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            a3Var.getMeasuredHeight();
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

    @Override // org.telegram.ui.Components.ki
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
        ck0 ck0Var = this.N;
        if (!z11) {
            ck0Var.setEmptyView(linearLayout);
        } else {
            ck0Var.setEmptyView(null);
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

    @Override // org.telegram.ui.Components.ki
    public final void p() {
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.z4);
        this.y = true;
        bi.a3 a3Var = this.K;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        try {
            org.telegram.messenger.da daVar = this.E;
            if (daVar != null) {
                daVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null) {
            ((ai.k0) ((a8.r7) xaVar).b).setTranslationY((-org.telegram.messenger.g0.q.y) * 3);
        }
        try {
            org.telegram.messenger.xa xaVar2 = this.F;
            if (xaVar2 != null) {
                ((a8.r7) xaVar2).B();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.xa xaVar3 = this.F;
            if (xaVar3 != null) {
                ((a8.r7) xaVar3).A();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        il ilVar = this.O;
        if (ilVar != null) {
            ilVar.F();
        }
        si siVar = this.b;
        siVar.V2.o(true);
        siVar.V2.t().removeView(this.x);
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(jl jlVar) {
        this.o0 = jlVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        i0();
    }

    @Override // org.telegram.ui.Components.ki
    public final void u() {
        this.x.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.c6
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
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, this.a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void y() {
        si siVar = this.b;
        this.L.U = (siVar == null || siVar.d) ? false : true;
    }

    @Override // org.telegram.ui.Components.ki
    public final void z(int i7, boolean z10) {
        if (z10) {
            this.L.U = false;
        }
    }
}
