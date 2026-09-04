package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class r3 extends LinearLayout {
    public final f01 a;
    public boolean b;
    public f01 c;
    public final /* synthetic */ q3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Context context, q3 q3Var) {
        super(context);
        this.d = q3Var;
        this.a = new f01(":", 18.0f, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.a.c((getWidth() - this.a.c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        if (!LocaleController.is24HourFormat) {
            boolean z10 = this.d.getValue() % 24 < 12;
            if (this.b != z10 || this.c == null) {
                this.b = z10;
                this.c = new f01(z10 ? "AM" : "PM", 18.0f, null);
            }
            this.c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
