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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nv7 extends FrameLayout implements fn7 {
    public static final List x = Arrays.asList(new kv7(0, 1, 20, 0), new kv7(0, 2, 20, 40), new kv7(1, 0, 0, 20), new kv7(1, 2, 60, 40), new kv7(2, 0, 40, 20), new kv7(2, 1, 40, 60));
    public int a;
    public final e29 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final mv7 f;
    public lv7 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public nv7(Context context) {
        super(context);
        final byte b = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: jv7
            public final /* synthetic */ nv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                nv7 nv7Var = this.b;
                switch (b2) {
                    case 0:
                        nv7Var.h.a();
                        break;
                    case 1:
                        nv7Var.d((nv7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        nv7Var.h.b();
                        break;
                    case 3:
                        nv7Var.h.t();
                        break;
                    default:
                        nv7Var.h.D();
                        break;
                }
            }
        });
        addView(view, tre.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        e29 e29Var = new e29(context);
        this.b = e29Var;
        e29Var.f(R.raw.photo_text_allign, 24, 24, null);
        b29 animatedDrawable = e29Var.getAnimatedDrawable();
        final byte b2 = 1;
        animatedDrawable.h = true;
        animatedDrawable.K(20);
        animatedDrawable.H(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e29Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        e29Var.setOnClickListener(new View.OnClickListener(this) { // from class: jv7
            public final /* synthetic */ nv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                nv7 nv7Var = this.b;
                switch (b22) {
                    case 0:
                        nv7Var.h.a();
                        break;
                    case 1:
                        nv7Var.d((nv7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        nv7Var.h.b();
                        break;
                    case 3:
                        nv7Var.h.t();
                        break;
                    default:
                        nv7Var.h.D();
                        break;
                }
            }
        });
        e29Var.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        addView(e29Var, tre.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
        final byte b3 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: jv7
            public final /* synthetic */ nv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                nv7 nv7Var = this.b;
                switch (b22) {
                    case 0:
                        nv7Var.h.a();
                        break;
                    case 1:
                        nv7Var.d((nv7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        nv7Var.h.b();
                        break;
                    case 3:
                        nv7Var.h.t();
                        break;
                    default:
                        nv7Var.h.D();
                        break;
                }
            }
        });
        addView(imageView, tre.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(aob.f0(1090519039, 1, -1));
        final byte b4 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: jv7
            public final /* synthetic */ nv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                nv7 nv7Var = this.b;
                switch (b22) {
                    case 0:
                        nv7Var.h.a();
                        break;
                    case 1:
                        nv7Var.d((nv7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        nv7Var.h.b();
                        break;
                    case 3:
                        nv7Var.h.t();
                        break;
                    default:
                        nv7Var.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        addView(imageView2, tre.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        mv7 mv7Var = new mv7(context);
        this.f = mv7Var;
        mv7Var.setCurrent(true);
        final byte b5 = 4;
        mv7Var.setOnClickListener(new View.OnClickListener(this) { // from class: jv7
            public final /* synthetic */ nv7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                nv7 nv7Var = this.b;
                switch (b22) {
                    case 0:
                        nv7Var.h.a();
                        break;
                    case 1:
                        nv7Var.d((nv7Var.a + 1) % 3, true);
                        break;
                    case 2:
                        nv7Var.h.b();
                        break;
                    case 3:
                        nv7Var.h.t();
                        break;
                    default:
                        nv7Var.h.D();
                        break;
                }
            }
        });
        addView(mv7Var, tre.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i) {
        if (i == 0) {
            i = R.drawable.msg_add;
        }
        if (this.s != i) {
            this.s = i;
            hl.L3(this.d, i);
        }
    }

    public final void b(RectF rectF) {
        mv7 mv7Var = this.f;
        rectF.set(hl.L(8.0f) + mv7Var.getLeft(), mv7Var.getTop(), hl.L(8.0f) + mv7Var.getRight(), mv7Var.getBottom());
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
        e29 e29Var = this.b;
        if (i2 == i) {
            b29 animatedDrawable = e29Var.getAnimatedDrawable();
            kv7 kv7Var = (kv7) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kv7 kv7Var2 = (kv7) it.next();
                if (this.a == kv7Var2.b) {
                    kv7Var = kv7Var2;
                    break;
                }
            }
            animatedDrawable.H(kv7Var.d);
            animatedDrawable.K(kv7Var.d);
            if (z) {
                this.h.c(i);
                return;
            }
            return;
        }
        kv7 kv7Var3 = (kv7) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            kv7 kv7Var4 = (kv7) it2.next();
            if (i2 == kv7Var4.a && this.a == kv7Var4.b) {
                kv7Var3 = kv7Var4;
                break;
            }
        }
        b29 animatedDrawable2 = e29Var.getAnimatedDrawable();
        animatedDrawable2.H(kv7Var3.c);
        animatedDrawable2.K(kv7Var3.d);
        animatedDrawable2.start();
        if (z) {
            this.h.c(i);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i != jn7.F5 || (str = this.w) == null) {
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
            hl.L3(imageView, i2);
        } else {
            imageView.setImageResource(i2);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public iz1 getEmojiButton() {
        return null;
    }

    public mv7 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.F5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.F5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        mv7 mv7Var = this.f;
        mv7Var.layout(measuredWidth - mv7Var.getMeasuredWidth(), (getMeasuredHeight() - mv7Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (mv7Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            mv7 mv7Var = this.f;
            if (childAt == mv7Var) {
                mv7Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
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

    public void setDelegate(lv7 lv7Var) {
        this.h = lv7Var;
    }

    public void setOutlineType(int i) {
        e(i, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        mv7 mv7Var = this.f;
        if (mv7Var != null) {
            for (xv7 xv7Var : xv7.a()) {
                if (xv7Var.a.equals(str)) {
                    mv7Var.setTypeface(xv7Var.b());
                    String str2 = xv7Var.c;
                    if (str2 == null) {
                        str2 = ob6.N0(xv7Var.b);
                    }
                    mv7Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(zv7 zv7Var) {
    }
}
