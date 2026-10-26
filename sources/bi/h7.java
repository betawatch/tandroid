package bi;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.un;
import org.telegram.ui.w91;
import org.telegram.ui.yx;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class h7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int A1 = 0;
    public boolean A0;
    public final f5 B0;
    public final TextView C0;
    public final f5 D0;
    public boolean E0;
    public TL_stars.SavedStarGift F0;
    public u9 G0;
    public MessageObject H0;
    public String I0;
    public TL_stars.TL_starGiftUnique J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public o6 P0;
    public boolean Q0;
    public i5 R0;
    public final int[] S0;
    public h5 T0;
    public int U0;
    public String V0;
    public zh.f4 W0;
    public final long X;
    public zq X0;
    public final j5 Y;
    public boolean Y0;
    public final d5 Z;
    public w4 Z0;
    public final z00 a0;
    public Float a1;
    public final View b0;
    public c6 b1;
    public zh.l2 c0;
    public ValueAnimator c1;
    public zh.l2 d0;
    public zq d1;
    public final g5 e0;
    public boolean e1;
    public final b7 f0;
    public TL_wallet.nftItem f1;
    public final f5 g0;
    public org.telegram.ui.Wallet.s4 g1;
    public final z90 h0;
    public org.telegram.ui.Wallet.t4 h1;
    public final w01 i0;
    public TL_wallet.walletTransaction i1;
    public final z90 j0;
    public View j1;
    public final fi.d k0;
    public zh.b2 k1;
    public final FrameLayout l0;
    public boolean l1;
    public final z90 m0;
    public Boolean m1;
    public final FrameLayout n0;
    public boolean n1;
    public final View o0;
    public ArrayList o1;
    public final FrameLayout p0;
    public ArrayList p1;
    public d7 q0;
    public ArrayList q1;
    public boolean r0;
    public boolean r1;
    public final f5 s0;
    public TLRPC.PaymentForm s1;
    public final hi.j[] t0;
    public final zq[] t1;
    public final View u0;
    public final a2 u1;
    public final LinearLayout v0;
    public int v1;
    public final zp w0;
    public Boolean w1;
    public final TextView x0;
    public boolean x1;
    public final LinearLayout y0;
    public fi.v3 y1;
    public final zp z0;
    public View z1;

    public h7(Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var, View view) {
        super(context, null, false, false, u6Var);
        this.r0 = false;
        this.S0 = new int[2];
        this.U0 = -1;
        this.V0 = "";
        this.b1 = new c6(0, 0);
        this.e1 = true;
        this.t1 = new zq[1];
        this.u1 = new a2(this, 11);
        this.x1 = true;
        this.currentAccount = i10;
        this.X = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new bh.r(this, context, 1);
        j5 j5Var = new j5(this, context);
        this.Y = j5Var;
        d5 d5Var = new d5(this, context);
        this.Z = d5Var;
        d5Var.setAdapter(new e5(this, context, 0));
        X2();
        View view2 = new View(context);
        this.b0 = view2;
        int i11 = org.telegram.ui.ActionBar.y6.h5;
        org.telegram.ui.ActionBar.f7.i(i11, view2, u6Var);
        FrameLayout.LayoutParams i12 = gb1.i(-1, 50, 80);
        int i13 = this.backgroundPaddingLeft;
        i12.rightMargin = i13;
        i12.leftMargin = i13;
        this.containerView.addView(view2, i12);
        this.containerView.addView(d5Var, gb1.i(-1, -1, 119));
        fixNavigationBarKey(i11);
        AndroidUtilities.removeFromParent(this.d);
        j5Var.addView(this.d, gb1.i(-1, -1, 119));
        f5 f5Var = new f5(this, context, 0);
        this.g0 = f5Var;
        f5Var.setOrientation(1);
        f5Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        j5Var.addView(f5Var, gb1.i(-1, -1, 55));
        z90 z90Var = new z90(context, u6Var);
        this.h0 = z90Var;
        int i14 = org.telegram.ui.ActionBar.y6.q5;
        org.telegram.ui.ActionBar.f7.V(z90Var, i14, u6Var);
        z90Var.setTextSize(1, 12.0f);
        z90Var.setGravity(17);
        z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var.setDisablePaddingsOffsetY(true);
        f5Var.addView(z90Var, gb1.x(-2, -2, 1, 4, -2, 4, 16));
        z90Var.setVisibility(8);
        w01 w01Var = new w01(context, u6Var);
        this.i0 = w01Var;
        f5Var.addView(w01Var, gb1.o(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        z90 z90Var2 = new z90(context, u6Var);
        this.j0 = z90Var2;
        org.telegram.ui.ActionBar.f7.V(z90Var2, i14, u6Var);
        z90Var2.setTextSize(1, 12.0f);
        z90Var2.setGravity(17);
        z90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i15 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.H(z90Var2, i15, u6Var);
        z90Var2.setDisablePaddingsOffsetY(true);
        z90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        f5Var.addView(z90Var2, gb1.x(-2, -2, 1, 4, 2, 4, 8));
        z90Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.y0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        int i16 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i16, u6Var), 21, 21);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N, u6Var);
        zp zpVar = new zp(context, 24, u6Var);
        this.z0 = zpVar;
        int i17 = org.telegram.ui.ActionBar.y6.h7;
        int i18 = org.telegram.ui.ActionBar.y6.j7;
        int i19 = org.telegram.ui.ActionBar.y6.k7;
        zpVar.b(i17, i18, i19);
        zpVar.setDrawUnchecked(true);
        zpVar.a(false, false);
        zpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(zpVar, gb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i20 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i20, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AlsoShowInMyGifts));
        linearLayout.addView(textView, gb1.x(-2, -2, 16, 9, 0, 0, 0));
        f5Var.addView(linearLayout, gb1.x(-2, -2, 1, 0, -4, 0, 4));
        gb1.c(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new z1(this, 19));
        linearLayout.setVisibility(8);
        f5 f5Var2 = new f5(this, context, 1);
        this.s0 = f5Var2;
        f5Var2.setOrientation(1);
        f5Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        j5Var.addView(f5Var2, gb1.i(-1, -1, 55));
        hi.j[] jVarArr = {r9, r6, r6};
        this.t0 = jVarArr;
        hi.j jVar = new hi.j(context, u6Var, false);
        jVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        f5Var2.addView(jVarArr[0], gb1.r(-1, -2));
        hi.j jVar2 = new hi.j(context, u6Var, false);
        jVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        f5Var2.addView(jVarArr[1], gb1.r(-1, -2));
        hi.j jVar3 = new hi.j(context, u6Var, false);
        jVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        f5Var2.addView(jVarArr[2], gb1.r(-1, -2));
        View view3 = new View(context);
        this.u0 = view3;
        int i21 = org.telegram.ui.ActionBar.y6.d7;
        org.telegram.ui.ActionBar.f7.i(i21, view3, u6Var);
        f5Var2.addView(view3, gb1.w(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.v0 = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i16, u6Var), 6, 6);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i16);
        linearLayout2.setBackground(Z2);
        org.telegram.ui.ActionBar.f7.k(linearLayout2, Z2, null, N2, u6Var);
        zp zpVar2 = new zp(context, 24, u6Var);
        this.w0 = zpVar2;
        zpVar2.b(i17, i18, i19);
        zpVar2.setDrawUnchecked(true);
        zpVar2.a(false, false);
        zpVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(zpVar2, gb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.x0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i20, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout2.addView(textView2, gb1.x(-2, -2, 16, 9, 0, 0, 0));
        f5Var2.addView(linearLayout2, gb1.x(-2, -2, 1, 0, 0, 0, 4));
        gb1.c(linearLayout2, 0.025f, 1.5f);
        f5 f5Var3 = new f5(this, context, 2);
        this.B0 = f5Var3;
        f5Var3.setOrientation(1);
        f5Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        j5Var.addView(f5Var3, gb1.i(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.C0 = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i20, u6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        f5Var3.addView(textView3, gb1.x(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView4, i20, u6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        f5Var3.addView(textView4, gb1.x(-1, -2, 7, 20, 6, 20, 24));
        hi.j jVar4 = new hi.j(context, u6Var, false);
        jVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        f5Var3.addView(r11[0], gb1.r(-1, -2));
        hi.j jVar5 = new hi.j(context, u6Var, false);
        jVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        f5Var3.addView(r11[1], gb1.r(-1, -2));
        hi.j jVar6 = new hi.j(context, u6Var, false);
        hi.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        f5Var3.addView(jVarArr2[2], gb1.r(-1, -2));
        f5 f5Var4 = new f5(this, context, 3);
        this.D0 = f5Var4;
        f5Var4.setOrientation(1);
        f5Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        j5Var.addView(f5Var4, gb1.i(-1, -1, 55));
        hi.j jVar7 = new hi.j(context, u6Var, false);
        jVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        f5Var4.addView(r8[0], gb1.r(-1, -2));
        hi.j jVar8 = new hi.j(context, u6Var, false);
        jVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        f5Var4.addView(r8[1], gb1.r(-1, -2));
        hi.j jVar9 = new hi.j(context, u6Var, false);
        hi.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        f5Var4.addView(jVarArr3[2], gb1.r(-1, -2));
        f5Var.setAlpha(1.0f);
        f5Var2.setAlpha(0.0f);
        f5Var3.setAlpha(0.0f);
        f5Var4.setAlpha(0.0f);
        b7 b7Var = new b7(context, u6Var, new a2(this, 12), new z1(this, 20), new z1(this, 21), new z1(this, 22), new z1(this, 23), new z1(this, 24), new z1(this, 25), new z1(this, 26));
        this.f0 = b7Var;
        b7Var.M.c.setOnClickListener(new z1(this, 17));
        int i22 = this.backgroundPaddingLeft;
        b7Var.setPadding(i22, 0, i22, 0);
        j5Var.addView(b7Var, gb1.i(-1, -2, 55));
        ig.a0 a0Var = this.c;
        this.P = true;
        a0Var.l1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l0 = frameLayout;
        org.telegram.ui.ActionBar.f7.i(i11, frameLayout, u6Var);
        View view4 = new View(context);
        this.o0 = view4;
        org.telegram.ui.ActionBar.f7.i(i21, view4, u6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, gb1.e(-1.0f, 1.0f / AndroidUtilities.density, 55));
        fi.d f7 = vh.f(24, context, u6Var, true);
        this.k0 = f7;
        f7.i(LocaleController.getString(R.string.OK), false, true);
        f7.g(null, false);
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        h.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        h.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(f7, h);
        j5Var.addView(frameLayout, gb1.i(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n0 = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(i11, frameLayout2, u6Var);
        z90 z90Var3 = new z90(context, null);
        this.m0 = z90Var3;
        z90Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var3, i15, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var3, i15, u6Var);
        z90Var3.setGravity(17);
        frameLayout2.addView(z90Var3, gb1.h(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        j5Var.addView(frameLayout2, gb1.i(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new ai.b(this, 5));
        linearLayout2.setOnClickListener(new z1(this, 18));
        z00 z00Var = new z00(context);
        this.a0 = z00Var;
        j5Var.addView(z00Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        j5Var.addView(frameLayout3, gb1.h(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        j5Var.addView(this.e, gb1.h(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        g5 g5Var = new g5(context);
        this.e0 = g5Var;
        j5Var.addView(g5Var, gb1.i(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ai.i(g5Var, 6), 12.0f, 12, null, arrayList);
    }

    public static void A0(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            e2Var.dismiss();
            h7Var.O0 = true;
            h7Var.L2(savedStarGift, null);
            super.show();
            return;
        }
        e2Var.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(U).R(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            R.u = true;
            R.j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void B0(h7 h7Var) {
        String str;
        boolean z10;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        zq[] zqVarArr = h7Var.t1;
        fi.d dVar = h7Var.k0;
        int i11 = 1;
        if (h7Var.b1.c == 1 && !h7Var.isDismissed()) {
            TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
            MessageObject messageObject = h7Var.H0;
            long j10 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j11 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j11 <= 0) {
                }
                z10 = false;
            } else {
                TL_stars.SavedStarGift savedStarGift = h7Var.F0;
                if (savedStarGift == null) {
                    return;
                }
                long j12 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j12 <= 0) {
                }
                z10 = false;
            }
            int currentTime = ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime();
            if (h7Var.q1 != null) {
                i10 = 0;
                while (i10 < h7Var.q1.size()) {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) h7Var.q1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i10 = -1;
            starGiftUpgradePrice = null;
            if (h7Var.s1 != null) {
                int i12 = 0;
                while (i12 < h7Var.s1.invoice.prices.size()) {
                    j10 += h7Var.s1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !h7Var.r1) {
                h7Var.r1 = true;
                if (h7Var.q1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        h7Var.q1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = h7Var.w0.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(h7Var.currentAccount).getInputPeer(h7Var.X);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject q5 = hi.m3.q(h7Var.resourcesProvider, false);
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new r4(h7Var, i11));
            }
            if (z10) {
                dVar.i(dd.Q0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, zqVarArr), true, true);
            } else {
                dVar.i(dd.Q0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, zqVarArr), true, true);
            }
            d7 d7Var = h7Var.q0;
            if (d7Var != null) {
                d7Var.P(j10);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.g(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String formatDuration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            org.telegram.ui.Components.r6 r6Var = dVar.e;
            r6Var.D = false;
            r6Var.E = true;
            r6Var.F = true;
            r6Var.G = false;
            r6Var.H = false;
            dVar.g(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, formatDuration), true);
            AndroidUtilities.runOnUIThread(h7Var.u1, 1000L);
        }
    }

    public static void C0(h7 h7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        h7Var.r1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
            Z.u = true;
            Z.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(paymentForm.users, false);
            h7Var.s1 = paymentForm;
            h7Var.A2();
        }
    }

    public static /* synthetic */ void D0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new f3(h7Var, tL_starGiftUnique, aVar, runnable, 1));
            return;
        }
        h7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(h7Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g3(h7Var, tL_error, runnable, 1));
        }
    }

    public static void D2(org.telegram.ui.ActionBar.r2 r2Var) {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
        p2Var.a = true;
        U.showAsSheet(r2Var, p2Var);
    }

    public static /* synthetic */ void E0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, zh.i0 i0Var, d6 d6Var, qf.c cVar) {
        cVar.d();
        ca.x(h7Var.currentAccount, d6Var.a).h(d6Var.b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new w3(h7Var, cVar, tL_starGiftUnique, j10, i0Var, 0));
    }

    public static /* synthetic */ void F0(long j10, long j11, h7 h7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new j3(j10, j11, h7Var, callback, tLObject, tL_error));
    }

    public static void G0(final h7 h7Var, final zh.i0 i0Var, bg.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        h7Var.k0.setLoading(false);
        if (i0Var != null && i0Var.L) {
            i0Var.L = false;
            i0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new g6(h7Var.getContext(), h7Var.resourcesProvider, tL_starGiftUnique, new d6(bVar, tL_payments_paymentFormStarGift), h7Var.currentAccount, j10, h7Var.W1(), false, new Utilities.Callback2() { // from class: bi.a3
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                h7.E0(h7.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, i0Var, (d6) obj, (qf.c) obj2);
            }
        }).b();
    }

    public static SpannableStringBuilder G2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i10 = 0;
        } else {
            i10 = i11 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new a5(0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void H0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable) {
        h7Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h7Var.Y1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(updatestargiftprice, new q2(h7Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static void H1(w01 w01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        w01Var.e(str, starGiftAttribute.name, d2(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static SpannableStringBuilder H2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new zq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new zq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void I0(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void J0(h7 h7Var, vg.n1 n1Var, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        qf.c h = e2Var.h(i10, true, true);
        h.d();
        int i11 = h7Var.currentAccount;
        e4 e4Var = new e4(h7Var, h, n1Var, 1);
        org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i11);
        w10.j0(new yx(i11, e4Var, w10));
    }

    public static void K0(h7 h7Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(h7Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(h7Var.currentAccount).putChats(messages_messages.chats, false);
        h7Var.M0 = true;
        h7Var.L0 = false;
        Boolean bool = h7Var.m1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        h7Var.K2(messageObject, null);
    }

    public static /* synthetic */ void L0(h7 h7Var, qf.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, cVar, tL_starGiftUnique, 8));
            return;
        }
        h7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(h7Var, cVar, Long.parseLong(tL_error.text.substring(26)), 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, cVar, tL_error, 9));
        }
    }

    public static void N0(h7 h7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            ca.y(h7Var.currentAccount, false).T(false);
            ca.y(h7Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = h7Var.F0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            h7Var.r0 = true;
            h7Var.s1 = null;
            h7Var.J1(inputSavedStarGift, tL_payments_paymentResult.updates, new b4(h7Var, str, 0));
            Utilities.stageQueue.postRunnable(new c4(h7Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            h7Var.getBulletinFactory().g0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(h7Var.currentAccount).starsPurchaseAvailable()) {
            h7Var.k0.setLoading(false);
            ca.e0(h7Var.getContext(), h7Var.resourcesProvider);
            return;
        }
        ca y3 = ca.y(h7Var.currentAccount, false);
        b2 b2Var = new b2(h7Var, j10, 6);
        y3.e = false;
        y3.q(false, true, b2Var);
        y3.e = true;
    }

    public static void P0(h7 h7Var, Long l4) {
        TLRPC.Chat chat;
        String str = (l4.longValue() >= 0 || (chat = MessagesController.getInstance(h7Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
        org.telegram.ui.Components.qc R = h7Var.getBulletinFactory().R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        R.u = true;
        R.j();
    }

    public static /* synthetic */ void Q(h7 h7Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(h7Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, e2Var, messageObject, 13));
        } else {
            AndroidUtilities.runOnUIThread(new q4(e2Var, 0));
        }
    }

    public static void Q0(h7 h7Var, qf.c cVar, vg.n1 n1Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        int i10 = 1;
        int i11 = 0;
        if (org.telegram.ui.Wallet.l0.w(h7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            cVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            String string = LocaleController.getString(R.string.WalletNotEnoughGram);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatSpannable(R.string.WalletNotEnoughGramToTransferGift, org.telegram.ui.Wallet.l0.m(stargiftdepositpayload.amount, false));
            alertDialog$Builder.h(LocaleController.getString(R.string.WalletNotNow), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.WalletTopUp), new ai.f0(4, h7Var, n1Var));
            alertDialog$Builder.p();
            return;
        }
        TLRPC.User user = j10 > 0 ? MessagesController.getInstance(h7Var.currentAccount).getUser(Long.valueOf(j10)) : null;
        long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        int i12 = h7Var.currentAccount;
        org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i12);
        e4 e4Var = new e4(h7Var, cVar, n1Var, i11);
        f4 f4Var = j10 != clientUserId ? null : new f4(i12, clientUserId, document);
        try {
            w10.b0(user, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.l0.T(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, nftitem, null, e4Var, f4Var != null ? new org.telegram.ui.Wallet.s(i10, w10, f4Var) : null, org.telegram.ui.Wallet.l0.g(stargiftdepositpayload));
        } catch (Exception e) {
            org.telegram.ui.Wallet.l0.j("depositNFT: invalid payload", e);
            e4Var.run(e.getMessage() == null ? "NULL_ERROR" : e.getMessage());
        }
    }

    public static void R(h7 h7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        a2 a2Var = h7Var.u1;
        h7Var.r1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
            Z.u = true;
            Z.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(paymentForm.users, false);
            h7Var.s1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(a2Var);
            AndroidUtilities.runOnUIThread(a2Var);
        }
    }

    public static boolean R0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, cy cyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(h7Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.g5.m0(h7Var.getContext(), h7Var.resourcesProvider, h7Var.currentAccount, tL_starGiftUnique, giftThemeUser, new y2(h7Var, j10, tL_starGiftUnique, cyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(h7Var.currentAccount).setDialogTheme(j10, new hg.b(null, tL_starGiftUnique.slug));
        cyVar.presentFragment(un.ba(j10), true);
        return true;
    }

    public static boolean R1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift == starGift2) {
            return true;
        }
        return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
    }

    public static /* synthetic */ void S(h7 h7Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new ai.e0(h7Var, tL_error, tLObject, inputSavedStarGift, 8));
    }

    public static void S0(h7 h7Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        h7Var.l1 = true;
        h7Var.K2(messageObject, null);
        h7Var.U2(0, true, null);
        z00 z00Var = h7Var.a0;
        if (z00Var != null) {
            z00Var.c(true);
        }
        ca.y(h7Var.currentAccount, false).P();
        t9 G = ca.y(h7Var.currentAccount, false).G(UserConfig.getInstance(h7Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.k(arrayList, starGift);
        }
    }

    public static boolean S1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static void T(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void T0(h7 h7Var, boolean z10, qf.c cVar, Runnable runnable, DialogInterface dialogInterface, Boolean bool) {
        if (!bool.booleanValue()) {
            cVar.c(false);
            dialogInterface.dismiss();
            runnable.run();
        } else {
            UserConfig userConfig = UserConfig.getInstance(h7Var.currentAccount);
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
            h7Var.v2(z10, cVar, runnable);
        }
    }

    public static void U(final h7 h7Var) {
        TL_stars.SavedStarGift savedStarGift = h7Var.F0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            q9 F = ca.y(h7Var.currentAccount, false).F(h7Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = h7Var.F0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = h7Var.Y1();
            savestargift.unsave = h7Var.F0.unsaved;
            ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = h7Var.F0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((t9) h7Var.G0).o(savedStarGift3, !z10, false)) {
            new zh.q2(h7Var.getContext(), h7Var.X, h7Var.F0, h7Var.resourcesProvider, new Utilities.Callback0Return() { // from class: bi.n2
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return h7.this.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z10) {
            org.telegram.messenger.t.q(R.string.Gift2Unpinned, h7Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            h7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static /* synthetic */ void U0(h7 h7Var, long j10) {
        tc tcVar = new tc(h7Var.getContext(), h7Var.resourcesProvider, j10, 10, null, new f2(6, h7Var, new boolean[]{false}), 0L);
        tcVar.setOnDismissListener(new i4(h7Var, 0));
        tcVar.show();
    }

    public static void V(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.e2 e2Var) {
        h7Var.getClass();
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h7Var.Y1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(updatestargiftprice, new h2(h7Var, h, tL_starGiftUnique, 1));
    }

    public static /* synthetic */ void V0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h7Var.Y1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(updatestargiftprice, new q2(h7Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static /* synthetic */ void W(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new a1.f(29, h7Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new f2(0, e2Var, tL_error));
    }

    public static void W0(final h7 h7Var, int i10, int i11, int i12, vg.n1[] n1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, Long l4) {
        final vg.n1[] n1VarArr2;
        int i13;
        int i14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i15 = 3;
        int i16 = 7;
        if (l4.longValue() == -99) {
            n1VarArr2 = n1VarArr;
            i13 = i10;
        } else {
            if (l4.longValue() != -98) {
                a3.l0 l0Var = new a3.l0(h7Var, l4, n1VarArr, i16);
                if (l4.longValue() < 0) {
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(h7Var.currentAccount).getChatFull(-l4.longValue());
                    if (chatFull == null) {
                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                        tL_channels_getFullChannel.channel = MessagesController.getInstance(h7Var.currentAccount).getInputChannel(-l4.longValue());
                        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_channels_getFullChannel, new j(i15, h7Var, l0Var));
                        return;
                    } else if (!chatFull.stargifts_available) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                        String string = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (l4.longValue() >= 0) {
                    TLRPC.User user = MessagesController.getInstance(h7Var.currentAccount).getUser(l4);
                    TLRPC.UserFull userFull = MessagesController.getInstance(h7Var.currentAccount).getUserFull(l4.longValue());
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        new org.telegram.ui.Components.wc(n1VarArr[0].container, h7Var.resourcesProvider).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                        return;
                    } else if (userFull == null && user != null) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.id = MessagesController.getInstance(h7Var.currentAccount).getInputUser(user);
                        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_users_getFullUser, new i2(h7Var, n1VarArr, l4, l0Var, 0));
                        return;
                    }
                }
                l0Var.run();
                return;
            }
            i13 = i10;
            n1VarArr2 = n1VarArr;
        }
        if (i13 < i11) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.R = string2;
            e2Var2.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        if (l4.longValue() != -98) {
            LinearLayout linearLayout = new LinearLayout(h7Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new b6(h7Var.getContext(), tL_starGiftUnique), gb1.x(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(h7Var.getContext());
            int i17 = org.telegram.ui.ActionBar.y6.j5;
            org.telegram.messenger.t.r(textView, i17, h7Var.resourcesProvider, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, gb1.x(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(h7Var.getContext());
            org.telegram.ui.ActionBar.f7.V(textView2, i17, h7Var.resourcesProvider);
            textView2.setTextSize(1, 16.0f);
            vh.o(R.string.Gift2ExportTONFragmentText, new Object[]{h7Var.W1()}, textView2);
            linearLayout.addView(textView2, gb1.x(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            alertDialog$Builder3.o(linearLayout);
            final int i18 = 1;
            alertDialog$Builder3.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new org.telegram.ui.ActionBar.b2(h7Var) { // from class: bi.g2
                public final /* synthetic */ h7 b;

                {
                    this.b = h7Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var3, int i19) {
                    switch (i18) {
                        case 0:
                            qf.c h = e2Var3.h(i19, true, true);
                            vg.n1 n1Var = n1VarArr2[0];
                            Objects.requireNonNull(n1Var);
                            this.b.T2(true, e2Var3, h, new vg.a1(n1Var, 11));
                            break;
                        default:
                            qf.c h10 = e2Var3.h(i19, true, true);
                            vg.n1 n1Var2 = n1VarArr2[0];
                            Objects.requireNonNull(n1Var2);
                            this.b.T2(false, e2Var3, h10, new vg.a1(n1Var2, 11));
                            break;
                    }
                }
            });
            ic.a.r(R.string.Cancel, alertDialog$Builder3, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
        String string3 = LocaleController.getString(R.string.Gift2MoveToMyWallet);
        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder4.a;
        e2Var3.R = string3;
        e2Var3.T = LocaleController.getString(R.string.Gift2MoveToMyWalletText);
        String s10 = org.telegram.ui.Wallet.l0.w(h7Var.currentAccount).s();
        LinearLayout linearLayout2 = new LinearLayout(h7Var.getContext());
        linearLayout2.setOrientation(1);
        if (TextUtils.isEmpty(s10)) {
            i14 = 3;
        } else {
            TextView textView3 = new TextView(h7Var.getContext());
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            textView3.setTextSize(1, 16.5f);
            textView3.setLetterSpacing(0.01818182f);
            textView3.setLineSpacing(AndroidUtilities.dp(23.0f) - textView3.getPaint().getFontMetricsInt(null), 1.0f);
            textView3.setIncludeFontPadding(false);
            textView3.setGravity(17);
            textView3.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
            int i19 = org.telegram.ui.ActionBar.y6.j5;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i19, h7Var.resourcesProvider);
            i14 = 3;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.y6.o1(0.045f, w02));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.045f, i19);
            org.telegram.ui.ActionBar.u6 u6Var = h7Var.resourcesProvider;
            textView3.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(textView3, c02, L, null, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.r5, h7Var.resourcesProvider);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length = (s10.length() + 3) / 4;
            for (int i20 = 0; i20 < length; i20++) {
                if (i20 > 0) {
                    spannableStringBuilder.append((CharSequence) (i20 % 4 == 0 ? "\n" : " "));
                }
                int length2 = spannableStringBuilder.length();
                int i21 = i20 * 4;
                spannableStringBuilder.append((CharSequence) s10, i21, Math.min(s10.length(), i21 + 4));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i20 / 4) + (i20 % 4)) % 2 == 0 ? w02 : w03), length2, spannableStringBuilder.length(), 33);
            }
            textView3.setText(spannableStringBuilder);
            linearLayout2.addView(textView3, gb1.o(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
        }
        TextView textView4 = new TextView(h7Var.getContext());
        textView4.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.j5, h7Var.resourcesProvider);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
        linearLayout2.addView(textView4, gb1.o(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(h7Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        int i22 = R.drawable.msg_settings;
        int i23 = org.telegram.ui.ActionBar.y6.r5;
        h7Var.I1(linearLayout3, i22, 14, i23, LocaleController.getString(R.string.Settings), true);
        h7Var.I1(linearLayout3, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.y6.Oh, LocaleController.getString(R.string.WalletAttachMoney), true);
        h7Var.I1(linearLayout3, R.drawable.menu_gift, 14, i23, LocaleController.getString(R.string.WalletCollectibles), false);
        linearLayout2.addView(linearLayout3, gb1.x(-2, -2, 1, 0, 7, 0, 3));
        h7Var.x1 = true;
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(h7Var.getContext(), 1, h7Var.resourcesProvider);
        int i24 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i24, h7Var.resourcesProvider), 7, AndroidUtilities.dp(12.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i24);
        org.telegram.ui.ActionBar.u6 u6Var2 = h7Var.resourcesProvider;
        y1Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var2);
        y1Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        int i25 = 5;
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        layoutParams.gravity = i14 | 16;
        y1Var.getCheckBoxView().setLayoutParams(layoutParams);
        y1Var.e(LocaleController.getString(R.string.Gift2KeepOnProfile), "", true, false, false);
        y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        y1Var.setOnClickListener(new q(i25, h7Var, y1Var));
        linearLayout2.addView(y1Var, gb1.o(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
        alertDialog$Builder4.o(linearLayout2);
        e2Var3.G = 20;
        final int i26 = 0;
        alertDialog$Builder4.k(LocaleController.getString(R.string.Gift2Move), new org.telegram.ui.ActionBar.b2(h7Var) { // from class: bi.g2
            public final /* synthetic */ h7 b;

            {
                this.b = h7Var;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var32, int i192) {
                switch (i26) {
                    case 0:
                        qf.c h = e2Var32.h(i192, true, true);
                        vg.n1 n1Var = n1VarArr2[0];
                        Objects.requireNonNull(n1Var);
                        this.b.T2(true, e2Var32, h, new vg.a1(n1Var, 11));
                        break;
                    default:
                        qf.c h10 = e2Var32.h(i192, true, true);
                        vg.n1 n1Var2 = n1VarArr2[0];
                        Objects.requireNonNull(n1Var2);
                        this.b.T2(false, e2Var32, h10, new vg.a1(n1Var2, 11));
                        break;
                }
            }
        });
        ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
    }

    public static void X(h7 h7Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, cy cyVar) {
        ChatThemeController.getInstance(h7Var.currentAccount).setDialogTheme(j10, new hg.b(null, tL_starGiftUnique.slug));
        cyVar.presentFragment(un.ba(j10), true);
    }

    public static /* synthetic */ void X0(h7 h7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TL_account.tmpPassword)) {
            h7Var.o2(tL_error, twoStepVerificationActivity, z10);
            return;
        }
        TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
        UserConfig.getInstance(h7Var.currentAccount).tmpPassword = tmppassword;
        UserConfig.getInstance(h7Var.currentAccount).saveConfig(false);
        h7Var.g2(tmppassword.tmp_password, twoStepVerificationActivity, z10, null);
    }

    public static String X1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return org.telegram.messenger.t.i(r3.num, ',', sb2);
    }

    public static void Y(h7 h7Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        q9 F;
        TLRPC.Message message;
        fi.d dVar = h7Var.k0;
        if (dVar.Q) {
            return;
        }
        TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
        MessageObject messageObject = h7Var.H0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = h7Var.F0;
            if (savedStarGift == null) {
                return;
            }
            z10 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z10 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z10 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z12 = z10;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = Y1;
        if (h7Var.F0 == null || (F = ca.y(h7Var.currentAccount, false).F(h7Var.X, false)) == null) {
            z11 = false;
        } else {
            F.m(h7Var.F0, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(savestargift, new s4(h7Var, z11, document2, z12, savestargift));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bc, code lost:
    
        if (r12 != null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y0(h7 h7Var, View view) {
        boolean z10;
        boolean z11;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean i22;
        TLRPC.Message message;
        String Z1 = h7Var.Z1();
        TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        j5 j5Var = h7Var.Y;
        j5Var.getLocationInWindow(new int[2]);
        k80 F = k80.F(j5Var, h7Var.resourcesProvider, view);
        boolean z12 = (h7Var.e2() == null || !i2(h7Var.currentAccount, DialogObject.getPeerDialogId(h7Var.e2().owner_id)) || !(h7Var.G0 instanceof t9) || h7Var.F0 == null || h7Var.Y1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = h7Var.F0;
        F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new a2(h7Var, 13), z12);
        F.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new a2(h7Var, 16), h7Var.L1());
        F.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new a2(h7Var, 17), (h7Var.e2() == null || !i2(h7Var.currentAccount, DialogObject.getPeerDialogId(h7Var.e2().owner_id)) || h7Var.e2().resell_amount == null) ? false : true);
        F.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new b4(h7Var, Z1, 7), Z1 != null);
        F.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new a2(h7Var, 18), Z1 != null);
        F.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new a2(h7Var, 19), e22 != null && e22.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique e23 = h7Var.e2();
        if (e23 != null && e23.theme_available) {
            long peerDialogId = DialogObject.getPeerDialogId(e23.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(e23.host_id);
            if ((peerDialogId > 0 && i2(h7Var.currentAccount, peerDialogId)) || (peerDialogId2 > 0 && i2(h7Var.currentAccount, peerDialogId2))) {
                z10 = true;
                F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new a2(h7Var, 20), z10);
                boolean z13 = h7Var.f1 != null && h7Var.E0 && h7Var.F0 != null && h2(h7Var.currentAccount, h7Var.X);
                TL_stars.SavedStarGift savedStarGift2 = h7Var.F0;
                F.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, LocaleController.getString((savedStarGift2 != null || savedStarGift2.unsaved) ? R.string.Gift2ShowOnProfile : R.string.Gift2HideFromProfile), new a2(h7Var, 6), z13);
                if (h7Var.f1 == null) {
                    if (h7Var.Y1() != null) {
                        MessageObject messageObject = h7Var.H0;
                        if (messageObject != null && (message = messageObject.messageOwner) != null) {
                            TLRPC.MessageAction messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                        i22 = i2(h7Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                        if (i22) {
                                            z11 = true;
                                            F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a2(h7Var, 21), z11);
                                            F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a2(h7Var, 22), h7Var.f1 != null);
                                            F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a2(h7Var, 14), (h7Var.F0 == null || h7Var.U1() == 0) ? false : true);
                                            F.m(R.drawable.msg_delete, new a2(h7Var, 15), LocaleController.getString(R.string.Gift2DeleteOption), h7Var.M1(), true);
                                            F.t = false;
                                            F.Y = true;
                                            F.s = 0;
                                            F.a0(r2[0] + h7Var.backgroundPaddingLeft, -AndroidUtilities.dp(2.0f));
                                            F.Z();
                                        }
                                    }
                                }
                            }
                        }
                        TL_stars.SavedStarGift savedStarGift3 = h7Var.F0;
                        if (savedStarGift3 != null) {
                            TL_stars.StarGift starGift2 = savedStarGift3.gift;
                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                i22 = i2(h7Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                                if (i22) {
                                }
                            }
                        }
                        tL_starGiftUnique = h7Var.J0;
                    }
                    i22 = false;
                    if (i22) {
                    }
                }
                z11 = false;
                F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a2(h7Var, 21), z11);
                F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a2(h7Var, 22), h7Var.f1 != null);
                F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a2(h7Var, 14), (h7Var.F0 == null || h7Var.U1() == 0) ? false : true);
                F.m(R.drawable.msg_delete, new a2(h7Var, 15), LocaleController.getString(R.string.Gift2DeleteOption), h7Var.M1(), true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(r2[0] + h7Var.backgroundPaddingLeft, -AndroidUtilities.dp(2.0f));
                F.Z();
            }
        }
        z10 = false;
        F.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new a2(h7Var, 20), z10);
        if (h7Var.f1 != null) {
        }
        TL_stars.SavedStarGift savedStarGift22 = h7Var.F0;
        F.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, LocaleController.getString((savedStarGift22 != null || savedStarGift22.unsaved) ? R.string.Gift2ShowOnProfile : R.string.Gift2HideFromProfile), new a2(h7Var, 6), z13);
        if (h7Var.f1 == null) {
        }
        z11 = false;
        F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a2(h7Var, 21), z11);
        F.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new a2(h7Var, 22), h7Var.f1 != null);
        F.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new a2(h7Var, 14), (h7Var.F0 == null || h7Var.U1() == 0) ? false : true);
        F.m(R.drawable.msg_delete, new a2(h7Var, 15), LocaleController.getString(R.string.Gift2DeleteOption), h7Var.M1(), true);
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.a0(r2[0] + h7Var.backgroundPaddingLeft, -AndroidUtilities.dp(2.0f));
        F.Z();
    }

    public static void Z(final h7 h7Var) {
        int i10;
        long peerDialogId;
        long j10;
        long j11;
        final long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
        if (Y1 == null) {
            return;
        }
        MessageObject messageObject = h7Var.H0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = h7Var.H0;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j11 = peer != null ? DialogObject.getPeerDialogId(peer) : isOutOwner ? messageObject2.getDialogId() : clientUserId;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : h7Var.H0.getDialogId();
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = h7Var.F0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? UserObject.ANONYMOUS : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j10 = h7Var.F0.convert_stars;
            j11 = h7Var.X;
        }
        int max = Math.max(1, (MessagesController.getInstance(h7Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.b2() { // from class: bi.p4
            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i11) {
                h7.r0(h7.this, Y1, j13, clientUserId, j12);
            }
        });
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static /* synthetic */ void Z0(h7 h7Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.yc[] ycVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new x1(h7Var.getContext(), h7Var.resourcesProvider, h7Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            h7Var.R2(ycVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, hi.k.F0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void a0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.e2 e2Var) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new g4(h7Var, h, e2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static /* synthetic */ void a1(h7 h7Var, long j10, long j11, Utilities.Callback callback) {
        tc tcVar = new tc(h7Var.getContext(), h7Var.resourcesProvider, j10, 11, null, new y2(h7Var, new boolean[]{false}, j11, callback, 2), 0L);
        tcVar.setOnDismissListener(new i4(h7Var, 1));
        tcVar.show();
    }

    public static void b0(h7 h7Var, String str) {
        long j10 = h7Var.X;
        h7Var.k0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            h7Var.U2(0, true, null);
            return;
        }
        h7Var.dismiss();
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        if (R instanceof un) {
            un unVar = (un) R;
            if (unVar.a() == j10) {
                org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(h7Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
        NotificationCenter.getInstance(h7Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
        un ba2 = un.ba(j10);
        ba2.whenFullyVisible(new f2(5, h7Var, ba2));
        R.presentFragment(ba2);
    }

    public static void b1(h7 h7Var, TLObject tLObject, vg.n1[] n1VarArr, Long l4, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
            Z.u = true;
            Z.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(h7Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            l0Var.run();
        } else {
            new org.telegram.ui.Components.wc(n1VarArr[0].container, h7Var.resourcesProvider).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
        }
    }

    public static void c0(h7 h7Var) {
        TLRPC.Message message;
        TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
        if (Y1 == null) {
            return;
        }
        long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
        MessageObject messageObject = h7Var.H0;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                if (peer != null) {
                    clientUserId = DialogObject.getPeerDialogId(peer);
                }
                long j10 = clientUserId;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2DeleteOption);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2DeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i(h7Var, Y1, j10, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            }
        }
        if (h7Var.F0 != null) {
            clientUserId = h7Var.X;
            long j102 = clientUserId;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.Gift2DeleteOption);
            alertDialog$Builder2.a.T = LocaleController.getString(R.string.Gift2DeleteText);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new i(h7Var, Y1, j102, 1));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
        }
    }

    public static void c1(h7 h7Var, String str, long j10) {
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
        p2Var.a = true;
        zh.h4 h4Var = new zh.h4(h7Var.X, str, j10, h7Var.resourcesProvider);
        h4Var.e = new y3(h7Var, 0);
        R.showAsSheet(h4Var, p2Var);
    }

    public static void d1(h7 h7Var, vg.n1[] n1VarArr, Long l4) {
        if (l4.longValue() != -97) {
            if (l4.longValue() == -99 || l4.longValue() == -98) {
                return;
            }
            h7Var.x2(l4.longValue(), 0L, false, new d3(h7Var, l4, n1VarArr, 1));
            return;
        }
        vg.n1 n1Var = n1VarArr[0];
        TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        if (h7Var.f1 == null || e22 == null || TextUtils.isEmpty(e22.slug)) {
            return;
        }
        long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
        TextView textView = new TextView(h7Var.getContext());
        textView.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.y6.r5;
        org.telegram.ui.ActionBar.f7.V(textView, i10, h7Var.resourcesProvider);
        textView.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new ea0(AndroidUtilities.dp(160.0f), textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
        Runnable[] runnableArr = new Runnable[1];
        boolean[] zArr = new boolean[1];
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = MessagesController.getInstance(h7Var.currentAccount).getInputPeer(clientUserId);
        depositstargift.slug = e22.slug;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequestTyped(depositstargift, new org.telegram.messenger.a(), new t3(h7Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2MoveToMyGifts);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2MoveToMyGiftsText);
        TLRPC.User currentUser = UserConfig.getInstance(h7Var.currentAccount).getCurrentUser();
        LinearLayout linearLayout = new LinearLayout(h7Var.getContext());
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(h7Var.getContext());
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.045f, org.telegram.ui.ActionBar.y6.w0(i11, h7Var.resourcesProvider)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.045f, i11);
        org.telegram.ui.ActionBar.u6 u6Var = h7Var.resourcesProvider;
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, L, null, u6Var);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(h7Var.getContext());
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.r(currentUser);
        y9Var.f(currentUser, j9Var);
        frameLayout.addView(y9Var, gb1.h(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(h7Var.getContext());
        ic.a.o(16.0f, 1, textView2);
        org.telegram.ui.ActionBar.f7.V(textView2, i11, h7Var.resourcesProvider);
        textView2.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setText(Emoji.replaceEmoji(UserObject.getUserName(currentUser), textView2.getPaint().getFontMetricsInt(), false));
        frameLayout.addView(textView2, gb1.h(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
        TextView textView3 = new TextView(h7Var.getContext());
        textView3.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView3, i10, h7Var.resourcesProvider);
        textView3.setSingleLine();
        textView3.setEllipsize(truncateAt);
        if (currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
            textView3.setText(kf.b.c().b("+" + currentUser.phone));
        } else if (currentUser != null && UserObject.getPublicUsername(currentUser) != null) {
            textView3.setText("@" + UserObject.getPublicUsername(currentUser));
        }
        frameLayout.addView(textView3, gb1.h(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
        linearLayout.addView(frameLayout, gb1.o(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
        TextView textView4 = new TextView(h7Var.getContext());
        textView4.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView4, i11, h7Var.resourcesProvider);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
        linearLayout.addView(textView4, gb1.o(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(h7Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        h7Var.I1(linearLayout2, R.drawable.msg_openprofile, 14, i10, LocaleController.getString(R.string.MyProfile), true);
        h7Var.I1(linearLayout2, R.drawable.menu_gift, 14, i10, LocaleController.getString(R.string.ProfileGifts), false);
        linearLayout.addView(linearLayout2, gb1.x(-2, -2, 1, 0, 7, 0, 3));
        linearLayout.addView(textView, gb1.o(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.a.G = 20;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2Move), new ag.j0(h7Var, clientUserId, stargiftdepositpayloadArr, n1Var, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        u3 u3Var = new u3(0, zArr, runnableArr);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.setOnDismissListener(u3Var);
        e2Var.show();
    }

    public static String d2(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i10 <= 0 ? "<0.1%" : hi.k.F0(i10);
    }

    public static /* synthetic */ void e0(h7 h7Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(h7Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, tLObject, messageObject, 10));
        }
    }

    public static void e1(h7 h7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        h7Var.J0 = tL_starGiftUnique;
        h7Var.M2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void f0(h7 h7Var, qf.c cVar, vg.n1 n1Var, String str) {
        cVar.b();
        if (str != null) {
            (n1Var != null ? new org.telegram.ui.Components.wc(n1Var.container, h7Var.resourcesProvider) : h7Var.getBulletinFactory()).f0(str, false);
            return;
        }
        if (n1Var != null) {
            n1Var.dismiss();
        }
        h7Var.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U instanceof org.telegram.ui.Wallet.m5) {
            ((org.telegram.ui.Wallet.m5) U).K0();
        }
    }

    public static void f1(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, MessageObject messageObject) {
        e2Var.dismiss();
        h7Var.M0 = true;
        h7Var.K2(messageObject, null);
        super.show();
    }

    public static void g0(h7 h7Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = findUpdates.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    messageObject = null;
                    break;
                }
                Object obj = findUpdates.get(i11);
                i11++;
                TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    messageObject = new MessageObject(h7Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new ai.e0(h7Var, messageObject, arrayList, starGift, 6));
                return;
            }
            callback2.run(null, null);
            ca.y(h7Var.currentAccount, false).P();
            t9 G = ca.y(h7Var.currentAccount, false).G(UserConfig.getInstance(h7Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.k(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, new di.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    h7Var.getBulletinFactory().g0(tL_error, false);
                    runnable.run();
                }
                long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime();
                alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, new di.b());
                String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
                e2Var2.R = string2;
                e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                i10 = R.string.OK;
            }
            org.telegram.messenger.t.p(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void g1(h7 h7Var) {
        Bundle bundle = new Bundle();
        long j10 = h7Var.X;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(h7Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        D2(new ProfileActivity(bundle, null));
    }

    public static void h0(h7 h7Var, qf.c cVar, vg.n1 n1Var, String str) {
        cVar.c(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        (n1Var != null ? new org.telegram.ui.Components.wc(n1Var.container, h7Var.resourcesProvider) : h7Var.getBulletinFactory()).f0(str, false);
    }

    public static boolean h2(int i10, long j10) {
        return j10 >= 0 ? UserConfig.getInstance(i10).getClientUserId() == j10 : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static /* synthetic */ void i0(h7 h7Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        zh.f4 f4Var = h7Var.W0;
        if (f4Var != null) {
            f4Var.b();
            h7Var.W0 = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new s2(h7Var, callback2, arrayList, runnable, 0));
    }

    public static /* synthetic */ void i1(h7 h7Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.yc[] ycVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift V1 = h7Var.V1();
        GiftAuctionController.getInstance(h7Var.currentAccount).requestAuctionUpgrades(V1.gift_id, new b3(h7Var, V1, starGiftAttribute, ycVarArr, zArr, 0));
    }

    public static boolean i2(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return chat != null && chat.creator;
    }

    public static /* synthetic */ void j0(h7 h7Var, String str) {
        h7Var.dismiss();
        qf.d.r(h7Var.getContext(), "https://" + MessagesController.getInstance(h7Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void j1(final h7 h7Var) {
        final TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        if (e22 == null || TextUtils.isEmpty(e22.slug)) {
            return;
        }
        final boolean z10 = e22.host_id == null;
        if (h7Var.w1 == null) {
            h7Var.w1 = Boolean.valueOf(!z10);
        }
        h7Var.O2(e22, z10);
        final int i10 = h7Var.v1 + 1;
        h7Var.v1 = i10;
        TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
        displaystargift.peer = z10 ? MessagesController.getInstance(h7Var.currentAccount).getInputPeer(UserConfig.getInstance(h7Var.currentAccount).getClientUserId()) : null;
        displaystargift.slug = e22.slug;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequestTyped(displaystargift, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: bi.d2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z11 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                h7 h7Var2 = h7.this;
                if (z11) {
                    h7Var2.w1 = Boolean.valueOf(z10);
                    return;
                }
                if (i10 != h7Var2.v1) {
                    return;
                }
                h7Var2.O2(e22, h7Var2.w1.booleanValue());
                h7Var2.getBulletinFactory().f0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
            }
        });
    }

    public static boolean j2(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void k0(h7 h7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                h7Var.getBulletinFactory().g0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(h7Var.currentAccount).starsPurchaseAvailable()) {
                    h7Var.k0.setLoading(false);
                    ca.e0(h7Var.getContext(), h7Var.resourcesProvider);
                    return;
                }
                ca y3 = ca.y(h7Var.currentAccount, false);
                a3.h0 h0Var = new a3.h0(h7Var, j12, j10, callback, 1);
                y3.e = false;
                y3.q(false, true, h0Var);
                y3.e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(h7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        ca.y(h7Var.currentAccount, false).T(false);
        ca.y(h7Var.currentAccount, false).Q(j10);
        ca.y(h7Var.currentAccount, false).Q(j11);
        ca.y(h7Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            if (j10 < 0 || j11 < 0) {
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.u = true;
                M.j();
            } else {
                un ba2 = un.ba(j10);
                ba2.whenFullyVisible(new s3(h7Var, ba2, j10, 1));
                U.presentFragment(ba2);
            }
        }
        Utilities.stageQueue.postRunnable(new c4(h7Var, tL_payments_paymentResult, i10));
    }

    public static void k1(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        e2Var.c(400L);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                h7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                h7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        h7Var.dismiss();
        ca.y(h7Var.currentAccount, false).Q(j10);
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            w91 w91Var = new w91(bundle);
            m0.g(h7Var.currentAccount).h(j10, true);
            m0.g(h7Var.currentAccount).l(j10);
            w91Var.whenFullyVisible(new r3(w91Var, j12, i10));
            U.presentFragment(w91Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(h7Var.currentAccount).getUserFull(j11);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        ca.y(h7Var.currentAccount, false).P();
        ca.y(h7Var.currentAccount, false).T(true);
        if (U instanceof dd) {
            org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
            return;
        }
        dd ddVar = new dd();
        ddVar.whenFullyVisible(new r3(ddVar, j12, i11));
        U.presentFragment(ddVar);
    }

    public static void l1(h7 h7Var, TLObject tLObject, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
            Z.u = true;
            Z.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(h7Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(h7Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            l0Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
    }

    public static void m1(h7 h7Var, qf.c cVar, TLObject tLObject, long j10, TLRPC.TL_error tL_error) {
        cVar.c(false);
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                h7Var.getBulletinFactory().g0(tL_error, false);
                return;
            } else {
                h7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(h7Var.currentAccount).getUserFull(j10);
            if (userFull != null) {
                int max = Math.max(0, userFull.stargifts_count - 1);
                userFull.stargifts_count = max;
                if (max <= 0) {
                    userFull.flags2 &= -257;
                }
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(h7Var.currentAccount).getChatFull(-j10);
            if (chatFull != null) {
                int max2 = Math.max(0, chatFull.stargifts_count - 1);
                chatFull.stargifts_count = max2;
                if (max2 <= 0) {
                    chatFull.flags2 &= -262145;
                }
            }
        }
        if (h7Var.F0 != null) {
            ca y3 = ca.y(h7Var.currentAccount, false);
            TL_stars.SavedStarGift savedStarGift = h7Var.F0;
            if (savedStarGift != null) {
                t9 G = y3.G(j10, false);
                if (G != null) {
                    G.l(savedStarGift);
                }
                q9 q9Var = (q9) y3.K.get(j10);
                if (q9Var != null) {
                    ArrayList arrayList = q9Var.e;
                    int size = arrayList.size();
                    boolean z10 = false;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                        t9 e = q9Var.e(tL_starGiftCollection.collection_id);
                        boolean z11 = e != null && e.l(savedStarGift);
                        if (z11 || savedStarGift.collection_id.contains(Integer.valueOf(tL_starGiftCollection.collection_id))) {
                            tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                            z10 = true;
                        }
                        if (z11) {
                            q9Var.n(tL_starGiftCollection.collection_id);
                        }
                    }
                    t9 t9Var = q9Var.g;
                    if (t9Var != null) {
                        t9Var.l(savedStarGift);
                    }
                    if (z10) {
                        q9Var.j();
                        NotificationCenter.getInstance(q9Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(q9Var.b), q9Var);
                    }
                }
            }
        } else {
            ca.y(h7Var.currentAccount, false).Q(j10);
        }
        h7Var.dismiss();
        AndroidUtilities.runOnUIThread(new ag.c(3));
    }

    public static void n0(h7 h7Var, qf.c cVar, vg.n1 n1Var, q3 q3Var, TL_stars.starGiftDepositPayload stargiftdepositpayload, TLRPC.TL_error tL_error) {
        if (stargiftdepositpayload != null) {
            q3Var.run(stargiftdepositpayload);
        } else {
            cVar.b();
            (n1Var != null ? new org.telegram.ui.Components.wc(n1Var.container, h7Var.resourcesProvider) : h7Var.getBulletinFactory()).g0(tL_error, false);
        }
    }

    public static void n1(final h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String W1 = h7Var.W1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ApplicationLoader.applicationContext, 3, null);
        e2Var.r(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: bi.r2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final h7 h7Var2 = h7.this;
                final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = W1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        h7.o0(h7.this, e2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void o0(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        w01 w01Var;
        LinearLayout linearLayout;
        CharSequence charSequence;
        float f7;
        float f10;
        e2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                h7Var.getBulletinFactory().g0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        int i10 = 1;
        org.telegram.ui.ActionBar.k3 i11 = vh.i(1, h7Var.getContext(), h7Var.resourcesProvider, false);
        LinearLayout linearLayout2 = new LinearLayout(h7Var.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(h7Var.getContext());
        dd.Y0(y9Var.getImageReceiver(), document, 160);
        linearLayout2.addView(y9Var, gb1.x(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(h7Var.getContext());
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, h7Var.resourcesProvider);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        int dp = AndroidUtilities.dp(21.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i12, h7Var.resourcesProvider));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.u6 u6Var = h7Var.resourcesProvider;
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(textView, c02, N, null, u6Var);
        textView.setGravity(17);
        linearLayout2.addView(textView, gb1.x(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(h7Var.getContext());
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, h7Var.resourcesProvider);
        textView2.setGravity(17);
        linearLayout2.addView(textView2, gb1.x(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            vh.o(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            vh.o(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            vh.o(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(h7Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        t0 t0Var = new t0(h7Var, new fi.v3[1], frameLayout, i10);
        w01 w01Var2 = new w01(h7Var.getContext(), h7Var.resourcesProvider);
        frameLayout.addView(w01Var2, gb1.i(-1, -1, 119));
        w01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb2 = new StringBuilder("⭐️");
        sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb2.append(" (~");
        w01Var2.c(string, dd.W0(false, a1.g.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            w01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (round > 0) {
                w01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
            } else {
                w01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            o3 o3Var = new o3(t0Var, new org.telegram.ui.Components.yc[]{(org.telegram.ui.Components.yc) ((t01) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            w01Var = w01Var2;
            TableRow e = w01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", o3Var, null);
            e.setOnClickListener(new ai.s(o3Var, 7));
        } else {
            w01Var = w01Var2;
        }
        int i13 = 8;
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            o3 o3Var2 = new o3(t0Var, new org.telegram.ui.Components.yc[]{(org.telegram.ui.Components.yc) ((t01) r3.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow e10 = w01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", o3Var2, null);
            e10.setOnClickListener(new ai.s(o3Var2, i13));
        }
        linearLayout2.addView(frameLayout, gb1.x(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            fi.d dVar = new fi.d(h7Var.getContext(), h7Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            f7 = 1.0f;
            f10 = 2.0f;
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.c6(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.i(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            charSequence = " ";
            linearLayout = linearLayout2;
            dVar.setOnClickListener(new p3(h7Var, str2, j10, 0));
            linearLayout.addView(dVar, gb1.x(-1, 42, 7, 0, 0, 0, 2));
        } else {
            linearLayout = linearLayout2;
            charSequence = " ";
            f7 = 1.0f;
            f10 = 2.0f;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            fi.d dVar2 = new fi.d(h7Var.getContext(), h7Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c6(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append(charSequence);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.i(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
            dVar2.setOnClickListener(new q(6, h7Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, gb1.x(-1, 42, 7, 0, 0, 0, 0));
        }
        i11.customView = linearLayout;
        i11.show();
    }

    public static void o1(h7 h7Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
            Z.u = true;
            Z.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(h7Var.currentAccount).putUsers(paymentForm.users, false);
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j12 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j12 += tL_labeledPrice.amount;
        }
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new v2(h7Var, j10, j11, callback, j12));
    }

    public static void p0(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void p1(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void q0(h7 h7Var) {
        TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        new b1(h7Var.getContext(), h7Var.currentAccount, DialogObject.getPeerDialogId(e22.owner_id), e22, h7Var.resourcesProvider, new a2(h7Var, 4)).show();
    }

    public static void q1(h7 h7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, org.telegram.ui.ActionBar.e2 e2Var) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
        deletestargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(deletestargift, new i3(h7Var, h, j10, 0));
    }

    public static void r0(h7 h7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ApplicationLoader.applicationContext, 3, null);
        e2Var.r(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(convertstargift, new v2(h7Var, e2Var, j10, j11, j12));
    }

    public static void r1(h7 h7Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                h7Var.getBulletinFactory().g0(tL_error, false);
                return;
            }
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
        int size = arrayList.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j10 += tL_labeledPrice.amount;
        }
        LinearLayout linearLayout = new LinearLayout(h7Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView L = gb1.L(h7Var.getContext(), 16.0f, org.telegram.ui.ActionBar.y6.j5, false, null);
        L.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(L, gb1.o(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        w01 w01Var = new w01(h7Var.getContext(), h7Var.resourcesProvider);
        u01 a2 = w01Var.a(charSequence);
        a2.setFilled(true);
        xh.n nVar = (xh.n) a2.getChildAt(0);
        nVar.setTextSize(1, 12.0f);
        nVar.setGravity(17);
        linearLayout.addView(w01Var, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(dd.P0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new x3(h7Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
        alertDialog$Builder.p();
    }

    public static /* synthetic */ void s0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new f3(h7Var, tL_starGiftUnique, aVar, runnable, 0));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g3(h7Var, tL_error, runnable, 0));
        }
    }

    public static void s1(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (h7Var.W0 == null) {
            zh.f4 f4Var = new zh.f4(h7Var.currentAccount, tL_starGiftUnique.gift_id);
            h7Var.W0 = f4Var;
            f4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            x5[] x5VarArr = h7Var.f0.M.n;
            if (i10 >= x5VarArr.length) {
                zh.g4 g4Var = new zh.g4(h7Var.getContext(), tL_starGiftUnique.title, h7Var.W0);
                g4Var.g0.addAll(hashSet);
                g4Var.i0.O(true);
                g4Var.h0 = bool.booleanValue();
                g4Var.e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                g4Var.f0 = new p2(0, callback);
                g4Var.show();
                return;
            }
            TL_stars.StarGift starGift = x5VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.id));
            }
            i10++;
        }
    }

    public static void t0(h7 h7Var) {
        if (h7Var.s1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < h7Var.s1.invoice.prices.size(); i10++) {
            j10 += h7Var.s1.invoice.prices.get(i10).amount;
        }
        d7 d7Var = new d7(h7Var.getContext(), j10, h7Var.p1, h7Var.resourcesProvider);
        h7Var.q0 = d7Var;
        d7Var.show();
    }

    public static void u0(h7 h7Var, TLRPC.TL_error tL_error, Utilities.Callback callback, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLObject tLObject) {
        if (h7Var.getContext() == null) {
            return;
        }
        if (tL_error != null && callback != null && tL_error.text.startsWith("TMP_PASSWORD")) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (tL_error != null) {
            h7Var.o2(tL_error, twoStepVerificationActivity, z10);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.p0();
            twoStepVerificationActivity.finishFragment();
        }
        if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
            qf.d.t(h7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                org.telegram.ui.Components.wc.c0("NULL_ERROR");
                return;
            }
            return;
        }
        TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(h7Var.currentAccount);
        org.telegram.ui.Wallet.g gVar = w10.z;
        Object obj = null;
        String str = e22 != null ? e22.gift_address : null;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        w10.x = str;
        w10.y = 0;
        if (w10.o == null) {
            w10.o = new org.telegram.ui.Wallet.d0(w10);
        }
        org.telegram.ui.Wallet.d0 d0Var = w10.o;
        if (!d0Var.j) {
            d0Var.b();
            d0Var.f(true);
        }
        w10.A().g();
        w10.C();
        int i10 = w10.y;
        if (i10 < 7) {
            w10.y = i10 + 1;
            AndroidUtilities.runOnUIThread(gVar, org.telegram.ui.Wallet.l0.P[i10]);
        }
        if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
            AndroidUtilities.runOnUIThread(new a3.l0(obj, e22.getDocument(), LocaleController.getString(R.string.Gift2MovedToWallet), 12));
        }
        h7Var.dismiss();
    }

    public static void u1(h7 h7Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        cVar.c(false);
        e2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new tc(h7Var.getContext(), h7Var.resourcesProvider, j10, 16, null, new f2(8, h7Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    h7Var.getBulletinFactory().g0(tL_error, false);
                    return;
                }
                return;
            }
        }
        int i10 = 0;
        while (i10 < tL_starGiftUnique.attributes.size()) {
            if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                tL_starGiftUnique.attributes.remove(i10);
                i10--;
            }
            i10++;
        }
        TL_stars.SavedStarGift savedStarGift = h7Var.F0;
        h7Var.M2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new f2(7, h7Var, tL_starGiftUnique));
    }

    public static void v0(h7 h7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        q9 F;
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z10 && h7Var.F0 != null && (F = ca.y(h7Var.currentAccount, false).F(h7Var.X, false)) != null) {
                    F.m(h7Var.F0, !savestargift.unsave);
                }
                h7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        h7Var.dismiss();
        long U1 = h7Var.U1();
        if (!z10) {
            ca.y(h7Var.currentAccount, false).Q(U1);
        }
        if (U1 >= 0) {
            org.telegram.ui.Components.wc.b0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z11 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), U instanceof ProfileActivity ? null : new bh.z0(U1, U))).k(true);
        } else {
            org.telegram.ui.Components.wc.b0(U).s(document, LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public static void v1(h7 h7Var, boolean z10) {
        int a2 = h7Var.a2();
        if (a2 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + a2;
        int i11 = h7Var.U0;
        if (i11 >= 0 && (!z10 ? i11 < a2 : i11 > a2)) {
            i10 = i11;
        }
        u9 u9Var = h7Var.G0;
        Object obj = (u9Var == null || i10 < 0 || i10 >= u9Var.f()) ? null : h7Var.G0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? h7Var.d0 : h7Var.c0) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (R1((z10 ? h7Var.d0 : h7Var.c0).F0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (S1((z10 ? h7Var.d0 : h7Var.c0).J0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        zh.l2 l2Var = new zh.l2(h7Var, h7Var.getContext(), h7Var.currentAccount, h7Var.X, h7Var.resourcesProvider, h7Var.Y.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            l2Var.L2((TL_stars.SavedStarGift) obj, h7Var.G0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            l2Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, h7Var.G0);
        }
        AndroidUtilities.removeFromParent(l2Var.containerView);
        if (z10) {
            h7Var.d0 = l2Var;
        } else {
            h7Var.c0 = l2Var;
        }
    }

    public static void w0(h7 h7Var, boolean[] zArr, TextView textView, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, Runnable[] runnableArr, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        Runnable cVar;
        if (zArr[0]) {
            return;
        }
        if (stargiftdepositpayload == null) {
            textView.setVisibility(8);
            return;
        }
        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
        if (org.telegram.ui.Wallet.l0.w(h7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            textView.setVisibility(8);
            return;
        }
        org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(h7Var.currentAccount);
        ai.e eVar = new ai.e(textView, 7);
        try {
            boolean[] zArr2 = new boolean[1];
            w10.j0(new org.telegram.ui.Wallet.w6(w10, zArr2, eVar, org.telegram.ui.Wallet.l0.g(stargiftdepositpayload), 4));
            cVar = new org.telegram.ui.Wallet.m(zArr2, 3);
        } catch (Exception e) {
            org.telegram.ui.Wallet.l0.j("emulateDepositNFT: invalid payload", e);
            AndroidUtilities.runOnUIThread(new zc1(17, eVar, e));
            cVar = new ag.c(25);
        }
        runnableArr[0] = cVar;
    }

    public static void x0(h7 h7Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        h7Var.k0.setLoading(false);
        v4 v4Var = new v4(h7Var, 0);
        tg.j0 j0Var = new tg.j0(26, h7Var.currentAccount, h7Var.getContext(), v4Var, h7Var.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new k3(h7Var, chat);
        }
        j0Var.show();
    }

    public static void x1(final h7 h7Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        fi.lb b10 = view instanceof org.telegram.ui.Cells.k7 ? fi.nb.b((org.telegram.ui.Cells.k7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = h7Var.H0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(h7Var.V1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) h7Var.V1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(h7Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(h7Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(h7Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final fi.sb D = fi.sb.D(launchActivity, h7Var.currentAccount);
        D.R = new Utilities.Callback4() { // from class: bi.e2
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                fi.sb sbVar = D;
                fi.lb lbVar = null;
                if (booleanValue) {
                    h7 h7Var2 = h7.this;
                    AndroidUtilities.runOnUIThread(new f2(1, h7Var2, l4));
                    sbVar.X(null);
                    w4 w4Var = h7Var2.Z0;
                    if (w4Var != null) {
                        w4Var.dismiss();
                        h7Var2.Z0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.k7) && view2.isAttachedToWindow()) {
                        lbVar = fi.nb.b((org.telegram.ui.Cells.k7) view2);
                    }
                    sbVar.X(lbVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, fi.w7.y(arrayList));
    }

    public static void y0(long j10, long j11, h7 h7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        h7 h7Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            j12 = j10;
            h7Var2 = h7Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j12 = j10;
            h7Var2 = h7Var;
            org.telegram.ui.Components.wc.b0(U).g0(tL_error, false);
        } else if (j10 < 0 || j11 < 0) {
            j12 = j10;
            h7Var2 = h7Var;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var2.W1(), DialogObject.getShortName(j12))), R.raw.forward);
            M.u = true;
            M.j();
        } else {
            un ba2 = un.ba(j10);
            j12 = j10;
            h7Var2 = h7Var;
            ba2.whenFullyVisible(new s3(h7Var2, ba2, j12, 0));
            U.presentFragment(ba2);
        }
        ca.y(h7Var2.currentAccount, false).Q(j12);
        ca.y(h7Var2.currentAccount, false).Q(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A2() {
        long j10;
        boolean z10;
        boolean z11;
        char c10;
        int i10;
        String string;
        String string2;
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        }
        if (this.o1 != null) {
            if (j10 > 0 || this.s1 != null) {
                long j11 = 0;
                if (this.s1 != null) {
                    for (int i11 = 0; i11 < this.s1.invoice.prices.size(); i11++) {
                        j11 += this.s1.invoice.prices.get(i11).amount;
                    }
                }
                o6 o6Var = this.P0;
                b7 b7Var = this.f0;
                if (o6Var == null) {
                    this.P0 = new o6(b7Var);
                }
                o6 o6Var2 = this.P0;
                ArrayList arrayList = this.o1;
                b7 b7Var2 = o6Var2.a;
                ArrayList arrayList2 = o6Var2.g;
                ArrayList arrayList3 = o6Var2.f;
                ArrayList arrayList4 = o6Var2.e;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ((m6) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = ca.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = m10.get(i13);
                    i13++;
                    m6 m6Var = new m6(b7Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (b7Var2.isAttachedToWindow() && m6Var.c) {
                        m6Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(m6Var);
                }
                ArrayList m11 = ca.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = m11.get(i14);
                    i14++;
                    arrayList3.add(new l6((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = ca.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = m12.get(i15);
                    i15++;
                    arrayList2.add(new n6((TL_stars.starGiftAttributePattern) obj4));
                }
                b7Var.setPreviewingAttributes(this.o1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j12 = this.X;
                if (z10) {
                    z11 = true;
                    b7Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j12)), null);
                } else {
                    z11 = true;
                    b7Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                fi.d dVar = this.k0;
                dVar.setFilled(z11);
                dVar.g(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.q1 != null) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= this.q1.size()) {
                                break;
                            }
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.q1.get(i16);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                            i16++;
                        }
                    }
                    ArrayList arrayList5 = this.p1;
                    FrameLayout frameLayout = this.n0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.m0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new a2(this, 3)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    W2();
                    zq[] zqVarArr = this.t1;
                    if (z10) {
                        dVar.i(dd.Q0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j11)), 1.13f, zqVarArr), true, true);
                    } else {
                        dVar.i(dd.Q0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j11)), 1.13f, zqVarArr), true, true);
                    }
                } else {
                    dVar.i(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new z1(this, 6));
                View view = this.u0;
                LinearLayout linearLayout = this.v0;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                int i17 = 2;
                hi.j[] jVarArr = this.t0;
                if (z10) {
                    hi.j jVar = jVarArr[c10];
                    int i18 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z10) {
                        int i19 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i10 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c10] = DialogObject.getShortName(this.currentAccount, j12);
                        string = LocaleController.formatString(i19, objArr);
                    } else {
                        i10 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    jVar.a(string3, string, i18);
                    hi.j jVar2 = jVarArr[i10];
                    int i20 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z10) {
                        int i21 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j12);
                        string2 = LocaleController.formatString(i21, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    jVar2.a(string4, string2, i20);
                    jVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z10 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j12)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    jVarArr[c10].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    jVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    jVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new b2(this, j11, i17));
            }
        }
    }

    public final void B2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (this.f1 == null || e22 == null || TextUtils.isEmpty(e22.slug)) {
            return;
        }
        Context context = getContext();
        int i10 = this.currentAccount;
        int i11 = 1;
        vg.n1[] n1VarArr = {new vg.n1(context, i10, BirthdayController.getInstance(i10).getState(), 3, this.resourcesProvider)};
        vg.n1 n1Var = n1VarArr[0];
        n1Var.z0 = LocaleController.getString(R.string.Gift2TransferShort);
        org.telegram.ui.Components.xa xaVar = n1Var.e;
        if (xaVar != null) {
            xaVar.setTitle(n1Var.y());
        }
        vg.g1 g1Var = n1Var.b0;
        if (g1Var != null) {
            g1Var.setText(n1Var.y());
        }
        vg.n1 n1Var2 = n1VarArr[0];
        n1Var2.G0 = true;
        n1Var2.h0(false, true);
        vg.n1 n1Var3 = n1VarArr[0];
        n1Var3.B0 = new ai.n1(i11, this, n1VarArr);
        n1Var3.show();
    }

    public final void C2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final bg.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final zh.i0 i0Var) {
        this.k0.setLoading(true);
        if (i0Var != null && !i0Var.L) {
            i0Var.L = true;
            i0Var.H.h(true);
        }
        ca.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() { // from class: bi.k2
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                h7.G0(h7.this, i0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    public final SpannableStringBuilder E2(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, b10.j("@", publicUsername)), new b4(this, publicUsername, 8));
    }

    public final SpannableStringBuilder F2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return E2(starGift.released_by);
    }

    public final void G1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        o6 o6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        h7 h7Var;
        ai.e0 e0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c10 = 0;
        }
        if (!this.Q0 && ((o6Var = this.P0) == null || !o6Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.yc[] ycVarArr = new org.telegram.ui.Components.yc[1];
            Integer[] numArr = new Integer[1];
            String d22 = d2(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                e0Var = new ai.e0(this, zArr, starGiftAttribute2, ycVarArr, 5);
                h7Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                h7Var = this;
                e0Var = null;
            }
            ycVarArr[0] = (org.telegram.ui.Components.yc) ((t01) h7Var.i0.e(string, starGiftAttribute2.name, d22, e0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        t6 t6Var = new t6(getContext(), this.resourcesProvider, new j2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        w01 w01Var = this.i0;
        tableRow.addView(new v01(w01Var, string), layoutParams);
        tableRow.addView(new t01(w01Var, t6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        w01Var.addView(tableRow);
        o6 o6Var2 = this.P0;
        if (o6Var2 != null) {
            if (c10 == 0) {
                o6Var2.d = t6Var;
            }
            if (c10 == 1) {
                o6Var2.c = t6Var;
            }
            if (c10 == 2) {
                o6Var2.b = t6Var;
            }
        }
    }

    public final void I1(LinearLayout linearLayout, int i10, int i11, int i12, String str, boolean z10) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i10);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView, i12, u6Var, mode);
        linearLayout.addView(imageView, gb1.x(i11, i11, 16, i11 < 15 ? 1 : 0, 0, i11 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.y6.r5;
        org.telegram.ui.ActionBar.f7.V(textView, i13, this.resourcesProvider);
        textView.setText(str);
        linearLayout.addView(textView, gb1.x(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.f7.t(imageView2, i13, this.resourcesProvider, mode);
            linearLayout.addView(imageView2, gb1.x(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void I2(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, new h4(this, twoStepVerificationActivity, z10, 0));
    }

    public final void J1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ca.y(this.currentAccount, false).Q(U1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            ca.y(this.currentAccount, false).Q(U1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.Q0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i11 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i11 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                L2(savedStarGift2, this.G0);
                this.o1 = null;
                this.Q0 = false;
                u9 u9Var = this.G0;
                if (u9Var != null) {
                    u9Var.e();
                } else {
                    ca.y(this.currentAccount, false).Q(this.X);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.G0 == null) {
            ca.y(this.currentAccount, false).Q(U1());
        }
        this.Q0 = true;
        this.F0 = null;
        this.E0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        K2(messageObject, this.G0);
        this.o1 = null;
        this.Q0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final void J2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, u9 u9Var) {
        o6 o6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.I0 = str;
        this.J0 = tL_starGiftUnique;
        this.G0 = u9Var;
        this.K0 = (tL_starGiftUnique.resell_amount == null || h2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.Q0 && (o6Var = this.P0) != null && o6Var.o && (tL_starGiftUnique2 = o6Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            o6Var.a();
            this.P0 = null;
            b7 b7Var = this.f0;
            b7Var.b.setAlpha(1.0f);
            b7Var.c.setAlpha(0.0f);
        }
        this.e0.b(this.currentAccount, this.F0);
        M2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.i1;
        z90 z90Var = this.h0;
        if (wallettransaction != null || !z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            z90Var.setVisibility(8);
        } else {
            z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            z90Var.setVisibility(0);
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.i1;
        z90 z90Var2 = this.j0;
        if (wallettransaction2 != null || z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            z90Var2.setVisibility(8);
        } else {
            z90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            z90Var2.setVisibility(0);
        }
        Y2();
        if (this.K0) {
            N2(tL_starGiftUnique);
            this.k0.setOnClickListener(new z1(this, 12));
        }
        if (this.e1) {
            U2(0, false, null);
            this.c.n0(1);
            this.e1 = false;
        }
        X2();
    }

    public final boolean K1() {
        TLRPC.Peer peer;
        if (Y1() == null) {
            return false;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.H0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.H0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && i2(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.H0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.X;
                if (i2(i10, j10)) {
                    int i11 = this.F0.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x0349, code lost:
    
        if (i2(r54.currentAccount, org.telegram.messenger.DialogObject.getPeerDialogId(r8)) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x035a, code lost:
    
        if (r41 > 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x039b, code lost:
    
        if (r40 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x039d, code lost:
    
        if (r25 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x03a1, code lost:
    
        if (r42 <= 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03a3, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2Info2OutUpgrade, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03b5, code lost:
    
        if (r31 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03b7, code lost:
    
        if (r26 != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03b9, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatString(org.telegram.messenger.R.string.Gift2InfoOutPinned, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03c5, code lost:
    
        if (r26 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03c7, code lost:
    
        r1 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03cc, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r11, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03ca, code lost:
    
        r1 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03d9, code lost:
    
        if (r26 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03db, code lost:
    
        if (r36 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03dd, code lost:
    
        r1 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03ea, code lost:
    
        r1 = org.telegram.messenger.LocaleController.formatPluralStringComma(r1, (int) r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03e0, code lost:
    
        r1 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03e3, code lost:
    
        if (r36 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03e5, code lost:
    
        r1 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03e8, code lost:
    
        r1 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0399, code lost:
    
        if (r7 > 0) goto L186;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x040c  */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [org.telegram.ui.Components.v01[], org.telegram.ui.Components.yc[], org.telegram.ui.Components.zq[]] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K2(MessageObject messageObject, u9 u9Var) {
        long j10;
        TLRPC.Peer peer;
        boolean z10;
        TLRPC.Peer peer2;
        boolean z11;
        TL_stars.StarGift starGift;
        long j11;
        long j12;
        int i10;
        TLRPC.Peer peer3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        TLRPC.Peer peer4;
        boolean z17;
        int i11;
        String formatString;
        String string;
        long j13;
        String str2;
        char c10;
        CharSequence charSequence;
        int i12;
        CharSequence concat;
        int i13;
        w01 w01Var;
        TL_stars.StarGift starGift2;
        boolean z18;
        int i14;
        boolean z19;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TL_stars.StarGift starGift4;
        boolean z20;
        boolean z21;
        int i15;
        ?? r82;
        String string2;
        SpannableStringBuilder replaceTags;
        o6 o6Var;
        String string3;
        boolean z22;
        TLObject userOrChat;
        boolean z23;
        o6 o6Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift Y1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        this.E0 = false;
        this.F0 = null;
        this.H0 = messageObject;
        this.G0 = u9Var;
        this.e0.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z24 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z25 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i16 = 3;
        b7 b7Var = this.f0;
        fi.d dVar = this.k0;
        if (z25 || (((z22 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.Q0 && (o6Var = this.P0) != null && o6Var.o && o6Var.l != null) {
                o6Var.a();
                this.P0 = null;
                b7Var.b.setVisibility(0);
                b7Var.c.setVisibility(4);
            }
            boolean isOutOwner = z24 ? false : messageObject.isOutOwner();
            TLRPC.Message message = messageObject.messageOwner;
            int i17 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z26 = tL_messageActionStarGift.converted;
                boolean z27 = tL_messageActionStarGift.saved;
                boolean z28 = tL_messageActionStarGift.refunded;
                boolean z29 = tL_messageActionStarGift.name_hidden;
                starGift = tL_messageActionStarGift.gift;
                boolean z30 = tL_messageActionStarGift.can_upgrade;
                j10 = clientUserId;
                long j14 = tL_messageActionStarGift.convert_stars;
                long j15 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                TLRPC.Peer peer5 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer6 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                TLRPC.Peer peer7 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                int i18 = tL_messageActionStarGift.gift_num;
                peer3 = peer7;
                i10 = i18;
                z13 = z26;
                peer = peer5;
                z10 = z27;
                z12 = z30;
                j11 = j15;
                tL_textWithEntities = tL_textWithEntities3;
                z11 = z28;
                peer2 = peer6;
                z14 = z29;
                j12 = j14;
            } else {
                j10 = clientUserId;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                boolean z31 = tL_messageActionStarGiftUnique.saved;
                boolean z32 = tL_messageActionStarGiftUnique.refunded;
                TL_stars.StarGift starGift5 = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                z10 = z31;
                peer2 = tL_messageActionStarGiftUnique.peer;
                z11 = z32;
                starGift = starGift5;
                j11 = 0;
                j12 = 0;
                i10 = 0;
                peer3 = null;
                tL_textWithEntities = null;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
                str = null;
            }
            z16 = z24;
            long j16 = this.X;
            String shortName = DialogObject.getShortName(j16);
            peer4 = peer3;
            TLRPC.Peer peer8 = peer;
            boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j16)));
            boolean z33 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean j22 = j2(this.currentAccount, e2());
            Z1();
            b7Var.f(starGift, false, false, j22);
            b7Var.setShowOptions(M1());
            CharSequence charSequence2 = "";
            int i19 = 2;
            if (z16) {
                if (i10 == 0 || starGift.title == null) {
                    z17 = isOutOwner;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z17 = isOutOwner;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    string2 = org.telegram.messenger.t.i(i10, ',', sb2);
                }
                this.V0 = string2;
                if (z11) {
                    replaceTags = null;
                } else if (z12) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j12 > 0) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j12));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                b7Var.i(0, string2, replaceTags, F2(starGift));
            } else {
                z17 = isOutOwner;
                if (z33 && !this.E0) {
                    b7Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, F2(starGift));
                } else if ((z17 || z12) && j11 > 0) {
                    String string4 = LocaleController.getString(z17 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    this.V0 = string4;
                    if (z11) {
                        formatString = null;
                    } else if (z17) {
                        i11 = 0;
                        formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                        b7Var.i(i11, string4, formatString, F2(starGift));
                    } else {
                        formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                    }
                    i11 = 0;
                    b7Var.i(i11, string4, formatString, F2(starGift));
                } else {
                    if (i10 == 0 || starGift.title == null) {
                        string = LocaleController.getString(z17 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        string = org.telegram.messenger.t.i(i10, ',', sb3);
                    }
                    this.V0 = string;
                    if (z11) {
                        j13 = j11;
                        concat = null;
                        i12 = 0;
                    } else {
                        if (!isBot && Y1() != null) {
                            MessageObject messageObject2 = this.H0;
                            if (messageObject2 != null) {
                                TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z34 = tL_messageActionStarGift2.peer != null;
                                    messageObject2.isOutOwner();
                                    this.H0.getDialogId();
                                    UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.H0.messageOwner.date);
                                    if (z34) {
                                        TLRPC.Peer peer9 = tL_messageActionStarGift2.peer;
                                        if (peer9 != null) {
                                            i13 = currentTime;
                                            j13 = j11;
                                        }
                                    } else {
                                        i13 = currentTime;
                                        j13 = j11;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z17) {
                                        str2 = LocaleController.formatString((!z12 || j13 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        str2 = LocaleController.getString(!z10 ? z33 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z33 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                }
                            } else {
                                j13 = j11;
                                TL_stars.SavedStarGift savedStarGift = this.F0;
                                if (savedStarGift != null) {
                                    int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                    if (i2(this.currentAccount, j16)) {
                                        int i20 = this.F0.flags;
                                        if (((j16 < 0 ? 2048 : 8) & i20) != 0) {
                                            if ((i20 & 16) != 0) {
                                                if ((i20 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z17) {
                                }
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str2);
                            if (isBot && K1()) {
                                c10 = 1;
                                charSequence = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new a2(this, 10)), true);
                            } else {
                                c10 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        j13 = j11;
                        if (z17) {
                        }
                        SpannableStringBuilder replaceTags22 = AndroidUtilities.replaceTags(str2);
                        if (isBot) {
                        }
                        c10 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i12 = 0;
                        charSequenceArr2[0] = replaceTags22;
                        charSequenceArr2[c10] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    b7Var.i(i12, string, concat, F2(starGift));
                    w01Var = this.i0;
                    w01Var.removeAllViews();
                    long peerDialogId = peer8 == null ? DialogObject.getPeerDialogId(peer8) : z17 ? j10 : j16;
                    if (peer2 == null) {
                        j16 = DialogObject.getPeerDialogId(peer2);
                    } else if (!z17) {
                        j16 = j10;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    int i21 = 7;
                    if (peer4 == null) {
                        long peerDialogId2 = DialogObject.getPeerDialogId(peer4);
                        this.i0.m(LocaleController.getString(R.string.Gift2To), this.currentAccount, peerDialogId2, new b2(this, peerDialogId2, i21), null, z33 ? null : new b2(this, peerDialogId2, 8));
                    } else {
                        if (peerDialogId != j10 || z15 || z33) {
                            this.i0.m(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new b2(this, peerDialogId, 9), (peerDialogId == j10 || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z33) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), z33 ? null : new b2(this, peerDialogId, 10));
                        }
                        if (j16 != j10 || z33) {
                            this.i0.m(LocaleController.getString(R.string.Gift2To), this.currentAccount, j16, new b2(this, j16, 11), null, z33 ? null : new b2(this, j16, 12));
                        }
                    }
                    w01Var.g(i17, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift.stars > 0) {
                        String string5 = LocaleController.getString(R.string.Gift2Value);
                        String i22 = org.telegram.messenger.t.i(starGift.stars + j13, ',', new StringBuilder("⭐️ "));
                        if (!K1() || z11) {
                            r82 = 0;
                        } else {
                            r82 = 0;
                            charSequence2 = org.telegram.ui.Components.zc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j12), new a2(this, 7), this.resourcesProvider, null);
                        }
                        w01Var.c(string5, dd.W0(false, TextUtils.concat(i22, " ", charSequence2), 0.8f, r82), r82, r82);
                    }
                    if (starGift.limited && !z11) {
                        dd.D0(w01Var, this.currentAccount, starGift, this.resourcesProvider);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z11) {
                        w01Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z17 && z12 && !z11) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.d1 == null) {
                            i15 = 0;
                            this.d1 = new zq(0, new c7(dVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider)));
                        } else {
                            i15 = 0;
                        }
                        spannableStringBuilder.setSpan(this.d1, i15, 1, 33);
                        starGift2 = starGift;
                        spannableStringBuilder.append((CharSequence) (j13 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.i(spannableStringBuilder, !this.e1, true);
                        dVar.g(null, !this.e1);
                        dVar.setOnClickListener(new z1(this, 16));
                    } else {
                        starGift2 = starGift;
                        if (this.r0 || this.Z == null || this.G0 == null || a2() < 0 || this.G0.c(a2()) < 0) {
                            if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z18 = true;
                                dVar.setFilled(true);
                                dVar.i(LocaleController.getString(R.string.OK), !this.e1, true);
                                dVar.g(null, !this.e1);
                                dVar.setOnClickListener(new z1(this, 14));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.d1 == null) {
                                    i14 = 0;
                                    this.d1 = new zq(0, new c7(dVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider)));
                                } else {
                                    i14 = 0;
                                }
                                z18 = true;
                                spannableStringBuilder2.setSpan(this.d1, i14, 1, 33);
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder2, !this.e1, true);
                                dVar.g(null, !this.e1);
                                dVar.setOnClickListener(new z1(this, 13));
                            }
                            tL_textWithEntities2 = tL_textWithEntities;
                            starGift4 = starGift2;
                            z20 = z11;
                            z21 = z10;
                        } else {
                            dVar.setFilled(false);
                            int c11 = this.G0.c(a2());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                            Object obj = this.G0.get(c11);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                z19 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z19 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.c6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            dVar.i(spannableStringBuilder3, this.e1 ^ z19, z19);
                            dVar.g(null, this.e1 ^ z19);
                            dVar.setOnClickListener(new w2(this, c11, i19));
                        }
                    }
                    z18 = true;
                    tL_textWithEntities2 = tL_textWithEntities;
                    starGift4 = starGift2;
                    z20 = z11;
                    z21 = z10;
                }
            }
            j13 = j11;
            w01Var = this.i0;
            w01Var.removeAllViews();
            if (peer8 == null) {
            }
            if (peer2 == null) {
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            int i212 = 7;
            if (peer4 == null) {
            }
            w01Var.g(i17, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                dd.D0(w01Var, this.currentAccount, starGift, this.resourcesProvider);
            }
            if (tL_textWithEntities != null) {
                w01Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z17) {
            }
            starGift2 = starGift;
            if (this.r0) {
            }
            if (starGift2 instanceof TL_stars.TL_starGift) {
            }
            z18 = true;
            dVar.setFilled(true);
            dVar.i(LocaleController.getString(R.string.OK), !this.e1, true);
            dVar.g(null, !this.e1);
            dVar.setOnClickListener(new z1(this, 14));
            tL_textWithEntities2 = tL_textWithEntities;
            starGift4 = starGift2;
            z20 = z11;
            z21 = z10;
        } else {
            if (!z22) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                userOrChat = null;
            } else {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer10 = tL_messageActionStarGiftUnique2.from_id;
                userOrChat = messagesController.getUserOrChat(peer10 != null ? DialogObject.getPeerDialogId(peer10) : messageObject.getFromChatId());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z20 = tL_messageActionStarGiftUnique2.refunded;
            M2(tL_starGiftUnique2, z20, userOrChat, tL_messageActionStarGiftUnique2.message);
            z21 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            boolean z35 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z35 = false;
            }
            if (!this.N0 && !this.O0 && this.H0 != null && (Y1 = Y1()) != null) {
                this.N0 = true;
                ca.y(this.currentAccount, false).M(Y1, new y3(this, i16));
            }
            if (this.Q0 || (o6Var2 = this.P0) == null || !o6Var2.o || (tL_starGiftUnique = o6Var2.l) == null) {
                z23 = z35;
            } else {
                z23 = z35;
                if (starGift4 == null || tL_starGiftUnique.id != starGift4.id) {
                    o6Var2.a();
                    this.P0 = null;
                    b7Var.b.setAlpha(1.0f);
                    b7Var.c.setAlpha(0.0f);
                }
            }
            z16 = z24;
            z17 = z23;
            tL_textWithEntities2 = null;
            z18 = true;
            z13 = false;
            z14 = false;
            peer4 = null;
        }
        if (this.l1) {
            dVar.setFilled(z18);
            dVar.i(LocaleController.getString(R.string.GiftCraftButtonNext), false, z18);
            dVar.setOnClickListener(new z1(this, 15));
        }
        String str3 = starGift4 == null ? null : starGift4.owner_address;
        String str4 = starGift4 == null ? null : starGift4.gift_address;
        boolean z36 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        z90 z90Var = this.h0;
        if (z20) {
            z90Var.setVisibility(0);
            z90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q7, this.resourcesProvider);
        } else if (z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            z90Var.setVisibility(0);
            z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str4, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && z14 && !z16) {
            z90Var.setVisibility(0);
            if (z17) {
                string3 = LocaleController.formatString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string3 = LocaleController.getString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            z90Var.setText(string3);
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else {
            z90Var.setVisibility(8);
        }
        int i23 = 6;
        z90 z90Var2 = this.j0;
        if (!z36 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            z90Var2.setVisibility(0);
            z90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str4, i23)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z13 || z20 || starGift4 == null || !h2(this.currentAccount, U1()) || peer4 != null) {
            z90Var2.setVisibility(8);
        } else {
            z90Var2.setVisibility(0);
            if (U1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z21) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new zq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z21 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new a2(this, i23)));
                z90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                z90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z21 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new a2(this, i23)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.e1) {
            U2(0, false, null);
            this.c.n0(1);
            this.e1 = false;
        }
        this.e.setTitle(this.V0);
        X2();
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean L() {
        return false;
    }

    public final boolean L1() {
        int i10;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null || e22.crafted || !i2(this.currentAccount, DialogObject.getPeerDialogId(e22.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.H0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i10 > 0 && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() >= i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [org.telegram.ui.Components.v01[], org.telegram.ui.Components.yc[], org.telegram.ui.Components.zq[]] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v44 */
    public final void L2(TL_stars.SavedStarGift savedStarGift, u9 u9Var) {
        long j10;
        String string;
        int i10;
        CharSequence charSequence;
        String formatString;
        boolean z10;
        CharSequence charSequence2;
        TL_stars.StarGift starGift;
        ?? r12;
        int i11;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str;
        String str2;
        boolean z11;
        int i12;
        String string2;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        ?? r13;
        o6 o6Var;
        if (savedStarGift == null) {
            return;
        }
        int i13 = this.currentAccount;
        long j11 = this.X;
        this.E0 = h2(i13, j11);
        this.F0 = savedStarGift;
        this.G0 = u9Var;
        this.H0 = null;
        boolean z12 = this.Q0;
        b7 b7Var = this.f0;
        if (!z12 && (o6Var = this.P0) != null && o6Var.o && o6Var.l != null) {
            o6Var.a();
            this.P0 = null;
            b7Var.b.setVisibility(0);
            b7Var.c.setVisibility(4);
        }
        this.e0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j11);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z13 = j11 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z14 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str = starGift4.owner_address;
            str2 = starGift4.gift_address;
            z11 = starGift4.host_id != null;
            M2((TL_stars.TL_starGiftUnique) starGift4, z14, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z15 = this.E0 && clientUserId == peerDialogId && j11 >= 0;
            boolean j22 = j2(this.currentAccount, e2());
            Z1();
            b7Var.f(starGift4, false, false, j22);
            b7Var.setShowOptions(M1());
            w01 w01Var = this.i0;
            w01Var.removeAllViews();
            CharSequence charSequence3 = "";
            if (z15) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    j10 = clientUserId;
                    string2 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string2 = org.telegram.messenger.t.i(savedStarGift.gift_num, ',', sb2);
                }
                this.V0 = string2;
                if (z14) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j12 = savedStarGift.convert_stars;
                    replaceTags = j12 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j12)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                b7Var.i(0, string2, replaceTags, F2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (!z13 || this.E0) {
                    boolean z16 = this.E0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string3 = LocaleController.getString(z16 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.V0 = string3;
                        b7Var.i(0, string3, (!z14 && this.E0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, F2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z16 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string = org.telegram.messenger.t.i(savedStarGift.gift_num, ',', sb3);
                        }
                        this.V0 = string;
                        if (z14 || !this.E0) {
                            i10 = 0;
                            charSequence = null;
                        } else {
                            if (isBot || !K1()) {
                                if (this.E0) {
                                    formatString = LocaleController.getString(savedStarGift.unsaved ? z13 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z13 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                } else {
                                    formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.E0) {
                                formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z13 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z13 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (isBot || !K1()) {
                                z10 = true;
                                charSequence2 = "";
                            } else {
                                z10 = true;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new a2(this, 5)), true);
                            }
                            boolean z17 = z10;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i10 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[z17 ? 1 : 0] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        b7Var.i(i10, string, charSequence, F2(savedStarGift.gift));
                    }
                } else {
                    String string4 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.V0 = string4;
                    b7Var.i(0, string4, null, E2(savedStarGift.gift.released_by));
                }
            }
            if (j10 != peerDialogId || z13) {
                this.i0.m(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new b2(this, peerDialogId, 4), (peerDialogId == j10 || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z13) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new b2(this, peerDialogId, 5));
            }
            w01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string5 = LocaleController.getString(R.string.Gift2Value);
            String i14 = org.telegram.messenger.t.i(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!K1() || z14) {
                r12 = 0;
            } else {
                r12 = 0;
                charSequence3 = org.telegram.ui.Components.zc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new a2(this, 7), this.resourcesProvider, null);
            }
            w01Var.c(string5, dd.W0(false, TextUtils.concat(i14, " ", charSequence3), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                dd.D0(w01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                w01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z18 = this.E0;
            fi.d dVar = this.k0;
            if (z18 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.d1 == null) {
                    i12 = 0;
                    this.d1 = new zq(0, new c7(dVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder.setSpan(this.d1, i12, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.i(spannableStringBuilder, !this.e1, true);
                dVar.g(null, !this.e1);
                dVar.setOnClickListener(new z1(this, 8));
            } else if (this.r0 && z18 && this.Z != null && this.G0 != null && a2() >= 0 && this.G0.c(a2()) >= 0) {
                dVar.setFilled(false);
                int c10 = this.G0.c(a2());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.G0.get(c10);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r122 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.i(spannableStringBuilder2, (this.e1 ? 1 : 0) ^ r122, r122);
                dVar.g(null, (this.e1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new w2(this, c10, r122));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.i(LocaleController.getString(R.string.OK), !this.e1, true);
                dVar.g(null, !this.e1);
                dVar.setOnClickListener(new z1(this, 11));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.d1 == null) {
                    i11 = 0;
                    this.d1 = new zq(0, new c7(dVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider)));
                } else {
                    i11 = 0;
                }
                spannableStringBuilder3.setSpan(this.d1, i11, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.i(spannableStringBuilder3, !this.e1, true);
                dVar.g(null, !this.e1);
                dVar.setOnClickListener(new z1(this, 10));
            }
            str = null;
            str2 = null;
            z11 = false;
        }
        boolean z19 = savedStarGift.refunded;
        z90 z90Var = this.h0;
        if (z19) {
            z90Var.setVisibility(0);
            z90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q7, this.resourcesProvider);
        } else if (z11 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str2, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            z90Var.setVisibility(0);
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && this.E0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            z90Var.setVisibility(0);
            z90Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else {
            z90Var.setVisibility(8);
        }
        z90 z90Var2 = this.j0;
        if (!z11 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str2, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            z90Var2.setVisibility(0);
        } else if (this.E0 && h2(this.currentAccount, j11)) {
            int i15 = 6;
            if (j11 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new zq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new a2(this, i15)));
                z90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                z90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new a2(this, i15)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            z90Var2.setVisibility(0);
        } else {
            r13 = 0;
            z90Var2.setVisibility(8);
        }
        if (this.e1) {
            U2(r13, r13, null);
            this.c.n0(1);
            this.e1 = r13;
        }
        this.e.setTitle(this.V0);
        X2();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M1() {
        if (this.f1 == null && Y1() != null) {
            MessageObject messageObject = this.H0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean isOutOwner = messageObject.isOutOwner();
                            boolean z10 = this.H0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return i2(this.currentAccount, DialogObject.getPeerDialogId(peer));
                            }
                            if (!isOutOwner || z10) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !i2(this.currentAccount, this.X)) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b4, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r7).drop_original_details_stars >= 0) goto L192;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033b  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v5, types: [org.telegram.ui.Components.v01[], org.telegram.ui.Components.yc[]] */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        b7 b7Var;
        long j10;
        boolean z11;
        long j11;
        boolean z12;
        TL_wallet.walletTransaction wallettransaction;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        int i10;
        ?? r10;
        ?? r11;
        ?? r14;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f7;
        o6 o6Var;
        boolean z13;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        o6 o6Var2;
        boolean z14;
        Object obj;
        Object obj2;
        CharSequence formatSpannable;
        TLRPC.Message message;
        MessageObject messageObject;
        Object obj3;
        int i11;
        int i12;
        char c10;
        int i13;
        Object obj4;
        int i14;
        TL_wallet.nftItem nftitem;
        String str;
        TL_wallet.nftItem nftitem2;
        String str2;
        org.telegram.ui.Wallet.s7 s7Var;
        o6 o6Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.V0 = org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2);
        boolean z15 = this.Q0;
        b7 b7Var2 = this.f0;
        if (z15 || (o6Var3 = this.P0) == null || !o6Var3.o || (tL_starGiftUnique2 = o6Var3.l) == null) {
            b7Var = b7Var2;
            j10 = peerDialogId;
        } else {
            j10 = peerDialogId;
            if (tL_starGiftUnique2.id != tL_starGiftUnique.id) {
                o6Var3.a();
                this.P0 = null;
                b7Var = b7Var2;
                b7Var.b.setAlpha(1.0f);
                b7Var.c.setAlpha(0.0f);
                int i15 = 0;
                int i16 = 1;
                z11 = this.i1 != null;
                if (z11) {
                    j11 = j10;
                } else {
                    j11 = j10;
                    if (i2(this.currentAccount, j11)) {
                        z12 = true;
                        boolean z16 = !z11 && i2(this.currentAccount, peerDialogId2);
                        boolean j22 = j2(this.currentAccount, e2());
                        Z1();
                        b7Var.f(tL_starGiftUnique, z12, z16, j22);
                        b7Var.setShowOptions(false);
                        TextPaint textPaint = b7Var.G;
                        final int i17 = 4;
                        int i18 = 2;
                        int i19 = 3;
                        if (this.f1 != null) {
                            if (this.h1 != null) {
                                b7Var.j(new z1(this, 29), this.g1 == null ? null : new View.OnClickListener(this) { // from class: bi.u4
                                    public final /* synthetic */ h7 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i17) {
                                            case 0:
                                                this.b.onBackPressed();
                                                break;
                                            case 1:
                                                this.b.k2();
                                                break;
                                            case 2:
                                                this.b.onBackPressed();
                                                break;
                                            case 3:
                                                o6 o6Var4 = this.b.P0;
                                                o6Var4.h.e();
                                                o6Var4.i.e();
                                                o6Var4.j.e();
                                                o6Var4.k.e();
                                                break;
                                            default:
                                                this.b.q2();
                                                break;
                                        }
                                    }
                                }, new z1(this, i15), true);
                                org.telegram.ui.Wallet.t4 t4Var = this.h1;
                                org.telegram.ui.Wallet.t7 t7Var = t4Var.b.j0;
                                b7Var.setWalletCard((t7Var == null || (nftitem2 = t4Var.a) == null || (str2 = nftitem2.address) == null || (s7Var = (org.telegram.ui.Wallet.s7) t7Var.f.get(str2)) == null || !s7Var.b()) ? false : true);
                            } else {
                                b7Var.j(new z1(this, i16), this.g1 == null ? null : new z1(this, i18), new z1(this, i19), tL_starGiftUnique.host_id != null);
                            }
                            org.telegram.ui.Wallet.s4 s4Var = this.g1;
                            if (s4Var != null) {
                                i14 = ((org.telegram.ui.ActionBar.r2) s4Var.c).currentAccount;
                                boolean F = org.telegram.ui.Wallet.t7.F(i14, s4Var.a.slug);
                                org.telegram.ui.Wallet.s4 s4Var2 = this.g1;
                                org.telegram.ui.Wallet.t7 t7Var2 = s4Var2.c.j0;
                                boolean z17 = (t7Var2 == null || (nftitem = s4Var2.b) == null || (str = nftitem.address) == null || !str.equals(t7Var2.P0)) ? false : true;
                                bh.p pVar = b7Var.J;
                                pVar.c(R.drawable.filled_card_color, LocaleController.getString(z17 ? R.string.WalletGiftRemoveColor : R.string.WalletGiftApplyColor), false);
                                pVar.setAlpha((F || z17) ? 1.0f : 0.5f);
                            }
                        }
                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new tu(190, 0), length, spannableStringBuilder.length(), 33);
                        wallettransaction = this.i1;
                        if (wallettransaction != null) {
                            charSequence2 = LocaleController.getString(wallettransaction.incoming ? R.string.WalletMovedFromProfile : R.string.WalletMovedToProfile);
                        } else if (tLObject != null) {
                            charSequence2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
                        } else if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                            charSequence = null;
                            if (tL_textWithEntities != null || textPaint == null) {
                                spannable = null;
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                                MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                                spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                            }
                            b7 b7Var3 = b7Var;
                            b7Var3.h(0, spannableStringBuilder, charSequence, E2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                            this.j1 = null;
                            w01 w01Var = this.i0;
                            w01Var.removeAllViews();
                            if (z10) {
                                if (tL_starGiftUnique.host_id != null) {
                                    if (TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                        w01Var.p(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new a2(this, i12));
                                    }
                                    if (peerDialogId2 != 0) {
                                        c10 = 2;
                                        this.j1 = ((t01) this.i0.o(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new b2(this, peerDialogId2, i12)).getChildAt(1)).getChildAt(i12);
                                        obj4 = null;
                                        i10 = 33;
                                        i13 = i12;
                                    } else {
                                        c10 = 2;
                                        i10 = 33;
                                        i13 = i12;
                                        obj4 = null;
                                    }
                                    obj3 = obj4;
                                    i11 = i13;
                                } else {
                                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                        w01Var.p(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new a2(this, 1));
                                    } else if (j11 == 0 && tL_starGiftUnique.owner_name != null) {
                                        w01Var.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                                    } else if (j11 != 0) {
                                        r11 = 1;
                                        i10 = 33;
                                        r10 = 0;
                                        r14 = 0;
                                        this.j1 = ((t01) this.i0.o(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new b2(this, j11, true ? 1 : 0)).getChildAt(1)).getChildAt(0);
                                    }
                                    obj3 = null;
                                    i10 = 33;
                                    i11 = 0;
                                }
                                r11 = 1;
                                r10 = obj3;
                                r14 = i11;
                            } else {
                                i10 = 33;
                                r10 = 0;
                                r11 = 1;
                                r14 = 0;
                            }
                            G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                            G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                            G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                            if (!z10) {
                                if (this.H0 == null) {
                                    w01Var.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                                } else if (this.M0) {
                                    w01Var.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                                } else {
                                    TextView textView = (TextView) ((t01) w01Var.c(LocaleController.getString(R.string.Gift2Quantity), "", r10, r10).getChildAt(r11)).getChildAt(r14);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                    ea0 ea0Var = new ea0(textView, AndroidUtilities.dp(90.0f), r14, this.resourcesProvider);
                                    int i20 = org.telegram.ui.ActionBar.y6.G6;
                                    ea0Var.a(org.telegram.ui.ActionBar.y6.o1(0.21f, org.telegram.ui.ActionBar.y6.w0(i20, this.resourcesProvider)), org.telegram.ui.ActionBar.y6.o1(0.08f, org.telegram.ui.ActionBar.y6.w0(i20, this.resourcesProvider)));
                                    spannableStringBuilder3.setSpan(ea0Var, r14, r11, i10);
                                    textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                    if (!this.L0 && !this.M0 && (messageObject = this.H0) != null) {
                                        this.L0 = r11;
                                        int id2 = messageObject.getId();
                                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                        tL_messages_getMessages.id.add(Integer.valueOf(id2));
                                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new l2(this, id2, r14));
                                    }
                                }
                                if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                    this.i0.e(LocaleController.getString(R.string.GiftValue2), b10.j("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new a3.l0(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 14), null);
                                }
                            }
                            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                            if (stargiftattributeoriginaldetails == null) {
                                if ((stargiftattributeoriginaldetails.flags & r11) != 0) {
                                    long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                                    SpannableString spannableString = new SpannableString(DialogObject.getName(peerDialogId3));
                                    spannableString.setSpan(new b5(this, peerDialogId3), r14, spannableString.length(), i10);
                                    obj = spannableString;
                                } else {
                                    obj = null;
                                }
                                f7 = 14.0f;
                                long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                                SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId4));
                                spannableString2.setSpan(new c5(this, peerDialogId4), r14, spannableString2.length(), i10);
                                if (stargiftattributeoriginaldetails.message != null) {
                                    TextPaint textPaint2 = new TextPaint((int) r11);
                                    textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                    MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                                    obj2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r14), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt());
                                } else {
                                    obj2 = null;
                                }
                                boolean z18 = r11;
                                Object replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                    if (obj2 == null) {
                                        int i21 = R.string.Gift2AttributeOriginalDetailsSelf;
                                        Object[] objArr = new Object[2];
                                        objArr[r14] = obj;
                                        objArr[z18 ? 1 : 0] = replaceAll;
                                        formatSpannable = LocaleController.formatSpannable(i21, objArr);
                                    } else {
                                        int i22 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                                        Object[] objArr2 = new Object[3];
                                        objArr2[r14] = obj;
                                        objArr2[z18 ? 1 : 0] = replaceAll;
                                        objArr2[2] = obj2;
                                        formatSpannable = LocaleController.formatSpannable(i22, objArr2);
                                    }
                                } else if (obj != null) {
                                    if (obj2 == null) {
                                        int i23 = R.string.Gift2AttributeOriginalDetails;
                                        Object[] objArr3 = new Object[3];
                                        objArr3[r14] = obj;
                                        objArr3[z18 ? 1 : 0] = spannableString2;
                                        objArr3[2] = replaceAll;
                                        formatSpannable = LocaleController.formatSpannable(i23, objArr3);
                                    } else {
                                        int i24 = R.string.Gift2AttributeOriginalDetailsComment;
                                        Object[] objArr4 = new Object[4];
                                        objArr4[r14] = obj;
                                        objArr4[z18 ? 1 : 0] = spannableString2;
                                        objArr4[2] = replaceAll;
                                        objArr4[3] = obj2;
                                        formatSpannable = LocaleController.formatSpannable(i24, objArr4);
                                    }
                                } else if (obj2 == null) {
                                    int i25 = R.string.Gift2AttributeOriginalDetailsNoSender;
                                    Object[] objArr5 = new Object[2];
                                    objArr5[r14] = spannableString2;
                                    objArr5[z18 ? 1 : 0] = replaceAll;
                                    formatSpannable = LocaleController.formatSpannable(i25, objArr5);
                                } else {
                                    int i26 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                                    Object[] objArr6 = new Object[3];
                                    objArr6[r14] = spannableString2;
                                    objArr6[z18 ? 1 : 0] = replaceAll;
                                    objArr6[2] = obj2;
                                    formatSpannable = LocaleController.formatSpannable(i26, objArr6);
                                }
                                if (h2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                                    TL_stars.SavedStarGift savedStarGift = this.F0;
                                    if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                        MessageObject messageObject2 = this.H0;
                                        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                                            TLRPC.MessageAction messageAction = message.action;
                                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            }
                                        }
                                    }
                                    LinearLayout linearLayout = new LinearLayout(getContext());
                                    linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                                    linearLayout.setOrientation(r14);
                                    xh.n nVar = new xh.n(getContext());
                                    org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.G6, this.resourcesProvider);
                                    org.telegram.ui.ActionBar.f7.H(nVar, org.telegram.ui.ActionBar.y6.gc, this.resourcesProvider);
                                    nVar.setTextSize(z18 ? 1 : 0, 12.0f);
                                    nVar.setGravity(3);
                                    nVar.setText(formatSpannable);
                                    linearLayout.addView(nVar, gb1.s(-1, -2, 1.0f, 19));
                                    ImageView imageView = new ImageView(getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    int i27 = org.telegram.ui.ActionBar.y6.Oh;
                                    org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i27, this.resourcesProvider)), 6, 6);
                                    org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i27);
                                    org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
                                    imageView.setBackground(Z);
                                    org.telegram.ui.ActionBar.f7.k(imageView, Z, null, L, u6Var);
                                    imageView.setImageResource(R.drawable.menu_delete_old);
                                    org.telegram.ui.ActionBar.f7.t(imageView, i27, this.resourcesProvider, PorterDuff.Mode.SRC_IN);
                                    gb1.b(imageView);
                                    imageView.setOnClickListener(new q(7, this, formatSpannable));
                                    linearLayout.addView(imageView, gb1.t(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                    TableRow tableRow = new TableRow(getContext());
                                    TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                    layoutParams.span = 2;
                                    tableRow.addView(new u01(w01Var, linearLayout, true), layoutParams);
                                    w01Var.addView(tableRow);
                                }
                                u01 a2 = w01Var.a(formatSpannable);
                                a2.setFilled(z18);
                                xh.n nVar2 = (xh.n) a2.getChildAt(0);
                                nVar2.setTextSize(z18 ? 1 : 0, 12.0f);
                                nVar2.setGravity(17);
                            } else {
                                f7 = 14.0f;
                            }
                            if (this.i1 != null) {
                                this.j1 = null;
                                w01Var.removeAllViews();
                                long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                this.i0.n(LocaleController.getString(this.i1.incoming ? R.string.WalletSender : R.string.WalletRecipient), this.currentAccount, clientUserId, new b2(this, clientUserId, 3));
                                long abs = Math.abs(this.i1.fee);
                                if (abs > 0) {
                                    TextView textView2 = new TextView(getContext());
                                    textView2.setGravity(16);
                                    textView2.setIncludeFontPadding(false);
                                    textView2.setTextSize(1, f7);
                                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.G6, this.resourcesProvider);
                                    textView2.setText(org.telegram.ui.Wallet.m5.s0(this.currentAccount, abs, this.resourcesProvider));
                                    w01Var.f(textView2, LocaleController.getString(R.string.WalletFee));
                                }
                                if (this.i1.date != 0) {
                                    w01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(this.i1.date), null, null);
                                }
                            }
                            o6Var = this.P0;
                            fi.d dVar = this.k0;
                            if (o6Var != null || !o6Var.o) {
                                if (this.i1 == null) {
                                    dVar.setFilled(true);
                                    dVar.i(LocaleController.getString(R.string.OK), !this.e1, true);
                                    dVar.g(null, !this.e1);
                                    final int i28 = 0;
                                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.u4
                                        public final /* synthetic */ h7 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i28) {
                                                case 0:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 1:
                                                    this.b.k2();
                                                    break;
                                                case 2:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 3:
                                                    o6 o6Var4 = this.b.P0;
                                                    o6Var4.h.e();
                                                    o6Var4.i.e();
                                                    o6Var4.j.e();
                                                    o6Var4.k.e();
                                                    break;
                                                default:
                                                    this.b.q2();
                                                    break;
                                            }
                                        }
                                    });
                                } else if (!h2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                                    final int i29 = 1;
                                    dVar.setFilled(true);
                                    N2(tL_starGiftUnique);
                                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.u4
                                        public final /* synthetic */ h7 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i29) {
                                                case 0:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 1:
                                                    this.b.k2();
                                                    break;
                                                case 2:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 3:
                                                    o6 o6Var4 = this.b.P0;
                                                    o6Var4.h.e();
                                                    o6Var4.i.e();
                                                    o6Var4.j.e();
                                                    o6Var4.k.e();
                                                    break;
                                                default:
                                                    this.b.q2();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    if (!this.r0 || this.Z == null || this.G0 == null || a2() < 0 || this.G0.c(a2()) < 0) {
                                        dVar.setFilled(true);
                                        dVar.i(LocaleController.getString(R.string.OK), !this.e1, true);
                                        dVar.g(null, !this.e1);
                                        final int i30 = 2;
                                        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.u4
                                            public final /* synthetic */ h7 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i30) {
                                                    case 0:
                                                        this.b.onBackPressed();
                                                        break;
                                                    case 1:
                                                        this.b.k2();
                                                        break;
                                                    case 2:
                                                        this.b.onBackPressed();
                                                        break;
                                                    case 3:
                                                        o6 o6Var4 = this.b.P0;
                                                        o6Var4.h.e();
                                                        o6Var4.i.e();
                                                        o6Var4.j.e();
                                                        o6Var4.k.e();
                                                        break;
                                                    default:
                                                        this.b.q2();
                                                        break;
                                                }
                                            }
                                        });
                                        this.e.setTitle(this.V0);
                                        o6Var2 = this.P0;
                                        if (o6Var2 != null) {
                                            boolean z19 = this.Q0;
                                            a2 a2Var = new a2(this, 24);
                                            a2 a2Var2 = new a2(this, 25);
                                            ArrayList arrayList = o6Var2.f;
                                            b7 b7Var4 = o6Var2.a;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = o6Var2.l;
                                            if (tL_starGiftUnique3 != null && tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                                z14 = o6Var2.o;
                                            } else if (z19) {
                                                org.telegram.ui.Components.y9 upgradeImageView = b7Var4.getUpgradeImageView();
                                                r6 r6Var = b7Var4.c;
                                                TL_stars.starGiftAttributeModel upgradeImageViewAttribute = b7Var4.getUpgradeImageViewAttribute();
                                                TL_stars.starGiftAttributePattern upgradePatternAttribute = b7Var4.getUpgradePatternAttribute();
                                                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = b7Var4.getUpgradeBackdropAttribute();
                                                TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                                o6Var2.o = true;
                                                o6Var2.l = tL_starGiftUnique;
                                                o6Var2.r = a2Var;
                                                o6Var2.s = a2Var2;
                                                o6Var2.t = (float) Math.random();
                                                o6Var2.m = System.currentTimeMillis();
                                                o6Var2.n = 0.0f;
                                                o6Var2.p = false;
                                                o6Var2.q = false;
                                                o6Var2.o = true;
                                                k6 k6Var = o6Var2.h;
                                                if (k6Var != null) {
                                                    k6Var.a();
                                                }
                                                m6 m6Var = new m6(r6Var, stargiftattributemodel2);
                                                if (r6Var.isAttachedToWindow() && m6Var.c) {
                                                    m6Var.d.onAttachedToWindow();
                                                }
                                                o6Var2.h = new k6(new h6(o6Var2, 0), o6Var2.e, new m6(upgradeImageView, upgradeImageViewAttribute), m6Var, 0.9f, o6Var2.t > 0.5f ? 3 : 2);
                                                k6 k6Var2 = o6Var2.i;
                                                if (k6Var2 != null) {
                                                    k6Var2.a();
                                                }
                                                o6Var2.i = new k6(new h6(o6Var2, 0), o6Var2.g, new n6(upgradePatternAttribute), new n6(stargiftattributepattern), 1.0f, o6Var2.t > 0.5f ? 2 : 1);
                                                k6 k6Var3 = o6Var2.j;
                                                if (k6Var3 != null) {
                                                    k6Var3.a();
                                                }
                                                o6Var2.j = new k6(new h6(o6Var2, 0), arrayList, new l6(upgradeBackdropAttribute), new l6(stargiftattributebackdrop), 0.5f, o6Var2.t > 0.5f ? 2 : 1);
                                                k6 k6Var4 = o6Var2.k;
                                                if (k6Var4 != null) {
                                                    k6Var4.a();
                                                }
                                                o6Var2.k = new k6(new h6(o6Var2, 0), arrayList, new l6(upgradeBackdropAttribute), new l6(stargiftattributebackdrop), 1.25f, o6Var2.t > 0.5f ? 2 : 1);
                                                o6Var2.b();
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                b7Var3.b.setAlpha(0.0f);
                                                b7Var3.c.setAlpha(1.0f);
                                                dVar.i(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                                                dVar.setFilled(true);
                                                final int i31 = 3;
                                                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.u4
                                                    public final /* synthetic */ h7 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i31) {
                                                            case 0:
                                                                this.b.onBackPressed();
                                                                break;
                                                            case 1:
                                                                this.b.k2();
                                                                break;
                                                            case 2:
                                                                this.b.onBackPressed();
                                                                break;
                                                            case 3:
                                                                o6 o6Var4 = this.b.P0;
                                                                o6Var4.h.e();
                                                                o6Var4.i.e();
                                                                o6Var4.j.e();
                                                                o6Var4.k.e();
                                                                break;
                                                            default:
                                                                this.b.q2();
                                                                break;
                                                        }
                                                    }
                                                });
                                                int length2 = ((h7) this.T0.d).S0.length - 1;
                                                mm0 mm0Var = this.d;
                                                mm0Var.v0(length2);
                                                mm0Var.post(new a2(this, 26));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    dVar.setFilled(false);
                                    int c11 = this.G0.c(a2());
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                                    Object obj5 = this.G0.get(c11);
                                    if (!(obj5 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj5).gift) == null || (document = starGift.getDocument()) == null) {
                                        z13 = true;
                                    } else {
                                        spannableStringBuilder5.append((CharSequence) " e");
                                        z13 = true;
                                        spannableStringBuilder5.setSpan(new org.telegram.ui.Components.c6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                    }
                                    dVar.i(spannableStringBuilder5, this.e1 ^ z13, z13);
                                    dVar.g(null, this.e1 ^ z13);
                                    dVar.setOnClickListener(new w2(this, c11, 3));
                                }
                            }
                            this.e.setTitle(this.V0);
                            o6Var2 = this.P0;
                            if (o6Var2 != null) {
                            }
                        } else {
                            charSequence2 = stargiftattributemodel.name;
                        }
                        charSequence = charSequence2;
                        if (tL_textWithEntities != null) {
                        }
                        spannable = null;
                        b7 b7Var32 = b7Var;
                        b7Var32.h(0, spannableStringBuilder, charSequence, E2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                        this.j1 = null;
                        w01 w01Var2 = this.i0;
                        w01Var2.removeAllViews();
                        if (z10) {
                        }
                        G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                        G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                        G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        if (!z10) {
                        }
                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                        if (stargiftattributeoriginaldetails == null) {
                        }
                        if (this.i1 != null) {
                        }
                        o6Var = this.P0;
                        fi.d dVar2 = this.k0;
                        if (o6Var != null) {
                        }
                        if (this.i1 == null) {
                        }
                        this.e.setTitle(this.V0);
                        o6Var2 = this.P0;
                        if (o6Var2 != null) {
                        }
                    }
                }
                z12 = false;
                if (z11) {
                }
                boolean j222 = j2(this.currentAccount, e2());
                Z1();
                b7Var.f(tL_starGiftUnique, z12, z16, j222);
                b7Var.setShowOptions(false);
                TextPaint textPaint3 = b7Var.G;
                final int i172 = 4;
                int i182 = 2;
                int i192 = 3;
                if (this.f1 != null) {
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                spannableStringBuilder6.append((CharSequence) tL_starGiftUnique.title);
                spannableStringBuilder6.append((CharSequence) " ");
                int length3 = spannableStringBuilder6.length();
                spannableStringBuilder6.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
                spannableStringBuilder6.setSpan(new RelativeSizeSpan(0.85f), length3, spannableStringBuilder6.length(), 33);
                spannableStringBuilder6.setSpan(new tu(190, 0), length3, spannableStringBuilder6.length(), 33);
                wallettransaction = this.i1;
                if (wallettransaction != null) {
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                b7 b7Var322 = b7Var;
                b7Var322.h(0, spannableStringBuilder6, charSequence, E2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.j1 = null;
                w01 w01Var22 = this.i0;
                w01Var22.removeAllViews();
                if (z10) {
                }
                G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z10) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails == null) {
                }
                if (this.i1 != null) {
                }
                o6Var = this.P0;
                fi.d dVar22 = this.k0;
                if (o6Var != null) {
                }
                if (this.i1 == null) {
                }
                this.e.setTitle(this.V0);
                o6Var2 = this.P0;
                if (o6Var2 != null) {
                }
            } else {
                b7Var = b7Var2;
            }
        }
        if (z15 && this.P0 == null) {
            this.P0 = new o6(b7Var);
        }
        int i152 = 0;
        int i162 = 1;
        if (this.i1 != null) {
        }
        if (z11) {
        }
        z12 = false;
        if (z11) {
        }
        boolean j2222 = j2(this.currentAccount, e2());
        Z1();
        b7Var.f(tL_starGiftUnique, z12, z16, j2222);
        b7Var.setShowOptions(false);
        TextPaint textPaint32 = b7Var.G;
        final int i1722 = 4;
        int i1822 = 2;
        int i1922 = 3;
        if (this.f1 != null) {
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel32 = (TL_stars.starGiftAttributeModel) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder();
        spannableStringBuilder62.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder62.append((CharSequence) " ");
        int length32 = spannableStringBuilder62.length();
        spannableStringBuilder62.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder62.setSpan(new RelativeSizeSpan(0.85f), length32, spannableStringBuilder62.length(), 33);
        spannableStringBuilder62.setSpan(new tu(190, 0), length32, spannableStringBuilder62.length(), 33);
        wallettransaction = this.i1;
        if (wallettransaction != null) {
        }
        charSequence = charSequence2;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        b7 b7Var3222 = b7Var;
        b7Var3222.h(0, spannableStringBuilder62, charSequence, E2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.j1 = null;
        w01 w01Var222 = this.i0;
        w01Var222.removeAllViews();
        if (z10) {
        }
        G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        G1(ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails == null) {
        }
        if (this.i1 != null) {
        }
        o6Var = this.P0;
        fi.d dVar222 = this.k0;
        if (o6Var != null) {
        }
        if (this.i1 == null) {
        }
        this.e.setTitle(this.V0);
        o6Var2 = this.P0;
        if (o6Var2 != null) {
        }
    }

    public final void N1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new n4(this, e22, 1));
        }
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void N2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        bg.a resellAmount = tL_starGiftUnique.getResellAmount(bg.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        fi.d dVar = this.k0;
        if (!z10) {
            dVar.i(dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.e1, true);
            dVar.g(null, !this.e1);
        } else {
            dVar.i(dd.o1(dd.R0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(bg.b.b).d()), true), true), !this.e1, true);
            dVar.g(dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.e1);
        }
    }

    public final void O1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, qf.c cVar, vg.n1 n1Var) {
        TL_wallet.nftItem nftitem = this.f1;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (nftitem == null || e22 == null || TextUtils.isEmpty(e22.slug)) {
            return;
        }
        cVar.d();
        q3 q3Var = new q3(this, cVar, n1Var, j10, e22, nftitem, 0);
        if (stargiftdepositpayload != null) {
            q3Var.run(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        depositstargift.slug = e22.slug;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(depositstargift, new org.telegram.messenger.a(), new s2(this, cVar, n1Var, q3Var, 1));
    }

    public final void O2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f0.setWalletDisplayed(z10);
        Y2();
    }

    public final void P1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.H0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j11 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j11 = savedStarGift.transfer_stars;
            peerDialogId = this.X;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = Y1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new x2(this, callback, j10, peerDialogId, 0));
            return;
        }
        final long j12 = peerDialogId;
        ca y3 = ca.y(this.currentAccount, false);
        if (!y3.e) {
            y3.r(new y2(this, y3, j10, callback, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = Y1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject q5 = hi.m3.q(this.resourcesProvider, false);
        if (q5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: bi.z2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final h7 h7Var = h7.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j10;
                final long j14 = j12;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bi.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        h7.o1(h7.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                    }
                });
            }
        });
    }

    public final void P2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        TLRPC.Peer peer = e22.owner_id;
        if (peer == null) {
            peer = e22.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e22.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.t.i(e22.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new zq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.k0;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new z1(this, 27));
        this.f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        U2(2, false, null);
        this.A0 = true;
    }

    public final void Q1() {
        TL_stars.InputSavedStarGift Y1;
        long j10;
        fi.d dVar = this.k0;
        if (dVar.Q || (Y1 = Y1()) == null) {
            return;
        }
        MessageObject messageObject = this.H0;
        String str = null;
        long j11 = 0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.s1 != null) {
            dVar.setLoading(true);
            zp zpVar = this.w0;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = zpVar.a.q;
                upgradestargift.stargift = Y1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new j(4, this, Y1));
                return;
            }
            int i10 = 0;
            ca y3 = ca.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new f2(2, this, y3));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.s1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = zpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.s1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new e0(this, str, Y1, j11, 1));
        }
    }

    public final void Q2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique e22 = e2();
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 == null || e22 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = Y1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject q5 = hi.m3.q(this.resourcesProvider, false);
        if (q5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = q5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new i2(this, charSequence, e22, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
    }

    public final void R2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        fi.v3 v3Var = this.y1;
        if ((v3Var != null && v3Var.V && this.z1 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.b6)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.b6) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            org.telegram.ui.Components.zc[] zcVarArr = (org.telegram.ui.Components.zc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.zc.class);
            if (zcVarArr == null || zcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(zcVarArr[zcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.b6)) {
                return;
            }
            org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) view;
            primaryHorizontal = (b6Var.getRightDrawableWidth() / 2.0f) + b6Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        j5 j5Var = this.Y;
        j5Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        fi.v3 v3Var2 = this.y1;
        if (v3Var2 != null) {
            v3Var2.e(true);
            this.y1 = null;
        }
        fi.v3 v3Var3 = new fi.v3(getContext(), 3);
        v3Var3.p(!z10);
        v3Var3.s(charSequence);
        v3Var3.m(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        v3Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z10 ? 18 : 0) + 4.33f));
        v3Var3.d = 3000L;
        v3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        v3Var3.l0 = new u2(v3Var3, 0);
        v3Var3.u();
        j5Var.addView(v3Var3, gb1.g(100.0f, -1));
        this.y1 = v3Var3;
        this.z1 = view;
    }

    public final void S2(int i10, Context context, boolean z10) {
        LinearLayout d = vh.d(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(64.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i11, this.resourcesProvider));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        frameLayout.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout, K, N, null, u6Var);
        d.addView(frameLayout, gb1.x(64, 64, 49, 0, 6, 0, 0));
        ak0 ak0Var = new ak0(context);
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        ak0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(ak0Var, gb1.u(64, 64, 17));
        ak0Var.d();
        TextView L = gb1.L(context, 20.0f, org.telegram.ui.ActionBar.y6.G6, true, null);
        L.setGravity(17);
        L.setText(LocaleController.getString(z10 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        d.addView(L, gb1.x(-1, -2, 48, 24, 14, 24, 0));
        TextView L2 = gb1.L(context, 14.0f, org.telegram.ui.ActionBar.y6.F6, false, null);
        L2.setGravity(17);
        L2.setText(LocaleController.formatString(z10 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        d.addView(L2, gb1.x(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.o(d);
        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
    }

    public final int T1() {
        if (this.b1.d(1)) {
            return this.s0.getMeasuredHeight();
        }
        if (this.b1.d(2)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.b1.d(3)) {
            return this.D0.getMeasuredHeight();
        }
        if (this.b1.d(4)) {
            return 0;
        }
        return this.g0.getMeasuredHeight();
    }

    public final void T2(boolean z10, org.telegram.ui.ActionBar.e2 e2Var, qf.c cVar, Runnable runnable) {
        cVar.d();
        UserConfig userConfig = UserConfig.getInstance(this.currentAccount);
        TL_account.tmpPassword tmppassword = userConfig.tmpPassword;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
        }
        TL_account.tmpPassword tmppassword2 = userConfig.tmpPassword;
        if (tmppassword2 == null) {
            v2(z10, cVar, runnable);
        } else {
            g2(tmppassword2.tmp_password, null, z10, new n3(this, z10, cVar, runnable, e2Var));
        }
    }

    public final long U1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.H0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.X;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.H0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return DialogObject.getPeerDialogId(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return DialogObject.getPeerDialogId(peer3);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U2(int i10, boolean z10, bh.n nVar) {
        int i11;
        fi.v3 v3Var;
        o6 o6Var;
        ValueAnimator valueAnimator = this.c1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c1 = null;
        }
        b7 b7Var = this.f0;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(b7Var.l0);
        }
        if (!this.e1) {
            this.a1 = Float.valueOf(this.Y.d());
        }
        c6 c6Var = this.b1;
        this.b1 = new c6(c6Var == null ? 0 : c6Var.c, i10);
        h5 h5Var = this.T0;
        int finalHeight = b7Var.getFinalHeight();
        int T1 = T1();
        if (this.b1.d(1)) {
            FrameLayout frameLayout = this.n0;
            if (frameLayout.getVisibility() == 0) {
                i11 = frameLayout.getMeasuredHeight();
                h5Var.F(finalHeight, T1 + i11);
                if (this.b1.c == 0 && (o6Var = this.P0) != null) {
                    o6Var.c();
                }
                int i12 = 3;
                f5 f5Var = this.D0;
                f5 f5Var2 = this.B0;
                f5 f5Var3 = this.s0;
                f5 f5Var4 = this.g0;
                if (z10) {
                    this.b1.a = 1.0f;
                    n2();
                    f5Var4.setVisibility(i10 == 0 ? 0 : 8);
                    f5Var3.setVisibility(i10 == 1 ? 0 : 8);
                    f5Var2.setVisibility(i10 == 2 ? 0 : 8);
                    f5Var.setVisibility(i10 != 3 ? 8 : 0);
                    W2();
                    if (nVar != null) {
                        nVar.run();
                    }
                } else {
                    f5Var4.setVisibility(this.b1.b(0) ? 0 : 8);
                    f5Var3.setVisibility(this.b1.b(1) ? 0 : 8);
                    f5Var2.setVisibility(this.b1.b(2) ? 0 : 8);
                    f5Var.setVisibility(this.b1.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.c1 = ofFloat;
                    ofFloat.addUpdateListener(new ai.g0(this, i12));
                    this.c1.addListener(new x4(this, i10, nVar, r5));
                    this.c1.setInterpolator(ds.h);
                    this.c1.setDuration(320L);
                    this.c1.start();
                    c6 c6Var2 = this.b1;
                    org.telegram.ui.Components.y9[] y9VarArr = b7Var.d;
                    int i13 = c6Var2.b;
                    int i14 = c6Var2.c;
                    if (i13 != i14) {
                        xj0 lottieAnimation = y9VarArr[i13].getImageReceiver().getLottieAnimation();
                        xj0 lottieAnimation2 = y9VarArr[i14].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                    }
                }
                v3Var = this.y1;
                if (v3Var == null) {
                    v3Var.e(true);
                    this.y1 = null;
                    return;
                }
                return;
            }
        }
        i11 = 0;
        h5Var.F(finalHeight, T1 + i11);
        if (this.b1.c == 0) {
            o6Var.c();
        }
        int i122 = 3;
        f5 f5Var5 = this.D0;
        f5 f5Var22 = this.B0;
        f5 f5Var32 = this.s0;
        f5 f5Var42 = this.g0;
        if (z10) {
        }
        v3Var = this.y1;
        if (v3Var == null) {
        }
    }

    public final TL_stars.StarGift V1() {
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void V2(boolean z10) {
        boolean z11;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean j22 = j2(this.currentAccount, e2());
        boolean z12 = !j22;
        boolean j23 = j2(this.currentAccount, e2());
        fi.d dVar = this.k0;
        if (j23) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(U1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long U1 = U1();
            if (U1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    org.telegram.ui.Components.qc Q = getBulletinFactory().Q(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new a2(this, 2)));
                    Q.u = true;
                    Q.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(U1, new c2(this, messagesController, U1, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = e22.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(U1(), tL_inputEmojiStatusCollectible, e22);
        }
        this.f0.I[1].c(!j22 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!j22 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.A0) {
            dismiss();
            return;
        }
        bh.n nVar = new bh.n(2, this, z11);
        if (this.b1.c(0)) {
            nVar.run();
        } else {
            U2(0, true, nVar);
        }
        dVar.i(LocaleController.getString(R.string.OK), !this.e1, true);
        dVar.g(null, !this.e1);
        dVar.setOnClickListener(new z1(this, 5));
    }

    public final String W1() {
        TL_stars.StarGift V1 = V1();
        if (!(V1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) V1).title);
        sb2.append(" #");
        return org.telegram.messenger.t.i(r0.num, ',', sb2);
    }

    public final void W2() {
        FrameLayout frameLayout = this.n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.p0;
        FrameLayout frameLayout3 = this.l0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.b1.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.b1.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.b1.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void X2() {
        boolean f22 = f2(false);
        d5 d5Var = this.Z;
        d5Var.setPosition(f22 ? 1 : 0);
        d5Var.D(false);
        if (this.G0 == null || f2(true) || this.G0.f() >= this.G0.d()) {
            return;
        }
        this.G0.b();
    }

    public final TL_stars.InputSavedStarGift Y1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.X;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.H0;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.J0 == null || TextUtils.isEmpty(this.I0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.I0;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & 4096) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        MessageObject messageObject2 = this.H0;
        if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = messagesController.getInputPeer(peer != null ? DialogObject.getPeerDialogId(peer) : this.H0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = messagesController2.getInputPeer(peer2 != null ? DialogObject.getPeerDialogId(peer2) : this.H0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject3 = this.H0;
        if (messageObject3 != null) {
            TLRPC.Message message4 = messageObject3.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject3.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.F0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.J0 == null || TextUtils.isEmpty(this.I0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.I0;
        return tL_inputSavedStarGiftSlug2;
    }

    public final void Y2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        TL_wallet.nftItem nftitem = this.f1;
        LinearLayout linearLayout = this.y0;
        if (nftitem == null || e22 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.h0.setVisibility(8);
        this.j0.setVisibility(8);
        linearLayout.setVisibility(0);
        this.z0.a(e22.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final String Z1() {
        TL_stars.StarGift V1 = V1();
        if (!(V1 instanceof TL_stars.TL_starGiftUnique) || V1.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + V1.slug;
    }

    public final int a2() {
        int indexOf;
        u9 u9Var = this.G0;
        if (u9Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift != null) {
            indexOf = u9Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = u9Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift V1 = V1();
        for (int i10 = 0; i10 < this.G0.f(); i10++) {
            Object obj = this.G0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                if (savedStarGift2 != null) {
                    if (R1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i10;
                    }
                }
                if (V1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (V1 != starGift) {
                        if ((V1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && V1.id == starGift.id) {
                        }
                    }
                    return i10;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && S1(this.J0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift b2(boolean z10) {
        int a2 = a2();
        if (a2 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + a2;
        int i11 = this.U0;
        if (i11 >= 0 && (!z10 ? i11 < a2 : i11 > a2)) {
            i10 = i11;
        }
        u9 u9Var = this.G0;
        Object obj = (u9Var == null || i10 < 0 || i10 >= u9Var.f()) ? null : this.G0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique c2(boolean z10) {
        int a2 = a2();
        if (a2 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + a2;
        int i11 = this.U0;
        if (i11 >= 0 && (!z10 ? i11 < a2 : i11 > a2)) {
            i10 = i11;
        }
        u9 u9Var = this.G0;
        Object obj = (u9Var == null || i10 < 0 || i10 >= u9Var.f()) ? null : this.G0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.bb, org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        if (this.b1.c(4)) {
            boolean z10 = this.f0.M.h0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithTouchOutside() {
        if (this.b1.c(4) && this.f0.M.h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.b1.c(4) && this.f0.M.h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.G0 == ((t9) objArr[1])) {
                z5 z5Var = this.f0.M;
                if (z5Var == null || !z5Var.h0) {
                    X2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        if (this.b1.c(4) && this.f0.M.h0) {
            return;
        }
        zh.f4 f4Var = this.W0;
        if (f4Var != null) {
            f4Var.b();
            this.W0 = null;
        }
        o6 o6Var = this.P0;
        if (o6Var != null) {
            o6Var.a();
        }
        super.dismiss();
    }

    public final TL_stars.TL_starGiftUnique e2() {
        TL_stars.StarGift V1 = V1();
        if (V1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) V1;
        }
        return null;
    }

    public final boolean f2(boolean z10) {
        return (b2(z10) == null && c2(z10) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g2(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, n3 n3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 == null) {
            if (n3Var != null) {
                n3Var.run(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.x1;
            withdrawstargift.stargift = Y1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = Y1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new d4(this, n3Var, twoStepVerificationActivity, z10, 0));
    }

    @Override // org.telegram.ui.ActionBar.k3, org.telegram.ui.ActionBar.n2
    public org.telegram.ui.Components.wc getBulletinFactory() {
        return new org.telegram.ui.Components.wc(this.p0, this.resourcesProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2() {
        long clientUserId;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (this.k0.Q || e22 == null) {
            return;
        }
        if (this.J0 != null && this.K0) {
            clientUserId = this.X;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        bg.b bVar = e22.resale_ton_only ? bg.b.b : bg.b.a;
        if (this.J0 == null || !this.K0) {
            C2(e22, clientUserId, bVar, null, true, null);
            return;
        }
        zh.i0 i0Var = new zh.i0(getContext(), this.resourcesProvider, e22, clientUserId);
        i0Var.K = new m4(this, i0Var, e22, clientUserId, bVar, 0);
        i0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l2(View view) {
        int i10;
        TLRPC.Message message;
        TLRPC.Message message2;
        if (view.getAlpha() < 0.99f) {
            N1();
            return;
        }
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        int i11 = 0;
        if (e22.resell_amount != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String formatString = LocaleController.formatString(R.string.Gift2UnlistTitle, W1());
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = formatString;
            e2Var.T = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new n4(this, e22, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ag.w(25));
            alertDialog$Builder.p();
            return;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message2 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    dd.e1(getContext(), this.currentAccount, null, new o4(this, e22, i11), this.resourcesProvider);
                    return;
                }
                Context context = getContext();
                MessageObject messageObject2 = this.H0;
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                        S2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                        return;
                    }
                }
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    i11 = savedStarGift.can_resell_at;
                }
                S2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift2 = this.F0;
        i10 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    public final void m2() {
        w4 w4Var = this.Z0;
        if (w4Var != null && w4Var.isShown()) {
            this.Z0.dismiss();
        }
        String Z1 = Z1();
        w4 w4Var2 = new w4(this, getContext(), Z1, Z1, this.resourcesProvider);
        this.Z0 = w4Var2;
        w4Var2.t0 = new a4.l(this, 7);
        w4Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r4.can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n2() {
        TL_stars.TL_starGiftUnique e22;
        this.g0.setAlpha(this.b1.a(0));
        this.s0.setAlpha(this.b1.a(1));
        this.B0.setAlpha(this.b1.a(2));
        this.D0.setAlpha(this.b1.a(3));
        float a2 = 1.0f - this.b1.a(4);
        FrameLayout frameLayout = this.l0;
        frameLayout.setAlpha(a2);
        c6 c6Var = this.b1;
        b7 b7Var = this.f0;
        b7Var.d(c6Var);
        ImageView imageView = b7Var.Q;
        if (this.b1.c(0) && (e22 = e2()) != null && !e22.crafted && i2(this.currentAccount, DialogObject.getPeerDialogId(e22.owner_id))) {
            MessageObject messageObject = this.H0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            j5 j5Var = this.Y;
            float d = j5Var.d();
            this.e0.setAlpha(this.b1.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
            j5Var.e();
            j5Var.invalidate();
            frameLayout.setVisibility(this.b1.c(4) ? 8 : 0);
            W2();
        }
        int i10 = 8;
        imageView.setVisibility(i10);
        j5 j5Var2 = this.Y;
        float d10 = j5Var2.d();
        this.e0.setAlpha(this.b1.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(d10 - r6.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        j5Var2.e();
        j5Var2.invalidate();
        frameLayout.setVisibility(this.b1.c(4) ? 8 : 0);
        W2();
    }

    public final void o2(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i10;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.p0();
            }
            org.telegram.ui.Components.wc.c0("NULL_ERROR");
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h4(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.p0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.wc.e0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.p0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, gb1.r(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.t.n(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, gb1.r(-1, -2));
            linearLayout2.addView(imageView, gb1.u(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, gb1.r(-2, -2));
            linearLayout2.addView(textView2, gb1.r(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.t.n(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, gb1.r(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, gb1.u(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, gb1.r(-2, -2));
            linearLayout3.addView(textView3, gb1.r(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new ag.w(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.f7.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        b7 b7Var;
        z5 z5Var;
        if (this.b1.c(4) && (b7Var = this.f0) != null && (z5Var = b7Var.M) != null) {
            if (z5Var.h0) {
                return;
            }
            if (z5Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.A0 || this.b1.c <= 0 || this.k0.Q || this.n1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            K2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                L2(savedStarGift, this.G0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                if (tL_starGiftUnique != null) {
                    J2(this.I0, tL_starGiftUnique, this.G0);
                }
            }
        }
        U2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onSwipeStarts() {
        fi.v3 v3Var = this.y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.y1 = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
            b7 b7Var = this.f0;
            if (b7Var != null) {
                b7Var.l();
            }
            zq zqVar = this.d1;
            if (zqVar != null) {
                Drawable drawable = zqVar.drawable;
                if (drawable instanceof c7) {
                    ((c7) drawable).d.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider));
                    fi.d dVar = this.k0;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        dd.e1(getContext(), this.currentAccount, e22, new o4(this, e22, 2), this.resourcesProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q2() {
        int i10;
        CharSequence formatSpannable;
        int i11;
        long j10;
        String str;
        String str2;
        String str3;
        long j11;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        org.telegram.ui.Wallet.s4 s4Var = this.g1;
        if (s4Var == null) {
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) s4Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.t7.F(i10, s4Var.a.slug)) {
            org.telegram.ui.Wallet.s4 s4Var2 = this.g1;
            org.telegram.ui.Wallet.t7 t7Var = s4Var2.c.j0;
            if (t7Var == null || (nftitem = s4Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(t7Var.P0)) {
                Context context = getContext();
                int i12 = this.currentAccount;
                org.telegram.ui.Components.wc bulletinFactory = getBulletinFactory();
                org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
                TL_stars.TL_starGiftUnique e22 = e2();
                ArrayList arrayList = new ArrayList(AppGlobalConfig.getInstance(i12).walletCardBgGifts.get());
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                boolean z10 = 0;
                int i13 = 0;
                while (i13 < size) {
                    int i14 = i13 + 1;
                    String str6 = (String) arrayList.get(i13);
                    String str7 = "[^\\p{L}\\p{N}]";
                    String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                    Locale locale = Locale.ROOT;
                    String lowerCase = replaceAll.toLowerCase(locale);
                    if (e22 == null || (str4 = e22.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        ca y3 = ca.y(i12, z10);
                        y3.V();
                        ArrayList arrayList3 = y3.H;
                        int size2 = arrayList3.size();
                        ArrayList arrayList4 = arrayList3;
                        int i15 = z10;
                        while (i15 < size2) {
                            Object obj = arrayList4.get(i15);
                            int i16 = i15 + 1;
                            ArrayList arrayList5 = arrayList4;
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            if (starGift != null) {
                                i11 = i12;
                                String str8 = starGift.title;
                                if (str8 != null) {
                                    str2 = str7;
                                    if (lowerCase.equals(str8.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                        str3 = starGift.title;
                                        j11 = starGift.id;
                                    }
                                } else {
                                    str2 = str7;
                                }
                            } else {
                                str2 = str7;
                                i11 = i12;
                            }
                            i12 = i11;
                            arrayList4 = arrayList5;
                            str7 = str2;
                            i15 = i16;
                        }
                        i11 = i12;
                        j10 = 0;
                        str = null;
                        if (str != null) {
                            str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                        }
                        String str9 = str;
                        SpannableString spannableString = new SpannableString(str9);
                        i12 = i11;
                        spannableString.setSpan(new z4(new boolean[1], i12, context, u6Var, j10, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z10 = 0;
                        i13 = i14;
                    } else {
                        str3 = e22.title;
                        j11 = e22.gift_id;
                        i11 = i12;
                    }
                    str = str3;
                    j10 = j11;
                    if (str != null) {
                    }
                    String str92 = str;
                    SpannableString spannableString2 = new SpannableString(str92);
                    i12 = i11;
                    spannableString2.setSpan(new z4(new boolean[1], i12, context, u6Var, j10, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z10 = 0;
                    i13 = i14;
                }
                int i17 = z10;
                if (arrayList2.size() == 1) {
                    int i18 = R.string.WalletGiftColorOnlyOne;
                    Object[] objArr = new Object[1];
                    objArr[i17] = arrayList2.get(i17);
                    formatSpannable = LocaleController.formatSpannable(i18, objArr);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i19 = 0;
                    for (int i20 = 1; i19 < arrayList2.size() - i20; i20 = 1) {
                        if (i19 > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        spannableStringBuilder.append((CharSequence) arrayList2.get(i19));
                        i19++;
                    }
                    formatSpannable = LocaleController.formatSpannable(R.string.WalletGiftColorOnly, spannableStringBuilder, ic.a.g(1, arrayList2));
                }
                org.telegram.ui.Components.qc L = bulletinFactory.L(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), formatSpannable);
                org.telegram.ui.Components.ub ubVar = L.e;
                if (ubVar instanceof org.telegram.ui.Components.yb) {
                    TextView textView = ((org.telegram.ui.Components.yb) ubVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                L.j();
                return;
            }
        }
        org.telegram.ui.Wallet.s4 s4Var3 = this.g1;
        dismiss();
        Objects.requireNonNull(s4Var3);
        AndroidUtilities.runOnUIThread(new a3.d(s4Var3, 23), 250L);
    }

    public final void r2() {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (j2(this.currentAccount, e2()) || this.Y0)) {
            V2(false);
            return;
        }
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        TLRPC.Peer peer = e22.owner_id;
        if (peer == null) {
            peer = e22.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e22.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.t.i(e22.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new zq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.k0;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new z1(this, 4));
        this.f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        U2(2, true, null);
    }

    public final void s2(long j10, String str) {
        this.n1 = true;
        ca.y(this.currentAccount, false).K(j10, new ai.n1(3, this, str));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void setOverlayNavBarColor(int i10) {
        super.setOverlayNavBarColor(i10);
        AndroidUtilities.setNavigationBarColor((Dialog) this, 0, false);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.I0 != null && this.J0 == null) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
            e2Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.I0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new j(2, this, e2Var));
        } else if (this.F0 == null && (messageObject = this.H0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
                        e2Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new h2(this, tL_messageActionStarGift, e2Var2, 0));
                        return;
                    }
                    if (Y1() != null) {
                        org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
                        e2Var3.r(500L);
                        ca.y(this.currentAccount, false).M(Y1(), new ai.n1(2, this, e2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(boolean z10) {
        int i10;
        MessageObject messageObject = this.H0;
        int i11 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        if (!TextUtils.isEmpty(e22.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.R = string2;
            e2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        b7 b7Var = this.f0;
        if (z10) {
            b7Var.M.a(this.currentAccount, e22.gift_id, e22.getDocument(), e22.title);
            if (L1()) {
                z5 z5Var = b7Var.M;
                TL_stars.TL_starGiftUnique e23 = e2();
                if (e23 == null) {
                    z5Var.getClass();
                } else {
                    while (true) {
                        x5[] x5VarArr = z5Var.n;
                        if (i11 >= x5VarArr.length) {
                            break;
                        }
                        x5 x5Var = x5VarArr[i11];
                        TL_stars.StarGift starGift = x5Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            x5Var.a(e23, true);
                            break;
                        }
                        i11++;
                    }
                    z5Var.d(true);
                }
            }
        }
        z5 z5Var2 = b7Var.M;
        z5 z5Var3 = b7Var.M;
        z5Var2.setOnCraft(new j2(this, i12));
        if (this.W0 == null) {
            zh.f4 f4Var = new zh.f4(this.currentAccount, e22.gift_id);
            this.W0 = f4Var;
            f4Var.a();
        }
        z5Var3.setOnAddGift(new o4(this, e22, i12));
        z5Var3.setOnClose(new a2(this, 23));
        U2(4, true, null);
    }

    public final void u2(long j10) {
        fi.v3 v3Var = this.y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.y1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null || UserObject.isService(j10)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
            if (j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putBoolean("open_gifts", true);
        U.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        h5 h5Var = new h5(this, 0);
        this.T0 = h5Var;
        return h5Var;
    }

    public final void v2(boolean z10, qf.c cVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i10 = z10 ? 3 : 2;
        z3 z3Var = new z3(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.b0 = z3Var;
        twoStepVerificationActivity.a0 = W1();
        twoStepVerificationActivity.t0(new a3.l0(this, runnable, cVar, twoStepVerificationActivity, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w2() {
        int i10;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        org.telegram.ui.Components.xa xaVar;
        vg.g1 g1Var;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        fi.v3 v3Var = this.y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.y1 = null;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                    Context context = getContext();
                    MessageObject messageObject2 = this.H0;
                    if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            S2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.F0;
                    i12 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    S2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i11 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context2 = getContext();
                        int i13 = this.currentAccount;
                        vg.n1[] n1VarArr = {new vg.n1(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
                        vg.n1 n1Var = n1VarArr[0];
                        n1Var.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        xaVar = n1Var.e;
                        if (xaVar != null) {
                            xaVar.setTitle(n1Var.y());
                        }
                        g1Var = n1Var.b0;
                        if (g1Var != null) {
                            g1Var.setText(n1Var.y());
                        }
                        int max = currentTime <= i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
                        vg.n1 n1Var2 = n1VarArr[0];
                        n1Var2.H0 = true;
                        n1Var2.I0 = max;
                        n1Var2.h0(false, true);
                        vg.n1 n1Var3 = n1VarArr[0];
                        n1Var3.B0 = new t4(this, currentTime, i11, max, n1VarArr, tL_starGiftUnique2);
                        n1Var3.show();
                        return;
                    }
                }
                MessageObject messageObject3 = this.H0;
                if (messageObject3 == null || (message = messageObject3.messageOwner) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i11 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                        Context context22 = getContext();
                        int i132 = this.currentAccount;
                        vg.n1[] n1VarArr2 = {new vg.n1(context22, i132, BirthdayController.getInstance(i132).getState(), 3, this.resourcesProvider)};
                        vg.n1 n1Var4 = n1VarArr2[0];
                        n1Var4.z0 = LocaleController.getString(R.string.Gift2TransferShort);
                        xaVar = n1Var4.e;
                        if (xaVar != null) {
                        }
                        g1Var = n1Var4.b0;
                        if (g1Var != null) {
                        }
                        if (currentTime2 <= i11) {
                        }
                        vg.n1 n1Var22 = n1VarArr2[0];
                        n1Var22.H0 = true;
                        n1Var22.I0 = max;
                        n1Var22.h0(false, true);
                        vg.n1 n1Var32 = n1VarArr2[0];
                        n1Var32.B0 = new t4(this, currentTime2, i11, max, n1VarArr2, tL_starGiftUnique22);
                        n1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.F0;
        i10 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x2(long j10, long j11, boolean z10, Utilities.Callback callback) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new b6(getContext(), e22, chat), gb1.x(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider);
        textView.setTextSize(1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j11 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, W1(), DialogObject.getShortName(j10)) : LocaleController.formatString(R.string.Gift2TransferText, W1(), str)));
        linearLayout.addView(textView, gb1.x(-1, -2, 48, 24, 4, 24, 4));
        w01 w01Var = new w01(getContext(), this.resourcesProvider);
        H1(w01Var, ca.l(e22.attributes, TL_stars.starGiftAttributeModel.class));
        H1(w01Var, ca.l(e22.attributes, TL_stars.starGiftAttributeBackdrop.class));
        H1(w01Var, ca.l(e22.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(e22.slug) && (e22.flags & 256) != 0) {
            w01Var.c(LocaleController.getString(R.string.GiftValue2), b10.j("~", BillingController.getInstance().formatCurrency(e22.value_amount, e22.value_currency, BillingController.getInstance().getCurrencyExp(e22.value_currency), true)), null, null);
        }
        linearLayout.addView(w01Var, gb1.x(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? dd.P0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11))) : LocaleController.getString(R.string.Gift2TransferDo), new a1.c(callback, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.Z0 = z10;
        e2Var.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return this.V0;
    }

    public final void y2(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.H0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j11 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j11 = savedStarGift.transfer_stars;
        }
        x2(j10, j11, true, callback);
    }

    public final void z2() {
        TL_stars.InputSavedStarGift Y1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        fi.v3 v3Var = this.y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.y1 = null;
        }
        if (this.c1 == null && (Y1 = Y1()) != null) {
            MessageObject messageObject = this.H0;
            long j13 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j10 = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.H0.getFromChatId() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.id;
                j12 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.F0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.x0;
            if (z10) {
                textView.setText(LocaleController.getString(z12 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            zp zpVar = this.w0;
            zpVar.a(z14, false);
            ArrayList arrayList = this.o1;
            if (arrayList != null && (j12 > j10 || this.s1 != null)) {
                A2();
                return;
            }
            if (arrayList == null) {
                ca.y(this.currentAccount, false).K(j11, new y3(this, 2));
            }
            if (j12 > j10 || this.s1 != null) {
                return;
            }
            this.r1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = zpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject q5 = hi.m3.q(this.resourcesProvider, false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new r4(this, 0));
        }
    }
}
