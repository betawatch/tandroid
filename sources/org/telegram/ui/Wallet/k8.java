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
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u21;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.m71;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class k8 extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList d = new ArrayList();
    public boolean e;

    public static void Y(k8 k8Var, Utilities.Callback callback, m0 m0Var, q0 q0Var, j0 j0Var) {
        if (j0Var == null) {
            callback.run("STORAGE_FAILED");
            return;
        }
        p pVar = null;
        callback.run(null);
        ArrayList g10 = j0Var.g();
        Activity parentActivity = k8Var.getParentActivity();
        org.telegram.ui.ActionBar.d6 d6Var = k8Var.resourceProvider;
        if (BuildVars.DEBUG_PRIVATE_VERSION && m0Var.d()) {
            pVar = new p((v61) k8Var, m0Var, (Object) g10, 6);
        }
        f0(parentActivity, g10, d6Var, pVar, new t3(13, k8Var, q0Var));
    }

    public static void Z(k8 k8Var, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        pf.c g10 = b2Var.g(i10, true, true);
        g10.d();
        int i11 = k8Var.currentAccount;
        g8 g8Var = new g8(k8Var, g10, 0);
        m0 w9 = m0.w(i11);
        w9.j0(new w31(i11, g8Var, w9));
    }

    public static void a0(k8 k8Var, Boolean bool) {
        m0 w9 = m0.w(k8Var.currentAccount);
        h hVar = new h(k8Var, bool, w9, 19);
        if (!bool.booleanValue() || !BuildVars.DEBUG_PRIVATE_VERSION) {
            hVar.run();
            return;
        }
        w9.j0(new e2.o0((Object) w9, (Object) new x(8, k8Var, hVar), false, true, 3));
    }

    public static void b0(k8 k8Var, Utilities.Callback callback, j0 j0Var, String str) {
        if (str != null) {
            callback.run(str);
        } else if (j0Var == null) {
            callback.run("WORDS_NULL");
        } else {
            callback.run(null);
            f0(k8Var.getParentActivity(), j0Var.g(), k8Var.resourceProvider, null, null);
        }
    }

    public static LinearLayout d0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str) {
        LinearLayout e = wh.e(context, 0);
        e.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(i10);
        e.addView(imageView, w7.z5.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setText(AndroidUtilities.replaceTags(str));
        e.addView(textView, w7.z5.o(-1, -2, 1.0f, 16));
        return e;
    }

    public static LinearLayout e0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var) {
        LinearLayout e = wh.e(context, 1);
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
            StringBuilder sb2 = new StringBuilder();
            int i13 = i12 + 1;
            sb2.append(i13);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView i14 = com.google.android.gms.internal.cast.a6.i(linearLayout, textView, w7.z5.t(26, -2, 8388613, 0, 0, 6, 0), context);
            i14.setTextSize(1, 15.0f);
            i14.setTypeface(AndroidUtilities.bold());
            i14.setIncludeFontPadding(false);
            i14.setLineSpacing(0.0f, 1.0f);
            i14.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            i14.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(i14, w7.z5.n(-2, -2));
            e.addView(linearLayout, w7.z5.t(-2, -2, 8388611, 0, i12 != i10 ? 10 : 0, 0, 0));
            i12 = i13;
        }
        return e;
    }

    public static void f0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var, p pVar, t3 t3Var) {
        ei.d dVar;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, d6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.q.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView.setText(LocaleController.getString(R.string.WalletYourRecoveryPhrase));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        textView2.setText(LocaleController.getString(R.string.WalletRecoveryPhraseInfo));
        textView2.setMaxWidth(AndroidUtilities.dp(330.0f));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.z5.q(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout e02 = e0(0, size, activity, arrayList, d6Var);
        LinearLayout e03 = e0(size, arrayList.size(), activity, arrayList, d6Var);
        linearLayout3.addView(e02, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.z5.n(10, 0));
        linearLayout3.addView(e03, w7.z5.o(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.z5.q(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.z5.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e.addView(linearLayout, w7.z5.n(-1, -2));
        if (pVar != null) {
            dVar = new ei.d(activity, d6Var, true);
            dVar.setRoundRadius(24);
            e.addView(dVar, w7.z5.a(48.0f, 14.0f, 14.0f, 14.0f, 4.0f, -1, 1));
        } else {
            dVar = null;
        }
        ei.d dVar2 = new ei.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        e.addView(dVar2, w7.z5.a(48.0f, 14.0f, dVar != null ? 4.0f : 14.0f, 14.0f, 14.0f, -1, 1));
        f3Var.customView = e;
        f3Var.fixNavigationBar();
        if (dVar != null && pVar != null) {
            dVar2.setFilled(false);
            dVar.setText(LocaleController.getString(R.string.WalletImportThisWallet));
            ei.d dVar3 = dVar;
            dVar3.setOnClickListener(new b8(dVar3, pVar, f3Var, d6Var, 1));
        }
        if (t3Var != null) {
            dVar2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, d6Var));
            dVar2.setText(LocaleController.getString(R.string.WalletDelete));
            dVar2.setOnClickListener(new d8(activity, d6Var, t3Var, f3Var));
        } else {
            dVar2.setText(LocaleController.getString(R.string.WalletDone));
            dVar2.setOnClickListener(new l3(f3Var, 1));
        }
        f3Var.show();
    }

    public static void g0(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, d6Var, false);
        f3Var.fixNavigationBar();
        LinearLayout e = org.telegram.messenger.q.e(activity, 1);
        e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        e7.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), 0);
        u21 u21Var = new u21(activity, d6Var);
        u21Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(4.0f));
        u21Var.setEmojiSize(100);
        org.telegram.ui.Components.w9 w9Var = u21Var.b;
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        e7.addView(u21Var, w7.z5.q(-1, -2, 7));
        String string = LocaleController.getString(R.string.WalletRecoveryPhraseLearnTitle);
        x90 x90Var = u21Var.c;
        CharSequence replaceEmoji = Emoji.replaceEmoji(string, x90Var.getPaint().getFontMetricsInt(), false);
        String string2 = LocaleController.getString(R.string.WalletRecoveryPhraseLearnInfo);
        x90 x90Var2 = u21Var.d;
        u21Var.a(replaceEmoji, Emoji.replaceEmoji(string2, x90Var2.getPaint().getFontMetricsInt(), false));
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        NotificationCenter.listenEmojiLoading(x90Var);
        NotificationCenter.listenEmojiLoading(x90Var2);
        e7.addView(d0(activity, d6Var, R.drawable.wallet_learn_hidden, LocaleController.getString(R.string.WalletRecoveryPhraseNeverShare)));
        e7.addView(d0(activity, d6Var, R.drawable.wallet_learn_warn, LocaleController.getString(R.string.WalletRecoveryPhraseFundsWarning)));
        e7.addView(d0(activity, d6Var, R.drawable.wallet_learn_protected, LocaleController.getString(R.string.WalletRecoveryPhraseSupportWarning)));
        e.addView(e7, w7.z5.n(-1, -2));
        ei.d dVar = new ei.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton), false, true);
        e.addView(dVar, w7.z5.a(48.0f, 14.0f, 14.0f, 14.0f, 0.0f, -1, 7));
        f3Var.customView = e;
        f3Var.fixNavigationBar();
        dVar.setOnClickListener(new b8(dVar, callback, f3Var, d6Var, 0));
        f3Var.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r1.f(r0.public_key) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0025, code lost:
    
        if (r10.e() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1.f(r0.public_key) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.v61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, s61 s61Var) {
        List<i0> list;
        m0 w9 = m0.w(this.currentAccount);
        TL_wallet.WalletState walletState = w9.e;
        boolean z10 = true;
        if (walletState instanceof TL_wallet.TL_walletState) {
            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState;
            if (!tL_walletState.can_export_phrase) {
                q0 q0Var = w9.c;
                if (q0Var != null) {
                }
            }
            i0.a.p(R.string.WalletRecoveryPhraseLearnTitle, arrayList);
            f61 e = f61.e(1, LocaleController.getString(R.string.WalletRecoveryPhraseLearnButton));
            e.q = true;
            arrayList.add(e);
            i0.a.A(R.string.WalletRecoveryPhraseTransferInfo, arrayList);
            TL_wallet.WalletState walletState2 = w9.e;
            if (!(!(walletState2 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState2).backup_enabled)) {
                if (walletState2 instanceof TL_wallet.TL_walletState) {
                    TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState2;
                    if (tL_walletState2.can_enable_backup) {
                        q0 q0Var2 = w9.c;
                        if (q0Var2 != null) {
                        }
                    }
                }
                f61 e7 = f61.e(4, LocaleController.getString(R.string.WalletDeleteWallet));
                e7.r = true;
                arrayList.add(e7);
                list = w9.H;
                if (list.isEmpty()) {
                    for (i0 i0Var : list) {
                        if (!i0Var.e || BuildVars.DEBUG_PRIVATE_VERSION) {
                            if (z10) {
                                arrayList.add(f61.B(null));
                                i0.a.p(R.string.WalletPreviousWallets, arrayList);
                                z10 = false;
                            }
                            String str = i0Var.a;
                            long j10 = i0Var.c;
                            int i10 = i0Var.b;
                            boolean z11 = i0Var.e;
                            int i11 = i8.a;
                            f61 J = f61.J(i8.class);
                            J.l = str;
                            J.B = j10;
                            J.z = i10;
                            J.q = z11;
                            arrayList.add(J);
                        }
                    }
                    if (z10) {
                        return;
                    }
                    i0.a.A(R.string.WalletPreviousWalletsInfo, arrayList);
                    return;
                }
                return;
            }
            i0.a.p(R.string.WalletEncryptedBackup, arrayList);
            TL_wallet.WalletState walletState3 = w9.e;
            if (!(walletState3 instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState3).backup_enabled) {
                f61 e10 = f61.e(3, LocaleController.getString(R.string.WalletDisableBackup));
                e10.r = true;
                arrayList.add(e10);
                i0.a.A(R.string.WalletBackupEnabledDescription, arrayList);
            } else {
                f61 e11 = f61.e(2, LocaleController.getString(R.string.WalletEnableBackup));
                e11.q = true;
                arrayList.add(e11);
                i0.a.A(R.string.WalletBackupDisabledDescription, arrayList);
            }
            f61 e72 = f61.e(4, LocaleController.getString(R.string.WalletDeleteWallet));
            e72.r = true;
            arrayList.add(e72);
            list = w9.H;
            if (list.isEmpty()) {
            }
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletKeysAndBackup);
    }

    @Override // org.telegram.ui.Components.v61
    public final void W(f61 f61Var, View view) {
        int i10 = f61Var.d;
        if (i10 == 1) {
            m0 w9 = m0.w(this.currentAccount);
            if (!w9.e()) {
                g0(getParentActivity(), getResourceProvider(), new a8(this, 0));
                return;
            }
            z7 z7Var = new z7();
            z7Var.s = w9.x();
            presentFragment(z7Var);
            return;
        }
        if (i10 == 3) {
            m0 w10 = m0.w(this.currentAccount);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            b2Var.q(500L);
            k kVar = new k(this, b2Var, w10);
            m0.F("emulate disable backup: when ready");
            m71 m71Var = new m71(26, w10, kVar);
            if (!w10.E() || w10.f == null) {
                w10.w.add(new WeakReference(m71Var));
                return;
            } else {
                m71Var.run();
                return;
            }
        }
        if (i10 == 2) {
            m0 w11 = m0.w(this.currentAccount);
            a8 a8Var = new a8(this, 1);
            m0.F("enable backup: when ready...");
            w11.j0(new m71(24, w11, a8Var));
            return;
        }
        if (i10 != 4) {
            if (f61Var.G(i8.class)) {
                String charSequence = f61Var.l.toString();
                g0(getParentActivity(), getResourceProvider(), new o(this, m0.w(this.currentAccount), charSequence, new q0(getParentActivity(), charSequence, this.currentAccount)));
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.b2 h02 = org.telegram.ui.Components.f5.h0(getParentActivity(), LocaleController.getString(R.string.WalletDeleteWalletTitle), LocaleController.getString(R.string.WalletDeleteWalletInfo), BuildVars.DEBUG_PRIVATE_VERSION ? LocaleController.getString(R.string.WalletSaveOnDevice) : null, LocaleController.getString(R.string.WalletDeleteAnyway), new a8(this, 2), getResourceProvider(), false);
        TextView textView = (TextView) h02.d(-1);
        if (textView != null) {
            textView.setTextColor(h02.e(org.telegram.ui.ActionBar.h6.q7));
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final boolean X(f61 f61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.v61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.p1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 != NotificationCenter.walletUpdate || (u61Var = this.a) == null) {
            return;
        }
        u61Var.W2.N(true);
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
            ((h0) obj).close();
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
