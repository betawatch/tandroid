package org.telegram.messenger.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kg.t1;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.k70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.es0;
import org.telegram.ui.hq0;
import org.telegram.ui.iq;
import org.telegram.ui.pr;
import org.telegram.ui.un;
import org.telegram.ui.yq;
import org.telegram.ui.zq;
import ph.l1;
import ph.q1;
import rh.b6;
import rh.c6;
import rh.e4;
import rh.e6;
import rh.i8;
import rh.u5;
import rh.v5;
import rh.x7;
import rh.y8;
import vh.p2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x06c1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        int i10;
        String a02;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str2;
        int i11 = 3;
        int i12 = 2;
        String str3 = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.c, (TLRPC.TL_error) this.e, (Runnable) this.f);
                return;
            case 1:
                pr prVar = (pr) this.d;
                long j10 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str4 = (String) this.f;
                TLObject tLObject = (TLObject) this.c;
                iq iqVar = new iq(j10, prVar.M, null, prVar.D, tL_chatBannedRights, str4, 1, true, false, null);
                iqVar.X0 = new yq(prVar, tLObject);
                prVar.presentFragment(iqVar);
                return;
            case 2:
                pr prVar2 = (pr) this.d;
                long j11 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str5 = (String) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                iq iqVar2 = new iq(j11, prVar2.M, tL_chatAdminRights, null, null, str5, 0, true, false, null);
                iqVar2.X0 = new zq(prVar2, tLObject2);
                prVar2.presentFragment(iqVar2);
                return;
            case 3:
                fs fsVar = (fs) this.d;
                hs hsVar = (hs) this.c;
                ArrayList arrayList = (ArrayList) this.e;
                long j12 = this.b;
                String str6 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                try {
                    sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                    sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                    while (i14 < arrayList.size()) {
                        try {
                            try {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i14)).longValue());
                                sQLitePreparedStatement.bindLong(2, j12);
                                sQLitePreparedStatement.bindString(3, str6);
                                sQLitePreparedStatement.bindInteger(4, i14);
                                sQLitePreparedStatement.step();
                                i14++;
                            } catch (Exception e) {
                                e = e;
                                i10 = 1;
                                f8.g(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                org.telegram.messenger.i0.g3(new es(fsVar, i10));
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    i10 = 1;
                } catch (Exception e7) {
                    e = e7;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                org.telegram.messenger.i0.g3(new es(fsVar, i10));
                return;
            case 4:
                fs fsVar2 = (fs) this.d;
                ArrayList arrayList2 = (ArrayList) this.c;
                long j13 = this.b;
                String str7 = (String) this.e;
                es esVar = (es) this.f;
                vp.r1(fsVar2.a).V3(arrayList2, true);
                fsVar2.h.addAll(arrayList2);
                fsVar2.f = j13;
                fsVar2.g = str7;
                fsVar2.e = TextUtils.isEmpty(str7);
                fsVar2.d = true;
                esVar.run();
                return;
            case 5:
                x1 x1Var = (x1) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j14 = this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.e;
                zr zrVar = (zr) this.f;
                try {
                    x1Var.dismiss();
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                if (tLObject3 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject3;
                    k70.z1 = joinaspeers.peers;
                    k70.B1 = j14;
                    k70.A1 = SystemClock.elapsedRealtime();
                    int i15 = cVar.a;
                    k70.C1 = i15;
                    vp.r1(i15).P3(joinaspeers.chats, false);
                    vp.r1(cVar.a).V3(joinaspeers.users, false);
                    zrVar.i(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ef efVar = (ef) this.c;
                long j15 = this.b;
                String str8 = (String) this.e;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (efVar.g != null) {
                    try {
                        new File(efVar.g).delete();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                }
                efVar.d = j15;
                efVar.g = str8;
                efVar.e = null;
                efVar.f = null;
                photoViewer.q5.b.setLoading(false);
                es0 es0Var = photoViewer.d;
                if (es0Var != null) {
                    es0Var.X(photoViewer.P4);
                }
                hq0 hq0Var = photoViewer.g1;
                if (hq0Var != null) {
                    hq0Var.setImage(bitmap);
                }
                photoViewer.h3(0);
                CheckBox checkBox = photoViewer.N0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                boolean[] zArr2 = (boolean[]) this.f;
                long j16 = this.b;
                RectF rectF = ProfileActivity.R6;
                zArr[0] = true;
                org.telegram.messenger.i0.r(profileActivity.x5);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    ((TL_stories.StoryItem) arrayList3.get(i16)).pinned = zArr2[i16];
                }
                profileActivity.getMessagesController().O1().q0(j16, arrayList3, false);
                return;
            case 8:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int[] iArr = (int[]) this.e;
                org.telegram.utils.twidget.w wVar = (org.telegram.utils.twidget.w) this.f;
                long j17 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                wVar.a(3, null, j17);
                return;
            case 9:
                l1 l1Var = (l1) this.d;
                v5 v5Var = (v5) this.c;
                long j18 = this.b;
                q20 q20Var = (q20) this.e;
                Context context = (Context) this.f;
                t1 t1Var = l1Var.c2;
                int i17 = 0;
                while (i17 < i12) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i17 == i13) {
                        a02 = cd.L0(2131749972, str3);
                    } else {
                        Object[] objArr = new Object[i13];
                        objArr[i14] = l1Var.V1;
                        a02 = cd.a0(str3, str3, 2131749968, objArr);
                    }
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(a02));
                    String str9 = " ";
                    spannableStringBuilder2.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    int i18 = i14;
                    HashSet hashSet2 = new HashSet();
                    int i19 = i18;
                    while (i19 < v5Var.l.size() && hashSet.size() < i11) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v5Var.l.get(i19);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str9;
                        } else {
                            str = str9;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i19++;
                        str9 = str;
                        i11 = 3;
                    }
                    String str10 = str9;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        Object[] objArr2 = new Object[1];
                        objArr2[i18] = o5.t(j18);
                        spannableStringBuilder3.append((CharSequence) cd.a0(null, null, 2131749966, objArr2).replaceAll(str10, " "));
                        spannableStringBuilder3.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder3.append((CharSequence) "\u2060e");
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o5(document2, t1Var.getPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) " >");
                        spannableStringBuilder = spannableStringBuilder2;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.k2(spannableStringBuilder3, new a3.i0(l1Var, q20Var, j18, 23)), true));
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.G2(org.telegram.messenger.i0.k2(cd.L0(2131749967, null), new ph.p0(context, i18)), true));
                    }
                    t1 t1Var2 = i17 == 0 ? t1Var : l1Var.d2;
                    t1Var2.setText(spannableStringBuilder);
                    t1Var2.setMaxWidth(p2.a(t1Var2.getText(), t1Var2.getPaint()));
                    i17++;
                    i11 = 3;
                    i12 = 2;
                    str3 = null;
                    i13 = 1;
                    i14 = 0;
                }
                return;
            case 10:
                rh.r rVar = (rh.r) this.d;
                x1 x1Var2 = (x1) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                long j19 = this.b;
                q20 q20Var2 = (q20) this.f;
                rVar.getClass();
                x1Var2.dismiss();
                if (tLObject4 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject4;
                    vp.r1(rVar.a).V3(connectedstarrefbots.users, false);
                    while (i14 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i14).bot_id == j19 && !connectedstarrefbots.connected_bots.get(i14).revoked) {
                            q20Var2.a(connectedstarrefbots.connected_bots.get(i14));
                            return;
                        }
                        i14++;
                    }
                }
                q20Var2.a(null);
                return;
            case 11:
                e4 e4Var = (e4) this.d;
                gf.e eVar = (gf.e) this.f;
                TLObject tLObject5 = (TLObject) this.c;
                long j20 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                eVar.c(false);
                if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        e4Var.k().f0(tL_error, false);
                        return;
                    } else {
                        e4Var.k().t(cd.L0(2131743904, null), null).k(false);
                        return;
                    }
                }
                if (j20 >= 0) {
                    TLRPC.UserFull a2 = vp.r1(e4Var.a).a2(j20);
                    if (a2 != null) {
                        int max = Math.max(0, a2.stargifts_count - 1);
                        a2.stargifts_count = max;
                        if (max <= 0) {
                            a2.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull M0 = vp.r1(e4Var.a).M0(-j20);
                    if (M0 != null) {
                        int max2 = Math.max(0, M0.stargifts_count - 1);
                        M0.stargifts_count = max2;
                        if (max2 <= 0) {
                            M0.flags2 &= -262145;
                        }
                    }
                }
                if (e4Var.x2 != null) {
                    e6 y3 = e6.y(e4Var.a, false);
                    TL_stars.SavedStarGift savedStarGift2 = e4Var.x2;
                    if (savedStarGift2 != null) {
                        v5 G = y3.G(j20, false);
                        if (G != null) {
                            G.l(savedStarGift2);
                        }
                        u5 u5Var = (u5) y3.K.get(j20);
                        if (u5Var != null) {
                            ArrayList arrayList4 = u5Var.e;
                            int size = arrayList4.size();
                            boolean z10 = false;
                            int i20 = 0;
                            while (i20 < size) {
                                Object obj = arrayList4.get(i20);
                                i20++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                v5 e12 = u5Var.e(tL_starGiftCollection.collection_id);
                                boolean z11 = e12 != null && e12.l(savedStarGift2);
                                if (z11 || savedStarGift2.collection_id.contains(Integer.valueOf(tL_starGiftCollection.collection_id))) {
                                    tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                    z10 = true;
                                }
                                if (z11) {
                                    u5Var.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            v5 v5Var2 = u5Var.g;
                            if (v5Var2 != null) {
                                v5Var2.l(savedStarGift2);
                            }
                            if (z10) {
                                u5Var.j();
                                zs.f(u5Var.a).k(zs.H3, Long.valueOf(u5Var.b), u5Var);
                            }
                        }
                    }
                } else {
                    e6.y(e4Var.a, false).P(j20);
                }
                e4Var.dismiss();
                org.telegram.messenger.i0.g3(new r5.a(i12));
                return;
            case 12:
                e6 e6Var = (e6) this.d;
                TLObject tLObject6 = (TLObject) this.c;
                jj jjVar = (jj) this.e;
                long j21 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i21 = e6Var.a;
                if (!(tLObject6 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject6;
                vp.r1(i21).V3(tL_messages_messages.users, false);
                vp.r1(i21).P3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    jjVar.k = tL_messages_messages.messages.get(0);
                    e6Var.j0(jjVar, j21, runnable, true);
                    return;
                }
            case 13:
                e6 e6Var2 = (e6) this.d;
                j20 j20Var = (j20) this.e;
                long j22 = this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (e6Var2.e) {
                    e6Var2.g(j22, tLObject7, tL_textWithEntities, j20Var);
                    return;
                } else {
                    e6.e("NO_BALANCE");
                    j20Var.a(Boolean.FALSE, null);
                    return;
                }
            case 14:
                e6 e6Var3 = (e6) this.d;
                j20 j20Var2 = (j20) this.c;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j23 = this.b;
                if (e6Var3.e) {
                    e6Var3.h(tL_payments_paymentFormStarGift, starGift2, j23, null, true, j20Var2);
                    return;
                } else {
                    e6.e("NO_BALANCE");
                    j20Var2.a(Boolean.FALSE, null);
                    return;
                }
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.c;
                CharSequence charSequence = (CharSequence) this.e;
                long j24 = this.b;
                String str11 = (String) this.f;
                org.telegram.messenger.i0.h3(new q1(profileActivity2, i12), 200L);
                cc a03 = cc.a0(profileActivity2);
                TLRPC.Document document3 = starGift3.sticker;
                String L0 = cd.L0(2131745127, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.i0.W2(cd.G((int) j24, "StarsGiftCompletedChannelText", str11));
                }
                a03.s(document3, L0, charSequence).k(false);
                return;
            case 16:
                c6 c6Var = (c6) this.d;
                TLObject tLObject8 = (TLObject) this.c;
                vp vpVar = (vp) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j25 = this.b;
                c6Var.getClass();
                if (tLObject8 != null) {
                    Utilities.d.c(new rh.o(15, vpVar, tLObject8));
                    return;
                }
                if (tL_error2 != null) {
                    c6Var.b.f((int) (-c6Var.h), c6Var.c(), c6Var.g);
                    zs.f(c6Var.q.a).k(zs.o1, Long.valueOf(jj.B0(c6Var.b.k)), Integer.valueOf(c6Var.b.f1()), c6Var.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (c6Var.a.a >= 0) {
                            str2 = h20.k(c6Var.c.getMessagesController().Z1(Long.valueOf(c6Var.a.a)));
                        } else {
                            TLRPC.Chat L02 = c6Var.c.getMessagesController().L0(Long.valueOf(-c6Var.a.a));
                            str2 = L02 == null ? "" : L02.title;
                        }
                        String str12 = str2;
                        Context parentActivity = c6Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.I1;
                        }
                        if (parentActivity == null) {
                            parentActivity = org.telegram.messenger.w0.b;
                        }
                        new x7(parentActivity, c6Var.c.getResourceProvider(), j25, 5, str12, new b6(c6Var, j25, i13), 0L).show();
                    }
                    c6Var.q.S(false);
                    c6Var.q.O();
                    return;
                }
                return;
            default:
                y8 y8Var = (y8) this.d;
                long j26 = this.b;
                e6 e6Var4 = (e6) this.c;
                jj jjVar2 = (jj) this.e;
                un unVar = (un) this.f;
                rh.d0 d0Var = y8Var.I1;
                if (d0Var == null) {
                    c6 b02 = e6Var4.b0(jjVar2, unVar, j26, false, true, Long.valueOf(y8Var.v1));
                    if (b02 == null) {
                        return;
                    }
                    org.telegram.messenger.i0.g3(new rh.o(17, y8Var, b02));
                    return;
                }
                int intValue = ((Integer) d0Var.d(Long.valueOf(y8Var.v1), Long.valueOf(j26))).intValue();
                y8Var.H1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    y8Var.dismiss();
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new i8(y8Var, i14));
                    return;
                }
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = j10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = j10;
        this.f = obj4;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j10;
    }

    public /* synthetic */ g(pr prVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = prVar;
        this.b = j10;
        this.e = tLObject;
        this.f = str;
        this.c = tLObject2;
    }

    public /* synthetic */ g(rh.r rVar, x1 x1Var, TLObject tLObject, long j10, q20 q20Var) {
        this.a = 10;
        this.d = rVar;
        this.e = x1Var;
        this.c = tLObject;
        this.b = j10;
        this.f = q20Var;
    }

    public /* synthetic */ g(e4 e4Var, gf.e eVar, TLObject tLObject, long j10, TLRPC.TL_error tL_error) {
        this.a = 11;
        this.d = e4Var;
        this.f = eVar;
        this.c = tLObject;
        this.b = j10;
        this.e = tL_error;
    }

    public /* synthetic */ g(c6 c6Var, TLObject tLObject, vp vpVar, TLRPC.TL_error tL_error, long j10) {
        this.a = 16;
        this.d = c6Var;
        this.c = tLObject;
        this.f = vpVar;
        this.e = tL_error;
        this.b = j10;
    }

    public /* synthetic */ g(e6 e6Var, j20 j20Var, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = 13;
        this.d = e6Var;
        this.e = j20Var;
        this.b = j10;
        this.c = tLObject;
        this.f = tL_textWithEntities;
    }
}
