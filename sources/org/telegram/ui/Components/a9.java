package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class a9 extends FrameLayout {
    public final z8 E;
    public p5 a;
    public p5 b;
    public q9 c;
    public q9 d;
    public s10 e;
    public s10 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int w;
    public float x;
    public boolean y;

    public a9(Context context) {
        super(context);
        int i7 = org.telegram.messenger.j10.t0;
        this.r = i7;
        this.s = 0;
        this.w = 0;
        this.x = 1.0f;
        this.E = new z8((im) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.n = a10;
        this.c = new q9(context);
        this.d = new q9(context);
        addView(this.c, c8.ma.e(50, 50, 1));
        addView(this.d, c8.ma.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            p5 p5Var = new p5(4, i7, a10.document_id.get(0).longValue());
            this.a = p5Var;
            this.c.setAnimatedEmojiDrawable(p5Var);
            b();
        }
        int[] iArr = y8.d0[this.s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        s10 s10Var = new s10();
        this.e = s10Var;
        s10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.gd.N0(2131743554, null));
        addView(textView, c8.ma.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
        p5 p5Var = new p5(4, this.r, tL_emojiList.document_id.get(i7).longValue());
        this.b = p5Var;
        p5Var.m = true;
        p5Var.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s10 s10Var = this.e;
        if (s10Var != null) {
            s10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        s10 s10Var2 = this.f;
        if (s10Var2 != null) {
            s10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            float interpolation = nr.f.getInterpolation(f10);
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
                q9 q9Var = this.c;
                this.c = this.d;
                this.d = q9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public p5 getAnimatedEmoji() {
        return this.a;
    }

    public u8 getBackgroundGradient() {
        u8 u8Var = new u8();
        int[] iArr = y8.d0[this.s];
        u8Var.c = iArr[0];
        u8Var.d = iArr[1];
        u8Var.e = iArr[2];
        u8Var.f = iArr[3];
        return u8Var;
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
