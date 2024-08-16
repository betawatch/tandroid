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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_messageActionHistoryClear;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaGame;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
/* compiled from: ChatsWidgetService.java */
/* loaded from: classes3.dex */
class ChatsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private LongSparseArray<TLRPC$Dialog> dialogs = new LongSparseArray<>();
    private LongSparseArray<MessageObject> messageObjects = new LongSparseArray<>();

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
        boolean z = false;
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i >= 0) {
            this.accountInstance = AccountInstance.getInstance(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("deleted");
        sb.append(this.appWidgetId);
        this.deleted = (sharedPreferences.getBoolean(sb.toString(), false) || this.accountInstance == null) ? true : true;
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
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03b7, code lost:
        org.telegram.messenger.FileLog.e(r0);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0262, code lost:
        if ((r0 instanceof org.telegram.tgnet.TLRPC$TL_messageActionChannelMigrateFrom) != false) goto L54;
     */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteViews getViewAt(int i) {
        TLRPC$Chat tLRPC$Chat;
        String str;
        TLRPC$User tLRPC$User;
        TLRPC$FileLocation tLRPC$FileLocation;
        TLRPC$FileLocation tLRPC$FileLocation2;
        Bitmap decodeFile;
        int i2;
        int i3;
        TLRPC$Chat chat;
        TLRPC$User tLRPC$User2;
        CharSequence charSequence;
        String str2;
        SpannableStringBuilder valueOf;
        char c;
        int i4;
        String charSequence2;
        char c2;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        AvatarDrawable avatarDrawable;
        String formatName;
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        TLRPC$FileLocation tLRPC$FileLocation3;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString("WidgetLoggedOff", R.string.WidgetLoggedOff));
            return remoteViews;
        } else if (i >= this.dids.size()) {
            RemoteViews remoteViews2 = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, LocaleController.getString("TapToEditWidget", R.string.TapToEditWidget));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.appWidgetId);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        } else {
            Long l = this.dids.get(i);
            CharSequence charSequence5 = "";
            if (DialogObject.isUserDialog(l.longValue())) {
                tLRPC$User = this.accountInstance.getMessagesController().getUser(l);
                if (tLRPC$User != null) {
                    if (UserObject.isUserSelf(tLRPC$User)) {
                        formatName = LocaleController.getString("SavedMessages", R.string.SavedMessages);
                    } else if (UserObject.isReplyUser(tLRPC$User)) {
                        formatName = LocaleController.getString("RepliesTitle", R.string.RepliesTitle);
                    } else if (UserObject.isDeleted(tLRPC$User)) {
                        formatName = LocaleController.getString("HiddenName", R.string.HiddenName);
                    } else {
                        formatName = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
                    }
                    if (UserObject.isReplyUser(tLRPC$User) || UserObject.isUserSelf(tLRPC$User) || (tLRPC$UserProfilePhoto = tLRPC$User.photo) == null || (tLRPC$FileLocation3 = tLRPC$UserProfilePhoto.photo_small) == null || tLRPC$FileLocation3.volume_id == 0 || tLRPC$FileLocation3.local_id == 0) {
                        tLRPC$FileLocation = null;
                        str = formatName;
                        tLRPC$Chat = null;
                    } else {
                        tLRPC$FileLocation = tLRPC$FileLocation3;
                        str = formatName;
                        tLRPC$Chat = null;
                    }
                } else {
                    str = "";
                    tLRPC$Chat = null;
                    tLRPC$FileLocation = null;
                }
            } else {
                TLRPC$Chat chat2 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l.longValue()));
                if (chat2 != null) {
                    String str3 = chat2.title;
                    TLRPC$ChatPhoto tLRPC$ChatPhoto = chat2.photo;
                    if (tLRPC$ChatPhoto == null || (tLRPC$FileLocation2 = tLRPC$ChatPhoto.photo_small) == null || tLRPC$FileLocation2.volume_id == 0 || tLRPC$FileLocation2.local_id == 0) {
                        tLRPC$FileLocation = null;
                        str = str3;
                        tLRPC$Chat = chat2;
                        tLRPC$User = null;
                    } else {
                        tLRPC$FileLocation = tLRPC$FileLocation2;
                        str = str3;
                        tLRPC$Chat = chat2;
                        tLRPC$User = null;
                    }
                } else {
                    tLRPC$Chat = chat2;
                    str = "";
                    tLRPC$User = null;
                    tLRPC$FileLocation = null;
                }
            }
            RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.shortcut_widget_item);
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
            if (tLRPC$FileLocation != null) {
                try {
                    decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$FileLocation, true).toString());
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            } else {
                decodeFile = null;
            }
            int dp = AndroidUtilities.dp(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            if (decodeFile == null) {
                if (tLRPC$User != null) {
                    avatarDrawable = new AvatarDrawable(tLRPC$User);
                    if (UserObject.isReplyUser(tLRPC$User)) {
                        avatarDrawable.setAvatarType(12);
                    } else if (UserObject.isUserSelf(tLRPC$User)) {
                        avatarDrawable.setAvatarType(1);
                    }
                } else {
                    avatarDrawable = new AvatarDrawable();
                    avatarDrawable.setInfo(this.accountInstance.getCurrentAccount(), tLRPC$Chat);
                }
                avatarDrawable.setBounds(0, 0, dp, dp);
                avatarDrawable.draw(canvas);
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
                this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
                canvas.restore();
            }
            canvas.setBitmap(null);
            remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, createBitmap);
            MessageObject messageObject = this.messageObjects.get(l.longValue());
            TLRPC$Dialog tLRPC$Dialog = this.dialogs.get(l.longValue());
            if (messageObject != null) {
                long fromChatId = messageObject.getFromChatId();
                if (DialogObject.isUserDialog(fromChatId)) {
                    tLRPC$User2 = this.accountInstance.getMessagesController().getUser(Long.valueOf(fromChatId));
                    chat = null;
                } else {
                    chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-fromChatId));
                    tLRPC$User2 = null;
                }
                int color = this.mContext.getResources().getColor(R.color.widget_text);
                if (messageObject.messageOwner instanceof TLRPC$TL_messageService) {
                    if (ChatObject.isChannel(tLRPC$Chat)) {
                        TLRPC$MessageAction tLRPC$MessageAction = messageObject.messageOwner.action;
                        charSequence4 = charSequence5;
                        if (!(tLRPC$MessageAction instanceof TLRPC$TL_messageActionHistoryClear)) {
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
                    if (tLRPC$Chat != null && chat == null && (!ChatObject.isChannel(tLRPC$Chat) || ChatObject.isMegagroup(tLRPC$Chat))) {
                        if (messageObject.isOutOwner()) {
                            str2 = LocaleController.getString("FromYou", R.string.FromYou);
                        } else if (tLRPC$User2 != null) {
                            str2 = UserObject.getFirstName(tLRPC$User2).replace("\n", "");
                        } else {
                            str2 = "DELETED";
                        }
                        String str5 = str2;
                        CharSequence charSequence6 = messageObject.caption;
                        char c3 = ' ';
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
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str4 + charSequence7.replace('\n', ' '), str5));
                            } else if (messageObject.messageOwner.media != null && !messageObject.isMediaEmpty()) {
                                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                                if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPoll) {
                                    c = 1;
                                    charSequence2 = String.format("📊 \u2068%s\u2069", ((TLRPC$TL_messageMediaPoll) tLRPC$MessageMedia).poll.question.text);
                                } else {
                                    c = 1;
                                    if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGame) {
                                        charSequence2 = String.format("🎮 \u2068%s\u2069", tLRPC$MessageMedia.game.title);
                                    } else {
                                        if (messageObject.type == 14) {
                                            i4 = 2;
                                            charSequence2 = String.format("🎧 \u2068%s - %s\u2069", messageObject.getMusicAuthor(), messageObject.getMusicTitle());
                                        } else {
                                            i4 = 2;
                                            charSequence2 = messageObject.messageText.toString();
                                        }
                                        c3 = ' ';
                                        c2 = '\n';
                                        String replace = charSequence2.replace(c2, c3);
                                        Object[] objArr = new Object[i4];
                                        objArr[0] = replace;
                                        objArr[c] = str5;
                                        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                        valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str5.length() + 2, valueOf2.length(), 33);
                                        spannableStringBuilder = valueOf2;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str5.length() + 1, 33);
                                        charSequence3 = spannableStringBuilder;
                                    }
                                }
                                c2 = '\n';
                                i4 = 2;
                                String replace2 = charSequence2.replace(c2, c3);
                                Object[] objArr2 = new Object[i4];
                                objArr2[0] = replace2;
                                objArr2[c] = str5;
                                SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
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
                        TLRPC$MessageMedia tLRPC$MessageMedia2 = messageObject.messageOwner.media;
                        if ((tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaPhoto) && (tLRPC$MessageMedia2.photo instanceof TLRPC$TL_photoEmpty) && tLRPC$MessageMedia2.ttl_seconds != 0) {
                            charSequence3 = LocaleController.getString("AttachPhotoExpired", R.string.AttachPhotoExpired);
                        } else if ((tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaDocument) && (tLRPC$MessageMedia2.document instanceof TLRPC$TL_documentEmpty) && tLRPC$MessageMedia2.ttl_seconds != 0) {
                            charSequence3 = LocaleController.getString("AttachVideoExpired", R.string.AttachVideoExpired);
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
                            if (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaPoll) {
                                charSequence = "📊 " + ((TLRPC$TL_messageMediaPoll) tLRPC$MessageMedia2).poll.question.text;
                            } else if (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaGame) {
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
                if (tLRPC$Dialog != null && (i2 = tLRPC$Dialog.last_message_date) != 0) {
                    remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(i2));
                } else {
                    remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
                }
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
            }
            if (tLRPC$Dialog != null && (i3 = tLRPC$Dialog.unread_count) > 0) {
                int i6 = R.id.shortcut_widget_item_badge;
                remoteViews3.setTextViewText(i6, String.format("%d", Integer.valueOf(i3)));
                remoteViews3.setViewVisibility(i6, 0);
                if (this.accountInstance.getMessagesController().isDialogMuted(tLRPC$Dialog.id, 0L)) {
                    remoteViews3.setBoolean(i6, "setEnabled", false);
                    remoteViews3.setInt(i6, "setBackgroundResource", R.drawable.widget_badge_muted_background);
                } else {
                    remoteViews3.setBoolean(i6, "setEnabled", true);
                    remoteViews3.setInt(i6, "setBackgroundResource", R.drawable.widget_badge_background);
                }
            } else {
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
            }
            Bundle bundle2 = new Bundle();
            if (DialogObject.isUserDialog(l.longValue())) {
                bundle2.putLong("userId", l.longValue());
            } else {
                bundle2.putLong("chatId", -l.longValue());
            }
            bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
            Intent intent2 = new Intent();
            intent2.putExtras(bundle2);
            remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : 0);
            return remoteViews3;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        this.dids.clear();
        this.messageObjects.clear();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        ArrayList<TLRPC$Chat> arrayList2 = new ArrayList<>();
        LongSparseArray<TLRPC$Message> longSparseArray = new LongSparseArray<>();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, longSparseArray, arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
        this.messageObjects.clear();
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            this.messageObjects.put(longSparseArray.keyAt(i), new MessageObject(this.accountInstance.getCurrentAccount(), longSparseArray.valueAt(i), (LongSparseArray<TLRPC$User>) null, (LongSparseArray<TLRPC$Chat>) null, false, true));
        }
    }
}
