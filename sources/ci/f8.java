package ci;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f60;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f8(int i3, int i10, long j10, Object obj, Object obj2) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        long j10 = this.c;
        int i10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ((qr) obj2).b;
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
                                sQLitePreparedStatement.bindLong(4, j10);
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
                ((gi.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.t2 t2Var = ((org.telegram.ui.ActionBar.t2[]) obj)[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                }
                e9.y(i10, false).R();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                T.presentFragment(wm.ra(j10));
                return;
            case 2:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (i4Var.I0 == 0) {
                    return;
                }
                i4Var.I0 = 0;
                i4Var.Z(false);
                if (tLObject != null) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    hp.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                    qr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    if (tL_contacts_resolvedPeer.users.isEmpty()) {
                        return;
                    }
                    i4Var.N(j10, tL_contacts_resolvedPeer.users.get(0));
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.o6) obj2).a(Float.valueOf(((int[]) obj)[0] / i10), Boolean.valueOf(System.currentTimeMillis() - j10 > 250));
                return;
            case 4:
                RectF rectF = ProfileActivity.T6;
                ((ProfileActivity) obj2).getMessagesController().P1().b(i10, j10, (ArrayList) obj);
                return;
            case 5:
                oc.u uVar = (oc.u) obj;
                org.telegram.ui.Wallet.x0 x0Var = ((org.telegram.ui.Wallet.w0) obj2).c;
                if (!x0Var.c(uVar, i10)) {
                    x0Var.d("closing stale connected websocket; attempt=" + i10);
                    uVar.c();
                    return;
                }
                x0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                org.telegram.ui.Wallet.u0 u0Var = x0Var.o;
                try {
                    JSONArray put = new JSONArray().put(x0Var.b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = x0Var.g + 1;
                    x0Var.g = i12;
                    sb2.append(i12);
                    x0Var.f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", x0Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    org.telegram.messenger.g0.r(u0Var);
                    org.telegram.messenger.g0.i3(u0Var, 30000L);
                    x0Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    x0Var.f("could not encode subscription");
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj2;
                c2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                c2Var.f.sendRequestTyped(tonconnectgetpending, new c3.b(1), new org.telegram.ui.Wallet.m1(c2Var, (f60) obj, j11, this.b, 0));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, (org.telegram.ui.ActionBar.e6) obj);
                String M0 = bd.M0(2131743083, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.W2(bd.V(null, null, 2131743081, org.telegram.ui.Wallet.k0.x(i10).m(j10, true)));
                k2.p1.B(null, 2131743073, alertDialog$Builder, null);
                return;
        }
    }

    public /* synthetic */ f8(ProfileActivity profileActivity, long j10, int i3, ArrayList arrayList) {
        this.a = 4;
        this.d = profileActivity;
        this.c = j10;
        this.b = i3;
        this.e = arrayList;
    }

    public /* synthetic */ f8(org.telegram.ui.Wallet.c2 c2Var, long j10, f60 f60Var, int i3) {
        this.a = 6;
        this.d = c2Var;
        this.c = j10;
        this.e = f60Var;
        this.b = i3;
    }
}
