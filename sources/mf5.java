// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class mf5 extends FrameLayout {
    public int a;
    public final byte b;
    public final byte c;
    public final TextView d;
    public final in e;
    public final ema f;
    public int h;
    public final boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public mf5(Context context, int i, int i2, int i3, int i4, boolean z, boolean z2, vnb vnbVar) {
        super(context);
        this.h = 40;
        this.b = i2;
        this.c = i4;
        this.n = z2;
        if (z2) {
            in inVar = new in(getContext(), false, false, false);
            this.e = inVar;
            inVar.setTextSize(hl.L(14.0f));
            inVar.setTypeface(hl.o());
            inVar.setGravity((ob6.a0 ? 5 : 3) | 16);
            yob.U(inVar, i, vnbVar);
            inVar.setTag(Integer.valueOf(i));
            inVar.getDrawable().r(true, false);
            float f = i2;
            addView(inVar, tre.d(-1, this.h - i3, (ob6.a0 ? 5 : 3) | 48, f, i3, f, z ? 0.0f : i4));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            bs2.t(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((ob6.a0 ? 5 : 3) | 16);
            textView.setMinHeight(hl.L(this.h - i3));
            yob.X(textView, i, vnbVar);
            textView.setTag(Integer.valueOf(i));
            float f2 = i2;
            addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, f2, i3, f2, z ? 0.0f : i4));
        }
        if (z) {
            ema emaVar = new ema(getContext());
            this.f = emaVar;
            emaVar.setTextSize(13);
            emaVar.setGravity((ob6.a0 ? 3 : 5) | 48);
            float f3 = i2;
            addView(emaVar, tre.d(-1, -1.0f, (ob6.a0 ? 3 : 5) | 48, f3, 21.0f, f3, i4));
        }
        WeakHashMap weakHashMap = ihc.a;
        new wgc(R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(ArrayList arrayList, boolean z) {
        TextView textView = this.d;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.5f));
        } else {
            textView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public final void b(boolean z) {
        super.setEnabled(z);
        this.d.animate().alpha(z ? 1.0f : 0.5f).start();
    }

    public final void c(CharSequence charSequence, boolean z) {
        int i;
        boolean z2 = ob6.a0;
        if (this.n) {
            i = z2 ? 5 : 3;
            in inVar = this.e;
            inVar.setGravity(i | 16);
            inVar.c(charSequence, z, true);
            return;
        }
        i = z2 ? 5 : 3;
        TextView textView = this.d;
        textView.setGravity(i | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public ema getTextView2() {
        return this.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setHeading(true);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
            }
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
    }

    public void setBottomMargin(int i) {
        float f = i;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = hl.L(f);
        ema emaVar = this.f;
        if (emaVar != null) {
            ((FrameLayout.LayoutParams) emaVar.getLayoutParams()).bottomMargin = hl.L(f);
        }
    }

    public void setHeight(int i) {
        this.h = i;
        int L = hl.L(i);
        TextView textView = this.d;
        int i2 = L - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i2) {
            textView.setMinHeight(i2);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        ema emaVar = this.f;
        if (emaVar == null) {
            return;
        }
        emaVar.l(charSequence, false);
    }

    public void setTextColor(int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i);
        }
        in inVar = this.e;
        if (inVar != null) {
            inVar.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        if (!this.n) {
            this.d.setTextSize(1, f);
        } else {
            this.e.setTextSize(hl.L(f));
        }
    }

    public void setTopMargin(int i) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = hl.L(i);
        setHeight(this.h);
    }

    public mf5(Context context, vnb vnbVar) {
        this(context, aob.L6, 20, 7, false, vnbVar);
    }

    public mf5(Context context, int i) {
        this(context, aob.L6, i, 7, false, null);
    }

    public mf5(Context context, int i, int i2, int i3, boolean z, vnb vnbVar) {
        this(context, i, i2, i3, 0, z, false, vnbVar);
    }

    public mf5(Context context) {
        this(context, aob.L6, 20, 7, false, null);
    }
}
