package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import j3.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.d31;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 23:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 14:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                int intrinsicHeight = f6.i3.getIntrinsicHeight();
                f6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                f6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), f6.j2);
                break;
            case 7:
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), f6.k0);
                break;
            case 17:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), f6.k0);
                break;
            case 25:
                int intrinsicHeight2 = f6.i3.getIntrinsicHeight();
                f6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                f6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), f6.j2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 18:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                break;
            case 16:
                super.onLayout(z10, i9, i10, i11, i12);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    setPivotY(((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17 ? getHeight() / 2.0f : 0.0f);
                    setScaleX(min);
                    setScaleY(min);
                    break;
                }
                break;
            case 19:
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > getMeasuredWidth()) {
                            i14 = l0.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                        i13 = l0.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                    }
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                break;
            case 4:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                break;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                super.onMeasure(i9, i10);
                break;
            case 6:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i9)), i10);
                break;
            case 10:
                super.onMeasure(i9, i10);
                break;
            case 11:
                super.onMeasure(i9, i10);
                break;
            case 12:
                super.onMeasure(i9, i10);
                break;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), ll.C(48.0f, 1, TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                int childCount = getChildCount();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        if (getChildAt(i14).getMeasuredWidth() + i12 > View.MeasureSpec.getSize(i9)) {
                            i13 = l0.C(8.0f, getChildAt(i14).getMeasuredHeight(), i13);
                            i12 = 0;
                        }
                        i12 = l0.C(16.0f, getChildAt(i14).getMeasuredWidth(), i12);
                        i11 = getChildAt(i14).getMeasuredHeight() + i13;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i11);
                break;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
                break;
            case 21:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
                measureChildren(makeMeasureSpec, i10);
                int i15 = 0;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    i15 = Math.max(i15, getChildAt(i16).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i9, i10);
                setPivotY(getMeasuredHeight());
                break;
            case 29:
                super.onMeasure(i9, ll.C(36.0f, View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 15:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n31 n31Var, Context context, int i9, String str, CharSequence charSequence) {
        super(context);
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        b6 b6Var4;
        this.a = 28;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i9).mutate();
        int i10 = f6.G6;
        b6Var = ((f3) n31Var).resourcesProvider;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, e6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        b6Var2 = ((f3) n31Var).resourcesProvider;
        textView.setTextColor(f6.v0(i10, b6Var2));
        r0.u(14.0f, 1, textView);
        addView(textView, e6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        l80 l80Var = new l80(getContext(), null);
        l80Var.setText(charSequence);
        l80Var.setTextSize(1, 14.0f);
        int i11 = f6.Pi;
        b6Var3 = ((f3) n31Var).resourcesProvider;
        l80Var.setTextColor(f6.v0(i11, b6Var3));
        int i12 = f6.gc;
        b6Var4 = ((f3) n31Var).resourcesProvider;
        l80Var.setLinkTextColor(f6.v0(i12, b6Var4));
        l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        l80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(l80Var, e6.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d31 d31Var, Context context, int i9, String str, CharSequence charSequence) {
        super(context);
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        b6 b6Var4;
        this.a = 27;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i9).mutate();
        int i10 = f6.G6;
        b6Var = ((f3) d31Var).resourcesProvider;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, e6.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        b6Var2 = ((f3) d31Var).resourcesProvider;
        textView.setTextColor(f6.v0(i10, b6Var2));
        r0.u(14.0f, 1, textView);
        addView(textView, e6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        l80 l80Var = new l80(getContext(), null);
        l80Var.setText(charSequence);
        l80Var.setTextSize(1, 14.0f);
        int i11 = f6.Pi;
        b6Var3 = ((f3) d31Var).resourcesProvider;
        l80Var.setTextColor(f6.v0(i11, b6Var3));
        int i12 = f6.gc;
        b6Var4 = ((f3) d31Var).resourcesProvider;
        l80Var.setLinkTextColor(f6.v0(i12, b6Var4));
        l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(l80Var, e6.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 18.0f, z10 ? 68.0f : 27.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, int i9) {
        super(context);
        this.a = 22;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i9);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = f6.j5;
        imageView.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        boolean z10 = LocaleController.isRTL;
        addView(imageView, e6.d(24, 24.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 22.0f, 0.0f, z10 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(f6.w0(null, i10, false));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z11 = LocaleController.isRTL;
        addView(textView, e6.d(-1, -2.0f, 23, z11 ? 0.0f : 61.0f, 0.0f, z11 ? 61.0f : 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i9, String str, CharSequence charSequence, b6 b6Var) {
        super(context);
        this.a = 9;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = f6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i9);
        addView(imageView, e6.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, e6.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        l80 l80Var = new l80(context, null);
        l80Var.setTypeface(AndroidUtilities.bold());
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(f6.v0(i10, b6Var));
        int i11 = f6.gc;
        l80Var.setLinkTextColor(f6.v0(i11, b6Var));
        l80Var.setText(str);
        linearLayout.addView(l80Var, e6.t(-1, -2, 55, 0, 0, 0, 2));
        l80 l80Var2 = new l80(context, null);
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setTextColor(f6.v0(f6.y6, b6Var));
        l80Var2.setLinkTextColor(f6.v0(i11, b6Var));
        l80Var2.setText(charSequence);
        linearLayout.addView(l80Var2, e6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        this.a = 26;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z10, int i9, int i10, int i11, int i12) {
    }
}
