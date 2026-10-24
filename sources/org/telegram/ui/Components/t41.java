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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t41(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
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
                w41 w41Var = (w41) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                y41 y41Var = w41Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = y41Var.v;
                x41 x41Var = y41Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = x41Var.d;
                    if (view2 == y41Var.E || view2 == y41Var.r) {
                        y41Var.w = y41Var.v;
                    }
                    u41 u41Var = w41Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    y41Var.v = str2;
                    u41Var.setText(y41.J(y41.N(str2, null, null)));
                    x41Var.D(y41Var.h != null ? y41Var.n : y41Var.y);
                    y41.R(y41Var.v);
                    y41Var.V();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) obj;
                long j10 = skVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(skVar.a).getChat(Long.valueOf(-j10));
                xc.a0(skVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new ko0(18, skVar, translateController)).j();
                m1Var.d(true);
                break;
            case 2:
                org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!jt0Var.L1) {
                    Runnable runnable2 = jt0Var.U1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    qg.y yVar = new qg.y(context, jt0Var.Q1);
                    yVar.m(jt0Var.K1.a, 2);
                    yVar.n = new rg.v(jt0Var, bitmap);
                    yVar.h = new rg.m(jt0Var, 1);
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
                yh.m.R((yh.m) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.g6) obj);
                break;
            case 6:
                yh.v.R((yh.v) callback, (Context) obj2, (org.telegram.ui.ActionBar.g6) obj);
                break;
            case 7:
                yh.v.P((yh.v) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.g6) obj);
                break;
            default:
                yh.l2 l2Var = (yh.l2) callback;
                ((j80) obj2).u();
                ns0 ns0Var = l2Var.a;
                yh.d2 d2Var = new yh.d2(l2Var, (TL_stars.SavedStarGift) obj, i11);
                HashMap hashMap = yh.p2.U;
                ns0Var.h(null, d2Var);
                break;
        }
    }
}
