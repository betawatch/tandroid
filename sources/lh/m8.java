package lh;

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
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class m8 extends FrameLayout implements q2 {
    public final l8 a;
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

    public m8(Context context) {
        super(context);
        l8 l8Var = new l8(this, context);
        this.a = l8Var;
        l8Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout, h7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i10 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: lh.k8
            public final /* synthetic */ m8 b;

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
        h7.b6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, h7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout2, h7.z5.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i11 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: lh.k8
            public final /* synthetic */ m8 b;

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
        h7.b6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, h7.z5.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        l8Var.addView(frameLayout3, h7.z5.t(-2, -1, 112, 0, 0, 0, 0));
        final int i12 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: lh.k8
            public final /* synthetic */ m8 b;

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
        h7.b6.a(frameLayout3);
        addView(l8Var, h7.z5.e(-2, -1, 113));
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
        ofFloat.addUpdateListener(new m2(this, 7));
        this.v.setDuration(320L);
        this.v.setInterpolator(er.h);
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
        if (((la) this).y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, lh.q2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // lh.q2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.b.d(f10, -1, -16777216));
        this.e.setTextColor(i0.b.d(f10, -1, -16777216));
        this.h.setTextColor(i0.b.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.x = callback;
    }
}
