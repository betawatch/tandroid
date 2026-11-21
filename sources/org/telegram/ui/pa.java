package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ pa(lb lbVar, int i7) {
        this.a = i7;
        this.b = lbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i7 = 1;
                    final lb lbVar = this.b;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ma
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    lb.Z(lbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    lb.d0(lbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                lb lbVar2 = this.b;
                lbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    lbVar2.getMessagesController().f4(arrayList2, false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.g3(new u8(7, this.b, tLObject));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i11 = 0;
                    final lb lbVar3 = this.b;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ma
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    lb.Z(lbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    lb.d0(lbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new o1(this.b, tL_error, tLObject, 9));
                break;
        }
    }
}
