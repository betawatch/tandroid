package org.telegram.ui.Cells;

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
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.v70;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class x8 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final xh.l a;
    public final w8 b;
    public final w8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 n;

    public x8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this(23, context, f6Var, z9, false);
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (hd.a0 || drawable == null) ? org.telegram.messenger.g0.L(23.0f) : org.telegram.messenger.g0.L(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L = org.telegram.messenger.g0.L(48.0f);
            int i7 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.f6 f6Var = this.n;
            y j02 = org.telegram.ui.ActionBar.k6.j0(L, 0, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.r6.k(imageView, j02, null, N, f6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = org.telegram.messenger.g0.L(23.0f) + (drawable != null ? org.telegram.messenger.g0.L(48.0f) : 0);
        boolean z9 = hd.a0;
        xh.l lVar = this.a;
        if (z9) {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).leftMargin = L2;
        } else {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).rightMargin = L2;
        }
        lVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z9;
        setWillNotDraw(!z9);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.a.setText(charSequence);
        this.b.setText(str);
        w8 w8Var = this.c;
        w8Var.setVisibility(0);
        w8Var.setText(str2);
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
            org.telegram.ui.ActionBar.f6 f6Var = this.n;
            Paint d = f6Var != null ? f6Var.d("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, d);
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
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        w8 w8Var = this.b;
        boolean z9 = w8Var.b(x10 - w8Var.getLeft(), ((int) motionEvent.getY()) - w8Var.getTop()) != null;
        if (!z9) {
            int x11 = (int) motionEvent.getX();
            xh.l lVar = this.a;
            z9 = lVar.a(x11 - lVar.getLeft(), ((int) motionEvent.getY()) - lVar.getTop()) != null;
        }
        if (z9) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z9) {
        this.f = z9;
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        int a10 = a(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        xh.l lVar = this.a;
        lVar.setLinkTextColor(a10);
        lVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
        lVar.invalidate();
        int a11 = a(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        w8 w8Var = this.b;
        w8Var.setLinkTextColor(a11);
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        w8Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        w8Var.invalidate();
    }

    public x8(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.n = f6Var;
        boolean z11 = z9 || z10;
        this.h = z11;
        xh.l lVar = new xh.l(context, f6Var, true);
        this.a = lVar;
        final int i10 = 0;
        lVar.setOnLinkLongPressListener(new v70(this) { // from class: org.telegram.ui.Cells.v8
            public final /* synthetic */ x8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.v70
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        x8 x8Var = this.b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        x8 x8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.b);
                            break;
                        }
                        break;
                    default:
                        x8 x8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        lVar.setTextSize(1, 16.0f);
        lVar.setGravity(hd.a0 ? 5 : 3);
        if (z9) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            lVar.setLines(1);
            lVar.setMaxLines(1);
            lVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        lVar.setEllipsize(truncateAt);
        lVar.setImportantForAccessibility(2);
        lVar.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f));
        float f10 = i7 - 6;
        addView(lVar, c8.ha.d(-2, -2.0f, hd.a0 ? 5 : 3, f10, 6.0f, f10, z9 ? 27.0f : 0.0f));
        w8 w8Var = new w8(this, context, f6Var, 0);
        this.b = w8Var;
        final int i11 = 1;
        w8Var.setOnLinkLongPressListener(new v70(this) { // from class: org.telegram.ui.Cells.v8
            public final /* synthetic */ x8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.v70
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        x8 x8Var = this.b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        x8 x8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.b);
                            break;
                        }
                        break;
                    default:
                        x8 x8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z10) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            w8Var.setLines(1);
            w8Var.setSingleLine(true);
        }
        w8Var.setTextSize(1, 13.0f);
        w8Var.setGravity(hd.a0 ? 5 : 3);
        w8Var.setImportantForAccessibility(2);
        w8Var.setEllipsize(truncateAt);
        w8Var.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z9) {
            float f11 = i7;
            addView(w8Var, c8.ha.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i7;
            addView(w8Var, c8.ha.d(-1, -2.0f, hd.a0 ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        w8 w8Var2 = new w8(this, context, f6Var, 1);
        this.c = w8Var2;
        final int i12 = 2;
        w8Var2.setOnLinkLongPressListener(new v70(this) { // from class: org.telegram.ui.Cells.v8
            public final /* synthetic */ x8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.v70
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        x8 x8Var = this.b;
                        x8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                x8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(x8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        x8 x8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                x8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(x8Var2.b);
                            break;
                        }
                        break;
                    default:
                        x8 x8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                x8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(x8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z11;
        if (z11) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            w8Var2.setLines(1);
            w8Var2.setSingleLine(true);
        }
        w8Var2.setTextSize(1, 13.0f);
        w8Var2.setGravity(hd.a0 ? 3 : 5);
        w8Var2.setImportantForAccessibility(2);
        w8Var2.setEllipsize(truncateAt);
        w8Var2.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z9) {
            float f13 = i7;
            addView(w8Var2, c8.ha.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i7;
            addView(w8Var2, c8.ha.d(-1, -2.0f, hd.a0 ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
