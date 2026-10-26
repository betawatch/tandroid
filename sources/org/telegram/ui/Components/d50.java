package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.gu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ g50 b;

    public d50(g50 g50Var, ArrayList arrayList) {
        this.b = g50Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        f50 f50Var = this.b.b;
        if (f50Var == null) {
            return null;
        }
        return f50Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
