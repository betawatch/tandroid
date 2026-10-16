package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mb extends FrameLayout {
    public final /* synthetic */ nb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(nb nbVar, Context context) {
        super(context);
        this.a = nbVar;
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
        nb nbVar = this.a;
        super.removeView(view);
        try {
            nbVar.dismiss();
        } catch (Exception unused) {
        }
        sc.h(nbVar.a);
    }

    public void setTouchable(boolean z10) {
        nb nbVar = this.a;
        WindowManager.LayoutParams layoutParams = nbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        nbVar.getWindow().setAttributes(nbVar.b);
    }
}
