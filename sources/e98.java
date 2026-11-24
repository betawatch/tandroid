// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e98 implements w68 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ e98(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a() {
        v5b v5bVar;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.o7 == null) {
            return;
        }
        odc odcVar = photoViewer.k7;
        boolean z = false;
        boolean z2 = (odcVar == null || (v5bVar = odcVar.b) == null || v5bVar.f == null) ? false : true;
        if (z2 && odcVar.d) {
            z = true;
        }
        photoViewer.p0.Q(nm7.J1, z2);
        photoViewer.p7.a(z, true);
        photoViewer.o7.setSubtext(jb6.M0(z ? 2131743273 : 2131743274, null));
    }

    public final void b(boolean z) {
        boolean z2 = !z;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z2) {
            photoViewer.W0.setClickable(z2);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            photoViewer.W0.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(d53.f).setDuration(150L).withEndAction(new n28((byte) 1, (Object) photoViewer, z2));
        }
    }

    public final void c() {
        PhotoViewer photoViewer = this.a;
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null) {
            return;
        }
        ndcVar.o0((long) (ndcVar.U() * photoViewer.B8));
        photoViewer.G2.f0();
        photoViewer.X7.setProgress(photoViewer.B8);
        photoViewer.m();
        q78 q78Var = new q78(this, (byte) 6);
        photoViewer.I2 = q78Var;
        gm.d3(q78Var, 860L);
    }
}
