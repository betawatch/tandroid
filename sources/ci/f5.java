package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f5 extends FrameLayout {
    public final ai.m2 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.k9 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public f5(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, mf.d(-1, -1.0f, hs.E1, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, -4530177)));
        frameLayout.setForeground(new v5(org.telegram.messenger.g0.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, mf.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        ai.m2 m2Var = new ai.m2(frameLayout2, null, false);
        this.a = m2Var;
        frameLayout2.setBackground(m2Var);
        m2Var.s = org.telegram.messenger.g0.L(18.0f);
        m2Var.v = false;
        frameLayout.addView(frameLayout2, mf.e(-1, -1, hs.E1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        frameLayout2.addView(k9Var, mf.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, mf.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, mf.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, mf.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            ai.m2 m2Var = this.a;
            m2Var.d(stargiftattributebackdrop);
            m2Var.e(stargiftattributepattern);
            wb.c1(this.c.getImageReceiver(), stargiftattributemodel.document, 52);
            int b10 = org.telegram.ui.ActionBar.k6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.k6.r1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = ii.k.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new v5(org.telegram.messenger.g0.L(10.0f), b10));
            this.e.setBackground(new v5(org.telegram.messenger.g0.L(10.0f), b10));
        }
        b(starGift != null, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        FrameLayout frameLayout = this.b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.e;
        frameLayout2.animate().cancel();
        if (!z11) {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setScaleX(z10 ? 1.0f : 0.6f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.6f);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            textView.setVisibility(z10 ? 0 : 8);
            textView.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout2.setVisibility(z10 ? 0 : 8);
            frameLayout2.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator alpha = frameLayout.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f);
        xq xqVar = xq.h;
        final int i3 = 0;
        alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: ci.e5
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        boolean z12 = z10;
                        f5 f5Var = this.b;
                        if (!z12) {
                            f5Var.e.setVisibility(8);
                            break;
                        } else {
                            f5Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        f5 f5Var2 = this.b;
                        if (!z13) {
                            f5Var2.e.setVisibility(8);
                            break;
                        } else {
                            f5Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        f5 f5Var3 = this.b;
                        if (!z14) {
                            f5Var3.e.setVisibility(8);
                            break;
                        } else {
                            f5Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        final int i10 = 1;
        textView.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: ci.e5
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z10;
                        f5 f5Var = this.b;
                        if (!z12) {
                            f5Var.e.setVisibility(8);
                            break;
                        } else {
                            f5Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        f5 f5Var2 = this.b;
                        if (!z13) {
                            f5Var2.e.setVisibility(8);
                            break;
                        } else {
                            f5Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        f5 f5Var3 = this.b;
                        if (!z14) {
                            f5Var3.e.setVisibility(8);
                            break;
                        } else {
                            f5Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final int i11 = 2;
        frameLayout2.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: ci.e5
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z10;
                        f5 f5Var = this.b;
                        if (!z12) {
                            f5Var.e.setVisibility(8);
                            break;
                        } else {
                            f5Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        f5 f5Var2 = this.b;
                        if (!z13) {
                            f5Var2.e.setVisibility(8);
                            break;
                        } else {
                            f5Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        f5 f5Var3 = this.b;
                        if (!z14) {
                            f5Var3.e.setVisibility(8);
                            break;
                        } else {
                            f5Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30));
    }
}
