package androidx.car.app.messaging.model;

import a8.r1;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.q;
import androidx.car.app.utils.g;
import e0.j0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class ConversationItem implements q {
    private final List<Action> mActions;
    private final c mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final j0 mSelf;
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

    public static j0 validateSender(j0 j0Var) {
        Objects.requireNonNull(j0Var);
        Objects.requireNonNull(j0Var.a);
        Objects.requireNonNull(j0Var.d);
        return j0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && r1.a(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
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

    public j0 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(r1.b(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        j0 j0Var = new j0();
        j0Var.a = "";
        j0Var.b = null;
        j0Var.c = null;
        j0Var.d = null;
        j0Var.e = false;
        j0Var.f = false;
        this.mSelf = j0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new sa.d(2));
        this.mActions = Collections.EMPTY_LIST;
    }
}
