package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hp(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.b;
                int childCount = datePicker.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = datePicker.getChildAt(i7);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new rg((EditTextBoldCursor) this.b, 1));
                break;
        }
    }
}
