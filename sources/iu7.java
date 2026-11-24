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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iu7 extends FrameLayout implements jm7 {
    public static final List x = Arrays.asList(new fu7(0, 1, 20, 0), new fu7(0, 2, 20, 40), new fu7(1, 0, 0, 20), new fu7(1, 2, 60, 40), new fu7(2, 0, 40, 20), new fu7(2, 1, 40, 60));
    public int a;
    public final s09 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final hu7 f;
    public gu7 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public iu7(Context context) {
        super(context);
        final byte b = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: eu7
            public final /* synthetic */ iu7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                iu7 iu7Var = this.b;
                switch (b2) {
                    case 0:
                        iu7Var.h.a();
                        break;
                    case 1:
                        iu7Var.d((iu7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        iu7Var.h.b();
                        break;
                    case 3:
                        iu7Var.h.t();
                        break;
                    default:
                        iu7Var.h.D();
                        break;
                }
            }
        });
        addView(view, qoe.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        s09 s09Var = new s09(context);
        this.b = s09Var;
        s09Var.f(R.raw.photo_text_allign, 24, 24, null);
        p09 animatedDrawable = s09Var.getAnimatedDrawable();
        final byte b2 = 1;
        animatedDrawable.h = true;
        animatedDrawable.K(20);
        animatedDrawable.H(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        s09Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        s09Var.setOnClickListener(new View.OnClickListener(this) { // from class: eu7
            public final /* synthetic */ iu7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                iu7 iu7Var = this.b;
                switch (b22) {
                    case 0:
                        iu7Var.h.a();
                        break;
                    case 1:
                        iu7Var.d((iu7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        iu7Var.h.b();
                        break;
                    case 3:
                        iu7Var.h.t();
                        break;
                    default:
                        iu7Var.h.D();
                        break;
                }
            }
        });
        s09Var.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        addView(s09Var, qoe.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
        final byte b3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eu7
            public final /* synthetic */ iu7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                iu7 iu7Var = this.b;
                switch (b22) {
                    case 0:
                        iu7Var.h.a();
                        break;
                    case 1:
                        iu7Var.d((iu7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        iu7Var.h.b();
                        break;
                    case 3:
                        iu7Var.h.t();
                        break;
                    default:
                        iu7Var.h.D();
                        break;
                }
            }
        });
        addView(imageView, qoe.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(cmb.f0(1090519039, 1, -1));
        final byte b4 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: eu7
            public final /* synthetic */ iu7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                iu7 iu7Var = this.b;
                switch (b22) {
                    case 0:
                        iu7Var.h.a();
                        break;
                    case 1:
                        iu7Var.d((iu7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        iu7Var.h.b();
                        break;
                    case 3:
                        iu7Var.h.t();
                        break;
                    default:
                        iu7Var.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        addView(imageView2, qoe.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        hu7 hu7Var = new hu7(context);
        this.f = hu7Var;
        hu7Var.setCurrent(true);
        final byte b5 = 4;
        hu7Var.setOnClickListener(new View.OnClickListener(this) { // from class: eu7
            public final /* synthetic */ iu7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                iu7 iu7Var = this.b;
                switch (b22) {
                    case 0:
                        iu7Var.h.a();
                        break;
                    case 1:
                        iu7Var.d((iu7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        iu7Var.h.b();
                        break;
                    case 3:
                        iu7Var.h.t();
                        break;
                    default:
                        iu7Var.h.D();
                        break;
                }
            }
        });
        addView(hu7Var, qoe.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i) {
        if (i == 0) {
            i = R.drawable.msg_add;
        }
        if (this.s != i) {
            this.s = i;
            gm.L3(this.d, i);
        }
    }

    public final void b(RectF rectF) {
        hu7 hu7Var = this.f;
        rectF.set(gm.L(8.0f) + hu7Var.getLeft(), hu7Var.getTop(), gm.L(8.0f) + hu7Var.getRight(), hu7Var.getBottom());
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
        s09 s09Var = this.b;
        if (i2 == i) {
            p09 animatedDrawable = s09Var.getAnimatedDrawable();
            fu7 fu7Var = (fu7) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fu7 fu7Var2 = (fu7) it.next();
                if (this.a == fu7Var2.b) {
                    fu7Var = fu7Var2;
                    break;
                }
            }
            animatedDrawable.H(fu7Var.d);
            animatedDrawable.K(fu7Var.d);
            if (z) {
                this.h.c(i);
                return;
            }
            return;
        }
        fu7 fu7Var3 = (fu7) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            fu7 fu7Var4 = (fu7) it2.next();
            if (i2 == fu7Var4.a && this.a == fu7Var4.b) {
                fu7Var3 = fu7Var4;
                break;
            }
        }
        p09 animatedDrawable2 = s09Var.getAnimatedDrawable();
        animatedDrawable2.H(fu7Var3.c);
        animatedDrawable2.K(fu7Var3.d);
        animatedDrawable2.start();
        if (z) {
            this.h.c(i);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i != nm7.G5 || (str = this.w) == null) {
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
            gm.L3(imageView, i2);
        } else {
            imageView.setImageResource(i2);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public d02 getEmojiButton() {
        return null;
    }

    public hu7 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.G5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.G5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        hu7 hu7Var = this.f;
        hu7Var.layout(measuredWidth - hu7Var.getMeasuredWidth(), (getMeasuredHeight() - hu7Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (hu7Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            hu7 hu7Var = this.f;
            if (childAt == hu7Var) {
                hu7Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
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

    public void setDelegate(gu7 gu7Var) {
        this.h = gu7Var;
    }

    public void setOutlineType(int i) {
        e(i, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        hu7 hu7Var = this.f;
        if (hu7Var != null) {
            for (ru7 ru7Var : ru7.a()) {
                if (ru7Var.a.equals(str)) {
                    hu7Var.setTypeface(ru7Var.b());
                    String str2 = ru7Var.c;
                    if (str2 == null) {
                        str2 = jb6.N0(ru7Var.b);
                    }
                    hu7Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(tu7 tu7Var) {
    }
}
