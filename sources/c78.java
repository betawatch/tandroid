// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c78 implements u48 {
    public final /* synthetic */ PhotoViewer a;

    public /* synthetic */ c78(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a() {
        u3b u3bVar;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.o7 == null) {
            return;
        }
        mbc mbcVar = photoViewer.k7;
        boolean z = false;
        boolean z2 = (mbcVar == null || (u3bVar = mbcVar.b) == null || u3bVar.f == null) ? false : true;
        if (z2 && mbcVar.d) {
            z = true;
        }
        photoViewer.p0.Q(kk7.J1, z2);
        photoViewer.p7.a(z, true);
        photoViewer.o7.setSubtext(k96.M0(z ? 2131743347 : 2131743348, null));
    }

    public final void b(boolean z) {
        boolean z2 = !z;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W0.isClickable() != z2) {
            photoViewer.W0.setClickable(z2);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            photoViewer.W0.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(s33.f).setDuration(150L).withEndAction(new k08((byte) 1, (Object) photoViewer, z2));
        }
    }

    public final void c() {
        PhotoViewer photoViewer = this.a;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null) {
            return;
        }
        lbcVar.o0((long) (lbcVar.U() * photoViewer.B8));
        photoViewer.G2.f0();
        photoViewer.X7.setProgress(photoViewer.B8);
        photoViewer.n();
        oq7 oq7Var = new oq7(this, (byte) 29);
        photoViewer.I2 = oq7Var;
        gl.d3(oq7Var, 860L);
    }
}
