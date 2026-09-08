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
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class c9 extends FrameLayout {
    public final wh.p a;
    public final b9 b;
    public final b9 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 n;

    public c9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(23, context, f6Var, z10, false);
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
            imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z10 = LocaleController.isRTL;
        wh.p pVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) pVar.getLayoutParams()).rightMargin = dp;
        }
        pVar.requestLayout();
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
        b9 b9Var = this.c;
        b9Var.setVisibility(0);
        b9Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        wh.p pVar = this.a;
        pVar.setLinkTextColor(a2);
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        pVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        b9 b9Var = this.b;
        b9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        b9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b9Var.invalidate();
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
            Paint G = f6Var != null ? f6Var.G("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (G == null) {
                G = org.telegram.ui.ActionBar.j6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, G);
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
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        b9 b9Var = this.b;
        boolean z10 = b9Var.b(x10 - b9Var.getLeft(), ((int) motionEvent.getY()) - b9Var.getTop()) != null;
        if (!z10) {
            int x11 = (int) motionEvent.getX();
            wh.p pVar = this.a;
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

    public c9(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.n = f6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        wh.p pVar = new wh.p(context, f6Var, true);
        this.a = pVar;
        final int i11 = 0;
        pVar.setOnLinkLongPressListener(new c90(this) { // from class: org.telegram.ui.Cells.a9
            public final /* synthetic */ c9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        c9 c9Var = this.b;
                        c9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                c9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(c9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        c9 c9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                c9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(c9Var2.b);
                            break;
                        }
                        break;
                    default:
                        c9 c9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                c9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(c9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        pVar.setTextSize(1, 16.0f);
        pVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            pVar.setLines(1);
            pVar.setMaxLines(1);
            pVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pVar.setEllipsize(truncateAt);
        pVar.setImportantForAccessibility(2);
        pVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(pVar, w7.x5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        b9 b9Var = new b9(this, context, f6Var, 0);
        this.b = b9Var;
        final int i12 = 1;
        b9Var.setOnLinkLongPressListener(new c90(this) { // from class: org.telegram.ui.Cells.a9
            public final /* synthetic */ c9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        c9 c9Var = this.b;
                        c9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                c9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(c9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        c9 c9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                c9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(c9Var2.b);
                            break;
                        }
                        break;
                    default:
                        c9 c9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                c9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(c9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            b9Var.setLines(1);
            b9Var.setSingleLine(true);
        }
        b9Var.setTextSize(1, 13.0f);
        b9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        b9Var.setImportantForAccessibility(2);
        b9Var.setEllipsize(truncateAt);
        b9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(b9Var, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(b9Var, w7.x5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        b9 b9Var2 = new b9(this, context, f6Var, 1);
        this.c = b9Var2;
        final int i13 = 2;
        b9Var2.setOnLinkLongPressListener(new c90(this) { // from class: org.telegram.ui.Cells.a9
            public final /* synthetic */ c9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
                    case 0:
                        c9 c9Var = this.b;
                        c9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                c9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(c9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        c9 c9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                c9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(c9Var2.b);
                            break;
                        }
                        break;
                    default:
                        c9 c9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                c9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(c9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            b9Var2.setLines(1);
            b9Var2.setSingleLine(true);
        }
        b9Var2.setTextSize(1, 13.0f);
        b9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        b9Var2.setImportantForAccessibility(2);
        b9Var2.setEllipsize(truncateAt);
        b9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(b9Var2, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(b9Var2, w7.x5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
