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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class y8 extends FrameLayout {
    public k5 a;
    public k5 b;
    public o9 c;
    public o9 d;
    public z10 e;
    public z10 f;
    public final TextView h;
    public final TLRPC.TL_emojiList n;
    public final int r;
    public int s;
    public int v;
    public float w;
    public boolean x;
    public final x8 y;

    public y8(Context context) {
        super(context);
        int i9 = UserConfig.selectedAccount;
        this.r = i9;
        this.s = 0;
        this.v = 0;
        this.w = 1.0f;
        this.y = new x8((xl) this);
        TLRPC.TL_emojiList a2 = a(i9);
        this.n = a2;
        this.c = new o9(context);
        this.d = new o9(context);
        addView(this.c, g7.e6.e(50, 50, 1));
        addView(this.d, g7.e6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            k5 k5Var = new k5(4, i9, a2.document_id.get(0).longValue());
            this.a = k5Var;
            this.c.setAnimatedEmojiDrawable(k5Var);
            b();
        }
        int[] iArr = w8.Y[this.s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        z10 z10Var = new z10();
        this.e = z10Var;
        z10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, g7.e6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i9) {
        TLRPC.TL_emojiList tL_emojiList = MediaDataController.getInstance(i9).groupAvatarConstructorDefault;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i9).getStickerSets(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (stickerSets.isEmpty()) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i9).getFeaturedEmojiSets();
            for (int i10 = 0; i10 < featuredEmojiSets.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
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
            for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i11);
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
        int i9 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.n;
        if (i9 > tL_emojiList.document_id.size() - 1) {
            this.x = true;
            return;
        }
        k5 k5Var = new k5(4, this.r, tL_emojiList.document_id.get(i9).longValue());
        this.b = k5Var;
        k5Var.m = true;
        k5Var.v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z10 z10Var = this.e;
        if (z10Var != null) {
            z10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        z10 z10Var2 = this.f;
        if (z10Var2 != null) {
            z10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.w;
        if (f10 == 1.0f) {
            this.e.c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = gr.f.getInterpolation(f10);
            this.e.c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.c);
            this.f.c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f.c);
            this.w += 0.064f;
            float f11 = 1.0f - interpolation;
            this.c.setAlpha(f11);
            this.c.setScaleX(f11);
            this.c.setScaleY(f11);
            this.c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(r1.getMeasuredHeight());
            if (this.w > 1.0f) {
                this.w = 1.0f;
                this.e = this.f;
                o9 o9Var = this.c;
                this.c = this.d;
                this.d = o9Var;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public k5 getAnimatedEmoji() {
        return this.a;
    }

    public s8 getBackgroundGradient() {
        s8 s8Var = new s8();
        int[] iArr = w8.Y[this.s];
        s8Var.c = iArr[0];
        s8Var.d = iArr[1];
        s8Var.e = iArr[2];
        s8Var.f = iArr[3];
        return s8Var;
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
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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
