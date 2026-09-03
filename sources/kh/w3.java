package kh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import lh.j7;
import lh.l7;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class w3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap Q = new HashMap();
    public final TextView B;
    public final kp C;
    public final FrameLayout D;
    public int E;
    public p70 F;
    public SpannableStringBuilder G;
    public int H;
    public boolean I;
    public int J;
    public final k2 K;
    public final xd.a L;
    public int M;
    public int N;
    public n2 O;
    public ViewGroup P;
    public final org.telegram.ui.ActionBar.p2 a;
    public final int b;
    public final long c;
    public final l7 d;
    public final j7 e;
    public final f6 f;
    public final q2 h;
    public final k81 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final ph.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w3(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, f6 f6Var) {
        super(context);
        int i11;
        String str;
        this.E = -1;
        or0 or0Var = (or0) this;
        this.K = new k2(or0Var, 2);
        this.L = new xd.a(0, new o2(or0Var), mr.h, 380L, true);
        this.N = AndroidUtilities.displaySize.y;
        this.a = p2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(MessagesController.getInstance(i10), j10);
            if (n10 != null) {
                this.c = n10.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        t7.y(i10, false).Q(this.c);
        int i12 = 1;
        l7 G = t7.y(i10, false).G(this.c, true);
        this.d = G;
        j7 F = t7.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).s1) {
            G.g = 4;
            G.e = true;
            G.i(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.i(true);
        }
        G.a();
        this.f = f6Var;
        q2 q2Var = new q2(or0Var, context, p2Var);
        this.h = q2Var;
        q2Var.setAllowDisallowInterceptTouch(true);
        q2Var.setAdapter(new r2(or0Var, i10, f6Var));
        addView(q2Var, k7.b6.e(-1, -1, 119));
        k81 n11 = q2Var.n(10, true);
        this.n = n11;
        int i13 = j6.Gh;
        int i14 = j6.G6;
        int i15 = j6.Eh;
        int i16 = j6.Hh;
        int i17 = j6.s8;
        n11.M = i13;
        n11.N = i14;
        n11.O = i15;
        n11.P = i16;
        n11.Q = i17;
        n11.L.setColor(j6.v0(i13, n11.g0));
        n11.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n11.setClipToPadding(false);
        n11.r = 12;
        n11.setPreTabClick(new o2(or0Var));
        n11.setOnTabLongClick(new dg.l3(or0Var, i10, p2Var, context, f6Var, 1));
        addView(n11, k7.b6.e(-1, 42, 48));
        sg.c cVar = new sg.c();
        int i18 = j6.d6;
        cVar.a(j6.v0(i18, f6Var));
        dh.d dVar = new dh.d(context);
        qg.b bVar = new qg.b(i18, f6Var);
        pg.d dVar2 = new pg.d(cVar);
        dVar2.n(bVar);
        dVar2.o(AndroidUtilities.dp(8.0f));
        dVar2.p(AndroidUtilities.dp(22.0f));
        dVar.setBackground(dVar2);
        k7.d6.b(dVar, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = k7.b6.e(-1, 60, 87);
        e.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e);
        frameLayout.addView(dVar, k7.b6.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.D = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 24, 24));
        kp kpVar = new kp(context, 24, f6Var);
        this.C = kpVar;
        kpVar.b(j6.h7, j6.j7, j6.k7);
        kpVar.setDrawUnchecked(true);
        kpVar.a(false, false);
        kpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(kpVar, k7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.B = textView;
        org.telegram.ui.b.l(j6.j5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, k7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        dVar.addView(linearLayout, k7.b6.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        k7.d6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new dg.m2(or0Var, p2Var, i10, i12));
        Boolean bool = G.h;
        if (bool != null) {
            kpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c));
        boolean z4 = this.c < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb = new StringBuilder("G ");
        if (z4) {
            long j11 = this.c;
            if (j11 >= 0) {
                str = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j11));
                sb.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                spannableStringBuilder.setSpan(new lq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new lq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                ph.d dVar3 = new ph.d(context, f6Var, true);
                this.w = dVar3;
                dVar3.setUseWrapContent(true);
                dVar3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar3.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar3.g(spannableStringBuilder, false, true);
                dVar3.setStateListAnimator(null);
                dVar.addView(dVar3, k7.b6.e(-2, -1, 17));
                dVar.setOnClickListener(new p2(or0Var, z4, i10, r10));
                dVar3.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, k7.b6.e(-1, 200, 87));
                m();
                n();
            }
            i11 = R.string.ProfileGiftsSendChannel;
        } else {
            i11 = R.string.ProfileGiftsSend;
        }
        str = LocaleController.getString(i11);
        sb.append(str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder3.setSpan(new lq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new lq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        ph.d dVar32 = new ph.d(context, f6Var, true);
        this.w = dVar32;
        dVar32.setUseWrapContent(true);
        dVar32.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar32.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar32.g(spannableStringBuilder3, false, true);
        dVar32.setStateListAnimator(null);
        dVar.addView(dVar32, k7.b6.e(-2, -1, 17));
        dVar.setOnClickListener(new p2(or0Var, z4, i10, r10));
        dVar32.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, k7.b6.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, l7 l7Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new dg.m2(l7Var, i10, runnable, 2));
        g1Var.setOnLongClickListener(new i2(l7Var, i10, runnable));
    }

    public final void a() {
        l7 l7Var;
        m3 currentPage = getCurrentPage();
        if (currentPage == null || (l7Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = l7Var.d;
        new r3(this.a, this.c, i10, new dg.j3(this, i10, currentPage, 1)).show();
    }

    public final boolean b() {
        j7 j7Var = this.e;
        return j7Var.h() && j7Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
    }

    public final boolean c() {
        int i10 = this.b;
        long j10 = this.c;
        return j10 >= 0 ? j10 == 0 || j10 == UserConfig.getInstance(i10).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.y;
        ph.d dVar = this.w;
        long j10 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.C.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            f(true);
            n();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            setVisibleHeight(this.N);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.J <= 0) {
            return;
        }
        ArrayList d = this.e.d();
        int i10 = 0;
        while (true) {
            if (i10 >= d.size()) {
                i10 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.J) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (i10 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.J = 0;
        this.n.d(tL_starGiftCollection.collection_id, i10 + 1);
    }

    public final void f(boolean z4) {
        q2 q2Var = this.h;
        if (q2Var == null || this.n == null) {
            return;
        }
        q2Var.o(z4);
        e();
    }

    public final boolean g() {
        if (this.I) {
            return true;
        }
        m3 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.y3.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.N) + (-r0.getTop()), 1);
        if (this.N < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.N, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public l7 getCurrentList() {
        m3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public rl0 getCurrentListView() {
        m3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public m3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (m3) currentView;
    }

    public int getGiftsCount() {
        int i10;
        l7 l7Var;
        int i11;
        m3 currentPage = getCurrentPage();
        l7 l7Var2 = this.d;
        if (currentPage == null || (l7Var = currentPage.e) == l7Var2) {
            if (l7Var2 != null && (i10 = l7Var2.n) > 0) {
                return i10;
            }
        } else if (l7Var != null && (i11 = l7Var.n) > 0) {
            return i11;
        }
        int i12 = this.b;
        long j10 = this.c;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j10);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        l7 l7Var = this.d;
        if (l7Var != null && !l7Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < l7Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) l7Var.l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        q2 q2Var = this.h;
        float f10 = 0.0f;
        if (q2Var.getViewPages() != null) {
            for (View view : q2Var.getViewPages()) {
                if (view instanceof m3) {
                    f10 = (((m3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        k81 k81Var = this.n;
        if (k81Var != null) {
            return k81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        k70 k70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        f6 f6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (str != null) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        u2 u2Var = new u2(this, context, f6Var);
        u2Var.lineYFix = true;
        u2Var.setOnEditorActionListener(new v2(u2Var, callback, d2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        u2Var.setTextSize(1, 18.0f);
        u2Var.setTextColor(j6.v0(j6.j5, f6Var));
        u2Var.setHintColor(j6.v0(j6.Xh, f6Var));
        u2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        u2Var.setFocusable(true);
        u2Var.setInputType(147457);
        u2Var.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        u2Var.setImeOptions(6);
        u2Var.setBackgroundDrawable(null);
        u2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        u2Var.addTextChangedListener(new w2(u2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        u2Var.setText(str);
        linearLayout.addView(u2Var, k7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new c1.b(23, u2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(11));
        d2VarArr[0] = alertDialog$Builder.a;
        p70 p70Var = this.F;
        if (p70Var != null && (k70Var = p70Var.m) != null) {
            k70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        int i10 = 1;
        d2VarArr[0].setOnDismissListener(new i(this, u2Var, findActivity, i10));
        d2VarArr[0].setOnShowListener(new j(i10, u2Var));
        d2VarArr[0].show();
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        d2Var.e0 = false;
        d2Var.d(-1);
        u2Var.setSelection(u2Var.getText().length());
    }

    public final void i() {
        m3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            j7 j7Var = this.e;
            if (i11 < j7Var.d().size()) {
                l7 e = (i11 < 0 || i11 >= j7Var.d().size()) ? null : j7Var.e(((TL_stars.TL_starGiftCollection) j7Var.d().get(i11)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        nb nbVar;
        q2 q2Var = this.h;
        if (q2Var == null) {
            return;
        }
        if (q2Var.getCurrentPosition() == q2Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(q2Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((q2Var.getNextPositionAlpha() * (k(q2Var.getNextPosition()) ? 1.0f : 0.0f)) + (q2Var.getCurrentPositionAlpha() * (k(q2Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float B = nextPositionAlpha + org.telegram.messenger.y3.B(this.x, (-frameLayout.getTop()) + this.N, 1);
        boolean z4 = this.N > AndroidUtilities.dp(184.0f);
        xd.a aVar = this.L;
        aVar.a(z4, true);
        float f10 = aVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f10);
        this.D.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.M);
        frameLayout.setAlpha(f10);
        frameLayout.setVisibility(f10 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || q2Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        ic icVar = ic.w;
        if (icVar == null || (nbVar = icVar.e) == null) {
            return;
        }
        nbVar.updatePosition();
    }

    public final void m() {
        ph.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = j6.Oh;
        f6 f6Var = this.f;
        dVar.setBackground(j6.b0(dp, ((or0) this).R.V0(j6.v0(i10, f6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    m3 m3Var = (m3) view;
                    f6 f6Var2 = m3Var.c;
                    if (m3Var.s != null) {
                        m3Var.w.setTextColor(j6.v0(j6.G6, f6Var2));
                        TextView textView = m3Var.x;
                        int i11 = j6.Oh;
                        textView.setTextColor(j6.v0(i11, f6Var2));
                        m3Var.x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var2)), 4, 4));
                    } else {
                        m3Var.C.setTextColor(j6.v0(j6.G6, f6Var2));
                        m3Var.D.setTextColor(j6.v0(j6.y6, f6Var2));
                        m3Var.E.j();
                    }
                }
            }
        }
        this.B.setTextColor(j6.v0(j6.j5, f6Var));
        this.y.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 24, 24));
    }

    public final void n() {
        boolean z4 = !this.e.d().isEmpty() || b();
        q2 q2Var = this.h;
        if (q2Var.getViewPages() != null) {
            for (View view : q2Var.getViewPages()) {
                if (view instanceof m3) {
                    ((m3) view).setHasTabs(z4);
                }
            }
        }
    }

    public final void o() {
        float f10;
        k81 k81Var = this.n;
        if (k81Var == null) {
            return;
        }
        float min = Math.min(this.H, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.H, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        k81Var.setTranslationY(min);
        k81Var.setScaleX(lerp);
        k81Var.setScaleY(lerp);
        q2 q2Var = this.h;
        if (q2Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : q2Var.getViewPages()) {
                if (view instanceof m3) {
                    f10 += ((m3) view).F ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        k81Var.setAlpha(k7.n.a(f10, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        m3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.o = true;
            l7Var.a();
        }
        j7 j7Var = this.e;
        if (j7Var != null) {
            j7Var.j = true;
            j7Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        l7 l7Var = this.d;
        if (l7Var != null) {
            l7Var.o = false;
        }
        j7 j7Var = this.e;
        if (j7Var != null) {
            j7Var.j = false;
        }
    }

    public abstract void p(boolean z4);

    public void setButtonOffset(int i10) {
        if (this.M != i10) {
            this.M = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        if (this.H != i10) {
            this.H = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof m3) {
                    m3 m3Var = (m3) view;
                    g3 g3Var = m3Var.f;
                    int paddingTop = g3Var.getPaddingTop();
                    g3Var.setPadding(AndroidUtilities.dp(9.0f), this.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(g3Var, new m2(m3Var, paddingTop - g3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z4) {
        m3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z4);
        }
    }

    public void setReorderingCollections(boolean z4) {
        if (this.I == z4) {
            return;
        }
        this.I = z4;
        p(g());
        this.n.setReordering(z4);
        if (z4) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new h2(profileActivity, 0));
            }
        }
        if (z4) {
            return;
        }
        k2 k2Var = this.K;
        AndroidUtilities.cancelRunOnUIThread(k2Var);
        AndroidUtilities.runOnUIThread(k2Var);
    }

    public void setVisibleHeight(int i10) {
        this.N = i10;
        l();
        q2 q2Var = this.h;
        if (q2Var != null) {
            for (View view : q2Var.getViewPages()) {
                if (view instanceof m3) {
                    ((m3) view).setVisibleHeight(this.N);
                }
            }
        }
    }
}
