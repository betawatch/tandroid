package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kb extends FrameLayout {
    public final /* synthetic */ lb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(lb lbVar, Context context) {
        super(context);
        this.a = lbVar;
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
        lb lbVar = this.a;
        super.removeView(view);
        try {
            lbVar.dismiss();
        } catch (Exception unused) {
        }
        qc.h(lbVar.a);
    }

    public void setTouchable(boolean z10) {
        lb lbVar = this.a;
        WindowManager.LayoutParams layoutParams = lbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        lbVar.getWindow().setAttributes(lbVar.b);
    }
}
