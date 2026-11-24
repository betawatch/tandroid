// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class ghb extends FrameLayout implements tjb {
    public final wla a;
    public final fhb b;
    public final fhb c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final wjb n;

    public ghb(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.n = wjbVar;
        final byte b = 0;
        final byte b2 = 1;
        boolean z3 = z || z2;
        this.h = z3;
        wla wlaVar = new wla(wjbVar, context, true);
        this.a = wlaVar;
        wlaVar.setOnLinkLongPressListener(new k46(this) { // from class: ehb
            public final /* synthetic */ ghb b;

            {
                this.b = this;
            }

            @Override // k46
            public final void a(ClickableSpan clickableSpan) {
                byte b3 = b;
                ghb ghbVar = this.b;
                switch (b3) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(ghbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        wlaVar.setTextSize(1, 16.0f);
        wlaVar.setGravity(k96.a0 ? 5 : 3);
        if (z) {
            setMinimumHeight(gl.L(60.0f));
        } else {
            wlaVar.setLines(1);
            wlaVar.setMaxLines(1);
            wlaVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        wlaVar.setEllipsize(truncateAt);
        final byte b3 = 2;
        wlaVar.setImportantForAccessibility(2);
        wlaVar.setPadding(gl.L(6.0f), gl.L(2.0f), gl.L(6.0f), gl.L(5.0f));
        float f = i - 6;
        addView(wlaVar, nme.d(-2, -2.0f, k96.a0 ? 5 : 3, f, 6.0f, f, z ? 27.0f : 0.0f));
        fhb fhbVar = new fhb(this, context, wjbVar, (byte) 0);
        this.b = fhbVar;
        fhbVar.setOnLinkLongPressListener(new k46(this) { // from class: ehb
            public final /* synthetic */ ghb b;

            {
                this.b = this;
            }

            @Override // k46
            public final void a(ClickableSpan clickableSpan) {
                byte b32 = b2;
                ghb ghbVar = this.b;
                switch (b32) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(ghbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z2) {
            setMinimumHeight(gl.L(60.0f));
        } else {
            fhbVar.setLines(1);
            fhbVar.setSingleLine(true);
        }
        fhbVar.setTextSize(1, 13.0f);
        fhbVar.setGravity(k96.a0 ? 5 : 3);
        fhbVar.setImportantForAccessibility(2);
        fhbVar.setEllipsize(truncateAt);
        fhbVar.setPadding(0, gl.L(1.0f), 0, gl.L(6.0f));
        boolean z4 = k96.a0;
        if (z) {
            int i2 = (z4 ? 5 : 3) | 80;
            float f2 = i;
            addView(fhbVar, nme.d(-1, -2.0f, i2, f2, 32.0f, f2, 4.0f));
        } else {
            int i3 = z4 ? 5 : 3;
            float f3 = i;
            addView(fhbVar, nme.d(-1, -2.0f, i3, f3, 32.0f, f3, 4.0f));
        }
        fhb fhbVar2 = new fhb(this, context, wjbVar, (byte) 1);
        this.c = fhbVar2;
        fhbVar2.setOnLinkLongPressListener(new k46(this) { // from class: ehb
            public final /* synthetic */ ghb b;

            {
                this.b = this;
            }

            @Override // k46
            public final void a(ClickableSpan clickableSpan) {
                byte b32 = b3;
                ghb ghbVar = this.b;
                switch (b32) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(ghbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                ghbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(ghbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z3;
        if (z3) {
            setMinimumHeight(gl.L(60.0f));
        } else {
            fhbVar2.setLines(1);
            fhbVar2.setSingleLine(true);
        }
        fhbVar2.setTextSize(1, 13.0f);
        fhbVar2.setGravity(k96.a0 ? 3 : 5);
        fhbVar2.setImportantForAccessibility(2);
        fhbVar2.setEllipsize(truncateAt);
        fhbVar2.setPadding(0, gl.L(1.0f), 0, gl.L(6.0f));
        boolean z5 = k96.a0;
        if (z) {
            float f4 = i;
            addView(fhbVar2, nme.d(-1, -2.0f, (z5 ? 5 : 3) | 80, f4, 32.0f, f4, 4.0f));
        } else {
            float f5 = i;
            addView(fhbVar2, nme.d(-1, -2.0f, z5 ? 5 : 3, f5, 32.0f, f5, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (k96.a0 || drawable == null) ? gl.L(23.0f) : gl.L(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L = gl.L(48.0f);
            int i = bkb.h6;
            wjb wjbVar = this.n;
            ff0 h0 = bkb.h0(L, 0, bkb.v0(i, wjbVar));
            vkb M = zkb.M(i);
            imageView.setBackground(h0);
            zkb.j(imageView, h0, null, M, wjbVar);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = gl.L(23.0f) + (drawable != null ? gl.L(48.0f) : 0);
        boolean z = k96.a0;
        wla wlaVar = this.a;
        if (z) {
            ((ViewGroup.MarginLayoutParams) wlaVar.getLayoutParams()).leftMargin = L2;
        } else {
            ((ViewGroup.MarginLayoutParams) wlaVar.getLayoutParams()).rightMargin = L2;
        }
        wlaVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z;
        setWillNotDraw(!z);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.a.setText(charSequence);
        this.b.setText(str);
        fhb fhbVar = this.c;
        fhbVar.setVisibility(0);
        fhbVar.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            wjb wjbVar = this.n;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : bkb.j0;
            if (d == null) {
                d = bkb.j0;
            }
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.a.getText();
        CharSequence text2 = this.b.getText();
        if (TextUtils.isEmpty(text) || TextUtils.isEmpty(text2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) (this.f ? text2 : text));
        sb.append(": ");
        if (!this.f) {
            text = text2;
        }
        sb.append((Object) text);
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        if (!this.h) {
            i2 = View.MeasureSpec.makeMeasureSpec(gl.L(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        fhb fhbVar = this.b;
        boolean z = fhbVar.b(x - fhbVar.getLeft(), ((int) motionEvent.getY()) - fhbVar.getTop()) != null;
        if (!z) {
            int x2 = (int) motionEvent.getX();
            wla wlaVar = this.a;
            z = wlaVar.a(x2 - wlaVar.getLeft(), ((int) motionEvent.getY()) - wlaVar.getTop()) != null;
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z) {
        this.f = z;
    }

    public void setImage(Drawable drawable) {
        b(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.Wc;
        wjb wjbVar = this.n;
        int a = a(bkb.v0(i, wjbVar));
        wla wlaVar = this.a;
        wlaVar.setLinkTextColor(a);
        wlaVar.setTextColor(bkb.v0(bkb.F6, wjbVar));
        wlaVar.invalidate();
        int a2 = a(bkb.v0(i, wjbVar));
        fhb fhbVar = this.b;
        fhbVar.setLinkTextColor(a2);
        int i2 = bkb.y6;
        fhbVar.setTextColor(bkb.v0(i2, wjbVar));
        this.c.setTextColor(bkb.v0(i2, wjbVar));
        fhbVar.invalidate();
    }

    public int a(int i) {
        return i;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public ghb(wjb wjbVar, Context context, boolean z) {
        this(23, wjbVar, context, z, false);
    }
}
