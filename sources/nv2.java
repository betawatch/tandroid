// default package

import org.telegram.messenger.voip.VoIPPendingCall;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nv2 implements fn7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nv2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        wa waVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d30 d30Var = (d30) obj;
                if (i == 25) {
                    d30Var.o(false);
                    break;
                }
                break;
            case 1:
                qmb qmbVar = (qmb) obj;
                if (i == 263) {
                    qmbVar.getTextView().invalidate();
                    break;
                }
                break;
            case 2:
                ((fx0) obj).invalidate();
                break;
            case 3:
                g09 g09Var = (g09) obj;
                if (objArr.length > 1 && objArr[1] == g09Var.j2) {
                    g09Var.y0();
                    break;
                }
                break;
            case 4:
                dkb dkbVar = (dkb) obj;
                if (i == 257) {
                    hl.c3(new s8b(dkbVar, (byte) 13));
                    break;
                }
                break;
            case 5:
                ((VoIPPendingCall) obj).lambda$new$0(i, i2, objArr);
                break;
            default:
                muc mucVar = (muc) obj;
                if (!mucVar.r && (waVar = mucVar.a) != null) {
                    waVar.g3.O(true);
                    break;
                }
                break;
        }
    }
}
