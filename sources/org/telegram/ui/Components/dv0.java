package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dv0 extends Drawable {
    public final int a;
    public final int b;
    public final i5[] c;
    public final boolean e;
    public int d = org.telegram.messenger.qs.e4;
    public final RectF f = new RectF();
    public boolean g = false;

    public dv0(int i7, ArrayList arrayList, boolean z9) {
        this.e = z9;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new i5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.ij.I2((TLRPC.Document) arrayList.get(0));
        }
        int i10 = max < 2 ? 1 : 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            this.c[i11] = i5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i7 = 0; i7 < this.b; i7++) {
            this.c[i7].n(q1Var);
        }
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c(ArrayList arrayList) {
        i5[] i5VarArr = this.c;
        if (i5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < i5VarArr.length; i7++) {
                TLRPC.Document document = i5VarArr[i7].e;
                if ((document == null ? 0L : document.id) == ((TLRPC.Document) arrayList.get(i7)).id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.g = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        i5 i5Var;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i7 = this.a;
        float f10 = L / i7;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i7;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i10 * i7) + i11;
                if (i12 >= 0) {
                    i5[] i5VarArr = this.c;
                    if (i12 < i5VarArr.length && (i5Var = i5VarArr[i12]) != null) {
                        i5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        i5VarArr[i12].setAlpha(this.d);
                        i5VarArr[i12].setColorFilter(this.e ? org.telegram.ui.ActionBar.k6.w3 : org.telegram.ui.ActionBar.k6.v3);
                        i5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
