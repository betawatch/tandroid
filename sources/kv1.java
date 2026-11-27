// default package

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class kv1 extends LinearLayout {
    public ImageView a;
    public TextView b;
    public Space c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.c == null) {
            this.c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.a;
    }

    public TextView getTextView() {
        return this.b;
    }

    public void setEditButton(boolean z) {
        this.d = z;
    }

    public void setOnlyIconMode(boolean z) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(z ? 8 : 0);
        }
        Space space = this.c;
        if (space != null) {
            space.setVisibility(z ? 8 : 0);
        }
    }
}
