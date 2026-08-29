package bg;

import java.util.ArrayList;
import java.util.List;
import jh.d8;
import jh.h5;
import jh.i7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.l6;
import org.telegram.ui.mq0;
import org.telegram.ui.vs;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n3(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Utilities.themeQueue.postRunnable(new j3((u3) this.c, this.b, (List) obj, new ArrayList(), (mq0) this.d, 0));
                break;
            case 1:
                ih.x3 x3Var = (ih.x3) this.c;
                int i10 = this.b;
                ih.n3 n3Var = (ih.n3) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var = x3Var.a;
                i7 i7Var = x3Var.e;
                i7Var.a(i10, arrayList);
                n3Var.f(true);
                x3Var.f(true);
                x3Var.n();
                TL_stars.TL_starGiftCollection c3 = i7Var.c(i10);
                if (c3 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            mc R = tc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h5.D1(savedStarGift.gift), c3.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        mc R2 = tc.a0(o2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c3.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 2:
                l6 l6Var = (l6) this.c;
                int[] iArr = (int[]) this.d;
                int i11 = this.b;
                float f9 = iArr[0];
                float f10 = i11;
                l6Var.run(Float.valueOf((i7.w.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (f9 / f10)), Boolean.FALSE);
                break;
            case 3:
                y00 y00Var = (y00) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i12 = this.b;
                y00Var.getClass();
                y00Var.w0 = ((Boolean) obj).booleanValue();
                y00Var.dismiss();
                callback.run(Integer.valueOf(i12));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new vs((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.c, this.b, (TLRPC.User) this.d, 13));
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                o2Var2.showDialog(new sh.a(o2Var2.getContext(), chat, -chat2.id, new d8(o2Var2, this.b, chat2, chat, 3)));
                break;
        }
    }

    public /* synthetic */ n3(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
