package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a7 extends w7 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(Object obj, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        super(context, p2Var);
        this.w = i10;
        this.x = obj;
    }

    public void e(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        d7 d7Var = ((b7) this.x).e;
        if (!z4) {
            kVar = ((org.telegram.ui.ActionBar.p2) d7Var).actionBar;
            kVar.r();
        } else {
            d7.b0(d7Var, true);
            kVar2 = ((org.telegram.ui.ActionBar.p2) d7Var).actionBar;
            kVar2.O(null, null);
        }
    }

    @Override // org.telegram.ui.w7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.w) {
            case 0:
                super.onMeasure(i10, b.d(12.0f, View.MeasureSpec.getSize(i11) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((iv) this.x).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
        }
    }
}
