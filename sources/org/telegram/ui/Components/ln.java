package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ln(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = qnVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                vu vuVar = (vu) this.b;
                vuVar.getClass();
                if (i10 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !vuVar.isShowing()) {
                    return false;
                }
                vuVar.dismiss();
                return true;
        }
    }
}
