package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class z8 extends FrameLayout {
    public final y8 E;
    public o5 a;
    public o5 b;
    public p9 c;
    public p9 d;
    public q10 e;
    public q10 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public z8(Context context) {
        super(context);
        int i7 = org.telegram.messenger.i10.t0;
        this.r = i7;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.E = new y8((gm) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.n = a10;
        this.c = new p9(context);
        this.d = new p9(context);
        addView(this.c, c8.na.e(50, 50, 1));
        addView(this.d, c8.na.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            o5 o5Var = new o5(4, i7, a10.document_id.get(0).longValue());
            this.a = o5Var;
            this.c.setAnimatedEmojiDrawable(o5Var);
            b();
        }
        int[] iArr = x8.d0[this.s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        q10 q10Var = new q10();
        this.e = q10Var;
        q10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.gd.N0(2131743550, null));
        addView(textView, c8.na.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ri.d0(i7).N1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList u02 = org.telegram.messenger.ri.d0(i7).u0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (u02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ri.d0(i7).t0[1];
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
            for (int i11 = 0; i11 < u02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u02.get(i11);
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
        o5 o5Var = new o5(4, this.r, tL_emojiList.document_id.get(i7).longValue());
        this.b = o5Var;
        o5Var.m = true;
        o5Var.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q10 q10Var = this.e;
        if (q10Var != null) {
            q10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        q10 q10Var2 = this.f;
        if (q10Var2 != null) {
            q10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.x;
        if (f10 == 1.0f) {
            this.e.c.setAlpha(org.telegram.messenger.ks.e4);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = kr.f.getInterpolation(f10);
            this.e.c.setAlpha(org.telegram.messenger.ks.e4);
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
                p9 p9Var = this.c;
                this.c = this.d;
                this.d = p9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public o5 getAnimatedEmoji() {
        return this.a;
    }

    public t8 getBackgroundGradient() {
        t8 t8Var = new t8();
        int[] iArr = x8.d0[this.s];
        t8Var.c = iArr[0];
        t8Var.d = iArr[1];
        t8Var.e = iArr[2];
        t8Var.f = iArr[3];
        return t8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.E, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.E);
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
