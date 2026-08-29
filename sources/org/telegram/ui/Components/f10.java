package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f10 implements org.telegram.ui.ActionBar.s0, vd.j, org.telegram.ui.ActionBar.b2, tu0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ f10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // vd.j
    public void b(vd.k kVar) {
        FragmentContextView fragmentContextView = this.a;
        vd.k kVar2 = fragmentContextView.G0;
        float f9 = 1.0f - kVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f9);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f9));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f9));
        Iterator it = kVar2.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            float c3 = fVar.c();
            Object obj = fVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            wg.c cVar = ((q10) obj).b;
            cVar.setAlpha(fVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.Components.tu0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.I0;
        this.a.k(sharingLocationInfo);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (!(o2Var instanceof org.telegram.ui.fy)) {
            LocationController.getInstance(o2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        float[] fArr = FragmentContextView.I0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.I0;
            if (i10 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.R);
            float f9 = fArr2[i10];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f9);
            if (playbackSpeed != f9) {
                fragmentContextView.l(playbackSpeed, f9, false);
            }
        }
    }

    @Override // vd.j
    public /* synthetic */ void a() {
    }
}
