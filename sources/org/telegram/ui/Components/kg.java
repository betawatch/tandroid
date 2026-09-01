package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kg extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ij0 f;
    public boolean h;
    public final /* synthetic */ ChatActivityEnterView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        ij0 ij0Var = new ij0(i10, l.d.j(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = ij0Var;
        ij0Var.m0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.jf;
        int i11 = ChatActivityEnterView.j5;
        ChatActivityEnterView chatActivityEnterView = this.n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.k6.Sd);
        chatActivityEnterView.s3.setColor(i02);
        ij0 ij0Var = this.f;
        ij0Var.X = true;
        ij0Var.O(i02, "Cup Red");
        ij0Var.O(i02, "Box");
        ij0Var.O(i03, "Line 1");
        ij0Var.O(i03, "Line 2");
        ij0Var.O(i03, "Line 3");
        ij0Var.m();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z4 = this.e;
        ij0 ij0Var = this.f;
        if (z4) {
            ij0Var.start();
        }
        ij0Var.s0 = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        ij0 ij0Var = this.f;
        ij0Var.stop();
        ij0Var.s0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.n.s3;
        boolean z4 = this.e;
        ij0 ij0Var = this.f;
        if (z4) {
            ij0Var.setAlpha((int) (this.a * 255.0f));
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
            ij0Var.draw(canvas);
        }
        if (!this.e || !ij0Var.s()) {
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
