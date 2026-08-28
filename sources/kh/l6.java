package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l6 extends FrameLayout {
    public final int a;
    public int b;
    public final gh.h1 c;
    public final FrameLayout d;
    public final ih.e8 e;
    public boolean f;
    public boolean h;

    public l6(Activity activity, int i9, ih.b bVar) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i9;
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
        gh.h1 h1Var = new gh.h1(this, getContext());
        this.c = h1Var;
        ih.e4 e4Var = new ih.e4(getContext(), null);
        e4Var.a.getAvatarDrawable().m(i9, currentUser);
        ih.d4 d4Var = e4Var.a;
        d4Var.e(currentUser, d4Var.getAvatarDrawable());
        e4Var.b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), e4Var.b.getPaint().getFontMetricsInt(), false), false);
        e4Var.c(LocaleController.getString(R.string.RightNow), false);
        h1Var.addView(e4Var, g7.e6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.addView(imageView, g7.e6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(h1Var, g7.e6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        ih.e8 e8Var = new ih.e8(getContext(), bVar);
        this.e = e8Var;
        e8Var.o0 = true;
        e8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(e8Var, g7.e6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, g7.e6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, g7.e6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, g7.e6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, g7.e6.c(-1.0f, -1));
        h1Var.setAlpha(0.0f);
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
        this.e.U.b(org.telegram.ui.Components.t5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
