package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kg extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final mi0 f;
    public boolean h;
    public final /* synthetic */ ChatActivityEnterView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.n = chatActivityEnterView;
        int i9 = R.raw.chat_audio_record_delete_2;
        mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = mi0Var;
        mi0Var.l0 = true;
        a();
    }

    public final void a() {
        int i9 = org.telegram.ui.ActionBar.f6.jf;
        int i10 = ChatActivityEnterView.i5;
        ChatActivityEnterView chatActivityEnterView = this.n;
        int h02 = chatActivityEnterView.h0(i9);
        int h03 = chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.Sd);
        chatActivityEnterView.r3.setColor(h02);
        mi0 mi0Var = this.f;
        mi0Var.W = true;
        mi0Var.O(h02, "Cup Red");
        mi0Var.O(h02, "Box");
        mi0Var.O(h03, "Line 1");
        mi0Var.O(h03, "Line 2");
        mi0Var.O(h03, "Line 3");
        mi0Var.m();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        mi0 mi0Var = this.f;
        if (z10) {
            mi0Var.start();
        }
        mi0Var.r0 = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        mi0 mi0Var = this.f;
        mi0Var.stop();
        mi0Var.r0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.n.r3;
        boolean z10 = this.e;
        mi0 mi0Var = this.f;
        if (z10) {
            mi0Var.setAlpha((int) (this.a * 255.0f));
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
            mi0Var.draw(canvas);
        }
        if (!this.e || !mi0Var.s()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
