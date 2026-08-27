package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ll extends st0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ rn c;

    public ll(rn rnVar, ArrayList arrayList, boolean[] zArr) {
        this.c = rnVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.eb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
