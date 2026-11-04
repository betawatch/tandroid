package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ch extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(bi biVar, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = biVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.T1.draw(canvas);
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
                String format = String.format("%d", Integer.valueOf(Math.max(1, biVar.t2.getSelectedItemsCount())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(biVar.E2.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                biVar.E2.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.C5, biVar.J0), (int) (((biVar.Q2 * 0.42d) + 0.58d) * Color.alpha(r5))));
                biVar.G2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, biVar.J0));
                int i3 = max / 2;
                biVar.F2.set(measuredWidth - i3, 0.0f, i3 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(biVar.F2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), biVar.G2);
                biVar.G2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W9, biVar.J0));
                biVar.F2.set(org.telegram.messenger.g0.L(2.0f) + r6, org.telegram.messenger.g0.L(2.0f), r3 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(biVar.F2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), biVar.G2);
                canvas.drawText(format, measuredWidth - (r2 / 2), org.telegram.messenger.g0.L(16.2f), biVar.E2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                this.b.T1.setBounds(0, (i10 - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(48.0f), i3, i10);
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }
}
