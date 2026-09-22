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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(woVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
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
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < woVar2.getMessagesController().channelAutotranslationLevelMin) {
                                woVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = woVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(woVar2, b2Var2, tL_premium_boostsStatus, j10, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            woVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(woVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            woVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            woVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.u3(5, woVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                org.telegram.ui.Components.bs bsVar = (org.telegram.ui.Components.bs) this.d;
                b2VarArr[0].dismiss();
                bsVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = (org.telegram.ui.ActionBar.b2[]) this.c;
                org.telegram.ui.Components.bs bsVar2 = (org.telegram.ui.Components.bs) this.d;
                b2VarArr2[0].dismiss();
                bsVar2.run(-this.b);
                break;
            case 3:
                org.telegram.ui.Components.b70.N((org.telegram.ui.Components.b70) this.c, (Context) this.d, this.b);
                break;
            case 4:
                uy uyVar = (uy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j10 = this.b;
                if (hasUnread) {
                    uyVar.j4(j10);
                } else {
                    uyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                uyVar.finishPreviewFragment();
                break;
            case 5:
                wo0 wo0Var = (wo0) this.c;
                TextView textView = (TextView) this.d;
                wo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = wo0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    wo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, wo0Var.C0.invoice.currency));
                } else {
                    wo0Var.m0 = true;
                    wo0Var.f[0].setText("");
                    wo0Var.m0 = false;
                    wo0Var.H0 = 0L;
                    wo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = wo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                yh.z3.Y0((yh.z3) this.c, (String) this.d, this.b);
                break;
        }
    }
}
