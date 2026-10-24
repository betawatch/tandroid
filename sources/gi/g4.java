package gi;

import ai.db;
import ai.l7;
import ai.v9;
import ai.va;
import ai.x9;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.di1;
import org.telegram.ui.p6;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g4(int i10, org.telegram.ui.ActionBar.p pVar, x9 x9Var) {
        this.a = 2;
        this.b = i10;
        this.c = pVar;
        this.d = x9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new db((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.c, this.b, (TLRPC.User) this.d, 3));
                break;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                o2Var.showDialog(new ji.a(o2Var.getContext(), chat, -chat2.id, new va(o2Var, this.b, chat2, chat, 1)));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new db(this.b, (org.telegram.ui.ActionBar.p) this.c, (SparseIntArray) obj, (x9) this.d, 10));
                break;
            case 3:
                p6 p6Var = (p6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f7 = iArr[0];
                float f10 = i10;
                p6Var.run(Float.valueOf((w7.r.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (f7 / f10)), Boolean.FALSE);
                break;
            case 4:
                k10 k10Var = (k10) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i11 = this.b;
                k10Var.getClass();
                k10Var.A0 = ((Boolean) obj).booleanValue();
                k10Var.dismiss();
                callback.run(Integer.valueOf(i11));
                break;
            case 5:
                Utilities.themeQueue.postRunnable(new di1((rg.o2) this.c, this.b, (List) obj, new ArrayList(), (zq0) this.d, 1));
                break;
            default:
                yh.p2 p2Var = (yh.p2) this.c;
                int i12 = this.b;
                yh.l2 l2Var = (yh.l2) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = p2Var.a;
                v9 v9Var = p2Var.e;
                v9Var.a(i12, arrayList);
                l2Var.f(true);
                p2Var.f(true);
                p2Var.n();
                TL_stars.TL_starGiftCollection c10 = v9Var.c(i12);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            qc R = xc.a0(o2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.X1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        qc R2 = xc.a0(o2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ g4(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
