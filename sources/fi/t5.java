package fi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout {
    public final int a;
    public int b;
    public final bi.s1 c;
    public final FrameLayout d;
    public final di.h8 e;
    public boolean f;
    public boolean h;

    public t5(Activity activity, int i7, di.b bVar) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i7;
        TLRPC.User f10 = p10.i(i7).f();
        bi.s1 s1Var = new bi.s1(this, getContext());
        this.c = s1Var;
        di.e4 e4Var = new di.e4(getContext(), null);
        di.c4 c4Var = e4Var.a;
        c4Var.getAvatarDrawable().r(f10);
        c4Var.e(f10, c4Var.getAvatarDrawable());
        String p10 = t10.p(f10);
        di.d4 d4Var = e4Var.b;
        d4Var.l(org.telegram.messenger.i6.m(p10, d4Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        e4Var.c(hd.M0(2131745999, null), false);
        s1Var.addView(e4Var, c8.ha.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        s1Var.addView(imageView, c8.ha.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(s1Var, c8.ha.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        di.h8 h8Var = new di.h8(getContext(), bVar);
        this.e = h8Var;
        h8Var.s0 = true;
        h8Var.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        frameLayout.addView(h8Var, c8.ha.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, c8.ha.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), i0.a.o(-16777216, qs.G1)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(hd.M0(2131746256, null));
        frameLayout2.addView(textView, c8.ha.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        s1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z9, boolean z10, FrameLayout frameLayout) {
        if (z9) {
            if (this.f == z10) {
                return;
            } else {
                this.f = z10;
            }
        } else if (this.h == z10) {
            return;
        } else {
            this.h = z10;
        }
        View view = z9 ? this.c : this.d;
        view.clearAnimation();
        view.animate().alpha(z10 ? z9 ? 0.5f : 0.2f : 0.0f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.b0.b(org.telegram.ui.Components.r5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
