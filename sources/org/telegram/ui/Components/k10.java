package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k10 implements org.telegram.ui.ActionBar.s0, xd.i, org.telegram.ui.ActionBar.c2, bv0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ k10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // org.telegram.ui.Components.bv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.J0;
        this.a.k(sharingLocationInfo);
    }

    @Override // xd.i
    public void e(xd.j jVar) {
        FragmentContextView fragmentContextView = this.a;
        xd.j jVar2 = fragmentContextView.H0;
        float f10 = 1.0f - jVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            zg.c cVar = ((v10) obj).b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(lerp);
            cVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        float[] fArr = FragmentContextView.J0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.J0;
            if (i10 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.S);
            float f10 = fArr2[i10];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.S, f10);
            if (playbackSpeed != f10) {
                fragmentContextView.l(playbackSpeed, f10, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        if (!(p2Var instanceof org.telegram.ui.py)) {
            LocationController.getInstance(p2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // xd.i
    public /* synthetic */ void a() {
    }
}
