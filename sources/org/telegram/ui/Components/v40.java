package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.ou0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ y40 b;

    public v40(y40 y40Var, ArrayList arrayList) {
        this.b = y40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        x40 x40Var = this.b.b;
        if (x40Var == null) {
            return null;
        }
        return x40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean z() {
        return false;
    }
}
