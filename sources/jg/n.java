package jg;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import di.a3;
import fi.l2;
import fi.o6;
import fi.z3;
import hi.x2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vo;
import org.telegram.ui.ht;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public a3 L;
    public u5 f;
    public k h;
    public j n;
    public l6 r;
    public m s;
    public m v;
    public String y;
    public final g e = new g(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean K = h0();

    public static void Z(n nVar) {
        n nVar2;
        ht.o().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            a3 a3Var = new a3(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = a3Var;
            a3Var.c2 = new i(nVar2);
        }
        nVar2.L.j0.g0();
        nVar2.L.R1(1, false);
        a3 a3Var2 = nVar2.L;
        a3Var2.X1 = true;
        a3Var2.o1(new hi.e2(nVar2, 6));
        nVar2.L.w1();
        a3 a3Var3 = nVar2.L;
        a3Var3.r = null;
        if (nVar2.visibleDialog != null) {
            a3Var3.show();
        } else {
            nVar2.showDialog(a3Var3);
        }
    }

    public static void a0(n nVar) {
        j jVar = nVar.n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.w) {
            j jVar2 = nVar.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(nVar.currentAccount).getGreetingsSticker();
            g gVar = new g(nVar, 2);
            if (greetingsSticker == null) {
                jVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = jVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jVar2.n.getImageReceiver().setDelegate(new to(jVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, y6.lc, 1.0f);
            if (svgThumb != null) {
                jVar2.n.n(ImageLocation.getForDocument(greetingsSticker), vo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.n.j(ImageLocation.getForDocument(greetingsSticker), vo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.n.setOnClickListener(new ro(jVar2, greetingsSticker, 1));
        }
    }

    public static void c0(n nVar) {
        if (nVar.h.getParent() instanceof View) {
            int top = ((View) nVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            nVar.n.setScaleX(clamp);
            nVar.n.setScaleY(clamp);
            nVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            nVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void V(ArrayList arrayList, k71 k71Var) {
        arrayList.add(u61.k(this.h));
        ic.a.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(u61.k(this.s));
        arrayList.add(u61.k(this.v));
        if (this.w) {
            arrayList.add(u61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            u61 u61Var = new u61(3);
            u61Var.d = 1;
            u61Var.l = string;
            u61Var.G = str;
            arrayList.add(u61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            u61 u61Var2 = new u61(3);
            u61Var2.d = 1;
            u61Var2.l = string2;
            u61Var2.G = document;
            arrayList.add(u61Var2);
        }
        arrayList.add(u61.C(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean h02 = h0();
        this.K = !h02;
        if (!h02) {
            arrayList.add(u61.C(null));
            u61 e = u61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.r = true;
            arrayList.add(e);
        }
        u61 u61Var3 = new u61(8);
        u61Var3.l = null;
        arrayList.add(u61Var3);
    }

    @Override // org.telegram.ui.Components.n71
    public final CharSequence W() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.n71
    public final void X(u61 u61Var, View view) {
        int i10 = u61Var.d;
        if (i10 == 1) {
            l2 l2Var = new l2(getParentActivity(), getResourceProvider(), true, true);
            l2Var.E = new ai.f0(21, this, view);
            int i11 = 0;
            l2Var.F = new g(this, i11);
            View[] viewPages = l2Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof fi.z1) {
                    fi.y1 y1Var = ((fi.z1) view2).c;
                    if (y1Var.H == null) {
                        y1Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(l2Var);
            return;
        }
        if (i10 == 2) {
            this.s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.s.d);
            AndroidUtilities.hideKeyboard(this.v.d);
            this.w = true;
            this.n.d("", "");
            j jVar = this.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            f0(true);
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean Y(u61 u61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new j(context, this.currentAccount, this.x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        int dp = AndroidUtilities.dp(16.0f);
        j jVar = this.n;
        k kVar2 = this.h;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i10 = y6.a;
        this.r = new l6(jVar, kVar2, dp, themedPaint);
        this.n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(o6.e(null, this.currentAccount, getUserConfig().getClientUserId(), y6.I.q()));
        this.h.addView(lVar, kb1.i(-1, -1, 119));
        this.h.addView(this.n, kb1.h(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = mVar;
        mVar.r = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.s;
        int i11 = y6.d6;
        f7.i(i11, mVar2, getResourceProvider());
        this.s.setDivider(true);
        m mVar3 = this.s;
        mVar3.getClass();
        int i12 = 4;
        mVar3.d(new org.telegram.ui.Cells.g(mVar3, i12));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        f7.i(i11, this.v, getResourceProvider());
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        mVar5.d(new org.telegram.ui.Cells.g(mVar5, i12));
        this.n.d("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.u1();
        this.a.setSectionsDrawBackground(true);
        this.a.g3.r = false;
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 12));
        this.f = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        f0(false);
        this.a.addOnLayoutChangeListener(new x2(this, 1));
        this.a.j(new ai.b(this, 17));
        m71 m71Var = this.a;
        m71Var.i3 = true;
        m71Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        j0();
        new z3(this.fragmentView, false, new ig.o(this, 2));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            j0();
        }
    }

    public final void f0(boolean z10) {
        if (this.f == null) {
            return;
        }
        this.f.a(g0(), z10);
        m71 m71Var = this.a;
        if (m71Var == null || m71Var.g3 == null || this.K == (!h0())) {
            return;
        }
        m71 m71Var2 = this.a;
        if (m71Var2 != null && m71Var2.getChildCount() > 0) {
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
                if (this.c == 0 && top > AndroidUtilities.dp(88.0f)) {
                    this.d = AndroidUtilities.dp(88.0f);
                }
                this.a.f3.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.g3.O(true);
        int i13 = this.c;
        if (i13 >= 0) {
            m71 m71Var3 = this.a;
            m71Var3.f3.h1(i13, this.d - m71Var3.getPaddingTop());
        }
    }

    public final boolean g0() {
        TLRPC.Document document;
        String charSequence = this.s.getText().toString();
        String str = this.G;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(charSequence, str)) {
            return true;
        }
        String charSequence2 = this.v.getText().toString();
        String str2 = this.H;
        if (!TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z10 = this.w;
        if (((z10 || (document = this.x) == null) ? 0L : document.id) == this.I) {
            return (z10 || this.E == null) ? false : true;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final boolean h0() {
        m mVar = this.s;
        if (mVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(mVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void i0() {
        TLRPC.Document document;
        u5 u5Var = this.f;
        if (u5Var.x.f) {
            return;
        }
        u5Var.b(true);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!h0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.w && (this.x != null || this.E != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.E;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.w && (document = this.x) != null) {
                    tL_businessIntro.flags = 1 | tL_businessIntro.flags;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new bi.i0(this, 17));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        k71 k71Var;
        if (this.J) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            m mVar = this.s;
            String str = tL_businessIntro.title;
            this.G = str;
            mVar.setText(str);
            m mVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            mVar2.setText(str2);
            this.x = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.s;
            this.G = "";
            mVar3.setText("");
            m mVar4 = this.v;
            this.H = "";
            mVar4.setText("");
            this.E = null;
            this.x = null;
        }
        TLRPC.Document document = this.x;
        this.I = document == null ? 0L : document.id;
        this.w = document == null;
        j jVar = this.n;
        if (jVar != null) {
            jVar.d(this.s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.n;
            TLRPC.Document document2 = this.x;
            if (document2 == null || this.w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.w) {
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        m71 m71Var = this.a;
        if (m71Var != null && (k71Var = m71Var.g3) != null) {
            k71Var.O(true);
        }
        this.J = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!g0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: jg.h
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.i0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: jg.h
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.i0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
