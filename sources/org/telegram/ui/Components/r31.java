package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r31(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u31 u31Var = (u31) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                w31 w31Var = u31Var.h;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = w31Var.v;
                v31 v31Var = w31Var.F;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = v31Var.d;
                    if (view2 == w31Var.B || view2 == w31Var.r) {
                        w31Var.w = w31Var.v;
                    }
                    s31 s31Var = u31Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    w31Var.v = str2;
                    s31Var.setText(w31.y(w31.D(str2, null, null)));
                    v31Var.D(w31Var.h != null ? w31Var.n : w31Var.y);
                    w31.H(w31Var.v);
                    w31Var.M();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j10 = wkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(wkVar.a).getChat(Long.valueOf(-j10));
                qc.a0(wkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new l41(0, wkVar, translateController)).j();
                p1Var.d(true);
                break;
            case 2:
                qh.r9 r9Var = (qh.r9) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                oh.b bVar = (oh.b) this.d;
                q70 q70Var = r9Var.S0;
                if (q70Var == null || !q70Var.D()) {
                    qh.m mVar = new qh.m(r9Var, 0);
                    boolean isPremium = UserConfig.getInstance(r9Var.R).isPremium();
                    qh.m mVar2 = isPremium ? null : new qh.m(r9Var, 1);
                    q70 F = q70.F(frameLayout, bVar, r9Var.Q0);
                    r9Var.S0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    r9Var.S0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = qh.p.N1;
                        if (i10 >= 4) {
                            q70 q70Var2 = r9Var.S0;
                            q70Var2.s = 0;
                            q70Var2.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            q70 q70Var3 = r9Var.S0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.k6.E8;
                            q70Var3.b(0, null, string, i12, i12, new jm(mVar, i11, 27));
                            q70Var3.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new jm(mVar2, i11, 28));
                            if (r9Var.U0 == i10) {
                                r9Var.S0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 3:
                qh.v2 v2Var = (qh.v2) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                qh.x2 x2Var = (qh.x2) this.d;
                qh.a3 a3Var = v2Var.c;
                ArrayList arrayList = a3Var.e0;
                if (arrayList.contains(photoEntry)) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > a3Var.O) {
                    int i13 = -a3Var.K;
                    a3Var.K = i13;
                    AndroidUtilities.shakeViewSpring(x2Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    break;
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(a3Var.d);
                a3Var.j();
                break;
            case 4:
                qh.f9 f9Var = (qh.f9) this.b;
                Context context = (Context) this.c;
                dg.e1 e1Var = (dg.e1) this.d;
                if (!f9Var.y1) {
                    Runnable runnable2 = f9Var.H1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    dg.e0 e0Var = new dg.e0(context, f9Var.D1);
                    f9Var.Q1 = e0Var;
                    e0Var.m(f9Var.x1.a, 2);
                    e0Var.n = new qh.i4(f9Var, e1Var);
                    e0Var.h = new hg.m0(5, f9Var, e1Var);
                    e0Var.show();
                    break;
                }
                break;
            case 5:
                vf.e eVar = (vf.e) this.b;
                q70 F2 = q70.F(((org.telegram.ui.xn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.g6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new vf.d(eVar, 1), true);
                F2.E();
                if (eVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new vf.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 6:
                vf.f0.S((vf.f0) this.b, (TL_account.TL_connectedBot) this.c, (jm) this.d);
                break;
            case 7:
                vh.a aVar = (vh.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                aVar.P(callback, aVar.V, (chat2 == null || ChatObject.canAddChatToCommunity(chat2)) ? false : true);
                break;
            default:
                m.r3 r3Var = (m.r3) this.b;
                wh.v5 v5Var = (wh.v5) this.c;
                wh.l0 l0Var = (wh.l0) this.d;
                r3Var.c();
                v5Var.D(l0Var);
                break;
        }
    }
}
