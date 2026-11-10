package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh(ci ciVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = ciVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.V1.draw(canvas);
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
                ci ciVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, ciVar.v2.getSelectedItemsCount())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(ciVar.G2.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                ciVar.G2.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.C5, ciVar.I0), (int) (((ciVar.S2 * 0.42d) + 0.58d) * Color.alpha(r5))));
                ciVar.I2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, ciVar.I0));
                int i7 = max / 2;
                ciVar.H2.set(measuredWidth - i7, 0.0f, i7 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(ciVar.H2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), ciVar.I2);
                ciVar.I2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W9, ciVar.I0));
                ciVar.H2.set(org.telegram.messenger.g0.L(2.0f) + r6, org.telegram.messenger.g0.L(2.0f), r3 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(ciVar.H2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ciVar.I2);
                canvas.drawText(format, measuredWidth - (r2 / 2), org.telegram.messenger.g0.L(16.2f), ciVar.G2);
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
                this.b.V1.setBounds(0, (i10 - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
