package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t10 implements org.telegram.ui.ActionBar.r0, oe.k, org.telegram.ui.ActionBar.b2, ew0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ t10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // oe.k
    public void b(oe.l lVar) {
        FragmentContextView fragmentContextView = this.a;
        oe.l lVar2 = fragmentContextView.U0;
        float f7 = 1.0f - lVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            nh.c cVar = ((f20) obj).b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.Components.ew0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.W0;
        this.a.k(sharingLocationInfo);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        float[] fArr = FragmentContextView.W0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i10 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.W);
            float f7 = fArr2[i10];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.W, f7);
            if (playbackSpeed != f7) {
                fragmentContextView.l(playbackSpeed, f7, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
        if (!(r2Var instanceof org.telegram.ui.ey)) {
            LocationController.getInstance(r2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // oe.k
    public /* synthetic */ void a() {
    }
}
