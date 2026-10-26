package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ Object a;

    public /* synthetic */ w81(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        y81 y81Var;
        int i10;
        int i11;
        double ceil;
        z81 z81Var = (z81) this.a;
        ImageReceiver imageReceiver2 = z81Var.Q;
        if (z10) {
            if (z81Var.N == null && z81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.vt0 vt0Var = z81Var.N;
            if (vt0Var != null) {
                int i12 = (int) z81Var.O;
                ArrayList arrayList = vt0Var.v;
                int indexOf = arrayList.indexOf(vt0Var.c(i12));
                if (indexOf == -1) {
                    z13 = true;
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = vt0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    if (videoDuration <= 100) {
                        z13 = true;
                        ceil = Math.ceil(videoDuration);
                    } else {
                        z13 = true;
                        ceil = videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f);
                    }
                    i11 = Math.min(25, (((int) ceil) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    z13 = true;
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.vt0 vt0Var2 = z81Var.N;
                int i13 = (int) z81Var.O;
                int videoDuration2 = vt0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                z81Var.R = (int) ((min % 5) * bitmapWidth);
                z81Var.S = (int) ((min / 5) * bitmapHeight);
                z81Var.T = (int) bitmapWidth;
                z81Var.U = (int) bitmapHeight;
            } else {
                z13 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= z81Var.d0.size()) {
                        y81Var = null;
                        break;
                    }
                    y81Var = (y81) z81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : y81Var.a;
                    double d10 = i14 == z81Var.d0.size() + (-1) ? 9.9999999E7d : ((y81) z81Var.d0.get(i14 + 1)).a;
                    double d11 = z81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (y81Var == null) {
                    return;
                }
                z81Var.R = y81Var.b;
                z81Var.S = y81Var.c;
                z81Var.T = z81Var.b0;
                z81Var.U = z81Var.c0;
            }
            z81Var.P = z13;
            float f7 = z81Var.T / z81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = z81Var.getLayoutParams();
            if (z81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            z81Var.setVisibility(0);
            z81Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }
}
