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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a51(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
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
                d51 d51Var = (d51) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                f51 f51Var = d51Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = f51Var.v;
                e51 e51Var = f51Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = e51Var.d;
                    if (view2 == f51Var.E || view2 == f51Var.r) {
                        f51Var.w = f51Var.v;
                    }
                    b51 b51Var = d51Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    f51Var.v = str2;
                    b51Var.setText(f51.J(f51.N(str2, null, null)));
                    e51Var.D(f51Var.h != null ? f51Var.n : f51Var.y);
                    f51.R(f51Var.v);
                    f51Var.V();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) obj;
                long j10 = tkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(tkVar.a).getChat(Long.valueOf(-j10));
                wc.b0(tkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new t90(29, tkVar, translateController)).j();
                o1Var.d(true);
                break;
            case 2:
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!nt0Var.A1) {
                    Runnable runnable2 = nt0Var.J1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    rg.y yVar = new rg.y(context, nt0Var.F1);
                    yVar.m(nt0Var.z1.a, 2);
                    yVar.n = new sg.w(nt0Var, bitmap);
                    yVar.h = new sg.m(nt0Var, 1);
                    yVar.show();
                    break;
                }
                break;
            case 3:
                ((zg.i) callback).a(view, (HashSet) obj2, (Runnable) obj);
                break;
            case 4:
                new zh.m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((zh.e) callback).dismiss();
                break;
            case 5:
                zh.m.R((zh.m) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.u6) obj);
                break;
            case 6:
                zh.v.R((zh.v) callback, (Context) obj2, (org.telegram.ui.ActionBar.u6) obj);
                break;
            case 7:
                zh.v.P((zh.v) callback, (boolean[]) obj2, (org.telegram.ui.ActionBar.u6) obj);
                break;
            default:
                zh.m2 m2Var = (zh.m2) callback;
                ((k80) obj2).u();
                vs0 vs0Var = m2Var.a;
                zh.e2 e2Var = new zh.e2(m2Var, (TL_stars.SavedStarGift) obj, i11);
                HashMap hashMap = zh.r2.V;
                vs0Var.h(null, e2Var);
                break;
        }
    }
}
