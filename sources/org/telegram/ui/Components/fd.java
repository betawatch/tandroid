package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ fd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.s5;
                break;
            default:
                we weVar = chatActivityEnterView.E0;
                if (weVar != null && weVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.F0(view);
    }
}
