package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ln(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                pn pnVar = (pn) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = pnVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                iu iuVar = (iu) this.b;
                iuVar.getClass();
                if (i7 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !iuVar.isShowing()) {
                    return false;
                }
                iuVar.dismiss();
                return true;
        }
    }
}
