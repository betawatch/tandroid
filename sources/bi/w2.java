package bi;

import android.util.SparseIntArray;
import c8.i9;
import di.k8;
import di.m9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ln0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w2(int i7, kg.j1 j1Var, aa.c0 c0Var) {
        this.a = 3;
        this.b = i7;
        this.c = j1Var;
        this.d = c0Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.c;
                int i7 = this.b;
                c4 c4Var = (c4) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.e2 e2Var = i4Var.a;
                k8 k8Var = i4Var.e;
                k8Var.a(i7, arrayList);
                c4Var.f(true);
                i4Var.f(true);
                i4Var.o();
                TL_stars.TL_starGiftCollection c10 = k8Var.c(i7);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            xb R = cc.a0(e2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        xb R2 = cc.a0(e2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(hd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ci.p0((TLRPC.UserFull) obj, (org.telegram.ui.web.o) this.c, this.b, (TLRPC.User) this.d, 9));
                break;
            case 2:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                e2Var2.showDialog(new ni.a(e2Var2.getContext(), chat, -chat2.id, new m9(e2Var2, this.b, chat2, chat, 1)));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ci.p0(this.b, (kg.j1) this.c, (SparseIntArray) obj, (aa.c0) this.d, 12));
                break;
            case 4:
                org.telegram.ui.n6 n6Var = (org.telegram.ui.n6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f10 = iArr[0];
                float f11 = i10;
                n6Var.a(Float.valueOf((i9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 5:
                zz zzVar = (zz) this.c;
                z10 z10Var = (z10) this.d;
                int i11 = this.b;
                zzVar.getClass();
                zzVar.w2 = ((Boolean) obj).booleanValue();
                zzVar.dismiss();
                z10Var.a(Integer.valueOf(i11));
                break;
            default:
                Utilities.i.c(new ai.f1((tg.f2) this.c, this.b, (List) obj, new ArrayList(), (ln0) this.d, 27));
                break;
        }
    }

    public /* synthetic */ w2(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ w2(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
