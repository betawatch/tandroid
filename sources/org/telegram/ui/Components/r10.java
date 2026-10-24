package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r10 implements org.telegram.ui.ActionBar.q0, ne.k, org.telegram.ui.ActionBar.z1, aw0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ r10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // org.telegram.ui.Components.aw0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.W0;
        this.a.k(sharingLocationInfo);
    }

    @Override // ne.k
    public void e(ne.l lVar) {
        FragmentContextView fragmentContextView = this.a;
        ne.l lVar2 = fragmentContextView.U0;
        float f7 = 1.0f - lVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f7);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f7));
        Iterator it = lVar2.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            mh.c cVar = ((d20) obj).b;
            cVar.setAlpha(gVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (!(o2Var instanceof org.telegram.ui.ey)) {
            LocationController.getInstance(o2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
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

    @Override // ne.k
    public /* synthetic */ void a() {
    }
}
