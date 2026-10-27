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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b20 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b20(Context context) {
        super(context);
        this.a = 13;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                h50 h50Var = (h50) this.b;
                if (h50Var != null && h50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
                h50 h50Var = (h50) this.b;
                if (h50Var != null) {
                    h50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        j50[] j50VarArr = h50Var.c;
                        if (i10 >= j50VarArr.length) {
                            break;
                        } else {
                            j50 j50Var = j50VarArr[i10];
                            j50Var.i.add(this);
                            j50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onAttachedToWindow();
                zh.m1 m1Var = (zh.m1) this.b;
                if (m1Var != null && !m1Var.i) {
                    m1Var.i = true;
                    m1Var.a();
                    zh.l1 l1Var = new zh.l1(m1Var, 0);
                    m1Var.h = l1Var;
                    LiteMode.addOnPowerSaverAppliedListener(l1Var);
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
                h50 h50Var = (h50) this.b;
                if (h50Var != null && h50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        j50[] j50VarArr = h50Var.c;
                        if (i10 >= j50VarArr.length) {
                            h50Var.g = null;
                            break;
                        } else {
                            j50 j50Var = j50VarArr[i10];
                            j50Var.i.remove(this);
                            j50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                zh.m1 m1Var = (zh.m1) this.b;
                if (m1Var != null && m1Var.i) {
                    m1Var.i = false;
                    m1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
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
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.a) {
            case 2:
                canvas.drawColor(((ej0) this.b).getThemedColor(org.telegram.ui.ActionBar.y6.e7));
                break;
            case 3:
                cq0 cq0Var = (cq0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, cq0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(cq0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cq0Var.S.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.C5, false));
                cq0Var.U.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false));
                int i10 = max / 2;
                cq0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cq0Var.U);
                cq0Var.U.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B5, false));
                cq0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cq0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), cq0Var.S);
                break;
            case 4:
                tq0 tq0Var = (tq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, tq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(tq0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                tq0Var.h0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.C5, false));
                tq0Var.j0.setColor(org.telegram.ui.ActionBar.y6.x0(null, tq0Var.u0, false));
                int i11 = max2 / 2;
                tq0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(tq0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tq0Var.j0);
                tq0Var.j0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B5, false));
                tq0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tq0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tq0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), tq0Var.h0);
                break;
            case 5:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 11:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.b;
                float d = w5Var.K.d(w5Var.J, false);
                if (w5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.w5.a(w5Var, canvas, d);
                    break;
                }
                break;
            case 12:
                super.onDraw(canvas);
                tg.j0 j0Var = (tg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    u6Var = ((org.telegram.ui.ActionBar.k3) j0Var).resourcesProvider;
                    Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintDivider", u6Var);
                    if (V0 == null) {
                        V0 = org.telegram.ui.ActionBar.y6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, V0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                u41 u41Var = (u41) this.b;
                int[] iArr = u41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = u41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(u41Var.c, rect, u41Var.I, u41Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                f20 f20Var = (f20) this.b;
                if (f20Var.H) {
                    f20Var.J = (f20Var.l0().getMeasuredHeight() + f20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + f20Var.I;
                    if (AndroidUtilities.dp(24.0f) + f20Var.y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + f20Var.y.getMeasuredHeight()) - f20Var.L);
                    }
                    f20Var.J = dp;
                }
                int i12 = (int) (f20Var.J - (0 * 2.5f));
                f20Var.J = i12;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 6:
                qw0 qw0Var = (qw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + qw0Var.c.U.getMeasuredHeight() > dp2) {
                        dp2 = qw0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    qw0Var.c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(qw0Var.c.Y, TLObject.FLAG_30));
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
            case 10:
                super.setAlpha(f7);
                View view2 = ((cf1) this.b).fragmentView;
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
                if (((zh.m1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        zh.m1 m1Var = (zh.m1) this.b;
                        if (m1Var.i) {
                            m1Var.i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.m1) {
                    this.b = (zh.m1) drawable;
                    if (isAttachedToWindow()) {
                        zh.m1 m1Var2 = (zh.m1) this.b;
                        if (!m1Var2.i) {
                            m1Var2.i = true;
                            m1Var2.a();
                            zh.l1 l1Var = new zh.l1(m1Var2, 0);
                            m1Var2.h = l1Var;
                            LiteMode.addOnPowerSaverAppliedListener(l1Var);
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
    public /* synthetic */ b20(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(Context context, h50 h50Var) {
        super(context);
        this.a = 1;
        this.b = h50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.l51(21, this, context));
    }
}
