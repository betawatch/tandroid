package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.q;
import androidx.car.app.utils.g;
import e0.m0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.r;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public class ConversationItem implements q {
    private final List<Action> mActions;
    private final c mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final m0 mSelf;
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

    public static m0 validateSender(m0 m0Var) {
        Objects.requireNonNull(m0Var);
        Objects.requireNonNull(m0Var.a);
        Objects.requireNonNull(m0Var.d);
        return m0Var;
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

    public m0 getSelf() {
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
        m0 m0Var = new m0();
        m0Var.a = "";
        m0Var.b = null;
        m0Var.c = null;
        m0Var.d = null;
        m0Var.e = false;
        m0Var.f = false;
        this.mSelf = m0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new oa.d(2));
        this.mActions = Collections.EMPTY_LIST;
    }
}
