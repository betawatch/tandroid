package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class iw0 extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                canvas.save();
                qh.ca caVar = (qh.ca) this.b;
                canvas.translate(caVar.Z0.getX() + caVar.i0.getX(), caVar.Z0.getY() + caVar.i0.getY());
                qh.r9 r9Var = caVar.Z0;
                r9Var.k(canvas, r9Var.getBounds(), caVar.Z0.getOver2Alpha());
                canvas.restore();
                break;
            case 11:
                og.b bVar = ((vg.f) this.b).F;
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
                ((uf.z0) this.b).f = true;
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
                ((uf.z0) this.b).f = false;
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
        switch (this.a) {
            case 2:
                o21 o21Var = (o21) this.b;
                canvas.drawColor(o21Var.H ? -15590870 : -6569073);
                org.telegram.ui.Components.fc0 fc0Var = o21Var.n;
                if (fc0Var != null) {
                    fc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                o21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.fc0 fc0Var2 = o21Var.n;
                if (fc0Var2 != null) {
                    fc0Var2.draw(canvas);
                }
                o21Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 3:
                ((SecretMediaViewer) this.b).N.a(canvas, this);
                break;
            case 9:
                super.onDraw(canvas);
                th.i0 i0Var = (th.i0) this.b;
                lf.b0 b0Var = i0Var.H;
                float max = Math.max(i0Var.b.e, i0Var.c.e);
                lf.b0 b0Var2 = i0Var.G;
                b0Var2.c(AndroidUtilities.dp(42.0f) + i0Var.R.b, 0);
                b0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + i0Var.R.b);
                int i10 = org.telegram.ui.ActionBar.k6.a7;
                b0Var2.b(org.telegram.ui.ActionBar.k6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), i0Var.getThemedColor(i10)));
                b0Var2.draw(canvas);
                if (i0Var.K) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + i0Var.R.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + i0Var.R.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(i0Var.R.d), max);
                b0Var.c(0, lerp);
                b0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                b0Var.b(org.telegram.ui.ActionBar.k6.l1(lerp3, i0Var.getThemedColor(i10)));
                b0Var.draw(canvas);
                break;
            case 12:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((wh.r0) this.b).c.draw(canvas);
                canvas.restore();
                break;
            case 13:
                int dp = AndroidUtilities.dp(20.0f);
                int width = (getWidth() - dp) / 2;
                int height = (getHeight() - dp) / 2;
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                checkBoxBase.e(width, height, dp, dp);
                checkBoxBase.a(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                g51 g51Var = (g51) this.b;
                int[] iArr = g51Var.D;
                getLocationOnScreen(iArr);
                Rect rect = g51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(g51Var.c, rect, g51Var.F, g51Var.e);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        switch (this.a) {
            case 0:
                jw0 jw0Var = (jw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = jw0Var.c;
                if (premiumPreviewFragment.T) {
                    premiumPreviewFragment.V = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + jw0Var.c.R.getMeasuredHeight() > dp) {
                        dp = jw0Var.c.R.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    jw0Var.c.V = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(jw0Var.c.V, TLObject.FLAG_30));
                break;
            case 7:
                rh.g gVar = (rh.g) this.b;
                if (gVar.E) {
                    int i15 = gVar.F;
                    kVar = ((org.telegram.ui.ActionBar.p2) gVar).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i15) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.F;
                    if (AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 8:
                sh.j jVar = (sh.j) this.b;
                if (jVar.E) {
                    int i16 = jVar.F;
                    kVar2 = ((org.telegram.ui.ActionBar.p2) jVar).actionBar;
                    i13 = (kVar2.getMeasuredHeight() + i16) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + jVar.F;
                    if (AndroidUtilities.dp(24.0f) + jVar.y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + jVar.y.getMeasuredHeight();
                    }
                    i13 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            case 10:
                ((View) getParent()).getMeasuredHeight();
                uf.z0 z0Var = (uf.z0) this.b;
                Integer num = z0Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    z0Var.h = i14;
                } else {
                    i14 = 0;
                    z0Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
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
            case 1:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
                super.setAlpha(f10);
                View view2 = ((mf1) this.b).fragmentView;
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
    public iw0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 13;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, g6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
