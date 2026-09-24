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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class n50 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n50(Context context) {
        super(context);
        this.a = 12;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                o50 o50Var = (o50) this.b;
                if (o50Var != null && o50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
            case 0:
                super.onAttachedToWindow();
                o50 o50Var = (o50) this.b;
                if (o50Var != null) {
                    o50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        q50[] q50VarArr = o50Var.c;
                        if (i10 >= q50VarArr.length) {
                            break;
                        } else {
                            q50 q50Var = q50VarArr[i10];
                            q50Var.i.add(this);
                            q50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onAttachedToWindow();
                xh.o1 o1Var = (xh.o1) this.b;
                if (o1Var != null && !o1Var.i) {
                    o1Var.i = true;
                    o1Var.a();
                    ii.q1 q1Var = new ii.q1(o1Var, 20);
                    o1Var.h = q1Var;
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
            case 0:
                super.onDetachedFromWindow();
                o50 o50Var = (o50) this.b;
                if (o50Var != null && o50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        q50[] q50VarArr = o50Var.c;
                        if (i10 >= q50VarArr.length) {
                            o50Var.g = null;
                            break;
                        } else {
                            q50 q50Var = q50VarArr[i10];
                            q50Var.i.remove(this);
                            q50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.o1 o1Var = (xh.o1) this.b;
                if (o1Var != null && o1Var.i) {
                    o1Var.i = false;
                    o1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
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
            case 1:
                canvas.drawColor(((lj0) this.b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                break;
            case 2:
                cq0 cq0Var = (cq0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, cq0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(cq0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cq0Var.S.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C5, false));
                cq0Var.U.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
                int i10 = max / 2;
                cq0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cq0Var.U);
                cq0Var.U.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
                cq0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cq0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), cq0Var.S);
                break;
            case 3:
                tq0 tq0Var = (tq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, tq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(tq0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                tq0Var.h0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C5, false));
                tq0Var.j0.setColor(org.telegram.ui.ActionBar.h6.w0(null, tq0Var.u0, false));
                int i11 = max2 / 2;
                tq0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(tq0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tq0Var.j0);
                tq0Var.j0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
                tq0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tq0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tq0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), tq0Var.h0);
                break;
            case 4:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 7:
                w21 w21Var = (w21) this.b;
                canvas.drawColor(w21Var.K ? -15590870 : -6569073);
                org.telegram.ui.Components.mc0 mc0Var = w21Var.n;
                if (mc0Var != null) {
                    mc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                w21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.mc0 mc0Var2 = w21Var.n;
                if (mc0Var2 != null) {
                    mc0Var2.draw(canvas);
                }
                w21Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    d6Var = ((org.telegram.ui.ActionBar.e3) j0Var).resourcesProvider;
                    Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", d6Var);
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.h6.k0;
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
            case 9:
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
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 5:
                tw0 tw0Var = (tw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = tw0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + tw0Var.c.U.getMeasuredHeight() > dp) {
                        dp = tw0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    tw0Var.c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(tw0Var.c.Y, TLObject.FLAG_30));
                break;
            case 13:
                yh.w7 w7Var = (yh.w7) this.b;
                if (w7Var.H) {
                    int i13 = w7Var.I;
                    kVar = ((org.telegram.ui.ActionBar.m2) w7Var).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + w7Var.I;
                    if (AndroidUtilities.dp(24.0f) + w7Var.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + w7Var.y.getMeasuredHeight();
                    }
                    i12 = dp2;
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
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 10:
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
            case 12:
                if (((xh.o1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var = (xh.o1) this.b;
                        if (o1Var.i) {
                            o1Var.i = false;
                            o1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.o1) {
                    this.b = (xh.o1) drawable;
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var2 = (xh.o1) this.b;
                        if (!o1Var2.i) {
                            o1Var2.i = true;
                            o1Var2.a();
                            ii.q1 q1Var = new ii.q1(o1Var2, 20);
                            o1Var2.h = q1Var;
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
    public /* synthetic */ n50(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(Context context, o50 o50Var) {
        super(context);
        this.a = 0;
        this.b = o50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new ov(10, this, context));
    }
}
