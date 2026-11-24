// default package

import org.telegram.messenger.voip.VoIPPendingCall;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dw2 implements jm7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dw2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        va vaVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                c40 c40Var = (c40) obj;
                if (i == 25) {
                    c40Var.o(false);
                    break;
                }
                break;
            case 1:
                vkb vkbVar = (vkb) obj;
                if (i == 264) {
                    vkbVar.getTextView().invalidate();
                    break;
                }
                break;
            case 2:
                ((ey0) obj).invalidate();
                break;
            case 3:
                wy8 wy8Var = (wy8) obj;
                if (objArr.length > 1 && objArr[1] == wy8Var.j2) {
                    wy8Var.y0();
                    break;
                }
                break;
            case 4:
                iib iibVar = (iib) obj;
                if (i == 258) {
                    gm.c3(new zcb(iibVar, (byte) 4));
                    break;
                }
                break;
            case 5:
                ((VoIPPendingCall) obj).lambda$new$0(i, i2, objArr);
                break;
            default:
                asc ascVar = (asc) obj;
                if (!ascVar.r && (vaVar = ascVar.a) != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
        }
    }
}
