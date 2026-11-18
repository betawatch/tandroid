package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nv0 extends Drawable {
    public final int a;
    public final int b;
    public final o5[] c;
    public final boolean e;
    public int d = org.telegram.messenger.ks.e4;
    public final RectF f = new RectF();
    public boolean g = false;

    public nv0(int i7, ArrayList arrayList, boolean z10) {
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new o5[min];
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.fj.H2((TLRPC.Document) arrayList.get(0));
        }
        int i10 = max < 2 ? 1 : 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            this.c[i11] = o5.l(i7, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.r1 r1Var) {
        for (int i7 = 0; i7 < this.b; i7++) {
            this.c[i7].n(r1Var);
        }
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c(ArrayList arrayList) {
        o5[] o5VarArr = this.c;
        if (o5VarArr.length == arrayList.size()) {
            for (int i7 = 0; i7 < o5VarArr.length; i7++) {
                TLRPC.Document document = o5VarArr[i7].e;
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
        o5 o5Var;
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
                    o5[] o5VarArr = this.c;
                    if (i12 < o5VarArr.length && (o5Var = o5VarArr[i12]) != null) {
                        o5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * L2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * L2) + centerY));
                        o5VarArr[i12].setAlpha(this.d);
                        o5VarArr[i12].setColorFilter(this.e ? org.telegram.ui.ActionBar.n6.w3 : org.telegram.ui.ActionBar.n6.v3);
                        o5VarArr[i12].draw(canvas);
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
