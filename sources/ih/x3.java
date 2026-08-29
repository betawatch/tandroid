package ih;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.h6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.i7;
import jh.k7;
import jh.s7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class x3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap P = new HashMap();
    public final TextView A;
    public final hp B;
    public final FrameLayout C;
    public int D;
    public j70 E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public int I;
    public final l2 J;
    public final vd.a K;
    public int L;
    public int M;
    public o2 N;
    public ViewGroup O;
    public final org.telegram.ui.ActionBar.o2 a;
    public final int b;
    public final long c;
    public final k7 d;
    public final i7 e;
    public final org.telegram.ui.ActionBar.c6 f;
    public final r2 h;
    public final y71 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final nh.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x3(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        String str;
        this.D = -1;
        gr0 gr0Var = (gr0) this;
        this.J = new l2(gr0Var, 2);
        this.K = new vd.a(0, new p2(gr0Var), jr.h, 380L, true);
        this.M = AndroidUtilities.displaySize.y;
        this.a = o2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(MessagesController.getInstance(i10), j10);
            if (p10 != null) {
                this.c = p10.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        s7.y(i10, false).Q(this.c);
        int i12 = 1;
        k7 G = s7.y(i10, false).G(this.c, true);
        this.d = G;
        i7 F = s7.y(i10, false).F(this.c, true);
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
        this.f = c6Var;
        r2 r2Var = new r2(gr0Var, context, o2Var);
        this.h = r2Var;
        r2Var.setAllowDisallowInterceptTouch(true);
        r2Var.setAdapter(new s2(gr0Var, i10, c6Var));
        addView(r2Var, i7.f6.e(-1, -1, 119));
        y71 n10 = r2Var.n(10, true);
        this.n = n10;
        int i13 = g6.Gh;
        int i14 = g6.G6;
        int i15 = g6.Eh;
        int i16 = g6.Hh;
        int i17 = g6.s8;
        n10.L = i13;
        n10.M = i14;
        n10.N = i15;
        n10.O = i16;
        n10.P = i17;
        n10.K.setColor(g6.v0(i13, n10.f0));
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new p2(gr0Var));
        n10.setOnTabLongClick(new bg.p3(gr0Var, i10, o2Var, context, c6Var, 1));
        addView(n10, i7.f6.e(-1, 42, 48));
        qg.c cVar = new qg.c();
        int i18 = g6.d6;
        cVar.a(g6.v0(i18, c6Var));
        bh.d dVar = new bh.d(context);
        og.b bVar = new og.b(i18, c6Var);
        ng.f fVar = new ng.f(cVar);
        fVar.n(bVar);
        fVar.o(AndroidUtilities.dp(8.0f));
        fVar.p(AndroidUtilities.dp(22.0f));
        dVar.setBackground(fVar);
        h6.b(dVar, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = i7.f6.e(-1, 60, 87);
        e10.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e10);
        frameLayout.addView(dVar, i7.f6.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(g6.Y(g6.v0(g6.i6, c6Var), 24, 24));
        hp hpVar = new hp(context, 24, c6Var);
        this.B = hpVar;
        hpVar.b(g6.h7, g6.j7, g6.k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(false, false);
        hpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(hpVar, i7.f6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.A = textView;
        org.telegram.ui.b.m(g6.j5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
        dVar.addView(linearLayout, i7.f6.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        h6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new bg.p2(gr0Var, o2Var, i10, i12));
        Boolean bool = G.h;
        if (bool != null) {
            hpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j11 = this.c;
            if (j11 >= 0) {
                str = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j11));
                sb2.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new iq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new iq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                nh.d dVar2 = new nh.d(context, c6Var, true);
                this.w = dVar2;
                dVar2.setUseWrapContent(true);
                dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar2.g(spannableStringBuilder, false, true);
                dVar2.setStateListAnimator(null);
                dVar.addView(dVar2, i7.f6.e(-2, -1, 17));
                dVar.setOnClickListener(new q2(gr0Var, z10, i10, r10));
                dVar2.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, i7.f6.e(-1, 200, 87));
                m();
                n();
            }
            i11 = R.string.ProfileGiftsSendChannel;
        } else {
            i11 = R.string.ProfileGiftsSend;
        }
        str = LocaleController.getString(i11);
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new iq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new iq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        nh.d dVar22 = new nh.d(context, c6Var, true);
        this.w = dVar22;
        dVar22.setUseWrapContent(true);
        dVar22.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar22.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar22.g(spannableStringBuilder3, false, true);
        dVar22.setStateListAnimator(null);
        dVar.addView(dVar22, i7.f6.e(-2, -1, 17));
        dVar.setOnClickListener(new q2(gr0Var, z10, i10, r10));
        dVar22.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, i7.f6.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, k7 k7Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new bg.p2(k7Var, i10, runnable, 2));
        g1Var.setOnLongClickListener(new j2(k7Var, i10, runnable));
    }

    public final void a() {
        k7 k7Var;
        n3 currentPage = getCurrentPage();
        if (currentPage == null || (k7Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = k7Var.d;
        new s3(this.a, this.c, i10, new bg.n3(this, i10, currentPage, 1)).show();
    }

    public final boolean b() {
        i7 i7Var = this.e;
        return i7Var.h() && i7Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
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
        nh.d dVar = this.w;
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
                this.B.a(bool.booleanValue(), true);
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
            setVisibleHeight(this.M);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.I <= 0) {
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
                if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.I) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (i10 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.I = 0;
        this.n.d(tL_starGiftCollection.collection_id, i10 + 1);
    }

    public final void f(boolean z10) {
        r2 r2Var = this.h;
        if (r2Var == null || this.n == null) {
            return;
        }
        r2Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.H) {
            return true;
        }
        n3 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.x3.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.M) + (-r0.getTop()), 1);
        if (this.M < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.M, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public k7 getCurrentList() {
        n3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public jl0 getCurrentListView() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public n3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (n3) currentView;
    }

    public int getGiftsCount() {
        int i10;
        k7 k7Var;
        int i11;
        n3 currentPage = getCurrentPage();
        k7 k7Var2 = this.d;
        if (currentPage == null || (k7Var = currentPage.e) == k7Var2) {
            if (k7Var2 != null && (i10 = k7Var2.n) > 0) {
                return i10;
            }
        } else if (k7Var != null && (i11 = k7Var.n) > 0) {
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
        k7 k7Var = this.d;
        if (k7Var != null && !k7Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < k7Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) k7Var.l.get(i11)).gift.getDocument();
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
        r2 r2Var = this.h;
        float f9 = 0.0f;
        if (r2Var.getViewPages() != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    f9 = (((n3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f9;
                }
            }
        }
        return f9;
    }

    public float getTabsVisibility() {
        y71 y71Var = this.n;
        if (y71Var != null) {
            return y71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        e70 e70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        v2 v2Var = new v2(this, context, c6Var);
        v2Var.lineYFix = true;
        v2Var.setOnEditorActionListener(new w2(v2Var, callback, c2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        v2Var.setTextSize(1, 18.0f);
        v2Var.setTextColor(g6.v0(g6.j5, c6Var));
        v2Var.setHintColor(g6.v0(g6.Xh, c6Var));
        v2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        v2Var.setFocusable(true);
        v2Var.setInputType(147457);
        v2Var.setLineColors(g6.v0(g6.k6, c6Var), g6.v0(g6.l6, c6Var), g6.v0(g6.p7, c6Var));
        v2Var.setImeOptions(6);
        v2Var.setBackgroundDrawable(null);
        v2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        v2Var.addTextChangedListener(new x2(v2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        v2Var.setText(str);
        linearLayout.addView(v2Var, i7.f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new a9.s(20, v2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new eg.c(23));
        c2VarArr[0] = alertDialog$Builder.a;
        j70 j70Var = this.E;
        if (j70Var != null && (e70Var = j70Var.m) != null) {
            e70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        int i10 = 1;
        c2VarArr[0].setOnDismissListener(new j(this, v2Var, findActivity, i10));
        c2VarArr[0].setOnShowListener(new k(i10, v2Var));
        c2VarArr[0].show();
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        c2Var.d0 = false;
        c2Var.d(-1);
        v2Var.setSelection(v2Var.getText().length());
    }

    public final void i() {
        n3 currentPage = getCurrentPage();
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
            i7 i7Var = this.e;
            if (i11 < i7Var.d().size()) {
                k7 e10 = (i11 < 0 || i11 >= i7Var.d().size()) ? null : i7Var.e(((TL_stars.TL_starGiftCollection) i7Var.d().get(i11)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        rb rbVar;
        r2 r2Var = this.h;
        if (r2Var == null) {
            return;
        }
        if (r2Var.getCurrentPosition() == r2Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(r2Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((r2Var.getNextPositionAlpha() * (k(r2Var.getNextPosition()) ? 1.0f : 0.0f)) + (r2Var.getCurrentPositionAlpha() * (k(r2Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float B = nextPositionAlpha + org.telegram.messenger.x3.B(this.x, (-frameLayout.getTop()) + this.M, 1);
        boolean z10 = this.M > AndroidUtilities.dp(184.0f);
        vd.a aVar = this.K;
        aVar.a(z10, true);
        float f9 = aVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f9);
        this.C.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.L);
        frameLayout.setAlpha(f9);
        frameLayout.setVisibility(f9 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || r2Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        mc mcVar = mc.w;
        if (mcVar == null || (rbVar = mcVar.e) == null) {
            return;
        }
        rbVar.updatePosition();
    }

    public final void m() {
        nh.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = g6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        dVar.setBackground(g6.b0(dp, ((gr0) this).Q.V0(g6.v0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n3 n3Var = (n3) view;
                    org.telegram.ui.ActionBar.c6 c6Var2 = n3Var.c;
                    if (n3Var.s != null) {
                        n3Var.w.setTextColor(g6.v0(g6.G6, c6Var2));
                        TextView textView = n3Var.x;
                        int i11 = g6.Oh;
                        textView.setTextColor(g6.v0(i11, c6Var2));
                        n3Var.x.setBackground(g6.Y(g6.l1(0.1f, g6.v0(i11, c6Var2)), 4, 4));
                    } else {
                        n3Var.B.setTextColor(g6.v0(g6.G6, c6Var2));
                        n3Var.C.setTextColor(g6.v0(g6.y6, c6Var2));
                        n3Var.D.j();
                    }
                }
            }
        }
        this.A.setTextColor(g6.v0(g6.j5, c6Var));
        this.y.setBackground(g6.Y(g6.v0(g6.i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10 = !this.e.d().isEmpty() || b();
        r2 r2Var = this.h;
        if (r2Var.getViewPages() != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f9;
        y71 y71Var = this.n;
        if (y71Var == null) {
            return;
        }
        float min = Math.min(this.G, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.G, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        y71Var.setTranslationY(min);
        y71Var.setScaleX(lerp);
        y71Var.setScaleY(lerp);
        r2 r2Var = this.h;
        if (r2Var.getViewPages() != null) {
            f9 = 0.0f;
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    f9 += ((n3) view).E ? 1.0f : 0.0f;
                }
            }
        } else {
            f9 = 0.0f;
        }
        y71Var.setAlpha(i7.w.a(f9, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        k7 k7Var = this.d;
        if (k7Var != null) {
            k7Var.o = true;
            k7Var.a();
        }
        i7 i7Var = this.e;
        if (i7Var != null) {
            i7Var.j = true;
            i7Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        k7 k7Var = this.d;
        if (k7Var != null) {
            k7Var.o = false;
        }
        i7 i7Var = this.e;
        if (i7Var != null) {
            i7Var.j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.L != i10) {
            this.L = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        if (this.G != i10) {
            this.G = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof n3) {
                    n3 n3Var = (n3) view;
                    h3 h3Var = n3Var.f;
                    int paddingTop = h3Var.getPaddingTop();
                    h3Var.setPadding(AndroidUtilities.dp(9.0f), this.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(h3Var, new n2(n3Var, paddingTop - h3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        n3 currentPage = getCurrentPage();
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
                AndroidUtilities.runOnUIThread(new i2(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        l2 l2Var = this.J;
        AndroidUtilities.cancelRunOnUIThread(l2Var);
        AndroidUtilities.runOnUIThread(l2Var);
    }

    public void setVisibleHeight(int i10) {
        this.M = i10;
        l();
        r2 r2Var = this.h;
        if (r2Var != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setVisibleHeight(this.M);
                }
            }
        }
    }
}
