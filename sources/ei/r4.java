package ei;

import ai.c9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.m6;
import org.telegram.ui.pr0;
import yh.k5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c9((TLRPC.UserFull) obj, (org.telegram.ui.web.r) this.c, this.b, (TLRPC.User) this.d, 2));
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                n2Var.showDialog(new hi.b(n2Var.getContext(), chat, -chat2.id, new fi.m0(n2Var, this.b, chat2, chat, 0)));
                break;
            case 2:
                m6 m6Var = (m6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f7 = iArr[0];
                float f10 = i10;
                m6Var.run(Float.valueOf((w7.q.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (f7 / f10)), Boolean.FALSE);
                break;
            case 3:
                c10 c10Var = (c10) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                int i11 = this.b;
                c10Var.getClass();
                c10Var.A0 = ((Boolean) obj).booleanValue();
                c10Var.dismiss();
                callback.run(Integer.valueOf(i11));
                break;
            case 4:
                Utilities.themeQueue.postRunnable(new l3((qg.n2) this.c, this.b, (List) obj, new ArrayList(), (pr0) this.d, 29));
                break;
            default:
                xh.s2 s2Var = (xh.s2) this.c;
                int i12 = this.b;
                xh.o2 o2Var = (xh.o2) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = s2Var.a;
                k5 k5Var = s2Var.e;
                k5Var.a(i12, arrayList);
                o2Var.f(true);
                s2Var.f(true);
                s2Var.n();
                TL_stars.TL_starGiftCollection c10 = k5Var.c(i12);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            pc R = xc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        pc R2 = xc.a0(n2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2AddedToCollectionMany", arrayList.size(), c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r4(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
