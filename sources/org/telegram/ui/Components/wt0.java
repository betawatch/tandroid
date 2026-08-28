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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wt0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup A;
    public boolean f;
    public boolean h;
    public final tt0[] n;
    public final long r;
    public final long s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 w;
    public boolean y;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public wt0(org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.ChatFull chatFull;
        this.w = o2Var;
        final int i9 = 1;
        final int i10 = 0;
        if (o2Var instanceof rg) {
            rg rgVar = (rg) o2Var;
            long a2 = rgVar.a();
            this.r = a2;
            this.v = rgVar.H();
            this.s = rgVar.b();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.vt0
                    public final /* synthetic */ wt0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                wt0 wt0Var = this.b;
                                ArrayList arrayList = wt0Var.x;
                                boolean booleanValue = bool.booleanValue();
                                wt0Var.f = booleanValue;
                                wt0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((xt0) arrayList.get(i11)).L();
                                    }
                                    break;
                                }
                                break;
                            default:
                                wt0 wt0Var2 = this.b;
                                ArrayList arrayList2 = wt0Var2.x;
                                boolean booleanValue2 = bool.booleanValue();
                                wt0Var2.f = booleanValue2;
                                wt0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((xt0) arrayList2.get(i12)).L();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (o2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) o2Var;
            if (profileActivity.d1) {
                this.r = profileActivity.getUserConfig().getClientUserId();
                this.s = profileActivity.a();
            } else {
                long a3 = profileActivity.a();
                this.r = a3;
                this.s = profileActivity.c1;
                TLRPC.ChatFull chatFull2 = profileActivity.q2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a3 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a3, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.vt0
                        public final /* synthetic */ wt0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i9) {
                                case 0:
                                    wt0 wt0Var = this.b;
                                    ArrayList arrayList = wt0Var.x;
                                    boolean booleanValue = bool.booleanValue();
                                    wt0Var.f = booleanValue;
                                    wt0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((xt0) arrayList.get(i11)).L();
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    wt0 wt0Var2 = this.b;
                                    ArrayList arrayList2 = wt0Var2.x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    wt0Var2.f = booleanValue2;
                                    wt0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((xt0) arrayList2.get(i12)).L();
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (o2Var instanceof k90) {
            this.r = ((k90) o2Var).e;
        } else if (o2Var instanceof org.telegram.ui.dy) {
            this.r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.n = new tt0[9];
        int i11 = 0;
        while (true) {
            tt0[] tt0VarArr = this.n;
            if (i11 >= tt0VarArr.length) {
                break;
            }
            tt0VarArr[i11] = new tt0();
            this.n[i11].j[0] = DialogObject.isEncryptedDialog(this.r) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            this.n[i11].j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.w;
        if (o2Var2 == null) {
            this.A = null;
        } else {
            this.A = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.w;
        if (o2Var == null) {
            return;
        }
        o2Var.getMediaDataController().getMediaCounts(this.r, this.s, o2Var.getClassGuid());
        if (this.v != 0) {
            o2Var.getMediaDataController().getMediaCounts(this.v, this.s, o2Var.getClassGuid());
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != this.w) {
            return;
        }
        this.x.clear();
        NotificationCenter.ObserversGroup observersGroup = this.A;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.w;
        if (o2Var == null || chatFull == null) {
            return;
        }
        long j10 = chatFull.migrated_from_chat_id;
        if (j10 == 0 || this.v != 0) {
            return;
        }
        this.v = -j10;
        o2Var.getMediaDataController().getMediaCounts(this.v, this.s, o2Var.getClassGuid());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        int mediaType;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        boolean z10 = true;
        if (i9 == NotificationCenter.mediaCountsDidLoad) {
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
                    for (int i17 = 0; i17 < iArr.length; i17++) {
                        int i18 = this.a[i17];
                        if (i18 >= 0 && (i15 = this.b[i17]) >= 0) {
                            this.c[i17] = i18 + i15;
                        } else if (i18 >= 0) {
                            this.c[i17] = i18;
                        } else {
                            this.c[i17] = Math.max(this.b[i17], 0);
                        }
                        if (longValue == this.r && this.c[i17] != 0 && this.d[i17] != this.a[i17]) {
                            if (i17 == 0) {
                                int i19 = this.n[0].q;
                                if (i19 == 1) {
                                    i14 = 6;
                                } else if (i19 == 2) {
                                    i14 = 7;
                                }
                                this.w.getMediaDataController().loadMedia(longValue, this.d[i17] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.w.getClassGuid(), this.n[i17].p, null, null);
                                this.d[i17] = this.a[i17];
                            }
                            i14 = i17;
                            this.w.getMediaDataController().loadMedia(longValue, this.d[i17] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.w.getClassGuid(), this.n[i17].p, null, null);
                            this.d[i17] = this.a[i17];
                        } else if (longValue == this.v && this.c[i17] != 0 && this.e[i17] != this.b[i17]) {
                            if (i17 == 0) {
                                int i20 = this.n[0].q;
                                if (i20 == 1) {
                                    i13 = 6;
                                } else if (i20 == 2) {
                                    i13 = 7;
                                }
                                this.w.getMediaDataController().loadMedia(longValue, this.e[i17] == -1 ? 30 : 20, 0, 0, i13, longValue2, 1, this.w.getClassGuid(), this.n[i17].p, null, null);
                                this.e[i17] = this.b[i17];
                            }
                            i13 = i17;
                            this.w.getMediaDataController().loadMedia(longValue, this.e[i17] == -1 ? 30 : 20, 0, 0, i13, longValue2, 1, this.w.getClassGuid(), this.n[i17].p, null, null);
                            this.e[i17] = this.b[i17];
                        }
                    }
                    this.y = true;
                    int size = this.x.size();
                    while (i16 < size) {
                        ((xt0) this.x.get(i16)).L();
                        i16++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.mediaCountDidLoad) {
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
                int i21 = this.a[intValue];
                if (i21 >= 0 && (i12 = this.b[intValue]) >= 0) {
                    this.c[intValue] = i21 + i12;
                } else if (i21 >= 0) {
                    this.c[intValue] = i21;
                } else {
                    this.c[intValue] = Math.max(this.b[intValue], 0);
                }
                int size2 = this.x.size();
                while (i16 < size2) {
                    ((xt0) this.x.get(i16)).L();
                    i16++;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            long j11 = this.r;
            if (longValue5 == j11 || longValue5 == this.v) {
                int i22 = longValue5 == j11 ? 0 : 1;
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.o2 o2Var = this.w;
                int currentAccount = o2Var != null ? o2Var.getCurrentAccount() : -1;
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i23);
                    if (!messageObject.isEphemeral()) {
                        long j12 = this.s;
                        if ((j12 == 0 || j12 == MessageObject.getTopicId(currentAccount, messageObject.messageOwner, true)) && MessageObject.getMedia(messageObject.messageOwner) != null && !messageObject.needDrawBluredPreview() && (mediaType = MediaDataController.getMediaType(messageObject.messageOwner)) != -1 && ((mediaType != 0 || this.n[0].q != 2 || messageObject.isVideo()) && (mediaType != 0 || this.n[0].q != 1 || !messageObject.isVideo()))) {
                            tt0 tt0Var = this.n[mediaType];
                            if (tt0Var.l) {
                                tt0Var.a(messageObject, i22, true, isEncryptedDialog);
                            }
                            if (this.s == 0) {
                                int[] iArr2 = this.n[mediaType].f;
                                iArr2[i22] = iArr2[i22] + 1;
                            }
                            if (i22 == 0) {
                                for (int i24 = 0; i24 < this.n[mediaType].e.size(); i24++) {
                                    ((ct0) this.n[mediaType].e.get(i24)).b++;
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
        if (i9 != NotificationCenter.messageReceivedByServer) {
            if (i9 == NotificationCenter.mediaDidLoad) {
                long longValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.w.getClassGuid()) {
                    int intValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(longValue6);
                    int i25 = longValue6 == this.r ? 0 : 1;
                    if (intValue3 == 0 || intValue3 == 6 || intValue3 == 7) {
                        if (intValue3 != this.n[0].q) {
                            return;
                        } else {
                            intValue3 = 0;
                        }
                    }
                    if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                        this.n[intValue3].f[i25] = ((Integer) objArr[1]).intValue();
                    }
                    this.n[intValue3].i[i25] = ((Boolean) objArr[5]).booleanValue();
                    for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                        this.n[intValue3].a((MessageObject) arrayList2.get(i26), i25, false, isEncryptedDialog2);
                    }
                    return;
                }
                return;
            }
            if (i9 == NotificationCenter.messagesDeleted) {
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
                org.telegram.ui.ActionBar.o2 o2Var2 = this.w;
                int currentAccount2 = o2Var2 != null ? o2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                boolean z11 = false;
                for (int i27 = 0; i27 < size3; i27++) {
                    int i28 = 0;
                    while (true) {
                        tt0[] tt0VarArr = this.n;
                        if (i28 < tt0VarArr.length) {
                            MessageObject b10 = tt0VarArr[i28].b(((Integer) arrayList3.get(i27)).intValue(), 0);
                            if (b10 != null) {
                                if (b10.getDialogId() == this.r && (this.s == 0 || MessageObject.getTopicId(currentAccount2, b10.messageOwner, true) == this.s)) {
                                    int[] iArr3 = this.a;
                                    int i29 = iArr3[i28];
                                    if (i29 > 0) {
                                        iArr3[i28] = i29 - 1;
                                    }
                                } else {
                                    int[] iArr4 = this.b;
                                    int i30 = iArr4[i28];
                                    if (i30 > 0) {
                                        iArr4[i28] = i30 - 1;
                                    }
                                }
                                z11 = true;
                            }
                            i28++;
                        }
                    }
                }
                if (z11) {
                    int i31 = 0;
                    while (true) {
                        int[] iArr5 = this.a;
                        if (i31 >= iArr5.length) {
                            break;
                        }
                        int i32 = iArr5[i31];
                        if (i32 >= 0 && (i11 = this.b[i31]) >= 0) {
                            this.c[i31] = i32 + i11;
                        } else if (i32 >= 0) {
                            this.c[i31] = i32;
                        } else {
                            this.c[i31] = Math.max(this.b[i31], 0);
                        }
                        i31++;
                    }
                    int size4 = this.x.size();
                    while (i16 < size4) {
                        ((xt0) this.x.get(i16)).L();
                        i16++;
                    }
                }
                a();
                return;
            }
            if (i9 != NotificationCenter.replaceMessagesObjects) {
                if (i9 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j13 = this.r;
                    if (j13 >= 0 || chatFull.id != (-j13)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i9 == NotificationCenter.fileLoaded) {
                    ArrayList arrayList4 = new ArrayList();
                    int i33 = 0;
                    while (true) {
                        tt0[] tt0VarArr2 = this.n;
                        if (i33 >= tt0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(tt0VarArr2[i33].a);
                        i33++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.globalQueue.postRunnable(new androidx.activity.g(arrayList4, str, i10, 7));
                        return;
                    }
                    return;
                }
                if (i9 == NotificationCenter.savedMessagesDialogsUpdate) {
                    org.telegram.ui.ActionBar.o2 o2Var3 = this.w;
                    boolean z12 = o2Var3 != null && o2Var3.getMessagesController().getSavedMessagesController().containsDialog(this.r);
                    if (!this.h || this.f == z12) {
                        return;
                    }
                    this.f = z12;
                    int size5 = this.x.size();
                    for (int i34 = 0; i34 < size5; i34++) {
                        ((xt0) this.x.get(i34)).L();
                    }
                    return;
                }
                return;
            }
            long longValue8 = ((Long) objArr[0]).longValue();
            long j14 = this.r;
            if (longValue8 == j14 || longValue8 == this.v) {
                int i35 = longValue8 == j14 ? 0 : 1;
                ArrayList arrayList5 = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.o2 o2Var4 = this.w;
                int currentAccount3 = o2Var4 != null ? o2Var4.getCurrentAccount() : -1;
                int size6 = arrayList5.size();
                int i36 = 0;
                while (i36 < size6) {
                    MessageObject messageObject2 = (MessageObject) arrayList5.get(i36);
                    int id2 = messageObject2.getId();
                    long topicId = MessageObject.getTopicId(currentAccount3, messageObject2.messageOwner, z10);
                    int mediaType2 = MediaDataController.getMediaType(messageObject2.messageOwner);
                    long j15 = this.s;
                    if (j15 == 0 || topicId == j15) {
                        int i37 = 0;
                        while (true) {
                            tt0[] tt0VarArr3 = this.n;
                            if (i37 >= tt0VarArr3.length) {
                                break;
                            }
                            MessageObject messageObject3 = (MessageObject) tt0VarArr3[i37].b[i35].get(id2);
                            if (messageObject3 != null) {
                                int mediaType3 = MediaDataController.getMediaType(messageObject2.messageOwner);
                                if (mediaType2 == -1 || mediaType3 != mediaType2) {
                                    this.n[i37].b(id2, i35);
                                    if (i35 == 0) {
                                        int[] iArr6 = this.a;
                                        int i38 = iArr6[i37];
                                        if (i38 > 0) {
                                            iArr6[i37] = i38 - 1;
                                        }
                                    } else {
                                        int[] iArr7 = this.b;
                                        int i39 = iArr7[i37];
                                        if (i39 > 0) {
                                            iArr7[i37] = i39 - 1;
                                        }
                                    }
                                } else {
                                    int indexOf = this.n[i37].a.indexOf(messageObject3);
                                    if (indexOf >= 0) {
                                        this.n[i37].b[i35].put(id2, messageObject2);
                                        this.n[i37].a.set(indexOf, messageObject2);
                                    }
                                }
                            } else {
                                i37++;
                            }
                        }
                    }
                    i36++;
                    z10 = true;
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
        int i40 = l10.longValue() == this.r ? 0 : 1;
        while (true) {
            tt0[] tt0VarArr4 = this.n;
            if (i16 >= tt0VarArr4.length) {
                return;
            }
            tt0VarArr4[i16].f(i40, num.intValue(), num2.intValue());
            i16++;
        }
    }
}
