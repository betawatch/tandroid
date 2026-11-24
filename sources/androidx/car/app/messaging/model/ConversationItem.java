package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ConversationItem implements ot5 {
    private final List<Action> mActions;
    private final sx2 mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final n58 mSelf;
    private final CarText mTitle;

    public ConversationItem(tx2 tx2Var) {
        String str = tx2Var.a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = tx2Var.b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(tx2Var.c);
        this.mIcon = tx2Var.d;
        this.mIsGroupConversation = tx2Var.e;
        List<CarMessage> a = ttd.a(tx2Var.f);
        Objects.requireNonNull(a);
        List<CarMessage> list = a;
        this.mMessages = list;
        if (list.isEmpty()) {
            dq9.m("Message list cannot be empty.");
            throw null;
        }
        sx2 sx2Var = tx2Var.g;
        Objects.requireNonNull(sx2Var);
        this.mConversationCallbackDelegate = sx2Var;
        this.mActions = ttd.a(tx2Var.h);
    }

    public static n58 validateSender(n58 n58Var) {
        Objects.requireNonNull(n58Var);
        Objects.requireNonNull(n58Var.a);
        Objects.requireNonNull(n58Var.d);
        return n58Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && vse.a(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public sx2 getConversationCallbackDelegate() {
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

    public n58 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(vse.b(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        n58 n58Var = new n58();
        n58Var.a = "";
        n58Var.b = null;
        n58Var.c = null;
        n58Var.d = null;
        n58Var.e = false;
        n58Var.f = false;
        this.mSelf = n58Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new dhf((byte) 15));
        this.mActions = Collections.EMPTY_LIST;
    }
}
