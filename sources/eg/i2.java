package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List w = Arrays.asList(new f2(0, 1, 20, 0), new f2(0, 2, 20, 40), new f2(1, 0, 0, 20), new f2(1, 2, 60, 40), new f2(2, 0, 40, 20), new f2(2, 1, 40, 60));
    public int a;
    public final kj0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final h2 f;
    public g2 h;
    public int n;
    public int r;
    public int s;
    public String v;

    public i2(Context context) {
        super(context);
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        final int i10 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: eg.e2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        i2 i2Var = this.b;
                        i2Var.d((i2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(view, c6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        kj0 kj0Var = new kj0(context);
        this.b = kj0Var;
        kj0Var.f(R.raw.photo_text_allign, 24, 24, null);
        hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        final int i11 = 1;
        kj0Var.setOnClickListener(new View.OnClickListener(this) { // from class: eg.e2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        i2 i2Var = this.b;
                        i2Var.d((i2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        kj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(kj0Var, c6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        final int i12 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eg.e2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        i2 i2Var = this.b;
                        i2Var.d((i2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(imageView, c6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.f0(1090519039, 1, -1));
        final int i13 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: eg.e2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        i2 i2Var = this.b;
                        i2Var.d((i2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView2, c6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        h2 h2Var = new h2(context);
        this.f = h2Var;
        h2Var.setCurrent(true);
        final int i14 = 4;
        h2Var.setOnClickListener(new View.OnClickListener(this) { // from class: eg.e2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        i2 i2Var = this.b;
                        i2Var.d((i2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(h2Var, c6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.s != i10) {
            this.s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        h2 h2Var = this.f;
        rectF.set(AndroidUtilities.dp(8.0f) + h2Var.getLeft(), h2Var.getTop(), AndroidUtilities.dp(8.0f) + h2Var.getRight(), h2Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.r + layoutParams.leftMargin;
            this.r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.r = layoutParams.width + layoutParams.rightMargin + this.r;
        }
    }

    public final void d(int i10, boolean z4) {
        int i11 = this.a;
        this.a = i10;
        List list = w;
        kj0 kj0Var = this.b;
        if (i11 == i10) {
            hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
            f2 f2Var = (f2) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f2 f2Var2 = (f2) it.next();
                if (this.a == f2Var2.b) {
                    f2Var = f2Var2;
                    break;
                }
            }
            animatedDrawable.K(f2Var.d);
            animatedDrawable.N(f2Var.d);
            if (z4) {
                this.h.f(i10);
                return;
            }
            return;
        }
        f2 f2Var3 = (f2) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            f2 f2Var4 = (f2) it2.next();
            if (i11 == f2Var4.a && this.a == f2Var4.b) {
                f2Var3 = f2Var4;
                break;
            }
        }
        hj0 animatedDrawable2 = kj0Var.getAnimatedDrawable();
        animatedDrawable2.K(f2Var3.c);
        animatedDrawable2.N(f2Var3.d);
        animatedDrawable2.start();
        if (z4) {
            this.h.f(i10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (str = this.v) == null) {
            return;
        }
        setTypeface(str);
        this.v = null;
    }

    public final void e(int i10, boolean z4) {
        if (this.n == i10) {
            return;
        }
        this.n = i10;
        int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular : R.drawable.msg_photo_text_framed3 : R.drawable.msg_photo_text_framed2;
        ImageView imageView = this.c;
        if (z4) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public qg getEmojiButton() {
        return null;
    }

    public h2 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        h2 h2Var = this.f;
        h2Var.layout(measuredWidth - h2Var.getMeasuredWidth(), (getMeasuredHeight() - h2Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (h2Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            h2 h2Var = this.f;
            if (childAt == h2Var) {
                h2Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i10) {
        d(i10, false);
    }

    public void setDelegate(g2 g2Var) {
        this.h = g2Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        h2 h2Var = this.f;
        if (h2Var == null) {
            return;
        }
        for (dg.s0 s0Var : dg.s0.c()) {
            if (s0Var.a.equals(str)) {
                h2Var.setTypeface(s0Var.d());
                String str2 = s0Var.c;
                if (str2 == null) {
                    str2 = LocaleController.getString(s0Var.b);
                }
                h2Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(o2 o2Var) {
    }
}
