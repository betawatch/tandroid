package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class h9 extends FrameLayout {
    public q5 a;
    public q5 b;
    public x9 c;
    public x9 d;
    public o20 e;
    public o20 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int v;
    public float w;
    public boolean x;
    public final g9 y;

    public h9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.r = i10;
        this.s = 0;
        this.v = 0;
        this.w = 1.0f;
        this.y = new g9((gm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.n = a2;
        this.c = new x9(context);
        this.d = new x9(context);
        addView(this.c, w7.x5.e(50, 50, 1));
        addView(this.d, w7.x5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            q5 q5Var = new q5(4, i10, a2.document_id.get(0).longValue());
            this.a = q5Var;
            this.c.setAnimatedEmojiDrawable(q5Var);
            b();
        }
        int[] iArr = f9.c0[this.s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        o20 o20Var = new o20();
        this.e = o20Var;
        o20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.x5.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i10) {
        TLRPC.TL_emojiList tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (stickerSets.isEmpty()) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i10).getFeaturedEmojiSets();
            for (int i11 = 0; i11 < featuredEmojiSets.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i11);
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
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.x = true;
            return;
        }
        q5 q5Var = new q5(4, this.r, tL_emojiList.document_id.get(i10).longValue());
        this.b = q5Var;
        q5Var.m = true;
        q5Var.v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o20 o20Var = this.e;
        if (o20Var != null) {
            o20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        o20 o20Var2 = this.f;
        if (o20Var2 != null) {
            o20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.w;
        if (f7 == 1.0f) {
            this.e.c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = pr.f.getInterpolation(f7);
            this.e.c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.f.c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f.c);
            this.w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.c.setAlpha(f10);
            this.c.setScaleX(f10);
            this.c.setScaleY(f10);
            this.c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(r1.getMeasuredHeight());
            if (this.w > 1.0f) {
                this.w = 1.0f;
                this.e = this.f;
                x9 x9Var = this.c;
                this.c = this.d;
                this.d = x9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public q5 getAnimatedEmoji() {
        return this.a;
    }

    public b9 getBackgroundGradient() {
        b9 b9Var = new b9();
        int[] iArr = f9.c0[this.s];
        b9Var.c = iArr[0];
        b9Var.d = iArr[1];
        b9Var.e = iArr[2];
        b9Var.f = iArr[3];
        return b9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.y, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.y);
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
