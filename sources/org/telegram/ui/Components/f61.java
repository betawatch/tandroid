package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ f61(UndoView undoView, int i10) {
        this.a = i10;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        UndoView undoView = this.b;
        switch (i10) {
            case 0:
                int i11 = UndoView.e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    break;
                }
                break;
            default:
                int i12 = UndoView.e0;
                undoView.e(1, false);
                break;
        }
    }
}
