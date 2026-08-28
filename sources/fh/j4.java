package fh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.l7;
import gh.n7;
import gh.v7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j4 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap P = new HashMap();
    public final TextView A;
    public final dp B;
    public final FrameLayout C;
    public int D;
    public x60 E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public int I;
    public final t2 J;
    public final td.a K;
    public int L;
    public int M;
    public x2 N;
    public ViewGroup O;
    public final org.telegram.ui.ActionBar.o2 a;
    public final int b;
    public final long c;
    public final n7 d;
    public final l7 e;
    public final org.telegram.ui.ActionBar.b6 f;
    public final c3 h;
    public final m71 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final kh.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j4(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        String str;
        this.D = -1;
        vq0 vq0Var = (vq0) this;
        this.J = new t2(vq0Var, 2);
        this.K = new td.a(0, new y2(vq0Var), gr.h, 380L, true);
        this.M = AndroidUtilities.displaySize.y;
        this.a = o2Var;
        this.b = i9;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(MessagesController.getInstance(i9), j10);
            if (l10 != null) {
                this.c = l10.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        v7.y(i9, false).Q(this.c);
        n7 G = v7.y(i9, false).G(this.c, true);
        this.d = G;
        l7 F = v7.y(i9, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).r1) {
            G.g = 4;
            G.e = true;
            G.i(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.i(true);
        }
        G.a();
        this.f = b6Var;
        c3 c3Var = new c3(vq0Var, context, o2Var);
        this.h = c3Var;
        c3Var.setAllowDisallowInterceptTouch(true);
        c3Var.setAdapter(new d3(vq0Var, i9, b6Var));
        addView(c3Var, g7.e6.e(-1, -1, 119));
        m71 n10 = c3Var.n(10, true);
        this.n = n10;
        int i11 = org.telegram.ui.ActionBar.f6.Gh;
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        int i13 = org.telegram.ui.ActionBar.f6.Eh;
        int i14 = org.telegram.ui.ActionBar.f6.Hh;
        int i15 = org.telegram.ui.ActionBar.f6.s8;
        n10.L = i11;
        n10.M = i12;
        n10.N = i13;
        n10.O = i14;
        n10.P = i15;
        n10.K.setColor(org.telegram.ui.ActionBar.f6.v0(i11, n10.f0));
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new y2(vq0Var));
        n10.setOnTabLongClick(new z2(vq0Var, i9, o2Var, context, b6Var, 0));
        addView(n10, g7.e6.e(-1, 42, 48));
        ng.c cVar = new ng.c();
        int i16 = org.telegram.ui.ActionBar.f6.d6;
        cVar.a(org.telegram.ui.ActionBar.f6.v0(i16, b6Var));
        dh.g gVar = new dh.g(context);
        lg.b bVar = new lg.b(i16, b6Var);
        kg.f fVar = new kg.f(cVar);
        fVar.n(bVar);
        fVar.o(AndroidUtilities.dp(8.0f));
        fVar.p(AndroidUtilities.dp(22.0f));
        gVar.setBackground(fVar);
        g7.g6.b(gVar, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, 60, 87);
        e10.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e10);
        frameLayout.addView(gVar, g7.e6.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 24, 24));
        dp dpVar = new dp(context, 24, b6Var);
        this.B = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.h7, org.telegram.ui.ActionBar.f6.j7, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(false, false);
        dpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(dpVar, g7.e6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.A = textView;
        ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 16, 9, 0, 0, 0));
        gVar.addView(linearLayout, g7.e6.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        g7.g6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new a3(vq0Var, o2Var, i9, r10));
        Boolean bool = G.h;
        if (bool != null) {
            dpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j11 = this.c;
            if (j11 >= 0) {
                str = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j11));
                sb2.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new eq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.l0.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new eq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                kh.d dVar = new kh.d(context, b6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.g(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                gVar.addView(dVar, g7.e6.e(-2, -1, 17));
                gVar.setOnClickListener(new b3(vq0Var, z10, i9, r10));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, g7.e6.e(-1, 200, 87));
                m();
                n();
            }
            i10 = R.string.ProfileGiftsSendChannel;
        } else {
            i10 = R.string.ProfileGiftsSend;
        }
        str = LocaleController.getString(i10);
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new eq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.l0.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new eq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        kh.d dVar2 = new kh.d(context, b6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        gVar.addView(dVar2, g7.e6.e(-2, -1, 17));
        gVar.setOnClickListener(new b3(vq0Var, z10, i9, r10));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, g7.e6.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, n7 n7Var, Runnable runnable, int i9) {
        g1Var.setOnClickListener(new a3(n7Var, i9, runnable, 1));
        g1Var.setOnLongClickListener(new r2(n7Var, i9, runnable));
    }

    public final void a() {
        n7 n7Var;
        y3 currentPage = getCurrentPage();
        if (currentPage == null || (n7Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i9 = n7Var.d;
        new d4(this.a, this.c, i9, new v2(this, i9, currentPage, 0)).show();
    }

    public final boolean b() {
        l7 l7Var = this.e;
        return l7Var.h() && l7Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
    }

    public final boolean c() {
        int i9 = this.b;
        long j10 = this.c;
        return j10 >= 0 ? j10 == 0 || j10 == UserConfig.getInstance(i9).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.y;
        kh.d dVar = this.w;
        long j10 = this.c;
        if (i9 == i11) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.B.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            f(true);
            n();
            return;
        }
        if (i9 == NotificationCenter.updateInterfaces) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            setVisibleHeight(this.M);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.I <= 0) {
            return;
        }
        ArrayList d = this.e.d();
        int i9 = 0;
        while (true) {
            if (i9 >= d.size()) {
                i9 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) d.get(i9)).collection_id == this.I) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i9);
                    break;
                }
                i9++;
            }
        }
        if (i9 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.I = 0;
        this.n.d(tL_starGiftCollection.collection_id, i9 + 1);
    }

    public final void f(boolean z10) {
        c3 c3Var = this.h;
        if (c3Var == null || this.n == null) {
            return;
        }
        c3Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.H) {
            return true;
        }
        y3 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.l0.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.M) + (-r0.getTop()), 1);
        if (this.M < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.M, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public n7 getCurrentList() {
        y3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public wk0 getCurrentListView() {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public y3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (y3) currentView;
    }

    public int getGiftsCount() {
        int i9;
        n7 n7Var;
        int i10;
        y3 currentPage = getCurrentPage();
        n7 n7Var2 = this.d;
        if (currentPage == null || (n7Var = currentPage.e) == n7Var2) {
            if (n7Var2 != null && (i9 = n7Var2.n) > 0) {
                return i9;
            }
        } else if (n7Var != null && (i10 = n7Var.n) > 0) {
            return i10;
        }
        int i11 = this.b;
        long j10 = this.c;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        n7 n7Var = this.d;
        if (n7Var != null && !n7Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i9 = 0;
            for (int i10 = 0; i9 < 3 && i10 < n7Var.l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) n7Var.l.get(i10)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.id));
                    i9++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        c3 c3Var = this.h;
        float f10 = 0.0f;
        if (c3Var.getViewPages() != null) {
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    f10 = (((y3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        m71 m71Var = this.n;
        if (m71Var != null) {
            return m71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        s60 s60Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        org.telegram.ui.ActionBar.b6 b6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        if (str != null) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        g3 g3Var = new g3(this, context, b6Var);
        g3Var.lineYFix = true;
        g3Var.setOnEditorActionListener(new h3(g3Var, callback, c2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        g3Var.setTextSize(1, 18.0f);
        g3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        g3Var.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        g3Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        g3Var.setFocusable(true);
        g3Var.setInputType(147457);
        g3Var.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var));
        g3Var.setImeOptions(6);
        g3Var.setBackgroundDrawable(null);
        g3Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        g3Var.addTextChangedListener(new i3(g3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g3Var.setText(str);
        linearLayout.addView(g3Var, g7.e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new b5.d(17, g3Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.b(29));
        c2VarArr[0] = alertDialog$Builder.a;
        x60 x60Var = this.E;
        if (x60Var != null && (s60Var = x60Var.m) != null) {
            s60Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        int i9 = 1;
        c2VarArr[0].setOnDismissListener(new j(this, g3Var, findActivity, i9));
        c2VarArr[0].setOnShowListener(new k(i9, g3Var));
        c2VarArr[0].show();
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        c2Var.d0 = false;
        c2Var.d(-1);
        g3Var.setSelection(g3Var.getText().length());
    }

    public final void i() {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i9) {
        if (i9 == 0) {
            return false;
        }
        int i10 = i9 - 1;
        if (i10 >= 0) {
            l7 l7Var = this.e;
            if (i10 < l7Var.d().size()) {
                n7 e10 = (i10 < 0 || i10 >= l7Var.d().size()) ? null : l7Var.e(((TL_stars.TL_starGiftCollection) l7Var.d().get(i10)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        lb lbVar;
        c3 c3Var = this.h;
        if (c3Var == null) {
            return;
        }
        if (c3Var.getCurrentPosition() == c3Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(c3Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((c3Var.getNextPositionAlpha() * (k(c3Var.getNextPosition()) ? 1.0f : 0.0f)) + (c3Var.getCurrentPositionAlpha() * (k(c3Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float B = nextPositionAlpha + org.telegram.messenger.l0.B(this.x, (-frameLayout.getTop()) + this.M, 1);
        boolean z10 = this.M > AndroidUtilities.dp(184.0f);
        td.a aVar = this.K;
        aVar.a(z10, true);
        float f10 = aVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f10);
        this.C.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.L);
        frameLayout.setAlpha(f10);
        frameLayout.setVisibility(f10 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || c3Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        gc gcVar = gc.w;
        if (gcVar == null || (lbVar = gcVar.e) == null) {
            return;
        }
        lbVar.updatePosition();
    }

    public final void m() {
        kh.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        org.telegram.ui.ActionBar.b6 b6Var = this.f;
        dVar.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, ((vq0) this).Q.V0(org.telegram.ui.ActionBar.f6.v0(i9, b6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    y3 y3Var = (y3) view;
                    org.telegram.ui.ActionBar.b6 b6Var2 = y3Var.c;
                    if (y3Var.s != null) {
                        y3Var.w.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var2));
                        TextView textView = y3Var.x;
                        int i10 = org.telegram.ui.ActionBar.f6.Oh;
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2));
                        y3Var.x.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var2)), 4, 4));
                    } else {
                        y3Var.B.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var2));
                        y3Var.C.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var2));
                        y3Var.D.j();
                    }
                }
            }
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        this.y.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 24, 24));
    }

    public final void n() {
        boolean z10 = !this.e.d().isEmpty() || b();
        c3 c3Var = this.h;
        if (c3Var.getViewPages() != null) {
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    ((y3) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f10;
        m71 m71Var = this.n;
        if (m71Var == null) {
            return;
        }
        float min = Math.min(this.G, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.G, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        m71Var.setTranslationY(min);
        m71Var.setScaleX(lerp);
        m71Var.setScaleY(lerp);
        c3 c3Var = this.h;
        if (c3Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    f10 += ((y3) view).E ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        m71Var.setAlpha(g7.n.a(f10, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.b;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.updateInterfaces);
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        n7 n7Var = this.d;
        if (n7Var != null) {
            n7Var.o = true;
            n7Var.a();
        }
        l7 l7Var = this.e;
        if (l7Var != null) {
            l7Var.j = true;
            l7Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        y3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i9 = this.b;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
        n7 n7Var = this.d;
        if (n7Var != null) {
            n7Var.o = false;
        }
        l7 l7Var = this.e;
        if (l7Var != null) {
            l7Var.j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i9) {
        if (this.L != i9) {
            this.L = i9;
            l();
        }
    }

    public void setPaddingTop(int i9) {
        if (this.G != i9) {
            this.G = i9;
            for (View view : this.h.getViewPages()) {
                if (view instanceof y3) {
                    y3 y3Var = (y3) view;
                    s3 s3Var = y3Var.f;
                    int paddingTop = s3Var.getPaddingTop();
                    s3Var.setPadding(AndroidUtilities.dp(9.0f), this.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(s3Var, new w2(y3Var, paddingTop - s3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        y3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        p(g());
        this.n.setReordering(z10);
        if (z10) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new q2(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        t2 t2Var = this.J;
        AndroidUtilities.cancelRunOnUIThread(t2Var);
        AndroidUtilities.runOnUIThread(t2Var);
    }

    public void setVisibleHeight(int i9) {
        this.M = i9;
        l();
        c3 c3Var = this.h;
        if (c3Var != null) {
            for (View view : c3Var.getViewPages()) {
                if (view instanceof y3) {
                    ((y3) view).setVisibleHeight(this.M);
                }
            }
        }
    }
}
