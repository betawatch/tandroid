package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ p51(UndoView undoView, int i10) {
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
