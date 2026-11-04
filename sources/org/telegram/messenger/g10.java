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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g10(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h10 h10Var = (h10) this.c;
                boolean z10 = this.b;
                if (h10Var.b) {
                    synchronized (h10Var.a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = h10Var.k().edit();
                                if (h10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", h10.t0);
                                }
                                edit.putBoolean("registeredForPush", h10Var.d);
                                edit.putInt("lastSendMessageId", h10Var.e);
                                edit.putInt("contactsSavedCount", h10Var.h);
                                edit.putInt("lastBroadcastId", h10Var.f);
                                edit.putInt("lastContactsSyncTime", h10Var.r);
                                edit.putInt("lastHintsSyncTime", h10Var.s);
                                edit.putBoolean("draftsLoaded", h10Var.w);
                                edit.putBoolean("unreadDialogsLoaded", h10Var.x);
                                edit.putInt("ratingLoadTime", h10Var.E);
                                edit.putInt("botRatingLoadTime", h10Var.F);
                                edit.putInt("botGuestRatingLoadTime", h10Var.G);
                                edit.putInt("webappRatingLoadTime", h10Var.H);
                                edit.putBoolean("contactsReimported", h10Var.I);
                                edit.putInt("loginTime", h10Var.Z);
                                edit.putBoolean("syncContacts", h10Var.V);
                                edit.putBoolean("showCallsTab", h10Var.X);
                                edit.putBoolean("suggestContacts", h10Var.W);
                                edit.putBoolean("hasSecureData", h10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", h10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", h10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", h10Var.b0);
                                edit.putBoolean("hasValidDialogLoadIds", h10Var.J);
                                edit.putInt("sharingMyLocationUntil", h10Var.R);
                                edit.putInt("lastMyLocationShareTime", h10Var.S);
                                edit.putBoolean("filtersLoaded", h10Var.Q);
                                edit.putString("premiumGiftsStickerPack", h10Var.c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", h10Var.g0);
                                edit.putString("genericAnimationsStickerPack", h10Var.e0);
                                edit.putLong("lastUpdatedGenericAnimations", h10Var.i0);
                                edit.putInt("6migrateOffsetId", h10Var.K);
                                if (h10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", h10Var.L);
                                    edit.putLong("6migrateOffsetUserId", h10Var.M);
                                    edit.putLong("6migrateOffsetChatId", h10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", h10Var.O);
                                    edit.putLong("6migrateOffsetAccess", h10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = h10Var.a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        h10Var.a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                az.y();
                                if (h10Var.y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    h10Var.y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (h10Var.c == null) {
                                    edit.remove("user");
                                } else if (z10) {
                                    SerializedData serializedData3 = new SerializedData();
                                    h10Var.c.serializeToStream(serializedData3);
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
                        Utilities.d.c(new g10(2, y8Var, z11));
                        g0.h3(new u8(y8Var, 2));
                    }
                }
                Iterator it2 = w7Var.n.entrySet().iterator();
                while (it2.hasNext()) {
                    y8 y8Var2 = (y8) ((Map.Entry) it2.next()).getValue();
                    if (y8Var2.m == 1) {
                        Utilities.d.c(new g10(2, y8Var2, z11));
                        g0.h3(new u8(y8Var2, 2));
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
                if (r2.a) {
                    a8.b("network changed to slow = " + y8Var3.i);
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
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
                    ConnectionsManager.getInstance(y8Var3.a).cancelRequest(sparseIntArray.valueAt(i3), true);
                    i3++;
                }
            case 3:
                ld ldVar = (ld) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    ldVar.L = Boolean.FALSE;
                }
                if (ldVar.b.isEmpty()) {
                    return;
                }
                if (!z13) {
                    ldVar.p();
                    return;
                }
                try {
                    ((k4.j) t0.j()).getLastLocation(new fd(ldVar, 0));
                    ((k4.j) t0.j()).requestLocationUpdates(ldVar.O, ldVar.r);
                    return;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    return;
                }
            case 4:
                hp hpVar = (hp) this.c;
                boolean z14 = this.b;
                hpVar.R0 = null;
                hpVar.S0.clear();
                hpVar.getNotificationCenter().k(hs.O2, new Object[0]);
                if (z14) {
                    hpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                xt xtVar = (xt) this.c;
                cv cvVar = xtVar.a;
                boolean z15 = !this.b;
                TLObject tLObject = xtVar.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z15;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z15;
                }
                View view = cvVar.Q;
                if (view != null) {
                    xtVar.r.a = view;
                }
                xtVar.r.f(-1, z15, true);
                View view2 = cvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
