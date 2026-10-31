package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.q;
import androidx.car.app.utils.h;
import e0.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ConversationItem implements q {
    private final List<Action> mActions;
    private final c mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final l0 mSelf;
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
        List<CarMessage> g10 = h.g(fVar.f);
        Objects.requireNonNull(g10);
        List<CarMessage> list = g10;
        this.mMessages = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("Message list cannot be empty.");
        }
        c cVar = fVar.g;
        Objects.requireNonNull(cVar);
        this.mConversationCallbackDelegate = cVar;
        this.mActions = h.g(fVar.h);
    }

    public static l0 validateSender(l0 l0Var) {
        Objects.requireNonNull(l0Var);
        Objects.requireNonNull(l0Var.a);
        Objects.requireNonNull(l0Var.d);
        return l0Var;
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

    public l0 getSelf() {
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
        l0 l0Var = new l0();
        l0Var.a = "";
        l0Var.b = null;
        l0Var.c = null;
        l0Var.d = null;
        l0Var.e = false;
        l0Var.f = false;
        this.mSelf = l0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new oa.d(1));
        this.mActions = Collections.EMPTY_LIST;
    }
}
