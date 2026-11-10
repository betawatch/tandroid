package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ um(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ym ymVar = (ym) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = ymVar.f;
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
