package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ag extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ch0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        ch0 ch0Var = new ch0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f = ch0Var;
        ch0Var.p0 = true;
        b();
    }

    public final void a() {
        this.e = true;
        ch0 ch0Var = this.f;
        ch0Var.T(true, 0.0f);
        if (this.d) {
            ch0Var.start();
        }
    }

    public final void b() {
        int i3 = org.telegram.ui.ActionBar.k6.Xf;
        int i10 = ChatActivityEnterView.t5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int f02 = chatActivityEnterView.f0(i3);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sf);
        chatActivityEnterView.x3.setColor(f02);
        ch0 ch0Var = this.f;
        ch0Var.a0 = true;
        ch0Var.Q(f02, "Cup Red");
        ch0Var.Q(f02, "Box Red");
        ch0Var.Q(f04, "Cup Grey");
        ch0Var.Q(f04, "Box Grey");
        ch0Var.Q(f04, "Box_Grey 2");
        ch0Var.Q(f04, "Line 1");
        ch0Var.Q(f04, "Line 2");
        ch0Var.Q(f04, "Line 3");
        ch0Var.Q(f03, "Line 1 Dup");
        ch0Var.Q(f03, "Line 2 Dup");
        ch0Var.Q(f03, "Line 3 Dup");
        ch0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        ch0 ch0Var = this.f;
        if (z10) {
            ch0Var.start();
        }
        ch0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ch0 ch0Var = this.f;
        ch0Var.stop();
        ch0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.x3;
        boolean z10 = this.e;
        ch0 ch0Var = this.f;
        if (z10) {
            ch0Var.setAlpha((int) (this.a * 255.0f));
        }
        paint.setAlpha((int) (this.a * 255.0f));
        if (!this.n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.b;
            if (this.h) {
                this.a = 1.0f;
            } else if (this.c || this.e) {
                float f10 = (j10 / 600.0f) + this.a;
                this.a = f10;
                if (f10 >= 1.0f) {
                    this.a = 1.0f;
                    this.c = false;
                }
            } else {
                float f11 = this.a - (j10 / 600.0f);
                this.a = f11;
                if (f11 <= 0.0f) {
                    this.a = 0.0f;
                    this.c = true;
                }
            }
            this.b = currentTimeMillis;
        }
        if (this.e) {
            ch0Var.draw(canvas);
        }
        if (!this.e || !ch0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (this.n) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
