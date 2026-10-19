package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class f81 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ View a;

    public /* synthetic */ f81(View view) {
        this.a = view;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        h81 h81Var;
        int i10;
        int i11;
        double ceil;
        i81 i81Var = (i81) this.a;
        ImageReceiver imageReceiver2 = i81Var.Q;
        if (z10) {
            if (i81Var.N == null && i81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.ot0 ot0Var = i81Var.N;
            if (ot0Var != null) {
                int i12 = (int) i81Var.O;
                ArrayList arrayList = ot0Var.v;
                int indexOf = arrayList.indexOf(ot0Var.c(i12));
                if (indexOf == -1) {
                    z13 = true;
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = ot0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
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
                org.telegram.ui.ot0 ot0Var2 = i81Var.N;
                int i13 = (int) i81Var.O;
                int videoDuration2 = ot0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                i81Var.R = (int) ((min % 5) * bitmapWidth);
                i81Var.S = (int) ((min / 5) * bitmapHeight);
                i81Var.T = (int) bitmapWidth;
                i81Var.U = (int) bitmapHeight;
            } else {
                z13 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= i81Var.d0.size()) {
                        h81Var = null;
                        break;
                    }
                    h81Var = (h81) i81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : h81Var.a;
                    double d10 = i14 == i81Var.d0.size() + (-1) ? 9.9999999E7d : ((h81) i81Var.d0.get(i14 + 1)).a;
                    double d11 = i81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (h81Var == null) {
                    return;
                }
                i81Var.R = h81Var.b;
                i81Var.S = h81Var.c;
                i81Var.T = i81Var.b0;
                i81Var.U = i81Var.c0;
            }
            i81Var.P = z13;
            float f7 = i81Var.T / i81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = i81Var.getLayoutParams();
            if (i81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            i81Var.setVisibility(0);
            i81Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
