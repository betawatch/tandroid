package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gg extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final oi0 f;
    public boolean h;
    public final /* synthetic */ ChatActivityEnterView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        oi0 oi0Var = new oi0(i10, i0.a.k(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = oi0Var;
        oi0Var.l0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.jf;
        int i11 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.Sd);
        chatActivityEnterView.r3.setColor(i02);
        oi0 oi0Var = this.f;
        oi0Var.W = true;
        oi0Var.O(i02, "Cup Red");
        oi0Var.O(i02, "Box");
        oi0Var.O(i03, "Line 1");
        oi0Var.O(i03, "Line 2");
        oi0Var.O(i03, "Line 3");
        oi0Var.m();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        oi0 oi0Var = this.f;
        if (z10) {
            oi0Var.start();
        }
        oi0Var.r0 = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        oi0 oi0Var = this.f;
        oi0Var.stop();
        oi0Var.r0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.n.r3;
        boolean z10 = this.e;
        oi0 oi0Var = this.f;
        if (z10) {
            oi0Var.setAlpha((int) (this.a * 255.0f));
        }
        paint.setAlpha((int) (this.a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        if (this.h) {
            this.a = 1.0f;
        } else if (this.c || this.e) {
            float f10 = (currentTimeMillis / 600.0f) + this.a;
            this.a = f10;
            if (f10 >= 1.0f) {
                this.a = 1.0f;
                this.c = false;
            }
        } else {
            float f11 = this.a - (currentTimeMillis / 600.0f);
            this.a = f11;
            if (f11 <= 0.0f) {
                this.a = 0.0f;
                this.c = true;
            }
        }
        this.b = System.currentTimeMillis();
        if (this.e) {
            oi0Var.draw(canvas);
        }
        if (!this.e || !oi0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
