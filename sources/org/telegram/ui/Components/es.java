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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements MessagesStorage.LongCallback, nl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ es(is isVar, int i10) {
        this.a = i10;
        this.b = isVar;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        is isVar = this.b;
        g61 G = isVar.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        hs hsVar = isVar.k0;
        hs hsVar2 = isVar.j0;
        hs hsVar3 = isVar.i0;
        hs hsVar4 = isVar.l0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.w0;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z11 = !isVar.p0;
            isVar.p0 = z11;
            ((org.telegram.ui.Cells.v8) view).setChecked(z11);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                hsVar3.e(i14);
                return;
            }
            if (i13 == 1) {
                hsVar2.e(i14);
                isVar.S();
                return;
            } else if (i11 == 3) {
                hsVar.e(i14);
                isVar.S();
                return;
            } else {
                if (i13 == 2) {
                    hsVar4.e(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    isVar.T();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    isVar.T();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    isVar.T();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    isVar.T();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    isVar.T();
                }
                isVar.X.N(true);
                return;
            }
            if (i12 == 40) {
                isVar.y0 = !isVar.y0;
                isVar.H();
                isVar.X.N(true);
                isVar.s();
                return;
            }
            if (i11 == 100) {
                isVar.B0 = false;
                boolean z12 = !isVar.C0;
                isVar.C0 = z12;
                isVar.D0 = z12;
                isVar.H();
                isVar.X.N(true);
                isVar.s();
                isVar.M();
                return;
            }
            if (i12 == 38) {
                boolean z13 = isVar.g0;
                isVar.g0 = !z13;
                boolean[] zArr = !z13 ? isVar.n0 : isVar.m0;
                if (hsVar4.g != 0) {
                    hsVar4.e = zArr;
                    hsVar4.f();
                    hsVar4.g();
                }
                isVar.X.N(true);
                isVar.T();
                return;
            }
            return;
        }
        if (i11 == 0) {
            hsVar3.d();
            return;
        }
        if (i11 == 1) {
            hsVar2.d();
            isVar.S();
            return;
        }
        if (i11 == 3) {
            hsVar.d();
            isVar.S();
            return;
        }
        if (i11 == 2) {
            hsVar4.d();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(isVar.getContext());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i11 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                isVar.T();
            } else {
                z10 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    isVar.T();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    isVar.T();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    isVar.T();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    isVar.T();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    isVar.T();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    isVar.T();
                } else {
                    if (i11 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        isVar.T();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || isVar.v0.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= isVar.X.x.size()) {
                                    break;
                                }
                                g61 G2 = isVar.X.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    s4.c1 K = isVar.d.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f11 = -isVar.F0;
                                        isVar.F0 = f11;
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
                        isVar.T();
                    } else if (i11 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        isVar.T();
                    } else {
                        z10 = true;
                        if (i11 == 101) {
                            isVar.C0 = !isVar.C0;
                            isVar.M();
                        } else if (i11 == 102) {
                            isVar.D0 = !isVar.D0;
                            isVar.M();
                        }
                    }
                    z10 = true;
                }
            }
            isVar.X.N(z10);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 0:
                is isVar = this.b;
                isVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.yn.Q9(j3));
                }
                isVar.dismiss();
                break;
            default:
                is isVar2 = this.b;
                isVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.yn.Q9(j3));
                }
                isVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
