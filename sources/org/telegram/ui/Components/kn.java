package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                on onVar = (on) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = onVar.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                tu tuVar = (tu) this.b;
                tuVar.getClass();
                if (i10 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !tuVar.isShowing()) {
                    return false;
                }
                tuVar.dismiss();
                return true;
        }
    }
}
