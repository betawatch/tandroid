package bi;

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
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class da extends FrameLayout implements l3 {
    public final ca a;
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

    public da(Context context) {
        super(context);
        ca caVar = new ca(this, context);
        this.a = caVar;
        caVar.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        caVar.addView(frameLayout, w7.a6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i10 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bi.ba
            public final /* synthetic */ da b;

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
        w7.c6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, w7.a6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        caVar.addView(frameLayout2, w7.a6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i11 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.ba
            public final /* synthetic */ da b;

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
        w7.c6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, w7.a6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        caVar.addView(frameLayout3, w7.a6.t(-2, -1, 112, 0, 0, 0, 0));
        final int i12 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.ba
            public final /* synthetic */ da b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
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
        w7.c6.a(frameLayout3);
        addView(caVar, w7.a6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 10));
        this.v.setDuration(320L);
        this.v.setInterpolator(wr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.s == i10) {
            return;
        }
        a(i10);
        Utilities.Callback callback = this.w;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((pc) this).y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, bi.l3
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // bi.l3
    public void setInvert(float f7) {
        this.n = f7;
        this.c.setTextColor(i0.a.d(f7, -1, -16777216));
        this.e.setTextColor(i0.a.d(f7, -1, -16777216));
        this.h.setTextColor(i0.a.d(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.x = callback;
    }
}
