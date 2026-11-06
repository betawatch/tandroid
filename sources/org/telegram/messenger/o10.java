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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class o10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o10(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p10 p10Var = (p10) this.c;
                boolean z9 = this.b;
                if (p10Var.b) {
                    synchronized (p10Var.a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = p10Var.k().edit();
                                if (p10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", p10.s0);
                                }
                                edit.putBoolean("registeredForPush", p10Var.d);
                                edit.putInt("lastSendMessageId", p10Var.e);
                                edit.putInt("contactsSavedCount", p10Var.h);
                                edit.putInt("lastBroadcastId", p10Var.f);
                                edit.putInt("lastContactsSyncTime", p10Var.r);
                                edit.putInt("lastHintsSyncTime", p10Var.s);
                                edit.putBoolean("draftsLoaded", p10Var.w);
                                edit.putBoolean("unreadDialogsLoaded", p10Var.x);
                                edit.putInt("ratingLoadTime", p10Var.D);
                                edit.putInt("botRatingLoadTime", p10Var.E);
                                edit.putInt("botGuestRatingLoadTime", p10Var.F);
                                edit.putInt("webappRatingLoadTime", p10Var.G);
                                edit.putBoolean("contactsReimported", p10Var.H);
                                edit.putInt("loginTime", p10Var.Y);
                                edit.putBoolean("syncContacts", p10Var.U);
                                edit.putBoolean("showCallsTab", p10Var.W);
                                edit.putBoolean("suggestContacts", p10Var.V);
                                edit.putBoolean("hasSecureData", p10Var.X);
                                edit.putBoolean("notificationsSettingsLoaded4", p10Var.S);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", p10Var.T);
                                edit.putLong("autoDownloadConfigLoadTime", p10Var.a0);
                                edit.putBoolean("hasValidDialogLoadIds", p10Var.I);
                                edit.putInt("sharingMyLocationUntil", p10Var.Q);
                                edit.putInt("lastMyLocationShareTime", p10Var.R);
                                edit.putBoolean("filtersLoaded", p10Var.P);
                                edit.putString("premiumGiftsStickerPack", p10Var.b0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", p10Var.f0);
                                edit.putString("genericAnimationsStickerPack", p10Var.d0);
                                edit.putLong("lastUpdatedGenericAnimations", p10Var.h0);
                                edit.putInt("6migrateOffsetId", p10Var.J);
                                if (p10Var.J != -1) {
                                    edit.putInt("6migrateOffsetDate", p10Var.K);
                                    edit.putLong("6migrateOffsetUserId", p10Var.L);
                                    edit.putLong("6migrateOffsetChatId", p10Var.M);
                                    edit.putLong("6migrateOffsetChannelId", p10Var.N);
                                    edit.putLong("6migrateOffsetAccess", p10Var.O);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = p10Var.Z;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        p10Var.Z.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                iz.y();
                                if (p10Var.y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    p10Var.y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (p10Var.c == null) {
                                    edit.remove("user");
                                } else if (z9) {
                                    SerializedData serializedData3 = new SerializedData();
                                    p10Var.c.serializeToStream(serializedData3);
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
                boolean z10 = this.b;
                Iterator it = w7Var.h.entrySet().iterator();
                while (it.hasNext()) {
                    y8 y8Var = (y8) ((Map.Entry) it.next()).getValue();
                    if (y8Var.m == 1) {
                        Utilities.d.c(new o10(2, y8Var, z10));
                        g0.h3(new u8(y8Var, 2));
                    }
                }
                Iterator it2 = w7Var.n.entrySet().iterator();
                while (it2.hasNext()) {
                    y8 y8Var2 = (y8) ((Map.Entry) it2.next()).getValue();
                    if (y8Var2.m == 1) {
                        Utilities.d.c(new o10(2, y8Var2, z10));
                        g0.h3(new u8(y8Var2, 2));
                    }
                }
                return;
            case 2:
                y8 y8Var3 = (y8) this.c;
                boolean z11 = this.b;
                SparseIntArray sparseIntArray = y8Var3.p;
                if (y8Var3.i == z11) {
                    return;
                }
                y8Var3.i = z11;
                if (r2.a) {
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
                sd sdVar = (sd) this.c;
                boolean z12 = this.b;
                if (!z12) {
                    sdVar.K = Boolean.FALSE;
                }
                if (sdVar.b.isEmpty()) {
                    return;
                }
                if (!z12) {
                    sdVar.p();
                    return;
                }
                try {
                    ((h6.m) t0.j()).getLastLocation(new ld(sdVar, 0));
                    ((h6.m) t0.j()).requestLocationUpdates(sdVar.N, sdVar.r);
                    return;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    return;
                }
            case 4:
                qp qpVar = (qp) this.c;
                boolean z13 = this.b;
                qpVar.Q0 = null;
                qpVar.R0.clear();
                qpVar.getNotificationCenter().k(qs.O2, new Object[0]);
                if (z13) {
                    qpVar.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                fu fuVar = (fu) this.c;
                kv kvVar = fuVar.a;
                boolean z14 = !this.b;
                TLObject tLObject = fuVar.G;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z14;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z14;
                }
                View view = kvVar.Q;
                if (view != null) {
                    fuVar.r.a = view;
                }
                fuVar.r.f(-1, z14, true);
                View view2 = kvVar.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
        }
    }
}
