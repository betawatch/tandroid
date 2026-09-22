package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class sg extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final xi0 f;
    public boolean h;
    public final /* synthetic */ ChatActivityEnterView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.n = chatActivityEnterView;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = xi0Var;
        xi0Var.o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.jf;
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.n;
        int j02 = chatActivityEnterView.j0(i10);
        int j03 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.i6.Sd);
        int j04 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.i6.df);
        chatActivityEnterView.v3.setColor(j02);
        xi0 xi0Var = this.f;
        xi0Var.Z = true;
        xi0Var.Q(j02, "Cup Red");
        xi0Var.Q(j02, "Box Red");
        xi0Var.Q(j04, "Cup Grey");
        xi0Var.Q(j04, "Box Grey");
        xi0Var.Q(j04, "Box_Grey 2");
        xi0Var.Q(j04, "Line 1");
        xi0Var.Q(j04, "Line 2");
        xi0Var.Q(j04, "Line 3");
        xi0Var.Q(j03, "Line 1 Dup");
        xi0Var.Q(j03, "Line 2 Dup");
        xi0Var.Q(j03, "Line 3 Dup");
        xi0Var.o();
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
        xi0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        xi0 xi0Var = this.f;
        xi0Var.stop();
        xi0Var.R(null);
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
        if (!this.e || !xi0Var.u()) {
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
