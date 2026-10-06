package hg;

import ai.g4;
import ai.n8;
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
import ci.b7;
import ci.i4;
import ci.s2;
import ei.v2;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.rt;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class n extends z61 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public TLRPC.InputDocument F;
    public boolean G;
    public String H;
    public String I;
    public long J;
    public boolean K;
    public g4 M;
    public sr f;
    public org.telegram.ui.ActionBar.v0 h;
    public k n;
    public j r;
    public u5 s;
    public m v;
    public m w;
    public final h e = new h(this, 1);
    public boolean x = true;
    public TLRPC.Document y = getMediaDataController().getGreetingsSticker();
    public boolean L = g0();

    public static void X(n nVar) {
        n nVar2;
        rt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.M != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            g4 g4Var = new g4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.M = g4Var;
            g4Var.Z1 = new a6.m(nVar2, 22);
        }
        nVar2.M.j0.f0();
        nVar2.M.I1(1, false);
        g4 g4Var2 = nVar2.M;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(nVar2, 22));
        nVar2.M.q1();
        g4 g4Var3 = nVar2.M;
        g4Var3.r = null;
        if (nVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            nVar2.showDialog(g4Var3);
        }
    }

    public static void Y(n nVar) {
        j jVar = nVar.r;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.x) {
            j jVar2 = nVar.r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(nVar.currentAccount).getGreetingsSticker();
            h hVar = new h(nVar, 2);
            if (greetingsSticker == null) {
                jVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = jVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jVar2.n.getImageReceiver().setDelegate(new ko(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, i6.lc, 1.0f);
            if (svgThumb != null) {
                jVar2.n.n(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.n.j(ImageLocation.getForDocument(greetingsSticker), mo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.n.setOnClickListener(new jo(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (nVar.n.getParent() instanceof View) {
            int top = ((View) nVar.n.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (nVar.n.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            nVar.r.setScaleX(clamp);
            nVar.r.setScaleY(clamp);
            nVar.r.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            nVar.n.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.z61
    public final void S(ArrayList arrayList, w61 w61Var) {
        arrayList.add(h61.k(this.n));
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(h61.k(this.v));
        arrayList.add(h61.k(this.w));
        if (this.x) {
            arrayList.add(h61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.E != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.E;
            h61 h61Var = new h61(3);
            h61Var.d = 1;
            h61Var.l = string;
            h61Var.G = str;
            arrayList.add(h61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.y;
            h61 h61Var2 = new h61(3);
            h61Var2.d = 1;
            h61Var2.l = string2;
            h61Var2.G = document;
            arrayList.add(h61Var2);
        }
        arrayList.add(h61.C(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.L = !g02;
        if (!g02) {
            arrayList.add(h61.C(null));
            h61 e7 = h61.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e7.r = true;
            arrayList.add(e7);
        }
        h61 h61Var3 = new h61(8);
        h61Var3.l = null;
        arrayList.add(h61Var3);
    }

    @Override // org.telegram.ui.Components.z61
    public final CharSequence T() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.z61
    public final void U(h61 h61Var, View view) {
        int i10 = h61Var.d;
        if (i10 == 1) {
            s2 s2Var = new s2(getParentActivity(), getResourceProvider(), true, true);
            s2Var.y = new ah.b(13, this, view);
            int i11 = 0;
            s2Var.E = new h(this, i11);
            View[] viewPages = s2Var.f.getViewPages();
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
            showDialog(s2Var);
            return;
        }
        if (i10 == 2) {
            this.v.setText("");
            this.w.setText("");
            AndroidUtilities.hideKeyboard(this.v.b);
            AndroidUtilities.hideKeyboard(this.w.b);
            this.x = true;
            this.r.d("", "");
            j jVar = this.r;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.y = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.z61
    public final boolean W(h61 h61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.z61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.r = new j(context, this.currentAccount, this.y, getResourceProvider());
        k kVar = new k(this, context);
        this.n = kVar;
        kVar.setWillNotDraw(false);
        this.s = new u5(this.r, this.n, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.r.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), i6.I.q()));
        this.n.addView(lVar, z5.e(-1, -1, 119));
        this.n.addView(this.r, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.v = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.v;
        int i10 = i6.d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar3 = this.v;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.w = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.w.setBackgroundColor(getThemedColor(i10));
        this.w.setDivider(true);
        m mVar5 = this.w;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        this.r.d("", "");
        super.createView(context);
        this.b.setBackground(null);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        this.a.f3.r = false;
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = i6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.f = new sr(mutate, new wp(i6.w0(null, i11, false)));
        this.h = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f);
        e0(false);
        this.a.addOnLayoutChangeListener(new v2(this, 1));
        this.a.j(new ai.r(this, 9));
        y61 y61Var = this.a;
        y61Var.h3 = true;
        y61Var.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new i4(this.fragmentView, false, new ai.y1(this, 22));
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
        y61 y61Var = this.a;
        if (y61Var == null || y61Var.f3 == null || this.L == (!g0())) {
            return;
        }
        y61 y61Var2 = this.a;
        if (y61Var2 != null && y61Var2.getChildCount() > 0) {
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
                this.a.e3.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.f3.N(true);
        int i13 = this.c;
        if (i13 >= 0) {
            y61 y61Var3 = this.a;
            y61Var3.e3.h1(i13, this.d - y61Var3.getPaddingTop());
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
        m mVar = this.v;
        if (mVar == null || this.w == null) {
            return true;
        }
        return TextUtils.isEmpty(mVar.getText()) && TextUtils.isEmpty(this.w.getText()) && this.x;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final zl0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0() {
        TLRPC.Document document;
        sr srVar = this.f;
        if (srVar.c > 0.0f) {
            return;
        }
        srVar.a(1.0f);
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
        getConnectionsManager().sendRequest(updatebusinessintro, new n8(this, 12));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        w61 w61Var;
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
            m mVar = this.v;
            String str = tL_businessIntro.title;
            this.H = str;
            mVar.setText(str);
            m mVar2 = this.w;
            String str2 = userFull.business_intro.description;
            this.I = str2;
            mVar2.setText(str2);
            this.y = userFull.business_intro.sticker;
        } else {
            m mVar3 = this.v;
            this.H = "";
            mVar3.setText("");
            m mVar4 = this.w;
            this.I = "";
            mVar4.setText("");
            this.F = null;
            this.y = null;
        }
        TLRPC.Document document = this.y;
        this.J = document == null ? 0L : document.id;
        this.x = document == null;
        j jVar = this.r;
        if (jVar != null) {
            jVar.d(this.v.getText().toString(), this.w.getText().toString());
            j jVar2 = this.r;
            TLRPC.Document document2 = this.y;
            if (document2 == null || this.x) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.x) {
            h hVar = this.e;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        y61 y61Var = this.a;
        if (y61Var != null && (w61Var = y61Var.f3) != null) {
            w61Var.N(true);
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) { // from class: hg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.a2(this) { // from class: hg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
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
}
