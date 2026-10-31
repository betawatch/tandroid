package bi;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.ru;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.a7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class j0 extends c0 implements org.telegram.ui.ActionBar.k6 {
    public final ArrayList D;
    public h0 E;
    public int F;
    public int G;
    public final androidx.activity.i H;
    public final int n;
    public final org.telegram.ui.ActionBar.p6 r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final g2 x;
    public final TextView y;

    public j0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = new ArrayList();
        this.H = new androidx.activity.i(this, 8);
        this.n = i10;
        this.r = p6Var;
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        final int i11 = 0;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, w7.b6.e(-1, -1, 23));
        g2 g2Var = new g2(R.drawable.msg_add, context, p6Var);
        g2Var.e = 19;
        g2Var.updateColors();
        this.x = g2Var;
        final int i12 = 1;
        g2Var.setSelected(true);
        g2Var.setContentDescription(cd.L0(2131754486, null));
        g2Var.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i11) {
                    case 0:
                        j0 j0Var = this.b;
                        h0 h0Var = j0Var.E;
                        if (h0Var != null && (aVar = j0Var.a) != null) {
                            d4 d4Var = ((v3) h0Var).a;
                            d4Var.r3(false);
                            d4Var.o3.v(new a4(d4Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        h0 h0Var2 = j0Var2.E;
                        if (h0Var2 != null && (aVar2 = j0Var2.a) != null) {
                            d4 d4Var2 = ((v3) h0Var2).a;
                            d4Var2.r3(false);
                            d4Var2.o3.v(new a4(d4Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(g2Var, w7.b6.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(cd.L0(2131746029, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(7.0f));
        textView.setPadding(org.telegram.messenger.i0.L(15.0f), 0, org.telegram.messenger.i0.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i12) {
                    case 0:
                        j0 j0Var = this.b;
                        h0 h0Var = j0Var.E;
                        if (h0Var != null && (aVar = j0Var.a) != null) {
                            d4 d4Var = ((v3) h0Var).a;
                            d4Var.r3(false);
                            d4Var.o3.v(new a4(d4Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        h0 h0Var2 = j0Var2.E;
                        if (h0Var2 != null && (aVar2 = j0Var2.a) != null) {
                            d4 d4Var2 = ((v3) h0Var2).a;
                            d4Var2.r3(false);
                            d4Var2.o3.v(new a4(d4Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, w7.b6.e(-2, 38, 17));
        int i13 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var), org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
        a7.V(textView, i13, p6Var);
        textView.setBackground(org.telegram.ui.ActionBar.t6.b0(w9, org.telegram.ui.ActionBar.t6.r1(0.16f, w02), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        a7.y(this, mutate, i13, p6Var, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f7, float f10) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f7 >= iArr[0] && f7 <= view.getWidth() + r2) {
            if (f10 >= iArr[1] && f10 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int size;
        int i10;
        ArrayList<TL_keyboard.PageButton> arrayList;
        LinearLayout linearLayout = this.w;
        linearLayout.removeAllViews();
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                size = (pageblockbuttonrow != null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
                i10 = 0;
                while (i10 < size) {
                    g0 g0Var = new g0(this, getContext(), pageblockbuttonrow.buttons.get(i10), i10);
                    arrayList2.add(g0Var);
                    linearLayout.addView(g0Var, w7.b6.t(-2, -1, 16, i10 == 0 ? 0 : 7, 0, 0, 0));
                    i10++;
                }
                boolean z10 = size >= 8;
                this.s.setVisibility(size <= 0 ? 0 : 8);
                this.y.setVisibility(size != 0 ? 0 : 8);
                this.x.setVisibility((size > 0 || !z10) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i10 = 0;
        while (i10 < size) {
        }
        if (size >= 8) {
        }
        this.s.setVisibility(size <= 0 ? 0 : 8);
        this.y.setVisibility(size != 0 ? 0 : 8);
        this.x.setVisibility((size > 0 || !z10) ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int L;
        int L2;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = this.D;
        int size2 = arrayList.size();
        int L3 = (size2 <= 0 || size2 >= 8) ? 0 : org.telegram.messenger.i0.L(45.0f);
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
                int i15 = size3 - 1;
                int max2 = Math.max(0, max - (org.telegram.messenger.i0.L(7.0f) * i15));
                int[] iArr = new int[size3];
                int i16 = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    g0 g0Var = (g0) arrayList.get(i17);
                    g0Var.getClass();
                    int max3 = Math.max(org.telegram.messenger.i0.L(34.0f), g0Var.a.h());
                    iArr[i17] = max3;
                    i16 += max3;
                }
                if (i16 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i18 = size3;
                    boolean z10 = true;
                    while (z10 && i18 > 0) {
                        int i19 = max2 / i18;
                        int i20 = i18;
                        boolean z11 = false;
                        for (int i21 = 0; i21 < size3; i21++) {
                            if (!zArr[i21] && (i14 = iArr[i21]) > i19) {
                                zArr[i21] = true;
                                max2 -= i14;
                                i20--;
                                z11 = true;
                            }
                        }
                        z10 = z11;
                        i18 = i20;
                    }
                    if (i18 > 0) {
                        int i22 = max2 / i18;
                        int i23 = max2 - (i18 * i22);
                        for (int i24 = 0; i24 < size3; i24++) {
                            if (!zArr[i24]) {
                                int i25 = i23 - 1;
                                iArr[i24] = (i23 > 0 ? 1 : 0) + i22;
                                i23 = i25;
                            }
                        }
                    }
                } else {
                    int i26 = 0;
                    for (int i27 = 0; i27 < size3; i27++) {
                        int i28 = iArr[i27];
                        g0 g0Var2 = (g0) arrayList.get(i27);
                        g0Var2.getClass();
                        i26 += i28 - Math.max(org.telegram.messenger.i0.L(34.0f), g0Var2.a.e());
                    }
                    if (i26 <= 0) {
                        for (int i29 = 0; i29 < size3; i29++) {
                            g0 g0Var3 = (g0) arrayList.get(i29);
                            g0Var3.getClass();
                            iArr[i29] = Math.max(org.telegram.messenger.i0.L(34.0f), g0Var3.a.e());
                        }
                    } else {
                        int min = Math.min(i16 - max2, i26);
                        int i30 = 0;
                        int i31 = 0;
                        while (i30 < size3) {
                            int i32 = iArr[i30];
                            g0 g0Var4 = (g0) arrayList.get(i30);
                            g0Var4.getClass();
                            int max4 = i32 - Math.max(org.telegram.messenger.i0.L(34.0f), g0Var4.a.e());
                            if (i30 == i15) {
                                i13 = min - i31;
                                i12 = min;
                            } else {
                                i12 = min;
                                i13 = (int) ((min * max4) / i26);
                            }
                            int min2 = Math.min(i13, max4);
                            iArr[i30] = iArr[i30] - min2;
                            i31 += min2;
                            i30++;
                            min = i12;
                        }
                    }
                }
                for (int i33 = 0; i33 < size3; i33++) {
                    g0 g0Var5 = (g0) arrayList.get(i33);
                    int i34 = iArr[i33];
                    ru ruVar = g0Var5.a;
                    ruVar.e = Math.max(org.telegram.messenger.i0.L(34.0f), i34);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i35 = layoutParams2.width;
                        int i36 = ruVar.e;
                        if (i35 != i36) {
                            layoutParams2.width = i36;
                            g0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((g0) arrayList.get(0)).a.c();
            L2 = org.telegram.messenger.i0.L(8.0f);
        } else {
            L = org.telegram.messenger.i0.L(tz.W0 + 18);
            L2 = org.telegram.messenger.i0.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.x.updateColors();
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        if (w02 == this.F && w03 == this.G) {
            return;
        }
        this.F = w02;
        this.G = w03;
        TextView textView = this.y;
        Drawable background = textView.getBackground();
        org.telegram.ui.ActionBar.t6.H1(background, org.telegram.ui.ActionBar.t6.w(w03, org.telegram.ui.ActionBar.t6.r1(0.1f, w02)), false);
        org.telegram.ui.ActionBar.t6.H1(background, org.telegram.ui.ActionBar.t6.r1(0.16f, w02), true);
        textView.invalidate();
        androidx.activity.i iVar = this.H;
        removeCallbacks(iVar);
        postDelayed(iVar, 100L);
        try {
            if (getBackground() instanceof h2) {
                ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
