package bi;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.y50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fx;
import org.telegram.ui.gx;
import org.telegram.ui.jl0;
import org.telegram.ui.rn;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p3(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity W;
        int i7 = this.a;
        long j3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    zh.m3 m3Var = new zh.m3(k7Var.P1, str, this.b, k7Var.I0);
                    m3Var.e = new y3(k7Var, i10);
                    Q.showAsSheet(m3Var, d2Var);
                    break;
                }
                break;
            case 1:
                final rn rnVar = (rn) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, rnVar.getParentActivity(), null);
                    u1Var.r(400L);
                    zArr[0] = true;
                    final boolean z9 = !rnVar.M.d();
                    if (rnVar.M.getCheckBox().F == null) {
                        rnVar.M.setChecked(z9);
                    }
                    org.telegram.messenger.f3 G0 = rnVar.getMessagesController().G0();
                    final long j10 = this.b;
                    G0.a(j10, new c20() { // from class: org.telegram.ui.on
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj3) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            rn rnVar2 = rn.this;
                            TLRPC.Chat chat = rnVar2.w0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                rnVar2.getMessagesController().Q3(rnVar2.w0, false);
                            }
                            rnVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar2.getMessagesController().A4 ? R.drawable.permission_locked : 0);
                            boolean z10 = z9;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                            if (z10 && tL_premium_boostsStatus.level < rnVar2.getMessagesController().A4) {
                                rnVar2.M.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.f3 G02 = rnVar2.getMessagesController().G0();
                                long j11 = j10;
                                G02.b(j11, tL_premium_boostsStatus, new bi.r2(rnVar2, u1Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            rnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.qp.i1(rnVar2.w0);
                            tL_channels_toggleAutotranslation.enabled = z10;
                            rnVar2.M.setChecked(z10);
                            zArr2[0] = false;
                            u1Var2.dismiss();
                            rnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new fi.d3(4, rnVar2, z10), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((fr) obj).run(-j3);
                break;
            case 3:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((fr) obj).run(-j3);
                break;
            case 4:
                y50 y50Var = (y50) obj2;
                Context context = (Context) obj;
                a0.h hVar = y50Var.W1;
                if ((y50Var.d2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (y50Var.d2 != null) {
                        ArrayList arrayList = new ArrayList();
                        while (i10 < hVar.m()) {
                            arrayList.add(Long.valueOf(hVar.j(i10)));
                            i10++;
                        }
                        gx gxVar = (gx) y50Var.d2.b;
                        ArrayList arrayList2 = gxVar.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        gxVar.e0();
                        fx fxVar = gxVar.f;
                        if (fxVar != null) {
                            fxVar.a();
                        }
                        y50Var.dismiss();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                        String G = org.telegram.messenger.id.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                        u1Var2.R = G;
                        StringBuilder sb2 = new StringBuilder();
                        for (int i11 = 0; i11 < hVar.m(); i11++) {
                            TLRPC.User a22 = qp.s1(y50Var.a).a2(Long.valueOf(hVar.j(i11)));
                            if (a22 != null) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append("**");
                                sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                                sb2.append("**");
                            }
                        }
                        TLRPC.Chat M0 = qp.s1(y50Var.a).M0(Long.valueOf(j3));
                        if (hVar.m() > 5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hVar.m(), "AddManyMembersAlertNamesText", M0.title)));
                            String format = String.format("%d", Integer.valueOf(hVar.m()));
                            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                            if (indexOf >= 0) {
                                spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                            }
                            u1Var2.T = spannableStringBuilder;
                        } else {
                            u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AddMembersAlertNamesText", null, 2131754399, sb2, M0.title));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754486, null), new bx(y50Var, 6));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
            case 5:
                yw ywVar = (yw) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.t2) obj).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    ywVar.v4(j11);
                } else {
                    ywVar.getMessagesController().k3(j11, null, 0L);
                }
                ywVar.finishPreviewFragment();
                break;
            default:
                jl0 jl0Var = (jl0) obj2;
                jl0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = jl0Var.H0;
                if (l10 == null || longValue != l10.longValue()) {
                    jl0Var.f[0].setText(org.telegram.messenger.id.E0().q(this.b, false, true, true, jl0Var.C0.invoice.currency));
                } else {
                    jl0Var.m0 = true;
                    jl0Var.f[0].setText("");
                    jl0Var.m0 = false;
                    jl0Var.H0 = 0L;
                    jl0Var.R0();
                }
                EditTextBoldCursor editTextBoldCursor = jl0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
