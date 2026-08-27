package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yd extends FrameLayout {
    public final /* synthetic */ ChatActivityEnterView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.a = chatActivityEnterView;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(final Canvas canvas, final View view, final long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (view != null && view == chatActivityEnterView.A0) {
            return chatActivityEnterView.f0(canvas, new Utilities.Callback0Return() { // from class: org.telegram.ui.Components.xd
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                    return valueOf;
                }
            });
        }
        if (chatActivityEnterView.u4 && view == chatActivityEnterView.a1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.x0.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Float f10 = (Float) chatActivityEnterView.x0.get(childAt);
            if (f10 != null) {
                childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(er.f).start();
            }
        }
        chatActivityEnterView.x0.clear();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int max = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
        ChatActivityEnterView chatActivityEnterView = this.a;
        ud.c cVar = chatActivityEnterView.a5;
        if (cVar.e > 0.0f) {
            cVar.a(max);
        } else {
            cVar.c(max);
        }
        chatActivityEnterView.N();
    }
}
