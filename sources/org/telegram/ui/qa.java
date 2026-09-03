package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ qa(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.b, tL_error, tLObject, 9));
                break;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i10 = 1;
                    final sb sbVar = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    sb.U(sbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    sb.Y(sbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 2:
                sb sbVar2 = this.b;
                sbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i11));
                        }
                    }
                    sbVar2.getMessagesController().putUsers(arrayList2, false);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(27, this.b, tLObject));
                break;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i12 = 0;
                    final sb sbVar3 = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    sb.U(sbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    sb.Y(sbVar3, tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }
}
