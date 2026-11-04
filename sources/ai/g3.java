package ai;

import android.util.SparseIntArray;
import b8.be;
import ci.s8;
import ci.u8;
import ci.w9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.rz;
import org.telegram.ui.en0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(int i3, lg.n nVar, u8 u8Var) {
        this.a = 3;
        this.b = i3;
        this.c = nVar;
        this.d = u8Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                u4 u4Var = (u4) this.c;
                int i3 = this.b;
                o4 o4Var = (o4) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.d2 d2Var = u4Var.a;
                s8 s8Var = u4Var.e;
                s8Var.a(i3, arrayList);
                o4Var.f(true);
                u4Var.f(true);
                u4Var.o();
                TL_stars.TL_starGiftCollection c2 = s8Var.c(i3);
                if (c2 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            ac R = fc.a0(d2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750401, ci.l6.A1(savedStarGift.gift), c2.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        ac R2 = fc.a0(d2Var).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(bd.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c2.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new bi.q0((TLRPC.UserFull) obj, (org.telegram.ui.web.p) this.c, this.b, (TLRPC.User) this.d, 5));
                break;
            case 2:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                d2Var2.showDialog(new li.a(d2Var2.getContext(), chat, -chat2.id, new w9(d2Var2, this.b, chat2, chat, 1)));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new bi.q0(this.b, (lg.n) this.c, (SparseIntArray) obj, (u8) this.d, 13));
                break;
            case 4:
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) this.c;
                int[] iArr = (int[]) this.d;
                int i10 = this.b;
                float f10 = iArr[0];
                float f11 = i10;
                o6Var.a(Float.valueOf((be.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 5:
                rz rzVar = (rz) this.c;
                u10 u10Var = (u10) this.d;
                int i11 = this.b;
                rzVar.getClass();
                rzVar.t2 = ((Boolean) obj).booleanValue();
                rzVar.dismiss();
                u10Var.a(Integer.valueOf(i11));
                break;
            default:
                Utilities.i.c(new p1((ug.c2) this.c, this.b, (List) obj, new ArrayList(), (en0) this.d, 26));
                break;
        }
    }

    public /* synthetic */ g3(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    public /* synthetic */ g3(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }
}
