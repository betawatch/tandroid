package org.telegram.ui;

import android.os.Bundle;
import android.os.Vibrator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kd extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pd a;

    public kd(pd pdVar) {
        this.a = pdVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        pd pdVar = this.a;
        long j10 = pdVar.f0;
        gd gdVar = pdVar.s0;
        if (i10 == -1) {
            if (pdVar.o0) {
                pd.Y(pdVar);
                return;
            } else {
                pdVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = pdVar.e0;
            if (i13 == 0) {
                if (pdVar.getParentActivity() == null) {
                    return;
                }
                if (pdVar.o0) {
                    pd.Y(pdVar);
                    return;
                }
                if (pdVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) pdVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(pdVar.c);
                    return;
                }
                pdVar.o0 = true;
                AndroidUtilities.runOnUIThread(gdVar, 200L);
                if (pdVar.v.h()) {
                    pdVar.n0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.p2) pdVar).currentAccount;
                    pdVar.p0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(pdVar.c.getText().toString(), new ArrayList<>(), pdVar.w.getText().toString(), 2, false, null, null, -1, pdVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (pdVar.X) {
                    Utilities.Callback2 callback2 = pdVar.q0;
                    if (callback2 != null) {
                        callback2.run(pdVar, Long.valueOf(j10));
                    }
                } else {
                    if (pdVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pdVar.getParentActivity());
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        pdVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!pdVar.W) {
                        Vibrator vibrator2 = (Vibrator) pdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(pdVar.R);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(gdVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.p2) pdVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j11 = pdVar.f0;
                    String str = pdVar.U;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.jd
                        public final /* synthetic */ kd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    pd pdVar2 = this.b.a;
                                    pdVar2.g0(false);
                                    Utilities.Callback2 callback22 = pdVar2.q0;
                                    if (callback22 != null) {
                                        callback22.run(pdVar2, Long.valueOf(pdVar2.f0));
                                        break;
                                    }
                                    break;
                                default:
                                    pd pdVar3 = this.b.a;
                                    pdVar3.g0(false);
                                    Utilities.Callback2 callback23 = pdVar3.q0;
                                    if (callback23 != null) {
                                        callback23.run(pdVar3, Long.valueOf(pdVar3.f0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(pdVar, j11, str, runnable, new Runnable(this) { // from class: org.telegram.ui.jd
                        public final /* synthetic */ kd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    pd pdVar2 = this.b.a;
                                    pdVar2.g0(false);
                                    Utilities.Callback2 callback22 = pdVar2.q0;
                                    if (callback22 != null) {
                                        callback22.run(pdVar2, Long.valueOf(pdVar2.f0));
                                        break;
                                    }
                                    break;
                                default:
                                    pd pdVar3 = this.b.a;
                                    pdVar3.g0(false);
                                    Utilities.Callback2 callback23 = pdVar3.q0;
                                    if (callback23 != null) {
                                        callback23.run(pdVar3, Long.valueOf(pdVar3.f0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (pdVar.q0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    pdVar.presentFragment(new a70(bundle), true);
                }
            }
        }
    }
}
