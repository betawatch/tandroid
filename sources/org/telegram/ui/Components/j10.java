package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j10 implements org.telegram.ui.ActionBar.r0, le.k, org.telegram.ui.ActionBar.a2, bv0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ j10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // org.telegram.ui.Components.bv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.O0;
        this.a.k(sharingLocationInfo);
    }

    @Override // le.k
    public void c(le.l lVar) {
        FragmentContextView fragmentContextView = this.a;
        le.l lVar2 = fragmentContextView.M0;
        float f7 = 1.0f - lVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((u10) obj).b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (!(n2Var instanceof org.telegram.ui.uy)) {
            LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        float[] fArr = FragmentContextView.O0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.O0;
            if (i10 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.V);
            float f7 = fArr2[i10];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.V, f7);
            if (playbackSpeed != f7) {
                fragmentContextView.l(playbackSpeed, f7, false);
            }
        }
    }

    @Override // le.k
    public /* synthetic */ void a() {
    }
}
