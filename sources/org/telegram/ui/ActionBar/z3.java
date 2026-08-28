package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Utilities.Callback {
    public final /* synthetic */ Utilities.Callback a;
    public final /* synthetic */ TLRPC.WallPaper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ z3(Utilities.Callback callback, TLRPC.WallPaper wallPaper, int i9, int i10, long j10) {
        this.a = callback;
        this.b = wallPaper;
        this.c = i9;
        this.d = i10;
        this.e = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        lf.a aVar = (lf.a) obj;
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
        imageReceiver.setDelegate(new org.telegram.tgnet.f(this.c, this.d, this.e, callback));
        ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
    }
}
