package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ch extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(bi biVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = biVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.S1.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                bi biVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, biVar.s2.getSelectedItemsCount())));
                int max = Math.max(org.telegram.messenger.i0.L(16.0f) + ((int) Math.ceil(biVar.D2.measureText(format))), org.telegram.messenger.i0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                biVar.D2.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.C5, biVar.I0), (int) (((biVar.P2 * 0.42d) + 0.58d) * Color.alpha(r5))));
                biVar.F2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, biVar.I0));
                int i10 = max / 2;
                biVar.E2.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(biVar.E2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), biVar.F2);
                biVar.F2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W9, biVar.I0));
                biVar.E2.set(org.telegram.messenger.i0.L(2.0f) + r6, org.telegram.messenger.i0.L(2.0f), r3 - org.telegram.messenger.i0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
                canvas.drawRoundRect(biVar.E2, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), biVar.F2);
                canvas.drawText(format, measuredWidth - (r2 / 2), org.telegram.messenger.i0.L(16.2f), biVar.D2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.b.S1.setBounds(0, (i11 - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(48.0f), i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
