package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k10 implements org.telegram.ui.ActionBar.q0, le.l, org.telegram.ui.ActionBar.z1, mv0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ k10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // org.telegram.ui.Components.mv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.O0;
        this.a.k(sharingLocationInfo);
    }

    @Override // le.l
    public void c(le.m mVar) {
        FragmentContextView fragmentContextView = this.a;
        le.m mVar2 = fragmentContextView.M0;
        float f7 = 1.0f - mVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = mVar2.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            lh.c cVar = ((v10) obj).b;
            cVar.setAlpha(hVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (!(m2Var instanceof org.telegram.ui.qy)) {
            LocationController.getInstance(m2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
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

    @Override // le.l
    public /* synthetic */ void a() {
    }
}
