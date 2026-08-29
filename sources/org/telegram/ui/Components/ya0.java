package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lb0 lb0Var = (lb0) this.b;
                qb0 qb0Var = (qb0) this.c;
                qb0 qb0Var2 = (qb0) this.d;
                rb0 rb0Var = lb0Var.V;
                MessagePreviewParams messagePreviewParams = rb0Var.d;
                boolean z10 = messagePreviewParams.hideCaption;
                boolean z11 = !z10;
                messagePreviewParams.hideCaption = z11;
                if (z10) {
                    if (rb0Var.x) {
                        messagePreviewParams.hideForwardSendersName = false;
                    }
                    rb0Var.x = false;
                } else if (!messagePreviewParams.hideForwardSendersName) {
                    messagePreviewParams.hideForwardSendersName = true;
                    rb0Var.x = true;
                }
                qb0Var.a(z11, true);
                qb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                lb0Var.h();
                lb0Var.k(true);
                break;
            case 1:
                vd0.n((vd0) this.b, (TLRPC.ChatFull) this.c, (org.telegram.ui.m60) this.d);
                break;
            case 2:
                ff0 ff0Var = (ff0) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                if (ff0Var.h == null) {
                    nh.r3 r3Var = new nh.r3(context, c6Var, LocaleController.getString(R.string.VideoChooseCover), ff0Var.f);
                    ff0Var.h = r3Var;
                    r3Var.setOnDismissListener(new xb0(ff0Var, 8));
                    ff0Var.h.f = ff0Var.n;
                }
                ff0Var.h.show();
                break;
            case 3:
                i31 i31Var = (i31) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.d;
                k31 k31Var = i31Var.h;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = k31Var.v;
                j31 j31Var = k31Var.E;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = j31Var.d;
                    if (view2 == k31Var.A || view2 == k31Var.r) {
                        k31Var.w = k31Var.v;
                    }
                    g31 g31Var = i31Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    k31Var.v = str2;
                    g31Var.setText(k31.y(k31.D(str2, null, null)));
                    j31Var.D(k31Var.h != null ? k31Var.n : k31Var.y);
                    k31.H(k31Var.v);
                    k31Var.L();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this.b;
                TranslateController translateController = (TranslateController) this.c;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.d;
                long j10 = qkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(qkVar.a).getChat(Long.valueOf(-j10));
                tc.a0(qkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new ii0(22, qkVar, translateController)).j();
                o1Var.d(true);
                break;
            case 5:
                sf.f fVar = (sf.f) this.b;
                j70 F = j70.F(((org.telegram.ui.tn) this.c).getLayoutContainer(), (org.telegram.ui.ActionBar.c6) this.d, fVar.n);
                F.c(R.drawable.msg_cancel, LocaleController.getString(R.string.BizBotRemove), new sf.e(fVar, 1), true);
                F.E();
                if (fVar.x != null) {
                    F.c(R.drawable.msg_settings, LocaleController.getString(R.string.BizBotManage), new sf.e(fVar, 2), false);
                }
                F.a0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
                F.s = 0;
                F.Z();
                break;
            case 6:
                sf.f0.S((sf.f0) this.b, (TL_account.TL_connectedBot) this.c, (i8) this.d);
                break;
            case 7:
                sh.a aVar = (sh.a) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                aVar.P(callback, aVar.U, (chat2 == null || ChatObject.canAddChatToCommunity(chat2)) ? false : true);
                break;
            default:
                m.s3 s3Var = (m.s3) this.b;
                th.t5 t5Var = (th.t5) this.c;
                th.k0 k0Var = (th.k0) this.d;
                s3Var.c();
                t5Var.D(k0Var);
                break;
        }
    }
}
