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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ky extends yt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ my R;

    public ky(my myVar) {
        this.R = myVar;
    }

    @Override // org.telegram.ui.Components.yt
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        int i12;
        my myVar = this.R;
        a00 a00Var = myVar.d3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = a00Var.u2 > 0 && SystemClock.elapsedRealtime() - a00Var.u2 < myVar.x1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                iz izVar = (iz) this.O.get(i13);
                if (izVar.h != 0.0f || izVar.n != null || ((i12 = izVar.a) > a00Var.s2 && i12 < a00Var.t2 && z12)) {
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

    @Override // org.telegram.ui.Components.yt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            iz izVar = (iz) arrayList.get(i10);
            s5 s5Var = izVar.b;
            if (s5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = izVar.f[this.K];
                ai.m4 m4Var = s5Var.k;
                if (m4Var != null) {
                    m4Var.setAlpha(s5Var.l);
                    s5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    @Override // org.telegram.ui.Components.yt
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
        my myVar = this.R;
        a00 a00Var = myVar.d3;
        if (this.O != null) {
            canvas.save();
            float f13 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f14 = f7;
            while (i11 < this.O.size()) {
                iz izVar = (iz) this.O.get(i11);
                if (izVar.getSpan() == null || (s5Var = (s5) a00Var.d2.get(izVar.d.getDocumentId())) == null) {
                    f10 = f13;
                    i10 = i11;
                } else {
                    int height = (int) (izVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(izVar.getPaddingLeft() + izVar.getLeft(), height, izVar.getRight() - izVar.getPaddingRight(), ((izVar.getMeasuredHeight() + height) - izVar.getPaddingBottom()) - izVar.getPaddingTop());
                    float f15 = izVar.h;
                    float f16 = f15 != f13 ? (((1.0f - f15) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (a00Var.u2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - a00Var.u2 < myVar.x1()) {
                            if (a00Var.s2 >= 0 && a00Var.t2 >= 0 && a00Var.u2 > 0) {
                                int R = RecyclerView.R(izVar);
                                int i12 = a00Var.s2;
                                int i13 = R - i12;
                                int i14 = a00Var.t2 - i12;
                                if (i13 >= 0 && i13 < i14) {
                                    float max = Math.max(600L, Math.min(55, r7 - i12) * 40);
                                    s5Var2 = s5Var;
                                    f10 = 0.0f;
                                    float a2 = w7.o.a(com.google.android.gms.internal.vision.e2.u(max, 0.45f, SystemClock.elapsedRealtime() - a00Var.u2, Math.max(400L, Math.min(45, a00Var.t2 - a00Var.s2) * 35)), 0.0f, 1.0f);
                                    float f17 = f16;
                                    float interpolation = hs.g.getInterpolation(w7.o.a((SystemClock.elapsedRealtime() - a00Var.u2) / max, 0.0f, 1.0f));
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
                                    s5Var2.setColorFilter(a00Var.e2);
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
                            s5Var2.setColorFilter(a00Var.e2);
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
                    s5Var2.setColorFilter(a00Var.e2);
                    if (f12 != 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f13 = f10;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.d3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((iz) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.yt
    public final void i(long j3) {
        s5 s5Var;
        a00 a00Var = this.R.d3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            iz izVar = (iz) this.O.get(i10);
            b6 span = izVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = izVar.f;
            if (span != null && (s5Var = (s5) a00Var.d2.get(izVar.d.getDocumentId())) != null && s5Var.k != null) {
                s5Var.t(j3);
                ai.m4 m4Var = s5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = m4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                s5Var.setAlpha(255);
                int height = (int) (izVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((izVar.getPaddingLeft() + izVar.getLeft()) - this.N, height, (izVar.getRight() - izVar.getPaddingRight()) - this.N, ((izVar.getMeasuredHeight() + height) - izVar.getPaddingTop()) - izVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                izVar.b = s5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = s5Var.c() ? a00Var.e2 : null;
                arrayList.add(izVar);
            }
        }
    }
}
