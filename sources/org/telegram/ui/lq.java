package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ lq(int i9, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var) {
        this.b = i9;
        this.d = arrayList;
        this.c = j10;
        this.e = activity;
        this.f = b6Var;
        this.g = callback;
        this.h = hashMap;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                jr jrVar = (jr) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z10 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j10 = jrVar.J;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = jrVar.A;
                long j11 = this.c;
                oq oqVar = new oq(jrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                oqVar.T0 = new pq(jrVar, intValue, j11, this.b, z10, zArr);
                jrVar.presentFragment(oqVar);
                break;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.e;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f;
                final Utilities.Callback callback = (Utilities.Callback) this.g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i9 = this.b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i9).getMainSettings().edit();
                    int i10 = 0;
                    for (int size = arrayList.size(); i10 < size; size = size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        Long l10 = (Long) obj2;
                        long longValue = l10.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i9).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i9).isUserContactBlocked(longValue));
                        }
                        edit.putLong(aa.d.n(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        gh.v7.y(i9, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j12 = this.c;
                Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i9;
                        long j13 = gh.v7.y(i11, false).p().amount;
                        long j14 = j12;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j13 >= j14) {
                            callback2.run(hashMap2);
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null) {
                            return;
                        }
                        long longValue2 = ((Long) arrayList.get(0)).longValue();
                        new gh.ea(activity2, b6Var, j14, 13, DialogObject.getShortName(i11, longValue2), new bg.e0(callback2, hashMap2, 1), longValue2).show();
                    }
                };
                if (gh.v7.y(i9, false).e) {
                    runnable.run();
                    break;
                } else {
                    gh.v7 y10 = gh.v7.y(i9, false);
                    y10.e = false;
                    y10.q(false, true, runnable);
                    y10.e = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lq(jr jrVar, long j10, int i9, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = jrVar;
        this.c = j10;
        this.b = i9;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }
}
