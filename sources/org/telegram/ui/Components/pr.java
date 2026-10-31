package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements org.telegram.messenger.t20, hk0, org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;

    public /* synthetic */ pr(vr vrVar, int i10) {
        this.a = i10;
        this.b = vrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019e  */
    @Override // org.telegram.messenger.t20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i10, TLObject tLObject) {
        long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                TLRPC.Chat chat = vrVar.Q1;
                if (vrVar.u2) {
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.vp.r1(vrVar.a).k0(chat, (TLRPC.User) tLObject, null, 0);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.vp.r1(vrVar.a).k0(chat, null, (TLRPC.Chat) tLObject, 0);
                    }
                }
                if (vrVar.v2) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        if (tLObject instanceof TLRPC.Chat) {
                            org.telegram.messenger.vp.r1(vrVar.a).j0(chat, null, (TLRPC.Chat) tLObject);
                            break;
                        }
                    } else {
                        org.telegram.messenger.vp.r1(vrVar.a).j0(chat, (TLRPC.User) tLObject, null);
                        break;
                    }
                }
                break;
            case 1:
                vr vrVar2 = this.b;
                TLRPC.Chat chat2 = vrVar2.Q1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.vp.r1(vrVar2.a).k0(chat2, null, (TLRPC.Chat) tLObject, 0);
                        break;
                    }
                } else {
                    org.telegram.messenger.vp.r1(vrVar2.a).k0(chat2, (TLRPC.User) tLObject, null, 0);
                    break;
                }
                break;
            case 2:
                vr vrVar3 = this.b;
                TLRPC.Chat chat3 = vrVar3.Q1;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.vp.r1(vrVar3.a).j0(chat3, null, (TLRPC.Chat) tLObject);
                        break;
                    }
                } else {
                    org.telegram.messenger.vp.r1(vrVar3.a).j0(chat3, (TLRPC.User) tLObject, null);
                    break;
                }
                break;
            default:
                vr vrVar4 = this.b;
                TLRPC.Chat chat4 = vrVar4.Q1;
                long j11 = chat4.id;
                if (org.telegram.messenger.w3.p0(chat4) && org.telegram.messenger.w3.A(vrVar4.a, chat4, 24)) {
                    long j12 = chat4.linked_monoforum_id;
                    if (j12 != 0) {
                        j10 = j12;
                        if (!vrVar4.Y1) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = vrVar4.o2;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = (TLRPC.TL_chatBannedRights) vrVar4.p2.get(i10);
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
                                    org.telegram.messenger.vp.r1(vrVar4.a).J4(j10, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, vrVar4.o1, null);
                                    break;
                                }
                            } else {
                                org.telegram.messenger.vp.r1(vrVar4.a).J4(j10, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, vrVar4.o1, null);
                                break;
                            }
                        } else if (!(tLObject instanceof TLRPC.User)) {
                            if (tLObject instanceof TLRPC.Chat) {
                                org.telegram.messenger.vp.r1(vrVar4.a).g0(j10, null, (TLRPC.Chat) tLObject, false, false);
                                break;
                            }
                        } else {
                            org.telegram.messenger.vp.r1(vrVar4.a).g0(j10, (TLRPC.User) tLObject, null, false, false);
                            break;
                        }
                    }
                }
                j10 = j11;
                if (!vrVar4.Y1) {
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        boolean z10;
        vr vrVar = this.b;
        a51 G = vrVar.P1.G(i10 - 1);
        if (G == null) {
            return;
        }
        ur urVar = vrVar.c2;
        ur urVar2 = vrVar.b2;
        ur urVar3 = vrVar.a2;
        ur urVar4 = vrVar.d2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = vrVar.o2;
        int i11 = G.d;
        if (i11 == 103) {
            boolean z11 = !vrVar.h2;
            vrVar.h2 = z11;
            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
            return;
        }
        int i12 = G.a;
        if (i12 == 37) {
            int i13 = i11 >>> 24;
            int i14 = 16777215 & i11;
            if (i13 == 0) {
                urVar3.g(i14);
                return;
            }
            if (i13 == 1) {
                urVar2.g(i14);
                vrVar.g1();
                return;
            } else if (i11 == 3) {
                urVar.g(i14);
                vrVar.g1();
                return;
            } else {
                if (i13 == 2) {
                    urVar4.g(i14);
                    return;
                }
                return;
            }
        }
        if (i12 != 36 && i12 != 35) {
            if (i12 == 39) {
                if (G.t) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vrVar.getContext());
                    String L0 = org.telegram.messenger.cd.L0(2131743745, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131743744, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    x1Var.show();
                    return;
                }
                if (i11 == 2) {
                    tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                    vrVar.h1();
                } else if (i11 == 3) {
                    tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                    vrVar.h1();
                } else if (i11 == 4) {
                    tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                    vrVar.h1();
                } else if (i11 == 5) {
                    tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                    vrVar.h1();
                } else if (i11 == 0) {
                    tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                    vrVar.h1();
                }
                vrVar.P1.O(true);
                return;
            }
            if (i12 == 40) {
                vrVar.q2 = !vrVar.q2;
                vrVar.X0();
                vrVar.P1.O(true);
                vrVar.I0();
                return;
            }
            if (i11 == 100) {
                vrVar.t2 = false;
                boolean z12 = !vrVar.u2;
                vrVar.u2 = z12;
                vrVar.v2 = z12;
                vrVar.X0();
                vrVar.P1.O(true);
                vrVar.I0();
                vrVar.c1();
                return;
            }
            if (i12 == 38) {
                boolean z13 = vrVar.Y1;
                vrVar.Y1 = !z13;
                boolean[] zArr = !z13 ? vrVar.f2 : vrVar.e2;
                if (urVar4.g != 0) {
                    urVar4.e = zArr;
                    urVar4.h();
                    urVar4.i();
                }
                vrVar.P1.O(true);
                vrVar.h1();
                return;
            }
            return;
        }
        if (i11 == 0) {
            urVar3.f();
            return;
        }
        if (i11 == 1) {
            urVar2.f();
            vrVar.g1();
            return;
        }
        if (i11 == 3) {
            urVar.f();
            vrVar.g1();
            return;
        }
        if (i11 == 2) {
            urVar4.f();
            return;
        }
        if (i12 == 35) {
            if (G.t) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vrVar.getContext());
                String L02 = org.telegram.messenger.cd.L0(2131743745, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = L02;
                x1Var2.T = org.telegram.messenger.cd.L0(2131743744, null);
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                x1Var2.show();
                return;
            }
            if (i11 == 6) {
                z10 = true;
                tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                vrVar.h1();
            } else {
                z10 = true;
                if (i11 == 7) {
                    tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                    vrVar.h1();
                } else if (i11 == 9) {
                    tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                    vrVar.h1();
                } else if (i11 == 8) {
                    tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                    vrVar.h1();
                } else if (i11 == 11) {
                    tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                    vrVar.h1();
                } else if (i11 == 10) {
                    tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                    vrVar.h1();
                } else if (i11 == 15) {
                    tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                    vrVar.h1();
                } else {
                    if (i11 == 12) {
                        boolean z14 = !tL_chatBannedRights.send_stickers;
                        tL_chatBannedRights.send_inline = z14;
                        tL_chatBannedRights.send_gifs = z14;
                        tL_chatBannedRights.send_games = z14;
                        tL_chatBannedRights.send_stickers = z14;
                        vrVar.h1();
                    } else if (i11 == 14) {
                        if (tL_chatBannedRights.send_plain || vrVar.n2.send_plain) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= vrVar.P1.D.size()) {
                                    break;
                                }
                                a51 G2 = vrVar.P1.G(i15);
                                if (G2.a == 39 && G2.d == 0) {
                                    s4.c1 K = vrVar.k1.K(i15 + 1);
                                    if (K != null) {
                                        View view2 = K.a;
                                        float f11 = -vrVar.x2;
                                        vrVar.x2 = f11;
                                        org.telegram.messenger.i0.F3(f11, view2, null);
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            org.telegram.messenger.t2.D.a();
                            return;
                        }
                        tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                        vrVar.h1();
                    } else if (i11 == 13) {
                        z10 = true;
                        tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                        vrVar.h1();
                    } else {
                        z10 = true;
                        if (i11 == 101) {
                            vrVar.u2 = !vrVar.u2;
                            vrVar.c1();
                        } else if (i11 == 102) {
                            vrVar.v2 = !vrVar.v2;
                            vrVar.c1();
                        }
                    }
                    z10 = true;
                }
            }
            vrVar.P1.O(z10);
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        switch (this.a) {
            case 5:
                vr vrVar = this.b;
                vrVar.getClass();
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.un.ha(j10));
                }
                vrVar.dismiss();
                break;
            default:
                vr vrVar2 = this.b;
                vrVar2.getClass();
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.un.ha(j10));
                }
                vrVar2.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
