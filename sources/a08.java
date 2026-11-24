// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a08 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gk7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a08(gk7 gk7Var, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, byte b) {
        this.a = b;
        this.d = gk7Var;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j;
        this.f = obj2;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                ((a18) gk7Var).G0((boolean[]) obj4, this.b, this.c, (xz7) obj3, (ypa) obj, (c01) obj2);
                break;
            default:
                vqa vqaVar = (vqa) gk7Var;
                du4 du4Var = (du4) obj3;
                ((c01) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ipa ipaVar = vqaVar.M2;
                    if (ipaVar != null) {
                        ipaVar.a(this.b, this.c, du4Var != null);
                    }
                    if (du4Var != null) {
                        gl.c3(new wt4(du4Var, (byte) 3));
                        vqaVar.O0 = true;
                    }
                    vqaVar.dismiss();
                    break;
                }
                break;
        }
    }
}
