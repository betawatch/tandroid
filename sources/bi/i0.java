package bi;

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
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.aq;
import org.telegram.ui.ea0;
import org.telegram.ui.kp;
import org.telegram.ui.oq;
import org.telegram.ui.uq0;
import org.telegram.ui.xo0;
import org.telegram.ui.zp;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i0(long j3, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = conferenceCall;
        this.c = j3;
        this.b = tLObject;
        this.e = tL_error;
        this.f = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x031a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i7;
        String a02;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        int i10 = 3;
        int i11 = 2;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        String str3 = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
                TLObject tLObject = (TLObject) this.b;
                long j3 = this.c;
                c20 c20Var = (c20) this.f;
                n0Var.getClass();
                u1Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    qp.s1(n0Var.a).Y3(connectedstarrefbots.users, false);
                    for (int i14 = 0; i14 < connectedstarrefbots.connected_bots.size(); i14++) {
                        if (connectedstarrefbots.connected_bots.get(i14).bot_id == j3 && !connectedstarrefbots.connected_bots.get(i14).revoked) {
                            c20Var.a(connectedstarrefbots.connected_bots.get(i14));
                            return;
                        }
                    }
                }
                c20Var.a(null);
                return;
            case 1:
                k7 k7Var = (k7) this.d;
                vf.b bVar = (vf.b) this.e;
                TLObject tLObject2 = (TLObject) this.b;
                long j10 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                bVar.c(false);
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        k7Var.k().f0(tL_error, false);
                        return;
                    } else {
                        k7Var.k().t(org.telegram.messenger.hd.M0(2131743880, null), null).k(false);
                        return;
                    }
                }
                if (j10 >= 0) {
                    TLRPC.UserFull b22 = qp.s1(k7Var.a).b2(j10);
                    if (b22 != null) {
                        int max = Math.max(0, b22.stargifts_count - 1);
                        b22.stargifts_count = max;
                        if (max <= 0) {
                            b22.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull N0 = qp.s1(k7Var.a).N0(-j10);
                    if (N0 != null) {
                        int max2 = Math.max(0, N0.stargifts_count - 1);
                        N0.stargifts_count = max2;
                        if (max2 <= 0) {
                            N0.flags2 &= -262145;
                        }
                    }
                }
                if (k7Var.x2 != null) {
                    ea y10 = ea.y(k7Var.a, false);
                    TL_stars.SavedStarGift savedStarGift = k7Var.x2;
                    if (savedStarGift != null) {
                        v9 G = y10.G(j10, false);
                        if (G != null) {
                            G.l(savedStarGift);
                        }
                        t9 t9Var = (t9) y10.K.get(j10);
                        if (t9Var != null) {
                            ArrayList arrayList = t9Var.e;
                            int size = arrayList.size();
                            boolean z9 = false;
                            int i15 = 0;
                            while (i15 < size) {
                                Object obj = arrayList.get(i15);
                                i15++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                v9 e10 = t9Var.e(tL_starGiftCollection.collection_id);
                                boolean z10 = e10 != null && e10.l(savedStarGift);
                                if (z10 || savedStarGift.collection_id.contains(Integer.valueOf(tL_starGiftCollection.collection_id))) {
                                    tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                    z9 = true;
                                }
                                if (z10) {
                                    t9Var.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            v9 v9Var = t9Var.g;
                            if (v9Var != null) {
                                v9Var.l(savedStarGift);
                            }
                            if (z9) {
                                t9Var.j();
                                qs.f(t9Var.a).k(qs.H3, Long.valueOf(t9Var.b), t9Var);
                            }
                        }
                    }
                } else {
                    ea.y(k7Var.a, false).P(j10);
                }
                k7Var.dismiss();
                org.telegram.messenger.g0.h3(new ai.m0(2));
                return;
            case 2:
                ea eaVar = (ea) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                ij ijVar = (ij) this.e;
                long j11 = this.c;
                Runnable runnable = (Runnable) this.f;
                int i16 = eaVar.a;
                if (!(tLObject3 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject3;
                qp.s1(i16).Y3(tL_messages_messages.users, false);
                qp.s1(i16).S3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    ijVar.k = tL_messages_messages.messages.get(0);
                    eaVar.j0(ijVar, j11, runnable, true);
                    return;
                }
            case 3:
                ea eaVar2 = (ea) this.d;
                v10 v10Var = (v10) this.e;
                long j12 = this.c;
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (eaVar2.e) {
                    eaVar2.g(j12, tLObject4, tL_textWithEntities, v10Var);
                    return;
                } else {
                    ea.e("NO_BALANCE");
                    v10Var.a(Boolean.FALSE, null);
                    return;
                }
            case 4:
                ea eaVar3 = (ea) this.d;
                v10 v10Var2 = (v10) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j13 = this.c;
                if (eaVar3.e) {
                    eaVar3.h(tL_payments_paymentFormStarGift, starGift2, j13, null, true, v10Var2);
                    return;
                } else {
                    ea.e("NO_BALANCE");
                    v10Var2.a(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.b;
                long j14 = this.c;
                String str4 = (String) this.f;
                org.telegram.messenger.g0.i3(new w8(profileActivity, 0), 200L);
                org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(profileActivity);
                TLRPC.Document document2 = starGift3.sticker;
                String M0 = org.telegram.messenger.hd.M0(2131745110, null);
                if (charSequence == null) {
                    charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) j14, "StarsGiftCompletedChannelText", str4));
                }
                a03.s(document2, M0, charSequence).k(false);
                return;
            case 6:
                ca caVar = (ca) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                qp qpVar = (qp) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                long j15 = this.c;
                caVar.getClass();
                if (tLObject5 != null) {
                    Utilities.d.c(new a4(9, qpVar, tLObject5));
                    return;
                }
                if (tL_error2 != null) {
                    caVar.b.f((int) (-caVar.h), caVar.c(), caVar.g);
                    qs.f(caVar.q.a).k(qs.o1, Long.valueOf(ij.B0(caVar.b.k)), Integer.valueOf(caVar.b.f1()), caVar.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (caVar.a.a >= 0) {
                            str = t10.k(caVar.c.getMessagesController().a2(Long.valueOf(caVar.a.a)));
                        } else {
                            TLRPC.Chat M02 = caVar.c.getMessagesController().M0(Long.valueOf(-caVar.a.a));
                            str = M02 == null ? "" : M02.title;
                        }
                        String str5 = str;
                        Context parentActivity = caVar.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.G1;
                        }
                        if (parentActivity == null) {
                            parentActivity = org.telegram.messenger.t0.b;
                        }
                        new tc(parentActivity, caVar.c.getResourceProvider(), j15, 5, str5, new ba(caVar, j15, 1), 0L).show();
                    }
                    caVar.q.S(false);
                    caVar.q.O();
                    return;
                }
                return;
            case 7:
                ce ceVar = (ce) this.d;
                long j16 = this.c;
                ea eaVar4 = (ea) this.e;
                ij ijVar2 = (ij) this.b;
                an anVar = (an) this.f;
                a1.c cVar = ceVar.I1;
                if (cVar == null) {
                    ca b02 = eaVar4.b0(ijVar2, anVar, j16, false, true, Long.valueOf(ceVar.v1));
                    if (b02 == null) {
                        return;
                    }
                    org.telegram.messenger.g0.h3(new a4(11, ceVar, b02));
                    return;
                }
                int intValue = ((Integer) cVar.d(Long.valueOf(ceVar.v1), Long.valueOf(j16))).intValue();
                ceVar.H1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    ceVar.dismiss();
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new ed(ceVar, 0));
                    return;
                }
            case 8:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.c, (TLObject) this.b, (TLRPC.TL_error) this.e, (Runnable) this.f);
                return;
            case 9:
                oq oqVar = (oq) this.d;
                long j17 = this.c;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str6 = (String) this.f;
                TLObject tLObject6 = (TLObject) this.b;
                kp kpVar = new kp(j17, oqVar.M, null, oqVar.D, tL_chatBannedRights, str6, 1, true, false, null);
                kpVar.X0 = new zp(oqVar, tLObject6);
                oqVar.presentFragment(kpVar);
                return;
            case 10:
                oq oqVar2 = (oq) this.d;
                long j18 = this.c;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str7 = (String) this.f;
                TLObject tLObject7 = (TLObject) this.b;
                kp kpVar2 = new kp(j18, oqVar2.M, tL_chatAdminRights, null, null, str7, 0, true, false, null);
                kpVar2.X0 = new aq(oqVar2, tLObject7);
                oqVar2.presentFragment(kpVar2);
                return;
            case 11:
                ur urVar = (ur) this.d;
                yr yrVar = (yr) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                long j19 = this.c;
                String str8 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            try {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, ((Long) arrayList2.get(i17)).longValue());
                                sQLitePreparedStatement.bindLong(2, j19);
                                sQLitePreparedStatement.bindString(3, str8);
                                sQLitePreparedStatement.bindInteger(4, i17);
                                sQLitePreparedStatement.step();
                            } catch (Exception e11) {
                                e = e11;
                                i7 = 1;
                                org.telegram.messenger.a8.g(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                org.telegram.messenger.g0.h3(new tr(urVar, i7));
                                return;
                            }
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        i7 = 1;
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement2 = null;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
                org.telegram.messenger.g0.h3(new tr(urVar, i7));
                return;
            case 12:
                ur urVar2 = (ur) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                long j20 = this.c;
                String str9 = (String) this.b;
                tr trVar = (tr) this.f;
                qp.s1(urVar2.a).Y3(arrayList3, true);
                urVar2.h.addAll(arrayList3);
                urVar2.f = j20;
                urVar2.g = str9;
                urVar2.e = TextUtils.isEmpty(str9);
                urVar2.d = true;
                trVar.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.e;
                TLObject tLObject8 = (TLObject) this.b;
                long j21 = this.c;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.d;
                qr qrVar = (qr) this.f;
                try {
                    u1Var2.dismiss();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tLObject8 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject8;
                    t60.z1 = joinaspeers.peers;
                    t60.B1 = j21;
                    t60.A1 = SystemClock.elapsedRealtime();
                    int i18 = cVar2.a;
                    t60.C1 = i18;
                    qp.s1(i18).S3(joinaspeers.chats, false);
                    qp.s1(cVar2.a).Y3(joinaspeers.users, false);
                    qrVar.k(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                gf gfVar = (gf) this.e;
                long j22 = this.c;
                String str10 = (String) this.b;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (gfVar.g != null) {
                    try {
                        new File(gfVar.g).delete();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                gfVar.d = j22;
                gfVar.g = str10;
                gfVar.e = null;
                gfVar.f = null;
                photoViewer.p5.b.setLoading(false);
                uq0 uq0Var = photoViewer.d;
                if (uq0Var != null) {
                    uq0Var.X(photoViewer.O4);
                }
                xo0 xo0Var = photoViewer.g1;
                if (xo0Var != null) {
                    xo0Var.setImage(bitmap);
                }
                photoViewer.b3(0);
                CheckBox checkBox = photoViewer.N0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList4 = (ArrayList) this.b;
                boolean[] zArr2 = (boolean[]) this.f;
                long j23 = this.c;
                RectF rectF = ProfileActivity.S6;
                zArr[0] = true;
                org.telegram.messenger.g0.r(profileActivity2.x5);
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    ((TL_stories.StoryItem) arrayList4.get(i19)).pinned = zArr2[i19];
                }
                profileActivity2.getMessagesController().P1().q0(j23, arrayList4, false);
                return;
            case 16:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.b;
                org.telegram.utils.twidget.u uVar = (org.telegram.utils.twidget.u) this.f;
                long j24 = this.c;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                uVar.a(3, null, j24);
                return;
            default:
                zh.h1 h1Var = (zh.h1) this.d;
                v9 v9Var2 = (v9) this.e;
                long j25 = this.c;
                c20 c20Var2 = (c20) this.f;
                Context context = (Context) this.b;
                org.telegram.ui.Components.jb jbVar = h1Var.c2;
                int i20 = 0;
                while (i20 < i11) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i20 == i12) {
                        a02 = org.telegram.messenger.hd.M0(2131749962, str3);
                    } else {
                        Object[] objArr = new Object[i12];
                        objArr[i13] = h1Var.V1;
                        a02 = org.telegram.messenger.hd.a0(str3, str3, 2131749958, objArr);
                    }
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.g0.X2(a02));
                    String str11 = " ";
                    spannableStringBuilder2.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    int i21 = i13;
                    HashSet hashSet2 = new HashSet();
                    int i22 = i21;
                    while (i22 < v9Var2.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) v9Var2.l.get(i22);
                        if (savedStarGift2 == null || (starGift = savedStarGift2.gift) == null || (document = starGift.getDocument()) == null) {
                            str2 = str11;
                        } else {
                            str2 = str11;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i22++;
                        str11 = str2;
                        i10 = 3;
                    }
                    String str12 = str11;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        Object[] objArr2 = new Object[1];
                        objArr2[i21] = org.telegram.messenger.m5.t(j25);
                        spannableStringBuilder3.append((CharSequence) org.telegram.messenger.hd.a0(null, null, 2131749956, objArr2).replaceAll(str12, " "));
                        spannableStringBuilder3.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document3 = (TLRPC.Document) it.next();
                            spannableStringBuilder3.append((CharSequence) "\u2060e");
                            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r5(document3, jbVar.getPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) " >");
                        spannableStringBuilder = spannableStringBuilder2;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(spannableStringBuilder3, new ea0(h1Var, c20Var2, j25, 4)), true));
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(org.telegram.messenger.hd.M0(2131749957, null), new pa(context, 12)), true));
                    }
                    org.telegram.ui.Components.jb jbVar2 = i20 == 0 ? jbVar : h1Var.d2;
                    jbVar2.setText(spannableStringBuilder);
                    jbVar2.setMaxWidth(fi.m3.a(jbVar2.getText(), jbVar2.getPaint()));
                    i20++;
                    i13 = i21;
                    i10 = 3;
                    i11 = 2;
                    str3 = null;
                    i12 = 1;
                }
                return;
        }
    }

    public /* synthetic */ i0(ca caVar, TLObject tLObject, qp qpVar, TLRPC.TL_error tL_error, long j3) {
        this.a = 6;
        this.d = caVar;
        this.b = tLObject;
        this.e = qpVar;
        this.f = tL_error;
        this.c = j3;
    }

    public /* synthetic */ i0(ea eaVar, TLObject tLObject, ij ijVar, long j3, Runnable runnable) {
        this.a = 2;
        this.d = eaVar;
        this.b = tLObject;
        this.e = ijVar;
        this.c = j3;
        this.f = runnable;
    }

    public /* synthetic */ i0(ce ceVar, long j3, ea eaVar, ij ijVar, an anVar) {
        this.a = 7;
        this.d = ceVar;
        this.c = j3;
        this.e = eaVar;
        this.b = ijVar;
        this.f = anVar;
    }

    public /* synthetic */ i0(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = j3;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = j3;
        this.f = obj4;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.c = j3;
    }

    public /* synthetic */ i0(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, long j3, org.telegram.messenger.c cVar, qr qrVar) {
        this.a = 13;
        this.e = u1Var;
        this.b = tLObject;
        this.c = j3;
        this.d = cVar;
        this.f = qrVar;
    }

    public /* synthetic */ i0(oq oqVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i7) {
        this.a = i7;
        this.d = oqVar;
        this.c = j3;
        this.e = tLObject;
        this.f = str;
        this.b = tLObject2;
    }

    public /* synthetic */ i0(zh.h1 h1Var, v9 v9Var, long j3, c20 c20Var, Context context) {
        this.a = 17;
        this.d = h1Var;
        this.e = v9Var;
        this.c = j3;
        this.f = c20Var;
        this.b = context;
    }
}
