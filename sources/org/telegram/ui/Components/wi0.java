package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wi0 {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final aj0 e;
    public final TextPaint f;
    public RectF g;

    public wi0(wt wtVar, Layout layout, Spanned spanned, aj0 aj0Var) {
        int i10;
        int i11;
        this.a = wtVar;
        this.e = aj0Var;
        this.f = layout.getPaint();
        aj0Var.c = spanned.getSpanStart(aj0Var);
        boolean z4 = aj0Var.a;
        int spanEnd = spanned.getSpanEnd(aj0Var);
        aj0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(aj0Var.d) != '\n' && spanned.charAt(aj0Var.d - 1) == '\n') {
            aj0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(aj0Var.c);
        int lineForOffset2 = layout.getLineForOffset(aj0Var.d);
        aj0Var.f = lineForOffset2 - lineForOffset < 1;
        aj0Var.h = lineForOffset <= 0;
        aj0Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z4) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (aj0Var.f) {
                i10 = 0;
            } else {
                i10 = (aj0Var.h ? 2 : 0) + 3;
            }
            this.b = AndroidUtilities.dp(3 - i10) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (aj0Var.f) {
                i11 = 0;
            } else {
                i11 = (aj0Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - AndroidUtilities.dp(2 - i11);
        } else {
            this.b = AndroidUtilities.dp(3 - (aj0Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - AndroidUtilities.dp(2 - (aj0Var.f ? 1 : 2));
        }
        aj0Var.r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                aj0Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z4 && wtVar != null && aj0Var.G == null) {
            aj0Var.G = new si0(wtVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        aj0 aj0Var = this.e;
        int i14 = aj0Var.F;
        float[] fArr = aj0Var.y;
        boolean z4 = aj0Var.a;
        Paint paint = aj0Var.x;
        Paint paint2 = aj0Var.C;
        Path path = aj0Var.E;
        float[] fArr2 = aj0Var.D;
        Path path2 = aj0Var.B;
        Drawable drawable = aj0Var.w;
        if (i14 != i11) {
            aj0Var.F = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i11);
            paint.setColor(i0.a.k(i11, 30));
        }
        int dp = z4 ? i10 : AndroidUtilities.dp(32.0f) + this.d;
        int i15 = ((double) dp) >= ((double) i10) * 0.95d ? i10 : dp;
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i16 = this.b;
        float f10 = i16;
        float f11 = i15;
        int i17 = i15;
        int i18 = this.c;
        float f12 = i18;
        rectF2.set(0.0f, f10, f11, f12);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float dp2 = AndroidUtilities.dp(4.0f);
        fArr[5] = dp2;
        fArr[4] = dp2;
        fArr[3] = dp2;
        fArr[2] = dp2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (!z4 || this.a == null || aj0Var.G == null) {
            rectF = rectF2;
            i12 = i16;
            i13 = i18;
            direction = direction2;
        } else {
            if (this.g == null) {
                this.g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i12 = i16;
            i13 = i18;
            direction = direction2;
            rectF = rectF2;
            aj0Var.G.a(canvas, this.g, i17 - dp3, i18 - dp3, i11, aj0Var.e, b());
        }
        rectF.set(-AndroidUtilities.dp(3.0f), f10, 0.0f, f12);
        float dp4 = AndroidUtilities.dp(4.0f);
        fArr2[7] = dp4;
        fArr2[6] = dp4;
        fArr2[1] = dp4;
        fArr2[0] = dp4;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        path.rewind();
        path.addRoundRect(rectF, fArr2, direction);
        canvas.drawPath(path, paint2);
        if (!aj0Var.r) {
            int intrinsicHeight = (int) (((i12 + i13) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > AndroidUtilities.dp(8.0f) + i12) {
                intrinsicHeight = AndroidUtilities.dp(4.0f) + i12;
            }
            drawable.setBounds((i17 - drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i17 - AndroidUtilities.dp(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.e.a && ((float) (this.c - this.b)) > (this.f.getTextSize() * 1.3f) * ((float) 3);
    }
}
