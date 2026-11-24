// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e0 extends mz0 implements jm7 {
    public final TL_aicompose.AiComposeTone S1;
    public final id T1;
    public final ImageView U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final TextView X1;
    public final FrameLayout Y1;
    public final FrameLayout Z1;
    public final b61 a2;
    public l7c b2;
    public int c2;
    public final TL_aicompose.aiComposeToneExample[] d2;
    public int e2;

    public e0(Context context, TL_aicompose.AiComposeTone aiComposeTone, ylb ylbVar) {
        super(context, null, false, false, 2, ylbVar);
        byte b = 0;
        this.c2 = 0;
        id P1 = oc7.r1(this.a).P1();
        this.T1 = P1;
        P1.b();
        this.S1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[oc7.r1(this.a).l4.T.f()];
        this.d2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i = cmb.F6;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.SRC_ATOP);
        fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i, this.J0)), 1, -1);
        wmb K = anb.K(0.1f, i);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, K, ylbVar);
        this.b.addView(imageView, qoe.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        rve.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new a0(this, b));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = gm.L(100.0f);
        int i2 = cmb.c6;
        ShapeDrawable K2 = cmb.K(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        frameLayout2.setBackground(K2);
        anb.j(frameLayout2, K2, M, null, ylbVar);
        frameLayout.addView(frameLayout2, qoe.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        bf0Var.setAnimatedEmojiDrawable(new vm(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(bf0Var, qoe.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.W1 = textView;
        td4.x(textView, i, ylbVar, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.X1 = textView2;
        anb.X(textView2, i, ylbVar);
        textView2.setTextSize(1, 14.0f);
        hg9.p(textView2, 17, null, 2131754966);
        this.o1.setTitle(aiComposeTone.title);
        int i3 = cmb.Z6;
        this.b0 = i3;
        s0(cmb.v0(i3, this.J0));
        r59 r59Var = this.n1;
        int i4 = this.u0;
        r59Var.setPadding(i4, 0, i4, gm.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, (byte) 1));
        this.F1 = false;
        this.E1 = gm.L(36.0f);
        this.u1 = 0.35f;
        this.I1 = true;
        d0 d0Var = new d0(this);
        d0Var.m = false;
        d0Var.C = false;
        d0Var.o(d53.h);
        d0Var.n(350L);
        this.n1.setItemAnimator(d0Var);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.setPadding(gm.L(16.0f), gm.L(6.0f), gm.L(16.0f), gm.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, cmb.v0(i3, this.J0)), cmb.v0(i3, this.J0), cmb.v0(i3, this.J0)}));
        FrameLayout.LayoutParams e = qoe.e(-1, -2, 80);
        int i5 = e.leftMargin;
        int i6 = this.u0;
        e.leftMargin = i5 + i6;
        e.rightMargin += i6;
        this.b.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i7 = d.leftMargin;
        int i8 = this.u0;
        d.leftMargin = i7 + i8;
        d.rightMargin += i8;
        this.b.addView(frameLayout4, d);
        b61 i9 = mlb.i(24, ylbVar, context, true);
        this.a2 = i9;
        i9.setText(jb6.M0(Y0() ? 2131754980 : 2131755005, null));
        i9.setOnClickListener(new b0(this, aiComposeTone, ylbVar, b));
        frameLayout3.addView(i9, qoe.e(-1, 48, nm7.D1));
        this.b2.O(false);
    }

    public static SpannableStringBuilder Z0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = gm.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131748536, null));
            ta6 ta6Var = new ta6(null, L, 0, null);
            ta6Var.f = gm.L(6.0f);
            ta6Var.h = 0.5f;
            ta6Var.n = true;
            spannableStringBuilder.setSpan(ta6Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new f(this, (byte) 1), this.J0);
        this.b2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }

    @Override // mz0
    public final void L0(float f) {
        iz0 iz0Var = this.o1;
        lka titleTextView = iz0Var.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
        float translationY = iz0Var.getTranslationY() + gm.m;
        int height = iz0Var.getHeight() - gm.m;
        this.U1.setTranslationY(((1.0f - f) * gm.L(28.0f)) + ((height - r3.getHeight()) / 2.0f) + translationY);
    }

    public final boolean Y0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i = 0;
            while (true) {
                id idVar = this.T1;
                if (i >= idVar.b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) idVar.b.get(i);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.b4) {
            this.a2.setText(jb6.M0(Y0() ? 2131754980 : 2131755005, null));
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        nm7.f(this.a).n(this, nm7.b4);
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (v0 != this.e2) {
                this.e2 = v0;
                s0(v0);
                this.Y1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        nm7.f(this.a).b(this, nm7.b4);
    }
}
