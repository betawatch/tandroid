package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o40 {
    public final int a;
    public org.telegram.messenger.g6 c;
    public org.telegram.ui.Components.f5 d;
    public boolean e;
    public boolean f;
    public long g;
    public String l;
    public final Drawable[] b = new Drawable[6];
    public final li.k h = new li.k(23);
    public final HashSet i = new HashSet();
    public boolean j = false;
    public final n40 k = new n40(this, 0);
    public final RectF m = new RectF();

    public o40(int i10) {
        int i11 = 0;
        this.a = i10;
        while (true) {
            Drawable[] drawableArr = this.b;
            if (i11 >= drawableArr.length) {
                this.g = System.currentTimeMillis();
                return;
            } else {
                drawableArr[i11] = org.telegram.messenger.k6.g(b50.L0());
                i11++;
            }
        }
    }

    public final void a() {
        boolean isEmpty = this.i.isEmpty();
        boolean z10 = !isEmpty;
        if (this.j != z10) {
            this.j = z10;
            n40 n40Var = this.k;
            if (isEmpty) {
                org.telegram.ui.Components.f5 f5Var = this.d;
                if (f5Var != null) {
                    f5Var.o(n40Var);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.f5 f5Var2 = this.d;
            if (f5Var2 != null) {
                f5Var2.b(n40Var);
            }
        }
    }

    public final boolean b(Canvas canvas, RectF rectF, float f7) {
        long j10;
        float f10;
        float L = org.telegram.messenger.i0.L(6.0f);
        RectF rectF2 = this.m;
        rectF2.set(rectF);
        float f11 = -L;
        rectF2.inset(f11, f11);
        canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, org.telegram.messenger.zs.e4, 31);
        long currentTimeMillis = (this.a * 45) + System.currentTimeMillis();
        long j11 = currentTimeMillis - this.g;
        float f12 = j11 / 180.0f;
        float min = Math.min(1.0f, f12);
        boolean z10 = this.f;
        Drawable[] drawableArr = this.b;
        boolean z11 = false;
        if (!z10 || this.d == null || this.c == null || !this.e) {
            j10 = j11;
            canvas.save();
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + L) * (min - 1.0f));
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[1].setAlpha(org.telegram.messenger.zs.L1);
            drawableArr[1].draw(canvas);
            drawableArr[1].setAlpha(org.telegram.messenger.zs.e4);
            canvas.restore();
        } else {
            rectF2.set(rectF);
            rectF2.offset(0.0f, (min - 1.0f) * (rectF.height() + L));
            if (f7 < 1.0f) {
                canvas.save();
                f10 = 0.0f;
                j10 = j11;
                this.c.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.c.setAlpha((int) ((1.0f - f7) * 255.0f));
                this.c.draw(canvas);
                this.c.setAlpha(org.telegram.messenger.zs.e4);
                canvas.restore();
            } else {
                j10 = j11;
                f10 = 0.0f;
            }
            if (f7 > f10) {
                canvas.save();
                rectF2.inset(org.telegram.messenger.i0.L(-4.0f), org.telegram.messenger.i0.L(-4.0f));
                this.d.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                canvas.translate(rectF2.left, rectF2.top);
                this.d.setAlpha((int) (f7 * 255.0f));
                this.d.draw(canvas);
                this.d.setAlpha(org.telegram.messenger.zs.e4);
                canvas.restore();
            }
        }
        rectF2.set(rectF);
        rectF2.offset(0.0f, (rectF.height() + L) * min);
        canvas.save();
        canvas.translate(rectF2.left, rectF2.top);
        drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
        drawableArr[0].setAlpha(org.telegram.messenger.zs.L1);
        drawableArr[0].draw(canvas);
        drawableArr[0].setAlpha(org.telegram.messenger.zs.e4);
        canvas.restore();
        if (f12 >= 1.0f) {
            if (this.f && this.e) {
                z11 = true;
            } else {
                this.g = currentTimeMillis - (j10 % 180);
                int i10 = 0;
                while (i10 < drawableArr.length - 1) {
                    int i11 = i10 + 1;
                    drawableArr[i10] = drawableArr[i11];
                    i10 = i11;
                }
                drawableArr[drawableArr.length - 1] = org.telegram.messenger.k6.g(b50.L0());
                if (this.f) {
                    this.e = true;
                }
            }
        }
        rectF2.set(rectF);
        float f13 = (int) f11;
        rectF2.inset(f13, f13);
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        rectF2.set(f14, f15, rectF2.right, f15 + L);
        li.k kVar = this.h;
        kVar.o(canvas, rectF2, 1, 1.0f);
        rectF2.set(rectF);
        rectF2.inset(f13, f13);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        rectF2.set(f16, f17 - L, rectF2.right, f17);
        kVar.o(canvas, rectF2, 3, 1.0f);
        canvas.restore();
        return !z11;
    }

    public final void c() {
        TLRPC.Document document;
        if (this.d == null || this.l == null) {
            return;
        }
        int l4 = org.telegram.messenger.d20.l();
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
        TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(l4).l0(tL_inputStickerSetShortName, 0, false, true, new s3(this, 8));
        if (l02 == null) {
            return;
        }
        String replace = this.l.replace("️", "");
        ArrayList<TLRPC.Document> arrayList = l02.documents;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            document = null;
            if (i10 >= size) {
                break;
            }
            TLRPC.Document document2 = arrayList.get(i10);
            i10++;
            TLRPC.Document document3 = document2;
            if (TextUtils.equals(org.telegram.messenger.jj.V(document3, null, null).replace("️", ""), replace)) {
                document = document3;
                break;
            }
        }
        if (document != null) {
            org.telegram.ui.Components.f5 f5Var = this.d;
            f5Var.e = document;
            f5Var.i(false);
        } else {
            org.telegram.messenger.f8.d("emoji \"" + this.l + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
        }
    }
}
