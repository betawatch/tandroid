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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements MessagesStorage.LongCallback, al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ wr(as asVar, int i10) {
        this.a = i10;
        this.b = asVar;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        boolean z10;
        as asVar = this.b;
        w41 G = asVar.T.G(i10 - 1);
        if (G == null) {
            return;
        }
        zr zrVar = asVar.g0;
        zr zrVar2 = asVar.f0;
        zr zrVar3 = asVar.e0;
        zr zrVar4 = asVar.h0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.s0;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z11 = !asVar.l0;
            asVar.l0 = z11;
            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                zrVar3.e(i14);
                return;
            }
            if (i13 == 1) {
                zrVar2.e(i14);
                asVar.U();
                return;
            } else if (i11 == 3) {
                zrVar.e(i14);
                asVar.U();
                return;
            } else {
                if (i13 == 2) {
                    zrVar4.e(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    asVar.V();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    asVar.V();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    asVar.V();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    asVar.V();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    asVar.V();
                }
                asVar.T.N(true);
                return;
            }
            if (i12 == 40) {
                asVar.u0 = !asVar.u0;
                asVar.I();
                asVar.T.N(true);
                asVar.s();
                return;
            }
            if (i11 == 100) {
                asVar.x0 = false;
                boolean z12 = !asVar.y0;
                asVar.y0 = z12;
                asVar.z0 = z12;
                asVar.I();
                asVar.T.N(true);
                asVar.s();
                asVar.O();
                return;
            }
            if (i12 == 38) {
                boolean z13 = asVar.c0;
                asVar.c0 = !z13;
                boolean[] zArr = !z13 ? asVar.j0 : asVar.i0;
                if (zrVar4.g != 0) {
                    zrVar4.e = zArr;
                    zrVar4.f();
                    zrVar4.g();
                }
                asVar.T.N(true);
                asVar.V();
                return;
            }
            return;
        }
        if (i11 == 0) {
            zrVar3.d();
            return;
        }
        if (i11 == 1) {
            zrVar2.d();
            asVar.U();
            return;
        }
        if (i11 == 3) {
            zrVar.d();
            asVar.U();
            return;
        }
        if (i11 == 2) {
            zrVar4.d();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(asVar.getContext());
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i11 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                asVar.V();
            } else {
                z10 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    asVar.V();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    asVar.V();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    asVar.V();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    asVar.V();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    asVar.V();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    asVar.V();
                } else {
                    if (i11 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        asVar.V();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || asVar.r0.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= asVar.T.x.size()) {
                                    break;
                                }
                                w41 G2 = asVar.T.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    f2.n1 K = asVar.d.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f11 = -asVar.B0;
                                        asVar.B0 = f11;
                                        AndroidUtilities.shakeViewSpring(view2, f11);
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        asVar.V();
                    } else if (i11 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        asVar.V();
                    } else {
                        z10 = true;
                        if (i11 == 101) {
                            asVar.y0 = !asVar.y0;
                            asVar.O();
                        } else if (i11 == 102) {
                            asVar.z0 = !asVar.z0;
                            asVar.O();
                        }
                    }
                    z10 = true;
                }
            }
            asVar.T.N(z10);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 0:
                as asVar = this.b;
                asVar.getClass();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.tn.R9(j10));
                }
                asVar.dismiss();
                break;
            default:
                as asVar2 = this.b;
                asVar2.getClass();
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.tn.R9(j10));
                }
                asVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
