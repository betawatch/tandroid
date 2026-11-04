package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class va extends FrameLayout {
    public final /* synthetic */ wa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(wa waVar, Context context) {
        super(context);
        this.a = waVar;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        this.a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.a.b;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        wa waVar = this.a;
        super.removeView(view);
        try {
            waVar.dismiss();
        } catch (Exception unused) {
        }
        ac.h(waVar.a);
    }

    public void setTouchable(boolean z10) {
        wa waVar = this.a;
        WindowManager.LayoutParams layoutParams = waVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        waVar.getWindow().setAttributes(waVar.b);
    }
}
