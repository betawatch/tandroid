package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = snVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                yu yuVar = (yu) this.b;
                yuVar.getClass();
                if (i10 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !yuVar.isShowing()) {
                    return false;
                }
                yuVar.dismiss();
                return true;
        }
    }
}
