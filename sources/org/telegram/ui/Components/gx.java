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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gx extends vs {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final OvershootInterpolator M = new OvershootInterpolator(3.0f);
    public final /* synthetic */ ix N;

    public gx(ix ixVar) {
        this.N = ixVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        boolean z10;
        int i11;
        wy wyVar = this.N.b3;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        boolean z12 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z12) {
            if (wyVar.r2 > 0) {
                if (SystemClock.elapsedRealtime() - wyVar.r2 < Math.max(400L, Math.min(45, wyVar.q2 - wyVar.p2) * 35) + Math.max(600L, Math.min(55, wyVar.q2 - wyVar.p2) * 40) + 150) {
                    z10 = true;
                    for (int i12 = 0; i12 < this.K.size(); i12++) {
                        fy fyVar = (fy) this.K.get(i12);
                        if (fyVar.h != 0.0f || fyVar.n != null || ((i11 = fyVar.a) > wyVar.p2 && i11 < wyVar.q2 && z10)) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i12 < this.K.size()) {
            }
        }
        z11 = z12;
        if (!z11) {
            super.a(canvas, j10, i9, i10, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 >= arrayList.size()) {
                return;
            }
            fy fyVar = (fy) arrayList.get(i9);
            k5 k5Var = fyVar.b;
            if (k5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = fyVar.f[this.G];
                ih.z2 z2Var = k5Var.k;
                if (z2Var != null) {
                    z2Var.setAlpha(k5Var.l);
                    k5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i9++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        int i9;
        k5 k5Var;
        wy wyVar = this.N.b3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f12 = f10;
            int i10 = 0;
            while (i10 < this.K.size()) {
                fy fyVar = (fy) this.K.get(i10);
                if (fyVar.getSpan() == null || (k5Var = (k5) wyVar.Z1.get(fyVar.d.getDocumentId())) == null) {
                    i9 = i10;
                } else {
                    int height = (int) (fyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(fyVar.getPaddingLeft() + fyVar.getLeft(), height, fyVar.getRight() - fyVar.getPaddingRight(), ((fyVar.getMeasuredHeight() + height) - fyVar.getPaddingBottom()) - fyVar.getPaddingTop());
                    float f13 = fyVar.h;
                    float f14 = f13 != f11 ? (((1.0f - f13) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (wyVar.r2 > 0) {
                        i9 = i10;
                        if (SystemClock.elapsedRealtime() - wyVar.r2 < Math.max(400L, Math.min(45, wyVar.q2 - wyVar.p2) * 35) + Math.max(600L, Math.min(55, wyVar.q2 - wyVar.p2) * 40) + 150 && wyVar.p2 >= 0 && wyVar.q2 >= 0 && wyVar.r2 > 0) {
                            int R = RecyclerView.R(fyVar);
                            int i11 = wyVar.p2;
                            int i12 = R - i11;
                            int i13 = wyVar.q2 - i11;
                            if (i12 >= 0 && i12 < i13) {
                                float max = Math.max(600L, Math.min(55, r6 - i11) * 40);
                                float a2 = g7.n.a(e2.c.d(max, 0.45f, SystemClock.elapsedRealtime() - wyVar.r2, Math.max(400L, Math.min(45, wyVar.q2 - wyVar.p2) * 35)), 0.0f, 1.0f);
                                float interpolation = gr.g.getInterpolation(g7.n.a((SystemClock.elapsedRealtime() - wyVar.r2) / max, 0.0f, 1.0f));
                                float f15 = i12;
                                float f16 = i13;
                                AndroidUtilities.cascade(a2, f15, f16, f16 / 5.0f);
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(interpolation, f15, f16, f17);
                                int i14 = i13 / 4;
                                f14 *= (this.M.getInterpolation(AndroidUtilities.cascade(interpolation, i12 + i14, i13 + i14, f17)) * 0.5f) + 0.5f;
                                f12 *= cascade;
                                k5Var.setAlpha((int) (255.0f * f12));
                                k5Var.setBounds(rect);
                                k5Var.setColorFilter(wyVar.a2);
                                if (f14 == 1.0f) {
                                    canvas.save();
                                    canvas.scale(f14, f14, rect.centerX(), rect.centerY());
                                    k5Var.draw(canvas);
                                    canvas.restore();
                                } else {
                                    k5Var.draw(canvas);
                                }
                            }
                        }
                    } else {
                        i9 = i10;
                    }
                    k5Var.setAlpha((int) (255.0f * f12));
                    k5Var.setBounds(rect);
                    k5Var.setColorFilter(wyVar.a2);
                    if (f14 == 1.0f) {
                    }
                }
                i10 = i9 + 1;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 >= arrayList.size()) {
                this.N.b3.L.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((fy) arrayList.get(i9)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.G].release();
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void i(long j10) {
        k5 k5Var;
        wy wyVar = this.N.b3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i9 = 0; i9 < this.K.size(); i9++) {
            fy fyVar = (fy) this.K.get(i9);
            t5 span = fyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = fyVar.f;
            if (span != null && (k5Var = (k5) wyVar.Z1.get(fyVar.d.getDocumentId())) != null && k5Var.k != null) {
                k5Var.t(j10);
                ih.z2 z2Var = k5Var.k;
                int i10 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = z2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i10], i10);
                backgroundThreadDrawHolderArr[i10] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                k5Var.setAlpha(255);
                int height = (int) (fyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((fyVar.getPaddingLeft() + fyVar.getLeft()) - this.J, height, (fyVar.getRight() - fyVar.getPaddingRight()) - this.J, ((fyVar.getMeasuredHeight() + height) - fyVar.getPaddingTop()) - fyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i10].setBounds(rect);
                fyVar.b = k5Var;
                backgroundThreadDrawHolderArr[i10].colorFilter = k5Var.c() ? wyVar.a2 : null;
                arrayList.add(fyVar);
            }
        }
    }
}
