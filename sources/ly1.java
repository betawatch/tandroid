// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ly1 extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final View c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ly1(Activity activity, boolean z) {
        super(activity);
        this.b = false;
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        zkb.X(textView, bkb.F6, null);
        linearLayout.addView(textView, nme.t(-1, -2, 0, 0, 0, z ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        zkb.X(textView2, bkb.x6, null);
        linearLayout.addView(textView2, nme.t(-1, -2, 0, 0, 4, z ? 64 : 0, 0));
        setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        if (z) {
            Switch r3 = new Switch(activity, null);
            this.f = r3;
            r3.setDrawIconType(1);
            addView(r3, nme.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.b) {
                    canvas.drawRect(gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                if (!(view instanceof jia) || !this.b) {
                    return super.drawChild(canvas, view, j);
                }
                jia jiaVar = (jia) view;
                canvas.save();
                canvas.scale(0.8f, 0.8f);
                canvas.translate(-gl.L(12.0f), gl.L(6.0f));
                int color = jiaVar.getTextPaint().getColor();
                jiaVar.getTextPaint().setColor(-1);
                boolean drawChild = super.drawChild(canvas, view, j);
                jiaVar.getTextPaint().setColor(color);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.f;
                RectF rectF = (RectF) this.d;
                if (this.b) {
                    canvas.save();
                    int L = gl.L(26.0f);
                    canvas.translate(gl.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f = L;
                    rectF.set(-gl.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f);
                    float f2 = f / 2.0f;
                    canvas.drawRoundRect(rectF, f2, f2, (Paint) this.e);
                    canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - gl.L(6.0f)) - drawable.getIntrinsicWidth(), gl.L(5.0f));
                    drawable.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r0 = (Switch) this.f;
                if (r0 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r0.h);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) ((TextView) this.d).getText());
                    sb.append("\n");
                    sb.append((Object) ((TextView) this.e).getText());
                    sb.append("\n");
                    sb.append(k96.M0(r0.h ? 2131747699 : 2131747701, null));
                    accessibilityNodeInfo.setText(sb.toString());
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ((Paint) this.e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    public ly1(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.e = new Paint(1);
        this.b = false;
        jia jiaVar = new jia(activity);
        this.c = jiaVar;
        addView(jiaVar, nme.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        ote.a(this);
    }
}
