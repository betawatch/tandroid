package bi;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f9(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        long j3 = this.c;
        int i10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ((yr) obj2).b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i11);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i10);
                                sQLitePreparedStatement.bindLong(4, j3);
                                sQLitePreparedStatement.bindInteger(5, i11);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 1:
                ((fi.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var = ((org.telegram.ui.ActionBar.v2[]) obj)[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                ea.y(i10, false).R();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                T.presentFragment(an.ra(j3));
                return;
            case 2:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (g4Var.H0 == 0) {
                    return;
                }
                g4Var.H0 = 0;
                g4Var.Z(false);
                if (tLObject != null) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    qp.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                    yr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    if (tL_contacts_resolvedPeer.users.isEmpty()) {
                        return;
                    }
                    g4Var.N(j3, tL_contacts_resolvedPeer.users.get(0));
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.n6) obj2).a(Float.valueOf(((int[]) obj)[0] / i10), Boolean.valueOf(System.currentTimeMillis() - j3 > 250));
                return;
            case 4:
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) obj2).getMessagesController().P1().b(i10, j3, (ArrayList) obj);
                return;
            case 5:
                rc.u uVar = (rc.u) obj;
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (!z0Var.c(uVar, i10)) {
                    z0Var.d("closing stale connected websocket; attempt=" + i10);
                    uVar.c();
                    return;
                }
                z0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j3) + " ms");
                org.telegram.ui.Wallet.w0 w0Var = z0Var.o;
                try {
                    JSONArray put = new JSONArray().put(z0Var.b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = z0Var.g + 1;
                    z0Var.g = i12;
                    sb2.append(i12);
                    z0Var.f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", z0Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    org.telegram.messenger.g0.r(w0Var);
                    org.telegram.messenger.g0.i3(w0Var, 30000L);
                    z0Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    z0Var.f("could not encode subscription");
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj2;
                e2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j10 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j10);
                e2Var.f.sendRequestTyped(tonconnectgetpending, new d3.b(1), new org.telegram.ui.Wallet.o1(e2Var, (l60) obj, j10, this.b, 0));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, (org.telegram.ui.ActionBar.f6) obj);
                String M0 = org.telegram.messenger.id.M0(2131743076, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131743074, org.telegram.ui.Wallet.m0.x(i10).m(j3, true)));
                jg.g.C(null, 2131743066, alertDialog$Builder, null);
                return;
        }
    }

    public /* synthetic */ f9(ProfileActivity profileActivity, long j3, int i7, ArrayList arrayList) {
        this.a = 4;
        this.d = profileActivity;
        this.c = j3;
        this.b = i7;
        this.e = arrayList;
    }

    public /* synthetic */ f9(org.telegram.ui.Wallet.e2 e2Var, long j3, l60 l60Var, int i7) {
        this.a = 6;
        this.d = e2Var;
        this.c = j3;
        this.e = l60Var;
        this.b = i7;
    }
}
