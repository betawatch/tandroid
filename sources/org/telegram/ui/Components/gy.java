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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gy extends vt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ iy R;

    public gy(iy iyVar) {
        this.R = iyVar;
    }

    @Override // org.telegram.ui.Components.vt
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        int i12;
        iy iyVar = this.R;
        wz wzVar = iyVar.d3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = wzVar.u2 > 0 && SystemClock.elapsedRealtime() - wzVar.u2 < iyVar.x1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                ez ezVar = (ez) this.O.get(i13);
                if (ezVar.h != 0.0f || ezVar.n != null || ((i12 = ezVar.a) > wzVar.s2 && i12 < wzVar.t2 && z12)) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.vt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            ez ezVar = (ez) arrayList.get(i10);
            s5 s5Var = ezVar.b;
            if (s5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ezVar.f[this.K];
                bi.b4 b4Var = s5Var.k;
                if (b4Var != null) {
                    b4Var.setAlpha(s5Var.l);
                    s5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        s5 s5Var;
        s5 s5Var2;
        float f11;
        float f12;
        iy iyVar = this.R;
        wz wzVar = iyVar.d3;
        if (this.O != null) {
            canvas.save();
            float f13 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f14 = f7;
            while (i11 < this.O.size()) {
                ez ezVar = (ez) this.O.get(i11);
                if (ezVar.getSpan() == null || (s5Var = (s5) wzVar.d2.get(ezVar.d.getDocumentId())) == null) {
                    f10 = f13;
                    i10 = i11;
                } else {
                    int height = (int) (ezVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(ezVar.getPaddingLeft() + ezVar.getLeft(), height, ezVar.getRight() - ezVar.getPaddingRight(), ((ezVar.getMeasuredHeight() + height) - ezVar.getPaddingBottom()) - ezVar.getPaddingTop());
                    float f15 = ezVar.h;
                    float f16 = f15 != f13 ? (((1.0f - f15) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (wzVar.u2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - wzVar.u2 < iyVar.x1()) {
                            if (wzVar.s2 >= 0 && wzVar.t2 >= 0 && wzVar.u2 > 0) {
                                int R = RecyclerView.R(ezVar);
                                int i12 = wzVar.s2;
                                int i13 = R - i12;
                                int i14 = wzVar.t2 - i12;
                                if (i13 >= 0 && i13 < i14) {
                                    float max = Math.max(600L, Math.min(55, r7 - i12) * 40);
                                    s5Var2 = s5Var;
                                    f10 = 0.0f;
                                    float a2 = w7.s.a(com.google.android.gms.internal.play_billing.k3.c(max, 0.45f, SystemClock.elapsedRealtime() - wzVar.u2, Math.max(400L, Math.min(45, wzVar.t2 - wzVar.s2) * 35)), 0.0f, 1.0f);
                                    float f17 = f16;
                                    float interpolation = es.g.getInterpolation(w7.s.a((SystemClock.elapsedRealtime() - wzVar.u2) / max, 0.0f, 1.0f));
                                    float f18 = i13;
                                    float f19 = i14;
                                    AndroidUtilities.cascade(a2, f18, f19, f19 / 5.0f);
                                    float f20 = f19 / 4.0f;
                                    float cascade = AndroidUtilities.cascade(interpolation, f18, f19, f20);
                                    int i15 = i14 / 4;
                                    f12 = ((this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f20)) * 0.5f) + 0.5f) * f17;
                                    f14 *= cascade;
                                    s5Var2.setAlpha((int) (255.0f * f14));
                                    s5Var2.setBounds(rect);
                                    s5Var2.setColorFilter(wzVar.e2);
                                    if (f12 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f12, f12, rect.centerX(), rect.centerY());
                                        s5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        s5Var2.draw(canvas);
                                    }
                                }
                            }
                            s5Var2 = s5Var;
                            f11 = f16;
                            f10 = 0.0f;
                            f12 = f11;
                            s5Var2.setAlpha((int) (255.0f * f14));
                            s5Var2.setBounds(rect);
                            s5Var2.setColorFilter(wzVar.e2);
                            if (f12 != 1.0f) {
                            }
                        } else {
                            f10 = 0.0f;
                        }
                    } else {
                        f10 = f13;
                        i10 = i11;
                    }
                    s5Var2 = s5Var;
                    f11 = f16;
                    f12 = f11;
                    s5Var2.setAlpha((int) (255.0f * f14));
                    s5Var2.setBounds(rect);
                    s5Var2.setColorFilter(wzVar.e2);
                    if (f12 != 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f13 = f10;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.d3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ez) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.vt
    public final void i(long j10) {
        s5 s5Var;
        wz wzVar = this.R.d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ez ezVar = (ez) this.O.get(i10);
            b6 span = ezVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ezVar.f;
            if (span != null && (s5Var = (s5) wzVar.d2.get(ezVar.d.getDocumentId())) != null && s5Var.k != null) {
                s5Var.t(j10);
                bi.b4 b4Var = s5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = b4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                s5Var.setAlpha(255);
                int height = (int) (ezVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((ezVar.getPaddingLeft() + ezVar.getLeft()) - this.N, height, (ezVar.getRight() - ezVar.getPaddingRight()) - this.N, ((ezVar.getMeasuredHeight() + height) - ezVar.getPaddingTop()) - ezVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                ezVar.b = s5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = s5Var.c() ? wzVar.e2 : null;
                arrayList.add(ezVar);
            }
        }
    }
}
