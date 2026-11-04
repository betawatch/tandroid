package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ um(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ym ymVar = (ym) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i3 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = ymVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                wt wtVar = (wt) this.b;
                wtVar.getClass();
                if (i3 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !wtVar.isShowing()) {
                    return false;
                }
                wtVar.dismiss();
                return true;
        }
    }
}
