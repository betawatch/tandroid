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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class y8 extends FrameLayout {
    public final jh.s a;
    public final x8 b;
    public final x8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.g6 n;

    public y8(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this(23, context, g6Var, z4, false);
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (LocaleController.isRTL || drawable == null) ? AndroidUtilities.dp(23.0f) : AndroidUtilities.dp(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, this.n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z4 = LocaleController.isRTL;
        jh.s sVar = this.a;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin = dp;
        }
        sVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z4;
        setWillNotDraw(!z4);
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

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.gc;
        org.telegram.ui.ActionBar.g6 g6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        jh.s sVar = this.a;
        sVar.setLinkTextColor(a2);
        sVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        sVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        x8 x8Var = this.b;
        x8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        x8Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        x8Var.invalidate();
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
            org.telegram.ui.ActionBar.g6 g6Var = this.n;
            Paint F = g6Var != null ? g6Var.F("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (F == null) {
                F = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, F);
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
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        if (!this.h) {
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        x8 x8Var = this.b;
        boolean z4 = x8Var.b(x10 - x8Var.getLeft(), ((int) motionEvent.getY()) - x8Var.getTop()) != null;
        if (!z4) {
            int x11 = (int) motionEvent.getX();
            jh.s sVar = this.a;
            z4 = sVar.a(x11 - sVar.getLeft(), ((int) motionEvent.getY()) - sVar.getTop()) != null;
        }
        if (z4) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z4) {
        this.f = z4;
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

    public y8(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context);
        this.n = g6Var;
        boolean z11 = z4 || z10;
        this.h = z11;
        jh.s sVar = new jh.s(context, g6Var, true);
        this.a = sVar;
        final int i11 = 0;
        sVar.setOnLinkLongPressListener(new f90(this) { // from class: org.telegram.ui.Cells.w8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f90
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
        sVar.setTextSize(1, 16.0f);
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z4) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            sVar.setLines(1);
            sVar.setMaxLines(1);
            sVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        sVar.setEllipsize(truncateAt);
        sVar.setImportantForAccessibility(2);
        sVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f10 = i10 - 6;
        addView(sVar, k7.c6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f10, 6.0f, f10, z4 ? 27.0f : 0.0f));
        x8 x8Var = new x8(this, context, g6Var, 0);
        this.b = x8Var;
        final int i12 = 1;
        x8Var.setOnLinkLongPressListener(new f90(this) { // from class: org.telegram.ui.Cells.w8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f90
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
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            x8Var.setLines(1);
            x8Var.setSingleLine(true);
        }
        x8Var.setTextSize(1, 13.0f);
        x8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x8Var.setImportantForAccessibility(2);
        x8Var.setEllipsize(truncateAt);
        x8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z4) {
            float f11 = i10;
            addView(x8Var, k7.c6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i10;
            addView(x8Var, k7.c6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        x8 x8Var2 = new x8(this, context, g6Var, 1);
        this.c = x8Var2;
        final int i13 = 2;
        x8Var2.setOnLinkLongPressListener(new f90(this) { // from class: org.telegram.ui.Cells.w8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f90
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
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
        this.h = z11;
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            x8Var2.setLines(1);
            x8Var2.setSingleLine(true);
        }
        x8Var2.setTextSize(1, 13.0f);
        x8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        x8Var2.setImportantForAccessibility(2);
        x8Var2.setEllipsize(truncateAt);
        x8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z4) {
            float f13 = i10;
            addView(x8Var2, k7.c6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i10;
            addView(x8Var2, k7.c6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
