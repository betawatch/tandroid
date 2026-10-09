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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y10 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public y10(org.telegram.ui.Cells.u1 u1Var) {
        this.c = new Path();
        this.d = new Rect();
        this.f = new RectF();
        this.b = u1Var;
        this.e = new bd(u1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.g).draw(canvas);
        }
        if (z10) {
            ia0 ia0Var = (ia0) this.h;
            if (ia0Var == null) {
                ia0 ia0Var2 = new ia0();
                this.h = ia0Var2;
                ia0Var2.D = true;
            } else if (ia0Var.c() || ((ia0) this.h).d()) {
                ia0 ia0Var3 = (ia0) this.h;
                ia0Var3.b = -1L;
                ia0Var3.c = -1L;
            }
        } else {
            ia0 ia0Var4 = (ia0) this.h;
            if (ia0Var4 != null && !ia0Var4.d() && !((ia0) this.h).c()) {
                ((ia0) this.h).a();
            }
        }
        canvas.restore();
        ia0 ia0Var5 = (ia0) this.h;
        if (ia0Var5 == null || ia0Var5.c()) {
            return;
        }
        ia0 ia0Var6 = (ia0) this.h;
        ia0Var6.y = path;
        ia0Var6.g(org.telegram.ui.ActionBar.i6.m1(0.7f, this.a), org.telegram.ui.ActionBar.i6.m1(1.3f, this.a), org.telegram.ui.ActionBar.i6.m1(1.5f, this.a), org.telegram.ui.ActionBar.i6.m1(2.0f, this.a));
        ((ia0) this.h).setBounds(rect);
        canvas.save();
        ((ia0) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.u1) this.b).invalidate();
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float dp;
        RectF rectF = (RectF) this.f;
        int textSize = (((int) org.telegram.ui.ActionBar.i6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f7 = -AndroidUtilities.dp(a1.g.e(min, 9.0f, 2.66f, 4.0f));
        float f10 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(r2);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(r2);
        Path path = (Path) this.c;
        path.rewind();
        if (!z10) {
            max = SharedConfig.bubbleRadius / 2.0f;
        }
        float dp3 = AndroidUtilities.dp(max) * 2;
        rectF.set(f7, f10, f7 + dp3, dp3 + f10);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f11 = lineWidth - lineWidth2;
        float max2 = Math.abs(f11) < ((float) AndroidUtilities.dp(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f11) > AndroidUtilities.dp(r14)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float y3 = com.google.android.gms.internal.vision.e2.y(dp2, f10, 0.45f, f10);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(max2 - dp, f10, max2, f10 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, y3 - dp4, dp4 + lineWidth, y3);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f12 = lineWidth2 - (dp2 - y3);
                rectF.set(f12, y3, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f12, y3, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float y10 = com.google.android.gms.internal.vision.e2.y(dp2, f10, 0.55f, f10);
                float f13 = y10 - f10;
                rectF.set(max2 - f13, f10, max2, y10);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f13, f10, lineWidth, y10);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, y10, lineWidth2 + dp4, dp4 + y10);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f14 = max2 - dp;
            rectF.set(f14, f10, max2, f10 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f14, dp2 - dp, max2, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f7, dp2 - dp, dp + f7, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f7, (int) f10, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void c(int i10) {
        if (this.a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.g;
            if (zVar == null) {
                this.g = org.telegram.ui.ActionBar.i6.g0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.i6.C1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.g).setCallback((org.telegram.ui.Cells.u1) this.b);
            this.a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((bd) this.e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((org.telegram.ui.Cells.u1) this.b).invalidate();
    }

    public y10() {
        Paint paint = new Paint();
        this.b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.c = new gd0(tileMode);
        this.d = new gd0(tileMode);
        this.e = new gd0(Shader.TileMode.REPEAT);
        this.f = new xt();
        this.g = new xt();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
