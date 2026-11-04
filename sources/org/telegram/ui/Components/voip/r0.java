package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.f6;
import org.telegram.ui.fs0;
import org.telegram.ui.hm0;
import org.telegram.ui.k30;
import org.telegram.ui.kg0;
import org.telegram.ui.l00;
import org.telegram.ui.lp0;
import org.telegram.ui.m91;
import org.telegram.ui.sm0;
import org.telegram.ui.uw;
import org.telegram.ui.wz0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            case 14:
                super.dispatchDraw(canvas);
                ug.a0 a0Var = ((lp0) this.b).G0;
                if (a0Var != null) {
                    a0Var.d(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 3:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null) {
                    bVar.i = this;
                    int i3 = 0;
                    while (true) {
                        k30[] k30VarArr = (k30[]) bVar.e;
                        if (i3 >= k30VarArr.length) {
                            break;
                        } else {
                            k30 k30Var = k30VarArr[i3];
                            k30Var.i.add(this);
                            k30Var.a();
                            i3++;
                        }
                    }
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 3:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null && ((r0) bVar.i) != this) {
                    int i3 = 0;
                    while (true) {
                        k30[] k30VarArr = (k30[]) bVar.e;
                        if (i3 >= k30VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            k30 k30Var = k30VarArr[i3];
                            k30Var.i.remove(this);
                            k30Var.a();
                            i3++;
                        }
                    }
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                if (getAlpha() != 0.0f) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((s0) obj).n.a(org.telegram.messenger.g0.L(10.0f), canvas, rectF, null);
                    invalidate();
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                canvas.drawColor(k6.w0(k6.e7, ((kg0) obj).J0));
                break;
            case 5:
                hm0 hm0Var = (hm0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, hm0Var.c.size())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(hm0Var.T.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hm0Var.T.setColor(k6.x0(null, k6.C5, false));
                hm0Var.V.setColor(k6.x0(null, k6.h5, false));
                int i10 = max / 2;
                hm0Var.U.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(hm0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), hm0Var.V);
                hm0Var.V.setColor(k6.x0(null, k6.B5, false));
                hm0Var.U.set(org.telegram.messenger.g0.L(2.0f) + r7, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(hm0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), hm0Var.V);
                canvas.drawText(format, measuredWidth - (r3 / 2), org.telegram.messenger.g0.L(16.2f), hm0Var.T);
                break;
            case 6:
                sm0 sm0Var = (sm0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, sm0Var.c.size())));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(sm0Var.i0.measureText(format2))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                sm0Var.i0.setColor(k6.x0(null, k6.C5, false));
                sm0Var.k0.setColor(k6.x0(null, sm0Var.v0, false));
                int i11 = max2 / 2;
                sm0Var.j0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(sm0Var.j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), sm0Var.k0);
                sm0Var.k0.setColor(k6.x0(null, k6.B5, false));
                sm0Var.j0.set(org.telegram.messenger.g0.L(2.0f) + r8, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(sm0Var.j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), sm0Var.k0);
                canvas.drawText(format2, measuredWidth2 - (r3 / 2), org.telegram.messenger.g0.L(16.2f), sm0Var.i0);
                break;
            case 7:
                ((PhotoViewer) obj).r3.a(canvas, this);
                break;
            case 10:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                break;
            case 13:
                f6 f6Var = (f6) obj;
                float e10 = f6Var.L.e(false, f6Var.K);
                if (f6Var.R != null && getWidth() > 0) {
                    f6.a(f6Var, canvas, e10);
                    break;
                }
                break;
            case 15:
                super.onDraw(canvas);
                vg.i0 i0Var = (vg.i0) obj;
                if (i0Var.i2 - i0Var.h2 > 1) {
                    Paint W0 = k6.W0("paintDivider", i0Var.J0);
                    if (W0 == null) {
                        W0 = k6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 16:
                canvas.drawColor(k6.w0(k6.e7, ((xg.e1) obj).J0));
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 11:
                super.onLayout(z10, i3, i10, i11, i12);
                wz0 wz0Var = (wz0) this.b;
                int[] iArr = wz0Var.H;
                getLocationOnScreen(iArr);
                Rect rect = wz0Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(wz0Var.c, rect, wz0Var.J, wz0Var.e);
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 2:
                l00 l00Var = (l00) this.b;
                if (l00Var.I) {
                    l00Var.K = (l00Var.p0().getMeasuredHeight() + l00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + l00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + l00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + l00Var.E.getMeasuredHeight()) - l00Var.M);
                    }
                    l00Var.K = L;
                }
                int i11 = (int) (l00Var.K - (0 * 2.5f));
                l00Var.K = i11;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(38.0f));
                break;
            case 8:
                fs0 fs0Var = (fs0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = fs0Var.c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + fs0Var.c.V.getMeasuredHeight() > L2) {
                        L2 = fs0Var.c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    fs0Var.c.Z = L2;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(fs0Var.c.Z, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                ((s0) this.b).n.f = i3;
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 1:
                super.setAlpha(f10);
                View view = ((uw) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 9:
                super.setAlpha(f10);
                View view2 = ((ProfileActivity) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 12:
                super.setAlpha(f10);
                View view3 = ((m91) this.b).fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, g.b bVar) {
        super(context);
        this.a = 3;
        this.b = bVar;
        hs.i(this);
        setOnClickListener(new ux0(23, (Object) this, (Object) context));
    }
}
