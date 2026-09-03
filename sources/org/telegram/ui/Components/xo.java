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
import org.telegram.ui.vi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xo implements ji {
    public final /* synthetic */ li a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.h d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.y3 f;
    public final /* synthetic */ org.telegram.ui.dd h;

    public xo(li liVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.y3 y3Var, org.telegram.ui.dd ddVar) {
        this.a = liVar;
        this.b = tL_premium_boostsStatus;
        this.c = f6Var;
        this.d = hVar;
        this.e = j10;
        this.f = y3Var;
        this.h = ddVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C0(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ji
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = liVar.g0.getSelectedPhotos();
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
                wo woVar = new wo(new vi1(file, file, ""), loadBitmap, false, 0);
                woVar.S1 = this.b;
                woVar.a.a = this.c;
                woVar.m1 = this.d;
                woVar.C1 = false;
                woVar.B1 = false;
                woVar.k1 = 0.2f;
                woVar.c1(this.e);
                woVar.F1 = new vo(liVar, this.f, 0);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                n2Var.e = true;
                this.h.showAsSheet(woVar, n2Var);
                liVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean X1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ji
    public final void Z0(Object obj) {
        wo woVar = new wo(obj, null, true, 1);
        woVar.S1 = this.b;
        woVar.a.a = this.c;
        woVar.m1 = this.d;
        woVar.c1(this.e);
        woVar.F1 = new vo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        n2Var.e = true;
        this.h.showAsSheet(woVar, n2Var);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
