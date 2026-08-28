package fh;

import gh.g8;
import gh.l7;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.oc;
import org.telegram.ui.mq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v2(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.c;
                int i9 = this.b;
                y3 y3Var = (y3) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var = j4Var.a;
                l7 l7Var = j4Var.e;
                l7Var.a(i9, arrayList);
                y3Var.f(true);
                j4Var.f(true);
                j4Var.n();
                TL_stars.TL_starGiftCollection c10 = l7Var.c(i9);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            gc R = oc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, gh.k5.D1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        gc R2 = oc.a0(o2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c3.d((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.c, this.b, (TLRPC.User) this.d, 4));
                break;
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                o2Var2.showDialog(new ph.a(o2Var2.getContext(), chat, -chat2.id, new g8(o2Var2, this.b, chat2, chat, 1)));
                break;
            case 3:
                org.telegram.ui.l6 l6Var = (org.telegram.ui.l6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f10 = iArr[0];
                float f11 = i10;
                l6Var.run(Float.valueOf((g7.n.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 4:
                n00 n00Var = (n00) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i11 = this.b;
                n00Var.getClass();
                n00Var.w0 = ((Boolean) obj).booleanValue();
                n00Var.dismiss();
                callback.run(Integer.valueOf(i11));
                break;
            default:
                Utilities.themeQueue.postRunnable(new g1((yf.m2) this.c, this.b, (List) obj, new ArrayList(), (mq0) this.d, 29));
                break;
        }
    }

    public /* synthetic */ v2(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
    }
}
