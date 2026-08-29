package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bm extends d9 {
    public final /* synthetic */ cm A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(cm cmVar, Context context) {
        super(context);
        this.A = cmVar;
    }

    @Override // org.telegram.ui.Components.d9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        cm cmVar = this.A;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(cmVar.v.G0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(cmVar.v.G0, TLObject.FLAG_30));
    }
}
