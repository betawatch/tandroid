package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements MessagesStorage.LongCallback, nk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr b;

    public /* synthetic */ sr(wr wrVar, int i9) {
        this.a = i9;
        this.b = wrVar;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        boolean z10;
        wr wrVar = this.b;
        l41 G = wrVar.T.G(i9 - 1);
        if (G == null) {
            return;
        }
        vr vrVar = wrVar.g0;
        vr vrVar2 = wrVar.f0;
        vr vrVar3 = wrVar.e0;
        vr vrVar4 = wrVar.h0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = wrVar.s0;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z11 = !wrVar.l0;
            wrVar.l0 = z11;
            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
            return;
        }
        int i11 = G.a;
        if (i11 == 37) {
            int i12 = i10 >>> 24;
            int i13 = 16777215 & i10;
            if (i12 == 0) {
                vrVar3.e(i13);
                return;
            }
            if (i12 == 1) {
                vrVar2.e(i13);
                wrVar.T();
                return;
            } else if (i10 == 3) {
                vrVar.e(i13);
                wrVar.T();
                return;
            } else {
                if (i12 == 2) {
                    vrVar4.e(i13);
                    return;
                }
                return;
            }
        }
        if (i11 != 36 && i11 != 35) {
            if (i11 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wrVar.getContext());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i10 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    wrVar.U();
                } else if (i10 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    wrVar.U();
                } else if (i10 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    wrVar.U();
                } else if (i10 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    wrVar.U();
                } else if (i10 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    wrVar.U();
                }
                wrVar.T.N(true);
                return;
            }
            if (i11 == 40) {
                wrVar.u0 = !wrVar.u0;
                wrVar.I();
                wrVar.T.N(true);
                wrVar.s();
                return;
            }
            if (i10 == 100) {
                wrVar.x0 = false;
                boolean z12 = !wrVar.y0;
                wrVar.y0 = z12;
                wrVar.z0 = z12;
                wrVar.I();
                wrVar.T.N(true);
                wrVar.s();
                wrVar.N();
                return;
            }
            if (i11 == 38) {
                boolean z13 = wrVar.c0;
                wrVar.c0 = !z13;
                boolean[] zArr = !z13 ? wrVar.j0 : wrVar.i0;
                if (vrVar4.g != 0) {
                    vrVar4.e = zArr;
                    vrVar4.f();
                    vrVar4.g();
                }
                wrVar.T.N(true);
                wrVar.U();
                return;
            }
            return;
        }
        if (i10 == 0) {
            vrVar3.d();
            return;
        }
        if (i10 == 1) {
            vrVar2.d();
            wrVar.T();
            return;
        }
        if (i10 == 3) {
            vrVar.d();
            wrVar.T();
            return;
        }
        if (i10 == 2) {
            vrVar4.d();
            return;
        }
        if (i11 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wrVar.getContext());
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i10 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                wrVar.U();
            } else {
                z10 = true;
                if (i10 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    wrVar.U();
                } else if (i10 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    wrVar.U();
                } else if (i10 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    wrVar.U();
                } else if (i10 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    wrVar.U();
                } else if (i10 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    wrVar.U();
                } else if (i10 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    wrVar.U();
                } else {
                    if (i10 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        wrVar.U();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || wrVar.r0.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= wrVar.T.x.size()) {
                                    break;
                                }
                                l41 G2 = wrVar.T.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    f2.q1 K = wrVar.d.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -wrVar.B0;
                                        wrVar.B0 = f12;
                                        AndroidUtilities.shakeViewSpring(view2, f12);
                                    }
                                } else {
                                    i14++;
                                }
                            }
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        wrVar.U();
                    } else if (i10 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        wrVar.U();
                    } else {
                        z10 = true;
                        if (i10 == 101) {
                            wrVar.y0 = !wrVar.y0;
                            wrVar.N();
                        } else if (i10 == 102) {
                            wrVar.z0 = !wrVar.z0;
                            wrVar.N();
                        }
                    }
                    z10 = true;
                }
            }
            wrVar.T.N(z10);
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 0:
                wr wrVar = this.b;
                wrVar.getClass();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.qn.R9(j10));
                }
                wrVar.dismiss();
                break;
            default:
                wr wrVar2 = this.b;
                wrVar2.getClass();
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.qn.R9(j10));
                }
                wrVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
