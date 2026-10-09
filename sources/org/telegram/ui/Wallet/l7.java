package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e31;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bi0;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class l7 extends f71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean e;

    public static void Y(l7 l7Var, Utilities.Callback callback, k0 k0Var, p0 p0Var, h0 h0Var) {
        if (h0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        o oVar = null;
        callback.run(null);
        ArrayList g10 = h0Var.g();
        Activity parentActivity = l7Var.getParentActivity();
        org.telegram.ui.ActionBar.e6 e6Var = l7Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && k0Var.e()) {
            oVar = new o((f71) l7Var, k0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, e6Var, oVar, new ii1(16, l7Var, p0Var));
    }

    public static void Z(l7 l7Var, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        of.e g10 = b2Var.g(i10, true, true);
        g10.d();
        int i11 = l7Var.currentAccount;
        h7 h7Var = new h7(l7Var, g10, 0);
        k0 v = k0.v(i11);
        v.h0(new bi0(i11, h7Var, v));
    }

    public static void a0(l7 l7Var, Boolean bool) {
        k0 v = k0.v(l7Var.currentAccount);
        k kVar = new k(l7Var, bool, v);
        if (!bool.booleanValue() || !BuildVars.DEBUG_PRIVATE_VERSION) {
            kVar.run();
            return;
        }
        v.h0(new org.telegram.messenger.camera.i((Object) v, (Object) new z6(1, l7Var, kVar), false, true, 2));
    }

    public static void b0(l7 l7Var, Utilities.Callback callback, h0 h0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (h0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(l7Var.getParentActivity(), h0Var.g(), l7Var.resourceProvider, null, null);
        }
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, String str) {
        LinearLayout e7 = bi.e(context, 0);
        e7.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        e7.addView(imageView, w7.x5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView.setText(AndroidUtilities.replaceTags(str));
        e7.addView(textView, w7.x5.o(-1, -2, 1.0f, 16));
        return e7;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        LinearLayout e7 = bi.e(context, 1);
        int i12 = i10;
        while (i12 < i11) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
            StringBuilder sb2 = new StringBuilder();
            int i13 = i12 + 1;
            sb2.append(i13);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(26, -2, 8388613, 0, 0, 6, 0), context);
            h.setTextSize(1, 15.0f);
            h.setTypeface(AndroidUtilities.bold());
            h.setIncludeFontPadding(false);
            h.setLineSpacing(0.0f, 1.0f);
            h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            h.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(h, w7.x5.n(-2, -2));
            e7.addView(linearLayout, w7.x5.t(-2, -2, 8388611, 0, i12 != i10 ? 10 : 0, 0, 0));
            i12 = i13;
        }
        return e7;
    }

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var, o oVar, ii1 ii1Var) {
        ci.d dVar;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, e6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        y9 y9Var = new y9(activity);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(y9Var, w7.x5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        textView2.setText(LocaleController.getString(R.string.WalletRecoveryPhraseInfo));
        textView2.setMaxWidth(AndroidUtilities.dp(330.0f));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.x5.q(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout e02 = e0(0, size, activity, arrayList, e6Var);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, e6Var);
        linearLayout3.addView(e02, w7.x5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.x5.n(10, 0));
        linearLayout3.addView(e03, w7.x5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.x5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.x5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e7.addView(linearLayout, w7.x5.n(-1, -2));
        if (oVar != null) {
            dVar = new ci.d(activity, e6Var, true);
            dVar.setRoundRadius(24);
            e7.addView(dVar, w7.x5.a(48.0f, 14.0f, 14.0f, 14.0f, 4.0f, -1, 1));
        } else {
            dVar = null;
        }
        ci.d dVar2 = new ci.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        e7.addView(dVar2, w7.x5.a(48.0f, 14.0f, dVar != null ? 4.0f : 14.0f, 14.0f, 14.0f, -1, 1));
        f3Var.customView = e7;
        f3Var.fixNavigationBar();
        if (dVar != null && oVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            ci.d dVar3 = dVar;
            dVar3.setOnClickListener(new c7(dVar3, oVar, f3Var, e6Var, 1));
        }
        if (ii1Var != null) {
            dVar2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, e6Var));
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new e7(activity, e6Var, ii1Var, f3Var));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new e3(f3Var, 1));
        }
        f3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, e6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout e10 = org.telegram.messenger.q.e(activity, 1);
        e10.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        e31 e31Var = new e31(activity, e6Var);
        e31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        e31Var.setEmojiSize(100);
        y9 y9Var = e31Var.b;
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        e10.addView(e31Var, w7.x5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        ea0 ea0Var = e31Var.c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, ea0Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        ea0 ea0Var2 = e31Var.d;
        e31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, ea0Var2.getPaint().getFontMetricsInt(), false));
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        NotificationCenter.listenEmojiLoading(ea0Var);
        NotificationCenter.listenEmojiLoading(ea0Var2);
        e10.addView(d0(activity, e6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        e10.addView(d0(activity, e6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        e10.addView(d0(activity, e6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        e7.addView(e10, w7.x5.n(-1, -2));
        ci.d dVar = new ci.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        e7.addView(dVar, w7.x5.a(48.0f, 14.0f, 14.0f, 14.0f, 0.0f, -1, 7));
        f3Var.customView = e7;
        f3Var.fixNavigationBar();
        dVar.setOnClickListener(new c7(dVar, callback, f3Var, e6Var, 0));
        f3Var.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r1.f(r0.public_key) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0025, code lost:
    
        if (r10.f() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1.f(r0.public_key) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.f71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, c71 c71Var) {
        List<g0> list;
        k0 v = k0.v(this.currentAccount);
        TL_wallet.WalletState walletState = v.e;
        boolean z10 = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                p0 p0Var = v.c;
                if (p0Var != null) {
                }
            }
            com.google.android.gms.internal.vision.e2.n(R.string.WalletRecoveryPhraseLearnTitle, arrayList);
            p61 e7 = p61.e(1, LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton));
            e7.q = true;
            arrayList.add(e7);
            hg.c.n(R.string.WalletRecoveryPhraseTransferInfo, arrayList);
            TL_wallet.WalletState walletState2 = v.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        p0 p0Var2 = v.c;
                        if (p0Var2 != null) {
                        }
                    }
                }
                p61 e10 = p61.e(4, LocaleController.getString(R.string.WalletDeleteWallet));
                e10.r = true;
                arrayList.add(e10);
                list = v.D;
                if (list.isEmpty()) {
                    for (g0 g0Var : list) {
                        if (!g0Var.e || BuildVars.DEBUG_PRIVATE_VERSION) {
                            if (z10) {
                                arrayList.add(p61.B(null));
                                com.google.android.gms.internal.vision.e2.n(R.string.WalletPreviousWallets, arrayList);
                                z10 = false;
                            }
                            String str = g0Var.a;
                            long j3 = g0Var.c;
                            int i10 = g0Var.b;
                            boolean z11 = g0Var.e;
                            int i11 = j7.a;
                            p61 J = p61.J(j7.class);
                            J.l = str;
                            J.B = j3;
                            J.z = i10;
                            J.q = z11;
                            arrayList.add(J);
                        }
                    }
                    if (z10) {
                        return;
                    }
                    hg.c.n(R.string.WalletPreviousWalletsInfo, arrayList);
                    return;
                }
                return;
            }
            com.google.android.gms.internal.vision.e2.n(R.string.WalletEncryptedBackup, arrayList);
            TL_wallet.WalletState walletState3 = v.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                p61 e11 = p61.e(3, LocaleController.getString(R.string.WalletDisableBackup));
                e11.r = true;
                arrayList.add(e11);
                hg.c.n(R.string.WalletBackupEnabledDescription, arrayList);
            } else {
                p61 e12 = p61.e(2, LocaleController.getString(R.string.WalletEnableBackup));
                e12.q = true;
                arrayList.add(e12);
                hg.c.n(R.string.WalletBackupDisabledDescription, arrayList);
            }
            p61 e102 = p61.e(4, LocaleController.getString(R.string.WalletDeleteWallet));
            e102.r = true;
            arrayList.add(e102);
            list = v.D;
            if (list.isEmpty()) {
            }
        }
    }

    @Override // org.telegram.ui.Components.f71
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override // org.telegram.ui.Components.f71
    public final void W(p61 p61Var, View view) {
        int i10 = p61Var.d;
        if (i10 == 1) {
            k0 v = k0.v(this.currentAccount);
            if (!v.f()) {
                g0(getParentActivity(), getResourceProvider(), new b7(this, 0));
                return;
            }
            a7 a7Var = new a7();
            a7Var.s = v.w();
            presentFragment(a7Var);
            return;
        }
        if (i10 == 3) {
            k0 v9 = k0.v(this.currentAccount);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            b2Var.q(500L);
            i iVar = new i(this, b2Var, v9);
            k0.E("emulate disable backup: when ready");
            ii1 ii1Var = new ii1(4, v9, iVar);
            if (!v9.D() || v9.f == null) {
                v9.v.add(new WeakReference(ii1Var));
                return;
            } else {
                ii1Var.run();
                return;
            }
        }
        if (i10 == 2) {
            k0 v10 = k0.v(this.currentAccount);
            b7 b7Var = new b7(this, 1);
            k0.E("enable backup: when ready...");
            v10.h0(new ii1(2, v10, b7Var));
            return;
        }
        if (i10 != 4) {
            if (p61Var.G(j7.class)) {
                String charSequence = p61Var.l.toString();
                g0(getParentActivity(), getResourceProvider(), new q(this, k0.v(this.currentAccount), charSequence, new p0(getParentActivity(), charSequence, this.currentAccount)));
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.b2 h02 = org.telegram.ui.Components.g5.h0(getParentActivity(), LocaleController.getString(R.string.WalletDeleteWalletTitle), LocaleController.getString(R.string.WalletDeleteWalletInfo), BuildVars.DEBUG_PRIVATE_VERSION ? LocaleController.getString(R.string.WalletSaveOnDevice) : null, LocaleController.getString(R.string.WalletDeleteAnyway), new b7(this, 2), getResourceProvider(), false);
        TextView textView = (TextView) h02.d(-1);
        if (textView != null) {
            textView.setTextColor(h02.e(org.telegram.ui.ActionBar.i6.q7));
        }
    }

    @Override // org.telegram.ui.Components.f71
    public final boolean X(p61 p61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.f71, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.p1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        if (i10 != NotificationCenter.walletUpdate || (e71Var = this.a) == null) {
            return;
        }
        e71Var.W2.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        this.e = true;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
