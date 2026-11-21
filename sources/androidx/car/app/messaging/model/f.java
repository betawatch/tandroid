package androidx.car.app.messaging.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import e0.j0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final CarText b;
    public final j0 c;
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
