package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sa extends FrameLayout {
    public final /* synthetic */ ta a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(ta taVar, Context context) {
        super(context);
        this.a = taVar;
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
        ta taVar = this.a;
        super.removeView(view);
        try {
            taVar.dismiss();
        } catch (Exception unused) {
        }
        xb.h(taVar.a);
    }

    public void setTouchable(boolean z10) {
        ta taVar = this.a;
        WindowManager.LayoutParams layoutParams = taVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        taVar.getWindow().setAttributes(taVar.b);
    }
}
