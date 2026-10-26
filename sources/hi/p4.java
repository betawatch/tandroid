package hi;

import a8.ee;
import android.util.SparseIntArray;
import bi.h7;
import bi.q9;
import bi.s9;
import bi.ua;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.dr0;
import org.telegram.ui.fi1;
import org.telegram.ui.q6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p4(int i10, org.telegram.ui.ActionBar.q qVar, s9 s9Var) {
        this.a = 2;
        this.b = i10;
        this.c = qVar;
        this.d = s9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.h1((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.c, this.b, (TLRPC.User) this.d, 5));
                break;
            case 1:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                r2Var.showDialog(new ki.a(r2Var.getContext(), chat, -chat2.id, new ua(r2Var, this.b, chat2, chat, 1)));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.h1(this.b, (org.telegram.ui.ActionBar.q) this.c, (SparseIntArray) obj, (s9) this.d, 12));
                break;
            case 3:
                q6 q6Var = (q6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f7 = iArr[0];
                float f10 = i10;
                q6Var.run(Float.valueOf((ee.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (f7 / f10)), Boolean.FALSE);
                break;
            case 4:
                n10 n10Var = (n10) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i11 = this.b;
                n10Var.getClass();
                n10Var.A0 = ((Boolean) obj).booleanValue();
                n10Var.dismiss();
                callback.run(Integer.valueOf(i11));
                break;
            case 5:
                Utilities.themeQueue.postRunnable(new fi1((sg.p2) this.c, this.b, (List) obj, new ArrayList(), (dr0) this.d, 1));
                break;
            default:
                zh.r2 r2Var2 = (zh.r2) this.c;
                int i12 = this.b;
                zh.m2 m2Var = (zh.m2) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2.a;
                q9 q9Var = r2Var2.e;
                q9Var.a(i12, arrayList);
                m2Var.f(true);
                r2Var2.f(true);
                r2Var2.o();
                TL_stars.TL_starGiftCollection c10 = q9Var.c(i12);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            qc S = wc.b0(r2Var3).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h7.X1(savedStarGift.gift), c10.title)));
                            S.s = false;
                            S.j();
                            break;
                        }
                    } else {
                        qc S2 = wc.b0(r2Var3).S(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        S2.s = false;
                        S2.j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ p4(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
