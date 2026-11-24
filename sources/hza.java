// default package

import android.content.Context;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hza implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hza(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    private final void a() {
        p5c p5cVar = (p5c) this.d;
        TLObject tLObject = (TLObject) this.b;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            p5cVar.l0(new x4c(p5cVar, str, (byte) 2));
            return;
        }
        if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
            p5cVar.D0();
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            p5cVar.L0(jb6.M0(2131743618, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            p5cVar.L0(jb6.M0(2131743618, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    private final void b() {
        v6c v6cVar = (v6c) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        int i = v6cVar.a;
        oc7.r1(i).d4(arrayList, true);
        ArrayList arrayList3 = v6cVar.b;
        boolean isEmpty = arrayList3.isEmpty();
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            u6c u6cVar = (u6c) arrayList3.get(i2);
            if (u6cVar == null || u6cVar.a() <= 0 || hashSet.contains(Long.valueOf(u6cVar.b))) {
                arrayList3.remove(i2);
                i2--;
            }
            i2++;
        }
        arrayList3.addAll(arrayList2);
        boolean isEmpty2 = arrayList3.isEmpty();
        v6cVar.c = true;
        v6cVar.d = false;
        if (isEmpty != isEmpty2) {
            nm7.f(i).k(nm7.f3, new Object[0]);
        }
        v6cVar.e();
        if (v6cVar.e) {
            v6cVar.e = false;
            v6cVar.d();
        }
    }

    private final void c() {
        String e;
        BufferedWriter bufferedWriter;
        jd4 jd4Var = (jd4) this.d;
        String str = (String) this.c;
        Map map = (Map) this.b;
        List list = (List) this.e;
        jf7 jf7Var = (jf7) jd4Var.b;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) jd4Var.g;
        if (((String) atomicMarkableReference.getReference()) != null) {
            jf7Var.i(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            jf7Var.h(str, map, false);
        }
        if (list.isEmpty()) {
            return;
        }
        File b = jf7Var.a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            jf7.g(b, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e = jf7.e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), jf7.b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(e);
            bufferedWriter.flush();
            bo2.b(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            jf7.f(b);
            bo2.b(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            bo2.b(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    private final void d() {
        d Q;
        l9c l9cVar = (l9c) this.d;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        int i = l9cVar.a;
        ArrayList arrayList = (ArrayList) l9cVar.c.remove(str);
        if (arrayList != null) {
            int i2 = 0;
            if (tL_error == null) {
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                oc7.r1(i).d4(tL_contacts_resolvedPeer.users, false);
                oc7.r1(i).X3(tL_contacts_resolvedPeer.chats, false);
                cf7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                long B1 = k47.B1(tL_contacts_resolvedPeer.peer);
                l9cVar.b.put(str, new k9c(B1));
                while (i2 < arrayList.size()) {
                    ((qac) arrayList.get(i2)).a(Long.valueOf(B1));
                    i2++;
                }
                return;
            }
            String str2 = tL_error.text;
            if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                while (i2 < arrayList.size()) {
                    ((qac) arrayList.get(i2)).a(Long.MAX_VALUE);
                    i2++;
                }
                return;
            }
            while (i2 < arrayList.size()) {
                ((qac) arrayList.get(i2)).a(null);
                i2++;
            }
            String str3 = tL_error.text;
            if (str3 == null || !str3.contains("FLOOD_WAIT") || (Q = LaunchActivity.Q()) == null) {
                return;
            }
            mlb.y(null, 2131750619, c41.b0(Q), null);
        }
    }

    private final void e() {
        ((VoIPService) this.d).lambda$startConferenceGroupCall$34((TLObject) this.b, (j5) this.c, (TLRPC.TL_error) this.e);
    }

    private final void f() {
        ((VoIPService) this.d).lambda$startOutgoingCall$9((TLRPC.TL_error) this.b, (TLObject) this.c, (byte[]) this.e);
    }

    private final void g() {
        ((VoIPService) this.d).lambda$startConferenceGroupCall$47((TLObject) this.b, (TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.e);
    }

    private final void h() {
        ((goc) this.d).E0((LinearLayout) this.b, (c) this.c, (bu5) this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x092b, code lost:
    
        if (r5 != null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0946, code lost:
    
        gm.c3(new w3b(r1, (byte) 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x094f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        TLRPC.StickerSet stickerSet;
        char c;
        d S;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i2;
        int i3;
        float f;
        long j;
        char c2;
        float f2;
        ao6 ao6Var;
        long j2;
        long j3;
        long j4;
        long j5;
        ArrayList arrayList;
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings;
        char c3;
        int i4;
        char c4 = 4;
        int i5 = 3;
        char c5 = 2;
        switch (this.a) {
            case 0:
                iza izaVar = (iza) this.d;
                nl1 nl1Var = (nl1) this.b;
                String str = (String) this.c;
                wza wzaVar = (wza) this.e;
                xza xzaVar = izaVar.x;
                if (nl1Var != null) {
                    xzaVar.V.l(str, nl1Var);
                    if (!wzaVar.b && (i = wzaVar.a) >= 0) {
                        View m = xzaVar.U.m(i);
                        if (m instanceof iza) {
                            izaVar.r.e = nl1Var;
                            iza izaVar2 = (iza) m;
                            izaVar2.b.u0.d(false, false);
                            izaVar2.g(false);
                        }
                    }
                }
                xzaVar.c0();
                return;
            case 1:
                jza jzaVar = (jza) this.d;
                nl1 nl1Var2 = (nl1) this.b;
                String str2 = (String) this.c;
                iac iacVar = (iac) this.e;
                jzaVar.k = false;
                jzaVar.d = nl1Var2;
                jzaVar.g = str2;
                gza gzaVar = (gza) iacVar.run();
                if (gzaVar != null) {
                    gzaVar.e(jzaVar, true);
                    return;
                }
                return;
            case 2:
                n1b n1bVar = (n1b) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                t88 t88Var = (t88) this.c;
                k1b k1bVar = (k1b) this.e;
                n1bVar.H = true;
                n1bVar.I = (k1b[]) arrayList2.toArray(new k1b[0]);
                t88Var.a(k1bVar);
                return;
            case 3:
                n1b n1bVar2 = (n1b) this.d;
                TLObject tLObject = (TLObject) this.b;
                l1b l1bVar = (l1b) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    n1bVar2.h();
                    n1bVar2.m(tL_error);
                    return;
                } else {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    l1bVar.e = hs6.c0(tL_messageMediaDocument.document, l1bVar.c);
                    l1bVar.f = tL_messageMediaDocument;
                    n1bVar2.a();
                    return;
                }
            case 4:
                x2b x2bVar = (x2b) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                hs6 hs6Var = (hs6) this.e;
                x2bVar.Z1 = 0;
                if (tL_error2 != null) {
                    x2bVar.dismiss();
                    d dVar = x2bVar.F1;
                    if (dVar != null) {
                        mlb.y(null, 2131754382, c41.b0(dVar), null);
                        return;
                    }
                    return;
                }
                wa8 wa8Var = new wa8(x2bVar, (byte) 3);
                wa8Var.addTarget(x2bVar.b);
                TransitionManager.beginDelayedTransition(x2bVar.c, wa8Var);
                x2bVar.r1.setVisibility(0);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                x2bVar.M1 = tL_messages_stickerSet;
                hs6Var.L1(tL_messages_stickerSet, false);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = x2bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                    x2bVar.dismiss();
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = x2bVar.M1;
                x2bVar.b2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                x2bVar.D0();
                hs6Var.r1(x2bVar.M1);
                x2bVar.V0();
                x2bVar.T0();
                x2bVar.S0();
                x2bVar.n1.f();
                return;
            case 5:
                q98 q98Var = (q98) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) this.e;
                q98Var.Z1 = 0;
                if (tL_error3 != null || !(tLObject3 instanceof Vector)) {
                    ik.c0(q98Var.a, tL_error3, q98Var.F1, tL_messages_getAttachedStickers, new Object[0]);
                    q98Var.dismiss();
                    return;
                }
                Vector vector = (Vector) tLObject3;
                if (vector.objects.isEmpty()) {
                    q98Var.dismiss();
                    return;
                }
                if (vector.objects.size() == 1) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    q98Var.P1 = tL_inputStickerSetID;
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.id = stickerSet2.id;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    q98Var.L0();
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                q98Var.Q1 = arrayList3;
                arrayList3.addAll(vector.objects);
                q98Var.m1.setLayoutParams(qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                q98Var.q1.setVisibility(8);
                q98Var.D1[0].setVisibility(8);
                q98Var.n1.f();
                return;
            case 6:
                v3b v3bVar = (v3b) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                qac qacVar = (qac) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                v3bVar.i = false;
                if (tLObject4 instanceof TL_stories.TL_storyAlbum) {
                    a4b a = a4b.a((TL_stories.TL_storyAlbum) tLObject4);
                    v3bVar.h.add(a);
                    v3bVar.f(true);
                    qacVar.a(a);
                    return;
                }
                if (tL_error4 == null || (S = LaunchActivity.S()) == null) {
                    c = 0;
                } else {
                    c = 0;
                    c41.b0(S).g0(tL_error4, false);
                }
                nm7 f3 = nm7.f(v3bVar.a);
                Object[] objArr = new Object[2];
                objArr[c] = Long.valueOf(v3bVar.b);
                objArr[1] = v3bVar;
                f3.k(nm7.l3, objArr);
                return;
            case 7:
                int i6 = 4;
                int i7 = 2;
                int i8 = 5;
                z3b z3bVar = (z3b) this.d;
                ArrayList arrayList4 = (ArrayList) this.b;
                cf7 cf7Var = (cf7) this.c;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i9 = z3bVar.f;
                StringBuilder sb = new StringBuilder("StoriesList ");
                byte b = z3bVar.e;
                sb.append((int) b);
                sb.append("{");
                long j6 = z3bVar.d;
                sb.append(j6);
                sb.append("} saveCache {");
                sb.append(h4b.k0(arrayList4));
                hg9.r("}", sb);
                try {
                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                    sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j6 + " AND album_id = " + i9).stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i10 = 0;
                        while (i10 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem = ((k47) arrayList4.get(i10)).l;
                                if (storyItem == null) {
                                    i2 = i6;
                                } else {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                                    storyItem.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindLong(1, j6);
                                    sQLitePreparedStatement2.bindInteger(i7, storyItem.id);
                                    sQLitePreparedStatement2.bindByteBuffer(i5, nativeByteBuffer);
                                    sQLitePreparedStatement2.bindInteger(i6, b);
                                    sQLitePreparedStatement2.bindInteger(i8, z3bVar.m.contains(Integer.valueOf(storyItem.id)) ? 1 : 0);
                                    sQLitePreparedStatement2.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem.id)) + 1);
                                    sQLitePreparedStatement2.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j6);
                                    i8 = 5;
                                    sQLitePreparedStatement.bindInteger(2, i9);
                                    sQLitePreparedStatement.bindInteger(3, storyItem.id);
                                    i2 = 4;
                                    sQLitePreparedStatement.bindInteger(4, i10);
                                    sQLitePreparedStatement.step();
                                }
                                i10++;
                                i6 = i2;
                                i5 = 3;
                                i7 = 2;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    cf7Var.n(th, true);
                                    if (sQLitePreparedStatement2 != null) {
                                        break;
                                    }
                                } finally {
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                }
                            }
                        }
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 8:
                g6b g6bVar = (g6b) this.d;
                String str3 = (String) this.c;
                int[][] iArr = (int[][]) this.b;
                qac qacVar2 = (qac) this.e;
                g6bVar.getClass();
                rcc rccVar = new rcc();
                rccVar.J = true;
                rccVar.Z = g6bVar.c1;
                rccVar.h = g6bVar.k0;
                rccVar.i = g6bVar.l0;
                rccVar.k = g6bVar.i0;
                rccVar.l = g6bVar.j0;
                File file = g6bVar.P0;
                rccVar.B = file == null ? null : file.getPath();
                File file2 = g6bVar.W0;
                rccVar.D = file2 == null ? null : file2.getPath();
                File file3 = g6bVar.X0;
                rccVar.E = file3 == null ? null : file3.getPath();
                File file4 = g6bVar.Y0;
                rccVar.F = file4 == null ? null : file4.getPath();
                int q = MediaController.q(rccVar.k, rccVar.l, rccVar.m, true);
                float f4 = 8.0f;
                if (!g6bVar.K || str3 == null || g6bVar.v()) {
                    i3 = 0;
                    File file5 = g6bVar.Z0;
                    if (file5 != null) {
                        rccVar.o = file5.getAbsolutePath();
                    } else {
                        rccVar.o = str3;
                    }
                    rccVar.I = true;
                    rccVar.L = g6bVar.S;
                    if (g6bVar.v()) {
                        int i11 = 0;
                        boolean z2 = false;
                        while (i11 < g6bVar.T.size()) {
                            g6b g6bVar2 = (g6b) g6bVar.T.get(i11);
                            if (g6bVar2.K) {
                                g6bVar2.k0 = Math.max(g6bVar2.k0, iArr[i11][1]);
                                g6bVar2.l0 = Math.max(g6bVar2.l0, iArr[i11][2]);
                                c2 = c4;
                                f2 = f4;
                                g6bVar2.h0 = Math.max(g6bVar2.h0, iArr[i11][c2]);
                                z2 = true;
                            } else {
                                c2 = c4;
                                f2 = f4;
                            }
                            i11++;
                            f4 = f2;
                            c4 = c2;
                            z2 = z2;
                        }
                        f = f4;
                        ArrayList a2 = qcc.a(g6bVar);
                        rccVar.M = a2;
                        if (z2) {
                            int size = a2.size();
                            qcc qccVar = null;
                            int i12 = 0;
                            long j7 = 0;
                            while (i12 < size) {
                                Object obj = a2.get(i12);
                                i12++;
                                qcc qccVar2 = (qcc) obj;
                                if (qccVar2.b) {
                                    long j8 = qccVar2.o;
                                    if (j8 > j7) {
                                        j7 = j8;
                                        qccVar = qccVar2;
                                    }
                                }
                            }
                            if (qccVar != null) {
                                float f5 = qccVar.o;
                                float f6 = qccVar.k;
                                float f7 = qccVar.j;
                                long j9 = (long) ((f6 - f7) * f5);
                                g6bVar.h0 = j9;
                                rccVar.v = j9;
                                rccVar.r = j9;
                                j = -(qccVar.f + ((long) (f7 * f5)));
                                qccVar.f = j;
                                ArrayList arrayList6 = rccVar.M;
                                int size2 = arrayList6.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    Object obj2 = arrayList6.get(i13);
                                    i13++;
                                    qcc qccVar3 = (qcc) obj2;
                                    if (qccVar3.b && qccVar3 != qccVar) {
                                        qccVar3.f += j;
                                    }
                                }
                                rccVar.a = -1L;
                                rccVar.b = -1L;
                                rccVar.t = true;
                                rccVar.j = -1;
                                rccVar.u = 1.0f;
                                rccVar.m = -1;
                                rccVar.n = 30;
                                rccVar.q = (long) (((g6bVar.h0 / 1000.0f) * q) / f);
                                rccVar.A = null;
                            }
                        } else {
                            long j10 = g6bVar.S0;
                            g6bVar.h0 = j10;
                            rccVar.v = j10;
                            rccVar.r = j10;
                        }
                    } else {
                        f = 8.0f;
                        if (g6bVar.o0 != null) {
                            long j11 = (long) ((g6bVar.t0 - g6bVar.s0) * g6bVar.q0);
                            g6bVar.h0 = j11;
                            rccVar.v = j11;
                            rccVar.r = j11;
                        } else if (g6bVar.y != null) {
                            long j12 = (long) ((g6bVar.F - g6bVar.E) * g6bVar.C);
                            g6bVar.h0 = j12;
                            rccVar.v = j12;
                            rccVar.r = j12;
                        } else {
                            long j13 = g6bVar.S0;
                            g6bVar.h0 = j13;
                            rccVar.v = j13;
                            rccVar.r = j13;
                        }
                    }
                    j = 0;
                    rccVar.a = -1L;
                    rccVar.b = -1L;
                    rccVar.t = true;
                    rccVar.j = -1;
                    rccVar.u = 1.0f;
                    rccVar.m = -1;
                    rccVar.n = 30;
                    rccVar.q = (long) (((g6bVar.h0 / 1000.0f) * q) / f);
                    rccVar.A = null;
                } else {
                    rccVar.o = str3;
                    rccVar.I = false;
                    i3 = 0;
                    rccVar.n = Math.min(59, iArr[0][7]);
                    int z3 = MediaController.z(str3);
                    if (z3 == -1) {
                        z3 = iArr[0][3];
                    }
                    rccVar.j = z3;
                    if (z3 >= 1000000 || (arrayList = g6bVar.T0) == null || arrayList.isEmpty()) {
                        int i14 = rccVar.j;
                        if (i14 < 500000) {
                            rccVar.m = 2500000;
                            rccVar.j = -1;
                        } else {
                            rccVar.m = Utilities.j(i14, 3000000, 500000);
                        }
                    } else {
                        rccVar.m = 2000000;
                        rccVar.j = -1;
                    }
                    StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
                    sb2.append(rccVar.j);
                    sb2.append(" => ");
                    b10.p(rccVar.m, sb2);
                    int i15 = iArr[0][4];
                    long j14 = i15;
                    g6bVar.h0 = j14;
                    rccVar.v = j14 * 1000;
                    float f8 = j14;
                    long j15 = ((long) (g6bVar.Z * f8)) * 1000;
                    rccVar.a = j15;
                    long j16 = ((long) (g6bVar.a0 * f8)) * 1000;
                    rccVar.b = j16;
                    rccVar.r = j16 - j15;
                    rccVar.u = g6bVar.P;
                    rccVar.t = g6bVar.Y;
                    rccVar.q = (long) kt6.d(i15 / 1000.0f, q, 8.0f, r4[5]);
                    rccVar.q = Math.max(g6bVar.L.length(), rccVar.q);
                    rccVar.A = g6bVar.a1;
                    File file6 = g6bVar.Q0;
                    rccVar.C = file6 != null ? file6.getPath() : null;
                    j = 0;
                }
                rccVar.R = g6bVar.a;
                rccVar.T = g6bVar.z0;
                rccVar.S = g6bVar.y0;
                rccVar.c = -1L;
                ao6 ao6Var2 = g6bVar.m0;
                if (ao6Var2 != null) {
                    ao6Var = ao6Var2.clone();
                    rccVar.H = ao6Var;
                } else {
                    ao6Var = new ao6();
                    rccVar.H = ao6Var;
                }
                ao6Var.B = new Matrix();
                rccVar.H.B.set(g6bVar.n0);
                rccVar.G = g6bVar.T0;
                rccVar.P = Integer.valueOf(g6bVar.A0);
                rccVar.Q = Integer.valueOf(g6bVar.B0);
                rccVar.U = true;
                rccVar.K = g6bVar.d1;
                rccVar.a0.clear();
                if (g6bVar.v() && !g6bVar.Y) {
                    ArrayList arrayList7 = rccVar.M;
                    int size3 = arrayList7.size();
                    int i16 = i3;
                    while (i16 < size3) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        qcc qccVar4 = (qcc) obj3;
                        if (qccVar4.b && qccVar4.e > 0.0f && !qccVar4.c) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(qccVar4.d);
                            mixedSoundInfo.volume = qccVar4.e;
                            float f9 = qccVar4.j;
                            float f10 = qccVar4.o;
                            mixedSoundInfo.audioOffset = ((long) (f9 * f10)) * 1000;
                            mixedSoundInfo.startTime = qccVar4.f * 1000;
                            mixedSoundInfo.duration = ((long) ((qccVar4.k - f9) * f10)) * 1000;
                            rccVar.a0.add(mixedSoundInfo);
                        }
                    }
                }
                File file7 = g6bVar.o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = g6bVar.u0;
                    float f11 = g6bVar.s0;
                    float f12 = g6bVar.q0;
                    long j17 = ((long) (f11 * f12)) * 1000;
                    mixedSoundInfo2.audioOffset = j17;
                    if (g6bVar.K) {
                        long j18 = ((long) (g6bVar.r0 - (g6bVar.Z * g6bVar.h0))) * 1000;
                        mixedSoundInfo2.startTime = j18;
                        j5 = j18;
                        j4 = 0;
                    } else {
                        j4 = 0;
                        mixedSoundInfo2.startTime = 0L;
                        j5 = 0;
                    }
                    long j19 = j5 + j;
                    mixedSoundInfo2.startTime = j19;
                    if (j19 < j4) {
                        mixedSoundInfo2.audioOffset = j17 - j19;
                        mixedSoundInfo2.startTime = j4;
                    }
                    mixedSoundInfo2.duration = ((long) ((g6bVar.t0 - f11) * f12)) * 1000;
                    rccVar.a0.add(mixedSoundInfo2);
                }
                String str4 = g6bVar.y;
                if (str4 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str4);
                    mixedSoundInfo3.volume = g6bVar.G;
                    float f13 = g6bVar.E;
                    float f14 = g6bVar.C;
                    long j20 = ((long) (f13 * f14)) * 1000;
                    mixedSoundInfo3.audioOffset = j20;
                    if (g6bVar.K) {
                        long j21 = ((long) (g6bVar.D - (g6bVar.Z * g6bVar.h0))) * 1000;
                        mixedSoundInfo3.startTime = j21;
                        j3 = j21;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        mixedSoundInfo3.startTime = 0L;
                        j3 = 0;
                    }
                    long j22 = j3 + j;
                    mixedSoundInfo3.startTime = j22;
                    if (j22 < j2) {
                        mixedSoundInfo3.audioOffset = j20 - j22;
                        mixedSoundInfo3.startTime = j2;
                    }
                    mixedSoundInfo3.duration = ((long) ((g6bVar.F - f13) * f14)) * 1000;
                    rccVar.a0.add(mixedSoundInfo3);
                }
                qacVar2.a(rccVar);
                return;
            case 9:
                tib tibVar = (tib) this.d;
                he heVar = (he) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                try {
                    heVar.dismiss();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    oc7.r1(tibVar.d).E3(0);
                    return;
                }
                if (tL_error5 == null || tL_error5.code != -1000) {
                    String M0 = jb6.M0(2131751042, null);
                    if (tL_error5 != null) {
                        StringBuilder k = b10.k(M0, "\n");
                        k.append(tL_error5.text);
                        M0 = k.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tibVar.getContext());
                    String M02 = jb6.M0(R.string.AppName, null);
                    he heVar2 = alertDialog$Builder.a;
                    heVar2.S = M02;
                    heVar2.U = M0;
                    b10.t(null, 2131747564, alertDialog$Builder, null);
                    return;
                }
                return;
            case 10:
                TLObject tLObject6 = (TLObject) this.d;
                amb ambVar = (amb) this.b;
                bmb bmbVar = (bmb) this.c;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                cmb.A--;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (ambVar == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (ambVar != null) {
                                ambVar.r = tL_theme2;
                            } else {
                                bmbVar.G = tL_theme2;
                                bmbVar.H = false;
                                bmbVar.h0 = null;
                                bmbVar.i0 = null;
                                nm7.f(bmbVar.F).a(bmbVar, nm7.Y1);
                                nm7.f(bmbVar.F).a(bmbVar, nm7.Z1);
                                bc4 G = bc4.G(bmbVar.F);
                                TLRPC.TL_theme tL_theme3 = bmbVar.G;
                                G.X(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (bmb.a(ambVar, themeSettings)) {
                            z = false;
                        } else {
                            bmb.g(ambVar, themeSettings);
                            bmb bmbVar2 = cmb.I;
                            if (bmbVar2 == bmbVar && bmbVar2.Z == ambVar.a) {
                                cmb.r1(false, false);
                                cmb.J(a.b, false);
                                bmb bmbVar3 = cmb.I;
                                cmb.I1(bmbVar3, cmb.J == bmbVar3, -1, null);
                            }
                            z = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        ambVar.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        r12 = z;
                    }
                    if (cmb.A != 0) {
                        cmb.B = (int) (System.currentTimeMillis() / 1000);
                        cmb.w1(r12, false);
                        return;
                    }
                    return;
                }
                r12 = false;
                if (cmb.A != 0) {
                }
                break;
            case 11:
                ((h71) this.d).a(cmb.R0((File) this.b, (String) this.c, (String[]) this.e));
                return;
            case 12:
                svb svbVar = (svb) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                String str5 = (String) this.c;
                he heVar3 = (he) this.e;
                wvb wvbVar = svbVar.a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    int i17 = 0;
                    while (i17 < updates.updates.size()) {
                        if (updates.updates.get(i17) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i17);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = wvbVar.getMessagesController().x1(wvbVar.a);
                            tL_messageService.dialog_id = wvbVar.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList8 = new ArrayList();
                            i4 = ((d) wvbVar).currentAccount;
                            arrayList8.add(new k47(i4, tL_messageService, false, false));
                            c3 = c5;
                            TLRPC.Chat L0 = wvbVar.getMessagesController().L0(Long.valueOf(-wvbVar.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j23 = wvbVar.b;
                            if (j23 != 0) {
                                tL_forumTopic.icon_emoji_id = j23;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str5;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = wvbVar.getMessagesController().x1(wvbVar.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = wvbVar.F;
                            yv1 yv1Var = wvbVar.E;
                            if (yv1Var != null) {
                                yv1Var.fb();
                                yv1Var.jb();
                                yv1Var.Nb(arrayList8, L0, tL_messageService.id, 1, 1, tL_forumTopic);
                                yv1Var.c = true;
                                yv1Var.N6();
                                yv1Var.wd(true);
                                yv1Var.p1.n(true);
                                yv1Var.Cd();
                                yv1Var.g2.setCurrentTopic(yv1Var.d());
                                yv1Var.zd(true);
                                yv1Var.Pc(true);
                                yv1Var.E7(true);
                                yv1Var.H4(true, true);
                                yv1Var.Ya();
                                wvbVar.getMessagesController().g4.q(wvbVar.a, tL_forumTopic, true);
                                wvbVar.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -wvbVar.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                yv1 yv1Var2 = new yv1(bundle);
                                yv1Var2.Nb(arrayList8, L0, tL_messageService.id, 1, 1, tL_forumTopic);
                                yv1Var2.c = true;
                                wvbVar.getMessagesController().g4.q(wvbVar.a, tL_forumTopic, true);
                                wvbVar.presentFragment(yv1Var2);
                            }
                        } else {
                            c3 = c5;
                        }
                        i17++;
                        c5 = c3;
                    }
                }
                heVar3.dismiss();
                return;
            case 13:
                mzb mzbVar = (mzb) this.d;
                bu5 bu5Var = (bu5) this.b;
                oc7 oc7Var = (oc7) this.c;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.e;
                bu5Var.u();
                oc7Var.g4.t(-mzbVar.f, tL_forumTopic2.id, !tL_forumTopic2.pinned, mzbVar.s);
                return;
            case 14:
                s1c s1cVar = (s1c) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
                c1c c1cVar = s1cVar.y1;
                r1c r1cVar = s1cVar.H1;
                s1cVar.l1 = null;
                if (tL_error6 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error6.text)) {
                    s1cVar.T0();
                    return;
                }
                if (tLObject8 instanceof TLRPC.TL_messages_translateResult) {
                    TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject8;
                    if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                        s1cVar.O1 = false;
                        TLRPC.TL_textWithEntities L02 = s1c.L0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L02.text);
                        k47.b(valueOf, L02.entities, false, true, false, false, 0);
                        s1cVar.z1.setText(s1cVar.M0(valueOf));
                        r1cVar.D(c1cVar);
                        return;
                    }
                }
                if (s1cVar.O1) {
                    s1cVar.dismiss();
                    nm7.e().k(nm7.T4, 1, jb6.M0(2131743633, null));
                    return;
                }
                mlb.y(null, 2131743633, new c41((FrameLayout) s1cVar.b, s1cVar.J0), null);
                n1c n1cVar = s1cVar.w1.e;
                String str6 = s1cVar.v1;
                s1cVar.u1 = str6;
                n1cVar.setText(s1c.J0(str6, null, null));
                r1cVar.D(c1cVar);
                return;
            case 15:
                b3c b3cVar = (b3c) this.d;
                k47 k47Var = (k47) this.b;
                u21 u21Var = (u21) this.c;
                rp2 rp2Var = (rp2) this.e;
                k47Var.k.originalLanguage = "und";
                b3cVar.getMessagesStorage().U1(u21Var.a, k47Var.k);
                b3cVar.L.remove(u21Var);
                rp2Var.a("und");
                return;
            case 16:
                b3c b3cVar2 = (b3c) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.b;
                String str7 = (String) this.c;
                z2c z2cVar = (z2c) this.e;
                storyItem2.detectedLng = str7;
                b3cVar2.getMessagesController().N1().k.h(storyItem2.dialogId, storyItem2);
                b3cVar2.J.remove(z2cVar);
                return;
            case 17:
                ((TwoStepVerificationActivity) this.d).o0((byte[]) this.b, (TLObject) this.c, (byte[]) this.e);
                return;
            case 18:
                a();
                return;
            case 19:
                b();
                return;
            case 20:
                c();
                return;
            case 21:
                d();
                return;
            case 22:
                ((VideoAds) this.d).lambda$show$14((Context) this.b, (TLRPC.TL_sponsoredMessage) this.c, (bu5) this.e);
                return;
            case 23:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.d, (TLRPC.TL_error) this.b, (Context) this.c, (Runnable) this.e);
                return;
            case 24:
                ((VoIPService) this.d).lambda$startGroupCheckShortpoll$66((TLRPC.TL_error) this.b, (TLObject) this.c, (TL_phone.checkGroupCall) this.e);
                return;
            case 25:
                e();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                c cVar = (c) this.d;
                boolean[] zArr = (boolean[]) this.b;
                a8 a8Var = (a8) this.c;
                hza hzaVar = (hza) this.e;
                l53 l53Var = cVar.h;
                if (l53Var.f() == null || zArr[0]) {
                    return;
                }
                a8Var.setSubtext(l53Var.i());
                hzaVar.run();
                zArr[0] = true;
                return;
        }
    }

    public /* synthetic */ hza(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = str;
        this.b = obj2;
        this.e = obj3;
    }
}
