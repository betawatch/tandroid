package bi;

import android.util.SparseIntArray;
import c8.m9;
import di.p9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.kc;
import org.telegram.ui.pn0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j5(int i7, oi.c2 c2Var, aa.c0 c0Var) {
        this.a = 3;
        this.b = i7;
        this.c = c2Var;
        this.d = c0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                v6 v6Var = (v6) this.c;
                int i7 = this.b;
                p6 p6Var = (p6) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.g2 g2Var = v6Var.a;
                di.n8 n8Var = v6Var.e;
                n8Var.a(i7, arrayList);
                p6Var.f(true);
                v6Var.f(true);
                v6Var.o();
                TL_stars.TL_starGiftCollection c10 = n8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            fc R = kc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        fc R2 = kc.b0(g2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.W2(gd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new ai.x0((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.c, this.b, (TLRPC.User) this.d, 11));
                break;
            case 2:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                g2Var2.showDialog(new ni.a(g2Var2.getContext(), chat, -chat2.id, new p9(g2Var2, this.b, chat2, chat, 3)));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new ai.x0(this.b, (oi.c2) this.c, (SparseIntArray) obj, (aa.c0) this.d, 14));
                break;
            case 4:
                org.telegram.ui.n6 n6Var = (org.telegram.ui.n6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f10 = iArr[0];
                float f11 = i10;
                n6Var.a(Float.valueOf((m9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 5:
                g00 g00Var = (g00) this.c;
                w10 w10Var = (w10) this.d;
                int i11 = this.b;
                g00Var.getClass();
                g00Var.w2 = ((Boolean) obj).booleanValue();
                g00Var.dismiss();
                w10Var.a(Integer.valueOf(i11));
                break;
            default:
                Utilities.i.c(new ai.d1((tg.i2) this.c, this.b, (List) obj, new ArrayList(), (pn0) this.d, 27));
                break;
        }
    }

    public /* synthetic */ j5(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ j5(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
