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
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class z8 extends FrameLayout {
    public final dh.u a;
    public final y8 b;
    public final y8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.b6 n;

    public z8(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this(23, context, b6Var, z10, false);
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
            imageView.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, this.n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z10 = LocaleController.isRTL;
        dh.u uVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).rightMargin = dp;
        }
        uVar.requestLayout();
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
        y8 y8Var = this.c;
        y8Var.setVisibility(0);
        y8Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i9 = org.telegram.ui.ActionBar.f6.gc;
        org.telegram.ui.ActionBar.b6 b6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        dh.u uVar = this.a;
        uVar.setLinkTextColor(a2);
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        uVar.invalidate();
        int a3 = a(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        y8 y8Var = this.b;
        y8Var.setLinkTextColor(a3);
        int i10 = org.telegram.ui.ActionBar.f6.z6;
        y8Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        y8Var.invalidate();
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
            org.telegram.ui.ActionBar.b6 b6Var = this.n;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : org.telegram.ui.ActionBar.f6.k0;
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, O);
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
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        y8 y8Var = this.b;
        boolean z10 = y8Var.b(x10 - y8Var.getLeft(), ((int) motionEvent.getY()) - y8Var.getTop()) != null;
        if (!z10) {
            int x11 = (int) motionEvent.getX();
            dh.u uVar = this.a;
            z10 = uVar.a(x11 - uVar.getLeft(), ((int) motionEvent.getY()) - uVar.getTop()) != null;
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

    public z8(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.n = b6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        dh.u uVar = new dh.u(context, b6Var, true);
        this.a = uVar;
        final int i10 = 0;
        uVar.setOnLinkLongPressListener(new k80(this) { // from class: org.telegram.ui.Cells.x8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k80
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
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
        uVar.setTextSize(1, 16.0f);
        uVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            uVar.setLines(1);
            uVar.setMaxLines(1);
            uVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uVar.setEllipsize(truncateAt);
        uVar.setImportantForAccessibility(2);
        uVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f10 = i9 - 6;
        addView(uVar, g7.e6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        y8 y8Var = new y8(this, context, b6Var, 0);
        this.b = y8Var;
        final int i11 = 1;
        y8Var.setOnLinkLongPressListener(new k80(this) { // from class: org.telegram.ui.Cells.x8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k80
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
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            y8Var.setLines(1);
            y8Var.setSingleLine(true);
        }
        y8Var.setTextSize(1, 13.0f);
        y8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y8Var.setImportantForAccessibility(2);
        y8Var.setEllipsize(truncateAt);
        y8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f11 = i9;
            addView(y8Var, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i9;
            addView(y8Var, g7.e6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        y8 y8Var2 = new y8(this, context, b6Var, 1);
        this.c = y8Var2;
        final int i12 = 2;
        y8Var2.setOnLinkLongPressListener(new k80(this) { // from class: org.telegram.ui.Cells.x8
            public final /* synthetic */ z8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k80
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
        this.h = z12;
        if (z12) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            y8Var2.setLines(1);
            y8Var2.setSingleLine(true);
        }
        y8Var2.setTextSize(1, 13.0f);
        y8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        y8Var2.setImportantForAccessibility(2);
        y8Var2.setEllipsize(truncateAt);
        y8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f13 = i9;
            addView(y8Var2, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i9;
            addView(y8Var2, g7.e6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i9) {
        return i9;
    }
}
