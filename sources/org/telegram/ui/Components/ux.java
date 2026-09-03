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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ux extends gt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public final OvershootInterpolator N = new OvershootInterpolator(3.0f);
    public final /* synthetic */ wx O;

    public ux(wx wxVar) {
        this.O = wxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        int i12;
        mz mzVar = this.O.c3;
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            if (mzVar.s2 > 0) {
                if (SystemClock.elapsedRealtime() - mzVar.s2 < Math.max(400L, Math.min(45, mzVar.r2 - mzVar.q2) * 35) + Math.max(600L, Math.min(55, mzVar.r2 - mzVar.q2) * 40) + 150) {
                    z4 = true;
                    for (int i13 = 0; i13 < this.L.size(); i13++) {
                        uy uyVar = (uy) this.L.get(i13);
                        if (uyVar.h != 0.0f || uyVar.n != null || ((i12 = uyVar.a) > mzVar.q2 && i12 < mzVar.r2 && z4)) {
                            break;
                        }
                    }
                }
            }
            z4 = false;
            while (i13 < this.L.size()) {
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

    @Override // org.telegram.ui.Components.gt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                return;
            }
            uy uyVar = (uy) arrayList.get(i10);
            l5 l5Var = uyVar.b;
            if (l5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = uyVar.f[this.H];
                oh.z2 z2Var = l5Var.k;
                if (z2Var != null) {
                    z2Var.setAlpha(l5Var.l);
                    l5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        int i10;
        l5 l5Var;
        mz mzVar = this.O.c3;
        if (this.L != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                uy uyVar = (uy) this.L.get(i11);
                if (uyVar.getSpan() == null || (l5Var = (l5) mzVar.a2.get(uyVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (uyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(uyVar.getPaddingLeft() + uyVar.getLeft(), height, uyVar.getRight() - uyVar.getPaddingRight(), ((uyVar.getMeasuredHeight() + height) - uyVar.getPaddingBottom()) - uyVar.getPaddingTop());
                    float f13 = uyVar.h;
                    float f14 = f13 != f11 ? (((1.0f - f13) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (mzVar.s2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - mzVar.s2 < Math.max(400L, Math.min(45, mzVar.r2 - mzVar.q2) * 35) + Math.max(600L, Math.min(55, mzVar.r2 - mzVar.q2) * 40) + 150 && mzVar.q2 >= 0 && mzVar.r2 >= 0 && mzVar.s2 > 0) {
                            int R = RecyclerView.R(uyVar);
                            int i12 = mzVar.q2;
                            int i13 = R - i12;
                            int i14 = mzVar.r2 - i12;
                            if (i13 >= 0 && i13 < i14) {
                                float max = Math.max(600L, Math.min(55, r6 - i12) * 40);
                                float a2 = k7.o.a(e2.c.d(max, 0.45f, SystemClock.elapsedRealtime() - mzVar.s2, Math.max(400L, Math.min(45, mzVar.r2 - mzVar.q2) * 35)), 0.0f, 1.0f);
                                float interpolation = pr.g.getInterpolation(k7.o.a((SystemClock.elapsedRealtime() - mzVar.s2) / max, 0.0f, 1.0f));
                                float f15 = i13;
                                float f16 = i14;
                                AndroidUtilities.cascade(a2, f15, f16, f16 / 5.0f);
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(interpolation, f15, f16, f17);
                                int i15 = i14 / 4;
                                f14 *= (this.N.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f17)) * 0.5f) + 0.5f;
                                f12 *= cascade;
                                l5Var.setAlpha((int) (255.0f * f12));
                                l5Var.setBounds(rect);
                                l5Var.setColorFilter(mzVar.b2);
                                if (f14 == 1.0f) {
                                    canvas.save();
                                    canvas.scale(f14, f14, rect.centerX(), rect.centerY());
                                    l5Var.draw(canvas);
                                    canvas.restore();
                                } else {
                                    l5Var.draw(canvas);
                                }
                            }
                        }
                    } else {
                        i10 = i11;
                    }
                    l5Var.setAlpha((int) (255.0f * f12));
                    l5Var.setBounds(rect);
                    l5Var.setColorFilter(mzVar.b2);
                    if (f14 == 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.O.c3.M.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((uy) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.H].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.gt
    public final void i(long j10) {
        l5 l5Var;
        mz mzVar = this.O.c3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            uy uyVar = (uy) this.L.get(i10);
            u5 span = uyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = uyVar.f;
            if (span != null && (l5Var = (l5) mzVar.a2.get(uyVar.d.getDocumentId())) != null && l5Var.k != null) {
                l5Var.t(j10);
                oh.z2 z2Var = l5Var.k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                l5Var.setAlpha(255);
                int height = (int) (uyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((uyVar.getPaddingLeft() + uyVar.getLeft()) - this.K, height, (uyVar.getRight() - uyVar.getPaddingRight()) - this.K, ((uyVar.getMeasuredHeight() + height) - uyVar.getPaddingTop()) - uyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                uyVar.b = l5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = l5Var.c() ? mzVar.b2 : null;
                arrayList.add(uyVar);
            }
        }
    }
}
