package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gb extends FrameLayout {
    public final /* synthetic */ hb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(hb hbVar, Context context) {
        super(context);
        this.a = hbVar;
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
        hb hbVar = this.a;
        super.removeView(view);
        try {
            hbVar.dismiss();
        } catch (Exception unused) {
        }
        mc.h(hbVar.a);
    }

    public void setTouchable(boolean z10) {
        hb hbVar = this.a;
        WindowManager.LayoutParams layoutParams = hbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        hbVar.getWindow().setAttributes(hbVar.b);
    }
}
