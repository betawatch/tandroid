package hi;

import android.util.SparseIntArray;
import bi.k7;
import bi.t9;
import bi.ub;
import bi.ya;
import c8.j9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.vz;
import org.telegram.ui.mn0;
import org.telegram.ui.n6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d4(int i7, l2.a0 a0Var, aa.d0 d0Var) {
        this.a = 2;
        this.b = i7;
        this.c = a0Var;
        this.d = d0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.a1((TLRPC.UserFull) obj, (org.telegram.ui.web.n) this.c, this.b, (TLRPC.User) this.d, 5));
                break;
            case 1:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                f2Var.showDialog(new ki.a(f2Var.getContext(), chat, -chat2.id, new ya(f2Var, this.b, chat2, chat, 1)));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.a1(this.b, (l2.a0) this.c, (SparseIntArray) obj, (aa.d0) this.d, 12));
                break;
            case 3:
                n6 n6Var = (n6) this.c;
                int[] iArr = (int[]) this.d;
                int i7 = this.b;
                float f10 = iArr[0];
                float f11 = i7;
                n6Var.a(Float.valueOf((j9.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f11)) + (f10 / f11)), Boolean.FALSE);
                break;
            case 4:
                vz vzVar = (vz) this.c;
                c20 c20Var = (c20) this.d;
                int i10 = this.b;
                vzVar.getClass();
                vzVar.v2 = ((Boolean) obj).booleanValue();
                vzVar.dismiss();
                c20Var.a(Integer.valueOf(i10));
                break;
            case 5:
                Utilities.i.c(new ub((tg.c2) this.c, this.b, (List) obj, new ArrayList(), (mn0) this.d, 25));
                break;
            default:
                zh.d2 d2Var = (zh.d2) this.c;
                int i11 = this.b;
                zh.z1 z1Var = (zh.z1) this.d;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.ActionBar.f2 f2Var2 = d2Var.a;
                t9 t9Var = d2Var.e;
                t9Var.a(i11, arrayList);
                z1Var.f(true);
                d2Var.f(true);
                d2Var.o();
                TL_stars.TL_starGiftCollection c10 = t9Var.c(i11);
                if (c10 != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            bc R = gc.a0(f2Var2).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750393, k7.z1(savedStarGift.gift), c10.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        bc R2 = gc.a0(f2Var2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), org.telegram.messenger.g0.X2(id.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c10.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d4(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ d4(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
