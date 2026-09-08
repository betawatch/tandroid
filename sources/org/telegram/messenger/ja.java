package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ja(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
        this.e = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$deleteSavedDialog$143(this.c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$getSavedReactionTags$486(this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.c, tLObject, tL_error);
                break;
            case 3:
                ((TopicsController) this.b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.c, (ArrayList) this.e, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.b2) this.b, tLObject, this.c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.e, 5));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.n9((org.telegram.ui.ActionBar.n2) this.b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.c, 3));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.o) this.b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.c, (Utilities.Callback) this.e));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.n9((zh.w3) this.b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.c, 4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.s5) this.b, tLObject, (MessageObject) this.d, this.c, (Runnable) this.e, 10));
                break;
        }
    }

    public /* synthetic */ ja(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j3;
    }

    public /* synthetic */ ja(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.c = j3;
        this.d = obj;
        this.e = obj2;
    }
}
