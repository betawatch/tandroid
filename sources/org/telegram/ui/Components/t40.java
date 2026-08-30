package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t40 extends org.telegram.ui.yt0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ w40 b;

    public t40(w40 w40Var, ArrayList arrayList) {
        this.b = w40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        v40 v40Var = this.b.b;
        if (v40Var == null) {
            return null;
        }
        return v40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean z() {
        return false;
    }
}
