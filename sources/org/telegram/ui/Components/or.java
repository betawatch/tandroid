package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class or extends ViewGroup {
    public static final /* synthetic */ int s = 0;
    public final lr a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final kr h;
    public boolean n;
    public final kr r;

    public or(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        this.h = new kr(this, 0);
        this.r = new kr(this, 1);
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
                this.c[i11] = new nr(context, valueOf, str);
                this.c[i11].setOnClickListener(new t2(15, this, valueOf));
                addView(this.c[i11]);
            }
            i11++;
        }
        lr lrVar = new lr(this, context, new o4.g(context, new mr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0)));
        this.a = lrVar;
        lrVar.setImageResource(R.drawable.msg_clear_input);
        lrVar.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        lrVar.setPadding(dp, dp, dp, dp);
        lrVar.setOnClickListener(new bg.n(14));
        this.c[11] = lrVar;
        addView(lrVar);
        while (true) {
            View[] viewArr = this.c;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                i7.h6.b(view, 0.02f, 1.2f);
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
        int i12 = org.telegram.ui.ActionBar.g6.i6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 30);
        float f9 = 12.0f;
        int dp = AndroidUtilities.dp((z11 && z10) ? 24.0f : 12.0f);
        int dp2 = AndroidUtilities.dp((z12 && z10) ? 24.0f : 12.0f);
        int dp3 = AndroidUtilities.dp((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f9 = 24.0f;
        }
        return org.telegram.ui.ActionBar.g6.i0(dp, dp2, dp3, AndroidUtilities.dp(f9), w02, k9, k9);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int x4 = org.telegram.ui.b.x(32.0f, getWidth(), 3);
        int x10 = org.telegram.ui.b.x(42.0f, getHeight(), 4);
        int i14 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i14 >= viewArr.length) {
                return;
            }
            int dp = AndroidUtilities.dp(6.0f) + x4;
            int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i14 % 3));
            int dp3 = AndroidUtilities.dp(6.0f) + x10;
            int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i14 / 3));
            View view = viewArr[i14];
            if (view != null) {
                view.layout(dp2, dp4, dp2 + x4, dp4 + x10);
            }
            i14++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int x4 = org.telegram.ui.b.x(32.0f, getWidth(), 3);
        int x10 = org.telegram.ui.b.x(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(x4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x10, TLObject.FLAG_30));
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
