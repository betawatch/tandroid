// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ff9 extends ze9 implements snb {
    public final ArrayList E;
    public df9 F;
    public int G;
    public int H;
    public final ki7 I;
    public final int n;
    public final vnb r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final ug9 x;
    public final TextView y;

    public ff9(int i, vnb vnbVar, Context context) {
        super(context);
        this.E = new ArrayList();
        this.I = new ki7(this, (byte) 17);
        this.n = i;
        this.r = vnbVar;
        f(hl.L(16.0f), hl.L(4.0f), hl.L(16.0f), hl.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        final byte b = 0;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, tre.e(-1, -1, 23));
        ug9 ug9Var = new ug9(R.drawable.msg_add, vnbVar, context);
        ug9Var.e = (byte) 19;
        ug9Var.updateColors();
        this.x = ug9Var;
        final byte b2 = 1;
        ug9Var.setSelected(true);
        ug9Var.setContentDescription(ob6.M0(2131754479, null));
        ug9Var.setOnClickListener(new View.OnClickListener(this) { // from class: bf9
            public final /* synthetic */ ff9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mk0 mk0Var;
                mk0 mk0Var2;
                byte b3 = b;
                ff9 ff9Var = this.b;
                switch (b3) {
                    case 0:
                        df9 df9Var = ff9Var.F;
                        if (df9Var != null && (mk0Var = ff9Var.a) != null) {
                            pi9 pi9Var = ((hi9) df9Var).a;
                            pi9Var.l3(false);
                            pi9Var.p3.S(new mi9(pi9Var, mk0Var, -1), view);
                            break;
                        }
                        break;
                    default:
                        df9 df9Var2 = ff9Var.F;
                        if (df9Var2 != null && (mk0Var2 = ff9Var.a) != null) {
                            pi9 pi9Var2 = ((hi9) df9Var2).a;
                            pi9Var2.l3(false);
                            pi9Var2.p3.S(new mi9(pi9Var2, mk0Var2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(ug9Var, tre.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(ob6.M0(2131745739, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(hl.L(7.0f));
        textView.setPadding(hl.L(15.0f), 0, hl.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: bf9
            public final /* synthetic */ ff9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mk0 mk0Var;
                mk0 mk0Var2;
                byte b3 = b2;
                ff9 ff9Var = this.b;
                switch (b3) {
                    case 0:
                        df9 df9Var = ff9Var.F;
                        if (df9Var != null && (mk0Var = ff9Var.a) != null) {
                            pi9 pi9Var = ((hi9) df9Var).a;
                            pi9Var.l3(false);
                            pi9Var.p3.S(new mi9(pi9Var, mk0Var, -1), view);
                            break;
                        }
                        break;
                    default:
                        df9 df9Var2 = ff9Var.F;
                        if (df9Var2 != null && (mk0Var2 = ff9Var.a) != null) {
                            pi9 pi9Var2 = ((hi9) df9Var2).a;
                            pi9Var2.l3(false);
                            pi9Var2.p3.S(new mi9(pi9Var2, mk0Var2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, tre.e(-2, 38, 17));
        int i2 = aob.Fi;
        int v0 = aob.v0(i2, vnbVar);
        int v = aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.1f, v0));
        yob.X(textView, i2, vnbVar);
        textView.setBackground(aob.Z(v, aob.p1(0.16f, v0), hl.L(19.0f), hl.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f, float f2) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f >= iArr[0] && f <= view.getWidth() + r2) {
            if (f2 >= iArr[1] && f2 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int size;
        int i;
        ArrayList<TL_keyboard.PageButton> arrayList;
        LinearLayout linearLayout = this.w;
        linearLayout.removeAllViews();
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        mk0 mk0Var = this.a;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                size = (pageblockbuttonrow != null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
                i = 0;
                while (i < size) {
                    cf9 cf9Var = new cf9(this, getContext(), pageblockbuttonrow.buttons.get(i), i);
                    arrayList2.add(cf9Var);
                    linearLayout.addView(cf9Var, tre.t(-2, -1, 16, i == 0 ? 0 : 7, 0, 0, 0));
                    i++;
                }
                boolean z = size >= 8;
                this.s.setVisibility(size <= 0 ? 0 : 8);
                this.y.setVisibility(size != 0 ? 0 : 8);
                this.x.setVisibility((size > 0 || !z) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i = 0;
        while (i < size) {
        }
        if (size >= 8) {
        }
        this.s.setVisibility(size <= 0 ? 0 : 8);
        this.y.setVisibility(size != 0 ? 0 : 8);
        this.x.setVisibility((size > 0 || !z) ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int L2;
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = this.E;
        int size2 = arrayList.size();
        int L3 = (size2 <= 0 || size2 >= 8) ? 0 : hl.L(45.0f);
        HorizontalScrollView horizontalScrollView = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != L3) {
            layoutParams.rightMargin = L3;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - L3);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i6 = size3 - 1;
                int max2 = Math.max(0, max - (hl.L(7.0f) * i6));
                int[] iArr = new int[size3];
                int i7 = 0;
                for (int i8 = 0; i8 < size3; i8++) {
                    cf9 cf9Var = (cf9) arrayList.get(i8);
                    cf9Var.getClass();
                    int max3 = Math.max(hl.L(34.0f), cf9Var.a.h());
                    iArr[i8] = max3;
                    i7 += max3;
                }
                if (i7 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i9 = size3;
                    boolean z = true;
                    while (z && i9 > 0) {
                        int i10 = max2 / i9;
                        int i11 = i9;
                        boolean z2 = false;
                        for (int i12 = 0; i12 < size3; i12++) {
                            if (!zArr[i12] && (i5 = iArr[i12]) > i10) {
                                zArr[i12] = true;
                                max2 -= i5;
                                i11--;
                                z2 = true;
                            }
                        }
                        z = z2;
                        i9 = i11;
                    }
                    if (i9 > 0) {
                        int i13 = max2 / i9;
                        int i14 = max2 - (i9 * i13);
                        for (int i15 = 0; i15 < size3; i15++) {
                            if (!zArr[i15]) {
                                int i16 = i14 - 1;
                                iArr[i15] = (i14 > 0 ? 1 : 0) + i13;
                                i14 = i16;
                            }
                        }
                    }
                } else {
                    int i17 = 0;
                    for (int i18 = 0; i18 < size3; i18++) {
                        int i19 = iArr[i18];
                        cf9 cf9Var2 = (cf9) arrayList.get(i18);
                        cf9Var2.getClass();
                        i17 += i19 - Math.max(hl.L(34.0f), cf9Var2.a.e());
                    }
                    if (i17 <= 0) {
                        for (int i20 = 0; i20 < size3; i20++) {
                            cf9 cf9Var3 = (cf9) arrayList.get(i20);
                            cf9Var3.getClass();
                            iArr[i20] = Math.max(hl.L(34.0f), cf9Var3.a.e());
                        }
                    } else {
                        int min = Math.min(i7 - max2, i17);
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < size3) {
                            int i23 = iArr[i21];
                            cf9 cf9Var4 = (cf9) arrayList.get(i21);
                            cf9Var4.getClass();
                            int max4 = i23 - Math.max(hl.L(34.0f), cf9Var4.a.e());
                            if (i21 == i6) {
                                i4 = min - i22;
                                i3 = min;
                            } else {
                                i3 = min;
                                i4 = (int) ((min * max4) / i17);
                            }
                            int min2 = Math.min(i4, max4);
                            iArr[i21] = iArr[i21] - min2;
                            i22 += min2;
                            i21++;
                            min = i3;
                        }
                    }
                }
                for (int i24 = 0; i24 < size3; i24++) {
                    cf9 cf9Var5 = (cf9) arrayList.get(i24);
                    int i25 = iArr[i24];
                    ek9 ek9Var = cf9Var5.a;
                    ek9Var.e = Math.max(hl.L(34.0f), i25);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) cf9Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i26 = layoutParams2.width;
                        int i27 = ek9Var.e;
                        if (i26 != i27) {
                            layoutParams2.width = i27;
                            cf9Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((cf9) arrayList.get(0)).a.c();
            L2 = hl.L(8.0f);
        } else {
            L = hl.L(xea.S0 + 18);
            L2 = hl.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // snb
    public final void updateColors() {
        this.x.updateColors();
        int i = aob.Fi;
        vnb vnbVar = this.r;
        int v0 = aob.v0(i, vnbVar);
        int i2 = aob.d6;
        int v02 = aob.v0(i2, vnbVar);
        if (v0 == this.G && v02 == this.H) {
            return;
        }
        this.G = v0;
        this.H = v02;
        TextView textView = this.y;
        Drawable background = textView.getBackground();
        aob.F1(background, aob.v(v02, aob.p1(0.1f, v0)), false);
        aob.F1(background, aob.p1(0.16f, v0), true);
        textView.invalidate();
        ki7 ki7Var = this.I;
        removeCallbacks(ki7Var);
        postDelayed(ki7Var, 100L);
        try {
            if (getBackground() instanceof vg9) {
                ((vg9) getBackground()).a(aob.v0(i2, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
