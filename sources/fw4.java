// default package

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fw4 extends my0 {
    public boolean A1;
    public final dw4 B1;
    public final TL_stars.TL_starGiftUnique C1;
    public final long D1;
    public ew4 E1;
    public boolean F1;
    public final zsa l1;
    public final psc m1;
    public final oz4 n1;
    public final km0 o1;
    public final va2 p1;
    public final g0d q1;
    public final bw4 r1;
    public final FrameLayout s1;
    public final jh2 t1;
    public final TextView u1;
    public final io v1;
    public final ImageView w1;
    public final Drawable x1;
    public final int y1;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw4(Context context, ylb ylbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super((ylb) null, context, true, true);
        yv1 yv1Var;
        final byte b = 1;
        this.m1 = new psc();
        final byte b2 = 0;
        g0d g0dVar = new g0d(new yv4(this, b2));
        this.q1 = g0dVar;
        gm.S(getWindow());
        this.C1 = tL_starGiftUnique;
        this.D1 = j;
        this.y1 = oc7.r1(this.a).l4.E1.f();
        oz4 oz4Var = new oz4();
        this.n1 = oz4Var;
        km0 km0Var = new km0(oz4Var, oz4Var, oz4Var);
        this.o1 = km0Var;
        aw4 aw4Var = new aw4(this, context);
        this.b = aw4Var;
        int i = this.u0;
        aw4Var.setPadding(i, 0, i, 0);
        zgc zgcVar = new zgc(this.b);
        ViewGroup viewGroup = this.b;
        km0Var.h = zgcVar;
        km0Var.i = viewGroup;
        uyc uycVar = new uyc(this.c);
        ViewGroup viewGroup2 = this.b;
        g0dVar.E = uycVar;
        g0dVar.F = viewGroup2;
        uycVar.d.add(g0dVar);
        Drawable d = cl8.d(null, this.a, j, cmb.I.o());
        this.x1 = d;
        aw4Var.U(d);
        zsa zsaVar = new zsa(this.a, ylbVar, context);
        this.l1 = zsaVar;
        zsaVar.a(tL_starGiftUnique, z8c.h(this.a).e(), null, jb6.M0(2131749677, null), false);
        zsaVar.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        zsaVar.setLayoutBackground(new slb(zsaVar, this.b, gm.L(18.0f), E0("paintChatActionBackground")));
        aw4Var.addView(zsaVar, qoe.e(-2, -2, 48));
        va2 va2Var = new va2(context);
        this.p1 = va2Var;
        va2Var.setClipChildren(false);
        va2Var.setWindowInsetsProvider(g0dVar);
        va2Var.setInputIslandBubbleDrawable(km0Var.c(va2Var, qqd.b(ylbVar), false));
        va2Var.setUnderKeyboardBackgroundDrawable(km0Var.c(va2Var, qqd.b(ylbVar), false));
        FrameLayout inputIslandBubbleContainer = va2Var.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = va2Var.getInAppKeyboardBubbleContainer();
        bw4 bw4Var = new bw4(this, gm.u0(), aw4Var);
        this.r1 = bw4Var;
        bw4Var.setInAppInsetsController(g0dVar);
        bw4Var.setOverrideHint(jb6.M0(2131749682, null));
        bw4Var.X5 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        bw4Var.W5 = false;
        bw4Var.Y2 = !gm.E && ((yv1Var = bw4Var.F3) == null || !yv1Var.isInBubbleMode());
        bw4Var.z1(false, false, false);
        bw4Var.K1(true, false);
        bw4Var.p2.setPadding(0, gm.L(1.0f), gm.L(20.0f), 0);
        bw4Var.getSendButton().setAlpha(0.0f);
        bw4Var.getEditField().setMaxLines(3);
        bw4Var.setCustomWindowView(this.c);
        bw4Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(bw4Var, qoe.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(va2Var.getFadeView(), qoe.c(-1.0f, -1));
        this.b.addView(va2Var, qoe.c(-1.0f, -1));
        bw4Var.setDelegate(new cw4(this, tL_starGiftUnique));
        sy1 sy1Var = bw4Var.F0;
        xw1 xw1Var = new xw1();
        InputFilter[] filters = sy1Var.getFilters();
        if (filters == null) {
            sy1Var.setFilters(new InputFilter[]{xw1Var});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = xw1Var;
            sy1Var.setFilters(inputFilterArr);
        }
        io ioVar = new io(context, false, false, false);
        this.v1 = ioVar;
        ioVar.setAllowCancel(true);
        ioVar.setScaleProperty(0.6f);
        ioVar.setVisibility(8);
        ioVar.setTextSize(gm.L(15.0f));
        anb.U(ioVar, cmb.x6, ylbVar);
        ioVar.setTypeface(gm.o());
        ioVar.setGravity(17);
        this.b.addView(ioVar, qoe.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        dw4 dw4Var = new dw4(R.drawable.send_plane_24, ylbVar, context, false);
        this.B1 = dw4Var;
        int L = gm.L(38.0f);
        int L2 = gm.L(38.0f);
        dw4Var.L = L;
        dw4Var.M = L2;
        float L3 = gm.L(6.0f);
        float L4 = gm.L(8.0f);
        dw4Var.P = L3;
        dw4Var.Q = L4;
        dw4Var.s0 = true;
        this.b.addView(dw4Var, qoe.e(nm7.u1, 50, 85));
        dw4Var.setScrimViewBackgroundColor(cmb.v0(cmb.c6, this.J0));
        dw4Var.setOnClickListener(new View.OnClickListener(this) { // from class: zv4
            public final /* synthetic */ fw4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                fw4 fw4Var = this.b;
                switch (b3) {
                    case 0:
                        if (fw4Var.y1 - fw4Var.z1 >= 0) {
                            ew4 ew4Var = fw4Var.E1;
                            if (ew4Var != null) {
                                ew4Var.b(fw4Var.r1.getTextWithEntities(), fw4Var.A1);
                                break;
                            }
                        } else {
                            gm.z3(fw4Var.v1);
                            break;
                        }
                        break;
                    case 1:
                        boolean z = fw4Var.A1;
                        fw4Var.A1 = !z;
                        fw4Var.t1.a(z, true);
                        break;
                    default:
                        fw4Var.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.u1 = textView;
        int i2 = cmb.Yc;
        td4.x(textView, i2, ylbVar, 1, 14.0f);
        textView.setText(jb6.M0(2131749678, null));
        textView.setGravity(17);
        textView.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        final byte b3 = 2;
        textView.setBackground(new slb(textView, this.b, gm.L(23.0f) / 2, E0("paintChatActionBackground")));
        this.b.addView(textView, qoe.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s1 = frameLayout;
        TextView textView2 = new TextView(context);
        anb.X(textView2, i2, ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setText(jb6.M0(2131749679, null));
        frameLayout.addView(textView2, qoe.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        jh2 jh2Var = new jh2(18, ylbVar, context);
        this.t1 = jh2Var;
        jh2Var.getCheckBoxBase().j(true);
        jh2Var.getCheckBoxBase().e = 0.9f;
        jh2Var.b(i2, i2, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(!this.A1, false);
        zsaVar.getLayout().V = new yv4(this, b);
        zsaVar.getLayout().U = new yv4(this, b3);
        jh2Var.setDrawBackgroundAsArc(10);
        frameLayout.addView(jh2Var, qoe.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new slb(frameLayout, this.b, gm.L(16.0f), E0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zv4
            public final /* synthetic */ fw4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b;
                fw4 fw4Var = this.b;
                switch (b32) {
                    case 0:
                        if (fw4Var.y1 - fw4Var.z1 >= 0) {
                            ew4 ew4Var = fw4Var.E1;
                            if (ew4Var != null) {
                                ew4Var.b(fw4Var.r1.getTextWithEntities(), fw4Var.A1);
                                break;
                            }
                        } else {
                            gm.z3(fw4Var.v1);
                            break;
                        }
                        break;
                    case 1:
                        boolean z = fw4Var.A1;
                        fw4Var.A1 = !z;
                        fw4Var.t1.a(z, true);
                        break;
                    default:
                        fw4Var.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, qoe.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.w1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        slb slbVar = new slb(imageView, this.b, gm.L(16.0f), E0("paintChatActionBackground"));
        int L5 = gm.L(32.0f);
        int L6 = gm.L(32.0f);
        Matrix matrix = tl0.a;
        imageView.setBackground(new sl0(L5, L6, slbVar));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zv4
            public final /* synthetic */ fw4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                fw4 fw4Var = this.b;
                switch (b32) {
                    case 0:
                        if (fw4Var.y1 - fw4Var.z1 >= 0) {
                            ew4 ew4Var = fw4Var.E1;
                            if (ew4Var != null) {
                                ew4Var.b(fw4Var.r1.getTextWithEntities(), fw4Var.A1);
                                break;
                            }
                        } else {
                            gm.z3(fw4Var.v1);
                            break;
                        }
                        break;
                    case 1:
                        boolean z = fw4Var.A1;
                        fw4Var.A1 = !z;
                        fw4Var.t1.a(z, true);
                        break;
                    default:
                        fw4Var.dismiss();
                        break;
                }
            }
        });
        this.b.addView(imageView, qoe.e(56, 56, 53));
        rve.b(frameLayout, 0.05f, 1.2f);
        rve.a(imageView);
        ViewGroup viewGroup3 = this.b;
        yu3 yu3Var = new yu3(this, (byte) 27);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(viewGroup3, yu3Var);
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final void D0() {
        g0d g0dVar = this.q1;
        int i = g0dVar.f(647).b;
        float L = gm.L(36.0f) + i;
        float inputBubbleHeight = this.p1.getInputBubbleHeight() + g0dVar.d() + gm.L(9.0f);
        int height = this.b.getHeight();
        zsa zsaVar = this.l1;
        FrameLayout frameLayout = this.s1;
        zsaVar.setTranslationY(Math.min(((L - (gm.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - zsaVar.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - gm.L(14.0f)) - frameLayout.getHeight()) - gm.L(10.0f)) - zsaVar.getHeight()));
        zsaVar.invalidate();
        float y = zsaVar.getY() - gm.L(33.0f);
        TextView textView = this.u1;
        textView.setTranslationY(y);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + gm.L(14.0f)));
        frameLayout.invalidate();
        ImageView imageView = this.w1;
        imageView.setTranslationY(i);
        imageView.invalidate();
    }

    public final Paint E0(String str) {
        ylb ylbVar = this.J0;
        Paint d = ylbVar != null ? ylbVar.d("paintChatActionBackground") : null;
        return d != null ? d : cmb.T0("paintChatActionBackground");
    }

    @Override // my0
    public final void H() {
        super.H();
        this.r1.d1();
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        bw4 bw4Var = this.r1;
        if (bw4Var == null || !bw4Var.R0()) {
            super.onBackPressed();
        } else {
            bw4Var.J0(true);
        }
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            dw4 dw4Var = this.B1;
            if (dw4Var != null) {
                dw4Var.setScrimViewBackgroundColor(cmb.v0(cmb.c6, this.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0
    public final void w() {
        r0(false);
        s20 s20Var = new s20(this, (byte) 10);
        dy0 dy0Var = this.c;
        u31.a(dy0Var, s20Var);
        jg5 jg5Var = jg5.s;
        if (jg5Var.c()) {
            jg5Var.b();
            TLObject a2 = oc7.r1(this.a).a2(this.D1);
            StringBuilder sb = new StringBuilder();
            sb.append(this.C1.title);
            sb.append(" #");
            new c41(dy0Var, this.J0).V(Arrays.asList(a2), jb6.M0(2131749681, null), gm.S2(jb6.a0(null, null, 2131749683, pg3.t(a2), kt6.m(r4.num, ',', sb))), null).k(true);
        }
    }
}
