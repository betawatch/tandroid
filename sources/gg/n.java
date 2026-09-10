package gg;

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
import bi.b5;
import bi.cb;
import bi.e8;
import bi.f3;
import bi.p2;
import bi.q2;
import di.x2;
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
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.zp;
import org.telegram.ui.tt;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n extends m61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public m L;
    public vr e;
    public org.telegram.ui.ActionBar.w0 f;
    public j h;
    public i n;
    public w5 r;
    public l s;
    public l v;
    public String y;
    public final g d = new g(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        tt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            m mVar = new m(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 0);
            nVar2.L = mVar;
            mVar.Z1 = new pb.c(nVar2, 21);
        }
        nVar2.L.j0.f0();
        nVar2.L.J1(1, false);
        m mVar2 = nVar2.L;
        mVar2.U1 = true;
        mVar2.i1(new ai.c0(nVar2, 22));
        nVar2.L.r1();
        m mVar3 = nVar2.L;
        mVar3.r = null;
        if (nVar2.visibleDialog != null) {
            mVar3.show();
        } else {
            nVar2.showDialog(mVar3);
        }
    }

    public static void Z(n nVar) {
        i iVar = nVar.n;
        if (iVar != null && iVar.isAttachedToWindow() && nVar.w) {
            i iVar2 = nVar.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(nVar.currentAccount).getGreetingsSticker();
            g gVar = new g(nVar, 2);
            if (greetingsSticker == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.F;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.n.getImageReceiver().setDelegate(new mo(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.lc, 1.0f);
            if (svgThumb != null) {
                iVar2.n.n(ImageLocation.getForDocument(greetingsSticker), oo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.n.j(ImageLocation.getForDocument(greetingsSticker), oo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.n.setOnClickListener(new lo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(n nVar) {
        if (nVar.h.getParent() instanceof View) {
            int top = ((View) nVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (nVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            nVar.n.setScaleX(clamp);
            nVar.n.setScaleY(clamp);
            nVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            nVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final void U(ArrayList arrayList, j61 j61Var) {
        arrayList.add(v51.k(this.h));
        com.google.android.gms.internal.vision.e2.m(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(v51.k(this.s));
        arrayList.add(v51.k(this.v));
        if (this.w) {
            arrayList.add(v51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            v51 v51Var = new v51(3);
            v51Var.d = 1;
            v51Var.l = string;
            v51Var.G = str;
            arrayList.add(v51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            v51 v51Var2 = new v51(3);
            v51Var2.d = 1;
            v51Var2.l = string2;
            v51Var2.G = document;
            arrayList.add(v51Var2);
        }
        arrayList.add(v51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.K = !g02;
        if (!g02) {
            arrayList.add(v51.B(null));
            v51 e = v51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.r = true;
            arrayList.add(e);
        }
        v51 v51Var3 = new v51(8);
        v51Var3.l = null;
        arrayList.add(v51Var3);
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.m61
    public final void W(v51 v51Var, View view) {
        int i10 = v51Var.d;
        if (i10 == 1) {
            f3 f3Var = new f3(getParentActivity(), getResourceProvider(), true, true);
            f3Var.y = new cb(9, this, view);
            int i11 = 0;
            f3Var.E = new g(this, i11);
            View[] viewPages = f3Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof q2) {
                    p2 p2Var = ((q2) view2).c;
                    if (p2Var.H == null) {
                        p2Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(f3Var);
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

    @Override // org.telegram.ui.Components.m61
    public final boolean X(v51 v51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new i(context, this.currentAccount, this.x, getResourceProvider());
        j jVar = new j(this, context);
        this.h = jVar;
        jVar.setWillNotDraw(false);
        this.r = new w5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(e8.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.h.addView(kVar, a6.e(-1, -1, 119));
        this.h.addView(this.n, a6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.s;
        int i10 = j6.d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.s.setDivider(true);
        l lVar3 = this.s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        g3 g3Var = lVar3.b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new s2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar5 = this.v;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        g3 g3Var2 = lVar5.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new s2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.o1();
        l61 l61Var = this.a;
        l61Var.Y2.r = false;
        this.actionBar.setAdaptiveBackground(l61Var);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new vr(mutate, new zp(j6.w0(null, i11, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new x2(this, 1));
        this.a.j(new bi.a2(this, 7));
        l61 l61Var2 = this.a;
        l61Var2.a3 = true;
        l61Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new b5(this.fragmentView, false, new ai.b(this, 15));
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
        l61 l61Var = this.a;
        if (l61Var == null || l61Var.Y2 == null || this.K == (!g0())) {
            return;
        }
        l61 l61Var2 = this.a;
        if (l61Var2 != null && l61Var2.getChildCount() > 0) {
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
                this.a.X2.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.Y2.N(true);
        int i13 = this.b;
        if (i13 >= 0) {
            l61 l61Var3 = this.a;
            l61Var3.X2.h1(i13, this.c - l61Var3.getPaddingTop());
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
        vr vrVar = this.e;
        if (vrVar.c > 0.0f) {
            return;
        }
        vrVar.a(1.0f);
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
        getConnectionsManager().sendRequest(updatebusinessintro, new bi.c2(this, 9));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        j61 j61Var;
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
        l61 l61Var = this.a;
        if (l61Var != null && (j61Var = l61Var.Y2) != null) {
            j61Var.N(true);
        }
        this.J = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) { // from class: gg.h
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.c2(this) { // from class: gg.h
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
