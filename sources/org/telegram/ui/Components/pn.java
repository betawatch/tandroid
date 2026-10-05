package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pn(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = unVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                bv bvVar = (bv) this.b;
                bvVar.getClass();
                if (i10 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !bvVar.isShowing()) {
                    return false;
                }
                bvVar.dismiss();
                return true;
        }
    }
}
