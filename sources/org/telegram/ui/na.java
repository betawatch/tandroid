package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ na(pb pbVar, int i9) {
        this.a = i9;
        this.b = pbVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.b, tL_error, tLObject, 9));
                break;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i9 = 1;
                    final pb pbVar = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    pb.T(pbVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    pb.X(pbVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 2:
                pb pbVar2 = this.b;
                pbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    pbVar2.getMessagesController().putUsers(arrayList2, false);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(23, this.b, tLObject));
                break;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i11 = 0;
                    final pb pbVar3 = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    pb.T(pbVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    pb.X(pbVar3, tL_channels_adminLogResults2);
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
