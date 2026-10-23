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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e50 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e50(Context context) {
        super(context);
        this.a = 12;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                f50 f50Var = (f50) this.b;
                if (f50Var != null && f50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
                f50 f50Var = (f50) this.b;
                if (f50Var != null) {
                    f50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        h50[] h50VarArr = f50Var.c;
                        if (i10 >= h50VarArr.length) {
                            break;
                        } else {
                            h50 h50Var = h50VarArr[i10];
                            h50Var.i.add(this);
                            h50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onAttachedToWindow();
                yh.l1 l1Var = (yh.l1) this.b;
                if (l1Var != null && !l1Var.i) {
                    l1Var.i = true;
                    l1Var.a();
                    ig.k0 k0Var = new ig.k0(l1Var, 26);
                    l1Var.h = k0Var;
                    LiteMode.addOnPowerSaverAppliedListener(k0Var);
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
                f50 f50Var = (f50) this.b;
                if (f50Var != null && f50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        h50[] h50VarArr = f50Var.c;
                        if (i10 >= h50VarArr.length) {
                            f50Var.g = null;
                            break;
                        } else {
                            h50 h50Var = h50VarArr[i10];
                            h50Var.i.remove(this);
                            h50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                yh.l1 l1Var = (yh.l1) this.b;
                if (l1Var != null && l1Var.i) {
                    l1Var.i = false;
                    l1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.a) {
            case 1:
                canvas.drawColor(((fj0) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.e7));
                break;
            case 2:
                vp0 vp0Var = (vp0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, vp0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(vp0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                vp0Var.S.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.C5, false));
                vp0Var.U.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
                int i10 = max / 2;
                vp0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(vp0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), vp0Var.U);
                vp0Var.U.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
                vp0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(vp0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), vp0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), vp0Var.S);
                break;
            case 3:
                mq0 mq0Var = (mq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, mq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(mq0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                mq0Var.h0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.C5, false));
                mq0Var.j0.setColor(org.telegram.ui.ActionBar.k6.x0(null, mq0Var.u0, false));
                int i11 = max2 / 2;
                mq0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(mq0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), mq0Var.j0);
                mq0Var.j0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
                mq0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(mq0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), mq0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), mq0Var.h0);
                break;
            case 4:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                super.onDraw(canvas);
                break;
            case 7:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 10:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.b;
                float d = x5Var.K.d(x5Var.J, false);
                if (x5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.x5.a(x5Var, canvas, d);
                    break;
                }
                break;
            case 11:
                super.onDraw(canvas);
                sg.j0 j0Var = (sg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    g6Var = ((org.telegram.ui.ActionBar.h3) j0Var).resourcesProvider;
                    Paint V0 = org.telegram.ui.ActionBar.k6.V0("paintDivider", g6Var);
                    if (V0 == null) {
                        V0 = org.telegram.ui.ActionBar.k6.k0;
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
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                q41 q41Var = (q41) this.b;
                int[] iArr = q41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = q41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(q41Var.c, rect, q41Var.I, q41Var.e);
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 5:
                kw0 kw0Var = (kw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = kw0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + kw0Var.c.U.getMeasuredHeight() > dp) {
                        dp = kw0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    kw0Var.c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(kw0Var.c.Y, TLObject.FLAG_30));
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
            case 9:
                super.setAlpha(f7);
                View view2 = ((ye1) this.b).fragmentView;
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
                if (((yh.l1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var = (yh.l1) this.b;
                        if (l1Var.i) {
                            l1Var.i = false;
                            l1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.l1) {
                    this.b = (yh.l1) drawable;
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var2 = (yh.l1) this.b;
                        if (!l1Var2.i) {
                            l1Var2.i = true;
                            l1Var2.a();
                            ig.k0 k0Var = new ig.k0(l1Var2, 26);
                            l1Var2.h = k0Var;
                            LiteMode.addOnPowerSaverAppliedListener(k0Var);
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
    public /* synthetic */ e50(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(Context context, f50 f50Var) {
        super(context);
        this.a = 0;
        this.b = f50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.d51(21, this, context));
    }
}
