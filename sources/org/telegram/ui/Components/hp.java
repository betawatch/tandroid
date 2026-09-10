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
import org.telegram.ui.lj1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hp implements wi {
    public final /* synthetic */ yi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.u3 f;
    public final /* synthetic */ org.telegram.ui.cd h;

    public hp(yi yiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.u3 u3Var, org.telegram.ui.cd cdVar) {
        this.a = yiVar;
        this.b = tL_premium_boostsStatus;
        this.c = f6Var;
        this.d = gVar;
        this.e = j3;
        this.f = u3Var;
        this.h = cdVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = yiVar.j0.getSelectedPhotos();
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
                gp gpVar = new gp(new lj1(file, file, ""), loadBitmap, false, 0);
                gpVar.V1 = this.b;
                gpVar.a.a = this.c;
                gpVar.p1 = this.d;
                gpVar.F1 = false;
                gpVar.E1 = false;
                gpVar.n1 = 0.2f;
                gpVar.c1(this.e);
                gpVar.I1 = new fp(yiVar, this.f, 0);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                n2Var.e = true;
                this.h.showAsSheet(gpVar, n2Var);
                yiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean R1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public final void U0(Object obj) {
        gp gpVar = new gp(obj, null, true, 1);
        gpVar.V1 = this.b;
        gpVar.a.a = this.c;
        gpVar.p1 = this.d;
        gpVar.c1(this.e);
        gpVar.I1 = new fp(this.a, this.f, 1);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        n2Var.e = true;
        this.h.showAsSheet(gpVar, n2Var);
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
