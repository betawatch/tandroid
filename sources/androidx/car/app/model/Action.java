package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class Action {
    public static final int FLAG_DEFAULT = 4;
    public static final int FLAG_IS_PERSISTENT = 2;
    public static final int FLAG_PRIMARY = 1;
    public static final int TYPE_APP_ICON = 65538;
    public static final int TYPE_CUSTOM = 1;
    static final int TYPE_STANDARD = 65536;
    private final CarColor mBackgroundColor;
    private final int mFlags;
    private final CarIcon mIcon;
    private final boolean mIsEnabled;
    private final b0 mOnClickDelegate;
    private final CarText mTitle;
    private final int mType;
    public static final Action APP_ICON = new Action(65538);
    public static final int TYPE_COMPOSE_MESSAGE = 65541;
    public static final Action COMPOSE_MESSAGE = new Action(TYPE_COMPOSE_MESSAGE);
    public static final int TYPE_BACK = 65539;
    public static final Action BACK = new Action(TYPE_BACK);
    public static final int TYPE_PAN = 65540;
    public static final Action PAN = new Action(TYPE_PAN);

    private Action(int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Standard action constructor used with non standard type");
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i10;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public static boolean isStandardActionType(int i10) {
        return (i10 & 65536) != 0;
    }

    public static String typeToString(int i10) {
        if (i10 == 1) {
            return "CUSTOM";
        }
        switch (i10) {
            case 65538:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case TYPE_PAN /* 65540 */:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(action.mOnClickDelegate == null)) && Integer.valueOf(this.mFlags).equals(Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public b0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Integer.valueOf(this.mType), Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(this.mIcon == null), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isStandard() {
        return isStandardActionType(this.mType);
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", icon: " + this.mIcon + ", bkg: " + this.mBackgroundColor + ", isEnabled: " + this.mIsEnabled + "]";
    }

    public Action(a aVar) {
        throw null;
    }

    private Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
