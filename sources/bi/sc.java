package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class sc extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final ViewGroup d;
    public final Object e;

    public sc(Context context, org.telegram.ui.ActionBar.u6 u6Var, nm0 nm0Var) {
        super(context);
        this.b = new Paint(1);
        this.e = new org.telegram.ui.Components.h6(this);
        this.c = u6Var;
        this.d = nm0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.b;
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, (org.telegram.ui.ActionBar.u6) this.c));
                nm0 nm0Var = (nm0) this.d;
                if (nm0Var != null) {
                    paint.setAlpha((int) (h6Var.d(nm0Var.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (h6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public sc(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, kb1.u(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, kb1.t(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        aa0 aa0Var = new aa0(context, null);
        this.c = aa0Var;
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        aa0Var.setGravity(1);
        addView(aa0Var, kb1.t(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, kb1.u(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public sc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ec ecVar = new ec(context, 70, 0);
        frameLayout.addView(ecVar, kb1.g(-1.0f, -1));
        ug.n nVar = new ug.n(context, 1, 2);
        this.c = nVar;
        ug.g gVar = nVar.b;
        gVar.z = org.telegram.ui.ActionBar.y6.fk;
        gVar.A = org.telegram.ui.ActionBar.y6.gk;
        gVar.b();
        nVar.setStarParticlesView(ecVar);
        frameLayout.addView(nVar, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        nVar.setPaused(false);
        rc rcVar = new rc(context, i10, u6Var);
        this.d = rcVar;
        kb1.b(rcVar);
        rcVar.setOnClickListener(new ai.s(this, 12));
        frameLayout.addView(rcVar, kb1.h(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, kb1.g(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        ic.a.o(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setGravity(17);
        addView(textView, kb1.x(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var);
        textView2.setGravity(17);
        addView(textView2, kb1.x(-2, -2, 1, 0, 9, 0, 18));
    }
}
