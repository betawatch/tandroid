// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lw3(n64 n64Var, SurfaceTexture surfaceTexture) {
        this.a = (byte) 9;
        this.b = n64Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        int i2;
        TLRPC.TL_messages_reportFeedEvents tL_messages_reportFeedEvents;
        z94 z94Var;
        TLRPC.Document document;
        int i3 = 0;
        switch (this.a) {
            case 0:
                nw3 nw3Var = (nw3) this.b;
                ArrayList arrayList = nw3Var.w;
                ArrayList arrayList2 = nw3Var.s;
                ow3 ow3Var = nw3Var.O;
                zw3 zw3Var = ow3Var.s;
                int i4 = zw3.C1;
                ls6 d0 = ls6.d0(zw3Var.a);
                String str = nw3Var.I;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (ow3Var.a == 1 && pv3.d(nw3Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = nw3Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(zw3Var.a).sendRequest(tL_messages_getStickers, new mw3(nw3Var, str, (byte) 0));
                        return;
                    }
                    String[] F0 = hl.F0();
                    String[] strArr = nw3Var.K;
                    if (strArr == null || !Arrays.equals(F0, strArr)) {
                        ls6.d0(zw3Var.a).O(F0, false);
                    }
                    nw3Var.K = F0;
                    d0.X(F0, nw3Var.I, false, new fu2((Object) nw3Var, (Object) str, (Object) d0, (byte) 8), false, false, false, true, 50);
                    return;
                }
                ArrayList j0 = d0.j0(7, false);
                nw3Var.y = 0;
                arrayList2.clear();
                arrayList.clear();
                nw3Var.E.clear();
                nw3Var.n.clear();
                nw3Var.y++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(j0);
                nw3Var.y = j0.size() + nw3Var.y;
                nw3Var.J = nw3Var.I;
                nw3Var.f();
                dw3 dw3Var = ow3Var.b;
                int i5 = dw3.q3;
                dw3Var.A1(0, 0);
                ow3Var.f.c(false);
                ow3Var.e.n(false);
                return;
            case 1:
                sw3 sw3Var = (sw3) ((c7) this.b).b;
                if (sw3Var.n) {
                    return;
                }
                sw3Var.r.setVisibility(8);
                return;
            case 2:
                ww3 ww3Var = (ww3) ((vw3) this.b).b;
                ArrayList arrayList3 = ww3Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                ww3Var.l.e(true, 0.0f);
                int i6 = ww3Var.k + 1;
                ww3Var.k = i6;
                if (i6 > arrayList3.size() - 1) {
                    ww3Var.k = 0;
                }
                p39 p39Var = ww3Var.j;
                p39Var.e((w49) arrayList3.get(ww3Var.k));
                ww3Var.j = ww3Var.i;
                ww3Var.i = p39Var;
                ww3Var.p.invalidate();
                return;
            case 3:
                ((hy3) this.b).a(true, true);
                return;
            case 4:
                n04 n04Var = (n04) this.b;
                if (n04Var.a0.getEmojiView() != null) {
                    o24 emojiView = n04Var.a0.getEmojiView();
                    if (emojiView.g0) {
                        return;
                    }
                    try {
                        SparseIntArray sparseIntArray = emojiView.S.s;
                        char[] cArr = jx3.a;
                        int i7 = sparseIntArray.get(8);
                        if (i7 > 0) {
                            emojiView.Q.E0();
                            emojiView.U(i7);
                            emojiView.E(i7, hl.L(-9.0f));
                            emojiView.j(0, null);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 5:
                n14 n14Var = (n14) this.b;
                o14 o14Var = n14Var.a;
                if (o14Var.G.W.G) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                o14Var.G.W.d(true);
                o14Var.F(new vx3(n14Var, arrayList4, (byte) 4), arrayList4, true);
                return;
            case 6:
                g14 g14Var = (g14) this.b;
                g14Var.x.f = true;
                g14Var.a(true);
                return;
            case 7:
                hl.P3(((c24) this.b).h, true, true);
                return;
            case 8:
                s64 s64Var = (s64) this.b;
                lo loVar = s64Var.C;
                Context context = s64Var.e;
                String str2 = gcc.a;
                int generateAudioSessionId = j00.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                loVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((xgb) loVar.c).a.getLooper()) {
                    obj = loVar.e;
                } else {
                    yve.p(myLooper == ((xgb) loVar.b).a.getLooper());
                    obj = loVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    loVar.f = valueOf;
                    zd0 zd0Var = new zd0(loVar, valueOf, (byte) 0);
                    xgb xgbVar = (xgb) loVar.c;
                    if (xgbVar.a.getLooper().getThread().isAlive()) {
                        xgbVar.e(zd0Var);
                    }
                    xgb xgbVar2 = s64Var.l.h;
                    wgb b = xgbVar2.b(40, generateAudioSessionId, 0);
                    Handler handler = xgbVar2.a;
                    Message message = b.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    b.a();
                    return;
                }
                return;
            case 9:
                s64 s64Var2 = ((n64) this.b).a;
                s64Var2.q1(null);
                s64Var2.f1(0, 0);
                return;
            case 10:
                mg8 mg8Var = (mg8) this.b;
                try {
                    synchronized (mg8Var) {
                    }
                    try {
                        mg8Var.a.d(mg8Var.c, mg8Var.d);
                        mg8Var.a(true);
                        return;
                    } catch (Throwable th) {
                        mg8Var.a(true);
                        throw th;
                    }
                } catch (e64 e) {
                    efd.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    grb.m(e);
                    return;
                }
            case 11:
                new wqa(((xd5) this.b).getContext()).show();
                return;
            case 12:
                int i8 = 0;
                q84 q84Var = (q84) this.b;
                LongSparseArray longSparseArray = q84Var.c;
                while (longSparseArray.size() > 0) {
                    int i9 = i8;
                    long keyAt = longSparseArray.keyAt(i9);
                    HashMap hashMap = (HashMap) longSparseArray.valueAt(i9);
                    longSparseArray.removeAt(i9);
                    ArrayList arrayList5 = new ArrayList(hashMap.keySet());
                    q84Var.d.addAll(arrayList5);
                    r4c r4cVar = new r4c((Object) q84Var, keyAt, (Object) arrayList5, (Object) hashMap, (byte) 4);
                    if (arrayList5.isEmpty()) {
                        r4cVar.a(new ArrayList());
                    } else {
                        kf7 a0 = kf7.a0(q84Var.a);
                        a0.a.c(new cv2(a0, arrayList5, r4cVar, (byte) 24));
                    }
                    i8 = 0;
                }
                longSparseArray.clear();
                return;
            case 13:
                ((v94) this.b).requestLayout();
                return;
            case 14:
                ((w94) this.b).b();
                return;
            case 15:
                ((da4) this.b).a();
                return;
            case 16:
                String str3 = "feed.likePost";
                ja4 ja4Var = (ja4) this.b;
                HashMap hashMap2 = ja4Var.c;
                ca4 ca4Var = ja4Var.a;
                String str4 = ca4Var.a;
                ArrayList arrayList6 = ja4Var.b;
                ja4Var.h = false;
                ja4Var.g = false;
                if (ja4Var.f) {
                    return;
                }
                ja4Var.b();
                int i10 = yac.t0;
                for (int i11 = 0; i11 < 4; i11++) {
                    if (str4.equals(ea4.i(i11))) {
                        i10 = i11;
                    }
                }
                int g = ea4.g(i10);
                int size = arrayList6.size();
                Iterator it = arrayList6.iterator();
                while (it.hasNext()) {
                    ha4 ha4Var = (ha4) it.next();
                    int i12 = g - ha4Var.j;
                    Integer num = ha4Var.i;
                    if (i12 - (num != null ? num.intValue() / 1000 : 0) >= 3600) {
                        ha4Var.toString();
                        it.remove();
                        hashMap2.remove(Long.valueOf(ha4Var.c));
                    }
                }
                if (arrayList6.size() < size) {
                    ja4Var.c();
                }
                if (arrayList6.isEmpty()) {
                    return;
                }
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                int size2 = arrayList6.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    ha4 ha4Var2 = (ha4) obj2;
                    int i14 = size2;
                    (hashMap2.containsKey(Long.valueOf(ha4Var2.c)) ? arrayList8 : arrayList7).add(ha4Var2);
                    size2 = i14;
                }
                arrayList6.clear();
                arrayList6.addAll(arrayList7);
                arrayList6.addAll(arrayList8);
                int min = arrayList7.isEmpty() ? 1 : Math.min(ja4Var.j, arrayList7.size());
                for (int i15 = 0; i15 < min; i15++) {
                    ha4 ha4Var3 = (ha4) arrayList6.get(i15);
                    if (ha4Var3.g.equals("feed.likePost") || ha4Var3.g.equals("feed.dislikePost")) {
                        min = Math.max(1, i15);
                    }
                }
                ArrayList arrayList9 = new ArrayList(arrayList6.subList(0, min));
                ja4Var.f = true;
                int i16 = ja4Var.k + 1;
                ja4Var.k = i16;
                bf bfVar = new bf((Object) ja4Var, i16, (Object) arrayList9, (byte) 5);
                int i17 = -1;
                for (int i18 = 0; i18 < 4; i18++) {
                    if (str4.equals(ea4.i(i18))) {
                        i17 = i18;
                    }
                }
                if (i17 >= 0) {
                    TLRPC.TL_messages_reportFeedEvents tL_messages_reportFeedEvents2 = new TLRPC.TL_messages_reportFeedEvents();
                    int size3 = arrayList9.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj3 = arrayList9.get(i19);
                        int i20 = i19 + 1;
                        ha4 ha4Var4 = (ha4) obj3;
                        long j = ha4Var4.a;
                        fa4 fa4Var = ha4Var4.f;
                        i2 = i3;
                        int i21 = ha4Var4.d;
                        String str5 = str3;
                        int i22 = size3;
                        i = i16;
                        TLRPC.InputPeer j2 = ea4.j(i17, j, ha4Var4.b, ha4Var4.k, ha4Var4.l);
                        if (j2 == null) {
                            ea4.e.postRunnable(new ba4(bfVar, (byte) 1), 0L);
                        } else {
                            if (ha4Var4.g.equals(str5) || ha4Var4.g.equals("feed.dislikePost")) {
                                TL_feed.TL_feed_likePost tL_feed_likePost = new TL_feed.TL_feed_likePost();
                                TL_feed.TL_feed_dislikePost tL_feed_dislikePost = new TL_feed.TL_feed_dislikePost();
                                tL_feed_dislikePost.peer = j2;
                                tL_feed_likePost.peer = j2;
                                tL_feed_dislikePost.msg_id = i21;
                                tL_feed_likePost.msg_id = i21;
                                tL_messages_reportFeedEvents = tL_feed_dislikePost;
                                if (ha4Var4.g.equals(str5)) {
                                    tL_messages_reportFeedEvents = tL_feed_likePost;
                                }
                                int[] iArr = {i2};
                                int i23 = i17;
                                hl.c3(new l77((Object) ca4Var, (Object) iArr, i23, (Object) tL_messages_reportFeedEvents, (Object) bfVar, (byte) 14));
                                z94Var = new z94((byte) 1, i23, iArr);
                                ea4.e.postRunnable(new gp6((Object) ja4Var, i, (Object) z94Var, (Object) arrayList9, (byte) 23), 60000L);
                                return;
                            }
                            TLRPC.TL_inputFeedEvent tL_inputFeedEvent = new TLRPC.TL_inputFeedEvent();
                            tL_inputFeedEvent.peer = j2;
                            tL_inputFeedEvent.msg_id = i21;
                            tL_inputFeedEvent.action = ha4Var4.g;
                            tL_inputFeedEvent.surface = ha4Var4.e;
                            tL_inputFeedEvent.flags = 96;
                            if (fa4Var != null) {
                                String str6 = fa4Var.c;
                                int i24 = str6 != null ? 4 : i2;
                                Long l = fa4Var.a;
                                tL_inputFeedEvent.flags = 96 | i24 | (l != null ? 3 : i2);
                                tL_inputFeedEvent.recommendation_id = l != null ? l.longValue() : 0L;
                                tL_inputFeedEvent.recommendation_rank = fa4Var.b;
                                tL_inputFeedEvent.recommendation_role = str6;
                            }
                            String str7 = ha4Var4.h;
                            if (str7 != null) {
                                tL_inputFeedEvent.flags |= 8;
                                tL_inputFeedEvent.kind = str7;
                            }
                            Integer num2 = ha4Var4.i;
                            if (num2 != null) {
                                tL_inputFeedEvent.flags |= 16;
                                tL_inputFeedEvent.duration_ms = num2.intValue();
                            }
                            tL_inputFeedEvent.event_time = ha4Var4.j;
                            tL_inputFeedEvent.random_id = ha4Var4.c;
                            tL_messages_reportFeedEvents2.events.add(tL_inputFeedEvent);
                            size3 = i22;
                            str3 = str5;
                            i3 = i2;
                            i19 = i20;
                            i16 = i;
                        }
                    }
                    i = i16;
                    i2 = i3;
                    tL_messages_reportFeedEvents = tL_messages_reportFeedEvents2;
                    int[] iArr2 = {i2};
                    int i232 = i17;
                    hl.c3(new l77((Object) ca4Var, (Object) iArr2, i232, (Object) tL_messages_reportFeedEvents, (Object) bfVar, (byte) 14));
                    z94Var = new z94((byte) 1, i232, iArr2);
                    ea4.e.postRunnable(new gp6((Object) ja4Var, i, (Object) z94Var, (Object) arrayList9, (byte) 23), 60000L);
                    return;
                }
                ea4.e.postRunnable(new ba4(bfVar, false ? 1 : 0), 0L);
                i = i16;
                z94Var = null;
                ea4.e.postRunnable(new gp6((Object) ja4Var, i, (Object) z94Var, (Object) arrayList9, (byte) 23), 60000L);
                return;
            case 17:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 18:
                ic4 ic4Var = (ic4) this.b;
                ic4Var.c();
                try {
                    ic4Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    ic4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 19:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList10 = aob.F;
                int size4 = arrayList10.size();
                for (int i25 = 0; i25 < size4; i25++) {
                    TLRPC.TL_theme tL_theme2 = ((znb) arrayList10.get(i25)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 == null || (document = tL_theme.document) == null) {
                            return;
                        }
                        document2.file_reference = document.file_reference;
                        aob.w1(true, false);
                        return;
                    }
                }
                return;
            case 20:
                rd4 rd4Var = (rd4) this.b;
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) rd4Var.b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 21:
                ((je4) this.b).i0(true);
                return;
            case 22:
                ((he4) this.b).a.getBackground().setState(new int[0]);
                return;
            case 23:
                fg4 fg4Var = (fg4) ((eg4) this.b).g;
                ArrayList arrayList11 = fg4Var.h;
                if (yac.h(yac.t0).p()) {
                    return;
                }
                int i26 = 0;
                while (i26 < arrayList11.size()) {
                    if (((bg4) arrayList11.get(i26)).e && i26 != 0) {
                        t20 t20Var = fg4Var.J;
                        fg4 fg4Var2 = (fg4) t20Var.e;
                        ArrayList arrayList12 = fg4Var2.h;
                        SparseIntArray sparseIntArray2 = fg4Var2.m0;
                        int size5 = arrayList12.size();
                        if (i26 >= 0 && i26 < size5) {
                            ArrayList T0 = uc7.s1(yac.t0).T0();
                            int i27 = sparseIntArray2.get(i26);
                            int i28 = ((bg4) arrayList12.get(i26)).a;
                            for (int i29 = i26 - 1; i29 >= 0; i29--) {
                                sparseIntArray2.put(i29 + 1, sparseIntArray2.get(i29));
                            }
                            ac7 ac7Var = (ac7) T0.remove(i26);
                            ac7Var.f = 0;
                            T0.add(0, ac7Var);
                            sparseIntArray2.put(0, i27);
                            arrayList12.add(0, (bg4) arrayList12.remove(i26));
                            ((bg4) arrayList12.get(0)).a = i28;
                            for (int i30 = 0; i30 <= i26; i30++) {
                                ((bg4) arrayList12.get(i30)).a = i30;
                                ((ac7) T0.get(i30)).f = i30;
                            }
                            int i31 = 0;
                            while (i31 <= i26) {
                                if (fg4Var2.L == i31) {
                                    int i32 = i31 == i26 ? 0 : i31 + 1;
                                    fg4Var2.M = i32;
                                    fg4Var2.L = i32;
                                }
                                if (fg4Var2.s0 == i31) {
                                    int i33 = i31 == i26 ? 0 : i31 + 1;
                                    fg4Var2.t0 = i33;
                                    fg4Var2.s0 = i33;
                                }
                                i31++;
                            }
                            t20Var.j(i26, 0);
                            fg4Var2.K.p(((bg4) arrayList12.get(i26)).a, i28);
                            fg4Var2.o();
                            fg4Var2.E = true;
                            fg4Var2.G.setItemAnimator(fg4Var2.u0);
                        }
                        fg4Var.G.x0(0);
                        fg4Var.g();
                        return;
                    }
                    i26++;
                }
                return;
            case 24:
                yg4 yg4Var = (yg4) this.b;
                hl.r(yg4Var.o0);
                yg4Var.a.a(false, true);
                return;
            case 25:
                yg4 yg4Var2 = ((mg4) this.b).a;
                yg4Var2.h(yg4Var2.F, yg4Var2.G, yg4Var2.I, yg4Var2.H, yg4Var2.E, yg4Var2.K, yg4Var2.x, false);
                return;
            case 26:
                ((FiltersSetupActivity) ((gu) this.b).g3).getMessagesController().q3();
                return;
            case 27:
                eh4 eh4Var = (eh4) this.b;
                eh4Var.s.a();
                eh4Var.n.invalidate();
                eh4Var.I.f0(true);
                return;
            case 28:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((eg4) this.b).g;
                if (!yac.h(yac.t0).p()) {
                    ArrayList T02 = filtersSetupActivity.getMessagesController().T0();
                    int i34 = 0;
                    while (true) {
                        if (i34 < T02.size()) {
                            if (!((ac7) T02.get(i34)).d() || i34 == 0) {
                                i34++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList13 = filtersSetupActivity2.getMessagesController().G0;
                                if (i34 >= 0 && i34 < arrayList13.size()) {
                                    arrayList13.add(0, (ac7) arrayList13.remove(i34));
                                    for (int i35 = 0; i35 <= i34; i35++) {
                                        ((ac7) arrayList13.get(i35)).f = i35;
                                    }
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.f0(true);
                                }
                                filtersSetupActivity.a.x0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                d31.b0(filtersSetupActivity).J(R.raw.filter_reorder, hl.S2(ob6.a0("LimitReachedReorderFolder", null, 2131748698, ob6.M0(2131750772, null))), ob6.M0(2131746762, null), 5000, false, new bh4(filtersSetupActivity, (byte) 2)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.e0(null);
                return;
            default:
                ((CancellationSignal) this.b).cancel();
                return;
        }
    }

    public /* synthetic */ lw3(c74 c74Var, mg8 mg8Var) {
        this.a = (byte) 10;
        this.b = mg8Var;
    }

    public /* synthetic */ lw3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
