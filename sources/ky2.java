// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ky2 extends e {
    public d79 a;
    public b34 b;
    public hy2 c;
    public m32 d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public jy2 r;
    public final ArrayList s;

    public ky2(ArrayList arrayList, boolean z) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z;
    }

    public static qmb Y(Context context) {
        qmb qmbVar = new qmb(context);
        qmbVar.setPadding(hl.L(ob6.a0 ? 16.0f : 12.0f), 0, hl.L(ob6.a0 ? 12.0f : 16.0f), 0);
        xc xcVar = new xc();
        xcVar.b = new nv2(qmbVar, (byte) 1);
        qmbVar.addOnAttachStateChangeListener(xcVar);
        return qmbVar;
    }

    public static SpannableStringBuilder Z(gy2 gy2Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = ob6.E0(gy2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new fy2((byte) 0), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) gy2Var.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(ob6.M0(2131752099, null));
        yob.h(aob.d6, null, this.actionBar);
        a aVar = this.actionBar;
        int i = aob.G6;
        yob.l(aVar, 1, i, null);
        yob.l(this.actionBar, 3, aob.u8, null);
        yob.l(this.actionBar, 5, i, null);
        byte b = 8;
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, b));
        s7 a = this.actionBar.u().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new r10(this, b);
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        this.actionBar.L(aob.w0(null, aob.y6, false), true);
        this.actionBar.L(aob.w0(null, i, false), false);
        this.actionBar.setSearchCursorColor(aob.w0(null, i, false));
        this.f = false;
        this.e = false;
        hy2 hy2Var = new hy2(this, context, this.s, this.n);
        this.c = hy2Var;
        this.d = new m32(this, context, hy2Var.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.b = b34Var;
        b34Var.c();
        this.b.setShowAtCenter(true);
        this.b.setText(ob6.M0(2131747898, null));
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new x46(1, false));
        this.a.setAdapter(this.c);
        byte b2 = 2;
        this.a.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.a.setOnItemClickListener(new u(this, (byte) 17));
        this.a.setOnScrollListener(new to2(this, b2));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D8));
        arrayList.add(new apb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        hy2 hy2Var = this.c;
        if (hy2Var != null) {
            hy2Var.X(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.L(aob.w0(null, aob.y6, false), true);
                a aVar2 = this.actionBar;
                int i = aob.G6;
                aVar2.L(aob.w0(null, i, false), false);
                this.actionBar.setSearchCursorColor(aob.w0(null, i, false));
            }
            d79 d79Var = this.a;
            if (d79Var != null) {
                d79Var.y1();
                if (this.a.getFastScroll() != null) {
                    this.a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
