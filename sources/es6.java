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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class es6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ es6(TLObject tLObject, uc7 uc7Var, r2a r2aVar) {
        this.a = (byte) 22;
        this.d = tLObject;
        this.c = uc7Var;
        this.b = r2aVar;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.c;
        Handler handler = (Handler) this.b;
        e86 e86Var = (e86) this.d;
        byte b = 3;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new pz(e86Var, b));
            }
            synchronized (l40.s) {
                int i = l40.u - 1;
                l40.u = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = l40.t;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    l40.t = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new pz(e86Var, b));
            }
            synchronized (l40.s) {
                int i2 = l40.u - 1;
                l40.u = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = l40.t;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    l40.t = null;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e6 A[Catch: Exception -> 0x033c, TryCatch #1 {Exception -> 0x033c, blocks: (B:102:0x0229, B:104:0x024c, B:106:0x0252, B:108:0x0288, B:110:0x028c, B:112:0x0290, B:114:0x0296, B:116:0x029a, B:117:0x02d9, B:119:0x02e6, B:120:0x02f1, B:122:0x0302, B:124:0x0306, B:126:0x030a, B:128:0x030e, B:130:0x0312, B:131:0x0314, B:133:0x0318, B:135:0x031c, B:138:0x0327, B:144:0x0338, B:150:0x029f, B:152:0x02a7, B:157:0x02b3, B:158:0x02b6, B:160:0x02c2, B:162:0x02c8, B:163:0x02d1, B:164:0x0256, B:166:0x0260, B:168:0x0266, B:170:0x026e, B:175:0x027a, B:176:0x027d, B:172:0x0275, B:140:0x032e, B:154:0x02ae), top: B:101:0x0229, inners: #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0302 A[Catch: Exception -> 0x033c, TryCatch #1 {Exception -> 0x033c, blocks: (B:102:0x0229, B:104:0x024c, B:106:0x0252, B:108:0x0288, B:110:0x028c, B:112:0x0290, B:114:0x0296, B:116:0x029a, B:117:0x02d9, B:119:0x02e6, B:120:0x02f1, B:122:0x0302, B:124:0x0306, B:126:0x030a, B:128:0x030e, B:130:0x0312, B:131:0x0314, B:133:0x0318, B:135:0x031c, B:138:0x0327, B:144:0x0338, B:150:0x029f, B:152:0x02a7, B:157:0x02b3, B:158:0x02b6, B:160:0x02c2, B:162:0x02c8, B:163:0x02d1, B:164:0x0256, B:166:0x0260, B:168:0x0266, B:170:0x026e, B:175:0x027a, B:176:0x027d, B:172:0x0275, B:140:0x032e, B:154:0x02ae), top: B:101:0x0229, inners: #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0306 A[Catch: Exception -> 0x033c, TryCatch #1 {Exception -> 0x033c, blocks: (B:102:0x0229, B:104:0x024c, B:106:0x0252, B:108:0x0288, B:110:0x028c, B:112:0x0290, B:114:0x0296, B:116:0x029a, B:117:0x02d9, B:119:0x02e6, B:120:0x02f1, B:122:0x0302, B:124:0x0306, B:126:0x030a, B:128:0x030e, B:130:0x0312, B:131:0x0314, B:133:0x0318, B:135:0x031c, B:138:0x0327, B:144:0x0338, B:150:0x029f, B:152:0x02a7, B:157:0x02b3, B:158:0x02b6, B:160:0x02c2, B:162:0x02c8, B:163:0x02d1, B:164:0x0256, B:166:0x0260, B:168:0x0266, B:170:0x026e, B:175:0x027a, B:176:0x027d, B:172:0x0275, B:140:0x032e, B:154:0x02ae), top: B:101:0x0229, inners: #2, #4, #6 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kf7, rf0] */
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
        zs6 zs6Var;
        bt6 bt6Var;
        int i2;
        TLRPC.User X1;
        byte b = 2;
        r4 = null;
        mh0 mh0Var = null;
        boolean z = true;
        ?? r6 = 0;
        switch (this.a) {
            case 0:
                ls6 ls6Var = (ls6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList = ls6Var.C0;
                if (tL_error == null) {
                    ls6Var.D0 = false;
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
                    jn7.f(ls6Var.currentAccount).k(jn7.o5, new Object[0]);
                    return;
                }
                return;
            case 1:
                jj.c0(((uc7) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_channels_inviteToChannel) this.d, Boolean.TRUE);
                return;
            case 2:
                jj.f(((uc7) this.c).currentAccount, (TLRPC.Chat) this.b, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 3:
                ?? r1 = (kf7) this.c;
                ?? r2 = (ArrayList) this.b;
                m77 m77Var = (m77) this.d;
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
                                long n = wf3.n(ephemeralMessage.peer_id);
                                TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage.reply_to;
                                boolean z2 = messageReplyHeader2.reply_to_ephemeral;
                                int i4 = messageReplyHeader2.reply_to_msg_id;
                                if (z2) {
                                    TL_ephemeral.EphemeralMessage W = r1.W(i4, n);
                                    if (W != null && (i = W.top_msg_id) != 0) {
                                        ephemeralMessage.reply_to.forum_topic = true;
                                        ephemeralMessage.top_msg_id = i;
                                        ephemeralMessage.flags |= 2;
                                    }
                                } else {
                                    TLRPC.Message c0 = r1.c0(n, i4);
                                    if (c0 != null) {
                                        int Z1 = (int) r47.Z1(r1.currentAccount, c0, r1.Z(n));
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
                r1.h1(r2, true);
                m77Var.run();
                return;
            case 4:
                jj.c0(((r7a) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_messages_forwardMessages) this.d, new Object[0]);
                return;
            case 5:
                a5c a5cVar = (a5c) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                int i5 = 0;
                boolean z3 = false;
                while (i5 < Math.min(arrayList2.size(), arrayList3.size())) {
                    r47 r47Var = (r47) arrayList3.get(i5);
                    TLRPC.Message message2 = (TLRPC.Message) arrayList2.get(i5);
                    if (r47Var != null && (message = r47Var.k) != null && message2 != null) {
                        message.translatedText = message2.translatedText;
                        message.translatedPoll = message2.translatedPoll;
                        message.translatedToLanguage = message2.translatedToLanguage;
                        if (r47Var.f6(false)) {
                            z3 = true;
                        }
                    }
                    i5++;
                    z3 = z3;
                }
                if (z3) {
                    jn7.f(a5cVar.currentAccount).k(2, 0);
                    return;
                }
                return;
            case 6:
                b1 b1Var = (b1) this.c;
                jj.J((Context) this.b, b1Var.g2, new zm9(b1Var, b), (vnb) this.d);
                return;
            case 7:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                e eVar = (e) this.b;
                e eVar2 = (e) this.d;
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
                actionBarLayout.k(eVar);
                eVar.setRemovingFromStack(false);
                eVar.onTransitionAnimationEnd(false, true);
                eVar2.onTransitionAnimationEnd(true, true);
                eVar2.onBecomeFullyVisible();
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.c;
                y41[] y41VarArr = (y41[]) this.b;
                jx8 jx8Var = (jx8) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                y41VarArr[0].setText(ob6.M0(2131746333, null).concat("..."));
                y41VarArr[0].b.e(false);
                try {
                    ConnectionsManager.getInstance(yac.t0).checkProxy(jx8Var, new o(zArr, y41VarArr, (byte) 12));
                    return;
                } catch (NumberFormatException unused) {
                    zArr[0] = false;
                    y41VarArr[0].setText(ob6.M0(2131743568, null));
                    yob.X(y41VarArr[0], aob.p7, null);
                    return;
                }
            case 9:
                is isVar = (is) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 == null) {
                    isVar.b0((TLRPC.TL_messages_archivedStickers) tLObject2);
                    return;
                }
                return;
            case 10:
                j20 j20Var = (j20) this.c;
                id idVar = (id) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                idVar.dismiss();
                if (tLObject3 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject3).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    pc7 pc7Var = j20Var.p2;
                    if (pc7Var != null) {
                        pc7Var.c.add(0, pc7Var.d(document));
                        pc7Var.e();
                    }
                    j20Var.q2.clear();
                    j20Var.q2.addAll(j20Var.p2.c);
                    j20Var.t1.f();
                    ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 11:
                i30 i30Var = (i30) this.c;
                g30 g30Var = (g30) this.b;
                byte[] bArr = (byte[]) this.d;
                File file = g30Var.b;
                if (i30Var.G == 4) {
                    i30Var.B = bArr;
                    try {
                        i30Var.p();
                        if (i30Var.e) {
                            s64 a = new f64(i30Var.a).a();
                            i30Var.A = a;
                            a.y(i30Var.F);
                            s64 s64Var = i30Var.A;
                            Uri fromFile = Uri.fromFile(file);
                            us6 us6Var = new us6();
                            xs6 xs6Var = new xs6();
                            List list = Collections.EMPTY_LIST;
                            no5 no5Var = po5.b;
                            j99 j99Var = j99.e;
                            zs6 zs6Var2 = new zs6();
                            ct6 ct6Var = ct6.d;
                            if (xs6Var.b != null && xs6Var.a == null) {
                                z = false;
                            }
                            yve.p(z);
                            if (fromFile != null) {
                                zs6Var = zs6Var2;
                                bt6Var = new bt6(fromFile, null, xs6Var.a != null ? new ys6(xs6Var) : null, null, list, null, j99Var, -9223372036854775807L);
                            } else {
                                zs6Var = zs6Var2;
                                bt6Var = null;
                            }
                            s64Var.q0(new ft6("", new ws6(us6Var), bt6Var, new at6(zs6Var), nt6.M, ct6Var));
                            i30Var.A.a();
                        }
                        i30Var.s(5);
                        qx6 qx6Var = i30Var.f;
                        long j = i30Var.j();
                        byte[] bArr2 = i30Var.B;
                        qx6Var.C(j, bArr2 != null ? (byte[]) bArr2.clone() : null);
                        return;
                    } catch (Throwable th) {
                        i30Var.g(th instanceof Exception ? th : new RuntimeException(th));
                        return;
                    }
                }
                return;
            case 12:
                i30 i30Var2 = (i30) this.c;
                g30 g30Var2 = (g30) this.b;
                File file2 = (File) this.d;
                lh2 lh2Var = i30Var2.g;
                long j2 = g30Var2.a;
                synchronized (((v20) lh2Var.c).c) {
                    ((v20) lh2Var.c).d.put(Long.valueOf(j2), file2);
                }
                ((v20) lh2Var.c).a.post(new u20(lh2Var, j2, (sn6) lh2Var.b, file2, (byte) 1));
                return;
            case 13:
                lh2 lh2Var2 = (lh2) this.c;
                ko4 ko4Var = (ko4) this.b;
                w93 w93Var = (w93) this.d;
                p30 p30Var = (p30) lh2Var2.c;
                String str = gcc.a;
                ea3 ea3Var = ((n64) p30Var).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1009, new aa3(U, ko4Var, w93Var, (byte) 21));
                return;
            case 14:
                a();
                return;
            case 15:
                dd0 dd0Var = (dd0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    dd0Var.a.b(false);
                    d31.e0(tL_error3);
                    return;
                } else if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                    dd0Var.finishFragment();
                    return;
                } else {
                    dd0Var.a.b(false);
                    xnb.x(null, 2131743534, d31.b0(dd0Var), null);
                    return;
                }
            case 16:
                ph0 ph0Var = (ph0) this.c;
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.d;
                ph0Var.h = false;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("version");
                    int i6 = jSONObject.getInt("version_code");
                    String string2 = jSONObject.getString("file_url");
                    String optString = jSONObject.optString("changelog", null);
                    int i7 = ph0Var.b;
                    String str3 = ph0Var.a;
                    if ((str3 == null || (xea.R(string, str3) && i6 > ph0Var.b)) && xea.R(string, ph0.c()) && i6 > ph0.d()) {
                        if (!TextUtils.isEmpty(ph0Var.d)) {
                            try {
                                new File(ph0Var.d).delete();
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        }
                        ph0Var.d = null;
                        ph0Var.a = string;
                        ph0Var.b = i6;
                        ph0Var.f = string2;
                        ph0Var.c = optString;
                        ph0Var.e = System.currentTimeMillis();
                        ph0Var.f();
                        if (ph0Var.b != i7) {
                            jn7.e().k(jn7.T4, new Object[0]);
                        }
                        hl.r(ph0Var.i);
                        nh0 nh0Var = ph0Var.i;
                        boolean z4 = f11.a;
                        hl.d3(nh0Var, 1200000L);
                        if (runnable == null) {
                            runnable.run();
                            return;
                        }
                        if (ph0Var.b == i7 || a.x) {
                            return;
                        }
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = a.b;
                        }
                        String str4 = ph0Var.a;
                        if (str4 != null && (i2 = ph0Var.b) != 0) {
                            mh0Var = new mh0(str4, i2, ph0Var.c);
                        }
                        if (context == null || mh0Var == null) {
                            return;
                        }
                        ((ApplicationLoaderImpl) a.a).getClass();
                        try {
                            new jac(context, mh0Var).show();
                            return;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return;
                        }
                    }
                    String str5 = ph0Var.a;
                    if (str5 == null || ph0Var.b == 0 || !xea.R(str5, string) || ph0Var.b != i6) {
                        if (!TextUtils.isEmpty(ph0Var.d)) {
                            try {
                                new File(ph0Var.d).delete();
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                        }
                        ph0Var.d = null;
                        if (!xea.R(ph0.c(), string) || ph0.d() >= i6) {
                            ph0Var.a = null;
                            ph0Var.b = 0;
                            ph0Var.f = null;
                            ph0Var.c = null;
                        } else {
                            ph0Var.a = string;
                            ph0Var.b = i6;
                            ph0Var.f = string2;
                            ph0Var.c = optString;
                        }
                    } else {
                        ph0Var.f = string2;
                        ph0Var.c = optString;
                    }
                    ph0Var.e = System.currentTimeMillis();
                    ph0Var.f();
                    if (ph0Var.b != i7) {
                    }
                    hl.r(ph0Var.i);
                    nh0 nh0Var2 = ph0Var.i;
                    boolean z42 = f11.a;
                    hl.d3(nh0Var2, 1200000L);
                    if (runnable == null) {
                    }
                } catch (Exception e4) {
                    cc4.e("Failed to check for beta update at https://telegram.org/dl/android/apk-public-beta.json received: " + str2, e4);
                    return;
                }
                break;
            case 17:
                ArrayList arrayList4 = (ArrayList) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                z87 z87Var = (z87) this.d;
                arrayList4.add(null);
                if (atomicInteger.get() == arrayList4.size()) {
                    z87Var.run();
                    return;
                }
                return;
            case 18:
                k5 k5Var = (k5) this.c;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.b;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                qh6 qh6Var = (qh6) LaunchActivity.M();
                if (qh6Var == null) {
                    qh6Var = new qh6(k5Var.a);
                    e S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(qh6Var);
                    }
                }
                qh6Var.F1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
                return;
            case 19:
                pj0 pj0Var = (pj0) this.c;
                oj0 oj0Var = (oj0) this.b;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.d;
                TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
                contactbirthdays.contacts = oj0Var.a;
                contactbirthdays.users = arrayList5;
                pj0Var.c = nj0.b(contactbirthdays);
                return;
            case 20:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                pcc pccVar = (pcc) this.c;
                pcc pccVar2 = (pcc) this.d;
                if (tL_error4 != null) {
                    pccVar.a(tL_error4);
                    return;
                } else {
                    pccVar2.a(null);
                    return;
                }
            case 21:
                ((r2a) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
                return;
            case 22:
                TLObject tLObject5 = (TLObject) this.d;
                uc7 uc7Var = (uc7) this.c;
                r2a r2aVar = (r2a) this.b;
                if (tLObject5 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject5;
                    uc7Var.j4(tL_channels_channelParticipants.users, false);
                    uc7Var.c4(tL_channels_channelParticipants.chats, false);
                    long e5 = yac.h(yac.t0).e();
                    ArrayList arrayList6 = new ArrayList();
                    for (int i8 = 0; i8 < tL_channels_channelParticipants.participants.size(); i8++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i8).peer;
                        if (peer != null && r47.B1(peer) != e5 && (X1 = uc7Var.X1(Long.valueOf(peer.user_id))) != null && !lbc.z(X1) && !X1.bot) {
                            arrayList6.add(uc7Var.m1(peer));
                        }
                    }
                    r2aVar.a(arrayList6);
                    return;
                }
                return;
            case 23:
                ((te2) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
                return;
            case 24:
                ArrayList arrayList7 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.b;
                pcc pccVar3 = (pcc) this.d;
                ArrayList arrayList8 = new ArrayList();
                for (int i9 = 0; i9 < arrayList7.size(); i9++) {
                    TLRPC.User user = (TLRPC.User) arrayList7.get(i9);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z5 = bool == null || !bool.booleanValue();
                    to0 to0Var = new to0();
                    to0Var.a = user;
                    to0Var.b = z5;
                    arrayList8.add(to0Var);
                }
                pccVar3.a(arrayList8);
                return;
            case 25:
                rr0 rr0Var = (rr0) this.c;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                fp fpVar = (fp) this.d;
                if (rr0Var.y == animatorSet) {
                    rr0Var.w = true;
                    org.telegram.ui.ActionBar.a aVar = (org.telegram.ui.ActionBar.a) fpVar.e;
                    if (aVar != null) {
                        aVar.setAlpha(0.0f);
                    }
                    rr0Var.d.setLayerType(2, null);
                    rr0Var.m0(rr0Var.x);
                    rr0Var.c.postOnAnimation(new nr0(rr0Var, animatorSet, r6));
                    return;
                }
                return;
            case 26:
                at0 at0Var = (at0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                Context context2 = (Context) this.b;
                if (tLObject6 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    m01.u(context2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject6).url);
                }
                hl.d3(new ms0(at0Var, (byte) 6), 1000L);
                return;
            case 27:
                boolean[] zArr2 = (boolean[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                qt0 qt0Var = (qt0) this.b;
                zArr2[0] = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    qt0Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 28:
                File file3 = (File) this.c;
                int[] iArr = (int[]) this.b;
                ra7 ra7Var = (ra7) this.d;
                AnimatedFileNative.d(file3.getAbsolutePath(), iArr, 0L);
                hl.c3(ra7Var);
                return;
            default:
                rv0 rv0Var = (rv0) this.c;
                pt2 pt2Var = (pt2) this.b;
                String[] strArr = (String[]) this.d;
                rv0Var.getClass();
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (rv0Var.getContext().checkSelfPermission(strArr[i10]) != 0) {
                            z = false;
                        } else {
                            i10++;
                        }
                    }
                }
                pt2Var.accept(Boolean.valueOf(z));
                return;
        }
    }

    public /* synthetic */ es6(Object obj, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
    }

    public /* synthetic */ es6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ es6(TLRPC.TL_error tL_error, pcc pccVar, pcc pccVar2) {
        this.a = (byte) 20;
        this.b = tL_error;
        this.c = pccVar;
        this.d = pccVar2;
    }
}
