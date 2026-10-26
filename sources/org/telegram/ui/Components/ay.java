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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ay extends st {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ dy R;

    public ay(dy dyVar) {
        this.R = dyVar;
    }

    @Override // org.telegram.ui.Components.st
    public final void a(Canvas canvas, long j10, int i10, int i11, float f7) {
        int i12;
        dy dyVar = this.R;
        sz szVar = dyVar.n3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = szVar.v2 > 0 && SystemClock.elapsedRealtime() - szVar.v2 < dyVar.C1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                bz bzVar = (bz) this.O.get(i13);
                if (bzVar.h != 0.0f || bzVar.n != null || ((i12 = bzVar.a) > szVar.t2 && i12 < szVar.u2 && z12)) {
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

    @Override // org.telegram.ui.Components.st
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            bz bzVar = (bz) arrayList.get(i10);
            t5 t5Var = bzVar.b;
            if (t5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = bzVar.f[this.K];
                di.f3 f3Var = t5Var.k;
                if (f3Var != null) {
                    f3Var.setAlpha(t5Var.l);
                    t5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.st
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        t5 t5Var;
        t5 t5Var2;
        float f11;
        float f12;
        dy dyVar = this.R;
        sz szVar = dyVar.n3;
        if (this.O != null) {
            canvas.save();
            float f13 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f14 = f7;
            while (i11 < this.O.size()) {
                bz bzVar = (bz) this.O.get(i11);
                if (bzVar.getSpan() == null || (t5Var = (t5) szVar.d2.get(bzVar.d.getDocumentId())) == null) {
                    f10 = f13;
                    i10 = i11;
                } else {
                    int height = (int) (bzVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(bzVar.getPaddingLeft() + bzVar.getLeft(), height, bzVar.getRight() - bzVar.getPaddingRight(), ((bzVar.getMeasuredHeight() + height) - bzVar.getPaddingBottom()) - bzVar.getPaddingTop());
                    float f15 = bzVar.h;
                    float f16 = f15 != f13 ? (((1.0f - f15) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (szVar.v2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - szVar.v2 < dyVar.C1()) {
                            if (szVar.t2 >= 0 && szVar.u2 >= 0 && szVar.v2 > 0) {
                                int R = RecyclerView.R(bzVar);
                                int i12 = szVar.t2;
                                int i13 = R - i12;
                                int i14 = szVar.u2 - i12;
                                if (i13 >= 0 && i13 < i14) {
                                    float max = Math.max(600L, Math.min(55, r7 - i12) * 40);
                                    t5Var2 = t5Var;
                                    f10 = 0.0f;
                                    float a2 = a8.ee.a(c3.h0.f(max, 0.45f, SystemClock.elapsedRealtime() - szVar.v2, Math.max(400L, Math.min(45, szVar.u2 - szVar.t2) * 35)), 0.0f, 1.0f);
                                    float f17 = f16;
                                    float interpolation = ds.g.getInterpolation(a8.ee.a((SystemClock.elapsedRealtime() - szVar.v2) / max, 0.0f, 1.0f));
                                    float f18 = i13;
                                    float f19 = i14;
                                    AndroidUtilities.cascade(a2, f18, f19, f19 / 5.0f);
                                    float f20 = f19 / 4.0f;
                                    float cascade = AndroidUtilities.cascade(interpolation, f18, f19, f20);
                                    int i15 = i14 / 4;
                                    f12 = ((this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f20)) * 0.5f) + 0.5f) * f17;
                                    f14 *= cascade;
                                    t5Var2.setAlpha((int) (255.0f * f14));
                                    t5Var2.setBounds(rect);
                                    t5Var2.setColorFilter(szVar.e2);
                                    if (f12 != 1.0f) {
                                        canvas.save();
                                        canvas.scale(f12, f12, rect.centerX(), rect.centerY());
                                        t5Var2.draw(canvas);
                                        canvas.restore();
                                    } else {
                                        t5Var2.draw(canvas);
                                    }
                                }
                            }
                            t5Var2 = t5Var;
                            f11 = f16;
                            f10 = 0.0f;
                            f12 = f11;
                            t5Var2.setAlpha((int) (255.0f * f14));
                            t5Var2.setBounds(rect);
                            t5Var2.setColorFilter(szVar.e2);
                            if (f12 != 1.0f) {
                            }
                        } else {
                            f10 = 0.0f;
                        }
                    } else {
                        f10 = f13;
                        i10 = i11;
                    }
                    t5Var2 = t5Var;
                    f11 = f16;
                    f12 = f11;
                    t5Var2.setAlpha((int) (255.0f * f14));
                    t5Var2.setBounds(rect);
                    t5Var2.setColorFilter(szVar.e2);
                    if (f12 != 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f13 = f10;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.n3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((bz) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.st
    public final void i(long j10) {
        t5 t5Var;
        sz szVar = this.R.n3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            bz bzVar = (bz) this.O.get(i10);
            c6 span = bzVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = bzVar.f;
            if (span != null && (t5Var = (t5) szVar.d2.get(bzVar.d.getDocumentId())) != null && t5Var.k != null) {
                t5Var.t(j10);
                di.f3 f3Var = t5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = f3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                t5Var.setAlpha(255);
                int height = (int) (bzVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((bzVar.getPaddingLeft() + bzVar.getLeft()) - this.N, height, (bzVar.getRight() - bzVar.getPaddingRight()) - this.N, ((bzVar.getMeasuredHeight() + height) - bzVar.getPaddingTop()) - bzVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                bzVar.b = t5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = t5Var.c() ? szVar.e2 : null;
                arrayList.add(bzVar);
            }
        }
    }
}
