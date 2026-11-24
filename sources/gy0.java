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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gy0 extends FrameLayout {
    public final fn a;
    public final ImageView b;
    public final ImageView c;
    public final byte d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public gy0(int i, ylb ylbVar, Context context) {
        super(context);
        this.f = false;
        this.d = i;
        if (i != 4) {
            setBackgroundDrawable(cmb.K0(ylbVar, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        anb.s(imageView, cmb.I5, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.e(56, 48, (jb6.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        anb.s(imageView2, cmb.g7, ylbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView2, qoe.e(56, 48, (jb6.a0 ? 3 : 5) | 16));
        fn fnVar = new fn(context);
        this.a = fnVar;
        fnVar.setLines(1);
        fnVar.setSingleLine(true);
        fnVar.setGravity(1);
        fnVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0 || i == 4) {
            anb.X(fnVar, cmb.i5, ylbVar);
            fnVar.setTextSize(1, 16.0f);
            addView(fnVar, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
            return;
        }
        if (i == 1) {
            fnVar.setGravity(17);
            anb.X(fnVar, cmb.i5, ylbVar);
            fnVar.setTextSize(1, 14.0f);
            fnVar.setTypeface(gm.o());
            addView(fnVar, qoe.c(-1.0f, -1));
            return;
        }
        if (i == 2) {
            fnVar.setGravity(17);
            anb.X(fnVar, cmb.Ii, ylbVar);
            fnVar.setTextSize(1, 14.0f);
            fnVar.setTypeface(gm.o());
            fnVar.setBackground(ulb.e(cmb.v0(cmb.Ei, ylbVar), 6.0f));
            addView(fnVar, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i, Drawable drawable, boolean z) {
        fn fnVar = this.a;
        fnVar.setText(charSequence);
        ImageView imageView = this.b;
        if (i == 0 && drawable == null) {
            imageView.setVisibility(4);
            fnVar.setPadding(gm.L(z ? 21.0f : 16.0f), 0, gm.L(z ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i);
        }
        imageView.setVisibility(0);
        boolean z2 = jb6.a0;
        if (z) {
            fnVar.setPadding(gm.L(z2 ? 21.0f : 72.0f), 0, gm.L(jb6.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(jb6.a0 ? 0 : gm.L(5.0f), 0, jb6.a0 ? gm.L(5.0f) : 5, 0);
        } else {
            fnVar.setPadding(gm.L(z2 ? 16.0f : 72.0f), 0, gm.L(jb6.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public fn getTextView() {
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(i3), TLObject.FLAG_30));
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
