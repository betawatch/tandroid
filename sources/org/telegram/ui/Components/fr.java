package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements org.telegram.messenger.x10, gj0, org.telegram.messenger.lr {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ fr(lr lrVar, int i3) {
        this.a = i3;
        this.b = lrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019e  */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i3, TLObject tLObject) {
        long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                TLRPC.Chat chat = lrVar.R1;
                if (lrVar.v2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.hp.s1(lrVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.hp.s1(lrVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (lrVar.w2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.hp.s1(lrVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.hp.s1(lrVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                lr lrVar2 = this.b;
                TLRPC.Chat chat2 = lrVar2.R1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.hp.s1(lrVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.hp.s1(lrVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                lr lrVar3 = this.b;
                TLRPC.Chat chat3 = lrVar3.R1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.hp.s1(lrVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.hp.s1(lrVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                lr lrVar4 = this.b;
                TLRPC.Chat chat4 = lrVar4.R1;
                long j11 = chat4.id;
                if (org.telegram.messenger.t3.p0(chat4) && org.telegram.messenger.t3.A(lrVar4.a, chat4, 24)) {
                    long j12 = chat4.linked_monoforum_id;
                    if (j12 != 0) {
                        j10 = j12;
                        if (!lrVar4.Z1) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lrVar4.p2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) lrVar4.q2.get(i3);
                            if (tL_chatBannedRights2 == null) {
                                tL_chatBannedRights = tL_chatBannedRights3;
                            } else if (tL_chatBannedRights3 == null) {
                                tL_chatBannedRights = tL_chatBannedRights2;
                            } else {
                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                                boolean z10 = true;
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
                                    z10 = false;
                                }
                                tL_chatBannedRights4.send_plain = z10;
                                tL_chatBannedRights = tL_chatBannedRights4;
                            }
                            if (!(tLObject instanceof TLRPC.User)) {
                                if (tLObject instanceof TLRPC.Chat) {
                                    org.telegram.messenger.hp.s1(lrVar4.a).M4(j10, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, lrVar4.p1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.hp.s1(lrVar4.a).M4(j10, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, lrVar4.p1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.hp.s1(lrVar4.a).g0(j10, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.hp.s1(lrVar4.a).g0(j10, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j10 = j11;
                if (!lrVar4.Z1) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        boolean z10;
        lr lrVar = this.b;
        r31 G = lrVar.Q1.G(i3 - 1);
        if (G == null) {
            return;
        }
        kr krVar = lrVar.d2;
        kr krVar2 = lrVar.c2;
        kr krVar3 = lrVar.b2;
        kr krVar4 = lrVar.e2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.p2;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z11 = !lrVar.i2;
            lrVar.i2 = z11;
            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
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
                    String M0 = org.telegram.messenger.bd.M0(2131743729, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131743728, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    s1Var.show();
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
                lrVar.Q1.O(true);
                return;
            }
            if (i11 == 40) {
                lrVar.r2 = !lrVar.r2;
                lrVar.X0();
                lrVar.Q1.O(true);
                lrVar.I0();
                return;
            }
            if (i10 == 100) {
                lrVar.u2 = false;
                boolean z12 = !lrVar.v2;
                lrVar.v2 = z12;
                lrVar.w2 = z12;
                lrVar.X0();
                lrVar.Q1.O(true);
                lrVar.I0();
                lrVar.g1();
                return;
            }
            if (i11 == 38) {
                boolean z13 = lrVar.Z1;
                lrVar.Z1 = !z13;
                boolean[] zArr = !z13 ? lrVar.g2 : lrVar.f2;
                if (krVar4.g != 0) {
                    krVar4.e = zArr;
                    krVar4.h();
                    krVar4.i();
                }
                lrVar.Q1.O(true);
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
                String M02 = org.telegram.messenger.bd.M0(2131743729, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = M02;
                s1Var2.U = org.telegram.messenger.bd.M0(2131743728, null);
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                s1Var2.show();
                return;
            }
            if (i10 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                lrVar.h1();
            } else {
                z10 = true;
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
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        lrVar.h1();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || lrVar.o2.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= lrVar.Q1.E.size()) {
                                    break;
                                }
                                r31 G2 = lrVar.Q1.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    u4.d1 K = lrVar.l1.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -lrVar.y2;
                                        lrVar.y2 = f12;
                                        org.telegram.messenger.g0.G3(f12, view2, null);
                                    }
                                } else {
                                    i14++;
                                }
                            }
                            org.telegram.messenger.p2.E.a();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        lrVar.h1();
                    } else if (i10 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        lrVar.h1();
                    } else {
                        z10 = true;
                        if (i10 == 101) {
                            lrVar.v2 = !lrVar.v2;
                            lrVar.g1();
                        } else if (i10 == 102) {
                            lrVar.w2 = !lrVar.w2;
                            lrVar.c1();
                        }
                    }
                    z10 = true;
                }
            }
            lrVar.Q1.O(z10);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        switch (this.a) {
            case 5:
                lr lrVar = this.b;
                lrVar.getClass();
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.wm.ra(j10));
                }
                lrVar.dismiss();
                break;
            default:
                lr lrVar2 = this.b;
                lrVar2.getClass();
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.wm.ra(j10));
                }
                lrVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
