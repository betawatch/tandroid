package kg;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi.v3;
import bi.x4;
import c8.ja;
import fi.p2;
import hi.g7;
import hi.i2;
import hi.p3;
import hi.q4;
import hi.x5;
import java.util.ArrayList;
import m.r2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n extends r41 implements is {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public p2 M;
    public z4 f;
    public j h;
    public i n;
    public v5 r;
    public l s;
    public l w;
    public TLRPC.Document y;
    public final g e = new g(this, 1);
    public boolean x = true;

    public n() {
        si mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.z0;
        mediaDataController.n1();
        this.y = document;
        this.L = l0();
    }

    public static void d0(n nVar) {
        n nVar2;
        ns.p().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.M != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            p2 p2Var = new p2(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.M = p2Var;
            p2Var.X3 = new hi.l0(nVar2, 6);
        }
        nVar2.M.e2.i0();
        nVar2.M.y1(1, false);
        p2 p2Var2 = nVar2.M;
        p2Var2.S3 = true;
        p2Var2.W0(new q4(nVar2, 8));
        nVar2.M.e1();
        p2 p2Var3 = nVar2.M;
        p2Var3.t1 = null;
        if (nVar2.visibleDialog != null) {
            p2Var3.show();
        } else {
            nVar2.showDialog(p2Var3);
        }
    }

    public static void e0(n nVar) {
        i iVar = nVar.n;
        if (iVar != null && iVar.isAttachedToWindow() && nVar.x) {
            i iVar2 = nVar.n;
            si b02 = si.b0(nVar.currentAccount);
            TLRPC.Document document = b02.z0;
            b02.n1();
            g gVar = new g(nVar, 2);
            if (document == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.n.getImageReceiver().h1 = new vn(iVar2, gVar);
            pz f10 = t5.f(document, j6.cd, 1.0f, null);
            if (f10 != null) {
                iVar2.n.p(gc.b(document), xn.b(document), f10, document);
            } else {
                iVar2.n.l(gc.b(document), xn.b(document), gc.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.n.setOnClickListener(new un(iVar2, document, 1));
        }
    }

    public static void g0(n nVar) {
        if (nVar.h.getParent() instanceof View) {
            int top = ((View) nVar.h.getParent()).getTop();
            float i7 = Utilities.i((top + r1) / (nVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f)), 1.0f, 0.65f);
            nVar.n.setScaleX(i7);
            nVar.n.setScaleY(i7);
            nVar.n.setAlpha(Utilities.i(i7 * 2.0f, 1.0f, 0.0f));
            nVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
        arrayList.add(b41.k(this.h));
        arrayList.add(b41.u(hd.M0(2131752724, null)));
        arrayList.add(b41.k(this.s));
        arrayList.add(b41.k(this.w));
        if (this.x) {
            arrayList.add(b41.f(hd.M0(2131752720, null), hd.M0(2131752719, null), 1));
        } else if (this.E != null) {
            String M0 = hd.M0(2131752720, null);
            String str = this.E;
            b41 b41Var = new b41(3);
            b41Var.d = 1;
            b41Var.l = M0;
            b41Var.G = str;
            arrayList.add(b41Var);
        } else {
            String M02 = hd.M0(2131752720, null);
            TLRPC.Document document = this.y;
            b41 b41Var2 = new b41(3);
            b41Var2.d = 1;
            b41Var2.l = M02;
            b41Var2.G = document;
            arrayList.add(b41Var2);
        }
        arrayList.add(b41.C(hd.M0(2131752723, null)));
        boolean l02 = l0();
        this.L = !l02;
        if (!l02) {
            arrayList.add(b41.C(null));
            b41 e10 = b41.e(2, hd.M0(2131752721, null));
            e10.r = true;
            arrayList.add(e10);
        }
        b41 b41Var3 = new b41(8);
        b41Var3.l = null;
        arrayList.add(b41Var3);
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131752725, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
        int i7 = b41Var.d;
        if (i7 == 1) {
            i2 i2Var = new i2(getParentActivity(), getResourceProvider(), true, true);
            i2Var.z1 = new ab.g(23, this, view);
            int i10 = 0;
            i2Var.A1 = new g(this, i10);
            View[] viewPages = i2Var.q1.getViewPages();
            while (i10 < viewPages.length) {
                View view2 = viewPages[i10];
                if (view2 instanceof hi.y1) {
                    hi.x1 x1Var = ((hi.y1) view2).c;
                    if (x1Var.I == null) {
                        x1Var.D(null);
                    }
                }
                i10++;
            }
            showDialog(i2Var);
            return;
        }
        if (i7 == 2) {
            this.s.setText("");
            this.w.setText("");
            org.telegram.messenger.g0.v1(this.s.d);
            org.telegram.messenger.g0.v1(this.w.d);
            this.x = true;
            this.n.d("", "");
            i iVar = this.n;
            si b02 = si.b0(this.currentAccount);
            TLRPC.Document document = b02.z0;
            b02.n1();
            this.y = document;
            iVar.setSticker(document);
            g gVar = this.e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
            j0(true);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.n = new i(context, this.currentAccount, this.y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        int i7 = 0;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i10 = j6.a;
        this.r = new v5(iVar, jVar2, L, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, i7);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(x5.e(null, this.currentAccount, getUserConfig().e(), j6.I.q()));
        this.h.addView(kVar, ja.e(-1, -1, org.telegram.messenger.ns.E1));
        this.h.addView(this.n, ja.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, hd.M0(2131752718, null), getMessagesController().G5, this.resourceProvider, 0);
        this.s = lVar;
        lVar.r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.s;
        int i11 = j6.d6;
        q6.h(i11, lVar2, getResourceProvider());
        this.s.setDivider(true);
        l lVar3 = this.s;
        lVar3.getClass();
        int i12 = 5;
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, i12);
        i3 i3Var = lVar3.d;
        int i13 = 6;
        i3Var.setImeOptions(6);
        int i14 = 2;
        i3Var.setOnEditorActionListener(new r2(fVar, i14));
        l lVar4 = new l(this, context, hd.M0(2131752722, null), getMessagesController().H5, this.resourceProvider, 1);
        this.w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        q6.h(i11, this.w, getResourceProvider());
        this.w.setDivider(true);
        l lVar5 = this.w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, i12);
        i3 i3Var2 = lVar5.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new r2(fVar2, i14));
        this.n.d("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, i12));
        this.f = this.simpleActionBar.q(hd.M0(2131745946, null));
        j0(false);
        this.a.addOnLayoutChangeListener(new m(this, i7));
        this.a.j(new bi.z4(this, 17));
        v3 v3Var = this.a;
        v3Var.i3 = true;
        v3Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new p3(this.fragmentView, false, new g7(this, i13));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.E0) {
            n0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f == null) {
            return;
        }
        this.f.a(k0(), z10);
        v3 v3Var = this.a;
        if (v3Var == null || v3Var.g3 == null || this.L == (!l0())) {
            return;
        }
        v3 v3Var2 = this.a;
        if (v3Var2 != null && v3Var2.getChildCount() > 0) {
            View view = null;
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = -1;
            for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.a.getChildAt(i11));
                View childAt = this.a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i7) {
                    i7 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.c = i10;
                int top = view.getTop();
                this.d = top;
                if (this.c == 0 && top > org.telegram.messenger.g0.L(88.0f)) {
                    this.d = org.telegram.messenger.g0.L(88.0f);
                }
                this.a.f3.h1(i10, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.g3.O(true);
        int i12 = this.c;
        if (i12 >= 0) {
            v3 v3Var3 = this.a;
            v3Var3.f3.h1(i12, this.d - v3Var3.getPaddingTop());
        }
    }

    public final boolean k0() {
        TLRPC.Document document;
        String charSequence = this.s.getText().toString();
        String str = this.H;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(charSequence, str)) {
            return true;
        }
        String charSequence2 = this.w.getText().toString();
        String str2 = this.I;
        if (!TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z10 = this.x;
        if (((z10 || (document = this.y) == null) ? 0L : document.id) == this.J) {
            return (z10 || this.F == null) ? false : true;
        }
        return true;
    }

    public final boolean l0() {
        l lVar = this.s;
        if (lVar == null || this.w == null) {
            return true;
        }
        return TextUtils.isEmpty(lVar.getText()) && TextUtils.isEmpty(this.w.getText()) && this.x;
    }

    public final void m0() {
        TLRPC.Document document;
        z4 z4Var = this.f;
        if (z4Var.y.f) {
            return;
        }
        z4Var.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        TLRPC.TL_inputDocument tL_inputDocument = null;
        if (!l0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.s.getText().toString();
            updatebusinessintro.intro.description = this.w.getText().toString();
            if (!this.x && (this.y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    np messagesController = getMessagesController();
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
            if (b22 != null) {
                b22.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                b22.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.x && (document = this.y) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -17;
            b22.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ai.e1(this, 16));
        getMessagesStorage().j2(b22, false);
    }

    public final void n0() {
        p41 p41Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = b22.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.s;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.w;
            String str2 = b22.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.y = b22.business_intro.sticker;
        } else {
            l lVar3 = this.s;
            this.H = "";
            lVar3.setText("");
            l lVar4 = this.w;
            this.I = "";
            lVar4.setText("");
            this.F = null;
            this.y = null;
        }
        TLRPC.Document document = this.y;
        this.J = document == null ? 0L : document.id;
        this.x = document == null;
        i iVar = this.n;
        if (iVar != null) {
            iVar.d(this.s.getText().toString(), this.w.getText().toString());
            i iVar2 = this.n;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                si b02 = si.b0(this.currentAccount);
                TLRPC.Document document3 = b02.z0;
                b02.n1();
                document2 = document3;
            }
            iVar2.setSticker(document2);
        }
        if (this.x) {
            g gVar = this.e;
            org.telegram.messenger.g0.r(gVar);
            org.telegram.messenger.g0.i3(gVar, 5000L);
        }
        v3 v3Var = this.a;
        if (v3Var != null && (p41Var = v3Var.g3) != null) {
            p41Var.O(true);
        }
        this.K = true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (!k0()) {
            return super.onBackPressed(z10);
        }
        final int i7 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = hd.M0(2131743835, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = hd.M0(2131752717, null);
            alertDialog$Builder.k(hd.M0(2131754216, null), new org.telegram.ui.ActionBar.q1(this) { // from class: kg.h
                public final /* synthetic */ n b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (i7) {
                        case 0:
                            this.b.m0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i10 = 1;
            alertDialog$Builder.h(hd.M0(2131747580, null), new org.telegram.ui.ActionBar.q1(this) { // from class: kg.h
                public final /* synthetic */ n b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.m0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
        si.b0(this.currentAccount).B(0);
        si.b0(this.currentAccount).V0(0, false, true, false);
        si.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
