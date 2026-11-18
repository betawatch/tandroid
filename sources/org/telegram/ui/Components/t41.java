package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ t41(UndoView undoView, int i7) {
        this.a = i7;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        UndoView undoView = this.b;
        switch (i7) {
            case 0:
                int i10 = UndoView.j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    break;
                }
                break;
            default:
                int i11 = UndoView.j0;
                undoView.d(1, false);
                break;
        }
    }
}
