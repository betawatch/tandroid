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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ux extends gt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final OvershootInterpolator Q = new OvershootInterpolator(3.0f);
    public final /* synthetic */ wx R;

    public ux(wx wxVar) {
        this.R = wxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j3, int i10, int i11, float f7) {
        boolean z10;
        int i12;
        kz kzVar = this.R.f3;
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        boolean z12 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        if (!z12) {
            if (kzVar.v2 > 0) {
                if (SystemClock.elapsedRealtime() - kzVar.v2 < Math.max(400L, Math.min(45, kzVar.u2 - kzVar.t2) * 35) + Math.max(600L, Math.min(55, kzVar.u2 - kzVar.t2) * 40) + 150) {
                    z10 = true;
                    for (int i13 = 0; i13 < this.O.size(); i13++) {
                        ty tyVar = (ty) this.O.get(i13);
                        if (tyVar.h != 0.0f || tyVar.n != null || ((i12 = tyVar.a) > kzVar.t2 && i12 < kzVar.u2 && z10)) {
                            break;
                        }
                    }
                }
            }
            z10 = false;
            while (i13 < this.O.size()) {
            }
        }
        z11 = z12;
        if (!z11) {
            super.a(canvas, j3, i10, i11, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // org.telegram.ui.Components.gt
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            ty tyVar = (ty) arrayList.get(i10);
            q5 q5Var = tyVar.b;
            if (q5Var != null) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = tyVar.f[this.K];
                bi.y3 y3Var = q5Var.k;
                if (y3Var != null) {
                    y3Var.setAlpha(q5Var.l);
                    q5Var.k.draw(canvas, backgroundThreadDrawHolder);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    @Override // org.telegram.ui.Components.gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, float f7) {
        int i10;
        q5 q5Var;
        kz kzVar = this.R.f3;
        if (this.O != null) {
            canvas.save();
            float f10 = 0.0f;
            canvas.translate(-this.N, 0.0f);
            float f11 = f7;
            int i11 = 0;
            while (i11 < this.O.size()) {
                ty tyVar = (ty) this.O.get(i11);
                if (tyVar.getSpan() == null || (q5Var = (q5) kzVar.d2.get(tyVar.d.getDocumentId())) == null) {
                    i10 = i11;
                } else {
                    int height = (int) (tyVar.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(tyVar.getPaddingLeft() + tyVar.getLeft(), height, tyVar.getRight() - tyVar.getPaddingRight(), ((tyVar.getMeasuredHeight() + height) - tyVar.getPaddingBottom()) - tyVar.getPaddingTop());
                    float f12 = tyVar.h;
                    float f13 = f12 != f10 ? (((1.0f - f12) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                    if (kzVar.v2 > 0) {
                        i10 = i11;
                        if (SystemClock.elapsedRealtime() - kzVar.v2 < Math.max(400L, Math.min(45, kzVar.u2 - kzVar.t2) * 35) + Math.max(600L, Math.min(55, kzVar.u2 - kzVar.t2) * 40) + 150 && kzVar.t2 >= 0 && kzVar.u2 >= 0 && kzVar.v2 > 0) {
                            int R = RecyclerView.R(tyVar);
                            int i12 = kzVar.t2;
                            int i13 = R - i12;
                            int i14 = kzVar.u2 - i12;
                            if (i13 >= 0 && i13 < i14) {
                                float max = Math.max(600L, Math.min(55, r6 - i12) * 40);
                                float a2 = w7.p.a(com.google.android.gms.internal.vision.e2.v(max, 0.45f, SystemClock.elapsedRealtime() - kzVar.v2, Math.max(400L, Math.min(45, kzVar.u2 - kzVar.t2) * 35)), 0.0f, 1.0f);
                                float interpolation = pr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - kzVar.v2) / max, 0.0f, 1.0f));
                                float f14 = i13;
                                float f15 = i14;
                                AndroidUtilities.cascade(a2, f14, f15, f15 / 5.0f);
                                float f16 = f15 / 4.0f;
                                float cascade = AndroidUtilities.cascade(interpolation, f14, f15, f16);
                                int i15 = i14 / 4;
                                f13 *= (this.Q.getInterpolation(AndroidUtilities.cascade(interpolation, i13 + i15, i14 + i15, f16)) * 0.5f) + 0.5f;
                                f11 *= cascade;
                                q5Var.setAlpha((int) (255.0f * f11));
                                q5Var.setBounds(rect);
                                q5Var.setColorFilter(kzVar.e2);
                                if (f13 == 1.0f) {
                                    canvas.save();
                                    canvas.scale(f13, f13, rect.centerX(), rect.centerY());
                                    q5Var.draw(canvas);
                                    canvas.restore();
                                } else {
                                    q5Var.draw(canvas);
                                }
                            }
                        }
                    } else {
                        i10 = i11;
                    }
                    q5Var.setAlpha((int) (255.0f * f11));
                    q5Var.setBounds(rect);
                    q5Var.setColorFilter(kzVar.e2);
                    if (f13 == 1.0f) {
                    }
                }
                i11 = i10 + 1;
                f10 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.gt
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

    @Override // org.telegram.ui.Components.gt
    public final void i(long j3) {
        q5 q5Var;
        kz kzVar = this.R.f3;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ty tyVar = (ty) this.O.get(i10);
            z5 span = tyVar.getSpan();
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = tyVar.f;
            if (span != null && (q5Var = (q5) kzVar.d2.get(tyVar.d.getDocumentId())) != null && q5Var.k != null) {
                q5Var.t(j3);
                bi.y3 y3Var = q5Var.k;
                int i11 = this.K;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = y3Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j3;
                drawInBackgroundThread.overrideAlpha = 1.0f;
                q5Var.setAlpha(255);
                int height = (int) (tyVar.getHeight() * 0.03f);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((tyVar.getPaddingLeft() + tyVar.getLeft()) - this.N, height, (tyVar.getRight() - tyVar.getPaddingRight()) - this.N, ((tyVar.getMeasuredHeight() + height) - tyVar.getPaddingTop()) - tyVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                tyVar.b = q5Var;
                backgroundThreadDrawHolderArr[i11].colorFilter = q5Var.c() ? kzVar.e2 : null;
                arrayList.add(tyVar);
            }
        }
    }
}
