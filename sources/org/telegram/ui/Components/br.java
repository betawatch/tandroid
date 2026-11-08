package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class br extends ViewGroup {
    public static final /* synthetic */ int x = 0;
    public final zq a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final yq h;
    public boolean n;
    public final yq r;
    public int s;
    public int w;

    public br(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        int i7 = 0;
        this.h = new yq(this, 0);
        int i10 = 1;
        this.r = new yq(this, 1);
        int i11 = 0;
        while (true) {
            int i12 = 11;
            if (i11 < 11) {
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
                    this.c[i11] = new ar(context, valueOf, str);
                    this.c[i11].setOnClickListener(new lk(5, this, valueOf));
                    addView(this.c[i11]);
                }
                i11++;
            } else {
                zq zqVar = new zq(this, context, new vy(context, new hi.z3(this, ViewConfiguration.get(context).getScaledTouchSlop(), i10)));
                this.a = zqVar;
                zqVar.setImageResource(R.drawable.msg_clear_input);
                org.telegram.ui.ActionBar.r6.t(zqVar, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.SRC_ATOP);
                int L = org.telegram.messenger.g0.L(11.0f);
                zqVar.setPadding(L, L, L, L);
                zqVar.setOnClickListener(new bi.l1(i12));
                this.c[11] = zqVar;
                addView(zqVar);
                while (true) {
                    View[] viewArr = this.c;
                    if (i7 >= viewArr.length) {
                        return;
                    }
                    View view = viewArr[i7];
                    if (view != null) {
                        c8.ka.b(view, 0.02f, 1.2f);
                        a(i7, view);
                    }
                    i7++;
                }
            }
        }
    }

    public static void a(int i7, View view) {
        boolean z9 = i7 < 3;
        int i10 = i7 % 3;
        boolean z10 = i10 == 0;
        boolean z11 = i10 == 2;
        boolean z12 = i7 > 8;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 30);
        float f10 = 12.0f;
        int L = org.telegram.messenger.g0.L((z10 && z9) ? 24.0f : 12.0f);
        int L2 = org.telegram.messenger.g0.L((z11 && z9) ? 24.0f : 12.0f);
        int L3 = org.telegram.messenger.g0.L((z11 && z12) ? 24.0f : 12.0f);
        if (z10 && z12) {
            f10 = 24.0f;
        }
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L2, L3, org.telegram.messenger.g0.L(f10), x02, o4, o4);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 30);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, h, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int y10 = org.telegram.messenger.camera.q.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.camera.q.y(42.0f, getHeight(), 4);
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
        int y10 = org.telegram.messenger.camera.q.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.camera.q.y(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(y10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(y11, TLObject.FLAG_30));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z9) {
        this.e = z9;
    }

    public void setEditText(EditText editText) {
        this.b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
