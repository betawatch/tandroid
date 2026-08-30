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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sx extends et {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public final OvershootInterpolator N = new OvershootInterpolator(3.0f);
    public final /* synthetic */ ux O;

    public sx(ux uxVar) {
        this.O = uxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.et
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z4;
        int i12;
        kz kzVar = this.O.c3;
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            if (kzVar.s2 > 0) {
                if (SystemClock.elapsedRealtime() - kzVar.s2 < Math.max(400L, Math.min(45, kzVar.r2 - kzVar.q2) * 35) + Math.max(600L, Math.min(55, kzVar.r2 - kzVar.q2) * 40) + 150) {
                    z4 = true;
                    for (int i13 = 0; i13 < this.L.size(); i13++) {
                        sy syVar = (sy) this.L.get(i13);
                        if (syVar.h != 0.0f || syVar.n != null || ((i12 = syVar.a) > kzVar.q2 && i12 < kzVar.r2 && z4)) {
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

    @Override // org.telegram.ui.Components.et
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                return;
            }
            sy syVar = (sy) arrayList.get(i10);
            l5 l5Var = syVar.b;
            if (l5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = syVar.f[this.H];
                nh.y2 y2Var = l5Var.k;
                if (y2Var != null) {
                    y2Var.setAlpha(l5Var.l);
                    l5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.et
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        int i10;
        l5 l5Var;
        kz kzVar = this.O.c3;
        if (this.L != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                sy syVar = (sy) this.L.get(i11);
                if (syVar.getSpan() == null || (l5Var = (l5) kzVar.a2.get(syVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (syVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(syVar.getPaddingLeft() + syVar.getLeft(), height, syVar.getRight() - syVar.getPaddingRight(), ((syVar.getMeasuredHeight() + height) - syVar.getPaddingBottom()) - syVar.getPaddingTop());
                    float f13 = syVar.h;
                    float f14 = f13 != f11 ? (((1.0f - f13) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (kzVar.s2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - kzVar.s2 < Math.max(400L, Math.min(45, kzVar.r2 - kzVar.q2) * 35) + Math.max(600L, Math.min(55, kzVar.r2 - kzVar.q2) * 40) + 150 && kzVar.q2 >= 0 && kzVar.r2 >= 0 && kzVar.s2 > 0) {
                            int R = RecyclerView.R(syVar);
                            int i12 = kzVar.q2;
                            int i13 = R - i12;
                            int i14 = kzVar.r2 - i12;
                            if (i13 >= 0 && i13 < i14) {
                                float max = Math.max(600L, Math.min(55, r6 - i12) * 40);
                                float a2 = k7.n.a(e2.c.d(max, 0.45f, SystemClock.elapsedRealtime() - kzVar.s2, Math.max(400L, Math.min(45, kzVar.r2 - kzVar.q2) * 35)), 0.0f, 1.0f);
                                float interpolation = nr.g.getInterpolation(k7.n.a((SystemClock.elapsedRealtime() - kzVar.s2) / max, 0.0f, 1.0f));
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
                                l5Var.setColorFilter(kzVar.b2);
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
                    l5Var.setColorFilter(kzVar.b2);
                    if (f14 == 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.O.c3.M.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((sy) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.H].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.et
    public final void i(long j10) {
        l5 l5Var;
        kz kzVar = this.O.c3;
        ArrayList arrayList = this.M;
        arrayList.clear();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            sy syVar = (sy) this.L.get(i10);
            u5 span = syVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = syVar.f;
            if (span != null && (l5Var = (l5) kzVar.a2.get(syVar.d.getDocumentId())) != null && l5Var.k != null) {
                l5Var.t(j10);
                nh.y2 y2Var = l5Var.k;
                int i11 = this.H;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                l5Var.setAlpha(255);
                int height = (int) (syVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((syVar.getPaddingLeft() + syVar.getLeft()) - this.K, height, (syVar.getRight() - syVar.getPaddingRight()) - this.K, ((syVar.getMeasuredHeight() + height) - syVar.getPaddingTop()) - syVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                syVar.b = l5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = l5Var.c() ? kzVar.b2 : null;
                arrayList.add(syVar);
            }
        }
    }
}
