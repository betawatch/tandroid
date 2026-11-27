// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class af1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wf1 b;

    public /* synthetic */ af1(wf1 wf1Var, byte b) {
        this.a = b;
        this.b = wf1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final wf1 wf1Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final byte b3 = 1;
                    hl.c3(new Runnable() { // from class: ye1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = tL_channels_adminLogResults;
                            wf1 wf1Var2 = wf1Var;
                            switch (b4) {
                                case 0:
                                    wf1Var2.V0(tL_channels_adminLogResults2);
                                    break;
                                default:
                                    wf1Var2.W0(tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                wf1Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i));
                        }
                    }
                    wf1Var.getMessagesController().j4(arrayList2, false);
                    break;
                }
                break;
            case 2:
                wf1Var.getClass();
                hl.c3(new z21(wf1Var, tLObject, (byte) 19));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    hl.c3(new Runnable() { // from class: ye1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults22 = tL_channels_adminLogResults2;
                            wf1 wf1Var2 = wf1Var;
                            switch (b4) {
                                case 0:
                                    wf1Var2.V0(tL_channels_adminLogResults22);
                                    break;
                                default:
                                    wf1Var2.W0(tL_channels_adminLogResults22);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                hl.c3(new tu0(wf1Var, tL_error, tLObject, (byte) 16));
                break;
        }
    }
}
