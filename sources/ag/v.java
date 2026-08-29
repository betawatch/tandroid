package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import jh.i9;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                t9 t9Var = new t9(context);
                this.b = t9Var;
                t9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(t9Var, f6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, f6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, f6.n(-1, -2));
                break;
            default:
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                Path path = (Path) this.c;
                if (((lh.n0) this.d).a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((va) this.b) == null) {
                        this.b = new va(1, MediaDataController.MAX_LINKS_COUNT);
                    }
                    ((va) this.b).f(0, 0, getWidth(), getHeight());
                    va vaVar = (va) this.b;
                    vaVar.h = 30.0f;
                    vaVar.d();
                    ((va) this.b).b(canvas, -1, 0.85f);
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
        float f9;
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                gq gqVar = (gq) this.d;
                paint.setColor(g6.v0(g6.i5, gqVar.W));
                int left = gqVar.A[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.m0 m0Var = gqVar.B;
                if (m0Var.getVisibility() == 0) {
                    f9 = m0Var.getAlpha() * AndroidUtilities.dp(25.0f);
                } else {
                    f9 = 0.0f;
                }
                rectF.set(left, AndroidUtilities.dp(5.0f), left + ((int) (dp + f9)), AndroidUtilities.dp(37.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gq gqVar, Context context) {
        super(context);
        this.a = 4;
        this.d = gqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lh.n0 n0Var, Context context) {
        super(context);
        this.a = 2;
        this.d = n0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 3:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                oh.c cVar = new oh.c(context, 70, 0);
                frameLayout.addView(cVar, f6.c(-1.0f, -1));
                dg.i iVar = new dg.i(context, 1, 4);
                this.b = iVar;
                dg.a aVar = iVar.b;
                aVar.w = g6.fk;
                aVar.x = g6.gk;
                aVar.b();
                iVar.setStarParticlesView(cVar);
                frameLayout.addView(iVar, f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                iVar.setPaused(false);
                addView(frameLayout, f6.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                th.n(20.0f, 1, textView);
                int i11 = g6.j5;
                textView.setTextColor(g6.v0(i11, c6Var));
                textView.setGravity(17);
                addView(textView, f6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(g6.v0(i11, c6Var));
                textView2.setGravity(17);
                addView(textView2, f6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new i9(context, 70, 0), f6.c(-1.0f, -1));
                t9 t9Var = new t9(context);
                this.b = t9Var;
                t9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(t9Var, f6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, f6.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                th.n(20.0f, 1, textView3);
                int i12 = g6.j5;
                textView3.setTextColor(g6.v0(i12, c6Var));
                textView3.setGravity(17);
                addView(textView3, f6.t(-2, -2, 1, 0, 2, 0, 0));
                y80 y80Var = new y80(context, c6Var);
                this.d = y80Var;
                y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
                y80Var.setTextSize(1, 14.0f);
                y80Var.setTextColor(g6.v0(i12, c6Var));
                y80Var.setGravity(17);
                addView(y80Var, f6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
