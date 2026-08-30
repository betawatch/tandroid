package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d4 extends FrameLayout {
    public final kh.u1 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.p9 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public d4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.b6.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new s4(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, k7.b6.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        kh.u1 u1Var = new kh.u1(frameLayout2, null, false);
        this.a = u1Var;
        frameLayout2.setBackground(u1Var);
        u1Var.s = AndroidUtilities.dp(18.0f);
        u1Var.u = false;
        frameLayout.addView(frameLayout2, k7.b6.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        frameLayout2.addView(p9Var, k7.b6.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, k7.b6.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, k7.b6.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, k7.b6.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z4) {
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            kh.u1 u1Var = this.a;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e(stargiftattributepattern);
            ja.Z0(this.c.getImageReceiver(), stargiftattributemodel.document, 52);
            int b10 = org.telegram.ui.ActionBar.j6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.j6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String G0 = rh.k.G0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(G0);
            textView.setBackground(new s4(AndroidUtilities.dp(10.0f), b10));
            this.e.setBackground(new s4(AndroidUtilities.dp(10.0f), b10));
        }
        b(starGift != null, z4);
    }

    public final void b(final boolean z4, boolean z10) {
        FrameLayout frameLayout = this.b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.e;
        frameLayout2.animate().cancel();
        if (!z10) {
            frameLayout.setVisibility(z4 ? 0 : 8);
            frameLayout.setScaleX(z4 ? 1.0f : 0.6f);
            frameLayout.setScaleY(z4 ? 1.0f : 0.6f);
            frameLayout.setAlpha(z4 ? 1.0f : 0.0f);
            textView.setVisibility(z4 ? 0 : 8);
            textView.setAlpha(z4 ? 1.0f : 0.0f);
            frameLayout2.setVisibility(z4 ? 0 : 8);
            frameLayout2.setAlpha(z4 ? 1.0f : 0.0f);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator alpha = frameLayout.animate().scaleX(z4 ? 1.0f : 0.6f).scaleY(z4 ? 1.0f : 0.6f).alpha(z4 ? 1.0f : 0.0f);
        nr nrVar = nr.h;
        final int i10 = 0;
        alpha.setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: lh.c4
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z11 = z4;
                        d4 d4Var = this.b;
                        if (!z11) {
                            d4Var.e.setVisibility(8);
                            break;
                        } else {
                            d4Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z12 = z4;
                        d4 d4Var2 = this.b;
                        if (!z12) {
                            d4Var2.e.setVisibility(8);
                            break;
                        } else {
                            d4Var2.getClass();
                            break;
                        }
                    default:
                        boolean z13 = z4;
                        d4 d4Var3 = this.b;
                        if (!z13) {
                            d4Var3.e.setVisibility(8);
                            break;
                        } else {
                            d4Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        final int i11 = 1;
        textView.animate().alpha(z4 ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: lh.c4
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z11 = z4;
                        d4 d4Var = this.b;
                        if (!z11) {
                            d4Var.e.setVisibility(8);
                            break;
                        } else {
                            d4Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z12 = z4;
                        d4 d4Var2 = this.b;
                        if (!z12) {
                            d4Var2.e.setVisibility(8);
                            break;
                        } else {
                            d4Var2.getClass();
                            break;
                        }
                    default:
                        boolean z13 = z4;
                        d4 d4Var3 = this.b;
                        if (!z13) {
                            d4Var3.e.setVisibility(8);
                            break;
                        } else {
                            d4Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final int i12 = 2;
        frameLayout2.animate().alpha(z4 ? 1.0f : 0.0f).setInterpolator(nrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: lh.c4
            public final /* synthetic */ d4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z11 = z4;
                        d4 d4Var = this.b;
                        if (!z11) {
                            d4Var.e.setVisibility(8);
                            break;
                        } else {
                            d4Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z12 = z4;
                        d4 d4Var2 = this.b;
                        if (!z12) {
                            d4Var2.e.setVisibility(8);
                            break;
                        } else {
                            d4Var2.getClass();
                            break;
                        }
                    default:
                        boolean z13 = z4;
                        d4 d4Var3 = this.b;
                        if (!z13) {
                            d4Var3.e.setVisibility(8);
                            break;
                        } else {
                            d4Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
    }
}
