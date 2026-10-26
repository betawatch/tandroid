package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ol extends gu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ un c;

    public ol(un unVar, ArrayList arrayList, boolean[] zArr) {
        this.c = unVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.pb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
