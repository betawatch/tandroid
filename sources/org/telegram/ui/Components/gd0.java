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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gd0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hd0.n((hd0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.k60) this.d);
                break;
            case 1:
                re0 re0Var = (re0) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
                if (re0Var.h == null) {
                    kh.u3 u3Var = new kh.u3(context, b6Var, LocaleController.getString(R.string.VideoChooseCover), re0Var.f);
                    re0Var.h = u3Var;
                    u3Var.setOnDismissListener(new ib0(re0Var, 8));
                    re0Var.h.f = re0Var.n;
                }
                re0Var.h.show();
                break;
            case 2:
                x21 x21Var = (x21) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                z21 z21Var = x21Var.h;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = z21Var.v;
                y21 y21Var = z21Var.E;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = y21Var.d;
                    if (view2 == z21Var.A || view2 == z21Var.r) {
                        z21Var.w = z21Var.v;
                    }
                    v21 v21Var = x21Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    z21Var.v = str2;
                    v21Var.setText(z21.y(z21.D(str2, null, null)));
                    y21Var.D(z21Var.h != null ? z21Var.n : z21Var.y);
                    z21.H(z21Var.v);
                    z21Var.L();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.d;
                long j10 = nkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(nkVar.a).getChat(Long.valueOf(-j10));
                oc.a0(nkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new jg0(25, nkVar, translateController)).j();
                o1Var.d(true);
                break;
            case 4:
                pf.f fVar = (pf.f) this.b;
                x60 F = x60.F(((org.telegram.ui.qn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.b6) this.d, fVar.n);
                F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new pf.e(fVar, 1), true);
                F.E();
                if (fVar.x != null) {
                    F.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new pf.e(fVar, 2), false);
                }
                F.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F.s = 0;
                F.Z();
                break;
            case 5:
                pf.g0.R((pf.g0) this.b, (TL_account.TL_connectedBot) this.c, (qd) this.d);
                break;
            case 6:
                ph.a aVar = (ph.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                aVar.O(callback, aVar.U, (chat2 == null || ChatObject.canAddChatToCommunity(chat2)) ? false : true);
                break;
            case 7:
                m.t3 t3Var = (m.t3) this.b;
                qh.s5 s5Var = (qh.s5) this.c;
                qh.k0 k0Var = (qh.k0) this.d;
                t3Var.c();
                s5Var.D(k0Var);
                break;
            default:
                org.telegram.ui.xs0 xs0Var = (org.telegram.ui.xs0) this.b;
                Context context2 = (Context) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                if (!xs0Var.H1) {
                    Runnable runnable2 = xs0Var.Q1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    xf.x xVar = new xf.x(context2, xs0Var.M1);
                    xVar.m(xs0Var.G1.a, 2);
                    xVar.n = new yf.u(xs0Var, bitmap);
                    xVar.h = new yf.m(xs0Var, 1);
                    xVar.show();
                    break;
                }
                break;
        }
    }
}
