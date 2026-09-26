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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vx extends jt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ xx R;

    public vx(xx xxVar) {
        this.R = xxVar;
    }

    @Override // org.telegram.ui.Components.jt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        int i12;
        xx xxVar = this.R;
        lz lzVar = xxVar.f3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = lzVar.u2 > 0 && SystemClock.elapsedRealtime() - lzVar.u2 < xxVar.w1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                uy uyVar = (uy) this.O.get(i13);
                if (uyVar.h != 0.0f || uyVar.n != null || ((i12 = uyVar.a) > lzVar.s2 && i12 < lzVar.t2 && z12)) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j3, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.jt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            uy uyVar = (uy) arrayList.get(i10);
            q5 q5Var = uyVar.b;
            if (q5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = uyVar.f[this.K];
                ai.l4 l4Var = q5Var.k;
                if (l4Var != null) {
                    l4Var.setAlpha(q5Var.l);
                    q5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0188  */
    @Override // org.telegram.ui.Components.jt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        Canvas canvas2;
        int i10;
        xx xxVar;
        q5 q5Var;
        Canvas canvas3 = canvas;
        xx xxVar2 = this.R;
        lz lzVar = xxVar2.f3;
        if (this.O != null) {
            canvas3.save();
            float f10 = 0.0f;
            canvas3.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                uy uyVar = (uy) this.O.get(i11);
                if (uyVar.getSpan() == null || (q5Var = (q5) lzVar.d2.get(uyVar.d.getDocumentId())) == null) {
                    canvas2 = canvas3;
                    i10 = i11;
                    xxVar = xxVar2;
                } else {
                    int height = (int) (uyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(uyVar.getPaddingLeft() + uyVar.getLeft(), height, uyVar.getRight() - uyVar.getPaddingRight(), ((uyVar.getMeasuredHeight() + height) - uyVar.getPaddingBottom()) - uyVar.getPaddingTop());
                    float f12 = uyVar.h;
                    float f13 = f12 != f10 ? (((1.0f - f12) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (lzVar.u2 > 0 && SystemClock.elapsedRealtime() - lzVar.u2 < xxVar2.w1() && lzVar.s2 >= 0 && lzVar.t2 >= 0 && lzVar.u2 > 0) {
                        int R = RecyclerView.R(uyVar);
                        int i12 = lzVar.s2;
                        int i13 = R - i12;
                        int i14 = lzVar.t2 - i12;
                        if (i13 >= 0 && i13 < i14) {
                            i10 = i11;
                            float max = Math.max(600L, Math.min(55, r13 - i12) * 40);
                            xxVar = xxVar2;
                            float a2 = w7.q.a(com.google.android.gms.internal.vision.e2.v(max, 0.45f, SystemClock.elapsedRealtime() - lzVar.u2, Math.max(400L, Math.min(45, lzVar.t2 - lzVar.s2) * 35)), 0.0f, 1.0f);
                            float f14 = f11;
                            float interpolation = rr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - lzVar.u2) / max, 0.0f, 1.0f));
                            float f15 = i13;
                            float f16 = i14;
                            AndroidUtilities.cascade(a2, f15, f16, f16 / 5.0f);
                            float f17 = f16 / 4.0f;
                            float cascade = AndroidUtilities.cascade(interpolation, f15, f16, f17);
                            int i15 = i14 / 4;
                            f13 *= (this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f17)) * 0.5f) + 0.5f;
                            f11 = cascade * f14;
                            q5Var.setAlpha((int) (255.0f * f11));
                            q5Var.setBounds(rect);
                            q5Var.setColorFilter(lzVar.e2);
                            if (f13 == 1.0f) {
                                canvas.save();
                                canvas2 = canvas;
                                canvas2.scale(f13, f13, rect.centerX(), rect.centerY());
                                q5Var.draw(canvas2);
                                canvas2.restore();
                            } else {
                                canvas2 = canvas;
                                q5Var.draw(canvas2);
                            }
                        }
                    }
                    i10 = i11;
                    xxVar = xxVar2;
                    f11 = f11;
                    q5Var.setAlpha((int) (255.0f * f11));
                    q5Var.setBounds(rect);
                    q5Var.setColorFilter(lzVar.e2);
                    if (f13 == 1.0f) {
                    }
                }
                xxVar2 = xxVar;
                i11 = i10 + 1;
                canvas3 = canvas2;
                f10 = 0.0f;
            }
            canvas3.restore();
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.f3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((uy) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.jt
    public final void i(long j3) {
        q5 q5Var;
        lz lzVar = this.R.f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            uy uyVar = (uy) this.O.get(i10);
            z5 span = uyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = uyVar.f;
            if (span != null && (q5Var = (q5) lzVar.d2.get(uyVar.d.getDocumentId())) != null && q5Var.k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                q5Var.setAlpha(255);
                int height = (int) (uyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((uyVar.getPaddingLeft() + uyVar.getLeft()) - this.N, height, (uyVar.getRight() - uyVar.getPaddingRight()) - this.N, ((uyVar.getMeasuredHeight() + height) - uyVar.getPaddingTop()) - uyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                uyVar.b = q5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = q5Var.c() ? lzVar.e2 : null;
                arrayList.add(uyVar);
            }
        }
    }
}
