package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb b;

    public /* synthetic */ pa(mb mbVar, int i7) {
        this.a = i7;
        this.b = mbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i7 = 1;
                    final mb mbVar = this.b;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ma
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    mb.Z(mbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    mb.d0(mbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                mb mbVar2 = this.b;
                mbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    mbVar2.getMessagesController().Y3(arrayList2, false);
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(21, this.b, tLObject));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i11 = 0;
                    final mb mbVar3 = this.b;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ma
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    mb.Z(mbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    mb.d0(mbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new o1(this.b, tL_error, tLObject, 9));
                break;
        }
    }
}
