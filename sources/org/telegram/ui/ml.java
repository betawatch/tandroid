package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ml extends zt0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ qn c;

    public ml(qn qnVar, ArrayList arrayList, boolean[] zArr) {
        this.c = qnVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.jb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
