// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ajb extends FrameLayout {
    public int a;
    public final TextView b;
    public final TextView c;
    public final Switch d;
    public boolean e;
    public LinearLayout f;
    public io h;
    public View n;
    public o72 r;

    public ajb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-2, -1.0f, (z ? 5 : 3) | 48, z ? 64.0f : 21.0f, 0.0f, z ? 21.0f : 64.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 64.0f : 21.0f, 35.0f, z2 ? 21.0f : 64.0f, 0.0f));
        Switch r2 = new Switch(context, null);
        this.d = r2;
        r2.setDrawIconType(1);
        addView(r2, qoe.d(37, 40.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z) {
        if (this.f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            io ioVar = new io(getContext(), false, true, true);
            this.h = ioVar;
            ioVar.setTextSize(gm.L(14.0f));
            this.h.getDrawable().K = true;
            io ioVar2 = this.h;
            int i = cmb.F6;
            anb.U(ioVar2, i, null);
            this.h.setTypeface(gm.o());
            this.h.b(0.4f, 320L, d53.h);
            this.f.addView(this.h, qoe.c(20.0f, -2));
            this.n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            anb.x(this, mutate, i, null, PorterDuff.Mode.MULTIPLY);
            this.n.setBackground(mutate);
            this.f.addView(this.n, qoe.r(16, 16, 16));
            this.f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f, qoe.e(-2, -2, 16));
            o72 o72Var = new o72(getContext(), (byte) 27);
            this.r = o72Var;
            o72Var.setBackground(cmb.f0(cmb.w0(null, cmb.h6, false), 2, -1));
            addView(this.r, qoe.e(76, -1, jb6.a0 ? 3 : 5));
        }
        this.h.setText(str);
        this.n.animate().cancel();
        this.n.animate().rotation(z ? 0.0f : 180.0f).setDuration(340L).setInterpolator(d53.h).start();
        this.r.setOnClickListener(new xl3(runnable, (byte) 8));
    }

    public final void b(boolean z, boolean z2) {
        super.setEnabled(z);
        Switch r0 = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        if (z2) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r0.clearAnimation();
            textView2.animate().alpha(z ? 1.0f : 0.5f).start();
            textView.animate().alpha(z ? 1.0f : 0.5f).start();
            r0.animate().alpha(z ? 1.0f : 0.5f).start();
            return;
        }
        if (z) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r0.setAlpha(1.0f);
        } else {
            r0.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z, boolean z2) {
        d(str, z, z2, false);
    }

    public final void d(String str, boolean z, boolean z2, boolean z3) {
        TextView textView = this.b;
        textView.setText(str);
        this.d.c(z, z3);
        this.e = z2;
        this.c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            boolean z2 = jb6.a0;
            TextView textView = this.b;
            if (z2) {
                linearLayout.setTranslationX((textView.getLeft() - this.f.getMeasuredWidth()) - gm.L(8.0f));
            } else {
                linearLayout.setTranslationX(gm.L(8.0f) + textView.getRight());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.c.getVisibility() == 0 ? 64.0f : 50.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        this.d.c(z, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.b;
        textView.clearAnimation();
        TextView textView2 = this.c;
        textView2.clearAnimation();
        Switch r2 = this.d;
        r2.clearAnimation();
        if (z) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r2.setAlpha(1.0f);
            io ioVar = this.h;
            if (ioVar != null) {
                ioVar.setAlpha(1.0f);
            }
            View view = this.n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r2.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        io ioVar2 = this.h;
        if (ioVar2 != null) {
            ioVar2.setAlpha(0.6f);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i) {
        this.d.setIcon(i);
    }
}
