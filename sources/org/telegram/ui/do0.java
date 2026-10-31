package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class do0 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do0(Context context) {
        super(context);
        this.a = 8;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 10:
                super.dispatchDraw(canvas);
                vh.v3 v3Var = ((vh.s7) this.b).x0;
                if (v3Var != null) {
                    v3Var.d(canvas);
                    break;
                }
                break;
            case 11:
                canvas.save();
                vh.o8 o8Var = (vh.o8) this.b;
                canvas.translate(o8Var.c1.getX() + o8Var.l0.getX(), o8Var.c1.getY() + o8Var.l0.getY());
                vh.e8 e8Var = o8Var.c1;
                e8Var.k(canvas, e8Var.getBounds(), o8Var.c1.getOver2Alpha());
                canvas.restore();
                break;
            case 16:
                tg.c cVar = ((zg.e) this.b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 8:
                super.onAttachedToWindow();
                ph.i1 i1Var = (ph.i1) this.b;
                if (i1Var != null && !i1Var.i) {
                    i1Var.i = true;
                    i1Var.a();
                    ph.h1 h1Var = new ph.h1(i1Var, 0);
                    i1Var.h = h1Var;
                    org.telegram.messenger.sc.a(h1Var);
                    break;
                }
                break;
            case 15:
                super.onAttachedToWindow();
                ((zf.c1) this.b).f = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 8:
                super.onDetachedFromWindow();
                ph.i1 i1Var = (ph.i1) this.b;
                if (i1Var != null && i1Var.i) {
                    i1Var.i = false;
                    i1Var.a();
                    ph.h1 h1Var = i1Var.h;
                    HashSet hashSet = org.telegram.messenger.sc.n;
                    if (hashSet != null) {
                        hashSet.remove(h1Var);
                        break;
                    }
                }
                break;
            case 15:
                super.onDetachedFromWindow();
                ((zf.c1) this.b).f = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                lo0 lo0Var = (lo0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, lo0Var.c.size())));
                int max = Math.max(org.telegram.messenger.i0.L(16.0f) + ((int) Math.ceil(lo0Var.h0.measureText(format))), org.telegram.messenger.i0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                lo0Var.h0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.C5, false));
                lo0Var.j0.setColor(org.telegram.ui.ActionBar.t6.x0(null, lo0Var.u0, false));
                int i10 = max / 2;
                lo0Var.i0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(lo0Var.i0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), lo0Var.j0);
                lo0Var.j0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B5, false));
                lo0Var.i0.set(org.telegram.messenger.i0.L(2.0f) + r7, org.telegram.messenger.i0.L(2.0f), r4 - org.telegram.messenger.i0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
                canvas.drawRoundRect(lo0Var.i0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), lo0Var.j0);
                canvas.drawText(format, measuredWidth - (r3 / 2), org.telegram.messenger.i0.L(16.2f), lo0Var.h0);
                break;
            case 1:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 4:
                ((SecretMediaViewer) this.b).O.a(canvas, this);
                break;
            case 7:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) this.b;
                float e = l6Var.K.e(false, l6Var.J);
                if (l6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.l6.a(l6Var, canvas, e);
                    break;
                }
                break;
            case 14:
                super.onDraw(canvas);
                yh.a0 a0Var = (yh.a0) this.b;
                rf.w wVar = a0Var.B1;
                float max2 = Math.max(a0Var.i1.e, a0Var.j1.e);
                rf.w wVar2 = a0Var.A1;
                wVar2.c(org.telegram.messenger.i0.L(42.0f) + a0Var.L1.b, 0);
                wVar2.setBounds(0, 0, getWidth(), org.telegram.messenger.i0.L(56.0f) + a0Var.L1.b);
                int i11 = org.telegram.ui.ActionBar.t6.a7;
                wVar2.b(org.telegram.ui.ActionBar.t6.r1(org.telegram.messenger.i0.T1(1.0f, 0.8f, max2), org.telegram.ui.ActionBar.t6.w0(i11, a0Var.I0)));
                wVar2.draw(canvas);
                if (a0Var.E1) {
                    max2 = 1.0f;
                }
                int W1 = org.telegram.messenger.i0.W1(max2, org.telegram.messenger.i0.L(48.0f) + a0Var.L1.d, 0);
                int W12 = org.telegram.messenger.i0.W1(max2, org.telegram.messenger.i0.L(72.0f), 0) + a0Var.L1.d;
                float T1 = org.telegram.messenger.i0.T1(0.8f, org.telegram.messenger.i0.R0(a0Var.L1.d), max2);
                wVar.c(0, W1);
                wVar.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                wVar.b(org.telegram.ui.ActionBar.t6.r1(T1, org.telegram.ui.ActionBar.t6.w0(i11, a0Var.I0)));
                wVar.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                y11 y11Var = (y11) this.b;
                int[] iArr = y11Var.G;
                getLocationOnScreen(iArr);
                Rect rect = y11Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                org.telegram.messenger.i0.X1(y11Var.c, rect, y11Var.I, y11Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.l lVar;
        int i15;
        switch (this.a) {
            case 2:
                yt0 yt0Var = (yt0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = yt0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L = org.telegram.messenger.i0.L(64.0f);
                    if (org.telegram.messenger.i0.L(8.0f) + yt0Var.c.U.getMeasuredHeight() > L) {
                        L = yt0Var.c.U.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f);
                    }
                    yt0Var.c.Y = L;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(yt0Var.c.Y, TLObject.FLAG_30));
                break;
            case 9:
                rh.h8 h8Var = (rh.h8) this.b;
                if (h8Var.H) {
                    i12 = (h8Var.o0().getMeasuredHeight() + h8Var.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.i0.L(140.0f) + h8Var.I;
                    if (org.telegram.messenger.i0.L(24.0f) + h8Var.D.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.i0.L(24.0f) + h8Var.D.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 12:
                wh.g gVar = (wh.g) this.b;
                if (gVar.H) {
                    i13 = (gVar.o0().getMeasuredHeight() + gVar.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.i0.L(140.0f) + gVar.I;
                    if (org.telegram.messenger.i0.L(24.0f) + gVar.D.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.i0.L(24.0f) + gVar.D.getMeasuredHeight();
                    }
                    i13 = L3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 13:
                xh.i iVar = (xh.i) this.b;
                if (iVar.H) {
                    int i16 = iVar.I;
                    lVar = ((org.telegram.ui.ActionBar.k2) iVar).actionBar;
                    i14 = (lVar.getMeasuredHeight() + i16) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L4 = org.telegram.messenger.i0.L(140.0f) + iVar.I;
                    if (org.telegram.messenger.i0.L(24.0f) + iVar.D.getMeasuredHeight() > L4) {
                        L4 = org.telegram.messenger.i0.L(24.0f) + iVar.D.getMeasuredHeight();
                    }
                    i14 = L4;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 15:
                ((View) getParent()).getMeasuredHeight();
                zf.c1 c1Var = (zf.c1) this.b;
                Integer num = c1Var.d;
                if (num != null) {
                    i15 = num.intValue();
                    c1Var.h = i15;
                } else {
                    i15 = 0;
                    c1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 3:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 6:
                super.setAlpha(f7);
                View view2 = ((pb1) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        switch (this.a) {
            case 8:
                if (((ph.i1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        ph.i1 i1Var = (ph.i1) this.b;
                        if (i1Var.i) {
                            i1Var.i = false;
                            i1Var.a();
                            ph.h1 h1Var = i1Var.h;
                            HashSet hashSet = org.telegram.messenger.sc.n;
                            if (hashSet != null) {
                                hashSet.remove(h1Var);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof ph.i1) {
                    this.b = (ph.i1) drawable;
                    if (isAttachedToWindow()) {
                        ph.i1 i1Var2 = (ph.i1) this.b;
                        if (!i1Var2.i) {
                            i1Var2.i = true;
                            i1Var2.a();
                            ph.h1 h1Var2 = new ph.h1(i1Var2, 0);
                            i1Var2.h = h1Var2;
                            org.telegram.messenger.sc.a(h1Var2);
                            break;
                        }
                    }
                }
                break;
            default:
                super.setBackground(drawable);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }
}
