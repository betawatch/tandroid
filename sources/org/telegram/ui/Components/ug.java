package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ug extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final xj0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        xj0 xj0Var = new xj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = xj0Var;
        xj0Var.o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.y6.jf;
        int i11 = ChatActivityEnterView.r5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int f02 = chatActivityEnterView.f0(i10);
        int f03 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.Sd);
        int f04 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.df);
        chatActivityEnterView.w3.setColor(f02);
        xj0 xj0Var = this.f;
        xj0Var.Z = true;
        xj0Var.Q(f02, "Cup Red");
        xj0Var.Q(f02, "Box Red");
        xj0Var.Q(f04, "Cup Grey");
        xj0Var.Q(f04, "Box Grey");
        xj0Var.Q(f04, "Box_Grey 2");
        xj0Var.Q(f04, "Line 1");
        xj0Var.Q(f04, "Line 2");
        xj0Var.Q(f04, "Line 3");
        xj0Var.Q(f03, "Line 1 Dup");
        xj0Var.Q(f03, "Line 2 Dup");
        xj0Var.Q(f03, "Line 3 Dup");
        xj0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        xj0 xj0Var = this.f;
        if (z10) {
            xj0Var.start();
        }
        xj0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xj0 xj0Var = this.f;
        xj0Var.stop();
        xj0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z10 = this.e;
        xj0 xj0Var = this.f;
        if (z10) {
            xj0Var.setAlpha((int) (this.a * 255.0f));
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
            xj0Var.draw(canvas);
        }
        if (!this.e || !xj0Var.u()) {
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
