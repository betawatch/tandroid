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
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class x8 extends FrameLayout {
    public final ih.s a;
    public final w8 b;
    public final w8 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 n;

    public x8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this(23, context, f6Var, z4, false);
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
        boolean z4 = LocaleController.isRTL;
        ih.s sVar = this.a;
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
        w8 w8Var = this.c;
        w8Var.setVisibility(0);
        w8Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        ih.s sVar = this.a;
        sVar.setLinkTextColor(a2);
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        sVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        w8 w8Var = this.b;
        w8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        w8Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        w8Var.invalidate();
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
        w8 w8Var = this.b;
        boolean z4 = w8Var.b(x10 - w8Var.getLeft(), ((int) motionEvent.getY()) - w8Var.getTop()) != null;
        if (!z4) {
            int x11 = (int) motionEvent.getX();
            ih.s sVar = this.a;
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

    public x8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.n = f6Var;
        boolean z11 = z4 || z10;
        this.h = z11;
        ih.s sVar = new ih.s(context, f6Var, true);
        this.a = sVar;
        final int i11 = 0;
        sVar.setOnLinkLongPressListener(new e90(this) { // from class: org.telegram.ui.Cells.v8
            public final /* synthetic */ x8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.e90
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
        addView(sVar, k7.b6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f10, 6.0f, f10, z4 ? 27.0f : 0.0f));
        w8 w8Var = new w8(this, context, f6Var, 0);
        this.b = w8Var;
        final int i12 = 1;
        w8Var.setOnLinkLongPressListener(new e90(this) { // from class: org.telegram.ui.Cells.v8
            public final /* synthetic */ x8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.e90
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
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            w8Var.setLines(1);
            w8Var.setSingleLine(true);
        }
        w8Var.setTextSize(1, 13.0f);
        w8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w8Var.setImportantForAccessibility(2);
        w8Var.setEllipsize(truncateAt);
        w8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z4) {
            float f11 = i10;
            addView(w8Var, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i10;
            addView(w8Var, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        w8 w8Var2 = new w8(this, context, f6Var, 1);
        this.c = w8Var2;
        final int i13 = 2;
        w8Var2.setOnLinkLongPressListener(new e90(this) { // from class: org.telegram.ui.Cells.v8
            public final /* synthetic */ x8 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.e90
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
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
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            w8Var2.setLines(1);
            w8Var2.setSingleLine(true);
        }
        w8Var2.setTextSize(1, 13.0f);
        w8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        w8Var2.setImportantForAccessibility(2);
        w8Var2.setEllipsize(truncateAt);
        w8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z4) {
            float f13 = i10;
            addView(w8Var2, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i10;
            addView(w8Var2, k7.b6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
