package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ce extends FrameLayout {
    public final /* synthetic */ ChatActivityEnterView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.a = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(final Canvas canvas, final View view, final long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (view != null && view == chatActivityEnterView.B0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() { // from class: org.telegram.ui.Components.be
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.v4 && view == chatActivityEnterView.b1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.y0.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Float f10 = (Float) chatActivityEnterView.y0.get(childAt);
            if (f10 != null) {
                childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(pr.f).start();
            }
        }
        chatActivityEnterView.y0.clear();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.a;
        xd.c cVar = chatActivityEnterView.b5;
        if (cVar.e > 0.0f) {
            cVar.a(max);
        } else {
            cVar.c(max);
        }
        chatActivityEnterView.N();
    }
}
