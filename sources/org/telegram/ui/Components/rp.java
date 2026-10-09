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
import org.telegram.ui.jj1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rp implements wi {
    public final /* synthetic */ yi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.fc f;
    public final /* synthetic */ org.telegram.ui.bd h;

    public rp(yi yiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.fc fcVar, org.telegram.ui.bd bdVar) {
        this.a = yiVar;
        this.b = tL_premium_boostsStatus;
        this.c = e6Var;
        this.d = gVar;
        this.e = j3;
        this.f = fcVar;
        this.h = bdVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
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
                qp qpVar = new qp(new jj1(file, file, ""), loadBitmap, false, 0);
                qpVar.V1 = this.b;
                qpVar.a.a = this.c;
                qpVar.p1 = this.d;
                qpVar.F1 = false;
                qpVar.E1 = false;
                qpVar.n1 = 0.2f;
                qpVar.c1(this.e);
                qpVar.I1 = new pp(yiVar, this.f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                l2Var.e = true;
                this.h.showAsSheet(qpVar, l2Var);
                yiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean Y1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public final void a1(Object obj) {
        qp qpVar = new qp(obj, null, true, 1);
        qpVar.V1 = this.b;
        qpVar.a.a = this.c;
        qpVar.p1 = this.d;
        qpVar.c1(this.e);
        qpVar.I1 = new pp(this.a, this.f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        l2Var.e = true;
        this.h.showAsSheet(qpVar, l2Var);
    }

    @Override // org.telegram.ui.Components.wi
    public final void f0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
