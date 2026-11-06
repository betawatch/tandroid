package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                l71 l71Var = vtVar.j1;
                if (vtVar.w1 != null && l71Var.getVisibility() == 0 && (activity = vtVar.p1) != null && l71Var.T && vtVar.D1) {
                    if (i7 >= 240 && i7 <= 300) {
                        vtVar.E1 = true;
                        break;
                    } else if (vtVar.E1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(vtVar.C1);
                            vtVar.D1 = false;
                            vtVar.E1 = false;
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
