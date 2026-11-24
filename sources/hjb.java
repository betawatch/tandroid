// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class hjb extends FrameLayout implements vlb {
    public final xna a;
    public final gjb b;
    public final gjb c;
    public final ImageView d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public final ylb n;

    public hjb(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.n = ylbVar;
        final byte b = 0;
        final byte b2 = 1;
        boolean z3 = z || z2;
        this.h = z3;
        xna xnaVar = new xna(ylbVar, context, true);
        this.a = xnaVar;
        xnaVar.setOnLinkLongPressListener(new k66(this) { // from class: fjb
            public final /* synthetic */ hjb b;

            {
                this.b = this;
            }

            @Override // k66
            public final void a(ClickableSpan clickableSpan) {
                byte b3 = b;
                hjb hjbVar = this.b;
                switch (b3) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(hjbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        xnaVar.setTextSize(1, 16.0f);
        xnaVar.setGravity(jb6.a0 ? 5 : 3);
        if (z) {
            setMinimumHeight(gm.L(60.0f));
        } else {
            xnaVar.setLines(1);
            xnaVar.setMaxLines(1);
            xnaVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xnaVar.setEllipsize(truncateAt);
        final byte b3 = 2;
        xnaVar.setImportantForAccessibility(2);
        xnaVar.setPadding(gm.L(6.0f), gm.L(2.0f), gm.L(6.0f), gm.L(5.0f));
        float f = i - 6;
        addView(xnaVar, qoe.d(-2, -2.0f, jb6.a0 ? 5 : 3, f, 6.0f, f, z ? 27.0f : 0.0f));
        gjb gjbVar = new gjb(this, context, ylbVar, (byte) 0);
        this.b = gjbVar;
        gjbVar.setOnLinkLongPressListener(new k66(this) { // from class: fjb
            public final /* synthetic */ hjb b;

            {
                this.b = this;
            }

            @Override // k66
            public final void a(ClickableSpan clickableSpan) {
                byte b32 = b2;
                hjb hjbVar = this.b;
                switch (b32) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(hjbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        if (z2) {
            setMinimumHeight(gm.L(60.0f));
        } else {
            gjbVar.setLines(1);
            gjbVar.setSingleLine(true);
        }
        gjbVar.setTextSize(1, 13.0f);
        gjbVar.setGravity(jb6.a0 ? 5 : 3);
        gjbVar.setImportantForAccessibility(2);
        gjbVar.setEllipsize(truncateAt);
        gjbVar.setPadding(0, gm.L(1.0f), 0, gm.L(6.0f));
        boolean z4 = jb6.a0;
        if (z) {
            int i2 = (z4 ? 5 : 3) | 80;
            float f2 = i;
            addView(gjbVar, qoe.d(-1, -2.0f, i2, f2, 32.0f, f2, 4.0f));
        } else {
            int i3 = z4 ? 5 : 3;
            float f3 = i;
            addView(gjbVar, qoe.d(-1, -2.0f, i3, f3, 32.0f, f3, 4.0f));
        }
        gjb gjbVar2 = new gjb(this, context, ylbVar, (byte) 1);
        this.c = gjbVar2;
        gjbVar2.setOnLinkLongPressListener(new k66(this) { // from class: fjb
            public final /* synthetic */ hjb b;

            {
                this.b = this;
            }

            @Override // k66
            public final void a(ClickableSpan clickableSpan) {
                byte b32 = b3;
                hjb hjbVar = this.b;
                switch (b32) {
                    case 0:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(hjbVar.a);
                            break;
                        }
                        break;
                    case 1:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            break;
                        }
                        break;
                    default:
                        if (clickableSpan != null) {
                            try {
                                hjbVar.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(hjbVar.b);
                            break;
                        }
                        break;
                }
            }
        });
        this.h = z3;
        if (z3) {
            setMinimumHeight(gm.L(60.0f));
        } else {
            gjbVar2.setLines(1);
            gjbVar2.setSingleLine(true);
        }
        gjbVar2.setTextSize(1, 13.0f);
        gjbVar2.setGravity(jb6.a0 ? 3 : 5);
        gjbVar2.setImportantForAccessibility(2);
        gjbVar2.setEllipsize(truncateAt);
        gjbVar2.setPadding(0, gm.L(1.0f), 0, gm.L(6.0f));
        boolean z5 = jb6.a0;
        if (z) {
            float f4 = i;
            addView(gjbVar2, qoe.d(-1, -2.0f, (z5 ? 5 : 3) | 80, f4, 32.0f, f4, 4.0f));
        } else {
            float f5 = i;
            addView(gjbVar2, qoe.d(-1, -2.0f, z5 ? 5 : 3, f5, 32.0f, f5, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public final void b(Drawable drawable, String str) {
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = (jb6.a0 || drawable == null) ? gm.L(23.0f) : gm.L(58.0f);
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        imageView.setFocusable(drawable != null);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L = gm.L(48.0f);
            int i = cmb.h6;
            ylb ylbVar = this.n;
            fg0 h0 = cmb.h0(L, 0, cmb.v0(i, ylbVar));
            wmb M = anb.M(i);
            imageView.setBackground(h0);
            anb.j(imageView, h0, null, M, ylbVar);
            imageView.setImportantForAccessibility(1);
        }
        int L2 = gm.L(23.0f) + (drawable != null ? gm.L(48.0f) : 0);
        boolean z = jb6.a0;
        xna xnaVar = this.a;
        if (z) {
            ((ViewGroup.MarginLayoutParams) xnaVar.getLayoutParams()).leftMargin = L2;
        } else {
            ((ViewGroup.MarginLayoutParams) xnaVar.getLayoutParams()).rightMargin = L2;
        }
        xnaVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a.setText(charSequence);
        this.b.setText(charSequence2);
        this.c.setVisibility(8);
        this.e = z;
        setWillNotDraw(!z);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.a.setText(charSequence);
        this.b.setText(str);
        gjb gjbVar = this.c;
        gjbVar.setVisibility(0);
        gjbVar.setText(str2);
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
            ylb ylbVar = this.n;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : cmb.j0;
            if (d == null) {
                d = cmb.j0;
            }
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, d);
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
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        if (!this.h) {
            i2 = View.MeasureSpec.makeMeasureSpec(gm.L(60.0f) + (this.e ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        gjb gjbVar = this.b;
        boolean z = gjbVar.b(x - gjbVar.getLeft(), ((int) motionEvent.getY()) - gjbVar.getTop()) != null;
        if (!z) {
            int x2 = (int) motionEvent.getX();
            xna xnaVar = this.a;
            z = xnaVar.a(x2 - xnaVar.getLeft(), ((int) motionEvent.getY()) - xnaVar.getTop()) != null;
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z) {
        this.f = z;
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

    @Override // vlb
    public final void updateColors() {
        int i = cmb.Wc;
        ylb ylbVar = this.n;
        int a = a(cmb.v0(i, ylbVar));
        xna xnaVar = this.a;
        xnaVar.setLinkTextColor(a);
        xnaVar.setTextColor(cmb.v0(cmb.F6, ylbVar));
        xnaVar.invalidate();
        int a2 = a(cmb.v0(i, ylbVar));
        gjb gjbVar = this.b;
        gjbVar.setLinkTextColor(a2);
        int i2 = cmb.y6;
        gjbVar.setTextColor(cmb.v0(i2, ylbVar));
        this.c.setTextColor(cmb.v0(i2, ylbVar));
        gjbVar.invalidate();
    }

    public int a(int i) {
        return i;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public hjb(ylb ylbVar, Context context, boolean z) {
        this(23, ylbVar, context, z, false);
    }
}
