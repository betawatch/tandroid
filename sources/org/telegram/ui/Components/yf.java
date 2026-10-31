package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yf extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final bi0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        bi0 bi0Var = new bi0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.f = bi0Var;
        bi0Var.o0 = true;
        b();
    }

    public final void a() {
        this.e = true;
        bi0 bi0Var = this.f;
        bi0Var.T(true, 0.0f);
        if (this.d) {
            bi0Var.start();
        }
    }

    public final void b() {
        int i10 = org.telegram.ui.ActionBar.t6.Xf;
        int i11 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int e02 = chatActivityEnterView.e0(i10);
        int e03 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Ge);
        int e04 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Sf);
        chatActivityEnterView.w3.setColor(e02);
        bi0 bi0Var = this.f;
        bi0Var.Z = true;
        bi0Var.Q(e02, "Cup Red");
        bi0Var.Q(e02, "Box Red");
        bi0Var.Q(e04, "Cup Grey");
        bi0Var.Q(e04, "Box Grey");
        bi0Var.Q(e04, "Box_Grey 2");
        bi0Var.Q(e04, "Line 1");
        bi0Var.Q(e04, "Line 2");
        bi0Var.Q(e04, "Line 3");
        bi0Var.Q(e03, "Line 1 Dup");
        bi0Var.Q(e03, "Line 2 Dup");
        bi0Var.Q(e03, "Line 3 Dup");
        bi0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        bi0 bi0Var = this.f;
        if (z10) {
            bi0Var.start();
        }
        bi0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        bi0 bi0Var = this.f;
        bi0Var.stop();
        bi0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z10 = this.e;
        bi0 bi0Var = this.f;
        if (z10) {
            bi0Var.setAlpha((int) (this.a * 255.0f));
        }
        paint.setAlpha((int) (this.a * 255.0f));
        if (!this.n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.b;
            if (this.h) {
                this.a = 1.0f;
            } else if (this.c || this.e) {
                float f7 = (j10 / 600.0f) + this.a;
                this.a = f7;
                if (f7 >= 1.0f) {
                    this.a = 1.0f;
                    this.c = false;
                }
            } else {
                float f10 = this.a - (j10 / 600.0f);
                this.a = f10;
                if (f10 <= 0.0f) {
                    this.a = 0.0f;
                    this.c = true;
                }
            }
            this.b = currentTimeMillis;
        }
        if (this.e) {
            bi0Var.draw(canvas);
        }
        if (!this.e || !bi0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.i0.L(5.0f), paint);
        }
        if (this.n) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
