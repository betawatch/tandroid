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
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class xu extends au {
    public final ev X;
    public final ev[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public xu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(fvVar, rect, i7);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        ev evVar = new ev(fvVar, spannableStringBuilder, this.c);
        this.X = evVar;
        this.Y = new ev[]{evVar};
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.au
    public final void W(Canvas canvas) {
        fv fvVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, fvVar.C, I(), ls.e4, 31);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.c = (this.b.left + i02) - evVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        evVar.d(canvas, evVar.T);
        if (fvVar.F()) {
            canvas.save();
            canvas.translate(-evVar.f, 0.0f);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar.b, evVar.F, 0.0f, evVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
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
        canvas.drawRect(0.0f, 0.0f, fvVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.au
    public final void X(Canvas canvas, int i7, float f10) {
        fv fvVar = this.a;
        int i10 = fvVar.C;
        TextPaint textPaint = fvVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i10, I(), ls.e4, 31);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.c = (this.b.left + i02) - evVar.f;
        }
        canvas.save();
        canvas.translate(i02 - evVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.Yc : org.telegram.ui.ActionBar.m6.Xc, fvVar.D);
        yg0.b(canvas, evVar.b, i7, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, fvVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        ev evVar = this.X;
        if (i02 == 0) {
            return evVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = evVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override // org.telegram.messenger.au
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            ev evVar = this.X;
            evVar.c = i12 - evVar.f;
        }
    }

    @Override // org.telegram.messenger.au, org.telegram.ui.wg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        fv fvVar = this.a;
        if (!fvVar.I()) {
            return 0;
        }
        int L = (fvVar.C + fvVar.T) - g0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        fv fvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.Wc : org.telegram.ui.ActionBar.m6.Vc, fvVar.D);
        if (this.a0 == null || this.Z != w02) {
            this.Z = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.7f, w02), org.telegram.ui.ActionBar.m6.r1(0.25f, w02), org.telegram.ui.ActionBar.m6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.a0 = linearGradient;
            Paint paint = this.c0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.au
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.au
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.au
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        if (!this.X.o(characterStyle, rtVar)) {
            return false;
        }
        Rect rect = this.b;
        rtVar.e = (i0() + rect.left) - r0.f;
        rtVar.f = i7 + rect.top;
        return true;
    }
}
