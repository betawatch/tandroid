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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs implements MessagesStorage.LongCallback, kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ hs(ls lsVar, int i10) {
        this.a = i10;
        this.b = lsVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        ls lsVar = this.b;
        v51 G = lsVar.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        ks ksVar = lsVar.k0;
        ks ksVar2 = lsVar.j0;
        ks ksVar3 = lsVar.i0;
        ks ksVar4 = lsVar.l0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = lsVar.w0;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z11 = !lsVar.p0;
            lsVar.p0 = z11;
            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                ksVar3.e(i14);
                return;
            }
            if (i13 == 1) {
                ksVar2.e(i14);
                lsVar.U();
                return;
            } else if (i11 == 3) {
                ksVar.e(i14);
                lsVar.U();
                return;
            } else {
                if (i13 == 2) {
                    ksVar4.e(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lsVar.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    lsVar.V();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    lsVar.V();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    lsVar.V();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    lsVar.V();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    lsVar.V();
                }
                lsVar.X.N(true);
                return;
            }
            if (i12 == 40) {
                lsVar.y0 = !lsVar.y0;
                lsVar.J();
                lsVar.X.N(true);
                lsVar.s();
                return;
            }
            if (i11 == 100) {
                lsVar.B0 = false;
                boolean z12 = !lsVar.C0;
                lsVar.C0 = z12;
                lsVar.D0 = z12;
                lsVar.J();
                lsVar.X.N(true);
                lsVar.s();
                lsVar.O();
                return;
            }
            if (i12 == 38) {
                boolean z13 = lsVar.g0;
                lsVar.g0 = !z13;
                boolean[] zArr = !z13 ? lsVar.n0 : lsVar.m0;
                if (ksVar4.g != 0) {
                    ksVar4.e = zArr;
                    ksVar4.f();
                    ksVar4.g();
                }
                lsVar.X.N(true);
                lsVar.V();
                return;
            }
            return;
        }
        if (i11 == 0) {
            ksVar3.d();
            return;
        }
        if (i11 == 1) {
            ksVar2.d();
            lsVar.U();
            return;
        }
        if (i11 == 3) {
            ksVar.d();
            lsVar.U();
            return;
        }
        if (i11 == 2) {
            ksVar4.d();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lsVar.getContext());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i11 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                lsVar.V();
            } else {
                z10 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    lsVar.V();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    lsVar.V();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    lsVar.V();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    lsVar.V();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    lsVar.V();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    lsVar.V();
                } else {
                    if (i11 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        lsVar.V();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || lsVar.v0.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= lsVar.X.x.size()) {
                                    break;
                                }
                                v51 G2 = lsVar.X.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    s4.c1 K = lsVar.d.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f11 = -lsVar.F0;
                                        lsVar.F0 = f11;
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
                        lsVar.V();
                    } else if (i11 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        lsVar.V();
                    } else {
                        z10 = true;
                        if (i11 == 101) {
                            lsVar.C0 = !lsVar.C0;
                            lsVar.O();
                        } else if (i11 == 102) {
                            lsVar.D0 = !lsVar.D0;
                            lsVar.O();
                        }
                    }
                    z10 = true;
                }
            }
            lsVar.X.N(z10);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 0:
                ls lsVar = this.b;
                lsVar.getClass();
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.eo.R9(j3));
                }
                lsVar.dismiss();
                break;
            default:
                ls lsVar2 = this.b;
                lsVar2.getClass();
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.eo.R9(j3));
                }
                lsVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
