package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements org.telegram.messenger.z10, rj0, org.telegram.messenger.or {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr b;

    public /* synthetic */ sr(xr xrVar, int i7) {
        this.a = i7;
        this.b = xrVar;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019e  */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i7, TLObject tLObject) {
        long j3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        switch (this.a) {
            case 0:
                xr xrVar = this.b;
                TLRPC.Chat chat = xrVar.U1;
                if (xrVar.y2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.mp.u1(xrVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(xrVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (xrVar.z2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.mp.u1(xrVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.mp.u1(xrVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                xr xrVar2 = this.b;
                TLRPC.Chat chat2 = xrVar2.U1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(xrVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.mp.u1(xrVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                xr xrVar3 = this.b;
                TLRPC.Chat chat3 = xrVar3.U1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(xrVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.mp.u1(xrVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                xr xrVar4 = this.b;
                TLRPC.Chat chat4 = xrVar4.U1;
                long j10 = chat4.id;
                if (org.telegram.messenger.v3.p0(chat4) && org.telegram.messenger.v3.A(xrVar4.a, chat4, 24)) {
                    long j11 = chat4.linked_monoforum_id;
                    if (j11 != 0) {
                        j3 = j11;
                        if (!xrVar4.c2) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = xrVar4.s2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) xrVar4.t2.get(i7);
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
                                    org.telegram.messenger.mp.u1(xrVar4.a).Y4(j3, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, xrVar4.s1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.mp.u1(xrVar4.a).Y4(j3, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, xrVar4.s1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.mp.u1(xrVar4.a).g0(j3, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.mp.u1(xrVar4.a).g0(j3, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j3 = j10;
                if (!xrVar4.c2) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        boolean z10;
        xr xrVar = this.b;
        n41 G = xrVar.T1.G(i7 - 1);
        if (G == null) {
            return;
        }
        wr wrVar = xrVar.g2;
        wr wrVar2 = xrVar.f2;
        wr wrVar3 = xrVar.e2;
        wr wrVar4 = xrVar.h2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = xrVar.s2;
        int i10 = G.d;
        if (i10 == 103) {
            boolean z11 = !xrVar.l2;
            xrVar.l2 = z11;
            ((org.telegram.ui.Cells.q8) view).setChecked(z11);
            return;
        }
        int i11 = G.a;
        if (i11 == 37) {
            int i12 = i10 >>> 24;
            int i13 = 16777215 & i10;
            if (i12 == 0) {
                wrVar3.g(i13);
                return;
            }
            if (i12 == 1) {
                wrVar2.g(i13);
                xrVar.h1();
                return;
            } else if (i10 == 3) {
                wrVar.g(i13);
                xrVar.h1();
                return;
            } else {
                if (i12 == 2) {
                    wrVar4.g(i13);
                    return;
                }
                return;
            }
        }
        if (i11 != 36 && i11 != 35) {
            if (i11 == 39) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xrVar.getContext());
                    String N0 = org.telegram.messenger.gd.N0(2131743472, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131743471, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                    t1Var.show();
                    return;
                }
                if (i10 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    xrVar.i1();
                } else if (i10 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    xrVar.i1();
                } else if (i10 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    xrVar.i1();
                } else if (i10 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    xrVar.i1();
                } else if (i10 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    xrVar.i1();
                }
                xrVar.T1.O(true);
                return;
            }
            if (i11 == 40) {
                xrVar.u2 = !xrVar.u2;
                xrVar.Y0();
                xrVar.T1.O(true);
                xrVar.J0();
                return;
            }
            if (i10 == 100) {
                xrVar.x2 = false;
                boolean z12 = !xrVar.y2;
                xrVar.y2 = z12;
                xrVar.z2 = z12;
                xrVar.Y0();
                xrVar.T1.O(true);
                xrVar.J0();
                xrVar.h1();
                return;
            }
            if (i11 == 38) {
                boolean z13 = xrVar.c2;
                xrVar.c2 = !z13;
                boolean[] zArr = !z13 ? xrVar.j2 : xrVar.i2;
                if (wrVar4.g != 0) {
                    wrVar4.e = zArr;
                    wrVar4.h();
                    wrVar4.i();
                }
                xrVar.T1.O(true);
                xrVar.i1();
                return;
            }
            return;
        }
        if (i10 == 0) {
            wrVar3.f();
            return;
        }
        if (i10 == 1) {
            wrVar2.f();
            xrVar.h1();
            return;
        }
        if (i10 == 3) {
            wrVar.f();
            xrVar.h1();
            return;
        }
        if (i10 == 2) {
            wrVar4.f();
            return;
        }
        if (i11 == 35) {
            if (G.u) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xrVar.getContext());
                String N02 = org.telegram.messenger.gd.N0(2131743472, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = N02;
                t1Var2.U = org.telegram.messenger.gd.N0(2131743471, null);
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                t1Var2.show();
                return;
            }
            if (i10 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                xrVar.i1();
            } else {
                z10 = true;
                if (i10 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    xrVar.i1();
                } else if (i10 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    xrVar.i1();
                } else if (i10 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    xrVar.i1();
                } else if (i10 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    xrVar.i1();
                } else if (i10 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    xrVar.i1();
                } else if (i10 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    xrVar.i1();
                } else {
                    if (i10 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        xrVar.i1();
                    } else if (i10 == 14) {
                        if (tL_chatBannedRights.send_plain || xrVar.r2.send_plain) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= xrVar.T1.E.size()) {
                                    break;
                                }
                                n41 G2 = xrVar.T1.G(i14);
                                if (G2.a == 39 && G2.d == 0) {
                                    v4.f1 K = xrVar.o1.K(i14 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f12 = -xrVar.B2;
                                        xrVar.B2 = f12;
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
                        xrVar.i1();
                    } else if (i10 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        xrVar.i1();
                    } else {
                        z10 = true;
                        if (i10 == 101) {
                            xrVar.y2 = !xrVar.y2;
                            xrVar.h1();
                        } else if (i10 == 102) {
                            xrVar.z2 = !xrVar.z2;
                            xrVar.d1();
                        }
                    }
                    z10 = true;
                }
            }
            xrVar.T1.O(z10);
        }
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        switch (this.a) {
            case 5:
                xr xrVar = this.b;
                xrVar.getClass();
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                xrVar.dismiss();
                break;
            default:
                xr xrVar2 = this.b;
                xrVar2.getClass();
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                xrVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
