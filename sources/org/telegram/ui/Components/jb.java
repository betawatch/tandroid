package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jb extends FrameLayout {
    public final /* synthetic */ kb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(kb kbVar, Context context) {
        super(context);
        this.a = kbVar;
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
        kb kbVar = this.a;
        super.removeView(view);
        try {
            kbVar.dismiss();
        } catch (Exception unused) {
        }
        pc.h(kbVar.a);
    }

    public void setTouchable(boolean z10) {
        kb kbVar = this.a;
        WindowManager.LayoutParams layoutParams = kbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        kbVar.getWindow().setAttributes(kbVar.b);
    }
}
