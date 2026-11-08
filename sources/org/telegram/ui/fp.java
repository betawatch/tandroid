package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ fp(int i7, View view) {
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
                org.telegram.messenger.g0.h3(new sg((EditTextBoldCursor) this.b, 1));
                break;
        }
    }
}
