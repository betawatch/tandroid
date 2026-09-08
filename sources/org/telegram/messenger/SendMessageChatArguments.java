package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class SendMessageChatArguments {
    public static final SendMessageChatArguments EMPTY = new Builder().build();
    public final String quickReplyShortcut;
    public final int quickReplyShortcutId;
    public final long welcomeMessageChatId;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class Builder {
        private String quickReplyShortcut;
        private int quickReplyShortcutId;
        private long welcomeMessageChatId;

        public SendMessageChatArguments build() {
            return new SendMessageChatArguments(this);
        }

        public void setQuickReplyShortcut(String str, int i10) {
            this.quickReplyShortcut = str;
            this.quickReplyShortcutId = i10;
        }

        public void setWelcomeMessageChatId(long j3) {
            this.welcomeMessageChatId = j3;
        }
    }

    private SendMessageChatArguments(Builder builder) {
        this.welcomeMessageChatId = builder.welcomeMessageChatId;
        this.quickReplyShortcut = builder.quickReplyShortcut;
        this.quickReplyShortcutId = builder.quickReplyShortcutId;
    }
}
