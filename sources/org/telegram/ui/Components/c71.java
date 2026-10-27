package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ c71(UndoView undoView, int i10) {
        this.a = i10;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        UndoView undoView = this.b;
        switch (i10) {
            case 0:
                int i11 = UndoView.i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    break;
                }
                break;
            default:
                int i12 = UndoView.i0;
                undoView.d(1, false);
                break;
        }
    }
}
