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
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class gp implements vi {
    public final /* synthetic */ pp a;

    public gp(pp ppVar) {
        this.a = ppVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        pp ppVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = ppVar.Y.j0.getSelectedPhotos();
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
                dp dpVar = new dp(new zi1(file, file, ""), loadBitmap, false, 2);
                dpVar.V1 = ppVar.f0;
                dpVar.F1 = false;
                dpVar.E1 = false;
                dpVar.n1 = 0.2f;
                dpVar.c1(ppVar.v.a());
                dpVar.I1 = new fp(this, 0);
                pp.q(ppVar, dpVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public final void U0(Object obj) {
        dp dpVar = new dp(obj, null, true, 3);
        pp ppVar = this.a;
        dpVar.V1 = ppVar.f0;
        dpVar.c1(ppVar.v.a());
        dpVar.I1 = new fp(this, 1);
        pp.q(ppVar, dpVar);
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vi
    public final void x0(ih ihVar) {
        ihVar.run();
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
