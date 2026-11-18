package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class i10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i10(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j10 j10Var = (j10) this.c;
                boolean z10 = this.b;
                if (j10Var.b) {
                    synchronized (j10Var.a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = j10Var.k().edit();
                                if (j10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", j10.t0);
                                }
                                edit.putBoolean("registeredForPush", j10Var.d);
                                edit.putInt("lastSendMessageId", j10Var.e);
                                edit.putInt("contactsSavedCount", j10Var.h);
                                edit.putInt("lastBroadcastId", j10Var.f);
                                edit.putInt("lastContactsSyncTime", j10Var.r);
                                edit.putInt("lastHintsSyncTime", j10Var.s);
                                edit.putBoolean("draftsLoaded", j10Var.w);
                                edit.putBoolean("unreadDialogsLoaded", j10Var.x);
                                edit.putInt("ratingLoadTime", j10Var.E);
                                edit.putInt("botRatingLoadTime", j10Var.F);
                                edit.putInt("botGuestRatingLoadTime", j10Var.G);
                                edit.putInt("webappRatingLoadTime", j10Var.H);
                                edit.putBoolean("contactsReimported", j10Var.I);
                                edit.putInt("loginTime", j10Var.Z);
                                edit.putBoolean("syncContacts", j10Var.V);
                                edit.putBoolean("showCallsTab", j10Var.X);
                                edit.putBoolean("suggestContacts", j10Var.W);
                                edit.putBoolean("hasSecureData", j10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", j10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", j10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", j10Var.b0);
                                edit.putBoolean("hasValidDialogLoadIds", j10Var.J);
                                edit.putInt("sharingMyLocationUntil", j10Var.R);
                                edit.putInt("lastMyLocationShareTime", j10Var.S);
                                edit.putBoolean("filtersLoaded", j10Var.Q);
                                edit.putString("premiumGiftsStickerPack", j10Var.c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", j10Var.g0);
                                edit.putString("genericAnimationsStickerPack", j10Var.e0);
                                edit.putLong("lastUpdatedGenericAnimations", j10Var.i0);
                                edit.putInt("6migrateOffsetId", j10Var.K);
                                if (j10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", j10Var.L);
                                    edit.putLong("6migrateOffsetUserId", j10Var.M);
                                    edit.putLong("6migrateOffsetChatId", j10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", j10Var.O);
                                    edit.putLong("6migrateOffsetAccess", j10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = j10Var.a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        j10Var.a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                bz.y();
                                if (j10Var.y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    j10Var.y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (j10Var.c == null) {
                                    edit.remove("user");
                                } else if (z10) {
                                    SerializedData serializedData3 = new SerializedData();
                                    j10Var.c.serializeToStream(serializedData3);
                                    edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                    serializedData3.cleanup();
                                }
                                edit.apply();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                w7 w7Var = (w7) this.c;
                boolean z11 = this.b;
                Iterator it = w7Var.h.entrySet().iterator();
                while (it.hasNext()) {
                    y8 y8Var = (y8) ((Map.Entry) it.next()).getValue();
                    if (y8Var.m == 1) {
                        Utilities.d.c(new i10(2, y8Var, z11));
                        g0.g3(new u8(y8Var, 2));
                    }
                }
                Iterator it2 = w7Var.n.entrySet().iterator();
                while (it2.hasNext()) {
                    y8 y8Var2 = (y8) ((Map.Entry) it2.next()).getValue();
                    if (y8Var2.m == 1) {
                        Utilities.d.c(new i10(2, y8Var2, z11));
                        g0.g3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.c;
                boolean z12 = this.b;
                SparseIntArray sparseIntArray = y8Var3.p;
                if (y8Var3.i == z12) {
                    return;
                }
                y8Var3.i = z12;
                if (s2.a) {
                    a8.b("network changed to slow = " + y8Var3.i);
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= sparseIntArray.size()) {
                        sparseIntArray.clear();
                        y8Var3.b();
                        y8Var3.b = false;
                        y8Var3.c = false;
                        y8Var3.k = 0;
                        y8Var3.r = 0;
                        y8Var3.v = 0L;
                        y8Var3.w = 0L;
                        y8Var3.x = 0;
                        y8Var3.y = null;
                        y8Var3.z = null;
                        y8Var3.A = null;
                        y8Var3.K = 0;
                        Arrays.fill(y8Var3.g, 0);
                        y8Var3.N = 0;
                        y8Var3.P = false;
                        y8Var3.Q.clear();
                        y8Var3.d++;
                        int i10 = y8Var3.i ? 1 : 8;
                        for (int i11 = 0; i11 < i10; i11++) {
                            y8Var3.d();
                        }
                        return;
                    }
                    ConnectionsManager.getInstance(y8Var3.a).cancelRequest(sparseIntArray.valueAt(i7), true);
                    i7++;
                }
            case 3:
                qd qdVar = (qd) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    qdVar.L = Boolean.FALSE;
                }
                if (qdVar.b.isEmpty()) {
                    return;
                }
                if (!z13) {
                    qdVar.p();
                    return;
                }
                try {
                    ((h6.m) t0.j()).getLastLocation(new kd(qdVar, 0));
                    ((h6.m) t0.j()).requestLocationUpdates(qdVar.O, qdVar.r);
                    return;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    return;
                }
            case 4:
                mp mpVar = (mp) this.c;
                boolean z14 = this.b;
                mpVar.R0 = null;
                mpVar.S0.clear();
                mpVar.getNotificationCenter().k(ks.O2, new Object[0]);
                if (z14) {
                    mpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                zt ztVar = (zt) this.c;
                ev evVar = ztVar.a;
                boolean z15 = !this.b;
                TLObject tLObject = ztVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = evVar.Q;
                if (view != null) {
                    ztVar.r.a = view;
                }
                ztVar.r.f(-1, z15, true);
                View view2 = evVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
