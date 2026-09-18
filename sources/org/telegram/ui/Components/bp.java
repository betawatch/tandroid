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
import org.telegram.ui.fj1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class bp implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.s3 f;
    public final /* synthetic */ org.telegram.ui.bd h;

    public bp(vi viVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.s3 s3Var, org.telegram.ui.bd bdVar) {
        this.a = viVar;
        this.b = tL_premium_boostsStatus;
        this.c = e6Var;
        this.d = gVar;
        this.e = j3;
        this.f = s3Var;
        this.h = bdVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.j0.getSelectedPhotos();
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
                ap apVar = new ap(new fj1(file, file, ""), loadBitmap, false, 0);
                apVar.V1 = this.b;
                apVar.a.a = this.c;
                apVar.p1 = this.d;
                apVar.F1 = false;
                apVar.E1 = false;
                apVar.n1 = 0.2f;
                apVar.c1(this.e);
                apVar.I1 = new zo(viVar, this.f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                l2Var.e = true;
                this.h.showAsSheet(apVar, l2Var);
                viVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void U0(Object obj) {
        ap apVar = new ap(obj, null, true, 1);
        apVar.V1 = this.b;
        apVar.a.a = this.c;
        apVar.p1 = this.d;
        apVar.c1(this.e);
        apVar.I1 = new zo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        l2Var.e = true;
        this.h.showAsSheet(apVar, l2Var);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void x0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
