package androidx.car.app.messaging.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import e0.o0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final CarText b;
    public final o0 c;
    public final CarIcon d;
    public final boolean e;
    public List f;
    public final c g;
    public final ArrayList h;

    public f(ConversationItem conversationItem) {
        this.a = conversationItem.getId();
        this.b = conversationItem.getTitle();
        this.c = conversationItem.getSelf();
        this.d = conversationItem.getIcon();
        this.e = conversationItem.isGroupConversation();
        this.g = conversationItem.getConversationCallbackDelegate();
        this.f = conversationItem.getMessages();
        this.h = new ArrayList(conversationItem.getActions());
    }
}
