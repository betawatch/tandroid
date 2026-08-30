package org.telegram.ui.Components;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.StaticLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i10 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public i10(org.telegram.ui.Cells.t1 t1Var) {
        this.c = new Path();
        this.d = new Rect();
        this.f = new RectF();
        this.b = t1Var;
        this.e = new rc(t1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z4) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.g).draw(canvas);
        }
        if (z4) {
            i90 i90Var = (i90) this.h;
            if (i90Var == null) {
                i90 i90Var2 = new i90();
                this.h = i90Var2;
                i90Var2.C = true;
            } else if (i90Var.b() || ((i90) this.h).c()) {
                i90 i90Var3 = (i90) this.h;
                i90Var3.b = -1L;
                i90Var3.c = -1L;
            }
        } else {
            i90 i90Var4 = (i90) this.h;
            if (i90Var4 != null && !i90Var4.c() && !((i90) this.h).b()) {
                ((i90) this.h).a();
            }
        }
        canvas.restore();
        i90 i90Var5 = (i90) this.h;
        if (i90Var5 == null || i90Var5.b()) {
            return;
        }
        i90 i90Var6 = (i90) this.h;
        i90Var6.x = path;
        i90Var6.f(org.telegram.ui.ActionBar.j6.l1(0.7f, this.a), org.telegram.ui.ActionBar.j6.l1(1.3f, this.a), org.telegram.ui.ActionBar.j6.l1(1.5f, this.a), org.telegram.ui.ActionBar.j6.l1(2.0f, this.a));
        ((i90) this.h).setBounds(rect);
        canvas.save();
        ((i90) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.t1) this.b).invalidate();
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z4) {
        float dp;
        RectF rectF = (RectF) this.f;
        int textSize = (((int) org.telegram.ui.ActionBar.j6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(vh.v2.c(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(r2);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(r2);
        Path path = (Path) this.c;
        path.rewind();
        if (!z4) {
            max = SharedConfig.bubbleRadius / 2.0f;
        }
        float dp3 = AndroidUtilities.dp(max) * 2;
        rectF.set(f10, f11, f10 + dp3, dp3 + f11);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f12 = lineWidth - lineWidth2;
        float max2 = Math.abs(f12) < ((float) AndroidUtilities.dp(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f12) > AndroidUtilities.dp(r14)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float w10 = e2.c.w(dp2, f11, 0.45f, f11);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(max2 - dp, f11, max2, f11 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, w10 - dp4, dp4 + lineWidth, w10);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f13 = lineWidth2 - (dp2 - w10);
                rectF.set(f13, w10, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f13, w10, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float w11 = e2.c.w(dp2, f11, 0.55f, f11);
                float f14 = w11 - f11;
                rectF.set(max2 - f14, f11, max2, w11);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f14, f11, lineWidth, w11);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, w11, lineWidth2 + dp4, dp4 + w11);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f15 = max2 - dp;
            rectF.set(f15, f11, max2, f11 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f15, dp2 - dp, max2, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, dp2 - dp, dp + f10, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void c(int i10) {
        if (this.a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.g;
            if (zVar == null) {
                this.g = org.telegram.ui.ActionBar.j6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.j6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.g).setCallback((org.telegram.ui.Cells.t1) this.b);
            this.a = i10;
        }
    }

    public void d(boolean z4) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((rc) this.e).c(z4);
        if (z4 && (zVar = (org.telegram.ui.Cells.z) this.g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.g;
        if (zVar2 != null) {
            zVar2.setState(z4 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((org.telegram.ui.Cells.t1) this.b).invalidate();
    }

    public i10() {
        Paint paint = new Paint();
        this.b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.c = new hc0(tileMode);
        this.d = new hc0(tileMode);
        this.e = new hc0(Shader.TileMode.REPEAT);
        this.f = new dt();
        this.g = new dt();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
