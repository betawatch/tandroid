// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kg4 extends yc8 {
    public final /* synthetic */ yg4 a;

    public kg4(yg4 yg4Var) {
        this.a = yg4Var;
    }

    @Override // yc8, ed8
    public final CharSequence B(int i) {
        return ob6.s(((r47) this.a.f.get(i)).k.date, false);
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (r47Var != null) {
            gu guVar = this.a.b;
            int childCount = guVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = guVar.getChildAt(i2);
                int[] iArr = new int[2];
                if (childAt instanceof kja) {
                    kja kjaVar = (kja) childAt;
                    photoImage = null;
                    int i3 = 0;
                    while (i3 < 6) {
                        r47 r47Var2 = i3 >= kjaVar.e ? null : kjaVar.b[i3];
                        if (r47Var2 == null) {
                            break;
                        }
                        if (r47Var2.e1() == r47Var.e1()) {
                            de0 de0Var = i3 >= kjaVar.e ? null : kjaVar.a[i3].a;
                            ImageReceiver imageReceiver = de0Var.getImageReceiver();
                            de0Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i3++;
                    }
                } else if (childAt instanceof zea) {
                    zea zeaVar = (zea) childAt;
                    if (zeaVar.getMessage().e1() == r47Var.e1()) {
                        de0 imageView = zeaVar.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof vw2) {
                        vw2 vw2Var = (vw2) childAt;
                        r47 r47Var3 = (r47) vw2Var.getParentObject();
                        if (r47Var3 != null && r47Var3.e1() == r47Var.e1()) {
                            photoImage = vw2Var.getPhotoImage();
                            vw2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    fd8 fd8Var = new fd8();
                    fd8Var.b = iArr[0];
                    fd8Var.c = iArr[1];
                    fd8Var.d = guVar;
                    guVar.getLocationInWindow(iArr);
                    fd8Var.n = -iArr[1];
                    fd8Var.a = photoImage;
                    fd8Var.o = false;
                    fd8Var.h = photoImage.z();
                    fd8Var.e = fd8Var.a.p();
                    fd8Var.d.getLocationInWindow(iArr);
                    fd8Var.j = 0;
                    if (PhotoViewer.P0(r47Var) && (pinnedHeader = guVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof zea ? hl.L(8.0f) : 0) - fd8Var.c;
                        if (L > childAt.getHeight()) {
                            guVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return fd8Var;
                        }
                        int height = fd8Var.c - guVar.getHeight();
                        if (childAt instanceof zea) {
                            height -= hl.L(8.0f);
                        }
                        if (height >= 0) {
                            guVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return fd8Var;
                }
            }
        }
        return null;
    }

    @Override // yc8, ed8
    public final boolean a0() {
        yg4 yg4Var = this.a;
        if (yg4Var.O) {
            return true;
        }
        yg4Var.h(yg4Var.F, yg4Var.G, yg4Var.I, yg4Var.H, yg4Var.E, yg4Var.K, yg4Var.x, false);
        return true;
    }

    @Override // yc8, ed8
    public final CharSequence d0(int i) {
        return yg4.c((r47) this.a.f.get(i), true, 0, null);
    }

    @Override // yc8, ed8
    public final int x() {
        return this.a.P;
    }
}
