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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ks5 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ks5(uc7 uc7Var, id idVar, zu1 zu1Var, gn1 gn1Var, long j, ny nyVar) {
        this.a = (byte) 1;
        this.d = uc7Var;
        this.b = idVar;
        this.e = zu1Var;
        this.f = gn1Var;
        this.c = j;
        this.g = nyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                hl.c3(new sp6(this.d, this.b, this.e, this.c, this.f, this.g, obj, (byte) 2));
                break;
            case 1:
                final uc7 uc7Var = (uc7) this.d;
                id idVar = (id) this.b;
                zu1 zu1Var = (zu1) this.e;
                gn1 gn1Var = (gn1) this.f;
                final long j = this.c;
                final ny nyVar = (ny) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (idVar != null) {
                    idVar.b(200L);
                }
                Context parentActivity = zu1Var.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = hl.W(LaunchActivity.H1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = a.b;
                }
                final Context context = parentActivity;
                e S = LaunchActivity.S();
                final vnb resourceProvider = S == null ? null : S.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(context);
                boolean z = uc7Var.l4.l.f && !TextUtils.isEmpty(uc7Var.l4.X2.f);
                boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
                if (!z) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        sg2 sg2Var = new sg2(1, resourceProvider, context);
                        sg2Var.setBackground(aob.L0(false));
                        sg2Var.e(ob6.M0(2131748236, null), "", zArr[0], false, false);
                        sg2Var.setPadding(ob6.a0 ? hl.L(16.0f) : hl.L(8.0f), 0, ob6.a0 ? hl.L(8.0f) : hl.L(16.0f), 0);
                        frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        sg2Var.setOnClickListener(new de(zArr, (byte) 10));
                        i = 1;
                        final boolean[] zArr2 = new boolean[i];
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, resourceProvider, context);
                        alertDialog$Builder.a.S = ob6.M0(2131748231, null);
                        alertDialog$Builder.a.U = ob6.M0(!z2 ? 2131748233 : 2131748234, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.H = (byte) 9;
                        alertDialog$Builder.g(ob6.M0(!z2 ? 2131748232 : 2131752570, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new gf(zArr2, gn1Var, (byte) 12));
                        if (!z2) {
                            final boolean z3 = z;
                            alertDialog$Builder.j(ob6.M0(2131748235, null), new fd() { // from class: aa7
                                @Override // fd
                                public final void w(id idVar2, int i2) {
                                    TL_account.contentSettings contentsettings2;
                                    uc7 uc7Var2 = uc7.this;
                                    boolean z4 = z3;
                                    long j2 = j;
                                    boolean[] zArr3 = zArr2;
                                    ny nyVar2 = nyVar;
                                    if (z4 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.H0(uc7Var2.currentAccount, resourceProvider, new r4c(uc7Var2, j2, zArr3, nyVar2, (byte) 6), context);
                                        return;
                                    }
                                    uc7Var2.L4.add(Long.valueOf(j2));
                                    zArr3[0] = true;
                                    nyVar2.run();
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
                alertDialog$Builder2.a.S = ob6.M0(2131748231, null);
                alertDialog$Builder2.a.U = ob6.M0(!z2 ? 2131748233 : 2131748234, null);
                alertDialog$Builder2.n(frameLayout);
                alertDialog$Builder2.a.H = (byte) 9;
                alertDialog$Builder2.g(ob6.M0(!z2 ? 2131748232 : 2131752570, null), null);
                alertDialog$Builder2.a.setOnDismissListener(new gf(zArr22, gn1Var, (byte) 12));
                if (!z2) {
                }
                alertDialog$Builder2.o();
                break;
            case 2:
                wua wuaVar = (wua) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                id idVar2 = (id) this.b;
                bx4 bx4Var = (bx4) this.f;
                long j2 = this.c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.g;
                Long l = (Long) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    idVar2.dismiss();
                    if (wuaVar.isShowing() && bx4Var.isShowing()) {
                        int i2 = wuaVar.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0(null, null, 2131749859, wuaVar.t1(), j2 >= 0 ? lbc.l(uc7.s1(i2).X1(Long.valueOf(j2))) : wf3.r(i2, j2))));
                        if (l.longValue() > 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n").append(ob6.V(null, null, 2131742722, c.w(l.longValue(), false)));
                        }
                        wuaVar.c2(j2, 0L, spannableStringBuilder, false, new f38(wuaVar, j2, stargiftdepositpayload, l, bx4Var));
                        break;
                    }
                }
                break;
            default:
                hl.c3(new sp6(this.d, obj, this.b, this.e, this.c, this.f, this.g, (byte) 6));
                break;
        }
    }

    public /* synthetic */ ks5(wua wuaVar, boolean[] zArr, id idVar, bx4 bx4Var, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.a = (byte) 2;
        this.d = wuaVar;
        this.e = zArr;
        this.b = idVar;
        this.f = bx4Var;
        this.c = j;
        this.g = stargiftdepositpayload;
    }

    public /* synthetic */ ks5(KeyEvent.Callback callback, Object obj, Object obj2, long j, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.d = callback;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
