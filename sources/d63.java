// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d63 extends ViewGroup {
    public final b63 a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final a63 h;
    public boolean n;
    public final a63 r;
    public int s;
    public int w;

    public d63(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        int i = 0;
        this.h = new a63(this, (byte) 0);
        byte b = 1;
        this.r = new a63(this, (byte) 1);
        int i2 = 0;
        while (i2 < 11) {
            if (i2 != 9) {
                switch (i2) {
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
                String valueOf = String.valueOf(i2 != 10 ? i2 + 1 : 0);
                this.c[i2] = new c63(context, valueOf, str);
                this.c[i2].setOnClickListener(new rc1((Object) this, (Object) valueOf, (byte) 27));
                addView(this.c[i2]);
            }
            i2++;
        }
        b63 b63Var = new b63(this, context, new lj4(context, new b32(this, ViewConfiguration.get(context).getScaledTouchSlop(), b)));
        this.a = b63Var;
        b63Var.setImageResource(R.drawable.msg_clear_input);
        anb.s(b63Var, cmb.F6, null, PorterDuff.Mode.SRC_ATOP);
        int L = gm.L(11.0f);
        b63Var.setPadding(L, L, L, L);
        b63Var.setOnClickListener(new x10(b));
        this.c[11] = b63Var;
        addView(b63Var);
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                rve.b(view, 0.02f, 1.2f);
                a(i, view);
            }
            i++;
        }
    }

    public static void a(int i, View view) {
        boolean z = i < 3;
        int i2 = i % 3;
        boolean z2 = i2 == 0;
        boolean z3 = i2 == 2;
        boolean z4 = i > 8;
        int i3 = cmb.h6;
        int w0 = cmb.w0(null, i3, false);
        int p = on2.p(cmb.w0(null, i3, false), 30);
        float f = 12.0f;
        int L = gm.L((z2 && z) ? 24.0f : 12.0f);
        int L2 = gm.L((z3 && z) ? 24.0f : 12.0f);
        int L3 = gm.L((z3 && z4) ? 24.0f : 12.0f);
        if (z2 && z4) {
            f = 24.0f;
        }
        fg0 i0 = cmb.i0(L, L2, L3, gm.L(f), w0, p, p);
        wmb M = anb.M(i3);
        wmb g = anb.g(i3, 30);
        view.setBackground(i0);
        anb.j(view, i0, M, g, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int D = wi8.D(32.0f, getWidth(), 3);
        int D2 = wi8.D(42.0f, getHeight(), 4);
        int i5 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i5 >= viewArr.length) {
                return;
            }
            int L = gm.L(6.0f) + D;
            int L2 = gm.L(10.0f) + (L * (i5 % 3));
            int L3 = gm.L(6.0f) + D2;
            int L4 = gm.L(10.0f) + (L3 * (i5 / 3));
            View view = viewArr[i5];
            if (view != null) {
                view.layout(L2, L4, L2 + D, L4 + D2);
            }
            i5++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int D = wi8.D(32.0f, getWidth(), 3);
        int D2 = wi8.D(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(D, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(D2, TLObject.FLAG_30));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z) {
        this.e = z;
    }

    public void setEditText(EditText editText) {
        this.b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
