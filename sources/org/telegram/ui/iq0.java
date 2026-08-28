package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ bu0 c;

    public /* synthetic */ iq0(PhotoViewer photoViewer, bu0 bu0Var, int i9) {
        this.a = i9;
        this.b = photoViewer;
        this.c = bu0Var;
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
                bu0 bu0Var = this.c;
                if (bu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = bu0Var.m) != null) {
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
                int i9 = 0;
                photoViewer2.a0.setLayerType(0, null);
                photoViewer2.j4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.r7 && !photoViewer2.s7 && (arrayList = photoViewer2.c7) != null) {
                    int size = arrayList.size();
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
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
                tt0 tt0Var = photoViewer3.a0;
                if (tt0Var != null) {
                    int i10 = 0;
                    tt0Var.setLayerType(0, null);
                    photoViewer3.j4 = 0;
                    photoViewer3.X1(this.c);
                    photoViewer3.a0.setScaleX(1.0f);
                    photoViewer3.a0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.r7 && !photoViewer3.s7 && (arrayList2 = photoViewer3.c7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
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
