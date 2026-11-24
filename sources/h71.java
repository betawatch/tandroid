// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h71 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h71(int i, b1 b1Var, eb7 eb7Var) {
        this.a = (byte) 6;
        this.b = i;
        this.c = b1Var;
        this.d = eb7Var;
    }

    @Override // qac
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p pVar = (p) this.c;
                int[] iArr = (int[]) this.d;
                float f = this.b;
                pVar.a(Float.valueOf((pqe.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f)) + (iArr[0] / f)), Boolean.FALSE);
                break;
            case 1:
                d dVar = (d) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                dVar.showDialog(new co2(dVar.getContext(), chat, -chat2.id, new rp2(dVar, this.b, chat2, chat, (byte) 0)));
                break;
            case 2:
                ln4 ln4Var = (ln4) this.c;
                qac qacVar = (qac) this.d;
                int i = this.b;
                ln4Var.v2 = ((Boolean) obj).booleanValue();
                ln4Var.dismiss();
                qacVar.a(Integer.valueOf(i));
                break;
            case 3:
                vs8 vs8Var = (vs8) this.c;
                int i2 = this.b;
                rs8 rs8Var = (rs8) this.d;
                ArrayList arrayList = (ArrayList) obj;
                d dVar2 = vs8Var.a;
                yua yuaVar = vs8Var.e;
                yuaVar.a(i2, arrayList);
                rs8Var.f(true);
                vs8Var.f(true);
                vs8Var.o();
                TL_stars.TL_starGiftCollection c = yuaVar.c(i2);
                if (c != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            u31 R = c41.b0(dVar2).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131750326, wsa.t1(savedStarGift.gift), c.title)));
                            R.s = false;
                            R.j();
                            break;
                        }
                    } else {
                        u31 R2 = c41.b0(dVar2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), gm.S2(jb6.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c.title)));
                        R2.s = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 4:
                gm.c3(new v36(obj, this.c, this.b, this.d, (byte) 26));
                break;
            case 5:
                Utilities.i.c(new i77(this.c, this.b, obj, (Object) new ArrayList(), this.d, (byte) 27));
                break;
            case 6:
                gm.c3(new tda(this.b, this.c, obj, this.d, (byte) 8));
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

    public /* synthetic */ h71(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ h71(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
