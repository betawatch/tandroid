package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;

/* loaded from: classes3.dex */
public class ReplyMessageLine {
    public int backgroundColor;
    public final AnimatedColor backgroundColorAnimated;
    private LoadingDrawable backgroundLoadingDrawable;
    public int color1;
    public final AnimatedColor color1Animated;
    public int color2;
    public final AnimatedFloat color2Alpha;
    public final AnimatedColor color2Animated;
    public int color3;
    public final AnimatedFloat color3Alpha;
    public final AnimatedColor color3Animated;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    public int emojiColor;
    private long emojiDocumentId;
    private boolean emojiLoaded;
    public final AnimatedFloat emojiLoadedT;
    private float emojiOffsetX;
    private float emojiOffsetY;
    public boolean hasColor2;
    public boolean hasColor3;
    private IconCoords[] iconCoords;
    private boolean lastHasColor3;
    private float lastHeight;
    private long lastLoadingTTime;
    private boolean loading;
    public final AnimatedFloat loadingStateT;
    private float loadingT;
    private float loadingTranslationT;
    public int nameColor;
    public final AnimatedColor nameColorAnimated;
    private final View parentView;
    private boolean reversedOut;
    private boolean sponsored;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable sticker;
    private long stickerDocumentId;
    public final AnimatedFloat switchStateT;
    private long wasCollectionId;
    private int wasColorId;
    private int wasMessageId;
    private final RectF rectF = new RectF();
    private final Path clipPath = new Path();
    private final Paint color1Paint = new Paint(1);
    private final Paint color2Paint = new Paint(1);
    private final Paint color3Paint = new Paint(1);
    public final float[] radii = new float[8];
    private final Path lineClipPath = new Path();
    private final Path backgroundPath = new Path();
    public final Paint backgroundPaint = new Paint();
    private Path color2Path = new Path();
    private Path color3Path = new Path();
    private int switchedCount = 0;
    private float emojiAlpha = 1.0f;

