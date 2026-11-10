package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bg extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final zg0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        zg0 zg0Var = new zg0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.f = zg0Var;
        zg0Var.o0 = true;
        b();
    }

    public final void a() {
        this.e = true;
        zg0 zg0Var = this.f;
        zg0Var.T(true, 0.0f);
        if (this.d) {
            zg0Var.start();
        }
    }

    public final void b() {
        int i7 = org.telegram.ui.ActionBar.m6.Xf;
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int f02 = chatActivityEnterView.f0(i7);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.Ge);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.Sf);
        chatActivityEnterView.w3.setColor(f02);
        zg0 zg0Var = this.f;
        zg0Var.Z = true;
        zg0Var.Q(f02, "Cup Red");
        zg0Var.Q(f02, "Box Red");
        zg0Var.Q(f04, "Cup Grey");
        zg0Var.Q(f04, "Box Grey");
        zg0Var.Q(f04, "Box_Grey 2");
        zg0Var.Q(f04, "Line 1");
        zg0Var.Q(f04, "Line 2");
        zg0Var.Q(f04, "Line 3");
        zg0Var.Q(f03, "Line 1 Dup");
        zg0Var.Q(f03, "Line 2 Dup");
        zg0Var.Q(f03, "Line 3 Dup");
        zg0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z9 = this.e;
        zg0 zg0Var = this.f;
        if (z9) {
            zg0Var.start();
        }
        zg0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        zg0 zg0Var = this.f;
        zg0Var.stop();
        zg0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z9 = this.e;
        zg0 zg0Var = this.f;
        if (z9) {
            zg0Var.setAlpha((int) (this.a * 255.0f));
        }
        paint.setAlpha((int) (this.a * 255.0f));
        if (!this.n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.b;
            if (this.h) {
                this.a = 1.0f;
            } else if (this.c || this.e) {
                float f10 = (j3 / 600.0f) + this.a;
                this.a = f10;
                if (f10 >= 1.0f) {
                    this.a = 1.0f;
                    this.c = false;
                }
            } else {
                float f11 = this.a - (j3 / 600.0f);
                this.a = f11;
                if (f11 <= 0.0f) {
                    this.a = 0.0f;
                    this.c = true;
                }
            }
            this.b = currentTimeMillis;
        }
        if (this.e) {
            zg0Var.draw(canvas);
        }
        if (!this.e || !zg0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, org.telegram.messenger.g0.L(5.0f), paint);
        }
        if (this.n) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
