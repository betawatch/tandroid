package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class v8 extends FrameLayout {
    public final u8 D;
    public i5 a;
    public i5 b;
    public l9 c;
    public l9 d;
    public f10 e;
    public f10 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public v8(Context context) {
        super(context);
        int i7 = org.telegram.messenger.p10.s0;
        this.r = i7;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.D = new u8((sl) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.n = a10;
        this.c = new l9(context);
        this.d = new l9(context);
        addView(this.c, c8.ha.e(50, 50, 1));
        addView(this.d, c8.ha.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            i5 i5Var = new i5(4, i7, a10.document_id.get(0).longValue());
            this.a = i5Var;
            this.c.setAnimatedEmojiDrawable(i5Var);
            b();
        }
        int[] iArr = t8.c0[this.s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        f10 f10Var = new f10();
        this.e = f10Var;
        f10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.id.M0(2131743800, null));
        addView(textView, c8.ha.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ui.b0(i7).K1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(i7).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ui.b0(i7).s0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < s02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.c.nextLong()) % tL_messages_stickerSet.documents.size())).id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.y) {
            return;
        }
        int i7 = this.w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.y = true;
            return;
        }
        i5 i5Var = new i5(4, this.r, tL_emojiList.document_id.get(i7).longValue());
        this.b = i5Var;
        i5Var.m = true;
        i5Var.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f10 f10Var = this.e;
        if (f10Var != null) {
            f10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        f10 f10Var2 = this.f;
        if (f10Var2 != null) {
            f10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.x;
        if (f10 == 1.0f) {
            this.e.c.setAlpha(org.telegram.messenger.qs.e4);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = xq.f.getInterpolation(f10);
            this.e.c.setAlpha(org.telegram.messenger.qs.e4);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.f.c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f.c);
            this.x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.c.setAlpha(f11);
            this.c.setScaleX(f11);
            this.c.setScaleY(f11);
            this.c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(r1.getMeasuredHeight());
            if (this.x > 1.0f) {
                this.x = 1.0f;
                this.e = this.f;
                l9 l9Var = this.c;
                this.c = this.d;
                this.d = l9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public i5 getAnimatedEmoji() {
        return this.a;
    }

    public p8 getBackgroundGradient() {
        p8 p8Var = new p8();
        int[] iArr = t8.c0[this.s];
        p8Var.c = iArr[0];
        p8Var.d = iArr[1];
        p8Var.e = iArr[2];
        p8Var.f = iArr[3];
        return p8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.D, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.D);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int top = (int) (this.h.getTop() * 0.7f);
        int i11 = (int) ((r3 - top) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        this.c.getLayoutParams().height = top;
        layoutParams.width = top;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = top;
        layoutParams2.width = top;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = i11;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i11;
    }
}
