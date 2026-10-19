package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ug extends View {
    public float a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final uj0 f;
    public boolean h;
    public boolean n;
    public long r;
    public final /* synthetic */ ChatActivityEnterView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.s = chatActivityEnterView;
        this.r = -1L;
        uj0 uj0Var = new uj0(R.raw.chat_audio_record_delete_2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.f = uj0Var;
        uj0Var.o0 = true;
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.jf;
        int i11 = ChatActivityEnterView.n5;
        ChatActivityEnterView chatActivityEnterView = this.s;
        int g02 = chatActivityEnterView.g0(i10);
        int g03 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.df);
        chatActivityEnterView.w3.setColor(g02);
        uj0 uj0Var = this.f;
        uj0Var.Z = true;
        uj0Var.Q(g02, "Cup Red");
        uj0Var.Q(g02, "Box Red");
        uj0Var.Q(g04, "Cup Grey");
        uj0Var.Q(g04, "Box Grey");
        uj0Var.Q(g04, "Box_Grey 2");
        uj0Var.Q(g04, "Line 1");
        uj0Var.Q(g04, "Line 2");
        uj0Var.Q(g04, "Line 3");
        uj0Var.Q(g03, "Line 1 Dup");
        uj0Var.Q(g03, "Line 2 Dup");
        uj0Var.Q(g03, "Line 3 Dup");
        uj0Var.o();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        boolean z10 = this.e;
        uj0 uj0Var = this.f;
        if (z10) {
            uj0Var.start();
        }
        uj0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
        uj0 uj0Var = this.f;
        uj0Var.stop();
        uj0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.s.w3;
        boolean z10 = this.e;
        uj0 uj0Var = this.f;
        if (z10) {
            uj0Var.setAlpha((int) (this.a * 255.0f));
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
            uj0Var.draw(canvas);
        }
        if (!this.e || !uj0Var.u()) {
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
