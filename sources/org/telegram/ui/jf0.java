package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jf0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf0(vf0 vf0Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = vf0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                vf0 vf0Var = this.b;
                kf0 kf0Var = vf0Var.a0;
                kf0Var.e(canvas);
                ArrayList arrayList = kf0Var.G;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ex exVar = (ex) k2.p1.h(1, arrayList);
                    ImageReceiver imageReceiver = exVar.r;
                    org.telegram.messenger.ac acVar = imageReceiver.g0;
                    if (acVar == null) {
                        acVar = imageReceiver.P;
                    }
                    if (acVar == null) {
                        acVar = imageReceiver.X;
                    }
                    if (acVar != null) {
                        if (exVar.s == null) {
                            TLRPC.Document document = acVar.i;
                            if (document != null) {
                                exVar.s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                exVar.s = org.telegram.messenger.w7.r("tgs", acVar.f);
                            }
                        }
                        if (exVar.s != null) {
                            Float w10 = org.telegram.messenger.zb.D().w(exVar.s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    vf0Var.X.f(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!kf0Var.G.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                vf0 vf0Var2 = this.b;
                if (vf0Var2.E <= 0.0f || vf0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    vf0Var2.n.reset();
                    float width = getWidth() / vf0Var2.e.getWidth();
                    vf0Var2.n.postScale(width, width);
                    vf0Var2.f.setLocalMatrix(vf0Var2.n);
                    vf0Var2.h.setAlpha((int) (vf0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), vf0Var2.h);
                }
                super.dispatchDraw(canvas2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                vf0 vf0Var = this.b;
                if (!vf0Var.g0 || vf0Var.h0) {
                    ArrayList arrayList = vf0Var.N;
                    rf0 rf0Var = vf0Var.K;
                    if (vf0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, vf0Var.W.getWidth() - vf0Var.W.l(), r2), 0};
                        vf0Var.W.getLocationOnScreen(iArr);
                        int i13 = iArr[0];
                        vf0Var.X.setScaleX(vf0Var.W.getScaleX());
                        vf0Var.X.setScaleY(vf0Var.W.getScaleY());
                        int[] iArr2 = vf0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (rf0Var.getMeasuredHeight() - vf0Var.X.getHeight()) + (vf0Var.e0 != null ? org.telegram.messenger.g0.L(320.0f) : 0);
                        int L = org.telegram.messenger.g0.L(8.0f) + vf0Var.d.b;
                        int L2 = org.telegram.messenger.g0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = vf0Var.Z;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (vf0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - vf0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (vf0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - vf0Var.W.getHeight();
                        }
                        vf0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (r2.getWidth() - vf0Var.X.l())));
                        vf0Var.X.setY(iArr[1]);
                        if (vf0Var.m0) {
                            iArr[0] = iArr[0] - (vf0Var.Y - vf0Var.W.l());
                        }
                        rf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - rf0Var.getMeasuredWidth());
                        if (vf0Var.g0) {
                            org.telegram.messenger.camera.q.l(rf0Var.animate().translationY(((vf0Var.X.getHeight() + iArr[1]) - rf0Var.getMeasuredHeight()) - rf0Var.getTop()), ni.l.V, 250L);
                        } else {
                            rf0Var.setY((vf0Var.X.getHeight() + iArr[1]) - rf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = vf0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - vf0Var.Z.getMeasuredWidth());
                            vf0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.g0.L(6.0f) : vf0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = vf0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(k2.p1.d(6.0f, (vf0Var.X.l() + iArr[0]) - vf0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = vf0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = vf0Var.d0;
                                float max = Math.max(vf0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                vf0Var.c0 = max;
                                frameLayout2.setY(max);
                                mf0 mf0Var = vf0Var.e0;
                                if (mf0Var != null) {
                                    mf0Var.setY(Math.max(vf0Var.d.b, (vf0Var.l0.top - org.telegram.messenger.g0.L(24.0f)) - vf0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (vf0Var.X.getHeight() + iArr[1]) - rf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = vf0Var.d0;
                                float max2 = Math.max(vf0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                vf0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                mf0 mf0Var2 = vf0Var.e0;
                                if (mf0Var2 != null) {
                                    mf0Var2.setY(Math.max(0.0f, (height - mf0Var2.getMeasuredHeight()) - vf0Var.c0));
                                }
                            }
                        }
                    }
                    vf0Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i3, i10, i11, i12);
                vf0 vf0Var = this.b;
                jh.d.c(vf0Var.j0, vf0Var.F);
                ViewGroup viewGroup = vf0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }
}
