package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public final org.telegram.ui.Components.k9 a;
    public final y5 b;
    public final org.telegram.ui.Components.i6 c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f;

    public q5(Context context) {
        super(context);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(13.0f));
        addView(k9Var, c8.ha.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        y5 y5Var = new y5(context);
        this.b = y5Var;
        y5Var.e = org.telegram.messenger.g0.L(18.0f);
        y5Var.a.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        addView(y5Var, c8.ha.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.c = i6Var;
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setGravity(17);
        i6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        i6Var.setTextColor(-1);
        addView(i6Var, c8.ha.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        c8.ka.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        org.telegram.ui.Components.k9 k9Var = this.a;
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop == null) {
            k9Var.setAlpha(1.0f);
            k9Var.setImageDrawable(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.m6.r1(0.25f, -1)));
            return;
        }
        k9Var.setAlpha(1.0f);
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(org.telegram.messenger.g0.L(26.0f));
        shapeDrawable.setIntrinsicHeight(org.telegram.messenger.g0.L(26.0f));
        shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        k9Var.setImageDrawable(shapeDrawable);
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        org.telegram.ui.Components.k9 k9Var = this.a;
        if (stargiftattributepattern == null) {
            k9Var.setAlpha(0.25f);
            k9Var.setScaleX(0.75f);
            k9Var.setScaleY(0.75f);
            k9Var.setTranslationY(0.0f);
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        k9Var.setAlpha(1.0f);
        k9Var.setScaleX(0.95f);
        k9Var.setScaleY(0.95f);
        k9Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.Components.h5 l10 = org.telegram.ui.Components.h5.l(p10.s0, 9, stargiftattributepattern.document);
        l10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        k9Var.setAnimatedEmojiDrawable(l10);
    }

    public final void c(boolean z9, float f10) {
        this.f = f10;
        y5 y5Var = this.b;
        y5Var.d = f10;
        if (!z9) {
            y5Var.b.e(true, f10);
        }
        y5Var.invalidate();
        this.c.c(Math.round(f10 * 100.0f) + "%", z9, true);
    }
}
