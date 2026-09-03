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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements MessagesStorage.LongCallback, il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds b;

    public /* synthetic */ zr(ds dsVar, int i10) {
        this.a = i10;
        this.b = dsVar;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        boolean z4;
        ds dsVar = this.b;
        i51 G = dsVar.U.G(i10 - 1);
        if (G == null) {
            return;
        }
        cs csVar = dsVar.h0;
        cs csVar2 = dsVar.g0;
        cs csVar3 = dsVar.f0;
        cs csVar4 = dsVar.i0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dsVar.t0;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z10 = !dsVar.m0;
            dsVar.m0 = z10;
            ((org.telegram.ui.Cells.q8) view).setChecked(z10);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                csVar3.e(i14);
                return;
            }
            if (i13 == 1) {
                csVar2.e(i14);
                dsVar.U();
                return;
            } else if (i11 == 3) {
                csVar.e(i14);
                dsVar.U();
                return;
            } else {
                if (i13 == 2) {
                    csVar4.e(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dsVar.getContext());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    dsVar.V();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    dsVar.V();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    dsVar.V();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    dsVar.V();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    dsVar.V();
                }
                dsVar.U.N(true);
                return;
            }
            if (i12 == 40) {
                dsVar.v0 = !dsVar.v0;
                dsVar.I();
                dsVar.U.N(true);
                dsVar.s();
                return;
            }
            if (i11 == 100) {
                dsVar.y0 = false;
                boolean z11 = !dsVar.z0;
                dsVar.z0 = z11;
                dsVar.A0 = z11;
                dsVar.I();
                dsVar.U.N(true);
                dsVar.s();
                dsVar.O();
                return;
            }
            if (i12 == 38) {
                boolean z12 = dsVar.d0;
                dsVar.d0 = !z12;
                boolean[] zArr = !z12 ? dsVar.k0 : dsVar.j0;
                if (csVar4.g != 0) {
                    csVar4.e = zArr;
                    csVar4.f();
                    csVar4.g();
                }
                dsVar.U.N(true);
                dsVar.V();
                return;
            }
            return;
        }
        if (i11 == 0) {
            csVar3.d();
            return;
        }
        if (i11 == 1) {
            csVar2.d();
            dsVar.U();
            return;
        }
        if (i11 == 3) {
            csVar.d();
            dsVar.U();
            return;
        }
        if (i11 == 2) {
            csVar4.d();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dsVar.getContext());
                alertDialog$Builder2.a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i11 == 6) {
                z4 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                dsVar.V();
            } else {
                z4 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    dsVar.V();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    dsVar.V();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    dsVar.V();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    dsVar.V();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    dsVar.V();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    dsVar.V();
                } else {
                    if (i11 == 12) {
                        boolean z13 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z13;
                        tL_chatBannedRights.send_gifs = z13;
                        tL_chatBannedRights.send_games = z13;
                        tL_chatBannedRights.send_stickers = z13;
                        dsVar.V();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || dsVar.s0.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= dsVar.U.x.size()) {
                                    break;
                                }
                                i51 G2 = dsVar.U.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    f2.l1 K = dsVar.d.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -dsVar.C0;
                                        dsVar.C0 = f12;
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
                        dsVar.V();
                    } else if (i11 == 13) {
                        z4 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        dsVar.V();
                    } else {
                        z4 = true;
                        if (i11 == 101) {
                            dsVar.z0 = !dsVar.z0;
                            dsVar.O();
                        } else if (i11 == 102) {
                            dsVar.A0 = !dsVar.A0;
                            dsVar.O();
                        }
                    }
                    z4 = true;
                }
            }
            dsVar.U.N(z4);
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 0:
                ds dsVar = this.b;
                dsVar.getClass();
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.zn.R9(j10));
                }
                dsVar.dismiss();
                break;
            default:
                ds dsVar2 = this.b;
                dsVar2.getClass();
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.zn.R9(j10));
                }
                dsVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
