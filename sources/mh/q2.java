package mh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.e70;
import org.telegram.ui.lo0;
import org.telegram.ui.po;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g5.Y0((g5) this.c, (String) this.d, this.b);
                break;
            case 1:
                final po poVar = (po) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(poVar.getParentActivity(), 3, null);
                    d2Var.q(400L);
                    zArr[0] = true;
                    final boolean z4 = !poVar.J.b();
                    if (poVar.J.getCheckBox().C == null) {
                        poVar.J.setChecked(z4);
                    }
                    ChannelBoostsController boostsController = poVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new h5.d() { // from class: org.telegram.ui.ko
                        @Override // h5.d
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            po poVar2 = po.this;
                            TLRPC.Chat chat = poVar2.u0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                poVar2.getMessagesController().putChat(poVar2.u0, false);
                            }
                            poVar2.J.getCheckBox().setIcon(tL_premium_boostsStatus.level < poVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z10 = z4;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            if (z10 && tL_premium_boostsStatus.level < poVar2.getMessagesController().channelAutotranslationLevelMin) {
                                poVar2.J.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = poVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new mh.v1(poVar2, d2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            poVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(poVar2.u0);
                            tL_channels_toggleAutotranslation.enabled = z10;
                            poVar2.J.setChecked(z10);
                            zArr2[0] = false;
                            d2Var2.dismiss();
                            poVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new org.telegram.messenger.zd(4, poVar2, z10), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.c;
                cs csVar = (cs) this.d;
                d2VarArr[0].dismiss();
                csVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) this.c;
                cs csVar2 = (cs) this.d;
                d2VarArr2[0].dismiss();
                csVar2.run(-this.b);
                break;
            case 4:
                e70.N((e70) this.c, (Context) this.d, this.b);
                break;
            case 5:
                py pyVar = (py) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    pyVar.j4(j11);
                } else {
                    pyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                pyVar.finishPreviewFragment();
                break;
            default:
                lo0 lo0Var = (lo0) this.c;
                TextView textView = (TextView) this.d;
                lo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l10 = lo0Var.E0;
                if (l10 == null || longValue != l10.longValue()) {
                    lo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, lo0Var.z0.invoice.currency));
                } else {
                    lo0Var.j0 = true;
                    lo0Var.f[0].setText("");
                    lo0Var.j0 = false;
                    lo0Var.E0 = 0L;
                    lo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = lo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
