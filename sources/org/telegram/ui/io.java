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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ io(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final xo xoVar = (xo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xoVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !xoVar.M.b();
                    if (xoVar.M.getCheckBox().F == null) {
                        xoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = xoVar.getMessagesController().getBoostsController();
                    final long j3 = this.b;
                    boostsController.getBoostsStats(j3, new e2.h() { // from class: org.telegram.ui.qo
                        @Override // e2.h
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            xo xoVar2 = xo.this;
                            TLRPC.Chat chat = xoVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                xoVar2.getMessagesController().putChat(xoVar2.x0, false);
                            }
                            xoVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < xoVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < xoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                xoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = xoVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new bi.i(xoVar2, b2Var2, tL_premium_boostsStatus, j10, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            xoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(xoVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            xoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            xoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new di.u3(5, xoVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                org.telegram.ui.Components.as asVar = (org.telegram.ui.Components.as) this.d;
                b2VarArr[0].dismiss();
                asVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = (org.telegram.ui.ActionBar.b2[]) this.c;
                org.telegram.ui.Components.as asVar2 = (org.telegram.ui.Components.as) this.d;
                b2VarArr2[0].dismiss();
                asVar2.run(-this.b);
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
                xo0 xo0Var = (xo0) this.c;
                TextView textView = (TextView) this.d;
                xo0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = xo0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    xo0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, xo0Var.C0.invoice.currency));
                } else {
                    xo0Var.m0 = true;
                    xo0Var.f[0].setText("");
                    xo0Var.m0 = false;
                    xo0Var.H0 = 0L;
                    xo0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = xo0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                zh.w3.Y0((zh.w3) this.c, (String) this.d, this.b);
                break;
        }
    }
}
