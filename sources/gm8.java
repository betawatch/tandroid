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
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gm8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gm8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x021d, code lost:
    
        if (r7 == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:331:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:384:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        vw8 vw8Var;
        String str;
        int i;
        String str2;
        kw8 kw8Var;
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
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                cq1 cq1Var = (cq1) this.c;
                mu1 mu1Var = (mu1) this.d;
                RectF rectF = ProfileActivity.Z6;
                k72 k72Var = cq1Var.e;
                ViewGroup viewGroup = (ViewGroup) mu1Var.fragmentView;
                RectF rectF2 = zec.h;
                zec.c(k72Var, viewGroup, rectF2);
                profileActivity.k6 = rectF2.left;
                profileActivity.V1();
                return;
            case 1:
                u21.D((nf1) this.b, (TLRPC.User) this.c, ((TLRPC.Chat) this.d).title).j();
                return;
            case 2:
                lca lcaVar = (lca) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                d dVar = (d) this.d;
                lcaVar.I = -1;
                if (tL_error != null) {
                    u21.b0(dVar).g0(tL_error, false);
                    return;
                }
                return;
            case 3:
                pq8 pq8Var = (pq8) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                cs5 cs5Var = (cs5) this.d;
                lca lcaVar2 = pq8Var.a;
                lcaVar2.e.k(pq8Var.e.d, savedStarGift);
                cs5Var.u();
                lcaVar2.o();
                TL_stars.TL_starGiftCollection c = lcaVar2.e.c(pq8Var.e.d);
                if (c != null) {
                    u21.b0(lcaVar2.a).R(savedStarGift.gift.getDocument(), gl.S2(k96.a0(null, null, 2131750021, vqa.t1(savedStarGift.gift), c.title))).j();
                    return;
                }
                return;
            case 4:
                pq8 pq8Var2 = (pq8) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                nv4 nv4Var = (nv4) this.d;
                if (pq8Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z = true;
                } else {
                    z = true;
                    nv4Var.d(false, true);
                    pq8Var2.e.q(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z;
                nv4Var.i(savedStarGift2, z, pq8Var2.d);
                pq8Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = pq8Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(pq8Var2.b).sendRequest(savestargift, null);
                return;
            case 5:
                js8 js8Var = (js8) this.b;
                js8Var.V = new es8((d) this.c, (TL_wallet.card) this.d, (byte) 0);
                js8Var.dismiss();
                return;
            case 6:
                gw8 gw8Var = (gw8) this.b;
                fv8 fv8Var = (fv8) this.c;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList = (ArrayList) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = fv8Var.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList2 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList2 == null || arrayList2 == arrayList || (vw8Var = gw8Var.d) == null || gw8Var.isFinished) {
                    return;
                }
                tw8 tw8Var = vw8Var.n;
                if (tw8Var != null && tw8Var.a == 0 && (i3 = tw8Var.f) >= 0) {
                    String[] strArr = ld0.a;
                    if (i3 < strArr.length) {
                        str = strArr[i3];
                        i = vw8Var.M7;
                        if (i >= 0) {
                            String[] strArr2 = ld0.a;
                            if (i < strArr2.length) {
                                str2 = strArr2[i];
                                if (ld0.a(arrayList2)) {
                                    if (str2 != null) {
                                        i2 = 0;
                                        while (true) {
                                            String[] strArr3 = ld0.a;
                                            if (i2 < strArr3.length) {
                                                if (!str2.equals(strArr3[i2])) {
                                                    i2++;
                                                }
                                            }
                                        }
                                        vw8Var.M7 = i2;
                                        if (str != null) {
                                            if (vw8Var.r != null) {
                                                vw8Var.r = null;
                                                vw8Var.s = 1.0f;
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                String[] strArr4 = ld0.a;
                                                if (i5 >= strArr4.length) {
                                                    i5 = vw8.F9;
                                                } else if (!str.equals(strArr4[i5])) {
                                                    i5++;
                                                }
                                            }
                                            vw8Var.n = vw8.t(i5);
                                            z24 z24Var = vw8Var.c;
                                            if (z24Var != null) {
                                                ((gw8) z24Var.b).Y();
                                            }
                                        }
                                        vw8Var.invalidate();
                                    }
                                    i2 = vw8.F9;
                                    vw8Var.M7 = i2;
                                    if (str != null) {
                                    }
                                    vw8Var.invalidate();
                                }
                                kw8Var = gw8Var.e;
                                if (kw8Var == null || kw8Var.F) {
                                    return;
                                }
                                if (kw8Var.E) {
                                    kw8Var.j();
                                    return;
                                }
                                if (kw8Var.y) {
                                    return;
                                }
                                TLRPC.ShareTheme shareTheme = kw8Var.I;
                                if (!(shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) || (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) == 0) {
                                    return;
                                }
                                kw8Var.a(shareTheme);
                                return;
                            }
                        }
                        str2 = null;
                        if (ld0.a(arrayList2)) {
                        }
                        kw8Var = gw8Var.e;
                        if (kw8Var == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str = null;
                i = vw8Var.M7;
                if (i >= 0) {
                }
                str2 = null;
                if (ld0.a(arrayList2)) {
                }
                kw8Var = gw8Var.e;
                if (kw8Var == null) {
                }
                break;
            case 7:
                vw8 vw8Var2 = (vw8) this.b;
                sw8 sw8Var = (sw8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (sw8Var.G || bitmap == null) {
                    return;
                }
                sw8Var.D = bitmap;
                vw8Var2.invalidate();
                return;
            case 8:
                w06 w06Var = (w06) this.b;
                q69 q69Var = (q69) this.c;
                String str3 = (String) this.d;
                if (w06Var != null) {
                    try {
                        if (((g16) w06Var).b.compareTo(v06.c) >= 0) {
                            q69Var.a();
                            return;
                        }
                    } catch (l31 e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str3), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + q69Var);
                return;
            case 9:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str4 = (String) this.c;
                try {
                    e.d(str4.concat(" onSuccess"), new lt2((Object) iOnDoneCallback, ((q69) this.d).a(), (Object) str4, (byte) 25));
                    return;
                } catch (RuntimeException e2) {
                    e.f(iOnDoneCallback, str4, e2);
                    sdb.b(e2);
                    return;
                } catch (l31 e3) {
                    e.f(iOnDoneCallback, str4, e3);
                    return;
                }
            case 10:
                q99 q99Var = (q99) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = q99Var.m;
                HashMap hashMap2 = q99Var.o;
                HashMap hashMap3 = q99Var.n;
                ArrayList arrayList3 = q99Var.h;
                ArrayList arrayList4 = q99Var.g;
                ArrayList arrayList5 = q99Var.f;
                int i6 = q99Var.a;
                ArrayList arrayList6 = q99Var.d;
                q99Var.A = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    na7.q1(i6).b4(resalestargifts.users, false);
                    na7.q1(i6).V3(resalestargifts.chats, false);
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList6.clear();
                        q99Var.u = 0;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList7 = resalestargifts.gifts;
                    int size = arrayList7.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TL_stars.StarGift starGift = arrayList7.get(i7);
                        i7++;
                        TL_stars.StarGift starGift2 = starGift;
                        boolean z3 = z2;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            if (vqa.D1(i6, tL_starGiftUnique) || ((q99Var.w || q99Var.x) && cq7.m(tL_starGiftUnique))) {
                                q99Var.u++;
                            } else {
                                arrayList6.add(tL_starGiftUnique);
                            }
                        }
                        z2 = z3;
                    }
                    boolean z4 = z2;
                    q99Var.e = Math.max(arrayList6.size(), resalestargifts.count - q99Var.u);
                    q99Var.z = arrayList6.size() >= q99Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    q99Var.q = resalestargifts.next_offset;
                    q99Var.y = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList8 = resalestargifts.attributes;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        arrayList5.clear();
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList5.addAll(gta.j(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList4.addAll(gta.j(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList3.addAll(gta.j(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        q99Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty() || TextUtils.isEmpty(getresalestargifts.offset)) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList9 = resalestargifts.counters;
                        int size2 = arrayList9.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList9.get(i8);
                            i8++;
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
                    p8c p8cVar = q99Var.c;
                    if (p8cVar != null) {
                        p8cVar.a(Boolean.valueOf(z4));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ye9 ye9Var = (ye9) this.b;
                cs5 cs5Var2 = (cs5) this.c;
                ii9 ii9Var = (ii9) this.d;
                if (ye9Var.r4 == cs5Var2) {
                    ye9Var.r4 = null;
                    if (ye9Var.K3 && ye9Var.q4 == ii9Var && !ii9Var.I.isEmpty()) {
                        ye9Var.I2();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ye9 ye9Var2 = (ye9) this.b;
                lk0 lk0Var = (lk0) this.c;
                lk0 lk0Var2 = (lk0) this.d;
                ArrayList arrayList10 = ye9Var2.x4;
                me9 me9Var = ye9Var2.v3;
                if (me9Var == null || lk0Var == null || lk0Var2 == null) {
                    return;
                }
                int indexOf = arrayList10.indexOf(lk0Var);
                int indexOf2 = arrayList10.indexOf(lk0Var2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                for (int i9 = 0; i9 < arrayList10.size(); i9++) {
                    lk0 lk0Var3 = (lk0) arrayList10.get(i9);
                    long j = lk0Var3.t;
                    if (j != 0) {
                        me9Var.W(i9, yi9.l((TL_iv.RichText) ye9Var2.u3.get(Long.valueOf(j))));
                    } else {
                        me9Var.W(i9, wi9.y(lk0Var3.b));
                    }
                }
                me9Var.h0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 13:
                ((ye9) this.b).d5((lk0) this.c, (String) this.d);
                return;
            case 14:
                qi9 qi9Var = (qi9) this.b;
                lk0 lk0Var4 = (lk0) this.c;
                vi9 vi9Var = (vi9) this.d;
                ti9 ti9Var = qi9Var.a.E;
                if (ti9Var != null) {
                    ((ie9) ti9Var).d(lk0Var4, vi9Var.a, vi9Var.b, vi9Var.c, vi9Var.d, vi9Var.e);
                    return;
                }
                return;
            case 15:
                jj9 jj9Var = (jj9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str5 = jj9Var.b;
                int i10 = jj9Var.a;
                if (tLObject2 != null) {
                    hq6.d0(i10).j1(str5, (TLRPC.Document) tLObject2, false);
                } else {
                    jj9Var.a();
                    hq6.d0(i10).j1(str5, null, true);
                    if (tL_error2 != null) {
                        kk7.f(i10).d(new lw8(jj9Var, tL_error2, (byte) 29));
                    }
                }
                jj9Var.a();
                return;
            case 16:
                jk9 jk9Var = (jk9) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                try {
                    jk9Var.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 17:
                ul9 ul9Var = (ul9) this.b;
                nk9 nk9Var = (nk9) this.c;
                File file = (File) this.d;
                Handler handler = ul9Var.i;
                try {
                    nk9Var.c(file);
                    ul9Var.g();
                    long h = nk9Var.h();
                    ul9Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file.length() + ", elapsedMs=" + ul9.f(ul9Var.N));
                    handler.post(new fl9(ul9Var, h, b2));
                    return;
                } catch (Exception e4) {
                    handler.post(new el9(ul9Var, e4, b));
                    return;
                }
            case 18:
                ul9 ul9Var2 = (ul9) this.b;
                ql9 ql9Var = (ql9) this.c;
                File file2 = (File) this.d;
                rl9 rl9Var = ul9Var2.e;
                long j2 = ql9Var.a;
                lgb lgbVar = (lgb) rl9Var;
                synchronized (lgbVar) {
                    if (lgbVar.d) {
                        return;
                    }
                    lgbVar.c.put(Long.valueOf(j2), new jgb(file2));
                    return;
                }
            case 19:
                on9 on9Var = (on9) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                String str6 = (String) this.d;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject3;
                    if (!TextUtils.isEmpty(exportedgroupcallinvite.link)) {
                        on9Var.i(exportedgroupcallinvite.link, false);
                        return;
                    }
                }
                on9Var.i(str6, true);
                return;
            case 20:
                on9 on9Var2 = (on9) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    on9Var2.i(tL_chatInviteExported.link, true);
                    return;
                }
                return;
            case 21:
                ao9 ao9Var = (ao9) this.b;
                zn9 zn9Var = (zn9) this.c;
                Runnable runnable = (Runnable) this.d;
                if (ao9Var.g != zn9Var) {
                    ao9Var.g = zn9Var;
                    y54 y54Var = ao9Var.f;
                    if (y54Var != null) {
                        if (ao9Var.o && zn9Var != null) {
                            surface = zn9Var.getSurface();
                        }
                        y54Var.r1(surface);
                        if (zn9Var != null) {
                            y54 y54Var2 = ao9Var.f;
                            y54Var2.y1();
                            icc iccVar = y54Var2.k0;
                            int i11 = iccVar.a;
                            if (i11 > 0 && (i4 = iccVar.b) > 0) {
                                zn9Var.a(i11, i4);
                            }
                        }
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 22:
                vp9 vp9Var = (vp9) this.b;
                ad7 ad7Var = (ad7) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    try {
                        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                        executeFast.requery();
                        executeFast.bindLong(1, 0L);
                        executeFast.step();
                        executeFast.dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        for (int i12 = 0; i12 < arrayList11.size(); i12++) {
                            up9 up9Var = (up9) arrayList11.get(i12);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, up9Var.a);
                            sQLitePreparedStatement.bindInteger(2, up9Var.c());
                            sQLitePreparedStatement.bindInteger(3, up9Var.c);
                            sQLitePreparedStatement.bindInteger(4, up9Var.b ? i12 : 999);
                            sQLitePreparedStatement.bindInteger(5, up9Var.i ? 1 : 0);
                            sQLitePreparedStatement.bindInteger(6, 0);
                            sQLitePreparedStatement.bindInteger(7, 0);
                            sQLitePreparedStatement.bindInteger(8, up9Var.e);
                            sQLitePreparedStatement.bindLong(9, 0L);
                            sQLitePreparedStatement.bindLong(10, up9Var.f);
                            sQLitePreparedStatement.bindLong(11, up9Var.g);
                            sQLitePreparedStatement.bindLong(12, up9Var.h);
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                    } catch (Exception e5) {
                        fa4.g(e5, true);
                        break;
                    }
                    sQLitePreparedStatement.dispose();
                    gl.c3(new tp9(vp9Var, b2));
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 23:
                zr9 zr9Var = (zr9) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                HashMap hashMap4 = (HashMap) this.d;
                zr9Var.q = arrayList12;
                zr9Var.r = hashMap4;
                zr9Var.s = true;
                zr9Var.a.m2(arrayList12);
                return;
            case 24:
                hs9 hs9Var = (hs9) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                int i13 = hs9Var.d;
                for (int i14 = 0; i14 < arrayList13.size(); i14++) {
                    up3 q = up3.q(i13);
                    k27 k27Var = (k27) arrayList13.get(i14);
                    if (k27Var != null && k27Var.F0() != null) {
                        gl.c3(new pp3(q, k27Var.F0(), k27Var, objArr == true ? 1 : 0));
                    }
                }
                if (!arrayList14.isEmpty()) {
                    up3.q(i13).j(arrayList14);
                }
                hs9Var.P = false;
                hs9Var.d(true);
                return;
            case 25:
                mt9 mt9Var = (mt9) this.b;
                cj3 cj3Var = (cj3) this.c;
                cs5 cs5Var3 = (cs5) this.d;
                if (y6c.h(mt9Var.L0.K0).p()) {
                    cj3Var.getMessagesController().l0(true);
                    mt9Var.S();
                    u21.b0(cj3Var).c(k96.M0(2131754485, null)).j();
                } else {
                    new jh8((d) cj3Var, 3, true).show();
                }
                cs5Var3.u();
                return;
            case 26:
                bu9 bu9Var = (bu9) this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
                if (encryptedChat != null) {
                    bu9Var.getMessagesController().X3(encryptedChat2, false);
                }
                bu9Var.getMessagesStorage().S1(encryptedChat2);
                bu9Var.getNotificationCenter().k(35, encryptedChat2);
                return;
            case 27:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                bl1 bl1Var = (bl1) this.c;
                k27 k27Var2 = (k27) this.d;
                secretMediaViewer.l0 = (byte) 0;
                secretMediaViewer.J0 = null;
                if (bl1Var != null) {
                    bl1Var.run();
                }
                st stVar = secretMediaViewer.e;
                if (stVar != null) {
                    stVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    iu9 iu9Var = secretMediaViewer.n;
                    TLRPC.Message message = k27Var2.k;
                    long j3 = message.destroyTimeMillis;
                    long j4 = message.ttl;
                    int i15 = iu9.E;
                    iu9Var.e = false;
                    iu9Var.f = j3;
                    iu9Var.h = j4;
                    iu9Var.n.start();
                    iu9Var.invalidate();
                    if (secretMediaViewer.g1) {
                        secretMediaViewer.c(true, true);
                        return;
                    } else {
                        if (!secretMediaViewer.p1 || na7.c1().getInt("viewoncehint", 0) >= 3) {
                            return;
                        }
                        secretMediaViewer.m();
                        return;
                    }
                }
                return;
            case 28:
                z3a z3aVar = (z3a) this.b;
                String str7 = (String) this.c;
                Runnable runnable2 = (Runnable) this.d;
                z3aVar.w.remove(str7);
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                o3a o3aVar = (o3a) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
                p3a p3aVar = o3aVar.b;
                z3a z3aVar2 = p3aVar.q;
                z3aVar2.E.l(p3aVar.j);
                if (tL_error3 == null) {
                    z3aVar2.getNotificationCenter().k(kk7.u1, Long.valueOf(p3aVar.j));
                    return;
                } else {
                    z3aVar2.getNotificationCenter().k(kk7.u1, Long.valueOf(p3aVar.j), tL_messages_startHistoryImport, tL_error3);
                    return;
                }
        }
    }
}
