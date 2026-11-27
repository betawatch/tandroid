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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kta(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        r3c r3cVar = (r3c) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
        b3c b3cVar = r3cVar.y1;
        q3c q3cVar = r3cVar.H1;
        r3cVar.l1 = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            r3cVar.U0();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                r3cVar.O1 = false;
                TLRPC.TL_textWithEntities M0 = r3c.M0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0.text);
                r47.b(valueOf, M0.entities, false, true, false, false, 0);
                r3cVar.z1.setText(r3cVar.N0(valueOf));
                q3cVar.D(b3cVar);
                return;
            }
        }
        if (r3cVar.O1) {
            r3cVar.dismiss();
            jn7.e().k(jn7.S4, 1, ob6.M0(2131743601, null));
            return;
        }
        xnb.x(null, 2131743601, new d31((FrameLayout) r3cVar.b, r3cVar.J0), null);
        m3c m3cVar = r3cVar.w1.e;
        String str = r3cVar.v1;
        r3cVar.u1 = str;
        m3cVar.setText(r3c.K0(str, null, null));
        q3cVar.D(b3cVar);
    }

    private final void b() {
        ((TwoStepVerificationActivity) this.b).n0((byte[]) this.c, (TLObject) this.d, (byte[]) this.e);
    }

    private final void c() {
        o7c o7cVar = (o7c) this.b;
        TLObject tLObject = (TLObject) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            o7cVar.k0(new hab((Object) o7cVar, (Object) str, (byte) 28));
            return;
        }
        if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
            o7cVar.D0();
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            o7cVar.L0(ob6.M0(2131743586, null), tL_error.text);
        } else {
            int intValue = Utilities.z(tL_error.text).intValue();
            o7cVar.L0(ob6.M0(2131743586, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
        }
    }

    private final void d() {
        u8c u8cVar = (u8c) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        int i = u8cVar.a;
        uc7.s1(i).j4(arrayList, true);
        ArrayList arrayList3 = u8cVar.b;
        boolean isEmpty = arrayList3.isEmpty();
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            t8c t8cVar = (t8c) arrayList3.get(i2);
            if (t8cVar == null || t8cVar.a() <= 0 || hashSet.contains(Long.valueOf(t8cVar.b))) {
                arrayList3.remove(i2);
                i2--;
            }
            i2++;
        }
        arrayList3.addAll(arrayList2);
        boolean isEmpty2 = arrayList3.isEmpty();
        u8cVar.c = true;
        u8cVar.d = false;
        if (isEmpty != isEmpty2) {
            jn7.f(i).k(jn7.f3, new Object[0]);
        }
        u8cVar.e();
        if (u8cVar.e) {
            u8cVar.e = false;
            u8cVar.d();
        }
    }

    private final void e() {
        String e;
        BufferedWriter bufferedWriter;
        gd4 gd4Var = (gd4) this.b;
        String str = (String) this.c;
        Map map = (Map) this.d;
        List list = (List) this.e;
        rf7 rf7Var = (rf7) gd4Var.b;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) gd4Var.g;
        if (((String) atomicMarkableReference.getReference()) != null) {
            rf7Var.i(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            rf7Var.h(str, map, false);
        }
        if (list.isEmpty()) {
            return;
        }
        File b = rf7Var.a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            rf7.g(b, "Rollout state is empty for session: " + str);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                e = rf7.e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), rf7.b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(e);
            bufferedWriter.flush();
            jn2.b(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
            rf7.f(b);
            jn2.b(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            jn2.b(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    private final void f() {
        e Q;
        kbc kbcVar = (kbc) this.b;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        int i = kbcVar.a;
        ArrayList arrayList = (ArrayList) kbcVar.c.remove(str);
        if (arrayList != null) {
            int i2 = 0;
            if (tL_error == null) {
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                uc7.s1(i).j4(tL_contacts_resolvedPeer.users, false);
                uc7.s1(i).c4(tL_contacts_resolvedPeer.chats, false);
                kf7.a0(i).n1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                long B1 = r47.B1(tL_contacts_resolvedPeer.peer);
                kbcVar.b.put(str, new jbc(B1));
                while (i2 < arrayList.size()) {
                    ((pcc) arrayList.get(i2)).a(Long.valueOf(B1));
                    i2++;
                }
                return;
            }
            String str2 = tL_error.text;
            if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                while (i2 < arrayList.size()) {
                    ((pcc) arrayList.get(i2)).a(Long.MAX_VALUE);
                    i2++;
                }
                return;
            }
            while (i2 < arrayList.size()) {
                ((pcc) arrayList.get(i2)).a(null);
                i2++;
            }
            String str3 = tL_error.text;
            if (str3 == null || !str3.contains("FLOOD_WAIT") || (Q = LaunchActivity.Q()) == null) {
                return;
            }
            xnb.x(null, 2131750647, d31.b0(Q), null);
        }
    }

    private final void g() {
        ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (fu5) this.e);
    }

    private final void h() {
        VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.b, (TLRPC.TL_error) this.c, (Context) this.d, (Runnable) this.e);
    }

    private final void i() {
        ((VoIPService) this.b).lambda$startGroupCheckShortpoll$66((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
    }

    private final void j() {
        ((VoIPService) this.b).lambda$startConferenceGroupCall$34((TLObject) this.c, (k5) this.d, (TLRPC.TL_error) this.e);
    }

    private final void k() {
        ((VoIPService) this.b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.c, (TLObject) this.d, (byte[]) this.e);
    }

    private final void l() {
        ((VoIPService) this.b).lambda$startConferenceGroupCall$47((TLObject) this.c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        TLRPC.StickerSet stickerSet;
        char c;
        e S;
        SQLitePreparedStatement sQLitePreparedStatement;
        byte b;
        ArrayList arrayList;
        int i2;
        float f;
        long j;
        fo6 fo6Var;
        long j2;
        long j3;
        long j4;
        long j5;
        ArrayList arrayList2;
        boolean z2;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i3;
        byte b2 = 3;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        switch (this.a) {
            case 0:
                vta vtaVar = (vta) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                in inVar = vtaVar.I;
                vtaVar.i0 = false;
                if (starGift != null) {
                    hl.c3(runnable);
                    return;
                }
                e29 e29Var = vtaVar.m0;
                if (e29Var != null) {
                    e29Var.d();
                    z = true;
                    hl.d3(new osa((byte) 1), 750L);
                } else {
                    z = true;
                }
                vtaVar.R.animate().alpha(0.0f).start();
                vtaVar.T.animate().alpha(1.0f).start();
                vtaVar.H.animate().alpha(1.0f).start();
                vtaVar.S.animate().alpha(0.0f).start();
                vtaVar.Q.animate().alpha(1.0f).start();
                vtaVar.N.setText(hl.S2(ob6.G(arrayList3.size(), "GiftCraftFailedText", new Object[0])));
                inVar.setText(ob6.M0(2131749741, null));
                inVar.setTranslationY(hl.L(6.0f));
                vtaVar.J.setAlpha(0.0f);
                if (vtaVar.P != null) {
                    int i4 = 0;
                    while (true) {
                        sx4[] sx4VarArr = vtaVar.P;
                        if (i4 < sx4VarArr.length) {
                            hl.B2(sx4VarArr[i4]);
                            i4++;
                        } else {
                            vtaVar.P = null;
                        }
                    }
                }
                vtaVar.P = new sx4[arrayList3.size()];
                int i5 = 0;
                while (i5 < arrayList3.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList3.get(i5);
                    sx4 sx4Var = new sx4(vtaVar.a0, vtaVar.a, vtaVar.getContext());
                    sx4Var.h(starGift2, false, false, false, false, true);
                    sx4Var.y.setVisibility(8);
                    sx4Var.setRibbonColor(-3065286);
                    de0 de0Var = sx4Var.E;
                    FrameLayout.LayoutParams e = tre.e(42, 42, 17);
                    sx4Var.F = e;
                    de0Var.setLayoutParams(e);
                    int i6 = i5 + 1;
                    boolean z3 = i6 >= arrayList3.size() ? z : false;
                    LinearLayout linearLayout = vtaVar.O;
                    vtaVar.P[i5] = sx4Var;
                    linearLayout.addView(sx4Var, tre.q(74, 74, 0.0f, 51, 0, 0, z3 ? 0 : 6, 0));
                    i5 = i6;
                }
                return;
            case 1:
                h1b h1bVar = (h1b) this.b;
                ok1 ok1Var = (ok1) this.c;
                String str = (String) this.d;
                v1b v1bVar = (v1b) this.e;
                w1b w1bVar = h1bVar.x;
                if (ok1Var != null) {
                    w1bVar.V.l(str, ok1Var);
                    if (!v1bVar.b && (i = v1bVar.a) >= 0) {
                        View m = w1bVar.U.m(i);
                        if (m instanceof h1b) {
                            h1bVar.r.e = ok1Var;
                            h1b h1bVar2 = (h1b) m;
                            h1bVar2.b.u0.d(false, false);
                            h1bVar2.g(false);
                        }
                    }
                }
                w1bVar.b0();
                return;
            case 2:
                i1b i1bVar = (i1b) this.b;
                ok1 ok1Var2 = (ok1) this.c;
                String str2 = (String) this.d;
                hcc hccVar = (hcc) this.e;
                i1bVar.k = false;
                i1bVar.d = ok1Var2;
                i1bVar.g = str2;
                g1b g1bVar = (g1b) hccVar.run();
                if (g1bVar != null) {
                    g1bVar.e(i1bVar, true);
                    return;
                }
                return;
            case 3:
                k3b k3bVar = (k3b) this.b;
                TLObject tLObject = (TLObject) this.c;
                i3b i3bVar = (i3b) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    k3bVar.h();
                    k3bVar.m(tL_error);
                    return;
                } else {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                    i3bVar.e = ls6.c0(tL_messageMediaDocument.document, i3bVar.c);
                    i3bVar.f = tL_messageMediaDocument;
                    k3bVar.a();
                    return;
                }
            case 4:
                k3b k3bVar2 = (k3b) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                ea8 ea8Var = (ea8) this.c;
                h3b h3bVar = (h3b) this.e;
                k3bVar2.H = true;
                k3bVar2.I = (h3b[]) arrayList4.toArray(new h3b[0]);
                ea8Var.a(h3bVar);
                return;
            case 5:
                fb8 fb8Var = (fb8) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) this.e;
                fb8Var.Z1 = 0;
                if (tL_error2 != null || !(tLObject2 instanceof Vector)) {
                    jj.c0(fb8Var.a, tL_error2, fb8Var.F1, tL_messages_getAttachedStickers, new Object[0]);
                    fb8Var.dismiss();
                    return;
                }
                Vector vector = (Vector) tLObject2;
                if (vector.objects.isEmpty()) {
                    fb8Var.dismiss();
                    return;
                }
                if (vector.objects.size() == 1) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    fb8Var.P1 = tL_inputStickerSetID;
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.id = stickerSet2.id;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    fb8Var.M0();
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                fb8Var.Q1 = arrayList5;
                arrayList5.addAll(vector.objects);
                fb8Var.m1.setLayoutParams(tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                fb8Var.q1.setVisibility(8);
                fb8Var.D1[0].setVisibility(8);
                fb8Var.n1.f();
                return;
            case 6:
                s4b s4bVar = (s4b) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                ls6 ls6Var = (ls6) this.e;
                s4bVar.Z1 = 0;
                if (tL_error3 != null) {
                    s4bVar.dismiss();
                    e eVar = s4bVar.F1;
                    if (eVar != null) {
                        xnb.x(null, 2131754378, d31.b0(eVar), null);
                        return;
                    }
                    return;
                }
                lc8 lc8Var = new lc8(s4bVar, b2);
                lc8Var.addTarget(s4bVar.b);
                TransitionManager.beginDelayedTransition(s4bVar.c, lc8Var);
                s4bVar.r1.setVisibility(0);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                s4bVar.M1 = tL_messages_stickerSet;
                ls6Var.L1(tL_messages_stickerSet, false);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s4bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                    s4bVar.dismiss();
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = s4bVar.M1;
                s4bVar.b2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                s4bVar.E0();
                ls6Var.r1(s4bVar.M1);
                s4bVar.W0();
                s4bVar.U0();
                s4bVar.T0();
                s4bVar.n1.f();
                return;
            case 7:
                r5b r5bVar = (r5b) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                pcc pccVar = (pcc) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                r5bVar.i = false;
                if (tLObject4 instanceof TL_stories.TL_storyAlbum) {
                    w5b a = w5b.a((TL_stories.TL_storyAlbum) tLObject4);
                    r5bVar.h.add(a);
                    r5bVar.f(true);
                    pccVar.a(a);
                    return;
                }
                if (tL_error4 == null || (S = LaunchActivity.S()) == null) {
                    c = 0;
                } else {
                    c = 0;
                    d31.b0(S).g0(tL_error4, false);
                }
                jn7 f2 = jn7.f(r5bVar.a);
                Object[] objArr = new Object[2];
                objArr[c] = Long.valueOf(r5bVar.b);
                objArr[1] = r5bVar;
                f2.k(jn7.l3, objArr);
                return;
            case 8:
                int i7 = 2;
                int i8 = 5;
                int i9 = 4;
                v5b v5bVar = (v5b) this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                kf7 kf7Var = (kf7) this.c;
                ArrayList arrayList7 = (ArrayList) this.e;
                int i10 = v5bVar.f;
                StringBuilder sb = new StringBuilder("StoriesList ");
                byte b3 = v5bVar.e;
                sb.append((int) b3);
                sb.append("{");
                long j6 = v5bVar.d;
                sb.append(j6);
                sb.append("} saveCache {");
                sb.append(c6b.k0(arrayList6));
                uh9.s("}", sb);
                try {
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j6 + " AND album_id = " + i10).stepThis().dispose();
                        sQLitePreparedStatement3 = sQLiteDatabase.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i11 = 0;
                        while (i11 < arrayList6.size()) {
                            TL_stories.StoryItem storyItem = ((r47) arrayList6.get(i11)).l;
                            if (storyItem == null) {
                                arrayList = arrayList6;
                                i2 = i9;
                            } else {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                                storyItem.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindLong(1, j6);
                                executeFast.bindInteger(i7, storyItem.id);
                                executeFast.bindByteBuffer(3, nativeByteBuffer);
                                executeFast.bindInteger(i9, b3);
                                executeFast.bindInteger(i8, v5bVar.m.contains(Integer.valueOf(storyItem.id)) ? 1 : 0);
                                arrayList = arrayList6;
                                executeFast.bindInteger(6, arrayList7.indexOf(Integer.valueOf(storyItem.id)) + 1);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                                sQLitePreparedStatement3.requery();
                                sQLitePreparedStatement3.bindLong(1, j6);
                                i8 = 5;
                                sQLitePreparedStatement3.bindInteger(2, i10);
                                sQLitePreparedStatement3.bindInteger(3, storyItem.id);
                                i2 = 4;
                                sQLitePreparedStatement3.bindInteger(4, i11);
                                sQLitePreparedStatement3.step();
                            }
                            i11++;
                            i9 = i2;
                            arrayList6 = arrayList;
                            i7 = 2;
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                        }
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        b = 1;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = sQLitePreparedStatement3;
                        b = 1;
                        sQLitePreparedStatement2 = executeFast;
                        try {
                            kf7Var.p(th, b);
                            hl.c3(new s5b(v5bVar, b));
                            return;
                        } finally {
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = null;
                    b = 1;
                }
                hl.c3(new s5b(v5bVar, b));
                return;
            case 9:
                c8b c8bVar = (c8b) this.b;
                String str3 = (String) this.c;
                int[][] iArr = (int[][]) this.d;
                pcc pccVar2 = (pcc) this.e;
                c8bVar.getClass();
                oec oecVar = new oec();
                oecVar.J = true;
                oecVar.Z = c8bVar.c1;
                oecVar.h = c8bVar.k0;
                oecVar.i = c8bVar.l0;
                oecVar.k = c8bVar.i0;
                oecVar.l = c8bVar.j0;
                File file = c8bVar.P0;
                oecVar.B = file == null ? null : file.getPath();
                File file2 = c8bVar.W0;
                oecVar.D = file2 == null ? null : file2.getPath();
                File file3 = c8bVar.X0;
                oecVar.E = file3 == null ? null : file3.getPath();
                File file4 = c8bVar.Y0;
                oecVar.F = file4 == null ? null : file4.getPath();
                int s = MediaController.s(oecVar.k, oecVar.l, oecVar.m, true);
                float f3 = 8.0f;
                if (!c8bVar.K || str3 == null || c8bVar.v()) {
                    File file5 = c8bVar.Z0;
                    if (file5 != null) {
                        oecVar.o = file5.getAbsolutePath();
                    } else {
                        oecVar.o = str3;
                    }
                    oecVar.I = true;
                    oecVar.L = c8bVar.S;
                    if (c8bVar.v()) {
                        int i12 = 0;
                        boolean z4 = false;
                        while (i12 < c8bVar.T.size()) {
                            c8b c8bVar2 = (c8b) c8bVar.T.get(i12);
                            if (c8bVar2.K) {
                                c8bVar2.k0 = Math.max(c8bVar2.k0, iArr[i12][1]);
                                c8bVar2.l0 = Math.max(c8bVar2.l0, iArr[i12][2]);
                                c8bVar2.h0 = Math.max(c8bVar2.h0, iArr[i12][4]);
                                z4 = true;
                            }
                            i12++;
                            z4 = z4;
                        }
                        ArrayList a2 = nec.a(c8bVar);
                        oecVar.M = a2;
                        if (z4) {
                            int size = a2.size();
                            int i13 = 0;
                            nec necVar = null;
                            long j7 = 0;
                            while (i13 < size) {
                                Object obj = a2.get(i13);
                                i13++;
                                nec necVar2 = (nec) obj;
                                float f4 = f3;
                                if (necVar2.b) {
                                    long j8 = necVar2.o;
                                    if (j8 > j7) {
                                        necVar = necVar2;
                                        j7 = j8;
                                    }
                                }
                                f3 = f4;
                            }
                            f = f3;
                            if (necVar != null) {
                                float f5 = necVar.o;
                                float f6 = necVar.k;
                                float f7 = necVar.j;
                                long j9 = (long) ((f6 - f7) * f5);
                                c8bVar.h0 = j9;
                                oecVar.v = j9;
                                oecVar.r = j9;
                                j = -(necVar.f + ((long) (f7 * f5)));
                                necVar.f = j;
                                ArrayList arrayList8 = oecVar.M;
                                int size2 = arrayList8.size();
                                int i14 = 0;
                                while (i14 < size2) {
                                    Object obj2 = arrayList8.get(i14);
                                    i14++;
                                    nec necVar3 = (nec) obj2;
                                    if (necVar3.b && necVar3 != necVar) {
                                        necVar3.f += j;
                                    }
                                }
                                oecVar.a = -1L;
                                oecVar.b = -1L;
                                oecVar.t = true;
                                oecVar.j = -1;
                                oecVar.u = 1.0f;
                                oecVar.m = -1;
                                oecVar.n = 30;
                                oecVar.q = (long) (((c8bVar.h0 / 1000.0f) * s) / f);
                                oecVar.A = null;
                            }
                        } else {
                            long j10 = c8bVar.S0;
                            c8bVar.h0 = j10;
                            oecVar.v = j10;
                            oecVar.r = j10;
                            f = 8.0f;
                        }
                    } else {
                        f = 8.0f;
                        if (c8bVar.o0 != null) {
                            long j11 = (long) ((c8bVar.t0 - c8bVar.s0) * c8bVar.q0);
                            c8bVar.h0 = j11;
                            oecVar.v = j11;
                            oecVar.r = j11;
                        } else if (c8bVar.y != null) {
                            long j12 = (long) ((c8bVar.F - c8bVar.E) * c8bVar.C);
                            c8bVar.h0 = j12;
                            oecVar.v = j12;
                            oecVar.r = j12;
                        } else {
                            long j13 = c8bVar.S0;
                            c8bVar.h0 = j13;
                            oecVar.v = j13;
                            oecVar.r = j13;
                        }
                    }
                    j = 0;
                    oecVar.a = -1L;
                    oecVar.b = -1L;
                    oecVar.t = true;
                    oecVar.j = -1;
                    oecVar.u = 1.0f;
                    oecVar.m = -1;
                    oecVar.n = 30;
                    oecVar.q = (long) (((c8bVar.h0 / 1000.0f) * s) / f);
                    oecVar.A = null;
                } else {
                    oecVar.o = str3;
                    oecVar.I = false;
                    oecVar.n = Math.min(59, iArr[0][7]);
                    int C = MediaController.C(str3);
                    if (C == -1) {
                        C = iArr[0][3];
                    }
                    oecVar.j = C;
                    if (C >= 1000000 || (arrayList2 = c8bVar.T0) == null || arrayList2.isEmpty()) {
                        int i15 = oecVar.j;
                        if (i15 < 500000) {
                            oecVar.m = 2500000;
                            oecVar.j = -1;
                        } else {
                            oecVar.m = Utilities.j(i15, 3000000, 500000);
                        }
                    } else {
                        oecVar.m = 2000000;
                        oecVar.j = -1;
                    }
                    StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
                    sb2.append(oecVar.j);
                    sb2.append(" => ");
                    c00.q(oecVar.m, sb2);
                    int i16 = iArr[0][4];
                    long j14 = i16;
                    c8bVar.h0 = j14;
                    oecVar.v = j14 * 1000;
                    float f8 = j14;
                    long j15 = ((long) (c8bVar.Z * f8)) * 1000;
                    oecVar.a = j15;
                    long j16 = ((long) (c8bVar.a0 * f8)) * 1000;
                    oecVar.b = j16;
                    oecVar.r = j16 - j15;
                    oecVar.u = c8bVar.P;
                    oecVar.t = c8bVar.Y;
                    oecVar.q = (long) qu6.d(i16 / 1000.0f, s, 8.0f, r2[5]);
                    oecVar.q = Math.max(c8bVar.L.length(), oecVar.q);
                    oecVar.A = c8bVar.a1;
                    File file6 = c8bVar.Q0;
                    oecVar.C = file6 != null ? file6.getPath() : null;
                    j = 0;
                }
                oecVar.R = c8bVar.a;
                oecVar.T = c8bVar.z0;
                oecVar.S = c8bVar.y0;
                oecVar.c = -1L;
                fo6 fo6Var2 = c8bVar.m0;
                if (fo6Var2 != null) {
                    fo6Var = fo6Var2.clone();
                    oecVar.H = fo6Var;
                } else {
                    fo6Var = new fo6();
                    oecVar.H = fo6Var;
                }
                fo6Var.B = new Matrix();
                oecVar.H.B.set(c8bVar.n0);
                oecVar.G = c8bVar.T0;
                oecVar.P = Integer.valueOf(c8bVar.A0);
                oecVar.Q = Integer.valueOf(c8bVar.B0);
                oecVar.U = true;
                oecVar.K = c8bVar.d1;
                oecVar.a0.clear();
                if (c8bVar.v() && !c8bVar.Y) {
                    ArrayList arrayList9 = oecVar.M;
                    int size3 = arrayList9.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj3 = arrayList9.get(i17);
                        i17++;
                        nec necVar4 = (nec) obj3;
                        if (necVar4.b && necVar4.e > 0.0f && !necVar4.c) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(necVar4.d);
                            mixedSoundInfo.volume = necVar4.e;
                            float f9 = necVar4.j;
                            float f10 = necVar4.o;
                            mixedSoundInfo.audioOffset = ((long) (f9 * f10)) * 1000;
                            mixedSoundInfo.startTime = necVar4.f * 1000;
                            mixedSoundInfo.duration = ((long) ((necVar4.k - f9) * f10)) * 1000;
                            oecVar.a0.add(mixedSoundInfo);
                        }
                    }
                }
                File file7 = c8bVar.o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = c8bVar.u0;
                    float f11 = c8bVar.s0;
                    float f12 = c8bVar.q0;
                    long j17 = ((long) (f11 * f12)) * 1000;
                    mixedSoundInfo2.audioOffset = j17;
                    if (c8bVar.K) {
                        long j18 = ((long) (c8bVar.r0 - (c8bVar.Z * c8bVar.h0))) * 1000;
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
                    mixedSoundInfo2.duration = ((long) ((c8bVar.t0 - f11) * f12)) * 1000;
                    oecVar.a0.add(mixedSoundInfo2);
                }
                String str4 = c8bVar.y;
                if (str4 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str4);
                    mixedSoundInfo3.volume = c8bVar.G;
                    float f13 = c8bVar.E;
                    float f14 = c8bVar.C;
                    long j20 = ((long) (f13 * f14)) * 1000;
                    mixedSoundInfo3.audioOffset = j20;
                    if (c8bVar.K) {
                        long j21 = ((long) (c8bVar.D - (c8bVar.Z * c8bVar.h0))) * 1000;
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
                    mixedSoundInfo3.duration = ((long) ((c8bVar.F - f13) * f14)) * 1000;
                    oecVar.a0.add(mixedSoundInfo3);
                }
                pccVar2.a(oecVar);
                return;
            case 10:
                okb okbVar = (okb) this.b;
                id idVar = (id) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                try {
                    idVar.dismiss();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    uc7.s1(okbVar.d).J3(0);
                    return;
                }
                if (tL_error5 == null || tL_error5.code != -1000) {
                    String M0 = ob6.M0(2131751070, null);
                    if (tL_error5 != null) {
                        StringBuilder l = c00.l(M0, "\n");
                        l.append(tL_error5.text);
                        M0 = l.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(okbVar.getContext());
                    String M02 = ob6.M0(R.string.AppName, null);
                    id idVar2 = alertDialog$Builder.a;
                    idVar2.S = M02;
                    idVar2.U = M0;
                    c00.u(null, 2131747558, alertDialog$Builder, null);
                    return;
                }
                return;
            case 11:
                TLObject tLObject6 = (TLObject) this.b;
                ynb ynbVar = (ynb) this.c;
                znb znbVar = (znb) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                aob.A--;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (ynbVar == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (ynbVar != null) {
                                ynbVar.r = tL_theme2;
                            } else {
                                znbVar.G = tL_theme2;
                                znbVar.H = false;
                                znbVar.h0 = null;
                                znbVar.i0 = null;
                                jn7.f(znbVar.F).a(znbVar, jn7.Y1);
                                jn7.f(znbVar.F).a(znbVar, jn7.Z1);
                                xb4 G = xb4.G(znbVar.F);
                                TLRPC.TL_theme tL_theme3 = znbVar.G;
                                G.X(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (znb.a(ynbVar, themeSettings)) {
                            z2 = false;
                        } else {
                            znb.g(ynbVar, themeSettings);
                            znb znbVar2 = aob.I;
                            if (znbVar2 == znbVar && znbVar2.Z == ynbVar.a) {
                                aob.r1(false, false);
                                aob.J(a.b, false);
                                znb znbVar3 = aob.I;
                                aob.I1(znbVar3, aob.J == znbVar3, -1, null);
                            }
                            z2 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        ynbVar.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        r13 = z2;
                    }
                    if (aob.A != 0) {
                        aob.B = (int) (System.currentTimeMillis() / 1000);
                        aob.w1(r13, false);
                        return;
                    }
                    return;
                }
                r13 = false;
                if (aob.A != 0) {
                }
                break;
            case 12:
                ((i61) this.b).a(aob.R0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            case 13:
                sxb sxbVar = (sxb) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                String str5 = (String) this.d;
                id idVar3 = (id) this.e;
                wxb wxbVar = sxbVar.a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i18 = 0; i18 < updates.updates.size(); i18++) {
                        if (updates.updates.get(i18) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i18);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = wxbVar.getMessagesController().y1(wxbVar.a);
                            tL_messageService.dialog_id = wxbVar.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList10 = new ArrayList();
                            i3 = ((e) wxbVar).currentAccount;
                            arrayList10.add(new r47(i3, tL_messageService, false, false));
                            TLRPC.Chat M03 = wxbVar.getMessagesController().M0(Long.valueOf(-wxbVar.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j23 = wxbVar.b;
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
                            tL_forumTopic.from_id = wxbVar.getMessagesController().y1(wxbVar.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = wxbVar.F;
                            zu1 zu1Var = wxbVar.E;
                            if (zu1Var != null) {
                                zu1Var.gb();
                                zu1Var.kb();
                                zu1Var.Ob(arrayList10, M03, tL_messageService.id, 1, 1, tL_forumTopic);
                                zu1Var.c = true;
                                zu1Var.N6();
                                zu1Var.wd(true);
                                zu1Var.p1.n(true);
                                zu1Var.Cd();
                                zu1Var.g2.setCurrentTopic(zu1Var.c());
                                zu1Var.zd(true);
                                zu1Var.Pc(true);
                                zu1Var.E7(true);
                                zu1Var.H4(true, true);
                                zu1Var.Za();
                                wxbVar.getMessagesController().h4.q(wxbVar.a, tL_forumTopic, true);
                                wxbVar.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -wxbVar.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                zu1 zu1Var2 = new zu1(bundle);
                                zu1Var2.Ob(arrayList10, M03, tL_messageService.id, 1, 1, tL_forumTopic);
                                zu1Var2.c = true;
                                wxbVar.getMessagesController().h4.q(wxbVar.a, tL_forumTopic, true);
                                wxbVar.presentFragment(zu1Var2);
                            }
                        }
                    }
                }
                idVar3.dismiss();
                return;
            case 14:
                l1c l1cVar = (l1c) this.b;
                fu5 fu5Var = (fu5) this.c;
                uc7 uc7Var = (uc7) this.d;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.e;
                fu5Var.u();
                uc7Var.h4.t(-l1cVar.f, tL_forumTopic2.id, !tL_forumTopic2.pinned, l1cVar.s);
                return;
            case 15:
                a();
                return;
            case 16:
                a5c a5cVar = (a5c) this.b;
                r47 r47Var = (r47) this.c;
                v11 v11Var = (v11) this.d;
                zo2 zo2Var = (zo2) this.e;
                r47Var.k.originalLanguage = "und";
                a5cVar.getMessagesStorage().Z1(v11Var.a, r47Var.k);
                a5cVar.L.remove(v11Var);
                zo2Var.a("und");
                return;
            case 17:
                a5c a5cVar2 = (a5c) this.b;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
                String str6 = (String) this.d;
                y4c y4cVar = (y4c) this.e;
                storyItem2.detectedLng = str6;
                a5cVar2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                a5cVar2.J.remove(y4cVar);
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case 21:
                e();
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                h();
                return;
            case 25:
                i();
                return;
            case 26:
                j();
                return;
            case 27:
                k();
                return;
            case 28:
                l();
                return;
            default:
                ((uqc) this.b).E0((LinearLayout) this.c, (c) this.d, (fu5) this.e);
                return;
        }
    }

    public /* synthetic */ kta(Object obj, ArrayList arrayList, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = arrayList;
        this.c = obj2;
        this.e = obj3;
    }
}
