// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class a7b extends FrameLayout implements qk4 {
    public final z6b a;
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
    public qac x;
    public qac y;

    public a7b(Activity activity) {
        super(activity);
        z6b z6bVar = new z6b(this, activity);
        this.a = z6bVar;
        final byte b = 0;
        z6bVar.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.b = frameLayout;
        TextView textView = new TextView(activity);
        this.c = textView;
        final byte b2 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setTextColor(-1);
        textView.setText(jb6.M0(2131744317, null));
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        z6bVar.addView(frameLayout, qoe.s(-2, -1, nm7.w1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: y6b
            public final /* synthetic */ a7b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                a7b a7bVar = this.b;
                switch (b3) {
                    case 0:
                        a7bVar.b(-1);
                        break;
                    case 1:
                        a7bVar.b(0);
                        break;
                    default:
                        a7bVar.b(1);
                        break;
                }
            }
        });
        rve.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.d = frameLayout2;
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setTextColor(-1);
        textView2.setText(jb6.M0(2131744271, null));
        frameLayout2.addView(textView2, qoe.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        z6bVar.addView(frameLayout2, qoe.s(-2, -1, nm7.w1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: y6b
            public final /* synthetic */ a7b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                a7b a7bVar = this.b;
                switch (b3) {
                    case 0:
                        a7bVar.b(-1);
                        break;
                    case 1:
                        a7bVar.b(0);
                        break;
                    default:
                        a7bVar.b(1);
                        break;
                }
            }
        });
        rve.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f = frameLayout3;
        TextView textView3 = new TextView(activity);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gm.o());
        textView3.setTextColor(-1);
        textView3.setText(jb6.M0(2131744136, null));
        frameLayout3.addView(textView3, qoe.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        z6bVar.addView(frameLayout3, qoe.t(-2, -1, nm7.w1, 0, 0, 0, 0));
        final byte b3 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: y6b
            public final /* synthetic */ a7b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                a7b a7bVar = this.b;
                switch (b32) {
                    case 0:
                        a7bVar.b(-1);
                        break;
                    case 1:
                        a7bVar.b(0);
                        break;
                    default:
                        a7bVar.b(1);
                        break;
                }
            }
        });
        rve.a(frameLayout3);
        addView(z6bVar, qoe.e(-2, -1, nm7.x1));
    }

    public final void a(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 18));
        this.w.setDuration(320L);
        this.w.setInterpolator(d53.h);
        this.w.start();
    }

    public final void b(int i) {
        if (this.s != i) {
            a(i);
            qac qacVar = this.x;
            if (qacVar != null) {
                qacVar.a(Integer.valueOf(i));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((s8b) this).E.G()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, qk4
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // qk4
    public void setInvert(float f) {
        this.n = f;
        this.c.setTextColor(on2.f(f, -1, -16777216));
        this.e.setTextColor(on2.f(f, -1, -16777216));
        this.h.setTextColor(on2.f(f, -1, -16777216));
    }

    public void setOnSwitchModeListener(qac qacVar) {
        this.x = qacVar;
    }

    public void setOnSwitchingModeListener(qac qacVar) {
        this.y = qacVar;
    }
}
