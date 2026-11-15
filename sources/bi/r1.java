package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import di.cb;
import di.jc;
import di.k8;
import di.m8;
import di.nb;
import di.s8;
import di.t8;
import di.v8;
import di.z6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.bq;
import org.telegram.ui.cq;
import org.telegram.ui.mp;
import org.telegram.ui.qq;
import org.telegram.ui.sq0;
import org.telegram.ui.vo0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r1(di.e0 e0Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, z10 z10Var) {
        this.a = 1;
        this.d = e0Var;
        this.e = t1Var;
        this.f = tLObject;
        this.b = j3;
        this.c = z10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0505, code lost:
    
        if (r3.collection_id.contains(java.lang.Integer.valueOf(r11.collection_id)) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a1, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zr(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019e, code lost:
    
        if (r7 == null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String a02;
        SpannableStringBuilder spannableStringBuilder;
        int i7;
        ?? r82;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str2;
        int i10 = 3;
        int i11 = 2;
        String str3 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                s2 s2Var = (s2) this.d;
                m8 m8Var = (m8) this.e;
                long j3 = this.b;
                z10 z10Var = (z10) this.c;
                Context context = (Context) this.f;
                w1 w1Var = s2Var.g2;
                int i14 = 0;
                while (i14 < i11) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i14 == i13) {
                        a02 = hd.M0(2131749963, str3);
                    } else {
                        Object[] objArr = new Object[i13];
                        objArr[i12] = s2Var.Z1;
                        a02 = hd.a0(str3, str3, 2131749959, objArr);
                    }
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(a02));
                    String str4 = " ";
                    spannableStringBuilder2.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    int i15 = i12;
                    HashSet hashSet2 = new HashSet();
                    int i16 = i15;
                    while (i16 < m8Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m8Var.l.get(i16);
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
                        objArr2[i15] = org.telegram.messenger.m5.t(j3);
                        spannableStringBuilder3.append((CharSequence) hd.a0(null, null, 2131749957, objArr2).replaceAll(str5, " "));
                        spannableStringBuilder3.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder3.append((CharSequence) "\u2060e");
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p5(document2, w1Var.getPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) " >");
                        spannableStringBuilder = spannableStringBuilder2;
                        i7 = 1;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(spannableStringBuilder3, new m1(s2Var, z10Var, j3, 0)), true));
                        r82 = null;
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                        i7 = 1;
                        r82 = null;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(hd.M0(2131749958, null), new ai.a(context, i7)), true));
                    }
                    w1 w1Var2 = i14 == 0 ? w1Var : s2Var.h2;
                    w1Var2.setText(spannableStringBuilder);
                    w1Var2.setMaxWidth(hi.l3.a(w1Var2.getText(), w1Var2.getPaint()));
                    i14++;
                    i13 = i7;
                    str3 = r82;
                    i12 = i15;
                    i10 = 3;
                    i11 = 2;
                }
                return;
            case 1:
                di.e0 e0Var = (di.e0) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j10 = this.b;
                z10 z10Var2 = (z10) this.c;
                e0Var.getClass();
                t1Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    np.s1(e0Var.a).Y3(connectedstarrefbots.users, false);
                    for (int i17 = 0; i17 < connectedstarrefbots.connected_bots.size(); i17++) {
                        if (connectedstarrefbots.connected_bots.get(i17).bot_id == j10 && !connectedstarrefbots.connected_bots.get(i17).revoked) {
                            z10Var2.a(connectedstarrefbots.connected_bots.get(i17));
                            return;
                        }
                    }
                }
                z10Var2.a(null);
                return;
            case 2:
                di.c6 c6Var = (di.c6) this.d;
                vf.b bVar = (vf.b) this.e;
                TLObject tLObject2 = (TLObject) this.c;
                long j11 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                bVar.c(false);
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        c6Var.k().f0(tL_error, false);
                        return;
                    } else {
                        c6Var.k().t(hd.M0(2131743879, null), null).k(false);
                        return;
                    }
                }
                if (j11 >= 0) {
                    TLRPC.UserFull b22 = np.s1(c6Var.a).b2(j11);
                    if (b22 != null) {
                        int max = Math.max(0, b22.stargifts_count - 1);
                        b22.stargifts_count = max;
                        if (max <= 0) {
                            b22.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull N0 = np.s1(c6Var.a).N0(-j11);
                    if (N0 != null) {
                        int max2 = Math.max(0, N0.stargifts_count - 1);
                        N0.stargifts_count = max2;
                        if (max2 <= 0) {
                            N0.flags2 &= -262145;
                        }
                    }
                }
                if (c6Var.B2 != null) {
                    v8 y10 = v8.y(c6Var.a, false);
                    TL_stars.SavedStarGift savedStarGift2 = c6Var.B2;
                    if (savedStarGift2 != null) {
                        m8 G = y10.G(j11, false);
                        if (G != null) {
                            G.l(savedStarGift2);
                        }
                        k8 k8Var = (k8) y10.K.get(j11);
                        if (k8Var != null) {
                            ArrayList arrayList = k8Var.e;
                            int size = arrayList.size();
                            boolean z10 = false;
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj = arrayList.get(i18);
                                i18++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                m8 e10 = k8Var.e(tL_starGiftCollection.collection_id);
                                boolean z11 = e10 != null && e10.l(savedStarGift2);
                                if (!z11) {
                                    z10 = z10;
                                    break;
                                }
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z10 = true;
                                if (z11) {
                                    k8Var.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            m8 m8Var2 = k8Var.g;
                            if (m8Var2 != null) {
                                m8Var2.l(savedStarGift2);
                            }
                            if (z10) {
                                k8Var.j();
                                ns.f(k8Var.a).k(ns.H3, Long.valueOf(k8Var.b), k8Var);
                            }
                        }
                    }
                } else {
                    v8.y(c6Var.a, false).P(j11);
                }
                c6Var.dismiss();
                org.telegram.messenger.g0.h3(new ai.o(7));
                return;
            case 3:
                v8 v8Var = (v8) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                gj gjVar = (gj) this.c;
                long j12 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i19 = v8Var.a;
                if (!(tLObject3 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject3;
                np.s1(i19).Y3(tL_messages_messages.users, false);
                np.s1(i19).S3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    gjVar.k = tL_messages_messages.messages.get(0);
                    v8Var.j0(gjVar, j12, runnable, true);
                    return;
                }
            case 4:
                v8 v8Var2 = (v8) this.d;
                s10 s10Var = (s10) this.e;
                long j13 = this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (v8Var2.e) {
                    v8Var2.g(j13, tLObject4, tL_textWithEntities, s10Var);
                    return;
                } else {
                    v8.e("NO_BALANCE");
                    s10Var.a(Boolean.FALSE, null);
                    return;
                }
            case 5:
                v8 v8Var3 = (v8) this.d;
                s10 s10Var2 = (s10) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j14 = this.b;
                if (v8Var3.e) {
                    v8Var3.h(tL_payments_paymentFormStarGift, starGift2, j14, null, true, s10Var2);
                    return;
                } else {
                    v8.e("NO_BALANCE");
                    s10Var2.a(Boolean.FALSE, null);
                    return;
                }
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.c;
                long j15 = this.b;
                String str6 = (String) this.f;
                org.telegram.messenger.g0.i3(new e3(profileActivity, i11), 200L);
                cc a03 = cc.a0(profileActivity);
                TLRPC.Document document3 = starGift3.sticker;
                String M0 = hd.M0(2131745109, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.X2(hd.G((int) j15, "StarsGiftCompletedChannelText", str6));
                }
                a03.s(document3, M0, charSequence).k(false);
                return;
            case 7:
                t8 t8Var = (t8) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                np npVar = (np) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                long j16 = this.b;
                t8Var.getClass();
                if (tLObject5 != null) {
                    Utilities.d.c(new di.s2(11, npVar, tLObject5));
                    return;
                }
                if (tL_error2 != null) {
                    t8Var.b.f((int) (-t8Var.h), t8Var.c(), t8Var.g);
                    ns.f(t8Var.q.a).k(ns.o1, Long.valueOf(gj.B0(t8Var.b.k)), Integer.valueOf(t8Var.b.e1()), t8Var.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (t8Var.a.a >= 0) {
                            str2 = q10.k(t8Var.c.getMessagesController().a2(Long.valueOf(t8Var.a.a)));
                        } else {
                            TLRPC.Chat M02 = t8Var.c.getMessagesController().M0(Long.valueOf(-t8Var.a.a));
                            str2 = M02 == null ? "" : M02.title;
                        }
                        String str7 = str2;
                        Context parentActivity = t8Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.H1;
                        }
                        if (parentActivity == null) {
                            parentActivity = org.telegram.messenger.t0.b;
                        }
                        new cb(parentActivity, t8Var.c.getResourceProvider(), j16, 5, str7, new s8(t8Var, j16, i13), 0L).show();
                    }
                    t8Var.q.S(false);
                    t8Var.q.O();
                    return;
                }
                return;
            case 8:
                jc jcVar = (jc) this.d;
                long j17 = this.b;
                v8 v8Var4 = (v8) this.e;
                gj gjVar2 = (gj) this.c;
                an anVar = (an) this.f;
                z6 z6Var = jcVar.M1;
                if (z6Var == null) {
                    t8 b02 = v8Var4.b0(gjVar2, anVar, j17, false, true, Long.valueOf(jcVar.z1));
                    if (b02 == null) {
                        return;
                    }
                    org.telegram.messenger.g0.h3(new di.s2(13, jcVar, b02));
                    return;
                }
                int intValue = ((Integer) z6Var.d(Long.valueOf(jcVar.z1), Long.valueOf(j17))).intValue();
                jcVar.L1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    jcVar.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new nb(jcVar, i12));
                    return;
                }
            case 9:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 10:
                qq qqVar = (qq) this.d;
                long j18 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str8 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.f;
                mp mpVar = new mp(j18, qqVar.N, null, qqVar.E, tL_chatBannedRights, str8, 1, true, false, null);
                mpVar.Y0 = new bq(qqVar, tLObject6);
                qqVar.presentFragment(mpVar);
                return;
            case 11:
                qq qqVar2 = (qq) this.d;
                long j19 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str9 = (String) this.c;
                TLObject tLObject7 = (TLObject) this.f;
                mp mpVar2 = new mp(j19, qqVar2.N, tL_chatAdminRights, null, null, str9, 0, true, false, null);
                mpVar2.Y0 = new cq(qqVar2, tLObject7);
                qqVar2.presentFragment(mpVar2);
                return;
            case 12:
                as asVar = (as) this.d;
                vr vrVar = (vr) this.e;
                ArrayList arrayList2 = (ArrayList) this.c;
                long j20 = this.b;
                String str10 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = vrVar.b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList2.get(i20)).longValue());
                            sQLitePreparedStatement.bindLong(2, j20);
                            sQLitePreparedStatement.bindString(3, str10);
                            sQLitePreparedStatement.bindInteger(4, i20);
                            sQLitePreparedStatement.step();
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
                as asVar2 = (as) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                long j21 = this.b;
                String str11 = (String) this.c;
                zr zrVar = (zr) this.f;
                np.s1(asVar2.a).Y3(arrayList3, true);
                asVar2.h.addAll(arrayList3);
                asVar2.f = j21;
                asVar2.g = str11;
                asVar2.e = TextUtils.isEmpty(str11);
                asVar2.d = true;
                zrVar.run();
                return;
            case 14:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                long j22 = this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                nr nrVar = (nr) this.f;
                try {
                    t1Var2.dismiss();
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                if (tLObject8 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject8;
                    v60.D1 = joinaspeers.peers;
                    v60.F1 = j22;
                    v60.E1 = SystemClock.elapsedRealtime();
                    int i21 = cVar.a;
                    v60.G1 = i21;
                    np.s1(i21).S3(joinaspeers.chats, false);
                    np.s1(cVar.a).Y3(joinaspeers.users, false);
                    nrVar.j(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ff ffVar = (ff) this.e;
                long j23 = this.b;
                String str12 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (ffVar.g != null) {
                    try {
                        new File(ffVar.g).delete();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                ffVar.d = j23;
                ffVar.g = str12;
                ffVar.e = null;
                ffVar.f = null;
                photoViewer.q5.b.setLoading(false);
                sq0 sq0Var = photoViewer.d;
                if (sq0Var != null) {
                    sq0Var.X(photoViewer.P4);
                }
                vo0 vo0Var = photoViewer.h1;
                if (vo0Var != null) {
                    vo0Var.setImage(bitmap);
                }
                photoViewer.c3(0);
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
                long j24 = this.b;
                RectF rectF = ProfileActivity.X6;
                zArr[0] = true;
                org.telegram.messenger.g0.r(profileActivity2.B5);
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    ((TL_stories.StoryItem) arrayList4.get(i22)).pinned = zArr2[i22];
                }
                profileActivity2.getMessagesController().P1().q0(j24, arrayList4, false);
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.c;
                org.telegram.utils.twidget.y0 y0Var = (org.telegram.utils.twidget.y0) this.f;
                long j25 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                y0Var.b(3, null, j25);
                return;
        }
    }

    public /* synthetic */ r1(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ r1(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j3;
        this.f = obj4;
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j3;
    }
}
