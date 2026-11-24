// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ooc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ toc b;

    public /* synthetic */ ooc(toc tocVar, byte b) {
        this.a = b;
        this.b = tocVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        toc tocVar = this.b;
        switch (b) {
            case 0:
                tocVar.g0((p8c) obj);
                break;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    m21 I = u21.b0(tocVar).I(R.raw.contact_check, k96.M0(2131742945, null), k96.M0(2131742943, null));
                    I.j = 5000;
                    I.j();
                    tocVar.a.g3.O(true);
                    break;
                } else {
                    u21.b0(tocVar).f0(str, false);
                    break;
                }
            default:
                tocVar.d0((Boolean) obj);
                break;
        }
    }
}
