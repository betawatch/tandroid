package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class a81 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ View a;

    public /* synthetic */ a81(View view) {
        this.a = view;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        c81 c81Var;
        int i10;
        int i11;
        d81 d81Var = (d81) this.a;
        ImageReceiver imageReceiver2 = d81Var.Q;
        if (z10) {
            if (d81Var.N == null && d81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.iu0 iu0Var = d81Var.N;
            if (iu0Var != null) {
                int i12 = (int) d81Var.O;
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
                org.telegram.ui.iu0 iu0Var2 = d81Var.N;
                int i13 = (int) d81Var.O;
                int videoDuration2 = iu0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                d81Var.R = (int) ((min % 5) * bitmapWidth);
                d81Var.S = (int) ((min / 5) * bitmapHeight);
                d81Var.T = (int) bitmapWidth;
                d81Var.U = (int) bitmapHeight;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= d81Var.d0.size()) {
                        c81Var = null;
                        break;
                    }
                    c81Var = (c81) d81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : c81Var.a;
                    double d10 = i14 == d81Var.d0.size() + (-1) ? 9.9999999E7d : ((c81) d81Var.d0.get(i14 + 1)).a;
                    double d11 = d81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (c81Var == null) {
                    return;
                }
                d81Var.R = c81Var.b;
                d81Var.S = c81Var.c;
                d81Var.T = d81Var.b0;
                d81Var.U = d81Var.c0;
            }
            d81Var.P = true;
            float f7 = d81Var.T / d81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = d81Var.getLayoutParams();
            if (d81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            d81Var.setVisibility(0);
            d81Var.requestLayout();
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
