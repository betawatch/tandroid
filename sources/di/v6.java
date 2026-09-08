package di;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class v6 extends FrameLayout {
    public final int a;
    public int b;
    public final bi.e7 c;
    public final FrameLayout d;
    public final bi.ea e;
    public boolean f;
    public boolean h;

    public v6(Activity activity, int i10, bi.b bVar) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        bi.e7 e7Var = new bi.e7(this, getContext());
        this.c = e7Var;
        bi.k5 k5Var = new bi.k5(getContext(), null);
        k5Var.a.getAvatarDrawable().m(i10, currentUser);
        bi.i5 i5Var = k5Var.a;
        i5Var.e(currentUser, i5Var.getAvatarDrawable());
        k5Var.b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), k5Var.b.getPaint().getFontMetricsInt(), false), false);
        k5Var.c(LocaleController.getString(R.string.RightNow), false);
        e7Var.addView(k5Var, w7.x5.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        e7Var.addView(imageView, w7.x5.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(e7Var, w7.x5.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        bi.ea eaVar = new bi.ea(getContext(), bVar);
        this.e = eaVar;
        eaVar.s0 = true;
        eaVar.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(eaVar, w7.x5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, w7.x5.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, w7.x5.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, w7.x5.c(-1.0f, -1));
        e7Var.setAlpha(0.0f);
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
        this.e.b0.b(org.telegram.ui.Components.z5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
