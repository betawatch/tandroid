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
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ov extends ru {
    public final vv W;
    public final vv[] X;
    public int Y;
    public LinearGradient Z;
    public final Matrix a0;
    public final Paint b0;

    public ov(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10);
        this.a0 = new Matrix();
        this.b0 = new Paint(1);
        vv vvVar = new vv(wvVar, spannableStringBuilder, this.c);
        this.W = vvVar;
        this.X = new vv[]{vvVar};
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        return this.W.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        Rect rect = this.b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        wv wvVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, wvVar.C, H(), at.e4, 31);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.c = (this.b.left + h02) - vvVar.f;
            canvas.save();
            canvas.translate(h02, 0.0f);
        }
        vvVar.d(canvas, vvVar.S);
        if (wvVar.F()) {
            canvas.save();
            canvas.translate(-vvVar.f, 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar.b, vvVar.E, 0.0f, vvVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (h02 != 0) {
            canvas.restore();
        }
        i0();
        Matrix matrix = this.a0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, wvVar.C, H(), this.b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.ru
    public final void W(Canvas canvas, int i10, float f7) {
        wv wvVar = this.a;
        int i11 = wvVar.C;
        TextPaint textPaint = wvVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, H(), at.e4, 31);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.c = (this.b.left + h02) - vvVar.f;
        }
        canvas.save();
        canvas.translate(h02 - vvVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, wvVar.D);
        xh0.b(canvas, vvVar.b, i10, f7, new p(5, this, this.V));
        canvas.restore();
        textPaint.setColor(color);
        i0();
        Matrix matrix = this.a0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, wvVar.C, H(), this.b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 == 0) {
            return vvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-h02, 0.0f);
        boolean t10 = vvVar.t(motionEvent);
        motionEvent.offsetLocation(h02, 0.0f);
        return t10;
    }

    @Override // org.telegram.messenger.ru
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            vv vvVar = this.W;
            vvVar.c = i13 - vvVar.f;
        }
    }

    @Override // org.telegram.messenger.ru, org.telegram.ui.vh0
    public final Layout a() {
        return this.W.b;
    }

    public final int h0() {
        wv wvVar = this.a;
        if (!wvVar.I()) {
            return 0;
        }
        int L = (wvVar.C + wvVar.T) - i0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.W.r();
    }

    public final void i0() {
        wv wvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, wvVar.D);
        if (this.Z == null || this.Y != w02) {
            this.Y = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.7f, w02), org.telegram.ui.ActionBar.t6.r1(0.25f, w02), org.telegram.ui.ActionBar.t6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.Z = linearGradient;
            Paint paint = this.b0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.ru
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.W, this.X);
    }

    @Override // org.telegram.messenger.ru
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.ru
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        if (!this.W.o(characterStyle, iuVar)) {
            return false;
        }
        Rect rect = this.b;
        iuVar.e = (h0() + rect.left) - r0.f;
        iuVar.f = i10 + rect.top;
        return true;
    }
}
