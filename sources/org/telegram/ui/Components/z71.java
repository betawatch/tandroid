package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z71 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ View a;

    public /* synthetic */ z71(View view) {
        this.a = view;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        b81 b81Var;
        int i10;
        int i11;
        c81 c81Var = (c81) this.a;
        ImageReceiver imageReceiver2 = c81Var.Q;
        if (z10) {
            if (c81Var.N == null && c81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.au0 au0Var = c81Var.N;
            if (au0Var != null) {
                int i12 = (int) c81Var.O;
                ArrayList arrayList = au0Var.v;
                int indexOf = arrayList.indexOf(au0Var.c(i12));
                if (indexOf == -1) {
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = au0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i11 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    i11 = 25;
                }
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.au0 au0Var2 = c81Var.N;
                int i13 = (int) c81Var.O;
                int videoDuration2 = au0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                c81Var.R = (int) ((min % 5) * bitmapWidth);
                c81Var.S = (int) ((min / 5) * bitmapHeight);
                c81Var.T = (int) bitmapWidth;
                c81Var.U = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= c81Var.d0.size()) {
                        b81Var = null;
                        break;
                    }
                    b81Var = (b81) c81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : b81Var.a;
                    double d10 = i14 == c81Var.d0.size() + (-1) ? 9.9999999E7d : ((b81) c81Var.d0.get(i14 + 1)).a;
                    double d11 = c81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (b81Var == null) {
                    return;
                }
                c81Var.R = b81Var.b;
                c81Var.S = b81Var.c;
                c81Var.T = c81Var.b0;
                c81Var.U = c81Var.c0;
            }
            c81Var.P = true;
            float f7 = c81Var.T / c81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = c81Var.getLayoutParams();
            if (c81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            c81Var.setVisibility(0);
            c81Var.requestLayout();
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
