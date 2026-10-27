package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ Object a;

    public /* synthetic */ x81(Object obj) {
        this.a = obj;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        z81 z81Var;
        int i10;
        int i11;
        double ceil;
        a91 a91Var = (a91) this.a;
        ImageReceiver imageReceiver2 = a91Var.Q;
        if (z10) {
            if (a91Var.N == null && a91Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.xt0 xt0Var = a91Var.N;
            if (xt0Var != null) {
                int i12 = (int) a91Var.O;
                ArrayList arrayList = xt0Var.v;
                int indexOf = arrayList.indexOf(xt0Var.c(i12));
                if (indexOf == -1) {
                    z13 = true;
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = xt0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
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
                org.telegram.ui.xt0 xt0Var2 = a91Var.N;
                int i13 = (int) a91Var.O;
                int videoDuration2 = xt0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                a91Var.R = (int) ((min % 5) * bitmapWidth);
                a91Var.S = (int) ((min / 5) * bitmapHeight);
                a91Var.T = (int) bitmapWidth;
                a91Var.U = (int) bitmapHeight;
            } else {
                z13 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= a91Var.d0.size()) {
                        z81Var = null;
                        break;
                    }
                    z81Var = (z81) a91Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : z81Var.a;
                    double d10 = i14 == a91Var.d0.size() + (-1) ? 9.9999999E7d : ((z81) a91Var.d0.get(i14 + 1)).a;
                    double d11 = a91Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (z81Var == null) {
                    return;
                }
                a91Var.R = z81Var.b;
                a91Var.S = z81Var.c;
                a91Var.T = a91Var.b0;
                a91Var.U = a91Var.c0;
            }
            a91Var.P = z13;
            float f7 = a91Var.T / a91Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = a91Var.getLayoutParams();
            if (a91Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            a91Var.setVisibility(0);
            a91Var.requestLayout();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }
}
