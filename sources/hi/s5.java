package hi;

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
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public final int a;
    public int b;
    public final di.e1 c;
    public final FrameLayout d;
    public final fi.a8 e;
    public boolean f;
    public boolean h;

    public s5(Activity activity, int i7, fi.b bVar) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i7;
        TLRPC.User f10 = m10.i(i7).f();
        di.e1 e1Var = new di.e1(this, getContext());
        this.c = e1Var;
        fi.x3 x3Var = new fi.x3(getContext(), null);
        fi.v3 v3Var = x3Var.a;
        v3Var.getAvatarDrawable().r(f10);
        v3Var.f(f10, v3Var.getAvatarDrawable());
        String p10 = q10.p(f10);
        fi.w3 w3Var = x3Var.b;
        w3Var.l(org.telegram.messenger.j6.m(p10, w3Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        x3Var.c(hd.M0(2131745998, null), false);
        e1Var.addView(x3Var, c8.ja.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        e1Var.addView(imageView, c8.ja.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(e1Var, c8.ja.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        fi.a8 a8Var = new fi.a8(getContext(), bVar);
        this.e = a8Var;
        a8Var.t0 = true;
        a8Var.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        frameLayout.addView(a8Var, c8.ja.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, c8.ja.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), i0.a.o(-16777216, ns.G1)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(hd.M0(2131746255, null));
        frameLayout2.addView(textView, c8.ja.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, c8.ja.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, c8.ja.c(-1.0f, -1));
        e1Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        if (z10) {
            if (this.f == z11) {
                return;
            } else {
                this.f = z11;
            }
        } else if (this.h == z11) {
            return;
        } else {
            this.h = z11;
        }
        View view = z10 ? this.c : this.d;
        view.clearAnimation();
        view.animate().alpha(z11 ? z10 ? 0.5f : 0.2f : 0.0f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z11 ? 0.0f : 1.0f).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.c0.b(org.telegram.ui.Components.p5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
