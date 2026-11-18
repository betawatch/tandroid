package di;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.tr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.jx;
import org.telegram.ui.kx;
import org.telegram.ui.ml0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d3(Object obj, Object obj2, long j3, int i7) {
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
                f6 f6Var = (f6) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                    f2Var.a = true;
                    bi.h8 h8Var = new bi.h8(f6Var.T1, str, this.b, f6Var.J0);
                    h8Var.e = new n1(f6Var, i10);
                    Q.showAsSheet(h8Var, f2Var);
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
                    final boolean z10 = !rnVar.N.d();
                    if (rnVar.N.getCheckBox().G == null) {
                        rnVar.N.setChecked(z10);
                    }
                    org.telegram.messenger.h3 I0 = rnVar.getMessagesController().I0();
                    final long j10 = this.b;
                    I0.a(j10, new x10() { // from class: org.telegram.ui.nn
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj3) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            rn rnVar2 = rn.this;
                            TLRPC.Chat chat = rnVar2.x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                rnVar2.getMessagesController().X3(rnVar2.x0, false);
                            }
                            rnVar2.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar2.getMessagesController().D4 ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                            if (z11 && tL_premium_boostsStatus.level < rnVar2.getMessagesController().D4) {
                                rnVar2.N.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.h3 I02 = rnVar2.getMessagesController().I0();
                                long j11 = j10;
                                I02.b(j11, tL_premium_boostsStatus, new bi.e2(rnVar2, u1Var2, tL_premium_boostsStatus, j11, 5));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            rnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.mp.k1(rnVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            rnVar2.N.setChecked(z11);
                            zArr2[0] = false;
                            u1Var2.dismiss();
                            rnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new hi.c3(4, rnVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((tr) obj).run(-j3);
                break;
            case 3:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((tr) obj).run(-j3);
                break;
            case 4:
                j60 j60Var = (j60) obj2;
                Context context = (Context) obj;
                a0.h hVar = j60Var.a2;
                if ((j60Var.h2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (j60Var.h2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < hVar.m(); i11++) {
                            arrayList.add(Long.valueOf(hVar.j(i11)));
                        }
                        kx kxVar = (kx) j60Var.h2.b;
                        ArrayList arrayList2 = kxVar.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        kxVar.e0();
                        jx jxVar = kxVar.f;
                        if (jxVar != null) {
                            jxVar.a();
                        }
                        j60Var.dismiss();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                        String G = gd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                        u1Var2.S = G;
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 0; i12 < hVar.m(); i12++) {
                            TLRPC.User c22 = mp.u1(j60Var.a).c2(Long.valueOf(hVar.j(i12)));
                            if (c22 != null) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append("**");
                                sb2.append(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                                sb2.append("**");
                            }
                        }
                        TLRPC.Chat O0 = mp.u1(j60Var.a).O0(Long.valueOf(j3));
                        int i13 = 5;
                        if (hVar.m() > 5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.G(hVar.m(), "AddManyMembersAlertNamesText", O0.title)));
                            String format = String.format("%d", Integer.valueOf(hVar.m()));
                            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                            if (indexOf >= 0) {
                                spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                            }
                            u1Var2.U = spannableStringBuilder;
                        } else {
                            u1Var2.U = org.telegram.messenger.g0.W2(gd.a0("AddMembersAlertNamesText", null, 2131754397, sb2, O0.title));
                        }
                        alertDialog$Builder.k(gd.M0(2131754484, null), new iy(j60Var, i13));
                        alertDialog$Builder.h(gd.M0(2131752578, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
            case 5:
                cx cxVar = (cx) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.t2) obj).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    cxVar.A4(j11);
                } else {
                    cxVar.getMessagesController().r3(j11, null, 0L);
                }
                cxVar.finishPreviewFragment();
                break;
            default:
                ml0 ml0Var = (ml0) obj2;
                ml0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = ml0Var.I0;
                if (l10 == null || longValue != l10.longValue()) {
                    ml0Var.f[0].setText(gd.E0().q(this.b, false, true, true, ml0Var.D0.invoice.currency));
                } else {
                    ml0Var.n0 = true;
                    ml0Var.f[0].setText("");
                    ml0Var.n0 = false;
                    ml0Var.I0 = 0L;
                    ml0Var.R0();
                }
                EditTextBoldCursor editTextBoldCursor = ml0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
