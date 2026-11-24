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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class az2 extends d {
    public r59 a;
    public r34 b;
    public xy2 c;
    public h42 d;
    public boolean e;
    public boolean f;
    public final boolean h;
    public boolean n;
    public zy2 r;
    public final ArrayList s;

    public az2(ArrayList arrayList, boolean z) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.s = new ArrayList(arrayList);
        }
        this.h = z;
    }

    public static vkb Z(Context context) {
        vkb vkbVar = new vkb(context);
        vkbVar.setPadding(gm.L(jb6.a0 ? 16.0f : 12.0f), 0, gm.L(jb6.a0 ? 12.0f : 16.0f), 0);
        wd wdVar = new wd();
        wdVar.b = new dw2(vkbVar, (byte) 1);
        vkbVar.addOnAttachStateChangeListener(wdVar);
        return vkbVar;
    }

    public static SpannableStringBuilder a0(wy2 wy2Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = jb6.E0(wy2Var.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new vy2((byte) 0), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) wy2Var.a);
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(jb6.M0(2131752071, null));
        anb.h(cmb.c6, null, this.actionBar);
        a aVar = this.actionBar;
        int i = cmb.F6;
        anb.l(aVar, 1, i, null);
        byte b = 3;
        anb.l(this.actionBar, 3, cmb.t8, null);
        anb.l(this.actionBar, 5, i, null);
        byte b2 = 8;
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, b2));
        r7 a = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, b2);
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.actionBar.L(cmb.w0(null, cmb.x6, false), true);
        this.actionBar.L(cmb.w0(null, i, false), false);
        this.actionBar.setSearchCursorColor(cmb.w0(null, i, false));
        this.f = false;
        this.e = false;
        xy2 xy2Var = new xy2(this, context, this.s, this.n);
        this.c = xy2Var;
        this.d = new h42(this, context, xy2Var.s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.b = r34Var;
        r34Var.c();
        this.b.setShowAtCenter(true);
        this.b.setText(jb6.M0(2131747901, null));
        r59 r59Var = new r59(context, null);
        this.a = r59Var;
        r59Var.setSectionsType(3);
        this.a.setEmptyView(this.b);
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setFastScrollEnabled(0);
        this.a.setFastScrollVisible(true);
        this.a.setLayoutManager(new u46(1, false));
        this.a.setAdapter(this.c);
        this.a.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.a.setOnItemClickListener(new u(this, (byte) 18));
        this.a.setOnScrollListener(new ip2(this, b));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        arrayList.add(new cnb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        xy2 xy2Var = this.c;
        if (xy2Var != null) {
            xy2Var.X(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.L(cmb.w0(null, cmb.x6, false), true);
                a aVar2 = this.actionBar;
                int i = cmb.F6;
                aVar2.L(cmb.w0(null, i, false), false);
                this.actionBar.setSearchCursorColor(cmb.w0(null, i, false));
            }
            r59 r59Var = this.a;
            if (r59Var != null) {
                r59Var.x1();
                if (this.a.getFastScroll() != null) {
                    this.a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
