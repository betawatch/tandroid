package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ uq0 c;

    public /* synthetic */ gn0(PhotoViewer photoViewer, uq0 uq0Var, int i7) {
        this.a = i7;
        this.b = photoViewer;
        this.c = uq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.i0.setImageBitmap(null);
                uq0 uq0Var = this.c;
                if (uq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = uq0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.U1();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.p4 = null;
                int i7 = 0;
                photoViewer2.f0.setLayerType(0, null);
                photoViewer2.n4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.c);
                MediaController.B().F0();
                if (photoViewer2.v7 && !photoViewer2.w7 && (arrayList = photoViewer2.g7) != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (obj instanceof org.telegram.messenger.ff) {
                            ((org.telegram.messenger.ff) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.p4 = null;
                oq0 oq0Var = photoViewer3.f0;
                if (oq0Var != null) {
                    int i10 = 0;
                    oq0Var.setLayerType(0, null);
                    photoViewer3.n4 = 0;
                    photoViewer3.W1(this.c);
                    photoViewer3.f0.setScaleX(1.0f);
                    photoViewer3.f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.v7 && !photoViewer3.w7 && (arrayList2 = photoViewer3.g7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.ff) {
                                ((org.telegram.messenger.ff) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
