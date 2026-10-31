package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dn(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                hn hnVar = (hn) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = hnVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                ju juVar = (ju) this.b;
                juVar.getClass();
                if (i10 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !juVar.isShowing()) {
                    return false;
                }
                juVar.dismiss();
                return true;
        }
    }
}
