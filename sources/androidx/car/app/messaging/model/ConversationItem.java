package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ConversationItem implements pr5 {
    private final List<Action> mActions;
    private final iw2 mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final l38 mSelf;
    private final CarText mTitle;

    public ConversationItem(jw2 jw2Var) {
        String str = jw2Var.a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = jw2Var.b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(jw2Var.c);
        this.mIcon = jw2Var.d;
        this.mIsGroupConversation = jw2Var.e;
        List<CarMessage> a = qrd.a(jw2Var.f);
        Objects.requireNonNull(a);
        List<CarMessage> list = a;
        this.mMessages = list;
        if (list.isEmpty()) {
            sc8.j("Message list cannot be empty.");
            throw null;
        }
        iw2 iw2Var = jw2Var.g;
        Objects.requireNonNull(iw2Var);
        this.mConversationCallbackDelegate = iw2Var;
        this.mActions = qrd.a(jw2Var.h);
    }

    public static l38 validateSender(l38 l38Var) {
        Objects.requireNonNull(l38Var);
        Objects.requireNonNull(l38Var.a);
        Objects.requireNonNull(l38Var.d);
        return l38Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && sqe.a(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public iw2 getConversationCallbackDelegate() {
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

    public l38 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(sqe.b(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        l38 l38Var = new l38();
        l38Var.a = "";
        l38Var.b = null;
        l38Var.c = null;
        l38Var.d = null;
        l38Var.e = false;
        l38Var.f = false;
        this.mSelf = l38Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new cff((byte) 15));
        this.mActions = Collections.EMPTY_LIST;
    }
}
