package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ ow0(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        bx0 bx0Var = (bx0) obj;
        bx0 bx0Var2 = (bx0) obj2;
        switch (this.a) {
            case 0:
                MessagesController messagesController = this.b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(bx0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController.businessFeaturesTypesToPosition.get(bx0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                MessagesController messagesController2 = this.b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(bx0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(bx0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
