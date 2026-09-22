package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q3 extends LinearLayout {
    public final w01 a;
    public boolean b;
    public w01 c;
    public final /* synthetic */ p3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Context context, p3 p3Var) {
        super(context);
        this.d = p3Var;
        this.a = new w01(":", 18.0f, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.a.c((getWidth() - this.a.c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            boolean z10 = this.d.getValue() % 24 < 12;
            if (this.b != z10 || this.c == null) {
                this.b = z10;
                this.c = new w01(z10 ? "AM" : "PM", 18.0f, null);
            }
            this.c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
