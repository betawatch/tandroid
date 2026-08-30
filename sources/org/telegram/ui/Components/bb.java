package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bb extends FrameLayout {
    public final /* synthetic */ cb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(cb cbVar, Context context) {
        super(context);
        this.a = cbVar;
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
        cb cbVar = this.a;
        super.removeView(view);
        try {
            cbVar.dismiss();
        } catch (Exception unused) {
        }
        ic.h(cbVar.a);
    }

    public void setTouchable(boolean z4) {
        cb cbVar = this.a;
        WindowManager.LayoutParams layoutParams = cbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z4) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        cbVar.getWindow().setAttributes(cbVar.b);
    }
}
