package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob b;

    public /* synthetic */ ma(ob obVar, int i10) {
        this.a = i10;
        this.b = obVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.b, tL_error, tLObject, 9));
                break;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i10 = 1;
                    final ob obVar = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ob.U(obVar, tL_channels_adminLogResults);
                                    break;
                                default:
                                    ob.Y(obVar, tL_channels_adminLogResults);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 2:
                ob obVar2 = this.b;
                obVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i11));
                        }
                    }
                    obVar2.getMessagesController().putUsers(arrayList2, false);
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(20, this.b, tLObject));
                break;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final int i12 = 0;
                    final ob obVar3 = this.b;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oa
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ob.U(obVar3, tL_channels_adminLogResults2);
                                    break;
                                default:
                                    ob.Y(obVar3, tL_channels_adminLogResults2);
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
