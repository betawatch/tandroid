package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements org.telegram.messenger.b20, rj0, org.telegram.messenger.pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ vr(as asVar, int i7) {
        this.a = i7;
        this.b = asVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019e  */
    @Override // org.telegram.messenger.b20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i7, TLObject tLObject) {
        long j3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        switch (this.a) {
            case 0:
                as asVar = this.b;
                TLRPC.Chat chat = asVar.U1;
                if (asVar.y2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.np.u1(asVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.np.u1(asVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (asVar.z2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.np.u1(asVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.np.u1(asVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                as asVar2 = this.b;
                TLRPC.Chat chat2 = asVar2.U1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.np.u1(asVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.np.u1(asVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                as asVar3 = this.b;
                TLRPC.Chat chat3 = asVar3.U1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.np.u1(asVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.np.u1(asVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                as asVar4 = this.b;
                TLRPC.Chat chat4 = asVar4.U1;
                long j10 = chat4.id;
                if (org.telegram.messenger.v3.p0(chat4) && org.telegram.messenger.v3.A(asVar4.a, chat4, 24)) {
                    long j11 = chat4.linked_monoforum_id;
                    if (j11 != 0) {
                        j3 = j11;
                        if (!asVar4.c2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = asVar4.s2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) asVar4.t2.get(i7);
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
                                    org.telegram.messenger.np.u1(asVar4.a).Y4(j3, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, asVar4.s1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.np.u1(asVar4.a).Y4(j3, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, asVar4.s1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.np.u1(asVar4.a).g0(j3, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.np.u1(asVar4.a).g0(j3, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j3 = j10;
                if (!asVar4.c2) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        as asVar = this.b;
        o41 G = asVar.T1.G(i7 - 1);
        if (G == null) {
            return;
        }
        zr zrVar = asVar.g2;
        zr zrVar2 = asVar.f2;
        zr zrVar3 = asVar.e2;
        zr zrVar4 = asVar.h2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.s2;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z11 = !asVar.l2;
            asVar.l2 = z11;
            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
            return;
        }
        int i11 = G.a;
        if (i11 == 37) {
            int i12 = i10 >>> 24;
            int i13 = 16777215 & i10;
            if (i12 == 0) {
                zrVar3.g(i13);
                return;
            }
            if (i12 == 1) {
                zrVar2.g(i13);
                asVar.h1();
                return;
            } else if (i10 == 3) {
                zrVar.g(i13);
                asVar.h1();
                return;
            } else {
                if (i12 == 2) {
                    zrVar4.g(i13);
                    return;
                }
                return;
            }
        }
        if (i11 != 36 && i11 != 35) {
            if (i11 == 39) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                    String N0 = org.telegram.messenger.hd.N0(2131743474, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.hd.N0(2131743473, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                    t1Var.show();
                    return;
                }
                if (i10 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    asVar.i1();
                } else if (i10 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    asVar.i1();
                } else if (i10 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    asVar.i1();
                } else if (i10 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    asVar.i1();
                } else if (i10 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    asVar.i1();
                }
                asVar.T1.O(true);
                return;
            }
            if (i11 == 40) {
                asVar.u2 = !asVar.u2;
                asVar.Y0();
                asVar.T1.O(true);
                asVar.J0();
                return;
            }
            if (i10 == 100) {
                asVar.x2 = false;
                boolean z12 = !asVar.y2;
                asVar.y2 = z12;
                asVar.z2 = z12;
                asVar.Y0();
                asVar.T1.O(true);
                asVar.J0();
                asVar.h1();
                return;
            }
            if (i11 == 38) {
                boolean z13 = asVar.c2;
                asVar.c2 = !z13;
                boolean[] zArr = !z13 ? asVar.j2 : asVar.i2;
                if (zrVar4.g != 0) {
                    zrVar4.e = zArr;
                    zrVar4.h();
                    zrVar4.i();
                }
                asVar.T1.O(true);
                asVar.i1();
                return;
            }
            return;
        }
        if (i10 == 0) {
            zrVar3.f();
            return;
        }
        if (i10 == 1) {
            zrVar2.f();
            asVar.h1();
            return;
        }
        if (i10 == 3) {
            zrVar.f();
            asVar.h1();
            return;
        }
        if (i10 == 2) {
            zrVar4.f();
            return;
        }
        if (i11 == 35) {
            if (G.u) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(asVar.getContext());
                String N02 = org.telegram.messenger.hd.N0(2131743474, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = N02;
                t1Var2.U = org.telegram.messenger.hd.N0(2131743473, null);
                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                t1Var2.show();
                return;
            }
            if (i10 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                asVar.i1();
            } else {
                z10 = true;
                if (i10 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    asVar.i1();
                } else if (i10 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    asVar.i1();
                } else if (i10 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    asVar.i1();
                } else if (i10 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    asVar.i1();
                } else if (i10 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    asVar.i1();
                } else if (i10 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    asVar.i1();
                } else {
                    if (i10 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        asVar.i1();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || asVar.r2.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= asVar.T1.E.size()) {
                                    break;
                                }
                                o41 G2 = asVar.T1.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    v4.f1 K = asVar.o1.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -asVar.B2;
                                        asVar.B2 = f12;
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
                        asVar.i1();
                    } else if (i10 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        asVar.i1();
                    } else {
                        z10 = true;
                        if (i10 == 101) {
                            asVar.y2 = !asVar.y2;
                            asVar.h1();
                        } else if (i10 == 102) {
                            asVar.z2 = !asVar.z2;
                            asVar.d1();
                        }
                    }
                    z10 = true;
                }
            }
            asVar.T1.O(z10);
        }
    }

    @Override // org.telegram.messenger.pr
    public void run(long j3) {
        switch (this.a) {
            case 5:
                as asVar = this.b;
                asVar.getClass();
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                asVar.dismiss();
                break;
            default:
                as asVar2 = this.b;
                asVar2.getClass();
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                asVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
