package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ View a;

    public /* synthetic */ n81(View view) {
        this.a = view;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        p81 p81Var;
        int i10;
        int i11;
        double ceil;
        q81 q81Var = (q81) this.a;
        ImageReceiver imageReceiver2 = q81Var.Q;
        if (z10) {
            if (q81Var.N == null && q81Var.d0 == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.ou0 ou0Var = q81Var.N;
            if (ou0Var != null) {
                int i12 = (int) q81Var.O;
                ArrayList arrayList = ou0Var.v;
                int indexOf = arrayList.indexOf(ou0Var.c(i12));
                if (indexOf == -1) {
                    z13 = true;
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = ou0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
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
                org.telegram.ui.ou0 ou0Var2 = q81Var.N;
                int i13 = (int) q81Var.O;
                int videoDuration2 = ou0Var2.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                q81Var.R = (int) ((min % 5) * bitmapWidth);
                q81Var.S = (int) ((min / 5) * bitmapHeight);
                q81Var.T = (int) bitmapWidth;
                q81Var.U = (int) bitmapHeight;
            } else {
                z13 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= q81Var.d0.size()) {
                        p81Var = null;
                        break;
                    }
                    p81Var = (p81) q81Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : p81Var.a;
                    double d10 = i14 == q81Var.d0.size() + (-1) ? 9.9999999E7d : ((p81) q81Var.d0.get(i14 + 1)).a;
                    double d11 = q81Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (p81Var == null) {
                    return;
                }
                q81Var.R = p81Var.b;
                q81Var.S = p81Var.c;
                q81Var.T = q81Var.b0;
                q81Var.U = q81Var.c0;
            }
            q81Var.P = z13;
            float f7 = q81Var.T / q81Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (dp / f7);
            } else {
                dp = (int) (dp * f7);
                i10 = dp;
            }
            ViewGroup.LayoutParams layoutParams = q81Var.getLayoutParams();
            if (q81Var.getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i10;
            q81Var.setVisibility(0);
            q81Var.requestLayout();
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
