package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ib extends FrameLayout {
    public final /* synthetic */ jb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(jb jbVar, Context context) {
        super(context);
        this.a = jbVar;
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
        jb jbVar = this.a;
        super.removeView(view);
        try {
            jbVar.dismiss();
        } catch (Exception unused) {
        }
        oc.h(jbVar.a);
    }

    public void setTouchable(boolean z10) {
        jb jbVar = this.a;
        WindowManager.LayoutParams layoutParams = jbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        jbVar.getWindow().setAttributes(jbVar.b);
    }
}
