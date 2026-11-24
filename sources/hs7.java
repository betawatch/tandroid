// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hs7 extends FrameLayout implements gk7 {
    public static final List x = Arrays.asList(new es7(0, 1, 20, 0), new es7(0, 2, 20, 40), new es7(1, 0, 0, 20), new es7(1, 2, 60, 40), new es7(2, 0, 40, 20), new es7(2, 1, 40, 60));
    public int a;
    public final ry8 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final gs7 f;
    public fs7 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public hs7(Context context) {
        super(context);
        final byte b = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: ds7
            public final /* synthetic */ hs7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                hs7 hs7Var = this.b;
                switch (b2) {
                    case 0:
                        hs7Var.h.a();
                        break;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        hs7Var.h.b();
                        break;
                    case 3:
                        hs7Var.h.t();
                        break;
                    default:
                        hs7Var.h.D();
                        break;
                }
            }
        });
        addView(view, nme.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ry8 ry8Var = new ry8(context);
        this.b = ry8Var;
        ry8Var.f(R.raw.photo_text_allign, 24, 24, null);
        oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
        final byte b2 = 1;
        animatedDrawable.h = true;
        animatedDrawable.K(20);
        animatedDrawable.H(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ry8Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ry8Var.setOnClickListener(new View.OnClickListener(this) { // from class: ds7
            public final /* synthetic */ hs7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                hs7 hs7Var = this.b;
                switch (b22) {
                    case 0:
                        hs7Var.h.a();
                        break;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        hs7Var.h.b();
                        break;
                    case 3:
                        hs7Var.h.t();
                        break;
                    default:
                        hs7Var.h.D();
                        break;
                }
            }
        });
        ry8Var.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        addView(ry8Var, nme.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
        final byte b3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ds7
            public final /* synthetic */ hs7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                hs7 hs7Var = this.b;
                switch (b22) {
                    case 0:
                        hs7Var.h.a();
                        break;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        hs7Var.h.b();
                        break;
                    case 3:
                        hs7Var.h.t();
                        break;
                    default:
                        hs7Var.h.D();
                        break;
                }
            }
        });
        addView(imageView, nme.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(bkb.f0(1090519039, 1, -1));
        final byte b4 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ds7
            public final /* synthetic */ hs7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                hs7 hs7Var = this.b;
                switch (b22) {
                    case 0:
                        hs7Var.h.a();
                        break;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        hs7Var.h.b();
                        break;
                    case 3:
                        hs7Var.h.t();
                        break;
                    default:
                        hs7Var.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        addView(imageView2, nme.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        gs7 gs7Var = new gs7(context);
        this.f = gs7Var;
        gs7Var.setCurrent(true);
        final byte b5 = 4;
        gs7Var.setOnClickListener(new View.OnClickListener(this) { // from class: ds7
            public final /* synthetic */ hs7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                hs7 hs7Var = this.b;
                switch (b22) {
                    case 0:
                        hs7Var.h.a();
                        break;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        hs7Var.h.b();
                        break;
                    case 3:
                        hs7Var.h.t();
                        break;
                    default:
                        hs7Var.h.D();
                        break;
                }
            }
        });
        addView(gs7Var, nme.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i) {
        if (i == 0) {
            i = R.drawable.msg_add;
        }
        if (this.s != i) {
            this.s = i;
            gl.L3(this.d, i);
        }
    }

    public final void b(RectF rectF) {
        gs7 gs7Var = this.f;
        rectF.set(gl.L(8.0f) + gs7Var.getLeft(), gs7Var.getTop(), gl.L(8.0f) + gs7Var.getRight(), gs7Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i = this.r + layoutParams.leftMargin;
            this.r = i;
            view.layout(i, (getMeasuredHeight() - layoutParams.height) / 2, this.r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.r = layoutParams.width + layoutParams.rightMargin + this.r;
        }
    }

    public final void d(int i, boolean z) {
        int i2 = this.a;
        this.a = i;
        List list = x;
        ry8 ry8Var = this.b;
        if (i2 == i) {
            oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
            es7 es7Var = (es7) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                es7 es7Var2 = (es7) it.next();
                if (this.a == es7Var2.b) {
                    es7Var = es7Var2;
                    break;
                }
            }
            animatedDrawable.H(es7Var.d);
            animatedDrawable.K(es7Var.d);
            if (z) {
                this.h.c(i);
                return;
            }
            return;
        }
        es7 es7Var3 = (es7) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            es7 es7Var4 = (es7) it2.next();
            if (i2 == es7Var4.a && this.a == es7Var4.b) {
                es7Var3 = es7Var4;
                break;
            }
        }
        oy8 animatedDrawable2 = ry8Var.getAnimatedDrawable();
        animatedDrawable2.H(es7Var3.c);
        animatedDrawable2.K(es7Var3.d);
        animatedDrawable2.start();
        if (z) {
            this.h.c(i);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i != kk7.E5 || (str = this.w) == null) {
            return;
        }
        setTypeface(str);
        this.w = null;
    }

    public final void e(int i, boolean z) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        int i2 = i != 1 ? i != 2 ? i != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular : R.drawable.msg_photo_text_framed3 : R.drawable.msg_photo_text_framed2;
        ImageView imageView = this.c;
        if (z) {
            gl.L3(imageView, i2);
        } else {
            imageView.setImageResource(i2);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public qy1 getEmojiButton() {
        return null;
    }

    public gs7 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.E5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.E5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        gs7 gs7Var = this.f;
        gs7Var.layout(measuredWidth - gs7Var.getMeasuredWidth(), (getMeasuredHeight() - gs7Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (gs7Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            gs7 gs7Var = this.f;
            if (childAt == gs7Var) {
                gs7Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i) {
        d(i, false);
    }

    public void setDelegate(fs7 fs7Var) {
        this.h = fs7Var;
    }

    public void setOutlineType(int i) {
        e(i, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        gs7 gs7Var = this.f;
        if (gs7Var != null) {
            for (qs7 qs7Var : qs7.a()) {
                if (qs7Var.a.equals(str)) {
                    gs7Var.setTypeface(qs7Var.b());
                    String str2 = qs7Var.c;
                    if (str2 == null) {
                        str2 = k96.N0(qs7Var.b);
                    }
                    gs7Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(ss7 ss7Var) {
    }
}
