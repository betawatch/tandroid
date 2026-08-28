package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m3 extends mh.f4 {
    public boolean V;
    public final /* synthetic */ p3 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p3 p3Var, Context context) {
        super(context);
        this.W = p3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.V = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.V = false;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.W.G.G;
        if (y3Var != null) {
            y3Var.getClass();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V) {
            return;
        }
        super.requestLayout();
    }
}
