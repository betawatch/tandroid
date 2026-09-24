package org.telegram.messenger;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public class SendMessageChatArguments {
    public static final SendMessageChatArguments EMPTY = new Builder().build();
    public final String quickReplyShortcut;
    public final int quickReplyShortcutId;
    public final long welcomeMessageChatId;

    /* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
