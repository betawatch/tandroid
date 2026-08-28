package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.gn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MessagePreviewParams {
    public CharacterStyle currentLink;
    public Messages forwardMessages;
    public boolean hasCaption;
    public boolean hasMedia;
    public boolean hasSecretMessages;
    public boolean hasSenders;
    public boolean hideCaption;
    public boolean hideForwardSendersName;
    public boolean isSecret;
    public boolean isVideo;
    public TLRPC.WebPage linkMedia;
    public Messages linkMessage;
    public boolean monoforum;
    public boolean multipleUsers;
    public boolean noforwards;
    private cb0 previewView;
    public gn quote;
    public int quoteEnd;
    public int quoteStart;
    public Messages replyMessage;
    public boolean singleLink;
    public TLRPC.WebPage webpage;
    public boolean webpagePhoto;
    public boolean webpageSmall;
    public boolean webpageTop;
    public boolean willSeeSenders;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class Messages {
        private long dialogId;
        public LongSparseArray<MessageObject.GroupedMessages> groupedMessagesMap;
        public boolean hasSpoilers;
        public boolean hasText;
        public ArrayList<MessageObject> messages;
        private Boolean out;
        public ArrayList<TLRPC.PollAnswerVoters> pollChosenAnswers;
        public ArrayList<MessageObject> previewMessages;
        public SparseBooleanArray selectedIds;
        private int type;

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i9, MessageObject messageObject) {
            this(bool, i9, MessagePreviewParams.singletonArrayList(messageObject), messageObject.getDialogId(), null);
        }

        public Messages checkEdits(ArrayList<MessageObject> arrayList) {
            ArrayList<MessageObject> arrayList2 = this.messages;
            if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
                boolean z10 = false;
                for (int i9 = 0; i9 < this.messages.size(); i9++) {
                    MessageObject messageObject = this.messages.get(i9);
                    if (messageObject != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            MessageObject messageObject2 = arrayList.get(i10);
                            if (messageObject2 != null && messageObject.getId() == messageObject2.getId() && messageObject.getDialogId() == messageObject2.getDialogId()) {
                                this.messages.set(i9, messageObject2);
                                z10 = true;
                                break;
                            }
                            i10++;
                        }
                    }
                }
                if (z10) {
                    return MessagePreviewParams.this.new Messages(this.out, this.type, this.messages, this.dialogId, null);
                }
            }
            return null;
        }

        public void getSelectedMessages(ArrayList<MessageObject> arrayList) {
            arrayList.clear();
            for (int i9 = 0; i9 < this.messages.size(); i9++) {
                MessageObject messageObject = this.messages.get(i9);
                if (this.selectedIds.get(messageObject.getId(), false)) {
                    arrayList.add(messageObject);
                }
            }
        }

        public Messages(MessagePreviewParams messagePreviewParams, Boolean bool, int i9, MessageObject messageObject, long j10) {
            this(bool, i9, MessagePreviewParams.singletonArrayList(messageObject), j10, null);
        }

        public Messages(Boolean bool, int i9, ArrayList<MessageObject> arrayList, long j10, SparseBooleanArray sparseBooleanArray) {
            this.groupedMessagesMap = new LongSparseArray<>();
            this.previewMessages = new ArrayList<>();
            this.selectedIds = new SparseBooleanArray();
            this.pollChosenAnswers = new ArrayList<>();
            this.out = bool;
            this.type = i9;
            this.dialogId = j10;
            this.messages = arrayList;
            if (sparseBooleanArray != null) {
                this.selectedIds = sparseBooleanArray;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = arrayList.get(i10);
                if (i9 == 0 && sparseBooleanArray == null) {
                    this.selectedIds.put(messageObject.getId(), true);
                }
                MessageObject previewMessage = MessagePreviewParams.this.toPreviewMessage(messageObject, bool, i9);
                if (!this.hasSpoilers) {
                    ArrayList<TLRPC.MessageEntity> arrayList2 = previewMessage.messageOwner.entities;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        TLRPC.MessageEntity messageEntity = arrayList2.get(i11);
                        i11++;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            this.hasSpoilers = true;
                            break;
                        }
                    }
                }
                previewMessage.messageOwner.dialog_id = j10;
                if (previewMessage.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = this.groupedMessagesMap.get(previewMessage.getGroupId(), null);
                    if (groupedMessages == null) {
                        groupedMessages = new MessageObject.GroupedMessages();
                        this.groupedMessagesMap.put(previewMessage.getGroupId(), groupedMessages);
                    }
                    groupedMessages.messages.add(previewMessage);
                }
                this.previewMessages.add(0, previewMessage);
                if (messageObject.isPoll()) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
                    PreviewMediaPoll previewMediaPoll = new PreviewMediaPoll();
                    previewMediaPoll.poll = tL_messageMediaPoll.poll;
                    previewMediaPoll.provider = tL_messageMediaPoll.provider;
                    TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                    previewMediaPoll.results = tL_pollResults;
                    int i12 = tL_messageMediaPoll.results.total_voters;
                    tL_pollResults.total_voters = i12;
                    previewMediaPoll.totalVotersCached = i12;
                    previewMessage.messageOwner.media = previewMediaPoll;
                    if (messageObject.canUnvote()) {
                        int size2 = tL_messageMediaPoll.results.results.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                            if (pollAnswerVoters.chosen) {
                                TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                                pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                                pollAnswerVoters2.correct = pollAnswerVoters.correct;
                                pollAnswerVoters2.flags = pollAnswerVoters.flags;
                                pollAnswerVoters2.option = pollAnswerVoters.option;
                                pollAnswerVoters2.voters = pollAnswerVoters.voters;
                                this.pollChosenAnswers.add(pollAnswerVoters2);
                                previewMediaPoll.results.results.add(pollAnswerVoters2);
                            } else {
                                previewMediaPoll.results.results.add(pollAnswerVoters);
                            }
                        }
                    }
                }
            }
            for (int i14 = 0; i14 < this.groupedMessagesMap.size(); i14++) {
                this.groupedMessagesMap.valueAt(i14).calculate();
            }
            LongSparseArray<MessageObject.GroupedMessages> longSparseArray = this.groupedMessagesMap;
            if (longSparseArray != null && longSparseArray.size() > 0) {
                this.hasText = this.groupedMessagesMap.valueAt(0).findCaptionMessageObject() != null;
                return;
            }
            if (arrayList.size() == 1) {
                int i15 = arrayList.get(0).type;
                if (i15 != 0 && i15 != 19) {
                    this.hasText = !TextUtils.isEmpty(r1.caption);
                } else {
                    this.hasText = !TextUtils.isEmpty(r1.messageText);
                }
            }
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class PreviewMediaPoll extends TLRPC.TL_messageMediaPoll {
        public int totalVotersCached;
    }

    public MessagePreviewParams(boolean z10, boolean z11, boolean z12) {
        this.isSecret = z10;
        this.noforwards = z10 || z11;
        this.monoforum = z12;
    }

    public static boolean areUrlsEqual(String str, String str2) {
        if (str == null || str2 == null) {
            return str == null;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (parse != parse2) {
            if (parse != null && parse2 != null && parse.getHost() != null && parse.getHost().equalsIgnoreCase(parse2.getHost()) && parse.getPort() == parse2.getPort() && normalizePath(parse.getPath()).equals(normalizePath(parse2.getPath()))) {
                if (parse.getQuery() == null) {
                }
            }
            return false;
        }
        return true;
    }

    private static String normalizePath(String str) {
        return str == null ? "" : str.endsWith("/") ? str : str.concat("/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<MessageObject> singletonArrayList(MessageObject messageObject) {
        return l0.k(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageObject toPreviewMessage(MessageObject messageObject, Boolean bool, final int i9) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        if (i9 != 1) {
            tL_message.date = ConnectionsManager.getInstance(messageObject.currentAccount).getCurrentTime();
        } else {
            tL_message.date = messageObject.messageOwner.date;
        }
        TLRPC.Message message = messageObject.messageOwner;
        tL_message.id = message.id;
        tL_message.grouped_id = message.grouped_id;
        tL_message.peer_id = message.peer_id;
        tL_message.from_id = message.from_id;
        tL_message.message = message.message;
        tL_message.rich_message = message.rich_message;
        tL_message.media = message.media;
        tL_message.action = message.action;
        tL_message.edit_date = 0;
        ArrayList<TLRPC.MessageEntity> arrayList = message.entities;
        if (arrayList != null) {
            tL_message.entities.addAll(arrayList);
        }
        boolean booleanValue = bool == null ? messageObject.messageOwner.out : bool.booleanValue();
        tL_message.out = booleanValue;
        if (booleanValue) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(messageObject.currentAccount).getClientUserId();
        }
        tL_message.unread = false;
        TLRPC.Message message2 = messageObject.messageOwner;
        tL_message.via_bot_id = message2.via_bot_id;
        tL_message.reply_markup = message2.reply_markup;
        tL_message.post = message2.post;
        tL_message.legacy = message2.legacy;
        tL_message.restriction_reason = message2.restriction_reason;
        TLRPC.Message message3 = message2.replyMessage;
        tL_message.replyMessage = message3;
        if (message3 == null && (messageObject2 = messageObject.replyMessageObject) != null) {
            tL_message.replyMessage = messageObject2.messageOwner;
        }
        tL_message.reply_to = message2.reply_to;
        tL_message.invert_media = message2.invert_media;
        if (i9 == 0) {
            long clientUserId = UserConfig.getInstance(messageObject.currentAccount).getClientUserId();
            if (!this.isSecret) {
                TLRPC.Message message4 = messageObject.messageOwner;
                messageFwdHeader = message4.fwd_from;
                if (messageFwdHeader == null) {
                    long j10 = message4.from_id.user_id;
                    if (j10 == 0 || message4.dialog_id != clientUserId || j10 != clientUserId) {
                        messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                        messageFwdHeader.from_id = messageObject.messageOwner.from_id;
                        if (messageObject.isDice()) {
                            this.willSeeSenders = true;
                        } else {
                            this.hasSenders = true;
                        }
                    }
                } else if (messageObject.isDice()) {
                    this.willSeeSenders = true;
                } else {
                    this.hasSenders = true;
                }
                if (messageFwdHeader != null) {
                    tL_message.fwd_from = messageFwdHeader;
                    tL_message.flags |= 4;
                }
                if (messageObject.isWelcomeAnchored()) {
                    tL_message.id = messageObject.getEphemeralId();
                    TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                    if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                        messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(messageObject.messageOwner.peer_id, new b(26));
                        long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                        if (peerDialogId > 0) {
                            tL_message.via_bot_id = peerDialogId;
                        }
                    }
                }
            }
            messageFwdHeader = null;
            if (messageFwdHeader != null) {
            }
            if (messageObject.isWelcomeAnchored()) {
            }
        }
        MessageObject messageObject3 = new MessageObject(messageObject.currentAccount, tL_message, true, false) { // from class: org.telegram.messenger.MessagePreviewParams.1
            @Override // org.telegram.messenger.MessageObject
            public void generateLayout(TLRPC.User user) {
                super.generateLayout(user);
                if (i9 == 2) {
                    MessagePreviewParams.this.checkCurrentLink(this);
                }
            }

            @Override // org.telegram.messenger.MessageObject
            public boolean needDrawForwarded() {
                if (MessagePreviewParams.this.hideForwardSendersName) {
                    return false;
                }
                return super.needDrawForwarded();
            }
        };
        messageObject3.previewForward = i9 == 0;
        messageObject3.preview = true;
        return messageObject3;
    }

    public void attach(cb0 cb0Var) {
        this.previewView = cb0Var;
    }

    public void checkCurrentLink(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        this.currentLink = null;
        if (messageObject != null) {
            CharSequence charSequence = messageObject.messageText;
            if (!(charSequence instanceof Spanned) || (webPage = this.webpage) == null || webPage.url == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
            for (int i9 = 0; i9 < uRLSpanArr.length; i9++) {
                if (areUrlsEqual(uRLSpanArr[i9].getURL(), this.webpage.url)) {
                    this.currentLink = uRLSpanArr[i9];
                    return;
                }
            }
        }
    }

    public void checkEdits(ArrayList<MessageObject> arrayList) {
        boolean z10;
        cb0 cb0Var;
        Messages checkEdits;
        Messages checkEdits2;
        Messages checkEdits3;
        Messages messages = this.forwardMessages;
        if (messages == null || (checkEdits3 = messages.checkEdits(arrayList)) == null) {
            z10 = false;
        } else {
            this.forwardMessages = checkEdits3;
            z10 = true;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (checkEdits2 = messages2.checkEdits(arrayList)) != null) {
            this.replyMessage = checkEdits2;
            z10 = true;
        }
        Messages messages3 = this.linkMessage;
        if (messages3 != null && (checkEdits = messages3.checkEdits(arrayList)) != null) {
            this.linkMessage = checkEdits;
            z10 = true;
        }
        if (!z10 || (cb0Var = this.previewView) == null) {
            return;
        }
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        int i9 = 0;
        while (true) {
            View[] viewArr = cb0Var.f.e;
            if (i9 >= viewArr.length) {
                return;
            }
            View view = viewArr[i9];
            if (view instanceof wa0) {
                wa0 wa0Var = (wa0) view;
                int i10 = wa0Var.a;
                oa0 oa0Var = wa0Var.e;
                if (i10 == 1) {
                    wa0Var.r = messagePreviewParams.forwardMessages;
                } else if (i10 == 0) {
                    wa0Var.r = messagePreviewParams.replyMessage;
                } else if (i10 == 2) {
                    wa0Var.r = messagePreviewParams.linkMessage;
                }
                wa0Var.h();
                if (i10 == 0) {
                    if (!cb0Var.b || messagePreviewParams.isSecret) {
                        messagePreviewParams.quote = null;
                        oa0Var.f(false);
                        wa0Var.g(false, true);
                    } else {
                        org.telegram.ui.Cells.v9 v9Var = oa0Var.W;
                        MessageObject c10 = wa0Var.c(v9Var != null ? ((org.telegram.ui.Cells.t1) v9Var).getMessageObject() : null);
                        if (c10 != null) {
                            messagePreviewParams.quoteStart = 0;
                            int min = Math.min(MessagesController.getInstance(cb0Var.w).quoteLengthMax, c10.messageOwner.message.length());
                            messagePreviewParams.quoteEnd = min;
                            messagePreviewParams.quote = gn.b(messagePreviewParams.quoteStart, min, c10);
                            View d = wa0Var.d();
                            if (d instanceof org.telegram.ui.Cells.t1) {
                                oa0Var.a0((org.telegram.ui.Cells.t1) d, messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd);
                            }
                        }
                    }
                    wa0Var.k(true);
                }
                bb0 bb0Var = wa0Var.C;
                if (bb0Var != null) {
                    bb0Var.animate().alpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f).start();
                }
            }
            i9++;
        }
    }

    public int getForwardedMessagesCount() {
        Messages messages = this.forwardMessages;
        if (messages == null) {
            return 0;
        }
        return messages.selectedIds.size();
    }

    public boolean hasLink(CharSequence charSequence, String str) {
        if (str != null) {
            try {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                try {
                    AndroidUtilities.addLinksSafe(valueOf, 1, false, true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                    if (areUrlsEqual(uRLSpan.getURL(), str)) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return false;
    }

    public boolean isEmpty() {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        ArrayList<MessageObject> arrayList3;
        Messages messages = this.forwardMessages;
        if (messages != null && (arrayList3 = messages.messages) != null && !arrayList3.isEmpty()) {
            return false;
        }
        Messages messages2 = this.replyMessage;
        if (messages2 != null && (arrayList2 = messages2.messages) != null && !arrayList2.isEmpty()) {
            return false;
        }
        Messages messages3 = this.linkMessage;
        return messages3 == null || (arrayList = messages3.messages) == null || arrayList.isEmpty();
    }

    public void updateForward(ArrayList<MessageObject> arrayList, long j10) {
        long j11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.hasCaption = false;
        this.hasSenders = false;
        this.isSecret = DialogObject.isEncryptedDialog(j10);
        this.multipleUsers = false;
        if (arrayList == null) {
            this.forwardMessages = null;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            MessageObject messageObject = arrayList.get(i9);
            if (!TextUtils.isEmpty(messageObject.caption)) {
                this.hasCaption = true;
            }
            if (!this.isSecret && (messageFwdHeader = messageObject.messageOwner.fwd_from) != null && messageFwdHeader.from_id == null && !arrayList2.contains(messageFwdHeader.from_name)) {
                arrayList2.add(messageFwdHeader.from_name);
            }
        }
        Boolean bool = Boolean.TRUE;
        Messages messages = this.forwardMessages;
        Messages messages2 = new Messages(bool, 0, arrayList, j10, messages != null ? messages.selectedIds : null);
        this.forwardMessages = messages2;
        if (messages2.messages.isEmpty()) {
            this.forwardMessages = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject2 = arrayList.get(i10);
            if (messageObject2.isFromUser()) {
                j11 = messageObject2.messageOwner.from_id.user_id;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(messageObject2.currentAccount).getChat(Long.valueOf(messageObject2.messageOwner.peer_id.channel_id));
                j11 = -((ChatObject.isChannel(chat) && chat.megagroup && messageObject2.isForwardedChannelPost()) ? messageObject2.messageOwner.fwd_from.from_id.channel_id : messageObject2.messageOwner.peer_id.channel_id);
            }
            if (!arrayList3.contains(Long.valueOf(j11))) {
                arrayList3.add(Long.valueOf(j11));
            }
        }
        if (arrayList2.size() + arrayList3.size() > 1) {
            this.multipleUsers = true;
        }
    }

    public void updateLink(int i9, TLRPC.WebPage webPage, CharSequence charSequence, MessageObject messageObject, gn gnVar, MessageObject messageObject2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message2;
        this.hasMedia = false;
        this.isVideo = false;
        this.singleLink = true;
        boolean z10 = this.webpage != webPage;
        this.webpage = webPage;
        if (TextUtils.isEmpty(charSequence) && this.webpage == null) {
            this.linkMessage = null;
        } else {
            if (charSequence == null) {
                charSequence = "";
            }
            Messages messages = this.linkMessage;
            boolean z11 = messages == null || z10;
            if (messages == null && messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                this.webpageTop = message2.invert_media;
                TLRPC.MessageMedia messageMedia3 = message2.media;
                if (messageMedia3 != null && messageMedia3.force_small_media) {
                    this.webpageSmall = true;
                }
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(AndroidUtilities.getTrimmedString(charSequence))};
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(i9).getClientUserId();
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser2;
            tL_peerUser2.user_id = UserConfig.getInstance(i9).getClientUserId();
            tL_message.entities = MediaDataController.getInstance(i9).getEntities(charSequenceArr, true);
            tL_message.message = charSequenceArr[0].toString();
            tL_message.invert_media = this.webpageTop;
            if (webPage != null) {
                tL_message.flags |= 512;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_message.media = tL_messageMediaWebPage;
                tL_messageMediaWebPage.webpage = webPage;
                boolean z12 = this.webpageSmall;
                tL_messageMediaWebPage.force_large_media = !z12;
                tL_messageMediaWebPage.force_small_media = z12;
                this.hasMedia = webPage.photo != null;
                this.isVideo = MessageObject.isVideoDocument(webPage.document);
            } else {
                this.hasMedia = false;
            }
            tL_message.out = true;
            tL_message.unread = false;
            if (messageObject != null) {
                tL_message.replyMessage = messageObject.messageOwner;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                if (gnVar != null) {
                    tL_messageReplyHeader.quote_text = gnVar.i;
                    int i10 = tL_messageReplyHeader.flags;
                    tL_messageReplyHeader.flags = i10 | 64;
                    ArrayList<TLRPC.MessageEntity> arrayList = gnVar.j;
                    tL_messageReplyHeader.quote_entities = arrayList;
                    if (arrayList != null) {
                        tL_messageReplyHeader.flags = i10 | 192;
                    }
                }
            }
            Messages messages2 = new Messages(this, Boolean.TRUE, 2, new MessageObject(i9, tL_message, true, false));
            this.linkMessage = messages2;
            if (messages2.messages.isEmpty()) {
                this.linkMessage = null;
            } else {
                MessageObject messageObject3 = this.linkMessage.messages.get(0);
                CharSequence charSequence2 = messageObject3.messageText;
                if (!(charSequence2 instanceof Spanned) || TextUtils.isEmpty(charSequence2)) {
                    CharSequence charSequence3 = messageObject3.caption;
                    if ((charSequence3 instanceof Spanned) && !TextUtils.isEmpty(charSequence3)) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) messageObject3.messageText).getSpans(0, messageObject3.caption.length(), URLSpan.class);
                        this.singleLink = uRLSpanArr == null || uRLSpanArr.length <= 1;
                    }
                } else {
                    CharSequence charSequence4 = messageObject3.messageText;
                    URLSpan[] uRLSpanArr2 = (URLSpan[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), URLSpan.class);
                    this.singleLink = uRLSpanArr2 == null || uRLSpanArr2.length <= 1;
                }
                this.hasMedia = messageObject3.hasLinkMediaToMakeSmall();
                if (z11 && messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia2 = message.media) != null) {
                    this.webpageSmall = messageMedia2.force_small_media || (messageObject3.isLinkMediaSmall() && !messageObject2.messageOwner.media.force_large_media);
                } else if (z11) {
                    this.webpageSmall = messageObject3.isLinkMediaSmall();
                }
                TLRPC.Message message3 = messageObject3.messageOwner;
                if (message3 != null && (messageMedia = message3.media) != null) {
                    boolean z13 = this.webpageSmall;
                    messageMedia.force_large_media = !z13;
                    messageMedia.force_small_media = z13;
                }
            }
        }
        cb0 cb0Var = this.previewView;
        if (cb0Var == null) {
            return;
        }
        MessagePreviewParams messagePreviewParams = cb0Var.d;
        int i11 = 0;
        while (true) {
            View[] viewArr = cb0Var.f.e;
            if (i11 >= viewArr.length) {
                return;
            }
            View view = viewArr[i11];
            if (view != null) {
                wa0 wa0Var = (wa0) view;
                FrameLayout frameLayout = wa0Var.B;
                if (wa0Var.a == 2) {
                    bb0 bb0Var = wa0Var.D;
                    bb0 bb0Var2 = wa0Var.C;
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    bb0Var2.setVisibility(messagePreviewParams.isVideo ? 4 : 0);
                    bb0Var.setVisibility(messagePreviewParams.isVideo ? 0 : 4);
                    frameLayout.animate().alpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f).start();
                    bb0Var2.a(messagePreviewParams.webpageSmall, true);
                    bb0Var.a(messagePreviewParams.webpageSmall, true);
                    wa0Var.A.a(!messagePreviewParams.webpageTop, true);
                    wa0Var.h();
                }
            }
            i11++;
        }
    }

    public void updateLinkInvertMedia(boolean z10) {
        this.webpageTop = z10;
    }

    public void updateReply(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, long j10, gn gnVar) {
        MessageObject messageObject2;
        gn gnVar2;
        int i9;
        if (this.isSecret || messageObject == null || (i9 = messageObject.type) == 10 || i9 == 11 || i9 == 22 || i9 == 21 || i9 == 18 || i9 == 25 || i9 == 16) {
            messageObject2 = null;
            gnVar2 = null;
        } else {
            messageObject2 = messageObject;
            gnVar2 = gnVar;
        }
        this.hasSecretMessages = messageObject2 != null && (messageObject2.isVoiceOnce() || messageObject2.isRoundOnce() || messageObject2.type == 30);
        if (messageObject2 == null && gnVar2 == null) {
            this.replyMessage = null;
            this.quote = null;
            return;
        }
        if (groupedMessages != null) {
            this.replyMessage = new Messages(null, 1, groupedMessages.messages, j10, null);
        } else {
            MessageObject messageObject3 = messageObject2;
            if (messageObject3 == null) {
                messageObject3 = gnVar2.a;
            }
            this.replyMessage = new Messages(this, null, 1, messageObject3, j10);
        }
        if (this.replyMessage.messages.isEmpty()) {
            this.replyMessage = null;
            return;
        }
        this.quote = gnVar2;
        if (gnVar2 != null) {
            this.quoteStart = gnVar2.b;
            this.quoteEnd = gnVar2.c;
        }
    }
}
