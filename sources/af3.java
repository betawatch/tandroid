// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class af3 implements tac, g59, xe7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ef3 b;

    public /* synthetic */ af3(ef3 ef3Var, byte b) {
        this.a = b;
        this.b = ef3Var;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        boolean z;
        ef3 ef3Var = this.b;
        c6c G = ef3Var.S1.G(i - 1);
        if (G != null) {
            df3 df3Var = ef3Var.f2;
            df3 df3Var2 = ef3Var.e2;
            df3 df3Var3 = ef3Var.d2;
            df3 df3Var4 = ef3Var.g2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = ef3Var.r2;
            int i2 = G.d;
            if (i2 == 103) {
                boolean z2 = !ef3Var.k2;
                ef3Var.k2 = z2;
                ((ajb) view).setChecked(z2);
                return;
            }
            int i3 = G.a;
            if (i3 == 37) {
                int i4 = i2 >>> 24;
                int i5 = 16777215 & i2;
                if (i4 == 0) {
                    df3Var3.g(i5);
                    return;
                }
                if (i4 == 1) {
                    df3Var2.g(i5);
                    ef3Var.b1();
                    return;
                } else if (i2 == 3) {
                    df3Var.g(i5);
                    ef3Var.b1();
                    return;
                } else {
                    if (i4 == 2) {
                        df3Var4.g(i5);
                        return;
                    }
                    return;
                }
            }
            if (i3 != 36 && i3 != 35) {
                if (i3 == 39) {
                    if (G.u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ef3Var.getContext());
                        String M0 = jb6.M0(2131743406, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131743405, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.show();
                        return;
                    }
                    if (i2 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        ef3Var.c1();
                    } else if (i2 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        ef3Var.c1();
                    } else if (i2 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        ef3Var.c1();
                    } else if (i2 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        ef3Var.c1();
                    } else if (i2 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        ef3Var.c1();
                    }
                    ef3Var.S1.O(true);
                    return;
                }
                if (i3 == 40) {
                    ef3Var.t2 = !ef3Var.t2;
                    ef3Var.S0();
                    ef3Var.S1.O(true);
                    ef3Var.D0();
                    return;
                }
                if (i2 == 100) {
                    ef3Var.w2 = false;
                    boolean z3 = !ef3Var.x2;
                    ef3Var.x2 = z3;
                    ef3Var.y2 = z3;
                    ef3Var.S0();
                    ef3Var.S1.O(true);
                    ef3Var.D0();
                    ef3Var.b1();
                    return;
                }
                if (i3 == 38) {
                    boolean z4 = ef3Var.b2;
                    ef3Var.b2 = !z4;
                    boolean[] zArr = !z4 ? ef3Var.i2 : ef3Var.h2;
                    if (df3Var4.g != 0) {
                        df3Var4.e = zArr;
                        df3Var4.h();
                        df3Var4.i();
                    }
                    ef3Var.S1.O(true);
                    ef3Var.c1();
                    return;
                }
                return;
            }
            if (i2 == 0) {
                df3Var3.f();
                return;
            }
            if (i2 == 1) {
                df3Var2.f();
                ef3Var.b1();
                return;
            }
            if (i2 == 3) {
                df3Var.f();
                ef3Var.b1();
                return;
            }
            if (i2 == 2) {
                df3Var4.f();
                return;
            }
            if (i3 == 35) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ef3Var.getContext());
                    String M02 = jb6.M0(2131743406, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = M02;
                    heVar2.U = jb6.M0(2131743405, null);
                    alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                    heVar2.show();
                    return;
                }
                if (i2 == 6) {
                    z = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    ef3Var.c1();
                } else {
                    z = true;
                    if (i2 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        ef3Var.c1();
                    } else if (i2 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        ef3Var.c1();
                    } else if (i2 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        ef3Var.c1();
                    } else if (i2 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        ef3Var.c1();
                    } else if (i2 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        ef3Var.c1();
                    } else if (i2 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        ef3Var.c1();
                    } else {
                        if (i2 == 12) {
                            boolean z5 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z5;
                            tL_chatBannedRights.send_gifs = z5;
                            tL_chatBannedRights.send_games = z5;
                            tL_chatBannedRights.send_stickers = z5;
                            ef3Var.c1();
                        } else if (i2 == 14) {
                            if (tL_chatBannedRights.send_plain || ef3Var.q2.send_plain) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= ef3Var.S1.E.size()) {
                                        break;
                                    }
                                    c6c G2 = ef3Var.S1.G(i6);
                                    if (G2.a == 39 && G2.d == 0) {
                                        u69 K = ef3Var.n1.K(i6 + 1);
                                        if (K != null) {
                                            View view2 = K.a;
                                            float f3 = -ef3Var.A2;
                                            ef3Var.A2 = f3;
                                            gm.A3(f3, view2, null);
                                        }
                                    } else {
                                        i6++;
                                    }
                                }
                                xx0.E.a();
                                return;
                            }
                            tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                            ef3Var.c1();
                        } else if (i2 == 13) {
                            z = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            ef3Var.c1();
                        } else {
                            z = true;
                            if (i2 == 101) {
                                ef3Var.x2 = !ef3Var.x2;
                                ef3Var.b1();
                            } else if (i2 == 102) {
                                ef3Var.y2 = !ef3Var.y2;
                                ef3Var.X0();
                            }
                        }
                        z = true;
                    }
                }
                ef3Var.S1.O(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x018a  */
    @Override // tac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, TLObject tLObject) {
        long j;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        byte b = this.a;
        ef3 ef3Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat chat = ef3Var.T1;
                if (ef3Var.x2) {
                    if (tLObject instanceof TLRPC.User) {
                        oc7.r1(ef3Var.a).g0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        oc7.r1(ef3Var.a).g0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (ef3Var.y2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            oc7.r1(ef3Var.a).f0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        oc7.r1(ef3Var.a).f0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Chat chat2 = ef3Var.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        oc7.r1(ef3Var.a).g0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    oc7.r1(ef3Var.a).g0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                TLRPC.Chat chat3 = ef3Var.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        oc7.r1(ef3Var.a).f0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    oc7.r1(ef3Var.a).f0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                TLRPC.Chat chat4 = ef3Var.T1;
                long j2 = chat4.id;
                if (sd2.p0(chat4) && sd2.A(ef3Var.a, chat4, 24)) {
                    long j3 = chat4.linked_monoforum_id;
                    if (j3 != 0) {
                        j = j3;
                        if (!ef3Var.b2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = ef3Var.r2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) ef3Var.s2.get(i);
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
                                    oc7.r1(ef3Var.a).U4(j, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, ef3Var.r1, null);
                                    break;
                                }
                            } else {
                                oc7.r1(ef3Var.a).U4(j, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, ef3Var.r1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                oc7.r1(ef3Var.a).c0(j, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            oc7.r1(ef3Var.a).c0(j, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j = j2;
                if (!ef3Var.b2) {
                }
                break;
        }
    }

    @Override // xe7
    public final void run(long j) {
        byte b = this.a;
        ef3 ef3Var = this.b;
        switch (b) {
            case 5:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(yv1.ga(j));
                }
                ef3Var.dismiss();
                break;
            default:
                d Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(yv1.ga(j));
                }
                ef3Var.dismiss();
                break;
        }
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
