package ig;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi.w3;
import bi.z7;
import di.a7;
import di.h4;
import di.r2;
import java.util.ArrayList;
import m.u2;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.wo;
import org.telegram.ui.xt;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public w3 L;
    public ds e;
    public org.telegram.ui.ActionBar.u0 f;
    public j h;
    public i n;
    public t5 r;
    public l s;
    public l v;
    public String y;
    public final g d = new g(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(m mVar) {
        m mVar2;
        xt.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.L != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            w3 w3Var = new w3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.L = w3Var;
            w3Var.c2 = new ya.c(mVar2, 26);
        }
        mVar2.L.j0.f0();
        mVar2.L.N1(1, false);
        w3 w3Var2 = mVar2.L;
        w3Var2.X1 = true;
        w3Var2.k1(new ci.u(mVar2, 22));
        mVar2.L.t1();
        w3 w3Var3 = mVar2.L;
        w3Var3.r = null;
        if (mVar2.visibleDialog != null) {
            w3Var3.show();
        } else {
            mVar2.showDialog(w3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.n;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.w) {
            i iVar2 = mVar.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(mVar.currentAccount).getGreetingsSticker();
            g gVar = new g(mVar, 2);
            if (greetingsSticker == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.n.getImageReceiver().setDelegate(new uo(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, g6.lc, 1.0f);
            if (svgThumb != null) {
                iVar2.n.n(ImageLocation.getForDocument(greetingsSticker), wo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.n.j(ImageLocation.getForDocument(greetingsSticker), wo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.n.setOnClickListener(new to(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (mVar.h.getParent() instanceof View) {
            int top = ((View) mVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (mVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            mVar.n.setScaleX(clamp);
            mVar.n.setScaleY(clamp);
            mVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            mVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final void U(ArrayList arrayList, a71 a71Var) {
        arrayList.add(m61.k(this.h));
        i2.d.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(m61.k(this.s));
        arrayList.add(m61.k(this.v));
        if (this.w) {
            arrayList.add(m61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            m61 m61Var = new m61(3);
            m61Var.d = 1;
            m61Var.l = string;
            m61Var.G = str;
            arrayList.add(m61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            m61 m61Var2 = new m61(3);
            m61Var2.d = 1;
            m61Var2.l = string2;
            m61Var2.G = document;
            arrayList.add(m61Var2);
        }
        arrayList.add(m61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(m61.B(null));
            m61 e = m61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.r = true;
            arrayList.add(e);
        }
        m61 m61Var3 = new m61(8);
        m61Var3.l = null;
        arrayList.add(m61Var3);
    }

    @Override // org.telegram.ui.Components.d71
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.d71
    public final void W(m61 m61Var, View view) {
        int i10 = m61Var.d;
        if (i10 == 1) {
            r2 r2Var = new r2(getParentActivity(), getResourceProvider(), true, true);
            r2Var.y = new ah.h0(14, this, view);
            int i11 = 0;
            r2Var.E = new g(this, i11);
            View[] viewPages = r2Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof di.d2) {
                    di.c2 c2Var = ((di.d2) view2).c;
                    if (c2Var.H == null) {
                        c2Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(r2Var);
            return;
        }
        if (i10 == 2) {
            this.s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.s.b);
            AndroidUtilities.hideKeyboard(this.v.b);
            this.w = true;
            this.n.d("", "");
            i iVar = this.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new i(context, this.currentAccount, this.x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.r = new t5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(a7.e(null, this.currentAccount, getUserConfig().getClientUserId(), g6.I.q()));
        this.h.addView(kVar, z5.e(-1, -1, 119));
        this.h.addView(this.n, z5.a(-2.0f, 42.0f, 18.0f, 42.0f, 18.0f, -2, 17));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.s;
        int i10 = g6.d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.s.setDivider(true);
        l lVar3 = this.s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        h3 h3Var = lVar3.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new u2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar5 = this.v;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        h3 h3Var2 = lVar5.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new u2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.p1();
        c71 c71Var = this.a;
        c71Var.W2.r = false;
        this.actionBar.setAdaptiveBackground(c71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new ds(mutate, new gq(g6.x0(null, i11, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new fi.u2(this, 1));
        this.a.j(new ah.d0(this, 9));
        c71 c71Var2 = this.a;
        c71Var2.Y2 = true;
        c71Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new h4(this.fragmentView, false, new bi.o1(this, 22));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z10) {
        if (this.f == null) {
            return;
        }
        boolean f02 = f0();
        this.f.setEnabled(f02);
        if (z10) {
            this.f.animate().alpha(f02 ? 1.0f : 0.0f).scaleX(f02 ? 1.0f : 0.0f).scaleY(f02 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.f.setAlpha(f02 ? 1.0f : 0.0f);
            this.f.setScaleX(f02 ? 1.0f : 0.0f);
            this.f.setScaleY(f02 ? 1.0f : 0.0f);
        }
        c71 c71Var = this.a;
        if (c71Var == null || c71Var.W2 == null || this.K == (!g0())) {
            return;
        }
        c71 c71Var2 = this.a;
        if (c71Var2 != null && c71Var2.getChildCount() > 0) {
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
                this.b = i11;
                int top = view.getTop();
                this.c = top;
                if (this.b == 0 && top > AndroidUtilities.dp(88.0f)) {
                    this.c = AndroidUtilities.dp(88.0f);
                }
                this.a.V2.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.W2.N(true);
        int i13 = this.b;
        if (i13 >= 0) {
            c71 c71Var3 = this.a;
            c71Var3.V2.h1(i13, this.c - c71Var3.getPaddingTop());
        }
    }

    public final boolean f0() {
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

    public final boolean g0() {
        l lVar = this.s;
        if (lVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(lVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void h0() {
        TLRPC.Document document;
        ds dsVar = this.e;
        if (dsVar.c > 0.0f) {
            return;
        }
        dsVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
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
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new z7(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        a71 a71Var;
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
            l lVar = this.s;
            String str = tL_businessIntro.title;
            this.G = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.H = str2;
            lVar2.setText(str2);
            this.x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.s;
            this.G = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.H = "";
            lVar4.setText("");
            this.E = null;
            this.x = null;
        }
        TLRPC.Document document = this.x;
        this.I = document == null ? 0L : document.id;
        this.w = document == null;
        i iVar = this.n;
        if (iVar != null) {
            iVar.d(this.s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.n;
            TLRPC.Document document2 = this.x;
            if (document2 == null || this.w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        c71 c71Var = this.a;
        if (c71Var != null && (a71Var = c71Var.W2) != null) {
            a71Var.N(true);
        }
        this.J = true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        if (!f0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) { // from class: ig.h
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.h0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) { // from class: ig.h
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.h0();
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

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
