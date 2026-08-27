package gg;

import ag.w0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import hh.da;
import hh.m9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public a(Context context, c6 c6Var, zk0 zk0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new y5(this);
        this.b = c6Var;
        this.c = zk0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                y5 y5Var = (y5) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(g6.v0(g6.a7, (c6) this.b));
                zk0 zk0Var = (zk0) this.c;
                if (zk0Var != null) {
                    paint.setAlpha((int) (y5Var.d(zk0Var.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (y5Var.d(1.0f, false) * 255.0f));
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
        addView(frameLayout, z5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, z5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        p80 p80Var = new p80(context, null);
        this.c = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p80Var.setGravity(1);
        addView(p80Var, z5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, z5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, int i10, c6 c6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        m9 m9Var = new m9(context, 70, 0);
        frameLayout.addView(m9Var, z5.c(-1.0f, -1));
        bg.i iVar = new bg.i(context, 1, 2);
        this.b = iVar;
        bg.a aVar = iVar.b;
        aVar.w = g6.fk;
        aVar.x = g6.gk;
        aVar.b();
        iVar.setStarParticlesView(m9Var);
        frameLayout.addView(iVar, z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        iVar.setPaused(false);
        da daVar = new da(context, i10, c6Var);
        this.c = daVar;
        b6.a(daVar);
        daVar.setOnClickListener(new w0(this, 19));
        frameLayout.addView(daVar, z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        pa.m(20.0f, 1, textView);
        int i11 = g6.j5;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(17);
        addView(textView, z5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.v0(i11, c6Var));
        textView2.setGravity(17);
        addView(textView2, z5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
