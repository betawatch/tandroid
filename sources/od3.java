// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class od3 implements s8c, d39, vc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sd3 b;

    public /* synthetic */ od3(sd3 sd3Var, byte b) {
        this.a = b;
        this.b = sd3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x018a  */
    @Override // s8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, TLObject tLObject) {
        long j;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        byte b = this.a;
        sd3 sd3Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat chat = sd3Var.T1;
                if (sd3Var.x2) {
                    if (tLObject instanceof TLRPC.User) {
                        na7.q1(sd3Var.a).g0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        na7.q1(sd3Var.a).g0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (sd3Var.y2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            na7.q1(sd3Var.a).f0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        na7.q1(sd3Var.a).f0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Chat chat2 = sd3Var.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        na7.q1(sd3Var.a).g0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    na7.q1(sd3Var.a).g0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                TLRPC.Chat chat3 = sd3Var.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        na7.q1(sd3Var.a).f0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    na7.q1(sd3Var.a).f0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                TLRPC.Chat chat4 = sd3Var.T1;
                long j2 = chat4.id;
                if (hc2.p0(chat4) && hc2.A(sd3Var.a, chat4, 24)) {
                    long j3 = chat4.linked_monoforum_id;
                    if (j3 != 0) {
                        j = j3;
                        if (!sd3Var.b2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = sd3Var.r2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) sd3Var.s2.get(i);
                            if (tL_chatBannedRights2 == null) {
                                tL_chatBannedRights = tL_chatBannedRights3;
                            } else if (tL_chatBannedRights3 == null) {
                                tL_chatBannedRights = tL_chatBannedRights2;
                            } else {
                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                                tL_chatBannedRights4.view_messages = tL_chatBannedRights2.view_messages || tL_chatBannedRights3.view_messages;
                                tL_chatBannedRights4.send_messages = tL_chatBannedRights2.send_messages || tL_chatBannedRights3.send_messages;
                                tL_chatBannedRights4.send_media = tL_chatBannedRights2.send_media || tL_chatBannedRights3.send_media;
                                tL_chatBannedRights4.send_stickers = tL_chatBannedRights2.send_stickers || tL_chatBannedRights3.send_stickers;
                                tL_chatBannedRights4.send_gifs = tL_chatBannedRights2.send_gifs || tL_chatBannedRights3.send_gifs;
                                tL_chatBannedRights4.send_games = tL_chatBannedRights2.send_games || tL_chatBannedRights3.send_games;
                                tL_chatBannedRights4.send_inline = tL_chatBannedRights2.send_inline || tL_chatBannedRights3.send_inline;
                                tL_chatBannedRights4.embed_links = tL_chatBannedRights2.embed_links || tL_chatBannedRights3.embed_links;
                                tL_chatBannedRights4.send_polls = tL_chatBannedRights2.send_polls || tL_chatBannedRights3.send_polls;
                                tL_chatBannedRights4.send_reactions = tL_chatBannedRights2.send_reactions || tL_chatBannedRights3.send_reactions;
                                tL_chatBannedRights4.change_info = tL_chatBannedRights2.change_info || tL_chatBannedRights3.change_info;
                                tL_chatBannedRights4.invite_users = tL_chatBannedRights2.invite_users || tL_chatBannedRights3.invite_users;
                                tL_chatBannedRights4.pin_messages = tL_chatBannedRights2.pin_messages || tL_chatBannedRights3.pin_messages;
                                tL_chatBannedRights4.manage_topics = tL_chatBannedRights2.manage_topics || tL_chatBannedRights3.manage_topics;
                                tL_chatBannedRights4.send_photos = tL_chatBannedRights2.send_photos || tL_chatBannedRights3.send_photos;
                                tL_chatBannedRights4.send_videos = tL_chatBannedRights2.send_videos || tL_chatBannedRights3.send_videos;
                                tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights2.send_roundvideos || tL_chatBannedRights3.send_roundvideos;
                                tL_chatBannedRights4.send_audios = tL_chatBannedRights2.send_audios || tL_chatBannedRights3.send_audios;
                                tL_chatBannedRights4.send_voices = tL_chatBannedRights2.send_voices || tL_chatBannedRights3.send_voices;
                                tL_chatBannedRights4.send_docs = tL_chatBannedRights2.send_docs || tL_chatBannedRights3.send_docs;
                                tL_chatBannedRights4.send_plain = tL_chatBannedRights2.send_plain || tL_chatBannedRights3.send_plain;
                                tL_chatBannedRights = tL_chatBannedRights4;
                            }
                            if (!(tLObject instanceof TLRPC.User)) {
                                if (tLObject instanceof TLRPC.Chat) {
                                    na7.q1(sd3Var.a).R4(j, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, sd3Var.r1, null);
                                    break;
                                }
                            } else {
                                na7.q1(sd3Var.a).R4(j, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, sd3Var.r1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                na7.q1(sd3Var.a).c0(j, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            na7.q1(sd3Var.a).c0(j, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j = j2;
                if (!sd3Var.b2) {
                }
                break;
        }
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        boolean z;
        sd3 sd3Var = this.b;
        c4c G = sd3Var.S1.G(i - 1);
        if (G != null) {
            rd3 rd3Var = sd3Var.f2;
            rd3 rd3Var2 = sd3Var.e2;
            rd3 rd3Var3 = sd3Var.d2;
            rd3 rd3Var4 = sd3Var.g2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = sd3Var.r2;
            int i2 = G.d;
            if (i2 == 103) {
                boolean z2 = !sd3Var.k2;
                sd3Var.k2 = z2;
                ((zgb) view).setChecked(z2);
                return;
            }
            int i3 = G.a;
            if (i3 == 37) {
                int i4 = i2 >>> 24;
                int i5 = 16777215 & i2;
                if (i4 == 0) {
                    rd3Var3.g(i5);
                    return;
                }
                if (i4 == 1) {
                    rd3Var2.g(i5);
                    sd3Var.b1();
                    return;
                } else if (i2 == 3) {
                    rd3Var.g(i5);
                    sd3Var.b1();
                    return;
                } else {
                    if (i4 == 2) {
                        rd3Var4.g(i5);
                        return;
                    }
                    return;
                }
            }
            if (i3 != 36 && i3 != 35) {
                if (i3 == 39) {
                    if (G.u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sd3Var.getContext());
                        String M0 = k96.M0(2131743480, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131743479, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.show();
                        return;
                    }
                    if (i2 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        sd3Var.c1();
                    } else if (i2 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        sd3Var.c1();
                    } else if (i2 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        sd3Var.c1();
                    } else if (i2 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        sd3Var.c1();
                    } else if (i2 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        sd3Var.c1();
                    }
                    sd3Var.S1.O(true);
                    return;
                }
                if (i3 == 40) {
                    sd3Var.t2 = !sd3Var.t2;
                    sd3Var.S0();
                    sd3Var.S1.O(true);
                    sd3Var.D0();
                    return;
                }
                if (i2 == 100) {
                    sd3Var.w2 = false;
                    boolean z3 = !sd3Var.x2;
                    sd3Var.x2 = z3;
                    sd3Var.y2 = z3;
                    sd3Var.S0();
                    sd3Var.S1.O(true);
                    sd3Var.D0();
                    sd3Var.b1();
                    return;
                }
                if (i3 == 38) {
                    boolean z4 = sd3Var.b2;
                    sd3Var.b2 = !z4;
                    boolean[] zArr = !z4 ? sd3Var.i2 : sd3Var.h2;
                    if (rd3Var4.g != 0) {
                        rd3Var4.e = zArr;
                        rd3Var4.h();
                        rd3Var4.i();
                    }
                    sd3Var.S1.O(true);
                    sd3Var.c1();
                    return;
                }
                return;
            }
            if (i2 == 0) {
                rd3Var3.f();
                return;
            }
            if (i2 == 1) {
                rd3Var2.f();
                sd3Var.b1();
                return;
            }
            if (i2 == 3) {
                rd3Var.f();
                sd3Var.b1();
                return;
            }
            if (i2 == 2) {
                rd3Var4.f();
                return;
            }
            if (i3 == 35) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sd3Var.getContext());
                    String M02 = k96.M0(2131743480, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    hdVar2.U = k96.M0(2131743479, null);
                    alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                    hdVar2.show();
                    return;
                }
                if (i2 == 6) {
                    z = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    sd3Var.c1();
                } else {
                    z = true;
                    if (i2 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        sd3Var.c1();
                    } else if (i2 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        sd3Var.c1();
                    } else if (i2 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        sd3Var.c1();
                    } else if (i2 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        sd3Var.c1();
                    } else if (i2 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        sd3Var.c1();
                    } else if (i2 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        sd3Var.c1();
                    } else {
                        if (i2 == 12) {
                            boolean z5 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z5;
                            tL_chatBannedRights.send_gifs = z5;
                            tL_chatBannedRights.send_games = z5;
                            tL_chatBannedRights.send_stickers = z5;
                            sd3Var.c1();
                        } else if (i2 == 14) {
                            if (tL_chatBannedRights.send_plain || sd3Var.q2.send_plain) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= sd3Var.S1.E.size()) {
                                        break;
                                    }
                                    c4c G2 = sd3Var.S1.G(i6);
                                    if (G2.a == 39 && G2.d == 0) {
                                        s49 K = sd3Var.n1.K(i6 + 1);
                                        if (K != null) {
                                            View view2 = K.a;
                                            float f3 = -sd3Var.A2;
                                            sd3Var.A2 = f3;
                                            gl.B3(f3, view2, null);
                                        }
                                    } else {
                                        i6++;
                                    }
                                }
                                pw0.E.a();
                                return;
                            }
                            tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                            sd3Var.c1();
                        } else if (i2 == 13) {
                            z = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            sd3Var.c1();
                        } else {
                            z = true;
                            if (i2 == 101) {
                                sd3Var.x2 = !sd3Var.x2;
                                sd3Var.b1();
                            } else if (i2 == 102) {
                                sd3Var.y2 = !sd3Var.y2;
                                sd3Var.X0();
                            }
                        }
                        z = true;
                    }
                }
                sd3Var.S1.O(z);
            }
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // vc7
    public final void run(long j) {
        byte b = this.a;
        sd3 sd3Var = this.b;
        switch (b) {
            case 5:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(mu1.U9(j));
                }
                sd3Var.dismiss();
                break;
            default:
                d Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(mu1.U9(j));
                }
                sd3Var.dismiss();
                break;
        }
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
