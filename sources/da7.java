// default package

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImportingService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class da7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ da7(hxa hxaVar, TLObject tLObject, uc7 uc7Var, TLRPC.TL_error tL_error, long j) {
        this.a = (byte) 20;
        this.e = hxaVar;
        this.c = tLObject;
        this.d = uc7Var;
        this.f = tL_error;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196 A[LOOP:4: B:85:0x0190->B:87:0x0196, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        int i2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i3;
        int i4;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i5;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        a5c a5cVar = (a5c) this.d;
        u4c u4cVar = (u4c) this.e;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        long j = this.b;
        synchronized (a5cVar) {
            arrayList = u4cVar.b;
            arrayList2 = u4cVar.d;
            arrayList3 = u4cVar.c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList4 = ((TLRPC.TL_messages_translateResult) tLObject).result;
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList3.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                int i8 = i7 + 1;
                Pair pair = (Pair) obj;
                x4c x4cVar = (x4c) pair.first;
                x4c x4cVar2 = (x4c) pair.second;
                x4c x4cVar3 = new x4c();
                if (x4cVar2 != null && (tL_textWithEntities5 = x4cVar2.a) != null) {
                    x4cVar3.a = tL_textWithEntities5;
                } else if (x4cVar.a != null) {
                    if (i6 >= arrayList4.size()) {
                        tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    } else {
                        tL_textWithEntities = arrayList4.get(i6);
                        i6++;
                    }
                    x4cVar3.a = r3c.M0(x4cVar.a, tL_textWithEntities);
                }
                if (x4cVar.b.size() != (x4cVar2 == null ? 0 : x4cVar2.b.size())) {
                    ArrayList arrayList6 = x4cVar.b;
                    int size2 = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj2 = arrayList6.get(i9);
                        i9++;
                        int i10 = size;
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) obj2;
                        int i11 = i8;
                        if (i6 >= arrayList4.size()) {
                            tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                            i5 = i6;
                        } else {
                            i5 = i6 + 1;
                            tL_textWithEntities4 = arrayList4.get(i6);
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        tL_pollAnswer.text = tL_textWithEntities4;
                        tL_pollAnswer.option = pollAnswer.option;
                        x4cVar3.b.add(tL_pollAnswer);
                        i8 = i11;
                        size = i10;
                        i6 = i5;
                    }
                    i3 = size;
                    i4 = i8;
                } else {
                    i3 = size;
                    i4 = i8;
                    if (x4cVar2 != null) {
                        x4cVar3.b = x4cVar2.b;
                    }
                }
                if (x4cVar2 != null && (tL_textWithEntities3 = x4cVar2.c) != null) {
                    x4cVar3.c = tL_textWithEntities3;
                } else if (x4cVar.c != null) {
                    if (i6 >= arrayList4.size()) {
                        tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    } else {
                        int i12 = i6 + 1;
                        TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList4.get(i6);
                        i6 = i12;
                        tL_textWithEntities2 = tL_textWithEntities6;
                    }
                    x4cVar3.c = r3c.M0(x4cVar.c, tL_textWithEntities2);
                }
                arrayList5.add(x4cVar3);
                i7 = i4;
                size = i3;
            }
            int min = Math.min(arrayList2.size(), arrayList5.size());
            for (int i13 = 0; i13 < min; i13++) {
                ((kcc) arrayList2.get(i13)).a((Integer) arrayList.get(i13), (x4c) arrayList5.get(i13), u4cVar.e);
            }
        } else {
            if (tL_error != null) {
                if ("TO_LANG_INVALID".equals(tL_error.text)) {
                    a5cVar.K(j, false);
                    jn7.e().k(jn7.S4, 1, ob6.M0(2131743601, null));
                } else if ("QUOTA_EXCEEDED".equals(tL_error.text)) {
                    i = 0;
                    jn7.e().k(jn7.S4, 1, ob6.M0(2131743602, null));
                    for (i2 = i; i2 < arrayList2.size(); i2++) {
                        ((kcc) arrayList2.get(i2)).a((Integer) arrayList.get(i2), null, u4cVar.e);
                    }
                    synchronized (a5cVar) {
                        for (int i14 = i; i14 < arrayList.size(); i14++) {
                            a5cVar.x.remove(arrayList.get(i14));
                        }
                    }
                    return;
                }
            }
            i = 0;
            while (i2 < arrayList2.size()) {
            }
            synchronized (a5cVar) {
            }
        }
        i = 0;
        synchronized (a5cVar) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:193|(6:194|195|196|197|(1:(2:283|284)(3:199|(3:280|281|282)(5:201|202|(1:204)|205|(4:210|211|212|(4:213|214|215|(4:217|218|219|221)(2:271|272)))(2:207|208))|209))|273)|(3:274|275|276)|233|234) */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03a8, code lost:
    
        if (r2.collection_id.contains(java.lang.Integer.valueOf(r10.collection_id)) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0583, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0584, code lost:
    
        cc4.g(r0, r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x09f3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z;
        byte b;
        axa axaVar;
        int i;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        ArrayList arrayList;
        int i2;
        String str;
        boolean z2;
        ZipInputStream zipInputStream;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i3 = 3;
        String str3 = null;
        byte b2 = 1;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) this.e;
                pcc pccVar = (pcc) this.c;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f;
                long j = this.b;
                uc7Var.j4(updates.users, false);
                uc7Var.c4(updates.chats, false);
                if (pccVar != null) {
                    pccVar.a(tL_messages_invitedUsers);
                    return;
                } else {
                    jj.f(uc7Var.currentAccount, uc7Var.M0(Long.valueOf(j)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                kt0 kt0Var = (kt0) this.d;
                id idVar = (id) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j2 = this.b;
                pcc pccVar2 = (pcc) this.c;
                idVar.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    uc7.s1(kt0Var.a).j4(connectedstarrefbots.users, false);
                    for (int i4 = 0; i4 < connectedstarrefbots.connected_bots.size(); i4++) {
                        if (connectedstarrefbots.connected_bots.get(i4).bot_id == j2 && !connectedstarrefbots.connected_bots.get(i4).revoked) {
                            pccVar2.a(connectedstarrefbots.connected_bots.get(i4));
                            return;
                        }
                    }
                }
                pccVar2.a(null);
                return;
            case 2:
                bg2 bg2Var = (bg2) this.d;
                long j3 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str4 = (String) this.c;
                TLObject tLObject2 = (TLObject) this.f;
                pd2 pd2Var = new pd2(j3, bg2Var.N, null, bg2Var.E, tL_chatBannedRights, str4, 1, true, false, null);
                pd2Var.Y0 = new mf2(bg2Var, tLObject2);
                bg2Var.presentFragment(pd2Var);
                return;
            case 3:
                bg2 bg2Var2 = (bg2) this.d;
                long j4 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str5 = (String) this.c;
                TLObject tLObject3 = (TLObject) this.f;
                pd2 pd2Var2 = new pd2(j4, bg2Var2.N, tL_chatAdminRights, null, null, str5, 0, true, false, null);
                pd2Var2.Y0 = new nf2(bg2Var2, tLObject3);
                bg2Var2.presentFragment(pd2Var2);
                return;
            case 4:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 5:
                mk3 mk3Var = (mk3) this.d;
                jf7 jf7Var = (jf7) this.e;
                ArrayList arrayList4 = (ArrayList) this.c;
                long j5 = this.b;
                String str6 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                try {
                    sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        try {
                            executeFast.requery();
                            executeFast.bindLong(1, ((Long) arrayList4.get(i5)).longValue());
                            executeFast.bindLong(2, j5);
                            executeFast.bindString(3, str6);
                            executeFast.bindInteger(4, i5);
                            executeFast.step();
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            z = true;
                            try {
                                cc4.g(e, z);
                                b = z;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    b = z;
                                }
                                hl.c3(new lk3(mk3Var, b));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLitePreparedStatement = executeFast;
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    if (executeFast != null) {
                        executeFast.dispose();
                    }
                    b = 1;
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                }
                hl.c3(new lk3(mk3Var, b));
                return;
            case 6:
                mk3 mk3Var2 = (mk3) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                long j6 = this.b;
                String str7 = (String) this.c;
                lk3 lk3Var = (lk3) this.f;
                uc7.s1(mk3Var2.a).j4(arrayList5, true);
                mk3Var2.h.addAll(arrayList5);
                mk3Var2.f = j6;
                mk3Var2.g = str7;
                mk3Var2.e = TextUtils.isEmpty(str7);
                mk3Var2.d = true;
                lk3Var.run();
                return;
            case 7:
                yx4 yx4Var = (yx4) this.d;
                axa axaVar2 = (axa) this.e;
                long j7 = this.b;
                pcc pccVar3 = (pcc) this.c;
                Context context = (Context) this.f;
                b21 b21Var = yx4Var.e2;
                int i6 = 0;
                while (i6 < 2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hl.S2(i6 == 1 ? ob6.M0(2131749909, str3) : ob6.a0(str3, str3, 2131749905, yx4Var.Y1)));
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    int i7 = 0;
                    while (i7 < axaVar2.l.size() && hashSet.size() < i3) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) axaVar2.l.get(i7);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            i = i7;
                        } else {
                            i = i7;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i7 = i + 1;
                        i3 = 3;
                    }
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) ob6.a0(null, null, 2131749903, wf3.s(j7)).replaceAll(" ", " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new hm(document2, b21Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            axaVar2 = axaVar2;
                        }
                        axaVar = axaVar2;
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append((CharSequence) hl.D2(hl.i2(spannableStringBuilder2, new ue2(yx4Var, pccVar3, j7, (byte) 23)), true));
                    } else {
                        axaVar = axaVar2;
                        spannableStringBuilder.append((CharSequence) hl.D2(hl.i2(ob6.M0(2131749904, null), new xf1(context, (byte) 2)), true));
                    }
                    b21 b21Var2 = i6 == 0 ? b21Var : yx4Var.f2;
                    b21Var2.setText(spannableStringBuilder);
                    b21Var2.setMaxWidth(kg5.a(b21Var2.getText(), b21Var2.getPaint()));
                    i6++;
                    axaVar2 = axaVar;
                    i3 = 3;
                    str3 = null;
                }
                return;
            case 8:
                id idVar2 = (id) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                long j8 = this.b;
                k5 k5Var = (k5) this.c;
                bf7 bf7Var = (bf7) this.f;
                try {
                    idVar2.dismiss();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                if (tLObject4 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject4;
                    bw5.C1 = joinaspeers.peers;
                    bw5.E1 = j8;
                    bw5.D1 = SystemClock.elapsedRealtime();
                    int i8 = k5Var.a;
                    bw5.F1 = i8;
                    uc7.s1(i8).c4(joinaspeers.chats, false);
                    uc7.s1(k5Var.a).j4(joinaspeers.users, false);
                    bf7Var.A(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 9:
                uc7 uc7Var2 = (uc7) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                long j9 = this.b;
                rc7 rc7Var = (rc7) this.c;
                Integer num = (Integer) this.f;
                if (arrayList6 == null) {
                    uc7Var2.t1.l(j9);
                    return;
                }
                uc7Var2.getClass();
                rc7Var.c = SystemClock.elapsedRealtime();
                rc7Var.d = false;
                rc7Var.a = arrayList6;
                rc7Var.b = num;
                uc7Var2.getNotificationCenter().k(15, Long.valueOf(j9), arrayList6);
                return;
            case 10:
                uc7 uc7Var3 = (uc7) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.c;
                long j10 = this.b;
                pl1 pl1Var = (pl1) this.f;
                boolean z3 = tL_error == null && (tLObject5 instanceof TLRPC.Bool);
                if (z3) {
                    SharedPreferences.Editor edit = uc7Var3.W3.edit();
                    uc7Var3.d4(edit, j10, false);
                    edit.putBoolean("dialog_bar_archived" + j10, false);
                    edit.apply();
                    uc7Var3.getNotificationCenter().k(3, new Object[0]);
                    uc7Var3.getNotificationCenter().k(80, Long.valueOf(j10));
                    uc7Var3.i3(uc7Var3.X1(Long.valueOf(j10)), null, true);
                }
                pl1Var.a(Boolean.valueOf(z3), tL_error);
                return;
            case 11:
                uc7 uc7Var4 = (uc7) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                long j11 = this.b;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.c;
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = (TLRPC.TL_messages_getSavedReactionTags) this.f;
                if (tLObject6 instanceof TLRPC.TL_messages_savedReactionsTags) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject6;
                    uc7Var4.P4.k(j11, tL_messages_savedReactionsTags);
                    uc7Var4.getNotificationCenter().k(jn7.j3, Long.valueOf(j11));
                    uc7Var4.H4(j11, tL_messages_savedReactionsTags);
                    return;
                }
                if ((tLObject6 instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                    uc7Var4.P4.k(j11, tL_messages_savedReactionsTags2);
                    uc7Var4.getNotificationCenter().k(jn7.j3, Long.valueOf(j11));
                    uc7Var4.H4(j11, tL_messages_savedReactionsTags2);
                    return;
                }
                return;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                no6 no6Var = (no6) this.e;
                long j12 = this.b;
                String str8 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (no6Var.g != null) {
                    try {
                        new File(no6Var.g).delete();
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                }
                no6Var.d = j12;
                no6Var.g = str8;
                no6Var.e = null;
                no6Var.f = null;
                photoViewer.p5.b.setLoading(false);
                ed8 ed8Var = photoViewer.d;
                if (ed8Var != null) {
                    ed8Var.X(photoViewer.O4);
                }
                nb8 nb8Var = photoViewer.h1;
                if (nb8Var != null) {
                    nb8Var.setImage(bitmap);
                }
                photoViewer.o2(0);
                CheckBox checkBox = photoViewer.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList7 = (ArrayList) this.c;
                boolean[] zArr2 = (boolean[]) this.f;
                long j13 = this.b;
                RectF rectF = ProfileActivity.Z6;
                zArr[0] = true;
                hl.r(profileActivity.D5);
                for (int i9 = 0; i9 < arrayList7.size(); i9++) {
                    ((TL_stories.StoryItem) arrayList7.get(i9)).pinned = zArr2[i9];
                }
                profileActivity.getMessagesController().O1().q0(j13, arrayList7, false);
                return;
            case 14:
                r7a r7aVar = (r7a) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                long j14 = this.b;
                Uri uri = (Uri) this.c;
                final e16 e16Var = (e16) this.f;
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                i7a i7aVar = new i7a(r7aVar);
                i7aVar.b = arrayList8;
                i7aVar.j = j14;
                i7aVar.g = r7aVar.getMessagesController().j1(j14);
                HashMap hashMap = new HashMap();
                int size = arrayList8.size();
                int i10 = 0;
                String str9 = "zip";
                while (i10 < size + 1) {
                    Uri uri2 = i10 == 0 ? uri : (Uri) arrayList8.get(i10 - 1);
                    if (uri2 == null || hl.G1(uri2, b3)) {
                        arrayList = arrayList8;
                        i2 = i10;
                        str = str9;
                        if (i2 == 0) {
                            final byte b4 = 0;
                            hl.c3(new Runnable() { // from class: w6a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    e16 e16Var2 = e16Var;
                                    switch (b5) {
                                        case 0:
                                            e16Var2.run(0L);
                                            break;
                                        case 1:
                                            e16Var2.run(0L);
                                            break;
                                        default:
                                            Toast.makeText(a.b, ob6.M0(2131749004, null), 0).show();
                                            e16Var2.run(0L);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    } else {
                        String q = xb4.q(MediaController.y(uri));
                        String str10 = (q == null || !q.endsWith(".zip")) ? "txt" : str9;
                        String q2 = MediaController.q(-1L, uri2, str10);
                        if (str9.equals(str10)) {
                            File file = new File(q2);
                            try {
                                zipInputStream = new ZipInputStream(new FileInputStream(file));
                                try {
                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                    while (true) {
                                        if (nextEntry == null) {
                                            arrayList = arrayList8;
                                            i2 = i10;
                                        } else {
                                            String name = nextEntry.getName();
                                            if (name == null) {
                                                nextEntry = zipInputStream.getNextEntry();
                                            } else {
                                                int lastIndexOf = name.lastIndexOf("/");
                                                if (lastIndexOf >= 0) {
                                                    name = name.substring(lastIndexOf + 1);
                                                }
                                                if (name.endsWith(".txt")) {
                                                    File r = MediaController.r(name);
                                                    q2 = r.getAbsolutePath();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(r);
                                                    byte[] bArr = new byte[1024];
                                                    arrayList = arrayList8;
                                                    while (true) {
                                                        try {
                                                            int read = zipInputStream.read(bArr);
                                                            i2 = i10;
                                                            if (read > 0) {
                                                                try {
                                                                    fileOutputStream.write(bArr, 0, read);
                                                                    i10 = i2;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    Throwable th5 = th;
                                                                    try {
                                                                        zipInputStream.close();
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                    }
                                                                    throw th5;
                                                                    break;
                                                                }
                                                            } else {
                                                                fileOutputStream.close();
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            i2 = i10;
                                                            Throwable th52 = th;
                                                            zipInputStream.close();
                                                            throw th52;
                                                        }
                                                    }
                                                } else {
                                                    nextEntry = zipInputStream.getNextEntry();
                                                    arrayList8 = arrayList8;
                                                    i10 = i10;
                                                }
                                            }
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                } catch (Throwable th8) {
                                    th = th8;
                                    arrayList = arrayList8;
                                }
                            } catch (IOException e5) {
                                e = e5;
                                arrayList = arrayList8;
                                i2 = i10;
                            } catch (Exception e6) {
                                e = e6;
                                arrayList = arrayList8;
                                i2 = i10;
                            }
                            try {
                                zipInputStream.close();
                                z2 = true;
                            } catch (IOException e7) {
                                e = e7;
                                z2 = true;
                                try {
                                    cc4.g(e, true);
                                } catch (Exception e8) {
                                    e = e8;
                                    cc4.g(e, z2);
                                    file.delete();
                                    if (q2 != null) {
                                    }
                                    i10 = i2 + 1;
                                    str9 = str;
                                    arrayList8 = arrayList;
                                    b3 = 0;
                                }
                                file.delete();
                                if (q2 != null) {
                                }
                                i10 = i2 + 1;
                                str9 = str;
                                arrayList8 = arrayList;
                                b3 = 0;
                            } catch (Exception e9) {
                                e = e9;
                                z2 = true;
                                cc4.g(e, z2);
                                file.delete();
                                if (q2 != null) {
                                }
                                i10 = i2 + 1;
                                str9 = str;
                                arrayList8 = arrayList;
                                b3 = 0;
                            }
                            file.delete();
                        } else {
                            arrayList = arrayList8;
                            i2 = i10;
                        }
                        if (q2 != null) {
                            str = str9;
                        } else {
                            File file2 = new File(q2);
                            if (file2.exists()) {
                                long length = file2.length();
                                if (length != 0) {
                                    str = str9;
                                    i7aVar.h += length;
                                    if (i2 != 0) {
                                        i7aVar.f.add(q2);
                                    } else {
                                        if (length > 33554432) {
                                            file2.delete();
                                            final byte b5 = 2;
                                            hl.c3(new Runnable() { // from class: w6a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b52 = b5;
                                                    e16 e16Var2 = e16Var;
                                                    switch (b52) {
                                                        case 0:
                                                            e16Var2.run(0L);
                                                            break;
                                                        case 1:
                                                            e16Var2.run(0L);
                                                            break;
                                                        default:
                                                            Toast.makeText(a.b, ob6.M0(2131749004, null), 0).show();
                                                            e16Var2.run(0L);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        i7aVar.a = q2;
                                    }
                                    i7aVar.c.add(q2);
                                    hashMap.put(q2, i7aVar);
                                }
                            }
                            str = str9;
                            if (i2 == 0) {
                                final byte b6 = 1;
                                hl.c3(new Runnable() { // from class: w6a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        e16 e16Var2 = e16Var;
                                        switch (b52) {
                                            case 0:
                                                e16Var2.run(0L);
                                                break;
                                            case 1:
                                                e16Var2.run(0L);
                                                break;
                                            default:
                                                Toast.makeText(a.b, ob6.M0(2131749004, null), 0).show();
                                                e16Var2.run(0L);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    i10 = i2 + 1;
                    str9 = str;
                    arrayList8 = arrayList;
                    b3 = 0;
                }
                hl.c3(new da7((Object) r7aVar, (Object) hashMap, j14, (Object) i7aVar, (Object) e16Var, (byte) 15));
                return;
            case 15:
                r7a r7aVar2 = (r7a) this.d;
                HashMap hashMap2 = (HashMap) this.e;
                long j15 = this.b;
                i7a i7aVar2 = (i7a) this.c;
                e16 e16Var2 = (e16) this.f;
                r7aVar2.y.putAll(hashMap2);
                r7aVar2.E.k(j15, i7aVar2);
                r7aVar2.getFileLoader().g0(i7aVar2.a, false, true, 0L, 67108864, true);
                r7aVar2.getNotificationCenter().k(jn7.v1, Long.valueOf(j15));
                e16Var2.run(j15);
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) ImportingService.class));
                    return;
                } catch (Throwable th9) {
                    cc4.g(th9, true);
                    return;
                }
            case 16:
                wua wuaVar = (wua) this.d;
                l01 l01Var = (l01) this.e;
                TLObject tLObject7 = (TLObject) this.c;
                long j16 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                l01Var.c(false);
                if (!(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error2 != null) {
                        wuaVar.j().g0(tL_error2, false);
                        return;
                    } else {
                        wuaVar.j().t(ob6.M0(2131743534, null), null).k(false);
                        return;
                    }
                }
                int i11 = wuaVar.a;
                if (j16 >= 0) {
                    TLRPC.UserFull Y1 = uc7.s1(i11).Y1(j16);
                    if (Y1 != null) {
                        int max = Math.max(0, Y1.stargifts_count - 1);
                        Y1.stargifts_count = max;
                        if (max <= 0) {
                            Y1.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull N0 = uc7.s1(i11).N0(-j16);
                    if (N0 != null) {
                        int max2 = Math.max(0, N0.stargifts_count - 1);
                        N0.stargifts_count = max2;
                        if (max2 <= 0) {
                            N0.flags2 &= -262145;
                        }
                    }
                }
                TL_stars.SavedStarGift savedStarGift2 = wuaVar.A2;
                int i12 = wuaVar.a;
                if (savedStarGift2 != null) {
                    jxa v = jxa.v(i12, false);
                    TL_stars.SavedStarGift savedStarGift3 = wuaVar.A2;
                    if (savedStarGift3 != null) {
                        axa D = v.D(j16, false);
                        if (D != null) {
                            D.m(savedStarGift3);
                        }
                        zwa zwaVar = (zwa) v.K.get(j16);
                        if (zwaVar != null) {
                            ArrayList arrayList9 = zwaVar.e;
                            int size2 = arrayList9.size();
                            boolean z4 = false;
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj = arrayList9.get(i13);
                                i13++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                axa e10 = zwaVar.e(tL_starGiftCollection.collection_id);
                                boolean z5 = e10 != null && e10.m(savedStarGift3);
                                if (!z5) {
                                    z4 = z4;
                                    break;
                                }
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z4 = true;
                                if (z5) {
                                    zwaVar.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            axa axaVar3 = zwaVar.g;
                            if (axaVar3 != null) {
                                axaVar3.m(savedStarGift3);
                            }
                            if (z4) {
                                zwaVar.j();
                                jn7.f(zwaVar.a).k(jn7.J3, Long.valueOf(zwaVar.b), zwaVar);
                            }
                        }
                    }
                } else {
                    jxa.v(i12, false).M(j16);
                }
                wuaVar.dismiss();
                hl.c3(new osa((byte) 0));
                return;
            case 17:
                jxa jxaVar = (jxa) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                r47 r47Var = (r47) this.c;
                long j17 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i14 = jxaVar.a;
                if (!(tLObject8 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject8;
                uc7.s1(i14).j4(tL_messages_messages.users, false);
                uc7.s1(i14).c4(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    r47Var.k = tL_messages_messages.messages.get(0);
                    jxaVar.k0(r47Var, j17, runnable, true);
                    return;
                }
            case 18:
                jxa jxaVar2 = (jxa) this.d;
                icc iccVar = (icc) this.e;
                long j18 = this.b;
                TLObject tLObject9 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (jxaVar2.e) {
                    jxaVar2.e(j18, tLObject9, tL_textWithEntities, iccVar);
                    return;
                } else {
                    jxa.c("NO_BALANCE");
                    iccVar.a(Boolean.FALSE, null);
                    return;
                }
            case 19:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.e;
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) this.c;
                long j19 = this.b;
                String str11 = (String) this.f;
                hl.d3(new ev8(profileActivity2, b2), 200L);
                d31 b0 = d31.b0(profileActivity2);
                TLRPC.Document document3 = starGift2.sticker;
                String M0 = ob6.M0(2131744766, null);
                if (spannableStringBuilder3 == null) {
                    spannableStringBuilder3 = hl.S2(ob6.G((int) j19, "StarsGiftCompletedChannelText", str11));
                }
                b0.s(document3, M0, spannableStringBuilder3).k(false);
                return;
            case 20:
                hxa hxaVar = (hxa) this.e;
                TLObject tLObject10 = (TLObject) this.c;
                uc7 uc7Var5 = (uc7) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                long j20 = this.b;
                hxaVar.getClass();
                if (tLObject10 != null) {
                    Utilities.d.c(new c87(uc7Var5, tLObject10, (byte) 7));
                    return;
                }
                if (tL_error3 != null) {
                    hxaVar.b.f((int) (-hxaVar.h), hxaVar.c(), hxaVar.g);
                    jn7.f(hxaVar.q.a).k(jn7.o1, Long.valueOf(r47.B0(hxaVar.b.k)), Integer.valueOf(hxaVar.b.e1()), hxaVar.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error3.text)) {
                        long j21 = hxaVar.a.a;
                        zu1 zu1Var = hxaVar.c;
                        if (j21 >= 0) {
                            str2 = lbc.l(zu1Var.getMessagesController().X1(Long.valueOf(hxaVar.a.a)));
                        } else {
                            TLRPC.Chat M02 = zu1Var.getMessagesController().M0(Long.valueOf(-hxaVar.a.a));
                            str2 = M02 == null ? "" : M02.title;
                        }
                        String str12 = str2;
                        Context parentActivity = hxaVar.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.H1;
                        }
                        if (parentActivity == null) {
                            parentActivity = a.b;
                        }
                        new dza(parentActivity, hxaVar.c.getResourceProvider(), j20, 5, str12, new gxa(hxaVar, j20, b2), 0L).show();
                    }
                    hxaVar.q.Q(false);
                    hxaVar.q.L();
                    return;
                }
                return;
            case 21:
                e0b e0bVar = (e0b) this.d;
                long j22 = this.b;
                jxa jxaVar3 = (jxa) this.e;
                r47 r47Var2 = (r47) this.c;
                zu1 zu1Var2 = (zu1) this.f;
                z86 z86Var = e0bVar.L1;
                long j23 = e0bVar.y1;
                if (z86Var == null) {
                    hxa c0 = jxaVar3.c0(r47Var2, zu1Var2, j22, false, true, Long.valueOf(j23));
                    if (c0 != null) {
                        hl.c3(new ida((Object) e0bVar, (Object) c0, (byte) 26));
                        return;
                    }
                    return;
                }
                int intValue = z86Var.a.f(Long.valueOf(j22)).intValue();
                e0bVar.K1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    e0bVar.dismiss();
                    return;
                } else {
                    hl.c3(new oza(e0bVar, b3));
                    return;
                }
            case 22:
                a5c a5cVar = (a5c) this.d;
                v4c v4cVar = (v4c) this.e;
                TLObject tLObject11 = (TLObject) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f;
                long j24 = this.b;
                synchronized (a5cVar) {
                    arrayList2 = v4cVar.b;
                    arrayList3 = v4cVar.c;
                }
                if (tLObject11 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    ArrayList<TL_iv.RichMessage> arrayList10 = ((TLRPC.TL_messages_translatedRichMessage) tLObject11).result;
                    int min = Math.min(arrayList3.size(), arrayList10.size());
                    for (int i15 = 0; i15 < min; i15++) {
                        ((kcc) arrayList3.get(i15)).a((Integer) arrayList2.get(i15), arrayList10.get(i15), v4cVar.d);
                    }
                } else {
                    if (tL_error4 != null) {
                        if ("TO_LANG_INVALID".equals(tL_error4.text)) {
                            a5cVar.K(j24, false);
                            jn7.e().k(jn7.S4, 1, ob6.M0(2131743601, null));
                        } else if ("QUOTA_EXCEEDED".equals(tL_error4.text)) {
                            jn7.e().k(jn7.S4, 1, ob6.M0(2131743602, null));
                        }
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        ((kcc) arrayList3.get(i16)).a((Integer) arrayList2.get(i16), null, v4cVar.d);
                    }
                }
                synchronized (a5cVar) {
                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                        a5cVar.x.remove(arrayList2.get(i17));
                    }
                }
                return;
            case 23:
                a();
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.c;
                q0d q0dVar = (q0d) this.f;
                long j25 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                q0dVar.b(3, null, j25);
                return;
        }
    }

    public /* synthetic */ da7(kt0 kt0Var, id idVar, TLObject tLObject, long j, pcc pccVar) {
        this.a = (byte) 1;
        this.d = kt0Var;
        this.e = idVar;
        this.f = tLObject;
        this.b = j;
        this.c = pccVar;
    }

    public /* synthetic */ da7(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ da7(Object obj, Object obj2, long j, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ da7(Object obj, Object obj2, Object obj3, long j, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j;
        this.f = obj4;
    }

    public /* synthetic */ da7(Object obj, Object obj2, Object obj3, Object obj4, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j;
    }
}
