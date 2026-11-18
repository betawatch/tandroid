package bi;

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
import c8.ma;
import c8.ra;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.mp;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g1 extends org.telegram.ui.ActionBar.x2 {
    public int A1;
    public boolean B1;
    public final d1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public f1 F1;
    public boolean G1;
    public final a9 m1;
    public final jh.l n1;
    public final ui.g o1;
    public final dh.c p1;
    public final jh.f q1;
    public final rh.h r1;
    public final b1 s1;
    public final FrameLayout t1;
    public final mp u1;
    public final TextView v1;
    public final org.telegram.ui.Components.n6 w1;
    public final ImageView x1;
    public final Drawable y1;
    public final int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.i6) null, true, true);
        bn bnVar;
        final int i7 = 1;
        this.n1 = new jh.l();
        final int i10 = 0;
        rh.h hVar = new rh.h(new y0(this, i10));
        this.r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.z1 = org.telegram.messenger.mp.u1(this.a).G6;
        ui.g gVar = new ui.g();
        this.o1 = gVar;
        dh.c cVar = new dh.c(gVar, gVar, gVar);
        this.p1 = cVar;
        a1 a1Var = new a1(this, context);
        this.b = a1Var;
        int i11 = this.u0;
        a1Var.setPadding(i11, 0, i11, 0);
        jh.k kVar = new jh.k(this.b);
        ViewGroup viewGroup = this.b;
        cVar.h = kVar;
        cVar.i = viewGroup;
        rh.d dVar = new rh.d(this.c);
        ViewGroup viewGroup2 = this.b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = hi.w5.e(null, this.a, j3, org.telegram.ui.ActionBar.n6.I.q());
        this.y1 = e10;
        a1Var.U(e10);
        a9 a9Var = new a9(this.a, context, i6Var);
        this.m1 = a9Var;
        a9Var.a(tL_starGiftUnique, j10.i(this.a).e(), null, gd.M0(2131749728, null), false);
        a9Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        a9Var.setLayoutBackground(new org.telegram.ui.ActionBar.y5(a9Var, this.b, org.telegram.messenger.g0.L(18.0f), K0("paintChatActionBackground")));
        a1Var.addView(a9Var, ma.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.i0.b(i6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.i0.b(i6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        b1 b1Var = new b1(this, org.telegram.messenger.g0.u0(), a1Var);
        this.s1 = b1Var;
        b1Var.setInAppInsetsController(hVar);
        b1Var.setOverrideHint(gd.M0(2131749733, null));
        b1Var.W5 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        b1Var.V5 = false;
        b1Var.W2 = !org.telegram.messenger.g0.E && ((bnVar = b1Var.D3) == null || !bnVar.isInBubbleMode());
        b1Var.t1(false, false, false);
        b1Var.E1(true, false);
        b1Var.n2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        b1Var.getSendButton().setAlpha(0.0f);
        b1Var.getEditField().setMaxLines(3);
        b1Var.setCustomWindowView(this.c);
        b1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(b1Var, ma.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(fVar.getFadeView(), ma.c(-1.0f, -1));
        this.b.addView(fVar, ma.c(-1.0f, -1));
        b1Var.setDelegate(new c1(this, tL_starGiftUnique));
        gf gfVar = b1Var.F0;
        ld ldVar = new ld();
        InputFilter[] filters = gfVar.getFilters();
        if (filters == null) {
            gfVar.setFilters(new InputFilter[]{ldVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = ldVar;
            gfVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.w1 = n6Var;
        n6Var.setAllowCancel(true);
        n6Var.setScaleProperty(0.6f);
        n6Var.setVisibility(8);
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.y6, i6Var);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setGravity(17);
        this.b.addView(n6Var, ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        d1 d1Var = new d1(R.drawable.send_plane_24, context, i6Var, false);
        this.C1 = d1Var;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        d1Var.L = L;
        d1Var.M = L2;
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = org.telegram.messenger.g0.L(8.0f);
        d1Var.P = L3;
        d1Var.Q = L4;
        d1Var.s0 = true;
        this.b.addView(d1Var, ma.e(ks.v1, 50, 85));
        d1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
        d1Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z0
            public final /* synthetic */ g1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g1 g1Var = this.b;
                        if (g1Var.z1 - g1Var.A1 >= 0) {
                            f1 f1Var = g1Var.F1;
                            if (f1Var != null) {
                                f1Var.b(g1Var.s1.getTextWithEntities(), g1Var.B1);
                                break;
                            }
                        } else {
                            org.telegram.messenger.g0.D3(g1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        g1 g1Var2 = this.b;
                        boolean z10 = g1Var2.B1;
                        g1Var2.B1 = !z10;
                        g1Var2.u1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v1 = textView;
        int i12 = org.telegram.ui.ActionBar.n6.Zc;
        org.telegram.messenger.f3.l(textView, i12, i6Var, 1, 14.0f);
        textView.setText(gd.M0(2131749729, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.y5(textView, this.b, org.telegram.messenger.g0.L(23.0f) / 2, K0("paintChatActionBackground")));
        this.b.addView(textView, ma.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i12, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.M0(2131749730, null));
        frameLayout.addView(textView2, ma.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        mp mpVar = new mp(18, context, i6Var);
        this.u1 = mpVar;
        mpVar.getCheckBoxBase().j(true);
        mpVar.getCheckBoxBase().e = 0.9f;
        mpVar.b(i12, i12, org.telegram.ui.ActionBar.n6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(!this.B1, false);
        a9Var.getLayout().V = new y0(this, i7);
        a9Var.getLayout().U = new y0(this, i13);
        mpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(mpVar, ma.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.y5(frameLayout, this.b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z0
            public final /* synthetic */ g1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        g1 g1Var = this.b;
                        if (g1Var.z1 - g1Var.A1 >= 0) {
                            f1 f1Var = g1Var.F1;
                            if (f1Var != null) {
                                f1Var.b(g1Var.s1.getTextWithEntities(), g1Var.B1);
                                break;
                            }
                        } else {
                            org.telegram.messenger.g0.D3(g1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        g1 g1Var2 = this.b;
                        boolean z10 = g1Var2.B1;
                        g1Var2.B1 = !z10;
                        g1Var2.u1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, ma.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5(imageView, this.b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.g0.L(32.0f);
        int L6 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.a;
        imageView.setBackground(new ih.c(L5, L6, y5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z0
            public final /* synthetic */ g1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g1 g1Var = this.b;
                        if (g1Var.z1 - g1Var.A1 >= 0) {
                            f1 f1Var = g1Var.F1;
                            if (f1Var != null) {
                                f1Var.b(g1Var.s1.getTextWithEntities(), g1Var.B1);
                                break;
                            }
                        } else {
                            org.telegram.messenger.g0.D3(g1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        g1 g1Var2 = this.b;
                        boolean z10 = g1Var2.B1;
                        g1Var2.B1 = !z10;
                        g1Var2.u1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(imageView, ma.e(56, 56, 53));
        ra.b(frameLayout, 0.05f, 1.2f);
        ra.a(imageView);
        ViewGroup viewGroup3 = this.b;
        a1.c cVar2 = new a1.c(this, 13);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    public final void J0() {
        rh.h hVar = this.r1;
        int i7 = hVar.f(647).b;
        float L = org.telegram.messenger.g0.L(36.0f) + i7;
        float inputBubbleHeight = this.q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.b.getHeight();
        a9 a9Var = this.m1;
        FrameLayout frameLayout = this.t1;
        a9Var.setTranslationY(Math.min(((L - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - a9Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - a9Var.getHeight()));
        a9Var.invalidate();
        float y10 = a9Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.v1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.x1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint K0(String str) {
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        Paint g10 = i6Var != null ? i6Var.g("paintChatActionBackground") : null;
        return g10 != null ? g10 : org.telegram.ui.ActionBar.n6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        this.s1.Y0();
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        b1 b1Var = this.s1;
        if (b1Var == null || !b1Var.O0()) {
            super.onBackPressed();
        } else {
            b1Var.G0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        super.s0();
        try {
            d1 d1Var = this.C1;
            if (d1Var != null) {
                d1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void v() {
        u0(false);
        e1 e1Var = new e1(this, 0);
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        gc.a(n2Var, e1Var);
        k30 k30Var = k30.s;
        if (k30Var.c()) {
            k30Var.b();
            TLObject g22 = org.telegram.messenger.mp.u1(this.a).g2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.D1.title);
            sb2.append(" #");
            new lc(n2Var, this.J0).V(Arrays.asList(g22), gd.M0(2131749732, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749734, org.telegram.messenger.n5.u(g22), i5.c.l(r4.num, ',', sb2))), null).k(true);
        }
    }
}
