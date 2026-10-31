package jg;

import android.util.SparseIntArray;
import bi.i6;
import bi.n4;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.wb;
import org.telegram.ui.n6;
import org.telegram.ui.wo0;
import rh.e4;
import rh.u5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o2(int i10, lg.s sVar, n4 n4Var) {
        this.a = 1;
        this.b = i10;
        this.c = sVar;
        this.d = n4Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Utilities.i.c(new i2.g1((v2) this.c, this.b, (List) obj, new ArrayList(), (wo0) this.d, 1));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new ag.g3(this.b, (lg.s) this.c, (SparseIntArray) obj, (n4) this.d));
                break;
            case 2:
                n6 n6Var = (n6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f7 = iArr[0];
                float f10 = i10;
                n6Var.a(Float.valueOf((w7.u.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f10)) + (f7 / f10)), Boolean.FALSE);
                break;
            case 3:
                j00 j00Var = (j00) this.c;
                q20 q20Var = (q20) this.d;
                int i11 = this.b;
                j00Var.getClass();
                j00Var.s2 = ((Boolean) obj).booleanValue();
                j00Var.dismiss();
                q20Var.a(Integer.valueOf(i11));
                break;
            case 4:
                ph.j2 j2Var = (ph.j2) this.c;
                int i12 = this.b;
                ph.f2 f2Var = (ph.f2) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.k2 k2Var = j2Var.a;
                u5 u5Var = j2Var.e;
                u5Var.a(i12, arrayList);
                f2Var.f(true);
                j2Var.f(true);
                j2Var.o();
                TL_stars.TL_starGiftCollection c10 = u5Var.c(i12);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            wb R = cc.a0(k2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750402, e4.A1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        wb R2 = cc.a0(k2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.i0.W2(cd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.i0.g3(new c11((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.c, this.b, (TLRPC.User) this.d, 22));
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                k2Var2.showDialog(new ai.a(k2Var2.getContext(), chat, -chat2.id, new i6(k2Var2, this.b, chat2, chat, 5)));
                break;
        }
    }

    public /* synthetic */ o2(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ o2(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
