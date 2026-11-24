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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class exa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ exa(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    private final void a() {
        p3c p3cVar = (p3c) this.d;
        TLObject tLObject = (TLObject) this.b;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        byte b = 0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            p3cVar.k0(new l3c(p3cVar, str, b));
            return;
        }
        if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
            p3cVar.C0();
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            p3cVar.K0(k96.M0(2131743692, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            p3cVar.K0(k96.M0(2131743692, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    private final void b() {
        v4c v4cVar = (v4c) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        int i = v4cVar.a;
        na7.q1(i).a4(arrayList, true);
        ArrayList arrayList3 = v4cVar.b;
        boolean isEmpty = arrayList3.isEmpty();
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            u4c u4cVar = (u4c) arrayList3.get(i2);
            if (u4cVar == null || u4cVar.a() <= 0 || hashSet.contains(Long.valueOf(u4cVar.b))) {
                arrayList3.remove(i2);
                i2--;
            }
            i2++;
        }
        arrayList3.addAll(arrayList2);
        boolean isEmpty2 = arrayList3.isEmpty();
        v4cVar.c = true;
        v4cVar.d = false;
        if (isEmpty != isEmpty2) {
            kk7.f(i).k(kk7.e3, new Object[0]);
        }
        v4cVar.e();
        if (v4cVar.e) {
            v4cVar.e = false;
            v4cVar.d();
        }
    }

    private final void c() {
        String e;
        BufferedWriter bufferedWriter;
        jb4 jb4Var = (jb4) this.d;
        String str = (String) this.c;
        Map map = (Map) this.b;
        List list = (List) this.e;
        hd7 hd7Var = (hd7) jb4Var.b;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) jb4Var.g;
        if (((String) atomicMarkableReference.getReference()) != null) {
            hd7Var.i(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            hd7Var.h(str, map, false);
        }
        if (list.isEmpty()) {
            return;
        }
        File b = hd7Var.a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            hd7.g(b, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e = hd7.e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), hd7.b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(e);
            bufferedWriter.flush();
            pm2.b(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            hd7.f(b);
            pm2.b(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            pm2.b(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    private final void d() {
        d Q;
        k7c k7cVar = (k7c) this.d;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        int i = k7cVar.a;
        ArrayList arrayList = (ArrayList) k7cVar.c.remove(str);
        if (arrayList != null) {
            int i2 = 0;
            if (tL_error == null) {
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                na7.q1(i).a4(tL_contacts_resolvedPeer.users, false);
                na7.q1(i).U3(tL_contacts_resolvedPeer.chats, false);
                ad7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                long B1 = k27.B1(tL_contacts_resolvedPeer.peer);
                k7cVar.b.put(str, new j7c(B1));
                while (i2 < arrayList.size()) {
                    ((p8c) arrayList.get(i2)).a(Long.valueOf(B1));
                    i2++;
                }
                return;
            }
            String str2 = tL_error.text;
            if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                while (i2 < arrayList.size()) {
                    ((p8c) arrayList.get(i2)).a(Long.MAX_VALUE);
                    i2++;
                }
                return;
            }
            while (i2 < arrayList.size()) {
                ((p8c) arrayList.get(i2)).a(null);
                i2++;
            }
            String str3 = tL_error.text;
            if (str3 == null || !str3.contains("FLOOD_WAIT") || (Q = LaunchActivity.Q()) == null) {
                return;
            }
            yjb.x(null, 2131750670, u21.b0(Q), null);
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
        ((hmc) this.d).D0((LinearLayout) this.b, (c) this.c, (cs5) this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x092b, code lost:
    
        if (r5 != null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0946, code lost:
    
        gl.d3(new v1b(r1, (byte) 2));
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
        zl6 zl6Var;
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
                fxa fxaVar = (fxa) this.d;
                fk1 fk1Var = (fk1) this.b;
                String str = (String) this.c;
                txa txaVar = (txa) this.e;
                uxa uxaVar = fxaVar.x;
                if (fk1Var != null) {
                    uxaVar.V.l(str, fk1Var);
                    if (!txaVar.b && (i = txaVar.a) >= 0) {
                        View m = uxaVar.U.m(i);
                        if (m instanceof fxa) {
                            fxaVar.r.e = fk1Var;
                            fxa fxaVar2 = (fxa) m;
                            fxaVar2.b.u0.d(false, false);
                            fxaVar2.g(false);
                        }
                    }
                }
                uxaVar.b0();
                return;
            case 1:
                gxa gxaVar = (gxa) this.d;
                fk1 fk1Var2 = (fk1) this.b;
                String str2 = (String) this.c;
                h8c h8cVar = (h8c) this.e;
                gxaVar.k = false;
                gxaVar.d = fk1Var2;
                gxaVar.g = str2;
                dxa dxaVar = (dxa) h8cVar.run();
                if (dxaVar != null) {
                    dxaVar.e(gxaVar, true);
                    return;
                }
                return;
            case 2:
                mza mzaVar = (mza) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                q68 q68Var = (q68) this.c;
                jza jzaVar = (jza) this.e;
                mzaVar.H = true;
                mzaVar.I = (jza[]) arrayList2.toArray(new jza[0]);
                q68Var.a(jzaVar);
                return;
            case 3:
                mza mzaVar2 = (mza) this.d;
                TLObject tLObject = (TLObject) this.b;
                kza kzaVar = (kza) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    mzaVar2.h();
                    mzaVar2.m(tL_error);
                    return;
                } else {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    kzaVar.e = hq6.c0(tL_messageMediaDocument.document, kzaVar.c);
                    kzaVar.f = tL_messageMediaDocument;
                    mzaVar2.a();
                    return;
                }
            case 4:
                u0b u0bVar = (u0b) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                hq6 hq6Var = (hq6) this.e;
                u0bVar.Z1 = 0;
                if (tL_error2 != null) {
                    u0bVar.dismiss();
                    d dVar = u0bVar.F1;
                    if (dVar != null) {
                        yjb.x(null, 2131754382, u21.b0(dVar), null);
                        return;
                    }
                    return;
                }
                u88 u88Var = new u88(u0bVar, (byte) 3);
                u88Var.addTarget(u0bVar.b);
                TransitionManager.beginDelayedTransition(u0bVar.c, u88Var);
                u0bVar.r1.setVisibility(0);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                u0bVar.M1 = tL_messages_stickerSet;
                hq6Var.L1(tL_messages_stickerSet, false);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u0bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                    u0bVar.dismiss();
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = u0bVar.M1;
                u0bVar.b2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                u0bVar.D0();
                hq6Var.r1(u0bVar.M1);
                u0bVar.V0();
                u0bVar.T0();
                u0bVar.S0();
                u0bVar.n1.f();
                return;
            case 5:
                o78 o78Var = (o78) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) this.e;
                o78Var.Z1 = 0;
                if (tL_error3 != null || !(tLObject3 instanceof Vector)) {
                    ij.c0(o78Var.a, tL_error3, o78Var.F1, tL_messages_getAttachedStickers, new Object[0]);
                    o78Var.dismiss();
                    return;
                }
                Vector vector = (Vector) tLObject3;
                if (vector.objects.isEmpty()) {
                    o78Var.dismiss();
                    return;
                }
                if (vector.objects.size() == 1) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    o78Var.P1 = tL_inputStickerSetID;
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.id = stickerSet2.id;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    o78Var.L0();
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                o78Var.Q1 = arrayList3;
                arrayList3.addAll(vector.objects);
                o78Var.m1.setLayoutParams(nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                o78Var.q1.setVisibility(8);
                o78Var.D1[0].setVisibility(8);
                o78Var.n1.f();
                return;
            case 6:
                u1b u1bVar = (u1b) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                p8c p8cVar = (p8c) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                u1bVar.i = false;
                if (tLObject4 instanceof TL_stories.TL_storyAlbum) {
                    z1b a = z1b.a((TL_stories.TL_storyAlbum) tLObject4);
                    u1bVar.h.add(a);
                    u1bVar.f(true);
                    p8cVar.a(a);
                    return;
                }
                if (tL_error4 == null || (S = LaunchActivity.S()) == null) {
                    c = 0;
                } else {
                    c = 0;
                    u21.b0(S).g0(tL_error4, false);
                }
                kk7 f3 = kk7.f(u1bVar.a);
                Object[] objArr = new Object[2];
                objArr[c] = Long.valueOf(u1bVar.b);
                objArr[1] = u1bVar;
                f3.k(kk7.k3, objArr);
                return;
            case 7:
                int i6 = 4;
                int i7 = 2;
                int i8 = 5;
                y1b y1bVar = (y1b) this.d;
                ArrayList arrayList4 = (ArrayList) this.b;
                ad7 ad7Var = (ad7) this.c;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i9 = y1bVar.f;
                StringBuilder sb = new StringBuilder("StoriesList ");
                byte b = y1bVar.e;
                sb.append((int) b);
                sb.append("{");
                long j6 = y1bVar.d;
                sb.append(j6);
                sb.append("} saveCache {");
                sb.append(g2b.k0(arrayList4));
                de9.s("}", sb);
                try {
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j6 + " AND album_id = " + i9).stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i10 = 0;
                        while (i10 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem = ((k27) arrayList4.get(i10)).l;
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
                                    sQLitePreparedStatement2.bindInteger(i8, y1bVar.m.contains(Integer.valueOf(storyItem.id)) ? 1 : 0);
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
                                    ad7Var.n(th, true);
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
                f4b f4bVar = (f4b) this.d;
                String str3 = (String) this.c;
                int[][] iArr = (int[][]) this.b;
                p8c p8cVar2 = (p8c) this.e;
                f4bVar.getClass();
                oac oacVar = new oac();
                oacVar.J = true;
                oacVar.Z = f4bVar.c1;
                oacVar.h = f4bVar.k0;
                oacVar.i = f4bVar.l0;
                oacVar.k = f4bVar.i0;
                oacVar.l = f4bVar.j0;
                File file = f4bVar.P0;
                oacVar.B = file == null ? null : file.getPath();
                File file2 = f4bVar.W0;
                oacVar.D = file2 == null ? null : file2.getPath();
                File file3 = f4bVar.X0;
                oacVar.E = file3 == null ? null : file3.getPath();
                File file4 = f4bVar.Y0;
                oacVar.F = file4 == null ? null : file4.getPath();
                int q = MediaController.q(oacVar.k, oacVar.l, oacVar.m, true);
                float f4 = 8.0f;
                if (!f4bVar.K || str3 == null || f4bVar.v()) {
                    i3 = 0;
                    File file5 = f4bVar.Z0;
                    if (file5 != null) {
                        oacVar.o = file5.getAbsolutePath();
                    } else {
                        oacVar.o = str3;
                    }
                    oacVar.I = true;
                    oacVar.L = f4bVar.S;
                    if (f4bVar.v()) {
                        int i11 = 0;
                        boolean z2 = false;
                        while (i11 < f4bVar.T.size()) {
                            f4b f4bVar2 = (f4b) f4bVar.T.get(i11);
                            if (f4bVar2.K) {
                                f4bVar2.k0 = Math.max(f4bVar2.k0, iArr[i11][1]);
                                f4bVar2.l0 = Math.max(f4bVar2.l0, iArr[i11][2]);
                                c2 = c4;
                                f2 = f4;
                                f4bVar2.h0 = Math.max(f4bVar2.h0, iArr[i11][c2]);
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
                        ArrayList a2 = nac.a(f4bVar);
                        oacVar.M = a2;
                        if (z2) {
                            int size = a2.size();
                            nac nacVar = null;
                            int i12 = 0;
                            long j7 = 0;
                            while (i12 < size) {
                                Object obj = a2.get(i12);
                                i12++;
                                nac nacVar2 = (nac) obj;
                                if (nacVar2.b) {
                                    long j8 = nacVar2.o;
                                    if (j8 > j7) {
                                        j7 = j8;
                                        nacVar = nacVar2;
                                    }
                                }
                            }
                            if (nacVar != null) {
                                float f5 = nacVar.o;
                                float f6 = nacVar.k;
                                float f7 = nacVar.j;
                                long j9 = (long) ((f6 - f7) * f5);
                                f4bVar.h0 = j9;
                                oacVar.v = j9;
                                oacVar.r = j9;
                                j = -(nacVar.f + ((long) (f7 * f5)));
                                nacVar.f = j;
                                ArrayList arrayList6 = oacVar.M;
                                int size2 = arrayList6.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    Object obj2 = arrayList6.get(i13);
                                    i13++;
                                    nac nacVar3 = (nac) obj2;
                                    if (nacVar3.b && nacVar3 != nacVar) {
                                        nacVar3.f += j;
                                    }
                                }
                                oacVar.a = -1L;
                                oacVar.b = -1L;
                                oacVar.t = true;
                                oacVar.j = -1;
                                oacVar.u = 1.0f;
                                oacVar.m = -1;
                                oacVar.n = 30;
                                oacVar.q = (long) (((f4bVar.h0 / 1000.0f) * q) / f);
                                oacVar.A = null;
                            }
                        } else {
                            long j10 = f4bVar.S0;
                            f4bVar.h0 = j10;
                            oacVar.v = j10;
                            oacVar.r = j10;
                        }
                    } else {
                        f = 8.0f;
                        if (f4bVar.o0 != null) {
                            long j11 = (long) ((f4bVar.t0 - f4bVar.s0) * f4bVar.q0);
                            f4bVar.h0 = j11;
                            oacVar.v = j11;
                            oacVar.r = j11;
                        } else if (f4bVar.y != null) {
                            long j12 = (long) ((f4bVar.F - f4bVar.E) * f4bVar.C);
                            f4bVar.h0 = j12;
                            oacVar.v = j12;
                            oacVar.r = j12;
                        } else {
                            long j13 = f4bVar.S0;
                            f4bVar.h0 = j13;
                            oacVar.v = j13;
                            oacVar.r = j13;
                        }
                    }
                    j = 0;
                    oacVar.a = -1L;
                    oacVar.b = -1L;
                    oacVar.t = true;
                    oacVar.j = -1;
                    oacVar.u = 1.0f;
                    oacVar.m = -1;
                    oacVar.n = 30;
                    oacVar.q = (long) (((f4bVar.h0 / 1000.0f) * q) / f);
                    oacVar.A = null;
                } else {
                    oacVar.o = str3;
                    oacVar.I = false;
                    i3 = 0;
                    oacVar.n = Math.min(59, iArr[0][7]);
                    int z3 = MediaController.z(str3);
                    if (z3 == -1) {
                        z3 = iArr[0][3];
                    }
                    oacVar.j = z3;
                    if (z3 >= 1000000 || (arrayList = f4bVar.T0) == null || arrayList.isEmpty()) {
                        int i14 = oacVar.j;
                        if (i14 < 500000) {
                            oacVar.m = 2500000;
                            oacVar.j = -1;
                        } else {
                            oacVar.m = Utilities.j(i14, 3000000, 500000);
                        }
                    } else {
                        oacVar.m = 2000000;
                        oacVar.j = -1;
                    }
                    StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
                    sb2.append(oacVar.j);
                    sb2.append(" => ");
                    b00.p(oacVar.m, sb2);
                    int i15 = iArr[0][4];
                    long j14 = i15;
                    f4bVar.h0 = j14;
                    oacVar.v = j14 * 1000;
                    float f8 = j14;
                    long j15 = ((long) (f4bVar.Z * f8)) * 1000;
                    oacVar.a = j15;
                    long j16 = ((long) (f4bVar.a0 * f8)) * 1000;
                    oacVar.b = j16;
                    oacVar.r = j16 - j15;
                    oacVar.u = f4bVar.P;
                    oacVar.t = f4bVar.Y;
                    oacVar.q = (long) ls6.d(i15 / 1000.0f, q, 8.0f, r4[5]);
                    oacVar.q = Math.max(f4bVar.L.length(), oacVar.q);
                    oacVar.A = f4bVar.a1;
                    File file6 = f4bVar.Q0;
                    oacVar.C = file6 != null ? file6.getPath() : null;
                    j = 0;
                }
                oacVar.R = f4bVar.a;
                oacVar.T = f4bVar.z0;
                oacVar.S = f4bVar.y0;
                oacVar.c = -1L;
                zl6 zl6Var2 = f4bVar.m0;
                if (zl6Var2 != null) {
                    zl6Var = zl6Var2.clone();
                    oacVar.H = zl6Var;
                } else {
                    zl6Var = new zl6();
                    oacVar.H = zl6Var;
                }
                zl6Var.B = new Matrix();
                oacVar.H.B.set(f4bVar.n0);
                oacVar.G = f4bVar.T0;
                oacVar.P = Integer.valueOf(f4bVar.A0);
                oacVar.Q = Integer.valueOf(f4bVar.B0);
                oacVar.U = true;
                oacVar.K = f4bVar.d1;
                oacVar.a0.clear();
                if (f4bVar.v() && !f4bVar.Y) {
                    ArrayList arrayList7 = oacVar.M;
                    int size3 = arrayList7.size();
                    int i16 = i3;
                    while (i16 < size3) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        nac nacVar4 = (nac) obj3;
                        if (nacVar4.b && nacVar4.e > 0.0f && !nacVar4.c) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(nacVar4.d);
                            mixedSoundInfo.volume = nacVar4.e;
                            float f9 = nacVar4.j;
                            float f10 = nacVar4.o;
                            mixedSoundInfo.audioOffset = ((long) (f9 * f10)) * 1000;
                            mixedSoundInfo.startTime = nacVar4.f * 1000;
                            mixedSoundInfo.duration = ((long) ((nacVar4.k - f9) * f10)) * 1000;
                            oacVar.a0.add(mixedSoundInfo);
                        }
                    }
                }
                File file7 = f4bVar.o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = f4bVar.u0;
                    float f11 = f4bVar.s0;
                    float f12 = f4bVar.q0;
                    long j17 = ((long) (f11 * f12)) * 1000;
                    mixedSoundInfo2.audioOffset = j17;
                    if (f4bVar.K) {
                        long j18 = ((long) (f4bVar.r0 - (f4bVar.Z * f4bVar.h0))) * 1000;
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
                    mixedSoundInfo2.duration = ((long) ((f4bVar.t0 - f11) * f12)) * 1000;
                    oacVar.a0.add(mixedSoundInfo2);
                }
                String str4 = f4bVar.y;
                if (str4 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str4);
                    mixedSoundInfo3.volume = f4bVar.G;
                    float f13 = f4bVar.E;
                    float f14 = f4bVar.C;
                    long j20 = ((long) (f13 * f14)) * 1000;
                    mixedSoundInfo3.audioOffset = j20;
                    if (f4bVar.K) {
                        long j21 = ((long) (f4bVar.D - (f4bVar.Z * f4bVar.h0))) * 1000;
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
                    mixedSoundInfo3.duration = ((long) ((f4bVar.F - f13) * f14)) * 1000;
                    oacVar.a0.add(mixedSoundInfo3);
                }
                p8cVar2.a(oacVar);
                return;
            case 9:
                sgb sgbVar = (sgb) this.d;
                hd hdVar = (hd) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                try {
                    hdVar.dismiss();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    na7.q1(sgbVar.d).B3(0);
                    return;
                }
                if (tL_error5 == null || tL_error5.code != -1000) {
                    String M0 = k96.M0(2131751093, null);
                    if (tL_error5 != null) {
                        StringBuilder k = b00.k(M0, "\n");
                        k.append(tL_error5.text);
                        M0 = k.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sgbVar.getContext());
                    String M02 = k96.M0(R.string.AppName, null);
                    hd hdVar2 = alertDialog$Builder.a;
                    hdVar2.S = M02;
                    hdVar2.U = M0;
                    b00.t(null, 2131747638, alertDialog$Builder, null);
                    return;
                }
                return;
            case 10:
                TLObject tLObject6 = (TLObject) this.d;
                zjb zjbVar = (zjb) this.b;
                akb akbVar = (akb) this.c;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                bkb.A--;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (zjbVar == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (zjbVar != null) {
                                zjbVar.r = tL_theme2;
                            } else {
                                akbVar.G = tL_theme2;
                                akbVar.H = false;
                                akbVar.h0 = null;
                                akbVar.i0 = null;
                                kk7.f(akbVar.F).a(akbVar, kk7.X1);
                                kk7.f(akbVar.F).a(akbVar, kk7.Y1);
                                ba4 G = ba4.G(akbVar.F);
                                TLRPC.TL_theme tL_theme3 = akbVar.G;
                                G.X(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (akb.a(zjbVar, themeSettings)) {
                            z = false;
                        } else {
                            akb.g(zjbVar, themeSettings);
                            akb akbVar2 = bkb.I;
                            if (akbVar2 == akbVar && akbVar2.Z == zjbVar.a) {
                                bkb.r1(false, false);
                                bkb.J(a.b, false);
                                akb akbVar3 = bkb.I;
                                bkb.I1(akbVar3, bkb.J == akbVar3, -1, null);
                            }
                            z = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        zjbVar.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        r12 = z;
                    }
                    if (bkb.A != 0) {
                        bkb.B = (int) (System.currentTimeMillis() / 1000);
                        bkb.w1(r12, false);
                        return;
                    }
                    return;
                }
                r12 = false;
                if (bkb.A != 0) {
                }
                break;
            case 11:
                ((a61) this.d).a(bkb.R0((File) this.b, (String) this.c, (String[]) this.e));
                return;
            case 12:
                rtb rtbVar = (rtb) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                String str5 = (String) this.c;
                hd hdVar3 = (hd) this.e;
                vtb vtbVar = rtbVar.a;
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
                            tL_messageService.peer_id = vtbVar.getMessagesController().w1(vtbVar.a);
                            tL_messageService.dialog_id = vtbVar.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList8 = new ArrayList();
                            i4 = ((d) vtbVar).currentAccount;
                            arrayList8.add(new k27(i4, tL_messageService, false, false));
                            c3 = c5;
                            TLRPC.Chat K0 = vtbVar.getMessagesController().K0(Long.valueOf(-vtbVar.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j23 = vtbVar.b;
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
                            tL_forumTopic.from_id = vtbVar.getMessagesController().w1(vtbVar.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = vtbVar.F;
                            mu1 mu1Var = vtbVar.E;
                            if (mu1Var != null) {
                                mu1Var.Ta();
                                mu1Var.Xa();
                                mu1Var.Bb(arrayList8, K0, tL_messageService.id, 1, 1, tL_forumTopic);
                                mu1Var.c = true;
                                mu1Var.E6();
                                mu1Var.id(true);
                                mu1Var.p1.n(true);
                                mu1Var.od();
                                mu1Var.g2.setCurrentTopic(mu1Var.d());
                                mu1Var.ld(true);
                                mu1Var.Bc(true);
                                mu1Var.u7(true);
                                mu1Var.B4(true, true);
                                mu1Var.Ma();
                                vtbVar.getMessagesController().g4.q(vtbVar.a, tL_forumTopic, true);
                                vtbVar.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -vtbVar.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                mu1 mu1Var2 = new mu1(bundle);
                                mu1Var2.Bb(arrayList8, K0, tL_messageService.id, 1, 1, tL_forumTopic);
                                mu1Var2.c = true;
                                vtbVar.getMessagesController().g4.q(vtbVar.a, tL_forumTopic, true);
                                vtbVar.presentFragment(mu1Var2);
                            }
                        } else {
                            c3 = c5;
                        }
                        i17++;
                        c5 = c3;
                    }
                }
                hdVar3.dismiss();
                return;
            case 13:
                kxb kxbVar = (kxb) this.d;
                cs5 cs5Var = (cs5) this.b;
                na7 na7Var = (na7) this.c;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.e;
                cs5Var.u();
                na7Var.g4.t(-kxbVar.f, tL_forumTopic2.id, !tL_forumTopic2.pinned, kxbVar.s);
                return;
            case 14:
                rzb rzbVar = (rzb) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
                bzb bzbVar = rzbVar.y1;
                qzb qzbVar = rzbVar.H1;
                rzbVar.l1 = null;
                if (tL_error6 != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error6.text)) {
                    rzbVar.T0();
                    return;
                }
                if (tLObject8 instanceof TLRPC.TL_messages_translateResult) {
                    TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject8;
                    if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                        rzbVar.O1 = false;
                        TLRPC.TL_textWithEntities L0 = rzb.L0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0.text);
                        k27.b(valueOf, L0.entities, false, true, false, false, 0);
                        rzbVar.z1.setText(rzbVar.M0(valueOf));
                        qzbVar.D(bzbVar);
                        return;
                    }
                }
                if (rzbVar.O1) {
                    rzbVar.dismiss();
                    kk7.e().k(kk7.R4, 1, k96.M0(2131743707, null));
                    return;
                }
                yjb.x(null, 2131743707, new u21((FrameLayout) rzbVar.b, rzbVar.J0), null);
                mzb mzbVar = rzbVar.w1.e;
                String str6 = rzbVar.v1;
                rzbVar.u1 = str6;
                mzbVar.setText(rzb.J0(str6, null, null));
                qzbVar.D(bzbVar);
                return;
            case 15:
                b1c b1cVar = (b1c) this.d;
                k27 k27Var = (k27) this.b;
                m11 m11Var = (m11) this.c;
                go2 go2Var = (go2) this.e;
                k27Var.k.originalLanguage = "und";
                b1cVar.getMessagesStorage().U1(m11Var.a, k27Var.k);
                b1cVar.L.remove(m11Var);
                go2Var.a("und");
                return;
            case 16:
                b1c b1cVar2 = (b1c) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.b;
                String str7 = (String) this.c;
                z0c z0cVar = (z0c) this.e;
                storyItem2.detectedLng = str7;
                b1cVar2.getMessagesController().M1().k.h(storyItem2.dialogId, storyItem2);
                b1cVar2.J.remove(z0cVar);
                return;
            case 17:
                ((TwoStepVerificationActivity) this.d).n0((byte[]) this.b, (TLObject) this.c, (byte[]) this.e);
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
                ((VideoAds) this.d).lambda$show$14((Context) this.b, (TLRPC.TL_sponsoredMessage) this.c, (cs5) this.e);
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
                exa exaVar = (exa) this.e;
                a43 a43Var = cVar.h;
                if (a43Var.f() == null || zArr[0]) {
                    return;
                }
                a8Var.setSubtext(a43Var.i());
                exaVar.run();
                zArr[0] = true;
                return;
        }
    }

    public /* synthetic */ exa(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = str;
        this.b = obj2;
        this.e = obj3;
    }
}
