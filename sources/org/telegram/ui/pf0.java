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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pf0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf0(bg0 bg0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = bg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                bg0 bg0Var = this.b;
                qf0 qf0Var = bg0Var.a0;
                qf0Var.e(canvas);
                ArrayList arrayList = qf0Var.G;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ix ixVar = (ix) i5.c.h(1, arrayList);
                    ImageReceiver imageReceiver = ixVar.r;
                    org.telegram.messenger.gc gcVar = imageReceiver.g0;
                    if (gcVar == null) {
                        gcVar = imageReceiver.P;
                    }
                    if (gcVar == null) {
                        gcVar = imageReceiver.X;
                    }
                    if (gcVar != null) {
                        if (ixVar.s == null) {
                            TLRPC.Document document = gcVar.i;
                            if (document != null) {
                                ixVar.s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                ixVar.s = org.telegram.messenger.w7.r("tgs", gcVar.f);
                            }
                        }
                        if (ixVar.s != null) {
                            Float w10 = org.telegram.messenger.fc.D().w(ixVar.s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    bg0Var.X.g(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!qf0Var.G.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                bg0 bg0Var2 = this.b;
                if (bg0Var2.E <= 0.0f || bg0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    bg0Var2.n.reset();
                    float width = getWidth() / bg0Var2.e.getWidth();
                    bg0Var2.n.postScale(width, width);
                    bg0Var2.f.setLocalMatrix(bg0Var2.n);
                    bg0Var2.h.setAlpha((int) (bg0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), bg0Var2.h);
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                bg0 bg0Var = this.b;
                if (!bg0Var.g0 || bg0Var.h0) {
                    ArrayList arrayList = bg0Var.N;
                    xf0 xf0Var = bg0Var.K;
                    if (bg0Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        bg0Var.d(iArr);
                        bg0Var.X.setScaleX(bg0Var.W.getScaleX());
                        bg0Var.X.setScaleY(bg0Var.W.getScaleY());
                        int[] iArr2 = bg0Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (xf0Var.getMeasuredHeight() - bg0Var.X.getHeight()) + (bg0Var.e0 != null ? org.telegram.messenger.g0.L(320.0f) : 0);
                        int L = org.telegram.messenger.g0.L(8.0f) + bg0Var.d.b;
                        int L2 = org.telegram.messenger.g0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = bg0Var.Z;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (bg0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - bg0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (bg0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - bg0Var.W.getHeight();
                        }
                        bg0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (r1.getWidth() - bg0Var.X.l())));
                        bg0Var.X.setY(iArr[1]);
                        if (bg0Var.p0) {
                            iArr[0] = iArr[0] - (bg0Var.Y - bg0Var.W.l());
                        }
                        xf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - xf0Var.getMeasuredWidth());
                        if (bg0Var.g0) {
                            org.telegram.messenger.i20.n(xf0Var.animate().translationY(((bg0Var.X.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight()) - xf0Var.getTop()), pi.k.V, 250L);
                        } else {
                            xf0Var.setY((bg0Var.X.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = bg0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - bg0Var.Z.getMeasuredWidth());
                            bg0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.g0.L(6.0f) : bg0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = bg0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i5.c.d(6.0f, (bg0Var.X.l() + iArr[0]) - bg0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = bg0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = bg0Var.d0;
                                float max = Math.max(bg0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                bg0Var.c0 = max;
                                frameLayout2.setY(max);
                                sf0 sf0Var = bg0Var.e0;
                                if (sf0Var != null) {
                                    sf0Var.setY(Math.max(bg0Var.d.b, (bg0Var.l0.top - org.telegram.messenger.g0.L(24.0f)) - bg0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (bg0Var.X.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = bg0Var.d0;
                                float max2 = Math.max(bg0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                bg0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                sf0 sf0Var2 = bg0Var.e0;
                                if (sf0Var2 != null) {
                                    sf0Var2.setY(Math.max(0.0f, (height - sf0Var2.getMeasuredHeight()) - bg0Var.c0));
                                }
                            }
                        }
                    }
                    bg0Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                bg0 bg0Var = this.b;
                ih.d.c(bg0Var.j0, bg0Var.F);
                ViewGroup viewGroup = bg0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
