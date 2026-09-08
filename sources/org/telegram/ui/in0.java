package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class in0 extends TextView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        switch (this.a) {
            case 3:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(AndroidUtilities.dp(26.0f)), TLObject.FLAG_30));
                break;
            case 3:
            default:
                super.onMeasure(i10, i11);
                break;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
        }
    }
}
