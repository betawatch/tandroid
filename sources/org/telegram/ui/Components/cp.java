package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hj1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cp implements ti {
    public final /* synthetic */ lp a;

    public cp(lp lpVar) {
        this.a = lpVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean D0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void K(Object obj) {
        zo zoVar = new zo(obj, null, true, 3);
        lp lpVar = this.a;
        zoVar.V1 = lpVar.f0;
        zoVar.c1(lpVar.v.a());
        zoVar.I1 = new bp(this, 1);
        lp.q(lpVar, zoVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        lp lpVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = lpVar.Y.j0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            if (str != null) {
                File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap loadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                zo zoVar = new zo(new hj1(file, file, ""), loadBitmap, false, 2);
                zoVar.V1 = lpVar.f0;
                zoVar.F1 = false;
                zoVar.E1 = false;
                zoVar.n1 = 0.2f;
                zoVar.c1(lpVar.v.a());
                zoVar.I1 = new bp(this, 0);
                lp.q(lpVar, zoVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
