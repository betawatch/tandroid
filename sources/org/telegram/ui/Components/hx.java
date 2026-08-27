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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hx extends us {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public final OvershootInterpolator M = new OvershootInterpolator(3.0f);
    public final /* synthetic */ jx N;

    public hx(jx jxVar) {
        this.N = jxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j10, int i10, int i11, float f10) {
        boolean z10;
        int i12;
        yy yyVar = this.N.b3;
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        boolean z12 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z12) {
            if (yyVar.r2 > 0) {
                if (SystemClock.elapsedRealtime() - yyVar.r2 < Math.max(400L, Math.min(45, yyVar.q2 - yyVar.p2) * 35) + Math.max(600L, Math.min(55, yyVar.q2 - yyVar.p2) * 40) + 150) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.K.size(); i13++) {
                        gy gyVar = (gy) this.K.get(i13);
                        if (gyVar.h != 0.0f || gyVar.n != null || ((i12 = gyVar.a) > yyVar.p2 && i12 < yyVar.q2 && z10)) {
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

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                return;
            }
            gy gyVar = (gy) arrayList.get(i10);
            k5 k5Var = gyVar.b;
            if (k5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = gyVar.f[this.G];
                jh.y2 y2Var = k5Var.k;
                if (y2Var != null) {
                    y2Var.setAlpha(k5Var.l);
                    k5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f10) {
        int i10;
        k5 k5Var;
        yy yyVar = this.N.b3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f12 = f10;
            int i11 = 0;
            while (i11 < this.K.size()) {
                gy gyVar = (gy) this.K.get(i11);
                if (gyVar.getSpan() == null || (k5Var = (k5) yyVar.Z1.get(gyVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (gyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(gyVar.getPaddingLeft() + gyVar.getLeft(), height, gyVar.getRight() - gyVar.getPaddingRight(), ((gyVar.getMeasuredHeight() + height) - gyVar.getPaddingBottom()) - gyVar.getPaddingTop());
                    float f13 = gyVar.h;
                    float f14 = f13 != f11 ? (((1.0f - f13) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (yyVar.r2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - yyVar.r2 < Math.max(400L, Math.min(45, yyVar.q2 - yyVar.p2) * 35) + Math.max(600L, Math.min(55, yyVar.q2 - yyVar.p2) * 40) + 150 && yyVar.p2 >= 0 && yyVar.q2 >= 0 && yyVar.r2 > 0) {
                            int R = RecyclerView.R(gyVar);
                            int i12 = yyVar.p2;
                            int i13 = R - i12;
                            int i14 = yyVar.q2 - i12;
                            if (i13 >= 0 && i13 < i14) {
                                float max = Math.max(600L, Math.min(55, r6 - i12) * 40);
                                float a2 = h7.n.a(com.google.android.recaptcha.internal.a.w(max, 0.45f, SystemClock.elapsedRealtime() - yyVar.r2, Math.max(400L, Math.min(45, yyVar.q2 - yyVar.p2) * 35)), 0.0f, 1.0f);
                                float interpolation = er.g.getInterpolation(h7.n.a((SystemClock.elapsedRealtime() - yyVar.r2) / max, 0.0f, 1.0f));
                                float f15 = i13;
                                float f16 = i14;
                                AndroidUtilities.cascade(a2, f15, f16, f16 / 5.0f);
                                float f17 = f16 / 4.0f;
                                float cascade = AndroidUtilities.cascade(interpolation, f15, f16, f17);
                                int i15 = i14 / 4;
                                f14 *= (this.M.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f17)) * 0.5f) + 0.5f;
                                f12 *= cascade;
                                k5Var.setAlpha((int) (255.0f * f12));
                                k5Var.setBounds(rect);
                                k5Var.setColorFilter(yyVar.a2);
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
                        i10 = i11;
                    }
                    k5Var.setAlpha((int) (255.0f * f12));
                    k5Var.setBounds(rect);
                    k5Var.setColorFilter(yyVar.a2);
                    if (f14 == 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 >= arrayList.size()) {
                this.N.b3.L.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((gy) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.G].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void i(long j10) {
        k5 k5Var;
        yy yyVar = this.N.b3;
        ArrayList arrayList = this.L;
        arrayList.clear();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            gy gyVar = (gy) this.K.get(i10);
            t5 span = gyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = gyVar.f;
            if (span != null && (k5Var = (k5) yyVar.Z1.get(gyVar.d.getDocumentId())) != null && k5Var.k != null) {
                k5Var.t(j10);
                jh.y2 y2Var = k5Var.k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                k5Var.setAlpha(255);
                int height = (int) (gyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((gyVar.getPaddingLeft() + gyVar.getLeft()) - this.J, height, (gyVar.getRight() - gyVar.getPaddingRight()) - this.J, ((gyVar.getMeasuredHeight() + height) - gyVar.getPaddingTop()) - gyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                gyVar.b = k5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = k5Var.c() ? yyVar.a2 : null;
                arrayList.add(gyVar);
            }
        }
    }
}
