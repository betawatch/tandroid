package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yf extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ci0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        ci0 ci0Var = new ci0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.f = ci0Var;
        ci0Var.o0 = true;
        b();
    }

    public final void a() {
        this.e = true;
        ci0 ci0Var = this.f;
        ci0Var.T(true, 0.0f);
        if (this.d) {
            ci0Var.start();
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
        ci0 ci0Var = this.f;
        ci0Var.Z = true;
        ci0Var.Q(e02, "Cup Red");
        ci0Var.Q(e02, "Box Red");
        ci0Var.Q(e04, "Cup Grey");
        ci0Var.Q(e04, "Box Grey");
        ci0Var.Q(e04, "Box_Grey 2");
        ci0Var.Q(e04, "Line 1");
        ci0Var.Q(e04, "Line 2");
        ci0Var.Q(e04, "Line 3");
        ci0Var.Q(e03, "Line 1 Dup");
        ci0Var.Q(e03, "Line 2 Dup");
        ci0Var.Q(e03, "Line 3 Dup");
        ci0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        ci0 ci0Var = this.f;
        if (z10) {
            ci0Var.start();
        }
        ci0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ci0 ci0Var = this.f;
        ci0Var.stop();
        ci0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z10 = this.e;
        ci0 ci0Var = this.f;
        if (z10) {
            ci0Var.setAlpha((int) (this.a * 255.0f));
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
            ci0Var.draw(canvas);
        }
        if (!this.e || !ci0Var.u()) {
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
