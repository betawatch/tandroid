// default package

import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ fd8 c;

    public /* synthetic */ ba8(PhotoViewer photoViewer, fd8 fd8Var, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = fd8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sga sgaVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        int i = 0;
        fd8 fd8Var = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.i0.setImageBitmap(null);
                if (fd8Var != null && !hl.O1() && (sgaVar = fd8Var.m) != null) {
                    sgaVar.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.a1();
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.o4 = null;
                photoViewer.f0.setLayerType(0, null);
                photoViewer.m4 = (byte) 0;
                photoViewer.H0();
                photoViewer.c1(fd8Var);
                MediaController.z().J0();
                if (photoViewer.A7 && !photoViewer.B7 && (arrayList = photoViewer.f7) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (obj instanceof no6) {
                            ((no6) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.o4 = null;
                ad8 ad8Var = photoViewer.f0;
                if (ad8Var != null) {
                    ad8Var.setLayerType(0, null);
                    photoViewer.m4 = (byte) 0;
                    photoViewer.c1(fd8Var);
                    photoViewer.f0.setScaleX(1.0f);
                    photoViewer.f0.setScaleY(1.0f);
                    MediaController.z().J0();
                    if (photoViewer.A7 && !photoViewer.B7 && (arrayList2 = photoViewer.f7) != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof no6) {
                                ((no6) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
