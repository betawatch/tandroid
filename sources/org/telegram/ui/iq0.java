package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ zt0 c;

    public /* synthetic */ iq0(PhotoViewer photoViewer, zt0 zt0Var, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = zt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.d0.setImageBitmap(null);
                zt0 zt0Var = this.c;
                if (zt0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = zt0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.c0.getParent() != null) {
                        ((WindowManager) photoViewer.y.getSystemService("window")).removeView(photoViewer.c0);
                        photoViewer.V1();
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.l4 = null;
                int i10 = 0;
                photoViewer2.a0.setLayerType(0, null);
                photoViewer2.j4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.r7 && !photoViewer2.s7 && (arrayList = photoViewer2.c7) != null) {
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
                photoViewer3.l4 = null;
                rt0 rt0Var = photoViewer3.a0;
                if (rt0Var != null) {
                    int i11 = 0;
                    rt0Var.setLayerType(0, null);
                    photoViewer3.j4 = 0;
                    photoViewer3.X1(this.c);
                    photoViewer3.a0.setScaleX(1.0f);
                    photoViewer3.a0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.r7 && !photoViewer3.s7 && (arrayList2 = photoViewer3.c7) != null) {
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
