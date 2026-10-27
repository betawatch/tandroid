package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.iu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ g50 b;

    public d50(g50 g50Var, ArrayList arrayList) {
        this.b = g50Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final org.telegram.ui.su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        f50 f50Var = this.b.b;
        if (f50Var == null) {
            return null;
        }
        return f50Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean z() {
        return false;
    }
}
