package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nl extends cu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ sn c;

    public nl(sn snVar, ArrayList arrayList, boolean[] zArr) {
        this.c = snVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.kb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
