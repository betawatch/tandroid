package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kg extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final gj0 f;
    public boolean h;
    public final /* synthetic */ ChatActivityEnterView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.n = chatActivityEnterView;
        int i10 = R.raw.chat_audio_record_delete_2;
        gj0 gj0Var = new gj0(i10, kh.a2.j(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = gj0Var;
        gj0Var.m0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.jf;
        int i11 = ChatActivityEnterView.j5;
        ChatActivityEnterView chatActivityEnterView = this.n;
        int i02 = chatActivityEnterView.i0(i10);
        int i03 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Sd);
        chatActivityEnterView.s3.setColor(i02);
        gj0 gj0Var = this.f;
        gj0Var.X = true;
        gj0Var.O(i02, "Cup Red");
        gj0Var.O(i02, "Box");
        gj0Var.O(i03, "Line 1");
        gj0Var.O(i03, "Line 2");
        gj0Var.O(i03, "Line 3");
        gj0Var.m();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z4 = this.e;
        gj0 gj0Var = this.f;
        if (z4) {
            gj0Var.start();
        }
        gj0Var.s0 = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        gj0 gj0Var = this.f;
        gj0Var.stop();
        gj0Var.s0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.n.s3;
        boolean z4 = this.e;
        gj0 gj0Var = this.f;
        if (z4) {
            gj0Var.setAlpha((int) (this.a * 255.0f));
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
            gj0Var.draw(canvas);
        }
        if (!this.e || !gj0Var.s()) {
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
