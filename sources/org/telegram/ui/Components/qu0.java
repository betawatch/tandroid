package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qu0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup B;
    public boolean f;
    public boolean h;
    public final nu0[] n;
    public final long r;
    public final long s;
    public long v;
    public final org.telegram.ui.ActionBar.p2 w;
    public boolean y;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public qu0(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.ChatFull chatFull;
        this.w = p2Var;
        final int i10 = 1;
        final int i11 = 0;
        if (p2Var instanceof rg) {
            rg rgVar = (rg) p2Var;
            long a2 = rgVar.a();
            this.r = a2;
            this.v = rgVar.H();
            this.s = rgVar.b();
            if (a2 != p2Var.getUserConfig().getClientUserId()) {
                p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.pu0
                    public final /* synthetic */ qu0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                qu0 qu0Var = this.b;
                                ArrayList arrayList = qu0Var.x;
                                boolean booleanValue = bool.booleanValue();
                                qu0Var.f = booleanValue;
                                qu0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        ((ru0) arrayList.get(i12)).M();
                                    }
                                    break;
                                }
                                break;
                            default:
                                qu0 qu0Var2 = this.b;
                                ArrayList arrayList2 = qu0Var2.x;
                                boolean booleanValue2 = bool.booleanValue();
                                qu0Var2.f = booleanValue2;
                                qu0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        ((ru0) arrayList2.get(i13)).M();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (p2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) p2Var;
            if (profileActivity.e1) {
                this.r = profileActivity.getUserConfig().getClientUserId();
                this.s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.r = a10;
                this.s = profileActivity.d1;
                TLRPC.ChatFull chatFull2 = profileActivity.r2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.pu0
                        public final /* synthetic */ qu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i10) {
                                case 0:
                                    qu0 qu0Var = this.b;
                                    ArrayList arrayList = qu0Var.x;
                                    boolean booleanValue = bool.booleanValue();
                                    qu0Var.f = booleanValue;
                                    qu0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            ((ru0) arrayList.get(i12)).M();
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    qu0 qu0Var2 = this.b;
                                    ArrayList arrayList2 = qu0Var2.x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    qu0Var2.f = booleanValue2;
                                    qu0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i13 = 0; i13 < size2; i13++) {
                                            ((ru0) arrayList2.get(i13)).M();
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (p2Var instanceof da0) {
            this.r = ((da0) p2Var).e;
        } else if (p2Var instanceof org.telegram.ui.oy) {
            this.r = p2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.r) && (chatFull = p2Var.getMessagesController().getChatFull(-this.r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.n = new nu0[9];
        int i12 = 0;
        while (true) {
            nu0[] nu0VarArr = this.n;
            if (i12 >= nu0VarArr.length) {
                break;
            }
            nu0VarArr[i12] = new nu0();
            this.n[i12].j[0] = DialogObject.isEncryptedDialog(this.r) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            this.n[i12].j[1] = Integer.MAX_VALUE;
            i12++;
        }
        a();
        org.telegram.ui.ActionBar.p2 p2Var2 = this.w;
        if (p2Var2 == null) {
            this.B = null;
        } else {
            this.B = p2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.w;
        if (p2Var == null) {
            return;
        }
        p2Var.getMediaDataController().getMediaCounts(this.r, this.s, p2Var.getClassGuid());
        if (this.v != 0) {
            p2Var.getMediaDataController().getMediaCounts(this.v, this.s, p2Var.getClassGuid());
        }
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != this.w) {
            return;
        }
        this.x.clear();
        NotificationCenter.ObserversGroup observersGroup = this.B;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.p2 p2Var = this.w;
        if (p2Var == null || chatFull == null) {
            return;
        }
        long j10 = chatFull.migrated_from_chat_id;
        if (j10 == 0 || this.v != 0) {
            return;
        }
        this.v = -j10;
        p2Var.getMediaDataController().getMediaCounts(this.v, this.s, p2Var.getClassGuid());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int mediaType;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        boolean z4 = true;
        if (i10 == NotificationCenter.mediaCountsDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.s == longValue2) {
                long j10 = this.r;
                if (longValue == j10 || longValue == this.v) {
                    int[] iArr = (int[]) objArr[2];
                    if (longValue == j10) {
                        this.a = iArr;
                    } else {
                        this.b = iArr;
                    }
                    for (int i18 = 0; i18 < iArr.length; i18++) {
                        int i19 = this.a[i18];
                        if (i19 >= 0 && (i16 = this.b[i18]) >= 0) {
                            this.c[i18] = i19 + i16;
                        } else if (i19 >= 0) {
                            this.c[i18] = i19;
                        } else {
                            this.c[i18] = Math.max(this.b[i18], 0);
                        }
                        if (longValue == this.r && this.c[i18] != 0 && this.d[i18] != this.a[i18]) {
                            if (i18 == 0) {
                                int i20 = this.n[0].q;
                                if (i20 == 1) {
                                    i15 = 6;
                                } else if (i20 == 2) {
                                    i15 = 7;
                                }
                                this.w.getMediaDataController().loadMedia(longValue, this.d[i18] == -1 ? 30 : 20, 0, 0, i15, longValue2, 1, this.w.getClassGuid(), this.n[i18].p, null, null);
                                this.d[i18] = this.a[i18];
                            }
                            i15 = i18;
                            this.w.getMediaDataController().loadMedia(longValue, this.d[i18] == -1 ? 30 : 20, 0, 0, i15, longValue2, 1, this.w.getClassGuid(), this.n[i18].p, null, null);
                            this.d[i18] = this.a[i18];
                        } else if (longValue == this.v && this.c[i18] != 0 && this.e[i18] != this.b[i18]) {
                            if (i18 == 0) {
                                int i21 = this.n[0].q;
                                if (i21 == 1) {
                                    i14 = 6;
                                } else if (i21 == 2) {
                                    i14 = 7;
                                }
                                this.w.getMediaDataController().loadMedia(longValue, this.e[i18] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.w.getClassGuid(), this.n[i18].p, null, null);
                                this.e[i18] = this.b[i18];
                            }
                            i14 = i18;
                            this.w.getMediaDataController().loadMedia(longValue, this.e[i18] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.w.getClassGuid(), this.n[i18].p, null, null);
                            this.e[i18] = this.b[i18];
                        }
                    }
                    this.y = true;
                    int size = this.x.size();
                    while (i17 < size) {
                        ((ru0) this.x.get(i17)).M();
                        i17++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mediaCountDidLoad) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if ((longValue3 == this.r || longValue3 == this.v) && this.s == longValue4) {
                int intValue = ((Integer) objArr[4]).intValue();
                int intValue2 = ((Integer) objArr[2]).intValue();
                if (longValue3 == this.r) {
                    this.a[intValue] = intValue2;
                } else {
                    this.b[intValue] = intValue2;
                }
                int i22 = this.a[intValue];
                if (i22 >= 0 && (i13 = this.b[intValue]) >= 0) {
                    this.c[intValue] = i22 + i13;
                } else if (i22 >= 0) {
                    this.c[intValue] = i22;
                } else {
                    this.c[intValue] = Math.max(this.b[intValue], 0);
                }
                int size2 = this.x.size();
                while (i17 < size2) {
                    ((ru0) this.x.get(i17)).M();
                    i17++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            long j11 = this.r;
            if (longValue5 == j11 || longValue5 == this.v) {
                int i23 = longValue5 == j11 ? 0 : 1;
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.p2 p2Var = this.w;
                int currentAccount = p2Var != null ? p2Var.getCurrentAccount() : -1;
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i24);
                    if (!messageObject.isEphemeral()) {
                        long j12 = this.s;
                        if ((j12 == 0 || j12 == MessageObject.getTopicId(currentAccount, messageObject.messageOwner, true)) && MessageObject.getMedia(messageObject.messageOwner) != null && !messageObject.needDrawBluredPreview() && (mediaType = MediaDataController.getMediaType(messageObject.messageOwner)) != -1 && ((mediaType != 0 || this.n[0].q != 2 || messageObject.isVideo()) && (mediaType != 0 || this.n[0].q != 1 || !messageObject.isVideo()))) {
                            nu0 nu0Var = this.n[mediaType];
                            if (nu0Var.l) {
                                nu0Var.a(messageObject, i23, true, isEncryptedDialog);
                            }
                            if (this.s == 0) {
                                int[] iArr2 = this.n[mediaType].f;
                                iArr2[i23] = iArr2[i23] + 1;
                            }
                            if (i23 == 0) {
                                for (int i25 = 0; i25 < this.n[mediaType].e.size(); i25++) {
                                    ((vt0) this.n[mediaType].e.get(i25)).b++;
                                }
                            }
                        }
                    }
                }
                a();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messageReceivedByServer) {
            if (i10 == NotificationCenter.mediaDidLoad) {
                long longValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.w.getClassGuid()) {
                    int intValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(longValue6);
                    int i26 = longValue6 == this.r ? 0 : 1;
                    if (intValue3 == 0 || intValue3 == 6 || intValue3 == 7) {
                        if (intValue3 != this.n[0].q) {
                            return;
                        } else {
                            intValue3 = 0;
                        }
                    }
                    if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                        this.n[intValue3].f[i26] = ((Integer) objArr[1]).intValue();
                    }
                    this.n[intValue3].i[i26] = ((Boolean) objArr[5]).booleanValue();
                    for (int i27 = 0; i27 < arrayList2.size(); i27++) {
                        this.n[intValue3].a((MessageObject) arrayList2.get(i27), i26, false, isEncryptedDialog2);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messagesDeleted) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long longValue7 = ((Long) objArr[1]).longValue();
                TLRPC.Chat chat = DialogObject.isChatDialog(this.r) ? this.w.getMessagesController().getChat(Long.valueOf(-this.r)) : null;
                if (ChatObject.isChannel(chat)) {
                    if ((longValue7 != 0 || this.v == 0) && longValue7 != chat.id) {
                        return;
                    }
                } else if (longValue7 != 0) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                org.telegram.ui.ActionBar.p2 p2Var2 = this.w;
                int currentAccount2 = p2Var2 != null ? p2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                boolean z10 = false;
                for (int i28 = 0; i28 < size3; i28++) {
                    int i29 = 0;
                    while (true) {
                        nu0[] nu0VarArr = this.n;
                        if (i29 < nu0VarArr.length) {
                            MessageObject b10 = nu0VarArr[i29].b(((Integer) arrayList3.get(i28)).intValue(), 0);
                            if (b10 != null) {
                                if (b10.getDialogId() == this.r && (this.s == 0 || MessageObject.getTopicId(currentAccount2, b10.messageOwner, true) == this.s)) {
                                    int[] iArr3 = this.a;
                                    int i30 = iArr3[i29];
                                    if (i30 > 0) {
                                        iArr3[i29] = i30 - 1;
                                    }
                                } else {
                                    int[] iArr4 = this.b;
                                    int i31 = iArr4[i29];
                                    if (i31 > 0) {
                                        iArr4[i29] = i31 - 1;
                                    }
                                }
                                z10 = true;
                            }
                            i29++;
                        }
                    }
                }
                if (z10) {
                    int i32 = 0;
                    while (true) {
                        int[] iArr5 = this.a;
                        if (i32 >= iArr5.length) {
                            break;
                        }
                        int i33 = iArr5[i32];
                        if (i33 >= 0 && (i12 = this.b[i32]) >= 0) {
                            this.c[i32] = i33 + i12;
                        } else if (i33 >= 0) {
                            this.c[i32] = i33;
                        } else {
                            this.c[i32] = Math.max(this.b[i32], 0);
                        }
                        i32++;
                    }
                    int size4 = this.x.size();
                    while (i17 < size4) {
                        ((ru0) this.x.get(i17)).M();
                        i17++;
                    }
                }
                a();
                return;
            }
            if (i10 != NotificationCenter.replaceMessagesObjects) {
                if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j13 = this.r;
                    if (j13 >= 0 || chatFull.id != (-j13)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i10 == NotificationCenter.fileLoaded) {
                    ArrayList arrayList4 = new ArrayList();
                    int i34 = 0;
                    while (true) {
                        nu0[] nu0VarArr2 = this.n;
                        if (i34 >= nu0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(nu0VarArr2[i34].a);
                        i34++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.globalQueue.postRunnable(new androidx.activity.g(arrayList4, str, i11, 7));
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.savedMessagesDialogsUpdate) {
                    org.telegram.ui.ActionBar.p2 p2Var3 = this.w;
                    boolean z11 = p2Var3 != null && p2Var3.getMessagesController().getSavedMessagesController().containsDialog(this.r);
                    if (!this.h || this.f == z11) {
                        return;
                    }
                    this.f = z11;
                    int size5 = this.x.size();
                    for (int i35 = 0; i35 < size5; i35++) {
                        ((ru0) this.x.get(i35)).M();
                    }
                    return;
                }
                return;
            }
            long longValue8 = ((Long) objArr[0]).longValue();
            long j14 = this.r;
            if (longValue8 == j14 || longValue8 == this.v) {
                int i36 = longValue8 == j14 ? 0 : 1;
                ArrayList arrayList5 = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.p2 p2Var4 = this.w;
                int currentAccount3 = p2Var4 != null ? p2Var4.getCurrentAccount() : -1;
                int size6 = arrayList5.size();
                int i37 = 0;
                while (i37 < size6) {
                    MessageObject messageObject2 = (MessageObject) arrayList5.get(i37);
                    int id2 = messageObject2.getId();
                    long topicId = MessageObject.getTopicId(currentAccount3, messageObject2.messageOwner, z4);
                    int mediaType2 = MediaDataController.getMediaType(messageObject2.messageOwner);
                    long j15 = this.s;
                    if (j15 == 0 || topicId == j15) {
                        int i38 = 0;
                        while (true) {
                            nu0[] nu0VarArr3 = this.n;
                            if (i38 >= nu0VarArr3.length) {
                                break;
                            }
                            MessageObject messageObject3 = (MessageObject) nu0VarArr3[i38].b[i36].get(id2);
                            if (messageObject3 != null) {
                                int mediaType3 = MediaDataController.getMediaType(messageObject2.messageOwner);
                                if (mediaType2 == -1 || mediaType3 != mediaType2) {
                                    this.n[i38].b(id2, i36);
                                    if (i36 == 0) {
                                        int[] iArr6 = this.a;
                                        int i39 = iArr6[i38];
                                        if (i39 > 0) {
                                            iArr6[i38] = i39 - 1;
                                        }
                                    } else {
                                        int[] iArr7 = this.b;
                                        int i40 = iArr7[i38];
                                        if (i40 > 0) {
                                            iArr7[i38] = i40 - 1;
                                        }
                                    }
                                } else {
                                    int indexOf = this.n[i38].a.indexOf(messageObject3);
                                    if (indexOf >= 0) {
                                        this.n[i38].b[i36].put(id2, messageObject2);
                                        this.n[i38].a.set(indexOf, messageObject2);
                                    }
                                }
                            } else {
                                i38++;
                            }
                        }
                    }
                    i37++;
                    z4 = true;
                }
                return;
            }
            return;
        }
        if (((Boolean) objArr[6]).booleanValue()) {
            return;
        }
        Integer num = (Integer) objArr[0];
        Integer num2 = (Integer) objArr[1];
        Long l10 = (Long) objArr[3];
        if (l10.longValue() != this.r && l10.longValue() != this.v) {
            return;
        }
        int i41 = l10.longValue() == this.r ? 0 : 1;
        while (true) {
            nu0[] nu0VarArr4 = this.n;
            if (i17 >= nu0VarArr4.length) {
                return;
            }
            nu0VarArr4[i17].f(i41, num.intValue(), num2.intValue());
            i17++;
        }
    }
}
