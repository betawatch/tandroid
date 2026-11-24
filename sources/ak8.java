// default package

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ak8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ak8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x016d, code lost:
    
        if (r7 == null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:355:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        wy8 wy8Var;
        String str;
        int i;
        String str2;
        my8 my8Var;
        int i2;
        int i3;
        boolean z2;
        int i4;
        byte b = 3;
        Surface surface = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        surface = null;
        Object[] objArr = 0;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                premiumPreviewFragment.getClass();
                if (tL_error != null) {
                    c41.e0(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        return;
                    }
                    mlb.y(null, 2131743566, c41.b0(premiumPreviewFragment), null);
                    return;
                }
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                RectF rectF = ProfileActivity.e7;
                if (gm.g(str3)) {
                    c41.b0(profileActivity).i(str4).j();
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashSet hashSet = (HashSet) this.d;
                RectF rectF2 = ProfileActivity.e7;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(i5);
                    if (!hashSet.contains(Long.valueOf(user.id))) {
                        TLRPC.ChatFull chatFull = profileActivity2.v2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (sd2.T(profileActivity2.F2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity2.getUserConfig().e();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user.id;
                            channelParticipant.date = profileActivity2.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user.id;
                            profileActivity2.v2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user.id;
                            tL_chatParticipant.inviter_id = z8c.h(profileActivity2.getAccountInstance().a).n;
                            profileActivity2.v2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity2.v2.participants_count++;
                        profileActivity2.getMessagesController().c4(user, false, false);
                    }
                }
                profileActivity2.c4(true, false);
                return;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                pr1 pr1Var = (pr1) this.c;
                yv1 yv1Var = (yv1) this.d;
                RectF rectF3 = ProfileActivity.e7;
                v82 v82Var = pr1Var.e;
                ViewGroup viewGroup = (ViewGroup) yv1Var.fragmentView;
                RectF rectF4 = zgc.h;
                zgc.c(v82Var, viewGroup, rectF4);
                profileActivity3.p6 = rectF4.left;
                profileActivity3.X1();
                return;
            case 4:
                c41.D((vg1) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                return;
            case 5:
                lea leaVar = (lea) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                d dVar = (d) this.d;
                leaVar.I = -1;
                if (tL_error2 != null) {
                    c41.b0(dVar).g0(tL_error2, false);
                    return;
                }
                return;
            case 6:
                rs8 rs8Var = (rs8) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                bu5 bu5Var = (bu5) this.d;
                lea leaVar2 = rs8Var.a;
                leaVar2.e.k(rs8Var.e.d, savedStarGift);
                bu5Var.u();
                leaVar2.o();
                TL_stars.TL_starGiftCollection c = leaVar2.e.c(rs8Var.e.d);
                if (c != null) {
                    c41.b0(leaVar2.a).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131749970, wsa.t1(savedStarGift.gift), c.title))).j();
                    return;
                }
                return;
            case 7:
                rs8 rs8Var2 = (rs8) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                ox4 ox4Var = (ox4) this.d;
                if (rs8Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z = true;
                } else {
                    z = true;
                    ox4Var.d(false, true);
                    rs8Var2.e.q(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z;
                ox4Var.i(savedStarGift2, z, rs8Var2.d);
                rs8Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = rs8Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(rs8Var2.b).sendRequest(savestargift, null);
                return;
            case 8:
                ku8 ku8Var = (ku8) this.b;
                ku8Var.V = new fu8((d) this.c, (TL_wallet.card) this.d, (byte) 0);
                ku8Var.dismiss();
                return;
            case 9:
                iy8 iy8Var = (iy8) this.b;
                gx8 gx8Var = (gx8) this.c;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList2 = (ArrayList) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = gx8Var.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList3 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList3 == null || arrayList3 == arrayList2 || (wy8Var = iy8Var.d) == null || iy8Var.isFinished) {
                    return;
                }
                uy8 uy8Var = wy8Var.n;
                if (uy8Var != null && uy8Var.a == 0 && (i3 = uy8Var.f) >= 0) {
                    String[] strArr = le0.a;
                    if (i3 < strArr.length) {
                        str = strArr[i3];
                        i = wy8Var.M7;
                        if (i >= 0) {
                            String[] strArr2 = le0.a;
                            if (i < strArr2.length) {
                                str2 = strArr2[i];
                                if (le0.a(arrayList3)) {
                                    if (str2 != null) {
                                        i2 = 0;
                                        while (true) {
                                            String[] strArr3 = le0.a;
                                            if (i2 < strArr3.length) {
                                                if (!str2.equals(strArr3[i2])) {
                                                    i2++;
                                                }
                                            }
                                        }
                                    }
                                    i2 = wy8.F9;
                                    wy8Var.M7 = i2;
                                    if (str != null) {
                                        if (wy8Var.r != null) {
                                            wy8Var.r = null;
                                            wy8Var.s = 1.0f;
                                        }
                                        int i6 = 0;
                                        while (true) {
                                            String[] strArr4 = le0.a;
                                            if (i6 >= strArr4.length) {
                                                i6 = wy8.F9;
                                            } else if (!str.equals(strArr4[i6])) {
                                                i6++;
                                            }
                                        }
                                        wy8Var.n = wy8.t(i6);
                                        oo8 oo8Var = wy8Var.c;
                                        if (oo8Var != null) {
                                            ((iy8) oo8Var.b).Z();
                                        }
                                    }
                                    wy8Var.invalidate();
                                }
                                my8Var = iy8Var.e;
                                if (my8Var == null || my8Var.F) {
                                    return;
                                }
                                if (my8Var.E) {
                                    my8Var.j();
                                    return;
                                }
                                if (my8Var.y) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = my8Var.I;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                my8Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (le0.a(arrayList3)) {
                        }
                        my8Var = iy8Var.e;
                        if (my8Var == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = null;
                i = wy8Var.M7;
                if (i >= 0) {
                }
                str2 = null;
                if (le0.a(arrayList3)) {
                }
                my8Var = iy8Var.e;
                if (my8Var == null) {
                }
                break;
            case 10:
                wy8 wy8Var2 = (wy8) this.b;
                ty8 ty8Var = (ty8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (ty8Var.G || bitmap == null) {
                    return;
                }
                ty8Var.D = bitmap;
                wy8Var2.invalidate();
                return;
            case 11:
                w26 w26Var = (w26) this.b;
                s89 s89Var = (s89) this.c;
                String str5 = (String) this.d;
                if (w26Var != null) {
                    try {
                        if (((g36) w26Var).b.compareTo(v26.c) >= 0) {
                            s89Var.a();
                            return;
                        }
                    } catch (t41 e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str5), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + s89Var);
                return;
            case 12:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str6 = (String) this.c;
                try {
                    e.d(str6.concat(" onSuccess"), new wu2((Object) iOnDoneCallback, ((s89) this.d).a(), (Object) str6, (byte) 25));
                    return;
                } catch (RuntimeException e2) {
                    e.f(iOnDoneCallback, str6, e2);
                    rjb.m(e2);
                    return;
                } catch (t41 e3) {
                    e.f(iOnDoneCallback, str6, e3);
                    return;
                }
            case 13:
                qb9 qb9Var = (qb9) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.c;
                HashMap hashMap = qb9Var.m;
                HashMap hashMap2 = qb9Var.o;
                HashMap hashMap3 = qb9Var.n;
                ArrayList arrayList4 = qb9Var.h;
                ArrayList arrayList5 = qb9Var.g;
                ArrayList arrayList6 = qb9Var.f;
                int i7 = qb9Var.a;
                ArrayList arrayList7 = qb9Var.d;
                qb9Var.A = -1;
                if (tLObject2 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject2;
                    oc7.r1(i7).d4(resalestargifts.users, false);
                    oc7.r1(i7).X3(resalestargifts.chats, false);
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList7.clear();
                        qb9Var.u = 0;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList8 = resalestargifts.gifts;
                    int size2 = arrayList8.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        TL_stars.StarGift starGift = arrayList8.get(i8);
                        i8++;
                        TL_stars.StarGift starGift2 = starGift;
                        boolean z3 = z2;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            if (wsa.D1(i7, tL_starGiftUnique) || ((qb9Var.w || qb9Var.x) && fs7.m(tL_starGiftUnique))) {
                                qb9Var.u++;
                            } else {
                                arrayList7.add(tL_starGiftUnique);
                            }
                        }
                        z2 = z3;
                    }
                    boolean z4 = z2;
                    qb9Var.e = Math.max(arrayList7.size(), resalestargifts.count - qb9Var.u);
                    qb9Var.z = arrayList7.size() >= qb9Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    qb9Var.q = resalestargifts.next_offset;
                    qb9Var.y = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList9 = resalestargifts.attributes;
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        arrayList6.clear();
                        arrayList5.clear();
                        arrayList4.clear();
                        arrayList6.addAll(jva.j(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList5.addAll(jva.j(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList4.addAll(jva.j(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        qb9Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty() || TextUtils.isEmpty(getresalestargifts.offset)) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList10 = resalestargifts.counters;
                        int size3 = arrayList10.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList10.get(i9);
                            i9++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    qac qacVar = qb9Var.c;
                    if (qacVar != null) {
                        qacVar.a(Boolean.valueOf(z4));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ch9 ch9Var = (ch9) this.b;
                bu5 bu5Var2 = (bu5) this.c;
                kk9 kk9Var = (kk9) this.d;
                if (ch9Var.r4 == bu5Var2) {
                    ch9Var.r4 = null;
                    if (ch9Var.K3 && ch9Var.q4 == kk9Var && !kk9Var.I.isEmpty()) {
                        ch9Var.I2();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ch9 ch9Var2 = (ch9) this.b;
                ll0 ll0Var = (ll0) this.c;
                ll0 ll0Var2 = (ll0) this.d;
                ArrayList arrayList11 = ch9Var2.x4;
                qg9 qg9Var = ch9Var2.v3;
                if (qg9Var == null || ll0Var == null || ll0Var2 == null) {
                    return;
                }
                int indexOf = arrayList11.indexOf(ll0Var);
                int indexOf2 = arrayList11.indexOf(ll0Var2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList11.size(); i10++) {
                    ll0 ll0Var3 = (ll0) arrayList11.get(i10);
                    long j = ll0Var3.t;
                    if (j != 0) {
                        qg9Var.W(i10, zk9.l((TL_iv.RichText) ch9Var2.u3.get(Long.valueOf(j))));
                    } else {
                        qg9Var.W(i10, xk9.y(ll0Var3.b));
                    }
                }
                qg9Var.h0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 16:
                ((ch9) this.b).d5((ll0) this.c, (String) this.d);
                return;
            case 17:
                sk9 sk9Var = (sk9) this.b;
                ll0 ll0Var4 = (ll0) this.c;
                wk9 wk9Var = (wk9) this.d;
                uk9 uk9Var = sk9Var.a.E;
                if (uk9Var != null) {
                    ((mg9) uk9Var).d(ll0Var4, wk9Var.a, wk9Var.b, wk9Var.c, wk9Var.d, wk9Var.e);
                    return;
                }
                return;
            case 18:
                ll9 ll9Var = (ll9) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                String str7 = ll9Var.b;
                int i11 = ll9Var.a;
                if (tLObject3 != null) {
                    hs6.d0(i11).j1(str7, (TLRPC.Document) tLObject3, false);
                } else {
                    ll9Var.a();
                    hs6.d0(i11).j1(str7, null, true);
                    if (tL_error3 != null) {
                        nm7.f(i11).d(new il9(ll9Var, tL_error3, b2));
                    }
                }
                ll9Var.a();
                return;
            case 19:
                km9 km9Var = (km9) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                try {
                    km9Var.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 20:
                un9 un9Var = (un9) this.b;
                om9 om9Var = (om9) this.c;
                File file = (File) this.d;
                Handler handler = un9Var.i;
                try {
                    om9Var.c(file);
                    un9Var.g();
                    long h = om9Var.h();
                    un9Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file.length() + ", elapsedMs=" + un9.f(un9Var.N));
                    handler.post(new fn9(un9Var, h, b2));
                    return;
                } catch (Exception e4) {
                    handler.post(new en9(un9Var, e4, b));
                    return;
                }
            case 21:
                un9 un9Var2 = (un9) this.b;
                qn9 qn9Var = (qn9) this.c;
                File file2 = (File) this.d;
                rn9 rn9Var = un9Var2.e;
                long j2 = qn9Var.a;
                mib mibVar = (mib) rn9Var;
                synchronized (mibVar) {
                    if (mibVar.d) {
                        return;
                    }
                    mibVar.c.put(Long.valueOf(j2), new kib(file2));
                    return;
                }
            case 22:
                pp9 pp9Var = (pp9) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                String str8 = (String) this.c;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject4;
                    if (!TextUtils.isEmpty(exportedgroupcallinvite.link)) {
                        pp9Var.i(exportedgroupcallinvite.link, false);
                        return;
                    }
                }
                pp9Var.i(str8, true);
                return;
            case 23:
                pp9 pp9Var2 = (pp9) this.b;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.c;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported;
                    }
                    pp9Var2.i(tL_chatInviteExported.link, true);
                    return;
                }
                return;
            case 24:
                bq9 bq9Var = (bq9) this.b;
                aq9 aq9Var = (aq9) this.c;
                Runnable runnable = (Runnable) this.d;
                if (bq9Var.g != aq9Var) {
                    bq9Var.g = aq9Var;
                    h74 h74Var = bq9Var.f;
                    if (h74Var != null) {
                        if (bq9Var.o && aq9Var != null) {
                            surface = aq9Var.getSurface();
                        }
                        h74Var.r1(surface);
                        if (aq9Var != null) {
                            h74 h74Var2 = bq9Var.f;
                            h74Var2.y1();
                            jec jecVar = h74Var2.k0;
                            int i12 = jecVar.a;
                            if (i12 > 0 && (i4 = jecVar.b) > 0) {
                                aq9Var.a(i12, i4);
                            }
                        }
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                wr9 wr9Var = (wr9) this.b;
                cf7 cf7Var = (cf7) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    try {
                        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                        executeFast.requery();
                        executeFast.bindLong(1, 0L);
                        executeFast.step();
                        executeFast.dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        for (int i13 = 0; i13 < arrayList12.size(); i13++) {
                            vr9 vr9Var = (vr9) arrayList12.get(i13);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, vr9Var.a);
                            sQLitePreparedStatement.bindInteger(2, vr9Var.c());
                            sQLitePreparedStatement.bindInteger(3, vr9Var.c);
                            sQLitePreparedStatement.bindInteger(4, vr9Var.b ? i13 : 999);
                            sQLitePreparedStatement.bindInteger(5, vr9Var.i ? 1 : 0);
                            sQLitePreparedStatement.bindInteger(6, 0);
                            sQLitePreparedStatement.bindInteger(7, 0);
                            sQLitePreparedStatement.bindInteger(8, vr9Var.e);
                            sQLitePreparedStatement.bindLong(9, 0L);
                            sQLitePreparedStatement.bindLong(10, vr9Var.f);
                            sQLitePreparedStatement.bindLong(11, vr9Var.g);
                            sQLitePreparedStatement.bindLong(12, vr9Var.h);
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                    } catch (Exception e5) {
                        fc4.g(e5, true);
                        break;
                    }
                    sQLitePreparedStatement.dispose();
                    gm.c3(new ur9(wr9Var, b2));
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 26:
                bu9 bu9Var = (bu9) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                HashMap hashMap4 = (HashMap) this.d;
                bu9Var.q = arrayList13;
                bu9Var.r = hashMap4;
                bu9Var.s = true;
                bu9Var.a.a2(arrayList13);
                return;
            case 27:
                ju9 ju9Var = (ju9) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                int i14 = ju9Var.d;
                for (int i15 = 0; i15 < arrayList14.size(); i15++) {
                    er3 q = er3.q(i14);
                    k47 k47Var = (k47) arrayList14.get(i15);
                    if (k47Var != null && k47Var.F0() != null) {
                        gm.c3(new zq3(q, k47Var.F0(), k47Var, objArr == true ? 1 : 0));
                    }
                }
                if (!arrayList15.isEmpty()) {
                    er3.q(i14).j(arrayList15);
                }
                ju9Var.P = false;
                ju9Var.d(true);
                return;
            case 28:
                ov9 ov9Var = (ov9) this.b;
                nk3 nk3Var = (nk3) this.c;
                bu5 bu5Var3 = (bu5) this.d;
                if (z8c.h(ov9Var.L0.K0).p()) {
                    nk3Var.getMessagesController().l0(true);
                    ov9Var.S();
                    c41.b0(nk3Var).c(jb6.M0(2131754485, null)).j();
                } else {
                    new kj8((d) nk3Var, 3, true).show();
                }
                bu5Var3.u();
                return;
            default:
                dw9 dw9Var = (dw9) this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
                if (encryptedChat != null) {
                    dw9Var.getMessagesController().Z3(encryptedChat2, false);
                }
                dw9Var.getMessagesStorage().S1(encryptedChat2);
                dw9Var.getNotificationCenter().k(36, encryptedChat2);
                return;
        }
    }

    public /* synthetic */ ak8(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
    }
}
