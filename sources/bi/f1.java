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
import c8.ja;
import c8.na;
import di.u8;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xe;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f1 extends org.telegram.ui.ActionBar.u2 {
    public int A1;
    public boolean B1;
    public final d1 C1;
    public final TL_stars.TL_starGiftUnique D1;
    public final long E1;
    public di.o3 F1;
    public boolean G1;
    public final v6 m1;
    public final jh.l n1;
    public final ui.g o1;
    public final dh.c p1;
    public final jh.f q1;
    public final rh.h r1;
    public final b1 s1;
    public final FrameLayout t1;
    public final fp u1;
    public final TextView v1;
    public final org.telegram.ui.Components.h6 w1;
    public final ImageView x1;
    public final Drawable y1;
    public final int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (org.telegram.ui.ActionBar.e6) null, true, true);
        an anVar;
        final int i7 = 1;
        this.n1 = new jh.l();
        final int i10 = 0;
        rh.h hVar = new rh.h(new y0(this, i10));
        this.r1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.D1 = tL_starGiftUnique;
        this.E1 = j3;
        this.z1 = np.s1(this.a).E6;
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
        Drawable e10 = hi.x5.e(null, this.a, j3, org.telegram.ui.ActionBar.j6.I.q());
        this.y1 = e10;
        a1Var.U(e10);
        v6 v6Var = new v6(this.a, context, e6Var);
        this.m1 = v6Var;
        v6Var.a(tL_starGiftUnique, m10.i(this.a).e(), null, hd.M0(2131749745, null), false);
        v6Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        v6Var.setLayoutBackground(new org.telegram.ui.ActionBar.v5(v6Var, this.b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        a1Var.addView(v6Var, ja.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.q1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.g0.b(e6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.g0.b(e6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        b1 b1Var = new b1(this, org.telegram.messenger.g0.u0(), a1Var);
        this.s1 = b1Var;
        b1Var.setInAppInsetsController(hVar);
        b1Var.setOverrideHint(hd.M0(2131749750, null));
        b1Var.Q5 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        b1Var.P5 = false;
        b1Var.Q2 = !org.telegram.messenger.g0.E && ((anVar = b1Var.x3) == null || !anVar.isInBubbleMode());
        b1Var.l1(false, false, false);
        b1Var.w1(true, false);
        b1Var.h2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        b1Var.getSendButton().setAlpha(0.0f);
        b1Var.getEditField().setMaxLines(3);
        b1Var.setCustomWindowView(this.c);
        b1Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(b1Var, ja.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(fVar.getFadeView(), ja.c(-1.0f, -1));
        this.b.addView(fVar, ja.c(-1.0f, -1));
        b1Var.setDelegate(new c1(this, tL_starGiftUnique));
        xe xeVar = b1Var.F0;
        cd cdVar = new cd();
        InputFilter[] filters = xeVar.getFilters();
        if (filters == null) {
            xeVar.setFilters(new InputFilter[]{cdVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = cdVar;
            xeVar.setFilters(inputFilterArr);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.w1 = h6Var;
        h6Var.setAllowCancel(true);
        h6Var.setScaleProperty(0.6f);
        h6Var.setVisibility(8);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.y6, e6Var);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(17);
        this.b.addView(h6Var, ja.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        d1 d1Var = new d1(R.drawable.send_plane_24, context, e6Var, false);
        this.C1 = d1Var;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        d1Var.L = L;
        d1Var.M = L2;
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = org.telegram.messenger.g0.L(8.0f);
        d1Var.P = L3;
        d1Var.Q = L4;
        d1Var.q0 = true;
        this.b.addView(d1Var, ja.e(ns.v1, 50, 85));
        d1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
        d1Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z0
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f1 f1Var = this.b;
                        if (f1Var.z1 - f1Var.A1 >= 0) {
                            di.o3 o3Var = f1Var.F1;
                            if (o3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = f1Var.s1.getTextWithEntities();
                                boolean z10 = f1Var.B1;
                                di.c6 c6Var = (di.c6) o3Var.c;
                                f1 f1Var2 = (f1) o3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) o3Var.e;
                                long j10 = o3Var.b;
                                cg.b bVar = (cg.b) o3Var.f;
                                if (!f1Var2.G1) {
                                    c6Var.g2.setLoading(true);
                                    if (!f1Var2.G1) {
                                        f1Var2.G1 = true;
                                        f1Var2.C1.g(true);
                                    }
                                    u8.x(c6Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new di.t1(c6Var, f1Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.E3(f1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        f1 f1Var3 = this.b;
                        boolean z11 = f1Var3.B1;
                        f1Var3.B1 = !z11;
                        f1Var3.u1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.v1 = textView;
        int i12 = org.telegram.ui.ActionBar.j6.Zc;
        org.telegram.messenger.k5.m(textView, i12, e6Var, 1, 14.0f);
        textView.setText(hd.M0(2131749746, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.v5(textView, this.b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.b.addView(textView, ja.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t1 = frameLayout;
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, i12, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.M0(2131749747, null));
        frameLayout.addView(textView2, ja.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        fp fpVar = new fp(18, context, e6Var);
        this.u1 = fpVar;
        fpVar.getCheckBoxBase().j(true);
        fpVar.getCheckBoxBase().e = 0.9f;
        fpVar.b(i12, i12, org.telegram.ui.ActionBar.j6.k7);
        fpVar.setDrawUnchecked(true);
        fpVar.a(!this.B1, false);
        v6Var.getLayout().V = new y0(this, i7);
        v6Var.getLayout().U = new y0(this, i13);
        fpVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(fpVar, ja.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.v5(frameLayout, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z0
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        f1 f1Var = this.b;
                        if (f1Var.z1 - f1Var.A1 >= 0) {
                            di.o3 o3Var = f1Var.F1;
                            if (o3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = f1Var.s1.getTextWithEntities();
                                boolean z10 = f1Var.B1;
                                di.c6 c6Var = (di.c6) o3Var.c;
                                f1 f1Var2 = (f1) o3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) o3Var.e;
                                long j10 = o3Var.b;
                                cg.b bVar = (cg.b) o3Var.f;
                                if (!f1Var2.G1) {
                                    c6Var.g2.setLoading(true);
                                    if (!f1Var2.G1) {
                                        f1Var2.G1 = true;
                                        f1Var2.C1.g(true);
                                    }
                                    u8.x(c6Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new di.t1(c6Var, f1Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.E3(f1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        f1 f1Var3 = this.b;
                        boolean z11 = f1Var3.B1;
                        f1Var3.B1 = !z11;
                        f1Var3.u1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, ja.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.x1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.v5 v5Var = new org.telegram.ui.ActionBar.v5(imageView, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.g0.L(32.0f);
        int L6 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.a;
        imageView.setBackground(new ih.c(L5, L6, v5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.z0
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        f1 f1Var = this.b;
                        if (f1Var.z1 - f1Var.A1 >= 0) {
                            di.o3 o3Var = f1Var.F1;
                            if (o3Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = f1Var.s1.getTextWithEntities();
                                boolean z10 = f1Var.B1;
                                di.c6 c6Var = (di.c6) o3Var.c;
                                f1 f1Var2 = (f1) o3Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) o3Var.e;
                                long j10 = o3Var.b;
                                cg.b bVar = (cg.b) o3Var.f;
                                if (!f1Var2.G1) {
                                    c6Var.g2.setLoading(true);
                                    if (!f1Var2.G1) {
                                        f1Var2.G1 = true;
                                        f1Var2.C1.g(true);
                                    }
                                    u8.x(c6Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z10, new di.t1(c6Var, f1Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.E3(f1Var.w1);
                            break;
                        }
                        break;
                    case 1:
                        f1 f1Var3 = this.b;
                        boolean z11 = f1Var3.B1;
                        f1Var3.B1 = !z11;
                        f1Var3.u1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(imageView, ja.e(56, 56, 53));
        na.b(frameLayout, 0.05f, 1.2f);
        na.a(imageView);
        ViewGroup viewGroup3 = this.b;
        a1.c cVar2 = new a1.c(this, 13);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, cVar2);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void I0() {
        rh.h hVar = this.r1;
        int i7 = hVar.f(647).b;
        float L = org.telegram.messenger.g0.L(36.0f) + i7;
        float inputBubbleHeight = this.q1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.b.getHeight();
        v6 v6Var = this.m1;
        FrameLayout frameLayout = this.t1;
        v6Var.setTranslationY(Math.min(((L - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - v6Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - v6Var.getHeight()));
        v6Var.invalidate();
        float y10 = v6Var.getY() - org.telegram.messenger.g0.L(33.0f);
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

    public final Paint J0(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        Paint d = e6Var != null ? e6Var.d("paintChatActionBackground") : null;
        return d != null ? d : org.telegram.ui.ActionBar.j6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        this.s1.Q0();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        b1 b1Var = this.s1;
        if (b1Var == null || !b1Var.G0()) {
            super.onBackPressed();
        } else {
            b1Var.y0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            d1 d1Var = this.C1;
            if (d1Var != null) {
                d1Var.setScrimViewBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void v() {
        u0(false);
        e1 e1Var = new e1(this, 0);
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        xb.a(k2Var, e1Var);
        c30 c30Var = c30.s;
        if (c30Var.c()) {
            c30Var.b();
            TLObject e22 = np.s1(this.a).e2(this.E1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.D1.title);
            sb2.append(" #");
            new cc(k2Var, this.J0).V(Arrays.asList(e22), hd.M0(2131749749, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749751, org.telegram.messenger.m5.u(e22), i5.c.l(r4.num, ',', sb2))), null).k(true);
        }
    }
}
