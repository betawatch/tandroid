package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumUtilities;

/* loaded from: classes3.dex */
class ChatsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private LongSparseArray dialogs = new LongSparseArray();
    private LongSparseArray messageObjects = new LongSparseArray();

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }

    public ChatsRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        Theme.createDialogsResources(context);
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i >= 0) {
            this.accountInstance = AccountInstance.getInstance(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("deleted");
        sb.append(this.appWidgetId);
        this.deleted = sharedPreferences.getBoolean(sb.toString(), false) || this.accountInstance == null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        ApplicationLoader.postInitApplication();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return this.dids.size() + 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:114|(1:116)(2:124|(1:126)(8:127|(1:129)(1:131)|130|118|119|120|96|97))|117|118|119|120|96|97) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03ef, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0134, code lost:
    
        if (r13.local_id != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0136, code lost:
    
        r14 = r13;
        r13 = r12;
        r12 = r0;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0152, code lost:
    
        if (r13.local_id != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0297, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05c7  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteViews getViewAt(int i) {
        TLRPC.Chat chat;
        String str;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.FileLocation fileLocation2;
        char c;
        Bitmap decodeFile;
        MessageObject messageObject;
        TLRPC.Dialog dialog;
        int i2;
        int i3;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        CharSequence charSequence;
        String str3;
        SpannableStringBuilder valueOf;
        int i4;
        char c2;
        String charSequence2;
        char c3;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        AvatarDrawable avatarDrawable;
        String formatName;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation3;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        }
        if (i >= this.dids.size()) {
            RemoteViews remoteViews2 = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, LocaleController.getString(R.string.TapToEditWidget));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.appWidgetId);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l = this.dids.get(i);
        CharSequence charSequence5 = "";
        if (DialogObject.isUserDialog(l.longValue())) {
            user = this.accountInstance.getMessagesController().getUser(l);
            if (user != null) {
                if (UserObject.isUserSelf(user)) {
                    formatName = LocaleController.getString(R.string.SavedMessages);
                } else if (UserObject.isReplyUser(user)) {
                    formatName = LocaleController.getString(R.string.RepliesTitle);
                } else if (UserObject.isDeleted(user)) {
                    formatName = LocaleController.getString(R.string.HiddenName);
                } else {
                    formatName = ContactsController.formatName(user.first_name, user.last_name);
                }
                if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || (userProfilePhoto = user.photo) == null || (fileLocation3 = userProfilePhoto.photo_small) == null || fileLocation3.volume_id == 0 || fileLocation3.local_id == 0) {
                    fileLocation = null;
                    str = formatName;
                    chat = null;
                } else {
                    fileLocation = fileLocation3;
                    str = formatName;
                    chat = null;
                }
            } else {
                str = "";
                chat = null;
                fileLocation = null;
            }
        } else {
            TLRPC.Chat chat3 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l.longValue()));
            if (chat3 == null) {
                chat = chat3;
                str = "";
                user = null;
                fileLocation = null;
            } else if (ChatObject.isMonoForum(chat3)) {
                str2 = ForumUtilities.getMonoForumTitle(this.accountInstance.getCurrentAccount(), chat3);
                TLRPC.Chat chat4 = this.accountInstance.getMessagesController().getChat(Long.valueOf(chat3.linked_monoforum_id));
                if (chat4 != null) {
                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_small;
                        if (fileLocation2 != null) {
                            if (fileLocation2.volume_id != 0) {
                            }
                        }
                    }
                }
                fileLocation = null;
                str = str2;
                chat = chat3;
                user = null;
            } else {
                str2 = chat3.title;
                TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                if (chatPhoto2 != null) {
                    fileLocation2 = chatPhoto2.photo_small;
                    if (fileLocation2 != null) {
                        if (fileLocation2.volume_id != 0) {
                        }
                    }
                }
                fileLocation = null;
                str = str2;
                chat = chat3;
                user = null;
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true).toString());
            } catch (Throwable th) {
                th = th;
                c = 1;
                FileLog.e(th);
                messageObject = (MessageObject) this.messageObjects.get(l.longValue());
                dialog = (TLRPC.Dialog) this.dialogs.get(l.longValue());
                if (messageObject != null) {
                }
                if (dialog == null) {
                }
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (DialogObject.isUserDialog(l.longValue())) {
                }
                bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : 0);
                return remoteViews3;
            }
        } else {
            decodeFile = null;
        }
        int dp = AndroidUtilities.dp(48.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        if (decodeFile == null) {
            if (user != null) {
                avatarDrawable = new AvatarDrawable(user);
                if (UserObject.isReplyUser(user)) {
                    avatarDrawable.setAvatarType(12);
                } else if (UserObject.isUserSelf(user)) {
                    avatarDrawable.setAvatarType(1);
                }
            } else {
                avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), chat);
            }
            avatarDrawable.setBounds(0, 0, dp, dp);
            avatarDrawable.draw(canvas);
            c = 1;
        } else {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
            if (this.roundPaint == null) {
                this.roundPaint = new Paint(1);
                this.bitmapRect = new RectF();
            }
            float width = dp / decodeFile.getWidth();
            canvas.save();
            canvas.scale(width, width);
            this.roundPaint.setShader(bitmapShader);
            c = 1;
            try {
                this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
                canvas.restore();
            } catch (Throwable th2) {
                th = th2;
                FileLog.e(th);
                messageObject = (MessageObject) this.messageObjects.get(l.longValue());
                dialog = (TLRPC.Dialog) this.dialogs.get(l.longValue());
                if (messageObject != null) {
                }
                if (dialog == null) {
                }
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle22 = new Bundle();
                if (DialogObject.isUserDialog(l.longValue())) {
                }
                bundle22.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent22 = new Intent();
                intent22.putExtras(bundle22);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : 0);
                return remoteViews3;
            }
        }
        canvas.setBitmap(null);
        remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, createBitmap);
        messageObject = (MessageObject) this.messageObjects.get(l.longValue());
        dialog = (TLRPC.Dialog) this.dialogs.get(l.longValue());
        if (messageObject != null) {
            long fromChatId = messageObject.getFromChatId();
            if (DialogObject.isUserDialog(fromChatId)) {
                user2 = this.accountInstance.getMessagesController().getUser(Long.valueOf(fromChatId));
                chat2 = null;
            } else {
                chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-fromChatId));
                user2 = null;
            }
            int color = this.mContext.getResources().getColor(R.color.widget_text);
            if (messageObject.messageOwner instanceof TLRPC.TL_messageService) {
                if (ChatObject.isChannel(chat)) {
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    charSequence4 = charSequence5;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence4 = charSequence5;
                    }
                    color = this.mContext.getResources().getColor(R.color.widget_action_text);
                    charSequence3 = charSequence4;
                }
                charSequence4 = messageObject.messageText;
                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                charSequence3 = charSequence4;
            } else {
                String str4 = "📎 ";
                if (chat != null && chat2 == null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                    if (messageObject.isOutOwner()) {
                        str3 = LocaleController.getString(R.string.FromYou);
                    } else if (user2 != null) {
                        str3 = UserObject.getFirstName(user2).replace("\n", "");
                    } else {
                        str3 = "DELETED";
                    }
                    String str5 = str3;
                    CharSequence charSequence6 = messageObject.caption;
                    try {
                        if (charSequence6 != null) {
                            String charSequence7 = charSequence6.toString();
                            if (charSequence7.length() > 150) {
                                charSequence7 = charSequence7.substring(0, 150);
                            }
                            if (messageObject.isVideo()) {
                                str4 = "📹 ";
                            } else if (messageObject.isVoice()) {
                                str4 = "🎤 ";
                            } else if (messageObject.isMusic()) {
                                str4 = "🎧 ";
                            } else if (messageObject.isPhoto()) {
                                str4 = "🖼 ";
                            }
                            Object[] objArr = new Object[2];
                            objArr[0] = str4 + charSequence7.replace('\n', ' ');
                            objArr[c] = str5;
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                        } else if (messageObject.messageOwner.media != null && !messageObject.isMediaEmpty()) {
                            color = this.mContext.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                charSequence2 = String.format("📊 \u2068%s\u2069", ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text);
                            } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                charSequence2 = String.format("🎮 \u2068%s\u2069", messageMedia.game.title);
                            } else {
                                if (messageObject.type == 14) {
                                    i4 = 2;
                                    c2 = 1;
                                    charSequence2 = String.format("🎧 \u2068%s - %s\u2069", messageObject.getMusicAuthor(), messageObject.getMusicTitle());
                                } else {
                                    i4 = 2;
                                    c2 = 1;
                                    charSequence2 = messageObject.messageText.toString();
                                }
                                c3 = '\n';
                                Object[] objArr2 = new Object[i4];
                                objArr2[0] = charSequence2.replace(c3, ' ');
                                objArr2[c2] = str5;
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str5.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                                spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str5.length() + 1, 33);
                                charSequence3 = spannableStringBuilder;
                            }
                            c3 = '\n';
                            i4 = 2;
                            c2 = 1;
                            Object[] objArr22 = new Object[i4];
                            objArr22[0] = charSequence2.replace(c3, ' ');
                            objArr22[c2] = str5;
                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                            valueOf22.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str5.length() + 2, valueOf22.length(), 33);
                            spannableStringBuilder = valueOf22;
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str5.length() + 1, 33);
                            charSequence3 = spannableStringBuilder;
                        } else {
                            String str6 = messageObject.messageOwner.message;
                            if (str6 != null) {
                                if (str6.length() > 150) {
                                    str6 = str6.substring(0, 150);
                                }
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str6.replace('\n', ' ').trim(), str5));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str5.length() + 1, 33);
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception e) {
                        FileLog.e(e);
                        charSequence3 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                } else {
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia2.photo instanceof TLRPC.TL_photoEmpty) && messageMedia2.ttl_seconds != 0) {
                        charSequence3 = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (messageMedia2.document instanceof TLRPC.TL_documentEmpty) && messageMedia2.ttl_seconds != 0) {
                        charSequence3 = LocaleController.getString(R.string.AttachVideoExpired);
                    } else if (messageObject.caption != null) {
                        if (messageObject.isVideo()) {
                            str4 = "📹 ";
                        } else if (messageObject.isVoice()) {
                            str4 = "🎤 ";
                        } else if (messageObject.isMusic()) {
                            str4 = "🎧 ";
                        } else if (messageObject.isPhoto()) {
                            str4 = "🖼 ";
                        }
                        charSequence3 = str4 + ((Object) messageObject.caption);
                    } else {
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text;
                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + messageObject.messageOwner.media.game.title;
                        } else if (messageObject.type == 14) {
                            charSequence = String.format("🎧 %s - %s", messageObject.getMusicAuthor(), messageObject.getMusicTitle());
                        } else {
                            charSequence = messageObject.messageText;
                            AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (Theme.ResourcesProvider) null);
                        }
                        CharSequence charSequence8 = charSequence;
                        charSequence3 = charSequence8;
                        if (messageObject.messageOwner.media != null) {
                            charSequence3 = charSequence8;
                            if (!messageObject.isMediaEmpty()) {
                                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence8;
                            }
                        }
                    }
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(messageObject.messageOwner.date));
            int i5 = R.id.shortcut_widget_item_message;
            remoteViews3.setTextViewText(i5, charSequence3.toString());
            remoteViews3.setTextColor(i5, color);
        } else {
            if (dialog != null && (i2 = dialog.last_message_date) != 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(i2));
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog == null && (i3 = dialog.unread_count) > 0) {
            int i6 = R.id.shortcut_widget_item_badge;
            remoteViews3.setTextViewText(i6, String.format("%d", Integer.valueOf(i3)));
            remoteViews3.setViewVisibility(i6, 0);
            if (this.accountInstance.getMessagesController().isDialogMuted(dialog.id, 0L)) {
                remoteViews3.setBoolean(i6, "setEnabled", false);
                remoteViews3.setInt(i6, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setBoolean(i6, "setEnabled", true);
                remoteViews3.setInt(i6, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        } else {
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        }
        Bundle bundle222 = new Bundle();
        if (DialogObject.isUserDialog(l.longValue())) {
            bundle222.putLong("userId", l.longValue());
        } else {
            bundle222.putLong("chatId", -l.longValue());
        }
        bundle222.putInt("currentAccount", this.accountInstance.getCurrentAccount());
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : 0);
        return remoteViews3;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        this.dids.clear();
        this.messageObjects.clear();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        LongSparseArray longSparseArray = new LongSparseArray();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, longSparseArray, arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
        this.messageObjects.clear();
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            this.messageObjects.put(longSparseArray.keyAt(i), new MessageObject(this.accountInstance.getCurrentAccount(), (TLRPC.Message) longSparseArray.valueAt(i), (LongSparseArray) null, (LongSparseArray) null, false, true));
        }
    }
}
