package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
