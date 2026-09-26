package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ug extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ij0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        ij0 ij0Var = new ij0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = ij0Var;
        ij0Var.o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.jf;
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.Sd);
        int i04 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.df);
        chatActivityEnterView.w3.setColor(i02);
        ij0 ij0Var = this.f;
        ij0Var.Z = true;
        ij0Var.Q(i02, "Cup Red");
        ij0Var.Q(i02, "Box Red");
        ij0Var.Q(i04, "Cup Grey");
        ij0Var.Q(i04, "Box Grey");
        ij0Var.Q(i04, "Box_Grey 2");
        ij0Var.Q(i04, "Line 1");
        ij0Var.Q(i04, "Line 2");
        ij0Var.Q(i04, "Line 3");
        ij0Var.Q(i03, "Line 1 Dup");
        ij0Var.Q(i03, "Line 2 Dup");
        ij0Var.Q(i03, "Line 3 Dup");
        ij0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        ij0 ij0Var = this.f;
        if (z10) {
            ij0Var.start();
        }
        ij0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ij0 ij0Var = this.f;
        ij0Var.stop();
        ij0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z10 = this.e;
        ij0 ij0Var = this.f;
        if (z10) {
            ij0Var.setAlpha((int) (this.a * 255.0f));
        }
        paint.setAlpha((int) (this.a * 255.0f));
        if (!this.n) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.b;
            if (this.h) {
                this.a = 1.0f;
            } else if (this.c || this.e) {
                float f7 = (j3 / 600.0f) + this.a;
                this.a = f7;
                if (f7 >= 1.0f) {
                    this.a = 1.0f;
                    this.c = false;
                }
            } else {
                float f10 = this.a - (j3 / 600.0f);
                this.a = f10;
                if (f10 <= 0.0f) {
                    this.a = 0.0f;
                    this.c = true;
                }
            }
            this.b = currentTimeMillis;
        }
        if (this.e) {
            ij0Var.draw(canvas);
        }
        if (!this.e || !ij0Var.u()) {
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
