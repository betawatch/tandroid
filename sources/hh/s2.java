package hh;

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
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.qr;
import org.telegram.ui.do0;
import org.telegram.ui.gy;
import org.telegram.ui.jo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s2(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i5.Y0((i5) this.c, (String) this.d, this.b);
                break;
            case 1:
                final jo joVar = (jo) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(joVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !joVar.I.b();
                    if (joVar.I.getCheckBox().B == null) {
                        joVar.I.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = joVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new d5.d() { // from class: org.telegram.ui.eo
                        @Override // d5.d
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            jo joVar2 = jo.this;
                            TLRPC.Chat chat = joVar2.t0;
                            int i10 = chat.level;
                            int i11 = tL_premium_boostsStatus.level;
                            if (i10 != i11) {
                                chat.level = i11;
                                joVar2.getMessagesController().putChat(joVar2.t0, false);
                            }
                            joVar2.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < joVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < joVar2.getMessagesController().channelAutotranslationLevelMin) {
                                joVar2.I.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = joVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new hh.y1(joVar2, b2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            joVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(joVar2.t0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            joVar2.I.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            joVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new lh.n3(5, joVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                qr qrVar = (qr) this.d;
                b2VarArr[0].dismiss();
                qrVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = (org.telegram.ui.ActionBar.b2[]) this.c;
                qr qrVar2 = (qr) this.d;
                b2VarArr2[0].dismiss();
                qrVar2.run(-this.b);
                break;
            case 4:
                p60.N((p60) this.c, (Context) this.d, this.b);
                break;
            case 5:
                gy gyVar = (gy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.p2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    gyVar.j4(j11);
                } else {
                    gyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                gyVar.finishPreviewFragment();
                break;
            default:
                do0 do0Var = (do0) this.c;
                TextView textView = (TextView) this.d;
                do0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l10 = do0Var.D0;
                if (l10 == null || longValue != l10.longValue()) {
                    do0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, do0Var.y0.invoice.currency));
                } else {
                    do0Var.i0 = true;
                    do0Var.f[0].setText("");
                    do0Var.i0 = false;
                    do0Var.D0 = 0L;
                    do0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = do0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
