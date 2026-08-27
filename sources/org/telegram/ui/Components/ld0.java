package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ld0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                md0.n((md0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.o60) this.d);
                break;
            case 1:
                we0 we0Var = (we0) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                if (we0Var.h == null) {
                    lh.t3 t3Var = new lh.t3(context, c6Var, LocaleController.getString(R.string.VideoChooseCover), we0Var.f);
                    we0Var.h = t3Var;
                    t3Var.setOnDismissListener(new mb0(we0Var, 8));
                    we0Var.h.f = we0Var.n;
                }
                we0Var.h.show();
                break;
            case 2:
                z21 z21Var = (z21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                b31 b31Var = z21Var.h;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = b31Var.v;
                a31 a31Var = b31Var.E;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = a31Var.d;
                    if (view2 == b31Var.A || view2 == b31Var.r) {
                        b31Var.w = b31Var.v;
                    }
                    x21 x21Var = z21Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    b31Var.v = str2;
                    x21Var.setText(b31.z(b31.E(str2, null, null)));
                    a31Var.D(b31Var.h != null ? b31Var.n : b31Var.y);
                    b31.I(b31Var.v);
                    b31Var.M();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.d;
                long j10 = pkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(pkVar.a).getChat(Long.valueOf(-j10));
                mc.a0(pkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new lg0(25, pkVar, translateController)).j();
                n1Var.d(true);
                break;
            case 4:
                qf.g gVar = (qf.g) this.b;
                b70 F = b70.F(((org.telegram.ui.rn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.c6) this.d, gVar.n);
                F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new qf.f(gVar, 1), true);
                F.E();
                if (gVar.x != null) {
                    F.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new qf.f(gVar, 2), false);
                }
                F.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F.s = 0;
                F.Z();
                break;
            case 5:
                qf.g0.S((qf.g0) this.b, (TL_account.TL_connectedBot) this.c, (xl) this.d);
                break;
            case 6:
                qh.a aVar = (qh.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                aVar.P(callback, aVar.U, (chat2 == null || ChatObject.canAddChatToCommunity(chat2)) ? false : true);
                break;
            case 7:
                m.t3 t3Var2 = (m.t3) this.b;
                rh.t5 t5Var = (rh.t5) this.c;
                rh.k0 k0Var = (rh.k0) this.d;
                t3Var2.c();
                t5Var.D(k0Var);
                break;
            default:
                org.telegram.ui.ys0 ys0Var = (org.telegram.ui.ys0) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!ys0Var.H1) {
                    Runnable runnable2 = ys0Var.Q1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    yf.x xVar = new yf.x(context2, ys0Var.M1);
                    xVar.m(ys0Var.G1.a, 2);
                    xVar.n = new zf.u(ys0Var, bitmap);
                    xVar.h = new zf.m(ys0Var, 1);
                    xVar.show();
                    break;
                }
                break;
        }
    }
}
