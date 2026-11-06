package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ z31(UndoView undoView, int i7) {
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
