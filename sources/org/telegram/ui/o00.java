package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o00 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            case 12:
                super.dispatchDraw(canvas);
                tg.b0 b0Var = ((xp0) this.b).F0;
                if (b0Var != null) {
                    b0Var.d(canvas);
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
            case 1:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null) {
                    bVar.i = this;
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.e;
                        if (i7 >= s30VarArr.length) {
                            break;
                        } else {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.i.add(this);
                            s30Var.a();
                            i7++;
                        }
                    }
                }
                break;
            case 15:
                super.onAttachedToWindow();
                zh.d1 d1Var = (zh.d1) this.b;
                if (d1Var != null && !d1Var.i) {
                    d1Var.i = true;
                    d1Var.a();
                    xg.a aVar = new xg.a(d1Var, 3);
                    d1Var.h = aVar;
                    org.telegram.messenger.sc.a(aVar);
                    break;
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
            case 1:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null && ((o00) bVar.i) != this) {
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.e;
                        if (i7 >= s30VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.i.remove(this);
                            s30Var.a();
                            i7++;
                        }
                    }
                }
                break;
            case 15:
                super.onDetachedFromWindow();
                zh.d1 d1Var = (zh.d1) this.b;
                if (d1Var != null && d1Var.i) {
                    d1Var.i = false;
                    d1Var.a();
                    xg.a aVar = d1Var.h;
                    HashSet hashSet = org.telegram.messenger.sc.n;
                    if (hashSet != null) {
                        hashSet.remove(aVar);
                        break;
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
        switch (this.a) {
            case 2:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, ((tg0) this.b).I0));
                break;
            case 3:
                pm0 pm0Var = (pm0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, pm0Var.c.size())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(pm0Var.S.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                pm0Var.S.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                pm0Var.U.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                int i7 = max / 2;
                pm0Var.T.set(measuredWidth - i7, 0.0f, i7 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(pm0Var.T, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), pm0Var.U);
                pm0Var.U.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                pm0Var.T.set(org.telegram.messenger.g0.L(2.0f) + r11, org.telegram.messenger.g0.L(2.0f), r5 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(pm0Var.T, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), pm0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), org.telegram.messenger.g0.L(16.2f), pm0Var.S);
                break;
            case 4:
                an0 an0Var = (an0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, an0Var.c.size())));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(an0Var.h0.measureText(format2))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                an0Var.h0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                an0Var.j0.setColor(org.telegram.ui.ActionBar.m6.x0(null, an0Var.u0, false));
                int i10 = max2 / 2;
                an0Var.i0.set(measuredWidth2 - i10, 0.0f, i10 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(an0Var.i0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), an0Var.j0);
                an0Var.j0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                an0Var.i0.set(org.telegram.messenger.g0.L(2.0f) + r15, org.telegram.messenger.g0.L(2.0f), r9 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(an0Var.i0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), an0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r13 / 2), org.telegram.messenger.g0.L(16.2f), an0Var.h0);
                break;
            case 5:
                ((PhotoViewer) this.b).p3.a(canvas, this);
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            default:
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).O.a(canvas, this);
                break;
            case 11:
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.b;
                float e10 = i6Var.K.e(false, i6Var.J);
                if (i6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.i6.a(i6Var, canvas, e10);
                    break;
                }
                break;
            case 13:
                super.onDraw(canvas);
                ug.i0 i0Var = (ug.i0) this.b;
                if (i0Var.k2 - i0Var.j2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", i0Var.I0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.m6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 14:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, ((wg.f1) this.b).I0));
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                j01 j01Var = (j01) this.b;
                int[] iArr = j01Var.G;
                getLocationOnScreen(iArr);
                Rect rect = j01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(j01Var.c, rect, j01Var.I, j01Var.e);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                r00 r00Var = (r00) this.b;
                if (r00Var.H) {
                    r00Var.J = (r00Var.p0().getMeasuredHeight() + r00Var.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + r00Var.I;
                    if (org.telegram.messenger.g0.L(24.0f) + r00Var.D.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + r00Var.D.getMeasuredHeight()) - r00Var.L);
                    }
                    r00Var.J = L;
                }
                int i11 = (int) (r00Var.J - (0 * 2.5f));
                r00Var.J = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                break;
            case 6:
                ss0 ss0Var = (ss0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ss0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ss0Var.c.U.getMeasuredHeight() > L2) {
                        L2 = ss0Var.c.U.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ss0Var.c.Y = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ss0Var.c.Y, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 7:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 10:
                super.setAlpha(f10);
                View view2 = ((z91) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        switch (this.a) {
            case 15:
                if (((zh.d1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        zh.d1 d1Var = (zh.d1) this.b;
                        if (d1Var.i) {
                            d1Var.i = false;
                            d1Var.a();
                            xg.a aVar = d1Var.h;
                            HashSet hashSet = org.telegram.messenger.sc.n;
                            if (hashSet != null) {
                                hashSet.remove(aVar);
                            }
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.d1) {
                    this.b = (zh.d1) drawable;
                    if (isAttachedToWindow()) {
                        zh.d1 d1Var2 = (zh.d1) this.b;
                        if (!d1Var2.i) {
                            d1Var2.i = true;
                            d1Var2.a();
                            xg.a aVar2 = new xg.a(d1Var2, 3);
                            d1Var2.h = aVar2;
                            org.telegram.messenger.sc.a(aVar2);
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
    public /* synthetic */ o00(Context context) {
        super(context);
        this.a = 15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(Context context, g.b bVar) {
        super(context);
        this.a = 1;
        this.b = bVar;
        org.telegram.messenger.qs.i(this);
        setOnClickListener(new org.telegram.ui.Components.u41(17, this, context));
    }
}
