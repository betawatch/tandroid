package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class n8 extends FrameLayout implements r2 {
    public final m8 a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public float n;
    public float r;
    public int s;
    public ValueAnimator v;
    public Utilities.Callback w;
    public Utilities.Callback x;

    public n8(Context context) {
        super(context);
        m8 m8Var = new m8(this, context);
        this.a = m8Var;
        m8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m8Var.addView(frameLayout, g7.e6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i9 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: kh.l8
            public final /* synthetic */ n8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
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
        g7.g6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, g7.e6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m8Var.addView(frameLayout2, g7.e6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i10 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: kh.l8
            public final /* synthetic */ n8 b;

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
        g7.g6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, g7.e6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        m8Var.addView(frameLayout3, g7.e6.t(-2, -1, 112, 0, 0, 0, 0));
        final int i11 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: kh.l8
            public final /* synthetic */ n8 b;

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
        g7.g6.a(frameLayout3);
        addView(m8Var, g7.e6.e(-2, -1, 113));
    }

    public final void a(int i9) {
        if (this.s == i9) {
            return;
        }
        this.s = i9;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i9);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new g4(this, 4));
        this.v.setDuration(320L);
        this.v.setInterpolator(gr.h);
        this.v.start();
    }

    public final void b(int i9) {
        if (this.s == i9) {
            return;
        }
        a(i9);
        Utilities.Callback callback = this.w;
        if (callback != null) {
            callback.run(Integer.valueOf(i9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((oa) this).y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, kh.r2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // kh.r2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.a.d(f10, -1, -16777216));
        this.e.setTextColor(i0.a.d(f10, -1, -16777216));
        this.h.setTextColor(i0.a.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.x = callback;
    }
}
