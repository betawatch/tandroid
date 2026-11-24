// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n52 extends a22 implements vlb, jm7 {
    public float A0;
    public final cc B0;
    public int C0;
    public int D0;
    public s05 E;
    public int E0;
    public uj5 F;
    public int F0;
    public pj5 G;
    public float H;
    public boolean I;
    public final View J;
    public final yd K;
    public final qc6 L;
    public final fv M;
    public final r59 N;
    public final l52 O;
    public final ImageView P;
    public final l32 Q;
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
    public m52 o0;
    public final byte p0;
    public int q0;
    public final r7 r;
    public int r0;
    public final LinearLayout s;
    public int s0;
    public int t0;
    public float u0;
    public float v0;
    public final TextView w;
    public final int[] w0;
    public final r7 x;
    public int x0;
    public boolean y;
    public int y0;
    public int z0;

    public n52(i22 i22Var, Context context, final ylb ylbVar, boolean z) {
        super(i22Var, ylbVar, context);
        int i;
        this.S = true;
        final byte b = 0;
        this.T = false;
        this.U = false;
        this.V = true;
        this.a0 = new Paint();
        this.c0 = true;
        int currentActionBarHeight = (gm.q.x - a.getCurrentActionBarHeight()) - gm.L(66.0f);
        this.q0 = currentActionBarHeight;
        this.r0 = currentActionBarHeight;
        this.s0 = -1;
        this.t0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u0 = Float.NaN;
        this.v0 = 1.0f;
        this.w0 = new int[2];
        this.y0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.A0 = -1.0f;
        byte b2 = 3;
        this.B0 = new cc(this, b2);
        this.E0 = -1;
        this.F0 = -1;
        gm.a0();
        i22 i22Var2 = this.b;
        d dVar = i22Var2.Z1;
        final yv1 yv1Var = dVar instanceof yv1 ? (yv1) dVar : null;
        long V0 = i22Var2.V0();
        this.W = V0;
        if (this.b.I1) {
            this.p0 = (byte) 7;
            i = 7;
        } else if (!z || yv1Var == null || yv1Var.h != null || yv1Var.X7() || m9c.D(yv1Var.h())) {
            this.p0 = (byte) 0;
            i = 0;
        } else {
            this.p0 = (byte) 1;
            i = 1;
        }
        nm7.e().b(this, nm7.z4);
        nm7.e().b(this, nm7.A4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        qc6 qc6Var = this.L;
        if (qc6Var != null) {
            qc6Var.F();
        }
        l52 l52Var = this.O;
        if (l52Var != null) {
            l52Var.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        r7 a = this.b.U2.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, b2);
        this.x = a;
        this.b.getClass();
        a.setVisibility(0);
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        a.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i2 = cmb.i5;
        anb.X(searchField, i2, ylbVar);
        anb.v(searchField, i2, ylbVar);
        anb.D(searchField, cmb.Le, ylbVar);
        new FrameLayout.LayoutParams(-1, gm.L(21.0f)).gravity = 83;
        yd ydVar = new yd((byte) 10, context, (Object) this);
        this.K = ydVar;
        ydVar.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new yb1(cmb.B0().o()));
        r7 r7Var = new r7(context, null, 0, cmb.v0(cmb.kj, this.a), false, ylbVar);
        this.r = r7Var;
        r7Var.setClickable(true);
        r7Var.setSubMenuOpenSide(2);
        r7Var.setAdditionalXOffset(gm.L(10.0f));
        r7Var.setAdditionalYOffset(-gm.L(10.0f));
        r7Var.d(2, R.drawable.msg_map, null, jb6.M0(2131748447, null), true, false, ylbVar);
        r7Var.d(3, R.drawable.msg_satellite, null, jb6.M0(2131745682, null), true, false, ylbVar);
        r7Var.d(4, R.drawable.msg_hybrid, null, jb6.M0(2131749032, null), true, false, ylbVar);
        r7Var.setContentDescription(jb6.M0(2131754838, null));
        int L = gm.L(40.0f);
        int i3 = cmb.mj;
        int v0 = cmb.v0(i3, this.a);
        int i4 = cmb.nj;
        fg0 h0 = cmb.h0(L, v0, cmb.v0(i4, this.a));
        rve.a(r7Var);
        r7Var.setTranslationZ(gm.L(2.0f));
        xj xjVar = agc.a;
        r7Var.setOutlineProvider(xjVar);
        wmb M = anb.M(i3);
        wmb M2 = anb.M(i4);
        r7Var.setBackground(h0);
        anb.j(r7Var, h0, M, M2, ylbVar);
        r7Var.setIcon(R.drawable.msg_map_type);
        ydVar.addView(r7Var, qoe.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        r7Var.setOnClickListener(new k81(this, (byte) 12));
        r7Var.setDelegate(new e52(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        fg0 h02 = cmb.h0(gm.L(40.0f), cmb.v0(i3, this.a), cmb.v0(i4, this.a));
        rve.a(imageView);
        imageView.setTranslationZ(gm.L(2.0f));
        imageView.setOutlineProvider(xjVar);
        wmb M3 = anb.M(i3);
        wmb M4 = anb.M(i4);
        imageView.setBackground(h02);
        anb.j(imageView, h02, M3, M4, ylbVar);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i5 = cmb.lj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i5, ylbVar, mode);
        imageView.setTag(Integer.valueOf(i5));
        imageView.setContentDescription(jb6.M0(2131754830, null));
        ydVar.addView(imageView, qoe.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new rc1((Object) this, (Object) ylbVar, (byte) 10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, gm.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, qoe.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new w02((byte) 2));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        anb.s(imageView2, cmb.V5, ylbVar, mode);
        linearLayout.addView(imageView2, qoe.o(-2, -2));
        TextView textView = new TextView(context);
        int i6 = cmb.W5;
        anb.X(textView, i6, ylbVar);
        textView.setGravity(17);
        textView.setTypeface(gm.o());
        ts2.q(17.0f, 1, 2131747913, textView, null);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = m;
        anb.X(m, i6, ylbVar);
        m.setGravity(17);
        m.setTextSize(1, 15.0f);
        m.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
        linearLayout.addView(m, qoe.t(-2, -2, 17, 0, 6, 0, 0));
        fv fvVar = new fv(this, context, ylbVar, (byte) 9);
        this.M = fvVar;
        setBlur3Capture(fvVar);
        this.d = fvVar;
        this.f = true;
        fvVar.setClipToPadding(false);
        qc6 qc6Var2 = new qc6(context, i, V0, true, ylbVar, this.b.I1, false, false);
        this.L = qc6Var2;
        fvVar.setAdapter(qc6Var2);
        i22 i22Var3 = this.b;
        qc6Var2.X = i22Var3 != null && (i22Var3.B1 || i22Var3.J1);
        fvVar.setItemAnimator(null);
        qc6Var2.O(this.U, this.T);
        fvVar.setVerticalScrollBarEnabled(false);
        fvVar.r1();
        l32 l32Var = new l32(this, fvVar);
        this.Q = l32Var;
        fvVar.setLayoutManager(l32Var);
        addView(fvVar, qoe.e(-1, -1, 51));
        fvVar.setOnScrollListener(new k52(this, b));
        fvVar.setOnItemClickListener(new f59(this) { // from class: f52
            public final /* synthetic */ n52 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i7, View view2) {
                byte b3 = b;
                ylb ylbVar2 = ylbVar;
                yv1 yv1Var2 = yv1Var;
                n52 n52Var = this.b;
                switch (b3) {
                    case 0:
                        n52Var.Z(yv1Var2, ylbVar2, i7);
                        break;
                    default:
                        n52Var.U(yv1Var2, ylbVar2, i7);
                        break;
                }
            }
        });
        qc6Var2.P(this.q0);
        addView(ydVar, indexOfChild(fvVar), qoe.e(-1, -1, 51));
        uj5 onCreateMapView = ((k1f) org.telegram.messenger.a.j()).onCreateMapView(context);
        this.F = onCreateMapView;
        sm2 sm2Var = (sm2) onCreateMapView;
        sm2Var.c = new e52(this);
        sm2Var.d = new g11((Object) this, (Object) ylbVar, (byte) 23);
        new Thread(new g52(this, onCreateMapView, b)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        ydVar.addView(imageView3, qoe.e(28, 48, 49));
        r59 r59Var = new r59(context, ylbVar);
        this.N = r59Var;
        r59Var.setSections(true);
        r59Var.setClipToPadding(false);
        r59Var.setVisibility(8);
        r59Var.setLayoutManager(new u46(1, false));
        l52 l52Var2 = new l52(this, context, ylbVar, this.b.I1);
        this.O = l52Var2;
        l52Var2.n = new e52(this);
        r59Var.setItemAnimator(null);
        addView(r59Var, qoe.e(-1, -1, 51));
        final byte b3 = 1;
        r59Var.setOnScrollListener(new k52(this, b3));
        r59Var.setOnItemClickListener(new f59(this) { // from class: f52
            public final /* synthetic */ n52 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i7, View view2) {
                byte b32 = b3;
                ylb ylbVar2 = ylbVar;
                yv1 yv1Var2 = yv1Var;
                n52 n52Var = this.b;
                switch (b32) {
                    case 0:
                        n52Var.Z(yv1Var2, ylbVar2, i7);
                        break;
                    default:
                        n52Var.U(yv1Var2, ylbVar2, i7);
                        break;
                }
            }
        });
        i0();
    }

    private int getBottomInset() {
        R();
        return gm.U1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (!R()) {
            return getMinBottomInset();
        }
        return gm.L(8.0f) + this.e;
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
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

    private dd6 getLocationController() {
        return this.b.Z1.getLocationController();
    }

    private int getMapContentHeight() {
        return gm.L(10.0f) + this.r0 + this.D0;
    }

    private int getMapExtraTop() {
        return gm.L(8.0f) + gm.m;
    }

    private xj5 getMapTarget() {
        Location location;
        if (this.m0 && (location = this.j0) != null) {
            return new xj5(location.getLatitude(), this.j0.getLongitude());
        }
        Location location2 = this.i0;
        if (location2 != null) {
            return new xj5(location2.getLatitude(), this.i0.getLongitude());
        }
        return null;
    }

    private oc7 getMessagesController() {
        return this.b.Z1.getMessagesController();
    }

    private int getMinBottomInset() {
        return R() ? getDefaultBottomInset() : Math.min(this.e, gm.n);
    }

    private Activity getParentActivity() {
        d dVar;
        i22 i22Var = this.b;
        if (i22Var == null || (dVar = i22Var.Z1) == null) {
            return null;
        }
        return dVar.getParentActivity();
    }

    private z8c getUserConfig() {
        return this.b.Z1.getUserConfig();
    }

    @Override // a22
    public final void A() {
        uj5 uj5Var = this.F;
        if (uj5Var != null && this.g0) {
            try {
                ((sm2) uj5Var).H();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int i3;
        int i4;
        i22 i22Var = this.b;
        if (i22Var.U2.o0 || i22Var.o3.Q() > gm.L(20.0f)) {
            i22Var.r0 = false;
            i3 = 0;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i4 = (int) (i2 / 3.5f);
                    i3 = i4 - gm.L(52.0f);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    i22Var.r0 = true;
                }
            }
            i4 = (i2 / 5) << 1;
            i3 = i4 - gm.L(52.0f);
            if (i3 < 0) {
            }
            i22Var.r0 = true;
        }
        this.M.q1(0, i3, 0, getMinBottomInset());
        this.N.q1(0, 0, 0, this.e);
    }

    @Override // a22
    public final void C() {
        uj5 uj5Var = this.F;
        if (uj5Var != null && this.g0) {
            try {
                ((sm2) uj5Var).I();
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        this.h0 = true;
    }

    @Override // a22
    public final void F(float f, float f2) {
        if (this.u0 == f && this.v0 == f2) {
            return;
        }
        this.u0 = f;
        this.v0 = f2;
        d0();
    }

    @Override // a22
    public final void H(a22 a22Var) {
        i22 i22Var = this.b;
        i22Var.U2.setTitle(jb6.M0(2131745190, null));
        byte b = 1;
        if (((su) ((sm2) this.F).b).getParent() == null) {
            su suVar = (su) ((sm2) this.F).b;
            FrameLayout.LayoutParams e = qoe.e(-1, gm.L(10.0f) + this.q0, 51);
            yd ydVar = this.K;
            ydVar.addView(suVar, 0, e);
            ydVar.addView(this.J, 1, qoe.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        uj5 uj5Var = this.F;
        if (uj5Var != null && this.g0) {
            try {
                ((sm2) uj5Var).I();
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        this.h0 = true;
        s05 s05Var = this.E;
        if (s05Var != null) {
            try {
                s05Var.k(true);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        Q();
        gm.d3(new d52(this, b), i22Var.W3.B() ? 200L : 0L);
        this.Q.g1(0, 0);
        h0();
    }

    @Override // a22
    public final void J() {
        this.M.z0(0);
    }

    public final void O() {
        yd ydVar;
        if (this.F == null || (ydVar = this.K) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ydVar.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            int i2 = this.r0;
            if (i != i2) {
                layoutParams.height = i2;
                ydVar.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((su) ((sm2) this.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != getMapContentHeight()) {
            layoutParams2.height = getMapContentHeight();
            ((su) ((sm2) this.F).b).setLayoutParams(layoutParams2);
        }
        this.L.P(this.q0);
        fv fvVar = this.M;
        u69 K = fvVar.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != this.q0) {
                view.getLayoutParams().height = this.q0;
                view.requestLayout();
            }
        }
        l32 l32Var = this.Q;
        l32Var.M = 0;
        l32Var.o1();
        fvVar.requestLayout();
        h0();
    }

    public final void P() {
        r7 r7Var = this.r;
        if (r7Var != null) {
            r7Var.setIconColor(cmb.v0(cmb.kj, this.a));
            this.r.I(cmb.v0(cmb.F8, this.a));
            this.r.O(cmb.v0(cmb.E8, this.a), true);
            this.r.O(cmb.v0(cmb.D8, this.a), false);
        }
        if (this.E != null) {
            boolean z = cmb.I.o() || gm.B(cmb.v0(cmb.c6, this.a)) < 0.721f;
            boolean z2 = this.R;
            if (z) {
                if (z2) {
                    return;
                }
                this.R = true;
                this.E.i(((k1f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, R.raw.mapstyle_night));
                return;
            }
            if (z2) {
                this.R = false;
                this.E.i(null);
            }
        }
    }

    public final void Q() {
        if (getMeasuredHeight() == 0 || this.F == null) {
            return;
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        fv fvVar = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fvVar.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        fvVar.setLayoutParams(layoutParams);
        yd ydVar = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ydVar.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        ydVar.setLayoutParams(layoutParams2);
        r59 r59Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r59Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        r59Var.setLayoutParams(layoutParams3);
        int i = this.q0;
        qc6 qc6Var = this.L;
        qc6Var.P(i);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((su) ((sm2) this.F).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = gm.L(10.0f) + this.r0;
            ((su) ((sm2) this.F).b).setLayoutParams(layoutParams4);
        }
        qc6Var.f();
        h0();
    }

    public final boolean R() {
        h12 h12Var = this.b.u3;
        return (h12Var == null || h12Var.getVisibility() == 8) ? false : true;
    }

    public final void S(s05 s05Var) {
        PackageManager packageManager;
        this.E = s05Var;
        d52 d52Var = new d52(this, (byte) 4);
        wm4 wm4Var = s05Var.a;
        wx4 wx4Var = new wx4((Object) d52Var, (byte) 2);
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            t6d t6dVar = new t6d(wx4Var, (char) 0);
            Parcel R = d8eVar.R();
            tid.c(R, t6dVar);
            d8eVar.V(R, 42);
            if (cmb.I.o() || gm.B(cmb.v0(cmb.c6, this.a)) < 0.721f) {
                this.R = true;
                this.E.i(((k1f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, R.raw.mapstyle_night));
            }
            if (this.E != null) {
                Location location = new Location("network");
                this.j0 = location;
                location.setLatitude(20.659322d);
                this.j0.setLongitude(-11.40625d);
                try {
                    this.E.k(true);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                this.E.g().m0();
                this.E.g().o0();
                this.E.g().l0();
                this.E.l(new e52(this));
                s05 s05Var2 = this.E;
                byte b = 5;
                d52 d52Var2 = new d52(this, b);
                wm4 wm4Var2 = s05Var2.a;
                wx4 wx4Var2 = new wx4(d52Var2, b);
                wm4Var2.getClass();
                try {
                    d8e d8eVar2 = (d8e) wm4Var2.b;
                    t6d t6dVar2 = new t6d(wx4Var2, (byte) 0, false);
                    Parcel R2 = d8eVar2.R();
                    tid.c(R2, t6dVar2);
                    d8eVar2.V(R2, 99);
                    s05 s05Var3 = this.E;
                    i52 i52Var = new i52(this, (byte) 1);
                    wm4 wm4Var3 = s05Var3.a;
                    wx4 wx4Var3 = new wx4((Object) i52Var, (byte) 3);
                    wm4Var3.getClass();
                    try {
                        d8e d8eVar3 = (d8e) wm4Var3.b;
                        t6d t6dVar3 = new t6d(wx4Var3, (byte) 0);
                        Parcel R3 = d8eVar3.R();
                        tid.c(R3, t6dVar3);
                        d8eVar3.V(R3, 36);
                        this.E.m(new a32((byte) 2));
                        e0();
                        gm.d3(new d52(this, (byte) 6), 200L);
                        if (this.S && getParentActivity() != null) {
                            this.S = false;
                            Activity parentActivity = getParentActivity();
                            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                                return;
                            }
                            try {
                                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getParentActivity());
                                    int i = cmb.K5;
                                    alertDialog$Builder.l(R.raw.permission_request_location, 72, cmb.v0(i, this.a), null);
                                    alertDialog$Builder.m(i, this.a);
                                    alertDialog$Builder.a.U = jb6.M0(2131749304, null);
                                    alertDialog$Builder.j(jb6.M0(2131751743, null), new e52(this));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.o();
                                }
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                        }
                        h0();
                    } catch (RemoteException e3) {
                        i2d.h(e3);
                    }
                } catch (RemoteException e4) {
                    i2d.h(e4);
                }
            }
        } catch (RemoteException e5) {
            i2d.h(e5);
        }
    }

    public final void T(uj5 uj5Var) {
        if (this.F == null || getParentActivity() == null) {
            return;
        }
        try {
            ((sm2) uj5Var).F();
            ((k1f) org.telegram.messenger.a.j()).initializeMaps(org.telegram.messenger.a.b);
            ((sm2) this.F).w(new i52(this, (byte) 0));
            this.g0 = true;
            if (this.h0) {
                ((sm2) this.F).I();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void U(yv1 yv1Var, ylb ylbVar, int i) {
        TLRPC.TL_messageMediaVenue H = this.O.H(i);
        if (H != null) {
            byte b = this.p0;
            i22 i22Var = this.b;
            if (b != 7) {
                i22Var.U2.o(true);
                TLRPC.GeoPoint geoPoint = H.geo;
                g0(geoPoint.lat, geoPoint._long);
            } else if (this.o0 != null) {
                if (yv1Var != null && yv1Var.X7()) {
                    ik.J(getParentActivity(), yv1Var.a(), new h52(this, H, (byte) 0), ylbVar);
                } else {
                    this.o0.b(H, this.p0, true, 0, 0L);
                    i22Var.a(true);
                }
            }
        }
    }

    public final /* synthetic */ void W(ylb ylbVar) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            ik.A(getParentActivity()).show();
            return;
        }
        if (this.i0 == null || this.E == null) {
            return;
        }
        int i = cmb.lj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.n;
        anb.s(imageView, i, ylbVar, mode);
        imageView.setTag(Integer.valueOf(i));
        this.L.L(null);
        this.m0 = false;
        this.E.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new xj5(this.i0.getLatitude(), this.i0.getLongitude())));
    }

    public final /* synthetic */ void X(yv1 yv1Var, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, ylb ylbVar, Long l) {
        if (yv1Var != null && yv1Var.X7()) {
            ik.J(getParentActivity(), yv1Var.a(), new jf((Object) this, (Object) tL_messageMediaGeo, (Object) l, (byte) 23), ylbVar);
            return;
        }
        this.o0.b(tL_messageMediaGeo, this.p0, true, 0, l.longValue());
        this.b.a(true);
    }

    public final /* synthetic */ void Y(yv1 yv1Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, ylb ylbVar) {
        byte b = 1;
        if (yv1Var != null && yv1Var.X7()) {
            ik.J(getParentActivity(), yv1Var.a(), new h52(this, tL_messageMediaVenue, b), ylbVar);
        } else {
            this.o0.b(tL_messageMediaVenue, this.p0, true, 0, 0L);
            this.b.a(true);
        }
    }

    public final void Z(yv1 yv1Var, ylb ylbVar, int i) {
        n52 n52Var;
        yv1 yv1Var2;
        ylb ylbVar2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        qc6 qc6Var = this.L;
        i22 i22Var = this.b;
        byte b = 1;
        byte b2 = this.p0;
        if (b2 == 7) {
            if (i == 1 && (tL_messageMediaVenue2 = qc6Var.V) != null) {
                this.o0.b(tL_messageMediaVenue2, b2, true, 0, 0L);
                i22Var.a(true);
                return;
            } else if (i == 2 && (tL_messageMediaVenue = qc6Var.W) != null) {
                this.o0.b(tL_messageMediaVenue, b2, true, 0, 0L);
                i22Var.a(true);
                return;
            } else {
                n52Var = this;
                yv1Var2 = yv1Var;
                ylbVar2 = ylbVar;
            }
        } else {
            if (i == 1) {
                if (this.o0 == null || this.j0 == null) {
                    if (this.U) {
                        ik.A(getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = gm.b0(this.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = gm.b0(this.j0.getLongitude());
                    ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + 1, new jv0((Object) this, (Object) yv1Var, (Object) tL_messageMediaGeo, (Object) ylbVar, (byte) 4));
                    return;
                }
            }
            n52Var = this;
            yv1Var2 = yv1Var;
            ylbVar2 = ylbVar;
            if (i == 2 && b2 == 1) {
                dd6 locationController = n52Var.getLocationController();
                long j = n52Var.W;
                if (locationController.i(j)) {
                    n52Var.getLocationController().k(j);
                    i22Var.a(true);
                    return;
                } else if (n52Var.i0 == null && n52Var.U) {
                    ik.A(n52Var.getParentActivity()).show();
                    return;
                } else {
                    if (n52Var.o0 == null || n52Var.getParentActivity() == null || n52Var.i0 == null) {
                        return;
                    }
                    ik.B(n52Var.getParentActivity(), false, pg3.D(j) ? i22Var.Z1.getMessagesController().W1(Long.valueOf(j)) : null, new zf1(n52Var, b), n52Var.a).show();
                    return;
                }
            }
        }
        Object I = qc6Var.I(i);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + 1, new jv0((Object) n52Var, (Object) yv1Var2, I, (Object) ylbVar2, (byte) 5));
        }
    }

    public final /* synthetic */ void a0(Location location) {
        byte b;
        i22 i22Var = this.b;
        if (i22Var == null || i22Var.Z1 == null) {
            return;
        }
        f0(location);
        qc6 qc6Var = this.L;
        if (qc6Var != null && (((b = this.p0) == 7 || b == 8) && !this.m0)) {
            qc6Var.L(this.j0);
        }
        getLocationController().n(location, this.V);
        this.V = false;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.m5));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.Ii));
        hashSet.add(Integer.valueOf(cmb.ej));
        hashSet.add(Integer.valueOf(cmb.hj));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
    }

    public final /* synthetic */ void b0() {
        if (getParentActivity() != null) {
            try {
                getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public final /* synthetic */ void c0() {
        Activity parentActivity;
        if (!this.c0 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.c0 = false;
        int checkSelfPermission = parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
        qc6 qc6Var = this.L;
        i22 i22Var = this.b;
        if (checkSelfPermission != 0) {
            String[] strArr = (!i22Var.I1 || i22Var.w4 == null || Build.VERSION.SDK_INT < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            this.T = true;
            if (qc6Var != null) {
                qc6Var.O(this.U, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || !i22Var.I1 || i22Var.w4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        this.T = true;
        if (qc6Var != null) {
            qc6Var.O(this.U, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public final void d0() {
        yd ydVar;
        fv fvVar;
        xj5 xj5Var;
        if (this.F == null || (ydVar = this.K) == null || (fvVar = this.M) == null) {
            return;
        }
        byte b = 0;
        u69 K = fvVar.K(0);
        int top = K != null ? K.a.getTop() + fvVar.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((su) ((sm2) this.F).b).getVisibility() == 0) {
                ((su) ((sm2) this.F).b).setVisibility(4);
                ydVar.setVisibility(4);
                return;
            }
            return;
        }
        if (((su) ((sm2) this.F).b).getVisibility() == 4) {
            ((su) ((sm2) this.F).b).setVisibility(0);
            ydVar.setVisibility(0);
        }
        float f = top;
        if (this.v0 < 1.0f) {
            int[] iArr = this.w0;
            getLocationInWindow(iArr);
            f = Math.min(top, gm.U1(this.v0, -iArr[1], top));
        }
        int max = (int) Math.max(f, -getMapExtraTop());
        int max2 = (Math.max(0, K.a.getTop()) + fvVar.getTop()) - max;
        int min = (Math.min(this.t0, fvVar.getMeasuredHeight()) + fvVar.getTop()) - max;
        this.x0 = gm.L(32.0f) + max2;
        this.y0 = min;
        this.z0 = Math.max(0, this.r0 - (getMeasuredHeight() - max));
        float f2 = max;
        ydVar.setTranslationY(f2);
        ydVar.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = fvVar.getTop();
        int i = min + max;
        float f3 = (top2 + i) / 2.0f;
        float max3 = Math.max(f3, ((fvVar.getPaddingTop() + top2) + i) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f3);
        if (ceil != this.D0) {
            this.D0 = ceil;
            gm.c3(new d52(this, b));
        }
        float x = kt6.x(max + max2 + i, 2.0f, max3, f3);
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f4 = x - ceil2;
        ((su) ((sm2) this.F).b).setTranslationY(f4 - f2);
        int L = ((int) (x - f2)) - gm.L(48.0f);
        if (L != this.k0) {
            this.k0 = L;
            this.P.setTranslationY(L);
        }
        int measuredHeight = ((su) ((sm2) this.F).b).getMeasuredHeight() > 0 ? ((su) ((sm2) this.F).b).getMeasuredHeight() : getMapContentHeight();
        int max4 = Math.max(0, (int) (measuredHeight - (i - f4)));
        int i2 = ((ceil2 << 1) - measuredHeight) + max4;
        s05 s05Var = this.E;
        if (s05Var != null) {
            int i3 = this.E0;
            if (i2 == i3 && max4 == this.F0) {
                return;
            }
            if (i3 < 0) {
                xj5Var = getMapTarget();
            } else if (ceil2 != this.C0) {
                s05Var.d();
                xj5Var = (xj5) this.E.d().b;
            } else {
                xj5Var = null;
            }
            this.C0 = ceil2;
            this.E0 = i2;
            this.F0 = max4;
            this.E.n(0, gm.L(6.0f) + i2, 0, gm.L(6.0f) + max4);
            if (xj5Var != null) {
                this.E.h(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(xj5Var));
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.z4;
        qc6 qc6Var = this.L;
        if (i == i3) {
            this.U = false;
            this.T = false;
            e0();
            if (qc6Var != null) {
                qc6Var.O(this.U, this.T);
            }
            s05 s05Var = this.E;
            if (s05Var != null) {
                try {
                    s05Var.k(true);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        } else if (i == nm7.A4) {
            this.U = true;
            this.T = false;
            if (qc6Var != null) {
                qc6Var.O(true, false);
            }
        }
        Q();
        this.b.getClass();
        this.x.setVisibility(0);
    }

    @Override // a22
    public final boolean e() {
        return !R();
    }

    public final void e0() {
        n52 n52Var;
        i22 i22Var = this.b;
        if (!i22Var.I1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            f0(lastLocation);
            return;
        }
        if (i22Var.x4 != null) {
            gm.c3(new d52(this, (byte) 3));
            return;
        }
        if (this.U) {
            gm.c3(new d52(this, (byte) 8));
            return;
        }
        File file = i22Var.w4;
        boolean z = i22Var.v4;
        if (file != null) {
            if (!z) {
                n52Var = this;
                float[] fArr = new float[2];
                if (new ExifInterface(file.getAbsolutePath()).getLatLong(fArr)) {
                    gm.c3(new lx1(n52Var, fArr, (byte) 19));
                    return;
                }
                Location lastLocation2 = n52Var.getLastLocation();
                n52Var.i0 = lastLocation2;
                n52Var.f0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        gm.c3(new iia(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), (byte) 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        n52Var = this;
        Location lastLocation22 = n52Var.getLastLocation();
        n52Var.i0 = lastLocation22;
        n52Var.f0(lastLocation22);
    }

    @Override // a22
    public final boolean f() {
        return true;
    }

    public final void f0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.i0 = location2;
            s05 s05Var = this.E;
            qc6 qc6Var = this.L;
            if (s05Var == null) {
                qc6Var.M(location2);
                return;
            }
            xj5 xj5Var = new xj5(location.getLatitude(), location.getLongitude());
            if (qc6Var != null) {
                qc6Var.M(this.i0);
            }
            if (this.m0) {
                return;
            }
            this.j0 = new Location(location);
            if (this.n0) {
                this.E.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(xj5Var));
                return;
            }
            this.n0 = true;
            this.E.h(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(xj5Var, this.E.e() - 4.0f));
        }
    }

    public final void g0(double d, double d2) {
        pj5 newCameraUpdateLatLngZoom;
        if (this.E != null) {
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
            xj5 xj5Var = new xj5(d, d2);
            if (d == 0.0d || d2 == 0.0d) {
                newCameraUpdateLatLngZoom = ((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(xj5Var, this.E.f());
            } else {
                newCameraUpdateLatLngZoom = ((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(xj5Var, this.E.e() - 4.0f);
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.h(newCameraUpdateLatLngZoom);
            qc6 qc6Var = this.L;
            if (d == 0.0d || d2 == 0.0d) {
                qc6Var.M(this.i0);
            } else {
                qc6Var.L(this.j0);
            }
            qc6Var.H();
            this.M.x0(0, 1, null);
            this.l0 = true;
            if (d == 0.0d || d2 == 0.0d) {
                return;
            }
            this.m0 = true;
        }
    }

    @Override // a22
    public int getButtonsHideOffset() {
        return gm.L(56.0f);
    }

    @Override // a22
    public int getCurrentItemTop() {
        fv fvVar = this.M;
        if (fvVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        b59 b59Var = (b59) fvVar.K(0);
        return gm.L(56.0f) + (b59Var != null ? Math.max((int) b59Var.a.getY(), 0) : 0);
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // a22
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        t10 t10Var = new t10(this, (byte) 3);
        arrayList.add(new cnb(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        int i = cmb.z5;
        fv fvVar = this.M;
        arrayList.add(new cnb(fvVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        r7 r7Var = this.x;
        arrayList.add(new cnb(r7Var != null ? r7Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        int i2 = cmb.mj;
        ImageView imageView = this.n;
        arrayList.add(new cnb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        int i3 = cmb.nj;
        arrayList.add(new cnb(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        int i4 = cmb.kj;
        r7 r7Var2 = this.r;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i4));
        arrayList.add(new cnb(r7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(r7Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ij));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.jj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oj));
        arrayList.add(new cnb(fvVar, 393216, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.dj));
        arrayList.add(new cnb(fvVar, 393216, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.gj));
        arrayList.add(new cnb(fvVar, 393248, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.cj));
        arrayList.add(new cnb(fvVar, 393248, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.fj));
        arrayList.add(new cnb(fvVar, 196608, new Class[]{ed6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.Gi));
        return arrayList;
    }

    public final void h0() {
        yd ydVar;
        if (this.F == null || (ydVar = this.K) == null) {
            return;
        }
        fv fvVar = this.M;
        u69 K = fvVar.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            ydVar.getMeasuredHeight();
        }
        int i = this.s0;
        if (i < 0) {
            int L = gm.L(66.0f);
            byte b = this.p0;
            i = (b == 1 || b == 7 || b == 8) ? gm.L(66.0f) + L : L;
        }
        int measuredHeight = (fvVar.getMeasuredHeight() - getBottomInset()) - i;
        this.t0 = measuredHeight;
        if (K != null) {
            int bottom = measuredHeight - K.a.getBottom();
            int childCount = fvVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = fvVar.getChildAt(i2);
                if (RecyclerView.R(childAt) > 0) {
                    childAt.setTranslationY(bottom);
                }
            }
        }
        d0();
    }

    public final void i0() {
        boolean z = this.d0;
        LinearLayout linearLayout = this.s;
        if (!z) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z2 = this.f0;
        r59 r59Var = this.N;
        if (!z2) {
            r59Var.setEmptyView(linearLayout);
        } else {
            r59Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // a22
    public final int j() {
        return 1;
    }

    public final void j0() {
        if (this.F == null || this.K == null || getMeasuredHeight() == 0) {
            return;
        }
        fv fvVar = this.M;
        u69 K = fvVar.K(0);
        if (K != null) {
            View view = K.a;
            int bottom = view.getBottom();
            qc6 qc6Var = this.L;
            int b = qc6Var.b();
            int i = 1;
            while (true) {
                if (i >= b) {
                    this.s0 = bottom - view.getBottom();
                    break;
                }
                if (qc6Var.d(i) != 11) {
                    u69 K2 = fvVar.K(i);
                    if (K2 == null) {
                        break;
                    } else {
                        bottom = Math.max(bottom, K2.a.getBottom());
                    }
                }
                i++;
            }
        }
        int i2 = this.s0;
        if (i2 < 0) {
            int L = gm.L(66.0f);
            byte b2 = this.p0;
            i2 = (b2 == 1 || b2 == 7 || b2 == 8) ? gm.L(66.0f) + L : L;
        }
        int measuredHeight = (fvVar.getMeasuredHeight() - getDefaultBottomInset()) - i2;
        int measuredHeight2 = getMeasuredHeight() + getMapExtraTop();
        int max = Math.max(gm.L(120.0f), measuredHeight - fvVar.getPaddingTop());
        if (measuredHeight2 == this.r0 && max == this.q0) {
            return;
        }
        this.r0 = measuredHeight2;
        this.q0 = max;
        gm.c3(new d52(this, (byte) 2));
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Q();
        }
    }

    @Override // a22
    public final void p() {
        nm7.e().n(this, nm7.z4);
        nm7.e().n(this, nm7.A4);
        this.y = true;
        yd ydVar = this.K;
        if (ydVar != null) {
            ydVar.invalidate();
        }
        try {
            s05 s05Var = this.E;
            if (s05Var != null) {
                s05Var.k(false);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        uj5 uj5Var = this.F;
        if (uj5Var != null) {
            ((su) ((sm2) uj5Var).b).setTranslationY((-gm.q.y) * 3);
        }
        try {
            uj5 uj5Var2 = this.F;
            if (uj5Var2 != null) {
                ((sm2) uj5Var2).H();
            }
        } catch (Exception unused) {
        }
        try {
            uj5 uj5Var3 = this.F;
            if (uj5Var3 != null) {
                ((sm2) uj5Var3).G();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        qc6 qc6Var = this.L;
        if (qc6Var != null) {
            qc6Var.F();
        }
        l52 l52Var = this.O;
        if (l52Var != null) {
            l52Var.F();
        }
        i22 i22Var = this.b;
        i22Var.U2.o(true);
        i22Var.U2.t().removeView(this.x);
    }

    @Override // a22
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(m52 m52Var) {
        this.o0 = m52Var;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        h0();
    }

    @Override // a22
    public final void u() {
        this.x.setVisibility(8);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            P();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        r7 r7Var = this.x;
        if (r7Var != null) {
            try {
                if (r7Var.getSearchField() != null) {
                    r7Var.getSearchField().setCursorColor(cmb.v0(cmb.i5, this.a));
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    @Override // a22
    public final void y() {
        i22 i22Var = this.b;
        this.L.U = (i22Var == null || i22Var.d) ? false : true;
    }

    @Override // a22
    public final void z(int i, boolean z) {
        if (z) {
            this.L.U = false;
        }
    }
}
