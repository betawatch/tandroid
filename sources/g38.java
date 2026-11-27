// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g38 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g38(fn7 fn7Var, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j;
        this.f = obj2;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                ((h48) fn7Var).H0((boolean[]) obj4, this.b, this.c, (d38) obj3, (zta) obj, (l01) obj2);
                break;
            default:
                wua wuaVar = (wua) fn7Var;
                hw4 hw4Var = (hw4) obj3;
                ((l01) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ita itaVar = wuaVar.M2;
                    if (itaVar != null) {
                        itaVar.b(this.b, this.c, hw4Var != null);
                    }
                    if (hw4Var != null) {
                        hl.c3(new aw4(hw4Var, (byte) 3));
                        wuaVar.O0 = true;
                    }
                    wuaVar.dismiss();
                    break;
                }
                break;
        }
    }
}
