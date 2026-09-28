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
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class dp implements ui {
    public final /* synthetic */ wi a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.g d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.ec f;
    public final /* synthetic */ org.telegram.ui.ad h;

    public dp(wi wiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.ec ecVar, org.telegram.ui.ad adVar) {
        this.a = wiVar;
        this.b = tL_premium_boostsStatus;
        this.c = d6Var;
        this.d = gVar;
        this.e = j3;
        this.f = ecVar;
        this.h = adVar;
    }

    @Override // org.telegram.ui.Components.ui
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        wi wiVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = wiVar.j0.getSelectedPhotos();
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
                cp cpVar = new cp(new zi1(file, file, ""), loadBitmap, false, 0);
                cpVar.V1 = this.b;
                cpVar.a.a = this.c;
                cpVar.p1 = this.d;
                cpVar.F1 = false;
                cpVar.E1 = false;
                cpVar.n1 = 0.2f;
                cpVar.c1(this.e);
                cpVar.I1 = new bp(wiVar, this.f, 0);
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                k2Var.a = true;
                k2Var.e = true;
                this.h.showAsSheet(cpVar, k2Var);
                wiVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.ui
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.ui
    public final void U0(Object obj) {
        cp cpVar = new cp(obj, null, true, 1);
        cpVar.V1 = this.b;
        cpVar.a.a = this.c;
        cpVar.p1 = this.d;
        cpVar.c1(this.e);
        cpVar.I1 = new bp(this.a, this.f, 1);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        k2Var.e = true;
        this.h.showAsSheet(cpVar, k2Var);
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final void x0(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
