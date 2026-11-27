// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hx0 extends FrameLayout {
    public final gm a;
    public final ImageView b;
    public final ImageView c;
    public final byte d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public hx0(int i, vnb vnbVar, Context context) {
        super(context);
        this.f = false;
        this.d = i;
        if (i != 4) {
            setBackgroundDrawable(aob.K0(vnbVar, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        yob.s(imageView, aob.J5, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.e(56, 48, (ob6.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        yob.s(imageView2, aob.h7, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView2, tre.e(56, 48, (ob6.a0 ? 3 : 5) | 16));
        gm gmVar = new gm(context);
        this.a = gmVar;
        gmVar.setLines(1);
        gmVar.setSingleLine(true);
        gmVar.setGravity(1);
        gmVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0 || i == 4) {
            yob.X(gmVar, aob.j5, vnbVar);
            gmVar.setTextSize(1, 16.0f);
            addView(gmVar, tre.e(-2, -2, (ob6.a0 ? 5 : 3) | 16));
            return;
        }
        if (i == 1) {
            gmVar.setGravity(17);
            yob.X(gmVar, aob.j5, vnbVar);
            gmVar.setTextSize(1, 14.0f);
            gmVar.setTypeface(hl.o());
            addView(gmVar, tre.c(-1.0f, -1));
            return;
        }
        if (i == 2) {
            gmVar.setGravity(17);
            yob.X(gmVar, aob.Ji, vnbVar);
            gmVar.setTextSize(1, 14.0f);
            gmVar.setTypeface(hl.o());
            gmVar.setBackground(rnb.e(aob.v0(aob.Fi, vnbVar), 6.0f));
            addView(gmVar, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i, Drawable drawable, boolean z) {
        gm gmVar = this.a;
        gmVar.setText(charSequence);
        ImageView imageView = this.b;
        if (i == 0 && drawable == null) {
            imageView.setVisibility(4);
            gmVar.setPadding(hl.L(z ? 21.0f : 16.0f), 0, hl.L(z ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i);
        }
        imageView.setVisibility(0);
        boolean z2 = ob6.a0;
        if (z) {
            gmVar.setPadding(hl.L(z2 ? 21.0f : 72.0f), 0, hl.L(ob6.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(ob6.a0 ? 0 : hl.L(5.0f), 0, ob6.a0 ? hl.L(5.0f) : 5, 0);
        } else {
            gmVar.setPadding(hl.L(z2 ? 16.0f : 72.0f), 0, hl.L(ob6.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public gm getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        int i3 = b == 2 ? 80 : 48;
        if (b == 0) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(i3), TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        this.e = z;
        this.c.setImageResource(z ? R.drawable.checkbig : 0);
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setIconColor(int i) {
        this.b.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
