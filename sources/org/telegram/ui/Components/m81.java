package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ View a;

    public /* synthetic */ m81(View view) {
        this.a = view;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        o81 o81Var;
        int i10;
        int i11;
        double ceil;
        p81 p81Var = (p81) this.a;
        ImageReceiver imageReceiver2 = p81Var.Q;
        if (z10) {
            if (p81Var.N == null && p81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.pu0 pu0Var = p81Var.N;
            if (pu0Var != null) {
                int i12 = (int) p81Var.O;
                ArrayList arrayList = pu0Var.v;
                int indexOf = arrayList.indexOf(pu0Var.c(i12));
                if (indexOf == -1) {
                    z13 = true;
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = pu0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
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
                org.telegram.ui.pu0 pu0Var2 = p81Var.N;
                int i13 = (int) p81Var.O;
                int videoDuration2 = pu0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                p81Var.R = (int) ((min % 5) * bitmapWidth);
                p81Var.S = (int) ((min / 5) * bitmapHeight);
                p81Var.T = (int) bitmapWidth;
                p81Var.U = (int) bitmapHeight;
            } else {
                z13 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= p81Var.d0.size()) {
                        o81Var = null;
                        break;
                    }
                    o81Var = (o81) p81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : o81Var.a;
                    double d10 = i14 == p81Var.d0.size() + (-1) ? 9.9999999E7d : ((o81) p81Var.d0.get(i14 + 1)).a;
                    double d11 = p81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (o81Var == null) {
                    return;
                }
                p81Var.R = o81Var.b;
                p81Var.S = o81Var.c;
                p81Var.T = p81Var.b0;
                p81Var.U = p81Var.c0;
            }
            p81Var.P = z13;
            float f7 = p81Var.T / p81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = p81Var.getLayoutParams();
            if (p81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            p81Var.setVisibility(0);
            p81Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
