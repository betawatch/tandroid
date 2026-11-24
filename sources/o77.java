// default package

import android.content.Context;
import android.content.Intent;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o77(eta etaVar, TLObject tLObject, na7 na7Var, TLRPC.TL_error tL_error, long j) {
        this.a = (byte) 19;
        this.e = etaVar;
        this.c = tLObject;
        this.d = na7Var;
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
        b1c b1cVar = (b1c) this.d;
        v0c v0cVar = (v0c) this.e;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        long j = this.b;
        synchronized (b1cVar) {
            arrayList = v0cVar.b;
            arrayList2 = v0cVar.d;
            arrayList3 = v0cVar.c;
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
                y0c y0cVar = (y0c) pair.first;
                y0c y0cVar2 = (y0c) pair.second;
                y0c y0cVar3 = new y0c();
                if (y0cVar2 != null && (tL_textWithEntities5 = y0cVar2.a) != null) {
                    y0cVar3.a = tL_textWithEntities5;
                } else if (y0cVar.a != null) {
                    if (i6 >= arrayList4.size()) {
                        tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    } else {
                        tL_textWithEntities = arrayList4.get(i6);
                        i6++;
                    }
                    y0cVar3.a = rzb.L0(y0cVar.a, tL_textWithEntities);
                }
                if (y0cVar.b.size() != (y0cVar2 == null ? 0 : y0cVar2.b.size())) {
                    ArrayList arrayList6 = y0cVar.b;
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
                        y0cVar3.b.add(tL_pollAnswer);
                        i8 = i11;
                        size = i10;
                        i6 = i5;
                    }
                    i3 = size;
                    i4 = i8;
                } else {
                    i3 = size;
                    i4 = i8;
                    if (y0cVar2 != null) {
                        y0cVar3.b = y0cVar2.b;
                    }
                }
                if (y0cVar2 != null && (tL_textWithEntities3 = y0cVar2.c) != null) {
                    y0cVar3.c = tL_textWithEntities3;
                } else if (y0cVar.c != null) {
                    if (i6 >= arrayList4.size()) {
                        tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    } else {
                        int i12 = i6 + 1;
                        TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList4.get(i6);
                        i6 = i12;
                        tL_textWithEntities2 = tL_textWithEntities6;
                    }
                    y0cVar3.c = rzb.L0(y0cVar.c, tL_textWithEntities2);
                }
                arrayList5.add(y0cVar3);
                i7 = i4;
                size = i3;
            }
            int min = Math.min(arrayList2.size(), arrayList5.size());
            for (int i13 = 0; i13 < min; i13++) {
                ((k8c) arrayList2.get(i13)).a((Integer) arrayList.get(i13), (y0c) arrayList5.get(i13), v0cVar.e);
            }
        } else {
            if (tL_error != null) {
                if ("TO_LANG_INVALID".equals(tL_error.text)) {
                    b1cVar.K(j, false);
                    kk7.e().k(kk7.R4, 1, k96.M0(2131743707, null));
                } else if ("QUOTA_EXCEEDED".equals(tL_error.text)) {
                    i = 0;
                    kk7.e().k(kk7.R4, 1, k96.M0(2131743708, null));
                    for (i2 = i; i2 < arrayList2.size(); i2++) {
                        ((k8c) arrayList2.get(i2)).a((Integer) arrayList.get(i2), null, v0cVar.e);
                    }
                    synchronized (b1cVar) {
                        for (int i14 = i; i14 < arrayList.size(); i14++) {
                            b1cVar.x.remove(arrayList.get(i14));
                        }
                    }
                    return;
                }
            }
            i = 0;
            while (i2 < arrayList2.size()) {
            }
            synchronized (b1cVar) {
            }
        }
        i = 0;
        synchronized (b1cVar) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x03a8, code lost:
    
        if (r2.collection_id.contains(java.lang.Integer.valueOf(r10.collection_id)) != false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0982  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z;
        byte b;
        xsa xsaVar;
        int i;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2 = 3;
        String str5 = null;
        byte b2 = 0;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) this.e;
                p8c p8cVar = (p8c) this.c;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f;
                long j = this.b;
                na7Var.a4(updates.users, false);
                na7Var.U3(updates.chats, false);
                if (p8cVar != null) {
                    p8cVar.a(tL_messages_invitedUsers);
                    return;
                } else {
                    ij.f(na7Var.currentAccount, na7Var.K0(Long.valueOf(j)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                ct0 ct0Var = (ct0) this.d;
                hd hdVar = (hd) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j2 = this.b;
                p8c p8cVar2 = (p8c) this.c;
                hdVar.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    na7.q1(ct0Var.a).a4(connectedstarrefbots.users, false);
                    for (int i3 = 0; i3 < connectedstarrefbots.connected_bots.size(); i3++) {
                        if (connectedstarrefbots.connected_bots.get(i3).bot_id == j2 && !connectedstarrefbots.connected_bots.get(i3).revoked) {
                            p8cVar2.a(connectedstarrefbots.connected_bots.get(i3));
                            return;
                        }
                    }
                }
                p8cVar2.a(null);
                return;
            case 2:
                kf2 kf2Var = (kf2) this.d;
                long j3 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str6 = (String) this.c;
                TLObject tLObject2 = (TLObject) this.f;
                zc2 zc2Var = new zc2(j3, kf2Var.N, null, kf2Var.E, tL_chatBannedRights, str6, 1, true, false, null);
                zc2Var.Y0 = new ve2(kf2Var, tLObject2);
                kf2Var.presentFragment(zc2Var);
                return;
            case 3:
                kf2 kf2Var2 = (kf2) this.d;
                long j4 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str7 = (String) this.c;
                TLObject tLObject3 = (TLObject) this.f;
                zc2 zc2Var2 = new zc2(j4, kf2Var2.N, tL_chatAdminRights, null, null, str7, 0, true, false, null);
                zc2Var2.Y0 = new we2(kf2Var2, tLObject3);
                kf2Var2.presentFragment(zc2Var2);
                return;
            case 4:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 5:
                uj3 uj3Var = (uj3) this.d;
                ad7 ad7Var = (ad7) this.e;
                ArrayList arrayList4 = (ArrayList) this.c;
                long j5 = this.b;
                String str8 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                    for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                        try {
                            executeFast.requery();
                            executeFast.bindLong(1, ((Long) arrayList4.get(i4)).longValue());
                            executeFast.bindLong(2, j5);
                            executeFast.bindString(3, str8);
                            executeFast.bindInteger(4, i4);
                            executeFast.step();
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            z = true;
                            try {
                                fa4.g(e, z);
                                b = z;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    b = z;
                                }
                                gl.d3(new tj3(uj3Var, b));
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
                gl.d3(new tj3(uj3Var, b));
                return;
            case 6:
                uj3 uj3Var2 = (uj3) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                long j6 = this.b;
                String str9 = (String) this.c;
                tj3 tj3Var = (tj3) this.f;
                na7.q1(uj3Var2.a).a4(arrayList5, true);
                uj3Var2.h.addAll(arrayList5);
                uj3Var2.f = j6;
                uj3Var2.g = str9;
                uj3Var2.e = TextUtils.isEmpty(str9);
                uj3Var2.d = true;
                tj3Var.run();
                return;
            case 7:
                tv4 tv4Var = (tv4) this.d;
                xsa xsaVar2 = (xsa) this.e;
                long j7 = this.b;
                p8c p8cVar3 = (p8c) this.c;
                Context context = (Context) this.f;
                s11 s11Var = tv4Var.e2;
                int i5 = 0;
                while (i5 < 2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gl.T2(i5 == 1 ? k96.M0(2131749947, str5) : k96.a0(str5, str5, 2131749943, tv4Var.Y1)));
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    int i6 = 0;
                    while (i6 < xsaVar2.l.size() && hashSet.size() < i2) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) xsaVar2.l.get(i6);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            i = i6;
                        } else {
                            i = i6;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i6 = i + 1;
                        i2 = 3;
                    }
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) k96.a0(null, null, 2131749941, cf3.s(j7)).replaceAll(" ", " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new gm(document2, s11Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            xsaVar2 = xsaVar2;
                        }
                        xsaVar = xsaVar2;
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append((CharSequence) gl.E2(gl.i2(spannableStringBuilder2, new de2(tv4Var, p8cVar3, j7, (byte) 23)), true));
                    } else {
                        xsaVar = xsaVar2;
                        spannableStringBuilder.append((CharSequence) gl.E2(gl.i2(k96.M0(2131749942, null), new vf1(context, (byte) 2)), true));
                    }
                    s11 s11Var2 = i5 == 0 ? s11Var : tv4Var.f2;
                    s11Var2.setText(spannableStringBuilder);
                    s11Var2.setMaxWidth(je5.a(s11Var2.getText(), s11Var2.getPaint()));
                    i5++;
                    xsaVar2 = xsaVar;
                    i2 = 3;
                    str5 = null;
                }
                return;
            case 8:
                hd hdVar2 = (hd) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                long j8 = this.b;
                j5 j5Var = (j5) this.c;
                sc7 sc7Var = (sc7) this.f;
                try {
                    hdVar2.dismiss();
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (tLObject4 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject4;
                    xt5.C1 = joinaspeers.peers;
                    xt5.E1 = j8;
                    xt5.D1 = SystemClock.elapsedRealtime();
                    int i7 = j5Var.a;
                    xt5.F1 = i7;
                    na7.q1(i7).U3(joinaspeers.chats, false);
                    na7.q1(j5Var.a).a4(joinaspeers.users, false);
                    sc7Var.k(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 9:
                na7 na7Var2 = (na7) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                long j9 = this.b;
                ka7 ka7Var = (ka7) this.c;
                Integer num = (Integer) this.f;
                if (arrayList6 == null) {
                    na7Var2.t1.l(j9);
                    return;
                }
                na7Var2.getClass();
                ka7Var.c = SystemClock.elapsedRealtime();
                ka7Var.d = false;
                ka7Var.a = arrayList6;
                ka7Var.b = num;
                na7Var2.getNotificationCenter().k(15, Long.valueOf(j9), arrayList6);
                return;
            case 10:
                na7 na7Var3 = (na7) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                long j10 = this.b;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.c;
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = (TLRPC.TL_messages_getSavedReactionTags) this.f;
                if (tLObject5 instanceof TLRPC.TL_messages_savedReactionsTags) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject5;
                    na7Var3.O4.k(tL_messages_savedReactionsTags, j10);
                    na7Var3.getNotificationCenter().k(kk7.i3, Long.valueOf(j10));
                    na7Var3.y4(j10, tL_messages_savedReactionsTags);
                    return;
                }
                if ((tLObject5 instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                    na7Var3.O4.k(tL_messages_savedReactionsTags2, j10);
                    na7Var3.getNotificationCenter().k(kk7.i3, Long.valueOf(j10));
                    na7Var3.y4(j10, tL_messages_savedReactionsTags2);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                jm6 jm6Var = (jm6) this.e;
                long j11 = this.b;
                String str10 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (jm6Var.g != null) {
                    try {
                        new File(jm6Var.g).delete();
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                    }
                }
                jm6Var.d = j11;
                jm6Var.g = str10;
                jm6Var.e = null;
                jm6Var.f = null;
                photoViewer.q5.b.setLoading(false);
                o98 o98Var = photoViewer.d;
                if (o98Var != null) {
                    o98Var.X(photoViewer.P4);
                }
                w78 w78Var = photoViewer.h1;
                if (w78Var != null) {
                    w78Var.setImage(bitmap);
                }
                photoViewer.n2(0);
                CheckBox checkBox = photoViewer.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList7 = (ArrayList) this.c;
                boolean[] zArr2 = (boolean[]) this.f;
                long j12 = this.b;
                RectF rectF = ProfileActivity.Z6;
                zArr[0] = true;
                gl.r(profileActivity.D5);
                for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                    ((TL_stories.StoryItem) arrayList7.get(i8)).pinned = zArr2[i8];
                }
                profileActivity.getMessagesController().M1().q0(j12, arrayList7, false);
                return;
            case 13:
                z3a z3aVar = (z3a) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                long j13 = this.b;
                Uri uri = (Uri) this.c;
                final ez5 ez5Var = (ez5) this.f;
                String str11 = "zip";
                String str12 = "txt";
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                p3a p3aVar = new p3a(z3aVar);
                p3aVar.b = arrayList8;
                p3aVar.j = j13;
                p3aVar.g = z3aVar.getMessagesController().h1(j13);
                HashMap hashMap = new HashMap();
                int size = arrayList8.size();
                int i9 = 0;
                while (i9 < size + 1) {
                    Uri uri2 = i9 == 0 ? uri : (Uri) arrayList8.get(i9 - 1);
                    if (uri2 == null || gl.G1(uri2, b2)) {
                        arrayList = arrayList8;
                        str = str11;
                        str2 = str12;
                        if (i9 == 0) {
                            final byte b4 = 0;
                            gl.d3(new Runnable() { // from class: h3a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    ez5 ez5Var2 = ez5Var;
                                    switch (b5) {
                                        case 0:
                                            ez5Var2.run(0L);
                                            break;
                                        case 1:
                                            ez5Var2.run(0L);
                                            break;
                                        default:
                                            Toast.makeText(a.b, k96.M0(2131749058, null), 0).show();
                                            ez5Var2.run(0L);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    } else {
                        String q = ba4.q(MediaController.v(uri));
                        if (q == null || !q.endsWith(".zip")) {
                            str2 = str12;
                            str3 = str2;
                        } else {
                            str3 = str11;
                            str2 = str12;
                        }
                        String o = MediaController.o(-1L, uri2, str3);
                        if (str11.equals(str3)) {
                            File file = new File(o);
                            try {
                                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
                                try {
                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                    while (true) {
                                        if (nextEntry == null) {
                                            arrayList = arrayList8;
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
                                                    File p = MediaController.p(name);
                                                    o = p.getAbsolutePath();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(p);
                                                    byte[] bArr = new byte[1024];
                                                    while (true) {
                                                        int read = zipInputStream.read(bArr);
                                                        arrayList = arrayList8;
                                                        if (read > 0) {
                                                            try {
                                                                fileOutputStream.write(bArr, 0, read);
                                                                arrayList8 = arrayList;
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
                                                    }
                                                } else {
                                                    nextEntry = zipInputStream.getNextEntry();
                                                    arrayList8 = arrayList8;
                                                }
                                            }
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                    try {
                                        zipInputStream.close();
                                        z2 = true;
                                    } catch (IOException e5) {
                                        e = e5;
                                        z2 = true;
                                        try {
                                            fa4.g(e, true);
                                        } catch (Exception e6) {
                                            e = e6;
                                            fa4.g(e, z2);
                                            file.delete();
                                            if (o != null) {
                                            }
                                            i9++;
                                            str12 = str2;
                                            str11 = str;
                                            arrayList8 = arrayList;
                                            b2 = 0;
                                        }
                                        file.delete();
                                        if (o != null) {
                                        }
                                        i9++;
                                        str12 = str2;
                                        str11 = str;
                                        arrayList8 = arrayList;
                                        b2 = 0;
                                    } catch (Exception e7) {
                                        e = e7;
                                        z2 = true;
                                        fa4.g(e, z2);
                                        file.delete();
                                        if (o != null) {
                                        }
                                        i9++;
                                        str12 = str2;
                                        str11 = str;
                                        arrayList8 = arrayList;
                                        b2 = 0;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    arrayList = arrayList8;
                                }
                            } catch (IOException e8) {
                                e = e8;
                                arrayList = arrayList8;
                            } catch (Exception e9) {
                                e = e9;
                                arrayList = arrayList8;
                            }
                            try {
                                file.delete();
                            } catch (Exception e10) {
                                fa4.g(e10, z2);
                            }
                        } else {
                            arrayList = arrayList8;
                        }
                        if (o != null) {
                            str = str11;
                        } else {
                            File file2 = new File(o);
                            if (file2.exists()) {
                                long length = file2.length();
                                if (length != 0) {
                                    str = str11;
                                    p3aVar.h += length;
                                    if (i9 != 0) {
                                        p3aVar.f.add(o);
                                    } else {
                                        if (length > 33554432) {
                                            file2.delete();
                                            final byte b5 = 2;
                                            gl.d3(new Runnable() { // from class: h3a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b52 = b5;
                                                    ez5 ez5Var2 = ez5Var;
                                                    switch (b52) {
                                                        case 0:
                                                            ez5Var2.run(0L);
                                                            break;
                                                        case 1:
                                                            ez5Var2.run(0L);
                                                            break;
                                                        default:
                                                            Toast.makeText(a.b, k96.M0(2131749058, null), 0).show();
                                                            ez5Var2.run(0L);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        p3aVar.a = o;
                                    }
                                    p3aVar.c.add(o);
                                    hashMap.put(o, p3aVar);
                                }
                            }
                            str = str11;
                            if (i9 == 0) {
                                final byte b6 = 1;
                                gl.d3(new Runnable() { // from class: h3a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        ez5 ez5Var2 = ez5Var;
                                        switch (b52) {
                                            case 0:
                                                ez5Var2.run(0L);
                                                break;
                                            case 1:
                                                ez5Var2.run(0L);
                                                break;
                                            default:
                                                Toast.makeText(a.b, k96.M0(2131749058, null), 0).show();
                                                ez5Var2.run(0L);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    i9++;
                    str12 = str2;
                    str11 = str;
                    arrayList8 = arrayList;
                    b2 = 0;
                }
                gl.d3(new o77((Object) z3aVar, (Object) hashMap, j13, (Object) p3aVar, (Object) ez5Var, (byte) 14));
                return;
            case 14:
                z3a z3aVar2 = (z3a) this.d;
                HashMap hashMap2 = (HashMap) this.e;
                long j14 = this.b;
                p3a p3aVar2 = (p3a) this.c;
                ez5 ez5Var2 = (ez5) this.f;
                z3aVar2.y.putAll(hashMap2);
                z3aVar2.E.k(p3aVar2, j14);
                z3aVar2.getFileLoader().g0(p3aVar2.a, false, true, 0L, 67108864, true);
                z3aVar2.getNotificationCenter().k(kk7.u1, Long.valueOf(j14));
                ez5Var2.run(j14);
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) ImportingService.class));
                    return;
                } catch (Throwable th8) {
                    fa4.g(th8, true);
                    return;
                }
            case 15:
                vqa vqaVar = (vqa) this.d;
                c01 c01Var = (c01) this.e;
                TLObject tLObject6 = (TLObject) this.c;
                long j15 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                c01Var.c(false);
                if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        vqaVar.j().g0(tL_error, false);
                        return;
                    } else {
                        vqaVar.j().t(k96.M0(2131743640, null), null).k(false);
                        return;
                    }
                }
                int i10 = vqaVar.a;
                if (j15 >= 0) {
                    TLRPC.UserFull W1 = na7.q1(i10).W1(j15);
                    if (W1 != null) {
                        int max = Math.max(0, W1.stargifts_count - 1);
                        W1.stargifts_count = max;
                        if (max <= 0) {
                            W1.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull L0 = na7.q1(i10).L0(-j15);
                    if (L0 != null) {
                        int max2 = Math.max(0, L0.stargifts_count - 1);
                        L0.stargifts_count = max2;
                        if (max2 <= 0) {
                            L0.flags2 &= -262145;
                        }
                    }
                }
                TL_stars.SavedStarGift savedStarGift2 = vqaVar.A2;
                int i11 = vqaVar.a;
                if (savedStarGift2 != null) {
                    gta v = gta.v(i11, false);
                    TL_stars.SavedStarGift savedStarGift3 = vqaVar.A2;
                    if (savedStarGift3 != null) {
                        xsa D = v.D(j15, false);
                        if (D != null) {
                            D.m(savedStarGift3);
                        }
                        wsa wsaVar = (wsa) v.K.get(j15);
                        if (wsaVar != null) {
                            ArrayList arrayList9 = wsaVar.e;
                            int size2 = arrayList9.size();
                            boolean z3 = false;
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj = arrayList9.get(i12);
                                i12++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                xsa e11 = wsaVar.e(tL_starGiftCollection.collection_id);
                                boolean z4 = e11 != null && e11.m(savedStarGift3);
                                if (!z4) {
                                    z3 = z3;
                                    break;
                                }
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z3 = true;
                                if (z4) {
                                    wsaVar.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            xsa xsaVar3 = wsaVar.g;
                            if (xsaVar3 != null) {
                                xsaVar3.m(savedStarGift3);
                            }
                            if (z3) {
                                wsaVar.j();
                                kk7.f(wsaVar.a).k(kk7.I3, Long.valueOf(wsaVar.b), wsaVar);
                            }
                        }
                    }
                } else {
                    gta.v(i11, false).M(j15);
                }
                vqaVar.dismiss();
                gl.d3(new am6((byte) 27));
                return;
            case 16:
                gta gtaVar = (gta) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                k27 k27Var = (k27) this.c;
                long j16 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i13 = gtaVar.a;
                if (!(tLObject7 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject7;
                na7.q1(i13).a4(tL_messages_messages.users, false);
                na7.q1(i13).U3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    k27Var.k = tL_messages_messages.messages.get(0);
                    gtaVar.j0(k27Var, j16, runnable, true);
                    return;
                }
            case 17:
                gta gtaVar2 = (gta) this.d;
                i8c i8cVar = (i8c) this.e;
                long j17 = this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (gtaVar2.e) {
                    gtaVar2.e(j17, tLObject8, tL_textWithEntities, i8cVar);
                    return;
                } else {
                    gta.c("NO_BALANCE");
                    i8cVar.a(Boolean.FALSE, null);
                    return;
                }
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.e;
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) this.c;
                long j18 = this.b;
                String str13 = (String) this.f;
                gl.e3(new vr8(profileActivity2, b3), 200L);
                u21 b0 = u21.b0(profileActivity2);
                TLRPC.Document document3 = starGift2.sticker;
                String M0 = k96.M0(2131744872, null);
                if (spannableStringBuilder3 == null) {
                    spannableStringBuilder3 = gl.T2(k96.G((int) j18, "StarsGiftCompletedChannelText", str13));
                }
                b0.s(document3, M0, spannableStringBuilder3).k(false);
                return;
            case 19:
                eta etaVar = (eta) this.e;
                TLObject tLObject9 = (TLObject) this.c;
                na7 na7Var4 = (na7) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                long j19 = this.b;
                etaVar.getClass();
                if (tLObject9 != null) {
                    Utilities.d.c(new a57(na7Var4, tLObject9, (byte) 7));
                    return;
                }
                if (tL_error2 != null) {
                    etaVar.b.f((int) (-etaVar.h), etaVar.c(), etaVar.g);
                    kk7.f(etaVar.q.a).k(kk7.n1, Long.valueOf(k27.B0(etaVar.b.k)), Integer.valueOf(etaVar.b.e1()), etaVar.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        long j20 = etaVar.a.a;
                        mu1 mu1Var = etaVar.c;
                        if (j20 >= 0) {
                            str4 = l7c.l(mu1Var.getMessagesController().V1(Long.valueOf(etaVar.a.a)));
                        } else {
                            TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-etaVar.a.a));
                            str4 = K0 == null ? "" : K0.title;
                        }
                        String str14 = str4;
                        Context parentActivity = etaVar.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.H1;
                        }
                        if (parentActivity == null) {
                            parentActivity = a.b;
                        }
                        new zua(parentActivity, etaVar.c.getResourceProvider(), j19, 5, str14, new dta(etaVar, j19, b3), 0L).show();
                    }
                    etaVar.q.P(false);
                    etaVar.q.L();
                    return;
                }
                return;
            case 20:
                bwa bwaVar = (bwa) this.d;
                long j21 = this.b;
                gta gtaVar3 = (gta) this.e;
                k27 k27Var2 = (k27) this.c;
                mu1 mu1Var2 = (mu1) this.f;
                v66 v66Var = bwaVar.L1;
                long j22 = bwaVar.y1;
                if (v66Var == null) {
                    eta b02 = gtaVar3.b0(k27Var2, mu1Var2, j21, false, true, Long.valueOf(j22));
                    if (b02 != null) {
                        gl.d3(new t7a((Object) bwaVar, (Object) b02, (byte) 29));
                        return;
                    }
                    return;
                }
                int intValue = v66Var.a.f(Long.valueOf(j21)).intValue();
                bwaVar.K1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    bwaVar.dismiss();
                    return;
                } else {
                    gl.d3(new kva(bwaVar, b2));
                    return;
                }
            case 21:
                b1c b1cVar = (b1c) this.d;
                w0c w0cVar = (w0c) this.e;
                TLObject tLObject10 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                long j23 = this.b;
                synchronized (b1cVar) {
                    arrayList2 = w0cVar.b;
                    arrayList3 = w0cVar.c;
                }
                if (tLObject10 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    ArrayList<TL_iv.RichMessage> arrayList10 = ((TLRPC.TL_messages_translatedRichMessage) tLObject10).result;
                    int min = Math.min(arrayList3.size(), arrayList10.size());
                    for (int i14 = 0; i14 < min; i14++) {
                        ((k8c) arrayList3.get(i14)).a((Integer) arrayList2.get(i14), arrayList10.get(i14), w0cVar.d);
                    }
                } else {
                    if (tL_error3 != null) {
                        if ("TO_LANG_INVALID".equals(tL_error3.text)) {
                            b1cVar.K(j23, false);
                            kk7.e().k(kk7.R4, 1, k96.M0(2131743707, null));
                        } else if ("QUOTA_EXCEEDED".equals(tL_error3.text)) {
                            kk7.e().k(kk7.R4, 1, k96.M0(2131743708, null));
                        }
                    }
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        ((k8c) arrayList3.get(i15)).a((Integer) arrayList2.get(i15), null, w0cVar.d);
                    }
                }
                synchronized (b1cVar) {
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        b1cVar.x.remove(arrayList2.get(i16));
                    }
                }
                return;
            case 22:
                a();
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.c;
                bwc bwcVar = (bwc) this.f;
                long j24 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                bwcVar.b(3, null, j24);
                return;
        }
    }

    public /* synthetic */ o77(ct0 ct0Var, hd hdVar, TLObject tLObject, long j, p8c p8cVar) {
        this.a = (byte) 1;
        this.d = ct0Var;
        this.e = hdVar;
        this.f = tLObject;
        this.b = j;
        this.c = p8cVar;
    }

    public /* synthetic */ o77(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ o77(Object obj, Object obj2, long j, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ o77(Object obj, Object obj2, Object obj3, long j, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j;
        this.f = obj4;
    }

    public /* synthetic */ o77(Object obj, Object obj2, Object obj3, Object obj4, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j;
    }
}
