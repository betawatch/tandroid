package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        KeyEvent.Callback callback = this.b;
        switch (i10) {
            case 0:
                p41 p41Var = (p41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                r41 r41Var = p41Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = r41Var.v;
                q41 q41Var = r41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = q41Var.d;
                    if (view2 == r41Var.E || view2 == r41Var.r) {
                        r41Var.w = r41Var.v;
                    }
                    n41 n41Var = p41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    r41Var.v = str2;
                    n41Var.setText(r41.A(r41.F(str2, null, null)));
                    q41Var.D(r41Var.h != null ? r41Var.n : r41Var.y);
                    r41.J(r41Var.v);
                    r41Var.N();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = tkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(tkVar.a).getChat(Long.valueOf(-j10));
                xc.a0(tkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new go0(18, tkVar, translateController)).j();
                m1Var.d(true);
                break;
            case 2:
                org.telegram.ui.it0 it0Var = (org.telegram.ui.it0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!it0Var.L1) {
                    Runnable runnable2 = it0Var.U1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    qg.y yVar = new qg.y(context, it0Var.Q1);
                    yVar.n(it0Var.K1.a, 2);
                    yVar.n = new rg.u(it0Var, bitmap);
                    yVar.h = new rg.m(it0Var, 1);
                    yVar.show();
                    break;
                }
                break;
            case 3:
                ((yg.h) callback).a(view, (HashSet) obj2, (Runnable) obj);
                break;
            case 4:
                new yh.n((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((yh.e) callback).dismiss();
                break;
            case 5:
                yh.n.S((yh.n) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 6:
                yh.w.S((yh.w) callback, (Context) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 7:
                yh.w.Q((yh.w) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            default:
                yh.m2 m2Var = (yh.m2) callback;
                ((i80) obj2).u();
                is0 is0Var = m2Var.a;
                yh.e2 e2Var = new yh.e2(m2Var, (TL_stars.SavedStarGift) obj, i11);
                HashMap hashMap = yh.q2.T;
                is0Var.h(null, e2Var);
                break;
        }
    }
}
