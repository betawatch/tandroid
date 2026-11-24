// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ag1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vg1 b;

    public /* synthetic */ ag1(vg1 vg1Var, byte b) {
        this.a = b;
        this.b = vg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final vg1 vg1Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final byte b3 = 1;
                    gm.c3(new Runnable() { // from class: yf1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = tL_channels_adminLogResults;
                            vg1 vg1Var2 = vg1Var;
                            switch (b4) {
                                case 0:
                                    vg1Var2.V0(tL_channels_adminLogResults2);
                                    break;
                                default:
                                    vg1Var2.W0(tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                vg1Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i));
                        }
                    }
                    vg1Var.getMessagesController().d4(arrayList2, false);
                    break;
                }
                break;
            case 2:
                vg1Var.getClass();
                gm.c3(new y31(vg1Var, tLObject, (byte) 20));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    gm.c3(new Runnable() { // from class: yf1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults22 = tL_channels_adminLogResults2;
                            vg1 vg1Var2 = vg1Var;
                            switch (b4) {
                                case 0:
                                    vg1Var2.V0(tL_channels_adminLogResults22);
                                    break;
                                default:
                                    vg1Var2.W0(tL_channels_adminLogResults22);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                gm.c3(new tv0(vg1Var, tL_error, tLObject, (byte) 16));
                break;
        }
    }
}
