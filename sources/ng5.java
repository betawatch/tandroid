// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ng5 extends n9c {
    public final pcc e;
    public boolean n;
    public String r;
    public NumberTextView s;
    public s7 x;
    public z2b y;
    public ArrayList f = ptd.a(new zj3(this, 18));
    public final ArrayList h = new ArrayList();
    public final HashSet w = new HashSet();

    public ng5(ys ysVar, pcc pccVar) {
        this.e = pccVar;
    }

    @Override // n9c
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i = 5;
        int i2 = 2;
        if (TextUtils.isEmpty(this.r)) {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null) {
                int i3 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    n01 n01Var = (n01) this.f.get(size);
                    calendar.setTimeInMillis(n01Var.b);
                    int i4 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i3 != i4) {
                        arrayList.add(b8c.r(ob6.u(n01Var.b / 1000, false)));
                        i3 = i4;
                    }
                    String str = this.r;
                    int i5 = bb.b;
                    b8c K = b8c.K(bb.class);
                    K.A = 3;
                    K.r = false;
                    K.I = n01Var;
                    K.n = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i6 = 0;
            while (size2 >= 0) {
                n01 n01Var2 = (n01) arrayList3.get(size2);
                calendar.setTimeInMillis(n01Var2.b);
                int i7 = calendar.get(i) + (calendar.get(i2) * 100) + (calendar.get(1) * 10000);
                if (i6 != i7) {
                    arrayList.add(b8c.r(ob6.u(n01Var2.b / 1000, false)));
                    i6 = i7;
                }
                String str2 = this.r;
                int i8 = bb.b;
                b8c K2 = b8c.K(bb.class);
                K2.A = 3;
                K2.r = false;
                K2.I = n01Var2;
                K2.n = str2;
                arrayList.add(K2);
                size2--;
                i = 5;
                i2 = 2;
            }
            if (this.n) {
                arrayList.add(b8c.p(32));
                arrayList.add(b8c.p(32));
                arrayList.add(b8c.p(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(b8c.C(null));
    }

    @Override // n9c
    public final CharSequence Z() {
        return ob6.M0(2131742551, null);
    }

    @Override // n9c
    public final void a0(b8c b8cVar, View view) {
        if (!b8cVar.H(bb.class) || this.actionBar.z()) {
            return;
        }
        finishFragment();
        this.e.a((n01) b8cVar.I);
    }

    @Override // n9c
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override // n9c, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        a aVar = this.actionBar;
        int i = aob.d6;
        yob.h(i, getResourceProvider(), aVar);
        this.actionBar.setActionModeColor(aob.w0(null, i, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        a aVar2 = this.actionBar;
        int i2 = aob.G6;
        yob.l(aVar2, 5, i2, getResourceProvider());
        yob.l(this.actionBar, 3, aob.z8, getResourceProvider());
        yob.l(this.actionBar, 1, i2, getResourceProvider());
        yob.b(this.actionBar, i2, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 29));
        s6 q = this.actionBar.q(null);
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.s = numberTextView;
        numberTextView.setTextSize(18);
        this.s.setTypeface(hl.o());
        this.s.setTextColor(getThemedColor(aob.y8));
        this.s.setOnTouchListener(new b02((byte) 11));
        q.addView(this.s, tre.m(1.0f, 0, -1, 65, 0, 0));
        s7 b = this.actionBar.u().b(0, R.drawable.outline_header_search, getResourceProvider());
        b.N();
        b.I = new cm0(this);
        this.x = b;
        b.setSearchFieldHint(ob6.M0(2131745564, null));
        this.x.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = this.x.getSearchField();
        yob.X(searchField, i2, getResourceProvider());
        yob.D(searchField, aob.Jj, getResourceProvider());
        yob.v(searchField, i2, getResourceProvider());
        z2b z2bVar = new z2b(context, null, 1, null);
        this.y = z2bVar;
        z2bVar.d.setText(ob6.M0(TextUtils.isEmpty(this.r) ? 2131742549 : 2131742548, null));
        this.y.e.setVisibility(8);
        this.y.e(false, false);
        this.y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.y, tre.c(-1.0f, -1));
        this.a.setEmptyView(this.y);
        this.a.j(new to2(this, (byte) 20));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return hl.B(getThemedColor(aob.d6)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.setActionModeColor(aob.w0(null, aob.d6, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            NumberTextView numberTextView = this.s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.y8));
            }
            s7 s7Var = this.x;
            if (s7Var == null || s7Var.getSearchField() == null) {
                return;
            }
            this.x.getSearchField().setCursorColor(getThemedColor(aob.G6));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }
}
