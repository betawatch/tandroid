package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class uu extends xt {
    public final bv X;
    public final bv[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public uu(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        bv bvVar = new bv(cvVar, spannableStringBuilder, this.c);
        this.X = bvVar;
        this.Y = new bv[]{bvVar};
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        cv cvVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, cvVar.C, I(), hs.e4, 31);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.c = (this.b.left + i02) - bvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        bvVar.d(canvas, bvVar.T);
        if (cvVar.F()) {
            canvas.save();
            canvas.translate(-bvVar.f, 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.b, bvVar.F, 0.0f, bvVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, cvVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.xt
    public final void X(Canvas canvas, int i3, float f10) {
        cv cvVar = this.a;
        int i10 = cvVar.C;
        TextPaint textPaint = cvVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i10, I(), hs.e4, 31);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.c = (this.b.left + i02) - bvVar.f;
        }
        canvas.save();
        canvas.translate(i02 - bvVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, cvVar.D);
        ng0.b(canvas, bvVar.b, i3, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, cvVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 == 0) {
            return bvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t10 = bvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t10;
    }

    @Override // org.telegram.messenger.xt
    public final void Z(int i3, int i10, int i11) {
        super.Z(i3, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i3 + i02;
            bv bvVar = this.X;
            bvVar.c = i12 - bvVar.f;
        }
    }

    @Override // org.telegram.messenger.xt, org.telegram.ui.lg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        cv cvVar = this.a;
        if (!cvVar.I()) {
            return 0;
        }
        int L = (cvVar.C + cvVar.T) - g0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        cv cvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D);
        if (this.a0 == null || this.Z != w02) {
            this.Z = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.7f, w02), org.telegram.ui.ActionBar.k6.r1(0.25f, w02), org.telegram.ui.ActionBar.k6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.a0 = linearGradient;
            Paint paint = this.c0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.xt
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.xt
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        if (!this.X.o(characterStyle, otVar)) {
            return false;
        }
        Rect rect = this.b;
        otVar.e = (i0() + rect.left) - r0.f;
        otVar.f = i3 + rect.top;
        return true;
    }
}
