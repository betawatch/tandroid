package ki;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import hi.lb;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ob;
import org.telegram.messenger.pb;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.v60;
import org.telegram.ui.vp;
import org.telegram.ui.wc1;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ z0(pb pbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.d = pbVar;
        this.b = i7;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j3;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public final void run() {
        yw ywVar;
        ?? r22;
        cc a02;
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
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj6;
                Context context = (Context) obj4;
                e6 e6Var = (e6) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                bi.h0 h0Var = (bi.h0) obj;
                if (tLObject instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i10 = this.b;
                    long j3 = this.c;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            a1 a1Var = new a1(t1Var, context, i10, j3, tL_messages_preparedInlineMessage, e6Var, qVar, h0Var);
                            int[] iArr = new int[1];
                            is[] isVarArr = new is[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(getwebpagepreview, new d3.b(1), new di.k0(iArr, a1Var, isVarArr, i10, 2));
                            t1Var.setOnCancelListener(new lb(new ai.z0(iArr, i10, isVarArr, 20), 1));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    b1 b1Var = new b1(t1Var, context, i10, j3, tL_messages_preparedInlineMessage, fileArr, e6Var, qVar, h0Var);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String B = fc.B(str2, null);
                            String C = TextUtils.isEmpty(B) ? w7.C(tL_messages_preparedInlineMessage.result.content.mime_type) : r.b.k(".", B);
                            File file = new File(w7.z(4), Utilities.a(str2) + C);
                            if (file.exists()) {
                                b1Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ai.u1(26, fileArr, b1Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str2);
                                t1Var.setOnCancelListener(new lb(httpGetFileTask, 2));
                                break;
                            }
                        }
                    }
                    b1Var.run();
                    break;
                } else {
                    h0Var.a("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
            case 1:
                pb pbVar = (pb) obj5;
                String str3 = (String) obj6;
                pbVar.getClass();
                org.telegram.messenger.g0.h3(new ob(this.b, str3, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.c));
                pbVar.b.u.remove(str3);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str6 = (String) obj;
                ArrayList arrayList = launchActivity.g0;
                ArrayList arrayList2 = launchActivity.e0;
                ArrayList arrayList3 = launchActivity.D0;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    int i11 = this.b;
                    np.s1(i11).Y3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str4 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.P, tL_attachMenuBot, str4, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList2);
                        if (org.telegram.messenger.g0.Q1() && !(e2Var instanceof an) && !arrayList.isEmpty()) {
                            e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str5)) {
                            String[] split = str5.split(" ");
                            int length = split.length;
                            int i12 = 0;
                            while (i12 < length) {
                                String[] strArr = split;
                                String str7 = strArr[i12];
                                Pattern pattern = si.S1;
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
                            ywVar = null;
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
                            ywVar = new yw(bundle);
                            ywVar.E2 = new v60(launchActivity, user, str6, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            o6 o6Var = new o6(launchActivity);
                            o6Var.setColor(j6.x0(null, j6.ia, false));
                            q6.h(j6.L5, o6Var, null);
                            o6Var.setAttachBot(tL_attachMenuBot);
                            wc1.a(launchActivity, new vp(launchActivity, i11, this.c, ywVar, e2Var, user, str6), null);
                            break;
                        } else {
                            if (ywVar != null) {
                                if (e2Var != null) {
                                    e2Var.dismissCurrentDialog();
                                }
                                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                    if (((Dialog) arrayList3.get(i17)).isShowing()) {
                                        ((Dialog) arrayList3.get(i17)).dismiss();
                                    }
                                }
                                arrayList3.clear();
                                launchActivity.t0(ywVar);
                            } else {
                                if (e2Var instanceof an) {
                                    an anVar = (an) e2Var;
                                    if (si.t(tL_attachMenuBot, anVar.j() != null ? anVar.j() : anVar.e)) {
                                        anVar.za(user.id, str6, false);
                                    } else {
                                        a02 = cc.a0(e2Var);
                                        r22 = 0;
                                    }
                                } else {
                                    r22 = 0;
                                    a02 = cc.a0(e2Var);
                                }
                                k5.o(r22, 2131753140, a02, r22);
                            }
                            break;
                        }
                    }
                } else {
                    k5.o(null, 2131753109, cc.a0((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList2)), null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z0(TLObject tLObject, int i7, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, e6 e6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.d = tLObject;
        this.b = i7;
        this.e = t1Var;
        this.f = context;
        this.c = j3;
        this.h = e6Var;
        this.n = qVar;
        this.r = h0Var;
    }

    public /* synthetic */ z0(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
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
