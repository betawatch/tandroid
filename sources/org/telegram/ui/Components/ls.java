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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements MessagesStorage.LongCallback, bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps b;

    public /* synthetic */ ls(ps psVar, int i10) {
        this.a = i10;
        this.b = psVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        ps psVar = this.b;
        m61 G = psVar.X.G(i10 - 1);
        if (G == null) {
            return;
        }
        os osVar = psVar.k0;
        os osVar2 = psVar.j0;
        os osVar3 = psVar.i0;
        os osVar4 = psVar.l0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.w0;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z11 = !psVar.p0;
            psVar.p0 = z11;
            ((org.telegram.ui.Cells.v8) view).setChecked(z11);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                osVar3.e(i14);
                return;
            }
            if (i13 == 1) {
                osVar2.e(i14);
                psVar.U();
                return;
            } else if (i11 == 3) {
                osVar.e(i14);
                psVar.U();
                return;
            } else {
                if (i13 == 2) {
                    osVar4.e(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getContext());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.a.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    psVar.V();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    psVar.V();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    psVar.V();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    psVar.V();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    psVar.V();
                }
                psVar.X.N(true);
                return;
            }
            if (i12 == 40) {
                psVar.y0 = !psVar.y0;
                psVar.J();
                psVar.X.N(true);
                psVar.t();
                return;
            }
            if (i11 == 100) {
                psVar.B0 = false;
                boolean z12 = !psVar.C0;
                psVar.C0 = z12;
                psVar.D0 = z12;
                psVar.J();
                psVar.X.N(true);
                psVar.t();
                psVar.O();
                return;
            }
            if (i12 == 38) {
                boolean z13 = psVar.g0;
                psVar.g0 = !z13;
                boolean[] zArr = !z13 ? psVar.n0 : psVar.m0;
                if (osVar4.g != 0) {
                    osVar4.e = zArr;
                    osVar4.f();
                    osVar4.g();
                }
                psVar.X.N(true);
                psVar.V();
                return;
            }
            return;
        }
        if (i11 == 0) {
            osVar3.d();
            return;
        }
        if (i11 == 1) {
            osVar2.d();
            psVar.U();
            return;
        }
        if (i11 == 3) {
            osVar.d();
            psVar.U();
            return;
        }
        if (i11 == 2) {
            osVar4.d();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(psVar.getContext());
                alertDialog$Builder2.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder2.a.show();
                return;
            }
            if (i11 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                psVar.V();
            } else {
                z10 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    psVar.V();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    psVar.V();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    psVar.V();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    psVar.V();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    psVar.V();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    psVar.V();
                } else {
                    if (i11 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        psVar.V();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || psVar.v0.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= psVar.X.y.size()) {
                                    break;
                                }
                                m61 G2 = psVar.X.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    s4.b1 K = psVar.d.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f11 = -psVar.F0;
                                        psVar.F0 = f11;
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
                        psVar.V();
                    } else if (i11 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        psVar.V();
                    } else {
                        z10 = true;
                        if (i11 == 101) {
                            psVar.C0 = !psVar.C0;
                            psVar.O();
                        } else if (i11 == 102) {
                            psVar.D0 = !psVar.D0;
                            psVar.O();
                        }
                    }
                    z10 = true;
                }
            }
            psVar.X.N(z10);
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 0:
                ps psVar = this.b;
                psVar.getClass();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                psVar.dismiss();
                break;
            default:
                ps psVar2 = this.b;
                psVar2.getClass();
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                psVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
