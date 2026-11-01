package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j81 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ k91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j81(k91 k91Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = k91Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = k91Var;
                this.b = new RectF();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                k91 k91Var = this.c;
                j81 j81Var = k91Var.E0;
                a91 a91Var = k91Var.y0;
                l81 l81Var = k91Var.a;
                org.telegram.ui.ActionBar.t6.t(j81Var, a91Var, l81Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                k91 k91Var2 = this.c;
                j81 j81Var2 = k91Var2.F0;
                a91 a91Var2 = k91Var2.y0;
                l81 l81Var2 = k91Var2.a;
                org.telegram.ui.ActionBar.t6.t(j81Var2, a91Var2, l81Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l81Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
