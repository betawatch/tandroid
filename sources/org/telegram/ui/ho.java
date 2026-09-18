package org.telegram.ui;

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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ho(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final wo woVar = (wo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(woVar.getParentActivity(), 3, null);
                    c2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !woVar.M.b();
                    if (woVar.M.getCheckBox().F == null) {
                        woVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = woVar.getMessagesController().getBoostsController();
                    final long j3 = this.b;
                    boostsController.getBoostsStats(j3, new e2.h() { // from class: org.telegram.ui.po
                        @Override // e2.h
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            wo woVar2 = wo.this;
                            TLRPC.Chat chat = woVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                woVar2.getMessagesController().putChat(woVar2.x0, false);
                            }
                            woVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < woVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                            if (z11 && tL_premium_boostsStatus.level < woVar2.getMessagesController().channelAutotranslationLevelMin) {
                                woVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = woVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(woVar2, c2Var2, tL_premium_boostsStatus, j10, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            woVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(woVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            woVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            woVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.u3(5, woVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                org.telegram.ui.Components.bs bsVar = (org.telegram.ui.Components.bs) this.d;
                c2VarArr[0].dismiss();
                bsVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = (org.telegram.ui.ActionBar.c2[]) this.c;
                org.telegram.ui.Components.bs bsVar2 = (org.telegram.ui.Components.bs) this.d;
                c2VarArr2[0].dismiss();
                bsVar2.run(-this.b);
                break;
            case 3:
                org.telegram.ui.Components.b70.N((org.telegram.ui.Components.b70) this.c, (Context) this.d, this.b);
                break;
            case 4:
                wy wyVar = (wy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j10 = this.b;
                if (hasUnread) {
                    wyVar.j4(j10);
                } else {
                    wyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                wyVar.finishPreviewFragment();
                break;
            case 5:
                yo0 yo0Var = (yo0) this.c;
                TextView textView = (TextView) this.d;
                yo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = yo0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    yo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, yo0Var.C0.invoice.currency));
                } else {
                    yo0Var.m0 = true;
                    yo0Var.f[0].setText("");
                    yo0Var.m0 = false;
                    yo0Var.H0 = 0L;
                    yo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = yo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                yh.a4.Y0((yh.a4) this.c, (String) this.d, this.b);
                break;
        }
    }
}
