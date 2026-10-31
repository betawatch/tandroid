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
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class nv extends qu {
    public final uv W;
    public final uv[] X;
    public int Y;
    public LinearGradient Z;
    public final Matrix a0;
    public final Paint b0;

    public nv(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(vvVar, rect, i10);
        this.a0 = new Matrix();
        this.b0 = new Paint(1);
        uv uvVar = new uv(vvVar, spannableStringBuilder, this.c);
        this.W = uvVar;
        this.X = new uv[]{uvVar};
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return this.W.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        Rect rect = this.b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        vv vvVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, vvVar.C, H(), zs.e4, 31);
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 != 0) {
            uvVar.c = (this.b.left + h02) - uvVar.f;
            canvas.save();
            canvas.translate(h02, 0.0f);
        }
        uvVar.d(canvas, uvVar.S);
        if (vvVar.F()) {
            canvas.save();
            canvas.translate(-uvVar.f, 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.b, uvVar.E, 0.0f, uvVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
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
        canvas.drawRect(0.0f, 0.0f, vvVar.C, H(), this.b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.qu
    public final void W(Canvas canvas, int i10, float f7) {
        vv vvVar = this.a;
        int i11 = vvVar.C;
        TextPaint textPaint = vvVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, H(), zs.e4, 31);
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 != 0) {
            uvVar.c = (this.b.left + h02) - uvVar.f;
        }
        canvas.save();
        canvas.translate(h02 - uvVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, vvVar.D);
        zh0.b(canvas, uvVar.b, i10, f7, new p(5, this, this.V));
        canvas.restore();
        textPaint.setColor(color);
        i0();
        Matrix matrix = this.a0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, vvVar.C, H(), this.b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 == 0) {
            return uvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-h02, 0.0f);
        boolean t10 = uvVar.t(motionEvent);
        motionEvent.offsetLocation(h02, 0.0f);
        return t10;
    }

    @Override // org.telegram.messenger.qu
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            uv uvVar = this.W;
            uvVar.c = i13 - uvVar.f;
        }
    }

    @Override // org.telegram.messenger.qu, org.telegram.ui.xh0
    public final Layout a() {
        return this.W.b;
    }

    public final int h0() {
        vv vvVar = this.a;
        if (!vvVar.I()) {
            return 0;
        }
        int L = (vvVar.C + vvVar.T) - i0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.W.r();
    }

    public final void i0() {
        vv vvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D);
        if (this.Z == null || this.Y != w02) {
            this.Y = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.7f, w02), org.telegram.ui.ActionBar.t6.r1(0.25f, w02), org.telegram.ui.ActionBar.t6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.Z = linearGradient;
            Paint paint = this.b0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override // org.telegram.messenger.qu
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.qu
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        if (!this.W.o(characterStyle, huVar)) {
            return false;
        }
        Rect rect = this.b;
        huVar.e = (h0() + rect.left) - r0.f;
        huVar.f = i10 + rect.top;
        return true;
    }
}
