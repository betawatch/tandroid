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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q31(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t31 t31Var = (t31) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                v31 v31Var = t31Var.h;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = v31Var.v;
                u31 u31Var = v31Var.F;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = u31Var.d;
                    if (view2 == v31Var.B || view2 == v31Var.r) {
                        v31Var.w = v31Var.v;
                    }
                    r31 r31Var = t31Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    v31Var.v = str2;
                    r31Var.setText(v31.y(v31.D(str2, null, null)));
                    u31Var.D(v31Var.h != null ? v31Var.n : v31Var.y);
                    v31.H(v31Var.v);
                    v31Var.M();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.d;
                long j10 = ykVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(ykVar.a).getChat(Long.valueOf(-j10));
                qc.a0(ykVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new k41(0, ykVar, translateController)).j();
                p1Var.d(true);
                break;
            case 2:
                ph.t9 t9Var = (ph.t9) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                nh.b bVar = (nh.b) this.d;
                p70 p70Var = t9Var.S0;
                if (p70Var == null || !p70Var.D()) {
                    ph.m mVar = new ph.m(t9Var, 0);
                    boolean isPremium = UserConfig.getInstance(t9Var.R).isPremium();
                    ph.m mVar2 = isPremium ? null : new ph.m(t9Var, 1);
                    p70 F = p70.F(frameLayout, bVar, t9Var.Q0);
                    t9Var.S0 = F;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    t9Var.S0.k();
                    int i10 = 0;
                    while (true) {
                        int[] iArr = ph.p.N1;
                        if (i10 >= 4) {
                            p70 p70Var2 = t9Var.S0;
                            p70Var2.s = 0;
                            p70Var2.Z();
                            break;
                        } else {
                            int i11 = iArr[i10];
                            p70 p70Var3 = t9Var.S0;
                            String string = i11 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i11 / 3600, new Object[0]);
                            int i12 = org.telegram.ui.ActionBar.j6.E8;
                            p70Var3.b(0, null, string, i12, i12, new dw(mVar, i11, 26));
                            p70Var3.M((isPremium || i11 == 86400 || i11 == Integer.MAX_VALUE) ? null : new dw(mVar2, i11, 27));
                            if (t9Var.U0 == i10) {
                                t9Var.S0.L();
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 3:
                ph.v2 v2Var = (ph.v2) this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                ph.x2 x2Var = (ph.x2) this.d;
                ph.a3 a3Var = v2Var.c;
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
                ph.h9 h9Var = (ph.h9) this.b;
                Context context = (Context) this.c;
                cg.f1 f1Var = (cg.f1) this.d;
                if (!h9Var.y1) {
                    Runnable runnable2 = h9Var.H1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    cg.e0 e0Var = new cg.e0(context, h9Var.D1);
                    h9Var.Q1 = e0Var;
                    e0Var.m(h9Var.x1.a, 2);
                    e0Var.n = new ph.i4(h9Var, f1Var);
                    e0Var.h = new gg.m0(5, h9Var, f1Var);
                    e0Var.show();
                    break;
                }
                break;
            case 5:
                uf.e eVar = (uf.e) this.b;
                p70 F2 = p70.F(((org.telegram.ui.zn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.f6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new uf.d(eVar, 1), true);
                F2.E();
                if (eVar.x != null) {
                    F2.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new uf.d(eVar, 2), false);
                }
                F2.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 6:
                uf.f0.S((uf.f0) this.b, (TL_account.TL_connectedBot) this.c, (dw) this.d);
                break;
            case 7:
                uh.a aVar = (uh.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                aVar.P(callback, aVar.V, (chat2 == null || ChatObject.canAddChatToCommunity(chat2)) ? false : true);
                break;
            default:
                m.s3 s3Var = (m.s3) this.b;
                vh.w5 w5Var = (vh.w5) this.c;
                vh.l0 l0Var = (vh.l0) this.d;
                s3Var.c();
                w5Var.D(l0Var);
                break;
        }
    }
}
