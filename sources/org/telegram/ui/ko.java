package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ko(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final zo zoVar = (zo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(zoVar.getParentActivity(), 3, null);
                    a2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !zoVar.M.b();
                    if (zoVar.M.getCheckBox().F == null) {
                        zoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = zoVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() { // from class: org.telegram.ui.so
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            zo zoVar2 = zo.this;
                            TLRPC.Chat chat = zoVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                zoVar2.getMessagesController().putChat(zoVar2.x0, false);
                            }
                            zoVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < zoVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            if (z11 && tL_premium_boostsStatus.level < zoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                zoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = zoVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new bi.i(zoVar2, a2Var2, tL_premium_boostsStatus, j11, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            zoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(zoVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            zoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            a2Var2.dismiss();
                            zoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new di.s3(5, zoVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.c;
                org.telegram.ui.Components.os osVar = (org.telegram.ui.Components.os) this.d;
                a2VarArr[0].dismiss();
                osVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = (org.telegram.ui.ActionBar.a2[]) this.c;
                org.telegram.ui.Components.os osVar2 = (org.telegram.ui.Components.os) this.d;
                a2VarArr2[0].dismiss();
                osVar2.run(-this.b);
                break;
            case 3:
                org.telegram.ui.Components.z70.O((org.telegram.ui.Components.z70) this.c, (Context) this.d, this.b);
                break;
            case 4:
                yy yyVar = (yy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    yyVar.h4(j11);
                } else {
                    yyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                yyVar.finishPreviewFragment();
                break;
            case 5:
                ap0 ap0Var = (ap0) this.c;
                TextView textView = (TextView) this.d;
                ap0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l4 = ap0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    ap0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, ap0Var.C0.invoice.currency));
                } else {
                    ap0Var.m0 = true;
                    ap0Var.f[0].setText("");
                    ap0Var.m0 = false;
                    ap0Var.H0 = 0L;
                    ap0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = ap0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                zh.r3.Z0((zh.r3) this.c, (String) this.d, this.b);
                break;
        }
    }
}
