package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u00 implements org.telegram.ui.ActionBar.s0, td.i, org.telegram.ui.ActionBar.b2, hu0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ u00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // td.i
    public void c(td.j jVar) {
        FragmentContextView fragmentContextView = this.a;
        td.j jVar2 = fragmentContextView.G0;
        float f10 = 1.0f - jVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            tg.d dVar = ((f10) obj).b;
            dVar.setAlpha(eVar.c());
            dVar.setScaleX(lerp);
            dVar.setScaleY(lerp);
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        float[] fArr = FragmentContextView.I0;
        this.a.k(sharingLocationInfo);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (!(o2Var instanceof org.telegram.ui.dy)) {
            LocationController.getInstance(o2Var.getCurrentAccount()).removeSharingLocation(fragmentContextView.n.a());
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            LocationController.getInstance(i10).removeAllLocationSharings();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        float[] fArr = FragmentContextView.I0;
        if (i9 >= 0) {
            float[] fArr2 = FragmentContextView.I0;
            if (i9 >= 6) {
                return;
            }
            MediaController mediaController = MediaController.getInstance();
            FragmentContextView fragmentContextView = this.a;
            float playbackSpeed = mediaController.getPlaybackSpeed(fragmentContextView.R);
            float f10 = fArr2[i9];
            MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
            if (playbackSpeed != f10) {
                fragmentContextView.l(playbackSpeed, f10, false);
            }
        }
    }

    @Override // td.i
    public /* synthetic */ void b() {
    }
}
