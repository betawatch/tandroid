package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class mc extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 6:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(y9Var, kb1.u(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, kb1.v(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, kb1.r(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Path path = (Path) this.c;
                if (((di.q0) this.d).a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((td) this.b) == null) {
                        this.b = new td(1, MediaDataController.MAX_LINKS_COUNT);
                    }
                    ((td) this.b).f(0, 0, getWidth(), getHeight());
                    td tdVar = (td) this.b;
                    tdVar.h = 30.0f;
                    tdVar.d();
                    ((td) this.b).b(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                yq yqVar = (yq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i5, yqVar.d0));
                int left = yqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.k0 k0Var = yqVar.F;
                if (k0Var.getVisibility() == 0) {
                    f7 = k0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f7 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f7)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 5:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                bk0 bk0Var = (bk0) this.d;
                int size = View.MeasureSpec.getSize(i11);
                if (View.MeasureSpec.getMode(i11) != 0) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    textView2.measure(makeMeasureSpec, makeMeasureSpec2);
                    textView.measure(makeMeasureSpec, makeMeasureSpec2);
                    int g7 = org.telegram.ui.d3.g(24.0f, (((size - getPaddingTop()) - getPaddingBottom()) - textView2.getMeasuredHeight()) - textView.getMeasuredHeight(), AndroidUtilities.dp(130.0f));
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bk0Var.getLayoutParams();
                    int i12 = g7 < AndroidUtilities.dp(56.0f) ? 8 : 0;
                    if (bk0Var.getVisibility() != i12) {
                        bk0Var.setVisibility(i12);
                    }
                    int max = Math.max(0, g7);
                    layoutParams.height = max;
                    layoutParams.width = max;
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(yq yqVar, Context context) {
        super(context);
        this.a = 4;
        this.d = yqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(Context context, TextView textView, TextView textView2, bk0 bk0Var) {
        super(context);
        this.a = 5;
        this.c = textView;
        this.b = textView2;
        this.d = bk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(di.q0 q0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = q0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                gi.d dVar = new gi.d(context, 70, 0);
                frameLayout.addView(dVar, kb1.g(-1.0f, -1));
                org.telegram.ui.Wallet.m6 m6Var = new org.telegram.ui.Wallet.m6(170, context, false);
                this.b = m6Var;
                m6Var.setStarParticlesView(dVar);
                frameLayout.addView(m6Var, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                m6Var.setPaused(false);
                addView(frameLayout, kb1.g(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                ic.a.o(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.y6.j5;
                org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
                textView.setGravity(17);
                addView(textView, kb1.x(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var);
                textView2.setGravity(17);
                addView(textView2, kb1.x(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new ec(context, 70, 0), kb1.g(-1.0f, -1));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                this.b = y9Var;
                y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(y9Var, kb1.h(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, kb1.g(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                ic.a.o(20.0f, 1, textView3);
                int i12 = org.telegram.ui.ActionBar.y6.j5;
                org.telegram.ui.ActionBar.f7.V(textView3, i12, u6Var);
                textView3.setGravity(17);
                addView(textView3, kb1.x(-2, -2, 1, 0, 2, 0, 0));
                aa0 aa0Var = new aa0(context, u6Var);
                this.d = aa0Var;
                org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
                aa0Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(aa0Var, i12, u6Var);
                aa0Var.setGravity(17);
                addView(aa0Var, kb1.x(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
