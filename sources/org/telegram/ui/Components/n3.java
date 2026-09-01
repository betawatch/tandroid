package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n3 extends LinearLayout {
    public final l01 a;
    public boolean b;
    public l01 c;
    public final /* synthetic */ m3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Context context, m3 m3Var) {
        super(context);
        this.d = m3Var;
        this.a = new l01(":", 18.0f, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.a.c((getWidth() - this.a.c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            boolean z4 = this.d.getValue() % 24 < 12;
            if (this.b != z4 || this.c == null) {
                this.b = z4;
                this.c = new l01(z4 ? "AM" : "PM", 18.0f, null);
            }
            this.c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.k6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
