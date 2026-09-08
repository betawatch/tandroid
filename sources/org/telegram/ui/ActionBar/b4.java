package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b4 implements Utilities.Callback {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ b4(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i10, int i11, long j3) {
        this.a = callback;
        this.b = wallPaper;
        this.c = i10;
        this.d = i11;
        this.e = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        dg.a aVar = (dg.a) obj;
        Utilities.Callback callback = this.a;
        if (aVar != null) {
            callback.run(aVar);
            return;
        }
        TLRPC.WallPaper wallPaper = this.b;
        ImageLocation forDocument = ImageLocation.getForDocument(wallPaper.document);
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setAllowLoadingOnAttachedOnly(false);
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        imageReceiver.setImage(forDocument, (min / AndroidUtilities.density) + "_" + (Math.max(point2.x, point2.y) / AndroidUtilities.density) + "_f", null, ".jpg", wallPaper, 1);
        imageReceiver.setDelegate(new org.telegram.tgnet.g(this.c, this.d, this.e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
