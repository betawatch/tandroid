package gh;

import hh.f8;
import hh.k7;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q00;
import org.telegram.ui.nq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                int i10 = this.b;
                t3 t3Var = (t3) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var = d4Var.a;
                k7 k7Var = d4Var.e;
                k7Var.a(i10, arrayList);
                t3Var.f(true);
                d4Var.f(true);
                d4Var.n();
                TL_stars.TL_starGiftCollection c10 = k7Var.c(i10);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            ec R = mc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, hh.i5.D1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        ec R2 = mc.a0(n2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ag.k0((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.c, this.b, (TLRPC.User) this.d, 5));
                break;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var2.showDialog(new qh.a(n2Var2.getContext(), chat, -chat2.id, new f8(n2Var2, this.b, chat2, chat, 1)));
                break;
            case 3:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.c;
                int[] iArr = (int[]) this.d;
                int i11 = this.b;
                float f10 = iArr[0];
                float f11 = i11;
                m6Var.run(Float.valueOf((h7.n.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 4:
                q00 q00Var = (q00) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i12 = this.b;
                q00Var.getClass();
                q00Var.w0 = ((Boolean) obj).booleanValue();
                q00Var.dismiss();
                callback.run(Integer.valueOf(i12));
                break;
            default:
                Utilities.themeQueue.postRunnable(new e1((zf.n2) this.c, this.b, (List) obj, new ArrayList(), (nq0) this.d, 29));
                break;
        }
    }

    public /* synthetic */ q2(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
