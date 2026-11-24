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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c42 extends p02 implements tjb, gk7 {
    public float A0;
    public final qr1 B0;
    public int C0;
    public int D0;
    public ty4 E;
    public int E0;
    public vh5 F;
    public int F0;
    public qh5 G;
    public float H;
    public boolean I;
    public final View J;
    public final yc K;
    public final ra6 L;
    public final fu M;
    public final o39 N;
    public final a42 O;
    public final ImageView P;
    public final z12 Q;
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
    public b42 o0;
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

    public c42(x02 x02Var, Context context, final wjb wjbVar, boolean z) {
        super(x02Var, wjbVar, context);
        int i;
        this.S = true;
        final byte b = 0;
        this.T = false;
        this.U = false;
        this.V = true;
        this.a0 = new Paint();
        this.c0 = true;
        int currentActionBarHeight = (gl.q.x - a.getCurrentActionBarHeight()) - gl.L(66.0f);
        this.q0 = currentActionBarHeight;
        this.r0 = currentActionBarHeight;
        this.s0 = -1;
        this.t0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u0 = Float.NaN;
        this.v0 = 1.0f;
        this.w0 = new int[2];
        this.y0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.A0 = -1.0f;
        this.B0 = new qr1(this, (byte) 1);
        this.E0 = -1;
        this.F0 = -1;
        gl.a0();
        x02 x02Var2 = this.b;
        d dVar = x02Var2.Z1;
        final mu1 mu1Var = dVar instanceof mu1 ? (mu1) dVar : null;
        long V0 = x02Var2.V0();
        this.W = V0;
        if (this.b.I1) {
            this.p0 = (byte) 7;
            i = 7;
        } else if (!z || mu1Var == null || mu1Var.h != null || mu1Var.P7() || l7c.D(mu1Var.h())) {
            this.p0 = (byte) 0;
            i = 0;
        } else {
            this.p0 = (byte) 1;
            i = 1;
        }
        kk7.e().b(this, kk7.x4);
        kk7.e().b(this, kk7.y4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        ra6 ra6Var = this.L;
        if (ra6Var != null) {
            ra6Var.F();
        }
        a42 a42Var = this.O;
        if (a42Var != null) {
            a42Var.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        r7 a = this.b.U2.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q10(this, (byte) 3);
        this.x = a;
        this.b.getClass();
        a.setVisibility(0);
        a.setSearchFieldHint(k96.M0(2131745644, null));
        a.setContentDescription(k96.M0(2131745644, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i2 = bkb.i5;
        zkb.X(searchField, i2, wjbVar);
        zkb.v(searchField, i2, wjbVar);
        zkb.D(searchField, bkb.Le, wjbVar);
        new FrameLayout.LayoutParams(-1, gl.L(21.0f)).gravity = 83;
        yc ycVar = new yc((byte) 10, context, (Object) this);
        this.K = ycVar;
        ycVar.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new qa1(bkb.B0().o()));
        r7 r7Var = new r7(context, null, 0, bkb.v0(bkb.kj, this.a), false, wjbVar);
        this.r = r7Var;
        r7Var.setClickable(true);
        r7Var.setSubMenuOpenSide(2);
        r7Var.setAdditionalXOffset(gl.L(10.0f));
        r7Var.setAdditionalYOffset(-gl.L(10.0f));
        r7Var.d(2, R.drawable.msg_map, null, k96.M0(2131748498, null), true, false, wjbVar);
        r7Var.d(3, R.drawable.msg_satellite, null, k96.M0(2131745756, null), true, false, wjbVar);
        r7Var.d(4, R.drawable.msg_hybrid, null, k96.M0(2131749083, null), true, false, wjbVar);
        r7Var.setContentDescription(k96.M0(2131754838, null));
        int L = gl.L(40.0f);
        int i3 = bkb.mj;
        int v0 = bkb.v0(i3, this.a);
        int i4 = bkb.nj;
        ff0 h0 = bkb.h0(L, v0, bkb.v0(i4, this.a));
        ote.a(r7Var);
        r7Var.setTranslationZ(gl.L(2.0f));
        xi xiVar = zdc.a;
        r7Var.setOutlineProvider(xiVar);
        vkb M = zkb.M(i3);
        vkb M2 = zkb.M(i4);
        r7Var.setBackground(h0);
        zkb.j(r7Var, h0, M, M2, wjbVar);
        r7Var.setIcon(R.drawable.msg_map_type);
        ycVar.addView(r7Var, nme.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        byte b2 = 9;
        r7Var.setOnClickListener(new x91(this, b2));
        r7Var.setDelegate(new t32(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        ff0 h02 = bkb.h0(gl.L(40.0f), bkb.v0(i3, this.a), bkb.v0(i4, this.a));
        ote.a(imageView);
        imageView.setTranslationZ(gl.L(2.0f));
        imageView.setOutlineProvider(xiVar);
        vkb M3 = zkb.M(i3);
        vkb M4 = zkb.M(i4);
        imageView.setBackground(h02);
        zkb.j(imageView, h02, M3, M4, wjbVar);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i5 = bkb.lj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i5, wjbVar, mode);
        imageView.setTag(Integer.valueOf(i5));
        imageView.setContentDescription(k96.M0(2131754830, null));
        ycVar.addView(imageView, nme.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new kb1(this, wjbVar, b2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, gl.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, nme.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new jz1((byte) 2));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        zkb.s(imageView2, bkb.V5, wjbVar, mode);
        linearLayout.addView(imageView2, nme.o(-2, -2));
        TextView textView = new TextView(context);
        int i6 = bkb.W5;
        zkb.X(textView, i6, wjbVar);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        ir2.r(17.0f, 1, 2131747987, textView, null);
        TextView m = ug8.m(linearLayout, textView, nme.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = m;
        zkb.X(m, i6, wjbVar);
        m.setGravity(17);
        m.setTextSize(1, 15.0f);
        m.setPadding(gl.L(40.0f), 0, gl.L(40.0f), 0);
        linearLayout.addView(m, nme.t(-2, -2, 17, 0, 6, 0, 0));
        fu fuVar = new fu(this, context, wjbVar, b2);
        this.M = fuVar;
        setBlur3Capture(fuVar);
        this.d = fuVar;
        this.f = true;
        fuVar.setClipToPadding(false);
        ra6 ra6Var2 = new ra6(context, i, V0, true, wjbVar, this.b.I1, false, false);
        this.L = ra6Var2;
        fuVar.setAdapter(ra6Var2);
        x02 x02Var3 = this.b;
        ra6Var2.X = x02Var3 != null && (x02Var3.B1 || x02Var3.J1);
        fuVar.setItemAnimator(null);
        ra6Var2.O(this.U, this.T);
        fuVar.setVerticalScrollBarEnabled(false);
        fuVar.r1();
        z12 z12Var = new z12(this, fuVar);
        this.Q = z12Var;
        fuVar.setLayoutManager(z12Var);
        addView(fuVar, nme.e(-1, -1, 51));
        fuVar.setOnScrollListener(new z32(this, b));
        fuVar.setOnItemClickListener(new c39(this) { // from class: u32
            public final /* synthetic */ c42 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i7, View view2) {
                byte b3 = b;
                wjb wjbVar2 = wjbVar;
                mu1 mu1Var2 = mu1Var;
                c42 c42Var = this.b;
                switch (b3) {
                    case 0:
                        c42Var.Z(mu1Var2, wjbVar2, i7);
                        break;
                    default:
                        c42Var.V(mu1Var2, wjbVar2, i7);
                        break;
                }
            }
        });
        ra6Var2.P(this.q0);
        addView(ycVar, indexOfChild(fuVar), nme.e(-1, -1, 51));
        vh5 onCreateMapView = ((ize) org.telegram.messenger.a.j()).onCreateMapView(context);
        this.F = onCreateMapView;
        gl2 gl2Var = (gl2) onCreateMapView;
        gl2Var.c = new t32(this);
        gl2Var.d = new q31((Object) this, (Object) wjbVar, (byte) 22);
        new Thread(new v32(this, onCreateMapView, b)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        ycVar.addView(imageView3, nme.e(28, 48, 49));
        o39 o39Var = new o39(context, wjbVar);
        this.N = o39Var;
        o39Var.setSections(true);
        o39Var.setClipToPadding(false);
        o39Var.setVisibility(8);
        o39Var.setLayoutManager(new t26(1, false));
        a42 a42Var2 = new a42(this, context, wjbVar, this.b.I1);
        this.O = a42Var2;
        a42Var2.n = new t32(this);
        o39Var.setItemAnimator(null);
        addView(o39Var, nme.e(-1, -1, 51));
        final byte b3 = 1;
        o39Var.setOnScrollListener(new z32(this, b3));
        o39Var.setOnItemClickListener(new c39(this) { // from class: u32
            public final /* synthetic */ c42 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i7, View view2) {
                byte b32 = b3;
                wjb wjbVar2 = wjbVar;
                mu1 mu1Var2 = mu1Var;
                c42 c42Var = this.b;
                switch (b32) {
                    case 0:
                        c42Var.Z(mu1Var2, wjbVar2, i7);
                        break;
                    default:
                        c42Var.V(mu1Var2, wjbVar2, i7);
                        break;
                }
            }
        });
        i0();
    }

    private int getBottomInset() {
        S();
        return gl.U1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (!S()) {
            return getMinBottomInset();
        }
        return gl.L(8.0f) + this.e;
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

    private eb6 getLocationController() {
        return this.b.Z1.getLocationController();
    }

    private int getMapContentHeight() {
        return gl.L(10.0f) + this.r0 + this.D0;
    }

    private int getMapExtraTop() {
        return gl.L(8.0f) + gl.m;
    }

    private yh5 getMapTarget() {
        Location location;
        if (this.m0 && (location = this.j0) != null) {
            return new yh5(location.getLatitude(), this.j0.getLongitude());
        }
        Location location2 = this.i0;
        if (location2 != null) {
            return new yh5(location2.getLatitude(), this.i0.getLongitude());
        }
        return null;
    }

    private na7 getMessagesController() {
        return this.b.Z1.getMessagesController();
    }

    private int getMinBottomInset() {
        return S() ? getDefaultBottomInset() : Math.min(this.e, gl.n);
    }

    private Activity getParentActivity() {
        d dVar;
        x02 x02Var = this.b;
        if (x02Var == null || (dVar = x02Var.Z1) == null) {
            return null;
        }
        return dVar.getParentActivity();
    }

    private y6c getUserConfig() {
        return this.b.Z1.getUserConfig();
    }

    @Override // p02
    public final void A(int i, boolean z) {
        if (z) {
            this.L.U = false;
        }
    }

    @Override // p02
    public final void B() {
        vh5 vh5Var = this.F;
        if (vh5Var != null && this.g0) {
            try {
                ((gl2) vh5Var).I();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int i4;
        x02 x02Var = this.b;
        if (x02Var.U2.o0 || x02Var.o3.Q() > gl.L(20.0f)) {
            x02Var.r0 = false;
            i3 = 0;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i4 = (int) (i2 / 3.5f);
                    i3 = i4 - gl.L(52.0f);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    x02Var.r0 = true;
                }
            }
            i4 = (i2 / 5) << 1;
            i3 = i4 - gl.L(52.0f);
            if (i3 < 0) {
            }
            x02Var.r0 = true;
        }
        this.M.q1(0, i3, 0, getMinBottomInset());
        this.N.q1(0, 0, 0, this.e);
    }

    @Override // p02
    public final void D() {
        vh5 vh5Var = this.F;
        if (vh5Var != null && this.g0) {
            try {
                ((gl2) vh5Var).J();
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        this.h0 = true;
    }

    @Override // p02
    public final void G(float f, float f2) {
        if (this.u0 == f && this.v0 == f2) {
            return;
        }
        this.u0 = f;
        this.v0 = f2;
        d0();
    }

    @Override // p02
    public final void I(p02 p02Var) {
        x02 x02Var = this.b;
        x02Var.U2.setTitle(k96.M0(2131745264, null));
        byte b = 1;
        if (((st) ((gl2) this.F).b).getParent() == null) {
            st stVar = (st) ((gl2) this.F).b;
            FrameLayout.LayoutParams e = nme.e(-1, gl.L(10.0f) + this.q0, 51);
            yc ycVar = this.K;
            ycVar.addView(stVar, 0, e);
            ycVar.addView(this.J, 1, nme.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        vh5 vh5Var = this.F;
        if (vh5Var != null && this.g0) {
            try {
                ((gl2) vh5Var).J();
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        this.h0 = true;
        ty4 ty4Var = this.E;
        if (ty4Var != null) {
            try {
                ty4Var.k(true);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        R();
        gl.d3(new s32(this, b), x02Var.W3.g0() ? 200L : 0L);
        this.Q.g1(0, 0);
        h0();
    }

    @Override // p02
    public final void K() {
        this.M.z0(0);
    }

    public final void P() {
        yc ycVar;
        if (this.F == null || (ycVar = this.K) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ycVar.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            int i2 = this.r0;
            if (i != i2) {
                layoutParams.height = i2;
                ycVar.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((st) ((gl2) this.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != getMapContentHeight()) {
            layoutParams2.height = getMapContentHeight();
            ((st) ((gl2) this.F).b).setLayoutParams(layoutParams2);
        }
        this.L.P(this.q0);
        fu fuVar = this.M;
        s49 K = fuVar.K(0);
        if (K != null) {
            View view = K.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != this.q0) {
                view.getLayoutParams().height = this.q0;
                view.requestLayout();
            }
        }
        z12 z12Var = this.Q;
        z12Var.M = 0;
        z12Var.o1();
        fuVar.requestLayout();
        h0();
    }

    public final void Q() {
        r7 r7Var = this.r;
        if (r7Var != null) {
            r7Var.setIconColor(bkb.v0(bkb.kj, this.a));
            this.r.I(bkb.v0(bkb.F8, this.a));
            this.r.O(bkb.v0(bkb.E8, this.a), true);
            this.r.O(bkb.v0(bkb.D8, this.a), false);
        }
        if (this.E != null) {
            boolean z = bkb.I.o() || gl.B(bkb.v0(bkb.c6, this.a)) < 0.721f;
            boolean z2 = this.R;
            if (z) {
                if (z2) {
                    return;
                }
                this.R = true;
                this.E.i(((ize) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, R.raw.mapstyle_night));
                return;
            }
            if (z2) {
                this.R = false;
                this.E.i(null);
            }
        }
    }

    public final void R() {
        if (getMeasuredHeight() == 0 || this.F == null) {
            return;
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        fu fuVar = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fuVar.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        fuVar.setLayoutParams(layoutParams);
        yc ycVar = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ycVar.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        ycVar.setLayoutParams(layoutParams2);
        o39 o39Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) o39Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        o39Var.setLayoutParams(layoutParams3);
        int i = this.q0;
        ra6 ra6Var = this.L;
        ra6Var.P(i);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((st) ((gl2) this.F).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = gl.L(10.0f) + this.r0;
            ((st) ((gl2) this.F).b).setLayoutParams(layoutParams4);
        }
        ra6Var.f();
        h0();
    }

    public final boolean S() {
        wz1 wz1Var = this.b.u3;
        return (wz1Var == null || wz1Var.getVisibility() == 8) ? false : true;
    }

    public final void T(ty4 ty4Var) {
        PackageManager packageManager;
        this.E = ty4Var;
        s32 s32Var = new s32(this, (byte) 4);
        wk4 wk4Var = ty4Var.a;
        kx3 kx3Var = new kx3(s32Var, (byte) 29);
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            r4d r4dVar = new r4d(kx3Var);
            Parcel R = a6eVar.R();
            sgd.c(R, r4dVar);
            a6eVar.V(R, 42);
            if (bkb.I.o() || gl.B(bkb.v0(bkb.c6, this.a)) < 0.721f) {
                this.R = true;
                this.E.i(((ize) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, R.raw.mapstyle_night));
            }
            if (this.E != null) {
                Location location = new Location("network");
                this.j0 = location;
                location.setLatitude(20.659322d);
                this.j0.setLongitude(-11.40625d);
                try {
                    this.E.k(true);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                this.E.g().Z();
                this.E.g().b0();
                this.E.g().Y();
                this.E.l(new t32(this));
                ty4 ty4Var2 = this.E;
                s32 s32Var2 = new s32(this, (byte) 5);
                wk4 wk4Var2 = ty4Var2.a;
                ry4 ry4Var = new ry4((Object) s32Var2, (byte) 2);
                wk4Var2.getClass();
                try {
                    a6e a6eVar2 = (a6e) wk4Var2.b;
                    byte b = 0;
                    r4d r4dVar2 = new r4d(ry4Var, (short) 0);
                    Parcel R2 = a6eVar2.R();
                    sgd.c(R2, r4dVar2);
                    a6eVar2.V(R2, 99);
                    ty4 ty4Var3 = this.E;
                    x32 x32Var = new x32(this, (byte) 1);
                    wk4 wk4Var3 = ty4Var3.a;
                    ry4 ry4Var2 = new ry4(x32Var, b);
                    wk4Var3.getClass();
                    try {
                        a6e a6eVar3 = (a6e) wk4Var3.b;
                        r4d r4dVar3 = new r4d(ry4Var2);
                        Parcel R3 = a6eVar3.R();
                        sgd.c(R3, r4dVar3);
                        a6eVar3.V(R3, 36);
                        this.E.m(new k32((byte) 1));
                        e0();
                        gl.d3(new s32(this, (byte) 6), 200L);
                        if (this.S && getParentActivity() != null) {
                            this.S = false;
                            Activity parentActivity = getParentActivity();
                            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                                return;
                            }
                            try {
                                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getParentActivity());
                                    int i = bkb.K5;
                                    alertDialog$Builder.l(R.raw.permission_request_location, 72, bkb.v0(i, this.a), null);
                                    alertDialog$Builder.m(i, this.a);
                                    alertDialog$Builder.a.U = k96.M0(2131749355, null);
                                    alertDialog$Builder.j(k96.M0(2131751794, null), new t32(this));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.o();
                                }
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                        }
                        h0();
                    } catch (RemoteException e3) {
                        fvc.g(e3);
                    }
                } catch (RemoteException e4) {
                    fvc.g(e4);
                }
            }
        } catch (RemoteException e5) {
            fvc.g(e5);
        }
    }

    public final void U(vh5 vh5Var) {
        if (this.F == null || getParentActivity() == null) {
            return;
        }
        try {
            ((gl2) vh5Var).G();
            ((ize) org.telegram.messenger.a.j()).initializeMaps(org.telegram.messenger.a.b);
            ((gl2) this.F).s(new x32(this, (byte) 0));
            this.g0 = true;
            if (this.h0) {
                ((gl2) this.F).J();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void V(mu1 mu1Var, wjb wjbVar, int i) {
        TLRPC.TL_messageMediaVenue H = this.O.H(i);
        if (H != null) {
            byte b = this.p0;
            x02 x02Var = this.b;
            if (b != 7) {
                x02Var.U2.n(true);
                TLRPC.GeoPoint geoPoint = H.geo;
                g0(geoPoint.lat, geoPoint._long);
            } else if (this.o0 != null) {
                if (mu1Var != null && mu1Var.P7()) {
                    ij.J(getParentActivity(), mu1Var.a(), new w32(this, H, (byte) 0), wjbVar);
                } else {
                    this.o0.b(H, this.p0, true, 0, 0L);
                    x02Var.a(true);
                }
            }
        }
    }

    public final /* synthetic */ void W(wjb wjbVar) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            ij.A(getParentActivity()).show();
            return;
        }
        if (this.i0 == null || this.E == null) {
            return;
        }
        int i = bkb.lj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.n;
        zkb.s(imageView, i, wjbVar, mode);
        imageView.setTag(Integer.valueOf(i));
        this.L.L(null);
        this.m0 = false;
        this.E.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new yh5(this.i0.getLatitude(), this.i0.getLongitude())));
    }

    public final /* synthetic */ void X(mu1 mu1Var, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, wjb wjbVar, Long l) {
        if (mu1Var != null && mu1Var.P7()) {
            ij.J(getParentActivity(), mu1Var.a(), new ie((Object) this, (Object) tL_messageMediaGeo, (Object) l, (byte) 23), wjbVar);
            return;
        }
        this.o0.b(tL_messageMediaGeo, this.p0, true, 0, l.longValue());
        this.b.a(true);
    }

    public final /* synthetic */ void Y(mu1 mu1Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, wjb wjbVar) {
        byte b = 1;
        if (mu1Var != null && mu1Var.P7()) {
            ij.J(getParentActivity(), mu1Var.a(), new w32(this, tL_messageMediaVenue, b), wjbVar);
        } else {
            this.o0.b(tL_messageMediaVenue, this.p0, true, 0, 0L);
            this.b.a(true);
        }
    }

    public final void Z(mu1 mu1Var, wjb wjbVar, int i) {
        c42 c42Var;
        mu1 mu1Var2;
        wjb wjbVar2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        ra6 ra6Var = this.L;
        x02 x02Var = this.b;
        byte b = 1;
        byte b2 = this.p0;
        if (b2 == 7) {
            if (i == 1 && (tL_messageMediaVenue2 = ra6Var.V) != null) {
                this.o0.b(tL_messageMediaVenue2, b2, true, 0, 0L);
                x02Var.a(true);
                return;
            } else if (i == 2 && (tL_messageMediaVenue = ra6Var.W) != null) {
                this.o0.b(tL_messageMediaVenue, b2, true, 0, 0L);
                x02Var.a(true);
                return;
            } else {
                c42Var = this;
                mu1Var2 = mu1Var;
                wjbVar2 = wjbVar;
            }
        } else {
            if (i == 1) {
                if (this.o0 == null || this.j0 == null) {
                    if (this.U) {
                        ij.A(getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = gl.b0(this.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = gl.b0(this.j0.getLongitude());
                    ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + 1, new au0((Object) this, (Object) mu1Var, (Object) tL_messageMediaGeo, (Object) wjbVar, (byte) 4));
                    return;
                }
            }
            c42Var = this;
            mu1Var2 = mu1Var;
            wjbVar2 = wjbVar;
            if (i == 2 && b2 == 1) {
                eb6 locationController = c42Var.getLocationController();
                long j = c42Var.W;
                if (locationController.i(j)) {
                    c42Var.getLocationController().k(j);
                    x02Var.a(true);
                    return;
                } else if (c42Var.i0 == null && c42Var.U) {
                    ij.A(c42Var.getParentActivity()).show();
                    return;
                } else {
                    if (c42Var.o0 == null || c42Var.getParentActivity() == null || c42Var.i0 == null) {
                        return;
                    }
                    ij.B(c42Var.getParentActivity(), false, cf3.D(j) ? x02Var.Z1.getMessagesController().V1(Long.valueOf(j)) : null, new re1(c42Var, b), c42Var.a).show();
                    return;
                }
            }
        }
        Object I = ra6Var.I(i);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + 1, new au0((Object) c42Var, (Object) mu1Var2, I, (Object) wjbVar2, (byte) 5));
        }
    }

    public final /* synthetic */ void a0(Location location) {
        byte b;
        x02 x02Var = this.b;
        if (x02Var == null || x02Var.Z1 == null) {
            return;
        }
        f0(location);
        ra6 ra6Var = this.L;
        if (ra6Var != null && (((b = this.p0) == 7 || b == 8) && !this.m0)) {
            ra6Var.L(this.j0);
        }
        getLocationController().n(location, this.V);
        this.V = false;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.m5));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.Ii));
        hashSet.add(Integer.valueOf(bkb.ej));
        hashSet.add(Integer.valueOf(bkb.hj));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
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
        ra6 ra6Var = this.L;
        x02 x02Var = this.b;
        if (checkSelfPermission != 0) {
            String[] strArr = (!x02Var.I1 || x02Var.w4 == null || Build.VERSION.SDK_INT < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            this.T = true;
            if (ra6Var != null) {
                ra6Var.O(this.U, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || !x02Var.I1 || x02Var.w4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        this.T = true;
        if (ra6Var != null) {
            ra6Var.O(this.U, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, kk7.n3);
    }

    public final void d0() {
        yc ycVar;
        fu fuVar;
        yh5 yh5Var;
        if (this.F == null || (ycVar = this.K) == null || (fuVar = this.M) == null) {
            return;
        }
        byte b = 0;
        s49 K = fuVar.K(0);
        int top = K != null ? K.a.getTop() + fuVar.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (K == null || top >= getMeasuredHeight()) {
            if (((st) ((gl2) this.F).b).getVisibility() == 0) {
                ((st) ((gl2) this.F).b).setVisibility(4);
                ycVar.setVisibility(4);
                return;
            }
            return;
        }
        if (((st) ((gl2) this.F).b).getVisibility() == 4) {
            ((st) ((gl2) this.F).b).setVisibility(0);
            ycVar.setVisibility(0);
        }
        float f = top;
        if (this.v0 < 1.0f) {
            int[] iArr = this.w0;
            getLocationInWindow(iArr);
            f = Math.min(top, gl.U1(this.v0, -iArr[1], top));
        }
        int max = (int) Math.max(f, -getMapExtraTop());
        int max2 = (Math.max(0, K.a.getTop()) + fuVar.getTop()) - max;
        int min = (Math.min(this.t0, fuVar.getMeasuredHeight()) + fuVar.getTop()) - max;
        this.x0 = gl.L(32.0f) + max2;
        this.y0 = min;
        this.z0 = Math.max(0, this.r0 - (getMeasuredHeight() - max));
        float f2 = max;
        ycVar.setTranslationY(f2);
        ycVar.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = fuVar.getTop();
        int i = min + max;
        float f3 = (top2 + i) / 2.0f;
        float max3 = Math.max(f3, ((fuVar.getPaddingTop() + top2) + i) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f3);
        if (ceil != this.D0) {
            this.D0 = ceil;
            gl.c3(new s32(this, b));
        }
        float w = ls6.w(max + max2 + i, 2.0f, max3, f3);
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f4 = w - ceil2;
        ((st) ((gl2) this.F).b).setTranslationY(f4 - f2);
        int L = ((int) (w - f2)) - gl.L(48.0f);
        if (L != this.k0) {
            this.k0 = L;
            this.P.setTranslationY(L);
        }
        int measuredHeight = ((st) ((gl2) this.F).b).getMeasuredHeight() > 0 ? ((st) ((gl2) this.F).b).getMeasuredHeight() : getMapContentHeight();
        int max4 = Math.max(0, (int) (measuredHeight - (i - f4)));
        int i2 = ((ceil2 << 1) - measuredHeight) + max4;
        ty4 ty4Var = this.E;
        if (ty4Var != null) {
            int i3 = this.E0;
            if (i2 == i3 && max4 == this.F0) {
                return;
            }
            if (i3 < 0) {
                yh5Var = getMapTarget();
            } else if (ceil2 != this.C0) {
                ty4Var.d();
                yh5Var = (yh5) this.E.d().b;
            } else {
                yh5Var = null;
            }
            this.C0 = ceil2;
            this.E0 = i2;
            this.F0 = max4;
            this.E.n(0, gl.L(6.0f) + i2, 0, gl.L(6.0f) + max4);
            if (yh5Var != null) {
                this.E.h(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(yh5Var));
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.x4;
        ra6 ra6Var = this.L;
        if (i == i3) {
            this.U = false;
            this.T = false;
            e0();
            if (ra6Var != null) {
                ra6Var.O(this.U, this.T);
            }
            ty4 ty4Var = this.E;
            if (ty4Var != null) {
                try {
                    ty4Var.k(true);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } else if (i == kk7.y4) {
            this.U = true;
            this.T = false;
            if (ra6Var != null) {
                ra6Var.O(true, false);
            }
        }
        R();
        this.b.getClass();
        this.x.setVisibility(0);
    }

    @Override // p02
    public final boolean e() {
        return !S();
    }

    public final void e0() {
        c42 c42Var;
        x02 x02Var = this.b;
        if (!x02Var.I1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            f0(lastLocation);
            return;
        }
        if (x02Var.x4 != null) {
            gl.c3(new s32(this, (byte) 3));
            return;
        }
        if (this.U) {
            gl.c3(new s32(this, (byte) 8));
            return;
        }
        File file = x02Var.w4;
        boolean z = x02Var.v4;
        if (file != null) {
            if (!z) {
                c42Var = this;
                float[] fArr = new float[2];
                if (new ExifInterface(file.getAbsolutePath()).getLatLong(fArr)) {
                    gl.c3(new kx1(c42Var, fArr, (byte) 18));
                    return;
                }
                Location lastLocation2 = c42Var.getLastLocation();
                c42Var.i0 = lastLocation2;
                c42Var.f0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        gl.c3(new gga(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), (byte) 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        c42Var = this;
        Location lastLocation22 = c42Var.getLastLocation();
        c42Var.i0 = lastLocation22;
        c42Var.f0(lastLocation22);
    }

    @Override // p02
    public final boolean f() {
        return true;
    }

    public final void f0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.i0 = location2;
            ty4 ty4Var = this.E;
            ra6 ra6Var = this.L;
            if (ty4Var == null) {
                ra6Var.M(location2);
                return;
            }
            yh5 yh5Var = new yh5(location.getLatitude(), location.getLongitude());
            if (ra6Var != null) {
                ra6Var.M(this.i0);
            }
            if (this.m0) {
                return;
            }
            this.j0 = new Location(location);
            if (this.n0) {
                this.E.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(yh5Var));
                return;
            }
            this.n0 = true;
            this.E.h(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(yh5Var, this.E.e() - 4.0f));
        }
    }

    public final void g0(double d, double d2) {
        qh5 newCameraUpdateLatLngZoom;
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
            yh5 yh5Var = new yh5(d, d2);
            if (d == 0.0d || d2 == 0.0d) {
                newCameraUpdateLatLngZoom = ((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(yh5Var, this.E.f());
            } else {
                newCameraUpdateLatLngZoom = ((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(yh5Var, this.E.e() - 4.0f);
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.h(newCameraUpdateLatLngZoom);
            ra6 ra6Var = this.L;
            if (d == 0.0d || d2 == 0.0d) {
                ra6Var.M(this.i0);
            } else {
                ra6Var.L(this.j0);
            }
            ra6Var.H();
            this.M.x0(0, 1, null);
            this.l0 = true;
            if (d == 0.0d || d2 == 0.0d) {
                return;
            }
            this.m0 = true;
        }
    }

    @Override // p02
    public int getButtonsHideOffset() {
        return gl.L(56.0f);
    }

    @Override // p02
    public int getCurrentItemTop() {
        fu fuVar = this.M;
        if (fuVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        y29 y29Var = (y29) fuVar.K(0);
        return gl.L(56.0f) + (y29Var != null ? Math.max((int) y29Var.a.getY(), 0) : 0);
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // p02
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        t00 t00Var = new t00(this, (byte) 3);
        arrayList.add(new blb(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        int i = bkb.z5;
        fu fuVar = this.M;
        arrayList.add(new blb(fuVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        r7 r7Var = this.x;
        arrayList.add(new blb(r7Var != null ? r7Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        int i2 = bkb.mj;
        ImageView imageView = this.n;
        arrayList.add(new blb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        int i3 = bkb.nj;
        arrayList.add(new blb(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        int i4 = bkb.kj;
        r7 r7Var2 = this.r;
        arrayList.add(new blb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t00Var, i4));
        arrayList.add(new blb(r7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(r7Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i3));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ij));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.jj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.oj));
        arrayList.add(new blb(fuVar, 393216, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.dj));
        arrayList.add(new blb(fuVar, 393216, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.gj));
        arrayList.add(new blb(fuVar, 393248, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.cj));
        arrayList.add(new blb(fuVar, 393248, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.fj));
        arrayList.add(new blb(fuVar, 196608, new Class[]{fb6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.Gi));
        return arrayList;
    }

    public final void h0() {
        yc ycVar;
        if (this.F == null || (ycVar = this.K) == null) {
            return;
        }
        fu fuVar = this.M;
        s49 K = fuVar.K(0);
        if (K != null) {
            K.a.getTop();
        } else {
            ycVar.getMeasuredHeight();
        }
        int i = this.s0;
        if (i < 0) {
            int L = gl.L(66.0f);
            byte b = this.p0;
            i = (b == 1 || b == 7 || b == 8) ? gl.L(66.0f) + L : L;
        }
        int measuredHeight = (fuVar.getMeasuredHeight() - getBottomInset()) - i;
        this.t0 = measuredHeight;
        if (K != null) {
            int bottom = measuredHeight - K.a.getBottom();
            int childCount = fuVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = fuVar.getChildAt(i2);
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
        o39 o39Var = this.N;
        if (!z2) {
            o39Var.setEmptyView(linearLayout);
        } else {
            o39Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    public final void j0() {
        if (this.F == null || this.K == null || getMeasuredHeight() == 0) {
            return;
        }
        fu fuVar = this.M;
        s49 K = fuVar.K(0);
        if (K != null) {
            View view = K.a;
            int bottom = view.getBottom();
            ra6 ra6Var = this.L;
            int b = ra6Var.b();
            int i = 1;
            while (true) {
                if (i >= b) {
                    this.s0 = bottom - view.getBottom();
                    break;
                }
                if (ra6Var.d(i) != 11) {
                    s49 K2 = fuVar.K(i);
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
            int L = gl.L(66.0f);
            byte b2 = this.p0;
            i2 = (b2 == 1 || b2 == 7 || b2 == 8) ? gl.L(66.0f) + L : L;
        }
        int measuredHeight = (fuVar.getMeasuredHeight() - getDefaultBottomInset()) - i2;
        int measuredHeight2 = getMeasuredHeight() + getMapExtraTop();
        int max = Math.max(gl.L(120.0f), measuredHeight - fuVar.getPaddingTop());
        if (measuredHeight2 == this.r0 && max == this.q0) {
            return;
        }
        this.r0 = measuredHeight2;
        this.q0 = max;
        gl.c3(new s32(this, (byte) 2));
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
            R();
        }
    }

    @Override // p02
    public final void q() {
        kk7.e().n(this, kk7.x4);
        kk7.e().n(this, kk7.y4);
        this.y = true;
        yc ycVar = this.K;
        if (ycVar != null) {
            ycVar.invalidate();
        }
        try {
            ty4 ty4Var = this.E;
            if (ty4Var != null) {
                ty4Var.k(false);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        vh5 vh5Var = this.F;
        if (vh5Var != null) {
            ((st) ((gl2) vh5Var).b).setTranslationY((-gl.q.y) * 3);
        }
        try {
            vh5 vh5Var2 = this.F;
            if (vh5Var2 != null) {
                ((gl2) vh5Var2).I();
            }
        } catch (Exception unused) {
        }
        try {
            vh5 vh5Var3 = this.F;
            if (vh5Var3 != null) {
                ((gl2) vh5Var3).H();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        ra6 ra6Var = this.L;
        if (ra6Var != null) {
            ra6Var.F();
        }
        a42 a42Var = this.O;
        if (a42Var != null) {
            a42Var.F();
        }
        x02 x02Var = this.b;
        x02Var.U2.n(true);
        x02Var.U2.t().removeView(this.x);
    }

    @Override // p02
    public final boolean r() {
        q();
        return false;
    }

    public void setDelegate(b42 b42Var) {
        this.o0 = b42Var;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        h0();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            Q();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        r7 r7Var = this.x;
        if (r7Var != null) {
            try {
                if (r7Var.getSearchField() != null) {
                    r7Var.getSearchField().setCursorColor(bkb.v0(bkb.i5, this.a));
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    @Override // p02
    public final void v() {
        this.x.setVisibility(8);
    }

    @Override // p02
    public final void z() {
        x02 x02Var = this.b;
        this.L.U = (x02Var == null || x02Var.d) ? false : true;
    }
}
