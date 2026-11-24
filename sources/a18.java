// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class a18 extends d implements gk7 {
    public final ix4 E;
    public final kl0 F;
    public final ix4 G;
    public final kl0 H;
    public d I;
    public vq1 J;
    public ImageView K;
    public ImageView L;
    public FrameLayout M;
    public xb4 N;
    public jia O;
    public FrameLayout P;
    public FrameLayout Q;
    public u41 R;
    public t08 S;
    public boolean T;
    public oy8 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public xg1 Y;
    public float Z;
    public final boolean a;
    public ValueAnimator a0;
    public final xsa b;
    public boolean b0;
    public final xsa c;
    public io5 c0;
    public oc6 d;
    public final e59 d0;
    public c08 e;
    public final e59 e0;
    public final int f;
    public t08 h;
    public t08 n;
    public boolean r;
    public wjb s;
    public final SparseIntArray w;
    public final m17 x;
    public final m17 y;

    public a18() {
        super(null);
        this.f = gl.L(6.0f);
        this.w = new SparseIntArray();
        boolean o = bkb.I.o();
        this.T = o;
        this.b0 = o;
        this.c0 = io5.e;
        e59 e59Var = new e59(0, false);
        this.d0 = e59Var;
        e59 e59Var2 = new e59(0, false);
        this.e0 = e59Var2;
        ix4 ix4Var = new ix4();
        this.E = ix4Var;
        kl0 kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        this.F = kl0Var;
        ix4 ix4Var2 = new ix4();
        this.G = ix4Var2;
        kl0 kl0Var2 = new kl0(ix4Var2, ix4Var2, ix4Var2);
        this.H = kl0Var2;
        kl0Var.g = e59Var;
        kl0Var.f = e59Var2;
        kl0Var2.g = e59Var;
        kl0Var2.f = e59Var2;
        this.a = false;
        gta.v(this.currentAccount, false).T();
        xsa xsaVar = new xsa(this.currentAccount, 0L, false);
        this.b = xsaVar;
        xsaVar.g(8, false);
        xsaVar.a();
        xsa xsaVar2 = new xsa(this.currentAccount, 0L, false);
        this.c = xsaVar2;
        xsaVar2.g(8, false);
        xsaVar2.f = true;
        xsaVar2.a();
        this.resourceProvider = new fd(this, (byte) 3);
        this.x = new m17(0, false, false, this.resourceProvider);
        this.y = new m17(0, false, true, this.resourceProvider);
    }

    public static boolean D0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z && tL_emojiStatusCollectible != null && z && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static int y0(int i) {
        return bkb.a(0.5f, (gl.B(i) > 0.2f ? 1 : (gl.B(i) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i);
    }

    public final void A0() {
        if (this.r) {
            return;
        }
        byte b = 1;
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().p()) {
            showDialog(new jh8((d) this, 23, true));
            return;
        }
        t08 E0 = E0();
        TL_stars.TL_starGiftUnique tL_starGiftUnique = E0.J;
        t08 t08Var = this.h;
        if (tL_starGiftUnique == null) {
            if (E0 == t08Var) {
                t08Var = this.n;
            }
            if (t08Var.J != null) {
                t08Var.c();
            }
            z0();
            finishFragment();
            H0();
            return;
        }
        if (E0 == t08Var) {
            t08Var = this.n;
        }
        t08Var.c();
        this.r = true;
        this.R.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = E0.J;
        xz7 xz7Var = new xz7(this, b);
        long e = y6c.h(this.currentAccount).e();
        oj ojVar = tL_starGiftUnique2.resale_ton_only ? oj.b : oj.a;
        gta.u(this.currentAccount, ojVar).E(tL_starGiftUnique2, e, null, true, new zz7(this, ojVar, tL_starGiftUnique2, e, xz7Var));
    }

    public final void B0() {
        this.E.a(getThemedColor(bkb.c6));
        this.P.invalidate();
        this.Q.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((il0) this.P.getBackground()).updateColors();
        C0();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((il0) it.next()).updateColors();
        }
    }

    public final void C0() {
        int f = ((double) gl.B(getThemedColor(bkb.c6))) > 0.72d ? bm2.f(0.085f, getThemedColor(bkb.Z6), this.e.getColor()) : getThemedColor(bkb.Z6);
        this.d.setBackgroundColor(f);
        ix4 ix4Var = this.G;
        if (ix4Var.b != f) {
            ix4Var.a(f);
            Iterator it = this.e0.iterator();
            while (it.hasNext()) {
                ((il0) it.next()).updateColors();
            }
            Iterator it2 = this.d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final t08 E0() {
        vq1 vq1Var = this.J;
        return (vq1Var == null || vq1Var.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    public final void F0(oj ojVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, xz7 xz7Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        ypa ypaVar = new ypa(ojVar, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        aqa aqaVar = new aqa(getParentActivity(), this.resourceProvider, tL_starGiftUnique, ypaVar, this.currentAccount, j, ls6.m(tL_starGiftUnique.num, ',', sb), false, new a08(this, zArr, tL_starGiftUnique, j, xz7Var, (byte) 0));
        aqaVar.h.setOnDismissListener(new cf(zArr, xz7Var, (byte) 13));
        aqaVar.b();
    }

    public final void G0(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, xz7 xz7Var, ypa ypaVar, c01 c01Var) {
        zArr[0] = true;
        c01Var.d();
        gta.u(this.currentAccount, ypaVar.a).f(ypaVar.b, tL_starGiftUnique, j, null, true, new w77(c01Var, xz7Var, (byte) 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r18.J.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if ((r18.J.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.n) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0() {
        ArrayList<Integer> arrayList;
        u08 u08Var;
        if (this.I != null) {
            boolean z = this.V;
            boolean z2 = this.a;
            if (z) {
                if (this.W) {
                }
                t08 t08Var = this.h;
                if (t08Var.h >= 0) {
                    u21.b0(this.I).M(u08.a(this.currentAccount, this.h.h), k96.M0(z2 ? 2131752424 : 2131743517, null)).j();
                } else {
                    if (t08Var.s == null) {
                        return;
                    }
                    u21 b0 = u21.b0(this.I);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i = u08.j;
                    if (!bkb.I.o() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        u08Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        u08Var = new u08(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    b0.M(u08Var, k96.M0(z2 ? 2131752424 : 2131743517, null)).j();
                }
                this.I = null;
            }
            if (this.W) {
                if (this.V) {
                }
                t08 t08Var2 = this.n;
                if (t08Var2.h < 0) {
                    long j = t08Var2.n;
                    d dVar = this.I;
                    if (j != 0) {
                        u21 b02 = u21.b0(dVar);
                        TLRPC.Document e = vl.e(this.currentAccount, this.n.n);
                        String M0 = k96.M0(z2 ? 2131752313 : 2131743499, null);
                        b02.getClass();
                        t11 t11Var = new t11(b02.X(), b02.c);
                        boolean B4 = k27.B4(e);
                        ry8 ry8Var = t11Var.a;
                        if (B4) {
                            zkb.s(ry8Var, bkb.xj, null, PorterDuff.Mode.SRC_IN);
                        }
                        t11Var.e(e, new String[0]);
                        ry8Var.i();
                        t11Var.b.setText(M0);
                        t11Var.b.setTextSize(1, 14.0f);
                        t11Var.b.setSingleLine(false);
                        t11Var.b.setMaxLines(3);
                        b02.b(t11Var, 2750).j();
                    } else {
                        ir2.v(null, z2 ? 2131752311 : 2131743497, u21.b0(dVar), R.raw.contact_check, 36);
                    }
                } else {
                    u21.b0(this.I).M(u08.c(this.currentAccount, this.n.h), k96.M0(z2 ? 2131752314 : 2131743500, null)).j();
                }
            }
            this.I = null;
        }
    }

    public final void I0() {
        jia jiaVar = this.O;
        if (jiaVar != null) {
            jiaVar.setTextColor(getThemedColor(bkb.z8));
        }
        this.h.g();
        this.n.g();
        c08 c08Var = this.e;
        if (c08Var != null) {
            c08Var.a = bkb.v0(bkb.Z6, c08Var.b);
            c08Var.a();
            c08Var.invalidate();
        }
        J0();
        B0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void J0() {
        if (this.e != null) {
            C0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.N != null) {
                vq1 vq1Var = this.J;
                float a = moe.a(((vq1Var == null ? 0.0f : vq1Var.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                xb4 xb4Var = this.N;
                int f = bm2.f(a, tabsViewBackgroundColor, getThemedColor(bkb.c6));
                int f2 = bm2.f(a, -1, getThemedColor(bkb.Z6));
                int f3 = bm2.f(a, -1, getThemedColor(bkb.y6));
                int f4 = bm2.f(a, tabsViewBackgroundColor, getThemedColor(bkb.F6));
                xb4Var.a.setColor(f);
                xb4Var.b.setColor(f2);
                xb4Var.d = f3;
                xb4Var.e = f4;
                xb4Var.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        final byte b2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        byte b3 = 4;
        oc6 oc6Var = new oc6(b3, context, this);
        this.d = oc6Var;
        this.fragmentView = oc6Var;
        this.h = new t08(this, context, 1);
        this.n = new t08(this, context, 0);
        c08 c08Var = new c08(this, context, this.resourceProvider);
        this.e = c08Var;
        c08Var.F = true;
        this.n.j(false);
        final byte b4 = 2;
        this.n.addView(this.e, 2, nme.e(-1, -2, 55));
        vq1 vq1Var = new vq1(b3, context, this);
        this.J = vq1Var;
        vq1Var.setAdapter(new sl2(this, b3));
        oc6Var.addView(this.J, nme.e(-1, -1, kk7.D1));
        u41 u41Var = new u41(getResourceProvider(), context, true);
        this.R = u41Var;
        u41Var.setStateListAnimator(null);
        this.R.f();
        this.R.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: yz7
            public final /* synthetic */ a18 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b2;
                a18 a18Var = this.b;
                byte b6 = 1;
                switch (b5) {
                    case 0:
                        a18Var.A0();
                        break;
                    case 1:
                        if (a18Var.onBackPressed(true)) {
                            a18Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        a18 a18Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) a18Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a18Var2.L.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        a18Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        a18Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(a18Var2, a18Var2.getParentActivity(), canvas, (a18Var2.L.getMeasuredWidth() / 2.0f) + f, (a18Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        a18Var2.Y = xg1Var;
                        xg1Var.setOnTouchListener(new jz1((byte) 17));
                        a18Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        a18Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(a18Var2, b6));
                        a18Var2.a0.addListener(new v85(a18Var2, (byte) 27));
                        a18Var2.a0.setDuration(400L);
                        a18Var2.a0.setInterpolator(ls3.e);
                        a18Var2.a0.start();
                        frameLayout2.addView(a18Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gl.c3(new oq7(a18Var2, (byte) 14));
                        break;
                }
            }
        });
        this.P.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        this.P.addView(this.R, nme.c(-1.0f, -1));
        View view = this.P;
        il0 c = this.F.c(view, null, false);
        c.p(nod.j(this.resourceProvider));
        c.r(gl.L(28.0f));
        c.q(gl.L(5.0f));
        view.setBackground(c);
        ote.b(this.P, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.addView(this.P, nme.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ql0 ql0Var = new ql0(this.H.c(this.Q, null, false));
        ql0Var.b(gl.L(40.0f), true);
        ql0Var.H = kk7.w3;
        this.Q.setBackground(ql0Var);
        t08 E0 = E0();
        u41 u41Var2 = this.R;
        if (u41Var2 != null && E0 != null && E0 != this.S) {
            this.S = E0;
            sk4 sk4Var = E0.e;
            u41Var2.i((CharSequence) sk4Var.b, false, true);
            this.R.g((SpannableStringBuilder) sk4Var.c, false);
        }
        oc6Var.addView(this.Q, nme.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        oc6Var.addView(frameLayout3, nme.e(-1, -2, 55));
        boolean z = this.a;
        if (z) {
            jia jiaVar = new jia(context);
            this.O = jiaVar;
            jiaVar.l(k96.M0(2131752415, null), false);
            this.O.setEllipsizeByGradient(true);
            this.O.setTextSize(20);
            zkb.W(this.O, bkb.z8, getResourceProvider());
            this.O.setTypeface(gl.o());
            this.M.addView(this.O, nme.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            xb4 xb4Var = new xb4(context);
            this.N = xb4Var;
            xb4Var.setTabs(k96.M0(z ? 2131752416 : 2131743507, null), k96.M0(z ? 2131752417 : 2131743508, null));
            this.N.r = new xz7(this, b2);
            J0();
            this.M.addView(this.N, nme.e(-1, 40, 17));
        }
        c08 c08Var2 = this.e;
        if (c08Var2 != null) {
            c08Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                gl.k3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.K;
        int i = bkb.t8;
        zkb.R(imageView2, bkb.f0(getThemedColor(i), 1, -1), null, zkb.M(i), getResourceProvider());
        this.K.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.K;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: yz7
            public final /* synthetic */ a18 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b;
                a18 a18Var = this.b;
                byte b6 = 1;
                switch (b5) {
                    case 0:
                        a18Var.A0();
                        break;
                    case 1:
                        if (a18Var.onBackPressed(true)) {
                            a18Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        a18 a18Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) a18Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a18Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        a18Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        a18Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(a18Var2, a18Var2.getParentActivity(), canvas, (a18Var2.L.getMeasuredWidth() / 2.0f) + f, (a18Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        a18Var2.Y = xg1Var;
                        xg1Var.setOnTouchListener(new jz1((byte) 17));
                        a18Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        a18Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(a18Var2, b6));
                        a18Var2.a0.addListener(new v85(a18Var2, (byte) 27));
                        a18Var2.a0.setDuration(400L);
                        a18Var2.a0.setInterpolator(ls3.e);
                        a18Var2.a0.start();
                        frameLayout22.addView(a18Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gl.c3(new oq7(a18Var2, (byte) 14));
                        break;
                }
            }
        });
        ote.a(this.K);
        this.M.addView(this.K, nme.e(54, 54, 19));
        oy8 oy8Var = new oy8(R.raw.sun_outline, gl.L(28.0f), gl.L(28.0f), true, null);
        this.U = oy8Var;
        oy8Var.h = true;
        if (this.T) {
            oy8Var.H(35);
            this.U.K(36);
        } else {
            oy8Var.K(0);
            this.U.H(0);
        }
        this.U.a0 = true;
        int w0 = bkb.w0(null, bkb.I9, false);
        this.U.L(w0, "Sunny");
        this.U.L(w0, "Path 6");
        this.U.L(w0, "Path");
        this.U.L(w0, "Path 5");
        this.U.j();
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setScaleType(scaleType);
        zkb.R(this.L, bkb.f0(getThemedColor(i), 1, -1), null, zkb.M(i), getResourceProvider());
        this.L.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: yz7
            public final /* synthetic */ a18 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b4;
                a18 a18Var = this.b;
                byte b6 = 1;
                switch (b5) {
                    case 0:
                        a18Var.A0();
                        break;
                    case 1:
                        if (a18Var.onBackPressed(true)) {
                            a18Var.finishFragment();
                            break;
                        }
                        break;
                    default:
                        a18 a18Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) a18Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a18Var2.L.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        a18Var2.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        a18Var2.L.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gl.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xg1 xg1Var = new xg1(a18Var2, a18Var2.getParentActivity(), canvas, (a18Var2.L.getMeasuredWidth() / 2.0f) + f, (a18Var2.L.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2, (byte) 1);
                        a18Var2.Y = xg1Var;
                        xg1Var.setOnTouchListener(new jz1((byte) 17));
                        a18Var2.Z = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        a18Var2.a0 = ofFloat;
                        ofFloat.addUpdateListener(new yg1(a18Var2, b6));
                        a18Var2.a0.addListener(new v85(a18Var2, (byte) 27));
                        a18Var2.a0.setDuration(400L);
                        a18Var2.a0.setInterpolator(ls3.e);
                        a18Var2.a0.start();
                        frameLayout22.addView(a18Var2.Y, new ViewGroup.LayoutParams(-1, -1));
                        gl.c3(new oq7(a18Var2, (byte) 14));
                        break;
                }
            }
        });
        this.M.addView(this.L, nme.e(54, 54, 21));
        this.L.setImageDrawable(this.U);
        c08 c08Var3 = this.e;
        c08Var3.getClass();
        c08Var3.a = bkb.v0(bkb.Z6, c08Var3.b);
        c08Var3.a();
        c08Var3.invalidate();
        B0();
        C0();
        View view2 = this.fragmentView;
        b08 b08Var = new b08(this, b2);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(view2, b08Var);
        return this.d;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == kk7.h5) {
                this.h.f(true);
                this.n.f(true);
            } else if (i == kk7.H3) {
                this.h.d();
                this.n.d();
            } else if (i == kk7.G3) {
                this.h.d();
                this.n.d();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final rs3 getEdgeToEdgeSupportMode() {
        return rs3.c;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 12), bkb.c6, bkb.F6, bkb.y6, bkb.h6, bkb.Z6, bkb.A6, bkb.o7, bkb.e6, bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        c08 c08Var = this.e;
        return c08Var == null ? super.isLightStatusBar() : bm2.h(c08Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.a;
        if (z2 || !((this.h.a() || this.n.a()) && getUserConfig().p())) {
            return super.onBackPressed(z);
        }
        if (z && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = k96.M0(z2 ? 2131752414 : 2131743506, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(z2 ? 2131752413 : 2131743505, null);
            alertDialog$Builder.g(k96.M0(2131751357, null), new b08(this, (byte) 1));
            alertDialog$Builder.j(k96.M0(2131754213, null), new b08(this, (byte) 2));
            showDialog(hdVar);
            zkb.X((TextView) hdVar.c(-2), bkb.p7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        getNotificationCenter().b(this, kk7.h5);
        getNotificationCenter().b(this, kk7.H3);
        getNotificationCenter().b(this, kk7.G3);
        setBulletinDelegate(new oy((byte) 9));
        hq6 mediaDataController = getMediaDataController();
        mediaDataController.getClass();
        byte b = 0;
        SharedPreferences k = oo1.k(new StringBuilder("replyicons_"), mediaDataController.currentAccount, a.b, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = k.getString("replyicons", null);
        long j = k.getLong("replyicons_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    mediaDataController.O1 = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    fa4.g(th, true);
                    tL_emojiList2 = tL_emojiList;
                    if (tL_emojiList2 != null) {
                    }
                    TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
                    if (tL_emojiList2 != null) {
                    }
                    mediaDataController.getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new bn6(mediaDataController, k, b));
                    if (na7.q1(this.currentAccount).E3 == null) {
                    }
                    return super.onFragmentCreate();
                }
            } catch (Throwable th3) {
                tL_emojiList = null;
                th = th3;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 != null || System.currentTimeMillis() - j > 86400000) {
            TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis2 = new TL_account.getDefaultBackgroundEmojis();
            if (tL_emojiList2 != null) {
                getdefaultbackgroundemojis2.hash = tL_emojiList2.hash;
            }
            mediaDataController.getConnectionsManager().sendRequest(getdefaultbackgroundemojis2, new bn6(mediaDataController, k, b));
        } else {
            boolean z = w01.a;
        }
        if (na7.q1(this.currentAccount).E3 == null) {
            boolean z2 = w01.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.h5);
        getNotificationCenter().n(this, kk7.H3);
        getNotificationCenter().n(this, kk7.G3);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            I0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setResourceProvider(wjb wjbVar) {
        this.s = wjbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r5 != (r10 instanceof org.telegram.tgnet.TLRPC.TL_peerColorCollectible ? r10.collectible_id : 0)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        if (r5 != (r10 instanceof org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible ? ((org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible) r10).collectible_id : 0)) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty] */
    /* JADX WARN: Type inference failed for: r5v15, types: [org.telegram.tgnet.TLRPC$EmojiStatus] */
    /* JADX WARN: Type inference failed for: r5v16, types: [org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible] */
    /* JADX WARN: Type inference failed for: r6v34, types: [na7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        TLRPC.PeerColor peerColor;
        if (this.X) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else {
            if (!getUserConfig().p()) {
                return;
            }
            TLRPC.User f = getUserConfig().f();
            if (f.color == null) {
                TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                f.color = tL_peerColor;
                tL_peerColor.flags |= 1;
                tL_peerColor.color = (int) (f.id % 7);
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
            if (this.h.h == l7c.f(f) && this.h.n == l7c.g(f)) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                long j = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                TLRPC.PeerColor peerColor2 = f.color;
            }
            this.V = true;
            TL_account.updateColor updatecolor = new TL_account.updateColor();
            f.flags2 |= 256;
            f.color.flags |= 1;
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.h.s;
            int i = updatecolor.flags | 4;
            if (tL_peerColorCollectible2 != null) {
                updatecolor.flags = i;
                TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                updatecolor.color = tL_inputPeerColorCollectible;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.h.s;
                tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible3.collectible_id;
                f.color = tL_peerColorCollectible3;
            } else {
                updatecolor.flags = i;
                TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                updatecolor.color = tL_peerColor2;
                tL_peerColor2.flags |= 1;
                t08 t08Var = this.h;
                int i2 = t08Var.h;
                tL_peerColor2.color = i2;
                TLRPC.PeerColor peerColor3 = f.color;
                int i3 = peerColor3.flags;
                int i4 = i3 | 1;
                peerColor3.flags = i4;
                peerColor3.color = i2;
                long j2 = t08Var.n;
                if (j2 != 0) {
                    updatecolor.flags |= 1;
                    peerColor3.flags = i3 | 3;
                    tL_peerColor2.flags |= 2;
                    peerColor3.background_emoji_id = j2;
                    tL_peerColor2.background_emoji_id = j2;
                } else {
                    peerColor3.flags = i4 & (-3);
                    peerColor3.background_emoji_id = 0L;
                }
            }
            getConnectionsManager().sendRequest(updatecolor, null);
            if (this.n.h == l7c.n(f) && this.n.n == l7c.m(f)) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.n.r;
                long j3 = tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id;
                TLRPC.EmojiStatus emojiStatus = f.emoji_status;
            }
            this.W = true;
            if (f.profile_color == null) {
                f.profile_color = new TLRPC.TL_peerColor();
            }
            TL_account.updateColor updatecolor2 = new TL_account.updateColor();
            updatecolor2.for_profile = true;
            f.flags2 |= 512;
            t08 t08Var2 = this.n;
            if (t08Var2.h < 0) {
                peerColor = f.profile_color;
                peerColor.flags &= -2;
            } else {
                TLRPC.PeerColor peerColor4 = updatecolor2.color;
                if (peerColor4 == null) {
                    updatecolor2.flags |= 4;
                    peerColor4 = new TLRPC.TL_peerColor();
                    updatecolor2.color = peerColor4;
                }
                peerColor4.flags |= 1;
                t08 t08Var3 = this.n;
                int i5 = t08Var3.h;
                peerColor4.color = i5;
                TLRPC.PeerColor peerColor5 = f.profile_color;
                peerColor5.flags |= 1;
                peerColor5.color = i5;
                peerColor = peerColor5;
                t08Var2 = t08Var3;
            }
            if (t08Var2.n != 0) {
                int i6 = updatecolor2.flags;
                updatecolor2.flags = i6 | 1;
                peerColor.flags |= 2;
                TLRPC.PeerColor peerColor6 = updatecolor2.color;
                if (peerColor6 == null) {
                    updatecolor2.flags = i6 | 5;
                    peerColor6 = new TLRPC.TL_peerColor();
                    updatecolor2.color = peerColor6;
                }
                peerColor6.flags |= 2;
                TLRPC.PeerColor peerColor7 = f.profile_color;
                long j4 = this.n.n;
                peerColor7.background_emoji_id = j4;
                peerColor6.background_emoji_id = j4;
            } else {
                peerColor.flags &= -3;
                peerColor.background_emoji_id = 0L;
            }
            getConnectionsManager().sendRequest(updatecolor2, null);
            if (!D0(f.emoji_status, this.n.r) && (this.n.r != null || cf3.A(f.emoji_status))) {
                ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                if (tL_emojiStatusCollectible2 != null) {
                    long j5 = tL_emojiStatusCollectible2.collectible_id;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= this.n.m0.size()) {
                            break;
                        }
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.m0.get(i7);
                        if (tL_starGiftUnique2.id == j5) {
                            tL_starGiftUnique = tL_starGiftUnique2;
                            break;
                        }
                        i7++;
                    }
                }
                if (tL_starGiftUnique != null) {
                    tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                    tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                }
                getMessagesController().m5(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
            }
            getMessagesController().a4(f, false, false);
            getUserConfig().u(true);
            finishFragment();
            H0();
        }
        this.X = true;
        kk7 notificationCenter = getNotificationCenter();
        int i8 = na7.q5;
        notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_19));
    }
}
