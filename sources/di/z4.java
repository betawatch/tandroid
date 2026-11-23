package di;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z4 extends FrameLayout {
    public final bi.c3 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.q9 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public z4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.d(-1, -1.0f, ls.E1, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.r1(0.12f, -4530177)));
        frameLayout.setForeground(new p5(org.telegram.messenger.g0.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        bi.c3 c3Var = new bi.c3(frameLayout2, null, false);
        this.a = c3Var;
        frameLayout2.setBackground(c3Var);
        c3Var.s = org.telegram.messenger.g0.L(18.0f);
        c3Var.v = false;
        frameLayout.addView(frameLayout2, c8.ma.e(-1, -1, ls.E1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        frameLayout2.addView(q9Var, c8.ma.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, c8.ma.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ma.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, c8.ma.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) y8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            bi.c3 c3Var = this.a;
            c3Var.d(stargiftattributebackdrop);
            c3Var.e(stargiftattributepattern);
            pb.d1(this.c.getImageReceiver(), stargiftattributemodel.document, 52);
            int b10 = org.telegram.ui.ActionBar.m6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.m6.r1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = ki.j.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new p5(org.telegram.messenger.g0.L(10.0f), b10));
            this.e.setBackground(new p5(org.telegram.messenger.g0.L(10.0f), b10));
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
        nr nrVar = nr.h;
        final int i7 = 0;
        alpha.setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: di.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        boolean z12 = z10;
                        z4 z4Var = this.b;
                        if (!z12) {
                            z4Var.e.setVisibility(8);
                            break;
                        } else {
                            z4Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        z4 z4Var2 = this.b;
                        if (!z13) {
                            z4Var2.e.setVisibility(8);
                            break;
                        } else {
                            z4Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        z4 z4Var3 = this.b;
                        if (!z14) {
                            z4Var3.e.setVisibility(8);
                            break;
                        } else {
                            z4Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        final int i10 = 1;
        textView.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: di.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z10;
                        z4 z4Var = this.b;
                        if (!z12) {
                            z4Var.e.setVisibility(8);
                            break;
                        } else {
                            z4Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        z4 z4Var2 = this.b;
                        if (!z13) {
                            z4Var2.e.setVisibility(8);
                            break;
                        } else {
                            z4Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        z4 z4Var3 = this.b;
                        if (!z14) {
                            z4Var3.e.setVisibility(8);
                            break;
                        } else {
                            z4Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final int i11 = 2;
        frameLayout2.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: di.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z10;
                        z4 z4Var = this.b;
                        if (!z12) {
                            z4Var.e.setVisibility(8);
                            break;
                        } else {
                            z4Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        z4 z4Var2 = this.b;
                        if (!z13) {
                            z4Var2.e.setVisibility(8);
                            break;
                        } else {
                            z4Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        z4 z4Var3 = this.b;
                        if (!z14) {
                            z4Var3.e.setVisibility(8);
                            break;
                        } else {
                            z4Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30));
    }
}
