package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class as extends ViewGroup {
    public static final /* synthetic */ int s = 0;
    public final yr a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final xr h;
    public boolean n;
    public final xr r;

    public as(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        this.h = new xr(this, 0);
        this.r = new xr(this, 1);
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
                this.c[i11] = new zr(context, valueOf, str);
                this.c[i11].setOnClickListener(new org.telegram.ui.sh(24, this, valueOf));
                addView(this.c[i11]);
            }
            i11++;
        }
        yr yrVar = new yr(this, context, new l2.h(context, new di.r4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.a = yrVar;
        yrVar.setImageResource(R.drawable.msg_clear_input);
        yrVar.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        yrVar.setPadding(dp, dp, dp, dp);
        yrVar.setOnClickListener(new bi.d5(9));
        this.c[11] = yrVar;
        addView(yrVar);
        while (true) {
            View[] viewArr = this.c;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                w7.c6.b(view, 0.02f, 1.2f);
                view.setBackground(a(i10));
            }
            i10++;
        }
    }

    public static org.telegram.ui.Cells.z a(int i10) {
        boolean z10 = i10 < 3;
        int i11 = i10 % 3;
        boolean z11 = i11 == 0;
        boolean z12 = i11 == 2;
        boolean z13 = i10 > 8;
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 30);
        float f7 = 12.0f;
        int dp = AndroidUtilities.dp((z11 && z10) ? 24.0f : 12.0f);
        int dp2 = AndroidUtilities.dp((z12 && z10) ? 24.0f : 12.0f);
        int dp3 = AndroidUtilities.dp((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f7 = 24.0f;
        }
        return org.telegram.ui.ActionBar.j6.i0(dp, dp2, dp3, AndroidUtilities.dp(f7), w02, k10, k10);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int y3 = org.telegram.messenger.em.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.em.y(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i14 >= viewArr.length) {
                return;
            }
            int dp = AndroidUtilities.dp(6.0f) + y3;
            int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
            int dp3 = AndroidUtilities.dp(6.0f) + y10;
            int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
            View view = viewArr[i14];
            if (view != null) {
                view.layout(dp2, dp4, dp2 + y3, dp4 + y10);
            }
            i14++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int y3 = org.telegram.messenger.em.y(32.0f, getWidth(), 3);
        int y10 = org.telegram.messenger.em.y(42.0f, getHeight(), 4);
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
