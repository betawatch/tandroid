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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class clb extends FrameLayout implements snb {
    public final tpa a;
    public final blb b;
    public final blb c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final vnb n;

    public clb(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.n = vnbVar;
        final byte b = 0;
        final byte b2 = 1;
        boolean z3 = z || z2;
        this.h = z3;
        tpa tpaVar = new tpa(vnbVar, context, true);
        this.a = tpaVar;
        tpaVar.setOnLinkLongPressListener(new o66(this) { // from class: alb
            public final /* synthetic */ clb b;

            {
                this.b = this;
            }

            @Override // o66
            public final void a(ClickableSpan clickableSpan) {
                byte b3 = b;
                clb clbVar = this.b;
                switch (b3) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(clbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        tpaVar.setTextSize(1, 16.0f);
        tpaVar.setGravity(ob6.a0 ? 5 : 3);
        if (z) {
            setMinimumHeight(hl.L(60.0f));
        } else {
            tpaVar.setLines(1);
            tpaVar.setMaxLines(1);
            tpaVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        tpaVar.setEllipsize(truncateAt);
        final byte b3 = 2;
        tpaVar.setImportantForAccessibility(2);
        tpaVar.setPadding(hl.L(6.0f), hl.L(2.0f), hl.L(6.0f), hl.L(5.0f));
        float f = i - 6;
        addView(tpaVar, tre.d(-2, -2.0f, ob6.a0 ? 5 : 3, f, 6.0f, f, z ? 27.0f : 0.0f));
        blb blbVar = new blb(this, context, vnbVar, (byte) 0);
        this.b = blbVar;
        blbVar.setOnLinkLongPressListener(new o66(this) { // from class: alb
            public final /* synthetic */ clb b;

            {
                this.b = this;
            }

            @Override // o66
            public final void a(ClickableSpan clickableSpan) {
                byte b32 = b2;
                clb clbVar = this.b;
                switch (b32) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(clbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z2) {
            setMinimumHeight(hl.L(60.0f));
        } else {
            blbVar.setLines(1);
            blbVar.setSingleLine(true);
        }
        blbVar.setTextSize(1, 13.0f);
        blbVar.setGravity(ob6.a0 ? 5 : 3);
        blbVar.setImportantForAccessibility(2);
        blbVar.setEllipsize(truncateAt);
        blbVar.setPadding(0, hl.L(1.0f), 0, hl.L(6.0f));
        boolean z4 = ob6.a0;
        if (z) {
            int i2 = (z4 ? 5 : 3) | 80;
            float f2 = i;
            addView(blbVar, tre.d(-1, -2.0f, i2, f2, 32.0f, f2, 4.0f));
        } else {
            int i3 = z4 ? 5 : 3;
            float f3 = i;
            addView(blbVar, tre.d(-1, -2.0f, i3, f3, 32.0f, f3, 4.0f));
        }
        blb blbVar2 = new blb(this, context, vnbVar, (byte) 1);
        this.c = blbVar2;
        blbVar2.setOnLinkLongPressListener(new o66(this) { // from class: alb
            public final /* synthetic */ clb b;

            {
                this.b = this;
            }

            @Override // o66
            public final void a(ClickableSpan clickableSpan) {
                byte b32 = b3;
                clb clbVar = this.b;
                switch (b32) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(clbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                clbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(clbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z3;
        if (z3) {
            setMinimumHeight(hl.L(60.0f));
        } else {
            blbVar2.setLines(1);
            blbVar2.setSingleLine(true);
        }
        blbVar2.setTextSize(1, 13.0f);
        blbVar2.setGravity(ob6.a0 ? 3 : 5);
        blbVar2.setImportantForAccessibility(2);
        blbVar2.setEllipsize(truncateAt);
        blbVar2.setPadding(0, hl.L(1.0f), 0, hl.L(6.0f));
        boolean z5 = ob6.a0;
        if (z) {
            float f4 = i;
            addView(blbVar2, tre.d(-1, -2.0f, (z5 ? 5 : 3) | 80, f4, 32.0f, f4, 4.0f));
        } else {
            float f5 = i;
            addView(blbVar2, tre.d(-1, -2.0f, z5 ? 5 : 3, f5, 32.0f, f5, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (ob6.a0 || drawable == null) ? hl.L(23.0f) : hl.L(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L = hl.L(48.0f);
            int i = aob.i6;
            vnb vnbVar = this.n;
            hf0 h0 = aob.h0(L, 0, aob.v0(i, vnbVar));
            uob M = yob.M(i);
            imageView.setBackground(h0);
            yob.j(imageView, h0, null, M, vnbVar);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = hl.L(23.0f) + (drawable != null ? hl.L(48.0f) : 0);
        boolean z = ob6.a0;
        tpa tpaVar = this.a;
        if (z) {
            ((ViewGroup.MarginLayoutParams) tpaVar.getLayoutParams()).leftMargin = L2;
        } else {
            ((ViewGroup.MarginLayoutParams) tpaVar.getLayoutParams()).rightMargin = L2;
        }
        tpaVar.requestLayout();
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
        blb blbVar = this.c;
        blbVar.setVisibility(0);
        blbVar.setText(str2);
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
            vnb vnbVar = this.n;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : aob.j0;
            if (d == null) {
                d = aob.j0;
            }
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, d);
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
            i2 = View.MeasureSpec.makeMeasureSpec(hl.L(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        blb blbVar = this.b;
        boolean z = blbVar.b(x - blbVar.getLeft(), ((int) motionEvent.getY()) - blbVar.getTop()) != null;
        if (!z) {
            int x2 = (int) motionEvent.getX();
            tpa tpaVar = this.a;
            z = tpaVar.a(x2 - tpaVar.getLeft(), ((int) motionEvent.getY()) - tpaVar.getTop()) != null;
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

    @Override // snb
    public final void updateColors() {
        int i = aob.Xc;
        vnb vnbVar = this.n;
        int a = a(aob.v0(i, vnbVar));
        tpa tpaVar = this.a;
        tpaVar.setLinkTextColor(a);
        tpaVar.setTextColor(aob.v0(aob.G6, vnbVar));
        tpaVar.invalidate();
        int a2 = a(aob.v0(i, vnbVar));
        blb blbVar = this.b;
        blbVar.setLinkTextColor(a2);
        int i2 = aob.z6;
        blbVar.setTextColor(aob.v0(i2, vnbVar));
        this.c.setTextColor(aob.v0(i2, vnbVar));
        blbVar.invalidate();
    }

    public int a(int i) {
        return i;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public clb(vnb vnbVar, Context context, boolean z) {
        this(23, vnbVar, context, z, false);
    }
}
