// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class he3 implements scc, s69, ef7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ me3 b;

    public /* synthetic */ he3(me3 me3Var, byte b) {
        this.a = b;
        this.b = me3Var;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x018a  */
    @Override // scc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, TLObject tLObject) {
        long j;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        byte b = this.a;
        me3 me3Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat chat = me3Var.T1;
                if (me3Var.x2) {
                    if (tLObject instanceof TLRPC.User) {
                        uc7.s1(me3Var.a).i0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        uc7.s1(me3Var.a).i0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (me3Var.y2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            uc7.s1(me3Var.a).h0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        uc7.s1(me3Var.a).h0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Chat chat2 = me3Var.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        uc7.s1(me3Var.a).i0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    uc7.s1(me3Var.a).i0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                TLRPC.Chat chat3 = me3Var.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        uc7.s1(me3Var.a).h0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    uc7.s1(me3Var.a).h0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                TLRPC.Chat chat4 = me3Var.T1;
                long j2 = chat4.id;
                if (xc2.p0(chat4) && xc2.A(me3Var.a, chat4, 24)) {
                    long j3 = chat4.linked_monoforum_id;
                    if (j3 != 0) {
                        j = j3;
                        if (!me3Var.b2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = me3Var.r2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) me3Var.s2.get(i);
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
                                    uc7.s1(me3Var.a).a5(j, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, me3Var.r1, null);
                                    break;
                                }
                            } else {
                                uc7.s1(me3Var.a).a5(j, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, me3Var.r1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                uc7.s1(me3Var.a).e0(j, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            uc7.s1(me3Var.a).e0(j, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j = j2;
                if (!me3Var.b2) {
                }
                break;
        }
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        boolean z;
        me3 me3Var = this.b;
        b8c G = me3Var.S1.G(i - 1);
        if (G != null) {
            le3 le3Var = me3Var.f2;
            le3 le3Var2 = me3Var.e2;
            le3 le3Var3 = me3Var.d2;
            le3 le3Var4 = me3Var.g2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = me3Var.r2;
            int i2 = G.d;
            if (i2 == 103) {
                boolean z2 = !me3Var.k2;
                me3Var.k2 = z2;
                ((vkb) view).setChecked(z2);
                return;
            }
            int i3 = G.a;
            if (i3 == 37) {
                int i4 = i2 >>> 24;
                int i5 = 16777215 & i2;
                if (i4 == 0) {
                    le3Var3.g(i5);
                    return;
                }
                if (i4 == 1) {
                    le3Var2.g(i5);
                    me3Var.c1();
                    return;
                } else if (i2 == 3) {
                    le3Var.g(i5);
                    me3Var.c1();
                    return;
                } else {
                    if (i4 == 2) {
                        le3Var4.g(i5);
                        return;
                    }
                    return;
                }
            }
            if (i3 != 36 && i3 != 35) {
                if (i3 == 39) {
                    if (G.u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(me3Var.getContext());
                        String M0 = ob6.M0(2131743374, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131743373, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar.show();
                        return;
                    }
                    if (i2 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        me3Var.d1();
                    } else if (i2 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        me3Var.d1();
                    } else if (i2 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        me3Var.d1();
                    } else if (i2 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        me3Var.d1();
                    } else if (i2 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        me3Var.d1();
                    }
                    me3Var.S1.O(true);
                    return;
                }
                if (i3 == 40) {
                    me3Var.t2 = !me3Var.t2;
                    me3Var.T0();
                    me3Var.S1.O(true);
                    me3Var.E0();
                    return;
                }
                if (i2 == 100) {
                    me3Var.w2 = false;
                    boolean z3 = !me3Var.x2;
                    me3Var.x2 = z3;
                    me3Var.y2 = z3;
                    me3Var.T0();
                    me3Var.S1.O(true);
                    me3Var.E0();
                    me3Var.c1();
                    return;
                }
                if (i3 == 38) {
                    boolean z4 = me3Var.b2;
                    me3Var.b2 = !z4;
                    boolean[] zArr = !z4 ? me3Var.i2 : me3Var.h2;
                    if (le3Var4.g != 0) {
                        le3Var4.e = zArr;
                        le3Var4.h();
                        le3Var4.i();
                    }
                    me3Var.S1.O(true);
                    me3Var.d1();
                    return;
                }
                return;
            }
            if (i2 == 0) {
                le3Var3.f();
                return;
            }
            if (i2 == 1) {
                le3Var2.f();
                me3Var.c1();
                return;
            }
            if (i2 == 3) {
                le3Var.f();
                me3Var.c1();
                return;
            }
            if (i2 == 2) {
                le3Var4.f();
                return;
            }
            if (i3 == 35) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(me3Var.getContext());
                    String M02 = ob6.M0(2131743374, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M02;
                    idVar2.U = ob6.M0(2131743373, null);
                    alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                    idVar2.show();
                    return;
                }
                if (i2 == 6) {
                    z = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    me3Var.d1();
                } else {
                    z = true;
                    if (i2 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        me3Var.d1();
                    } else if (i2 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        me3Var.d1();
                    } else if (i2 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        me3Var.d1();
                    } else if (i2 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        me3Var.d1();
                    } else if (i2 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        me3Var.d1();
                    } else if (i2 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        me3Var.d1();
                    } else {
                        if (i2 == 12) {
                            boolean z5 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z5;
                            tL_chatBannedRights.send_gifs = z5;
                            tL_chatBannedRights.send_games = z5;
                            tL_chatBannedRights.send_stickers = z5;
                            me3Var.d1();
                        } else if (i2 == 14) {
                            if (tL_chatBannedRights.send_plain || me3Var.q2.send_plain) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= me3Var.S1.E.size()) {
                                        break;
                                    }
                                    b8c G2 = me3Var.S1.G(i6);
                                    if (G2.a == 39 && G2.d == 0) {
                                        f89 L = me3Var.n1.L(i6 + 1);
                                        if (L != null) {
                                            View view2 = L.a;
                                            float f3 = -me3Var.A2;
                                            me3Var.A2 = f3;
                                            hl.A3(f3, view2, null);
                                        }
                                    } else {
                                        i6++;
                                    }
                                }
                                yw0.E.a();
                                return;
                            }
                            tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                            me3Var.d1();
                        } else if (i2 == 13) {
                            z = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            me3Var.d1();
                        } else {
                            z = true;
                            if (i2 == 101) {
                                me3Var.x2 = !me3Var.x2;
                                me3Var.c1();
                            } else if (i2 == 102) {
                                me3Var.y2 = !me3Var.y2;
                                me3Var.Y0();
                            }
                        }
                        z = true;
                    }
                }
                me3Var.S1.O(z);
            }
        }
    }

    @Override // ef7
    public final void run(long j) {
        byte b = this.a;
        me3 me3Var = this.b;
        switch (b) {
            case 5:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(zu1.ha(j));
                }
                me3Var.dismiss();
                break;
            default:
                e Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(zu1.ha(j));
                }
                me3Var.dismiss();
                break;
        }
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
