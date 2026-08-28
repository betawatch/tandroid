package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jw0 extends Drawable {
    public final int a;
    public final int b;
    public final k5[] c;
    public final boolean e;
    public int d = 255;
    public final RectF f = new RectF();
    public boolean g = false;

    public jw0(int i9, ArrayList arrayList, boolean z10) {
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new k5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        int i10 = max < 2 ? 1 : 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            this.c[i11] = k5.m(i9, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.t1 t1Var) {
        for (int i9 = 0; i9 < this.b; i9++) {
            this.c[i9].o(t1Var);
        }
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c(ArrayList arrayList) {
        k5[] k5VarArr = this.c;
        if (k5VarArr.length == arrayList.size()) {
            for (int i9 = 0; i9 < k5VarArr.length; i9++) {
                TLRPC.Document document = k5VarArr[i9].e;
                if ((document == null ? 0L : document.id) == ((TLRPC.Document) arrayList.get(i9)).id) {
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
        k5 k5Var;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i9 = this.a;
        float f10 = dp / i9;
        float dp2 = AndroidUtilities.dp(48.0f) / i9;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = (i10 * i9) + i11;
                if (i12 >= 0) {
                    k5[] k5VarArr = this.c;
                    if (i12 < k5VarArr.length && (k5Var = k5VarArr[i12]) != null) {
                        k5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * dp2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * dp2) + centerY));
                        k5VarArr[i12].setAlpha(this.d);
                        k5VarArr[i12].setColorFilter(this.e ? org.telegram.ui.ActionBar.f6.w3 : org.telegram.ui.ActionBar.f6.v3);
                        k5VarArr[i12].draw(canvas);
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
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.d = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
