package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.fx;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h8 extends n71 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static void Z(h8 h8Var, Utilities.Callback callback, l0 l0Var, p0 p0Var, i0 i0Var) {
        if (i0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        o oVar = null;
        callback.run(null);
        ArrayList g7 = i0Var.g();
        Activity parentActivity = h8Var.getParentActivity();
        org.telegram.ui.ActionBar.u6 u6Var = h8Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && l0Var.e()) {
            oVar = new o((n71) h8Var, l0Var, (Object) g7, 6);
        }
        g0(parentActivity, g7, u6Var, oVar, new a6(4, h8Var, p0Var));
    }

    public static void a0(h8 h8Var, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        qf.c h = e2Var.h(i10, true, true);
        h.d();
        int i11 = h8Var.currentAccount;
        d8 d8Var = new d8(h8Var, h, 0);
        l0 x9 = l0.x(i11);
        x9.m0(new fx(i11, d8Var, x9));
    }

    public static void b0(h8 h8Var, Boolean bool) {
        l0 x9 = l0.x(h8Var.currentAccount);
        h hVar = new h(h8Var, bool, x9, 20);
        if (!bool.booleanValue() || !BuildVars.DEBUG_PRIVATE_VERSION) {
            hVar.run();
            return;
        }
        x9.m0(new e2.p0((Object) x9, (Object) new s(10, h8Var, hVar), false, true, 3));
    }

    public static void c0(h8 h8Var, Utilities.Callback callback, i0 i0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (i0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            g0(h8Var.getParentActivity(), i0Var.g(), h8Var.resourceProvider, null, null);
        }
    }

    public static LinearLayout e0(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, String str) {
        LinearLayout d = wh.d(context, 0);
        d.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i10);
        d.addView(imageView, kb1.x(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setText(AndroidUtilities.replaceTags(str));
        d.addView(textView, kb1.s(-1, -2, 1.0f, 16));
        return d;
    }

    public static LinearLayout f0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        LinearLayout d = wh.d(context, 1);
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
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.z6, u6Var);
            StringBuilder sb2 = new StringBuilder();
            int i13 = i12 + 1;
            sb2.append(i13);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView e = wh.e(linearLayout, textView, kb1.x(26, -2, 8388613, 0, 0, 6, 0), context);
            e.setTextSize(1, 15.0f);
            e.setTypeface(AndroidUtilities.bold());
            e.setIncludeFontPadding(false);
            e.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.G6, u6Var);
            e.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(e, kb1.r(-2, -2));
            d.addView(linearLayout, kb1.x(-2, -2, 8388611, 0, i12 != i10 ? 10 : 0, 0, 0));
            i12 = i13;
        }
        return d;
    }

    public static void g0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var, o oVar, a6 a6Var) {
        fi.d dVar;
        org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, u6Var2, false);
        k3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(y9Var, kb1.x(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var2);
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, kb1.x(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, u6Var2);
        textView2.setText(LocaleController.getString(R.string.WalletRecoveryPhraseInfo));
        textView2.setMaxWidth(AndroidUtilities.dp(330.0f));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, kb1.u(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout f02 = f0(0, size, activity, arrayList, u6Var2);
        LinearLayout f03 = f0(size, arrayList.size(), activity, arrayList, u6Var2);
        linearLayout3.addView(f02, kb1.s(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), kb1.r(10, 0));
        linearLayout3.addView(f03, kb1.s(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, kb1.u(-1, -2, 1));
        linearLayout.addView(linearLayout2, kb1.o(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        f7.addView(linearLayout, kb1.r(-1, -2));
        if (oVar != null) {
            dVar = new fi.d(activity, u6Var2, true);
            dVar.setRoundRadius(24);
            f7.addView(dVar, kb1.h(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 4.0f));
        } else {
            dVar = null;
        }
        fi.d dVar2 = new fi.d(activity, u6Var2, true);
        dVar2.setRoundRadius(24);
        f7.addView(dVar2, kb1.h(-1, 48.0f, 1, 14.0f, dVar != null ? 4.0f : 14.0f, 14.0f, 14.0f));
        k3Var.customView = f7;
        k3Var.fixNavigationBar();
        if (dVar != null && oVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            fi.d dVar3 = dVar;
            y7 y7Var = new y7(dVar3, oVar, k3Var, u6Var, 1);
            k3Var = k3Var;
            u6Var2 = u6Var;
            dVar3.setOnClickListener(y7Var);
        }
        if (a6Var != null) {
            int i10 = org.telegram.ui.ActionBar.y6.q7;
            dVar2.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var2));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
                dVar2.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(dVar2, background, N, null, u6Var2);
            }
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new a8(activity, u6Var2, a6Var, k3Var, 0));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new n3(k3Var, 1));
        }
        k3Var.show();
    }

    public static void h0(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, u6Var, false);
        k3Var.fixNavigationBar();
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout f10 = org.telegram.messenger.t.f(activity, 1);
        f10.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        k31 k31Var = new k31(activity, u6Var);
        k31Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        k31Var.setEmojiSize(100);
        org.telegram.ui.Components.y9 y9Var = k31Var.b;
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        f10.addView(k31Var, kb1.u(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        aa0 aa0Var = k31Var.c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, aa0Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        aa0 aa0Var2 = k31Var.d;
        k31Var.a(replaceEmoji, Emoji.replaceEmoji(string2, aa0Var2.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.V(aa0Var2, org.telegram.ui.ActionBar.y6.z6, u6Var);
        NotificationCenter.listenEmojiLoading(aa0Var);
        NotificationCenter.listenEmojiLoading(aa0Var2);
        f10.addView(e0(activity, u6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        f10.addView(e0(activity, u6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        f10.addView(e0(activity, u6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        f7.addView(f10, kb1.r(-1, -2));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        f7.addView(dVar, kb1.h(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        k3Var.customView = f7;
        k3Var.fixNavigationBar();
        dVar.setOnClickListener(new y7(dVar, callback, k3Var, u6Var, 0));
        k3Var.show();
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
    @Override // org.telegram.ui.Components.n71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(ArrayList arrayList, k71 k71Var) {
        List<h0> list;
        l0 x9 = l0.x(this.currentAccount);
        TL_wallet.WalletState walletState = x9.e;
        boolean z10 = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                p0 p0Var = x9.c;
                if (p0Var != null) {
                }
            }
            ic.a.p(R.string.WalletRecoveryPhraseLearnTitle, arrayList);
            u61 e = u61.e(1, LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton));
            e.q = true;
            arrayList.add(e);
            ic.a.z(R.string.WalletRecoveryPhraseTransferInfo, arrayList);
            TL_wallet.WalletState walletState2 = x9.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        p0 p0Var2 = x9.c;
                        if (p0Var2 != null) {
                        }
                    }
                }
                u61 e10 = u61.e(4, LocaleController.getString(R.string.WalletDeleteWallet));
                e10.r = true;
                arrayList.add(e10);
                list = x9.H;
                if (list.isEmpty()) {
                    for (h0 h0Var : list) {
                        if (!h0Var.e || BuildVars.DEBUG_PRIVATE_VERSION) {
                            if (z10) {
                                arrayList.add(u61.C(null));
                                ic.a.p(R.string.WalletPreviousWallets, arrayList);
                                z10 = false;
                            }
                            String str = h0Var.a;
                            long j10 = h0Var.c;
                            int i10 = h0Var.b;
                            boolean z11 = h0Var.e;
                            int i11 = f8.a;
                            u61 K = u61.K(f8.class);
                            K.l = str;
                            K.B = j10;
                            K.z = i10;
                            K.q = z11;
                            arrayList.add(K);
                        }
                    }
                    if (z10) {
                        return;
                    }
                    ic.a.z(R.string.WalletPreviousWalletsInfo, arrayList);
                    return;
                }
                return;
            }
            ic.a.p(R.string.WalletEncryptedBackup, arrayList);
            TL_wallet.WalletState walletState3 = x9.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                u61 e11 = u61.e(3, LocaleController.getString(R.string.WalletDisableBackup));
                e11.r = true;
                arrayList.add(e11);
                ic.a.z(R.string.WalletBackupEnabledDescription, arrayList);
            } else {
                u61 e12 = u61.e(2, LocaleController.getString(R.string.WalletEnableBackup));
                e12.q = true;
                arrayList.add(e12);
                ic.a.z(R.string.WalletBackupDisabledDescription, arrayList);
            }
            u61 e102 = u61.e(4, LocaleController.getString(R.string.WalletDeleteWallet));
            e102.r = true;
            arrayList.add(e102);
            list = x9.H;
            if (list.isEmpty()) {
            }
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override // org.telegram.ui.Components.n71
    public final void X(u61 u61Var, View view) {
        int i10 = u61Var.d;
        if (i10 == 1) {
            l0 x9 = l0.x(this.currentAccount);
            if (!x9.f()) {
                h0(getParentActivity(), getResourceProvider(), new x7(this, 0));
                return;
            }
            w7 w7Var = new w7();
            w7Var.s = x9.y();
            presentFragment(w7Var);
            return;
        }
        if (i10 == 3) {
            l0 x10 = l0.x(this.currentAccount);
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
            e2Var.r(500L);
            j jVar = new j(this, e2Var, x10);
            l0.H("emulate disable backup: when ready");
            yc1 yc1Var = new yc1(17, x10, jVar);
            if (!x10.G() || x10.f == null) {
                x10.w.add(new WeakReference(yc1Var));
                return;
            } else {
                yc1Var.run();
                return;
            }
        }
        if (i10 == 2) {
            l0 x11 = l0.x(this.currentAccount);
            x7 x7Var = new x7(this, 1);
            l0.H("enable backup: when ready...");
            x11.m0(new yc1(15, x11, x7Var));
            return;
        }
        if (i10 != 4) {
            if (u61Var.H(f8.class)) {
                String charSequence = u61Var.l.toString();
                h0(getParentActivity(), getResourceProvider(), new n(this, l0.x(this.currentAccount), charSequence, new p0(getParentActivity(), charSequence, this.currentAccount)));
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e2 h02 = org.telegram.ui.Components.g5.h0(getParentActivity(), LocaleController.getString(R.string.WalletDeleteWalletTitle), LocaleController.getString(R.string.WalletDeleteWalletInfo), BuildVars.DEBUG_PRIVATE_VERSION ? LocaleController.getString(R.string.WalletSaveOnDevice) : null, LocaleController.getString(R.string.WalletDeleteAnyway), new x7(this, 2), getResourceProvider(), false);
        TextView textView = (TextView) h02.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, h02.k1);
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean Y(u61 u61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.u1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m71 m71Var;
        if (i10 != NotificationCenter.walletUpdate || (m71Var = this.a) == null) {
            return;
        }
        m71Var.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
