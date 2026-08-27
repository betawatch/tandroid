package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class aj0 extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 11:
                jg.b bVar = ((qg.g) this.b).E;
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
                ((pf.z0) this.b).f = true;
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
                ((pf.z0) this.b).f = false;
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
                canvas.drawColor(((dj0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.e7));
                break;
            case 1:
                jp0 jp0Var = (jp0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, jp0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(jp0Var.O.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jp0Var.O.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.C5, false));
                jp0Var.Q.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                int i11 = max / 2;
                jp0Var.P.set(measuredWidth - i11, 0.0f, i11 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(jp0Var.P, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), jp0Var.Q);
                jp0Var.Q.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
                jp0Var.P.set(AndroidUtilities.dp(2.0f) + r10, AndroidUtilities.dp(2.0f), r4 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(jp0Var.P, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), jp0Var.Q);
                canvas.drawText(format, measuredWidth - (r3 / 2), AndroidUtilities.dp(16.2f), jp0Var.O);
                break;
            case 2:
                aq0 aq0Var = (aq0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, aq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(aq0Var.d0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                aq0Var.d0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.C5, false));
                aq0Var.f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, aq0Var.q0, false));
                int i12 = max2 / 2;
                aq0Var.e0.set(measuredWidth2 - i12, 0.0f, i12 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(aq0Var.e0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), aq0Var.f0);
                aq0Var.f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
                aq0Var.e0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r9 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(aq0Var.e0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), aq0Var.f0);
                canvas.drawText(format2, measuredWidth2 - (r11 / 2), AndroidUtilities.dp(16.2f), aq0Var.d0);
                break;
            case 3:
                ((PhotoViewer) obj).m3.a(canvas, this);
                break;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 6:
                y11 y11Var = (y11) obj;
                canvas.drawColor(y11Var.G ? -15590870 : -6569073);
                org.telegram.ui.Components.nb0 nb0Var = y11Var.n;
                if (nb0Var != null) {
                    nb0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                y11Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.nb0 nb0Var2 = y11Var.n;
                if (nb0Var2 != null) {
                    nb0Var2.draw(canvas);
                }
                y11Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 7:
                ((SecretMediaViewer) obj).M.a(canvas, this);
                break;
            case 12:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((rh.q0) obj).c.draw(canvas);
                canvas.restore();
                break;
            case 13:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                p41 p41Var = (p41) this.b;
                int[] iArr = p41Var.C;
                getLocationOnScreen(iArr);
                Rect rect = p41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(p41Var.c, rect, p41Var.E, p41Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.a) {
            case 4:
                yv0 yv0Var = (yv0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = yv0Var.c;
                if (premiumPreviewFragment.S) {
                    premiumPreviewFragment.U = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + yv0Var.c.Q.getMeasuredHeight() > dp) {
                        dp = yv0Var.c.Q.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    yv0Var.c.U = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(yv0Var.c.U, TLObject.FLAG_30));
                break;
            case 10:
                ((View) getParent()).getMeasuredHeight();
                pf.z0 z0Var = (pf.z0) this.b;
                Integer num = z0Var.d;
                if (num != null) {
                    i12 = num.intValue();
                    z0Var.h = i12;
                } else {
                    i12 = 0;
                    z0Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
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
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 9:
                super.setAlpha(f10);
                View view2 = ((we1) this.b).fragmentView;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
