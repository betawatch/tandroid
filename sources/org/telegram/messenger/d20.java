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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class d20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d20(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e20 e20Var = (e20) this.c;
                boolean z10 = this.b;
                if (e20Var.b) {
                    synchronized (e20Var.a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = e20Var.k().edit();
                                if (e20Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", e20.s0);
                                }
                                edit.putBoolean("registeredForPush", e20Var.d);
                                edit.putInt("lastSendMessageId", e20Var.e);
                                edit.putInt("contactsSavedCount", e20Var.h);
                                edit.putInt("lastBroadcastId", e20Var.f);
                                edit.putInt("lastContactsSyncTime", e20Var.r);
                                edit.putInt("lastHintsSyncTime", e20Var.s);
                                edit.putBoolean("draftsLoaded", e20Var.w);
                                edit.putBoolean("unreadDialogsLoaded", e20Var.x);
                                edit.putInt("ratingLoadTime", e20Var.D);
                                edit.putInt("botRatingLoadTime", e20Var.E);
                                edit.putInt("botGuestRatingLoadTime", e20Var.F);
                                edit.putInt("webappRatingLoadTime", e20Var.G);
                                edit.putBoolean("contactsReimported", e20Var.H);
                                edit.putInt("loginTime", e20Var.Y);
                                edit.putBoolean("syncContacts", e20Var.U);
                                edit.putBoolean("showCallsTab", e20Var.W);
                                edit.putBoolean("suggestContacts", e20Var.V);
                                edit.putBoolean("hasSecureData", e20Var.X);
                                edit.putBoolean("notificationsSettingsLoaded4", e20Var.S);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", e20Var.T);
                                edit.putLong("autoDownloadConfigLoadTime", e20Var.a0);
                                edit.putBoolean("hasValidDialogLoadIds", e20Var.I);
                                edit.putInt("sharingMyLocationUntil", e20Var.Q);
                                edit.putInt("lastMyLocationShareTime", e20Var.R);
                                edit.putBoolean("filtersLoaded", e20Var.P);
                                edit.putString("premiumGiftsStickerPack", e20Var.b0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", e20Var.f0);
                                edit.putString("genericAnimationsStickerPack", e20Var.d0);
                                edit.putLong("lastUpdatedGenericAnimations", e20Var.h0);
                                edit.putInt("6migrateOffsetId", e20Var.J);
                                if (e20Var.J != -1) {
                                    edit.putInt("6migrateOffsetDate", e20Var.K);
                                    edit.putLong("6migrateOffsetUserId", e20Var.L);
                                    edit.putLong("6migrateOffsetChatId", e20Var.M);
                                    edit.putLong("6migrateOffsetChannelId", e20Var.N);
                                    edit.putLong("6migrateOffsetAccess", e20Var.O);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = e20Var.Z;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        e20Var.Z.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                uz.y();
                                if (e20Var.y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    e20Var.y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (e20Var.c == null) {
                                    edit.remove("user");
                                } else if (z10) {
                                    SerializedData serializedData3 = new SerializedData();
                                    e20Var.c.serializeToStream(serializedData3);
                                    edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                    serializedData3.cleanup();
                                }
                                edit.apply();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                b8 b8Var = (b8) this.c;
                boolean z11 = this.b;
                Iterator it = b8Var.h.entrySet().iterator();
                while (it.hasNext()) {
                    d9 d9Var = (d9) ((Map.Entry) it.next()).getValue();
                    if (d9Var.m == 1) {
                        Utilities.d.c(new d20(2, d9Var, z11));
                        i0.g3(new z8(d9Var, 2));
                    }
                }
                Iterator it2 = b8Var.n.entrySet().iterator();
                while (it2.hasNext()) {
                    d9 d9Var2 = (d9) ((Map.Entry) it2.next()).getValue();
                    if (d9Var2.m == 1) {
                        Utilities.d.c(new d20(2, d9Var2, z11));
                        i0.g3(new z8(d9Var2, 2));
                    }
                }
                return;
            case 2:
                d9 d9Var3 = (d9) this.c;
                boolean z12 = this.b;
                SparseIntArray sparseIntArray = d9Var3.p;
                if (d9Var3.i == z12) {
                    return;
                }
                d9Var3.i = z12;
                if (v2.a) {
                    f8.b("network changed to slow = " + d9Var3.i);
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseIntArray.size()) {
                        sparseIntArray.clear();
                        d9Var3.b();
                        d9Var3.b = false;
                        d9Var3.c = false;
                        d9Var3.k = 0;
                        d9Var3.r = 0;
                        d9Var3.v = 0L;
                        d9Var3.w = 0L;
                        d9Var3.x = 0;
                        d9Var3.y = null;
                        d9Var3.z = null;
                        d9Var3.A = null;
                        d9Var3.K = 0;
                        Arrays.fill(d9Var3.g, 0);
                        d9Var3.N = 0;
                        d9Var3.P = false;
                        d9Var3.Q.clear();
                        d9Var3.d++;
                        int i11 = d9Var3.i ? 1 : 8;
                        for (int i12 = 0; i12 < i11; i12++) {
                            d9Var3.d();
                        }
                        return;
                    }
                    ConnectionsManager.getInstance(d9Var3.a).cancelRequest(sparseIntArray.valueAt(i10), true);
                    i10++;
                }
            case 3:
                od odVar = (od) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    odVar.K = Boolean.FALSE;
                }
                if (odVar.b.isEmpty()) {
                    return;
                }
                if (!z13) {
                    odVar.p();
                    return;
                }
                try {
                    ((li.k) w0.j()).getLastLocation(new id(odVar, 0));
                    ((li.k) w0.j()).requestLocationUpdates(odVar.N, odVar.r);
                    return;
                } catch (Throwable th3) {
                    f8.g(th3, true);
                    return;
                }
            case 4:
                wp wpVar = (wp) this.c;
                boolean z14 = this.b;
                wpVar.Q0 = null;
                wpVar.R0.clear();
                wpVar.getNotificationCenter().k(at.O2, new Object[0]);
                if (z14) {
                    wpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                ru ruVar = (ru) this.c;
                wv wvVar = ruVar.a;
                boolean z15 = !this.b;
                TLObject tLObject = ruVar.G;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = wvVar.Q;
                if (view != null) {
                    ruVar.r.a = view;
                }
                ruVar.r.f(-1, z15, true);
                View view2 = wvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
