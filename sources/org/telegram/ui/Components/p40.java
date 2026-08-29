package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p40 extends org.telegram.ui.pt0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ s40 b;

    public p40(s40 s40Var, ArrayList arrayList) {
        this.b = s40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        r40 r40Var = this.b.b;
        if (r40Var == null) {
            return null;
        }
        return r40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean z() {
        return false;
    }
}
