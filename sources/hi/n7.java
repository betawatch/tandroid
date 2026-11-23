package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class n7 extends FrameLayout implements m2 {
    public final m7 a;
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
    public y10 x;
    public y10 y;

    public n7(Context context) {
        super(context);
        m7 m7Var = new m7(this, context);
        this.a = m7Var;
        final int i7 = 0;
        m7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final int i10 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131744388, null));
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout, c8.ma.s(-2, -1, ls.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l7
            public final /* synthetic */ n7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
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
        c8.ra.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(hd.N0(2131744342, null));
        frameLayout2.addView(textView2, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout2, c8.ma.s(-2, -1, ls.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l7
            public final /* synthetic */ n7 b;

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
        c8.ra.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(hd.N0(2131744207, null));
        frameLayout3.addView(textView3, c8.ma.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m7Var.addView(frameLayout3, c8.ma.t(-2, -1, ls.x1, 0, 0, 0, 0));
        final int i11 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l7
            public final /* synthetic */ n7 b;

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
        c8.ra.a(frameLayout3);
        addView(m7Var, c8.ma.e(-2, -1, ls.y1));
    }

    public final void a(int i7) {
        if (this.s == i7) {
            return;
        }
        this.s = i7;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i7);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 5));
        this.w.setDuration(320L);
        this.w.setInterpolator(nr.h);
        this.w.start();
    }

    public final void b(int i7) {
        if (this.s == i7) {
            return;
        }
        a(i7);
        y10 y10Var = this.x;
        if (y10Var != null) {
            y10Var.a(Integer.valueOf(i7));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((m9) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, hi.m2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // hi.m2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(y10 y10Var) {
        this.x = y10Var;
    }

    public void setOnSwitchingModeListener(y10 y10Var) {
        this.y = y10Var;
    }
}