    public ReplyMessageLine(View view) {
        this.parentView = view;
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: org.telegram.ui.Components.ReplyMessageLine.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                if (ReplyMessageLine.this.emoji != null) {
                    ReplyMessageLine.this.emoji.attach();
                }
                if (ReplyMessageLine.this.sticker != null) {
                    ReplyMessageLine.this.sticker.attach();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                if (ReplyMessageLine.this.emoji != null) {
                    ReplyMessageLine.this.emoji.detach();
                }
                if (ReplyMessageLine.this.sticker != null) {
                    ReplyMessageLine.this.sticker.attach();
                }
            }
        });
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color1Animated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color2Animated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color3Animated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.nameColorAnimated = new AnimatedColor(view, 0L, 400L, cubicBezierInterpolator);
        this.color2Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
        this.color3Alpha = new AnimatedFloat(view, 0L, 400L, cubicBezierInterpolator);
        this.emojiLoadedT = new AnimatedFloat(view, 0L, 440L, cubicBezierInterpolator);
        this.loadingStateT = new AnimatedFloat(view, 0L, 320L, cubicBezierInterpolator);
        this.switchStateT = new AnimatedFloat(view, 0L, 320L, cubicBezierInterpolator);
    }

    public int getColor() {
        return this.reversedOut ? this.color2 : this.color1;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    private void resolveColor(MessageObject messageObject, int i, Theme.ResourcesProvider resourcesProvider) {
        if (resourcesProvider != null) {
            resourcesProvider.isDark();
        } else {
            Theme.isCurrentThemeDark();
        }
        if (this.wasColorId != i) {
            int id = messageObject != null ? messageObject.getId() : 0;
            if (id == this.wasMessageId) {
                this.switchedCount++;
            }
            this.wasCollectionId = 0L;
            this.wasColorId = i;
            this.wasMessageId = id;
        }
        if (i < 7) {
            int color = Theme.getColor(Theme.keys_avatar_nameInMessage[i], resourcesProvider);
            this.color3 = color;
            this.color2 = color;
            this.color1 = color;
            this.hasColor3 = false;
            this.hasColor2 = false;
            return;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color2 = peerColors != null ? peerColors.getColor(i) : null;
        if (color2 == null) {
            int color3 = Theme.getColor((messageObject == null || !messageObject.isOutOwner()) ? Theme.key_chat_inReplyLine : Theme.key_chat_outReplyLine, resourcesProvider);
            this.color3 = color3;
            this.color2 = color3;
            this.color1 = color3;
            this.hasColor3 = false;
            this.hasColor2 = false;
            return;
        }
        this.color1 = color2.getColor(0, resourcesProvider);
        this.color2 = color2.getColor(1, resourcesProvider);
        int color4 = color2.getColor(2, resourcesProvider);
        this.color3 = color4;
        int i2 = this.color2;
        int i3 = this.color1;
        this.hasColor2 = i2 != i3;
        boolean z = color4 != i3;
        this.hasColor3 = z;
        if (z) {
            this.color3 = i2;
            this.color2 = color4;
        }
    }

    private int resolveCollectionColor(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, Theme.ResourcesProvider resourcesProvider) {
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        int i = (!isDark || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!isDark || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.wasCollectionId != tL_peerColorCollectible.collectible_id) {
            int id = messageObject != null ? messageObject.getId() : 0;
            if (id == this.wasMessageId) {
                this.switchedCount++;
            }
            this.wasColorId = 0;
            this.wasCollectionId = tL_peerColorCollectible.collectible_id;
            this.wasMessageId = id;
        }
        this.reversedOut = false;
        this.color1 = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z = arrayList.size() >= 2;
        this.hasColor2 = z;
        if (z) {
            this.color2 = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z2 = arrayList.size() >= 3;
        this.hasColor3 = z2;
        if (z2) {
            this.color3 = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i2 = i | (-16777216);
        this.nameColor = i2;
        this.backgroundColor = Theme.multAlpha(i2, 0.1f);
        long j = tL_peerColorCollectible.background_emoji_id;
        this.emojiDocumentId = j;
        this.stickerDocumentId = tL_peerColorCollectible.gift_emoji_id;
        if (j != 0 && this.emoji == null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view = this.parentView;
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).isCellAttachedToWindow()) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        this.emojiColor = this.nameColor;
        if (this.stickerDocumentId != 0 && this.sticker == null) {
            this.sticker = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view2 = this.parentView;
            if (!(view2 instanceof ChatMessageCell) ? view2.isAttachedToWindow() : ((ChatMessageCell) view2).isCellAttachedToWindow()) {
                this.sticker.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.set(this.stickerDocumentId, true);
        }
        return this.nameColorAnimated.set(this.nameColor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x03ca, code lost:
    
        if (r21 == 2) goto L243;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int check(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, Theme.ResourcesProvider resourcesProvider, int i) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int i2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        int i3;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.Message message4;
        int i4;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        if (!messageObject.isOutOwner() && i != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return resolveCollectionColor(messageObject, tL_peerColorCollectible, resourcesProvider);
        }
        this.reversedOut = false;
        this.emojiDocumentId = 0L;
        this.stickerDocumentId = 0L;
        this.sponsored = messageObject.isSponsored();
        if (i == 4 && (message4 = messageObject.messageOwner) != null && MessageObject.getMedia(message4) != null && (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            long j = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user3 = j != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j)) : null;
            if (!messageObject.isOutOwner() && i != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, resourcesProvider);
                }
            }
            if (user3 != null) {
                i4 = UserObject.getColorId(user3);
                this.emojiDocumentId = UserObject.getEmojiId(user3);
            } else {
                i4 = 0;
            }
            resolveColor(messageObject, i4, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else if (i != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user2 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
            int i5 = messageObject.overrideLinkColor;
            if (i5 < 0) {
                if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (i3 = peerColor.color) == -1) {
                    TLRPC.Message message5 = messageObject.messageOwner;
                    if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        if (peerDialogId < 0) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                            if (!messageObject.isOutOwner() && i != 2 && chat2 != null) {
                                TLRPC.PeerColor peerColor4 = chat2.color;
                                if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, resourcesProvider);
                                }
                            }
                            i5 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                            if (i == 3) {
                                this.emojiDocumentId = ChatObject.getEmojiId(chat2);
                            }
                        } else {
                            TLRPC.User user4 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                            if (!messageObject.isOutOwner() && i != 2 && user4 != null) {
                                TLRPC.PeerColor peerColor5 = user4.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, resourcesProvider);
                                }
                            }
                            i5 = user4 != null ? UserObject.getColorId(user4) : 5;
                            if (i == 3) {
                                this.emojiDocumentId = UserObject.getEmojiId(user4);
                            }
                        }
                    } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && user2 != null) {
                        TLRPC.User currentUser = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : user2;
                        if (currentUser != null) {
                            user2 = currentUser;
                        }
                        if (!messageObject.isOutOwner() && i != 2) {
                            TLRPC.PeerColor peerColor6 = user2.color;
                            if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, resourcesProvider);
                            }
                        }
                        i2 = UserObject.getColorId(user2);
                        if (i == 3) {
                            this.emojiDocumentId = UserObject.getEmojiId(user2);
                        }
                    } else if (messageObject.isFromUser() && user2 != null) {
                        if (!messageObject.isOutOwner() && i != 2) {
                            TLRPC.PeerColor peerColor7 = user2.color;
                            if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, resourcesProvider);
                            }
                        }
                        i2 = UserObject.getColorId(user);
                        if (i == 3) {
                            this.emojiDocumentId = UserObject.getEmojiId(user);
                        }
                    } else if (!messageObject.isFromChannel() || chat == null) {
                        i2 = 0;
                    } else {
                        if (!messageObject.isOutOwner() && i != 2) {
                            TLRPC.PeerColor peerColor8 = chat.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, resourcesProvider);
                            }
                        }
                        if (chat.signature_profiles) {
                            long fromChatId = messageObject.getFromChatId();
                            if (fromChatId >= 0) {
                                TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                i2 = UserObject.getColorId(user5);
                                if (i == 3) {
                                    this.emojiDocumentId = UserObject.getEmojiId(user5);
                                }
                            } else {
                                TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                i2 = ChatObject.getColorId(chat3);
                                if (i == 3) {
                                    this.emojiDocumentId = ChatObject.getEmojiId(chat3);
                                }
                            }
                        } else {
                            int colorId = ChatObject.getColorId(chat);
                            if (i == 3) {
                                this.emojiDocumentId = ChatObject.getEmojiId(chat);
                            }
                            i2 = colorId;
                        }
                    }
                } else {
                    if (i == 3) {
                        this.emojiDocumentId = peerColor.background_emoji_id;
                    }
                    i2 = i3;
                }
                resolveColor(messageObject, i2, resourcesProvider);
                this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
                this.nameColor = this.color1;
            }
            i2 = i5;
            resolveColor(messageObject, i2, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else if (i == 0 && (messageObject.overrideLinkColor >= 0 || ((message = messageObject.messageOwner) != null && messageObject.replyMessageObject != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) != null && message2.from_id != null && (messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
            int i6 = messageObject.overrideLinkColor;
            if (i6 < 0) {
                if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                    if (messageObject.replyMessageObject.isOutOwner()) {
                        user2 = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                    }
                    if (user2 != null) {
                        i6 = UserObject.getColorId(user2);
                        this.emojiDocumentId = UserObject.getEmojiId(user2);
                    }
                    i6 = 0;
                } else if (messageObject.replyMessageObject.isFromUser()) {
                    TLRPC.User user6 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                    if (!messageObject.isOutOwner() && i != 2 && user6 != null) {
                        TLRPC.PeerColor peerColor9 = user6.color;
                        if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                            return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, resourcesProvider);
                        }
                    }
                    if (user6 != null) {
                        i6 = UserObject.getColorId(user6);
                        this.emojiDocumentId = UserObject.getEmojiId(user6);
                    }
                    i6 = 0;
                } else {
                    if (messageObject.replyMessageObject.isFromChannel()) {
                        TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                        if (!messageObject.isOutOwner() && i != 2 && chat4 != null) {
                            TLRPC.PeerColor peerColor10 = chat4.color;
                            if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                return resolveCollectionColor(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, resourcesProvider);
                            }
                        }
                        if (chat4 != null) {
                            i6 = ChatObject.getColorId(chat4);
                            this.emojiDocumentId = ChatObject.getEmojiId(chat4);
                        }
                    }
                    i6 = 0;
                }
            }
            resolveColor(messageObject.replyMessageObject, i6, resourcesProvider);
            this.backgroundColor = Theme.multAlpha(this.color1, 0.1f);
            this.nameColor = this.color1;
        } else {
            this.hasColor2 = false;
            this.hasColor3 = false;
            int color = Theme.getColor(Theme.key_chat_inReplyLine, resourcesProvider);
            this.color3 = color;
            this.color2 = color;
            this.color1 = color;
            this.backgroundColor = Theme.multAlpha(color, 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_inReplyNameText, resourcesProvider);
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.hasColor2 = false;
            this.hasColor3 = false;
            this.color3 = -1;
            this.color2 = -1;
            this.color1 = -1;
            this.backgroundColor = 0;
            this.nameColor = Theme.getColor(Theme.key_chat_stickerReplyNameText, resourcesProvider);
        } else {
            int i7 = !messageObject.isOutOwner() ? 2 : 2;
            if (i == i7 && !messageObject.isOutOwner()) {
                int color2 = Theme.getColor(Theme.key_chat_inCodeBackground, resourcesProvider);
                this.color3 = color2;
                this.color2 = color2;
                this.color1 = color2;
            } else {
                int color3 = Theme.getColor((this.hasColor2 || this.hasColor3) ? Theme.key_chat_outReplyLine2 : Theme.key_chat_outReplyLine, resourcesProvider);
                this.color3 = color3;
                this.color2 = color3;
                this.color1 = color3;
            }
            if (this.hasColor3) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(this.color1, 0.2f);
                this.color2 = Theme.multAlpha(this.color2, 0.5f);
            } else if (this.hasColor2) {
                this.reversedOut = true;
                this.color1 = Theme.multAlpha(this.color1, 0.35f);
            }
            this.backgroundColor = Theme.multAlpha(this.color3, isDark ? 0.12f : 0.1f);
            this.nameColor = Theme.getColor(Theme.key_chat_outReplyNameText, resourcesProvider);
        }
        if (i == 0 || i == 3 || i == 4) {
            long j2 = messageObject.overrideLinkEmoji;
            if (j2 != -1) {
                this.emojiDocumentId = j2;
            }
        }
        if (this.emojiDocumentId != 0 && this.emoji == null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view = this.parentView;
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).isCellAttachedToWindow()) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.set(this.stickerDocumentId, true);
        }
        this.emojiColor = getColor();
        return this.nameColorAnimated.set(this.nameColor);
    }

    public boolean hasSticker() {
        return this.stickerDocumentId != 0;
    }

    public int setFactCheck(Theme.ResourcesProvider resourcesProvider) {
        int i = Theme.key_text_RedBold;
        this.nameColor = Theme.getColor(i, resourcesProvider);
        this.color1 = Theme.getColor(i, resourcesProvider);
        this.hasColor2 = false;
        this.hasColor3 = false;
        this.backgroundColor = Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.1f);
        if (this.emojiDocumentId != 0 && this.emoji == null) {
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.parentView, false, AndroidUtilities.dp(20.0f), 13);
            View view = this.parentView;
            if (!(view instanceof ChatMessageCell) ? view.isAttachedToWindow() : ((ChatMessageCell) view).isCellAttachedToWindow()) {
                this.emoji.attach();
            }
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null && swapAnimatedEmojiDrawable.set(this.emojiDocumentId, true)) {
            this.emojiLoaded = false;
        }
        this.emojiColor = getColor();
        return this.nameColorAnimated.set(this.nameColor);
    }

    public void setEmojiAlpha(float f) {
        this.emojiAlpha = f;
    }

    public void resetAnimation() {
        this.color1Animated.set(this.color1, true);
        this.color2Animated.set(this.color2, true);
        this.color2Alpha.set(this.hasColor2, true);
        this.nameColorAnimated.set(this.nameColor, true);
        this.backgroundColorAnimated.set(this.backgroundColor, true);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.resetAnimation();
        }
    }

    public void setLoading(boolean z) {
        LoadingDrawable loadingDrawable;
        if (!z && this.loading) {
            this.loadingT = 0.0f;
            LoadingDrawable loadingDrawable2 = this.backgroundLoadingDrawable;
            if (loadingDrawable2 != null) {
                loadingDrawable2.disappear();
            }
        } else if (z && !this.loading && (loadingDrawable = this.backgroundLoadingDrawable) != null) {
            loadingDrawable.resetDisappear();
            this.backgroundLoadingDrawable.reset();
        }
        this.loading = z;
    }

    private void incrementLoadingT() {
        long currentTimeMillis = System.currentTimeMillis();
        float f = this.loadingStateT.set(this.loading);
        this.loadingT += Math.min(30L, currentTimeMillis - this.lastLoadingTTime) * f;
        this.loadingTranslationT += Math.min(30L, currentTimeMillis - this.lastLoadingTTime) * f;
        this.lastLoadingTTime = currentTimeMillis;
    }

    public void drawLine(Canvas canvas, RectF rectF) {
        drawLine(canvas, rectF, 1.0f);
    }

    public void drawLine(Canvas canvas, RectF rectF, float f) {
        boolean z;
        float height;
        int m;
        canvas.save();
        this.clipPath.rewind();
        int floor = (int) Math.floor(SharedConfig.bubbleRadius / (this.sponsored ? 2.0f : 3.0f));
        RectF rectF2 = this.rectF;
        float f2 = rectF.left;
        rectF2.set(f2, rectF.top, Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(floor * 2)) + f2, rectF.bottom);
        Path path = this.clipPath;
        RectF rectF3 = this.rectF;
        float f3 = floor;
        float dp = AndroidUtilities.dp(f3);
        float dp2 = AndroidUtilities.dp(f3);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, dp, dp2, direction);
        canvas.clipPath(this.clipPath);
        float f4 = rectF.left;
        canvas.clipRect(f4, rectF.top, AndroidUtilities.dp(3.0f) + f4, rectF.bottom);
        this.color1Paint.setColor(Theme.multAlpha(this.color1Animated.set(this.color1), f));
        this.color2Paint.setColor(Theme.multAlpha(this.color2Animated.set(this.color2), f));
        this.color3Paint.setColor(Theme.multAlpha(this.color3Animated.set(this.color3), f));
        float f5 = this.loadingStateT.set(this.loading);
        if (f5 <= 0.0f || this.hasColor2) {
            z = false;
        } else {
            canvas.save();
            int alpha = this.color1Paint.getAlpha();
            this.color1Paint.setAlpha((int) (alpha * 0.3f));
            canvas.drawPaint(this.color1Paint);
            this.color1Paint.setAlpha(alpha);
            incrementLoadingT();
            float pow = ((float) Math.pow((this.loadingT / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            this.rectF.set(rectF.left, rectF.top + (rectF.height() * AndroidUtilities.lerp(0.0f, 1.0f - CubicBezierInterpolator.EASE_IN.getInterpolation(MathUtils.clamp(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), f5)), rectF.left + AndroidUtilities.dp(6.0f), rectF.top + (rectF.height() * AndroidUtilities.lerp(1.0f, 1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), f5)));
            this.lineClipPath.rewind();
            this.lineClipPath.addRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), direction);
            canvas.clipPath(this.lineClipPath);
            this.parentView.invalidate();
            z = true;
        }
        canvas.drawPaint(this.color1Paint);
        float f6 = this.color2Alpha.set(this.hasColor2);
        if (f6 > 0.0f) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            incrementLoadingT();
            float f7 = this.color3Alpha.set(this.hasColor3);
            if (this.hasColor3) {
                height = rectF.height();
                m = ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(18.99f));
            } else {
                height = rectF.height();
                m = ReplyMessageLine$$ExternalSyntheticBackport0.m((int) rectF.height(), AndroidUtilities.dp(12.66f));
            }
            canvas.translate(0.0f, -(((((this.loadingTranslationT + this.switchStateT.set(this.switchedCount * 425)) + (this.reversedOut ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (height - m)));
            checkColorPathes(rectF.height() * 2.0f);
            int alpha2 = this.color2Paint.getAlpha();
            this.color2Paint.setAlpha((int) (alpha2 * f6));
            canvas.drawPath(this.color2Path, this.color2Paint);
            this.color2Paint.setAlpha(alpha2);
            int alpha3 = this.color3Paint.getAlpha();
            this.color3Paint.setAlpha((int) (alpha3 * f7));
            canvas.drawPath(this.color3Path, this.color3Paint);
            this.color3Paint.setAlpha(alpha3);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
        canvas.restore();
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        drawBackground(canvas, rectF, f, f2, f3, f4, false, false);
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        float[] fArr = this.radii;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        fArr[1] = max;
        fArr[0] = max;
        float[] fArr2 = this.radii;
        float dp = AndroidUtilities.dp(f2);
        fArr2[3] = dp;
        fArr2[2] = dp;
        float[] fArr3 = this.radii;
        float dp2 = AndroidUtilities.dp(f3);
        fArr3[5] = dp2;
        fArr3[4] = dp2;
        float[] fArr4 = this.radii;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr4[7] = max2;
        fArr4[6] = max2;
        drawBackground(canvas, rectF, f4, z, z2);
    }

    private static class IconCoords {
        public float a;
        public boolean q;
        public float s;
        public float x;
        public float y;

        public IconCoords(float f, float f2, float f3, float f4, boolean z) {
            this(f, f2, f3, f4);
            this.q = z;
        }

        public IconCoords(float f, float f2, float f3, float f4) {
            this.x = f;
            this.y = f2;
            this.s = f3;
            this.a = f4;
        }
    }

    public ReplyMessageLine offsetEmoji(float f, float f2) {
        this.emojiOffsetX = f;
        this.emojiOffsetY = f2;
        return this;
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, boolean z, boolean z2) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        int i = 0;
        if (!z2) {
            this.backgroundPath.rewind();
            this.backgroundPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
            this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
            this.backgroundPaint.setAlpha((int) (r5.getAlpha() * f));
            canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        }
        if (this.emoji == null) {
            return;
        }
        float f2 = this.emojiLoadedT.set(isEmojiLoaded());
        if (f2 <= 0.0f || this.emojiAlpha <= 0.0f) {
            return;
        }
        if (this.iconCoords == null) {
            this.iconCoords = new IconCoords[]{new IconCoords(4.0f, -6.33f, 1.0f, 1.0f), new IconCoords(30.0f, 3.0f, 0.78f, 0.9f), new IconCoords(46.0f, -17.0f, 0.6f, 0.6f), new IconCoords(69.66f, -0.666f, 0.87f, 0.7f), new IconCoords(98.0f, -12.6f, 1.03f, 0.3f), new IconCoords(51.0f, 24.0f, 1.0f, 0.5f), new IconCoords(6.33f, 20.0f, 0.77f, 0.7f), new IconCoords(-19.0f, 12.0f, 0.8f, 0.6f, true), new IconCoords(-22.0f, 36.0f, 0.7f, 0.5f, true)};
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(this.emojiOffsetX, this.emojiOffsetY);
        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
        if (z) {
            max -= AndroidUtilities.dp(12.0f);
        }
        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.sticker;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.setAlpha((int) (f * 255.0f));
        }
        this.emoji.setColor(Integer.valueOf(this.emojiColor));
        while (true) {
            IconCoords[] iconCoordsArr = this.iconCoords;
            if (i < iconCoordsArr.length) {
                if (i != 0 || (swapAnimatedEmojiDrawable = this.sticker) == null || this.stickerDocumentId == 0) {
                    swapAnimatedEmojiDrawable = this.emoji;
                }
                IconCoords iconCoords = iconCoordsArr[i];
                if (!iconCoords.q || z) {
                    swapAnimatedEmojiDrawable.setAlpha((int) ((swapAnimatedEmojiDrawable == this.sticker ? 1.0f : 0.3f) * 255.0f * iconCoords.a * this.emojiAlpha));
                    float dp = max - AndroidUtilities.dp(iconCoords.x);
                    float dp2 = AndroidUtilities.dp(iconCoords.y) + min;
                    float dp3 = AndroidUtilities.dp(10.0f) * iconCoords.s * f2;
                    swapAnimatedEmojiDrawable.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                    swapAnimatedEmojiDrawable.draw(canvas);
                }
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    private boolean isEmojiLoaded() {
        if (this.emojiLoaded) {
            return true;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable == null || !(swapAnimatedEmojiDrawable.getDrawable() instanceof AnimatedEmojiDrawable)) {
            return false;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) this.emoji.getDrawable();
        if (animatedEmojiDrawable.getImageReceiver() == null || !animatedEmojiDrawable.getImageReceiver().hasImageLoaded()) {
            return false;
        }
        this.emojiLoaded = true;
        return true;
    }

    public void drawLoadingBackground(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4) {
        LoadingDrawable loadingDrawable;
        float[] fArr = this.radii;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f));
        fArr[1] = max;
        fArr[0] = max;
        float[] fArr2 = this.radii;
        float dp = AndroidUtilities.dp(f2);
        fArr2[3] = dp;
        fArr2[2] = dp;
        float[] fArr3 = this.radii;
        float dp2 = AndroidUtilities.dp(f3);
        fArr3[5] = dp2;
        fArr3[4] = dp2;
        float[] fArr4 = this.radii;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f3));
        fArr4[7] = max2;
        fArr4[6] = max2;
        if (this.loading || ((loadingDrawable = this.backgroundLoadingDrawable) != null && loadingDrawable.isDisappearing())) {
            if (this.backgroundLoadingDrawable == null) {
                LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                this.backgroundLoadingDrawable = loadingDrawable2;
                loadingDrawable2.setAppearByGradient(true);
                this.backgroundLoadingDrawable.setGradientScale(3.5f);
                this.backgroundLoadingDrawable.setSpeed(0.5f);
            }
            this.backgroundLoadingDrawable.setColors(Theme.multAlpha(this.color1, 0.1f), Theme.multAlpha(this.color1, 0.3f), Theme.multAlpha(this.color1, 0.3f), Theme.multAlpha(this.color1, 1.25f));
            this.backgroundLoadingDrawable.setBounds(rectF);
            this.backgroundLoadingDrawable.setRadii(this.radii);
            this.backgroundLoadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            this.backgroundLoadingDrawable.setAlpha((int) (f4 * 255.0f));
            this.backgroundLoadingDrawable.draw(canvas);
            this.parentView.invalidate();
            return;
        }
        LoadingDrawable loadingDrawable3 = this.backgroundLoadingDrawable;
        if (loadingDrawable3 != null) {
            loadingDrawable3.reset();
        }
    }

    private void checkColorPathes(float f) {
        if (Math.abs(this.lastHeight - f) > 3.0f || this.lastHasColor3 != this.hasColor3) {
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            float dpf22 = AndroidUtilities.dpf2(6.33f);
            float dpf23 = AndroidUtilities.dpf2(3.0f);
            float dpf24 = AndroidUtilities.dpf2(3.33f);
            float f2 = dpf24 + dpf23;
            this.color2Path.rewind();
            float f3 = f2;
            while (f3 < f) {
                float f4 = dpf2 + 1.0f;
                this.color2Path.moveTo(f4, f3 - 1.0f);
                float f5 = f3 + dpf22;
                this.color2Path.lineTo(f4, f5);
                this.color2Path.lineTo(0.0f, f5 + dpf23);
                this.color2Path.lineTo(0.0f, f3 + dpf23);
                this.color2Path.close();
                f3 += dpf22 + dpf23 + dpf24;
                if (this.hasColor3) {
                    f3 += dpf22;
                }
            }
            if (this.hasColor3) {
                this.color3Path.rewind();
                for (float f6 = f2 + dpf22; f6 < f; f6 += dpf22 + dpf23 + dpf24 + dpf22) {
                    float f7 = dpf2 + 1.0f;
                    this.color3Path.moveTo(f7, f6 - 1.0f);
                    float f8 = f6 + dpf22;
                    this.color3Path.lineTo(f7, f8);
                    this.color3Path.lineTo(0.0f, f8 + dpf23);
                    this.color3Path.lineTo(0.0f, f6 + dpf23);
                    this.color3Path.close();
                }
            }
            this.lastHeight = f;
            this.lastHasColor3 = this.hasColor3;
        }
    }
}
