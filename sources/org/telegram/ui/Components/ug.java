package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ug extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final yj0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = yj0Var;
        yj0Var.o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.jf;
        int i11 = ChatActivityEnterView.r5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int f02 = chatActivityEnterView.f0(i10);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Sd);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.df);
        chatActivityEnterView.w3.setColor(f02);
        yj0 yj0Var = this.f;
        yj0Var.Z = true;
        yj0Var.Q(f02, "Cup Red");
        yj0Var.Q(f02, "Box Red");
        yj0Var.Q(f04, "Cup Grey");
        yj0Var.Q(f04, "Box Grey");
        yj0Var.Q(f04, "Box_Grey 2");
        yj0Var.Q(f04, "Line 1");
        yj0Var.Q(f04, "Line 2");
        yj0Var.Q(f04, "Line 3");
        yj0Var.Q(f03, "Line 1 Dup");
        yj0Var.Q(f03, "Line 2 Dup");
        yj0Var.Q(f03, "Line 3 Dup");
        yj0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        yj0 yj0Var = this.f;
        if (z10) {
            yj0Var.start();
        }
        yj0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        yj0 yj0Var = this.f;
        yj0Var.stop();
        yj0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z10 = this.e;
        yj0 yj0Var = this.f;
        if (z10) {
            yj0Var.setAlpha((int) (this.a * 255.0f));
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
            yj0Var.draw(canvas);
        }
        if (!this.e || !yj0Var.u()) {
            canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), paint);
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
