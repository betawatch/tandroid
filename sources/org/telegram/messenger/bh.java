package org.telegram.messenger;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.z60;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ bh(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, boolean z10, long j10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = tL_error;
        this.f = obj2;
        this.h = obj3;
        this.b = z10;
        this.c = j10;
        this.n = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0185  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        ArrayList arrayList5;
        switch (this.a) {
            case 0:
                boolean z10 = true;
                ui uiVar = (ui) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z11 = this.b;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                long j10 = this.c;
                uiVar.getMessagesController().V3(arrayList6, z11);
                uiVar.getMessagesController().P3(arrayList7, z11);
                int size = arrayList8.size();
                boolean z12 = false;
                int i10 = 0;
                while (i10 < size) {
                    jj jjVar = (jj) arrayList8.get(i10);
                    SparseArray sparseArray = (SparseArray) hVar.f(jj.B0(jjVar.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(jjVar.f1())) != null) {
                        int i11 = 0;
                        while (i11 < arrayList.size()) {
                            jj jjVar2 = (jj) arrayList.get(i11);
                            jjVar2.C = jjVar;
                            jjVar2.m();
                            TLRPC.MessageAction messageAction = jjVar2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                jjVar2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                jjVar2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                jjVar2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                jjVar2.p0(null, z10);
                            }
                            i11++;
                            z10 = true;
                        }
                        z12 = true;
                    }
                    i10++;
                    z10 = true;
                }
                if (z12) {
                    uiVar.getNotificationCenter().k(55, Long.valueOf(j10), arrayList8, hVar);
                    return;
                }
                return;
            case 1:
                vi viVar = (vi) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.h;
                boolean z13 = this.b;
                long j11 = this.c;
                oh.g gVar = (oh.g) this.n;
                viVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z13) {
                        viVar.a.put(j11, tL_messages_chatInviteImporters);
                    }
                }
                gVar.run(tLObject, tL_error);
                return;
            case 2:
                t10 t10Var = (t10) this.d;
                p10 p10Var = (p10) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                boolean z14 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                long j12 = this.c;
                HashSet hashSet = (HashSet) this.n;
                synchronized (t10Var) {
                    arrayList2 = p10Var.b;
                    arrayList3 = p10Var.d;
                    arrayList4 = p10Var.c;
                    str = p10Var.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList9 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList9.size());
                    for (int i12 = 0; i12 < min; i12++) {
                        ((n20) arrayList3.get(i12)).a(Boolean.valueOf(z14), (Integer) arrayList2.get(i12), m31.P0((TLRPC.TL_textWithEntities) arrayList4.get(i12), arrayList9.get(i12)), str);
                    }
                } else {
                    if (tL_error2 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                        arrayList5 = arrayList2;
                        if (tL_error2 == null || !"TO_LANG_INVALID".equals(tL_error2.text)) {
                            if (tL_error2 != null && "QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                zs.e().k(zs.P4, 1, cd.L0(2131743972, null));
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                ((n20) arrayList3.get(i13)).a(Boolean.valueOf(z14), (Integer) arrayList5.get(i13), null, p10Var.e);
                            }
                        } else {
                            t10Var.K(j12, false);
                            zs.e().k(zs.P4, 1, cd.L0(2131743971, null));
                        }
                        synchronized (t10Var) {
                            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                try {
                                    hashSet.remove(arrayList5.get(i14));
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        return;
                    }
                    int i15 = 0;
                    while (i15 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i15)).intValue();
                        ArrayList arrayList10 = arrayList2;
                        String str2 = str;
                        m31.J0(((TLRPC.TL_textWithEntities) arrayList4.get(i15)).text, null, str2, new f10(t10Var, (n20) arrayList3.get(i15), z14, intValue, str2, j12, 1));
                        i15++;
                        arrayList2 = arrayList10;
                        str = str2;
                        arrayList3 = arrayList3;
                    }
                }
                arrayList5 = arrayList2;
                synchronized (t10Var) {
                }
                break;
            case 3:
                final o21 o21Var = (o21) this.d;
                boolean z15 = this.b;
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) this.e;
                final z60 z60Var = (z60) this.f;
                final long j13 = this.c;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.n;
                final boolean z16 = !z15;
                b1Var.setVisibility(0);
                b1Var.setText(cd.L0(!z15 ? 2131743937 : 2131753726, null));
                b1Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        o21 o21Var2 = o21.this;
                        int i16 = o21Var2.n;
                        z60Var.u();
                        boolean z17 = z16;
                        TLRPC.User user2 = user;
                        if (!z17) {
                            org.telegram.messenger.vp.r1(i16).g0(j13, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = org.telegram.messenger.vp.m1(user2);
                        tL_channels_editBanned.channel = org.telegram.messenger.vp.h1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i16).sendRequest(tL_channels_editBanned, new x1(o21Var2, 14));
                    }
                });
                return;
            default:
                rh.i.c0((rh.i) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
        }
    }

    public /* synthetic */ bh(ui uiVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.a = 0;
        this.d = uiVar;
        this.e = arrayList;
        this.b = z10;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = hVar;
        this.c = j10;
    }

    public /* synthetic */ bh(t10 t10Var, p10 p10Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j10, HashSet hashSet) {
        this.a = 2;
        this.d = t10Var;
        this.e = p10Var;
        this.f = tLObject;
        this.b = z10;
        this.h = tL_error;
        this.c = j10;
        this.n = hashSet;
    }

    public /* synthetic */ bh(o21 o21Var, boolean z10, org.telegram.ui.ActionBar.b1 b1Var, z60 z60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.a = 3;
        this.d = o21Var;
        this.b = z10;
        this.e = b1Var;
        this.f = z60Var;
        this.c = j10;
        this.h = user;
        this.n = chat;
    }
}
