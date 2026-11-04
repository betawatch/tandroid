package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ed(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i3 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i3) {
            case 0:
                int i10 = ChatActivityEnterView.t5;
                break;
            default:
                ve veVar = chatActivityEnterView.F0;
                if (veVar != null && veVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.E0(view);
    }
}
