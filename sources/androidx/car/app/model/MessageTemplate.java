package androidx.car.app.model;

import android.util.Log;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class MessageTemplate implements Template {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;
    private final CarText mTitle;

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        Objects.requireNonNull(carText);
        return carText;
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public List<Action> getActions() {
        return CollectionUtils.emptyIfNull(this.mActionList);
    }

    public String toString() {
        return "MessageTemplate";
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip);
    }

    MessageTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mMessage = builder.mMessage;
        this.mDebugMessage = builder.mDebugMessage;
        this.mIcon = builder.mIcon;
        this.mHeaderAction = builder.mHeaderAction;
        this.mActionStrip = builder.mActionStrip;
        this.mActionList = CollectionUtils.unmodifiableCopy(builder.mActionList);
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.emptyList();
    }

    public static final class Builder {
        List mActionList = new ArrayList();
        ActionStrip mActionStrip;
        Throwable mDebugCause;
        CarText mDebugMessage;
        String mDebugString;
        Action mHeaderAction;
        CarIcon mIcon;
        boolean mIsLoading;
        CarText mMessage;
        CarText mTitle;

        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText create = CarText.create(charSequence);
            this.mTitle = create;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(create);
            return this;
        }

        public Builder setHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public MessageTemplate build() {
            if (this.mIsLoading && this.mIcon != null) {
                throw new IllegalStateException("Template in a loading state can not have an icon");
            }
            if (this.mMessage.isEmpty()) {
                throw new IllegalStateException("Message cannot be empty");
            }
            String str = this.mDebugString;
            if (str == null) {
                str = "";
            }
            if (!str.isEmpty() && this.mDebugCause != null) {
                str = str + "\n";
            }
            String str2 = str + Log.getStackTraceString(this.mDebugCause);
            if (!str2.isEmpty()) {
                this.mDebugMessage = CarText.create(str2);
            }
            return new MessageTemplate(this);
        }

        public Builder(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mMessage = CarText.create(charSequence);
        }
    }
}
