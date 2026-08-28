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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dd extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ id a;

    public dd(id idVar) {
        this.a = idVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        int i11;
        id idVar = this.a;
        long j10 = idVar.e0;
        zc zcVar = idVar.r0;
        if (i9 == -1) {
            if (idVar.n0) {
                id.X(idVar);
                return;
            } else {
                idVar.finishFragment();
                return;
            }
        }
        if (i9 == 1) {
            int i12 = idVar.d0;
            if (i12 == 0) {
                if (idVar.getParentActivity() == null) {
                    return;
                }
                if (idVar.n0) {
                    id.X(idVar);
                    return;
                }
                if (idVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) idVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(idVar.c);
                    return;
                }
                idVar.n0 = true;
                AndroidUtilities.runOnUIThread(zcVar, 200L);
                if (idVar.v.h()) {
                    idVar.m0 = true;
                    return;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) idVar).currentAccount;
                    idVar.o0 = Integer.valueOf(MessagesController.getInstance(i11).createChat(idVar.c.getText().toString(), new ArrayList<>(), idVar.w.getText().toString(), 2, false, null, null, -1, idVar));
                    return;
                }
            }
            if (i12 == 1) {
                if (idVar.W) {
                    Utilities.Callback2 callback2 = idVar.p0;
                    if (callback2 != null) {
                        callback2.run(idVar, Long.valueOf(j10));
                    }
                } else {
                    if (idVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        idVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!idVar.V) {
                        Vibrator vibrator2 = (Vibrator) idVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(idVar.Q);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(zcVar, 200L);
                    i10 = ((org.telegram.ui.ActionBar.o2) idVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    long j11 = idVar.e0;
                    String str = idVar.T;
                    final int i13 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.cd
                        public final /* synthetic */ dd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    id idVar2 = this.b.a;
                                    idVar2.f0(false);
                                    Utilities.Callback2 callback22 = idVar2.p0;
                                    if (callback22 != null) {
                                        callback22.run(idVar2, Long.valueOf(idVar2.e0));
                                        break;
                                    }
                                    break;
                                default:
                                    id idVar3 = this.b.a;
                                    idVar3.f0(false);
                                    Utilities.Callback2 callback23 = idVar3.p0;
                                    if (callback23 != null) {
                                        callback23.run(idVar3, Long.valueOf(idVar3.e0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i14 = 1;
                    messagesController.updateChannelUserName(idVar, j11, str, runnable, new Runnable(this) { // from class: org.telegram.ui.cd
                        public final /* synthetic */ dd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    id idVar2 = this.b.a;
                                    idVar2.f0(false);
                                    Utilities.Callback2 callback22 = idVar2.p0;
                                    if (callback22 != null) {
                                        callback22.run(idVar2, Long.valueOf(idVar2.e0));
                                        break;
                                    }
                                    break;
                                default:
                                    id idVar3 = this.b.a;
                                    idVar3.f0(false);
                                    Utilities.Callback2 callback23 = idVar3.p0;
                                    if (callback23 != null) {
                                        callback23.run(idVar3, Long.valueOf(idVar3.e0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (idVar.p0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    idVar.presentFragment(new k60(bundle), true);
                }
            }
        }
    }
}
