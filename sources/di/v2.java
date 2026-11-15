package di;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fx;
import org.telegram.ui.gx;
import org.telegram.ui.kl0;
import org.telegram.ui.qn;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v2(Object obj, Object obj2, long j3, int i7) {
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
        int i10 = 1;
        switch (i7) {
            case 0:
                c6 c6Var = (c6) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                    c2Var.a = true;
                    bi.a6 a6Var = new bi.a6(c6Var.T1, str, this.b, c6Var.J0);
                    a6Var.e = new n1(c6Var, i10);
                    Q.showAsSheet(a6Var, c2Var);
                    break;
                }
                break;
            case 1:
                final qn qnVar = (qn) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, qnVar.getParentActivity(), null);
                    t1Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !qnVar.N.d();
                    if (qnVar.N.getCheckBox().G == null) {
                        qnVar.N.setChecked(z10);
                    }
                    org.telegram.messenger.f3 G0 = qnVar.getMessagesController().G0();
                    final long j10 = this.b;
                    G0.a(j10, new z10() { // from class: org.telegram.ui.mn
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj3) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            qn qnVar2 = qn.this;
                            TLRPC.Chat chat = qnVar2.x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                qnVar2.getMessagesController().Q3(qnVar2.x0, false);
                            }
                            qnVar2.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < qnVar2.getMessagesController().B4 ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                            if (z11 && tL_premium_boostsStatus.level < qnVar2.getMessagesController().B4) {
                                qnVar2.N.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.f3 G02 = qnVar2.getMessagesController().G0();
                                long j11 = j10;
                                G02.b(j11, tL_premium_boostsStatus, new bi.i1(qnVar2, t1Var2, tL_premium_boostsStatus, j11, 5));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            qnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.np.i1(qnVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            qnVar2.N.setChecked(z11);
                            zArr2[0] = false;
                            t1Var2.dismiss();
                            qnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new hi.b3(4, qnVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((mr) obj).run(-j3);
                break;
            case 3:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((mr) obj).run(-j3);
                break;
            case 4:
                a60 a60Var = (a60) obj2;
                Context context = (Context) obj;
                a0.h hVar = a60Var.a2;
                if ((a60Var.h2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (a60Var.h2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < hVar.m(); i11++) {
                            arrayList.add(Long.valueOf(hVar.j(i11)));
                        }
                        gx gxVar = (gx) a60Var.h2.b;
                        ArrayList arrayList2 = gxVar.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        gxVar.e0();
                        fx fxVar = gxVar.f;
                        if (fxVar != null) {
                            fxVar.a();
                        }
                        a60Var.dismiss();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                        String G = hd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                        t1Var2.S = G;
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 0; i12 < hVar.m(); i12++) {
                            TLRPC.User a22 = np.s1(a60Var.a).a2(Long.valueOf(hVar.j(i12)));
                            if (a22 != null) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append("**");
                                sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                                sb2.append("**");
                            }
                        }
                        TLRPC.Chat M0 = np.s1(a60Var.a).M0(Long.valueOf(j3));
                        if (hVar.m() > 5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.G(hVar.m(), "AddManyMembersAlertNamesText", M0.title)));
                            String format = String.format("%d", Integer.valueOf(hVar.m()));
                            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                            if (indexOf >= 0) {
                                spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                            }
                            t1Var2.U = spannableStringBuilder;
                        } else {
                            t1Var2.U = org.telegram.messenger.g0.X2(hd.a0("AddMembersAlertNamesText", null, 2131754399, sb2, M0.title));
                        }
                        alertDialog$Builder.k(hd.M0(2131754486, null), new org.telegram.ui.Components.gx(a60Var, 6));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
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
                kl0 kl0Var = (kl0) obj2;
                kl0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = kl0Var.I0;
                if (l10 == null || longValue != l10.longValue()) {
                    kl0Var.f[0].setText(hd.E0().q(this.b, false, true, true, kl0Var.D0.invoice.currency));
                } else {
                    kl0Var.n0 = true;
                    kl0Var.f[0].setText("");
                    kl0Var.n0 = false;
                    kl0Var.I0 = 0L;
                    kl0Var.R0();
                }
                EditTextBoldCursor editTextBoldCursor = kl0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
