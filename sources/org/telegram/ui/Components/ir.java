package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ir extends ViewGroup {
    public static final /* synthetic */ int x = 0;
    public final gr a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final fr h;
    public boolean n;
    public final fr r;
    public int s;
    public int w;

    public ir(Context context) {
        super(context);
        String str;
        int i7 = 12;
        this.c = new View[12];
        int i10 = 0;
        this.h = new fr(this, 0);
        int i11 = 1;
        this.r = new fr(this, 1);
        int i12 = 0;
        while (i12 < 11) {
            if (i12 != 9) {
                switch (i12) {
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
                String valueOf = String.valueOf(i12 != 10 ? i12 + 1 : 0);
                this.c[i12] = new hr(context, valueOf, str);
                this.c[i12].setOnClickListener(new n2(i7, this, valueOf));
                addView(this.c[i12]);
            }
            i12++;
        }
        gr grVar = new gr(this, context, new org.telegram.messenger.ou(context, new ki.v3(this, ViewConfiguration.get(context).getScaledTouchSlop(), i11)));
        this.a = grVar;
        grVar.setImageResource(R.drawable.msg_clear_input);
        org.telegram.ui.ActionBar.q6.s(grVar, org.telegram.ui.ActionBar.j6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int L = org.telegram.messenger.g0.L(11.0f);
        grVar.setPadding(L, L, L, L);
        grVar.setOnClickListener(new bi.o(14));
        this.c[11] = grVar;
        addView(grVar);
        while (true) {
            View[] viewArr = this.c;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                c8.na.b(view, 0.02f, 1.2f);
                a(i10, view);
            }
            i10++;
        }
    }

    public static void a(int i7, View view) {
        boolean z10 = i7 < 3;
        int i10 = i7 % 3;
        boolean z11 = i10 == 0;
        boolean z12 = i10 == 2;
        boolean z13 = i7 > 8;
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 30);
        float f10 = 12.0f;
        int L = org.telegram.messenger.g0.L((z11 && z10) ? 24.0f : 12.0f);
        int L2 = org.telegram.messenger.g0.L((z12 && z10) ? 24.0f : 12.0f);
        int L3 = org.telegram.messenger.g0.L((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f10 = 24.0f;
        }
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L2, L3, org.telegram.messenger.g0.L(f10), x02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(view, k02, M, g10, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int y10 = org.telegram.messenger.i20.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.i20.y(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i13 >= viewArr.length) {
                return;
            }
            int L = org.telegram.messenger.g0.L(6.0f) + y10;
            int L2 = org.telegram.messenger.g0.L(10.0f) + (L * (i13 % 3));
            int L3 = org.telegram.messenger.g0.L(6.0f) + y11;
            int L4 = org.telegram.messenger.g0.L(10.0f) + (L3 * (i13 / 3));
            View view = viewArr[i13];
            if (view != null) {
                view.layout(L2, L4, L2 + y10, L4 + y11);
            }
            i13++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        int y10 = org.telegram.messenger.i20.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.i20.y(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(y11, TLObject.FLAG_30));
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
