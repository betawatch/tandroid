package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class p7 extends FrameLayout implements m2 {
    public final o7 a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public float n;
    public float r;
    public int s;
    public ValueAnimator w;
    public u10 x;
    public u10 y;

    public p7(Context context) {
        super(context);
        o7 o7Var = new o7(this, context);
        this.a = o7Var;
        final int i3 = 0;
        o7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final int i10 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131744641, null));
        frameLayout.addView(textView, mf.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout, mf.s(-2, -1, hs.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: gi.n7
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.b(-1);
                        break;
                    case 1:
                        this.b.b(0);
                        break;
                    default:
                        this.b.b(1);
                        break;
                }
            }
        });
        pf.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(bd.M0(2131744595, null));
        frameLayout2.addView(textView2, mf.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout2, mf.s(-2, -1, hs.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: gi.n7
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b(-1);
                        break;
                    case 1:
                        this.b.b(0);
                        break;
                    default:
                        this.b.b(1);
                        break;
                }
            }
        });
        pf.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(bd.M0(2131744460, null));
        frameLayout3.addView(textView3, mf.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout3, mf.t(-2, -1, hs.x1, 0, 0, 0, 0));
        final int i11 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: gi.n7
            public final /* synthetic */ p7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.b(-1);
                        break;
                    case 1:
                        this.b.b(0);
                        break;
                    default:
                        this.b.b(1);
                        break;
                }
            }
        });
        pf.a(frameLayout3);
        addView(o7Var, mf.e(-2, -1, hs.y1));
    }

    public final void a(int i3) {
        if (this.s == i3) {
            return;
        }
        this.s = i3;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i3);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.w.setDuration(320L);
        this.w.setInterpolator(xq.h);
        this.w.start();
    }

    public final void b(int i3) {
        if (this.s == i3) {
            return;
        }
        a(i3);
        u10 u10Var = this.x;
        if (u10Var != null) {
            u10Var.a(Integer.valueOf(i3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((p9) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, gi.m2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // gi.m2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(u10 u10Var) {
        this.x = u10Var;
    }

    public void setOnSwitchingModeListener(u10 u10Var) {
        this.y = u10Var;
    }
}
