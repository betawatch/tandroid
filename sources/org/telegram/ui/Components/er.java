package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er implements org.telegram.messenger.f20, cj0, org.telegram.messenger.tr {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ er(kr krVar, int i7) {
        this.a = i7;
        this.b = krVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019e  */
    @Override // org.telegram.messenger.f20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i7, TLObject tLObject) {
        long j3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        switch (this.a) {
            case 0:
                kr krVar = this.b;
                TLRPC.Chat chat = krVar.T1;
                if (krVar.x2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.qp.s1(krVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(krVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (krVar.y2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.qp.s1(krVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.qp.s1(krVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                kr krVar2 = this.b;
                TLRPC.Chat chat2 = krVar2.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(krVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.qp.s1(krVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                kr krVar3 = this.b;
                TLRPC.Chat chat3 = krVar3.T1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(krVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.qp.s1(krVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                kr krVar4 = this.b;
                TLRPC.Chat chat4 = krVar4.T1;
                long j10 = chat4.id;
                if (org.telegram.messenger.t3.p0(chat4) && org.telegram.messenger.t3.A(krVar4.a, chat4, 24)) {
                    long j11 = chat4.linked_monoforum_id;
                    if (j11 != 0) {
                        j3 = j11;
                        if (!krVar4.b2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = krVar4.r2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) krVar4.s2.get(i7);
                            if (tL_chatBannedRights2 == null) {
                                tL_chatBannedRights = tL_chatBannedRights3;
                            } else if (tL_chatBannedRights3 == null) {
                                tL_chatBannedRights = tL_chatBannedRights2;
                            } else {
                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                                boolean z9 = true;
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
                                if (!tL_chatBannedRights2.send_plain && !tL_chatBannedRights3.send_plain) {
                                    z9 = false;
                                }
                                tL_chatBannedRights4.send_plain = z9;
                                tL_chatBannedRights = tL_chatBannedRights4;
                            }
                            if (!(tLObject instanceof TLRPC.User)) {
                                if (tLObject instanceof TLRPC.Chat) {
                                    org.telegram.messenger.qp.s1(krVar4.a).M4(j3, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, krVar4.r1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.qp.s1(krVar4.a).M4(j3, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, krVar4.r1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.qp.s1(krVar4.a).g0(j3, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.qp.s1(krVar4.a).g0(j3, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j3 = j10;
                if (!krVar4.b2) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z9;
        kr krVar = this.b;
        x31 G = krVar.S1.G(i7 - 1);
        if (G == null) {
            return;
        }
        jr jrVar = krVar.f2;
        jr jrVar2 = krVar.e2;
        jr jrVar3 = krVar.d2;
        jr jrVar4 = krVar.g2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = krVar.r2;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z10 = !krVar.k2;
            krVar.k2 = z10;
            ((org.telegram.ui.Cells.q8) view).setChecked(z10);
            return;
        }
        int i11 = G.a;
        if (i11 == 37) {
            int i12 = i10 >>> 24;
            int i13 = 16777215 & i10;
            if (i12 == 0) {
                jrVar3.g(i13);
                return;
            }
            if (i12 == 1) {
                jrVar2.g(i13);
                krVar.g1();
                return;
            } else if (i10 == 3) {
                jrVar.g(i13);
                krVar.g1();
                return;
            } else {
                if (i12 == 2) {
                    jrVar4.g(i13);
                    return;
                }
                return;
            }
        }
        if (i11 != 36 && i11 != 35) {
            if (i11 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(krVar.getContext());
                    String M0 = org.telegram.messenger.id.M0(2131743719, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131743718, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                    u1Var.show();
                    return;
                }
                if (i10 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    krVar.h1();
                } else if (i10 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    krVar.h1();
                } else if (i10 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    krVar.h1();
                } else if (i10 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    krVar.h1();
                } else if (i10 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    krVar.h1();
                }
                krVar.S1.O(true);
                return;
            }
            if (i11 == 40) {
                krVar.t2 = !krVar.t2;
                krVar.X0();
                krVar.S1.O(true);
                krVar.I0();
                return;
            }
            if (i10 == 100) {
                krVar.w2 = false;
                boolean z11 = !krVar.x2;
                krVar.x2 = z11;
                krVar.y2 = z11;
                krVar.X0();
                krVar.S1.O(true);
                krVar.I0();
                krVar.g1();
                return;
            }
            if (i11 == 38) {
                boolean z12 = krVar.b2;
                krVar.b2 = !z12;
                boolean[] zArr = !z12 ? krVar.i2 : krVar.h2;
                if (jrVar4.g != 0) {
                    jrVar4.e = zArr;
                    jrVar4.h();
                    jrVar4.i();
                }
                krVar.S1.O(true);
                krVar.h1();
                return;
            }
            return;
        }
        if (i10 == 0) {
            jrVar3.f();
            return;
        }
        if (i10 == 1) {
            jrVar2.f();
            krVar.g1();
            return;
        }
        if (i10 == 3) {
            jrVar.f();
            krVar.g1();
            return;
        }
        if (i10 == 2) {
            jrVar4.f();
            return;
        }
        if (i11 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(krVar.getContext());
                String M02 = org.telegram.messenger.id.M0(2131743719, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = M02;
                u1Var2.T = org.telegram.messenger.id.M0(2131743718, null);
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                u1Var2.show();
                return;
            }
            if (i10 == 6) {
                z9 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                krVar.h1();
            } else {
                z9 = true;
                if (i10 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    krVar.h1();
                } else if (i10 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    krVar.h1();
                } else if (i10 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    krVar.h1();
                } else if (i10 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    krVar.h1();
                } else if (i10 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    krVar.h1();
                } else if (i10 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    krVar.h1();
                } else {
                    if (i10 == 12) {
                        boolean z13 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z13;
                        tL_chatBannedRights.send_gifs = z13;
                        tL_chatBannedRights.send_games = z13;
                        tL_chatBannedRights.send_stickers = z13;
                        krVar.h1();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || krVar.q2.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= krVar.S1.D.size()) {
                                    break;
                                }
                                x31 G2 = krVar.S1.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    v4.d1 K = krVar.n1.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -krVar.A2;
                                        krVar.A2 = f12;
                                        org.telegram.messenger.g0.G3(f12, view2, null);
                                    }
                                } else {
                                    i14++;
                                }
                            }
                            org.telegram.messenger.p2.D.a();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        krVar.h1();
                    } else if (i10 == 13) {
                        z9 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        krVar.h1();
                    } else {
                        z9 = true;
                        if (i10 == 101) {
                            krVar.x2 = !krVar.x2;
                            krVar.g1();
                        } else if (i10 == 102) {
                            krVar.y2 = !krVar.y2;
                            krVar.c1();
                        }
                    }
                    z9 = true;
                }
            }
            krVar.S1.O(z9);
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        switch (this.a) {
            case 5:
                kr krVar = this.b;
                krVar.getClass();
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.cn.ta(j3));
                }
                krVar.dismiss();
                break;
            default:
                kr krVar2 = this.b;
                krVar2.getClass();
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.cn.ta(j3));
                }
                krVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
