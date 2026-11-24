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
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a14 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a14(c74 c74Var, SurfaceTexture surfaceTexture) {
        this.a = (byte) 5;
        this.b = c74Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        da4 da4Var;
        int i2;
        String str;
        long j;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                d14 d14Var = (d14) this.b;
                if (d14Var.a0.getEmojiView() != null) {
                    e34 emojiView = d14Var.a0.getEmojiView();
                    if (emojiView.g0) {
                        return;
                    }
                    try {
                        SparseIntArray sparseIntArray = emojiView.S.s;
                        char[] cArr = zx3.a;
                        int i3 = sparseIntArray.get(8);
                        if (i3 > 0) {
                            emojiView.Q.D0();
                            emojiView.U(i3);
                            emojiView.E(i3, gm.L(-9.0f));
                            emojiView.j(0, null);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                d24 d24Var = (d24) this.b;
                e24 e24Var = d24Var.a;
                if (e24Var.G.W.G) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                e24Var.G.W.d(true);
                e24Var.F(new pv3(d24Var, arrayList, (byte) 9), arrayList, true);
                return;
            case 2:
                w14 w14Var = (w14) this.b;
                w14Var.x.f = true;
                w14Var.a(true);
                return;
            case 3:
                gm.P3(((s24) this.b).h, true, true);
                return;
            case 4:
                h74 h74Var = (h74) this.b;
                kp kpVar = h74Var.C;
                Context context = h74Var.e;
                String str2 = hac.a;
                int generateAudioSessionId = i10.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                kpVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((dfb) kpVar.c).a.getLooper()) {
                    obj = kpVar.e;
                } else {
                    jte.p(myLooper == ((dfb) kpVar.b).a.getLooper());
                    obj = kpVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    kpVar.f = valueOf;
                    xe0 xe0Var = new xe0(kpVar, valueOf, (byte) 0);
                    dfb dfbVar = (dfb) kpVar.c;
                    if (dfbVar.a.getLooper().getThread().isAlive()) {
                        dfbVar.e(xe0Var);
                    }
                    dfb dfbVar2 = h74Var.l.h;
                    cfb b = dfbVar2.b(40, generateAudioSessionId, 0);
                    Handler handler = dfbVar2.a;
                    Message message = b.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    b.a();
                    return;
                }
                return;
            case 5:
                h74 h74Var2 = ((c74) this.b).a;
                h74Var2.q1(null);
                h74Var2.f1(0, 0);
                return;
            case 6:
                af8 af8Var = (af8) this.b;
                try {
                    synchronized (af8Var) {
                    }
                    try {
                        af8Var.a.d(af8Var.c, af8Var.d);
                        af8Var.a(true);
                        return;
                    } catch (Throwable th) {
                        af8Var.a(true);
                        throw th;
                    }
                } catch (u64 e) {
                    ncd.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    rjb.m(e);
                    return;
                }
            case 7:
                new apa(((ud5) this.b).getContext()).show();
                return;
            case 8:
                e94 e94Var = (e94) this.b;
                LongSparseArray longSparseArray = e94Var.c;
                while (longSparseArray.size() > 0) {
                    long keyAt = longSparseArray.keyAt(0);
                    HashMap hashMap = (HashMap) longSparseArray.valueAt(0);
                    longSparseArray.removeAt(0);
                    ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                    e94Var.d.addAll(arrayList2);
                    s2c s2cVar = new s2c((Object) e94Var, keyAt, (Object) arrayList2, (Object) hashMap, (byte) 4);
                    if (arrayList2.isEmpty()) {
                        s2cVar.a(new ArrayList());
                    } else {
                        cf7 Y = cf7.Y(e94Var.a);
                        Y.a.c(new pz2(Y, arrayList2, s2cVar, (byte) 22));
                    }
                }
                longSparseArray.clear();
                return;
            case 9:
                ((ha4) this.b).a();
                return;
            case 10:
                String str3 = "feed.dislikePost";
                na4 na4Var = (na4) this.b;
                HashMap hashMap2 = na4Var.c;
                ga4 ga4Var = na4Var.a;
                String str4 = ga4Var.a;
                ArrayList arrayList3 = na4Var.b;
                na4Var.h = false;
                na4Var.g = false;
                if (na4Var.f) {
                    return;
                }
                na4Var.b();
                int i4 = z8c.t0;
                for (int i5 = 0; i5 < 4; i5++) {
                    if (str4.equals(ia4.f(i5))) {
                        i4 = i5;
                    }
                }
                int d = ia4.d(i4);
                int size = arrayList3.size();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    la4 la4Var = (la4) it.next();
                    int i6 = d - la4Var.j;
                    Integer num = la4Var.i;
                    if (i6 - (num != null ? num.intValue() / 1000 : 0) >= 3600) {
                        la4Var.toString();
                        it.remove();
                        hashMap2.remove(Long.valueOf(la4Var.c));
                    }
                }
                if (arrayList3.size() < size) {
                    na4Var.c();
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList3.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    la4 la4Var2 = (la4) obj2;
                    (hashMap2.containsKey(Long.valueOf(la4Var2.c)) ? arrayList5 : arrayList4).add(la4Var2);
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                arrayList3.addAll(arrayList5);
                int min = arrayList4.isEmpty() ? 1 : Math.min(na4Var.j, arrayList4.size());
                for (int i8 = 0; i8 < min; i8++) {
                    la4 la4Var3 = (la4) arrayList3.get(i8);
                    if (la4Var3.g.equals("feed.likePost") || la4Var3.g.equals("feed.dislikePost")) {
                        min = Math.max(1, i8);
                    }
                }
                ArrayList arrayList6 = new ArrayList(arrayList3.subList(0, min));
                na4Var.f = true;
                int i9 = na4Var.k + 1;
                na4Var.k = i9;
                yg ygVar = new yg((Object) na4Var, i9, (Object) arrayList6, (byte) 5);
                int i10 = -1;
                for (int i11 = 0; i11 < 4; i11++) {
                    if (str4.equals(ia4.f(i11))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.TL_messages_reportFeedEvents tL_messages_reportFeedEvents = new TLRPC.TL_messages_reportFeedEvents();
                    int size3 = arrayList6.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList6.get(i12);
                        i12++;
                        la4 la4Var4 = (la4) obj3;
                        long j2 = la4Var4.a;
                        ja4 ja4Var = la4Var4.f;
                        int i13 = la4Var4.d;
                        TLRPC.InputPeer g = ia4.g(i10, j2, la4Var4.b, la4Var4.k, la4Var4.l);
                        if (g == null) {
                            ia4.d.postRunnable(new fa4(ygVar, (byte) 1), 0L);
                        } else {
                            if (la4Var4.g.equals("feed.likePost") || la4Var4.g.equals(str3)) {
                                i = i9;
                                TL_feed.TL_feed_likePost tL_feed_likePost = new TL_feed.TL_feed_likePost();
                                TL_feed.TL_feed_dislikePost tL_feed_dislikePost = new TL_feed.TL_feed_dislikePost();
                                tL_feed_dislikePost.peer = g;
                                tL_feed_likePost.peer = g;
                                tL_feed_dislikePost.msg_id = i13;
                                tL_feed_likePost.msg_id = i13;
                                tL_messages_reportFeedEvents = la4Var4.g.equals("feed.likePost") ? tL_feed_likePost : tL_feed_dislikePost;
                                int[] iArr = {0};
                                int i14 = i10;
                                gm.c3(new i77((Object) ga4Var, (Object) iArr, i14, (Object) tL_messages_reportFeedEvents, (Object) ygVar, (byte) 14));
                                da4Var = new da4((byte) 1, i14, iArr);
                                ia4.d.postRunnable(new up6((Object) na4Var, i, (Object) da4Var, (Object) arrayList6, (byte) 23), 60000L);
                                return;
                            }
                            TLRPC.TL_inputFeedEvent tL_inputFeedEvent = new TLRPC.TL_inputFeedEvent();
                            tL_inputFeedEvent.peer = g;
                            tL_inputFeedEvent.msg_id = i13;
                            tL_inputFeedEvent.action = la4Var4.g;
                            tL_inputFeedEvent.surface = la4Var4.e;
                            tL_inputFeedEvent.flags = 96;
                            if (ja4Var != null) {
                                String str5 = ja4Var.c;
                                int i15 = str5 != null ? 4 : 0;
                                Long l = ja4Var.a;
                                tL_inputFeedEvent.flags = 96 | i15 | (l != null ? 3 : 0);
                                if (l != null) {
                                    i2 = i9;
                                    str = str3;
                                    j = l.longValue();
                                } else {
                                    i2 = i9;
                                    str = str3;
                                    j = 0;
                                }
                                tL_inputFeedEvent.recommendation_id = j;
                                tL_inputFeedEvent.recommendation_rank = ja4Var.b;
                                tL_inputFeedEvent.recommendation_role = str5;
                            } else {
                                i2 = i9;
                                str = str3;
                            }
                            String str6 = la4Var4.h;
                            if (str6 != null) {
                                tL_inputFeedEvent.flags |= 8;
                                tL_inputFeedEvent.kind = str6;
                            }
                            Integer num2 = la4Var4.i;
                            if (num2 != null) {
                                tL_inputFeedEvent.flags |= 16;
                                tL_inputFeedEvent.duration_ms = num2.intValue();
                            }
                            tL_inputFeedEvent.event_time = la4Var4.j;
                            tL_inputFeedEvent.random_id = la4Var4.c;
                            tL_messages_reportFeedEvents.events.add(tL_inputFeedEvent);
                            i9 = i2;
                            str3 = str;
                        }
                    }
                    i = i9;
                    int[] iArr2 = {0};
                    int i142 = i10;
                    gm.c3(new i77((Object) ga4Var, (Object) iArr2, i142, (Object) tL_messages_reportFeedEvents, (Object) ygVar, (byte) 14));
                    da4Var = new da4((byte) 1, i142, iArr2);
                    ia4.d.postRunnable(new up6((Object) na4Var, i, (Object) da4Var, (Object) arrayList6, (byte) 23), 60000L);
                    return;
                }
                ia4.d.postRunnable(new fa4(ygVar, (byte) 0), 0L);
                i = i9;
                da4Var = null;
                ia4.d.postRunnable(new up6((Object) na4Var, i, (Object) da4Var, (Object) arrayList6, (byte) 23), 60000L);
                return;
            case 11:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 12:
                lc4 lc4Var = (lc4) this.b;
                lc4Var.c();
                try {
                    lc4Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    lc4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 13:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList7 = cmb.F;
                int size4 = arrayList7.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    TLRPC.TL_theme tL_theme2 = ((bmb) arrayList7.get(i16)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 == null || (document = tL_theme.document) == null) {
                            return;
                        }
                        document2.file_reference = document.file_reference;
                        cmb.w1(true, false);
                        return;
                    }
                }
                return;
            case 14:
                ud4 ud4Var = (ud4) this.b;
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) ud4Var.b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 15:
                ((me4) this.b).j0(true);
                return;
            case 16:
                ((ke4) this.b).a.getBackground().setState(new int[0]);
                return;
            case 17:
                ig4 ig4Var = (ig4) ((hg4) this.b).g;
                ArrayList arrayList8 = ig4Var.h;
                if (z8c.h(z8c.t0).p()) {
                    return;
                }
                int i17 = 0;
                while (i17 < arrayList8.size()) {
                    if (((eg4) arrayList8.get(i17)).e && i17 != 0) {
                        s30 s30Var = ig4Var.J;
                        ig4 ig4Var2 = (ig4) s30Var.e;
                        ArrayList arrayList9 = ig4Var2.h;
                        SparseIntArray sparseIntArray2 = ig4Var2.l0;
                        int size5 = arrayList9.size();
                        if (i17 >= 0 && i17 < size5) {
                            ArrayList S0 = oc7.r1(z8c.t0).S0();
                            int i18 = sparseIntArray2.get(i17);
                            int i19 = ((eg4) arrayList9.get(i17)).a;
                            for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                sparseIntArray2.put(i20 + 1, sparseIntArray2.get(i20));
                            }
                            ub7 ub7Var = (ub7) S0.remove(i17);
                            ub7Var.f = 0;
                            S0.add(0, ub7Var);
                            sparseIntArray2.put(0, i18);
                            arrayList9.add(0, (eg4) arrayList9.remove(i17));
                            ((eg4) arrayList9.get(0)).a = i19;
                            for (int i21 = 0; i21 <= i17; i21++) {
                                ((eg4) arrayList9.get(i21)).a = i21;
                                ((ub7) S0.get(i21)).f = i21;
                            }
                            int i22 = 0;
                            while (i22 <= i17) {
                                if (ig4Var2.L == i22) {
                                    int i23 = i22 == i17 ? 0 : i22 + 1;
                                    ig4Var2.M = i23;
                                    ig4Var2.L = i23;
                                }
                                if (ig4Var2.r0 == i22) {
                                    int i24 = i22 == i17 ? 0 : i22 + 1;
                                    ig4Var2.s0 = i24;
                                    ig4Var2.r0 = i24;
                                }
                                i22++;
                            }
                            s30Var.j(i17, 0);
                            dg4 dg4Var = ig4Var2.K;
                            int i25 = ((eg4) arrayList9.get(i17)).a;
                            dk3 dk3Var = (dk3) dg4Var;
                            int i26 = 0;
                            while (true) {
                                mk3[] mk3VarArr = dk3Var.b.f0;
                                if (i26 < mk3VarArr.length) {
                                    mk3 mk3Var = mk3VarArr[i26];
                                    int i27 = mk3Var.h;
                                    if (i27 == i25) {
                                        mk3Var.h = i19;
                                    } else if (i27 == i19) {
                                        mk3Var.h = i25;
                                    }
                                    i26++;
                                } else {
                                    ig4Var2.m();
                                    ig4Var2.E = true;
                                    ig4Var2.G.setItemAnimator(ig4Var2.t0);
                                }
                            }
                        }
                        ig4Var.G.w0(0);
                        ak3 ak3Var = (ak3) ig4Var;
                        nk3 nk3Var = ak3Var.H0;
                        if (nk3Var.getMessagesController().H3()) {
                            return;
                        }
                        try {
                            ak3Var.performHapticFeedback(3, 1);
                        } catch (Exception unused2) {
                        }
                        u31 J = c41.b0(nk3Var).J(R.raw.filter_reorder, gm.S2(jb6.a0(null, null, 2131748701, jb6.M0(2131750744, null))), jb6.M0(2131746768, null), 5000, false, new bi3(ak3Var, (byte) 6));
                        J.k(true);
                        nk3Var.q3 = J;
                        return;
                    }
                    i17++;
                }
                return;
            case 18:
                ch4 ch4Var = (ch4) this.b;
                gm.r(ch4Var.o0);
                ch4Var.a.a(false, true);
                return;
            case 19:
                ch4 ch4Var2 = ((qg4) this.b).a;
                ch4Var2.h(ch4Var2.F, ch4Var2.G, ch4Var2.I, ch4Var2.H, ch4Var2.E, ch4Var2.K, ch4Var2.x, false);
                return;
            case 20:
                ((FiltersSetupActivity) ((fv) this.b).g3).getMessagesController().m3();
                return;
            case 21:
                hh4 hh4Var = (hh4) this.b;
                hh4Var.s.a();
                hh4Var.n.invalidate();
                hh4Var.I.g0(true);
                return;
            case 22:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((hg4) this.b).g;
                if (!z8c.h(z8c.t0).p()) {
                    ArrayList S02 = filtersSetupActivity.getMessagesController().S0();
                    int i28 = 0;
                    while (true) {
                        if (i28 < S02.size()) {
                            if (!((ub7) S02.get(i28)).d() || i28 == 0) {
                                i28++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList10 = filtersSetupActivity2.getMessagesController().G0;
                                if (i28 >= 0 && i28 < arrayList10.size()) {
                                    arrayList10.add(0, (ub7) arrayList10.remove(i28));
                                    for (int i29 = 0; i29 <= i28; i29++) {
                                        ((ub7) arrayList10.get(i29)).f = i29;
                                    }
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.a.w0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, 1);
                                } catch (Exception unused3) {
                                }
                                c41.b0(filtersSetupActivity).J(R.raw.filter_reorder, gm.S2(jb6.a0("LimitReachedReorderFolder", null, 2131748701, jb6.M0(2131750744, null))), jb6.M0(2131746768, null), 5000, false, new eh4(filtersSetupActivity, (byte) 2)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 23:
                ((CancellationSignal) this.b).cancel();
                return;
            case 24:
                uj4 uj4Var = (uj4) this.b;
                if (uj4Var.c) {
                    return;
                }
                uj4Var.setLayerType(0, null);
                return;
            case 25:
                ((pl4) this.b).invalidate();
                return;
            case 26:
                tl4 tl4Var = (tl4) ((f43) this.b).b;
                tl4Var.h.invalidate();
                tl4Var.i.requestLayout();
                return;
            case 27:
                fm4 fm4Var = (fm4) ((le) this.b).b;
                fm4Var.k();
                fm4Var.j();
                return;
            case 28:
                fm4 fm4Var2 = ((bm4) this.b).b;
                fm4Var2.c.dismiss();
                fm4Var2.f.removeAllViews();
                return;
            default:
                ((bm4) this.b).b.c.dismiss();
                return;
        }
    }

    public /* synthetic */ a14(r74 r74Var, af8 af8Var) {
        this.a = (byte) 6;
        this.b = af8Var;
    }

    public /* synthetic */ a14(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
