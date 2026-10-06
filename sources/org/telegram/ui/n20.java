package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class n20 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n20(Context context) {
        super(context);
        this.a = 13;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                s50 s50Var = (s50) this.b;
                if (s50Var != null && s50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
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
                s50 s50Var = (s50) this.b;
                if (s50Var != null) {
                    s50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        u50[] u50VarArr = s50Var.c;
                        if (i10 >= u50VarArr.length) {
                            break;
                        } else {
                            u50 u50Var = u50VarArr[i10];
                            u50Var.i.add(this);
                            u50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onAttachedToWindow();
                xh.n1 n1Var = (xh.n1) this.b;
                if (n1Var != null && !n1Var.i) {
                    n1Var.i = true;
                    n1Var.a();
                    ii.q1 q1Var = new ii.q1(n1Var, 20);
                    n1Var.h = q1Var;
                    LiteMode.addOnPowerSaverAppliedListener(q1Var);
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
                s50 s50Var = (s50) this.b;
                if (s50Var != null && s50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        u50[] u50VarArr = s50Var.c;
                        if (i10 >= u50VarArr.length) {
                            s50Var.g = null;
                            break;
                        } else {
                            u50 u50Var = u50VarArr[i10];
                            u50Var.i.remove(this);
                            u50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.b;
                if (n1Var != null && n1Var.i) {
                    n1Var.i = false;
                    n1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 2:
                canvas.drawColor(((oj0) this.b).getThemedColor(org.telegram.ui.ActionBar.i6.e7));
                break;
            case 3:
                fq0 fq0Var = (fq0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, fq0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(fq0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                fq0Var.S.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                fq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
                int i10 = max / 2;
                fq0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(fq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), fq0Var.U);
                fq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                fq0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(fq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), fq0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), fq0Var.S);
                break;
            case 4:
                wq0 wq0Var = (wq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, wq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(wq0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                wq0Var.h0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                wq0Var.j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, wq0Var.u0, false));
                int i11 = max2 / 2;
                wq0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(wq0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wq0Var.j0);
                wq0Var.j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                wq0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(wq0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), wq0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), wq0Var.h0);
                break;
            case 5:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 6:
            case 7:
            case 10:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 8:
                y21 y21Var = (y21) this.b;
                canvas.drawColor(y21Var.K ? -15590870 : -6569073);
                org.telegram.ui.Components.pc0 pc0Var = y21Var.n;
                if (pc0Var != null) {
                    pc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                y21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.pc0 pc0Var2 = y21Var.n;
                if (pc0Var2 != null) {
                    pc0Var2.draw(canvas);
                }
                y21Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 9:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 12:
                super.onDraw(canvas);
                rg.k0 k0Var = (rg.k0) this.b;
                if (k0Var.p0 - k0Var.o0 > 1) {
                    d6Var = ((org.telegram.ui.ActionBar.f3) k0Var).resourcesProvider;
                    Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", d6Var);
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.i6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                p51 p51Var = (p51) this.b;
                int[] iArr = p51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = p51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(p51Var.c, rect, p51Var.I, p51Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                r20 r20Var = (r20) this.b;
                if (r20Var.H) {
                    int i13 = r20Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    r20Var.J = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + r20Var.I;
                    if (AndroidUtilities.dp(24.0f) + r20Var.y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + r20Var.y.getMeasuredHeight()) - r20Var.L);
                    }
                    r20Var.J = dp;
                }
                int i14 = (int) (r20Var.J - (0 * 2.5f));
                r20Var.J = i14;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 6:
                ww0 ww0Var = (ww0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ww0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ww0Var.c.U.getMeasuredHeight() > dp2) {
                        dp2 = ww0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ww0Var.c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ww0Var.c.Y, TLObject.FLAG_30));
                break;
            case 14:
                yh.z7 z7Var = (yh.z7) this.b;
                if (z7Var.H) {
                    int i15 = z7Var.I;
                    kVar2 = ((org.telegram.ui.ActionBar.n2) z7Var).actionBar;
                    i12 = (kVar2.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + z7Var.I;
                    if (AndroidUtilities.dp(24.0f) + z7Var.y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + z7Var.y.getMeasuredHeight();
                    }
                    i12 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 11:
                super.setAlpha(f7);
                View view2 = ((wf1) this.b).fragmentView;
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
            case 13:
                if (((xh.n1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.b;
                        if (n1Var.i) {
                            n1Var.i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.b;
                        if (!n1Var2.i) {
                            n1Var2.i = true;
                            n1Var2.a();
                            ii.q1 q1Var = new ii.q1(n1Var2, 20);
                            n1Var2.h = q1Var;
                            LiteMode.addOnPowerSaverAppliedListener(q1Var);
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
    public /* synthetic */ n20(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(Context context, s50 s50Var) {
        super(context);
        this.a = 1;
        this.b = s50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new tv(10, this, context));
    }
}
