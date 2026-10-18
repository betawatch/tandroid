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
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lp implements ri {
    public final /* synthetic */ ti a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.hc f;
    public final /* synthetic */ org.telegram.ui.dd h;

    public lp(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.hc hcVar, org.telegram.ui.dd ddVar) {
        this.a = tiVar;
        this.b = tL_premium_boostsStatus;
        this.c = d6Var;
        this.d = gVar;
        this.e = j10;
        this.f = hcVar;
        this.h = ddVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void O(Object obj) {
        kp kpVar = new kp(obj, null, true, 1);
        kpVar.V1 = this.b;
        kpVar.a.a = this.c;
        kpVar.p1 = this.d;
        kpVar.c1(this.e);
        kpVar.I1 = new jp(this.a, this.f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        l2Var.e = true;
        this.h.showAsSheet(kpVar, l2Var);
    }

    @Override // org.telegram.ui.Components.ri
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.j0.getSelectedPhotos();
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
                kp kpVar = new kp(new vh1(file, file, ""), loadBitmap, false, 0);
                kpVar.V1 = this.b;
                kpVar.a.a = this.c;
                kpVar.p1 = this.d;
                kpVar.F1 = false;
                kpVar.E1 = false;
                kpVar.n1 = 0.2f;
                kpVar.c1(this.e);
                kpVar.I1 = new jp(tiVar, this.f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                l2Var.e = true;
                this.h.showAsSheet(kpVar, l2Var);
                tiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ri
    public final void r(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
