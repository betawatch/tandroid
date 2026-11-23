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
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class y8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final xh.l a;
    public final x8 b;
    public final x8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.h6 n;

    public y8(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this(23, context, h6Var, z10, false);
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
            int i7 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.h6 h6Var = this.n;
            y j02 = org.telegram.ui.ActionBar.m6.j0(L, 0, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.t6.j(imageView, j02, null, M, h6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = org.telegram.messenger.g0.L(23.0f) + (drawable != null ? org.telegram.messenger.g0.L(48.0f) : 0);
        boolean z10 = hd.a0;
        xh.l lVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).leftMargin = L2;
        } else {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).rightMargin = L2;
        }
        lVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.a.setText(charSequence);
        this.b.setText(str);
        x8 x8Var = this.c;
        x8Var.setVisibility(0);
        x8Var.setText(str2);
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
            org.telegram.ui.ActionBar.h6 h6Var = this.n;
            Paint g10 = h6Var != null ? h6Var.g("paintDivider") : org.telegram.ui.ActionBar.m6.k0;
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.m6.k0;
            }
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, g10);
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
        x8 x8Var = this.b;
        boolean z10 = x8Var.b(x10 - x8Var.getLeft(), ((int) motionEvent.getY()) - x8Var.getTop()) != null;
        if (!z10) {
            int x11 = (int) motionEvent.getX();
            xh.l lVar = this.a;
            z10 = lVar.a(x11 - lVar.getLeft(), ((int) motionEvent.getY()) - lVar.getTop()) != null;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.h6 h6Var = this.n;
        int a10 = a(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        xh.l lVar = this.a;
        lVar.setLinkTextColor(a10);
        lVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
        lVar.invalidate();
        int a11 = a(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        x8 x8Var = this.b;
        x8Var.setLinkTextColor(a11);
        int i10 = org.telegram.ui.ActionBar.m6.z6;
        x8Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        x8Var.invalidate();
    }

    public y8(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        this.n = h6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        xh.l lVar = new xh.l(context, h6Var, true);
        this.a = lVar;
        final int i10 = 0;
        lVar.setOnLinkLongPressListener(new l80(this) { // from class: org.telegram.ui.Cells.w8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l80
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        y8 y8Var = this.b;
                        y8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                y8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(y8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        y8 y8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                y8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(y8Var2.b);
                            break;
                        }
                        break;
                    default:
                        y8 y8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                y8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(y8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        lVar.setTextSize(1, 16.0f);
        lVar.setGravity(hd.a0 ? 5 : 3);
        if (z10) {
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
        addView(lVar, c8.ma.d(-2, -2.0f, hd.a0 ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        x8 x8Var = new x8(this, context, h6Var, 0);
        this.b = x8Var;
        final int i11 = 1;
        x8Var.setOnLinkLongPressListener(new l80(this) { // from class: org.telegram.ui.Cells.w8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l80
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        y8 y8Var = this.b;
                        y8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                y8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(y8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        y8 y8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                y8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(y8Var2.b);
                            break;
                        }
                        break;
                    default:
                        y8 y8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                y8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(y8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            x8Var.setLines(1);
            x8Var.setSingleLine(true);
        }
        x8Var.setTextSize(1, 13.0f);
        x8Var.setGravity(hd.a0 ? 5 : 3);
        x8Var.setImportantForAccessibility(2);
        x8Var.setEllipsize(truncateAt);
        x8Var.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f11 = i7;
            addView(x8Var, c8.ma.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i7;
            addView(x8Var, c8.ma.d(-1, -2.0f, hd.a0 ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        x8 x8Var2 = new x8(this, context, h6Var, 1);
        this.c = x8Var2;
        final int i12 = 2;
        x8Var2.setOnLinkLongPressListener(new l80(this) { // from class: org.telegram.ui.Cells.w8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l80
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        y8 y8Var = this.b;
                        y8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                y8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(y8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        y8 y8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                y8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(y8Var2.b);
                            break;
                        }
                        break;
                    default:
                        y8 y8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                y8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(y8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            x8Var2.setLines(1);
            x8Var2.setSingleLine(true);
        }
        x8Var2.setTextSize(1, 13.0f);
        x8Var2.setGravity(hd.a0 ? 3 : 5);
        x8Var2.setImportantForAccessibility(2);
        x8Var2.setEllipsize(truncateAt);
        x8Var2.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f13 = i7;
            addView(x8Var2, c8.ma.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i7;
            addView(x8Var2, c8.ma.d(-1, -2.0f, hd.a0 ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
