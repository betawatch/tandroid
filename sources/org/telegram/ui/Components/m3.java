package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m3 extends LinearLayout {
    public final nz0 a;
    public boolean b;
    public nz0 c;
    public final /* synthetic */ l3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(Context context, l3 l3Var) {
        super(context);
        this.d = l3Var;
        this.a = new nz0(":", 18.0f, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.a.c((getWidth() - this.a.c) / 2.0f, getHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.f6.w0(null, i9, false), canvas);
        if (!LocaleController.is24HourFormat) {
            boolean z10 = this.d.getValue() % 24 < 12;
            if (this.b != z10 || this.c == null) {
                this.b = z10;
                this.c = new nz0(z10 ? "AM" : "PM", 18.0f, null);
            }
            this.c.c((getWidth() / 2.0f) + AndroidUtilities.dp(43.0f), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, org.telegram.ui.ActionBar.f6.w0(null, i9, false), canvas);
        }
        super.dispatchDraw(canvas);
    }
}
