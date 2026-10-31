package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class q8 extends FrameLayout {
    public final p8 D;
    public f5 a;
    public f5 b;
    public g9 c;
    public g9 d;
    public u10 e;
    public u10 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public q8(Context context) {
        super(context);
        int i10 = org.telegram.messenger.d20.s0;
        this.r = i10;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.D = new p8((am) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.n = a2;
        this.c = new g9(context);
        this.d = new g9(context);
        addView(this.c, w7.b6.e(50, 50, 1));
        addView(this.d, w7.b6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            f5 f5Var = new f5(4, i10, a2.document_id.get(0).longValue());
            this.a = f5Var;
            this.c.setAnimatedEmojiDrawable(f5Var);
            b();
        }
        int[] iArr = o8.c0[this.s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        u10 u10Var = new u10();
        this.e = u10Var;
        u10Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.J7, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.cd.L0(2131743823, null));
        addView(textView, w7.b6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i10) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ui.b0(i10).K1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ui.b0(i10).s0[1];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
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
            for (int i12 = 0; i12 < s02.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
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
        int i10 = this.w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.y = true;
            return;
        }
        f5 f5Var = new f5(4, this.r, tL_emojiList.document_id.get(i10).longValue());
        this.b = f5Var;
        f5Var.m = true;
        f5Var.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u10 u10Var = this.e;
        if (u10Var != null) {
            u10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        u10 u10Var2 = this.f;
        if (u10Var2 != null) {
            u10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.x;
        if (f7 == 1.0f) {
            this.e.c.setAlpha(org.telegram.messenger.zs.e4);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = gr.f.getInterpolation(f7);
            this.e.c.setAlpha(org.telegram.messenger.zs.e4);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.f.c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f.c);
            this.x += 0.064f;
            float f10 = 1.0f - interpolation;
            this.c.setAlpha(f10);
            this.c.setScaleX(f10);
            this.c.setScaleY(f10);
            this.c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(r1.getMeasuredHeight());
            if (this.x > 1.0f) {
                this.x = 1.0f;
                this.e = this.f;
                g9 g9Var = this.c;
                this.c = this.d;
                this.d = g9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public f5 getAnimatedEmoji() {
        return this.a;
    }

    public k8 getBackgroundGradient() {
        k8 k8Var = new k8();
        int[] iArr = o8.c0[this.s];
        k8Var.c = iArr[0];
        k8Var.d = iArr[1];
        k8Var.e = iArr[2];
        k8Var.f = iArr[3];
        return k8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.h3(this.D, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.D);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = (int) (this.h.getTop() * 0.7f);
        int i12 = (int) ((r3 - top) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        this.c.getLayoutParams().height = top;
        layoutParams.width = top;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = top;
        layoutParams2.width = top;
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
