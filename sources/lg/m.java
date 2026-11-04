package lg;

import ai.g5;
import ai.h4;
import ai.j5;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import ei.x2;
import gi.i2;
import gi.j8;
import gi.p3;
import gi.q4;
import gi.y5;
import ii.l2;
import java.util.ArrayList;
import m.r2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.is;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m extends h41 implements cs {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public boolean L;
    public x2 M;
    public b5 f;
    public j h;
    public i n;
    public v5 r;
    public l s;
    public l w;
    public TLRPC.Document y;
    public final g e = new g(this, 1);
    public boolean x = true;

    public m() {
        li mediaDataController = getMediaDataController();
        TLRPC.Document document = mediaDataController.z0;
        mediaDataController.n1();
        this.y = document;
        this.L = l0();
    }

    public static void d0(m mVar) {
        m mVar2;
        is.p().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.M != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            x2 x2Var = new x2(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.M = x2Var;
            x2Var.U3 = new hi.d(mVar2, 8);
        }
        mVar2.M.b2.i0();
        mVar2.M.y1(1, false);
        x2 x2Var2 = mVar2.M;
        x2Var2.P3 = true;
        x2Var2.W0(new q4(mVar2, 16));
        mVar2.M.e1();
        x2 x2Var3 = mVar2.M;
        x2Var3.q1 = null;
        if (mVar2.visibleDialog != null) {
            x2Var3.show();
        } else {
            mVar2.showDialog(x2Var3);
        }
    }

    public static void e0(m mVar) {
        i iVar = mVar.n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.x) {
            i iVar2 = mVar.n;
            li b02 = li.b0(mVar.currentAccount);
            TLRPC.Document document = b02.z0;
            b02.n1();
            g gVar = new g(mVar, 2);
            if (document == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.n.getImageReceiver().h1 = new mn(iVar2, gVar);
            jz f10 = t5.f(document, k6.Zc, 1.0f, null);
            if (f10 != null) {
                iVar2.n.p(ac.b(document), on.b(document), f10, document);
            } else {
                iVar2.n.l(ac.b(document), on.b(document), ac.c(w7.w(document.thumbs, 90, false, null, false), document), null, 0, document);
            }
            iVar2.n.setOnClickListener(new ln(iVar2, document, 1));
        }
    }

    public static void g0(m mVar) {
        if (mVar.h.getParent() instanceof View) {
            int top = ((View) mVar.h.getParent()).getTop();
            float i3 = Utilities.i((top + r1) / (mVar.h.getMeasuredHeight() - org.telegram.messenger.g0.L(36.0f)), 1.0f, 0.65f);
            mVar.n.setScaleX(i3);
            mVar.n.setScaleY(i3);
            mVar.n.setAlpha(Utilities.i(i3 * 2.0f, 1.0f, 0.0f));
            mVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
        arrayList.add(r31.k(this.h));
        arrayList.add(r31.u(bd.M0(2131752724, null)));
        arrayList.add(r31.k(this.s));
        arrayList.add(r31.k(this.w));
        if (this.x) {
            arrayList.add(r31.f(bd.M0(2131752720, null), bd.M0(2131752719, null), 1));
        } else if (this.E != null) {
            String M0 = bd.M0(2131752720, null);
            String str = this.E;
            r31 r31Var = new r31(3);
            r31Var.d = 1;
            r31Var.l = M0;
            r31Var.G = str;
            arrayList.add(r31Var);
        } else {
            String M02 = bd.M0(2131752720, null);
            TLRPC.Document document = this.y;
            r31 r31Var2 = new r31(3);
            r31Var2.d = 1;
            r31Var2.l = M02;
            r31Var2.G = document;
            arrayList.add(r31Var2);
        }
        arrayList.add(r31.C(bd.M0(2131752723, null)));
        boolean l02 = l0();
        this.L = !l02;
        if (!l02) {
            arrayList.add(r31.C(null));
            r31 e10 = r31.e(2, bd.M0(2131752721, null));
            e10.r = true;
            arrayList.add(e10);
        }
        r31 r31Var3 = new r31(8);
        r31Var3.l = null;
        arrayList.add(r31Var3);
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131752725, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
        int i3 = r31Var.d;
        if (i3 == 1) {
            i2 i2Var = new i2(getParentActivity(), getResourceProvider(), true, true);
            i2Var.w1 = new ai.n(25, this, view);
            int i10 = 0;
            i2Var.x1 = new g(this, i10);
            View[] viewPages = i2Var.n1.getViewPages();
            while (i10 < viewPages.length) {
                View view2 = viewPages[i10];
                if (view2 instanceof gi.y1) {
                    gi.x1 x1Var = ((gi.y1) view2).c;
                    if (x1Var.I == null) {
                        x1Var.D(null);
                    }
                }
                i10++;
            }
            showDialog(i2Var);
            return;
        }
        if (i3 == 2) {
            this.s.setText("");
            this.w.setText("");
            org.telegram.messenger.g0.v1(this.s.d);
            org.telegram.messenger.g0.v1(this.w.d);
            this.x = true;
            this.n.d("", "");
            i iVar = this.n;
            li b02 = li.b0(this.currentAccount);
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

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        getUserConfig().f();
        this.n = new i(context, this.currentAccount, this.y, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        int L = org.telegram.messenger.g0.L(16.0f);
        i iVar = this.n;
        j jVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i3 = k6.a;
        this.r = new v5(iVar, jVar2, L, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(y5.e(null, this.currentAccount, getUserConfig().e(), k6.I.q()));
        this.h.addView(kVar, mf.e(-1, -1, hs.E1));
        this.h.addView(this.n, mf.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, bd.M0(2131752718, null), getMessagesController().F5, this.resourceProvider, 0);
        this.s = lVar;
        lVar.r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.s;
        int i10 = k6.d6;
        r6.i(i10, lVar2, getResourceProvider());
        this.s.setDivider(true);
        l lVar3 = this.s;
        lVar3.getClass();
        int i11 = 4;
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(lVar3, i11);
        i3 i3Var = lVar3.d;
        int i12 = 6;
        i3Var.setImeOptions(6);
        int i13 = 2;
        i3Var.setOnEditorActionListener(new r2(fVar, i13));
        l lVar4 = new l(this, context, bd.M0(2131752722, null), getMessagesController().G5, this.resourceProvider, 1);
        this.w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        r6.i(i10, this.w, getResourceProvider());
        this.w.setDivider(true);
        l lVar5 = this.w;
        lVar5.getClass();
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(lVar5, i11);
        i3 i3Var2 = lVar5.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new r2(fVar2, i13));
        this.n.d("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 13));
        this.f = this.simpleActionBar.n(bd.M0(2131745956, null));
        j0(false);
        this.a.addOnLayoutChangeListener(new l2(this, 1));
        this.a.j(new j5(this, 23));
        h4 h4Var = this.a;
        h4Var.i3 = true;
        h4Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        n0();
        new p3(this.fragmentView, false, new j8(this, i12));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.E0) {
            n0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (this.f == null) {
            return;
        }
        this.f.a(k0(), z10);
        h4 h4Var = this.a;
        if (h4Var == null || h4Var.g3 == null || this.L == (!l0())) {
            return;
        }
        h4 h4Var2 = this.a;
        if (h4Var2 != null && h4Var2.getChildCount() > 0) {
            View view = null;
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = -1;
            for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.a.getChildAt(i11));
                View childAt = this.a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i3) {
                    i3 = childAt.getTop();
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
            h4 h4Var3 = this.a;
            h4Var3.f3.h1(i12, this.d - h4Var3.getPaddingTop());
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
        b5 b5Var = this.f;
        if (b5Var.y.f) {
            return;
        }
        b5Var.b(true);
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
                    hp messagesController = getMessagesController();
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
        getConnectionsManager().sendRequest(updatebusinessintro, new ci.d0(this, 16));
        getMessagesStorage().j2(b22, false);
    }

    public final void n0() {
        f41 f41Var;
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
                li b02 = li.b0(this.currentAccount);
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
        h4 h4Var = this.a;
        if (h4Var != null && (f41Var = h4Var.g3) != null) {
            f41Var.O(true);
        }
        this.K = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!k0()) {
            return super.onBackPressed(z10);
        }
        final int i3 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = bd.M0(2131743845, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131752717, null);
            alertDialog$Builder.k(bd.M0(2131754216, null), new org.telegram.ui.ActionBar.p1(this) { // from class: lg.h
                public final /* synthetic */ m b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                    switch (i3) {
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
            alertDialog$Builder.h(bd.M0(2131747588, null), new org.telegram.ui.ActionBar.p1(this) { // from class: lg.h
                public final /* synthetic */ m b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i102) {
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
            showDialog(s1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.E0);
        li.b0(this.currentAccount).B(0);
        li.b0(this.currentAccount).V0(0, false, true, false);
        li.b0(this.currentAccount).V0(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
