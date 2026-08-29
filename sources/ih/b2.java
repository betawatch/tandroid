package ih;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b2 extends lq {
    public zz0 b;
    public final Path c;
    public final Paint d;
    public final float e;
    public va f;
    public boolean g;
    public int h;

    public b2(View view) {
        super(view);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = -1;
        this.e = 1.0f;
        c(path, 1.0f, false);
        this.a.setColor(-698031);
        this.a.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void c(Path path, float f9, final boolean z10) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: ih.a2
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Float f10 = (Float) obj;
                return Float.valueOf(z10 ? 48.0f - f10.floatValue() : f10.floatValue());
            }
        };
        path.rewind();
        float f10 = f9 * 24.5f;
        path.moveTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(46.83f)), f9), AndroidUtilities.dp(f10));
        path.lineTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(23.5f)), f9), AndroidUtilities.dp(1.17f * f9));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(22.75f)), f9), AndroidUtilities.dp(0.42f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(21.73f)), f9), 0.0f, com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(20.68f)), f9), 0.0f);
        float f11 = f9 * 0.05f;
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(19.62f)), f9), 0.0f, com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(2.73f)), f9), AndroidUtilities.dp(f11), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(1.55f)), f9), AndroidUtilities.dp(f11));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(0.36f)), f9), AndroidUtilities.dp(f11), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(-0.23f)), f9), AndroidUtilities.dp(1.4885f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(0.6f)), f9), AndroidUtilities.dp(2.32f * f9));
        path.lineTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(45.72f)), f9), AndroidUtilities.dp(47.44f * f9));
        float g10 = com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(46.56f)), f9);
        float dp = AndroidUtilities.dp(48.28f * f9);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(g10, dp, com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(valueOf), f9), AndroidUtilities.dp(47.68f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(valueOf), f9), AndroidUtilities.dp(46.5f * f9));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(valueOf), f9), AndroidUtilities.dp(45.31f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(valueOf), f9), AndroidUtilities.dp(28.38f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(valueOf), f9), AndroidUtilities.dp(27.32f * f9));
        path.cubicTo(com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(valueOf), f9), AndroidUtilities.dp(26.26f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(47.5f)), f9), AndroidUtilities.dp(25.24f * f9), com.google.android.recaptcha.internal.a.g((Float) callbackReturn.run(Float.valueOf(46.82f)), f9), AndroidUtilities.dp(f10));
        path.close();
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        Paint paint = this.a;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z12 = this.g ? !z10 : z10;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{g6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), g6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z12 ? 1.0f : 0.0f, z12 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.d;
        int alpha = paint.getAlpha();
        Path path = this.c;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.a);
        if (this.f != null) {
            canvas.clipPath(path);
            this.f.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.f.d();
            this.f.a(canvas, -1);
            invalidateSelf();
        }
        if (this.b != null) {
            canvas.save();
            canvas.rotate(this.g ? -45.0f : 45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.g ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.g ? 5.0f : 6.0f));
            float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.b.c);
            canvas.scale(min, min, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.g ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.g ? 5.0f : 6.0f));
            canvas2 = canvas;
            this.b.c(((getBounds().width() / 2.0f) + AndroidUtilities.dp(this.g ? -7.0f : 6.0f)) - (this.b.l() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.g ? 4.0f : 5.0f), 1.0f, this.h, canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void e(int i10, CharSequence charSequence, boolean z10) {
        this.b = new zz0(charSequence, i10, z10 ? AndroidUtilities.bold() : null);
    }
}
