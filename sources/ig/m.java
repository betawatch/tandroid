package ig;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ci.a3;
import ei.b4;
import ei.n2;
import ei.r6;
import gi.o2;
import java.util.ArrayList;
import m.t2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.to;
import org.telegram.ui.ht;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class m extends e71 implements NotificationCenter.NotificationCenterDelegate {
    public String G;
    public TLRPC.InputDocument H;
    public boolean I;
    public String J;
    public String K;
    public long L;
    public boolean M;
    public a3 O;
    public as e;
    public Drawable f;
    public int h;
    public eq n;
    public org.telegram.ui.ActionBar.u0 r;
    public j s;
    public i v;
    public x5 w;
    public l x;
    public l y;
    public final g d = new g(this, 1);
    public boolean E = true;
    public TLRPC.Document F = getMediaDataController().getGreetingsSticker();
    public boolean N = g0();

    public static void Y(m mVar) {
        m mVar2;
        ht.o().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.O != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            a3 a3Var = new a3(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 1);
            mVar2.O = a3Var;
            a3Var.c2 = new ya.c(mVar2, 24);
        }
        mVar2.O.j0.f0();
        mVar2.O.R1(1, false);
        a3 a3Var2 = mVar2.O;
        a3Var2.X1 = true;
        a3Var2.n1(new hg.o(mVar2, 3));
        mVar2.O.w1();
        a3 a3Var3 = mVar2.O;
        a3Var3.r = null;
        if (mVar2.visibleDialog != null) {
            a3Var3.show();
        } else {
            mVar2.showDialog(a3Var3);
        }
    }

    public static void Z(m mVar) {
        i iVar = mVar.v;
        if (iVar != null && iVar.isAttachedToWindow() && mVar.E) {
            i iVar2 = mVar.v;
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
            iVar2.n.getImageReceiver().setDelegate(new ro(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, k6.lc, 1.0f);
            if (svgThumb != null) {
                iVar2.n.n(ImageLocation.getForDocument(greetingsSticker), to.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.n.j(ImageLocation.getForDocument(greetingsSticker), to.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.n.setOnClickListener(new qo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (mVar.s.getParent() instanceof View) {
            int top = ((View) mVar.s.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (mVar.s.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            mVar.v.setScaleX(clamp);
            mVar.v.setScaleY(clamp);
            mVar.v.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            mVar.s.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final void U(ArrayList arrayList, b71 b71Var) {
        arrayList.add(m61.k(this.s));
        i2.o1.q(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(m61.k(this.x));
        arrayList.add(m61.k(this.y));
        if (this.E) {
            arrayList.add(m61.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.G != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.G;
            m61 m61Var = new m61(3);
            m61Var.d = 1;
            m61Var.l = string;
            m61Var.G = str;
            arrayList.add(m61Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.F;
            m61 m61Var2 = new m61(3);
            m61Var2.d = 1;
            m61Var2.l = string2;
            m61Var2.G = document;
            arrayList.add(m61Var2);
        }
        arrayList.add(m61.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.N = !g02;
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

    @Override // org.telegram.ui.Components.e71
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.e71
    public final void W(m61 m61Var, View view) {
        int i10 = m61Var.d;
        if (i10 == 1) {
            n2 n2Var = new n2(getParentActivity(), getResourceProvider(), true, true);
            n2Var.E = new ah.h0(16, this, view);
            int i11 = 0;
            n2Var.F = new g(this, i11);
            View[] viewPages = n2Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof ei.b2) {
                    ei.a2 a2Var = ((ei.b2) view2).c;
                    if (a2Var.H == null) {
                        a2Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(n2Var);
            return;
        }
        if (i10 == 2) {
            this.x.setText("");
            this.y.setText("");
            AndroidUtilities.hideKeyboard(this.x.d);
            AndroidUtilities.hideKeyboard(this.y.d);
            this.E = true;
            this.v.d("", "");
            i iVar = this.v;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.F = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e71, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.v = new i(context, this.currentAccount, this.F, getResourceProvider());
        j jVar = new j(this, context);
        this.s = jVar;
        jVar.setWillNotDraw(false);
        int dp = AndroidUtilities.dp(16.0f);
        i iVar = this.v;
        j jVar2 = this.s;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i10 = k6.a;
        this.w = new x5(iVar, jVar2, dp, themedPaint);
        this.v.setBackground(new ColorDrawable(0));
        k kVar = new k(context, 0);
        kVar.setScaleType(ImageView.ScaleType.MATRIX);
        kVar.setImageDrawable(r6.e(null, this.currentAccount, getUserConfig().getClientUserId(), k6.I.q()));
        this.s.addView(kVar, z5.e(-1, -1, 119));
        this.s.addView(this.v, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.x = lVar;
        lVar.r = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.x;
        int i11 = k6.d6;
        org.telegram.ui.ActionBar.r6.i(i11, lVar2, getResourceProvider());
        this.x.setDivider(true);
        l lVar3 = this.x;
        lVar3.getClass();
        int i12 = 4;
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, i12);
        f3 f3Var = lVar3.d;
        f3Var.setImeOptions(6);
        int i13 = 2;
        f3Var.setOnEditorActionListener(new t2(gVar, i13));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.y = lVar4;
        lVar4.setShowLimitOnFocus(true);
        org.telegram.ui.ActionBar.r6.i(i11, this.y, getResourceProvider());
        this.y.setDivider(true);
        l lVar5 = this.y;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, i12);
        f3 f3Var2 = lVar5.d;
        f3Var2.setImeOptions(6);
        f3Var2.setOnEditorActionListener(new t2(gVar2, i13));
        this.v.d("", "");
        super.createView(context);
        this.a.t1();
        d71 d71Var = this.a;
        d71Var.Z2.r = false;
        this.actionBar.setAdaptiveBackground(d71Var);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i14 = k6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.x0(null, i14, false), PorterDuff.Mode.MULTIPLY));
        this.f = mutate;
        this.h = k6.x0(null, i14, false);
        this.n = new eq(k6.x0(null, i14, false));
        this.e = new as(mutate, this.n);
        this.r = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new o2(this, 1));
        this.a.j(new ah.d0(this, 13));
        d71 d71Var2 = this.a;
        d71Var2.b3 = true;
        d71Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new b4(this.fragmentView, false, new ai.r0(this, 28));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z10) {
        if (this.r == null) {
            return;
        }
        boolean f02 = f0();
        this.r.setEnabled(f02);
        if (z10) {
            this.r.animate().alpha(f02 ? 1.0f : 0.0f).scaleX(f02 ? 1.0f : 0.0f).scaleY(f02 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.r.setAlpha(f02 ? 1.0f : 0.0f);
            this.r.setScaleX(f02 ? 1.0f : 0.0f);
            this.r.setScaleY(f02 ? 1.0f : 0.0f);
        }
        d71 d71Var = this.a;
        if (d71Var == null || d71Var.Z2 == null || this.N == (!g0())) {
            return;
        }
        d71 d71Var2 = this.a;
        if (d71Var2 != null && d71Var2.getChildCount() > 0) {
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
                this.a.Y2.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.Z2.N(true);
        int i13 = this.b;
        if (i13 >= 0) {
            d71 d71Var3 = this.a;
            d71Var3.Y2.h1(i13, this.c - d71Var3.getPaddingTop());
        }
    }

    public final boolean f0() {
        TLRPC.Document document;
        String charSequence = this.x.getText().toString();
        String str = this.J;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(charSequence, str)) {
            return true;
        }
        String charSequence2 = this.y.getText().toString();
        String str2 = this.K;
        if (!TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z10 = this.E;
        if (((z10 || (document = this.F) == null) ? 0L : document.id) == this.L) {
            return (z10 || this.H == null) ? false : true;
        }
        return true;
    }

    public final boolean g0() {
        l lVar = this.x;
        if (lVar == null || this.y == null) {
            return true;
        }
        return TextUtils.isEmpty(lVar.getText()) && TextUtils.isEmpty(this.y.getText()) && this.E;
    }

    public final void h0() {
        TLRPC.Document document;
        as asVar = this.e;
        if (asVar.c > 0.0f) {
            return;
        }
        asVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.x.getText().toString();
            updatebusinessintro.intro.description = this.y.getText().toString();
            if (!this.E && (this.F != null || this.H != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.H;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.F);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.E && (document = this.F) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new ai.h(this, 18));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        b71 b71Var;
        if (this.M) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            l lVar = this.x;
            String str = tL_businessIntro.title;
            this.J = str;
            lVar.setText(str);
            l lVar2 = this.y;
            String str2 = userFull.business_intro.description;
            this.K = str2;
            lVar2.setText(str2);
            this.F = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.x;
            this.J = "";
            lVar3.setText("");
            l lVar4 = this.y;
            this.K = "";
            lVar4.setText("");
            this.H = null;
            this.F = null;
        }
        TLRPC.Document document = this.F;
        this.L = document == null ? 0L : document.id;
        this.E = document == null;
        i iVar = this.v;
        if (iVar != null) {
            iVar.d(this.x.getText().toString(), this.y.getText().toString());
            i iVar2 = this.v;
            TLRPC.Document document2 = this.F;
            if (document2 == null || this.E) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.E) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        d71 d71Var = this.a;
        if (d71Var != null && (b71Var = d71Var.Z2) != null) {
            b71Var.N(true);
        }
        this.M = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
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
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int x02 = k6.x0(null, k6.v8, false);
            Drawable drawable = this.f;
            if (drawable != null && x02 != this.h) {
                this.h = x02;
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            eq eqVar = this.n;
            if (eqVar != null) {
                eqVar.b(x02);
            }
            as asVar = this.e;
            if (asVar != null) {
                asVar.invalidateSelf();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
