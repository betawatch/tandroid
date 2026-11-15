package a8;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class i1 {
    public static FrameLayout a(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, int i7, String str, String str2) {
        FrameLayout frameLayout = new FrameLayout(activity);
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i7);
        frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, c8.ja.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var));
        textView2.setTextSize(0, org.telegram.messenger.g0.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, c8.ja.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, c8.ja.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }
}
