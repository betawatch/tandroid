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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b51(KeyEvent.Callback callback, Object obj, Object obj2, int i10) {
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
                e51 e51Var = (e51) callback;
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                g51 g51Var = e51Var.n;
                Runnable runnable = ((Runnable[]) obj2)[0];
                if (runnable != null) {
                    runnable.run();
                }
                String str = g51Var.v;
                f51 f51Var = g51Var.N;
                if (!TextUtils.equals(str, localeInfo.pluralLangCode)) {
                    View view2 = f51Var.d;
                    if (view2 == g51Var.E || view2 == g51Var.r) {
                        g51Var.w = g51Var.v;
                    }
                    c51 c51Var = e51Var.e;
                    String str2 = localeInfo.pluralLangCode;
                    g51Var.v = str2;
                    c51Var.setText(g51.J(g51.N(str2, null, null)));
                    f51Var.D(g51Var.h != null ? g51Var.n : g51Var.y);
                    g51.R(g51Var.v);
                    g51Var.V();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.vk vkVar = (org.telegram.ui.vk) callback;
                TranslateController translateController = (TranslateController) obj2;
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) obj;
                long j10 = vkVar.b;
                translateController.setHideTranslateDialog(j10, true);
                TLRPC.Chat chat = MessagesController.getInstance(vkVar.a).getChat(Long.valueOf(-j10));
                wc.b0(vkVar.c).J(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), LocaleController.getString(R.string.UndoNoCaps), new u90(29, vkVar, translateController)).j();
                o1Var.d(true);
                break;
            case 2:
                org.telegram.ui.pt0 pt0Var = (org.telegram.ui.pt0) callback;
                Context context = (Context) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (!pt0Var.A1) {
                    Runnable runnable2 = pt0Var.J1;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                } else {
                    rg.y yVar = new rg.y(context, pt0Var.F1);
                    yVar.m(pt0Var.z1.a, 2);
                    yVar.n = new sg.v(pt0Var, bitmap);
                    yVar.h = new sg.m(pt0Var, 1);
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
                ((l80) obj2).u();
                ws0 ws0Var = m2Var.a;
                zh.e2 e2Var = new zh.e2(m2Var, (TL_stars.SavedStarGift) obj, i11);
                HashMap hashMap = zh.r2.V;
                ws0Var.h(null, e2Var);
                break;
        }
    }
}
