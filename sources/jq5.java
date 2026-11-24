// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jq5 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jq5(na7 na7Var, hd hdVar, mu1 mu1Var, vm1 vm1Var, long j, my myVar) {
        this.a = (byte) 1;
        this.d = na7Var;
        this.b = hdVar;
        this.e = mu1Var;
        this.f = vm1Var;
        this.c = j;
        this.g = myVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                gl.c3(new rp6(this.d, this.b, this.e, this.c, this.f, this.g, obj, (byte) 2));
                break;
            case 1:
                final na7 na7Var = (na7) this.d;
                hd hdVar = (hd) this.b;
                mu1 mu1Var = (mu1) this.e;
                vm1 vm1Var = (vm1) this.f;
                final long j = this.c;
                final my myVar = (my) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (hdVar != null) {
                    hdVar.b(200L);
                }
                Context parentActivity = mu1Var.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = gl.W(LaunchActivity.H1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = a.b;
                }
                final Context context = parentActivity;
                d S = LaunchActivity.S();
                final wjb resourceProvider = S == null ? null : S.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(context);
                boolean z = na7Var.k4.l.f && !TextUtils.isEmpty(na7Var.k4.P2.f);
                boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
                if (!z) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        ag2 ag2Var = new ag2(1, resourceProvider, context);
                        ag2Var.setBackground(bkb.L0(false));
                        ag2Var.e(k96.M0(2131748290, null), "", zArr[0], false, false);
                        ag2Var.setPadding(k96.a0 ? gl.L(16.0f) : gl.L(8.0f), 0, k96.a0 ? gl.L(8.0f) : gl.L(16.0f), 0);
                        frameLayout.addView(ag2Var, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        ag2Var.setOnClickListener(new ge(zArr, (byte) 10));
                        i = 1;
                        final boolean[] zArr2 = new boolean[i];
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, resourceProvider, context);
                        alertDialog$Builder.a.S = k96.M0(2131748285, null);
                        alertDialog$Builder.a.U = k96.M0(!z2 ? 2131748287 : 2131748288, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.H = (byte) 9;
                        alertDialog$Builder.g(k96.M0(!z2 ? 2131748286 : 2131752577, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new cf(zArr2, vm1Var, (byte) 12));
                        if (!z2) {
                            final boolean z3 = z;
                            alertDialog$Builder.j(k96.M0(2131748289, null), new ed() { // from class: s77
                                @Override // ed
                                public final void u(hd hdVar2, int i2) {
                                    TL_account.contentSettings contentsettings2;
                                    na7 na7Var2 = na7.this;
                                    boolean z4 = z3;
                                    long j2 = j;
                                    boolean[] zArr3 = zArr2;
                                    my myVar2 = myVar;
                                    if (z4 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.G0(na7Var2.currentAccount, resourceProvider, new s0c(na7Var2, j2, zArr3, myVar2, (byte) 6), context);
                                        return;
                                    }
                                    na7Var2.J4.add(Long.valueOf(j2));
                                    zArr3[0] = true;
                                    myVar2.run();
                                }
                            });
                        }
                        alertDialog$Builder.o();
                        break;
                    }
                } else {
                    zArr[0] = true;
                }
                i = 1;
                final boolean[] zArr22 = new boolean[i];
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, resourceProvider, context);
                alertDialog$Builder2.a.S = k96.M0(2131748285, null);
                alertDialog$Builder2.a.U = k96.M0(!z2 ? 2131748287 : 2131748288, null);
                alertDialog$Builder2.n(frameLayout);
                alertDialog$Builder2.a.H = (byte) 9;
                alertDialog$Builder2.g(k96.M0(!z2 ? 2131748286 : 2131752577, null), null);
                alertDialog$Builder2.a.setOnDismissListener(new cf(zArr22, vm1Var, (byte) 12));
                if (!z2) {
                }
                alertDialog$Builder2.o();
                break;
            case 2:
                vqa vqaVar = (vqa) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                hd hdVar2 = (hd) this.b;
                xu4 xu4Var = (xu4) this.f;
                long j2 = this.c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.g;
                Long l = (Long) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    hdVar2.dismiss();
                    if (vqaVar.isShowing() && xu4Var.isShowing()) {
                        int i2 = vqaVar.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.a0(null, null, 2131749897, vqaVar.s1(), j2 >= 0 ? l7c.l(na7.q1(i2).V1(Long.valueOf(j2))) : cf3.r(i2, j2))));
                        if (l.longValue() > 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n").append(k96.V(null, null, 2131742828, c.w(l.longValue(), false)));
                        }
                        vqaVar.b2(j2, 0L, spannableStringBuilder, false, new zz7(vqaVar, j2, stargiftdepositpayload, l, xu4Var));
                        break;
                    }
                }
                break;
            default:
                gl.c3(new rp6(this.d, obj, this.b, this.e, this.c, this.f, this.g, (byte) 6));
                break;
        }
    }

    public /* synthetic */ jq5(vqa vqaVar, boolean[] zArr, hd hdVar, xu4 xu4Var, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.a = (byte) 2;
        this.d = vqaVar;
        this.e = zArr;
        this.b = hdVar;
        this.f = xu4Var;
        this.c = j;
        this.g = stargiftdepositpayload;
    }

    public /* synthetic */ jq5(KeyEvent.Callback callback, Object obj, Object obj2, long j, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.d = callback;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
