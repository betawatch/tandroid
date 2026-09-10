package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zx extends nt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ cy R;

    public zx(cy cyVar) {
        this.R = cyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.nt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        int i12;
        rz rzVar = this.R.f3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        boolean z12 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z12) {
            if (rzVar.v2 > 0) {
                if (SystemClock.elapsedRealtime() - rzVar.v2 < Math.max(400L, Math.min(45, rzVar.u2 - rzVar.t2) * 35) + Math.max(600L, Math.min(55, rzVar.u2 - rzVar.t2) * 40) + 150) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        az azVar = (az) this.O.get(i13);
                        if (azVar.h != 0.0f || azVar.n != null || ((i12 = azVar.a) > rzVar.t2 && i12 < rzVar.u2 && z10)) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i13 < this.O.size()) {
            }
        }
        z11 = z12;
        if (!z11) {
            super.a(canvas, j3, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.nt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            az azVar = (az) arrayList.get(i10);
            p5 p5Var = azVar.b;
            if (p5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = azVar.f[this.K];
                gg.h1 h1Var = p5Var.k;
                if (h1Var != null) {
                    h1Var.setAlpha(p5Var.l);
                    p5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.nt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        int i10;
        p5 p5Var;
        rz rzVar = this.R.f3;
        if (this.O != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                az azVar = (az) this.O.get(i11);
                if (azVar.getSpan() == null || (p5Var = (p5) rzVar.d2.get(azVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (azVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(azVar.getPaddingLeft() + azVar.getLeft(), height, azVar.getRight() - azVar.getPaddingRight(), ((azVar.getMeasuredHeight() + height) - azVar.getPaddingBottom()) - azVar.getPaddingTop());
                    float f12 = azVar.h;
                    float f13 = f12 != f10 ? (((1.0f - f12) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (rzVar.v2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - rzVar.v2 < Math.max(400L, Math.min(45, rzVar.u2 - rzVar.t2) * 35) + Math.max(600L, Math.min(55, rzVar.u2 - rzVar.t2) * 40) + 150 && rzVar.t2 >= 0 && rzVar.u2 >= 0 && rzVar.v2 > 0) {
                            int R = RecyclerView.R(azVar);
                            int i12 = rzVar.t2;
                            int i13 = R - i12;
                            int i14 = rzVar.u2 - i12;
                            if (i13 >= 0 && i13 < i14) {
                                float max = Math.max(600L, Math.min(55, r6 - i12) * 40);
                                float a2 = w7.q.a(com.google.android.gms.internal.vision.e2.v(max, 0.45f, SystemClock.elapsedRealtime() - rzVar.v2, Math.max(400L, Math.min(45, rzVar.u2 - rzVar.t2) * 35)), 0.0f, 1.0f);
                                float interpolation = wr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - rzVar.v2) / max, 0.0f, 1.0f));
                                float f14 = i13;
                                float f15 = i14;
                                AndroidUtilities.cascade(a2, f14, f15, f15 / 5.0f);
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(interpolation, f14, f15, f16);
                                int i15 = i14 / 4;
                                f13 *= (this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f16)) * 0.5f) + 0.5f;
                                f11 *= cascade;
                                p5Var.setAlpha((int) (255.0f * f11));
                                p5Var.setBounds(rect);
                                p5Var.setColorFilter(rzVar.e2);
                                if (f13 == 1.0f) {
                                    canvas.save();
                                    canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                    p5Var.draw(canvas);
                                    canvas.restore();
                                } else {
                                    p5Var.draw(canvas);
                                }
                            }
                        }
                    } else {
                        i10 = i11;
                    }
                    p5Var.setAlpha((int) (255.0f * f11));
                    p5Var.setBounds(rect);
                    p5Var.setColorFilter(rzVar.e2);
                    if (f13 == 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f10 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.nt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.f3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((az) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.nt
    public final void i(long j3) {
        p5 p5Var;
        rz rzVar = this.R.f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            az azVar = (az) this.O.get(i10);
            y5 span = azVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = azVar.f;
            if (span != null && (p5Var = (p5) rzVar.d2.get(azVar.d.getDocumentId())) != null && p5Var.k != null) {
                p5Var.t(j3);
                gg.h1 h1Var = p5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = h1Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                p5Var.setAlpha(255);
                int height = (int) (azVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((azVar.getPaddingLeft() + azVar.getLeft()) - this.N, height, (azVar.getRight() - azVar.getPaddingRight()) - this.N, ((azVar.getMeasuredHeight() + height) - azVar.getPaddingTop()) - azVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                azVar.b = p5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = p5Var.c() ? rzVar.e2 : null;
                arrayList.add(azVar);
            }
        }
    }
}
