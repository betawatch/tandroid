// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class eu8 extends FrameLayout implements fn7 {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final og2 G;
    public final FrameLayout H;
    public int I;
    public fu5 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public vy4 O;
    public boolean P;
    public int Q;
    public final ft8 R;
    public final fm0 S;
    public int T;
    public int U;
    public final e a;
    public final int b;
    public final long c;
    public final axa d;
    public final zwa e;
    public final vnb f;
    public final uq0 h;
    public final uic n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final c51 x;
    public byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eu8(e eVar, Context context, int i, long j, vnb vnbVar, ll0 ll0Var) {
        super(context);
        String str;
        int i2;
        String str2;
        long j2 = j;
        this.I = -1;
        cga cgaVar = (cga) this;
        this.R = new ft8(cgaVar, (byte) 0);
        this.S = new fm0(0, new it8(cgaVar), k43.h, 380L, true);
        this.U = hl.q.y;
        this.a = eVar;
        this.b = i;
        if (wf3.B(j2)) {
            TLRPC.EncryptedChat a1 = uc7.s1(i).a1(Integer.valueOf((int) (4294967295L & j2)));
            if (a1 != null) {
                j2 = a1.user_id;
                this.c = j2;
            } else {
                this.c = j2;
            }
        } else {
            this.c = j2;
        }
        long j3 = j2;
        jxa.v(i, false).M(j3);
        byte b = 1;
        axa D = jxa.v(i, false).D(j3, true);
        this.d = D;
        zwa C = jxa.v(i, false).C(j3, true);
        this.e = C;
        C.g = D;
        D.o = true;
        if ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).v1) {
            D.g = 4;
            D.e = true;
            D.k(true);
        } else if (!D.e || D.g != 783) {
            D.g = 783;
            D.e = true;
            D.k(true);
        }
        D.a();
        this.f = vnbVar;
        uq0 uq0Var = new uq0(cgaVar, context, eVar, b);
        this.h = uq0Var;
        uq0Var.setAllowDisallowInterceptTouch(true);
        uq0Var.setAdapter(new mt8(cgaVar, i, vnbVar));
        addView(uq0Var, tre.e(-1, -1, jn7.D1));
        uic l = uq0Var.l(10, true);
        this.n = l;
        l.h(aob.xi, aob.G6, aob.vi, aob.yi, aob.s8);
        l.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l.setClipToPadding(false);
        l.r = 12;
        l.setPreTabClick(new it8(cgaVar));
        l.setOnTabLongClick(new eg(cgaVar, eVar, i, context, vnbVar));
        addView(l, tre.e(-1, 42, 48));
        ir8 ir8Var = new ir8(context);
        jl0 c = ll0Var.c(ir8Var, new cl0(aob.d6, vnbVar), false);
        c.q(hl.L(8.0f));
        c.r(hl.L(22.0f));
        ir8Var.setBackground(c);
        iye.b(ir8Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = tre.e(-1, 60, 87);
        e.bottomMargin += hl.n;
        addView(frameLayout, e);
        frameLayout.addView(ir8Var, tre.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i3 = aob.i6;
        hf0 Y = aob.Y(aob.v0(i3, vnbVar), 24, 24);
        uob M = yob.M(i3);
        linearLayout.setBackground(Y);
        yob.j(linearLayout, Y, null, M, vnbVar);
        og2 og2Var = new og2(24, vnbVar, context);
        this.G = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        yob.X(textView, aob.j5, vnbVar);
        bs2.r(14.0f, 1, 2131750216, textView, null);
        linearLayout.addView(textView, tre.t(-2, -2, 16, 9, 0, 0, 0));
        ir8Var.addView(linearLayout, tre.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        iye.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new ae((Object) cgaVar, (Object) eVar, i, (byte) 13));
        Boolean bool = D.h;
        if (bool != null) {
            og2Var.a(bool.booleanValue(), false);
        }
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j3));
        boolean z = j3 < 0 || !(X1 == null || lbc.D(X1) || lbc.v(X1));
        if (!z) {
            str = null;
            i2 = 2131746395;
        } else {
            if (j3 >= 0) {
                str2 = ob6.a0(null, null, 2131746393, wf3.s(j3));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ".concat(str2));
                spannableStringBuilder.setSpan(new wm2(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ".concat(ob6.M0(2131746402, null)));
                spannableStringBuilder2.setSpan(new wm2(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                c51 c51Var = new c51(vnbVar, context, true);
                this.x = c51Var;
                c51Var.setUseWrapContent(true);
                c51Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                c51Var.setRoundRadius(hl.L(19.0f));
                c51Var.i(spannableStringBuilder, false, true);
                c51Var.setStateListAnimator(null);
                ir8Var.addView(c51Var, tre.e(-2, -1, 17));
                ir8Var.setOnClickListener(new kt8(cgaVar, z, i, (byte) 0));
                c51Var.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = (byte) 60;
                addView(frameLayout2, tre.e(-1, jn7.d3, 87));
                m();
                o();
            }
            i2 = 2131746394;
            str = null;
        }
        str2 = ob6.M0(i2, str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("G ".concat(str2));
        spannableStringBuilder3.setSpan(new wm2(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ".concat(ob6.M0(2131746402, null)));
        spannableStringBuilder22.setSpan(new wm2(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        c51 c51Var2 = new c51(vnbVar, context, true);
        this.x = c51Var2;
        c51Var2.setUseWrapContent(true);
        c51Var2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        c51Var2.setRoundRadius(hl.L(19.0f));
        c51Var2.i(spannableStringBuilder3, false, true);
        c51Var2.setStateListAnimator(null);
        ir8Var.addView(c51Var2, tre.e(-2, -1, 17));
        ir8Var.setOnClickListener(new kt8(cgaVar, z, i, (byte) 0));
        c51Var2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = (byte) 60;
        addView(frameLayout2, tre.e(-1, jn7.d3, 87));
        m();
        o();
    }

    public static void j(b8 b8Var, final axa axaVar, final Runnable runnable, final int i) {
        b8Var.setOnClickListener(new View.OnClickListener() { // from class: gt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axa axaVar2 = axa.this;
                axaVar2.getClass();
                short s = i;
                int i2 = (s & 15) != 0 ? 15 : (s & 768) != 0 ? 768 : 0;
                int flag = TLObject.setFlag(axaVar2.g & i2, s, !TLObject.hasFlag(r2, s));
                if (flag == 0) {
                    flag = i2 & (~s);
                }
                int i3 = axaVar2.g;
                int i4 = ((~i2) & i3) | flag;
                if (i3 != i4) {
                    axaVar2.g = i4;
                    axaVar2.k(true);
                }
                runnable.run();
            }
        });
        b8Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: ht8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                axa.this.g(i, true);
                runnable.run();
                return true;
            }
        });
    }

    public final void a() {
        axa axaVar;
        au8 currentPage = getCurrentPage();
        if (currentPage == null || (axaVar = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i = axaVar.d;
        new h2a(this.a, this.c, i, new i61((Object) this, i, (Object) currentPage, (byte) 3)).show();
    }

    public final boolean b() {
        zwa zwaVar = this.e;
        return zwaVar.h() && zwaVar.d().size() < uc7.s1(this.b).k4.z.f();
    }

    public final boolean c() {
        long j = this.c;
        int i = this.b;
        return j >= 0 ? j == 0 || j == yac.h(i).e() : xc2.w(5, uc7.s1(i).M0(Long.valueOf(-j)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.I3;
        LinearLayout linearLayout = this.E;
        c51 c51Var = this.x;
        long j = this.c;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == j) {
                c51Var.setVisibility(d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.y = (byte) 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.J3) {
            if (((Long) objArr[0]).longValue() == j) {
                f(true);
                o();
                return;
            }
            return;
        }
        if (i == 2) {
            c51Var.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = (byte) 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.e.d();
            int i = 0;
            while (true) {
                if (i >= d.size()) {
                    i = -1;
                    tL_starGiftCollection = null;
                    break;
                } else {
                    if (((TL_stars.TL_starGiftCollection) d.get(i)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i < 0 || tL_starGiftCollection == null) {
                return;
            }
            this.Q = 0;
            this.n.e(tL_starGiftCollection.collection_id, i + 1);
        }
    }

    public final void f(boolean z) {
        uq0 uq0Var = this.h;
        if (uq0Var == null || this.n == null) {
            return;
        }
        uq0Var.m(z);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        au8 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - qu6.x(this.y, Math.max(hl.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < hl.L(240.0f)) {
            translationY += Math.min(hl.L(240.0f) - this.U, hl.L(this.y));
        }
        return (int) (hl.L(this.y) - translationY);
    }

    public axa getCurrentList() {
        au8 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public d79 getCurrentListView() {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public au8 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (au8) currentView;
    }

    public int getGiftsCount() {
        int i;
        axa axaVar;
        int i2;
        au8 currentPage = getCurrentPage();
        axa axaVar2 = this.d;
        if (currentPage == null || (axaVar = currentPage.e) == axaVar2) {
            if (axaVar2 != null && (i = axaVar2.n) > 0) {
                return i;
            }
        } else if (axaVar != null && (i2 = axaVar.n) > 0) {
            return i2;
        }
        long j = this.c;
        int i3 = this.b;
        if (j >= 0) {
            TLRPC.UserFull Y1 = uc7.s1(i3).Y1(j);
            if (Y1 != null) {
                return Y1.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull N0 = uc7.s1(i3).N0(-j);
        if (N0 != null) {
            return N0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j = 0;
        axa axaVar = this.d;
        if (axaVar != null && !axaVar.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < axaVar.l.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) axaVar.l.get(i2)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public float getTabsHeight() {
        uq0 uq0Var = this.h;
        float f = 0.0f;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    f = (((au8) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f;
                }
            }
        }
        return f;
    }

    public float getTabsVisibility() {
        uic uicVar = this.n;
        if (uicVar != null) {
            return uicVar.getAlpha();
        }
        return 0.0f;
    }

    public final void h(pcc pccVar, String str) {
        zt5 zt5Var;
        Context context = getContext();
        Activity W = hl.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        id[] idVarArr = new id[1];
        vnb vnbVar = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        id idVar = alertDialog$Builder.a;
        if (str != null) {
            idVar.S = ob6.M0(2131750174, null);
        } else {
            idVar.S = ob6.M0(2131750054, null);
            idVar.U = ob6.M0(2131750055, null);
        }
        pt8 pt8Var = new pt8(this, context, vnbVar);
        pt8Var.s0 = true;
        pt8Var.setOnEditorActionListener(new iv0(pt8Var, pccVar, idVarArr, currentFocus, (byte) 1));
        ls6.d0(this.b).O(hl.F0(), true);
        pt8Var.setTextSize(1, 18.0f);
        yob.X(pt8Var, aob.j5, vnbVar);
        yob.l(pt8Var, 34, aob.Oi, vnbVar);
        pt8Var.setHintText(ob6.M0(2131750056, null));
        pt8Var.setFocusable(true);
        pt8Var.setInputType(147457);
        yob.F(pt8Var, aob.k6, aob.l6, aob.p7, vnbVar);
        pt8Var.setImeOptions(6);
        pt8Var.setBackgroundDrawable(null);
        pt8Var.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        pt8Var.addTextChangedListener(new wx1((View) pt8Var, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        pt8Var.setText(str);
        linearLayout.addView(pt8Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        idVar.a = hl.L(292.0f);
        alertDialog$Builder.j(ob6.M0(str != null ? 2131751300 : 2131751718, null), new m88((Object) pt8Var, (Object) pccVar, (byte) 14));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new ku7((byte) 27));
        idVarArr[0] = idVar;
        fu5 fu5Var = this.J;
        if (fu5Var != null && (zt5Var = fu5Var.m) != null) {
            zt5Var.setSoftInputMode(48);
        }
        hl.U2(W, this.a.getClassGuid());
        idVarArr[0].setOnDismissListener(new cf(this, pt8Var, W, (byte) 7));
        idVarArr[0].setOnShowListener(new ig(pt8Var, (byte) 5));
        idVarArr[0].show();
        id idVar2 = idVarArr[0];
        idVar2.k0 = false;
        idVar2.c(-1);
        pt8Var.setSelection(pt8Var.getText().length());
    }

    public final void i() {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            zwa zwaVar = this.e;
            if (i2 < zwaVar.d().size()) {
                axa e = (i2 < 0 || i2 >= zwaVar.d().size()) ? null : zwaVar.e(((TL_stars.TL_starGiftCollection) zwaVar.d().get(i2)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        z11 z11Var;
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            if (uq0Var.getCurrentPosition() == uq0Var.getNextPosition()) {
                nextPositionAlpha = k(uq0Var.getCurrentPosition()) ? 1.0f : 0.0f;
            } else {
                nextPositionAlpha = (uq0Var.getNextPositionAlpha() * (k(uq0Var.getNextPosition()) ? 1.0f : 0.0f)) + (uq0Var.getCurrentPositionAlpha() * (k(uq0Var.getCurrentPosition()) ? 1.0f : 0.0f));
            }
            FrameLayout frameLayout = this.r;
            float x = qu6.x(this.y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((hl.L(68.0f) + 2) * nextPositionAlpha) + x;
            boolean z = this.U > hl.L(184.0f);
            fm0 fm0Var = this.S;
            fm0Var.a(z, true);
            float f = fm0Var.e;
            float R1 = hl.R1(hl.L(60.0f) + x, (hl.L(16.0f) * nextPositionAlpha) + x, f);
            float f2 = (1.0f - nextPositionAlpha) * f;
            this.H.setTranslationY(hl.R1(hl.L(60.0f) + L, L, f) - hl.L(200.0f));
            frameLayout.setTranslationY(R1 - this.T);
            frameLayout.setAlpha(f2);
            frameLayout.setVisibility(f2 <= 0.0f ? 4 : 0);
            this.x.i((!this.e.h() || uq0Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
            v21 v21Var = v21.x;
            if (v21Var == null || (z11Var = v21Var.e) == null) {
                return;
            }
            z11Var.updatePosition();
        }
    }

    public final void m() {
        c51 c51Var = this.x;
        c51Var.updateColors();
        int i = aob.Fi;
        vnb vnbVar = this.f;
        int c1 = ((cga) this).W.c1(aob.v0(i, vnbVar));
        if (!(c51Var.getBackground() instanceof ShapeDrawable)) {
            c51Var.setBackground(aob.b0(hl.L(19.0f), c1));
        } else if (((ShapeDrawable) c51Var.getBackground()).getPaint().getColor() != c1) {
            aob.A1(c1, c51Var.getBackground());
            c51Var.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    au8 au8Var = (au8) view;
                    vnb vnbVar2 = au8Var.c;
                    if (au8Var.r != null) {
                        au8Var.w.setTextColor(aob.v0(aob.G6, vnbVar2));
                        au8Var.x.setTextColor(aob.v0(aob.Fi, vnbVar2));
                    } else {
                        au8Var.F.setTextColor(aob.v0(aob.G6, vnbVar2));
                        au8Var.G.setTextColor(aob.v0(aob.y6, vnbVar2));
                        au8Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(aob.v0(aob.j5, vnbVar));
    }

    public final void n() {
        byte b = 0;
        for (View view : this.h.getViewPages()) {
            if (view instanceof au8) {
                au8 au8Var = (au8) view;
                wa waVar = au8Var.f;
                int paddingTop = waVar.getPaddingTop();
                au8Var.g();
                int paddingTop2 = paddingTop - waVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    hl.J(waVar, new lt8(au8Var, paddingTop2, b));
                }
            }
        }
    }

    public final void o() {
        boolean z = !this.e.d().isEmpty() || b();
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    ((au8) view).setHasTabs(z);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.b;
        jn7.f(i).b(this, jn7.I3);
        jn7.f(i).b(this, jn7.J3);
        jn7.f(i).b(this, 2);
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        axa axaVar = this.d;
        if (axaVar != null) {
            axaVar.o = true;
            axaVar.a();
        }
        zwa zwaVar = this.e;
        if (zwaVar != null) {
            zwaVar.j = true;
            zwaVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        au8 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i = this.b;
        jn7.f(i).n(this, jn7.I3);
        jn7.f(i).n(this, jn7.J3);
        jn7.f(i).n(this, 2);
        axa axaVar = this.d;
        if (axaVar != null) {
            axaVar.o = false;
        }
        zwa zwaVar = this.e;
        if (zwaVar != null) {
            zwaVar.j = false;
        }
    }

    public final void p() {
        float f;
        uic uicVar = this.n;
        if (uicVar == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - hl.L(42.0f));
        float l = Utilities.l(hl.x1(min - this.L, -hl.L(42.0f), 0.0f));
        float R1 = hl.R1(0.9f, 1.0f, l);
        uicVar.setTranslationY(min);
        uicVar.setScaleX(R1);
        uicVar.setScaleY(R1);
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            f = 0.0f;
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    f += ((au8) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        uicVar.setAlpha(ete.a(f, 0.0f, 1.0f) * l);
    }

    public abstract void q(boolean z);

    public void setButtonOffset(int i) {
        if (this.T != i) {
            this.T = i;
            l();
        }
    }

    public void setGlassEngine(vy4 vy4Var) {
        this.O = vy4Var;
        uq0 uq0Var = this.h;
        vy4Var.c(uq0Var);
        for (View view : uq0Var.getViewPages()) {
            if (view instanceof au8) {
                vy4Var.b(((au8) view).f);
            }
        }
    }

    public void setPaddingTop(int i) {
        if (this.L != i) {
            this.L = i;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z) {
        au8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.P != z) {
            this.P = z;
            q(g());
            this.n.setReordering(z);
            if (z) {
                e S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.k3(false);
                    hl.c3(new y56(profileActivity, (byte) 28));
                }
            }
            if (z) {
                return;
            }
            ft8 ft8Var = this.R;
            hl.r(ft8Var);
            hl.c3(ft8Var);
        }
    }

    public void setVisibleHeight(int i) {
        this.U = i;
        l();
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof au8) {
                    ((au8) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
