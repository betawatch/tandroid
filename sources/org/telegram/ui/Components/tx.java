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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class tx extends ht {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ vx R;

    public tx(vx vxVar) {
        this.R = vxVar;
    }

    @Override // org.telegram.ui.Components.ht
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        int i12;
        vx vxVar = this.R;
        kz kzVar = vxVar.f3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z11) {
            boolean z12 = kzVar.u2 > 0 && SystemClock.elapsedRealtime() - kzVar.u2 < vxVar.x1();
            for (int i13 = 0; i13 < this.O.size(); i13++) {
                ty tyVar = (ty) this.O.get(i13);
                if (tyVar.h != 0.0f || tyVar.n != null || ((i12 = tyVar.a) > kzVar.s2 && i12 < kzVar.t2 && z12)) {
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

    @Override // org.telegram.ui.Components.ht
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            ty tyVar = (ty) arrayList.get(i10);
            o5 o5Var = tyVar.b;
            if (o5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = tyVar.f[this.K];
                ai.l4 l4Var = o5Var.k;
                if (l4Var != null) {
                    l4Var.setAlpha(o5Var.l);
                    o5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0188  */
    @Override // org.telegram.ui.Components.ht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        Canvas canvas2;
        int i10;
        vx vxVar;
        o5 o5Var;
        Canvas canvas3 = canvas;
        vx vxVar2 = this.R;
        kz kzVar = vxVar2.f3;
        if (this.O != null) {
            canvas3.save();
            float f10 = 0.0f;
            canvas3.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                ty tyVar = (ty) this.O.get(i11);
                if (tyVar.getSpan() == null || (o5Var = (o5) kzVar.d2.get(tyVar.d.getDocumentId())) == null) {
                    canvas2 = canvas3;
                    i10 = i11;
                    vxVar = vxVar2;
                } else {
                    int height = (int) (tyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(tyVar.getPaddingLeft() + tyVar.getLeft(), height, tyVar.getRight() - tyVar.getPaddingRight(), ((tyVar.getMeasuredHeight() + height) - tyVar.getPaddingBottom()) - tyVar.getPaddingTop());
                    float f12 = tyVar.h;
                    float f13 = f12 != f10 ? (((1.0f - f12) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (kzVar.u2 > 0 && SystemClock.elapsedRealtime() - kzVar.u2 < vxVar2.x1() && kzVar.s2 >= 0 && kzVar.t2 >= 0 && kzVar.u2 > 0) {
                        int S = RecyclerView.S(tyVar);
                        int i12 = kzVar.s2;
                        int i13 = S - i12;
                        int i14 = kzVar.t2 - i12;
                        if (i13 >= 0 && i13 < i14) {
                            i10 = i11;
                            float max = Math.max(600L, Math.min(55, r13 - i12) * 40);
                            vxVar = vxVar2;
                            float a2 = w7.p.a(com.google.android.gms.internal.vision.e2.v(max, 0.45f, SystemClock.elapsedRealtime() - kzVar.u2, Math.max(400L, Math.min(45, kzVar.t2 - kzVar.s2) * 35)), 0.0f, 1.0f);
                            float f14 = f11;
                            float interpolation = qr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - kzVar.u2) / max, 0.0f, 1.0f));
                            float f15 = i13;
                            float f16 = i14;
                            AndroidUtilities.cascade(a2, f15, f16, f16 / 5.0f);
                            float f17 = f16 / 4.0f;
                            float cascade = AndroidUtilities.cascade(interpolation, f15, f16, f17);
                            int i15 = i14 / 4;
                            f13 *= (this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f17)) * 0.5f) + 0.5f;
                            f11 = cascade * f14;
                            o5Var.setAlpha((int) (255.0f * f11));
                            o5Var.setBounds(rect);
                            o5Var.setColorFilter(kzVar.e2);
                            if (f13 == 1.0f) {
                                canvas.save();
                                canvas2 = canvas;
                                canvas2.scale(f13, f13, rect.centerX(), rect.centerY());
                                o5Var.draw(canvas2);
                                canvas2.restore();
                            } else {
                                canvas2 = canvas;
                                o5Var.draw(canvas2);
                            }
                        }
                    }
                    i10 = i11;
                    vxVar = vxVar2;
                    f11 = f11;
                    o5Var.setAlpha((int) (255.0f * f11));
                    o5Var.setBounds(rect);
                    o5Var.setColorFilter(kzVar.e2);
                    if (f13 == 1.0f) {
                    }
                }
                vxVar2 = vxVar;
                i11 = i10 + 1;
                canvas3 = canvas2;
                f10 = 0.0f;
            }
            canvas3.restore();
        }
    }

    @Override // org.telegram.ui.Components.ht
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                this.R.f3.P.invalidate();
                return;
            }
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = ((ty) arrayList.get(i10)).f;
            if (backgroundThreadDrawHolderArr != null) {
                backgroundThreadDrawHolderArr[this.K].release();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.ht
    public final void i(long j3) {
        o5 o5Var;
        kz kzVar = this.R.f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ty tyVar = (ty) this.O.get(i10);
            x5 span = tyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = tyVar.f;
            if (span != null && (o5Var = (o5) kzVar.d2.get(tyVar.d.getDocumentId())) != null && o5Var.k != null) {
                o5Var.t(j3);
                ai.l4 l4Var = o5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = l4Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                o5Var.setAlpha(255);
                int height = (int) (tyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((tyVar.getPaddingLeft() + tyVar.getLeft()) - this.N, height, (tyVar.getRight() - tyVar.getPaddingRight()) - this.N, ((tyVar.getMeasuredHeight() + height) - tyVar.getPaddingTop()) - tyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                tyVar.b = o5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = o5Var.c() ? kzVar.e2 : null;
                arrayList.add(tyVar);
            }
        }
    }
}
