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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                qf0 qf0Var = bg0Var.Z;
                qf0Var.e(canvas);
                ArrayList arrayList = qf0Var.F;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    hx hxVar = (hx) jg.g.i(1, arrayList);
                    ImageReceiver imageReceiver = hxVar.r;
                    org.telegram.messenger.hc hcVar = imageReceiver.f0;
                    if (hcVar == null) {
                        hcVar = imageReceiver.O;
                    }
                    if (hcVar == null) {
                        hcVar = imageReceiver.W;
                    }
                    if (hcVar != null) {
                        if (hxVar.s == null) {
                            TLRPC.Document document = hcVar.i;
                            if (document != null) {
                                hxVar.s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                hxVar.s = org.telegram.messenger.w7.r("tgs", hcVar.f);
                            }
                        }
                        if (hxVar.s != null) {
                            Float w10 = org.telegram.messenger.gc.D().w(hxVar.s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    bg0Var.W.f(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!qf0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                bg0 bg0Var2 = this.b;
                if (bg0Var2.D <= 0.0f || bg0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    bg0Var2.n.reset();
                    float width = getWidth() / bg0Var2.e.getWidth();
                    bg0Var2.n.postScale(width, width);
                    bg0Var2.f.setLocalMatrix(bg0Var2.n);
                    bg0Var2.h.setAlpha((int) (bg0Var2.D * 255.0f));
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                bg0 bg0Var = this.b;
                if (!bg0Var.f0 || bg0Var.g0) {
                    ArrayList arrayList = bg0Var.M;
                    xf0 xf0Var = bg0Var.J;
                    if (bg0Var.E.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, bg0Var.V.getWidth() - bg0Var.V.l(), r2), 0};
                        bg0Var.V.getLocationOnScreen(iArr);
                        int i13 = iArr[0];
                        bg0Var.W.setScaleX(bg0Var.V.getScaleX());
                        bg0Var.W.setScaleY(bg0Var.V.getScaleY());
                        int[] iArr2 = bg0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (xf0Var.getMeasuredHeight() - bg0Var.W.getHeight()) + (bg0Var.d0 != null ? org.telegram.messenger.g0.L(320.0f) : 0);
                        int L = org.telegram.messenger.g0.L(8.0f) + bg0Var.d.b;
                        int L2 = org.telegram.messenger.g0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = bg0Var.Y;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (bg0Var.F.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - bg0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (bg0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - bg0Var.V.getHeight();
                        }
                        bg0Var.W.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (r2.getWidth() - bg0Var.W.l())));
                        bg0Var.W.setY(iArr[1]);
                        if (bg0Var.l0) {
                            iArr[0] = iArr[0] - (bg0Var.X - bg0Var.V.l());
                        }
                        xf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - xf0Var.getMeasuredWidth());
                        if (bg0Var.f0) {
                            org.telegram.messenger.camera.q.l(xf0Var.animate().translationY(((bg0Var.W.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight()) - xf0Var.getTop()), mi.l.V, 250L);
                        } else {
                            xf0Var.setY((bg0Var.W.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = bg0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - bg0Var.Y.getMeasuredWidth());
                            bg0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.g0.L(6.0f) : bg0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = bg0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(jg.g.e(6.0f, (bg0Var.W.l() + iArr[0]) - bg0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = bg0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = bg0Var.c0;
                                float max = Math.max(bg0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                bg0Var.b0 = max;
                                frameLayout2.setY(max);
                                sf0 sf0Var = bg0Var.d0;
                                if (sf0Var != null) {
                                    sf0Var.setY(Math.max(bg0Var.d.b, (bg0Var.k0.top - org.telegram.messenger.g0.L(24.0f)) - bg0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (bg0Var.W.getHeight() + iArr[1]) - xf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = bg0Var.c0;
                                float max2 = Math.max(bg0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                bg0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                sf0 sf0Var2 = bg0Var.d0;
                                if (sf0Var2 != null) {
                                    sf0Var2.setY(Math.max(0.0f, (height - sf0Var2.getMeasuredHeight()) - bg0Var.b0));
                                }
                            }
                        }
                    }
                    bg0Var.f0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                bg0 bg0Var = this.b;
                ih.d.c(bg0Var.i0, bg0Var.E);
                ViewGroup viewGroup = bg0Var.Y;
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
