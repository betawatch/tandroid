package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ cv0 c;

    public /* synthetic */ kr0(PhotoViewer photoViewer, cv0 cv0Var, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = cv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.h0.setImageBitmap(null);
                cv0 cv0Var = this.c;
                if (cv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = cv0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.g0.getParent() != null) {
                        ((WindowManager) photoViewer.y.getSystemService("window")).removeView(photoViewer.g0);
                        photoViewer.V1();
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.p4 = null;
                int i10 = 0;
                photoViewer2.e0.setLayerType(0, null);
                photoViewer2.n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.v7 && !photoViewer2.w7 && (arrayList = photoViewer2.g7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.p4 = null;
                uu0 uu0Var = photoViewer3.e0;
                if (uu0Var != null) {
                    int i11 = 0;
                    uu0Var.setLayerType(0, null);
                    photoViewer3.n4 = 0;
                    photoViewer3.X1(this.c);
                    photoViewer3.e0.setScaleX(1.0f);
                    photoViewer3.e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.v7 && !photoViewer3.w7 && (arrayList2 = photoViewer3.g7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof MediaController.PhotoEntry) {
                                ((MediaController.PhotoEntry) obj2).deleteAll();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
