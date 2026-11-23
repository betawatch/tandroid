package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class i8 extends FrameLayout implements v2 {
    public final h8 a;
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
    public w10 x;
    public w10 y;

    public i8(Context context) {
        super(context);
        h8 h8Var = new h8(this, context);
        this.a = h8Var;
        final int i7 = 0;
        h8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final int i10 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131744387, null));
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout, c8.na.s(-2, -1, ks.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: hi.g8
            public final /* synthetic */ i8 b;

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
        c8.sa.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131744341, null));
        frameLayout2.addView(textView2, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout2, c8.na.s(-2, -1, ks.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.g8
            public final /* synthetic */ i8 b;

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
        c8.sa.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        textView3.setText(gd.N0(2131744206, null));
        frameLayout3.addView(textView3, c8.na.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        h8Var.addView(frameLayout3, c8.na.t(-2, -1, ks.x1, 0, 0, 0, 0));
        final int i11 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.g8
            public final /* synthetic */ i8 b;

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
        c8.sa.a(frameLayout3);
        addView(h8Var, c8.na.e(-2, -1, ks.y1));
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
        ofFloat.addUpdateListener(new s3(this, 5));
        this.w.setDuration(320L);
        this.w.setInterpolator(kr.h);
        this.w.start();
    }

    public final void b(int i7) {
        if (this.s == i7) {
            return;
        }
        a(i7);
        w10 w10Var = this.x;
        if (w10Var != null) {
            w10Var.a(Integer.valueOf(i7));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((ha) this).E.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, hi.v2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // hi.v2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.a.f(f10, -1, -16777216));
        this.e.setTextColor(i0.a.f(f10, -1, -16777216));
        this.h.setTextColor(i0.a.f(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(w10 w10Var) {
        this.x = w10Var;
    }

    public void setOnSwitchingModeListener(w10 w10Var) {
        this.y = w10Var;
    }
}
