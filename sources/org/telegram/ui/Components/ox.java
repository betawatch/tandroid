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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ox extends at {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final OvershootInterpolator M = new OvershootInterpolator(3.0f);
    public final /* synthetic */ qx N;

    public ox(qx qxVar) {
        this.N = qxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f9) {
        boolean z10;
        int i12;
        fz fzVar = this.N.b3;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        boolean z12 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z12) {
            if (fzVar.r2 > 0) {
                if (SystemClock.elapsedRealtime() - fzVar.r2 < Math.max(400L, Math.min(45, fzVar.q2 - fzVar.p2) * 35) + Math.max(600L, Math.min(55, fzVar.q2 - fzVar.p2) * 40) + 150) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.K.size(); i13++) {
                        ny nyVar = (ny) this.K.get(i13);
                        if (nyVar.h != 0.0f || nyVar.n != null || ((i12 = nyVar.a) > fzVar.p2 && i12 < fzVar.q2 && z10)) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i13 < this.K.size()) {
            }
        }
        z11 = z12;
        if (!z11) {
            super.a(canvas, j10, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.at
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            ny nyVar = (ny) arrayList.get(i10);
            p5 p5Var = nyVar.b;
            if (p5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = nyVar.f[this.G];
                lh.x2 x2Var = p5Var.k;
                if (x2Var != null) {
                    x2Var.setAlpha(p5Var.l);
                    p5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f9) {
        int i10;
        p5 p5Var;
        fz fzVar = this.N.b3;
        if (this.K != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f11 = f9;
            int i11 = 0;
            while (i11 < this.K.size()) {
                ny nyVar = (ny) this.K.get(i11);
                if (nyVar.getSpan() == null || (p5Var = (p5) fzVar.Z1.get(nyVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (nyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(nyVar.getPaddingLeft() + nyVar.getLeft(), height, nyVar.getRight() - nyVar.getPaddingRight(), ((nyVar.getMeasuredHeight() + height) - nyVar.getPaddingBottom()) - nyVar.getPaddingTop());
                    float f12 = nyVar.h;
                    float f13 = f12 != f10 ? (((1.0f - f12) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (fzVar.r2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - fzVar.r2 < Math.max(400L, Math.min(45, fzVar.q2 - fzVar.p2) * 35) + Math.max(600L, Math.min(55, fzVar.q2 - fzVar.p2) * 40) + 150 && fzVar.p2 >= 0 && fzVar.q2 >= 0 && fzVar.r2 > 0) {
                            int R = RecyclerView.R(nyVar);
                            int i12 = fzVar.p2;
                            int i13 = R - i12;
                            int i14 = fzVar.q2 - i12;
                            if (i13 >= 0 && i13 < i14) {
                                float max = Math.max(600L, Math.min(55, r6 - i12) * 40);
                                float a2 = i7.w.a(com.google.android.recaptcha.internal.a.w(max, 0.45f, SystemClock.elapsedRealtime() - fzVar.r2, Math.max(400L, Math.min(45, fzVar.q2 - fzVar.p2) * 35)), 0.0f, 1.0f);
                                float interpolation = jr.g.getInterpolation(i7.w.a((SystemClock.elapsedRealtime() - fzVar.r2) / max, 0.0f, 1.0f));
                                float f14 = i13;
                                float f15 = i14;
                                AndroidUtilities.cascade(a2, f14, f15, f15 / 5.0f);
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(interpolation, f14, f15, f16);
                                int i15 = i14 / 4;
                                f13 *= (this.M.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f16)) * 0.5f) + 0.5f;
                                f11 *= cascade;
                                p5Var.setAlpha((int) (255.0f * f11));
                                p5Var.setBounds(rect);
                                p5Var.setColorFilter(fzVar.a2);
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
                    p5Var.setColorFilter(fzVar.a2);
                    if (f13 == 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f10 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.at
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.N.b3.L.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ny) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.G].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.at
    public final void i(long j10) {
        p5 p5Var;
        fz fzVar = this.N.b3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            ny nyVar = (ny) this.K.get(i10);
            y5 span = nyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = nyVar.f;
            if (span != null && (p5Var = (p5) fzVar.Z1.get(nyVar.d.getDocumentId())) != null && p5Var.k != null) {
                p5Var.t(j10);
                lh.x2 x2Var = p5Var.k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = x2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                p5Var.setAlpha(255);
                int height = (int) (nyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((nyVar.getPaddingLeft() + nyVar.getLeft()) - this.J, height, (nyVar.getRight() - nyVar.getPaddingRight()) - this.J, ((nyVar.getMeasuredHeight() + height) - nyVar.getPaddingTop()) - nyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                nyVar.b = p5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = p5Var.c() ? fzVar.a2 : null;
                arrayList.add(nyVar);
            }
        }
    }
}
