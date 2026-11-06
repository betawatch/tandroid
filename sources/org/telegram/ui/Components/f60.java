package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f60 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ k60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(k60 k60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = k60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        k60 k60Var = this.p;
        k60.a(k60Var, viewGroup);
        Runnable runnable = k60Var.p;
        if (runnable != null) {
            runnable.run();
            k60Var.p = null;
        }
    }
}
