package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.dy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q extends org.telegram.ui.Wallet.j2 implements NotificationCenter.NotificationCenterDelegate {
    public final AgentController b0;
    public final dy0 c0;
    public final boolean d0;
    public final p e0;
    public final s71 f0;
    public final s71 g0;
    public final FrameLayout h0;
    public final FrameLayout i0;
    public final FrameLayout j0;
    public final TextView k0;
    public final org.telegram.ui.Cells.g3 l0;
    public final TextView m0;
    public final FrameLayout n0;
    public final fi.d o0;
    public TL_agent.agentProvider p0;
    public boolean q0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hi.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Activity activity, int i10, dy0 dy0Var, u6 u6Var) {
        super(activity, r8, u6Var);
        p pVar = new p(activity);
        View[] viewArr = new View[2];
        pVar.a = viewArr;
        this.e0 = pVar;
        this.currentAccount = i10;
        AgentController agentController = AgentController.getInstance(i10);
        this.b0 = agentController;
        this.p0 = null;
        this.d0 = false;
        this.c0 = dy0Var;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.h0 = S(activity, LocaleController.getString(R.string.AgentConnectApiKey), null);
        final int i11 = 0;
        this.i0 = S(activity, LocaleController.getString(R.string.AgentApiKey), new View.OnClickListener(this) { // from class: hi.l
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q qVar = this.b;
                        if (!qVar.q0) {
                            AndroidUtilities.hideKeyboard(qVar.l0.d);
                            qVar.e0.b(0, true);
                            break;
                        }
                        break;
                    default:
                        this.b.R();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(activity);
        this.j0 = frameLayout;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(getThemedColor(y6.L6));
        textView.setText(LocaleController.getString(R.string.AgentApiKeyHeader));
        frameLayout.addView(textView, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.k0 = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(y6.p7));
        textView2.setText(LocaleController.getString(R.string.AgentApiKeyInvalid));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(activity, "", true, false, -1, u6Var);
        this.l0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setInputType(655361);
        e3Var.setTypeface(Typeface.MONOSPACE);
        TextView textView3 = new TextView(activity);
        this.m0 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setTextColor(getThemedColor(y6.H6));
        textView3.setText(LocaleController.getString(R.string.AgentApiKeyPlaceholder));
        textView3.setSingleLine();
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView3.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f));
        textView3.setClickable(false);
        textView3.setFocusable(false);
        g3Var.addView(textView3, kb1.i(-1, -2, 48));
        g3Var.d(new m(this, 0));
        e3Var.addTextChangedListener(new o(this));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.n0 = frameLayout2;
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        this.o0 = dVar;
        final int i12 = 1;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        q qVar = this.b;
                        if (!qVar.q0) {
                            AndroidUtilities.hideKeyboard(qVar.l0.d);
                            qVar.e0.b(0, true);
                            break;
                        }
                        break;
                    default:
                        this.b.R();
                        break;
                }
            }
        });
        frameLayout2.addView(dVar, kb1.h(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
        final int i13 = 0;
        s71 T = T(activity, new Utilities.Callback2(this) { // from class: hi.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i14 = i13;
                q qVar = this.b;
                ArrayList arrayList = (ArrayList) obj;
                switch (i14) {
                    case 0:
                        AgentController agentController2 = qVar.b0;
                        if (agentController2 != null) {
                            arrayList.add(u61.m(qVar.h0));
                            ic.a.p(R.string.AgentProviderHeader, arrayList);
                            for (int i15 = 0; i15 < agentController2.providers.size(); i15++) {
                                TL_agent.agentProvider agentprovider = agentController2.providers.get(i15);
                                int i16 = r.a;
                                u61 K = u61.K(r.class);
                                K.d = 1;
                                K.G = agentprovider;
                                K.z = 1;
                                arrayList.add(K);
                            }
                            if (agentController2.providers.isEmpty()) {
                                arrayList.add(u61.p(6));
                            }
                            arrayList.add(u61.C(LocaleController.getString(R.string.AgentProviderInfo)));
                            arrayList.add(u61.D(AndroidUtilities.dp(8.0f)));
                            break;
                        }
                        break;
                    default:
                        if (qVar.b0 != null && qVar.p0 != null) {
                            arrayList.add(u61.m(qVar.i0));
                            TL_agent.agentProvider agentprovider2 = qVar.p0;
                            int i17 = r.a;
                            u61 K2 = u61.K(r.class);
                            K2.d = 0;
                            K2.G = agentprovider2;
                            K2.z = 0;
                            K2.g = false;
                            arrayList.add(K2);
                            arrayList.add(u61.C(null));
                            arrayList.add(u61.k(qVar.j0));
                            arrayList.add(u61.k(qVar.l0));
                            if (TextUtils.isEmpty(qVar.p0.key_url)) {
                                arrayList.add(u61.C(LocaleController.getString(R.string.AgentApiKeyHint).replace("**", "")));
                            } else {
                                arrayList.add(u61.C(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AgentApiKeyHint), new e2.q0(27, qVar, qVar.p0.key_url))));
                            }
                            arrayList.add(u61.m(qVar.n0));
                            break;
                        }
                        break;
                }
            }
        }, new e1.c(this, 16));
        this.f0 = T;
        final int i14 = 1;
        s71 T2 = T(activity, new Utilities.Callback2(this) { // from class: hi.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i142 = i14;
                q qVar = this.b;
                ArrayList arrayList = (ArrayList) obj;
                switch (i142) {
                    case 0:
                        AgentController agentController2 = qVar.b0;
                        if (agentController2 != null) {
                            arrayList.add(u61.m(qVar.h0));
                            ic.a.p(R.string.AgentProviderHeader, arrayList);
                            for (int i15 = 0; i15 < agentController2.providers.size(); i15++) {
                                TL_agent.agentProvider agentprovider = agentController2.providers.get(i15);
                                int i16 = r.a;
                                u61 K = u61.K(r.class);
                                K.d = 1;
                                K.G = agentprovider;
                                K.z = 1;
                                arrayList.add(K);
                            }
                            if (agentController2.providers.isEmpty()) {
                                arrayList.add(u61.p(6));
                            }
                            arrayList.add(u61.C(LocaleController.getString(R.string.AgentProviderInfo)));
                            arrayList.add(u61.D(AndroidUtilities.dp(8.0f)));
                            break;
                        }
                        break;
                    default:
                        if (qVar.b0 != null && qVar.p0 != null) {
                            arrayList.add(u61.m(qVar.i0));
                            TL_agent.agentProvider agentprovider2 = qVar.p0;
                            int i17 = r.a;
                            u61 K2 = u61.K(r.class);
                            K2.d = 0;
                            K2.G = agentprovider2;
                            K2.z = 0;
                            K2.g = false;
                            arrayList.add(K2);
                            arrayList.add(u61.C(null));
                            arrayList.add(u61.k(qVar.j0));
                            arrayList.add(u61.k(qVar.l0));
                            if (TextUtils.isEmpty(qVar.p0.key_url)) {
                                arrayList.add(u61.C(LocaleController.getString(R.string.AgentApiKeyHint).replace("**", "")));
                            } else {
                                arrayList.add(u61.C(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AgentApiKeyHint), new e2.q0(27, qVar, qVar.p0.key_url))));
                            }
                            arrayList.add(u61.m(qVar.n0));
                            break;
                        }
                        break;
                }
            }
        }, null);
        this.g0 = T2;
        viewArr[0] = T;
        viewArr[1] = T2;
        pVar.addView(T, kb1.i(-1, -2, 48));
        pVar.addView(T2, kb1.i(-1, -2, 48));
        pVar.a();
        agentController.loadProviders();
        T.g3.O(false);
    }

    public static void Q(q qVar, String str, TLRPC.TL_error tL_error) {
        org.telegram.ui.Cells.g3 g3Var = qVar.l0;
        qVar.q0 = false;
        fi.d dVar = qVar.o0;
        dVar.setLoading(false);
        TL_agent.agentProvider agentprovider = qVar.p0;
        if (agentprovider != null) {
            dVar.i(LocaleController.formatString(R.string.AgentConnectProvider, agentprovider.title), true, true);
        }
        qVar.V();
        if (tL_error == null) {
            AndroidUtilities.hideKeyboard(g3Var.d);
            qVar.dismiss();
            dy0 dy0Var = qVar.c0;
            if (dy0Var != null) {
                dy0Var.run(str);
                return;
            }
            return;
        }
        if ("AGENT_KEY_INVALID".equals(tL_error.text)) {
            qVar.U(true);
            AndroidUtilities.shakeViewSpring(g3Var, -6.0f);
        } else if ("AGENT_PROVIDER_UNAVAILABLE".equals(tL_error.text)) {
            wh.n(R.string.AgentProviderUnavailable, new wc(qVar.getContainer(), qVar.resourcesProvider), null);
        } else if ("AGENT_NOT_AVAILABLE".equals(tL_error.text)) {
            wh.n(R.string.AgentNotAvailable, new wc(qVar.getContainer(), qVar.resourcesProvider), null);
        } else {
            new wc(qVar.getContainer(), qVar.resourcesProvider).g0(tL_error, false);
        }
    }

    public final void R() {
        if (this.p0 == null || this.q0) {
            return;
        }
        String trim = this.l0.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        this.q0 = true;
        String string = LocaleController.getString(R.string.AgentConnecting);
        fi.d dVar = this.o0;
        dVar.i(string, true, true);
        dVar.setLoading(true);
        V();
        String str = this.p0.id;
        this.b0.connect(str, trim, new ai.n1(16, this, str));
    }

    public final FrameLayout S(Context context, String str, l lVar) {
        FrameLayout frameLayout = new FrameLayout(context);
        if (lVar != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_ab_back);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(y6.G6), PorterDuff.Mode.SRC_IN));
            imageView.setBackground(y6.g0(getThemedColor(y6.i6), 1, -1));
            imageView.setOnClickListener(lVar);
            kb1.b(imageView);
            frameLayout.addView(imageView, kb1.h(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        }
        TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
        g7.setTypeface(AndroidUtilities.bold());
        g7.setTextColor(getThemedColor(y6.G6));
        g7.setSingleLine();
        g7.setEllipsize(TextUtils.TruncateAt.END);
        g7.setText(str);
        frameLayout.addView(g7, kb1.h(-1, -2.0f, 23, lVar != null ? 60.0f : 22.0f, 0.0f, 22.0f, 0.0f));
        frameLayout.setMinimumHeight(AndroidUtilities.dp(56.0f));
        return frameLayout;
    }

    public final s71 T(Context context, Utilities.Callback2 callback2, e1.c cVar) {
        s71 s71Var = new s71(context, this.currentAccount, 0, true, callback2, cVar, null, this.resourcesProvider);
        s71Var.g3.r = false;
        s71Var.u1();
        s71Var.setNestedScrollingEnabled(false);
        s71Var.setOverScrollMode(2);
        s71Var.setItemAnimator(null);
        return s71Var;
    }

    public final void U(boolean z10) {
        wh.p(this.k0.animate(), z10 ? 1.0f : 0.0f, 220L);
    }

    public final void V() {
        this.o0.setEnabled((this.q0 || TextUtils.isEmpty(this.l0.getText().toString().trim())) ? false : true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.agentSettingsUpdated) {
            this.f0.g3.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.agentSettingsUpdated);
        AndroidUtilities.hideKeyboard(this.l0.d);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        p pVar = this.e0;
        if (pVar.b != 1 || this.d0) {
            super.onBackPressed();
        } else {
            if (this.q0) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.l0.d);
            pVar.b(0, true);
        }
    }

    @Override // org.telegram.ui.Wallet.j2, org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.agentSettingsUpdated);
    }
}
