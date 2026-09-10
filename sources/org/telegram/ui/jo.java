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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jo(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final yo yoVar = (yo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(yoVar.getParentActivity(), 3, null);
                    d2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !yoVar.M.b();
                    if (yoVar.M.getCheckBox().F == null) {
                        yoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = yoVar.getMessagesController().getBoostsController();
                    final long j3 = this.b;
                    boostsController.getBoostsStats(j3, new e2.h() { // from class: org.telegram.ui.ro
                        @Override // e2.h
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            yo yoVar2 = yo.this;
                            TLRPC.Chat chat = yoVar2.x0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                yoVar2.getMessagesController().putChat(yoVar2.x0, false);
                            }
                            yoVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < yoVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            if (z11 && tL_premium_boostsStatus.level < yoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                yoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = yoVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new to(yoVar2, d2Var2, tL_premium_boostsStatus, j10, 0));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            yoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(yoVar2.x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            yoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            d2Var2.dismiss();
                            yoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new bi.m4(5, yoVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.c;
                org.telegram.ui.Components.hs hsVar = (org.telegram.ui.Components.hs) this.d;
                d2VarArr[0].dismiss();
                hsVar.run(-this.b);
                break;
            case 2:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) this.c;
                org.telegram.ui.Components.hs hsVar2 = (org.telegram.ui.Components.hs) this.d;
                d2VarArr2[0].dismiss();
                hsVar2.run(-this.b);
                break;
            case 3:
                org.telegram.ui.Components.k70.N((org.telegram.ui.Components.k70) this.c, (Context) this.d, this.b);
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
                xh.x3.Y0((xh.x3) this.c, (String) this.d, this.b);
                break;
        }
    }
}
