package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n4 extends FrameLayout {
    public final org.telegram.ui.Components.i9 a;
    public final t4 b;
    public final org.telegram.ui.Components.h6 c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f;

    public n4(Context context) {
        super(context);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(13.0f));
        addView(i9Var, c8.ja.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        t4 t4Var = new t4(context);
        this.b = t4Var;
        t4Var.e = org.telegram.messenger.g0.L(18.0f);
        t4Var.a.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        addView(t4Var, c8.ja.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.c = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        h6Var.setTextColor(-1);
        addView(h6Var, c8.ja.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        c8.na.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        org.telegram.ui.Components.i9 i9Var = this.a;
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop == null) {
            i9Var.setAlpha(1.0f);
            i9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.j6.r1(0.25f, -1)));
            return;
        }
        i9Var.setAlpha(1.0f);
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(org.telegram.messenger.g0.L(26.0f));
        shapeDrawable.setIntrinsicHeight(org.telegram.messenger.g0.L(26.0f));
        shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        i9Var.setImageDrawable(shapeDrawable);
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        org.telegram.ui.Components.i9 i9Var = this.a;
        if (stargiftattributepattern == null) {
            i9Var.setAlpha(0.25f);
            i9Var.setScaleX(0.75f);
            i9Var.setScaleY(0.75f);
            i9Var.setTranslationY(0.0f);
            i9Var.setAnimatedEmojiDrawable(null);
            i9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        i9Var.setAlpha(1.0f);
        i9Var.setScaleX(0.95f);
        i9Var.setScaleY(0.95f);
        i9Var.setTranslationY(org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(m10.t0, 9, stargiftattributepattern.document);
        l10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        i9Var.setAnimatedEmojiDrawable(l10);
    }

    public final void c(boolean z10, float f10) {
        this.f = f10;
        t4 t4Var = this.b;
        t4Var.d = f10;
        if (!z10) {
            t4Var.b.e(true, f10);
        }
        t4Var.invalidate();
        this.c.c(Math.round(f10 * 100.0f) + "%", z10, true);
    }
}
