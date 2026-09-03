package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u40 extends org.telegram.ui.fu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ x40 b;

    public u40(x40 x40Var, ArrayList arrayList) {
        this.b = x40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        w40 w40Var = this.b.b;
        if (w40Var == null) {
            return null;
        }
        return w40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
