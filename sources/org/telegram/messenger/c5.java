package org.telegram.messenger;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.b = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ImageLoader.CacheImage) this.e).lambda$setImageAndClear$0((Drawable) this.f, (ArrayList) this.c, (ArrayList) this.d, (String) this.b);
                break;
            case 1:
                ((ImageLoader.ThumbGenerateTask) this.e).lambda$run$1((String) this.b, (ArrayList) this.c, (BitmapDrawable) this.f, (ArrayList) this.d);
                break;
            case 2:
                ((TranslateController) this.e).lambda$detectPhotoLanguage$39((MessageObject) this.f, (String) this.b, (TranslateController.MessageKey) this.c, (Utilities.Callback) this.d);
                break;
            case 3:
                ((ChatThemeController) this.e).lambda$requestNextChatThemes$19((TL_account.Tl_chatThemes) this.f, (ArrayList) this.c, (ArrayList) this.d, (ResultCallback) this.b);
                break;
            case 4:
                ((FactCheckController) this.e).lambda$loadMissing$1((TLObject) this.f, (TLRPC.TL_getFactCheck) this.d, (ArrayList) this.c, (HashMap) this.b);
                break;
            case 5:
                ((MessagesController) this.e).lambda$loadChannelParticipants$148((TLRPC.TL_error) this.f, (TLObject) this.c, (Long) this.d, (Utilities.Callback) this.b);
                break;
            case 6:
                ((MessagesController) this.e).lambda$getDifference$358((TLRPC.updates_Difference) this.f, (ArrayList) this.c, (a0.h) this.d, (a0.h) this.b);
                break;
            case 7:
                ((MessagesController) this.e).lambda$saveThemeToServer$119((String) this.b, (String) this.f, (org.telegram.ui.ActionBar.e6) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 8:
                ((MessagesController) this.e).lambda$setUserAdminRole$100((TLRPC.User) this.f, (TLRPC.Chat) this.c, (MessagesController.ErrorDelegate) this.d, (TLRPC.TL_error) this.b);
                break;
            case 9:
                ((MessagesController) this.e).lambda$updateTimerProc$154((TLRPC.TL_messages_messageViews) this.f, (a0.h) this.c, (a0.h) this.d, (a0.h) this.b);
                break;
            case 10:
                ((MessagesController) this.e).lambda$saveThemeToServer$120((String) this.b, (File) this.f, (org.telegram.ui.ActionBar.e6) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 11:
                ((MessagesStorage) this.e).lambda$readAllDialogs$64((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.f, (a0.h) this.b);
                break;
            case 12:
                ((MessagesStorage) this.e).lambda$updateDialogsWithReadMessages$120((LongSparseIntArray) this.f, (LongSparseIntArray) this.c, (a0.h) this.d, (LongSparseIntArray) this.b);
                break;
            case 13:
                ((Utilities.Callback4) this.e).run((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.f, (ArrayList) this.b);
                break;
            case 14:
                ((NotificationsController) this.e).lambda$processLoadedUnreadMessages$33((ArrayList) this.c, (a0.h) this.f, (ArrayList) this.d, (Collection) this.b);
                break;
            case 15:
                ((SendMessagesHelper) this.e).lambda$prepareImportStickers$112((SendMessagesHelper.ImportingStickers) this.f, (HashMap) this.c, (String) this.b, (MessagesStorage.StringCallback) this.d);
                break;
            case 16:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$2((File) this.f, (MessageObject) this.c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.b);
                break;
            default:
                ((SendMessagesHelper) this.e).lambda$didReceivedNotification$3((SendMessagesHelper.DelayedMessage) this.f, (File) this.c, (TLRPC.Document) this.d, (MessageObject) this.b);
                break;
        }
    }

    public /* synthetic */ c5(Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Cloneable cloneable, int i10) {
        this.a = i10;
        this.e = obj;
        this.c = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
        this.b = cloneable;
    }

    public /* synthetic */ c5(String str, MessageObject messageObject, TranslateController.MessageKey messageKey, TranslateController translateController, Utilities.Callback callback) {
        this.a = 2;
        this.e = translateController;
        this.f = messageObject;
        this.b = str;
        this.c = messageKey;
        this.d = callback;
    }

    public /* synthetic */ c5(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        this.a = 4;
        this.e = factCheckController;
        this.f = tLObject;
        this.d = tL_getFactCheck;
        this.c = arrayList;
        this.b = hashMap;
    }

    public /* synthetic */ c5(ImageLoader.ThumbGenerateTask thumbGenerateTask, String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
        this.a = 1;
        this.e = thumbGenerateTask;
        this.b = str;
        this.c = arrayList;
        this.f = bitmapDrawable;
        this.d = arrayList2;
    }

    public /* synthetic */ c5(MessagesController messagesController, String str, Object obj, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.a = i10;
        this.e = messagesController;
        this.b = str;
        this.f = obj;
        this.c = e6Var;
        this.d = f6Var;
    }

    public /* synthetic */ c5(NotificationsController notificationsController, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        this.a = 14;
        this.e = notificationsController;
        this.c = arrayList;
        this.f = hVar;
        this.d = arrayList2;
        this.b = collection;
    }

    public /* synthetic */ c5(SendMessagesHelper sendMessagesHelper, SendMessagesHelper.ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        this.a = 15;
        this.e = sendMessagesHelper;
        this.f = importingStickers;
        this.c = hashMap;
        this.b = str;
        this.d = stringCallback;
    }
}
