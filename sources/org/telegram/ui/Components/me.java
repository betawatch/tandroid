package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class me extends FrameLayout {
    public final /* synthetic */ ChatActivityEnterView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.a = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(final Canvas canvas, final View view, final long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (view != null && view == chatActivityEnterView.E0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() { // from class: org.telegram.ui.Components.le
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.y4 && view == chatActivityEnterView.e1) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.B0.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Float f7 = (Float) chatActivityEnterView.B0.get(childAt);
            if (f7 != null) {
                childAt.setTranslationX(f7.floatValue() - childAt.getLeft());
                childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(pr.f).start();
            }
        }
        chatActivityEnterView.B0.clear();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.a;
        le.e eVar = chatActivityEnterView.e5;
        if (eVar.e > 0.0f) {
            eVar.a(max);
        } else {
            eVar.c(max);
        }
        chatActivityEnterView.N();
    }
}
