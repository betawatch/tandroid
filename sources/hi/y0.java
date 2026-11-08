package hi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import fi.ob;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.pb;
import org.telegram.messenger.qb;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.tp;
import org.telegram.ui.wc1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.ww;
import org.telegram.ui.x60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ y0(qb qbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.d = qbVar;
        this.b = i7;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j3;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String, org.telegram.ui.ActionBar.f6] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ww wwVar;
        ?? r22;
        hc a02;
        int i7 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.e;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj6;
                Context context = (Context) obj4;
                f6 f6Var = (f6) obj3;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) obj2;
                bi.t0 t0Var = (bi.t0) obj;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z9 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i10 = this.b;
                    long j3 = this.c;
                    if (z9) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            z0 z0Var = new z0(u1Var, context, i10, j3, tL_messages_preparedInlineMessage, f6Var, pVar, t0Var);
                            int[] iArr = new int[1];
                            ls[] lsVarArr = new ls[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(getwebpagepreview, new d3.b(1), new bi.v0(iArr, z0Var, lsVarArr, i10, 2));
                            u1Var.setOnCancelListener(new ob(new ai.e0(iArr, i10, lsVarArr, 15), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    a1 a1Var = new a1(u1Var, context, i10, j3, tL_messages_preparedInlineMessage, fileArr, f6Var, pVar, t0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String B = gc.B(str2, null);
                            String C = TextUtils.isEmpty(B) ? w7.C(tL_messages_preparedInlineMessage.result.content.mime_type) : rf.b.i(".", B);
                            File file = new File(w7.z(4), Utilities.a(str2) + C);
                            if (file.exists()) {
                                a1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.f1(18, fileArr, a1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                u1Var.setOnCancelListener(new ob(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    a1Var.run();
                    break;
                } else {
                    t0Var.a("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            case 1:
                qb qbVar = (qb) obj5;
                String str3 = (String) obj6;
                qbVar.getClass();
                org.telegram.messenger.g0.h3(new pb(this.b, str3, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.c));
                qbVar.b.u.remove(str3);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList = launchActivity.f0;
                ArrayList arrayList2 = launchActivity.d0;
                ArrayList arrayList3 = launchActivity.C0;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    int i11 = this.b;
                    qp.s1(i11).Y3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str4 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.O, tL_attachMenuBot, str4, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2);
                        if (org.telegram.messenger.g0.Q1() && !(f2Var instanceof an) && !arrayList.isEmpty()) {
                            f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str5)) {
                            String[] split = str5.split(" ");
                            int length = split.length;
                            int i12 = 0;
                            while (i12 < length) {
                                String[] strArr = split;
                                String str7 = strArr[i12];
                                Pattern pattern = ui.R1;
                                int i13 = length;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                                int i14 = i12;
                                int size = arrayList5.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i15);
                                    int i16 = i15 + 1;
                                    TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                    ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                    if ((((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str7.equals("bots")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str7.equals("channels")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str7.equals("groups")) || ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str7.equals("users"))))) {
                                        arrayList4.add(str7);
                                        i12 = i14 + 1;
                                        split = strArr;
                                        length = i13;
                                    } else {
                                        arrayList5 = arrayList6;
                                        i15 = i16;
                                    }
                                }
                                i12 = i14 + 1;
                                split = strArr;
                                length = i13;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            wwVar = null;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("dialogsType", 14);
                            bundle.putBoolean("onlySelect", true);
                            bundle.putBoolean("allowGroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowMegagroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowLegacyGroups", arrayList4.contains("groups"));
                            bundle.putBoolean("allowUsers", arrayList4.contains("users"));
                            bundle.putBoolean("allowChannels", arrayList4.contains("channels"));
                            bundle.putBoolean("allowBots", arrayList4.contains("bots"));
                            wwVar = new ww(bundle);
                            wwVar.C2 = new x60(launchActivity, user, str6, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            q6 q6Var = new q6(launchActivity);
                            q6Var.setColor(k6.x0(null, k6.ia, false));
                            r6.i(k6.L5, q6Var, null);
                            q6Var.setAttachBot(tL_attachMenuBot);
                            wc1.a(launchActivity, new tp(launchActivity, i11, this.c, wwVar, f2Var, user, str6), null);
                            break;
                        } else {
                            if (wwVar != null) {
                                if (f2Var != null) {
                                    f2Var.dismissCurrentDialog();
                                }
                                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                    if (((Dialog) arrayList3.get(i17)).isShowing()) {
                                        ((Dialog) arrayList3.get(i17)).dismiss();
                                    }
                                }
                                arrayList3.clear();
                                launchActivity.t0(wwVar);
                            } else {
                                if (f2Var instanceof an) {
                                    an anVar = (an) f2Var;
                                    if (ui.t(tL_attachMenuBot, anVar.j() != null ? anVar.j() : anVar.e)) {
                                        anVar.wa(user.id, str6, false);
                                    } else {
                                        a02 = hc.a0(f2Var);
                                        r22 = 0;
                                    }
                                } else {
                                    r22 = 0;
                                    a02 = hc.a0(f2Var);
                                }
                                k5.p(r22, 2131753140, a02, r22);
                            }
                            break;
                        }
                    }
                } else {
                    k5.p(null, 2131753109, hc.a0((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2)), null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y0(TLObject tLObject, int i7, org.telegram.ui.ActionBar.u1 u1Var, Context context, long j3, f6 f6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.d = tLObject;
        this.b = i7;
        this.e = u1Var;
        this.f = context;
        this.c = j3;
        this.h = f6Var;
        this.n = pVar;
        this.r = t0Var;
    }

    public /* synthetic */ y0(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.e = launchActivity;
        this.d = tLObject;
        this.b = i7;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.c = j3;
    }
}
