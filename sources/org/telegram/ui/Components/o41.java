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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
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
                r41 r41Var = (r41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                t41 t41Var = r41Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = t41Var.v;
                s41 s41Var = t41Var.I;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = s41Var.d;
                    if (view2 == t41Var.E || view2 == t41Var.r) {
                        t41Var.w = t41Var.v;
                    }
                    p41 p41Var = r41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    t41Var.v = str2;
                    p41Var.setText(t41.A(t41.E(str2, null, null)));
                    s41Var.D(t41Var.h != null ? t41Var.n : t41Var.y);
                    t41.J(t41Var.v);
                    t41Var.N();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = rkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(rkVar.a).getChat(Long.valueOf(-j10));
                xc.a0(rkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new ho0(18, rkVar, translateController)).j();
                m1Var.d(true);
                break;
            case 2:
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!gt0Var.L1) {
                    Runnable runnable2 = gt0Var.U1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    qg.y yVar = new qg.y(context, gt0Var.Q1);
                    yVar.n(gt0Var.K1.a, 2);
                    yVar.n = new rg.u(gt0Var, bitmap);
                    yVar.h = new rg.m(gt0Var, 1);
                    yVar.show();
                    break;
                }
                break;
            case 3:
                ((yg.h) callback).a(view, (HashSet) obj2, (Runnable) obj);
                break;
            case 4:
                new yh.m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((yh.e) callback).dismiss();
                break;
            case 5:
                yh.m.S((yh.m) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 6:
                yh.v.S((yh.v) callback, (Context) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 7:
                yh.v.Q((yh.v) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.d6) obj);
                break;
            default:
                yh.l2 l2Var = (yh.l2) callback;
                ((i80) obj2).u();
                ks0 ks0Var = l2Var.a;
                yh.d2 d2Var = new yh.d2(l2Var, (TL_stars.SavedStarGift) obj, i11);
                HashMap hashMap = yh.p2.T;
                ks0Var.h(null, d2Var);
                break;
        }
    }
}
