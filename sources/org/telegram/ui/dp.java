package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ dp(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.b;
                int childCount = datePicker.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = datePicker.getChildAt(i3);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new og((EditTextBoldCursor) this.b, 1));
                break;
        }
    }
}
