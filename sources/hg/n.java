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
import ei.u2;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.v51;
import org.telegram.ui.nt;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n extends m61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument E;
    public boolean F;
    public String G;
    public String H;
    public long I;
    public boolean J;
    public g4 L;
    public qr e;
    public org.telegram.ui.ActionBar.u0 f;
    public k h;
    public j n;
    public t5 r;
    public m s;
    public m v;
    public String y;
    public final h d = new h(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean K = g0();

    public static void Y(n nVar) {
        n nVar2;
        nt.q().T = null;
        if (nVar.getParentActivity() == null) {
            return;
        }
        if (nVar.getParentActivity() == null || nVar.getParentActivity() == null || nVar.L != null) {
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            g4 g4Var = new g4(nVar2, nVar.getParentActivity(), nVar, nVar.resourceProvider, 1);
            nVar2.L = g4Var;
            g4Var.Z1 = new a4.m(nVar2, 18);
        }
        nVar2.L.j0.f0();
        nVar2.L.J1(1, false);
        g4 g4Var2 = nVar2.L;
        g4Var2.U1 = true;
        g4Var2.i1(new bi.v(nVar2, 22));
        nVar2.L.r1();
        g4 g4Var3 = nVar2.L;
        g4Var3.r = null;
        if (nVar2.visibleDialog != null) {
            g4Var3.show();
        } else {
            nVar2.showDialog(g4Var3);
        }
    }

    public static void Z(n nVar) {
        j jVar = nVar.n;
        if (jVar != null && jVar.isAttachedToWindow() && nVar.w) {
            j jVar2 = nVar.n;
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
            jVar2.n.getImageReceiver().setDelegate(new io(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, h6.lc, 1.0f);
            if (svgThumb != null) {
                jVar2.n.n(ImageLocation.getForDocument(greetingsSticker), ko.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.n.j(ImageLocation.getForDocument(greetingsSticker), ko.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.n.setOnClickListener(new ho(jVar2, greetingsSticker, 1));
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
        com.google.android.gms.internal.vision.e2.n(R.string.BusinessIntroHeader, arrayList);
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
            this.s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.s.b);
            AndroidUtilities.hideKeyboard(this.v.b);
            this.w = true;
            this.n.d("", "");
            j jVar = this.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean X(v51 v51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m61, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new j(context, this.currentAccount, this.x, getResourceProvider());
        k kVar = new k(this, context);
        this.h = kVar;
        kVar.setWillNotDraw(false);
        this.r = new t5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        l lVar = new l(context, 0);
        lVar.setScaleType(ImageView.ScaleType.MATRIX);
        lVar.setImageDrawable(b7.e(null, this.currentAccount, getUserConfig().getClientUserId(), h6.I.q()));
        this.h.addView(lVar, y5.e(-1, -1, 119));
        this.h.addView(this.n, y5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        m mVar = new m(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = mVar;
        mVar.h = true;
        mVar.setShowLimitOnFocus(true);
        m mVar2 = this.s;
        int i10 = h6.d6;
        mVar2.setBackgroundColor(getThemedColor(i10));
        this.s.setDivider(true);
        m mVar3 = this.s;
        mVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mVar3, 4);
        h3 h3Var = mVar3.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        m mVar4 = new m(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = mVar4;
        mVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        m mVar5 = this.v;
        mVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(mVar5, 4);
        h3 h3Var2 = mVar5.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.p1();
        l61 l61Var = this.a;
        l61Var.Y2.r = false;
        this.actionBar.setAdaptiveBackground(l61Var);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = h6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new qr(mutate, new up(h6.w0(null, i11, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new u2(this, 1));
        this.a.j(new ai.r(this, 8));
        l61 l61Var2 = this.a;
        l61Var2.a3 = true;
        l61Var2.setClipChildren(false);
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
        m mVar = this.s;
        if (mVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(mVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void h0() {
        TLRPC.Document document;
        qr qrVar = this.e;
        if (qrVar.c > 0.0f) {
            return;
        }
        qrVar.a(1.0f);
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
        getConnectionsManager().sendRequest(updatebusinessintro, new n8(this, 12));
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
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        l61 l61Var = this.a;
        if (l61Var != null && (j61Var = l61Var.Y2) != null) {
            j61Var.N(true);
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) { // from class: hg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) { // from class: hg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
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
