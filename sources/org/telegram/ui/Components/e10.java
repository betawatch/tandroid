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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e10 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public e10(org.telegram.ui.Cells.s1 s1Var) {
        this.c = new Path();
        this.d = new Rect();
        this.f = new RectF();
        this.b = s1Var;
        this.e = new uc(s1Var, 0.8f, 1.4f);
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
            c90 c90Var = (c90) this.h;
            if (c90Var == null) {
                c90 c90Var2 = new c90();
                this.h = c90Var2;
                c90Var2.C = true;
            } else if (c90Var.b() || ((c90) this.h).c()) {
                c90 c90Var3 = (c90) this.h;
                c90Var3.b = -1L;
                c90Var3.c = -1L;
            }
        } else {
            c90 c90Var4 = (c90) this.h;
            if (c90Var4 != null && !c90Var4.c() && !((c90) this.h).b()) {
                ((c90) this.h).a();
            }
        }
        canvas.restore();
        c90 c90Var5 = (c90) this.h;
        if (c90Var5 == null || c90Var5.b()) {
            return;
        }
        c90 c90Var6 = (c90) this.h;
        c90Var6.x = path;
        c90Var6.f(org.telegram.ui.ActionBar.g6.l1(0.7f, this.a), org.telegram.ui.ActionBar.g6.l1(1.3f, this.a), org.telegram.ui.ActionBar.g6.l1(1.5f, this.a), org.telegram.ui.ActionBar.g6.l1(2.0f, this.a));
        ((c90) this.h).setBounds(rect);
        canvas.save();
        ((c90) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.s1) this.b).invalidate();
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float dp;
        RectF rectF = (RectF) this.f;
        int textSize = (((int) org.telegram.ui.ActionBar.g6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f9 = -AndroidUtilities.dp(u3.c.c(min, 9.0f, 2.66f, 4.0f));
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
        rectF.set(f9, f10, f9 + dp3, dp3 + f10);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f11 = lineWidth - lineWidth2;
        float max2 = Math.abs(f11) < ((float) AndroidUtilities.dp(min2 + min)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f11) > AndroidUtilities.dp(r14)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z11 = com.google.android.recaptcha.internal.a.z(dp2, f10, 0.45f, f10);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(max2 - dp, f10, max2, f10 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - dp4, dp4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f12 = lineWidth2 - (dp2 - z11);
                rectF.set(f12, z11, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f12, z11, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = com.google.android.recaptcha.internal.a.z(dp2, f10, 0.55f, f10);
                float f13 = z12 - f10;
                rectF.set(max2 - f13, f10, max2, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f13, f10, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + dp4, dp4 + z12);
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
        rectF.set(f9, dp2 - dp, dp + f9, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f9, (int) f10, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void c(int i10) {
        if (this.a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.g;
            if (zVar == null) {
                this.g = org.telegram.ui.ActionBar.g6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.g6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.g).setCallback((org.telegram.ui.Cells.s1) this.b);
            this.a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((uc) this.e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((org.telegram.ui.Cells.s1) this.b).invalidate();
    }

    public e10() {
        Paint paint = new Paint();
        this.b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.c = new cc0(tileMode);
        this.d = new cc0(tileMode);
        this.e = new cc0(Shader.TileMode.REPEAT);
        this.f = new zs();
        this.g = new zs();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
