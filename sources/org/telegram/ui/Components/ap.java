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
import org.telegram.ui.hj1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ap implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.t3 f;
    public final /* synthetic */ org.telegram.ui.bd h;

    public ap(vi viVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.t3 t3Var, org.telegram.ui.bd bdVar) {
        this.a = viVar;
        this.b = tL_premium_boostsStatus;
        this.c = f6Var;
        this.d = gVar;
        this.e = j3;
        this.f = t3Var;
        this.h = bdVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean D0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void K(Object obj) {
        zo zoVar = new zo(obj, null, true, 1);
        zoVar.V1 = this.b;
        zoVar.a.a = this.c;
        zoVar.p1 = this.d;
        zoVar.c1(this.e);
        zoVar.I1 = new yo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        l2Var.e = true;
        this.h.showAsSheet(zoVar, l2Var);
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
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
                zo zoVar = new zo(new hj1(file, file, ""), loadBitmap, false, 0);
                zoVar.V1 = this.b;
                zoVar.a.a = this.c;
                zoVar.p1 = this.d;
                zoVar.F1 = false;
                zoVar.E1 = false;
                zoVar.n1 = 0.2f;
                zoVar.c1(this.e);
                zoVar.I1 = new yo(viVar, this.f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                l2Var.e = true;
                this.h.showAsSheet(zoVar, l2Var);
                viVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
