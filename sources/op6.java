// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class op6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ op6(TLObject tLObject, oc7 oc7Var, z0a z0aVar) {
        this.a = (byte) 21;
        this.d = tLObject;
        this.c = oc7Var;
        this.b = z0aVar;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.c;
        Handler handler = (Handler) this.b;
        a86 a86Var = (a86) this.d;
        byte b = 5;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new f00(a86Var, b));
            }
            synchronized (j50.s) {
                int i = j50.u - 1;
                j50.u = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = j50.t;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    j50.t = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new f00(a86Var, b));
            }
            synchronized (j50.s) {
                int i2 = j50.u - 1;
                j50.u = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = j50.t;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    j50.t = null;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e6 A[Catch: Exception -> 0x033c, TryCatch #0 {Exception -> 0x033c, blocks: (B:102:0x0229, B:104:0x024c, B:106:0x0252, B:108:0x0288, B:110:0x028c, B:112:0x0290, B:114:0x0296, B:116:0x029a, B:117:0x02d9, B:119:0x02e6, B:120:0x02f1, B:122:0x0302, B:124:0x0306, B:126:0x030a, B:128:0x030e, B:130:0x0312, B:131:0x0314, B:133:0x0318, B:135:0x031c, B:138:0x0327, B:144:0x0338, B:150:0x029f, B:152:0x02a7, B:157:0x02b3, B:158:0x02b6, B:160:0x02c2, B:162:0x02c8, B:163:0x02d1, B:164:0x0256, B:166:0x0260, B:168:0x0266, B:170:0x026e, B:175:0x027a, B:176:0x027d, B:172:0x0275, B:140:0x032e, B:154:0x02ae), top: B:101:0x0229, inners: #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302 A[Catch: Exception -> 0x033c, TryCatch #0 {Exception -> 0x033c, blocks: (B:102:0x0229, B:104:0x024c, B:106:0x0252, B:108:0x0288, B:110:0x028c, B:112:0x0290, B:114:0x0296, B:116:0x029a, B:117:0x02d9, B:119:0x02e6, B:120:0x02f1, B:122:0x0302, B:124:0x0306, B:126:0x030a, B:128:0x030e, B:130:0x0312, B:131:0x0314, B:133:0x0318, B:135:0x031c, B:138:0x0327, B:144:0x0338, B:150:0x029f, B:152:0x02a7, B:157:0x02b3, B:158:0x02b6, B:160:0x02c2, B:162:0x02c8, B:163:0x02d1, B:164:0x0256, B:166:0x0260, B:168:0x0266, B:170:0x026e, B:175:0x027a, B:176:0x027d, B:172:0x0275, B:140:0x032e, B:154:0x02ae), top: B:101:0x0229, inners: #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0306 A[Catch: Exception -> 0x033c, TryCatch #0 {Exception -> 0x033c, blocks: (B:102:0x0229, B:104:0x024c, B:106:0x0252, B:108:0x0288, B:110:0x028c, B:112:0x0290, B:114:0x0296, B:116:0x029a, B:117:0x02d9, B:119:0x02e6, B:120:0x02f1, B:122:0x0302, B:124:0x0306, B:126:0x030a, B:128:0x030e, B:130:0x0312, B:131:0x0314, B:133:0x0318, B:135:0x031c, B:138:0x0327, B:144:0x0338, B:150:0x029f, B:152:0x02a7, B:157:0x02b3, B:158:0x02b6, B:160:0x02c2, B:162:0x02c8, B:163:0x02d1, B:164:0x0256, B:166:0x0260, B:168:0x0266, B:170:0x026e, B:175:0x027a, B:176:0x027d, B:172:0x0275, B:140:0x032e, B:154:0x02ae), top: B:101:0x0229, inners: #1, #2, #5 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [cf7, pg0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        TLRPC.Message message;
        ViewGroup viewGroup;
        vs6 vs6Var;
        xs6 xs6Var;
        int i2;
        TLRPC.User W1;
        byte b = 2;
        r4 = null;
        li0 li0Var = null;
        boolean z = true;
        ?? r6 = 0;
        switch (this.a) {
            case 0:
                hs6 hs6Var = (hs6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList = hs6Var.C0;
                if (tL_error == null) {
                    hs6Var.D0 = false;
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
                    nm7.f(hs6Var.currentAccount).k(nm7.p5, new Object[0]);
                    return;
                }
                return;
            case 1:
                ik.c0(((oc7) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_channels_inviteToChannel) this.d, Boolean.TRUE);
                return;
            case 2:
                ik.f(((oc7) this.c).currentAccount, (TLRPC.Chat) this.b, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 3:
                ?? r1 = (cf7) this.c;
                ?? r2 = (ArrayList) this.b;
                j77 j77Var = (j77) this.d;
                int size = r2.size();
                while (r6 < size) {
                    Object obj = r2.get(r6);
                    r6++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    if (ephemeralMessage.top_msg_id == 0) {
                        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                        if (messageReplyHeader instanceof TLRPC.TL_messageReplyHeader) {
                            int i3 = messageReplyHeader.reply_to_top_id;
                            if (i3 != 0) {
                                messageReplyHeader.forum_topic = true;
                                ephemeralMessage.top_msg_id = i3;
                                ephemeralMessage.flags |= 2;
                            } else if (messageReplyHeader.reply_to_msg_id != 0) {
                                long n = pg3.n(ephemeralMessage.peer_id);
                                TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage.reply_to;
                                boolean z2 = messageReplyHeader2.reply_to_ephemeral;
                                int i4 = messageReplyHeader2.reply_to_msg_id;
                                if (z2) {
                                    TL_ephemeral.EphemeralMessage U = r1.U(i4, n);
                                    if (U != null && (i = U.top_msg_id) != 0) {
                                        ephemeralMessage.reply_to.forum_topic = true;
                                        ephemeralMessage.top_msg_id = i;
                                        ephemeralMessage.flags |= 2;
                                    }
                                } else {
                                    TLRPC.Message a0 = r1.a0(n, i4);
                                    if (a0 != null) {
                                        int Z1 = (int) k47.Z1(r1.currentAccount, a0, r1.X(n));
                                        ephemeralMessage.top_msg_id = Z1;
                                        if (Z1 != 0) {
                                            ephemeralMessage.reply_to.forum_topic = true;
                                            ephemeralMessage.flags |= 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                r1.d1(r2, true);
                j77Var.run();
                return;
            case 4:
                ik.c0(((a6a) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_messages_forwardMessages) this.d, new Object[0]);
                return;
            case 5:
                b3c b3cVar = (b3c) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                int i5 = 0;
                boolean z3 = false;
                while (i5 < Math.min(arrayList2.size(), arrayList3.size())) {
                    k47 k47Var = (k47) arrayList3.get(i5);
                    TLRPC.Message message2 = (TLRPC.Message) arrayList2.get(i5);
                    if (k47Var != null && (message = k47Var.k) != null && message2 != null) {
                        message.translatedText = message2.translatedText;
                        message.translatedPoll = message2.translatedPoll;
                        message.translatedToLanguage = message2.translatedToLanguage;
                        if (k47Var.f6(false)) {
                            z3 = true;
                        }
                    }
                    i5++;
                    z3 = z3;
                }
                if (z3) {
                    nm7.f(b3cVar.currentAccount).k(2, 0);
                    return;
                }
                return;
            case 6:
                a1 a1Var = (a1) this.c;
                ik.J((Context) this.b, a1Var.g2, new nl9(a1Var, b), (ylb) this.d);
                return;
            case 7:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                d dVar = (d) this.b;
                d dVar2 = (d) this.d;
                Drawable drawable = ActionBarLayout.w1;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (actionBarLayout.h || actionBarLayout.b0) {
                    actionBarLayout.w.setScaleX(1.0f);
                    actionBarLayout.w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.b0 = false;
                } else {
                    actionBarLayout.w.setTranslationX(0.0f);
                }
                actionBarLayout.k(dVar);
                dVar.setRemovingFromStack(false);
                dVar.onTransitionAnimationEnd(false, true);
                dVar2.onTransitionAnimationEnd(true, true);
                dVar2.onBecomeFullyVisible();
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.c;
                x51[] x51VarArr = (x51[]) this.b;
                bw8 bw8Var = (bw8) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                x51VarArr[0].setText(jb6.M0(2131746339, null).concat("..."));
                x51VarArr[0].b.e(false);
                try {
                    ConnectionsManager.getInstance(z8c.t0).checkProxy(bw8Var, new o(zArr, x51VarArr, (byte) 12));
                    return;
                } catch (NumberFormatException unused) {
                    zArr[0] = false;
                    x51VarArr[0].setText(jb6.M0(2131743600, null));
                    anb.X(x51VarArr[0], cmb.o7, null);
                    return;
                }
            case 9:
                ht htVar = (ht) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 == null) {
                    htVar.c0((TLRPC.TL_messages_archivedStickers) tLObject2);
                    return;
                }
                return;
            case 10:
                i30 i30Var = (i30) this.c;
                he heVar = (he) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                heVar.dismiss();
                if (tLObject3 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject3).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    jc7 jc7Var = i30Var.p2;
                    if (jc7Var != null) {
                        jc7Var.c.add(0, jc7Var.d(document));
                        jc7Var.e();
                    }
                    i30Var.q2.clear();
                    i30Var.q2.addAll(i30Var.p2.c);
                    i30Var.t1.f();
                    ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 11:
                h40 h40Var = (h40) this.c;
                f40 f40Var = (f40) this.b;
                byte[] bArr = (byte[]) this.d;
                File file = f40Var.b;
                if (h40Var.G == 4) {
                    h40Var.B = bArr;
                    try {
                        h40Var.p();
                        if (h40Var.e) {
                            h74 a = new v64(h40Var.a).a();
                            h40Var.A = a;
                            a.y(h40Var.F);
                            h74 h74Var = h40Var.A;
                            Uri fromFile = Uri.fromFile(file);
                            qs6 qs6Var = new qs6();
                            ts6 ts6Var = new ts6();
                            List list = Collections.EMPTY_LIST;
                            ko5 ko5Var = mo5.b;
                            y79 y79Var = y79.e;
                            vs6 vs6Var2 = new vs6();
                            ys6 ys6Var = ys6.d;
                            if (ts6Var.b != null && ts6Var.a == null) {
                                z = false;
                            }
                            jte.p(z);
                            if (fromFile != null) {
                                vs6Var = vs6Var2;
                                xs6Var = new xs6(fromFile, null, ts6Var.a != null ? new us6(ts6Var) : null, null, list, null, y79Var, -9223372036854775807L);
                            } else {
                                vs6Var = vs6Var2;
                                xs6Var = null;
                            }
                            h74Var.q0(new bt6("", new ss6(qs6Var), xs6Var, new ws6(vs6Var), jt6.M, ys6Var));
                            h40Var.A.a();
                        }
                        h40Var.s(5);
                        hi2 hi2Var = h40Var.f;
                        long j = h40Var.j();
                        byte[] bArr2 = h40Var.B;
                        hi2Var.J(j, bArr2 != null ? (byte[]) bArr2.clone() : null);
                        return;
                    } catch (Throwable th) {
                        h40Var.g(th instanceof Exception ? th : new RuntimeException(th));
                        return;
                    }
                }
                return;
            case 12:
                h40 h40Var2 = (h40) this.c;
                f40 f40Var2 = (f40) this.b;
                File file2 = (File) this.d;
                lx6 lx6Var = h40Var2.g;
                long j2 = f40Var2.a;
                synchronized (((u30) lx6Var.c).f) {
                    ((HashMap) ((u30) lx6Var.c).g).put(Long.valueOf(j2), file2);
                }
                ((Handler) ((u30) lx6Var.c).d).post(new t30(lx6Var, j2, (on6) lx6Var.b, file2, (byte) 1));
                return;
            case 13:
                lx6 lx6Var2 = (lx6) this.c;
                go4 go4Var = (go4) this.b;
                pa3 pa3Var = (pa3) this.d;
                o40 o40Var = (o40) lx6Var2.c;
                String str = hac.a;
                xa3 xa3Var = ((c74) o40Var).a.s;
                tk U2 = xa3Var.U();
                xa3Var.V(U2, 1009, new ua3(U2, go4Var, pa3Var, (byte) 16));
                return;
            case 14:
                a();
                return;
            case 15:
                be0 be0Var = (be0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    be0Var.a.b(false);
                    c41.e0(tL_error3);
                    return;
                } else if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                    be0Var.finishFragment();
                    return;
                } else {
                    be0Var.a.b(false);
                    mlb.y(null, 2131743566, c41.b0(be0Var), null);
                    return;
                }
            case 16:
                oi0 oi0Var = (oi0) this.c;
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.d;
                oi0Var.h = false;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("version");
                    int i6 = jSONObject.getInt("version_code");
                    String string2 = jSONObject.getString("file_url");
                    String optString = jSONObject.optString("changelog", null);
                    int i7 = oi0Var.b;
                    String str3 = oi0Var.a;
                    if ((str3 == null || (gda.R(string, str3) && i6 > oi0Var.b)) && gda.R(string, oi0.c()) && i6 > oi0.d()) {
                        if (!TextUtils.isEmpty(oi0Var.d)) {
                            try {
                                new File(oi0Var.d).delete();
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                        }
                        oi0Var.d = null;
                        oi0Var.a = string;
                        oi0Var.b = i6;
                        oi0Var.f = string2;
                        oi0Var.c = optString;
                        oi0Var.e = System.currentTimeMillis();
                        oi0Var.f();
                        if (oi0Var.b != i7) {
                            nm7.e().k(nm7.U4, new Object[0]);
                        }
                        gm.r(oi0Var.i);
                        mi0 mi0Var = oi0Var.i;
                        boolean z4 = e21.a;
                        gm.d3(mi0Var, 1200000L);
                        if (runnable == null) {
                            runnable.run();
                            return;
                        }
                        if (oi0Var.b == i7 || a.x) {
                            return;
                        }
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = a.b;
                        }
                        String str4 = oi0Var.a;
                        if (str4 != null && (i2 = oi0Var.b) != 0) {
                            li0Var = new li0(str4, i2, oi0Var.c);
                        }
                        if (context == null || li0Var == null) {
                            return;
                        }
                        ((ApplicationLoaderImpl) a.a).getClass();
                        try {
                            new k8c(context, li0Var).show();
                            return;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            return;
                        }
                    }
                    String str5 = oi0Var.a;
                    if (str5 == null || oi0Var.b == 0 || !gda.R(str5, string) || oi0Var.b != i6) {
                        if (!TextUtils.isEmpty(oi0Var.d)) {
                            try {
                                new File(oi0Var.d).delete();
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                        }
                        oi0Var.d = null;
                        if (!gda.R(oi0.c(), string) || oi0.d() >= i6) {
                            oi0Var.a = null;
                            oi0Var.b = 0;
                            oi0Var.f = null;
                            oi0Var.c = null;
                        } else {
                            oi0Var.a = string;
                            oi0Var.b = i6;
                            oi0Var.f = string2;
                            oi0Var.c = optString;
                        }
                    } else {
                        oi0Var.f = string2;
                        oi0Var.c = optString;
                    }
                    oi0Var.e = System.currentTimeMillis();
                    oi0Var.f();
                    if (oi0Var.b != i7) {
                    }
                    gm.r(oi0Var.i);
                    mi0 mi0Var2 = oi0Var.i;
                    boolean z42 = e21.a;
                    gm.d3(mi0Var2, 1200000L);
                    if (runnable == null) {
                    }
                } catch (Exception e4) {
                    fc4.e("Failed to check for beta update at null received: " + str2, e4);
                    return;
                }
                break;
            case 17:
                ArrayList arrayList4 = (ArrayList) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                e77 e77Var = (e77) this.d;
                arrayList4.add(null);
                if (atomicInteger.get() == arrayList4.size()) {
                    e77Var.run();
                    return;
                }
                return;
            case 18:
                j5 j5Var = (j5) this.c;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.b;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                mh6 mh6Var = (mh6) LaunchActivity.M();
                if (mh6Var == null) {
                    mh6Var = new mh6(j5Var.a);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(mh6Var);
                    }
                }
                mh6Var.F1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
                return;
            case 19:
                ok0 ok0Var = (ok0) this.c;
                nk0 nk0Var = (nk0) this.b;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.d;
                TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
                contactbirthdays.contacts = nk0Var.a;
                contactbirthdays.users = arrayList5;
                ok0Var.c = mk0.b(contactbirthdays);
                return;
            case 20:
                ((z0a) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
                return;
            case 21:
                TLObject tLObject5 = (TLObject) this.d;
                oc7 oc7Var = (oc7) this.c;
                z0a z0aVar = (z0a) this.b;
                if (tLObject5 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject5;
                    oc7Var.d4(tL_channels_channelParticipants.users, false);
                    oc7Var.X3(tL_channels_channelParticipants.chats, false);
                    long e5 = z8c.h(z8c.t0).e();
                    ArrayList arrayList6 = new ArrayList();
                    for (int i8 = 0; i8 < tL_channels_channelParticipants.participants.size(); i8++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i8).peer;
                        if (peer != null && k47.B1(peer) != e5 && (W1 = oc7Var.W1(Long.valueOf(peer.user_id))) != null && !m9c.z(W1) && !W1.bot) {
                            arrayList6.add(oc7Var.l1(peer));
                        }
                    }
                    z0aVar.a(arrayList6);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                qac qacVar = (qac) this.c;
                qac qacVar2 = (qac) this.d;
                if (tL_error4 != null) {
                    qacVar.a(tL_error4);
                    return;
                } else {
                    qacVar2.a(null);
                    return;
                }
            case 23:
                ((mf2) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
                return;
            case 24:
                ArrayList arrayList7 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.b;
                qac qacVar3 = (qac) this.d;
                ArrayList arrayList8 = new ArrayList();
                for (int i9 = 0; i9 < arrayList7.size(); i9++) {
                    TLRPC.User user = (TLRPC.User) arrayList7.get(i9);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z5 = bool == null || !bool.booleanValue();
                    tp0 tp0Var = new tp0();
                    tp0Var.a = user;
                    tp0Var.b = z5;
                    arrayList8.add(tp0Var);
                }
                qacVar3.a(arrayList8);
                return;
            case 25:
                rs0 rs0Var = (rs0) this.c;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                eq eqVar = (eq) this.d;
                if (rs0Var.y == animatorSet) {
                    rs0Var.w = true;
                    org.telegram.ui.ActionBar.a aVar = (org.telegram.ui.ActionBar.a) eqVar.e;
                    if (aVar != null) {
                        aVar.setAlpha(0.0f);
                    }
                    rs0Var.d.setLayerType(2, null);
                    rs0Var.n0(rs0Var.x);
                    rs0Var.c.postOnAnimation(new ns0(rs0Var, animatorSet, r6));
                    return;
                }
                return;
            case 26:
                au0 au0Var = (au0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                Context context2 = (Context) this.b;
                if (tLObject6 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    l11.u(context2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject6).url);
                }
                gm.d3(new mt0(au0Var, (byte) 6), 1000L);
                return;
            case 27:
                boolean[] zArr2 = (boolean[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                qu0 qu0Var = (qu0) this.b;
                zArr2[0] = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    qu0Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 28:
                File file3 = (File) this.c;
                int[] iArr = (int[]) this.b;
                ja7 ja7Var = (ja7) this.d;
                AnimatedFileNative.d(file3.getAbsolutePath(), iArr, 0L);
                gm.c3(ja7Var);
                return;
            default:
                qw0 qw0Var = (qw0) this.c;
                gu2 gu2Var = (gu2) this.b;
                String[] strArr = (String[]) this.d;
                qw0Var.getClass();
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (qw0Var.getContext().checkSelfPermission(strArr[i10]) != 0) {
                            z = false;
                        } else {
                            i10++;
                        }
                    }
                }
                gu2Var.accept(Boolean.valueOf(z));
                return;
        }
    }

    public /* synthetic */ op6(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
    }

    public /* synthetic */ op6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ op6(TLRPC.TL_error tL_error, qac qacVar, qac qacVar2) {
        this.a = (byte) 22;
        this.b = tL_error;
        this.c = qacVar;
        this.d = qacVar2;
    }
}
