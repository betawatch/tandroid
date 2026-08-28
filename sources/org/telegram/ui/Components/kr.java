package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kr extends ViewGroup {
    public static final /* synthetic */ int s = 0;
    public final ir a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final hr h;
    public boolean n;
    public final hr r;

    public kr(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        this.h = new hr(this, 0);
        this.r = new hr(this, 1);
        int i9 = 0;
        int i10 = 0;
        while (i10 < 11) {
            if (i10 != 9) {
                switch (i10) {
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
                String valueOf = String.valueOf(i10 != 10 ? i10 + 1 : 0);
                this.c[i10] = new jr(context, valueOf, str);
                this.c[i10].setOnClickListener(new s2(14, this, valueOf));
                addView(this.c[i10]);
            }
            i10++;
        }
        ir irVar = new ir(this, context, new m5.c0(context, new mh.d4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.a = irVar;
        irVar.setImageResource(R.drawable.msg_clear_input);
        irVar.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int dp = AndroidUtilities.dp(11.0f);
        irVar.setPadding(dp, dp, dp, dp);
        irVar.setOnClickListener(new fh.n(13));
        this.c[11] = irVar;
        addView(irVar);
        while (true) {
            View[] viewArr = this.c;
            if (i9 >= viewArr.length) {
                return;
            }
            View view = viewArr[i9];
            if (view != null) {
                g7.g6.b(view, 0.02f, 1.2f);
                view.setBackground(a(i9));
            }
            i9++;
        }
    }

    public static org.telegram.ui.Cells.z a(int i9) {
        boolean z10 = i9 < 3;
        int i10 = i9 % 3;
        boolean z11 = i10 == 0;
        boolean z12 = i10 == 2;
        boolean z13 = i9 > 8;
        int i11 = org.telegram.ui.ActionBar.f6.i6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 30);
        float f10 = 12.0f;
        int dp = AndroidUtilities.dp((z11 && z10) ? 24.0f : 12.0f);
        int dp2 = AndroidUtilities.dp((z12 && z10) ? 24.0f : 12.0f);
        int dp3 = AndroidUtilities.dp((z12 && z13) ? 24.0f : 12.0f);
        if (z11 && z13) {
            f10 = 24.0f;
        }
        return org.telegram.ui.ActionBar.f6.i0(dp, dp2, dp3, AndroidUtilities.dp(f10), w02, k10, k10);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int y10 = org.telegram.messenger.ll.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.ll.y(42.0f, getHeight(), 4);
        int i13 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i13 >= viewArr.length) {
                return;
            }
            int dp = AndroidUtilities.dp(6.0f) + y10;
            int dp2 = AndroidUtilities.dp(10.0f) + (dp * (i13 % 3));
            int dp3 = AndroidUtilities.dp(6.0f) + y11;
            int dp4 = AndroidUtilities.dp(10.0f) + (dp3 * (i13 / 3));
            View view = viewArr[i13];
            if (view != null) {
                view.layout(dp2, dp4, dp2 + y10, dp4 + y11);
            }
            i13++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        int y10 = org.telegram.messenger.ll.y(32.0f, getWidth(), 3);
        int y11 = org.telegram.messenger.ll.y(42.0f, getHeight(), 4);
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
