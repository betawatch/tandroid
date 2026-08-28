package gh;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x9 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(Context context, int i9) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 5:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                this.b = o9Var;
                o9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(o9Var, g7.e6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, g7.e6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, g7.e6.n(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Path path = (Path) this.c;
                if (((ih.p0) this.d).a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((bb) this.b) == null) {
                        this.b = new bb(1, MediaDataController.MAX_LINKS_COUNT);
                    }
                    ((bb) this.b).f(0, 0, getWidth(), getHeight());
                    bb bbVar = (bb) this.b;
                    bbVar.h = 30.0f;
                    bbVar.d();
                    ((bb) this.b).b(canvas, -1, 0.85f);
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
        float f10;
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                cq cqVar = (cq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, cqVar.W));
                int left = cqVar.A[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
                if (l0Var.getVisibility() == 0) {
                    f10 = l0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f10 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f10)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(cq cqVar, Context context) {
        super(context);
        this.a = 3;
        this.d = cqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(ih.p0 p0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = p0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                lh.c cVar = new lh.c(context, 70, 0);
                frameLayout.addView(cVar, g7.e6.c(-1.0f, -1));
                ag.j jVar = new ag.j(context, 1, 4);
                this.b = jVar;
                ag.a aVar = jVar.b;
                aVar.w = org.telegram.ui.ActionBar.f6.fk;
                aVar.x = org.telegram.ui.ActionBar.f6.gk;
                aVar.b();
                jVar.setStarParticlesView(cVar);
                frameLayout.addView(jVar, g7.e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                jVar.setPaused(false);
                addView(frameLayout, g7.e6.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                j3.r0.u(20.0f, 1, textView);
                int i10 = org.telegram.ui.ActionBar.f6.j5;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                textView.setGravity(17);
                addView(textView, g7.e6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                textView2.setGravity(17);
                addView(textView2, g7.e6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new n9(context, 70, 0), g7.e6.c(-1.0f, -1));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                this.b = o9Var;
                o9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(o9Var, g7.e6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, g7.e6.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                j3.r0.u(20.0f, 1, textView3);
                int i11 = org.telegram.ui.ActionBar.f6.j5;
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                textView3.setGravity(17);
                addView(textView3, g7.e6.t(-2, -2, 1, 0, 2, 0, 0));
                l80 l80Var = new l80(context, b6Var);
                this.d = l80Var;
                l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
                l80Var.setTextSize(1, 14.0f);
                l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                l80Var.setGravity(17);
                addView(l80Var, g7.e6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
