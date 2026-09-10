package androidx.car.app.messaging.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import e0.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
