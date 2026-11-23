package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rr extends ViewGroup {
    public static final /* synthetic */ int x = 0;
    public final pr a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final or h;
    public boolean n;
    public final or r;
    public int s;
    public int w;

    public rr(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        int i7 = 0;
        this.h = new or(this, 0);
        int i10 = 1;
        this.r = new or(this, 1);
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
                this.c[i11] = new qr(context, valueOf, str);
                this.c[i11].setOnClickListener(new m8(7, this, valueOf));
                addView(this.c[i11]);
            }
            i11++;
        }
        pr prVar = new pr(this, context, new jn(context, new ki.p3(this, ViewConfiguration.get(context).getScaledTouchSlop(), i10)));
        this.a = prVar;
        prVar.setImageResource(R.drawable.msg_clear_input);
        org.telegram.ui.ActionBar.t6.s(prVar, org.telegram.ui.ActionBar.m6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        prVar.setPadding(L, L, L, L);
        prVar.setOnClickListener(new bi.o(16));
        this.c[11] = prVar;
        addView(prVar);
        while (true) {
            View[] viewArr = this.c;
            if (i7 >= viewArr.length) {
                return;
            }
            View view = viewArr[i7];
            if (view != null) {
                c8.ra.b(view, 0.02f, 1.2f);
                a(i7, view);
            }
            i7++;
        }
    }

    public static void a(int i7, View view) {
        boolean z10 = i7 < 3;
        int i10 = i7 % 3;
        boolean z11 = i10 == 0;
        boolean z12 = i10 == 2;
        boolean z13 = i7 > 8;
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 30);
        float f10 = 12.0f;
        int L = org.telegram.messenger.g0.L((z11 && z10) ? 24.0f : 12.0f);
        int L2 = org.telegram.messenger.g0.L((z12 && z10) ? 24.0f : 12.0f);
        int L3 = org.telegram.messenger.g0.L((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f10 = 24.0f;
        }
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L2, L3, org.telegram.messenger.g0.L(f10), x02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(view, k02, M, g10, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int z11 = org.telegram.messenger.o10.z(32.0f, getWidth(), 3);
        int z12 = org.telegram.messenger.o10.z(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i13 >= viewArr.length) {
                return;
            }
            int L = org.telegram.messenger.g0.L(6.0f) + z11;
            int L2 = org.telegram.messenger.g0.L(10.0f) + (L * (i13 % 3));
            int L3 = org.telegram.messenger.g0.L(6.0f) + z12;
            int L4 = org.telegram.messenger.g0.L(10.0f) + (L3 * (i13 / 3));
            View view = viewArr[i13];
            if (view != null) {
                view.layout(L2, L4, L2 + z11, L4 + z12);
            }
            i13++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int z10 = org.telegram.messenger.o10.z(32.0f, getWidth(), 3);
        int z11 = org.telegram.messenger.o10.z(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(z10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(z11, TLObject.FLAG_30));
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
