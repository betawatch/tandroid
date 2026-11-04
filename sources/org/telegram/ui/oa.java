package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb b;

    public /* synthetic */ oa(kb kbVar, int i3) {
        this.a = i3;
        this.b = kbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i3 = 1;
                    final kb kbVar = this.b;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.la
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    kb.Z(kbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    kb.d0(kbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                kb kbVar2 = this.b;
                kbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    kbVar2.getMessagesController().Y3(arrayList2, false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(25, this.b, tLObject));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i11 = 0;
                    final kb kbVar3 = this.b;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.la
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    kb.Z(kbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    kb.d0(kbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new p1(this.b, tL_error, tLObject, 9));
                break;
        }
    }
}
