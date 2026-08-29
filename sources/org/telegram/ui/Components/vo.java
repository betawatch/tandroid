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
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vo implements li {
    public final /* synthetic */ ni a;
    public final /* synthetic */ TL_stories.TL_premium_boostsStatus b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.h d;
    public final /* synthetic */ long e;
    public final /* synthetic */ org.telegram.ui.x3 f;
    public final /* synthetic */ org.telegram.ui.vc h;

    public vo(ni niVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.x3 x3Var, org.telegram.ui.vc vcVar) {
        this.a = niVar;
        this.b = tL_premium_boostsStatus;
        this.c = c6Var;
        this.d = hVar;
        this.e = j10;
        this.f = x3Var;
        this.h = vcVar;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = niVar.f0.getSelectedPhotos();
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
                uo uoVar = new uo(new ai1(file, file, ""), loadBitmap, false, 0);
                uoVar.R1 = this.b;
                uoVar.a.a = this.c;
                uoVar.l1 = this.d;
                uoVar.B1 = false;
                uoVar.A1 = false;
                uoVar.j1 = 0.2f;
                uoVar.c1(this.e);
                uoVar.E1 = new to(niVar, this.f, 0);
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                m2Var.e = true;
                this.h.showAsSheet(uoVar, m2Var);
                niVar.dismiss();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean T1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final void U0(Object obj) {
        uo uoVar = new uo(obj, null, true, 1);
        uoVar.R1 = this.b;
        uoVar.a.a = this.c;
        uoVar.l1 = this.d;
        uoVar.c1(this.e);
        uoVar.E1 = new to(this.a, this.f, 1);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        m2Var.e = true;
        this.h.showAsSheet(uoVar, m2Var);
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
