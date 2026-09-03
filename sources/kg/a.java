package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import k7.d6;
import lh.j9;
import lh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public a(Context context, f6 f6Var, rl0 rl0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new z5(this);
        this.b = f6Var;
        this.c = rl0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(j6.v0(j6.a7, (f6) this.b));
                rl0 rl0Var = (rl0) this.c;
                if (rl0Var != null) {
                    paint.setAlpha((int) (z5Var.d(rl0Var.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (z5Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public a(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, b6.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, b6.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        f90 f90Var = new f90(context, null);
        this.c = f90Var;
        f90Var.setTextSize(1, 14.0f);
        f90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        f90Var.setGravity(1);
        addView(f90Var, b6.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, b6.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, int i10, f6 f6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j9 j9Var = new j9(context, 70, 0);
        frameLayout.addView(j9Var, b6.c(-1.0f, -1));
        fg.i iVar = new fg.i(context, 1, 2);
        this.b = iVar;
        fg.a aVar = iVar.b;
        aVar.w = j6.fk;
        aVar.x = j6.gk;
        aVar.b();
        iVar.setStarParticlesView(j9Var);
        frameLayout.addView(iVar, b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        y9 y9Var = new y9(context, i10, f6Var);
        this.c = y9Var;
        d6.a(y9Var);
        y9Var.setOnClickListener(new androidx.mediarouter.app.c(this, 23));
        frameLayout.addView(y9Var, b6.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, b6.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        ai.o(20.0f, 1, textView);
        int i11 = j6.j5;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(17);
        addView(textView, b6.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.v0(i11, f6Var));
        textView2.setGravity(17);
        addView(textView2, b6.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
