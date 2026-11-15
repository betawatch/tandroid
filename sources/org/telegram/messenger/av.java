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
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class av extends cu {
    public final hv X;
    public final hv[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public av(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        hv hvVar = new hv(ivVar, spannableStringBuilder, this.c);
        this.X = hvVar;
        this.Y = new hv[]{hvVar};
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        iv ivVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, ivVar.C, I(), ns.e4, 31);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.c = (this.b.left + i02) - hvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        hvVar.d(canvas, hvVar.T);
        if (ivVar.F()) {
            canvas.save();
            canvas.translate(-hvVar.f, 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar.b, hvVar.F, 0.0f, hvVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
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
        canvas.drawRect(0.0f, 0.0f, ivVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.cu
    public final void X(Canvas canvas, int i7, float f10) {
        iv ivVar = this.a;
        int i10 = ivVar.C;
        TextPaint textPaint = ivVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i10, I(), ns.e4, 31);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.c = (this.b.left + i02) - hvVar.f;
        }
        canvas.save();
        canvas.translate(i02 - hvVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.Yc : org.telegram.ui.ActionBar.j6.Xc, ivVar.D);
        tg0.b(canvas, hvVar.b, i7, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, ivVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 == 0) {
            return hvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = hvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override // org.telegram.messenger.cu
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            hv hvVar = this.X;
            hvVar.c = i12 - hvVar.f;
        }
    }

    @Override // org.telegram.messenger.cu, org.telegram.ui.rg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        iv ivVar = this.a;
        if (!ivVar.I()) {
            return 0;
        }
        int L = (ivVar.C + ivVar.T) - g0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        iv ivVar = this.a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.Wc : org.telegram.ui.ActionBar.j6.Vc, ivVar.D);
        if (this.a0 == null || this.Z != w02) {
            this.Z = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.r1(0.7f, w02), org.telegram.ui.ActionBar.j6.r1(0.25f, w02), org.telegram.ui.ActionBar.j6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.a0 = linearGradient;
            Paint paint = this.c0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.cu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.cu
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.cu
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        if (!this.X.o(characterStyle, ttVar)) {
            return false;
        }
        Rect rect = this.b;
        ttVar.e = (i0() + rect.left) - r0.f;
        ttVar.f = i7 + rect.top;
        return true;
    }
}
