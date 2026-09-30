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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class fp implements ui {
    public final /* synthetic */ op a;

    public fp(op opVar) {
        this.a = opVar;
    }

    @Override // org.telegram.ui.Components.ui
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        op opVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = opVar.Y.j0.getSelectedPhotos();
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
                cp cpVar = new cp(new zi1(file, file, ""), loadBitmap, false, 2);
                cpVar.V1 = opVar.f0;
                cpVar.F1 = false;
                cpVar.E1 = false;
                cpVar.n1 = 0.2f;
                cpVar.c1(opVar.v.a());
                cpVar.I1 = new ep(this, 0);
                op.q(opVar, cpVar);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ui
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ui
    public final void U0(Object obj) {
        cp cpVar = new cp(obj, null, true, 3);
        op opVar = this.a;
        cpVar.V1 = opVar.f0;
        cpVar.c1(opVar.v.a());
        cpVar.I1 = new ep(this, 1);
        op.q(opVar, cpVar);
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final void x0(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
