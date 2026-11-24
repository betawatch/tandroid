// default package

import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n68 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ p98 c;

    public /* synthetic */ n68(PhotoViewer photoViewer, p98 p98Var, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = p98Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bda bdaVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        int i = 0;
        p98 p98Var = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.i0.setImageBitmap(null);
                if (p98Var != null && !gl.O1() && (bdaVar = p98Var.m) != null) {
                    bdaVar.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.Z0();
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.p4 = null;
                photoViewer.f0.setLayerType(0, null);
                photoViewer.n4 = (byte) 0;
                photoViewer.G0();
                photoViewer.b1(p98Var);
                MediaController.w().E0();
                if (photoViewer.B7 && !photoViewer.C7 && (arrayList = photoViewer.g7) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (obj instanceof jm6) {
                            ((jm6) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer.p4 = null;
                k98 k98Var = photoViewer.f0;
                if (k98Var != null) {
                    k98Var.setLayerType(0, null);
                    photoViewer.n4 = (byte) 0;
                    photoViewer.b1(p98Var);
                    photoViewer.f0.setScaleX(1.0f);
                    photoViewer.f0.setScaleY(1.0f);
                    MediaController.w().E0();
                    if (photoViewer.B7 && !photoViewer.C7 && (arrayList2 = photoViewer.g7) != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof jm6) {
                                ((jm6) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
