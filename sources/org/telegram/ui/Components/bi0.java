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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bi0 {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final fi0 e;
    public final TextPaint f;
    public RectF g;

    public bi0(ot otVar, Layout layout, Spanned spanned, fi0 fi0Var) {
        int i9;
        int i10;
        this.a = otVar;
        this.e = fi0Var;
        this.f = layout.getPaint();
        fi0Var.c = spanned.getSpanStart(fi0Var);
        boolean z10 = fi0Var.a;
        int spanEnd = spanned.getSpanEnd(fi0Var);
        fi0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(fi0Var.d) != '\n' && spanned.charAt(fi0Var.d - 1) == '\n') {
            fi0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(fi0Var.c);
        int lineForOffset2 = layout.getLineForOffset(fi0Var.d);
        fi0Var.f = lineForOffset2 - lineForOffset < 1;
        fi0Var.h = lineForOffset <= 0;
        fi0Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z10) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (fi0Var.f) {
                i9 = 0;
            } else {
                i9 = (fi0Var.h ? 2 : 0) + 3;
            }
            this.b = AndroidUtilities.dp(3 - i9) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (fi0Var.f) {
                i10 = 0;
            } else {
                i10 = (fi0Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - AndroidUtilities.dp(2 - i10);
        } else {
            this.b = AndroidUtilities.dp(3 - (fi0Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - AndroidUtilities.dp(2 - (fi0Var.f ? 1 : 2));
        }
        fi0Var.r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                fi0Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z10 && otVar != null && fi0Var.F == null) {
            fi0Var.F = new xh0(otVar);
        }
    }

    public final void a(Canvas canvas, int i9, int i10) {
        RectF rectF;
        int i11;
        int i12;
        Path.Direction direction;
        fi0 fi0Var = this.e;
        int i13 = fi0Var.E;
        float[] fArr = fi0Var.y;
        boolean z10 = fi0Var.a;
        Paint paint = fi0Var.x;
        Paint paint2 = fi0Var.B;
        Path path = fi0Var.D;
        float[] fArr2 = fi0Var.C;
        Path path2 = fi0Var.A;
        Drawable drawable = fi0Var.w;
        if (i13 != i10) {
            fi0Var.E = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i10);
            paint.setColor(i0.a.k(i10, 30));
        }
        int dp = z10 ? i9 : AndroidUtilities.dp(32.0f) + this.d;
        int i14 = ((double) dp) >= ((double) i9) * 0.95d ? i9 : dp;
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i15 = this.b;
        float f10 = i15;
        float f11 = i14;
        int i16 = i14;
        int i17 = this.c;
        float f12 = i17;
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
        if (!z10 || this.a == null || fi0Var.F == null) {
            rectF = rectF2;
            i11 = i15;
            i12 = i17;
            direction = direction2;
        } else {
            if (this.g == null) {
                this.g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i11 = i15;
            i12 = i17;
            direction = direction2;
            rectF = rectF2;
            fi0Var.F.a(canvas, this.g, i16 - dp3, i17 - dp3, i10, fi0Var.e, b());
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
        if (!fi0Var.r) {
            int intrinsicHeight = (int) (((i11 + i12) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > AndroidUtilities.dp(8.0f) + i11) {
                intrinsicHeight = AndroidUtilities.dp(4.0f) + i11;
            }
            drawable.setBounds((i16 - drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i16 - AndroidUtilities.dp(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.e.a && ((float) (this.c - this.b)) > (this.f.getTextSize() * 1.3f) * ((float) 3);
    }
}
