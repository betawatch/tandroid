package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class o7 extends FrameLayout implements m2 {
    public final n7 a;
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
    public z10 x;
    public z10 y;

    public o7(Context context) {
        super(context);
        n7 n7Var = new n7(this, context);
        this.a = n7Var;
        final int i7 = 0;
        n7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final int i10 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131744631, null));
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout, c8.ja.s(-2, -1, ns.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: hi.m7
            public final /* synthetic */ o7 b;

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
        c8.na.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131744585, null));
        frameLayout2.addView(textView2, c8.ja.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout2, c8.ja.s(-2, -1, ns.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.m7
            public final /* synthetic */ o7 b;

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
        c8.na.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(hd.M0(2131744450, null));
        frameLayout3.addView(textView3, c8.ja.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        n7Var.addView(frameLayout3, c8.ja.t(-2, -1, ns.x1, 0, 0, 0, 0));
        final int i11 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.m7
            public final /* synthetic */ o7 b;

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
        c8.na.a(frameLayout3);
        addView(n7Var, c8.ja.e(-2, -1, ns.y1));
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
        this.w.setInterpolator(er.h);
        this.w.start();
    }

    public final void b(int i7) {
        if (this.s == i7) {
            return;
        }
        a(i7);
        z10 z10Var = this.x;
        if (z10Var != null) {
            z10Var.a(Integer.valueOf(i7));
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

    public void setOnSwitchModeListener(z10 z10Var) {
        this.x = z10Var;
    }

    public void setOnSwitchingModeListener(z10 z10Var) {
        this.y = z10Var;
    }
}
