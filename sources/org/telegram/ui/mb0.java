package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class mb0 extends TextView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb0(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        switch (this.a) {
            case 5:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_31));
                break;
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(100.0f)), TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_31));
                break;
            case 3:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), TLObject.FLAG_31));
                break;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(org.telegram.messenger.g0.L(26.0f)), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }
}
