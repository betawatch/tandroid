package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lb extends FrameLayout {
    public final /* synthetic */ mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(mb mbVar, Context context) {
        super(context);
        this.a = mbVar;
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
        mb mbVar = this.a;
        super.removeView(view);
        try {
            mbVar.dismiss();
        } catch (Exception unused) {
        }
        rc.h(mbVar.a);
    }

    public void setTouchable(boolean z10) {
        mb mbVar = this.a;
        WindowManager.LayoutParams layoutParams = mbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        mbVar.getWindow().setAttributes(mbVar.b);
    }
}
