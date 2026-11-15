package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh(ki kiVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = kiVar;
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
                ki kiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kiVar.w2.getSelectedItemsCount())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(kiVar.H2.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                kiVar.H2.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.C5, kiVar.J0), (int) (((kiVar.T2 * 0.42d) + 0.58d) * Color.alpha(r5))));
                kiVar.J2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, kiVar.J0));
                int i7 = max / 2;
                kiVar.I2.set(measuredWidth - i7, 0.0f, i7 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(kiVar.I2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), kiVar.J2);
                kiVar.J2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W9, kiVar.J0));
                kiVar.I2.set(org.telegram.messenger.g0.L(2.0f) + r6, org.telegram.messenger.g0.L(2.0f), r3 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(kiVar.I2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), kiVar.J2);
                canvas.drawText(format, measuredWidth - (r2 / 2), org.telegram.messenger.g0.L(16.2f), kiVar.H2);
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
