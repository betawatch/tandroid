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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class w8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final yh.l a;
    public final v8 b;
    public final v8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.e6 n;

    public w8(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(23, context, e6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (bd.a0 || drawable == null) ? org.telegram.messenger.g0.L(23.0f) : org.telegram.messenger.g0.L(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L = org.telegram.messenger.g0.L(48.0f);
            int i3 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.e6 e6Var = this.n;
            y j02 = org.telegram.ui.ActionBar.k6.j0(L, 0, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.r6.k(imageView, j02, null, N, e6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = org.telegram.messenger.g0.L(23.0f) + (drawable != null ? org.telegram.messenger.g0.L(48.0f) : 0);
        boolean z10 = bd.a0;
        yh.l lVar = this.a;
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
        v8 v8Var = this.c;
        v8Var.setVisibility(0);
        v8Var.setText(str2);
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
            org.telegram.ui.ActionBar.e6 e6Var = this.n;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, d);
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
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        v8 v8Var = this.b;
        boolean z10 = v8Var.b(x10 - v8Var.getLeft(), ((int) motionEvent.getY()) - v8Var.getTop()) != null;
        if (!z10) {
            int x11 = (int) motionEvent.getX();
            yh.l lVar = this.a;
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.e6 e6Var = this.n;
        int a10 = a(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        yh.l lVar = this.a;
        lVar.setLinkTextColor(a10);
        lVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
        lVar.invalidate();
        int a11 = a(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        v8 v8Var = this.b;
        v8Var.setLinkTextColor(a11);
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        v8Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        v8Var.invalidate();
    }

    public w8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.n = e6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        yh.l lVar = new yh.l(context, e6Var, true);
        this.a = lVar;
        final int i10 = 0;
        lVar.setOnLinkLongPressListener(new r70(this) { // from class: org.telegram.ui.Cells.u8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.r70
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        w8 w8Var = this.b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        w8 w8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.b);
                            break;
                        }
                        break;
                    default:
                        w8 w8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        lVar.setTextSize(1, 16.0f);
        lVar.setGravity(bd.a0 ? 5 : 3);
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
        float f10 = i3 - 6;
        addView(lVar, mf.d(-2, -2.0f, bd.a0 ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        v8 v8Var = new v8(this, context, e6Var, 0);
        this.b = v8Var;
        final int i11 = 1;
        v8Var.setOnLinkLongPressListener(new r70(this) { // from class: org.telegram.ui.Cells.u8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.r70
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        w8 w8Var = this.b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        w8 w8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.b);
                            break;
                        }
                        break;
                    default:
                        w8 w8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            v8Var.setLines(1);
            v8Var.setSingleLine(true);
        }
        v8Var.setTextSize(1, 13.0f);
        v8Var.setGravity(bd.a0 ? 5 : 3);
        v8Var.setImportantForAccessibility(2);
        v8Var.setEllipsize(truncateAt);
        v8Var.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f11 = i3;
            addView(v8Var, mf.d(-1, -2.0f, (bd.a0 ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i3;
            addView(v8Var, mf.d(-1, -2.0f, bd.a0 ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        v8 v8Var2 = new v8(this, context, e6Var, 1);
        this.c = v8Var2;
        final int i12 = 2;
        v8Var2.setOnLinkLongPressListener(new r70(this) { // from class: org.telegram.ui.Cells.u8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.r70
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        w8 w8Var = this.b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.a);
                            break;
                        }
                        break;
                    case 1:
                        w8 w8Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.b);
                            break;
                        }
                        break;
                    default:
                        w8 w8Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.b);
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
            v8Var2.setLines(1);
            v8Var2.setSingleLine(true);
        }
        v8Var2.setTextSize(1, 13.0f);
        v8Var2.setGravity(bd.a0 ? 3 : 5);
        v8Var2.setImportantForAccessibility(2);
        v8Var2.setEllipsize(truncateAt);
        v8Var2.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f13 = i3;
            addView(v8Var2, mf.d(-1, -2.0f, (bd.a0 ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i3;
            addView(v8Var2, mf.d(-1, -2.0f, bd.a0 ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i3) {
        return i3;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
