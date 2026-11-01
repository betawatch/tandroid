package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qa extends FrameLayout {
    public final /* synthetic */ ra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(ra raVar, Context context) {
        super(context);
        this.a = raVar;
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
        ra raVar = this.a;
        super.removeView(view);
        try {
            raVar.dismiss();
        } catch (Exception unused) {
        }
        wb.h(raVar.a);
    }

    public void setTouchable(boolean z10) {
        ra raVar = this.a;
        WindowManager.LayoutParams layoutParams = raVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        raVar.getWindow().setAttributes(raVar.b);
    }
}
