// default package

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class dx2 {
    public final String a;
    public final CarText b;
    public final b78 c;
    public final CarIcon d;
    public final boolean e;
    public List f;
    public final cx2 g;
    public final ArrayList h;

    public dx2(ConversationItem conversationItem) {
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
