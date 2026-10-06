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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.xi1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ep implements vi {
    public final /* synthetic */ xi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.gc f;
    public final /* synthetic */ org.telegram.ui.cd h;

    public ep(xi xiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.gc gcVar, org.telegram.ui.cd cdVar) {
        this.a = xiVar;
        this.b = tL_premium_boostsStatus;
        this.c = d6Var;
        this.d = gVar;
        this.e = j3;
        this.f = gcVar;
        this.h = cdVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = xiVar.j0.getSelectedPhotos();
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
                dp dpVar = new dp(new xi1(file, file, ""), loadBitmap, false, 0);
                dpVar.V1 = this.b;
                dpVar.a.a = this.c;
                dpVar.p1 = this.d;
                dpVar.F1 = false;
                dpVar.E1 = false;
                dpVar.n1 = 0.2f;
                dpVar.c1(this.e);
                dpVar.I1 = new cp(xiVar, this.f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                l2Var.e = true;
                this.h.showAsSheet(dpVar, l2Var);
                xiVar.dismiss();
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
        dp dpVar = new dp(obj, null, true, 1);
        dpVar.V1 = this.b;
        dpVar.a.a = this.c;
        dpVar.p1 = this.d;
        dpVar.c1(this.e);
        dpVar.I1 = new cp(this.a, this.f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        l2Var.e = true;
        this.h.showAsSheet(dpVar, l2Var);
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
