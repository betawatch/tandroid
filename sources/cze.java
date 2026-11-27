// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class cze {
    public static FrameLayout a(Activity activity, vnb vnbVar, int i, int i2, String str, String str2) {
        FrameLayout frameLayout = new FrameLayout(activity);
        ImageView imageView = new ImageView(activity);
        imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i);
        frameLayout.addView(imageView, tre.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        textView.setTextColor(aob.v0(aob.j5, vnbVar));
        textView.setTypeface(hl.o());
        textView.setTextSize(0, hl.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, tre.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(aob.v0(aob.z6, vnbVar));
        textView2.setTextSize(0, hl.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, tre.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, tre.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }
}
