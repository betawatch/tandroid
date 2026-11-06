package li;

import a8.ra;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gu;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class f0 extends y implements org.telegram.ui.ActionBar.a6 {
    public final ArrayList D;
    public d0 E;
    public int F;
    public int G;
    public final ra H;
    public final int n;
    public final f6 r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final x1 x;
    public final TextView y;

    public f0(int i7, Context context, f6 f6Var) {
        super(context);
        this.D = new ArrayList();
        this.H = new ra(this, 28);
        this.n = i7;
        this.r = f6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        final int i10 = 0;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, ha.e(-1, -1, 23));
        x1 x1Var = new x1(R.drawable.msg_add, context, f6Var);
        x1Var.e = 19;
        x1Var.updateColors();
        this.x = x1Var;
        final int i11 = 1;
        x1Var.setSelected(true);
        x1Var.setContentDescription(hd.M0(2131754486, null));
        x1Var.setOnClickListener(new View.OnClickListener(this) { // from class: li.b0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i10) {
                    case 0:
                        f0 f0Var = this.b;
                        d0 d0Var = f0Var.E;
                        if (d0Var != null && (aVar = f0Var.a) != null) {
                            t3 t3Var = ((l3) d0Var).a;
                            t3Var.r3(false);
                            t3Var.o3.z(new q3(t3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        d0 d0Var2 = f0Var2.E;
                        if (d0Var2 != null && (aVar2 = f0Var2.a) != null) {
                            t3 t3Var2 = ((l3) d0Var2).a;
                            t3Var2.r3(false);
                            t3Var2.o3.z(new q3(t3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(x1Var, ha.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(hd.M0(2131746013, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(7.0f));
        textView.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: li.b0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (i11) {
                    case 0:
                        f0 f0Var = this.b;
                        d0 d0Var = f0Var.E;
                        if (d0Var != null && (aVar = f0Var.a) != null) {
                            t3 t3Var = ((l3) d0Var).a;
                            t3Var.r3(false);
                            t3Var.o3.z(new q3(t3Var, aVar, -1), view);
                            break;
                        }
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        d0 d0Var2 = f0Var2.E;
                        if (d0Var2 != null && (aVar2 = f0Var2.a) != null) {
                            t3 t3Var2 = ((l3) d0Var2).a;
                            t3Var2.r3(false);
                            t3Var2.o3.z(new q3(t3Var2, aVar2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, ha.e(-2, 38, 17));
        int i12 = k6.Ci;
        int w02 = k6.w0(i12, f6Var);
        int w10 = k6.w(k6.w0(k6.d6, f6Var), k6.r1(0.1f, w02));
        r6.V(textView, i12, f6Var);
        textView.setBackground(k6.b0(w10, k6.r1(0.16f, w02), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        r6.y(this, mutate, i12, f6Var, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f10, float f11) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f10 >= iArr[0] && f10 <= view.getWidth() + r2) {
            if (f11 >= iArr[1] && f11 <= view.getHeight() + r0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.d6));
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
    public final void h() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int size;
        int i7;
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
                i7 = 0;
                while (i7 < size) {
                    c0 c0Var = new c0(this, getContext(), pageblockbuttonrow.buttons.get(i7), i7);
                    arrayList2.add(c0Var);
                    linearLayout.addView(c0Var, ha.t(-2, -1, 16, i7 == 0 ? 0 : 7, 0, 0, 0));
                    i7++;
                }
                boolean z9 = size >= 8;
                this.s.setVisibility(size <= 0 ? 0 : 8);
                this.y.setVisibility(size != 0 ? 0 : 8);
                this.x.setVisibility((size > 0 || !z9) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i7 = 0;
        while (i7 < size) {
        }
        if (size >= 8) {
        }
        this.s.setVisibility(size <= 0 ? 0 : 8);
        this.y.setVisibility(size != 0 ? 0 : 8);
        this.x.setVisibility((size > 0 || !z9) ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        int L2;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        ArrayList arrayList = this.D;
        int size2 = arrayList.size();
        int L3 = (size2 <= 0 || size2 >= 8) ? 0 : org.telegram.messenger.g0.L(45.0f);
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
                int i14 = size3 - 1;
                int max2 = Math.max(0, max - (org.telegram.messenger.g0.L(7.0f) * i14));
                int[] iArr = new int[size3];
                int i15 = 0;
                for (int i16 = 0; i16 < size3; i16++) {
                    c0 c0Var = (c0) arrayList.get(i16);
                    c0Var.getClass();
                    int max3 = Math.max(org.telegram.messenger.g0.L(34.0f), c0Var.a.h());
                    iArr[i16] = max3;
                    i15 += max3;
                }
                if (i15 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i17 = size3;
                    boolean z9 = true;
                    while (z9 && i17 > 0) {
                        int i18 = max2 / i17;
                        int i19 = i17;
                        boolean z10 = false;
                        for (int i20 = 0; i20 < size3; i20++) {
                            if (!zArr[i20] && (i13 = iArr[i20]) > i18) {
                                zArr[i20] = true;
                                max2 -= i13;
                                i19--;
                                z10 = true;
                            }
                        }
                        z9 = z10;
                        i17 = i19;
                    }
                    if (i17 > 0) {
                        int i21 = max2 / i17;
                        int i22 = max2 - (i17 * i21);
                        for (int i23 = 0; i23 < size3; i23++) {
                            if (!zArr[i23]) {
                                int i24 = i22 - 1;
                                iArr[i23] = (i22 > 0 ? 1 : 0) + i21;
                                i22 = i24;
                            }
                        }
                    }
                } else {
                    int i25 = 0;
                    for (int i26 = 0; i26 < size3; i26++) {
                        int i27 = iArr[i26];
                        c0 c0Var2 = (c0) arrayList.get(i26);
                        c0Var2.getClass();
                        i25 += i27 - Math.max(org.telegram.messenger.g0.L(34.0f), c0Var2.a.e());
                    }
                    if (i25 <= 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            c0 c0Var3 = (c0) arrayList.get(i28);
                            c0Var3.getClass();
                            iArr[i28] = Math.max(org.telegram.messenger.g0.L(34.0f), c0Var3.a.e());
                        }
                    } else {
                        int min = Math.min(i15 - max2, i25);
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < size3) {
                            int i31 = iArr[i29];
                            c0 c0Var4 = (c0) arrayList.get(i29);
                            c0Var4.getClass();
                            int max4 = i31 - Math.max(org.telegram.messenger.g0.L(34.0f), c0Var4.a.e());
                            if (i29 == i14) {
                                i12 = min - i30;
                                i11 = min;
                            } else {
                                i11 = min;
                                i12 = (int) ((min * max4) / i25);
                            }
                            int min2 = Math.min(i12, max4);
                            iArr[i29] = iArr[i29] - min2;
                            i30 += min2;
                            i29++;
                            min = i11;
                        }
                    }
                }
                for (int i32 = 0; i32 < size3; i32++) {
                    c0 c0Var5 = (c0) arrayList.get(i32);
                    int i33 = iArr[i32];
                    gu guVar = c0Var5.a;
                    guVar.e = Math.max(org.telegram.messenger.g0.L(34.0f), i33);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i34 = layoutParams2.width;
                        int i35 = guVar.e;
                        if (i34 != i35) {
                            layoutParams2.width = i35;
                            c0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((c0) arrayList.get(0)).a.c();
            L2 = org.telegram.messenger.g0.L(8.0f);
        } else {
            L = org.telegram.messenger.g0.L(iz.W0 + 18);
            L2 = org.telegram.messenger.g0.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.x.updateColors();
        int i7 = k6.Ci;
        f6 f6Var = this.r;
        int w02 = k6.w0(i7, f6Var);
        int i10 = k6.d6;
        int w03 = k6.w0(i10, f6Var);
        if (w02 == this.F && w03 == this.G) {
            return;
        }
        this.F = w02;
        this.G = w03;
        TextView textView = this.y;
        Drawable background = textView.getBackground();
        k6.H1(background, k6.w(w03, k6.r1(0.1f, w02)), false);
        k6.H1(background, k6.r1(0.16f, w02), true);
        textView.invalidate();
        ra raVar = this.H;
        removeCallbacks(raVar);
        postDelayed(raVar, 100L);
        try {
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(k6.w0(i10, f6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
