package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cn(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                gn gnVar = (gn) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i9 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = gnVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                iu iuVar = (iu) this.b;
                iuVar.getClass();
                if (i9 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !iuVar.isShowing()) {
                    return false;
                }
                iuVar.dismiss();
                return true;
        }
    }
}
