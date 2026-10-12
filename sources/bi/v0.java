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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v0 extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 4:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                this.b = z9Var;
                z9Var.setRoundRadius(AndroidUtilities.dp(35.0f));
                addView(z9Var, w7.a6.q(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, w7.a6.r(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, w7.a6.n(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.c;
                if (((z0) this.d).a) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((zh.b8) this.b) == null) {
                        this.b = new zh.b8(1, MediaDataController.MAX_LINKS_COUNT);
                    }
                    ((zh.b8) this.b).f(0, 0, getWidth(), getHeight());
                    zh.b8 b8Var = (zh.b8) this.b;
                    b8Var.h = 30.0f;
                    b8Var.d();
                    ((zh.b8) this.b).b(canvas, -1, 0.85f);
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
            case 3:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                zq zqVar = (zq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i5, zqVar.d0));
                int left = zqVar.E[0].getLeft() - AndroidUtilities.dp(13.0f);
                float dp = AndroidUtilities.dp(91.0f);
                org.telegram.ui.ActionBar.j0 j0Var = zqVar.F;
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
    public v0(zq zqVar, Context context) {
        super(context);
        this.a = 3;
        this.d = zqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 5:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(new zh.r6(context, 70, 0), w7.a6.d(-1.0f, -1));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                this.b = z9Var;
                z9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
                frameLayout.addView(z9Var, w7.a6.a(100.0f, 0.0f, 32.0f, 0.0f, 24.0f, 100, 17));
                addView(frameLayout, w7.a6.d(150.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
                int i11 = org.telegram.ui.ActionBar.g6.j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
                textView.setGravity(17);
                addView(textView, w7.a6.t(-2, -2, 1, 0, 2, 0, 0));
                da0 da0Var = new da0(context, c6Var);
                this.d = da0Var;
                da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                da0Var.setTextSize(1, 14.0f);
                da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
                da0Var.setGravity(17);
                addView(da0Var, w7.a6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                ei.d dVar = new ei.d(context, 70, 0);
                frameLayout2.addView(dVar, w7.a6.d(-1.0f, -1));
                org.telegram.ui.Wallet.b6 b6Var = new org.telegram.ui.Wallet.b6(170, context, false);
                this.b = b6Var;
                b6Var.setStarParticlesView(dVar);
                frameLayout2.addView(b6Var, w7.a6.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
                b6Var.setPaused(false);
                addView(frameLayout2, w7.a6.d(180.0f, -1));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView2);
                int i12 = org.telegram.ui.ActionBar.g6.j5;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
                textView2.setGravity(17);
                addView(textView2, w7.a6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView3 = new TextView(context);
                this.d = textView3;
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
                textView3.setGravity(17);
                addView(textView3, w7.a6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var, Context context) {
        super(context);
        this.a = 0;
        this.d = z0Var;
        this.c = new Path();
    }
}
