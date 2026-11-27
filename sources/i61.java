// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class i61 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i61(int i, c1 c1Var, lb7 lb7Var) {
        this.a = (byte) 6;
        this.b = i;
        this.c = c1Var;
        this.d = lb7Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p pVar = (p) this.c;
                int[] iArr = (int[]) this.d;
                float f = this.b;
                pVar.a(Float.valueOf((ete.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f)) + (iArr[0] / f)), Boolean.FALSE);
                break;
            case 1:
                e eVar = (e) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                eVar.showDialog(new kn2(eVar.getContext(), chat, -chat2.id, new zo2(eVar, this.b, chat2, chat, (byte) 0)));
                break;
            case 2:
                qn4 qn4Var = (qn4) this.c;
                pcc pccVar = (pcc) this.d;
                int i = this.b;
                qn4Var.v2 = ((Boolean) obj).booleanValue();
                qn4Var.dismiss();
                pccVar.a(Integer.valueOf(i));
                break;
            case 3:
                eu8 eu8Var = (eu8) this.c;
                int i2 = this.b;
                au8 au8Var = (au8) this.d;
                ArrayList arrayList = (ArrayList) obj;
                e eVar2 = eu8Var.a;
                zwa zwaVar = eu8Var.e;
                zwaVar.a(i2, arrayList);
                au8Var.f(true);
                eu8Var.f(true);
                eu8Var.o();
                TL_stars.TL_starGiftCollection c = zwaVar.c(i2);
                if (c != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            v21 R = d31.b0(eVar2).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131750354, wua.u1(savedStarGift.gift), c.title)));
                            R.s = false;
                            R.j();
                            break;
                        }
                    } else {
                        v21 R2 = d31.b0(eVar2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), hl.S2(ob6.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c.title)));
                        R2.s = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 4:
                hl.c3(new y36(obj, this.c, this.b, this.d, (byte) 27));
                break;
            case 5:
                Utilities.i.c(new l77(this.c, this.b, obj, (Object) new ArrayList(), this.d, (byte) 27));
                break;
            case 6:
                hl.c3(new efa(this.b, this.c, obj, this.d, (byte) 9));
                break;
            default:
                boolean[] zArr = (boolean[]) this.c;
                int i3 = this.b;
                Runnable runnable = (Runnable) this.d;
                zArr[i3] = ((Boolean) obj).booleanValue();
                runnable.run();
                break;
        }
    }

    public /* synthetic */ i61(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ i61(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
