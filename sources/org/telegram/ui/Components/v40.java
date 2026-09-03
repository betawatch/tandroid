package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.fu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ y40 b;

    public v40(y40 y40Var, ArrayList arrayList) {
        this.b = y40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        x40 x40Var = this.b.b;
        if (x40Var == null) {
            return null;
        }
        return x40Var.getCloseIntoObject();
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
