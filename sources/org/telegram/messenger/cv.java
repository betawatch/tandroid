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
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class cv extends fu {
    public final jv W;
    public final jv[] X;
    public int Y;
    public LinearGradient Z;
    public final Matrix a0;
    public final Paint b0;

    public cv(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7);
        this.a0 = new Matrix();
        this.b0 = new Paint(1);
        jv jvVar = new jv(kvVar, spannableStringBuilder, this.c);
        this.W = jvVar;
        this.X = new jv[]{jvVar};
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return this.W.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        Rect rect = this.b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.X;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        kv kvVar = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, kvVar.C, I(), qs.e4, 31);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.c = (this.b.left + i02) - jvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        jvVar.d(canvas, jvVar.S);
        if (kvVar.F()) {
            canvas.save();
            canvas.translate(-jvVar.f, 0.0f);
            org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas, jvVar.b, jvVar.E, 0.0f, jvVar.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.a0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, kvVar.C, I(), this.b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.fu
    public final void X(Canvas canvas, int i7, float f10) {
        kv kvVar = this.a;
        int i10 = kvVar.C;
        TextPaint textPaint = kvVar.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i10, I(), qs.e4, 31);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.c = (this.b.left + i02) - jvVar.f;
        }
        canvas.save();
        canvas.translate(i02 - jvVar.f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.Vc : org.telegram.ui.ActionBar.m6.Uc, kvVar.D);
        wg0.b(canvas, jvVar.b, i7, f10, new o(5, this, this.V));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.a0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, kvVar.C, I(), this.b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 == 0) {
            return jvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = jvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            jv jvVar = this.W;
            jvVar.c = i12 - jvVar.f;
        }
    }

    @Override // org.telegram.messenger.fu, org.telegram.ui.ug0
    public final Layout a() {
        return this.W.b;
    }

    public final int i0() {
        kv kvVar = this.a;
        if (!kvVar.I()) {
            return 0;
        }
        int L = (kvVar.C + kvVar.T) - g0.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.W.r();
    }

    public final void j0() {
        kv kvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.Tc : org.telegram.ui.ActionBar.m6.Sc, kvVar.D);
        if (this.Z == null || this.Y != w02) {
            this.Y = w02;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.7f, w02), org.telegram.ui.ActionBar.m6.r1(0.25f, w02), org.telegram.ui.ActionBar.m6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.Z = linearGradient;
            Paint paint = this.b0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override // org.telegram.messenger.fu
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // org.telegram.messenger.fu
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        if (!this.W.o(characterStyle, wtVar)) {
            return false;
        }
        Rect rect = this.b;
        wtVar.e = (i0() + rect.left) - r0.f;
        wtVar.f = i7 + rect.top;
        return true;
    }
}
