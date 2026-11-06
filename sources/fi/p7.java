package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class p7 extends FrameLayout implements o2 {
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
    public c20 x;
    public c20 y;

    public p7(Context context) {
        super(context);
        o7 o7Var = new o7(this, context);
        this.a = o7Var;
        final int i7 = 0;
        o7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final int i10 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131744632, null));
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout, c8.ha.s(-2, -1, qs.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: fi.n7
            public final /* synthetic */ p7 b;

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
        c8.ka.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131744586, null));
        frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout2, c8.ha.s(-2, -1, qs.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.n7
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
        c8.ka.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(hd.M0(2131744451, null));
        frameLayout3.addView(textView3, c8.ha.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        o7Var.addView(frameLayout3, c8.ha.t(-2, -1, qs.x1, 0, 0, 0, 0));
        final int i11 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: fi.n7
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
        c8.ka.a(frameLayout3);
        addView(o7Var, c8.ha.e(-2, -1, qs.y1));
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
        ofFloat.addUpdateListener(new v3(this, 4));
        this.w.setDuration(320L);
        this.w.setInterpolator(xq.h);
        this.w.start();
    }

    public final void b(int i7) {
        if (this.s == i7) {
            return;
        }
        a(i7);
        c20 c20Var = this.x;
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(i7));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((p9) this).D.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, fi.o2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // fi.o2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(c20 c20Var) {
        this.x = c20Var;
    }

    public void setOnSwitchingModeListener(c20 c20Var) {
        this.y = c20Var;
    }
}
