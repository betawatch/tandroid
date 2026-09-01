package eg;

import java.util.ArrayList;
import java.util.List;
import mh.e8;
import mh.g5;
import mh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.dt;
import org.telegram.ui.p6;
import org.telegram.ui.uq0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Utilities.themeQueue.postRunnable(new d3((o3) this.c, this.b, (List) obj, new ArrayList(), (uq0) this.d, 0));
                break;
            case 1:
                lh.x3 x3Var = (lh.x3) this.c;
                int i10 = this.b;
                lh.n3 n3Var = (lh.n3) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var = x3Var.a;
                j7 j7Var = x3Var.e;
                j7Var.a(i10, arrayList);
                n3Var.f(true);
                x3Var.f(true);
                x3Var.n();
                TL_stars.TL_starGiftCollection c3 = j7Var.c(i10);
                if (c3 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            ic R = qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, g5.D1(savedStarGift.gift), c3.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        ic R2 = qc.a0(p2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c3.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 2:
                p6 p6Var = (p6) this.c;
                int[] iArr = (int[]) this.d;
                int i11 = this.b;
                float f10 = iArr[0];
                float f11 = i11;
                p6Var.run(Float.valueOf((k7.o.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 3:
                d10 d10Var = (d10) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i12 = this.b;
                d10Var.getClass();
                d10Var.x0 = ((Boolean) obj).booleanValue();
                d10Var.dismiss();
                callback.run(Integer.valueOf(i12));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new dt((TLRPC.UserFull) obj, (org.telegram.ui.web.s) this.c, this.b, (TLRPC.User) this.d, 13));
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                p2Var2.showDialog(new vh.a(p2Var2.getContext(), chat, -chat2.id, new e8(p2Var2, this.b, chat2, chat, 3)));
                break;
        }
    }

    public /* synthetic */ h3(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
