package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nb extends FrameLayout {
    public final /* synthetic */ ob a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(ob obVar, Context context) {
        super(context);
        this.a = obVar;
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
        ob obVar = this.a;
        super.removeView(view);
        try {
            obVar.dismiss();
        } catch (Exception unused) {
        }
        tc.h(obVar.a);
    }

    public void setTouchable(boolean z10) {
        ob obVar = this.a;
        WindowManager.LayoutParams layoutParams = obVar.b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        obVar.getWindow().setAttributes(obVar.b);
    }
}
