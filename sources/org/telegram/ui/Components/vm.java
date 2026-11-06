package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vm(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                zm zmVar = (zm) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = zmVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                xt xtVar = (xt) this.b;
                xtVar.getClass();
                if (i7 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !xtVar.isShowing()) {
                    return false;
                }
                xtVar.dismiss();
                return true;
        }
    }
}
