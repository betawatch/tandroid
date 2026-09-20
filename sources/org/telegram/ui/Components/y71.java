package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class y71 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ View a;

    public /* synthetic */ y71(View view) {
        this.a = view;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        a81 a81Var;
        int i10;
        int i11;
        b81 b81Var = (b81) this.a;
        ImageReceiver imageReceiver2 = b81Var.Q;
        if (z10) {
            if (b81Var.N == null && b81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.iu0 iu0Var = b81Var.N;
            if (iu0Var != null) {
                int i12 = (int) b81Var.O;
                ArrayList arrayList = iu0Var.v;
                int indexOf = arrayList.indexOf(iu0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = iu0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.iu0 iu0Var2 = b81Var.N;
                int i13 = (int) b81Var.O;
                int videoDuration2 = iu0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                b81Var.R = (int) ((min % 5) * bitmapWidth);
                b81Var.S = (int) ((min / 5) * bitmapHeight);
                b81Var.T = (int) bitmapWidth;
                b81Var.U = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= b81Var.d0.size()) {
                        a81Var = null;
                        break;
                    }
                    a81Var = (a81) b81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : a81Var.a;
                    double d10 = i14 == b81Var.d0.size() + (-1) ? 9.9999999E7d : ((a81) b81Var.d0.get(i14 + 1)).a;
                    double d11 = b81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (a81Var == null) {
                    return;
                }
                b81Var.R = a81Var.b;
                b81Var.S = a81Var.c;
                b81Var.T = b81Var.b0;
                b81Var.U = b81Var.c0;
            }
            b81Var.P = true;
            float f7 = b81Var.T / b81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
            if (b81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            b81Var.setVisibility(0);
            b81Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
