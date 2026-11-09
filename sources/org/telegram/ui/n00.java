package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n00 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n00(int i7, Context context, Object obj) {
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
                tg.b0 b0Var = ((wp0) this.b).F0;
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
                        r30[] r30VarArr = (r30[]) bVar.e;
                        if (i7 >= r30VarArr.length) {
                            break;
                        } else {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.i.add(this);
                            r30Var.a();
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
                if (bVar != null && ((n00) bVar.i) != this) {
                    int i7 = 0;
                    while (true) {
                        r30[] r30VarArr = (r30[]) bVar.e;
                        if (i7 >= r30VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.i.remove(this);
                            r30Var.a();
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
                canvas.drawColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.e7, ((sg0) this.b).I0));
                break;
            case 3:
                om0 om0Var = (om0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, om0Var.c.size())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(om0Var.S.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                om0Var.S.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.C5, false));
                om0Var.U.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false));
                int i7 = max / 2;
                om0Var.T.set(measuredWidth - i7, 0.0f, i7 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(om0Var.T, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), om0Var.U);
                om0Var.U.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B5, false));
                om0Var.T.set(org.telegram.messenger.g0.L(2.0f) + r11, org.telegram.messenger.g0.L(2.0f), r5 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(om0Var.T, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), om0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), org.telegram.messenger.g0.L(16.2f), om0Var.S);
                break;
            case 4:
                zm0 zm0Var = (zm0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, zm0Var.c.size())));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(zm0Var.h0.measureText(format2))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                zm0Var.h0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.C5, false));
                zm0Var.j0.setColor(org.telegram.ui.ActionBar.l6.x0(null, zm0Var.u0, false));
                int i10 = max2 / 2;
                zm0Var.i0.set(measuredWidth2 - i10, 0.0f, i10 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(zm0Var.i0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), zm0Var.j0);
                zm0Var.j0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B5, false));
                zm0Var.i0.set(org.telegram.messenger.g0.L(2.0f) + r15, org.telegram.messenger.g0.L(2.0f), r9 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(zm0Var.i0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), zm0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r13 / 2), org.telegram.messenger.g0.L(16.2f), zm0Var.h0);
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
                org.telegram.ui.Wallet.f6 f6Var = (org.telegram.ui.Wallet.f6) this.b;
                float e10 = f6Var.K.e(false, f6Var.J);
                if (f6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.f6.a(f6Var, canvas, e10);
                    break;
                }
                break;
            case 13:
                super.onDraw(canvas);
                ug.i0 i0Var = (ug.i0) this.b;
                if (i0Var.h2 - i0Var.g2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", i0Var.I0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.l6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 14:
                canvas.drawColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.e7, ((wg.f1) this.b).I0));
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                i01 i01Var = (i01) this.b;
                int[] iArr = i01Var.G;
                getLocationOnScreen(iArr);
                Rect rect = i01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(i01Var.c, rect, i01Var.I, i01Var.e);
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
                q00 q00Var = (q00) this.b;
                if (q00Var.H) {
                    q00Var.J = (q00Var.p0().getMeasuredHeight() + q00Var.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + q00Var.I;
                    if (org.telegram.messenger.g0.L(24.0f) + q00Var.D.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + q00Var.D.getMeasuredHeight()) - q00Var.L);
                    }
                    q00Var.J = L;
                }
                int i11 = (int) (q00Var.J - (0 * 2.5f));
                q00Var.J = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                break;
            case 6:
                rs0 rs0Var = (rs0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + rs0Var.c.U.getMeasuredHeight() > L2) {
                        L2 = rs0Var.c.U.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    rs0Var.c.Y = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(rs0Var.c.Y, TLObject.FLAG_30));
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
                View view2 = ((y91) this.b).fragmentView;
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
    public /* synthetic */ n00(Context context) {
        super(context);
        this.a = 15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(Context context, g.b bVar) {
        super(context);
        this.a = 1;
        this.b = bVar;
        org.telegram.messenger.qs.i(this);
        setOnClickListener(new org.telegram.ui.Components.u41(17, this, context));
    }
}
