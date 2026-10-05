package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ yd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.n5;
                break;
            default:
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null && rfVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.F0(view);
    }
}
