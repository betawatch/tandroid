package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class op0 extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 11:
                lg.b bVar = ((sg.f) this.b).E;
                if (bVar != null) {
                    bVar.draw(canvas);
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
            case 10:
                super.onAttachedToWindow();
                ((rf.a1) this.b).f = true;
                break;
            case 13:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 10:
                super.onDetachedFromWindow();
                ((rf.a1) this.b).f = false;
                break;
            case 13:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                zp0 zp0Var = (zp0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, zp0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(zp0Var.d0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                zp0Var.d0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.C5, false));
                zp0Var.f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, zp0Var.q0, false));
                int i11 = max / 2;
                zp0Var.e0.set(measuredWidth - i11, 0.0f, i11 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(zp0Var.e0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), zp0Var.f0);
                zp0Var.f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
                zp0Var.e0.set(AndroidUtilities.dp(2.0f) + r7, AndroidUtilities.dp(2.0f), r4 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(zp0Var.e0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), zp0Var.f0);
                canvas.drawText(format, measuredWidth - (r3 / 2), AndroidUtilities.dp(16.2f), zp0Var.d0);
                break;
            case 1:
                ((PhotoViewer) obj).m3.a(canvas, this);
                break;
            case 4:
                a21 a21Var = (a21) obj;
                canvas.drawColor(a21Var.G ? -15590870 : -6569073);
                org.telegram.ui.Components.yb0 yb0Var = a21Var.n;
                if (yb0Var != null) {
                    yb0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                a21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.yb0 yb0Var2 = a21Var.n;
                if (yb0Var2 != null) {
                    yb0Var2.draw(canvas);
                }
                a21Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 5:
                ((SecretMediaViewer) obj).M.a(canvas, this);
                break;
            case 9:
                super.onDraw(canvas);
                qh.i0 i0Var = (qh.i0) obj;
                jf.b0 b0Var = i0Var.G;
                float max2 = Math.max(i0Var.b.e, i0Var.c.e);
                jf.b0 b0Var2 = i0Var.F;
                b0Var2.c(AndroidUtilities.dp(42.0f) + i0Var.Q.b, 0);
                b0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + i0Var.Q.b);
                int i12 = org.telegram.ui.ActionBar.g6.a7;
                b0Var2.b(org.telegram.ui.ActionBar.g6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max2), i0Var.getThemedColor(i12)));
                b0Var2.draw(canvas);
                if (i0Var.J) {
                    max2 = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + i0Var.Q.d, 0, max2);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max2) + i0Var.Q.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(i0Var.Q.d), max2);
                b0Var.c(0, lerp);
                b0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                b0Var.b(org.telegram.ui.ActionBar.g6.l1(lerp3, i0Var.getThemedColor(i12)));
                b0Var.draw(canvas);
                break;
            case 12:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((th.q0) obj).c.draw(canvas);
                canvas.restore();
                break;
            case 13:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                s41 s41Var = (s41) this.b;
                int[] iArr = s41Var.C;
                getLocationOnScreen(iArr);
                Rect rect = s41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(s41Var.c, rect, s41Var.E, s41Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        switch (this.a) {
            case 2:
                xv0 xv0Var = (xv0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = xv0Var.c;
                if (premiumPreviewFragment.S) {
                    premiumPreviewFragment.U = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + xv0Var.c.Q.getMeasuredHeight() > dp) {
                        dp = xv0Var.c.Q.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    xv0Var.c.U = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(xv0Var.c.U, TLObject.FLAG_30));
                break;
            case 8:
                ph.j jVar = (ph.j) this.b;
                if (jVar.D) {
                    int i14 = jVar.E;
                    lVar = ((org.telegram.ui.ActionBar.o2) jVar).actionBar;
                    i12 = (lVar.getMeasuredHeight() + i14) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + jVar.E;
                    if (AndroidUtilities.dp(24.0f) + jVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + jVar.y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 10:
                ((View) getParent()).getMeasuredHeight();
                rf.a1 a1Var = (rf.a1) this.b;
                Integer num = a1Var.d;
                if (num != null) {
                    i13 = num.intValue();
                    a1Var.h = i13;
                } else {
                    i13 = 0;
                    a1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                break;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.a) {
            case 3:
                super.setAlpha(f9);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 7:
                super.setAlpha(f9);
                View view2 = ((ze1) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = 13;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, c6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.z5, org.telegram.ui.ActionBar.g6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
