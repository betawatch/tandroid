package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Item;
import androidx.car.app.utils.CollectionUtils;
import androidx.core.app.Person;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConversationItem implements Item {
    private final List<Action> mActions;
    private final ConversationCallbackDelegate mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final Person mSelf;
    private final CarText mTitle;

    public int hashCode() {
        return Objects.hash(Integer.valueOf(PersonsEqualityHelper.getPersonHashCode(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && PersonsEqualityHelper.arePersonsEqual(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions);
    }

    ConversationItem(Builder builder) {
        String str = builder.mId;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = builder.mTitle;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(builder.mSelf);
        this.mIcon = builder.mIcon;
        this.mIsGroupConversation = builder.mIsGroupConversation;
        List<CarMessage> unmodifiableCopy = CollectionUtils.unmodifiableCopy(builder.mMessages);
        Objects.requireNonNull(unmodifiableCopy);
        this.mMessages = unmodifiableCopy;
        Preconditions.checkState(!r0.isEmpty(), "Message list cannot be empty.");
        ConversationCallbackDelegate conversationCallbackDelegate = builder.mConversationCallbackDelegate;
        Objects.requireNonNull(conversationCallbackDelegate);
        this.mConversationCallbackDelegate = conversationCallbackDelegate;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        this.mSelf = new Person.Builder().setName("").build();
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new ConversationCallback() { // from class: androidx.car.app.messaging.model.ConversationItem.1
            @Override // androidx.car.app.messaging.model.ConversationCallback
            public void onMarkAsRead() {
            }

            @Override // androidx.car.app.messaging.model.ConversationCallback
            public void onTextReply(String str) {
            }
        });
        this.mActions = Collections.emptyList();
    }

    public String getId() {
        return this.mId;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public Person getSelf() {
        return this.mSelf;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public ConversationCallbackDelegate getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    static Person validateSender(Person person) {
        Objects.requireNonNull(person);
        Objects.requireNonNull(person.getName());
        Objects.requireNonNull(person.getKey());
        return person;
    }

    public static final class Builder {
        final List mActions;
        ConversationCallbackDelegate mConversationCallbackDelegate;
        CarIcon mIcon;
        String mId;
        boolean mIsGroupConversation;
        List mMessages;
        Person mSelf;
        CarText mTitle;

        public Builder setMessages(List list) {
            this.mMessages = list;
            return this;
        }

        public ConversationItem build() {
            return new ConversationItem(this);
        }

        public Builder(ConversationItem conversationItem) {
            this.mId = conversationItem.getId();
            this.mTitle = conversationItem.getTitle();
            this.mSelf = conversationItem.getSelf();
            this.mIcon = conversationItem.getIcon();
            this.mIsGroupConversation = conversationItem.isGroupConversation();
            this.mConversationCallbackDelegate = conversationItem.getConversationCallbackDelegate();
            this.mMessages = conversationItem.getMessages();
            this.mActions = new ArrayList(conversationItem.getActions());
        }
    }
}
