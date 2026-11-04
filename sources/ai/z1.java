package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import ci.b9;
import ci.c9;
import ci.e9;
import ci.mb;
import ci.s8;
import ci.tc;
import ci.v8;
import ci.xb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ip;
import org.telegram.ui.kq0;
import org.telegram.ui.nq;
import org.telegram.ui.oo0;
import org.telegram.ui.wm;
import org.telegram.ui.xp;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z1(ci.i0 i0Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, long j10, u10 u10Var) {
        this.a = 1;
        this.d = i0Var;
        this.e = s1Var;
        this.f = tLObject;
        this.b = j10;
        this.c = u10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0507, code lost:
    
        if (r3.collection_id.contains(java.lang.Integer.valueOf(r12.collection_id)) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a2, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.tr(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019f, code lost:
    
        if (r7 == null) goto L60;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String a02;
        SpannableStringBuilder spannableStringBuilder;
        int i3;
        int i10;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str;
        int i11 = 2;
        int i12 = 3;
        String str2 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.d;
                v8 v8Var = (v8) this.e;
                long j10 = this.b;
                u10 u10Var = (u10) this.c;
                Context context = (Context) this.f;
                e2 e2Var = b3Var.d2;
                int i15 = 0;
                while (i15 < i11) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i15 == i13) {
                        a02 = bd.M0(2131749971, str2);
                    } else {
                        Object[] objArr = new Object[i13];
                        objArr[i14] = b3Var.W1;
                        a02 = bd.a0(str2, str2, 2131749967, objArr);
                    }
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(a02));
                    spannableStringBuilder2.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    int i16 = i14;
                    HashSet hashSet2 = new HashSet();
                    int i17 = i16;
                    while (i17 < v8Var.l.size() && hashSet.size() < i12) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v8Var.l.get(i17);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            i10 = i17;
                        } else {
                            i10 = i17;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i17 = i10 + 1;
                        i12 = 3;
                    }
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        Object[] objArr2 = new Object[1];
                        objArr2[i16] = org.telegram.messenger.m5.t(j10);
                        spannableStringBuilder3.append((CharSequence) bd.a0(null, null, 2131749965, objArr2).replaceAll(" ", " "));
                        spannableStringBuilder3.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder3.append((CharSequence) "\u2060e");
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p5(document2, e2Var.getPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) " >");
                        spannableStringBuilder = spannableStringBuilder2;
                        i13 = 1;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(spannableStringBuilder3, new r1(b3Var, u10Var, j10, 0)), true));
                        i3 = i16;
                        str2 = null;
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                        i13 = 1;
                        str2 = null;
                        i3 = i16;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(bd.M0(2131749966, null), new s1(context, i3)), true));
                    }
                    e2 e2Var2 = i15 == 0 ? e2Var : b3Var.e2;
                    e2Var2.setText(spannableStringBuilder);
                    e2Var2.setMaxWidth(gi.l3.a(e2Var2.getText(), e2Var2.getPaint()));
                    i15++;
                    i14 = i3;
                    i11 = 2;
                    i12 = 3;
                }
                return;
            case 1:
                ci.i0 i0Var = (ci.i0) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j11 = this.b;
                u10 u10Var2 = (u10) this.c;
                i0Var.getClass();
                s1Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    hp.s1(i0Var.a).Y3(connectedstarrefbots.users, false);
                    while (i14 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i14).bot_id == j11 && !connectedstarrefbots.connected_bots.get(i14).revoked) {
                            u10Var2.a(connectedstarrefbots.connected_bots.get(i14));
                            return;
                        }
                        i14++;
                    }
                }
                u10Var2.a(null);
                return;
            case 2:
                ci.l6 l6Var = (ci.l6) this.d;
                sf.b bVar = (sf.b) this.e;
                TLObject tLObject2 = (TLObject) this.c;
                long j12 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                bVar.c(false);
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        l6Var.k().f0(tL_error, false);
                        return;
                    } else {
                        l6Var.k().t(bd.M0(2131743889, null), null).k(false);
                        return;
                    }
                }
                if (j12 >= 0) {
                    TLRPC.UserFull b22 = hp.s1(l6Var.a).b2(j12);
                    if (b22 != null) {
                        int max = Math.max(0, b22.stargifts_count - 1);
                        b22.stargifts_count = max;
                        if (max <= 0) {
                            b22.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull N0 = hp.s1(l6Var.a).N0(-j12);
                    if (N0 != null) {
                        int max2 = Math.max(0, N0.stargifts_count - 1);
                        N0.stargifts_count = max2;
                        if (max2 <= 0) {
                            N0.flags2 &= -262145;
                        }
                    }
                }
                if (l6Var.y2 != null) {
                    e9 y9 = e9.y(l6Var.a, false);
                    TL_stars.SavedStarGift savedStarGift2 = l6Var.y2;
                    if (savedStarGift2 != null) {
                        v8 G = y9.G(j12, false);
                        if (G != null) {
                            G.l(savedStarGift2);
                        }
                        s8 s8Var = (s8) y9.K.get(j12);
                        if (s8Var != null) {
                            ArrayList arrayList = s8Var.e;
                            int size = arrayList.size();
                            boolean z10 = false;
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj = arrayList.get(i18);
                                i18++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                v8 e10 = s8Var.e(tL_starGiftCollection.collection_id);
                                boolean z11 = e10 != null && e10.l(savedStarGift2);
                                if (!z11) {
                                    z10 = z10;
                                    break;
                                }
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z10 = true;
                                if (z11) {
                                    s8Var.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            v8 v8Var2 = s8Var.g;
                            if (v8Var2 != null) {
                                v8Var2.l(savedStarGift2);
                            }
                            if (z10) {
                                s8Var.j();
                                hs.f(s8Var.a).k(hs.H3, Long.valueOf(s8Var.b), s8Var);
                            }
                        }
                    }
                } else {
                    e9.y(l6Var.a, false).P(j12);
                }
                l6Var.dismiss();
                org.telegram.messenger.g0.h3(new y1(3));
                return;
            case 3:
                e9 e9Var = (e9) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                zi ziVar = (zi) this.c;
                long j13 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i19 = e9Var.a;
                if (!(tLObject3 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject3;
                hp.s1(i19).Y3(tL_messages_messages.users, false);
                hp.s1(i19).S3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    ziVar.k = tL_messages_messages.messages.get(0);
                    e9Var.j0(ziVar, j13, runnable, true);
                    return;
                }
            case 4:
                e9 e9Var2 = (e9) this.d;
                n10 n10Var = (n10) this.e;
                long j14 = this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (e9Var2.e) {
                    e9Var2.g(j14, tLObject4, tL_textWithEntities, n10Var);
                    return;
                } else {
                    e9.e("NO_BALANCE");
                    n10Var.a(Boolean.FALSE, null);
                    return;
                }
            case 5:
                e9 e9Var3 = (e9) this.d;
                n10 n10Var2 = (n10) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j15 = this.b;
                if (e9Var3.e) {
                    e9Var3.h(tL_payments_paymentFormStarGift, starGift2, j15, null, true, n10Var2);
                    return;
                } else {
                    e9.e("NO_BALANCE");
                    n10Var2.a(Boolean.FALSE, null);
                    return;
                }
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.c;
                long j16 = this.b;
                String str3 = (String) this.f;
                org.telegram.messenger.g0.i3(new p3(profileActivity, i11), 200L);
                fc a03 = fc.a0(profileActivity);
                TLRPC.Document document3 = starGift3.sticker;
                String M0 = bd.M0(2131745119, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.X2(bd.G((int) j16, "StarsGiftCompletedChannelText", str3));
                }
                a03.s(document3, M0, charSequence).k(false);
                return;
            case 7:
                c9 c9Var = (c9) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                hp hpVar = (hp) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                long j17 = this.b;
                c9Var.getClass();
                if (tLObject5 != null) {
                    Utilities.d.c(new ci.e0(16, hpVar, tLObject5));
                    return;
                }
                if (tL_error2 != null) {
                    c9Var.b.f((int) (-c9Var.h), c9Var.c(), c9Var.g);
                    hs.f(c9Var.q.a).k(hs.o1, Long.valueOf(zi.B0(c9Var.b.k)), Integer.valueOf(c9Var.b.f1()), c9Var.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (c9Var.a.a >= 0) {
                            str = l10.k(c9Var.c.getMessagesController().a2(Long.valueOf(c9Var.a.a)));
                        } else {
                            TLRPC.Chat M02 = c9Var.c.getMessagesController().M0(Long.valueOf(-c9Var.a.a));
                            str = M02 == null ? "" : M02.title;
                        }
                        String str4 = str;
                        Context parentActivity = c9Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.K1;
                        }
                        if (parentActivity == null) {
                            parentActivity = org.telegram.messenger.t0.b;
                        }
                        new mb(parentActivity, c9Var.c.getResourceProvider(), j17, 5, str4, new b9(c9Var, j17, i13), 0L).show();
                    }
                    c9Var.q.S(false);
                    c9Var.q.O();
                    return;
                }
                return;
            case 8:
                tc tcVar = (tc) this.d;
                long j18 = this.b;
                e9 e9Var4 = (e9) this.e;
                zi ziVar2 = (zi) this.c;
                wm wmVar = (wm) this.f;
                a1.c cVar = tcVar.J1;
                if (cVar == null) {
                    c9 b02 = e9Var4.b0(ziVar2, wmVar, j18, false, true, Long.valueOf(tcVar.w1));
                    if (b02 == null) {
                        return;
                    }
                    org.telegram.messenger.g0.h3(new ci.e0(18, tcVar, b02));
                    return;
                }
                int intValue = ((Integer) cVar.d(Long.valueOf(tcVar.w1), Long.valueOf(j18))).intValue();
                tcVar.I1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    tcVar.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new xb(tcVar, i14));
                    return;
                }
            case 9:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 10:
                nq nqVar = (nq) this.d;
                long j19 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str5 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.f;
                ip ipVar = new ip(j19, nqVar.N, null, nqVar.E, tL_chatBannedRights, str5, 1, true, false, null);
                ipVar.Y0 = new xp(nqVar, tLObject6);
                nqVar.presentFragment(ipVar);
                return;
            case 11:
                nq nqVar2 = (nq) this.d;
                long j20 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str6 = (String) this.c;
                TLObject tLObject7 = (TLObject) this.f;
                ip ipVar2 = new ip(j20, nqVar2.N, tL_chatAdminRights, null, null, str6, 0, true, false, null);
                ipVar2.Y0 = new yp(nqVar2, tLObject7);
                nqVar2.presentFragment(ipVar2);
                return;
            case 12:
                ur urVar = (ur) this.d;
                qr qrVar = (qr) this.e;
                ArrayList arrayList2 = (ArrayList) this.c;
                long j21 = this.b;
                String str7 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i14 < arrayList2.size()) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList2.get(i14)).longValue());
                            sQLitePreparedStatement.bindLong(2, j21);
                            sQLitePreparedStatement.bindString(3, str7);
                            sQLitePreparedStatement.bindInteger(4, i14);
                            sQLitePreparedStatement.step();
                            i14++;
                        }
                        break;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    break;
                }
            case 13:
                ur urVar2 = (ur) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                long j22 = this.b;
                String str8 = (String) this.c;
                tr trVar = (tr) this.f;
                hp.s1(urVar2.a).Y3(arrayList3, true);
                urVar2.h.addAll(arrayList3);
                urVar2.f = j22;
                urVar2.g = str8;
                urVar2.e = TextUtils.isEmpty(str8);
                urVar2.d = true;
                trVar.run();
                return;
            case 14:
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                long j23 = this.b;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.c;
                ir irVar = (ir) this.f;
                try {
                    s1Var2.dismiss();
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                if (tLObject8 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject8;
                    o60.A1 = joinaspeers.peers;
                    o60.C1 = j23;
                    o60.B1 = SystemClock.elapsedRealtime();
                    int i20 = cVar2.a;
                    o60.D1 = i20;
                    hp.s1(i20).S3(joinaspeers.chats, false);
                    hp.s1(cVar2.a).Y3(joinaspeers.users, false);
                    irVar.o(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ye yeVar = (ye) this.e;
                long j24 = this.b;
                String str9 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (yeVar.g != null) {
                    try {
                        new File(yeVar.g).delete();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                yeVar.d = j24;
                yeVar.g = str9;
                yeVar.e = null;
                yeVar.f = null;
                photoViewer.r5.b.setLoading(false);
                kq0 kq0Var = photoViewer.d;
                if (kq0Var != null) {
                    kq0Var.X(photoViewer.Q4);
                }
                oo0 oo0Var = photoViewer.h1;
                if (oo0Var != null) {
                    oo0Var.setImage(bitmap);
                }
                photoViewer.h3(0);
                CheckBox checkBox = photoViewer.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList4 = (ArrayList) this.c;
                boolean[] zArr2 = (boolean[]) this.f;
                long j25 = this.b;
                RectF rectF = ProfileActivity.T6;
                zArr[0] = true;
                org.telegram.messenger.g0.r(profileActivity2.y5);
                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                    ((TL_stories.StoryItem) arrayList4.get(i21)).pinned = zArr2[i21];
                }
                profileActivity2.getMessagesController().P1().q0(j25, arrayList4, false);
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.c;
                org.telegram.utils.twidget.u uVar = (org.telegram.utils.twidget.u) this.f;
                long j26 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                uVar.a(3, null, j26);
                return;
        }
    }

    public /* synthetic */ z1(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = j10;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ z1(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j10;
        this.f = obj4;
    }

    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j10;
    }
}
