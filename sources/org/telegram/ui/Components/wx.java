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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class wx extends kt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ yx R;

    public wx(yx yxVar) {
        this.R = yxVar;
    }

    @Override // org.telegram.ui.Components.kt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        int i12;
        yx yxVar = this.R;
        mz mzVar = yxVar.f3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = mzVar.u2 > 0 && SystemClock.elapsedRealtime() - mzVar.u2 < yxVar.w1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                vy vyVar = (vy) this.O.get(i13);
                if (vyVar.h != 0.0f || vyVar.n != null || ((i12 = vyVar.a) > mzVar.s2 && i12 < mzVar.t2 && z12)) {
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

    @Override // org.telegram.ui.Components.kt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            vy vyVar = (vy) arrayList.get(i10);
            q5 q5Var = vyVar.b;
            if (q5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = vyVar.f[this.K];
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
    @Override // org.telegram.ui.Components.kt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        Canvas canvas2;
        int i10;
        yx yxVar;
        q5 q5Var;
        Canvas canvas3 = canvas;
        yx yxVar2 = this.R;
        mz mzVar = yxVar2.f3;
        if (this.O != null) {
            canvas3.save();
            float f10 = 0.0f;
            canvas3.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                vy vyVar = (vy) this.O.get(i11);
                if (vyVar.getSpan() == null || (q5Var = (q5) mzVar.d2.get(vyVar.d.getDocumentId())) == null) {
                    canvas2 = canvas3;
                    i10 = i11;
                    yxVar = yxVar2;
                } else {
                    int height = (int) (vyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(vyVar.getPaddingLeft() + vyVar.getLeft(), height, vyVar.getRight() - vyVar.getPaddingRight(), ((vyVar.getMeasuredHeight() + height) - vyVar.getPaddingBottom()) - vyVar.getPaddingTop());
                    float f12 = vyVar.h;
                    float f13 = f12 != f10 ? (((1.0f - f12) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (mzVar.u2 > 0 && SystemClock.elapsedRealtime() - mzVar.u2 < yxVar2.w1() && mzVar.s2 >= 0 && mzVar.t2 >= 0 && mzVar.u2 > 0) {
                        int R = RecyclerView.R(vyVar);
                        int i12 = mzVar.s2;
                        int i13 = R - i12;
                        int i14 = mzVar.t2 - i12;
                        if (i13 >= 0 && i13 < i14) {
                            i10 = i11;
                            float max = Math.max(600L, Math.min(55, r13 - i12) * 40);
                            yxVar = yxVar2;
                            float a2 = w7.q.a(com.google.android.gms.internal.vision.e2.v(max, 0.45f, SystemClock.elapsedRealtime() - mzVar.u2, Math.max(400L, Math.min(45, mzVar.t2 - mzVar.s2) * 35)), 0.0f, 1.0f);
                            float f14 = f11;
                            float interpolation = sr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - mzVar.u2) / max, 0.0f, 1.0f));
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
                            q5Var.setColorFilter(mzVar.e2);
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
                    yxVar = yxVar2;
                    f11 = f11;
                    q5Var.setAlpha((int) (255.0f * f11));
                    q5Var.setBounds(rect);
                    q5Var.setColorFilter(mzVar.e2);
                    if (f13 == 1.0f) {
                    }
                }
                yxVar2 = yxVar;
                i11 = i10 + 1;
                canvas3 = canvas2;
                f10 = 0.0f;
            }
            canvas3.restore();
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.f3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((vy) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.kt
    public final void i(long j3) {
        q5 q5Var;
        mz mzVar = this.R.f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            vy vyVar = (vy) this.O.get(i10);
            z5 span = vyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = vyVar.f;
            if (span != null && (q5Var = (q5) mzVar.d2.get(vyVar.d.getDocumentId())) != null && q5Var.k != null) {
                q5Var.t(j3);
                ai.l4 l4Var = q5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                q5Var.setAlpha(255);
                int height = (int) (vyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((vyVar.getPaddingLeft() + vyVar.getLeft()) - this.N, height, (vyVar.getRight() - vyVar.getPaddingRight()) - this.N, ((vyVar.getMeasuredHeight() + height) - vyVar.getPaddingTop()) - vyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                vyVar.b = q5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = q5Var.c() ? mzVar.e2 : null;
                arrayList.add(vyVar);
            }
        }
    }
}
