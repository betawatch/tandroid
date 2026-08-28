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
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ro implements ii {
    public final /* synthetic */ ki a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.w3 f;
    public final /* synthetic */ org.telegram.ui.xc h;

    public ro(ki kiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.w3 w3Var, org.telegram.ui.xc xcVar) {
        this.a = kiVar;
        this.b = tL_premium_boostsStatus;
        this.c = b6Var;
        this.d = gVar;
        this.e = j10;
        this.f = w3Var;
        this.h = xcVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final void A(Object obj) {
        qo qoVar = new qo(obj, null, true, 1);
        qoVar.R1 = this.b;
        qoVar.a.a = this.c;
        qoVar.l1 = this.d;
        qoVar.c1(this.e);
        qoVar.E1 = new po(this.a, this.f, 1);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        m2Var.e = true;
        this.h.showAsSheet(qoVar, m2Var);
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ki kiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = kiVar.f0.getSelectedPhotos();
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
                qo qoVar = new qo(new yh1(file, file, ""), loadBitmap, false, 0);
                qoVar.R1 = this.b;
                qoVar.a.a = this.c;
                qoVar.l1 = this.d;
                qoVar.B1 = false;
                qoVar.A1 = false;
                qoVar.j1 = 0.2f;
                qoVar.c1(this.e);
                qoVar.E1 = new po(kiVar, this.f, 0);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                m2Var.e = true;
                this.h.showAsSheet(qoVar, m2Var);
                kiVar.dismiss();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean t0() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
