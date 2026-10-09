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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q50 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q50(Context context) {
        super(context);
        this.a = 12;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                r50 r50Var = (r50) this.b;
                if (r50Var != null && r50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
                r50 r50Var = (r50) this.b;
                if (r50Var != null) {
                    r50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        t50[] t50VarArr = r50Var.c;
                        if (i10 >= t50VarArr.length) {
                            break;
                        } else {
                            t50 t50Var = t50VarArr[i10];
                            t50Var.i.add(this);
                            t50Var.a();
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
                r50 r50Var = (r50) this.b;
                if (r50Var != null && r50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        t50[] t50VarArr = r50Var.c;
                        if (i10 >= t50VarArr.length) {
                            r50Var.g = null;
                            break;
                        } else {
                            t50 t50Var = t50VarArr[i10];
                            t50Var.i.remove(this);
                            t50Var.a();
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
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 1:
                canvas.drawColor(((sj0) this.b).getThemedColor(org.telegram.ui.ActionBar.i6.e7));
                break;
            case 2:
                kq0 kq0Var = (kq0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kq0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(kq0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                kq0Var.S.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.C5, false));
                kq0Var.U.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false));
                int i10 = max / 2;
                kq0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(kq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), kq0Var.U);
                kq0Var.U.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B5, false));
                kq0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(kq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), kq0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), kq0Var.S);
                break;
            case 3:
                br0 br0Var = (br0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, br0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(br0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                br0Var.h0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.C5, false));
                br0Var.j0.setColor(org.telegram.ui.ActionBar.i6.x0(null, br0Var.u0, false));
                int i11 = max2 / 2;
                br0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(br0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), br0Var.j0);
                br0Var.j0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B5, false));
                br0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(br0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), br0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), br0Var.h0);
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
                e31 e31Var = (e31) this.b;
                canvas.drawColor(e31Var.K ? -15590870 : -6569073);
                org.telegram.ui.Components.cd0 cd0Var = e31Var.n;
                if (cd0Var != null) {
                    cd0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                e31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cd0 cd0Var2 = e31Var.n;
                if (cd0Var2 != null) {
                    cd0Var2.draw(canvas);
                }
                e31Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    e6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                    Paint U0 = org.telegram.ui.ActionBar.i6.U0("paintDivider", e6Var);
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.i6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
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
                z51 z51Var = (z51) this.b;
                int[] iArr = z51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = z51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(z51Var.c, rect, z51Var.I, z51Var.e);
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
                cx0 cx0Var = (cx0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + cx0Var.c.U.getMeasuredHeight() > dp) {
                        dp = cx0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    cx0Var.c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(cx0Var.c.Y, TLObject.FLAG_30));
                break;
            case 13:
                yh.p7 p7Var = (yh.p7) this.b;
                if (p7Var.H) {
                    int i13 = p7Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) p7Var).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + p7Var.I;
                    if (AndroidUtilities.dp(24.0f) + p7Var.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + p7Var.y.getMeasuredHeight();
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
                View view2 = ((fg1) this.b).fragmentView;
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
    public /* synthetic */ q50(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(Context context, r50 r50Var) {
        super(context);
        this.a = 0;
        this.b = r50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new rv(10, this, context));
    }
}
