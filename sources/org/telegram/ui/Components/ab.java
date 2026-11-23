package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ab extends FrameLayout {
    public final /* synthetic */ bb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(bb bbVar, Context context) {
        super(context);
        this.a = bbVar;
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
        bb bbVar = this.a;
        super.removeView(view);
        try {
            bbVar.dismiss();
        } catch (Exception unused) {
        }
        fc.h(bbVar.a);
    }

    public void setTouchable(boolean z10) {
        bb bbVar = this.a;
        WindowManager.LayoutParams layoutParams = bbVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        bbVar.getWindow().setAttributes(bbVar.b);
    }
}
