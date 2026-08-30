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
import org.telegram.ui.ni1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yo implements ji {
    public final /* synthetic */ li a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.h d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.w3 f;
    public final /* synthetic */ org.telegram.ui.bd h;

    public yo(li liVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.w3 w3Var, org.telegram.ui.bd bdVar) {
        this.a = liVar;
        this.b = tL_premium_boostsStatus;
        this.c = f6Var;
        this.d = hVar;
        this.e = j10;
        this.f = w3Var;
        this.h = bdVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void D(Object obj) {
        xo xoVar = new xo(obj, null, true, 1);
        xoVar.S1 = this.b;
        xoVar.a.a = this.c;
        xoVar.m1 = this.d;
        xoVar.c1(this.e);
        xoVar.F1 = new wo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        n2Var.e = true;
        this.h.showAsSheet(xoVar, n2Var);
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
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
                xo xoVar = new xo(new ni1(file, file, ""), loadBitmap, false, 0);
                xoVar.S1 = this.b;
                xoVar.a.a = this.c;
                xoVar.m1 = this.d;
                xoVar.C1 = false;
                xoVar.B1 = false;
                xoVar.k1 = 0.2f;
                xoVar.c1(this.e);
                xoVar.F1 = new wo(liVar, this.f, 0);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                n2Var.e = true;
                this.h.showAsSheet(xoVar, n2Var);
                liVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean V() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void C() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void G(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
