package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ug extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final xi0 f;
    public boolean h;
    public final /* synthetic */ ChatActivityEnterView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.n = chatActivityEnterView;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = xi0Var;
        xi0Var.p0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.jf;
        int i11 = ChatActivityEnterView.m5;
        ChatActivityEnterView chatActivityEnterView = this.n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.v3.setColor(i02);
        xi0 xi0Var = this.f;
        xi0Var.a0 = true;
        xi0Var.O(i02, "Cup Red");
        xi0Var.O(i02, "Box");
        xi0Var.O(i03, "Line 1");
        xi0Var.O(i03, "Line 2");
        xi0Var.O(i03, "Line 3");
        xi0Var.m();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        xi0 xi0Var = this.f;
        if (z10) {
            xi0Var.start();
        }
        xi0Var.v0 = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xi0 xi0Var = this.f;
        xi0Var.stop();
        xi0Var.v0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.n.v3;
        boolean z10 = this.e;
        xi0 xi0Var = this.f;
        if (z10) {
            xi0Var.setAlpha((int) (this.a * 255.0f));
        }
        paint.setAlpha((int) (this.a * 255.0f));
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        if (this.h) {
            this.a = 1.0f;
        } else if (this.c || this.e) {
            float f7 = (currentTimeMillis / 600.0f) + this.a;
            this.a = f7;
            if (f7 >= 1.0f) {
                this.a = 1.0f;
                this.c = false;
            }
        } else {
            float f10 = this.a - (currentTimeMillis / 600.0f);
            this.a = f10;
            if (f10 <= 0.0f) {
                this.a = 0.0f;
                this.c = true;
            }
        }
        this.b = System.currentTimeMillis();
        if (this.e) {
            xi0Var.draw(canvas);
        }
        if (!this.e || !xi0Var.s()) {
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
