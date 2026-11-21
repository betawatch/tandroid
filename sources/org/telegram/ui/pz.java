package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class pz extends oq0 {
    public final /* synthetic */ c00 a;

    public pz(c00 c00Var) {
        this.a = c00Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final CharSequence C(int i7) {
        return org.telegram.messenger.gd.s(((org.telegram.messenger.fj) this.a.f.get(i7)).k.date, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (fjVar != null) {
            et etVar = this.a.b;
            int childCount = etVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = etVar.getChildAt(i10);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.q7) {
                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                    photoImage = null;
                    int i11 = 0;
                    while (i11 < 6) {
                        org.telegram.messenger.fj fjVar2 = i11 >= q7Var.e ? null : q7Var.b[i11];
                        if (fjVar2 == null) {
                            break;
                        }
                        if (fjVar2.e1() == fjVar.e1()) {
                            org.telegram.ui.Components.q9 q9Var = i11 >= q7Var.e ? null : q7Var.a[i11].a;
                            ImageReceiver imageReceiver = q9Var.getImageReceiver();
                            q9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i11++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().e1() == fjVar.e1()) {
                        org.telegram.ui.Components.q9 imageView = i7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                        org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) i2Var.getParentObject();
                        if (fjVar3 != null && fjVar3.e1() == fjVar.e1()) {
                            photoImage = i2Var.getPhotoImage();
                            i2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.b = iArr[0];
                    wq0Var.c = iArr[1];
                    wq0Var.d = etVar;
                    etVar.getLocationInWindow(iArr);
                    wq0Var.n = -iArr[1];
                    wq0Var.a = photoImage;
                    wq0Var.o = false;
                    wq0Var.h = photoImage.E();
                    wq0Var.e = wq0Var.a.p();
                    wq0Var.d.getLocationInWindow(iArr);
                    wq0Var.j = 0;
                    if (PhotoViewer.L1(fjVar) && (pinnedHeader = etVar.getPinnedHeader()) != null) {
                        int L = (childAt instanceof org.telegram.ui.Cells.i7 ? org.telegram.messenger.g0.L(8.0f) : 0) - wq0Var.c;
                        if (L > childAt.getHeight()) {
                            etVar.scrollBy(0, -(pinnedHeader.getHeight() + L));
                            return wq0Var;
                        }
                        int height = wq0Var.c - etVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            etVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return wq0Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean Z() {
        c00 c00Var = this.a;
        if (c00Var.O) {
            return true;
        }
        c00Var.h(c00Var.F, c00Var.G, c00Var.I, c00Var.H, c00Var.E, c00Var.K, c00Var.x, false);
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final CharSequence c0(int i7) {
        return c00.d((org.telegram.messenger.fj) this.a.f.get(i7), true, 0, null);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int y() {
        return this.a.P;
    }
}
