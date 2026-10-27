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
import org.telegram.ui.ei1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pp implements ri {
    public final /* synthetic */ ti a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ org.telegram.ui.f d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.gc f;
    public final /* synthetic */ org.telegram.ui.bd h;

    public pp(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.f fVar, long j10, org.telegram.ui.gc gcVar, org.telegram.ui.bd bdVar) {
        this.a = tiVar;
        this.b = tL_premium_boostsStatus;
        this.c = u6Var;
        this.d = fVar;
        this.e = j10;
        this.f = gcVar;
        this.h = bdVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void A(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void T(Object obj) {
        op opVar = new op(obj, null, true, 1);
        opVar.W1 = this.b;
        opVar.a.a = this.c;
        opVar.q1 = this.d;
        opVar.d1(this.e);
        opVar.J1 = new np(this.a, this.f, 1);
        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
        p2Var.a = true;
        p2Var.e = true;
        this.h.showAsSheet(opVar, p2Var);
    }

    @Override // org.telegram.ui.Components.ri
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
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
                op opVar = new op(new ei1(file, file, ""), loadBitmap, false, 0);
                opVar.W1 = this.b;
                opVar.a.a = this.c;
                opVar.q1 = this.d;
                opVar.G1 = false;
                opVar.F1 = false;
                opVar.o1 = 0.2f;
                opVar.d1(this.e);
                opVar.J1 = new np(tiVar, this.f, 0);
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                p2Var.e = true;
                this.h.showAsSheet(opVar, p2Var);
                tiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean x0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void R() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void Y(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
