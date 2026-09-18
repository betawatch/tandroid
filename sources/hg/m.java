package hg;

import ai.g4;
import ai.m8;
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
import ci.d7;
import ci.j4;
import ci.t2;
import ei.u2;
import java.util.ArrayList;
import m.s2;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x51;
import org.telegram.ui.st;
import w7.y5;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class m extends o61 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public g4 M;
    public pr f;
    public org.telegram.ui.ActionBar.v0 h;
    public j n;
    public i r;
    public v5 s;
    public l v;
    public l w;
    public final g e = new g(this, 1);
    public boolean x = true;
    public TLRPC.Document y = getMediaDataController().getGreetingsSticker();
    public boolean L = g0();

    public static void Y(m mVar) {
        m mVar2;
        st.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.M != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            g4 g4Var = new g4(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.M = g4Var;
            g4Var.Z1 = new a4.m(mVar2, 18);
        }
        mVar2.M.j0.f0();
        mVar2.M.J1(1, false);
        g4 g4Var2 = mVar2.M;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(mVar2, 22));
        mVar2.M.r1();
        g4 g4Var3 = mVar2.M;
        g4Var3.r = null;
        if (mVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            mVar2.showDialog(g4Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.r;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.x) {
            i iVar2 = mVar.r;
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
            iVar2.n.getImageReceiver().setDelegate(new ho(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.lc, 1.0f);
            if (svgThumb != null) {
                iVar2.n.n(ImageLocation.getForDocument(greetingsSticker), jo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.n.j(ImageLocation.getForDocument(greetingsSticker), jo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.n.setOnClickListener(new go(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (mVar.n.getParent() instanceof View) {
            int top = ((View) mVar.n.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (mVar.n.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            mVar.r.setScaleX(clamp);
            mVar.r.setScaleY(clamp);
            mVar.r.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            mVar.n.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.o61
    public final void U(ArrayList arrayList, l61 l61Var) {
        arrayList.add(x51.k(this.n));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(x51.k(this.v));
        arrayList.add(x51.k(this.w));
        if (this.x) {
            arrayList.add(x51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.E != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.E;
            x51 x51Var = new x51(3);
            x51Var.d = 1;
            x51Var.l = string;
            x51Var.G = str;
            arrayList.add(x51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.y;
            x51 x51Var2 = new x51(3);
            x51Var2.d = 1;
            x51Var2.l = string2;
            x51Var2.G = document;
            arrayList.add(x51Var2);
        }
        arrayList.add(x51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.L = !g02;
        if (!g02) {
            arrayList.add(x51.B(null));
            x51 e = x51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.r = true;
            arrayList.add(e);
        }
        x51 x51Var3 = new x51(8);
        x51Var3.l = null;
        arrayList.add(x51Var3);
    }

    @Override // org.telegram.ui.Components.o61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.o61
    public final void W(x51 x51Var, View view) {
        int i10 = x51Var.d;
        if (i10 == 1) {
            t2 t2Var = new t2(getParentActivity(), getResourceProvider(), true, true);
            t2Var.y = new ah.b(13, this, view);
            int i11 = 0;
            t2Var.E = new g(this, i11);
            View[] viewPages = t2Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof ci.e2) {
                    ci.d2 d2Var = ((ci.e2) view2).c;
                    if (d2Var.H == null) {
                        d2Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(t2Var);
            return;
        }
        if (i10 == 2) {
            this.v.setText("");
            this.w.setText("");
            AndroidUtilities.hideKeyboard(this.v.b);
            AndroidUtilities.hideKeyboard(this.w.b);
            this.x = true;
            this.r.d("", "");
            i iVar = this.r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.y = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean X(x51 x51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.o61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.r = new i(context, this.currentAccount, this.y, getResourceProvider());
        j jVar = new j(this, context);
        this.n = jVar;
        jVar.setWillNotDraw(false);
        this.s = new v5(this.r, this.n, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.r.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(d7.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.n.addView(kVar, y5.e(-1, -1, 119));
        this.n.addView(this.r, y5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.v = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.v;
        int i10 = j6.d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar3 = this.v;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        h3 h3Var = lVar3.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.w = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.w.setBackgroundColor(getThemedColor(i10));
        this.w.setDivider(true);
        l lVar5 = this.w;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        h3 h3Var2 = lVar5.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.r.d("", "");
        super.createView(context);
        this.a.q1();
        n61 n61Var = this.a;
        n61Var.Y2.r = false;
        this.actionBar.setAdaptiveBackground(n61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f = new pr(mutate, new tp(j6.w0(null, i11, false)));
        this.h = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f);
        e0(false);
        this.a.addOnLayoutChangeListener(new u2(this, 1));
        this.a.j(new ai.r(this, 9));
        n61 n61Var2 = this.a;
        n61Var2.a3 = true;
        n61Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new j4(this.fragmentView, false, new ai.y1(this, 19));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z10) {
        if (this.h == null) {
            return;
        }
        boolean f02 = f0();
        this.h.setEnabled(f02);
        if (z10) {
            this.h.animate().alpha(f02 ? 1.0f : 0.0f).scaleX(f02 ? 1.0f : 0.0f).scaleY(f02 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.h.setAlpha(f02 ? 1.0f : 0.0f);
            this.h.setScaleX(f02 ? 1.0f : 0.0f);
            this.h.setScaleY(f02 ? 1.0f : 0.0f);
        }
        n61 n61Var = this.a;
        if (n61Var == null || n61Var.Y2 == null || this.L == (!g0())) {
            return;
        }
        n61 n61Var2 = this.a;
        if (n61Var2 != null && n61Var2.getChildCount() > 0) {
            View view = null;
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = -1;
            for (int i12 = 0; i12 < this.a.getChildCount(); i12++) {
                int S = RecyclerView.S(this.a.getChildAt(i12));
                View childAt = this.a.getChildAt(i12);
                if (S != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = S;
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
                this.a.X2.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.Y2.N(true);
        int i13 = this.c;
        if (i13 >= 0) {
            n61 n61Var3 = this.a;
            n61Var3.X2.h1(i13, this.d - n61Var3.getPaddingTop());
        }
    }

    public final boolean f0() {
        TLRPC.Document document;
        String charSequence = this.v.getText().toString();
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

    public final boolean g0() {
        l lVar = this.v;
        if (lVar == null || this.w == null) {
            return true;
        }
        return TextUtils.isEmpty(lVar.getText()) && TextUtils.isEmpty(this.w.getText()) && this.x;
    }

    public final void h0() {
        TLRPC.Document document;
        pr prVar = this.f;
        if (prVar.c > 0.0f) {
            return;
        }
        prVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.v.getText().toString();
            updatebusinessintro.intro.description = this.w.getText().toString();
            if (!this.x && (this.y != null || this.F != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.F;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.y);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.x && (document = this.y) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new m8(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        l61 l61Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.v;
            String str = tL_businessIntro.title;
            this.H = str;
            lVar.setText(str);
            l lVar2 = this.w;
            String str2 = userFull.business_intro.description;
            this.I = str2;
            lVar2.setText(str2);
            this.y = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.v;
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
        i iVar = this.r;
        if (iVar != null) {
            iVar.d(this.v.getText().toString(), this.w.getText().toString());
            i iVar2 = this.r;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.x) {
            g gVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        n61 n61Var = this.a;
        if (n61Var != null && (l61Var = n61Var.Y2) != null) {
            l61Var.N(true);
        }
        this.K = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) { // from class: hg.h
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) { // from class: hg.h
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
