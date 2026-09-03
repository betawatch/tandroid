package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout b;

    public /* synthetic */ pf(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        this.a = i10;
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.getSwipeBack().b(true);
                break;
            case 1:
                this.b.getSwipeBack().b(true);
                break;
            default:
                this.b.getSwipeBack().b(true);
                break;
        }
    }
}
