package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.AlertsCreator;
/* loaded from: classes3.dex */
public final /* synthetic */ class ChatActivity$$ExternalSyntheticLambda239 implements AlertsCreator.ScheduleDatePickerDelegate {
    public final /* synthetic */ ChatActivity f$0;
    public final /* synthetic */ MessageObject.GroupedMessages f$1;
    public final /* synthetic */ MessageObject f$2;

    public /* synthetic */ ChatActivity$$ExternalSyntheticLambda239(ChatActivity chatActivity, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject) {
        this.f$0 = chatActivity;
        this.f$1 = groupedMessages;
        this.f$2 = messageObject;
    }

    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
    public final void didSelectDate(boolean z, int i) {
        this.f$0.lambda$processSelectedOption$217(this.f$1, this.f$2, z, i);
    }
}
