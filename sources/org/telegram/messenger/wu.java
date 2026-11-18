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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class wu extends zt {
    public final dv X;
    public final dv[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public wu(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        dv dvVar = new dv(evVar, spannableStringBuilder, this.c);
        this.X = dvVar;
        this.Y = new dv[]{dvVar};
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        ev evVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, evVar.C, I(), ks.e4, 31);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.c = (this.b.left + i02) - dvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        dvVar.d(canvas, dvVar.T);
        if (evVar.F()) {
            canvas.save();
            canvas.translate(-dvVar.f, 0.0f);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.b, dvVar.F, 0.0f, dvVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
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
        canvas.drawRect(0.0f, 0.0f, evVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.zt
    public final void X(Canvas canvas, int i7, float f10) {
        ev evVar = this.a;
        int i10 = evVar.C;
        TextPaint textPaint = evVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i10, I(), ks.e4, 31);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.c = (this.b.left + i02) - dvVar.f;
        }
        canvas.save();
        canvas.translate(i02 - dvVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Yc : org.telegram.ui.ActionBar.n6.Xc, evVar.D);
        yg0.b(canvas, dvVar.b, i7, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, evVar.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 == 0) {
            return dvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = dvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override // org.telegram.messenger.zt
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            dv dvVar = this.X;
            dvVar.c = i12 - dvVar.f;
        }
    }

    @Override // org.telegram.messenger.zt, org.telegram.ui.wg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        ev evVar = this.a;
        if (!evVar.I()) {
            return 0;
        }
        int L = (evVar.C + evVar.T) - g0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        ev evVar = this.a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D);
        if (this.a0 == null || this.Z != w02) {
            this.Z = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.n6.r1(0.7f, w02), org.telegram.ui.ActionBar.n6.r1(0.25f, w02), org.telegram.ui.ActionBar.n6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.a0 = linearGradient;
            Paint paint = this.c0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.zt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.zt
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.zt
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        if (!this.X.o(characterStyle, qtVar)) {
            return false;
        }
        Rect rect = this.b;
        qtVar.e = (i0() + rect.left) - r0.f;
        qtVar.f = i7 + rect.top;
        return true;
    }
}
