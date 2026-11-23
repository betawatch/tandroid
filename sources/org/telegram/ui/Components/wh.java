package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh(ui uiVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = uiVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.W1.draw(canvas);
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
                ui uiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, uiVar.w2.getSelectedItemsCount())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(uiVar.H2.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                uiVar.H2.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.C5, uiVar.J0), (int) (((uiVar.T2 * 0.42d) + 0.58d) * Color.alpha(r5))));
                uiVar.J2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, uiVar.J0));
                int i7 = max / 2;
                uiVar.I2.set(measuredWidth - i7, 0.0f, i7 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(uiVar.I2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), uiVar.J2);
                uiVar.J2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W9, uiVar.J0));
                uiVar.I2.set(org.telegram.messenger.g0.L(2.0f) + r6, org.telegram.messenger.g0.L(2.0f), r3 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(uiVar.I2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), uiVar.J2);
                canvas.drawText(format, measuredWidth - (r2 / 2), org.telegram.messenger.g0.L(16.2f), uiVar.H2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.b.W1.setBounds(0, (i10 - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
