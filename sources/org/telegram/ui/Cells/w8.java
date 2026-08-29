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
import org.telegram.ui.Components.x80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class w8 extends FrameLayout {
    public final gh.s a;
    public final v8 b;
    public final v8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.c6 n;

    public w8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(23, context, c6Var, z10, false);
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
            imageView.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, this.n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z10 = LocaleController.isRTL;
        gh.s sVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin = dp;
        }
        sVar.requestLayout();
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

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        org.telegram.ui.ActionBar.c6 c6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gh.s sVar = this.a;
        sVar.setLinkTextColor(a2);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        sVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        v8 v8Var = this.b;
        v8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.g6.z6;
        v8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        v8Var.invalidate();
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
            org.telegram.ui.ActionBar.c6 c6Var = this.n;
            Paint G = c6Var != null ? c6Var.G("paintDivider") : org.telegram.ui.ActionBar.g6.k0;
            if (G == null) {
                G = org.telegram.ui.ActionBar.g6.k0;
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
        int x4 = (int) motionEvent.getX();
        v8 v8Var = this.b;
        boolean z10 = v8Var.b(x4 - v8Var.getLeft(), ((int) motionEvent.getY()) - v8Var.getTop()) != null;
        if (!z10) {
            int x10 = (int) motionEvent.getX();
            gh.s sVar = this.a;
            z10 = sVar.a(x10 - sVar.getLeft(), ((int) motionEvent.getY()) - sVar.getTop()) != null;
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

    public w8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.n = c6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        gh.s sVar = new gh.s(context, c6Var, true);
        this.a = sVar;
        final int i11 = 0;
        sVar.setOnLinkLongPressListener(new x80(this) { // from class: org.telegram.ui.Cells.u8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.x80
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
        sVar.setTextSize(1, 16.0f);
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
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
        float f9 = i10 - 6;
        addView(sVar, i7.f6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f9, 6.0f, f9, z10 ? 27.0f : 0.0f));
        v8 v8Var = new v8(this, context, c6Var, 0);
        this.b = v8Var;
        final int i12 = 1;
        v8Var.setOnLinkLongPressListener(new x80(this) { // from class: org.telegram.ui.Cells.u8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.x80
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
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            v8Var.setLines(1);
            v8Var.setSingleLine(true);
        }
        v8Var.setTextSize(1, 13.0f);
        v8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        v8Var.setImportantForAccessibility(2);
        v8Var.setEllipsize(truncateAt);
        v8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(v8Var, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(v8Var, i7.f6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        v8 v8Var2 = new v8(this, context, c6Var, 1);
        this.c = v8Var2;
        final int i13 = 2;
        v8Var2.setOnLinkLongPressListener(new x80(this) { // from class: org.telegram.ui.Cells.u8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.x80
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
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
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            v8Var2.setLines(1);
            v8Var2.setSingleLine(true);
        }
        v8Var2.setTextSize(1, 13.0f);
        v8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        v8Var2.setImportantForAccessibility(2);
        v8Var2.setEllipsize(truncateAt);
        v8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(v8Var2, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(v8Var2, i7.f6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
