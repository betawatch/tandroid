package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pt extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        Activity activity;
        fe0 fe0Var;
        Activity activity2;
        int i10;
        switch (this.a) {
            case 0:
                wt wtVar = (wt) this.b;
                l71 l71Var = wtVar.j1;
                if (wtVar.w1 != null && l71Var.getVisibility() == 0 && (activity = wtVar.p1) != null && l71Var.T && wtVar.D1) {
                    if (i7 >= 240 && i7 <= 300) {
                        wtVar.E1 = true;
                        break;
                    } else if (wtVar.E1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(wtVar.C1);
                            wtVar.D1 = false;
                            wtVar.E1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.V3 != null && (fe0Var = photoViewer.y2) != null && fe0Var.getVisibility() == 0 && (activity2 = photoViewer.D) != null && (i10 = photoViewer.X3) != 0) {
                    if (i10 != 1) {
                        if (i7 > 0 && (i7 >= 330 || i7 <= 30)) {
                            photoViewer.Y3 = true;
                            break;
                        } else if (photoViewer.Y3 && i7 >= 240 && i7 <= 300) {
                            activity2.setRequestedOrientation(photoViewer.W3);
                            photoViewer.X3 = 0;
                            photoViewer.Y3 = false;
                            break;
                        }
                    } else if (i7 >= 240 && i7 <= 300) {
                        photoViewer.Y3 = true;
                        break;
                    } else if (photoViewer.Y3 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity2.setRequestedOrientation(photoViewer.W3);
                            photoViewer.X3 = 0;
                            photoViewer.Y3 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
