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
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.op;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k1 extends org.telegram.ui.ActionBar.w2 {
    public int A1;
    public boolean B1;
    public final h1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public j1 F1;
    public boolean G1;
    public final d9 m1;
    public final jh.l n1;
    public final ui.g o1;
    public final dh.c p1;
    public final jh.f q1;
    public final rh.h r1;
    public final f1 s1;
    public final FrameLayout t1;
    public final op u1;
    public final TextView v1;
    public final org.telegram.ui.Components.o6 w1;
    public final ImageView x1;
    public final Drawable y1;
    public final int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.h6) null, true, true);
        bn bnVar;
        final int i7 = 1;
        this.n1 = new jh.l();
        final int i10 = 0;
        rh.h hVar = new rh.h(new c1(this, i10));
        this.r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.z1 = np.u1(this.a).G6;
        ui.g gVar = new ui.g();
        this.o1 = gVar;
        dh.c cVar = new dh.c(gVar, gVar, gVar);
        this.p1 = cVar;
        e1 e1Var = new e1(this, context);
        this.b = e1Var;
        int i11 = this.u0;
        e1Var.setPadding(i11, 0, i11, 0);
        jh.k kVar = new jh.k(this.b);
        ViewGroup viewGroup = this.b;
        cVar.h = kVar;
        cVar.i = viewGroup;
        rh.d dVar = new rh.d(this.c);
        ViewGroup viewGroup2 = this.b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = hi.v5.e(null, this.a, j3, org.telegram.ui.ActionBar.m6.I.q());
        this.y1 = e10;
        e1Var.U(e10);
        d9 d9Var = new d9(this.a, context, h6Var);
        this.m1 = d9Var;
        d9Var.a(tL_starGiftUnique, k10.i(this.a).e(), null, hd.N0(2131749727, null), false);
        d9Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        d9Var.setLayoutBackground(new org.telegram.ui.ActionBar.x5(d9Var, this.b, org.telegram.messenger.g0.L(18.0f), K0("paintChatActionBackground")));
        e1Var.addView(d9Var, ma.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.i0.b(h6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.i0.b(h6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        f1 f1Var = new f1(this, org.telegram.messenger.g0.u0(), e1Var);
        this.s1 = f1Var;
        f1Var.setInAppInsetsController(hVar);
        f1Var.setOverrideHint(hd.N0(2131749732, null));
        f1Var.Y5 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        f1Var.X5 = false;
        f1Var.Y2 = !org.telegram.messenger.g0.E && ((bnVar = f1Var.F3) == null || !bnVar.isInBubbleMode());
        f1Var.x1(false, false, false);
        f1Var.I1(true, false);
        f1Var.p2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        f1Var.getSendButton().setAlpha(0.0f);
        f1Var.getEditField().setMaxLines(3);
        f1Var.setCustomWindowView(this.c);
        f1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(f1Var, ma.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(fVar.getFadeView(), ma.c(-1.0f, -1));
        this.b.addView(fVar, ma.c(-1.0f, -1));
        f1Var.setDelegate(new g1(this, tL_starGiftUnique));
        gf gfVar = f1Var.F0;
        ld ldVar = new ld();
        InputFilter[] filters = gfVar.getFilters();
        if (filters == null) {
            gfVar.setFilters(new InputFilter[]{ldVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = ldVar;
            gfVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.w1 = o6Var;
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        o6Var.setVisibility(8);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.y6, h6Var);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setGravity(17);
        this.b.addView(o6Var, ma.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        h1 h1Var = new h1(R.drawable.send_plane_24, context, h6Var, false);
        this.C1 = h1Var;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        h1Var.L = L;
        h1Var.M = L2;
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = org.telegram.messenger.g0.L(8.0f);
        h1Var.P = L3;
        h1Var.Q = L4;
        h1Var.s0 = true;
        this.b.addView(h1Var, ma.e(ls.v1, 50, 85));
        h1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
        h1Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d1
            public final /* synthetic */ k1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k1 k1Var = this.b;
                        if (k1Var.z1 - k1Var.A1 >= 0) {
                            j1 j1Var = k1Var.F1;
                            if (j1Var != null) {
                                j1Var.b(k1Var.s1.getTextWithEntities(), k1Var.B1);
                                break;
                            }
                        } else {
                            org.telegram.messenger.g0.D3(k1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        k1 k1Var2 = this.b;
                        boolean z10 = k1Var2.B1;
                        k1Var2.B1 = !z10;
                        k1Var2.u1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v1 = textView;
        int i12 = org.telegram.ui.ActionBar.m6.Zc;
        org.telegram.messenger.f3.l(textView, i12, h6Var, 1, 14.0f);
        textView.setText(hd.N0(2131749728, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.x5(textView, this.b, org.telegram.messenger.g0.L(23.0f) / 2, K0("paintChatActionBackground")));
        this.b.addView(textView, ma.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i12, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.N0(2131749729, null));
        frameLayout.addView(textView2, ma.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        op opVar = new op(18, context, h6Var);
        this.u1 = opVar;
        opVar.getCheckBoxBase().j(true);
        opVar.getCheckBoxBase().e = 0.9f;
        opVar.b(i12, i12, org.telegram.ui.ActionBar.m6.k7);
        opVar.setDrawUnchecked(true);
        opVar.a(!this.B1, false);
        d9Var.getLayout().V = new c1(this, i7);
        d9Var.getLayout().U = new c1(this, i13);
        opVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(opVar, ma.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.x5(frameLayout, this.b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d1
            public final /* synthetic */ k1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        k1 k1Var = this.b;
                        if (k1Var.z1 - k1Var.A1 >= 0) {
                            j1 j1Var = k1Var.F1;
                            if (j1Var != null) {
                                j1Var.b(k1Var.s1.getTextWithEntities(), k1Var.B1);
                                break;
                            }
                        } else {
                            org.telegram.messenger.g0.D3(k1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        k1 k1Var2 = this.b;
                        boolean z10 = k1Var2.B1;
                        k1Var2.B1 = !z10;
                        k1Var2.u1.a(z10, true);
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
        org.telegram.ui.ActionBar.x5 x5Var = new org.telegram.ui.ActionBar.x5(imageView, this.b, org.telegram.messenger.g0.L(16.0f), K0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.g0.L(32.0f);
        int L6 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.a;
        imageView.setBackground(new ih.c(L5, L6, x5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d1
            public final /* synthetic */ k1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        k1 k1Var = this.b;
                        if (k1Var.z1 - k1Var.A1 >= 0) {
                            j1 j1Var = k1Var.F1;
                            if (j1Var != null) {
                                j1Var.b(k1Var.s1.getTextWithEntities(), k1Var.B1);
                                break;
                            }
                        } else {
                            org.telegram.messenger.g0.D3(k1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        k1 k1Var2 = this.b;
                        boolean z10 = k1Var2.B1;
                        k1Var2.B1 = !z10;
                        k1Var2.u1.a(z10, true);
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
        a1.c cVar2 = new a1.c(this, 14);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void J0() {
        rh.h hVar = this.r1;
        int i7 = hVar.f(647).b;
        float L = org.telegram.messenger.g0.L(36.0f) + i7;
        float inputBubbleHeight = this.q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.b.getHeight();
        d9 d9Var = this.m1;
        FrameLayout frameLayout = this.t1;
        d9Var.setTranslationY(Math.min(((L - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - d9Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - d9Var.getHeight()));
        d9Var.invalidate();
        float y10 = d9Var.getY() - org.telegram.messenger.g0.L(33.0f);
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
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        Paint g10 = h6Var != null ? h6Var.g("paintChatActionBackground") : null;
        return g10 != null ? g10 : org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        this.s1.c1();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        f1 f1Var = this.s1;
        if (f1Var == null || !f1Var.S0()) {
            super.onBackPressed();
        } else {
            f1Var.K0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            h1 h1Var = this.C1;
            if (h1Var != null) {
                h1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        u0(false);
        i1 i1Var = new i1(this, 0);
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        gc.a(m2Var, i1Var);
        n30 n30Var = n30.s;
        if (n30Var.c()) {
            n30Var.b();
            TLObject g22 = np.u1(this.a).g2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.D1.title);
            sb2.append(" #");
            new lc(m2Var, this.J0).V(Arrays.asList(g22), hd.N0(2131749731, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749733, org.telegram.messenger.n5.u(g22), i5.c.l(r4.num, ',', sb2))), null).k(true);
        }
    }
}
