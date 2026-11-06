package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ f41(UndoView undoView, int i7) {
        this.a = i7;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        UndoView undoView = this.b;
        switch (i7) {
            case 0:
                int i10 = UndoView.i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    break;
                }
                break;
            default:
                int i11 = UndoView.i0;
                undoView.d(1, false);
                break;
        }
    }
}
