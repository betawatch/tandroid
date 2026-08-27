package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class za extends FrameLayout {
    public final /* synthetic */ ab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ab abVar, Context context) {
        super(context);
        this.a = abVar;
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
        ab abVar = this.a;
        super.removeView(view);
        try {
            abVar.dismiss();
        } catch (Exception unused) {
        }
        ec.h(abVar.a);
    }

    public void setTouchable(boolean z10) {
        ab abVar = this.a;
        WindowManager.LayoutParams layoutParams = abVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        abVar.getWindow().setAttributes(abVar.b);
    }
}
