// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class me4 extends i98 {
    public final /* synthetic */ af4 a;

    public me4(af4 af4Var) {
        this.a = af4Var;
    }

    @Override // i98, o98
    public final CharSequence B(int i) {
        return k96.s(((k27) this.a.f.get(i)).k.date, false);
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (k27Var != null) {
            fu fuVar = this.a.b;
            int childCount = fuVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = fuVar.getChildAt(i2);
                int[] iArr = new int[2];
                if (childAt instanceof rfa) {
                    rfa rfaVar = (rfa) childAt;
                    photoImage = null;
                    int i3 = 0;
                    while (i3 < 6) {
                        k27 k27Var2 = i3 >= rfaVar.e ? null : rfaVar.b[i3];
                        if (k27Var2 == null) {
                            break;
                        }
                        if (k27Var2.e1() == k27Var.e1()) {
                            be0 be0Var = i3 >= rfaVar.e ? null : rfaVar.a[i3].a;
                            ImageReceiver imageReceiver = be0Var.getImageReceiver();
                            be0Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i3++;
                    }
                } else if (childAt instanceof iba) {
                    iba ibaVar = (iba) childAt;
                    if (ibaVar.getMessage().e1() == k27Var.e1()) {
                        be0 imageView = ibaVar.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof bw2) {
                        bw2 bw2Var = (bw2) childAt;
                        k27 k27Var3 = (k27) bw2Var.getParentObject();
                        if (k27Var3 != null && k27Var3.e1() == k27Var.e1()) {
                            photoImage = bw2Var.getPhotoImage();
                            bw2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    p98 p98Var = new p98();
                    p98Var.b = iArr[0];
                    p98Var.c = iArr[1];
                    p98Var.d = fuVar;
                    fuVar.getLocationInWindow(iArr);
                    p98Var.n = -iArr[1];
                    p98Var.a = photoImage;
                    p98Var.o = false;
                    p98Var.h = photoImage.z();
                    p98Var.e = p98Var.a.p();
                    p98Var.d.getLocationInWindow(iArr);
                    p98Var.j = 0;
                    if (PhotoViewer.O0(k27Var) && (pinnedHeader = fuVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof iba ? gl.L(8.0f) : 0) - p98Var.c;
                        if (L > childAt.getHeight()) {
                            fuVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return p98Var;
                        }
                        int height = p98Var.c - fuVar.getHeight();
                        if (childAt instanceof iba) {
                            height -= gl.L(8.0f);
                        }
                        if (height >= 0) {
                            fuVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return p98Var;
                }
            }
        }
        return null;
    }

    @Override // i98, o98
    public final boolean Z() {
        af4 af4Var = this.a;
        if (af4Var.O) {
            return true;
        }
        af4Var.h(af4Var.F, af4Var.G, af4Var.I, af4Var.H, af4Var.E, af4Var.K, af4Var.x, false);
        return true;
    }

    @Override // i98, o98
    public final CharSequence c0(int i) {
        return af4.c((k27) this.a.f.get(i), true, 0, null);
    }

    @Override // i98, o98
    public final int x() {
        return this.a.P;
    }
}
