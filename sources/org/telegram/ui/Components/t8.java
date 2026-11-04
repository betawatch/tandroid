package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class t8 extends FrameLayout {
    public final s8 E;
    public g5 a;
    public g5 b;
    public k9 c;
    public k9 d;
    public b10 e;
    public b10 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public t8(Context context) {
        super(context);
        int i3 = org.telegram.messenger.h10.t0;
        this.r = i3;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.E = new s8((rl) this);
        TLRPC.TL_emojiList a10 = a(i3);
        this.n = a10;
        this.c = new k9(context);
        this.d = new k9(context);
        addView(this.c, b8.mf.e(50, 50, 1));
        addView(this.d, b8.mf.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            g5 g5Var = new g5(4, i3, a10.document_id.get(0).longValue());
            this.a = g5Var;
            this.c.setAnimatedEmojiDrawable(g5Var);
            b();
        }
        int[] iArr = r8.d0[this.s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        b10 b10Var = new b10();
        this.e = b10Var;
        b10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.bd.M0(2131743807, null));
        addView(textView, b8.mf.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i3) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.li.b0(i3).L1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.li.b0(i3).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.li.b0(i3).t0[1];
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
        int i3 = this.w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.n;
        if (i3 > tL_emojiList.document_id.size() - 1) {
            this.y = true;
            return;
        }
        g5 g5Var = new g5(4, this.r, tL_emojiList.document_id.get(i3).longValue());
        this.b = g5Var;
        g5Var.m = true;
        g5Var.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b10 b10Var = this.e;
        if (b10Var != null) {
            b10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        b10 b10Var2 = this.f;
        if (b10Var2 != null) {
            b10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.x;
        if (f10 == 1.0f) {
            this.e.c.setAlpha(org.telegram.messenger.hs.e4);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = xq.f.getInterpolation(f10);
            this.e.c.setAlpha(org.telegram.messenger.hs.e4);
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
                k9 k9Var = this.c;
                this.c = this.d;
                this.d = k9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public g5 getAnimatedEmoji() {
        return this.a;
    }

    public n8 getBackgroundGradient() {
        n8 n8Var = new n8();
        int[] iArr = r8.d0[this.s];
        n8Var.c = iArr[0];
        n8Var.d = iArr[1];
        n8Var.e = iArr[2];
        n8Var.f = iArr[3];
        return n8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.E, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.E);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
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
