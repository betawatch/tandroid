package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hs extends ViewGroup {
    public static final /* synthetic */ int w = 0;
    public final fs a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final es h;
    public boolean n;
    public final es r;
    public int s;
    public int v;

    public hs(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        this.h = new es(this, 0);
        this.r = new es(this, 1);
        int i10 = 0;
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
                this.c[i11] = new gs(context, valueOf, str);
                this.c[i11].setOnClickListener(new ga(9, this, valueOf));
                addView(this.c[i11]);
            }
            i11++;
        }
        fs fsVar = new fs(this, context, new jg.s0(context, new hi.l4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.a = fsVar;
        fsVar.setImageResource(R.drawable.msg_clear_input);
        org.telegram.ui.ActionBar.f7.t(fsVar, org.telegram.ui.ActionBar.y6.G6, null, PorterDuff.Mode.SRC_ATOP);
        int dp = AndroidUtilities.dp(11.0f);
        fsVar.setPadding(dp, dp, dp, dp);
        fsVar.setOnClickListener(new bh.f(12));
        this.c[11] = fsVar;
        addView(fsVar);
        while (true) {
            View[] viewArr = this.c;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                kb1.c(view, 0.02f, 1.2f);
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
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 30);
        float f7 = 12.0f;
        int dp = AndroidUtilities.dp((z11 && z10) ? 24.0f : 12.0f);
        int dp2 = AndroidUtilities.dp((z12 && z10) ? 24.0f : 12.0f);
        int dp3 = AndroidUtilities.dp((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f7 = 24.0f;
        }
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp2, dp3, AndroidUtilities.dp(f7), x02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i12, 30);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, h, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int B = org.telegram.messenger.wh.B(32.0f, getWidth(), 3);
        int B2 = org.telegram.messenger.wh.B(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i14 >= viewArr.length) {
                return;
            }
            int dp = AndroidUtilities.dp(6.0f) + B;
            int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
            int dp3 = AndroidUtilities.dp(6.0f) + B2;
            int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
            View view = viewArr[i14];
            if (view != null) {
                view.layout(dp2, dp4, dp2 + B, dp4 + B2);
            }
            i14++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int B = org.telegram.messenger.wh.B(32.0f, getWidth(), 3);
        int B2 = org.telegram.messenger.wh.B(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(B, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(B2, TLObject.FLAG_30));
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
