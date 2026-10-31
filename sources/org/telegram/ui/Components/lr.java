package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lr extends ViewGroup {
    public static final /* synthetic */ int x = 0;
    public final ir a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final hr h;
    public boolean n;
    public final hr r;
    public int s;
    public int w;

    public lr(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        int i10 = 0;
        this.h = new hr(this, 0);
        this.r = new hr(this, 1);
        int i11 = 0;
        while (i11 < 11) {
            if (i11 != 9) {
                switch (i11) {
                    case 1:
                        str = "ABC";
                        break;
                    case 2:
                        str = "DEF";
                        break;
                    case 3:
                        str = "GHI";
                        break;
                    case 4:
                        str = "JKL";
                        break;
                    case 5:
                        str = "MNO";
                        break;
                    case 6:
                        str = "PQRS";
                        break;
                    case 7:
                        str = "TUV";
                        break;
                    case 8:
                        str = "WXYZ";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "+";
                        break;
                }
                String valueOf = String.valueOf(i11 != 10 ? i11 + 1 : 0);
                this.c[i11] = new kr(context, valueOf, str);
                this.c[i11].setOnClickListener(new org.telegram.ui.ud(28, this, valueOf));
                addView(this.c[i11]);
            }
            i11++;
        }
        ir irVar = new ir(this, context, new m2.t(context, new jr(this, ViewConfiguration.get(context).getScaledTouchSlop(), i10)));
        this.a = irVar;
        irVar.setImageResource(R.drawable.msg_clear_input);
        org.telegram.ui.ActionBar.a7.t(irVar, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.i0.L(11.0f);
        irVar.setPadding(L, L, L, L);
        irVar.setOnClickListener(new bh.c(7));
        this.c[11] = irVar;
        addView(irVar);
        while (true) {
            View[] viewArr = this.c;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                w7.e6.b(view, 0.02f, 1.2f);
                a(i10, view);
            }
            i10++;
        }
    }

    public static void a(int i10, View view) {
        boolean z10 = i10 < 3;
        int i11 = i10 % 3;
        boolean z11 = i11 == 0;
        boolean z12 = i11 == 2;
        boolean z13 = i10 > 8;
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 30);
        float f7 = 12.0f;
        int L = org.telegram.messenger.i0.L((z11 && z10) ? 24.0f : 12.0f);
        int L2 = org.telegram.messenger.i0.L((z12 && z10) ? 24.0f : 12.0f);
        int L3 = org.telegram.messenger.i0.L((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f7 = 24.0f;
        }
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L2, L3, org.telegram.messenger.i0.L(f7), x02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(view, k02, N, h, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int y3 = org.telegram.messenger.z20.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.z20.y(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i14 >= viewArr.length) {
                return;
            }
            int L = org.telegram.messenger.i0.L(6.0f) + y3;
            int L2 = org.telegram.messenger.i0.L(10.0f) + (L * (i14 % 3));
            int L3 = org.telegram.messenger.i0.L(6.0f) + y10;
            int L4 = org.telegram.messenger.i0.L(10.0f) + (L3 * (i14 / 3));
            View view = viewArr[i14];
            if (view != null) {
                view.layout(L2, L4, L2 + y3, L4 + y10);
            }
            i14++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int y3 = org.telegram.messenger.z20.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.z20.y(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(y10, TLObject.FLAG_30));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z10) {
        this.e = z10;
    }

    public void setEditText(EditText editText) {
        this.b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
