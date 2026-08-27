package gh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.k7;
import hh.m7;
import hh.u7;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class d4 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap P = new HashMap();
    public final TextView A;
    public final bp B;
    public final FrameLayout C;
    public int D;
    public b70 E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public int I;
    public final o2 J;
    public final ud.a K;
    public int L;
    public int M;
    public s2 N;
    public ViewGroup O;
    public final org.telegram.ui.ActionBar.n2 a;
    public final int b;
    public final long c;
    public final m7 d;
    public final k7 e;
    public final org.telegram.ui.ActionBar.c6 f;
    public final x2 h;
    public final o71 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final lh.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d4(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        String str;
        this.D = -1;
        wq0 wq0Var = (wq0) this;
        this.J = new o2(wq0Var, 2);
        this.K = new ud.a(0, new t2(wq0Var), er.h, 380L, true);
        this.M = AndroidUtilities.displaySize.y;
        this.a = n2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat n10 = org.telegram.messenger.y1.n(MessagesController.getInstance(i10), j10);
            if (n10 != null) {
                this.c = n10.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        u7.y(i10, false).Q(this.c);
        m7 G = u7.y(i10, false).G(this.c, true);
        this.d = G;
        k7 F = u7.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).r1) {
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
        x2 x2Var = new x2(wq0Var, context, n2Var);
        this.h = x2Var;
        x2Var.setAllowDisallowInterceptTouch(true);
        x2Var.setAdapter(new y2(wq0Var, i10, c6Var));
        addView(x2Var, h7.z5.e(-1, -1, 119));
        o71 n11 = x2Var.n(10, true);
        this.n = n11;
        int i12 = org.telegram.ui.ActionBar.g6.Gh;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        int i14 = org.telegram.ui.ActionBar.g6.Eh;
        int i15 = org.telegram.ui.ActionBar.g6.Hh;
        int i16 = org.telegram.ui.ActionBar.g6.s8;
        n11.L = i12;
        n11.M = i13;
        n11.N = i14;
        n11.O = i15;
        n11.P = i16;
        n11.K.setColor(org.telegram.ui.ActionBar.g6.v0(i12, n11.f0));
        n11.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n11.setClipToPadding(false);
        n11.r = 12;
        n11.setPreTabClick(new t2(wq0Var));
        n11.setOnTabLongClick(new u2(wq0Var, i10, n2Var, context, c6Var, 0));
        addView(n11, h7.z5.e(-1, 42, 48));
        og.c cVar = new og.c();
        int i17 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
        ag.d dVar = new ag.d(context);
        mg.b bVar = new mg.b(i17, c6Var);
        lg.f fVar = new lg.f(cVar);
        fVar.n(bVar);
        fVar.o(AndroidUtilities.dp(8.0f));
        fVar.p(AndroidUtilities.dp(22.0f));
        dVar.setBackground(fVar);
        h7.b6.b(dVar, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e9 = h7.z5.e(-1, 60, 87);
        e9.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e9);
        frameLayout.addView(dVar, h7.z5.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 24, 24));
        bp bpVar = new bp(context, 24, c6Var);
        this.B = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(false, false);
        bpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(bpVar, h7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.A = textView;
        rl.l(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        dVar.addView(linearLayout, h7.z5.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        h7.b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new v2(wq0Var, n2Var, i10, r10));
        Boolean bool = G.h;
        if (bool != null) {
            bpVar.a(bool.booleanValue(), false);
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
                spannableStringBuilder.setSpan(new cq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new cq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                lh.d dVar2 = new lh.d(context, c6Var, true);
                this.w = dVar2;
                dVar2.setUseWrapContent(true);
                dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar2.g(spannableStringBuilder, false, true);
                dVar2.setStateListAnimator(null);
                dVar.addView(dVar2, h7.z5.e(-2, -1, 17));
                dVar.setOnClickListener(new w2(wq0Var, z10, i10, r10));
                dVar2.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, h7.z5.e(-1, 200, 87));
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
        spannableStringBuilder3.setSpan(new cq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new cq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        lh.d dVar22 = new lh.d(context, c6Var, true);
        this.w = dVar22;
        dVar22.setUseWrapContent(true);
        dVar22.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar22.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar22.g(spannableStringBuilder3, false, true);
        dVar22.setStateListAnimator(null);
        dVar.addView(dVar22, h7.z5.e(-2, -1, 17));
        dVar.setOnClickListener(new w2(wq0Var, z10, i10, r10));
        dVar22.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, h7.z5.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, m7 m7Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new v2(m7Var, i10, runnable, 1));
        f1Var.setOnLongClickListener(new m2(m7Var, i10, runnable));
    }

    public final void a() {
        m7 m7Var;
        t3 currentPage = getCurrentPage();
        if (currentPage == null || (m7Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = m7Var.d;
        new y3(this.a, this.c, i10, new q2(this, i10, currentPage, 0)).show();
    }

    public final boolean b() {
        k7 k7Var = this.e;
        return k7Var.h() && k7Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
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
        lh.d dVar = this.w;
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
        x2 x2Var = this.h;
        if (x2Var == null || this.n == null) {
            return;
        }
        x2Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.H) {
            return true;
        }
        t3 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.y1.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.M) + (-r0.getTop()), 1);
        if (this.M < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.M, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public m7 getCurrentList() {
        t3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public zk0 getCurrentListView() {
        t3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public t3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (t3) currentView;
    }

    public int getGiftsCount() {
        int i10;
        m7 m7Var;
        int i11;
        t3 currentPage = getCurrentPage();
        m7 m7Var2 = this.d;
        if (currentPage == null || (m7Var = currentPage.e) == m7Var2) {
            if (m7Var2 != null && (i10 = m7Var2.n) > 0) {
                return i10;
            }
        } else if (m7Var != null && (i11 = m7Var.n) > 0) {
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
        m7 m7Var = this.d;
        if (m7Var != null && !m7Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < m7Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) m7Var.l.get(i11)).gift.getDocument();
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
        x2 x2Var = this.h;
        float f10 = 0.0f;
        if (x2Var.getViewPages() != null) {
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    f10 = (((t3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        o71 o71Var = this.n;
        if (o71Var != null) {
            return o71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        w60 w60Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        b3 b3Var = new b3(this, context, c6Var);
        b3Var.lineYFix = true;
        b3Var.setOnEditorActionListener(new c3(b3Var, callback, b2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        b3Var.setTextSize(1, 18.0f);
        b3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        b3Var.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        b3Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        b3Var.setFocusable(true);
        b3Var.setInputType(147457);
        b3Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var));
        b3Var.setImeOptions(6);
        b3Var.setBackgroundDrawable(null);
        b3Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        b3Var.addTextChangedListener(new d3(b3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        b3Var.setText(str);
        linearLayout.addView(b3Var, h7.z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new ag.h0(18, b3Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f9.z(10));
        b2VarArr[0] = alertDialog$Builder.a;
        b70 b70Var = this.E;
        if (b70Var != null && (w60Var = b70Var.m) != null) {
            w60Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        int i10 = 1;
        b2VarArr[0].setOnDismissListener(new j(this, b3Var, findActivity, i10));
        b2VarArr[0].setOnShowListener(new k(i10, b3Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.d0 = false;
        b2Var.d(-1);
        b3Var.setSelection(b3Var.getText().length());
    }

    public final void i() {
        t3 currentPage = getCurrentPage();
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
            k7 k7Var = this.e;
            if (i11 < k7Var.d().size()) {
                m7 e9 = (i11 < 0 || i11 >= k7Var.d().size()) ? null : k7Var.e(((TL_stars.TL_starGiftCollection) k7Var.d().get(i11)).collection_id);
                if (e9 != null) {
                    return e9.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        jb jbVar;
        x2 x2Var = this.h;
        if (x2Var == null) {
            return;
        }
        if (x2Var.getCurrentPosition() == x2Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(x2Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((x2Var.getNextPositionAlpha() * (k(x2Var.getNextPosition()) ? 1.0f : 0.0f)) + (x2Var.getCurrentPositionAlpha() * (k(x2Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float B = nextPositionAlpha + org.telegram.messenger.y1.B(this.x, (-frameLayout.getTop()) + this.M, 1);
        boolean z10 = this.M > AndroidUtilities.dp(184.0f);
        ud.a aVar = this.K;
        aVar.a(z10, true);
        float f10 = aVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f10);
        this.C.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.L);
        frameLayout.setAlpha(f10);
        frameLayout.setVisibility(f10 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || x2Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        ec ecVar = ec.w;
        if (ecVar == null || (jbVar = ecVar.e) == null) {
            return;
        }
        jbVar.updatePosition();
    }

    public final void m() {
        lh.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        dVar.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, ((wq0) this).Q.V0(org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    t3 t3Var = (t3) view;
                    org.telegram.ui.ActionBar.c6 c6Var2 = t3Var.c;
                    if (t3Var.s != null) {
                        t3Var.w.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        TextView textView = t3Var.x;
                        int i11 = org.telegram.ui.ActionBar.g6.Oh;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var2));
                        t3Var.x.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var2)), 4, 4));
                    } else {
                        t3Var.B.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        t3Var.C.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var2));
                        t3Var.D.j();
                    }
                }
            }
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        this.y.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10 = !this.e.d().isEmpty() || b();
        x2 x2Var = this.h;
        if (x2Var.getViewPages() != null) {
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    ((t3) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f10;
        o71 o71Var = this.n;
        if (o71Var == null) {
            return;
        }
        float min = Math.min(this.G, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.G, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        o71Var.setTranslationY(min);
        o71Var.setScaleX(lerp);
        o71Var.setScaleY(lerp);
        x2 x2Var = this.h;
        if (x2Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    f10 += ((t3) view).E ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        o71Var.setAlpha(h7.n.a(f10, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        t3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.o = true;
            m7Var.a();
        }
        k7 k7Var = this.e;
        if (k7Var != null) {
            k7Var.j = true;
            k7Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.o = false;
        }
        k7 k7Var = this.e;
        if (k7Var != null) {
            k7Var.j = false;
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
                if (view instanceof t3) {
                    t3 t3Var = (t3) view;
                    n3 n3Var = t3Var.f;
                    int paddingTop = n3Var.getPaddingTop();
                    n3Var.setPadding(AndroidUtilities.dp(9.0f), this.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(n3Var, new r2(t3Var, paddingTop - n3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        t3 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new l2(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        o2 o2Var = this.J;
        AndroidUtilities.cancelRunOnUIThread(o2Var);
        AndroidUtilities.runOnUIThread(o2Var);
    }

    public void setVisibleHeight(int i10) {
        this.M = i10;
        l();
        x2 x2Var = this.h;
        if (x2Var != null) {
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    ((t3) view).setVisibleHeight(this.M);
                }
            }
        }
    }
}
