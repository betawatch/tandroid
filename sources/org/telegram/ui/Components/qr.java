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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements MessagesStorage.LongCallback, qk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ qr(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        boolean z10;
        ur urVar = this.b;
        n41 G = urVar.T.G(i10 - 1);
        if (G == null) {
            return;
        }
        tr trVar = urVar.g0;
        tr trVar2 = urVar.f0;
        tr trVar3 = urVar.e0;
        tr trVar4 = urVar.h0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = urVar.s0;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z11 = !urVar.l0;
            urVar.l0 = z11;
            ((org.telegram.ui.Cells.o8) view).setChecked(z11);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                trVar3.e(i14);
                return;
            }
            if (i13 == 1) {
                trVar2.e(i14);
                urVar.U();
                return;
            } else if (i11 == 3) {
                trVar.e(i14);
                urVar.U();
                return;
            } else {
                if (i13 == 2) {
                    trVar4.e(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(urVar.getContext());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    urVar.V();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    urVar.V();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    urVar.V();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    urVar.V();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    urVar.V();
                }
                urVar.T.N(true);
                return;
            }
            if (i12 == 40) {
                urVar.u0 = !urVar.u0;
                urVar.J();
                urVar.T.N(true);
                urVar.t();
                return;
            }
            if (i11 == 100) {
                urVar.x0 = false;
                boolean z12 = !urVar.y0;
                urVar.y0 = z12;
                urVar.z0 = z12;
                urVar.J();
                urVar.T.N(true);
                urVar.t();
                urVar.O();
                return;
            }
            if (i12 == 38) {
                boolean z13 = urVar.c0;
                urVar.c0 = !z13;
                boolean[] zArr = !z13 ? urVar.j0 : urVar.i0;
                if (trVar4.g != 0) {
                    trVar4.e = zArr;
                    trVar4.f();
                    trVar4.g();
                }
                urVar.T.N(true);
                urVar.V();
                return;
            }
            return;
        }
        if (i11 == 0) {
            trVar3.d();
            return;
        }
        if (i11 == 1) {
            trVar2.d();
            urVar.U();
            return;
        }
        if (i11 == 3) {
            trVar.d();
            urVar.U();
            return;
        }
        if (i11 == 2) {
            trVar4.d();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(urVar.getContext());
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i11 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                urVar.V();
            } else {
                z10 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    urVar.V();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    urVar.V();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    urVar.V();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    urVar.V();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    urVar.V();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    urVar.V();
                } else {
                    if (i11 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        urVar.V();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || urVar.r0.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= urVar.T.x.size()) {
                                    break;
                                }
                                n41 G2 = urVar.T.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    f2.o1 K = urVar.d.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -urVar.B0;
                                        urVar.B0 = f12;
                                        AndroidUtilities.shakeViewSpring(view2, f12);
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        urVar.V();
                    } else if (i11 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        urVar.V();
                    } else {
                        z10 = true;
                        if (i11 == 101) {
                            urVar.y0 = !urVar.y0;
                            urVar.O();
                        } else if (i11 == 102) {
                            urVar.z0 = !urVar.z0;
                            urVar.O();
                        }
                    }
                    z10 = true;
                }
            }
            urVar.T.N(z10);
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 0:
                ur urVar = this.b;
                urVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.rn.R9(j10));
                }
                urVar.dismiss();
                break;
            default:
                ur urVar2 = this.b;
                urVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.rn.R9(j10));
                }
                urVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
