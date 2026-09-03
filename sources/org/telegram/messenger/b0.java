package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BillingController) this.b).lambda$launchBillingFlow$1((Activity) this.c, (AccountInstance) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (p2.e) this.h);
                break;
            case 1:
                LocationController.lambda$fetchLocationAddress$28((LocationController.LocationFetchCallback) this.b, (String) this.c, (String) this.d, (TLRPC.TL_messageMediaVenue) this.e, (TLRPC.TL_messageMediaVenue) this.f, (Location) this.h);
                break;
            case 2:
                MediaController.lambda$saveFile$55((File) this.b, (File) this.c, (boolean[]) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.d2) this.f, (boolean[]) this.h);
                break;
            case 3:
                ((MessagesController) this.b).lambda$didReceivedNotification$44((TLRPC.WallPaper) this.c, (TLRPC.TL_wallPaperSettings) this.d, (org.telegram.ui.ActionBar.d6) this.e, (File) this.f, (String) this.h);
                break;
            case 4:
                ((MessagesController) this.b).lambda$checkCanOpenChat$451((org.telegram.ui.ActionBar.d2) this.c, (af.f) this.d, (TLObject) this.e, (org.telegram.ui.ActionBar.p2) this.f, (Bundle) this.h);
                break;
            case 5:
                ((SavedMessagesController) this.b).lambda$loadCache$6((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (Runnable) this.h);
                break;
            case 6:
                ((SavedMessagesController) this.b).lambda$updateDialogsLastMessage$8((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (a0.h) this.h);
                break;
            case 7:
                ((SecretChatHelper) this.b).lambda$startSecretChat$26((Context) this.c, (org.telegram.ui.ActionBar.d2) this.d, (TLObject) this.e, (byte[]) this.f, (TLRPC.User) this.h);
                break;
            case 8:
                ((SendMessagesHelper) this.b).lambda$processUnsentMessages$104((ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h);
                break;
            case 9:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$55((TLObject) this.c, (TLRPC.InputMedia) this.d, (SendMessagesHelper.DelayedMessage) this.e, (String) this.f, (MessageObject) this.h);
                break;
            case 10:
                ((SendMessagesHelper) this.b).lambda$prepareImportStickers$113((String) this.c, (String) this.d, (String) this.e, (ArrayList) this.f, (MessagesStorage.StringCallback) this.h);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$didReceivedNotification$1((TLRPC.TL_photo) this.c, (MessageObject) this.d, (File) this.e, (SendMessagesHelper.DelayedMessage) this.f, (String) this.h);
                break;
        }
    }
}
