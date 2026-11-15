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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dl extends ci implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is {
    public static final /* synthetic */ int G0 = 0;
    public float A0;
    public final yk B0;
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
    public final bi.g2 K;
    public final jg.r0 L;
    public final di.c1 M;
    public final uj0 N;
    public final bl O;
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
    public cl o0;
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

    public dl(ki kiVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, kiVar);
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
        this.B0 = new yk(i7, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        ki kiVar2 = this.b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar2.a2;
        final org.telegram.ui.an anVar = e2Var instanceof org.telegram.ui.an ? (org.telegram.ui.an) e2Var : null;
        long b12 = kiVar2.b1();
        this.W = b12;
        int i10 = 7;
        if (this.b.J1) {
            this.p0 = 7;
        } else if (!z10 || anVar == null || anVar.h != null || anVar.c() || org.telegram.messenger.q10.B(anVar.j())) {
            this.p0 = 0;
        } else {
            this.p0 = 1;
        }
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.v4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.w4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        bl blVar = this.O;
        if (blVar != null) {
            blVar.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.q0 a10 = this.b.V2.s().a(0, R.drawable.outline_header_search);
        a10.O();
        a10.I = new kg.x1(this, i10);
        this.x = a10;
        this.b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(searchField, i11, e6Var);
        org.telegram.ui.ActionBar.q6.v(searchField, i11, e6Var);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, e6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.g2 g2Var = new bi.g2(15, context, this);
        this.K = g2Var;
        g2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new jc(org.telegram.ui.ActionBar.j6.D0().q()));
        int i12 = 7;
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lj, this.a), false, e6Var);
        this.r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, R.drawable.msg_map, null, org.telegram.messenger.hd.M0(2131748690, null), true, false, e6Var);
        q0Var.d(3, R.drawable.msg_satellite, null, org.telegram.messenger.hd.M0(2131745948, null), true, false, e6Var);
        q0Var.d(4, R.drawable.msg_hybrid, null, org.telegram.messenger.hd.M0(2131749275, null), true, false, e6Var);
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i13 = org.telegram.ui.ActionBar.j6.nj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, this.a);
        int i14 = org.telegram.ui.ActionBar.j6.oj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(L, w02, org.telegram.ui.ActionBar.j6.w0(i14, this.a));
        c8.na.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.p0 p0Var = bg.t0.a;
        q0Var.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.q6.j(q0Var, j02, M, M2, e6Var);
        q0Var.setIcon(R.drawable.msg_map_type);
        g2Var.addView(q0Var, c8.ja.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        q0Var.setOnClickListener(new e0(this, i12));
        q0Var.setDelegate(new sk(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.j6.w0(i13, this.a), org.telegram.ui.ActionBar.j6.w0(i14, this.a));
        c8.na.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i13);
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.q6.j(imageView, j03, M3, M4, e6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i15 = org.telegram.ui.ActionBar.j6.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i15, e6Var, mode);
        imageView.setTag(Integer.valueOf(i15));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754831, null));
        g2Var.addView(imageView, c8.ja.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new n2(i12, this, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ja.c(-1.0f, -1));
        int i16 = 16;
        linearLayout.setOnTouchListener(new gi.a(i16));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.W5, e6Var, mode);
        linearLayout.addView(imageView2, c8.ja.o(-2, -2));
        TextView textView = new TextView(context);
        int i17 = org.telegram.ui.ActionBar.j6.X5;
        org.telegram.ui.ActionBar.q6.U(textView, i17, e6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5.c.w(textView, 1, 17.0f, null, 2131748179);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = f10;
        org.telegram.ui.ActionBar.q6.U(f10, i17, e6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ja.t(-2, -2, 17, 0, 6, 0, 0));
        di.c1 c1Var = new di.c1(this, context, e6Var, i16);
        this.M = c1Var;
        setBlur3Capture(c1Var);
        this.d = c1Var;
        this.f = true;
        c1Var.setClipToPadding(false);
        jg.r0 r0Var2 = new jg.r0(context, this.p0, b12, true, e6Var, this.b.J1, false, false);
        this.L = r0Var2;
        c1Var.setAdapter(r0Var2);
        ki kiVar3 = this.b;
        r0Var2.X = kiVar3 != null && (kiVar3.C1 || kiVar3.K1);
        c1Var.setItemAnimator(null);
        r0Var2.O(this.U, this.T);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.r1();
        kg.c0 c0Var = new kg.c0(this, c1Var);
        this.Q = c0Var;
        c1Var.setLayoutManager(c0Var);
        addView(c1Var, c8.ja.e(-1, -1, 51));
        c1Var.setOnScrollListener(new al(this, i7));
        c1Var.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.tk
            public final /* synthetic */ dl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i18, View view2) {
                switch (i7) {
                    case 0:
                        dl.U(this.b, anVar, e6Var, i18);
                        break;
                    default:
                        dl.W(this.b, anVar, e6Var, i18);
                        break;
                }
            }
        });
        r0Var2.P(this.q0);
        addView(g2Var, indexOfChild(c1Var), c8.ja.e(-1, -1, 51));
        org.telegram.messenger.ya onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.c = new sk(this);
        r7Var.d = new f1(10, this, e6Var);
        new Thread(new uk(this, onCreateMapView, i7)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        g2Var.addView(imageView3, c8.ja.e(28, 48, 49));
        uj0 uj0Var = new uj0(context, e6Var);
        this.N = uj0Var;
        uj0Var.setSections(true);
        uj0Var.setClipToPadding(false);
        uj0Var.setVisibility(8);
        uj0Var.setLayoutManager(new v4.b0(1, false));
        bl blVar2 = new bl(this, context, e6Var, this.b.J1);
        this.O = blVar2;
        blVar2.n = new sk(this);
        uj0Var.setItemAnimator(null);
        addView(uj0Var, c8.ja.e(-1, -1, 51));
        final int i18 = 1;
        uj0Var.setOnScrollListener(new al(this, i18));
        uj0Var.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.tk
            public final /* synthetic */ dl b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i182, View view2) {
                switch (i18) {
                    case 0:
                        dl.U(this.b, anVar, e6Var, i182);
                        break;
                    default:
                        dl.W(this.b, anVar, e6Var, i182);
                        break;
                }
            }
        });
        j0();
    }

    public static /* synthetic */ void P(dl dlVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ImageView imageView = dlVar.n;
        Activity parentActivity = dlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            t4.A(dlVar.getParentActivity()).show();
            return;
        }
        if (dlVar.i0 == null || dlVar.E == null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.j6.mj;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setTag(Integer.valueOf(i7));
        dlVar.L.L(null);
        dlVar.m0 = false;
        dlVar.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.bb(dlVar.i0.getLatitude(), dlVar.i0.getLongitude())));
    }

    public static /* synthetic */ void Q(dl dlVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (anVar != null && anVar.c()) {
            t4.J(dlVar.getParentActivity(), anVar.a(), new vk(dlVar, tL_messageMediaVenue, 1), e6Var);
        } else {
            dlVar.o0.d(tL_messageMediaVenue, dlVar.p0, true, 0, 0L);
            dlVar.b.a(true);
        }
    }

    public static /* synthetic */ void R(dl dlVar) {
        if (dlVar.getParentActivity() == null) {
            return;
        }
        try {
            dlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public static void S(dl dlVar, org.telegram.messenger.ya yaVar) {
        if (dlVar.F == null || dlVar.getParentActivity() == null) {
            return;
        }
        try {
            ((a8.r7) yaVar).w();
            ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
            ((a8.r7) dlVar.F).p(new wk(dlVar, 0));
            dlVar.g0 = true;
            if (dlVar.h0) {
                ((a8.r7) dlVar.F).z();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void T(dl dlVar) {
        di.c1 c1Var = dlVar.M;
        bi.g2 g2Var = dlVar.K;
        if (dlVar.F == null || g2Var == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.height;
            int i10 = dlVar.r0;
            if (i7 != i10) {
                layoutParams.height = i10;
                g2Var.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) dlVar.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != dlVar.getMapContentHeight()) {
            layoutParams2.height = dlVar.getMapContentHeight();
            ((ai.k0) ((a8.r7) dlVar.F).b).setLayoutParams(layoutParams2);
        }
        dlVar.L.P(dlVar.q0);
        v4.e1 K = c1Var.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != dlVar.q0) {
                view.getLayoutParams().height = dlVar.q0;
                view.requestLayout();
            }
        }
        kg.c0 c0Var = dlVar.Q;
        c0Var.M = 0;
        c0Var.p1();
        c1Var.requestLayout();
        dlVar.i0();
    }

    public static void U(dl dlVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        final dl dlVar2;
        org.telegram.ui.an anVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = dlVar.W;
        jg.r0 r0Var = dlVar.L;
        ki kiVar = dlVar.b;
        int i10 = dlVar.p0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.V) != null) {
                dlVar.o0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                kiVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.W) != null) {
                dlVar.o0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                kiVar.a(true);
                return;
            } else {
                dlVar2 = dlVar;
                anVar2 = anVar;
                e6Var2 = e6Var;
            }
        } else {
            if (i7 == 1) {
                if (dlVar.o0 == null || dlVar.j0 == null) {
                    if (dlVar.U) {
                        t4.A(dlVar.getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(dlVar.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(dlVar.j0.getLongitude());
                    t4.X(kiVar.H3, kiVar.X0() + 1, kiVar.b1(), new bi.o1(dlVar, anVar, tL_messageMediaGeo, e6Var, 7));
                    return;
                }
            }
            dlVar2 = dlVar;
            anVar2 = anVar;
            e6Var2 = e6Var;
            if (i7 == 2 && i10 == 1) {
                if (dlVar2.getLocationController().i(j3)) {
                    dlVar2.getLocationController().k(j3);
                    kiVar.a(true);
                    return;
                } else if (dlVar2.i0 == null && dlVar2.U) {
                    t4.A(dlVar2.getParentActivity()).show();
                    return;
                } else {
                    if (dlVar2.o0 == null || dlVar2.getParentActivity() == null || dlVar2.i0 == null) {
                        return;
                    }
                    t4.B(dlVar2.getParentActivity(), false, org.telegram.messenger.m5.E(j3) ? kiVar.a2.getMessagesController().a2(Long.valueOf(j3)) : null, new org.telegram.messenger.pr() { // from class: org.telegram.ui.Components.xk
                        @Override // org.telegram.messenger.pr
                        public final void a(int i11) {
                            dl dlVar3 = dl.this;
                            ki kiVar2 = dlVar3.b;
                            t4.X(kiVar2.H3, kiVar2.X0() + 1, kiVar2.b1(), new ai.y1(dlVar3, i11, 5));
                        }
                    }, dlVar2.a).show();
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            t4.X(kiVar.H3, kiVar.X0() + 1, kiVar.b1(), new bi.o1(dlVar2, anVar2, (TLRPC.TL_messageMediaVenue) I, e6Var2, 8));
        }
    }

    public static /* synthetic */ void V(dl dlVar) {
        jg.r0 r0Var = dlVar.L;
        ki kiVar = dlVar.b;
        if (dlVar.c0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = dlVar.getParentActivity();
            if (parentActivity != null) {
                dlVar.c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!kiVar.J1 || kiVar.x4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    dlVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(dlVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                    return;
                }
                if (i7 < 29 || !kiVar.J1 || kiVar.x4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    return;
                }
                dlVar.T = true;
                if (r0Var != null) {
                    r0Var.O(dlVar.U, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, org.telegram.messenger.ns.o3);
            }
        }
    }

    public static void W(dl dlVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        ki kiVar = dlVar.b;
        TLRPC.TL_messageMediaVenue H = dlVar.O.H(i7);
        if (H != null && dlVar.p0 != 7) {
            kiVar.V2.n(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            dlVar.h0(geoPoint.lat, geoPoint._long);
        } else {
            if (H == null || dlVar.o0 == null) {
                return;
            }
            if (anVar != null && anVar.c()) {
                t4.J(dlVar.getParentActivity(), anVar.a(), new vk(dlVar, H, 0), e6Var);
            } else {
                dlVar.o0.d(H, dlVar.p0, true, 0, 0L);
                kiVar.a(true);
            }
        }
    }

    public static /* synthetic */ void X(dl dlVar, Location location) {
        int i7;
        ki kiVar = dlVar.b;
        if (kiVar == null || kiVar.a2 == null) {
            return;
        }
        dlVar.g0(location);
        jg.r0 r0Var = dlVar.L;
        if (r0Var != null && (((i7 = dlVar.p0) == 7 || i7 == 8) && !dlVar.m0)) {
            r0Var.L(dlVar.j0);
        }
        dlVar.getLocationController().n(location, dlVar.V);
        dlVar.V = false;
    }

    public static /* synthetic */ void Y(dl dlVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l10) {
        if (anVar != null && anVar.c()) {
            t4.J(dlVar.getParentActivity(), anVar.a(), new a3.h(dlVar, tL_messageMediaGeo, l10, 28), e6Var);
        } else {
            dlVar.o0.d(tL_messageMediaGeo, dlVar.p0, true, 0, l10.longValue());
            dlVar.b.a(true);
        }
    }

    public static void Z(dl dlVar, org.telegram.messenger.ea eaVar) {
        PackageManager packageManager;
        dlVar.E = eaVar;
        rk rkVar = new rk(dlVar, 3);
        k8.a aVar = eaVar.a;
        int i7 = 5;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(rkVar, i7);
        l8.e eVar = (l8.e) aVar.b;
        try {
            k8.c cVar = new k8.c(j1Var);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 42);
            int i10 = 1;
            if (org.telegram.ui.ActionBar.j6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, dlVar.a)) < 0.721f) {
                dlVar.R = true;
                dlVar.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, R.raw.mapstyle_night));
            }
            if (dlVar.E == null) {
                return;
            }
            Location location = new Location("network");
            dlVar.j0 = location;
            location.setLatitude(20.659322d);
            dlVar.j0.setLongitude(-11.40625d);
            try {
                dlVar.E.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            dlVar.E.g().C0();
            dlVar.E.g().D0();
            dlVar.E.g().B0();
            dlVar.E.l(new sk(dlVar));
            org.telegram.messenger.ea eaVar2 = dlVar.E;
            rk rkVar2 = new rk(dlVar, 4);
            k8.a aVar2 = eaVar2.a;
            org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(rkVar2, 7);
            l8.e eVar2 = (l8.e) aVar2.b;
            try {
                k8.c cVar2 = new k8.c(j1Var2, 0);
                Parcel p13 = eVar2.p1();
                v7.b.c(p13, cVar2);
                eVar2.t1(p13, 99);
                dlVar.E.n(new wk(dlVar, i10));
                dlVar.E.m(new e2(19));
                dlVar.f0();
                org.telegram.messenger.g0.i3(new rk(dlVar, i7), 200L);
                if (dlVar.S && dlVar.getParentActivity() != null) {
                    dlVar.S = false;
                    Activity parentActivity = dlVar.getParentActivity();
                    if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                        return;
                    }
                    try {
                        if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dlVar.getParentActivity(), dlVar.a);
                            int i11 = org.telegram.ui.ActionBar.j6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(i11, dlVar.a), null);
                            alertDialog$Builder.n(i11, dlVar.a);
                            alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131749530, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, null), new sk(dlVar));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                dlVar.i0();
            } catch (RemoteException e12) {
                throw new androidx.car.app.j(e12);
            }
        } catch (RemoteException e13) {
            throw new androidx.car.app.j(e13);
        }
    }

    public static void a0(dl dlVar) {
        jg.r0 r0Var = dlVar.L;
        di.c1 c1Var = dlVar.M;
        if (dlVar.F == null || dlVar.K == null || dlVar.getMeasuredHeight() == 0) {
            return;
        }
        v4.e1 K = c1Var.K(0);
        if (K != null) {
            View view = K.a;
            int bottom = view.getBottom();
            int b10 = r0Var.b();
            int i7 = 1;
            while (true) {
                if (i7 >= b10) {
                    dlVar.s0 = bottom - view.getBottom();
                    break;
                }
                if (r0Var.d(i7) != 11) {
                    v4.e1 K2 = c1Var.K(i7);
                    if (K2 == null) {
                        break;
                    } else {
                        bottom = Math.max(bottom, K2.a.getBottom());
                    }
                }
                i7++;
            }
        }
        int i10 = dlVar.s0;
        if (i10 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i11 = dlVar.p0;
            i10 = (i11 == 1 || i11 == 7 || i11 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (c1Var.getMeasuredHeight() - dlVar.getDefaultBottomInset()) - i10;
        int measuredHeight2 = dlVar.getMeasuredHeight() + dlVar.getMapExtraTop();
        int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - c1Var.getPaddingTop());
        if (measuredHeight2 == dlVar.r0 && max == dlVar.q0) {
            return;
        }
        dlVar.r0 = measuredHeight2;
        dlVar.q0 = max;
        org.telegram.messenger.g0.h3(new rk(dlVar, 0));
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
        org.telegram.ui.ActionBar.e2 e2Var;
        ki kiVar = this.b;
        if (kiVar == null || (e2Var = kiVar.a2) == null) {
            return null;
        }
        return e2Var.getParentActivity();
    }

    private org.telegram.messenger.m10 getUserConfig() {
        return this.b.a2.getUserConfig();
    }

    @Override // org.telegram.ui.Components.ci
    public final void A() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.g0) {
            try {
                ((a8.r7) yaVar).y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int i11;
        int i12;
        ki kiVar = this.b;
        if (kiVar.V2.o0 || kiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            kiVar.r0 = false;
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
                    kiVar.r0 = true;
                }
            }
            i12 = (i10 / 5) * 2;
            i11 = i12 - org.telegram.messenger.g0.L(52.0f);
            if (i11 < 0) {
            }
            kiVar.r0 = true;
        }
        this.M.q1(0, i11, 0, getMinBottomInset());
        this.N.q1(0, 0, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ci
    public final void C() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.g0) {
            try {
                ((a8.r7) yaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.h0 = true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void F(float f10, float f11) {
        if (this.u0 == f10 && this.v0 == f11) {
            return;
        }
        this.u0 = f10;
        this.v0 = f11;
        e0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        ki kiVar = this.b;
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131745456, null));
        int i7 = 1;
        if (((ai.k0) ((a8.r7) this.F).b).getParent() == null) {
            ai.k0 k0Var = (ai.k0) ((a8.r7) this.F).b;
            FrameLayout.LayoutParams e10 = c8.ja.e(-1, org.telegram.messenger.g0.L(10.0f) + this.q0, 51);
            bi.g2 g2Var = this.K;
            g2Var.addView(k0Var, 0, e10);
            g2Var.addView(this.J, 1, c8.ja.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.g0) {
            try {
                ((a8.r7) yaVar).z();
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
        org.telegram.messenger.g0.i3(new rk(this, i7), kiVar.X3.g0() ? 200L : 0L);
        this.Q.h1(0, 0);
        i0();
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.M.y0(0);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lj, this.a));
            this.r.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.a));
            this.r.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.a), true);
            this.r.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.a), false);
        }
        if (this.E != null) {
            if (!org.telegram.ui.ActionBar.j6.I.q() && org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.a)) >= 0.721f) {
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
        di.c1 c1Var = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1Var.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        c1Var.setLayoutParams(layoutParams);
        bi.g2 g2Var = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        g2Var.setLayoutParams(layoutParams2);
        uj0 uj0Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) uj0Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        uj0Var.setLayoutParams(layoutParams3);
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
        kh khVar = this.b.v3;
        return (khVar == null || khVar.getVisibility() == 8) ? false : true;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.v4;
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
        } else if (i7 == org.telegram.messenger.ns.w4) {
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

    @Override // org.telegram.ui.Components.ci
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.g2 g2Var;
        di.c1 c1Var;
        org.telegram.messenger.bb bbVar;
        if (this.F == null || (g2Var = this.K) == null || (c1Var = this.M) == null) {
            return;
        }
        v4.e1 K = c1Var.K(0);
        int top = K != null ? K.a.getTop() + c1Var.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((ai.k0) ((a8.r7) this.F).b).getVisibility() == 0) {
                ((ai.k0) ((a8.r7) this.F).b).setVisibility(4);
                g2Var.setVisibility(4);
                return;
            }
            return;
        }
        if (((ai.k0) ((a8.r7) this.F).b).getVisibility() == 4) {
            ((ai.k0) ((a8.r7) this.F).b).setVisibility(0);
            g2Var.setVisibility(0);
        }
        float f10 = top;
        if (this.v0 < 1.0f) {
            int[] iArr = this.w0;
            getLocationInWindow(iArr);
            f10 = Math.min(top, org.telegram.messenger.g0.W1(this.v0, -iArr[1], top));
        }
        int max = (int) Math.max(f10, -getMapExtraTop());
        int max2 = (Math.max(0, K.a.getTop()) + c1Var.getTop()) - max;
        int min = (Math.min(this.t0, c1Var.getMeasuredHeight()) + c1Var.getTop()) - max;
        this.x0 = org.telegram.messenger.g0.L(32.0f) + max2;
        this.y0 = min;
        this.z0 = Math.max(0, this.r0 - (getMeasuredHeight() - max));
        float f11 = max;
        g2Var.setTranslationY(f11);
        g2Var.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = c1Var.getTop();
        int i7 = min + max;
        float f12 = (top2 + i7) / 2.0f;
        float max3 = Math.max(f12, ((c1Var.getPaddingTop() + top2) + i7) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f12);
        if (ceil != this.D0) {
            this.D0 = ceil;
            org.telegram.messenger.g0.h3(new rk(this, 0));
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
            this.E.o(0, org.telegram.messenger.g0.L(6.0f) + i10, 0, org.telegram.messenger.g0.L(6.0f) + max4);
            if (bbVar != null) {
                this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean f() {
        return true;
    }

    public final void f0() {
        dl dlVar;
        ki kiVar = this.b;
        if (!kiVar.J1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            g0(lastLocation);
            return;
        }
        if (kiVar.y4 != null) {
            org.telegram.messenger.g0.h3(new rk(this, 2));
            return;
        }
        if (this.U) {
            org.telegram.messenger.g0.h3(new rk(this, 7));
            return;
        }
        File file = kiVar.x4;
        boolean z10 = kiVar.w4;
        if (file != null) {
            if (!z10) {
                dlVar = this;
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    org.telegram.messenger.g0.h3(new od(17, this, fArr));
                    return;
                }
                Location lastLocation2 = getLastLocation();
                dlVar.i0 = lastLocation2;
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
        dlVar = this;
        Location lastLocation22 = getLastLocation();
        dlVar.i0 = lastLocation22;
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

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        di.c1 c1Var = this.M;
        if (c1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        cj0 cj0Var = (cj0) c1Var.K(0);
        return org.telegram.messenger.g0.L(56.0f) + (cj0Var != null ? Math.max((int) cj0Var.a.getY(), 0) : 0);
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        q6 q6Var = new q6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h5));
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        di.c1 c1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.x;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var != null ? q0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.j5));
        int i10 = org.telegram.ui.ActionBar.j6.nj;
        ImageView imageView = this.n;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.oj;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.lj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hi));
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
        bi.g2 g2Var;
        if (this.F == null || (g2Var = this.K) == null) {
            return;
        }
        di.c1 c1Var = this.M;
        v4.e1 K = c1Var.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            g2Var.getMeasuredHeight();
        }
        int i7 = this.s0;
        if (i7 < 0) {
            int L = org.telegram.messenger.g0.L(66.0f);
            int i10 = this.p0;
            i7 = (i10 == 1 || i10 == 7 || i10 == 8) ? org.telegram.messenger.g0.L(66.0f) + L : L;
        }
        int measuredHeight = (c1Var.getMeasuredHeight() - getBottomInset()) - i7;
        this.t0 = measuredHeight;
        if (K != null) {
            int bottom = measuredHeight - K.a.getBottom();
            int childCount = c1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = c1Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    childAt.setTranslationY(bottom);
                }
            }
        }
        e0();
    }

    @Override // org.telegram.ui.Components.ci
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
        uj0 uj0Var = this.N;
        if (!z11) {
            uj0Var.setEmptyView(linearLayout);
        } else {
            uj0Var.setEmptyView(null);
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

    @Override // org.telegram.ui.Components.ci
    public final void p() {
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.v4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.w4);
        this.y = true;
        bi.g2 g2Var = this.K;
        if (g2Var != null) {
            g2Var.invalidate();
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
            ((ai.k0) ((a8.r7) yaVar).b).setTranslationY((-org.telegram.messenger.g0.q.y) * 3);
        }
        try {
            org.telegram.messenger.ya yaVar2 = this.F;
            if (yaVar2 != null) {
                ((a8.r7) yaVar2).y();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.ya yaVar3 = this.F;
            if (yaVar3 != null) {
                ((a8.r7) yaVar3).x();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        bl blVar = this.O;
        if (blVar != null) {
            blVar.F();
        }
        ki kiVar = this.b;
        kiVar.V2.n(true);
        kiVar.V2.s().removeView(this.x);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(cl clVar) {
        this.o0 = clVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
        i0();
    }

    @Override // org.telegram.ui.Components.ci
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
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.j5, this.a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void y() {
        ki kiVar = this.b;
        this.L.U = (kiVar == null || kiVar.d) ? false : true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void z(int i7, boolean z10) {
        if (z10) {
            this.L.U = false;
        }
    }
}
