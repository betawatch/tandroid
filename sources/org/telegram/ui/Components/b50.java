package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.bu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ e50 b;

    public b50(e50 e50Var, ArrayList arrayList) {
        this.b = e50Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        d50 d50Var = this.b.b;
        if (d50Var == null) {
            return null;
        }
        return d50Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean z() {
        return false;
    }
}
