// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ar8 extends FrameLayout {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar8(Context context, q89 q89Var, wjb wjbVar) {
        super(context);
        this.a = (byte) 2;
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.e(-1, -2, 23));
        be0 be0Var = new be0(context);
        be0Var.setImageDrawable(new oy8(R.raw.utyan_empty, gl.L(130.0f), gl.L(130.0f)));
        j.addView(be0Var, nme.r(kk7.N1, kk7.N1, 17));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setTextSize(1, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131749995, null));
        j.addView(textView, nme.t(-2, -2, 17, 32, 12, 32, 9));
        l46 l46Var = new l46(context, null);
        zkb.X(l46Var, bkb.z6, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(17);
        l46Var.setText(k96.M0(2131749996, null));
        l46Var.setMaxWidth(gl.L(200.0f));
        j.addView(l46Var, nme.t(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i = bkb.Ei;
        zkb.X(textView2, i, wjbVar);
        ff0 Y = bkb.Y(bkb.p1(0.1f, bkb.v0(i, wjbVar)), 6, 6);
        vkb K = zkb.K(0.1f, i);
        textView2.setBackground(Y);
        zkb.j(textView2, Y, null, K, wjbVar);
        textView2.setGravity(17);
        textView2.setText(k96.M0(2131749997, null));
        textView2.setPadding(gl.L(13.0f), 0, gl.L(13.0f), 0);
        ote.a(textView2);
        j.addView(textView2, nme.t(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(q89Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 17:
                bkb.h3.setBounds(0, 0, getMeasuredWidth(), bkb.h3.getIntrinsicHeight());
                bkb.h3.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 18:
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 22:
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 9:
            case 22:
                return false;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                canvas.drawLine(0.0f, gl.L(40.0f), getMeasuredWidth(), gl.L(40.0f), bkb.j0);
                break;
            case 16:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, bkb.j0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 12:
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 11:
                int childCount = getChildCount();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    if (getChildAt(i7).getMeasuredWidth() + i5 > getMeasuredWidth()) {
                        i6 += getChildAt(i7).getMeasuredHeight();
                        i5 = 0;
                    }
                    getChildAt(i7).layout(i5, i6, getChildAt(i7).getMeasuredWidth() + i5, getChildAt(i7).getMeasuredHeight() + i6);
                    i5 += getChildAt(i7).getMeasuredWidth();
                }
                break;
            case 12:
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 13:
                int childCount2 = getChildCount();
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < childCount2; i10++) {
                    if (getChildAt(i10).getVisibility() != 8) {
                        if (getChildAt(i10).getMeasuredWidth() + i8 > getMeasuredWidth()) {
                            i9 = de9.w(8.0f, getChildAt(i10).getMeasuredHeight(), i9);
                            i8 = 0;
                        }
                        getChildAt(i10).layout(i8, i9, getChildAt(i10).getMeasuredWidth() + i8, getChildAt(i10).getMeasuredHeight() + i9);
                        i8 = de9.w(16.0f, getChildAt(i10).getMeasuredWidth(), i8);
                    }
                }
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), gl.L(60.0f)), View.MeasureSpec.getMode(i2)));
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 12:
            case 16:
            case 17:
            case 18:
            case 21:
            default:
                super.onMeasure(i, i2);
                break;
            case 5:
                super.onMeasure(i, ug8.E(36.0f, View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(300.0f), View.MeasureSpec.getSize(i) - gl.L(32.0f)), TLObject.FLAG_31), i2);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ug8.E(48.0f, 1, TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(i, i2);
                break;
            case 11:
                int size = View.MeasureSpec.getSize(i);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
                int childCount = getChildCount();
                int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    if (getChildAt(i5).getMeasuredWidth() + i3 > size) {
                        i4 += getChildAt(i5).getMeasuredHeight();
                        i3 = 0;
                    }
                    i3 += getChildAt(i5).getMeasuredWidth();
                }
                setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? gl.L(16.0f) + measuredHeight + i4 : 0);
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
                int childCount2 = getChildCount();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < childCount2; i9++) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        if (getChildAt(i9).getMeasuredWidth() + i7 > View.MeasureSpec.getSize(i)) {
                            i8 = de9.w(8.0f, getChildAt(i9).getMeasuredHeight(), i8);
                            i7 = 0;
                        }
                        i7 = de9.w(16.0f, getChildAt(i9).getMeasuredWidth(), i7);
                        i6 = getChildAt(i9).getMeasuredHeight() + i8;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), i6);
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
                break;
            case 20:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
                measureChildren(makeMeasureSpec, i2);
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    i10 = Math.max(i10, getChildAt(i11).getMeasuredHeight());
                }
                super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(500.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(500.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 22:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar8(wb5 wb5Var, Activity activity, int i, String str, CharSequence charSequence) {
        super(activity);
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        this.a = (byte) 4;
        boolean z = k96.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i6 = bkb.F6;
        zkb.x(this, mutate, i6, wb5Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, nme.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        tb4.w(textView, i6, wb5Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            f2 = 68.0f;
            i3 = 3;
        }
        addView(textView, nme.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        l46 l46Var = new l46(getContext(), null);
        l46Var.setText(charSequence);
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, bkb.Fj, wb5Var.J0);
        zkb.G(l46Var, bkb.Wc, wb5Var.J0);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        if (z) {
            i4 = 27;
            i5 = 5;
        } else {
            i4 = 68;
            i5 = 3;
        }
        addView(l46Var, nme.d(-2, -2.0f, i5, i4 - 4, 18.0f, (z ? 68 : 27) - 4, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar8(cb9 cb9Var, Context context, int i, String str, CharSequence charSequence) {
        super(context);
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        this.a = (byte) 3;
        boolean z = k96.a0;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i).mutate();
        int i5 = bkb.F6;
        zkb.x(this, mutate, i5, cb9Var.J0, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        if (z) {
            f = 0.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 27.0f;
        }
        addView(imageView, nme.d(24, 24.0f, i2, f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        tb4.w(textView, i5, cb9Var.J0, 1, 14.0f);
        if (z) {
            i3 = 5;
            f2 = 27.0f;
        } else {
            i3 = 3;
            f2 = 68.0f;
        }
        addView(textView, nme.d(-2, -2.0f, i3, f2, 0.0f, z ? 68.0f : 27.0f, 0.0f));
        l46 l46Var = new l46(getContext(), null);
        l46Var.setText(charSequence);
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, bkb.Fj, cb9Var.J0);
        zkb.G(l46Var, bkb.Wc, cb9Var.J0);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        if (z) {
            i4 = 5;
            f3 = 27.0f;
        } else {
            i4 = 3;
            f3 = 68.0f;
        }
        addView(l46Var, nme.d(-2, -2.0f, i4, f3, 18.0f, z ? 68.0f : 27.0f, 0.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar8(Context context, byte b) {
        super(context);
        this.a = b;
    }
}
