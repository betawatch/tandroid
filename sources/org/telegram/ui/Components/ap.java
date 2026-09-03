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
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ap implements ki {
    public final /* synthetic */ mi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ org.telegram.ui.h d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.w3 f;
    public final /* synthetic */ org.telegram.ui.bd h;

    public ap(mi miVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.w3 w3Var, org.telegram.ui.bd bdVar) {
        this.a = miVar;
        this.b = tL_premium_boostsStatus;
        this.c = g6Var;
        this.d = hVar;
        this.e = j10;
        this.f = w3Var;
        this.h = bdVar;
    }

    @Override // org.telegram.ui.Components.ki
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ki
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mi miVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = miVar.g0.getSelectedPhotos();
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
                zo zoVar = new zo(new wi1(file, file, ""), loadBitmap, false, 0);
                zoVar.S1 = this.b;
                zoVar.a.a = this.c;
                zoVar.m1 = this.d;
                zoVar.C1 = false;
                zoVar.B1 = false;
                zoVar.k1 = 0.2f;
                zoVar.c1(this.e);
                zoVar.F1 = new yo(miVar, this.f, 0);
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                n2Var.e = true;
                this.h.showAsSheet(zoVar, n2Var);
                miVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void Z0(Object obj) {
        zo zoVar = new zo(obj, null, true, 1);
        zoVar.S1 = this.b;
        zoVar.a.a = this.c;
        zoVar.m1 = this.d;
        zoVar.c1(this.e);
        zoVar.F1 = new yo(this.a, this.f, 1);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        n2Var.e = true;
        this.h.showAsSheet(zoVar, n2Var);
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean b2() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
