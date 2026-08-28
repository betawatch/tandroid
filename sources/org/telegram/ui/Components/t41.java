package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ t41(UndoView undoView, int i9) {
        this.a = i9;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.a;
        UndoView undoView = this.b;
        switch (i9) {
            case 0:
                int i10 = UndoView.a0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    break;
                }
                break;
            default:
                int i11 = UndoView.a0;
                undoView.e(1, false);
                break;
        }
    }
}
