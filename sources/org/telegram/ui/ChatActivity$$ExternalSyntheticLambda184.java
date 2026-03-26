package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* loaded from: classes4.dex */
public final /* synthetic */ class ChatActivity$$ExternalSyntheticLambda184 implements Utilities.Callback {
    public final /* synthetic */ ChatActivity f$0;

    public /* synthetic */ ChatActivity$$ExternalSyntheticLambda184(ChatActivity chatActivity) {
        this.f$0 = chatActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.f$0.showFieldPanelForSuggestionParams((MessageSuggestionParams) obj);
    }
}
