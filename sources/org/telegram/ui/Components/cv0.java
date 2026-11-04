package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cv0 extends Drawable {
    public final int a;
    public final int b;
    public final g5[] c;
    public final boolean e;
    public int d = org.telegram.messenger.hs.e4;
    public final RectF f = new RectF();
    public boolean g = false;

    public cv0(int i3, ArrayList arrayList, boolean z10) {
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new g5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.zi.I2((TLRPC.Document) arrayList.get(0));
        }
        int i10 = max < 2 ? 1 : 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            this.c[i11] = g5.l(i3, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.q1 q1Var) {
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3].n(q1Var);
        }
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c(ArrayList arrayList) {
        g5[] g5VarArr = this.c;
        if (g5VarArr.length == arrayList.size()) {
            for (int i3 = 0; i3 < g5VarArr.length; i3++) {
                TLRPC.Document document = g5VarArr[i3].e;
                if ((document == null ? 0L : document.id) == ((TLRPC.Document) arrayList.get(i3)).id) {
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
        g5 g5Var;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (org.telegram.messenger.g0.L(48.0f) / 2.0f);
        int L = org.telegram.messenger.g0.L(48.0f);
        int i3 = this.a;
        float f10 = L / i3;
        float L2 = org.telegram.messenger.g0.L(48.0f) / i3;
        canvas.save();
        canvas.clipRect(centerX, centerY, org.telegram.messenger.g0.L(48.0f) + centerX, org.telegram.messenger.g0.L(48.0f) + centerY);
        for (int i10 = 0; i10 < i3; i10++) {
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = (i10 * i3) + i11;
                if (i12 >= 0) {
                    g5[] g5VarArr = this.c;
                    if (i12 < g5VarArr.length && (g5Var = g5VarArr[i12]) != null) {
                        g5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        g5VarArr[i12].setAlpha(this.d);
                        g5VarArr[i12].setColorFilter(this.e ? org.telegram.ui.ActionBar.k6.w3 : org.telegram.ui.ActionBar.k6.v3);
                        g5VarArr[i12].draw(canvas);
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
    public final void setAlpha(int i3) {
        this.d = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
