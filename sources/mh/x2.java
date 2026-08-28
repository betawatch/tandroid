package mh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gh.v7;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co0;
import org.telegram.ui.dy;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x2 implements org.telegram.ui.web.e0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ b6 c;
    public final /* synthetic */ c3 d;

    public x2(c3 c3Var, Context context, b6 b6Var) {
        this.d = c3Var;
        this.b = context;
        this.c = b6Var;
    }

    @Override // org.telegram.ui.web.e0
    public final void a() {
        c3 c3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D));
        org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(1);
        e3Var.b = new v2(this, 0);
        gc V = new oc(c3Var.l0, c3Var.A).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, e3Var);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void c() {
        c3 c3Var = this.d;
        if (c3Var.z0 != null) {
            org.telegram.ui.ActionBar.m3 P = LaunchActivity.C1.P();
            if (P != null) {
                P.e(c3Var.z0);
            }
            c3Var.z0 = null;
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void d(TLRPC.Document document) {
        c3 c3Var = this.d;
        new oc(c3Var.l0, c3Var.A).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void e(String str) {
        c3 c3Var = this.d;
        if (c3Var.F != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(c3Var.C).getInputUser(c3Var.D);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = c3Var.I;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(c3Var.C).sendRequest(tL_messages_sendWebViewData, new w2(this, 0));
    }

    @Override // org.telegram.ui.web.e0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        c3 c3Var = this.d;
        new oc(c3Var.l0, c3Var.A).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(c3Var.C).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final String g(boolean z10, boolean z11) {
        c3 c3Var = this.d;
        boolean z12 = c3Var.Z;
        if (z12 != z10) {
            c3Var.x(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.e0
    public final boolean h() {
        c3 c3Var = this.d;
        return MediaDataController.getInstance(c3Var.C).botInAttachMenu(c3Var.D) || MessagesController.getInstance(c3Var.C).whitelistedBots.contains(Long.valueOf(c3Var.D));
    }

    @Override // org.telegram.ui.web.e0
    public final void i(boolean z10) {
        c3 c3Var = this.d;
        ImageView backButton = c3Var.S.getBackButton();
        c3Var.s0 = z10;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = c3Var.i0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.e0
    public final void k(boolean z10) {
        this.d.n0 = z10;
    }

    @Override // org.telegram.ui.web.e0
    public final void l(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13, String str2) {
        c3 c3Var = this.d;
        y2 y2Var = c3Var.h0;
        v vVar = new v();
        vVar.a = z10;
        vVar.b = z11;
        vVar.c = z12;
        vVar.d = z13;
        vVar.e = str;
        vVar.f = j10;
        vVar.g = i9;
        vVar.h = i10;
        vVar.i = str2;
        int totalHeight = y2Var.getTotalHeight();
        y2Var.e.d = vVar;
        w.b(y2Var.f[1].l, vVar, true);
        y2Var.invalidate();
        if (totalHeight != y2Var.getTotalHeight() && y2Var.r != null) {
            if (totalHeight < y2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(y2Var.r, 200L);
            } else {
                y2Var.r.run();
            }
        }
        if (c3Var.Z) {
            c3Var.D();
            c3Var.G();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void m(int i9) {
        this.d.v(i9, true);
    }

    @Override // org.telegram.ui.web.e0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        c3 c3Var = this.d;
        t2 t2Var = c3Var.v;
        b3 b3Var = c3Var.e;
        org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) c3Var.g0).O().getLastFragment();
        co0 co0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(b3Var);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(c3Var.getContext(), 3, null);
            c2Var.q(150L);
            v7.y(c3Var.C, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new gh.h3(c2Var, 1), new fh.f1(20, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(c3Var.C).putUsers(paymentForm.users, false);
            co0Var = new co0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            co0Var = new co0((TLRPC.PaymentReceipt) tLObject);
        }
        if (co0Var != null) {
            t2Var.e(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(b3Var);
            gc0 gc0Var = new gc0(this.b);
            gc0Var.show();
            co0Var.V0 = new androidx.car.app.utils.a(this, gc0Var, str, 13);
            co0Var.U0 = this.c;
            gc0Var.c(co0Var);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override // org.telegram.ui.web.e0
    public final void q(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13) {
        c3 c3Var = this.d;
        y2 y2Var = c3Var.h0;
        v vVar = new v();
        vVar.a = z10;
        vVar.b = z11;
        vVar.c = z12;
        vVar.d = z13;
        vVar.e = str;
        vVar.f = j10;
        vVar.g = i9;
        vVar.h = i10;
        vVar.i = null;
        int totalHeight = y2Var.getTotalHeight();
        y2Var.e.b = vVar;
        u[] uVarArr = y2Var.f;
        uVarArr[0].l.b();
        if (vVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.e);
            spannableStringBuilder.setSpan(new t5(vVar.f, 1.4f, uVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            uVarArr[0].l.q(spannableStringBuilder, true, true);
        } else {
            uVarArr[0].l.q(vVar.e, true, true);
        }
        y2Var.invalidate();
        if (totalHeight != y2Var.getTotalHeight() && y2Var.r != null) {
            if (totalHeight < y2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(y2Var.r, 200L);
            } else {
                y2Var.r.run();
            }
        }
        if (c3Var.Z) {
            c3Var.D();
            c3Var.G();
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void r(int i9) {
        this.d.y(i9, true);
    }

    @Override // org.telegram.ui.web.e0
    public final void s() {
        t2 t2Var = this.d.v;
        if (t2Var.c) {
            return;
        }
        t2Var.e(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.e0
    public final void t(boolean z10) {
        this.d.X = z10;
    }

    @Override // org.telegram.ui.web.e0
    public final void u(int i9, int i10, boolean z10) {
        c3 c3Var = this.d;
        c3Var.q0 = i9;
        c3Var.t(i10, z10, true);
    }

    @Override // org.telegram.ui.web.e0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        c3 c3Var = this.d;
        if (isEmpty) {
            Activity activity = c3Var.g0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof qn) {
                    ((qn) lastFragment).U.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    c3Var.k(false);
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        dy dyVar = new dy(bundle);
        AndroidUtilities.hideKeyboard(c3Var.e);
        gc0 gc0Var = new gc0(this.b);
        dyVar.y2 = new a1.d(this, user, str, gc0Var, 4);
        gc0Var.show();
        gc0Var.c(dyVar);
    }

    @Override // org.telegram.ui.web.e0
    public final void w(boolean z10) {
        c3 c3Var = this.d;
        b6 b6Var = c3Var.A;
        FrameLayout frameLayout = c3Var.l0;
        TLRPC.User user = MessagesController.getInstance(c3Var.C).getUser(Long.valueOf(c3Var.D));
        int i9 = 1;
        if (z10) {
            org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(1);
            LocaleController.getString(R.string.UndoNoCaps);
            e3Var.b = new v2(this, i9);
            gc V = new oc(frameLayout, b6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, e3Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new v2(this, 2)), true));
        gc P = new oc(frameLayout, b6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.e0
    public final void x(boolean z10) {
        t2 t2Var = this.d.v;
        if (t2Var != null) {
            t2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.e0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.e0
    public final y0 z() {
        c3 c3Var = this.d;
        if (c3Var.x0 == null) {
            y0 y0Var = new y0(this.b);
            c3Var.x0 = y0Var;
            y0Var.k = c3Var.x.getWebView();
        }
        return c3Var.x0;
    }

    @Override // org.telegram.ui.web.e0
    public final /* synthetic */ void o(int i9, boolean z10) {
    }
}
