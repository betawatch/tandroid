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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        long j10 = ndVar.j0;
        cd cdVar = ndVar.w0;
        if (i10 == -1) {
            if (ndVar.s0) {
                nd.Z(ndVar);
                return;
            } else {
                ndVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = ndVar.i0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() == null) {
                    return;
                }
                if (ndVar.s0) {
                    nd.Z(ndVar);
                    return;
                }
                if (ndVar.d.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(ndVar.d);
                    return;
                }
                ndVar.s0 = true;
                AndroidUtilities.runOnUIThread(cdVar, 200L);
                if (ndVar.w.g()) {
                    ndVar.r0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.r2) ndVar).currentAccount;
                    ndVar.t0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.d.getText().toString(), new ArrayList<>(), ndVar.x.getText().toString(), 2, false, null, null, -1, ndVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (ndVar.b0) {
                    Utilities.Callback2 callback2 = ndVar.u0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j10));
                    }
                } else {
                    if (ndVar.x.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!ndVar.a0) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.V);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(cdVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.r2) ndVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j11 = ndVar.j0;
                    String str = ndVar.Y;
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
                                    ndVar2.i0(false);
                                    Utilities.Callback2 callback22 = ndVar2.u0;
                                    if (callback22 != null) {
                                        callback22.run(ndVar2, Long.valueOf(ndVar2.j0));
                                        break;
                                    }
                                    break;
                                default:
                                    nd ndVar3 = this.b.a;
                                    ndVar3.i0(false);
                                    Utilities.Callback2 callback23 = ndVar3.u0;
                                    if (callback23 != null) {
                                        callback23.run(ndVar3, Long.valueOf(ndVar3.j0));
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
                                    ndVar2.i0(false);
                                    Utilities.Callback2 callback22 = ndVar2.u0;
                                    if (callback22 != null) {
                                        callback22.run(ndVar2, Long.valueOf(ndVar2.j0));
                                        break;
                                    }
                                    break;
                                default:
                                    nd ndVar3 = this.b.a;
                                    ndVar3.i0(false);
                                    Utilities.Callback2 callback23 = ndVar3.u0;
                                    if (callback23 != null) {
                                        callback23.run(ndVar3, Long.valueOf(ndVar3.j0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (ndVar.u0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    ndVar.presentFragment(new t60(bundle), true);
                }
            }
        }
    }
}
