package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dn(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                hn hnVar = (hn) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = hnVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                du duVar = (du) this.b;
                duVar.getClass();
                if (i7 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !duVar.isShowing()) {
                    return false;
                }
                duVar.dismiss();
                return true;
        }
    }
}
