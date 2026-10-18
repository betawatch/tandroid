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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cy extends qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ ey R;

    public cy(ey eyVar) {
        this.R = eyVar;
    }

    @Override // org.telegram.ui.Components.qt
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        int i12;
        ey eyVar = this.R;
        tz tzVar = eyVar.d3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = tzVar.u2 > 0 && SystemClock.elapsedRealtime() - tzVar.u2 < eyVar.x1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                cz czVar = (cz) this.O.get(i13);
                if (czVar.h != 0.0f || czVar.n != null || ((i12 = czVar.a) > tzVar.s2 && i12 < tzVar.t2 && z12)) {
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

    @Override // org.telegram.ui.Components.qt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            cz czVar = (cz) arrayList.get(i10);
            r5 r5Var = czVar.b;
            if (r5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = czVar.f[this.K];
                ci.g3 g3Var = r5Var.k;
                if (g3Var != null) {
                    g3Var.setAlpha(r5Var.l);
                    r5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        r5 r5Var;
        r5 r5Var2;
        float f11;
        float f12;
        ey eyVar = this.R;
        tz tzVar = eyVar.d3;
        if (this.O != null) {
            canvas.save();
            float f13 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f14 = f7;
            while (i11 < this.O.size()) {
                cz czVar = (cz) this.O.get(i11);
                if (czVar.getSpan() == null || (r5Var = (r5) tzVar.d2.get(czVar.d.getDocumentId())) == null) {
                    f10 = f13;
                    i10 = i11;
                } else {
                    int height = (int) (czVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(czVar.getPaddingLeft() + czVar.getLeft(), height, czVar.getRight() - czVar.getPaddingRight(), ((czVar.getMeasuredHeight() + height) - czVar.getPaddingBottom()) - czVar.getPaddingTop());
                    float f15 = czVar.h;
                    float f16 = f15 != f13 ? (((1.0f - f15) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (tzVar.u2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - tzVar.u2 < eyVar.x1()) {
                            if (tzVar.s2 >= 0 && tzVar.t2 >= 0 && tzVar.u2 > 0) {
                                int R = RecyclerView.R(czVar);
                                int i12 = tzVar.s2;
                                int i13 = R - i12;
                                int i14 = tzVar.t2 - i12;
                                if (i13 >= 0 && i13 < i14) {
                                    float max = Math.max(600L, Math.min(55, r7 - i12) * 40);
                                    r5Var2 = r5Var;
                                    f10 = 0.0f;
                                    float a2 = w7.r.a(com.google.android.gms.internal.play_billing.k3.c(max, 0.45f, SystemClock.elapsedRealtime() - tzVar.u2, Math.max(400L, Math.min(45, tzVar.t2 - tzVar.s2) * 35)), 0.0f, 1.0f);
                                    float f17 = f16;
                                    float interpolation = bs.g.getInterpolation(w7.r.a((SystemClock.elapsedRealtime() - tzVar.u2) / max, 0.0f, 1.0f));
                                    float f18 = i13;
                                    float f19 = i14;
                                    AndroidUtilities.cascade(a2, f18, f19, f19 / 5.0f);
                                    float f20 = f19 / 4.0f;
                                    float cascade = AndroidUtilities.cascade(interpolation, f18, f19, f20);
                                    int i15 = i14 / 4;
                                    f12 = ((this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f20)) * 0.5f) + 0.5f) * f17;
                                    f14 *= cascade;
                                    r5Var2.setAlpha((int) (255.0f * f14));
                                    r5Var2.setBounds(rect);
                                    r5Var2.setColorFilter(tzVar.e2);
                                    if (f12 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f12, f12, rect.centerX(), rect.centerY());
                                        r5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        r5Var2.draw(canvas);
                                    }
                                }
                            }
                            r5Var2 = r5Var;
                            f11 = f16;
                            f10 = 0.0f;
                            f12 = f11;
                            r5Var2.setAlpha((int) (255.0f * f14));
                            r5Var2.setBounds(rect);
                            r5Var2.setColorFilter(tzVar.e2);
                            if (f12 != 1.0f) {
                            }
                        } else {
                            f10 = 0.0f;
                        }
                    } else {
                        f10 = f13;
                        i10 = i11;
                    }
                    r5Var2 = r5Var;
                    f11 = f16;
                    f12 = f11;
                    r5Var2.setAlpha((int) (255.0f * f14));
                    r5Var2.setBounds(rect);
                    r5Var2.setColorFilter(tzVar.e2);
                    if (f12 != 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f13 = f10;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.d3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((cz) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qt
    public final void i(long j10) {
        r5 r5Var;
        tz tzVar = this.R.d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            cz czVar = (cz) this.O.get(i10);
            a6 span = czVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = czVar.f;
            if (span != null && (r5Var = (r5) tzVar.d2.get(czVar.d.getDocumentId())) != null && r5Var.k != null) {
                r5Var.t(j10);
                ci.g3 g3Var = r5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = g3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                r5Var.setAlpha(255);
                int height = (int) (czVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((czVar.getPaddingLeft() + czVar.getLeft()) - this.N, height, (czVar.getRight() - czVar.getPaddingRight()) - this.N, ((czVar.getMeasuredHeight() + height) - czVar.getPaddingTop()) - czVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                czVar.b = r5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = r5Var.c() ? tzVar.e2 : null;
                arrayList.add(czVar);
            }
        }
    }
}
