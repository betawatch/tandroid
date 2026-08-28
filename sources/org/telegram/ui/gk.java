package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gk extends TextView {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    public void a(int i9) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        if (fragmentContextView.I != i9) {
            org.telegram.ui.Components.c10 c10Var = fragmentContextView.d;
            c10Var.setPadding(c10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.I) + i9, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.I = i9;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp;
                rectF.set(f10, f10, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.b).J.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                break;
            case 2:
            default:
                super.draw(canvas);
                break;
            case 3:
                super.draw(canvas);
                l71 l71Var = (l71) this.b;
                org.telegram.ui.Components.voip.h hVar = l71Var.c;
                if (hVar.g <= 1.0f) {
                    SessionsActivity sessionsActivity = l71Var.d;
                    if (sessionsActivity.S && sessionsActivity.T) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f = getMeasuredWidth();
                        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF2, null);
                        invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.b = hVar;
                    hVar.k = false;
                    hVar.m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.b).f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                break;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.b);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
                super.onLayout(z10, i9, i10, i11, i12);
                if (z10) {
                    ((mh1) this.b).H();
                    break;
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i9, i10);
                a(getMeasuredWidth());
                break;
            case 2:
                super.onMeasure(i9, i10);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.x21) this.b).b.setPivotX(getMeasuredWidth());
                    break;
                }
                break;
            case 6:
                super.onMeasure(i9, i10);
                ((org.telegram.ui.web.t1) this.b).c.setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                ((FragmentContextView) this.b).J.f = getWidth();
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 1:
                super.setVisibility(i9);
                if (i9 != 0) {
                    a(0);
                    ((FragmentContextView) this.b).I = 0;
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(Activity activity, Paint paint) {
        super(activity);
        this.a = 4;
        this.b = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(Context context) {
        super(context);
        this.a = 0;
    }
}
