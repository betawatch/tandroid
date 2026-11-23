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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class h10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h10(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i10 i10Var = (i10) this.c;
                boolean z10 = this.b;
                if (i10Var.b) {
                    synchronized (i10Var.a) {
                        try {
                            try {
                                SharedPreferences.Editor edit = i10Var.k().edit();
                                if (i10Var.currentAccount == 0) {
                                    edit.putInt("selectedAccount", i10.t0);
                                }
                                edit.putBoolean("registeredForPush", i10Var.d);
                                edit.putInt("lastSendMessageId", i10Var.e);
                                edit.putInt("contactsSavedCount", i10Var.h);
                                edit.putInt("lastBroadcastId", i10Var.f);
                                edit.putInt("lastContactsSyncTime", i10Var.r);
                                edit.putInt("lastHintsSyncTime", i10Var.s);
                                edit.putBoolean("draftsLoaded", i10Var.w);
                                edit.putBoolean("unreadDialogsLoaded", i10Var.x);
                                edit.putInt("ratingLoadTime", i10Var.E);
                                edit.putInt("botRatingLoadTime", i10Var.F);
                                edit.putInt("botGuestRatingLoadTime", i10Var.G);
                                edit.putInt("webappRatingLoadTime", i10Var.H);
                                edit.putBoolean("contactsReimported", i10Var.I);
                                edit.putInt("loginTime", i10Var.Z);
                                edit.putBoolean("syncContacts", i10Var.V);
                                edit.putBoolean("showCallsTab", i10Var.X);
                                edit.putBoolean("suggestContacts", i10Var.W);
                                edit.putBoolean("hasSecureData", i10Var.Y);
                                edit.putBoolean("notificationsSettingsLoaded4", i10Var.T);
                                edit.putBoolean("notificationsSignUpSettingsLoaded", i10Var.U);
                                edit.putLong("autoDownloadConfigLoadTime", i10Var.b0);
                                edit.putBoolean("hasValidDialogLoadIds", i10Var.J);
                                edit.putInt("sharingMyLocationUntil", i10Var.R);
                                edit.putInt("lastMyLocationShareTime", i10Var.S);
                                edit.putBoolean("filtersLoaded", i10Var.Q);
                                edit.putString("premiumGiftsStickerPack", i10Var.c0);
                                edit.putLong("lastUpdatedPremiumGiftsStickerPack", i10Var.g0);
                                edit.putString("genericAnimationsStickerPack", i10Var.e0);
                                edit.putLong("lastUpdatedGenericAnimations", i10Var.i0);
                                edit.putInt("6migrateOffsetId", i10Var.K);
                                if (i10Var.K != -1) {
                                    edit.putInt("6migrateOffsetDate", i10Var.L);
                                    edit.putLong("6migrateOffsetUserId", i10Var.M);
                                    edit.putLong("6migrateOffsetChatId", i10Var.N);
                                    edit.putLong("6migrateOffsetChannelId", i10Var.O);
                                    edit.putLong("6migrateOffsetAccess", i10Var.P);
                                }
                                TLRPC.TL_help_termsOfService tL_help_termsOfService = i10Var.a0;
                                if (tL_help_termsOfService != null) {
                                    try {
                                        SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                        i10Var.a0.serializeToStream(serializedData);
                                        edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                        serializedData.cleanup();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    edit.remove("terms");
                                }
                                bz.y();
                                if (i10Var.y != null) {
                                    SerializedData serializedData2 = new SerializedData();
                                    i10Var.y.serializeToStream(serializedData2);
                                    edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                    serializedData2.cleanup();
                                } else {
                                    edit.remove("tmpPassword");
                                }
                                if (i10Var.c == null) {
                                    edit.remove("user");
                                } else if (z10) {
                                    SerializedData serializedData3 = new SerializedData();
                                    i10Var.c.serializeToStream(serializedData3);
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
                    x8 x8Var = (x8) ((Map.Entry) it.next()).getValue();
                    if (x8Var.m == 1) {
                        Utilities.d.c(new h10(2, x8Var, z11));
                        g0.g3(new t8(x8Var, 2));
                    }
                }
                Iterator it2 = w7Var.n.entrySet().iterator();
                while (it2.hasNext()) {
                    x8 x8Var2 = (x8) ((Map.Entry) it2.next()).getValue();
                    if (x8Var2.m == 1) {
                        Utilities.d.c(new h10(2, x8Var2, z11));
                        g0.g3(new t8(x8Var2, 2));
                    }
                }
                return;
            case 2:
                x8 x8Var3 = (x8) this.c;
                boolean z12 = this.b;
                SparseIntArray sparseIntArray = x8Var3.p;
                if (x8Var3.i == z12) {
                    return;
                }
                x8Var3.i = z12;
                if (s2.a) {
                    a8.b("network changed to slow = " + x8Var3.i);
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= sparseIntArray.size()) {
                        sparseIntArray.clear();
                        x8Var3.b();
                        x8Var3.b = false;
                        x8Var3.c = false;
                        x8Var3.k = 0;
                        x8Var3.r = 0;
                        x8Var3.v = 0L;
                        x8Var3.w = 0L;
                        x8Var3.x = 0;
                        x8Var3.y = null;
                        x8Var3.z = null;
                        x8Var3.A = null;
                        x8Var3.K = 0;
                        Arrays.fill(x8Var3.g, 0);
                        x8Var3.N = 0;
                        x8Var3.P = false;
                        x8Var3.Q.clear();
                        x8Var3.d++;
                        int i10 = x8Var3.i ? 1 : 8;
                        for (int i11 = 0; i11 < i10; i11++) {
                            x8Var3.d();
                        }
                        return;
                    }
                    ConnectionsManager.getInstance(x8Var3.a).cancelRequest(sparseIntArray.valueAt(i7), true);
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
