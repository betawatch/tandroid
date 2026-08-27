package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x00 implements org.telegram.ui.ActionBar.r0, ud.i, org.telegram.ui.ActionBar.a2, ku0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ x00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // ud.i
    public void c(ud.j jVar) {
        FragmentContextView fragmentContextView = this.a;
        ud.j jVar2 = fragmentContextView.G0;
        float f10 = 1.0f - jVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            ud.e eVar = (ud.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ug.d dVar = ((i10) obj).b;
            dVar.setAlpha(eVar.c());
            dVar.setScaleX(lerp);
            dVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.Components.ku0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.I0;
        this.a.k(sharingLocationInfo);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (!(n2Var instanceof org.telegram.ui.gy)) {
            LocationController.getInstance(n2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            LocationController.getInstance(i11).removeAllLocationSharings();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        float[] fArr = FragmentContextView.I0;
        if (i10 >= 0) {
            float[] fArr2 = FragmentContextView.I0;
            if (i10 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.R);
            float f10 = fArr2[i10];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
            if (playbackSpeed != f10) {
                fragmentContextView.l(playbackSpeed, f10, false);
            }
        }
    }

    @Override // ud.i
    public /* synthetic */ void b() {
    }
}
