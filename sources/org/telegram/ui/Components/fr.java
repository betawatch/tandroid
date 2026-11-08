package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements org.telegram.messenger.f20, cj0, org.telegram.messenger.tr {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ fr(lr lrVar, int i7) {
        this.a = i7;
        this.b = lrVar;
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
                lr lrVar = this.b;
                TLRPC.Chat chat = lrVar.Q1;
                if (lrVar.u2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.qp.s1(lrVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(lrVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (lrVar.v2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.qp.s1(lrVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.qp.s1(lrVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                lr lrVar2 = this.b;
                TLRPC.Chat chat2 = lrVar2.Q1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(lrVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.qp.s1(lrVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                lr lrVar3 = this.b;
                TLRPC.Chat chat3 = lrVar3.Q1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.qp.s1(lrVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.qp.s1(lrVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                lr lrVar4 = this.b;
                TLRPC.Chat chat4 = lrVar4.Q1;
                long j10 = chat4.id;
                if (org.telegram.messenger.t3.p0(chat4) && org.telegram.messenger.t3.A(lrVar4.a, chat4, 24)) {
                    long j11 = chat4.linked_monoforum_id;
                    if (j11 != 0) {
                        j3 = j11;
                        if (!lrVar4.Y1) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lrVar4.o2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) lrVar4.p2.get(i7);
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
                                    org.telegram.messenger.qp.s1(lrVar4.a).M4(j3, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, lrVar4.o1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.qp.s1(lrVar4.a).M4(j3, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, lrVar4.o1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.qp.s1(lrVar4.a).g0(j3, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.qp.s1(lrVar4.a).g0(j3, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j3 = j10;
                if (!lrVar4.Y1) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z9;
        lr lrVar = this.b;
        x31 G = lrVar.P1.G(i7 - 1);
        if (G == null) {
            return;
        }
        kr krVar = lrVar.c2;
        kr krVar2 = lrVar.b2;
        kr krVar3 = lrVar.a2;
        kr krVar4 = lrVar.d2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.o2;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z10 = !lrVar.h2;
            lrVar.h2 = z10;
            ((org.telegram.ui.Cells.q8) view).setChecked(z10);
            return;
        }
        int i11 = G.a;
        if (i11 == 37) {
            int i12 = i10 >>> 24;
            int i13 = 16777215 & i10;
            if (i12 == 0) {
                krVar3.g(i13);
                return;
            }
            if (i12 == 1) {
                krVar2.g(i13);
                lrVar.g1();
                return;
            } else if (i10 == 3) {
                krVar.g(i13);
                lrVar.g1();
                return;
            } else {
                if (i12 == 2) {
                    krVar4.g(i13);
                    return;
                }
                return;
            }
        }
        if (i11 != 36 && i11 != 35) {
            if (i11 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                    String M0 = org.telegram.messenger.id.M0(2131743722, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131743721, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                    u1Var.show();
                    return;
                }
                if (i10 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    lrVar.h1();
                } else if (i10 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    lrVar.h1();
                } else if (i10 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    lrVar.h1();
                } else if (i10 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    lrVar.h1();
                } else if (i10 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    lrVar.h1();
                }
                lrVar.P1.O(true);
                return;
            }
            if (i11 == 40) {
                lrVar.q2 = !lrVar.q2;
                lrVar.X0();
                lrVar.P1.O(true);
                lrVar.I0();
                return;
            }
            if (i10 == 100) {
                lrVar.t2 = false;
                boolean z11 = !lrVar.u2;
                lrVar.u2 = z11;
                lrVar.v2 = z11;
                lrVar.X0();
                lrVar.P1.O(true);
                lrVar.I0();
                lrVar.g1();
                return;
            }
            if (i11 == 38) {
                boolean z12 = lrVar.Y1;
                lrVar.Y1 = !z12;
                boolean[] zArr = !z12 ? lrVar.f2 : lrVar.e2;
                if (krVar4.g != 0) {
                    krVar4.e = zArr;
                    krVar4.h();
                    krVar4.i();
                }
                lrVar.P1.O(true);
                lrVar.h1();
                return;
            }
            return;
        }
        if (i10 == 0) {
            krVar3.f();
            return;
        }
        if (i10 == 1) {
            krVar2.f();
            lrVar.g1();
            return;
        }
        if (i10 == 3) {
            krVar.f();
            lrVar.g1();
            return;
        }
        if (i10 == 2) {
            krVar4.f();
            return;
        }
        if (i11 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lrVar.getContext());
                String M02 = org.telegram.messenger.id.M0(2131743722, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = M02;
                u1Var2.T = org.telegram.messenger.id.M0(2131743721, null);
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                u1Var2.show();
                return;
            }
            if (i10 == 6) {
                z9 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                lrVar.h1();
            } else {
                z9 = true;
                if (i10 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    lrVar.h1();
                } else if (i10 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    lrVar.h1();
                } else if (i10 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    lrVar.h1();
                } else if (i10 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    lrVar.h1();
                } else if (i10 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    lrVar.h1();
                } else if (i10 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    lrVar.h1();
                } else {
                    if (i10 == 12) {
                        boolean z13 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z13;
                        tL_chatBannedRights.send_gifs = z13;
                        tL_chatBannedRights.send_games = z13;
                        tL_chatBannedRights.send_stickers = z13;
                        lrVar.h1();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || lrVar.n2.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= lrVar.P1.D.size()) {
                                    break;
                                }
                                x31 G2 = lrVar.P1.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    v4.d1 K = lrVar.k1.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -lrVar.x2;
                                        lrVar.x2 = f12;
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
                        lrVar.h1();
                    } else if (i10 == 13) {
                        z9 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        lrVar.h1();
                    } else {
                        z9 = true;
                        if (i10 == 101) {
                            lrVar.u2 = !lrVar.u2;
                            lrVar.g1();
                        } else if (i10 == 102) {
                            lrVar.v2 = !lrVar.v2;
                            lrVar.c1();
                        }
                    }
                    z9 = true;
                }
            }
            lrVar.P1.O(z9);
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
                lr lrVar = this.b;
                lrVar.getClass();
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.an.ra(j3));
                }
                lrVar.dismiss();
                break;
            default:
                lr lrVar2 = this.b;
                lrVar2.getClass();
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.an.ra(j3));
                }
                lrVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
