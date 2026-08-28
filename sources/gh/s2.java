package gh;

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
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.sr;
import org.telegram.ui.co0;
import org.telegram.ui.dy;
import org.telegram.ui.ho;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s2(Object obj, Object obj2, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k5.Y0((k5) this.c, (String) this.d, this.b);
                break;
            case 1:
                final ho hoVar = (ho) this.c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(hoVar.getParentActivity(), 3, null);
                    c2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !hoVar.I.b();
                    if (hoVar.I.getCheckBox().B == null) {
                        hoVar.I.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = hoVar.getMessagesController().getBoostsController();
                    final long j10 = this.b;
                    boostsController.getBoostsStats(j10, new d5.d() { // from class: org.telegram.ui.co
                        @Override // d5.d
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ho hoVar2 = ho.this;
                            TLRPC.Chat chat = hoVar2.t0;
                            int i9 = chat.level;
                            int i10 = tL_premium_boostsStatus.level;
                            if (i9 != i10) {
                                chat.level = i10;
                                hoVar2.getMessagesController().putChat(hoVar2.t0, false);
                            }
                            hoVar2.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < hoVar2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                            if (z11 && tL_premium_boostsStatus.level < hoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                hoVar2.I.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = hoVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new gh.y1(hoVar2, c2Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            hoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(hoVar2.t0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            hoVar2.I.setChecked(z11);
                            zArr2[0] = false;
                            c2Var2.dismiss();
                            hoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new kh.o3(5, hoVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                sr srVar = (sr) this.d;
                c2VarArr[0].dismiss();
                srVar.run(-this.b);
                break;
            case 3:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = (org.telegram.ui.ActionBar.c2[]) this.c;
                sr srVar2 = (sr) this.d;
                c2VarArr2[0].dismiss();
                srVar2.run(-this.b);
                break;
            case 4:
                k60.M((k60) this.c, (Context) this.d, this.b);
                break;
            case 5:
                dy dyVar = (dy) this.c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j11 = this.b;
                if (hasUnread) {
                    dyVar.j4(j11);
                } else {
                    dyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                dyVar.finishPreviewFragment();
                break;
            default:
                co0 co0Var = (co0) this.c;
                TextView textView = (TextView) this.d;
                co0Var.getClass();
                long longValue = ((Long) textView.getTag()).longValue();
                Long l10 = co0Var.D0;
                if (l10 == null || longValue != l10.longValue()) {
                    co0Var.f[0].setText(LocaleController.getInstance().formatCurrencyString(this.b, false, true, true, co0Var.y0.invoice.currency));
                } else {
                    co0Var.i0 = true;
                    co0Var.f[0].setText("");
                    co0Var.i0 = false;
                    co0Var.D0 = 0L;
                    co0Var.L0();
                }
                EditTextBoldCursor editTextBoldCursor = co0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }
}
