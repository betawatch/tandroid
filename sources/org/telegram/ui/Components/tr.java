package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.messenger.a20, pj0, org.telegram.messenger.or {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;

    public /* synthetic */ tr(yr yrVar, int i7) {
        this.a = i7;
        this.b = yrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019e  */
    @Override // org.telegram.messenger.a20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i7, TLObject tLObject) {
        long j3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        switch (this.a) {
            case 0:
                yr yrVar = this.b;
                TLRPC.Chat chat = yrVar.U1;
                if (yrVar.y2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.mp.u1(yrVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(yrVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (yrVar.z2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.mp.u1(yrVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.mp.u1(yrVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                yr yrVar2 = this.b;
                TLRPC.Chat chat2 = yrVar2.U1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(yrVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.mp.u1(yrVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                yr yrVar3 = this.b;
                TLRPC.Chat chat3 = yrVar3.U1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(yrVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.mp.u1(yrVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                yr yrVar4 = this.b;
                TLRPC.Chat chat4 = yrVar4.U1;
                long j10 = chat4.id;
                if (org.telegram.messenger.v3.p0(chat4) && org.telegram.messenger.v3.A(yrVar4.a, chat4, 24)) {
                    long j11 = chat4.linked_monoforum_id;
                    if (j11 != 0) {
                        j3 = j11;
                        if (!yrVar4.c2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = yrVar4.s2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) yrVar4.t2.get(i7);
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
                                    org.telegram.messenger.mp.u1(yrVar4.a).Y4(j3, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, yrVar4.s1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.mp.u1(yrVar4.a).Y4(j3, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, yrVar4.s1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.mp.u1(yrVar4.a).g0(j3, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.mp.u1(yrVar4.a).g0(j3, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j3 = j10;
                if (!yrVar4.c2) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        yr yrVar = this.b;
        l41 G = yrVar.T1.G(i7 - 1);
        if (G == null) {
            return;
        }
        xr xrVar = yrVar.g2;
        xr xrVar2 = yrVar.f2;
        xr xrVar3 = yrVar.e2;
        xr xrVar4 = yrVar.h2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = yrVar.s2;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z11 = !yrVar.l2;
            yrVar.l2 = z11;
            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
            return;
        }
        int i11 = G.a;
        if (i11 == 37) {
            int i12 = i10 >>> 24;
            int i13 = 16777215 & i10;
            if (i12 == 0) {
                xrVar3.g(i13);
                return;
            }
            if (i12 == 1) {
                xrVar2.g(i13);
                yrVar.h1();
                return;
            } else if (i10 == 3) {
                xrVar.g(i13);
                yrVar.h1();
                return;
            } else {
                if (i12 == 2) {
                    xrVar4.g(i13);
                    return;
                }
                return;
            }
        }
        if (i11 != 36 && i11 != 35) {
            if (i11 == 39) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yrVar.getContext());
                    String M0 = org.telegram.messenger.gd.M0(2131743482, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131743481, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                    u1Var.show();
                    return;
                }
                if (i10 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    yrVar.i1();
                } else if (i10 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    yrVar.i1();
                } else if (i10 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    yrVar.i1();
                } else if (i10 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    yrVar.i1();
                } else if (i10 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    yrVar.i1();
                }
                yrVar.T1.O(true);
                return;
            }
            if (i11 == 40) {
                yrVar.u2 = !yrVar.u2;
                yrVar.Y0();
                yrVar.T1.O(true);
                yrVar.J0();
                return;
            }
            if (i10 == 100) {
                yrVar.x2 = false;
                boolean z12 = !yrVar.y2;
                yrVar.y2 = z12;
                yrVar.z2 = z12;
                yrVar.Y0();
                yrVar.T1.O(true);
                yrVar.J0();
                yrVar.h1();
                return;
            }
            if (i11 == 38) {
                boolean z13 = yrVar.c2;
                yrVar.c2 = !z13;
                boolean[] zArr = !z13 ? yrVar.j2 : yrVar.i2;
                if (xrVar4.g != 0) {
                    xrVar4.e = zArr;
                    xrVar4.h();
                    xrVar4.i();
                }
                yrVar.T1.O(true);
                yrVar.i1();
                return;
            }
            return;
        }
        if (i10 == 0) {
            xrVar3.f();
            return;
        }
        if (i10 == 1) {
            xrVar2.f();
            yrVar.h1();
            return;
        }
        if (i10 == 3) {
            xrVar.f();
            yrVar.h1();
            return;
        }
        if (i10 == 2) {
            xrVar4.f();
            return;
        }
        if (i11 == 35) {
            if (G.u) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yrVar.getContext());
                String M02 = org.telegram.messenger.gd.M0(2131743482, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.S = M02;
                u1Var2.U = org.telegram.messenger.gd.M0(2131743481, null);
                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                u1Var2.show();
                return;
            }
            if (i10 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                yrVar.i1();
            } else {
                z10 = true;
                if (i10 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    yrVar.i1();
                } else if (i10 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    yrVar.i1();
                } else if (i10 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    yrVar.i1();
                } else if (i10 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    yrVar.i1();
                } else if (i10 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    yrVar.i1();
                } else if (i10 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    yrVar.i1();
                } else {
                    if (i10 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        yrVar.i1();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || yrVar.r2.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= yrVar.T1.E.size()) {
                                    break;
                                }
                                l41 G2 = yrVar.T1.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    v4.f1 K = yrVar.o1.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -yrVar.B2;
                                        yrVar.B2 = f12;
                                        org.telegram.messenger.g0.E3(f12, view2, null);
                                    }
                                } else {
                                    i14++;
                                }
                            }
                            org.telegram.messenger.q2.E.a();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        yrVar.i1();
                    } else if (i10 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        yrVar.i1();
                    } else {
                        z10 = true;
                        if (i10 == 101) {
                            yrVar.y2 = !yrVar.y2;
                            yrVar.h1();
                        } else if (i10 == 102) {
                            yrVar.z2 = !yrVar.z2;
                            yrVar.d1();
                        }
                    }
                    z10 = true;
                }
            }
            yrVar.T1.O(z10);
        }
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        switch (this.a) {
            case 5:
                yr yrVar = this.b;
                yrVar.getClass();
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                yrVar.dismiss();
                break;
            default:
                yr yrVar2 = this.b;
                yrVar2.getClass();
                org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                yrVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
