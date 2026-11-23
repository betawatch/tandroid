package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import di.fb;
import di.mc;
import di.qb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cq;
import org.telegram.ui.dq;
import org.telegram.ui.np;
import org.telegram.ui.rq;
import org.telegram.ui.uq0;
import org.telegram.ui.xo0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q2(di.e0 e0Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, w10 w10Var) {
        this.a = 1;
        this.d = e0Var;
        this.e = t1Var;
        this.f = tLObject;
        this.b = j3;
        this.c = w10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x04df, code lost:
    
        if (r3.collection_id.contains(java.lang.Integer.valueOf(r11.collection_id)) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a0, code lost:
    
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.fs(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019d, code lost:
    
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String a02;
        SpannableStringBuilder spannableStringBuilder;
        ?? r62;
        ?? r72;
        int i7;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str2;
        int i10 = 3;
        int i11 = 2;
        String str3 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.d;
                di.p8 p8Var = (di.p8) this.e;
                long j3 = this.b;
                w10 w10Var = (w10) this.c;
                Context context = (Context) this.f;
                w2 w2Var = p3Var.f2;
                int i14 = 0;
                while (i14 < i11) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i14 == i12) {
                        a02 = gd.N0(2131749946, str3);
                    } else {
                        Object[] objArr = new Object[i12];
                        objArr[i13] = p3Var.Z1;
                        a02 = gd.a0(str3, str3, 2131749942, objArr);
                    }
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.W2(a02));
                    String str4 = " ";
                    spannableStringBuilder2.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    int i15 = i13;
                    HashSet hashSet2 = new HashSet();
                    int i16 = i15;
                    while (i16 < p8Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) p8Var.l.get(i16);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str4;
                        } else {
                            str = str4;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i16++;
                        str4 = str;
                        i10 = 3;
                    }
                    String str5 = str4;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        Object[] objArr2 = new Object[1];
                        objArr2[i15] = org.telegram.messenger.n5.t(j3);
                        spannableStringBuilder3.append((CharSequence) gd.a0(null, null, 2131749940, objArr2).replaceAll(str5, " "));
                        spannableStringBuilder3.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder3.append((CharSequence) "\u2060e");
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.x5(document2, w2Var.getPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) " >");
                        spannableStringBuilder = spannableStringBuilder2;
                        r62 = true;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(spannableStringBuilder3, new s2(p3Var, w10Var, j3, 0)), true));
                        i7 = i15;
                        r72 = null;
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                        r62 = true;
                        r72 = null;
                        i7 = i15;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(gd.N0(2131749941, null), new h2(context, i7)), true));
                    }
                    w2 w2Var2 = i14 == 0 ? w2Var : p3Var.g2;
                    w2Var2.setText(spannableStringBuilder);
                    w2Var2.setMaxWidth(hi.u3.a(w2Var2.getText(), w2Var2.getPaint()));
                    i14++;
                    String str6 = r72;
                    i12 = r62;
                    str3 = str6;
                    i13 = i7;
                    i10 = 3;
                    i11 = 2;
                }
                return;
            case 1:
                di.e0 e0Var = (di.e0) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j10 = this.b;
                w10 w10Var2 = (w10) this.c;
                e0Var.getClass();
                t1Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    mp.u1(e0Var.a).f4(connectedstarrefbots.users, false);
                    while (i13 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i13).bot_id == j10 && !connectedstarrefbots.connected_bots.get(i13).revoked) {
                            w10Var2.a(connectedstarrefbots.connected_bots.get(i13));
                            return;
                        }
                        i13++;
                    }
                }
                w10Var2.a(null);
                return;
            case 2:
                di.f6 f6Var = (di.f6) this.d;
                vf.b bVar = (vf.b) this.e;
                TLObject tLObject2 = (TLObject) this.c;
                long j11 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                bVar.c(false);
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        f6Var.k().g0(tL_error, false);
                        return;
                    } else {
                        f6Var.k().t(gd.N0(2131743632, null), null).k(false);
                        return;
                    }
                }
                if (j11 >= 0) {
                    TLRPC.UserFull d2 = mp.u1(f6Var.a).d2(j11);
                    if (d2 != null) {
                        int max = Math.max(0, d2.stargifts_count - 1);
                        d2.stargifts_count = max;
                        if (max <= 0) {
                            d2.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull P0 = mp.u1(f6Var.a).P0(-j11);
                    if (P0 != null) {
                        int max2 = Math.max(0, P0.stargifts_count - 1);
                        P0.stargifts_count = max2;
                        if (max2 <= 0) {
                            P0.flags2 &= -262145;
                        }
                    }
                }
                if (f6Var.B2 != null) {
                    di.y8 y10 = di.y8.y(f6Var.a, false);
                    TL_stars.SavedStarGift savedStarGift2 = f6Var.B2;
                    if (savedStarGift2 != null) {
                        di.p8 G = y10.G(j11, false);
                        if (G != null) {
                            G.m(savedStarGift2);
                        }
                        di.n8 n8Var = (di.n8) y10.K.get(j11);
                        if (n8Var != null) {
                            ArrayList arrayList = n8Var.e;
                            int size = arrayList.size();
                            boolean z10 = false;
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj = arrayList.get(i17);
                                i17++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                di.p8 e10 = n8Var.e(tL_starGiftCollection.collection_id);
                                boolean z11 = e10 != null && e10.m(savedStarGift2);
                                if (!z11) {
                                    z10 = z10;
                                    break;
                                }
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z10 = true;
                                if (z11) {
                                    n8Var.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            di.p8 p8Var2 = n8Var.g;
                            if (p8Var2 != null) {
                                p8Var2.m(savedStarGift2);
                            }
                            if (z10) {
                                n8Var.j();
                                ks.f(n8Var.a).k(ks.J3, Long.valueOf(n8Var.b), n8Var);
                            }
                        }
                    }
                } else {
                    di.y8.y(f6Var.a, false).O(j11);
                }
                f6Var.dismiss();
                org.telegram.messenger.g0.g3(new ai.k(9));
                return;
            case 3:
                di.y8 y8Var = (di.y8) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                fj fjVar = (fj) this.c;
                long j12 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i18 = y8Var.a;
                if (!(tLObject3 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject3;
                mp.u1(i18).f4(tL_messages_messages.users, false);
                mp.u1(i18).Z3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    fjVar.k = tL_messages_messages.messages.get(0);
                    y8Var.j0(fjVar, j12, runnable, true);
                    return;
                }
            case 4:
                di.y8 y8Var2 = (di.y8) this.d;
                p10 p10Var = (p10) this.e;
                long j13 = this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (y8Var2.e) {
                    y8Var2.g(j13, tLObject4, tL_textWithEntities, p10Var);
                    return;
                } else {
                    di.y8.e("NO_BALANCE");
                    p10Var.a(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.c;
                long j14 = this.b;
                String str7 = (String) this.f;
                org.telegram.messenger.g0.h3(new r5(profileActivity, i11), 200L);
                kc b02 = kc.b0(profileActivity);
                TLRPC.Document document3 = starGift2.sticker;
                String N0 = gd.N0(2131744868, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.W2(gd.G((int) j14, "StarsGiftCompletedChannelText", str7));
                }
                b02.s(document3, N0, charSequence).k(false);
                return;
            case 6:
                di.w8 w8Var = (di.w8) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                mp mpVar = (mp) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                long j15 = this.b;
                w8Var.getClass();
                if (tLObject5 != null) {
                    Utilities.d.c(new di.f2(15, mpVar, tLObject5));
                    return;
                }
                if (tL_error2 != null) {
                    w8Var.b.f((int) (-w8Var.h), w8Var.c(), w8Var.g);
                    ks.f(w8Var.q.a).k(ks.o1, Long.valueOf(fj.B0(w8Var.b.k)), Integer.valueOf(w8Var.b.e1()), w8Var.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (w8Var.a.a >= 0) {
                            str2 = n10.l(w8Var.c.getMessagesController().c2(Long.valueOf(w8Var.a.a)));
                        } else {
                            TLRPC.Chat O0 = w8Var.c.getMessagesController().O0(Long.valueOf(-w8Var.a.a));
                            str2 = O0 == null ? "" : O0.title;
                        }
                        String str8 = str2;
                        Context parentActivity = w8Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.H1;
                        }
                        if (parentActivity == null) {
                            parentActivity = org.telegram.messenger.t0.b;
                        }
                        new fb(parentActivity, w8Var.c.getResourceProvider(), j15, 5, str8, new di.v8(w8Var, j15, i12), 0L).show();
                    }
                    w8Var.q.R(false);
                    w8Var.q.N();
                    return;
                }
                return;
            case 7:
                mc mcVar = (mc) this.d;
                long j16 = this.b;
                di.y8 y8Var3 = (di.y8) this.e;
                fj fjVar2 = (fj) this.c;
                bn bnVar = (bn) this.f;
                di.v6 v6Var = mcVar.M1;
                if (v6Var == null) {
                    di.w8 b03 = y8Var3.b0(fjVar2, bnVar, j16, false, true, Long.valueOf(mcVar.z1));
                    if (b03 == null) {
                        return;
                    }
                    org.telegram.messenger.g0.g3(new di.f2(17, mcVar, b03));
                    return;
                }
                int intValue = ((Integer) v6Var.d(Long.valueOf(mcVar.z1), Long.valueOf(j16))).intValue();
                mcVar.L1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    mcVar.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new qb(mcVar, i13));
                    return;
                }
            case 8:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 9:
                rq rqVar = (rq) this.d;
                long j17 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str9 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.f;
                np npVar = new np(j17, rqVar.N, null, rqVar.E, tL_chatBannedRights, str9, 1, true, false, null);
                npVar.Y0 = new cq(rqVar, tLObject6);
                rqVar.presentFragment(npVar);
                return;
            case 10:
                rq rqVar2 = (rq) this.d;
                long j18 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str10 = (String) this.c;
                TLObject tLObject7 = (TLObject) this.f;
                np npVar2 = new np(j18, rqVar2.N, tL_chatAdminRights, null, null, str10, 0, true, false, null);
                npVar2.Y0 = new dq(rqVar2, tLObject7);
                rqVar2.presentFragment(npVar2);
                return;
            case 11:
                gs gsVar = (gs) this.d;
                tr trVar = (tr) this.e;
                ArrayList arrayList2 = (ArrayList) this.c;
                long j19 = this.b;
                String str11 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = trVar.b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i13 < arrayList2.size()) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList2.get(i13)).longValue());
                            sQLitePreparedStatement.bindLong(2, j19);
                            sQLitePreparedStatement.bindString(3, str11);
                            sQLitePreparedStatement.bindInteger(4, i13);
                            sQLitePreparedStatement.step();
                            i13++;
                        }
                        break;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    break;
                }
            case 12:
                gs gsVar2 = (gs) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                long j20 = this.b;
                String str12 = (String) this.c;
                fs fsVar = (fs) this.f;
                mp.u1(gsVar2.a).f4(arrayList3, true);
                gsVar2.h.addAll(arrayList3);
                gsVar2.f = j20;
                gsVar2.g = str12;
                gsVar2.e = TextUtils.isEmpty(str12);
                gsVar2.d = true;
                fsVar.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                long j21 = this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                lr lrVar = (lr) this.f;
                try {
                    t1Var2.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject8 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject8;
                    f70.D1 = joinaspeers.peers;
                    f70.F1 = j21;
                    f70.E1 = SystemClock.elapsedRealtime();
                    int i19 = cVar.a;
                    f70.G1 = i19;
                    mp.u1(i19).Z3(joinaspeers.chats, false);
                    mp.u1(cVar.a).f4(joinaspeers.users, false);
                    lrVar.q(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ef efVar = (ef) this.e;
                long j22 = this.b;
                String str13 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (efVar.g != null) {
                    try {
                        new File(efVar.g).delete();
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                    }
                }
                efVar.d = j22;
                efVar.g = str13;
                efVar.e = null;
                efVar.f = null;
                photoViewer.q5.b.setLoading(false);
                uq0 uq0Var = photoViewer.d;
                if (uq0Var != null) {
                    uq0Var.X(photoViewer.P4);
                }
                xo0 xo0Var = photoViewer.h1;
                if (xo0Var != null) {
                    xo0Var.setImage(bitmap);
                }
                photoViewer.d3(0);
                CheckBox checkBox = photoViewer.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList4 = (ArrayList) this.c;
                boolean[] zArr2 = (boolean[]) this.f;
                long j23 = this.b;
                RectF rectF = ProfileActivity.Z6;
                zArr[0] = true;
                org.telegram.messenger.g0.r(profileActivity2.D5);
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    ((TL_stories.StoryItem) arrayList4.get(i20)).pinned = zArr2[i20];
                }
                profileActivity2.getMessagesController().R1().q0(j23, arrayList4, false);
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.c;
                org.telegram.utils.twidget.d1 d1Var = (org.telegram.utils.twidget.d1) this.f;
                long j24 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                d1Var.b(3, null, j24);
                return;
        }
    }

    public /* synthetic */ q2(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ q2(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ q2(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j3;
        this.f = obj4;
    }

    public /* synthetic */ q2(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j3;
    }
}
