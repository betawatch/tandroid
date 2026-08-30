package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.mq;
import org.telegram.ui.kj0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class BotForumHelper extends BaseController {
    private static volatile BotForumHelper[] Instance = new BotForumHelper[4];
    private final DialogTopicIdKeyMap<BotDraftMessage> botTextDraftsByRandomIds;
    private final DialogTopicIdKeyMap<Object> botTextDraftsByRandomIdsBlocklist;
    private final LongSparseArray<List<MessagesStorage.IntCallback>> pendingBotTopics;
    private final SharedPreferences preferences;

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class BotDraftAnimationsPool {
        private final DialogTopicIdKeyMap<kj0> animators = new DialogTopicIdKeyMap<>();
        private final SparseIntArray ids = new SparseIntArray();

        public void bind(int i10, int i11) {
            this.ids.put(i11, i10);
        }

        public kj0 getAnimator(long j10, int i10, boolean z4) {
            if (i10 > 0) {
                i10 = this.ids.get(i10, 0);
            }
            if (i10 == 0) {
                return null;
            }
            long j11 = i10;
            kj0 kj0Var = this.animators.get(j10, 0L, j11);
            if (kj0Var != null || !z4) {
                return kj0Var;
            }
            kj0 kj0Var2 = new kj0();
            this.animators.put(j10, 0L, j11, kj0Var2);
            return kj0Var2;
        }

        public void removeAnimator(long j10, int i10) {
            if (i10 > 0) {
                i10 = this.ids.get(i10, 0);
            }
            if (i10 == 0) {
                return;
            }
            this.animators.remove(j10, 0L, i10);
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class BotDraftMessage {
        private boolean canStop;
        private boolean keepOnStop;
        public final int localMessageId;
        private MessageObject messageObject;
        public final long randomId;
        private boolean removed;
        private TL_iv.RichMessage richMessage;
        private Runnable selfDestruct;
        private TLRPC.TL_textWithEntities text;
        public final int topicId;
        public final long userId;

        private BotDraftMessage(long j10, int i10, long j11, int i11) {
            this.userId = j10;
            this.topicId = i10;
            this.randomId = j11;
            this.localMessageId = i11;
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class BotForumTextDraftDeleteNotification {
        public final long botTopicId;
        public final long botUserId;
        public final int messageId;

        public BotForumTextDraftDeleteNotification(long j10, long j11, int i10) {
            this.botUserId = j10;
            this.botTopicId = j11;
            this.messageId = i10;
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class BotForumTextDraftUpdateNotification {
        public final long botTopicId;
        public final long botUserId;
        public final boolean isNew;
        public final MessageObject messageObject;

        public BotForumTextDraftUpdateNotification(long j10, long j11, MessageObject messageObject, boolean z4) {
            this.botUserId = j10;
            this.botTopicId = j11;
            this.messageObject = messageObject;
            this.isNew = z4;
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class BotForumTopicCreateNotification {
        public final long dialogId;
        public final int topicId;

        public BotForumTopicCreateNotification(long j10, int i10) {
            this.dialogId = j10;
            this.topicId = i10;
        }
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public enum SteamingSendButtonState {
        NO_STREAMING,
        BLOCKING,
        STOP
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class TypingBotSpan extends mq {
        public TypingBotSpan(g51 g51Var, int i10) {
            super(i10, g51Var);
        }
    }

    private BotForumHelper(int i10) {
        super(i10);
        this.botTextDraftsByRandomIds = new DialogTopicIdKeyMap<>();
        this.botTextDraftsByRandomIdsBlocklist = new DialogTopicIdKeyMap<>();
        this.pendingBotTopics = new LongSparseArray<>();
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("bot_drafts" + i10, 0);
    }

    public static CharSequence applyTypingAnimationSpan(CharSequence charSequence) {
        TypingBotSpan[] typingBotSpanArr;
        if ((charSequence instanceof Spannable) && (typingBotSpanArr = (TypingBotSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), TypingBotSpan.class)) != null && typingBotSpanArr.length > 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        g51 g51Var = new g51(true);
        g51Var.b(-1);
        g51Var.d();
        TypingBotSpan typingBotSpan = new TypingBotSpan(g51Var, 1);
        typingBotSpan.setColorKey(org.telegram.ui.ActionBar.j6.ec);
        typingBotSpan.setTopOffset(-AndroidUtilities.dp(10.0f));
        spannableStringBuilder.append((CharSequence) " _");
        spannableStringBuilder.setSpan(typingBotSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private MessageObject createDraftMessage(long j10, int i10, long j11, int i11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.dialog_id = j10;
        tL_message.peer_id = getMessagesController().getPeer(j10);
        tL_message.from_id = getMessagesController().getPeer(j10);
        tL_message.local_id = i11;
        tL_message.id = i11;
        tL_message.random_id = j11;
        tL_message.message = tL_textWithEntities.text;
        tL_message.entities = tL_textWithEntities.entities;
        tL_message.flags |= 128;
        tL_message.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
        tL_message.reply_to = tL_messageReplyHeader;
        tL_message.flags |= 16;
        tL_messageReplyHeader.forum_topic = true;
        tL_messageReplyHeader.reply_to_top_id = i10;
        tL_messageReplyHeader.flags |= 2;
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.flags |= 512;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    public static BotForumHelper getInstance(int i10) {
        BotForumHelper botForumHelper;
        BotForumHelper botForumHelper2 = Instance[i10];
        if (botForumHelper2 != null) {
            return botForumHelper2;
        }
        synchronized (BotForumHelper.class) {
            try {
                botForumHelper = Instance[i10];
                if (botForumHelper == null) {
                    BotForumHelper[] botForumHelperArr = Instance;
                    BotForumHelper botForumHelper3 = new BotForumHelper(i10);
                    botForumHelperArr[i10] = botForumHelper3;
                    botForumHelper = botForumHelper3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return botForumHelper;
    }

    public static boolean isBotForum(int i10, long j10) {
        if (j10 > 0) {
            return UserObject.isBotForum(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        }
        MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beforeSendingFinalRequest$3(long[] jArr, long j10, int i10, Runnable runnable) {
        for (long j11 : jArr) {
            getMessagesStorage().updateMessageTopicId(j10, j11, i10);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$beforeSendingFinalRequest$4(TLObject tLObject, long[] jArr, long j10, Runnable runnable, int i10) {
        boolean z4 = tLObject instanceof TLRPC.TL_messages_forwardMessages;
        if (z4) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            tL_messages_forwardMessages.top_msg_id = i10;
            tL_messages_forwardMessages.flags |= 512;
        } else {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_inputReplyToMessage.reply_to_msg_id = i10;
            if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject;
                tL_messages_sendMessage.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMessage.flags |= 1;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                tL_messages_sendMedia.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMedia.flags |= 1;
            } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                tL_sendMessage.reply_to = tL_inputReplyToMessage;
                tL_sendMessage.flags |= 32;
            } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult = (TLRPC.TL_messages_sendInlineBotResult) tLObject;
                tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMessage;
                tL_messages_sendInlineBotResult.flags |= 1;
            } else if (z4) {
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = (TLRPC.TL_messages_forwardMessages) tLObject;
                tL_messages_forwardMessages2.reply_to = tL_inputReplyToMessage;
                tL_messages_forwardMessages2.flags |= 1;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMultiMedia.flags |= 1;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new kh.x(this, jArr, j10, i10, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendBotTopicCreate$5(long j10, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        TL_update.TL_updateMessageID tL_updateMessageID;
        if (updates == null) {
            performSendBotTopicCreateComplete(j10, -1);
            return;
        }
        getMessagesController().processUpdates(updates, false);
        ArrayList<TLRPC.Update> arrayList = updates.updates;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                tL_updateMessageID = null;
                break;
            }
            TLRPC.Update update = arrayList.get(i10);
            i10++;
            TLRPC.Update update2 = update;
            if (update2 instanceof TL_update.TL_updateMessageID) {
                tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                break;
            }
        }
        if (tL_updateMessageID == null) {
            performSendBotTopicCreateComplete(j10, -1);
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
        tL_messageActionTopicCreate.title = str;
        tL_messageService.action = tL_messageActionTopicCreate;
        tL_messageService.peer_id = getMessagesController().getPeer(j10);
        tL_messageService.dialog_id = j10;
        tL_messageService.id = tL_updateMessageID.id;
        tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
        int i11 = tL_updateMessageID.id;
        tL_forumTopic.id = i11;
        tL_forumTopic.my = true;
        tL_forumTopic.flags |= 2;
        tL_forumTopic.topicStartMessage = tL_messageService;
        tL_forumTopic.title = str;
        tL_forumTopic.top_message = i11;
        tL_forumTopic.topMessage = tL_messageService;
        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().clientUserId);
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.icon_color = 0;
        tL_forumTopic.title_missing = true;
        getMessagesController().getTopicsController().onTopicCreated(j10, tL_forumTopic, true);
        performSendBotTopicCreateComplete(j10, tL_updateMessageID.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumTopicDidCreate, new BotForumTopicCreateNotification(j10, tL_updateMessageID.id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBotForumDraftTimeout, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onBotForumDraftUpdate$1(long j10, int i10, long j11) {
        long j12 = i10;
        BotDraftMessage remove = this.botTextDraftsByRandomIds.remove(j10, j12, j11);
        if (remove == null) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j10, j12, remove.localMessageId));
    }

    private void performSendBotTopicCreate(TLRPC.InputPeer inputPeer, String str, long j10, MessagesStorage.IntCallback intCallback) {
        long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        List<MessagesStorage.IntCallback> list = this.pendingBotTopics.get(peerDialogId);
        if (list != null) {
            list.add(intCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(intCallback);
        this.pendingBotTopics.put(peerDialogId, arrayList);
        TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
        tL_messages_createForumTopic.title = TextUtils.isEmpty(str) ? "#New Chat" : str;
        tL_messages_createForumTopic.title_missing = true;
        tL_messages_createForumTopic.peer = inputPeer;
        tL_messages_createForumTopic.random_id = j10;
        getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new a(), new rh(this, peerDialogId, str));
    }

    private void performSendBotTopicCreateComplete(long j10, int i10) {
        List<MessagesStorage.IntCallback> list = this.pendingBotTopics.get(j10);
        if (list != null) {
            this.pendingBotTopics.remove(j10);
            Iterator<MessagesStorage.IntCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().run(i10);
            }
        }
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, MessageObject messageObject, Runnable runnable) {
        return beforeSendingFinalRequest(tLObject, Collections.singletonList(messageObject), runnable);
    }

    public SteamingSendButtonState getStreamingSendButtonState(long j10, int i10) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, i10);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return SteamingSendButtonState.NO_STREAMING;
        }
        int size = longSparseArray.size();
        BotDraftMessage botDraftMessage = null;
        for (int i11 = 0; i11 < size; i11++) {
            botDraftMessage = longSparseArray.valueAt(i11);
            if (!botDraftMessage.removed) {
                break;
            }
        }
        return (botDraftMessage == null || botDraftMessage.removed) ? SteamingSendButtonState.NO_STREAMING : botDraftMessage.canStop ? SteamingSendButtonState.STOP : SteamingSendButtonState.BLOCKING;
    }

    public boolean hasBotForumDrafts(long j10, int i10) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, i10);
        if (longSparseArray != null && longSparseArray.size() > 0) {
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!longSparseArray.valueAt(i11).removed) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isStreamingTopic(long j10, long j11) {
        return this.preferences.getBoolean(j10 + "_" + j11, false);
    }

    public MessageObject onBotForumDraftCheckNewMessages(long j10, int i10, int i11, String str) {
        BotDraftMessage botDraftMessage;
        removeAllMarkedAsRemovedMessages(j10, i10);
        long j11 = i10;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j11);
        if (longSparseArray == null) {
            return null;
        }
        int i12 = 0;
        BotDraftMessage botDraftMessage2 = null;
        while (true) {
            if (i12 >= longSparseArray.size()) {
                botDraftMessage = botDraftMessage2;
                break;
            }
            BotDraftMessage valueAt = longSparseArray.valueAt(i12);
            if (botDraftMessage2 == null) {
                botDraftMessage2 = valueAt;
            }
            if (str != null && valueAt.text != null && str.startsWith(valueAt.text.text)) {
                botDraftMessage = valueAt;
                break;
            }
            i12++;
        }
        if (botDraftMessage == null) {
            return null;
        }
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        this.botTextDraftsByRandomIds.remove(j10, j11, botDraftMessage.randomId);
        FileLog.d("[BotForum] onDraftNewMessage " + j10 + " " + i10);
        return botDraftMessage.messageObject;
    }

    public void onBotForumDraftUpdate(long j10, int i10, TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction) {
        onBotForumDraftUpdate(j10, i10, tL_sendMessageTextDraftAction.random_id, tL_sendMessageTextDraftAction.text, tL_sendMessageTextDraftAction.can_stop, tL_sendMessageTextDraftAction.keep_on_stop);
    }

    public void removeAllMarkedAsRemovedMessages(long j10, int i10) {
        long j11 = i10;
        long j12 = j10;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j12, j11);
        if (longSparseArray == null) {
            return;
        }
        int size = longSparseArray.size();
        int i11 = 0;
        while (i11 < size) {
            BotDraftMessage valueAt = longSparseArray.valueAt(i11);
            if (valueAt.removed) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j12, j11, valueAt.localMessageId));
                this.botTextDraftsByRandomIds.remove(j10, j11, valueAt.randomId);
                i11--;
                size--;
            }
            i11++;
            j12 = j10;
        }
    }

    public void saveIsStreamingTopic(long j10, long j11, boolean z4) {
        this.preferences.edit().putBoolean(j10 + "_" + j11, z4).apply();
    }

    public void stopStreaming(long j10, long j11) {
        long j12;
        long j13;
        long j14;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j11);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return;
        }
        int size = longSparseArray.size();
        int i10 = 0;
        BotDraftMessage botDraftMessage = null;
        long j15 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j15 = longSparseArray.keyAt(i11);
            botDraftMessage = longSparseArray.valueAt(i11);
            if (!botDraftMessage.removed) {
                break;
            }
        }
        long j16 = j15;
        BotDraftMessage botDraftMessage2 = botDraftMessage;
        if (botDraftMessage2 == null || botDraftMessage2.removed) {
            return;
        }
        if (botDraftMessage2.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage2.selfDestruct);
        }
        this.botTextDraftsByRandomIdsBlocklist.put(j10, j11, j16, new Object());
        if (botDraftMessage2.keepOnStop) {
            botDraftMessage2.removed = true;
            j12 = j10;
            j13 = j11;
            j14 = j16;
        } else {
            j12 = j10;
            j13 = j11;
            this.botTextDraftsByRandomIds.remove(j12, j13, j16);
            j14 = j16;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j12, j13, botDraftMessage2.localMessageId));
        }
        TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
        tL_sendMessageStopDraftAction.random_id = j14;
        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
        tL_messages_setTyping.peer = getMessagesController().getInputPeer(j12);
        tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
        if (j13 != 0) {
            tL_messages_setTyping.flags |= 1;
            tL_messages_setTyping.top_msg_id = (int) j13;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new l0(i10));
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class DialogTopicIdKeyMap<T> {
        private final LongSparseArray<LongSparseArray<LongSparseArray<T>>> map = new LongSparseArray<>();

        public LongSparseArray<T> get(long j10, long j11) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j10);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j11);
        }

        public T put(long j10, long j11, long j12, T t6) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j10);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.map.put(j10, longSparseArray);
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j11);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray<>();
                longSparseArray.put(j11, longSparseArray2);
            }
            T t9 = longSparseArray2.get(j12);
            longSparseArray2.put(j12, t6);
            return t9;
        }

        public T remove(long j10, long j11, long j12) {
            LongSparseArray<T> longSparseArray;
            LongSparseArray<LongSparseArray<T>> longSparseArray2 = this.map.get(j10);
            if (longSparseArray2 == null || (longSparseArray = longSparseArray2.get(j11)) == null) {
                return null;
            }
            T t6 = longSparseArray.get(j12);
            longSparseArray.remove(j12);
            return t6;
        }

        public LongSparseArray<T> removeAll(long j10, long j11) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j10);
            if (longSparseArray == null) {
                return null;
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j11);
            longSparseArray.remove(j11);
            return longSparseArray2;
        }

        public T get(long j10, long j11, long j12) {
            LongSparseArray<T> longSparseArray = get(j10, j11);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean beforeSendingFinalRequest(final TLObject tLObject, List<MessageObject> list, final Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        long j10;
        long j11;
        String str;
        if (list == null || list.isEmpty()) {
            return true;
        }
        boolean z4 = tLObject instanceof TLRPC.TL_messages_sendMessage;
        if (z4) {
            inputPeer2 = ((TLRPC.TL_messages_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMedia) tLObject).peer;
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            inputPeer2 = ((TL_ephemeral.TL_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            inputPeer2 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            inputPeer2 = ((TLRPC.TL_messages_forwardMessages) tLObject).to_peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).peer;
        } else {
            inputPeer = null;
            long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
            if (inputPeer != null || peerDialogId <= 0 || !UserObject.isBotForumWithEditableTopics(getMessagesController().getUser(Long.valueOf(peerDialogId)))) {
                return true;
            }
            final long[] jArr = new long[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                jArr[i10] = list.get(i10).getId();
            }
            if (z4) {
                j11 = ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                j11 = ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
            } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                j11 = ((TL_ephemeral.TL_sendMessage) tLObject).random_id;
            } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                j11 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
            } else {
                if (!(tLObject instanceof TLRPC.TL_messages_forwardMessages)) {
                    j10 = peerDialogId;
                    if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        ArrayList<TLRPC.TL_inputSingleMedia> arrayList = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                        int size = arrayList.size();
                        j11 = 0;
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.TL_inputSingleMedia tL_inputSingleMedia = arrayList.get(i11);
                            i11++;
                            j11 = MediaDataController.calcHash(j11, tL_inputSingleMedia.random_id);
                        }
                    } else {
                        j11 = 0;
                    }
                    if (!((!z4 ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
                        return true;
                    }
                    if ((tLObject instanceof TLRPC.TL_messages_forwardMessages) && ((TLRPC.TL_messages_forwardMessages) tLObject).top_msg_id != 0) {
                        return true;
                    }
                    if (z4) {
                        str = ((TLRPC.TL_messages_sendMessage) tLObject).message;
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        str = ((TLRPC.TL_messages_sendMedia) tLObject).message;
                    } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                        str = ((TL_ephemeral.TL_sendMessage) tLObject).message;
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia2 = arrayList2.get(i12);
                                i12++;
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia3 = tL_inputSingleMedia2;
                                if (!TextUtils.isEmpty(tL_inputSingleMedia3.message)) {
                                    str = tL_inputSingleMedia3.message;
                                    break;
                                }
                            }
                        }
                        str = null;
                    }
                    long nextRandomId = j11 != 0 ? ~j11 : getSendMessagesHelper().getNextRandomId();
                    if (TextUtils.isEmpty(str)) {
                        str = LocaleController.getString(R.string.TopicsTitleMedia);
                    } else if (str.length() > 16) {
                        str = str.substring(0, 16) + "...";
                    }
                    final long j12 = j10;
                    performSendBotTopicCreate(inputPeer, str, nextRandomId, new MessagesStorage.IntCallback() { // from class: org.telegram.messenger.j0
                        @Override // org.telegram.messenger.MessagesStorage.IntCallback
                        public final void run(int i13) {
                            BotForumHelper.this.lambda$beforeSendingFinalRequest$4(tLObject, jArr, j12, runnable, i13);
                        }
                    });
                    return false;
                }
                ArrayList<Long> arrayList3 = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id;
                int size3 = arrayList3.size();
                j11 = 0;
                int i13 = 0;
                while (i13 < size3) {
                    Long l10 = arrayList3.get(i13);
                    i13++;
                    j11 = MediaDataController.calcHash(j11, l10.longValue());
                    peerDialogId = peerDialogId;
                }
            }
            j10 = peerDialogId;
            if (!((!z4 ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
            }
        }
        inputPeer = inputPeer2;
        long peerDialogId2 = DialogObject.getPeerDialogId(inputPeer);
        return inputPeer != null ? true : true;
    }

    public void onBotForumDraftUpdate(long j10, int i10, TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction) {
        onBotForumDraftUpdate(j10, i10, tL_sendMessageRichMessageDraftAction.random_id, tL_sendMessageRichMessageDraftAction.rich_message, tL_sendMessageRichMessageDraftAction.can_stop, tL_sendMessageRichMessageDraftAction.keep_on_stop);
    }

    private void onBotForumDraftUpdate(long j10, int i10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, boolean z10) {
        long[] jArr;
        BotDraftMessage botDraftMessage;
        FileLog.d("[BotForum] onDraftNewDraft " + j10 + " " + i10 + " " + j11);
        long j12 = (long) i10;
        if (this.botTextDraftsByRandomIdsBlocklist.get(j10, j12, j11) != null) {
            FileLog.d("[BotForum] onDraftNewDraft ignore " + j10 + " " + i10 + " " + j11);
            return;
        }
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j12);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            jArr = null;
        } else {
            jArr = new long[longSparseArray.size()];
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                jArr[i11] = longSparseArray.keyAt(i11);
            }
        }
        long[] jArr2 = jArr;
        BotDraftMessage botDraftMessage2 = this.botTextDraftsByRandomIds.get(j10, j12, j11);
        if (botDraftMessage2 == null) {
            BotDraftMessage botDraftMessage3 = new BotDraftMessage(j10, i10, j11, getUserConfig().getNewMessageId());
            this.botTextDraftsByRandomIds.put(j10, j12, j11, botDraftMessage3);
            botDraftMessage = botDraftMessage3;
        } else {
            botDraftMessage = botDraftMessage2;
        }
        botDraftMessage.keepOnStop = z10;
        botDraftMessage.canStop = z4;
        if (jArr2 != null) {
            for (long j13 : jArr2) {
                if (j13 != j11) {
                    BotDraftMessage botDraftMessage4 = longSparseArray.get(j13);
                    if (botDraftMessage4.selfDestruct != null) {
                        AndroidUtilities.cancelRunOnUIThread(botDraftMessage4.selfDestruct);
                    }
                    lambda$onBotForumDraftUpdate$1(j10, i10, j13);
                }
            }
        }
        boolean z11 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new k0(this, j10, i10, j11, 1);
        botDraftMessage.text = tL_textWithEntities;
        botDraftMessage.messageObject = createDraftMessage(j10, i10, j11, botDraftMessage.localMessageId, tL_textWithEntities);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j10, j12, botDraftMessage.messageObject, z11));
    }

    private MessageObject createDraftMessage(long j10, int i10, long j11, int i11, TL_iv.RichMessage richMessage) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.dialog_id = j10;
        tL_message.peer_id = getMessagesController().getPeer(j10);
        tL_message.from_id = getMessagesController().getPeer(j10);
        tL_message.local_id = i11;
        tL_message.id = i11;
        tL_message.random_id = j11;
        tL_message.message = "";
        tL_message.flags |= 8192;
        tL_message.rich_message = richMessage;
        tL_message.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
        tL_message.reply_to = tL_messageReplyHeader;
        tL_message.flags |= 16;
        tL_messageReplyHeader.forum_topic = true;
        tL_messageReplyHeader.reply_to_top_id = i10;
        tL_messageReplyHeader.flags |= 2;
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.flags |= 512;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    private void onBotForumDraftUpdate(long j10, int i10, long j11, TL_iv.RichMessage richMessage, boolean z4, boolean z10) {
        long[] jArr;
        BotDraftMessage botDraftMessage;
        FileLog.d("[BotForum] onDraftNewDraft (rich_message) " + j10 + " " + i10 + " " + j11);
        long j12 = (long) i10;
        if (this.botTextDraftsByRandomIdsBlocklist.get(j10, j12, j11) != null) {
            FileLog.d("[BotForum] onDraftNewDraft (rich_message) ignore " + j10 + " " + i10 + " " + j11);
            return;
        }
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j12);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            jArr = null;
        } else {
            jArr = new long[longSparseArray.size()];
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                jArr[i11] = longSparseArray.keyAt(i11);
            }
        }
        long[] jArr2 = jArr;
        BotDraftMessage botDraftMessage2 = this.botTextDraftsByRandomIds.get(j10, j12, j11);
        if (botDraftMessage2 == null) {
            BotDraftMessage botDraftMessage3 = new BotDraftMessage(j10, i10, j11, getUserConfig().getNewMessageId());
            this.botTextDraftsByRandomIds.put(j10, j12, j11, botDraftMessage3);
            botDraftMessage = botDraftMessage3;
        } else {
            botDraftMessage = botDraftMessage2;
        }
        botDraftMessage.keepOnStop = z10;
        botDraftMessage.canStop = z4;
        if (jArr2 != null) {
            for (long j13 : jArr2) {
                if (j13 != j11) {
                    BotDraftMessage botDraftMessage4 = longSparseArray.get(j13);
                    if (botDraftMessage4.selfDestruct != null) {
                        AndroidUtilities.cancelRunOnUIThread(botDraftMessage4.selfDestruct);
                    }
                    lambda$onBotForumDraftUpdate$1(j10, i10, j13);
                }
            }
        }
        boolean z11 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new k0(this, j10, i10, j11, 0);
        botDraftMessage.richMessage = richMessage;
        botDraftMessage.messageObject = createDraftMessage(j10, i10, j11, botDraftMessage.localMessageId, richMessage);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j10, j12, botDraftMessage.messageObject, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopStreaming$2(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }
}
