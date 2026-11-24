// default package

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
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nn6(TLObject tLObject, na7 na7Var, xy9 xy9Var) {
        this.a = (byte) 21;
        this.d = tLObject;
        this.c = na7Var;
        this.b = xy9Var;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.c;
        Handler handler = (Handler) this.b;
        a66 a66Var = (a66) this.d;
        byte b = 3;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new oz(a66Var, b));
            }
            synchronized (j40.s) {
                int i = j40.u - 1;
                j40.u = i;
                if (i == 0) {
                    ScheduledExecutorService scheduledExecutorService = j40.t;
                    scheduledExecutorService.getClass();
                    scheduledExecutorService.shutdown();
                    j40.t = null;
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new oz(a66Var, b));
            }
            synchronized (j40.s) {
                int i2 = j40.u - 1;
                j40.u = i2;
                if (i2 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = j40.t;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    j40.t = null;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02d4 A[Catch: Exception -> 0x032a, TryCatch #1 {Exception -> 0x032a, blocks: (B:105:0x0217, B:107:0x023a, B:109:0x0240, B:111:0x0276, B:113:0x027a, B:115:0x027e, B:117:0x0284, B:119:0x0288, B:120:0x02c7, B:122:0x02d4, B:123:0x02df, B:125:0x02f0, B:127:0x02f4, B:129:0x02f8, B:131:0x02fc, B:133:0x0300, B:134:0x0302, B:136:0x0306, B:138:0x030a, B:141:0x0315, B:147:0x0326, B:153:0x028d, B:155:0x0295, B:160:0x02a1, B:161:0x02a4, B:163:0x02b0, B:165:0x02b6, B:166:0x02bf, B:167:0x0244, B:169:0x024e, B:171:0x0254, B:173:0x025c, B:178:0x0268, B:179:0x026b, B:157:0x029c, B:175:0x0263, B:143:0x031c), top: B:104:0x0217, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f0 A[Catch: Exception -> 0x032a, TryCatch #1 {Exception -> 0x032a, blocks: (B:105:0x0217, B:107:0x023a, B:109:0x0240, B:111:0x0276, B:113:0x027a, B:115:0x027e, B:117:0x0284, B:119:0x0288, B:120:0x02c7, B:122:0x02d4, B:123:0x02df, B:125:0x02f0, B:127:0x02f4, B:129:0x02f8, B:131:0x02fc, B:133:0x0300, B:134:0x0302, B:136:0x0306, B:138:0x030a, B:141:0x0315, B:147:0x0326, B:153:0x028d, B:155:0x0295, B:160:0x02a1, B:161:0x02a4, B:163:0x02b0, B:165:0x02b6, B:166:0x02bf, B:167:0x0244, B:169:0x024e, B:171:0x0254, B:173:0x025c, B:178:0x0268, B:179:0x026b, B:157:0x029c, B:175:0x0263, B:143:0x031c), top: B:104:0x0217, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f4 A[Catch: Exception -> 0x032a, TryCatch #1 {Exception -> 0x032a, blocks: (B:105:0x0217, B:107:0x023a, B:109:0x0240, B:111:0x0276, B:113:0x027a, B:115:0x027e, B:117:0x0284, B:119:0x0288, B:120:0x02c7, B:122:0x02d4, B:123:0x02df, B:125:0x02f0, B:127:0x02f4, B:129:0x02f8, B:131:0x02fc, B:133:0x0300, B:134:0x0302, B:136:0x0306, B:138:0x030a, B:141:0x0315, B:147:0x0326, B:153:0x028d, B:155:0x0295, B:160:0x02a1, B:161:0x02a4, B:163:0x02b0, B:165:0x02b6, B:166:0x02bf, B:167:0x0244, B:169:0x024e, B:171:0x0254, B:173:0x025c, B:178:0x0268, B:179:0x026b, B:157:0x029c, B:175:0x0263, B:143:0x031c), top: B:104:0x0217, inners: #0, #2, #4 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        TLRPC.Message message;
        ViewGroup viewGroup;
        vq6 vq6Var;
        xq6 xq6Var;
        int i2;
        TLRPC.User V1;
        byte b = 2;
        r3 = null;
        lh0 lh0Var = null;
        boolean z = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                hq6 hq6Var = (hq6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList = hq6Var.C0;
                if (tL_error == null) {
                    hq6Var.D0 = false;
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
                    kk7.f(hq6Var.currentAccount).k(kk7.n5, new Object[0]);
                    return;
                }
                return;
            case 1:
                ij.c0(((na7) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_channels_inviteToChannel) this.d, Boolean.TRUE);
                return;
            case 2:
                ij.f(((na7) this.c).currentAccount, (TLRPC.Chat) this.b, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 3:
                ad7 ad7Var = (ad7) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                j57 j57Var = (j57) this.d;
                int size = arrayList2.size();
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    if (ephemeralMessage.top_msg_id == 0) {
                        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                        if (messageReplyHeader instanceof TLRPC.TL_messageReplyHeader) {
                            int i4 = messageReplyHeader.reply_to_top_id;
                            if (i4 != 0) {
                                messageReplyHeader.forum_topic = true;
                                ephemeralMessage.top_msg_id = i4;
                                ephemeralMessage.flags |= 2;
                            } else if (messageReplyHeader.reply_to_msg_id != 0) {
                                long n = cf3.n(ephemeralMessage.peer_id);
                                TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage.reply_to;
                                boolean z2 = messageReplyHeader2.reply_to_ephemeral;
                                int i5 = messageReplyHeader2.reply_to_msg_id;
                                if (z2) {
                                    TL_ephemeral.EphemeralMessage U = ad7Var.U(i5, n);
                                    if (U != null && (i = U.top_msg_id) != 0) {
                                        ephemeralMessage.reply_to.forum_topic = true;
                                        ephemeralMessage.top_msg_id = i;
                                        ephemeralMessage.flags |= 2;
                                    }
                                } else {
                                    TLRPC.Message a0 = ad7Var.a0(n, i5);
                                    if (a0 != null) {
                                        int Z1 = (int) k27.Z1(ad7Var.currentAccount, a0, ad7Var.X(n));
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
                ad7Var.d1(arrayList2, true);
                j57Var.run();
                return;
            case 4:
                ij.c0(((z3a) this.c).currentAccount, (TLRPC.TL_error) this.b, null, (TLRPC.TL_messages_forwardMessages) this.d, new Object[0]);
                return;
            case 5:
                b1c b1cVar = (b1c) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                int i6 = 0;
                boolean z3 = false;
                while (i6 < Math.min(arrayList3.size(), arrayList4.size())) {
                    k27 k27Var = (k27) arrayList4.get(i6);
                    TLRPC.Message message2 = (TLRPC.Message) arrayList3.get(i6);
                    if (k27Var != null && (message = k27Var.k) != null && message2 != null) {
                        message.translatedText = message2.translatedText;
                        message.translatedPoll = message2.translatedPoll;
                        message.translatedToLanguage = message2.translatedToLanguage;
                        if (k27Var.f6(false)) {
                            z3 = true;
                        }
                    }
                    i6++;
                    z3 = z3;
                }
                if (z3) {
                    kk7.f(b1cVar.currentAccount).k(2, 0);
                    return;
                }
                return;
            case 6:
                a1 a1Var = (a1) this.c;
                ij.J((Context) this.b, a1Var.g2, new lj9(a1Var, b), (wjb) this.d);
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
                q41[] q41VarArr = (q41[]) this.b;
                au8 au8Var = (au8) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                q41VarArr[0].setText(k96.M0(2131746413, null).concat("..."));
                q41VarArr[0].b.e(false);
                try {
                    ConnectionsManager.getInstance(y6c.t0).checkProxy(au8Var, new o(zArr, q41VarArr, (byte) 12));
                    return;
                } catch (NumberFormatException unused) {
                    zArr[0] = false;
                    q41VarArr[0].setText(k96.M0(2131743674, null));
                    zkb.X(q41VarArr[0], bkb.o7, null);
                    return;
                }
            case 9:
                hs hsVar = (hs) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 == null) {
                    hsVar.b0((TLRPC.TL_messages_archivedStickers) tLObject2);
                    return;
                }
                return;
            case 10:
                i20 i20Var = (i20) this.c;
                hd hdVar = (hd) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                hdVar.dismiss();
                if (tLObject3 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject3).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    ia7 ia7Var = i20Var.p2;
                    if (ia7Var != null) {
                        ia7Var.c.add(0, ia7Var.d(document));
                        ia7Var.e();
                    }
                    i20Var.q2.clear();
                    i20Var.q2.addAll(i20Var.p2.c);
                    i20Var.t1.f();
                    ConnectionsManager.getInstance(i20Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 11:
                h30 h30Var = (h30) this.c;
                f30 f30Var = (f30) this.b;
                byte[] bArr = (byte[]) this.d;
                File file = f30Var.b;
                if (h30Var.G == 4) {
                    h30Var.B = bArr;
                    try {
                        h30Var.p();
                        if (h30Var.e) {
                            y54 a = new k54(h30Var.a).a();
                            h30Var.A = a;
                            a.y(h30Var.F);
                            y54 y54Var = h30Var.A;
                            Uri fromFile = Uri.fromFile(file);
                            qq6 qq6Var = new qq6();
                            tq6 tq6Var = new tq6();
                            List list = Collections.EMPTY_LIST;
                            km5 km5Var = mm5.b;
                            w59 w59Var = w59.e;
                            vq6 vq6Var2 = new vq6();
                            yq6 yq6Var = yq6.d;
                            if (tq6Var.b != null && tq6Var.a == null) {
                                z = false;
                            }
                            gre.p(z);
                            if (fromFile != null) {
                                vq6Var = vq6Var2;
                                xq6Var = new xq6(fromFile, null, tq6Var.a != null ? new uq6(tq6Var) : null, null, list, null, w59Var, -9223372036854775807L);
                            } else {
                                vq6Var = vq6Var2;
                                xq6Var = null;
                            }
                            y54Var.q0(new br6("", new sq6(qq6Var), xq6Var, new wq6(vq6Var), jr6.M, yq6Var));
                            h30Var.A.a();
                        }
                        h30Var.s(5);
                        lv6 lv6Var = h30Var.f;
                        long j = h30Var.j();
                        byte[] bArr2 = h30Var.B;
                        lv6Var.B(j, bArr2 != null ? (byte[]) bArr2.clone() : null);
                        return;
                    } catch (Throwable th) {
                        h30Var.g(th instanceof Exception ? th : new RuntimeException(th));
                        return;
                    }
                }
                return;
            case 12:
                h30 h30Var2 = (h30) this.c;
                f30 f30Var2 = (f30) this.b;
                File file2 = (File) this.d;
                tg2 tg2Var = h30Var2.g;
                long j2 = f30Var2.a;
                synchronized (((u20) tg2Var.c).f) {
                    ((HashMap) ((u20) tg2Var.c).g).put(Long.valueOf(j2), file2);
                }
                ((Handler) ((u20) tg2Var.c).d).post(new t20(tg2Var, j2, (ml6) tg2Var.b, file2, (byte) 1));
                return;
            case 13:
                tg2 tg2Var2 = (tg2) this.c;
                fm4 fm4Var = (fm4) this.b;
                d93 d93Var = (d93) this.d;
                o30 o30Var = (o30) tg2Var2.c;
                String str = g8c.a;
                l93 l93Var = ((t54) o30Var).a.s;
                tj U2 = l93Var.U();
                l93Var.V(U2, 1009, new i93(U2, fm4Var, d93Var, (byte) 15));
                return;
            case 14:
                a();
                return;
            case 15:
                bd0 bd0Var = (bd0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    bd0Var.a.b(false);
                    u21.e0(tL_error3);
                    return;
                } else if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                    bd0Var.finishFragment();
                    return;
                } else {
                    bd0Var.a.b(false);
                    yjb.x(null, 2131743640, u21.b0(bd0Var), null);
                    return;
                }
            case 16:
                oh0 oh0Var = (oh0) this.c;
                String str2 = (String) this.b;
                Runnable runnable = (Runnable) this.d;
                oh0Var.h = false;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("version");
                    int i7 = jSONObject.getInt("version_code");
                    String string2 = jSONObject.getString("file_url");
                    String optString = jSONObject.optString("changelog", null);
                    int i8 = oh0Var.b;
                    String str3 = oh0Var.a;
                    if ((str3 == null || (gba.R(string, str3) && i7 > oh0Var.b)) && gba.R(string, oh0.c()) && i7 > oh0.d()) {
                        if (!TextUtils.isEmpty(oh0Var.d)) {
                            try {
                                new File(oh0Var.d).delete();
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        }
                        oh0Var.d = null;
                        oh0Var.a = string;
                        oh0Var.b = i7;
                        oh0Var.f = string2;
                        oh0Var.c = optString;
                        oh0Var.e = System.currentTimeMillis();
                        oh0Var.f();
                        if (oh0Var.b != i8) {
                            kk7.e().k(kk7.S4, new Object[0]);
                        }
                        gl.r(oh0Var.i);
                        mh0 mh0Var = oh0Var.i;
                        boolean z4 = w01.a;
                        gl.d3(mh0Var, 1200000L);
                        if (runnable == null) {
                            runnable.run();
                            return;
                        }
                        if (oh0Var.b == i8 || a.x) {
                            return;
                        }
                        Context context = LaunchActivity.H1;
                        if (context == null) {
                            context = a.b;
                        }
                        String str4 = oh0Var.a;
                        if (str4 != null && (i2 = oh0Var.b) != 0) {
                            lh0Var = new lh0(str4, i2, oh0Var.c);
                        }
                        if (context == null || lh0Var == null) {
                            return;
                        }
                        ((ApplicationLoaderImpl) a.a).getClass();
                        try {
                            new j6c(context, lh0Var).show();
                            return;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            return;
                        }
                    }
                    String str5 = oh0Var.a;
                    if (str5 == null || oh0Var.b == 0 || !gba.R(str5, string) || oh0Var.b != i7) {
                        if (!TextUtils.isEmpty(oh0Var.d)) {
                            try {
                                new File(oh0Var.d).delete();
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                            }
                        }
                        oh0Var.d = null;
                        if (!gba.R(oh0.c(), string) || oh0.d() >= i7) {
                            oh0Var.a = null;
                            oh0Var.b = 0;
                            oh0Var.f = null;
                            oh0Var.c = null;
                        } else {
                            oh0Var.a = string;
                            oh0Var.b = i7;
                            oh0Var.f = string2;
                            oh0Var.c = optString;
                        }
                    } else {
                        oh0Var.f = string2;
                        oh0Var.c = optString;
                    }
                    oh0Var.e = System.currentTimeMillis();
                    oh0Var.f();
                    if (oh0Var.b != i8) {
                    }
                    gl.r(oh0Var.i);
                    mh0 mh0Var2 = oh0Var.i;
                    boolean z42 = w01.a;
                    gl.d3(mh0Var2, 1200000L);
                    if (runnable == null) {
                    }
                } catch (Exception e4) {
                    fa4.e("Failed to check for beta update at null received: " + str2, e4);
                    return;
                }
                break;
            case 17:
                ArrayList arrayList5 = (ArrayList) this.c;
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                e57 e57Var = (e57) this.d;
                arrayList5.add(null);
                if (atomicInteger.get() == arrayList5.size()) {
                    e57Var.run();
                    return;
                }
                return;
            case 18:
                j5 j5Var = (j5) this.c;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.b;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                mf6 mf6Var = (mf6) LaunchActivity.M();
                if (mf6Var == null) {
                    mf6Var = new mf6(j5Var.a);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(mf6Var);
                    }
                }
                mf6Var.E1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
                return;
            case 19:
                oj0 oj0Var = (oj0) this.c;
                nj0 nj0Var = (nj0) this.b;
                ArrayList<TLRPC.User> arrayList6 = (ArrayList) this.d;
                TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
                contactbirthdays.contacts = nj0Var.a;
                contactbirthdays.users = arrayList6;
                oj0Var.c = mj0.b(contactbirthdays);
                return;
            case 20:
                ((xy9) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
                return;
            case 21:
                TLObject tLObject5 = (TLObject) this.d;
                na7 na7Var = (na7) this.c;
                xy9 xy9Var = (xy9) this.b;
                if (tLObject5 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject5;
                    na7Var.b4(tL_channels_channelParticipants.users, false);
                    na7Var.V3(tL_channels_channelParticipants.chats, false);
                    long e5 = y6c.h(y6c.t0).e();
                    ArrayList arrayList7 = new ArrayList();
                    while (i3 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i3).peer;
                        if (peer != null && k27.B1(peer) != e5 && (V1 = na7Var.V1(Long.valueOf(peer.user_id))) != null && !l7c.z(V1) && !V1.bot) {
                            arrayList7.add(na7Var.k1(peer));
                        }
                        i3++;
                    }
                    xy9Var.a(arrayList7);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                p8c p8cVar = (p8c) this.c;
                p8c p8cVar2 = (p8c) this.d;
                if (tL_error4 != null) {
                    p8cVar.a(tL_error4);
                    return;
                } else {
                    p8cVar2.a(null);
                    return;
                }
            case 23:
                ((be2) this.c).a(new Pair((HashMap) this.b, (ArrayList) this.d));
                return;
            case 24:
                ArrayList arrayList8 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.b;
                p8c p8cVar3 = (p8c) this.d;
                ArrayList arrayList9 = new ArrayList();
                for (int i9 = 0; i9 < arrayList8.size(); i9++) {
                    TLRPC.User user = (TLRPC.User) arrayList8.get(i9);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z5 = bool == null || !bool.booleanValue();
                    to0 to0Var = new to0();
                    to0Var.a = user;
                    to0Var.b = z5;
                    arrayList9.add(to0Var);
                }
                p8cVar3.a(arrayList9);
                return;
            case 25:
                ss0 ss0Var = (ss0) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                Context context2 = (Context) this.b;
                if (tLObject6 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    d01.t(context2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject6).url);
                }
                gl.d3(new es0(ss0Var, (byte) 6), 1000L);
                return;
            case 26:
                boolean[] zArr2 = (boolean[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                it0 it0Var = (it0) this.b;
                zArr2[0] = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    it0Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 27:
                File file3 = (File) this.c;
                int[] iArr = (int[]) this.b;
                i87 i87Var = (i87) this.d;
                AnimatedFileNative.d(file3.getAbsolutePath(), iArr, 0L);
                gl.c3(i87Var);
                return;
            case 28:
                hv0 hv0Var = (hv0) this.c;
                vs2 vs2Var = (vs2) this.b;
                String[] strArr = (String[]) this.d;
                hv0Var.getClass();
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (hv0Var.getContext().checkSelfPermission(strArr[i10]) != 0) {
                            z = false;
                        } else {
                            i10++;
                        }
                    }
                }
                vs2Var.accept(Boolean.valueOf(z));
                return;
            default:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.c;
                String str6 = (String) this.b;
                String str7 = (String) this.d;
                try {
                    hv0 hv0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (hv0Var2 != null) {
                        boolean z6 = hv0.R0;
                        hv0Var2.C(botWebViewContainer$BotWebViewProxy, hv0Var2.d(), str6, str7);
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    fa4.g(e6, true);
                    return;
                }
        }
    }

    public /* synthetic */ nn6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ nn6(byte b, Object obj, Object obj2, TLObject tLObject) {
        this.a = b;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
    }

    public /* synthetic */ nn6(TLRPC.TL_error tL_error, p8c p8cVar, p8c p8cVar2) {
        this.a = (byte) 22;
        this.b = tL_error;
        this.c = p8cVar;
        this.d = p8cVar2;
    }
}
