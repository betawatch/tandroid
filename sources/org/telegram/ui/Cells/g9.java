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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class g9 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final xh.n a;
    public final f9 b;
    public final f9 c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.u6 n;

    public g9(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this(23, context, u6Var, z10, false);
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
            int dp = AndroidUtilities.dp(48.0f);
            int i10 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.u6 u6Var = this.n;
            y i02 = org.telegram.ui.ActionBar.y6.i0(dp, 0, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            imageView.setBackground(i02);
            org.telegram.ui.ActionBar.f7.k(imageView, i02, null, N, u6Var);
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f) + (drawable != null ? AndroidUtilities.dp(48.0f) : 0);
        boolean z10 = LocaleController.isRTL;
        xh.n nVar = this.a;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) nVar.getLayoutParams()).leftMargin = dp2;
        } else {
            ((ViewGroup.MarginLayoutParams) nVar.getLayoutParams()).rightMargin = dp2;
        }
        nVar.requestLayout();
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
        f9 f9Var = this.c;
        f9Var.setVisibility(0);
        f9Var.setText(str2);
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
            org.telegram.ui.ActionBar.u6 u6Var = this.n;
            Paint d = u6Var != null ? u6Var.d("paintDivider") : org.telegram.ui.ActionBar.y6.k0;
            if (d == null) {
                d = org.telegram.ui.ActionBar.y6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, d);
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
        int x9 = (int) motionEvent.getX();
        f9 f9Var = this.b;
        boolean z10 = f9Var.b(x9 - f9Var.getLeft(), ((int) motionEvent.getY()) - f9Var.getTop()) != null;
        if (!z10) {
            int x10 = (int) motionEvent.getX();
            xh.n nVar = this.a;
            z10 = nVar.a(x10 - nVar.getLeft(), ((int) motionEvent.getY()) - nVar.getTop()) != null;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.u6 u6Var = this.n;
        int a2 = a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        xh.n nVar = this.a;
        nVar.setLinkTextColor(a2);
        nVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
        nVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        f9 f9Var = this.b;
        f9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.y6.z6;
        f9Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        f9Var.invalidate();
    }

    public g9(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        this.n = u6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        xh.n nVar = new xh.n(context, u6Var, true);
        this.a = nVar;
        final int i11 = 0;
        nVar.setOnLinkLongPressListener(new z90(this) { // from class: org.telegram.ui.Cells.e9
            public final /* synthetic */ g9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.z90
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        g9 g9Var = this.b;
                        g9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                g9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(g9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        g9 g9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                g9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(g9Var2.b);
                            break;
                        }
                        break;
                    default:
                        g9 g9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                g9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(g9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        nVar.setTextSize(1, 16.0f);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            nVar.setLines(1);
            nVar.setMaxLines(1);
            nVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        nVar.setEllipsize(truncateAt);
        nVar.setImportantForAccessibility(2);
        nVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(nVar, kb1.h(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        f9 f9Var = new f9(this, context, u6Var, 0);
        this.b = f9Var;
        final int i12 = 1;
        f9Var.setOnLinkLongPressListener(new z90(this) { // from class: org.telegram.ui.Cells.e9
            public final /* synthetic */ g9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.z90
            public final void a(ClickableSpan clickableSpan) {
                switch (i12) {
                    case 0:
                        g9 g9Var = this.b;
                        g9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                g9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(g9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        g9 g9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                g9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(g9Var2.b);
                            break;
                        }
                        break;
                    default:
                        g9 g9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                g9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(g9Var3.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            f9Var.setLines(1);
            f9Var.setSingleLine(true);
        }
        f9Var.setTextSize(1, 13.0f);
        f9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        f9Var.setImportantForAccessibility(2);
        f9Var.setEllipsize(truncateAt);
        f9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(f9Var, kb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(f9Var, kb1.h(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        f9 f9Var2 = new f9(this, context, u6Var, 1);
        this.c = f9Var2;
        final int i13 = 2;
        f9Var2.setOnLinkLongPressListener(new z90(this) { // from class: org.telegram.ui.Cells.e9
            public final /* synthetic */ g9 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.z90
            public final void a(ClickableSpan clickableSpan) {
                switch (i13) {
                    case 0:
                        g9 g9Var = this.b;
                        g9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                g9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(g9Var.a);
                            break;
                        }
                        break;
                    case 1:
                        g9 g9Var2 = this.b;
                        if (clickableSpan != null) {
                            try {
                                g9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(g9Var2.b);
                            break;
                        }
                        break;
                    default:
                        g9 g9Var3 = this.b;
                        if (clickableSpan != null) {
                            try {
                                g9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(g9Var3.b);
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
            f9Var2.setLines(1);
            f9Var2.setSingleLine(true);
        }
        f9Var2.setTextSize(1, 13.0f);
        f9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        f9Var2.setImportantForAccessibility(2);
        f9Var2.setEllipsize(truncateAt);
        f9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(f9Var2, kb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(f9Var2, kb1.h(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, kb1.m(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
