package ai;

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
import b8.cd;
import b8.mf;
import b8.pf;
import ci.e9;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.wo;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i1 extends org.telegram.ui.ActionBar.t2 {
    public final TL_stars.TL_starGiftUnique A1;
    public final long B1;
    public ci.x3 C1;
    public boolean D1;
    public final e7 j1;
    public final kh.l k1;
    public final si.g l1;
    public final eh.c m1;
    public final kh.f n1;
    public final sh.h o1;
    public final d1 p1;
    public final FrameLayout q1;
    public final wo r1;
    public final TextView s1;
    public final org.telegram.ui.Components.h6 t1;
    public final ImageView u1;
    public final Drawable v1;
    public final int w1;
    public int x1;
    public boolean y1;
    public final g1 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (org.telegram.ui.ActionBar.e6) null, true, true);
        wm wmVar;
        final int i3 = 1;
        this.k1 = new kh.l();
        final int i10 = 0;
        sh.h hVar = new sh.h(new a1(this, i10));
        this.o1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.A1 = tL_starGiftUnique;
        this.B1 = j10;
        this.w1 = hp.s1(this.a).D6;
        si.g gVar = new si.g();
        this.l1 = gVar;
        eh.c cVar = new eh.c(gVar, gVar, gVar);
        this.m1 = cVar;
        c1 c1Var = new c1(this, context);
        this.b = c1Var;
        int i11 = this.u0;
        c1Var.setPadding(i11, 0, i11, 0);
        kh.k kVar = new kh.k(this.b);
        ViewGroup viewGroup = this.b;
        cVar.h = kVar;
        cVar.i = viewGroup;
        sh.d dVar = new sh.d(this.c);
        ViewGroup viewGroup2 = this.b;
        hVar.E = dVar;
        hVar.F = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = gi.y5.e(null, this.a, j10, org.telegram.ui.ActionBar.k6.I.q());
        this.v1 = e10;
        c1Var.U(e10);
        e7 e7Var = new e7(this.a, context, e6Var);
        this.j1 = e7Var;
        e7Var.a(tL_starGiftUnique, h10.i(this.a).e(), null, bd.M0(2131749753, null), false);
        e7Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        e7Var.setLayoutBackground(new org.telegram.ui.ActionBar.v5(e7Var, this.b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        c1Var.addView(e7Var, mf.e(-2, -2, 48));
        kh.f fVar = new kh.f(context);
        this.n1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, cd.b(e6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, cd.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        d1 d1Var = new d1(this, org.telegram.messenger.g0.u0(), c1Var);
        this.p1 = d1Var;
        d1Var.setInAppInsetsController(hVar);
        d1Var.setOverrideHint(bd.M0(2131749758, null));
        d1Var.z4 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        d1Var.y4 = false;
        d1Var.j2 = !org.telegram.messenger.g0.E && ((wmVar = d1Var.Q2) == null || !wmVar.isInBubbleMode());
        d1Var.U0(false, false, false);
        d1Var.f1(true, false);
        d1Var.A1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        d1Var.getSendButton().setAlpha(0.0f);
        d1Var.getEditField().setMaxLines(3);
        d1Var.setCustomWindowView(this.c);
        d1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(d1Var, mf.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(fVar.getFadeView(), mf.c(-1.0f, -1));
        this.b.addView(fVar, mf.c(-1.0f, -1));
        d1Var.setDelegate(new f1(this, tL_starGiftUnique));
        ve veVar = d1Var.F0;
        org.telegram.ui.Components.cd cdVar = new org.telegram.ui.Components.cd();
        InputFilter[] filters = veVar.getFilters();
        if (filters == null) {
            veVar.setFilters(new InputFilter[]{cdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = cdVar;
            veVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.t1 = h6Var;
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        h6Var.setVisibility(8);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.y6, e6Var);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(17);
        this.b.addView(h6Var, mf.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        g1 g1Var = new g1(R.drawable.send_plane_24, context, e6Var, false);
        this.z1 = g1Var;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        g1Var.J = L;
        g1Var.K = L2;
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = org.telegram.messenger.g0.L(8.0f);
        g1Var.N = L3;
        g1Var.O = L4;
        g1Var.i0 = true;
        this.b.addView(g1Var, mf.e(hs.v1, 50, 85));
        g1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: ai.b1
            public final /* synthetic */ i1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i1 i1Var = this.b;
                        if (i1Var.w1 - i1Var.x1 >= 0) {
                            ci.x3 x3Var = i1Var.C1;
                            if (x3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i1Var.p1.getTextWithEntities();
                                boolean z10 = i1Var.y1;
                                ci.l6 l6Var = (ci.l6) x3Var.c;
                                i1 i1Var2 = (i1) x3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) x3Var.e;
                                long j11 = x3Var.b;
                                dg.b bVar = (dg.b) x3Var.f;
                                if (!i1Var2.D1) {
                                    l6Var.d2.setLoading(true);
                                    if (!i1Var2.D1) {
                                        i1Var2.D1 = true;
                                        i1Var2.z1.f(true);
                                    }
                                    e9.x(l6Var.a, bVar).H(tL_starGiftUnique2, j11, textWithEntities, z10, new ci.z1(l6Var, i1Var2, bVar, tL_starGiftUnique2, j11, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(i1Var.t1);
                            break;
                        }
                        break;
                    case 1:
                        i1 i1Var3 = this.b;
                        boolean z11 = i1Var3.y1;
                        i1Var3.y1 = !z11;
                        i1Var3.r1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.s1 = textView;
        int i12 = org.telegram.ui.ActionBar.k6.Wc;
        org.telegram.messenger.k5.n(textView, i12, e6Var, 1, 14.0f);
        textView.setText(bd.M0(2131749754, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.v5(textView, this.b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.b.addView(textView, mf.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, i12, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(bd.M0(2131749755, null));
        frameLayout.addView(textView2, mf.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wo woVar = new wo(18, context, e6Var);
        this.r1 = woVar;
        woVar.getCheckBoxBase().j(true);
        woVar.getCheckBoxBase().e = 0.9f;
        woVar.b(i12, i12, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(!this.y1, false);
        e7Var.getLayout().V = new a1(this, i3);
        e7Var.getLayout().U = new a1(this, i13);
        woVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(woVar, mf.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.v5(frameLayout, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ai.b1
            public final /* synthetic */ i1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        i1 i1Var = this.b;
                        if (i1Var.w1 - i1Var.x1 >= 0) {
                            ci.x3 x3Var = i1Var.C1;
                            if (x3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i1Var.p1.getTextWithEntities();
                                boolean z10 = i1Var.y1;
                                ci.l6 l6Var = (ci.l6) x3Var.c;
                                i1 i1Var2 = (i1) x3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) x3Var.e;
                                long j11 = x3Var.b;
                                dg.b bVar = (dg.b) x3Var.f;
                                if (!i1Var2.D1) {
                                    l6Var.d2.setLoading(true);
                                    if (!i1Var2.D1) {
                                        i1Var2.D1 = true;
                                        i1Var2.z1.f(true);
                                    }
                                    e9.x(l6Var.a, bVar).H(tL_starGiftUnique2, j11, textWithEntities, z10, new ci.z1(l6Var, i1Var2, bVar, tL_starGiftUnique2, j11, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(i1Var.t1);
                            break;
                        }
                        break;
                    case 1:
                        i1 i1Var3 = this.b;
                        boolean z11 = i1Var3.y1;
                        i1Var3.y1 = !z11;
                        i1Var3.r1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, mf.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.u1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(imageView, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.g0.L(32.0f);
        int L6 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = jh.d.a;
        imageView.setBackground(new jh.c(L5, L6, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ai.b1
            public final /* synthetic */ i1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        i1 i1Var = this.b;
                        if (i1Var.w1 - i1Var.x1 >= 0) {
                            ci.x3 x3Var = i1Var.C1;
                            if (x3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = i1Var.p1.getTextWithEntities();
                                boolean z10 = i1Var.y1;
                                ci.l6 l6Var = (ci.l6) x3Var.c;
                                i1 i1Var2 = (i1) x3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) x3Var.e;
                                long j11 = x3Var.b;
                                dg.b bVar = (dg.b) x3Var.f;
                                if (!i1Var2.D1) {
                                    l6Var.d2.setLoading(true);
                                    if (!i1Var2.D1) {
                                        i1Var2.D1 = true;
                                        i1Var2.z1.f(true);
                                    }
                                    e9.x(l6Var.a, bVar).H(tL_starGiftUnique2, j11, textWithEntities, z10, new ci.z1(l6Var, i1Var2, bVar, tL_starGiftUnique2, j11, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(i1Var.t1);
                            break;
                        }
                        break;
                    case 1:
                        i1 i1Var3 = this.b;
                        boolean z11 = i1Var3.y1;
                        i1Var3.y1 = !z11;
                        i1Var3.r1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(imageView, mf.e(56, 56, 53));
        pf.b(frameLayout, 0.05f, 1.2f);
        pf.a(imageView);
        ViewGroup viewGroup3 = this.b;
        a1.c cVar2 = new a1.c(this, 4);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void I0() {
        sh.h hVar = this.o1;
        int i3 = hVar.f(647).b;
        float L = org.telegram.messenger.g0.L(36.0f) + i3;
        float inputBubbleHeight = this.n1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.b.getHeight();
        e7 e7Var = this.j1;
        FrameLayout frameLayout = this.q1;
        e7Var.setTranslationY(Math.min(((L - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - e7Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - e7Var.getHeight()));
        e7Var.invalidate();
        float y9 = e7Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.s1;
        textView.setTranslationY(y9);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i3;
        ImageView imageView = this.u1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        Paint d = e6Var != null ? e6Var.d("paintChatActionBackground") : null;
        return d != null ? d : org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        this.p1.A0();
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        d1 d1Var = this.p1;
        if (d1Var == null || !d1Var.r0()) {
            super.onBackPressed();
        } else {
            d1Var.j0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            g1 g1Var = this.z1;
            if (g1Var != null) {
                g1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        u0(false);
        h1 h1Var = new h1(this, 0);
        org.telegram.ui.ActionBar.j2 j2Var = this.c;
        ac.a(j2Var, h1Var);
        v20 v20Var = v20.s;
        if (v20Var.c()) {
            v20Var.b();
            TLObject e22 = hp.s1(this.a).e2(this.B1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.A1.title);
            sb2.append(" #");
            new fc(j2Var, this.J0).V(Arrays.asList(e22), bd.M0(2131749757, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749759, org.telegram.messenger.m5.u(e22), k2.p1.l(r4.num, ',', sb2))), null).k(true);
        }
    }
}
