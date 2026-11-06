package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wa extends FrameLayout {
    public final /* synthetic */ xa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(xa xaVar, Context context) {
        super(context);
        this.a = xaVar;
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
        xa xaVar = this.a;
        super.removeView(view);
        try {
            xaVar.dismiss();
        } catch (Exception unused) {
        }
        cc.h(xaVar.a);
    }

    public void setTouchable(boolean z9) {
        xa xaVar = this.a;
        WindowManager.LayoutParams layoutParams = xaVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z9) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        xaVar.getWindow().setAttributes(xaVar.b);
    }
}
