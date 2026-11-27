// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lga extends yc8 {
    public final /* synthetic */ eja a;

    public lga(eja ejaVar) {
        this.a = ejaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116 A[SYNTHETIC] */
    @Override // yc8, ed8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        int i2;
        int i3;
        cfa cfaVar;
        r47 message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        eja ejaVar = this.a;
        tha thaVar = ejaVar.G1;
        xga xgaVar = ejaVar.U0;
        zha[] zhaVarArr = ejaVar.n0;
        if (r47Var != null) {
            int i4 = 0;
            zha zhaVar = zhaVarArr[0];
            int i5 = zhaVar.F;
            if (i5 == 0 || i5 == 1 || i5 == 3 || i5 == 5) {
                jga jgaVar = zhaVar.h;
                int childCount = jgaVar.getChildCount();
                int i6 = -1;
                int i7 = 0;
                int i8 = -1;
                int i9 = -1;
                while (i7 < childCount) {
                    View childAt = jgaVar.getChildAt(i7);
                    int measuredHeight = zhaVarArr[i4].h.getMeasuredHeight();
                    View view = (View) ejaVar.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (ejaVar.getY() + ejaVar.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= ejaVar.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int S = RecyclerView.S(childAt);
                        if (S < i8 || i8 == i6) {
                            i8 = S;
                        }
                        if (S > i9 || i9 == i6) {
                            i9 = S;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof jja) {
                            jja jjaVar = (jja) childAt;
                            linkImageView = jjaVar.c;
                            r47 messageObject = jjaVar.getMessageObject();
                            if (messageObject != null) {
                                i3 = i4;
                                if (messageObject.e1() == r47Var.e1()) {
                                    jjaVar.getLocationInWindow(iArr);
                                    iArr[i3] = Math.round(linkImageView.L0) + iArr[i3];
                                    iArr[1] = Math.round(linkImageView.M0) + iArr[1];
                                    if (linkImageView != null) {
                                        fd8 fd8Var = new fd8();
                                        fd8Var.b = iArr[i3];
                                        fd8Var.c = iArr[1];
                                        fd8Var.d = jgaVar;
                                        zha zhaVar2 = zhaVarArr[i3];
                                        fd8Var.m = zhaVar2.y;
                                        zhaVar2.h.getLocationInWindow(iArr);
                                        fd8Var.n = -iArr[1];
                                        fd8Var.a = linkImageView;
                                        fd8Var.o = true;
                                        fd8Var.h = linkImageView.z();
                                        fd8Var.e = fd8Var.a.p();
                                        fd8Var.d.getLocationInWindow(iArr);
                                        int i10 = i3;
                                        fd8Var.j = i10;
                                        fd8Var.q = ejaVar.w1[i10].m;
                                        if (xgaVar != null && xgaVar.getVisibility() == 0) {
                                            fd8Var.j = hl.L(36.0f) + fd8Var.j;
                                        }
                                        if (PhotoViewer.P0(r47Var) && (pinnedHeader = jgaVar.getPinnedHeader()) != null) {
                                            int height = (xgaVar == null || xgaVar.getVisibility() != 0) ? 0 : xgaVar.getHeight() - hl.L(2.5f);
                                            boolean z3 = childAt instanceof zea;
                                            if (z3) {
                                                height += hl.L(8.0f);
                                            }
                                            int i11 = height - fd8Var.c;
                                            if (i11 > childAt.getHeight()) {
                                                jgaVar.scrollBy(0, -(pinnedHeader.getHeight() + i11));
                                                return fd8Var;
                                            }
                                            int height2 = fd8Var.c - jgaVar.getHeight();
                                            if (z3) {
                                                height2 -= hl.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                jgaVar.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return fd8Var;
                                    }
                                    i2 = i3;
                                    i7++;
                                    i4 = i2;
                                    i6 = -1;
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i3 = i4;
                            if (childAt instanceof zea) {
                                zea zeaVar = (zea) childAt;
                                if (zeaVar.getMessage().e1() == r47Var.e1()) {
                                    de0 imageView = zeaVar.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                }
                                linkImageView = imageReceiver;
                            } else {
                                if (childAt instanceof vw2) {
                                    vw2 vw2Var = (vw2) childAt;
                                    r47 r47Var2 = (r47) vw2Var.getParentObject();
                                    if (r47Var2 != null && r47Var2.e1() == r47Var.e1()) {
                                        photoImage = vw2Var.getPhotoImage();
                                        vw2Var.getLocationInWindow(iArr);
                                        linkImageView = photoImage;
                                    }
                                } else if ((childAt instanceof cfa) && (message = (cfaVar = (cfa) childAt).getMessage()) != null && message.e1() == r47Var.e1()) {
                                    linkImageView = cfaVar.getLinkImageView();
                                    cfaVar.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                            }
                        }
                    }
                    i2 = i4;
                    i7++;
                    i4 = i2;
                    i6 = -1;
                }
                int i12 = i4;
                if (zhaVarArr[i12].F != 0 || i8 < 0 || i9 < 0) {
                    return null;
                }
                int L = ejaVar.K.L(i);
                if (L <= i8) {
                    zhaVarArr[i12].x.g1(L, i12);
                    thaVar.I();
                    return null;
                }
                if (L < i9 || i9 < 0) {
                    return null;
                }
                zhaVarArr[i12].x.h1(L, i12, true);
                thaVar.I();
                return null;
            }
        }
        return null;
    }
}
