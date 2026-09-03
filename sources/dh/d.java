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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.ai;
import org.telegram.ui.g41;
import org.telegram.ui.w31;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 24:
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
            case 15:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            case 2:
            default:
                return super.drawChild(canvas, view, j10);
            case 3:
                return false;
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 6:
                int intrinsicHeight = j6.i3.getIntrinsicHeight();
                j6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                j6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), j6.j2);
                break;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.getShadowHeight(), j6.k0);
                break;
            case 18:
                canvas.drawLine(0.0f, AndroidUtilities.dp(40.0f), getMeasuredWidth(), AndroidUtilities.dp(40.0f), j6.k0);
                break;
            case 26:
                int intrinsicHeight2 = j6.i3.getIntrinsicHeight();
                j6.i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight2);
                j6.i3.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight2, getMeasuredWidth(), getMeasuredHeight(), j6.j2);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 19:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 5:
                break;
            case 17:
                super.onLayout(z4, i10, i11, i12, i13);
                if (getParent() instanceof View) {
                    float min = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    setPivotY(((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17 ? getHeight() / 2.0f : 0.0f);
                    setScaleX(min);
                    setScaleY(min);
                    break;
                }
                break;
            case 20:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                            i15 = y3.C(8.0f, getChildAt(i16).getMeasuredHeight(), i15);
                            i14 = 0;
                        }
                        getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                        i14 = y3.C(16.0f, getChildAt(i16).getMeasuredWidth(), i14);
                    }
                }
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
                break;
            case 3:
            case 4:
            case 6:
            case 8:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 23:
            case 24:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                break;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(325.0f)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                break;
            case 12:
                super.onMeasure(i10, i11);
                break;
            case 13:
                super.onMeasure(i10, i11);
                break;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.ui.b.B(48.0f, 1, TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                int childCount = getChildCount();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() != 8) {
                        if (getChildAt(i15).getMeasuredWidth() + i13 > View.MeasureSpec.getSize(i10)) {
                            i14 = y3.C(8.0f, getChildAt(i15).getMeasuredHeight(), i14);
                            i13 = 0;
                        }
                        i13 = y3.C(16.0f, getChildAt(i15).getMeasuredWidth(), i13);
                        i12 = getChildAt(i15).getMeasuredHeight() + i14;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i12);
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 22:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                measureChildren(makeMeasureSpec, i11);
                int i16 = 0;
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    i16 = Math.max(i16, getChildAt(i17).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30));
                break;
            case 25:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight());
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 16:
                super.setTranslationY(f10);
                setPadding(0, 0, (int) f10, 0);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g41 g41Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        this.a = 29;
        boolean z4 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = j6.G6;
        f6Var = ((g3) g41Var).resourcesProvider;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, b6.d(24, 24.0f, z4 ? 5 : 3, z4 ? 0.0f : 27.0f, 6.0f, z4 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        f6Var2 = ((g3) g41Var).resourcesProvider;
        textView.setTextColor(j6.v0(i11, f6Var2));
        ai.o(14.0f, 1, textView);
        addView(textView, b6.d(-2, -2.0f, z4 ? 5 : 3, z4 ? 27.0f : 68.0f, 0.0f, z4 ? 68.0f : 27.0f, 0.0f));
        f90 f90Var = new f90(getContext(), null);
        f90Var.setText(charSequence);
        f90Var.setTextSize(1, 14.0f);
        int i12 = j6.Pi;
        f6Var3 = ((g3) g41Var).resourcesProvider;
        f90Var.setTextColor(j6.v0(i12, f6Var3));
        int i13 = j6.gc;
        f6Var4 = ((g3) g41Var).resourcesProvider;
        f90Var.setLinkTextColor(j6.v0(i13, f6Var4));
        f90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        f90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(f90Var, b6.d(-2, -2.0f, z4 ? 5 : 3, (z4 ? 27 : 68) - 4, 18.0f, (z4 ? 68 : 27) - 4, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w31 w31Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        this.a = 28;
        boolean z4 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = j6.G6;
        f6Var = ((g3) w31Var).resourcesProvider;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, b6.d(24, 24.0f, z4 ? 5 : 3, z4 ? 0.0f : 27.0f, 6.0f, z4 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        f6Var2 = ((g3) w31Var).resourcesProvider;
        textView.setTextColor(j6.v0(i11, f6Var2));
        ai.o(14.0f, 1, textView);
        addView(textView, b6.d(-2, -2.0f, z4 ? 5 : 3, z4 ? 27.0f : 68.0f, 0.0f, z4 ? 68.0f : 27.0f, 0.0f));
        f90 f90Var = new f90(getContext(), null);
        f90Var.setText(charSequence);
        f90Var.setTextSize(1, 14.0f);
        int i12 = j6.Pi;
        f6Var3 = ((g3) w31Var).resourcesProvider;
        f90Var.setTextColor(j6.v0(i12, f6Var3));
        int i13 = j6.gc;
        f6Var4 = ((g3) w31Var).resourcesProvider;
        f90Var.setLinkTextColor(j6.v0(i13, f6Var4));
        f90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(f90Var, b6.d(-2, -2.0f, z4 ? 5 : 3, z4 ? 27.0f : 68.0f, 18.0f, z4 ? 68.0f : 27.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, int i10) {
        super(context);
        this.a = 23;
        setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = j6.j5;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z4 = LocaleController.isRTL;
        addView(imageView, b6.d(24, 24.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 22.0f, 0.0f, z4 ? 22.0f : 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(j6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(str);
        boolean z10 = LocaleController.isRTL;
        addView(textView, b6.d(-1, -2.0f, 23, z10 ? 0.0f : 61.0f, 0.0f, z10 ? 61.0f : 0.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, int i10, String str, CharSequence charSequence, f6 f6Var) {
        super(context);
        this.a = 10;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        addView(imageView, b6.d(24, 24.0f, 51, 0.0f, 5.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        f90 f90Var = new f90(context, null);
        f90Var.setTypeface(AndroidUtilities.bold());
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTextColor(j6.v0(i11, f6Var));
        int i12 = j6.gc;
        f90Var.setLinkTextColor(j6.v0(i12, f6Var));
        f90Var.setText(str);
        linearLayout.addView(f90Var, b6.t(-1, -2, 55, 0, 0, 0, 2));
        f90 f90Var2 = new f90(context, null);
        f90Var2.setTextSize(1, 14.0f);
        f90Var2.setTextColor(j6.v0(j6.y6, f6Var));
        f90Var2.setLinkTextColor(j6.v0(i12, f6Var));
        f90Var2.setText(charSequence);
        linearLayout.addView(f90Var2, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        this.a = 27;
        setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
    }

    private final void a(boolean z4, int i10, int i11, int i12, int i13) {
    }
}
