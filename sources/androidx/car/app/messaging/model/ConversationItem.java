package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.q;
import androidx.car.app.utils.g;
import e0.n0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class ConversationItem implements q {
    private final List<Action> mActions;
    private final c mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final n0 mSelf;
    private final CarText mTitle;

    public ConversationItem(f fVar) {
        String str = fVar.a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = fVar.b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(fVar.c);
        this.mIcon = fVar.d;
        this.mIsGroupConversation = fVar.e;
        List<CarMessage> g10 = g.g(fVar.f);
        Objects.requireNonNull(g10);
        List<CarMessage> list = g10;
        this.mMessages = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("Message list cannot be empty.");
        }
        c cVar = fVar.g;
        Objects.requireNonNull(cVar);
        this.mConversationCallbackDelegate = cVar;
        this.mActions = g.g(fVar.h);
    }

    public static n0 validateSender(n0 n0Var) {
        Objects.requireNonNull(n0Var);
        Objects.requireNonNull(n0Var.a);
        Objects.requireNonNull(n0Var.d);
        return n0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && r.a(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public c getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public n0 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(r.b(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        n0 n0Var = new n0();
        n0Var.a = "";
        n0Var.b = null;
        n0Var.c = null;
        n0Var.d = null;
        n0Var.e = false;
        n0Var.f = false;
        this.mSelf = n0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new rb.a(1));
        this.mActions = Collections.EMPTY_LIST;
    }
}
