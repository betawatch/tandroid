// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a61 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a61(int i, b1 b1Var, d97 d97Var) {
        this.a = (byte) 6;
        this.b = i;
        this.c = b1Var;
        this.d = d97Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                p pVar = (p) this.c;
                int[] iArr = (int[]) this.d;
                float f = this.b;
                pVar.a(Float.valueOf((moe.a(((Float) obj).floatValue(), 0.0f, 1.0f) * (1.0f / f)) + (iArr[0] / f)), Boolean.FALSE);
                break;
            case 1:
                d dVar = (d) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                dVar.showDialog(new qm2(dVar.getContext(), chat, -chat2.id, new go2(dVar, this.b, chat2, chat, (byte) 0)));
                break;
            case 2:
                ll4 ll4Var = (ll4) this.c;
                p8c p8cVar = (p8c) this.d;
                int i = this.b;
                ll4Var.v2 = ((Boolean) obj).booleanValue();
                ll4Var.dismiss();
                p8cVar.a(Integer.valueOf(i));
                break;
            case 3:
                tq8 tq8Var = (tq8) this.c;
                int i2 = this.b;
                pq8 pq8Var = (pq8) this.d;
                ArrayList arrayList = (ArrayList) obj;
                d dVar2 = tq8Var.a;
                wsa wsaVar = tq8Var.e;
                wsaVar.a(i2, arrayList);
                pq8Var.f(true);
                tq8Var.f(true);
                tq8Var.o();
                TL_stars.TL_starGiftCollection c = wsaVar.c(i2);
                if (c != null) {
                    if (arrayList.size() <= 1) {
                        if (arrayList.size() == 1) {
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                            m21 R = u21.b0(dVar2).R(savedStarGift.gift.getDocument(), gl.T2(k96.a0(null, null, 2131750377, vqa.t1(savedStarGift.gift), c.title)));
                            R.r = false;
                            R.j();
                            break;
                        }
                    } else {
                        m21 R2 = u21.b0(dVar2).R(((TL_stars.SavedStarGift) arrayList.get(0)).gift.getDocument(), gl.T2(k96.K("Gift2AddedToCollectionMany", arrayList.size(), ',', c.title)));
                        R2.r = false;
                        R2.j();
                        break;
                    }
                }
                break;
            case 4:
                gl.d3(new q76(obj, this.c, this.b, this.d, (byte) 25));
                break;
            case 5:
                Utilities.i.c(new i57(this.c, this.b, obj, (Object) new ArrayList(), this.d, (byte) 26));
                break;
            case 6:
                gl.d3(new ica(this.b, this.c, obj, this.d, (byte) 7));
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

    public /* synthetic */ a61(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ a61(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
