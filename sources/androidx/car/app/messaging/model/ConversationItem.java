package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ConversationItem implements rt5 {
    private final List<Action> mActions;
    private final cx2 mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final b78 mSelf;
    private final CarText mTitle;

    public ConversationItem(dx2 dx2Var) {
        String str = dx2Var.a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = dx2Var.b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(dx2Var.c);
        this.mIcon = dx2Var.d;
        this.mIsGroupConversation = dx2Var.e;
        List<CarMessage> a = gwd.a(dx2Var.f);
        Objects.requireNonNull(a);
        List<CarMessage> list = a;
        this.mMessages = list;
        if (list.isEmpty()) {
            grb.i("Message list cannot be empty.");
            throw null;
        }
        cx2 cx2Var = dx2Var.g;
        Objects.requireNonNull(cx2Var);
        this.mConversationCallbackDelegate = cx2Var;
        this.mActions = gwd.a(dx2Var.h);
    }

    public static b78 validateSender(b78 b78Var) {
        Objects.requireNonNull(b78Var);
        Objects.requireNonNull(b78Var.a);
        Objects.requireNonNull(b78Var.d);
        return b78Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && nve.a(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public cx2 getConversationCallbackDelegate() {
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

    public b78 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(nve.b(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        b78 b78Var = new b78();
        b78Var.a = "";
        b78Var.b = null;
        b78Var.c = null;
        b78Var.d = null;
        b78Var.e = false;
        b78Var.f = false;
        this.mSelf = b78Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new sjf((byte) 15));
        this.mActions = Collections.EMPTY_LIST;
    }
}
