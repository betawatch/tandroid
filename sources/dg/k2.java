package dg;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List w = Arrays.asList(new h2(0, 1, 20, 0), new h2(0, 2, 20, 40), new h2(1, 0, 0, 20), new h2(1, 2, 60, 40), new h2(2, 0, 40, 20), new h2(2, 1, 40, 60));
    public int a;
    public final jj0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final j2 f;
    public i2 h;
    public int n;
    public int r;
    public int s;
    public String v;

    public k2(Context context) {
        super(context);
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        final int i10 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: dg.g2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        k2Var.d((k2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(view, b6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        jj0 jj0Var = new jj0(context);
        this.b = jj0Var;
        jj0Var.f(R.raw.photo_text_allign, 24, 24, null);
        gj0 animatedDrawable = jj0Var.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        jj0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        final int i11 = 1;
        jj0Var.setOnClickListener(new View.OnClickListener(this) { // from class: dg.g2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        k2Var.d((k2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        jj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(jj0Var, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        final int i12 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: dg.g2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        k2Var.d((k2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(imageView, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.f0(1090519039, 1, -1));
        final int i13 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: dg.g2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        k2Var.d((k2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView2, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        j2 j2Var = new j2(context);
        this.f = j2Var;
        j2Var.setCurrent(true);
        final int i14 = 4;
        j2Var.setOnClickListener(new View.OnClickListener(this) { // from class: dg.g2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        k2Var.d((k2Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.d();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(j2Var, b6.o(-2, -2, 0.0f, 21));
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
        j2 j2Var = this.f;
        rectF.set(AndroidUtilities.dp(8.0f) + j2Var.getLeft(), j2Var.getTop(), AndroidUtilities.dp(8.0f) + j2Var.getRight(), j2Var.getBottom());
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
        jj0 jj0Var = this.b;
        if (i11 == i10) {
            gj0 animatedDrawable = jj0Var.getAnimatedDrawable();
            h2 h2Var = (h2) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h2 h2Var2 = (h2) it.next();
                if (this.a == h2Var2.b) {
                    h2Var = h2Var2;
                    break;
                }
            }
            animatedDrawable.K(h2Var.d);
            animatedDrawable.N(h2Var.d);
            if (z4) {
                this.h.f(i10);
                return;
            }
            return;
        }
        h2 h2Var3 = (h2) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            h2 h2Var4 = (h2) it2.next();
            if (i11 == h2Var4.a && this.a == h2Var4.b) {
                h2Var3 = h2Var4;
                break;
            }
        }
        gj0 animatedDrawable2 = jj0Var.getAnimatedDrawable();
        animatedDrawable2.K(h2Var3.c);
        animatedDrawable2.N(h2Var3.d);
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

    public j2 getTypefaceCell() {
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
        j2 j2Var = this.f;
        j2Var.layout(measuredWidth - j2Var.getMeasuredWidth(), (getMeasuredHeight() - j2Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (j2Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            j2 j2Var = this.f;
            if (childAt == j2Var) {
                j2Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
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

    public void setDelegate(i2 i2Var) {
        this.h = i2Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        j2 j2Var = this.f;
        if (j2Var == null) {
            return;
        }
        for (cg.t0 t0Var : cg.t0.c()) {
            if (t0Var.a.equals(str)) {
                j2Var.setTypeface(t0Var.d());
                String str2 = t0Var.c;
                if (str2 == null) {
                    str2 = LocaleController.getString(t0Var.b);
                }
                j2Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(q2 q2Var) {
    }
}
