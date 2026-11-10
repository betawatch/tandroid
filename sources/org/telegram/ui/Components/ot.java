package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ot extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot(int i7, Context context, Object obj) {
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
                vt vtVar = (vt) this.b;
                l71 l71Var = vtVar.m1;
                if (vtVar.z1 != null && l71Var.getVisibility() == 0 && (activity = vtVar.s1) != null && l71Var.T && vtVar.G1) {
                    if (i7 >= 240 && i7 <= 300) {
                        vtVar.H1 = true;
                        break;
                    } else if (vtVar.H1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(vtVar.F1);
                            vtVar.G1 = false;
                            vtVar.H1 = false;
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
