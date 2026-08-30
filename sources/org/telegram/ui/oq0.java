package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ ju0 c;

    public /* synthetic */ oq0(PhotoViewer photoViewer, ju0 ju0Var, int i10) {
        this.a = i10;
        this.b = photoViewer;
        this.c = ju0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.e0.setImageBitmap(null);
                ju0 ju0Var = this.c;
                if (ju0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = ju0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.d0.getParent() != null) {
                        ((WindowManager) photoViewer.y.getSystemService("window")).removeView(photoViewer.d0);
                        photoViewer.V1();
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.m4 = null;
                int i10 = 0;
                photoViewer2.b0.setLayerType(0, null);
                photoViewer2.k4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.s7 && !photoViewer2.t7 && (arrayList = photoViewer2.d7) != null) {
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
                photoViewer3.m4 = null;
                bu0 bu0Var = photoViewer3.b0;
                if (bu0Var != null) {
                    int i11 = 0;
                    bu0Var.setLayerType(0, null);
                    photoViewer3.k4 = 0;
                    photoViewer3.X1(this.c);
                    photoViewer3.b0.setScaleX(1.0f);
                    photoViewer3.b0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.s7 && !photoViewer3.t7 && (arrayList2 = photoViewer3.d7) != null) {
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
