package ai;

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
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class vc extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 5:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(w9Var, w7.z5.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.z5.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.z5.n(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Path path = (Path) this.c;
                if (((ci.q0) this.d).a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((ee) this.b) == null) {
                        this.b = new ee(1, MediaDataController.MAX_LINKS_COUNT);
                    }
                    ((ee) this.b).f(0, 0, getWidth(), getHeight());
                    ee eeVar = (ee) this.b;
                    eeVar.h = 30.0f;
                    eeVar.d();
                    ((ee) this.b).b(canvas, -1, 0.85f);
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
                wq wqVar = (wq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, wqVar.d0));
                int left = wqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.j0 j0Var = wqVar.F;
                if (j0Var.getVisibility() == 0) {
                    f7 = j0Var.getAlpha() * AndroidUtilities.dp(25.0f);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(wq wqVar, Context context) {
        super(context);
        this.a = 4;
        this.d = wqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(ci.q0 q0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = q0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                fi.c cVar = new fi.c(context, 70, 0);
                frameLayout.addView(cVar, w7.z5.c(-1.0f, -1));
                org.telegram.ui.Wallet.m6 m6Var = new org.telegram.ui.Wallet.m6(170, context, false);
                this.b = m6Var;
                m6Var.setStarParticlesView(cVar);
                frameLayout.addView(m6Var, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                m6Var.setPaused(false);
                addView(frameLayout, w7.z5.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
                textView.setGravity(17);
                addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
                textView2.setGravity(17);
                addView(textView2, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new lc(context, 70, 0), w7.z5.c(-1.0f, -1));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.b = w9Var;
                w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout2.addView(w9Var, w7.z5.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, w7.z5.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView3);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.W(textView3, i12, g6Var);
                textView3.setGravity(17);
                addView(textView3, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
                y90 y90Var = new y90(context, g6Var);
                this.d = y90Var;
                org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, g6Var);
                y90Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(y90Var, i12, g6Var);
                y90Var.setGravity(17);
                addView(y90Var, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
