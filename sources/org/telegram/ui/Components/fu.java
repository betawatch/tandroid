package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fu extends OrientationEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        af0 af0Var;
        Activity activity2;
        int i11;
        switch (this.a) {
            case 0:
                hu huVar = (hu) this.b;
                n81 n81Var = huVar.j1;
                if (huVar.w1 != null && n81Var.getVisibility() == 0 && (activity = huVar.p1) != null && n81Var.T && huVar.D1) {
                    if (i10 >= 240 && i10 <= 300) {
                        huVar.E1 = true;
                        break;
                    } else if (huVar.E1 && i10 > 0) {
                        if (i10 >= 330 || i10 <= 30) {
                            activity.setRequestedOrientation(huVar.C1);
                            huVar.D1 = false;
                            huVar.E1 = false;
                            break;
                        }
                    }
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.W3 != null && (af0Var = photoViewer.y2) != null && af0Var.getVisibility() == 0 && (activity2 = photoViewer.D) != null && (i11 = photoViewer.Y3) != 0) {
                    if (i11 != 1) {
                        if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                            photoViewer.Z3 = true;
                            break;
                        } else if (photoViewer.Z3 && i10 >= 240 && i10 <= 300) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    } else if (i10 >= 240 && i10 <= 300) {
                        photoViewer.Z3 = true;
                        break;
                    } else if (photoViewer.Z3 && i10 > 0) {
                        if (i10 >= 330 || i10 <= 30) {
                            activity2.setRequestedOrientation(photoViewer.X3);
                            photoViewer.Y3 = 0;
                            photoViewer.Z3 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
