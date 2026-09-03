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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class id extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nd a;

    public id(nd ndVar) {
        this.a = ndVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        nd ndVar = this.a;
        long j10 = ndVar.f0;
        ed edVar = ndVar.s0;
        if (i10 == -1) {
            if (ndVar.o0) {
                nd.Y(ndVar);
                return;
            } else {
                ndVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = ndVar.e0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() == null) {
                    return;
                }
                if (ndVar.o0) {
                    nd.Y(ndVar);
                    return;
                }
                if (ndVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(ndVar.c);
                    return;
                }
                ndVar.o0 = true;
                AndroidUtilities.runOnUIThread(edVar, 200L);
                if (ndVar.v.h()) {
                    ndVar.n0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.p2) ndVar).currentAccount;
                    ndVar.p0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.c.getText().toString(), new ArrayList<>(), ndVar.w.getText().toString(), 2, false, null, null, -1, ndVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (ndVar.X) {
                    Utilities.Callback2 callback2 = ndVar.q0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j10));
                    }
                } else {
                    if (ndVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!ndVar.W) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.R);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(edVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.p2) ndVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j11 = ndVar.f0;
                    String str = ndVar.U;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.hd
                        public final /* synthetic */ id b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    nd ndVar2 = this.b.a;
                                    ndVar2.g0(false);
                                    Utilities.Callback2 callback22 = ndVar2.q0;
                                    if (callback22 != null) {
                                        callback22.run(ndVar2, Long.valueOf(ndVar2.f0));
                                        break;
                                    }
                                    break;
                                default:
                                    nd ndVar3 = this.b.a;
                                    ndVar3.g0(false);
                                    Utilities.Callback2 callback23 = ndVar3.q0;
                                    if (callback23 != null) {
                                        callback23.run(ndVar3, Long.valueOf(ndVar3.f0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(ndVar, j11, str, runnable, new Runnable(this) { // from class: org.telegram.ui.hd
                        public final /* synthetic */ id b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    nd ndVar2 = this.b.a;
                                    ndVar2.g0(false);
                                    Utilities.Callback2 callback22 = ndVar2.q0;
                                    if (callback22 != null) {
                                        callback22.run(ndVar2, Long.valueOf(ndVar2.f0));
                                        break;
                                    }
                                    break;
                                default:
                                    nd ndVar3 = this.b.a;
                                    ndVar3.g0(false);
                                    Utilities.Callback2 callback23 = ndVar3.q0;
                                    if (callback23 != null) {
                                        callback23.run(ndVar3, Long.valueOf(ndVar3.f0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (ndVar.q0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    ndVar.presentFragment(new z60(bundle), true);
                }
            }
        }
    }
}
