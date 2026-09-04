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
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e10;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
class ChatsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private a0.i dialogs = new a0.i();
    private a0.i messageObjects = new a0.i();

    public ChatsRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        org.telegram.ui.ActionBar.j6.R(context);
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i10 = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i10 >= 0) {
            this.accountInstance = AccountInstance.getInstance(i10);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(this.appWidgetId);
        this.deleted = sharedPreferences.getBoolean(sb2.toString(), false) || this.accountInstance == null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return this.dids.size() + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0299, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05a8  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteViews getViewAt(int i10) {
        TLRPC.Chat chat;
        String str;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str2;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        char c10;
        Bitmap decodeFile;
        MessageObject messageObject;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence2;
        CharSequence charSequence3;
        org.telegram.ui.Components.i9 i9Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation3;
        if (this.deleted) {
            RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, LocaleController.getString(R.string.WidgetLoggedOff));
            return remoteViews;
        }
        if (i10 >= this.dids.size()) {
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
        Long l4 = this.dids.get(i10);
        CharSequence charSequence4 = "";
        if (DialogObject.isUserDialog(l4.longValue())) {
            user = this.accountInstance.getMessagesController().getUser(l4);
            if (user != null) {
                String string = UserObject.isUserSelf(user) ? LocaleController.getString(R.string.SavedMessages) : UserObject.isReplyUser(user) ? LocaleController.getString(R.string.RepliesTitle) : UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : ContactsController.formatName(user.first_name, user.last_name);
                if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || (userProfilePhoto = user.photo) == null || (fileLocation3 = userProfilePhoto.photo_small) == null || fileLocation3.volume_id == 0 || fileLocation3.local_id == 0) {
                    fileLocation = null;
                    str = string;
                    chat = null;
                } else {
                    fileLocation = fileLocation3;
                    str = string;
                    chat = null;
                }
            } else {
                str = "";
                chat = null;
                fileLocation = null;
            }
        } else {
            TLRPC.Chat chat3 = this.accountInstance.getMessagesController().getChat(Long.valueOf(-l4.longValue()));
            if (chat3 != null) {
                if (ChatObject.isMonoForum(chat3)) {
                    str2 = og.d.i(chat3, this.accountInstance.getCurrentAccount(), false);
                    TLRPC.Chat chat4 = this.accountInstance.getMessagesController().getChat(Long.valueOf(chat3.linked_monoforum_id));
                    if (chat4 == null || (chatPhoto = chat4.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                } else {
                    str2 = chat3.title;
                    TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                    if (chatPhoto2 == null || (fileLocation2 = chatPhoto2.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation = null;
                        str = str2;
                        chat = chat3;
                        user = null;
                    }
                }
                fileLocation = fileLocation2;
                str = str2;
                chat = chat3;
                user = null;
            } else {
                chat = chat3;
                str = "";
                user = null;
                fileLocation = null;
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(this.mContext.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(fileLocation, true).toString());
            } catch (Throwable th2) {
                th = th2;
                c10 = 1;
                FileLog.e(th);
                messageObject = (MessageObject) this.messageObjects.f(l4.longValue());
                dialog = (TLRPC.Dialog) this.dialogs.f(l4.longValue());
                if (messageObject != null) {
                }
                if (dialog != null) {
                }
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (DialogObject.isUserDialog(l4.longValue())) {
                }
                bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : 0);
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
                i9Var = new org.telegram.ui.Components.i9(0, user);
                if (UserObject.isReplyUser(user)) {
                    i9Var.g(12);
                } else if (UserObject.isUserSelf(user)) {
                    i9Var.g(1);
                }
            } else {
                i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
                i9Var.k(this.accountInstance.getCurrentAccount(), chat);
            }
            i9Var.setBounds(0, 0, dp, dp);
            i9Var.draw(canvas);
            c10 = 1;
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
            c10 = 1;
            try {
                this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
                canvas.restore();
            } catch (Throwable th3) {
                th = th3;
                FileLog.e(th);
                messageObject = (MessageObject) this.messageObjects.f(l4.longValue());
                dialog = (TLRPC.Dialog) this.dialogs.f(l4.longValue());
                if (messageObject != null) {
                }
                if (dialog != null) {
                }
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle22 = new Bundle();
                if (DialogObject.isUserDialog(l4.longValue())) {
                }
                bundle22.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent22 = new Intent();
                intent22.putExtras(bundle22);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : 0);
                return remoteViews3;
            }
        }
        canvas.setBitmap(null);
        remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, createBitmap);
        messageObject = (MessageObject) this.messageObjects.f(l4.longValue());
        dialog = (TLRPC.Dialog) this.dialogs.f(l4.longValue());
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
                    charSequence3 = charSequence4;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence3 = charSequence4;
                    }
                    color = this.mContext.getResources().getColor(R.color.widget_action_text);
                    charSequence2 = charSequence3;
                }
                charSequence3 = messageObject.messageText;
                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                charSequence2 = charSequence3;
            } else {
                String str3 = "📎 ";
                if (chat == null || chat2 != null || (ChatObject.isChannel(chat) && !ChatObject.isMegagroup(chat))) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence2 = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence2 = LocaleController.getString(R.string.AttachVideoExpired);
                    } else if (messageObject.caption != null) {
                        if (messageObject.isVideo()) {
                            str3 = "📹 ";
                        } else if (messageObject.isVoice()) {
                            str3 = "🎤 ";
                        } else if (messageObject.isMusic()) {
                            str3 = "🎧 ";
                        } else if (messageObject.isPhoto()) {
                            str3 = "🖼 ";
                        }
                        StringBuilder u10 = a4.a.u(str3);
                        u10.append((Object) messageObject.caption);
                        charSequence2 = u10.toString();
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + messageObject.messageOwner.media.game.title;
                        } else if (messageObject.type == 14) {
                            charSequence = com.google.android.gms.internal.vision.e2.j("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                        } else {
                            charSequence = messageObject.messageText;
                            AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                        }
                        CharSequence charSequence5 = charSequence;
                        charSequence2 = charSequence5;
                        if (messageObject.messageOwner.media != null) {
                            charSequence2 = charSequence5;
                            if (!messageObject.isMediaEmpty()) {
                                color = this.mContext.getResources().getColor(R.color.widget_action_text);
                                charSequence2 = charSequence5;
                            }
                        }
                    }
                } else {
                    String string2 = messageObject.isOutOwner() ? LocaleController.getString(R.string.FromYou) : user2 != null ? UserObject.getFirstName(user2).replace("\n", "") : "DELETED";
                    CharSequence charSequence6 = messageObject.caption;
                    try {
                        if (charSequence6 != null) {
                            String charSequence7 = charSequence6.toString();
                            if (charSequence7.length() > 150) {
                                charSequence7 = charSequence7.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                            }
                            if (messageObject.isVideo()) {
                                str3 = "📹 ";
                            } else if (messageObject.isVoice()) {
                                str3 = "🎤 ";
                            } else if (messageObject.isMusic()) {
                                str3 = "🎧 ";
                            } else if (messageObject.isPhoto()) {
                                str3 = "🖼 ";
                            }
                            StringBuilder u11 = a4.a.u(str3);
                            u11.append(charSequence7.replace('\n', ' '));
                            String sb2 = u11.toString();
                            Object[] objArr = new Object[2];
                            objArr[0] = sb2;
                            objArr[c10] = string2;
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                        } else if (messageObject.messageOwner.media == null || messageObject.isMediaEmpty()) {
                            String str4 = messageObject.messageOwner.message;
                            if (str4 != null) {
                                if (str4.length() > 150) {
                                    str4 = str4.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                }
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = str4.replace('\n', ' ').trim();
                                objArr2[c10] = string2;
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        } else {
                            color = this.mContext.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                            Object[] objArr3 = new Object[2];
                            objArr3[0] = (messageMedia2 instanceof TLRPC.TL_messageMediaPoll ? a4.a.p("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069") : messageMedia2 instanceof TLRPC.TL_messageMediaGame ? a4.a.p("🎮 \u2068", messageMedia2.game.title, "\u2069") : messageObject.type == 14 ? org.telegram.ui.Cells.p6.j("🎧 \u2068", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle(), "\u2069") : messageObject.messageText.toString()).replace('\n', ' ');
                            objArr3[c10] = string2;
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr3));
                            try {
                                valueOf2.setSpan(new e10(org.telegram.ui.ActionBar.j6.o9, null), string2.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                spannableStringBuilder = valueOf2;
                            }
                            spannableStringBuilder.setSpan(new e10(org.telegram.ui.ActionBar.j6.k9, null), 0, string2.length() + 1, 33);
                            charSequence2 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new e10(org.telegram.ui.ActionBar.j6.k9, null), 0, string2.length() + 1, 33);
                        charSequence2 = spannableStringBuilder;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        charSequence2 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(messageObject.messageOwner.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, charSequence2.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog == null || (i11 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, LocaleController.stringForMessageListDate(i11));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i12 = dialog.unread_count) <= 0) {
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i12)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (this.accountInstance.getMessagesController().isDialogMuted(dialog.id, 0L)) {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", false);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", true);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        Bundle bundle222 = new Bundle();
        if (DialogObject.isUserDialog(l4.longValue())) {
            bundle222.putLong("userId", l4.longValue());
        } else {
            bundle222.putLong("chatId", -l4.longValue());
        }
        bundle222.putInt("currentAccount", this.accountInstance.getCurrentAccount());
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : 0);
        return remoteViews3;
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
    public void onCreate() {
        ApplicationLoader.postInitApplication();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        this.dids.clear();
        this.messageObjects.b();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            return;
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        a0.i iVar = new a0.i();
        this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, iVar, arrayList, arrayList2);
        this.accountInstance.getMessagesController().putUsers(arrayList, true);
        this.accountInstance.getMessagesController().putChats(arrayList2, true);
        this.messageObjects.b();
        int m10 = iVar.m();
        for (int i10 = 0; i10 < m10; i10++) {
            this.messageObjects.k(new MessageObject(this.accountInstance.getCurrentAccount(), (TLRPC.Message) iVar.n(i10), (a0.i) null, (a0.i) null, false, true), iVar.j(i10));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
