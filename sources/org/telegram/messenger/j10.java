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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class j10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j10(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k10 k10Var = (k10) this.c;
                boolean z10 = this.b;
                if (k10Var.b) {
                    synchronized (k10Var.a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = k10Var.k().edit();
                                if (k10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", k10.t0);
                                }
                                edit.putBoolean("registeredForPush", k10Var.d);
                                edit.putInt("lastSendMessageId", k10Var.e);
                                edit.putInt("contactsSavedCount", k10Var.h);
                                edit.putInt("lastBroadcastId", k10Var.f);
                                edit.putInt("lastContactsSyncTime", k10Var.r);
                                edit.putInt("lastHintsSyncTime", k10Var.s);
                                edit.putBoolean("draftsLoaded", k10Var.w);
                                edit.putBoolean("unreadDialogsLoaded", k10Var.x);
                                edit.putInt("ratingLoadTime", k10Var.E);
                                edit.putInt("botRatingLoadTime", k10Var.F);
                                edit.putInt("botGuestRatingLoadTime", k10Var.G);
                                edit.putInt("webappRatingLoadTime", k10Var.H);
                                edit.putBoolean("contactsReimported", k10Var.I);
                                edit.putInt("loginTime", k10Var.Z);
                                edit.putBoolean("syncContacts", k10Var.V);
                                edit.putBoolean("showCallsTab", k10Var.X);
                                edit.putBoolean("suggestContacts", k10Var.W);
                                edit.putBoolean("hasSecureData", k10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", k10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", k10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", k10Var.b0);
                                edit.putBoolean("hasValidDialogLoadIds", k10Var.J);
                                edit.putInt("sharingMyLocationUntil", k10Var.R);
                                edit.putInt("lastMyLocationShareTime", k10Var.S);
                                edit.putBoolean("filtersLoaded", k10Var.Q);
                                edit.putString("premiumGiftsStickerPack", k10Var.c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", k10Var.g0);
                                edit.putString("genericAnimationsStickerPack", k10Var.e0);
                                edit.putLong("lastUpdatedGenericAnimations", k10Var.i0);
                                edit.putInt("6migrateOffsetId", k10Var.K);
                                if (k10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", k10Var.L);
                                    edit.putLong("6migrateOffsetUserId", k10Var.M);
                                    edit.putLong("6migrateOffsetChatId", k10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", k10Var.O);
                                    edit.putLong("6migrateOffsetAccess", k10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = k10Var.a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        k10Var.a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                cz.y();
                                if (k10Var.y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    k10Var.y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (k10Var.c == null) {
                                    edit.remove("user");
                                } else if (z10) {
                                    SerializedData serializedData3 = new SerializedData();
                                    k10Var.c.serializeToStream(serializedData3);
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
                        Utilities.d.c(new j10(2, y8Var, z11));
                        g0.g3(new u8(y8Var, 2));
                    }
                }
                Iterator it2 = w7Var.n.entrySet().iterator();
                while (it2.hasNext()) {
                    y8 y8Var2 = (y8) ((Map.Entry) it2.next()).getValue();
                    if (y8Var2.m == 1) {
                        Utilities.d.c(new j10(2, y8Var2, z11));
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
                rd rdVar = (rd) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    rdVar.L = Boolean.FALSE;
                }
                if (rdVar.b.isEmpty()) {
                    return;
                }
                if (!z13) {
                    rdVar.p();
                    return;
                }
                try {
                    ((h6.m) t0.j()).getLastLocation(new ld(rdVar, 0));
                    ((h6.m) t0.j()).requestLocationUpdates(rdVar.O, rdVar.r);
                    return;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    return;
                }
            case 4:
                np npVar = (np) this.c;
                boolean z14 = this.b;
                npVar.R0 = null;
                npVar.S0.clear();
                npVar.getNotificationCenter().k(ls.O2, new Object[0]);
                if (z14) {
                    npVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                au auVar = (au) this.c;
                fv fvVar = auVar.a;
                boolean z15 = !this.b;
                TLObject tLObject = auVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = fvVar.Q;
                if (view != null) {
                    auVar.r.a = view;
                }
                auVar.r.f(-1, z15, true);
                View view2 = fvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
