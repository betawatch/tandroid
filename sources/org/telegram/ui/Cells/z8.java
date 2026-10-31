package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class z8 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final nh.p a;
    public final y8 b;
    public final y8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.p6 n;

    public z8(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this(23, context, p6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (cd.X || drawable == null) ? org.telegram.messenger.i0.L(23.0f) : org.telegram.messenger.i0.L(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L = org.telegram.messenger.i0.L(48.0f);
            int i10 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.p6 p6Var = this.n;
            y j02 = org.telegram.ui.ActionBar.t6.j0(L, 0, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.a7.k(imageView, j02, null, N, p6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = org.telegram.messenger.i0.L(23.0f) + (drawable != null ? org.telegram.messenger.i0.L(48.0f) : 0);
        boolean z10 = cd.X;
        nh.p pVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).leftMargin = L2;
        } else {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).rightMargin = L2;
        }
        pVar.requestLayout();
    }

    public final void c(Spannable spannable, String str, String str2) {
        this.a.setText(spannable);
        this.b.setText(str);
        y8 y8Var = this.c;
        y8Var.setVisibility(0);
        y8Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z10;
        setWillNotDraw(!z10);
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
            org.telegram.ui.ActionBar.p6 p6Var = this.n;
            Paint d = p6Var != null ? p6Var.d("paintDivider") : org.telegram.ui.ActionBar.t6.k0;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, d);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) (this.f ? text2 : text));
        sb2.append(": ");
        if (!this.f) {
            text = text2;
        }
        sb2.append((Object) text);
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        if (!this.h) {
            i11 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        y8 y8Var = this.b;
        boolean z10 = y8Var.b(x10 - y8Var.getLeft(), ((int) motionEvent.getY()) - y8Var.getTop()) != null;
        if (!z10) {
            int x11 = (int) motionEvent.getX();
            nh.p pVar = this.a;
            z10 = pVar.a(x11 - pVar.getLeft(), ((int) motionEvent.getY()) - pVar.getTop()) != null;
        }
        if (z10) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z10) {
        this.f = z10;
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        nh.p pVar = this.a;
        pVar.setLinkTextColor(a2);
        pVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        pVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        y8 y8Var = this.b;
        y8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.t6.z6;
        y8Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        y8Var.invalidate();
    }

    public z8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.n = p6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        nh.p pVar = new nh.p(context, p6Var, true);
        this.a = pVar;
        final int i11 = 0;
        pVar.setOnLinkLongPressListener(new o80(this) { // from class: org.telegram.ui.Cells.x8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        z8 z8Var = this.b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        z8 z8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.b);
                            break;
                        }
                        break;
                    default:
                        z8 z8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        pVar.setTextSize(1, 16.0f);
        pVar.setGravity(cd.X ? 5 : 3);
        if (z10) {
            setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
        } else {
            pVar.setLines(1);
            pVar.setMaxLines(1);
            pVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pVar.setEllipsize(truncateAt);
        pVar.setImportantForAccessibility(2);
        pVar.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f));
        float f7 = i10 - 6;
        addView(pVar, w7.b6.d(-2, -2.0f, cd.X ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        y8 y8Var = new y8(this, context, p6Var, 0);
        this.b = y8Var;
        final int i12 = 1;
        y8Var.setOnLinkLongPressListener(new o80(this) { // from class: org.telegram.ui.Cells.x8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        z8 z8Var = this.b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        z8 z8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.b);
                            break;
                        }
                        break;
                    default:
                        z8 z8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
        } else {
            y8Var.setLines(1);
            y8Var.setSingleLine(true);
        }
        y8Var.setTextSize(1, 13.0f);
        y8Var.setGravity(cd.X ? 5 : 3);
        y8Var.setImportantForAccessibility(2);
        y8Var.setEllipsize(truncateAt);
        y8Var.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, org.telegram.messenger.i0.L(6.0f));
        if (z10) {
            float f10 = i10;
            addView(y8Var, w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(y8Var, w7.b6.d(-1, -2.0f, cd.X ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        y8 y8Var2 = new y8(this, context, p6Var, 1);
        this.c = y8Var2;
        final int i13 = 2;
        y8Var2.setOnLinkLongPressListener(new o80(this) { // from class: org.telegram.ui.Cells.x8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
                    case 0:
                        z8 z8Var = this.b;
                        z8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                z8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(z8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        z8 z8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                z8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(z8Var2.b);
                            break;
                        }
                        break;
                    default:
                        z8 z8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                z8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(z8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
        } else {
            y8Var2.setLines(1);
            y8Var2.setSingleLine(true);
        }
        y8Var2.setTextSize(1, 13.0f);
        y8Var2.setGravity(cd.X ? 3 : 5);
        y8Var2.setImportantForAccessibility(2);
        y8Var2.setEllipsize(truncateAt);
        y8Var2.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, org.telegram.messenger.i0.L(6.0f));
        if (z10) {
            float f12 = i10;
            addView(y8Var2, w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(y8Var2, w7.b6.d(-1, -2.0f, cd.X ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
