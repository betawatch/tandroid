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
import org.telegram.ui.xh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class po implements ei {
    public final /* synthetic */ gi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.x3 f;
    public final /* synthetic */ org.telegram.ui.xc h;

    public po(gi giVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.x3 x3Var, org.telegram.ui.xc xcVar) {
        this.a = giVar;
        this.b = tL_premium_boostsStatus;
        this.c = c6Var;
        this.d = gVar;
        this.e = j10;
        this.f = x3Var;
        this.h = xcVar;
    }

    @Override // org.telegram.ui.Components.ei
    public final void I(Object obj) {
        oo ooVar = new oo(obj, null, true, 1);
        ooVar.R1 = this.b;
        ooVar.a.a = this.c;
        ooVar.l1 = this.d;
        ooVar.c1(this.e);
        ooVar.E1 = new no(this.a, this.f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        l2Var.e = true;
        this.h.showAsSheet(ooVar, l2Var);
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean N0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ei
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        gi giVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = giVar.f0.getSelectedPhotos();
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
                oo ooVar = new oo(new xh1(file, file, ""), loadBitmap, false, 0);
                ooVar.R1 = this.b;
                ooVar.a.a = this.c;
                ooVar.l1 = this.d;
                ooVar.B1 = false;
                ooVar.A1 = false;
                ooVar.j1 = 0.2f;
                ooVar.c1(this.e);
                ooVar.E1 = new no(giVar, this.f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                l2Var.e = true;
                this.h.showAsSheet(ooVar, l2Var);
                giVar.dismiss();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void g0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
