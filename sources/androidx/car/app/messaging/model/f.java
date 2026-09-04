package androidx.car.app.messaging.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import e0.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final CarText b;
    public final p0 c;
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
