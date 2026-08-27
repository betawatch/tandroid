package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ v41(UndoView undoView, int i10) {
        this.a = i10;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        UndoView undoView = this.b;
        switch (i10) {
            case 0:
                int i11 = UndoView.a0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    break;
                }
                break;
            default:
                int i12 = UndoView.a0;
                undoView.e(1, false);
                break;
        }
    }
}
