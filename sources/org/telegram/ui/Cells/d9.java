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
import org.telegram.ui.Components.l90;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class d9 extends FrameLayout {
    public final uh.o a;
    public final c9 b;
    public final c9 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 n;

    public d9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
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
        uh.o oVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) oVar.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) oVar.getLayoutParams()).rightMargin = dp;
        }
        oVar.requestLayout();
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
        c9 c9Var = this.c;
        c9Var.setVisibility(0);
        c9Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        uh.o oVar = this.a;
        oVar.setLinkTextColor(a2);
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        oVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        c9 c9Var = this.b;
        c9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        c9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        c9Var.invalidate();
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
            Paint F = f6Var != null ? f6Var.F("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (F == null) {
                F = org.telegram.ui.ActionBar.j6.k0;
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
        c9 c9Var = this.b;
        boolean z10 = c9Var.b(x10 - c9Var.getLeft(), ((int) motionEvent.getY()) - c9Var.getTop()) != null;
        if (!z10) {
            int x11 = (int) motionEvent.getX();
            uh.o oVar = this.a;
            z10 = oVar.a(x11 - oVar.getLeft(), ((int) motionEvent.getY()) - oVar.getTop()) != null;
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

    public d9(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.n = f6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        uh.o oVar = new uh.o(context, f6Var, true);
        this.a = oVar;
        final int i11 = 0;
        oVar.setOnLinkLongPressListener(new l90(this) { // from class: org.telegram.ui.Cells.b9
            public final /* synthetic */ d9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l90
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        d9 d9Var = this.b;
                        d9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                d9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(d9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        d9 d9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                d9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(d9Var2.b);
                            break;
                        }
                        break;
                    default:
                        d9 d9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                d9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(d9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        oVar.setTextSize(1, 16.0f);
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            oVar.setLines(1);
            oVar.setMaxLines(1);
            oVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oVar.setEllipsize(truncateAt);
        oVar.setImportantForAccessibility(2);
        oVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(oVar, w7.a6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        c9 c9Var = new c9(this, context, f6Var, 0);
        this.b = c9Var;
        final int i12 = 1;
        c9Var.setOnLinkLongPressListener(new l90(this) { // from class: org.telegram.ui.Cells.b9
            public final /* synthetic */ d9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l90
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        d9 d9Var = this.b;
                        d9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                d9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(d9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        d9 d9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                d9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(d9Var2.b);
                            break;
                        }
                        break;
                    default:
                        d9 d9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                d9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(d9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            c9Var.setLines(1);
            c9Var.setSingleLine(true);
        }
        c9Var.setTextSize(1, 13.0f);
        c9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        c9Var.setImportantForAccessibility(2);
        c9Var.setEllipsize(truncateAt);
        c9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(c9Var, w7.a6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(c9Var, w7.a6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        c9 c9Var2 = new c9(this, context, f6Var, 1);
        this.c = c9Var2;
        final int i13 = 2;
        c9Var2.setOnLinkLongPressListener(new l90(this) { // from class: org.telegram.ui.Cells.b9
            public final /* synthetic */ d9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l90
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
                    case 0:
                        d9 d9Var = this.b;
                        d9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                d9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(d9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        d9 d9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                d9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(d9Var2.b);
                            break;
                        }
                        break;
                    default:
                        d9 d9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                d9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(d9Var3.b);
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
            c9Var2.setLines(1);
            c9Var2.setSingleLine(true);
        }
        c9Var2.setTextSize(1, 13.0f);
        c9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        c9Var2.setImportantForAccessibility(2);
        c9Var2.setEllipsize(truncateAt);
        c9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(c9Var2, w7.a6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(c9Var2, w7.a6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
