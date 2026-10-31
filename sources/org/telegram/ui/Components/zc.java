package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ zc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.s5;
                break;
            default:
                se seVar = chatActivityEnterView.E0;
                if (seVar != null && seVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.D0(view);
    }
}
