package ag;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.lt;
import vh.k4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w extends r51 implements us {
    public String D;
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public boolean K;
    public v L;
    public l5 f;
    public q h;
    public p n;
    public g6 r;
    public s s;
    public s w;
    public TLRPC.Document y;
    public final n e = new n(this, 1);
    public boolean x = true;

    public w() {
        ui mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.y0;
        mediaDataController.n1();
        this.y = document;
        this.K = k0();
    }

    public static void c0(w wVar) {
        w wVar2;
        lt.p().T = null;
        if (wVar.getParentActivity() == null) {
            return;
        }
        if (wVar.getParentActivity() == null || wVar.getParentActivity() == null || wVar.L != null) {
            wVar2 = wVar;
        } else {
            wVar2 = wVar;
            v vVar = new v(wVar2, wVar.getParentActivity(), wVar, wVar.resourceProvider, 0);
            wVar2.L = vVar;
            vVar.T3 = new za.c(wVar2, 2);
        }
        wVar2.L.a2.g0();
        wVar2.L.x1(1, false);
        v vVar2 = wVar2.L;
        vVar2.O3 = true;
        vVar2.V0(new a(wVar2, 1));
        wVar2.L.d1();
        v vVar3 = wVar2.L;
        vVar3.p1 = null;
        if (wVar2.visibleDialog != null) {
            vVar3.show();
        } else {
            wVar2.showDialog(vVar3);
        }
    }

    public static void d0(w wVar) {
        p pVar = wVar.n;
        if (pVar != null && pVar.isAttachedToWindow() && wVar.x) {
            p pVar2 = wVar.n;
            ui b02 = ui.b0(wVar.currentAccount);
            TLRPC.Document document = b02.y0;
            b02.n1();
            n nVar = new n(wVar, 2);
            if (document == null) {
                pVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = pVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            pVar2.n.getImageReceiver().g1 = new vn(pVar2, nVar);
            c00 f7 = v5.f(document, t6.Zc, 1.0f, null);
            if (f7 != null) {
                pVar2.n.p(ic.b(document), xn.b(document), f7, document);
            } else {
                pVar2.n.l(ic.b(document), xn.b(document), ic.c(b8.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            pVar2.n.setOnClickListener(new un(pVar2, document, 1));
        }
    }

    public static void f0(w wVar) {
        if (wVar.h.getParent() instanceof View) {
            int top = ((View) wVar.h.getParent()).getTop();
            float i10 = Utilities.i((top + r1) / (wVar.h.getMeasuredHeight() - org.telegram.messenger.i0.L(36.0f)), 1.0f, 0.65f);
            wVar.n.setScaleX(i10);
            wVar.n.setScaleY(i10);
            wVar.n.setAlpha(Utilities.i(i10 * 2.0f, 1.0f, 0.0f));
            wVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, p51 p51Var) {
        arrayList.add(a51.k(this.h));
        arrayList.add(a51.u(cd.L0(2131752724, null)));
        arrayList.add(a51.k(this.s));
        arrayList.add(a51.k(this.w));
        if (this.x) {
            arrayList.add(a51.f(cd.L0(2131752720, null), cd.L0(2131752719, null), 1));
        } else if (this.D != null) {
            String L0 = cd.L0(2131752720, null);
            String str = this.D;
            a51 a51Var = new a51(3);
            a51Var.d = 1;
            a51Var.l = L0;
            a51Var.G = str;
            arrayList.add(a51Var);
        } else {
            String L02 = cd.L0(2131752720, null);
            TLRPC.Document document = this.y;
            a51 a51Var2 = new a51(3);
            a51Var2.d = 1;
            a51Var2.l = L02;
            a51Var2.G = document;
            arrayList.add(a51Var2);
        }
        arrayList.add(a51.C(cd.L0(2131752723, null)));
        boolean k02 = k0();
        this.K = !k02;
        if (!k02) {
            arrayList.add(a51.C(null));
            a51 e = a51.e(2, cd.L0(2131752721, null));
            e.r = true;
            arrayList.add(e);
        }
        a51 a51Var3 = new a51(8);
        a51Var3.l = null;
        arrayList.add(a51Var3);
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return cd.L0(2131752725, null);
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(a51 a51Var, View view) {
        int i10 = a51Var.d;
        if (i10 == 1) {
            vh.u1 u1Var = new vh.u1(getParentActivity(), getResourceProvider(), true, true);
            u1Var.v1 = new m(0, this, view);
            int i11 = 0;
            u1Var.w1 = new n(this, i11);
            View[] viewPages = u1Var.m1.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof vh.l1) {
                    vh.k1 k1Var = ((vh.l1) view2).c;
                    if (k1Var.H == null) {
                        k1Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(u1Var);
            return;
        }
        if (i10 == 2) {
            this.s.setText("");
            this.w.setText("");
            org.telegram.messenger.i0.v1(this.s.d);
            org.telegram.messenger.i0.v1(this.w.d);
            this.x = true;
            this.n.d("", "");
            p pVar = this.n;
            ui b02 = ui.b0(this.currentAccount);
            TLRPC.Document document = b02.y0;
            b02.n1();
            this.y = document;
            pVar.setSticker(document);
            n nVar = this.e;
            org.telegram.messenger.i0.r(nVar);
            org.telegram.messenger.i0.h3(nVar, 5000L);
            i0(true);
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.n = new p(context, this.currentAccount, this.y, getResourceProvider());
        q qVar = new q(this, context);
        this.h = qVar;
        int i10 = 0;
        qVar.setWillNotDraw(false);
        int L = org.telegram.messenger.i0.L(16.0f);
        p pVar = this.n;
        q qVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i11 = t6.a;
        this.r = new g6(pVar, qVar2, L, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        r rVar = new r(context, i10);
        rVar.setScaleType(ImageView.ScaleType.MATRIX);
        rVar.setImageDrawable(k4.e(null, this.currentAccount, getUserConfig().e(), t6.I.q()));
        this.h.addView(rVar, b6.e(-1, -1, zs.E1));
        this.h.addView(this.n, b6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        s sVar = new s(this, context, cd.L0(2131752718, null), getMessagesController().G5, this.resourceProvider, 0);
        this.s = sVar;
        sVar.r = true;
        sVar.setShowLimitOnFocus(true);
        s sVar2 = this.s;
        int i12 = t6.d6;
        a7.i(i12, sVar2, getResourceProvider());
        this.s.setDivider(true);
        s sVar3 = this.s;
        sVar3.getClass();
        int i13 = 4;
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(sVar3, i13);
        org.telegram.ui.Cells.k3 k3Var = sVar3.d;
        k3Var.setImeOptions(6);
        int i14 = 2;
        k3Var.setOnEditorActionListener(new m.s2(fVar, i14));
        s sVar4 = new s(this, context, cd.L0(2131752722, null), getMessagesController().H5, this.resourceProvider, 1);
        this.w = sVar4;
        sVar4.setShowLimitOnFocus(true);
        a7.i(i12, this.w, getResourceProvider());
        this.w.setDivider(true);
        s sVar5 = this.w;
        sVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(sVar5, i13);
        org.telegram.ui.Cells.k3 k3Var2 = sVar5.d;
        k3Var2.setImeOptions(6);
        k3Var2.setOnEditorActionListener(new m.s2(fVar2, i14));
        this.n.d("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.f3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 1));
        this.f = this.simpleActionBar.n(cd.L0(2131745963, null));
        i0(false);
        this.a.addOnLayoutChangeListener(new t(this, i10));
        this.a.j(new u(this, i10));
        ii iiVar = this.a;
        iiVar.h3 = true;
        iiVar.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        m0();
        new vh.r2(this.fragmentView, false, new l(this, i10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.E0) {
            m0();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void i0(boolean z10) {
        if (this.f == null) {
            return;
        }
        this.f.a(j0(), z10);
        ii iiVar = this.a;
        if (iiVar == null || iiVar.f3 == null || this.K == (!k0())) {
            return;
        }
        ii iiVar2 = this.a;
        if (iiVar2 != null && iiVar2.getChildCount() > 0) {
            View view = null;
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = -1;
            for (int i12 = 0; i12 < this.a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.a.getChildAt(i12));
                View childAt = this.a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.c = i11;
                int top = view.getTop();
                this.d = top;
                if (this.c == 0 && top > org.telegram.messenger.i0.L(88.0f)) {
                    this.d = org.telegram.messenger.i0.L(88.0f);
                }
                this.a.e3.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.f3.O(true);
        int i13 = this.c;
        if (i13 >= 0) {
            ii iiVar3 = this.a;
            iiVar3.e3.h1(i13, this.d - iiVar3.getPaddingTop());
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0() {
        TLRPC.Document document;
        String charSequence = this.s.getText().toString();
        String str = this.G;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(charSequence, str)) {
            return true;
        }
        String charSequence2 = this.w.getText().toString();
        String str2 = this.H;
        if (!TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z10 = this.x;
        if (((z10 || (document = this.y) == null) ? 0L : document.id) == this.I) {
            return (z10 || this.E == null) ? false : true;
        }
        return true;
    }

    public final boolean k0() {
        s sVar = this.s;
        if (sVar == null || this.w == null) {
            return true;
        }
        return TextUtils.isEmpty(sVar.getText()) && TextUtils.isEmpty(this.w.getText()) && this.x;
    }

    public final void l0() {
        TLRPC.Document document;
        l5 l5Var = this.f;
        if (l5Var.y.f) {
            return;
        }
        l5Var.b(true);
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!k0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.s.getText().toString();
            updatebusinessintro.intro.description = this.w.getText().toString();
            if (!this.x && (this.y != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    vp messagesController = getMessagesController();
                    TLRPC.Document document2 = this.y;
                    messagesController.getClass();
                    if (document2 != null) {
                        tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.id = document2.id;
                        tL_inputDocument.access_hash = document2.access_hash;
                        byte[] bArr = document2.file_reference;
                        tL_inputDocument.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputDocument.file_reference = new byte[0];
                        }
                    }
                    tL_inputBusinessIntro2.sticker = tL_inputDocument;
                }
            }
            if (a2 != null) {
                a2.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                a2.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.x && (document = this.y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (a2 != null) {
            a2.flags2 &= -17;
            a2.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new c(this, 2));
        getMessagesStorage().j2(a2, false);
    }

    public final void m0() {
        p51 p51Var;
        if (this.J) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = a2.business_intro;
        if (tL_businessIntro != null) {
            s sVar = this.s;
            String str = tL_businessIntro.title;
            this.G = str;
            sVar.setText(str);
            s sVar2 = this.w;
            String str2 = a2.business_intro.description;
            this.H = str2;
            sVar2.setText(str2);
            this.y = a2.business_intro.sticker;
        } else {
            s sVar3 = this.s;
            this.G = "";
            sVar3.setText("");
            s sVar4 = this.w;
            this.H = "";
            sVar4.setText("");
            this.E = null;
            this.y = null;
        }
        TLRPC.Document document = this.y;
        this.I = document == null ? 0L : document.id;
        this.x = document == null;
        p pVar = this.n;
        if (pVar != null) {
            pVar.d(this.s.getText().toString(), this.w.getText().toString());
            p pVar2 = this.n;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                ui b02 = ui.b0(this.currentAccount);
                TLRPC.Document document3 = b02.y0;
                b02.n1();
                document2 = document3;
            }
            pVar2.setSticker(document2);
        }
        if (this.x) {
            n nVar = this.e;
            org.telegram.messenger.i0.r(nVar);
            org.telegram.messenger.i0.h3(nVar, 5000L);
        }
        ii iiVar = this.a;
        if (iiVar != null && (p51Var = iiVar.f3) != null) {
            p51Var.O(true);
        }
        this.J = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!j0()) {
            return super.onBackPressed(z10);
        }
        final int i10 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = cd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131752717, null);
            alertDialog$Builder.k(cd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) { // from class: ag.o
                public final /* synthetic */ w b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.l0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.h(cd.L0(2131747596, null), new org.telegram.ui.ActionBar.u1(this) { // from class: ag.o
                public final /* synthetic */ w b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.l0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            showDialog(x1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.E0);
        ui.b0(this.currentAccount).B(0);
        ui.b0(this.currentAccount).V0(0, false, true, false);
        ui.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
