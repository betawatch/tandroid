package org.telegram.messenger;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.d70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.te1;
import org.telegram.ui.w70;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ pb(rb rbVar, int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.e = rbVar;
        this.b = i10;
        this.c = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.d = j10;
    }

    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String, org.telegram.ui.ActionBar.p6] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ay ayVar;
        ?? r22;
        org.telegram.ui.Components.cc a02;
        int i10 = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (i10) {
            case 0:
                rb rbVar = (rb) obj6;
                String str = (String) obj5;
                rbVar.getClass();
                i0.g3(new qb(this.b, str, (TLRPC.InputFile) obj4, (TLRPC.InputEncryptedFile) obj3, (byte[]) obj2, (byte[]) obj, this.d));
                rbVar.b.u.remove(str);
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLObject tLObject = (TLObject) obj4;
                String str2 = (String) obj5;
                String str3 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList = launchActivity.f0;
                ArrayList arrayList2 = launchActivity.d0;
                ArrayList arrayList3 = launchActivity.E0;
                if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
                    int i11 = this.b;
                    vp.r1(i11).V3(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str2 != null) {
                        LaunchActivity.G0(launchActivity, launchActivity.O, tL_attachMenuBot, str2, false);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2);
                        if (i0.Q1() && !(k2Var instanceof org.telegram.ui.un) && !arrayList.isEmpty()) {
                            k2Var = (org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList);
                        }
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        ArrayList arrayList4 = new ArrayList();
                        if (!TextUtils.isEmpty(str3)) {
                            String[] split = str3.split(" ");
                            int length = split.length;
                            int i12 = 0;
                            while (i12 < length) {
                                int i13 = i12;
                                String str5 = split[i13];
                                Pattern pattern = ui.R1;
                                String[] strArr = split;
                                ArrayList<TLRPC.AttachMenuPeerType> arrayList5 = tL_attachMenuBot.peer_types;
                                int i14 = length;
                                int size = arrayList5.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList5.get(i15);
                                    int i16 = i15 + 1;
                                    TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
                                    ArrayList<TLRPC.AttachMenuPeerType> arrayList6 = arrayList5;
                                    if ((((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str5.equals("bots")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str5.equals("channels")) || (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str5.equals("groups")) || ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str5.equals("users"))))) {
                                        arrayList4.add(str5);
                                        i12 = i13 + 1;
                                        split = strArr;
                                        length = i14;
                                    } else {
                                        arrayList5 = arrayList6;
                                        i15 = i16;
                                    }
                                }
                                i12 = i13 + 1;
                                split = strArr;
                                length = i14;
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            ayVar = null;
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
                            ayVar = new org.telegram.ui.ay(bundle);
                            ayVar.C2 = new w70(launchActivity, user, str4, i11);
                        }
                        if (tL_attachMenuBot.inactive) {
                            org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(launchActivity);
                            m6Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ia, false));
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.L5, m6Var, null);
                            m6Var.setAttachBot(tL_attachMenuBot);
                            te1.a(launchActivity, new org.telegram.ui.sq(launchActivity, i11, this.d, ayVar, k2Var2, user, str4), null);
                            break;
                        } else {
                            if (ayVar != null) {
                                if (k2Var2 != null) {
                                    k2Var2.dismissCurrentDialog();
                                }
                                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                    if (((Dialog) arrayList3.get(i17)).isShowing()) {
                                        ((Dialog) arrayList3.get(i17)).dismiss();
                                    }
                                }
                                arrayList3.clear();
                                launchActivity.t0(ayVar);
                            } else {
                                if (k2Var2 instanceof org.telegram.ui.un) {
                                    org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                    if (ui.t(tL_attachMenuBot, unVar.j() != null ? unVar.j() : unVar.e)) {
                                        unVar.ma(user.id, str4, false);
                                    } else {
                                        a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                                        r22 = 0;
                                    }
                                } else {
                                    r22 = 0;
                                    a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                                }
                                m5.o(r22, 2131753140, a02, r22);
                            }
                            break;
                        }
                    }
                } else {
                    m5.o(null, 2131753109, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList2)), null);
                    break;
                }
                break;
            default:
                TLObject tLObject2 = (TLObject) obj6;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i18 = this.b;
                    long j10 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str6 = tL_botInlineMessageMediaWebPage.url;
                            xh.u0 u0Var = new xh.u0(x1Var, context, i18, j10, tL_messages_preparedInlineMessage, p6Var, qVar, eVar);
                            int[] iArr = new int[1];
                            us[] usVarArr = new us[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str6;
                            iArr[0] = ConnectionsManager.getInstance(i18).sendRequestTyped(getwebpagepreview, new a3.b(1), new org.telegram.ui.f0(iArr, u0Var, usVarArr, i18, 8));
                            x1Var.setOnCancelListener(new eg.k(new org.telegram.ui.Wallet.x0(iArr, i18, usVarArr, 24), 2));
                            break;
                        }
                    }
                    File[] fileArr = new File[1];
                    d70 d70Var = new d70(x1Var, context, i18, j10, tL_messages_preparedInlineMessage, fileArr, p6Var, qVar, eVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str7 = botInlineResult.content.url;
                            String B = hc.B(str7, null);
                            String C = TextUtils.isEmpty(B) ? b8.C(tL_messages_preparedInlineMessage.result.content.mime_type) : sc.e.h(".", B);
                            File file = new File(b8.z(4), Utilities.a(str7) + C);
                            if (file.exists()) {
                                d70Var.run();
                                break;
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new rh.e3(13, fileArr, d70Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str7);
                                x1Var.setOnCancelListener(new eg.k(httpGetFileTask, 3));
                                break;
                            }
                        }
                    }
                    d70Var.run();
                    break;
                } else {
                    eVar.a("MESSAGE_EXPIRED", null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pb(TLObject tLObject, int i10, org.telegram.ui.ActionBar.x1 x1Var, Context context, long j10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.e = tLObject;
        this.b = i10;
        this.c = x1Var;
        this.f = context;
        this.d = j10;
        this.h = p6Var;
        this.n = qVar;
        this.r = eVar;
    }

    public /* synthetic */ pb(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f = tLObject;
        this.b = i10;
        this.c = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.d = j10;
    }
}
