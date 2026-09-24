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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gd extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ld a;

    public gd(ld ldVar) {
        this.a = ldVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ld ldVar = this.a;
        long j3 = ldVar.i0;
        cd cdVar = ldVar.v0;
        if (i10 == -1) {
            if (ldVar.r0) {
                ld.Y(ldVar);
                return;
            } else {
                ldVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = ldVar.h0;
            if (i13 == 0) {
                if (ldVar.getParentActivity() == null) {
                    return;
                }
                if (ldVar.r0) {
                    ld.Y(ldVar);
                    return;
                }
                if (ldVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) ldVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(ldVar.c);
                    return;
                }
                ldVar.r0 = true;
                AndroidUtilities.runOnUIThread(cdVar, 200L);
                if (ldVar.v.h()) {
                    ldVar.q0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.m2) ldVar).currentAccount;
                    ldVar.s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ldVar.c.getText().toString(), new ArrayList<>(), ldVar.w.getText().toString(), 2, false, null, null, -1, ldVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (ldVar.a0) {
                    Utilities.Callback2 callback2 = ldVar.t0;
                    if (callback2 != null) {
                        callback2.run(ldVar, Long.valueOf(j3));
                    }
                } else {
                    if (ldVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ldVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!ldVar.Z) {
                        Vibrator vibrator2 = (Vibrator) ldVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ldVar.U);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(cdVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.m2) ldVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j10 = ldVar.i0;
                    String str = ldVar.X;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.fd
                        public final /* synthetic */ gd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ld ldVar2 = this.b.a;
                                    ldVar2.g0(false);
                                    Utilities.Callback2 callback22 = ldVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(ldVar2, Long.valueOf(ldVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    ld ldVar3 = this.b.a;
                                    ldVar3.g0(false);
                                    Utilities.Callback2 callback23 = ldVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(ldVar3, Long.valueOf(ldVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(ldVar, j10, str, runnable, new Runnable(this) { // from class: org.telegram.ui.fd
                        public final /* synthetic */ gd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ld ldVar2 = this.b.a;
                                    ldVar2.g0(false);
                                    Utilities.Callback2 callback22 = ldVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(ldVar2, Long.valueOf(ldVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    ld ldVar3 = this.b.a;
                                    ldVar3.g0(false);
                                    Utilities.Callback2 callback23 = ldVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(ldVar3, Long.valueOf(ldVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (ldVar.t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    ldVar.presentFragment(new z60(bundle), true);
                }
            }
        }
    }
}
