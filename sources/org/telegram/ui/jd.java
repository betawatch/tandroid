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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jd extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ od a;

    public jd(od odVar) {
        this.a = odVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        od odVar = this.a;
        long j10 = odVar.i0;
        fd fdVar = odVar.v0;
        if (i10 == -1) {
            if (odVar.r0) {
                od.Y(odVar);
                return;
            } else {
                odVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = odVar.h0;
            if (i13 == 0) {
                if (odVar.getParentActivity() == null) {
                    return;
                }
                if (odVar.r0) {
                    od.Y(odVar);
                    return;
                }
                if (odVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) odVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(odVar.c);
                    return;
                }
                odVar.r0 = true;
                AndroidUtilities.runOnUIThread(fdVar, 200L);
                if (odVar.v.g()) {
                    odVar.q0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.n2) odVar).currentAccount;
                    odVar.s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(odVar.c.getText().toString(), new ArrayList<>(), odVar.w.getText().toString(), 2, false, null, null, -1, odVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (odVar.a0) {
                    Utilities.Callback2 callback2 = odVar.t0;
                    if (callback2 != null) {
                        callback2.run(odVar, Long.valueOf(j10));
                    }
                } else {
                    if (odVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(odVar.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        odVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!odVar.Z) {
                        Vibrator vibrator2 = (Vibrator) odVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(odVar.U);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(fdVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.n2) odVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j11 = odVar.i0;
                    String str = odVar.X;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.id
                        public final /* synthetic */ jd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    od odVar2 = this.b.a;
                                    odVar2.g0(false);
                                    Utilities.Callback2 callback22 = odVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(odVar2, Long.valueOf(odVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    od odVar3 = this.b.a;
                                    odVar3.g0(false);
                                    Utilities.Callback2 callback23 = odVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(odVar3, Long.valueOf(odVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(odVar, j11, str, runnable, new Runnable(this) { // from class: org.telegram.ui.id
                        public final /* synthetic */ jd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    od odVar2 = this.b.a;
                                    odVar2.g0(false);
                                    Utilities.Callback2 callback22 = odVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(odVar2, Long.valueOf(odVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    od odVar3 = this.b.a;
                                    odVar3.g0(false);
                                    Utilities.Callback2 callback23 = odVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(odVar3, Long.valueOf(odVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (odVar.t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    odVar.presentFragment(new n60(bundle), true);
                }
            }
        }
    }
}
