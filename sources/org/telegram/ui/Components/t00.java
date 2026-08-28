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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t00 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public t00(org.telegram.ui.Cells.t1 t1Var) {
        this.c = new Path();
        this.d = new Rect();
        this.f = new RectF();
        this.b = t1Var;
        this.e = new pc(t1Var, 0.8f, 1.4f);
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
            p80 p80Var = (p80) this.h;
            if (p80Var == null) {
                p80 p80Var2 = new p80();
                this.h = p80Var2;
                p80Var2.C = true;
            } else if (p80Var.b() || ((p80) this.h).c()) {
                p80 p80Var3 = (p80) this.h;
                p80Var3.b = -1L;
                p80Var3.c = -1L;
            }
        } else {
            p80 p80Var4 = (p80) this.h;
            if (p80Var4 != null && !p80Var4.c() && !((p80) this.h).b()) {
                ((p80) this.h).a();
            }
        }
        canvas.restore();
        p80 p80Var5 = (p80) this.h;
        if (p80Var5 == null || p80Var5.b()) {
            return;
        }
        p80 p80Var6 = (p80) this.h;
        p80Var6.x = path;
        p80Var6.f(org.telegram.ui.ActionBar.f6.l1(0.7f, this.a), org.telegram.ui.ActionBar.f6.l1(1.3f, this.a), org.telegram.ui.ActionBar.f6.l1(1.5f, this.a), org.telegram.ui.ActionBar.f6.l1(2.0f, this.a));
        ((p80) this.h).setBounds(rect);
        canvas.save();
        ((p80) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.t1) this.b).invalidate();
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float dp;
        RectF rectF = (RectF) this.f;
        int textSize = (((int) org.telegram.ui.ActionBar.f6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(org.telegram.ui.Cells.j2.b(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(r2);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(r2);
        Path path = (Path) this.c;
        path.rewind();
        if (!z10) {
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
                float z11 = e2.c.z(dp2, f11, 0.45f, f11);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(max2 - dp, f11, max2, f11 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - dp4, dp4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f13 = lineWidth2 - (dp2 - z11);
                rectF.set(f13, z11, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f13, z11, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = e2.c.z(dp2, f11, 0.55f, f11);
                float f14 = z12 - f11;
                rectF.set(max2 - f14, f11, max2, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f14, f11, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + dp4, dp4 + z12);
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

    public void c(int i9) {
        if (this.a != i9) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.g;
            if (zVar == null) {
                this.g = org.telegram.ui.ActionBar.f6.f0(i9, 2, -1);
            } else {
                org.telegram.ui.ActionBar.f6.B1(zVar, i9, true);
            }
            ((org.telegram.ui.Cells.z) this.g).setCallback((org.telegram.ui.Cells.t1) this.b);
            this.a = i9;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((pc) this.e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{R.attr.state_enabled, R.attr.state_pressed} : new int[0]);
        }
        ((org.telegram.ui.Cells.t1) this.b).invalidate();
    }

    public t00() {
        Paint paint = new Paint();
        this.b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.c = new nb0(tileMode);
        this.d = new nb0(tileMode);
        this.e = new nb0(Shader.TileMode.REPEAT);
        this.f = new us();
        this.g = new us();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
