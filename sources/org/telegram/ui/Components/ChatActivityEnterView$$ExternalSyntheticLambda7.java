package org.telegram.ui.Components;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class ChatActivityEnterView$$ExternalSyntheticLambda7 implements View.OnLongClickListener {
    public final /* synthetic */ ChatActivityEnterView f$0;

    public /* synthetic */ ChatActivityEnterView$$ExternalSyntheticLambda7(ChatActivityEnterView chatActivityEnterView) {
        this.f$0 = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean onSendLongClick;
        onSendLongClick = this.f$0.onSendLongClick(view);
        return onSendLongClick;
    }
}
