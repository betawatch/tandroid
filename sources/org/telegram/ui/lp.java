package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ mp e;

    public lp(mp mpVar, Context context) {
        this.e = mpVar;
        if (mpVar.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        TLRPC.Chat chat;
        int i7 = e1Var.f;
        mp mpVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = mpVar.Q;
        int i10 = mpVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = mpVar.O;
        if (!mpVar.x.creator || ((i10 != 0 && (i10 != 2 || !mpVar.L)) || i7 != 4 || e1Var.b() != mpVar.f0)) {
            if (!mpVar.J) {
                return false;
            }
            if ((i10 == 0 || i10 == 2) && i7 == 4) {
                int b10 = e1Var.b();
                if (b10 == mpVar.X) {
                    if (!tL_chatAdminRights.add_admins && ((chat = mpVar.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i10 == 2 && !mpVar.L) {
                        return false;
                    }
                    if (b10 == mpVar.Y) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !mpVar.F) {
                            return false;
                        }
                    } else {
                        if (b10 == mpVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == mpVar.a0) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == mpVar.b0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == mpVar.c0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == mpVar.d0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == mpVar.L0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == mpVar.e0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == mpVar.f0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == mpVar.g0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == mpVar.h0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == mpVar.i0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == mpVar.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == mpVar.n0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == mpVar.V0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == mpVar.W0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == mpVar.X0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == mpVar.o0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i7 == 3 || i7 == 1 || i7 == 5 || i7 == 8 || i7 == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.W;
    }

    @Override // v4.h0
    public final long c(int i7) {
        mp mpVar = this.e;
        if (mpVar.E != 2) {
            return -1L;
        }
        if (i7 == mpVar.X) {
            return 1L;
        }
        if (i7 == mpVar.Y) {
            return 2L;
        }
        if (i7 == mpVar.Z) {
            return 3L;
        }
        if (i7 == mpVar.c0) {
            return 4L;
        }
        if (i7 == mpVar.d0) {
            return 5L;
        }
        if (i7 == mpVar.e0) {
            return 6L;
        }
        if (i7 == mpVar.f0) {
            return 7L;
        }
        if (i7 == mpVar.g0) {
            return 8L;
        }
        if (i7 == mpVar.h0) {
            return 9L;
        }
        if (i7 == mpVar.i0) {
            return 10L;
        }
        if (i7 == mpVar.p0) {
            return 11L;
        }
        if (i7 == mpVar.q0) {
            return 12L;
        }
        if (i7 == mpVar.r0) {
            return 13L;
        }
        if (i7 == mpVar.s0) {
            return 14L;
        }
        if (i7 == mpVar.t0) {
            return 15L;
        }
        if (i7 == mpVar.u0) {
            return 16L;
        }
        if (i7 == mpVar.v0) {
            return 17L;
        }
        if (i7 == mpVar.w0) {
            return 18L;
        }
        if (i7 == mpVar.x0) {
            return 19L;
        }
        if (i7 == mpVar.z0) {
            return 20L;
        }
        if (i7 == mpVar.C0) {
            return 21L;
        }
        if (i7 == mpVar.I0) {
            return 22L;
        }
        if (i7 == mpVar.J0) {
            return 23L;
        }
        if (i7 == mpVar.K0) {
            return 24L;
        }
        if (i7 == mpVar.L0) {
            return 25L;
        }
        if (i7 == mpVar.M0) {
            return 26L;
        }
        if (i7 == mpVar.N0) {
            return 27L;
        }
        if (i7 == mpVar.y0) {
            return 28L;
        }
        if (i7 == mpVar.n0) {
            return 29L;
        }
        if (i7 == mpVar.D0) {
            return 30L;
        }
        if (i7 == mpVar.F0) {
            return 31L;
        }
        if (i7 == mpVar.E0) {
            return 32L;
        }
        if (i7 == mpVar.G0) {
            return 33L;
        }
        if (i7 == mpVar.H0) {
            return 34L;
        }
        if (i7 == mpVar.A0) {
            return 35L;
        }
        if (i7 == mpVar.O0) {
            return 36L;
        }
        if (i7 == mpVar.Q0) {
            return 37L;
        }
        if (i7 == mpVar.R0) {
            return 38L;
        }
        if (i7 == mpVar.S0) {
            return 39L;
        }
        if (i7 == mpVar.T0) {
            return 40L;
        }
        if (i7 == mpVar.V0) {
            return 41L;
        }
        if (i7 == mpVar.W0) {
            return 42L;
        }
        if (i7 == mpVar.X0) {
            return 43L;
        }
        if (i7 == mpVar.a0) {
            return 44L;
        }
        if (i7 == mpVar.j0) {
            return 45L;
        }
        if (i7 == mpVar.k0) {
            return 46L;
        }
        if (i7 == mpVar.l0) {
            return 47L;
        }
        if (i7 == mpVar.m0) {
            return 48L;
        }
        if (i7 == mpVar.o0) {
            return 49L;
        }
        return i7 == mpVar.b0 ? 50L : 0L;
    }

    @Override // v4.h0
    public final int d(int i7) {
        mp mpVar = this.e;
        if (i7 == mpVar.I0 || i7 == mpVar.K0 || i7 == mpVar.J0 || i7 == mpVar.C0 || i7 == mpVar.D0 || i7 == mpVar.F0 || i7 == mpVar.E0 || i7 == mpVar.H0 || i7 == mpVar.G0 || i7 == mpVar.k0 || i7 == mpVar.Q0 || i7 == mpVar.R0 || i7 == mpVar.S0 || i7 == mpVar.V0 || i7 == mpVar.W0 || i7 == mpVar.X0) {
            return 10;
        }
        if (i7 == mpVar.A0 || i7 == mpVar.O0 || i7 == mpVar.T0) {
            return 9;
        }
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1 || i7 == mpVar.p0 || i7 == mpVar.r0 || i7 == mpVar.M0 || i7 == mpVar.t0) {
            return 5;
        }
        if (i7 == 2 || i7 == mpVar.v0) {
            return 3;
        }
        if (i7 == mpVar.Y || i7 == mpVar.Z || i7 == mpVar.a0 || i7 == mpVar.c0 || i7 == mpVar.d0 || i7 == mpVar.e0 || i7 == mpVar.g0 || i7 == mpVar.h0 || i7 == mpVar.i0 || i7 == mpVar.j0 || i7 == mpVar.z0 || i7 == mpVar.f0 || i7 == mpVar.L0 || i7 == mpVar.X || i7 == mpVar.n0 || i7 == mpVar.l0 || i7 == mpVar.o0 || i7 == mpVar.b0) {
            return 4;
        }
        if (i7 == mpVar.s0 || i7 == mpVar.x0 || i7 == mpVar.m0) {
            return 1;
        }
        if (i7 == mpVar.N0) {
            return 6;
        }
        if (i7 == mpVar.w0) {
            return 11;
        }
        return i7 == mpVar.y0 ? 8 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x0a7d, code lost:
    
        if (r2.view_messages == false) goto L783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x053d, code lost:
    
        if (r6.change_info == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0990, code lost:
    
        if (r6.pin_messages == false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0a9e, code lost:
    
        if (r2.bot != false) goto L802;
     */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0b9b  */
    /* JADX WARN: Type inference failed for: r4v118, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v148, types: [boolean, int] */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        String L0;
        int i11;
        TLRPC.User user3;
        String Z;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        TLRPC.User user4;
        int i15;
        int i16;
        TLRPC.User user5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        int i17;
        boolean z11;
        int i18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i19;
        int i20;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights6;
        int i21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights7;
        boolean z13;
        int i22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights4;
        int i23;
        int i24;
        TLRPC.TL_chatBannedRights tL_chatBannedRights8;
        boolean z14;
        TLRPC.TL_chatBannedRights tL_chatBannedRights9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights10;
        int i25;
        int i26;
        int i27;
        boolean z15;
        TLRPC.TL_chatAdminRights tL_chatAdminRights5;
        TLRPC.TL_chatAdminRights tL_chatAdminRights6;
        TLRPC.TL_chatBannedRights tL_chatBannedRights11;
        boolean z16;
        TLRPC.TL_chatBannedRights tL_chatBannedRights12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights13;
        TLRPC.Chat chat2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights7;
        TLRPC.TL_chatAdminRights tL_chatAdminRights8;
        int i28;
        int i29;
        int i30;
        boolean z17;
        TLRPC.TL_chatAdminRights tL_chatAdminRights9;
        TLRPC.TL_chatAdminRights tL_chatAdminRights10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights14;
        boolean z18;
        TLRPC.TL_chatBannedRights tL_chatBannedRights15;
        TLRPC.TL_chatBannedRights tL_chatBannedRights16;
        boolean z19;
        TLRPC.TL_chatAdminRights tL_chatAdminRights11;
        boolean z20;
        int i31;
        TLRPC.TL_chatAdminRights tL_chatAdminRights12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights13;
        boolean z21;
        int i32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights15;
        boolean z22;
        int i33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights17;
        boolean z23;
        int i34;
        TLRPC.User user6;
        TLRPC.User user7;
        boolean z24;
        int i35;
        TLRPC.TL_chatAdminRights tL_chatAdminRights18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights19;
        boolean z25;
        int i36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights21;
        boolean z26;
        TLRPC.TL_chatAdminRights tL_chatAdminRights22;
        int i37;
        TLRPC.TL_chatAdminRights tL_chatAdminRights23;
        boolean z27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights24;
        boolean z28;
        int i38;
        TLRPC.TL_chatAdminRights tL_chatAdminRights25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights26;
        boolean z29;
        int i39;
        TLRPC.TL_chatAdminRights tL_chatAdminRights27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights28;
        TLRPC.User user8;
        boolean z30;
        TLRPC.TL_chatAdminRights tL_chatAdminRights29;
        int i40;
        TLRPC.TL_chatAdminRights tL_chatAdminRights30;
        boolean z31;
        TLRPC.TL_chatAdminRights tL_chatAdminRights31;
        boolean z32;
        int i41;
        TLRPC.TL_chatAdminRights tL_chatAdminRights32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights33;
        int i42;
        TLRPC.TL_chatBannedRights tL_chatBannedRights17;
        boolean z33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights34;
        boolean z34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights35;
        int i43;
        TLRPC.TL_chatAdminRights tL_chatAdminRights36;
        boolean z35;
        TLRPC.TL_chatAdminRights tL_chatAdminRights37;
        int i44;
        int i45;
        TLRPC.TL_chatBannedRights tL_chatBannedRights18;
        boolean z36;
        TLRPC.TL_chatBannedRights tL_chatBannedRights19;
        TLRPC.TL_chatBannedRights tL_chatBannedRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights38;
        int i46;
        TLRPC.TL_chatBannedRights tL_chatBannedRights21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights22;
        mp mpVar = this.e;
        int i47 = mpVar.E;
        boolean z37 = mpVar.V;
        boolean z38 = mpVar.G;
        boolean z39 = mpVar.F;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = mpVar.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = mpVar.Q;
        int i48 = e1Var.f;
        View view = e1Var.a;
        switch (i48) {
            case 0:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                i10 = mpVar.E;
                String L02 = i10 == 2 ? org.telegram.messenger.hd.L0(2131753156) : null;
                user = mpVar.w;
                oaVar.a(L02, user);
                break;
            case 1:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == mpVar.m0) {
                    y8Var.setText(org.telegram.messenger.hd.L0(2131751309));
                    break;
                } else if (i7 == mpVar.s0) {
                    y8Var.setText(org.telegram.messenger.hd.L0(2131751325));
                    break;
                } else if (i7 == mpVar.x0) {
                    user2 = mpVar.w;
                    if (org.telegram.messenger.q10.B(user2)) {
                        chat = mpVar.x;
                        if (chat.creator) {
                            L0 = org.telegram.messenger.hd.L0(2131752423);
                            i11 = mpVar.E;
                            if (i11 != 0) {
                                Z = org.telegram.messenger.hd.Z(2131751306, L0);
                            } else {
                                user3 = mpVar.w;
                                Z = org.telegram.messenger.hd.Z(2131751276, org.telegram.messenger.q10.p(user3));
                            }
                            y8Var.setText(Z);
                            break;
                        }
                    }
                    L0 = org.telegram.messenger.hd.L0(2131752520);
                    i11 = mpVar.E;
                    if (i11 != 0) {
                    }
                    y8Var.setText(Z);
                }
                break;
            case 2:
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                if (i7 != mpVar.q0) {
                    if (i7 == mpVar.u0) {
                        TextView textView = v9Var.getTextView();
                        int i49 = org.telegram.ui.ActionBar.j6.G6;
                        org.telegram.ui.ActionBar.q6.U(textView, i49, null);
                        v9Var.setTag(Integer.valueOf(i49));
                        if (!z39) {
                            v9Var.b(org.telegram.messenger.hd.L0(2131751315), false);
                            break;
                        } else {
                            v9Var.b(org.telegram.messenger.hd.L0(2131751322), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = v9Var.getTextView();
                    int i50 = org.telegram.ui.ActionBar.j6.p7;
                    org.telegram.ui.ActionBar.q6.U(textView2, i50, null);
                    v9Var.setTag(Integer.valueOf(i50));
                    i12 = mpVar.E;
                    if (i12 != 0) {
                        i13 = mpVar.E;
                        if (i13 == 1) {
                            v9Var.b(org.telegram.messenger.hd.L0(2131743724), false);
                            break;
                        }
                    } else {
                        v9Var.b(org.telegram.messenger.hd.L0(2131751305), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != 2) {
                    if (i7 == mpVar.v0) {
                        n4Var.setText(org.telegram.messenger.hd.L0(2131751307));
                        break;
                    }
                } else {
                    i14 = mpVar.E;
                    if (i14 != 2) {
                        user4 = mpVar.w;
                        if (user4 != null) {
                            user5 = mpVar.w;
                            break;
                        }
                        i15 = mpVar.E;
                        if (i15 != 0) {
                            i16 = mpVar.E;
                            if (i16 == 1) {
                                n4Var.setText(org.telegram.messenger.hd.L0(2131743723));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.hd.L0(2131751289));
                            break;
                        }
                    }
                    n4Var.setText(org.telegram.messenger.hd.L0(2131752989));
                    break;
                }
                break;
            case 4:
            case 9:
                boolean z40 = true;
                final org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                boolean z41 = i47 != 2 || mpVar.L;
                TLRPC.Chat chat3 = mpVar.x;
                boolean z42 = chat3 != null && chat3.creator;
                if (i7 == mpVar.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = mpVar.Q;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = mpVar.P;
                    int i51 = (tL_chatBannedRights25.send_photos || tL_chatBannedRights24.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights25.send_videos && !tL_chatBannedRights24.send_videos) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_stickers && !tL_chatBannedRights24.send_stickers) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_audios && !tL_chatBannedRights24.send_audios) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_docs && !tL_chatBannedRights24.send_docs) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_voices && !tL_chatBannedRights24.send_voices) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_roundvideos && !tL_chatBannedRights24.send_roundvideos) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.embed_links && !tL_chatBannedRights24.embed_links && !tL_chatBannedRights25.send_plain && !tL_chatBannedRights24.send_plain) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_polls && !tL_chatBannedRights24.send_polls) {
                        i51++;
                    }
                    if (!tL_chatBannedRights25.send_reactions && !tL_chatBannedRights24.send_reactions) {
                        i51++;
                    }
                    p8Var.d(org.telegram.messenger.hd.M0(2131743690, null), i51 > 0, true, true);
                    Locale locale = Locale.US;
                    p8Var.a(new Runnable(this) { // from class: org.telegram.ui.kp
                        public final /* synthetic */ lp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i52 = r3;
                            org.telegram.ui.Cells.p8 p8Var2 = p8Var;
                            lp lpVar = this.b;
                            switch (i52) {
                                case 0:
                                    mp mpVar2 = lpVar.e;
                                    if (p8Var2.isEnabled()) {
                                        if (!mp.q0(mpVar2)) {
                                            boolean z43 = p8Var2.d.h;
                                            p8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar2.P;
                                            tL_chatBannedRights26.send_media = z43;
                                            tL_chatBannedRights26.send_photos = z43;
                                            tL_chatBannedRights26.send_videos = z43;
                                            tL_chatBannedRights26.send_stickers = z43;
                                            tL_chatBannedRights26.send_gifs = z43;
                                            tL_chatBannedRights26.send_games = z43;
                                            tL_chatBannedRights26.send_inline = z43;
                                            tL_chatBannedRights26.send_audios = z43;
                                            tL_chatBannedRights26.send_docs = z43;
                                            tL_chatBannedRights26.send_voices = z43;
                                            tL_chatBannedRights26.send_roundvideos = z43;
                                            tL_chatBannedRights26.embed_links = z43;
                                            tL_chatBannedRights26.send_polls = z43;
                                            tL_chatBannedRights26.send_reactions = z43;
                                            org.telegram.messenger.g0.a4(mpVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar2.getParentActivity());
                                            String M0 = org.telegram.messenger.hd.M0(2131743719, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                            t1Var.S = M0;
                                            t1Var.U = org.telegram.messenger.hd.M0(2131743717, null);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                            t1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (p8Var2.isEnabled()) {
                                        boolean z44 = p8Var2.d.h;
                                        p8Var2.setChecked(z44);
                                        mp mpVar3 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = mpVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        org.telegram.messenger.g0.a4(mpVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (p8Var2.isEnabled()) {
                                        boolean z46 = p8Var2.d.h;
                                        p8Var2.setChecked(z46);
                                        mp mpVar4 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = mpVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.g0.a4(mpVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.gms.internal.vision.e2.i(i51, "/10"), !mpVar.B0);
                    p8Var.setIcon(mp.q0(mpVar) ? R.drawable.permission_locked : 0);
                } else if (i7 == mpVar.O0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i52 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i52 = r42 + 1;
                    }
                    int i53 = i52;
                    if (tL_chatAdminRights39.delete_messages) {
                        i53 = i52 + 1;
                    }
                    p8Var.d(org.telegram.messenger.hd.M0(2131752382, null), i53 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final int i54 = 1;
                    p8Var.a(new Runnable(this) { // from class: org.telegram.ui.kp
                        public final /* synthetic */ lp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i522 = i54;
                            org.telegram.ui.Cells.p8 p8Var2 = p8Var;
                            lp lpVar = this.b;
                            switch (i522) {
                                case 0:
                                    mp mpVar2 = lpVar.e;
                                    if (p8Var2.isEnabled()) {
                                        if (!mp.q0(mpVar2)) {
                                            boolean z43 = p8Var2.d.h;
                                            p8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar2.P;
                                            tL_chatBannedRights26.send_media = z43;
                                            tL_chatBannedRights26.send_photos = z43;
                                            tL_chatBannedRights26.send_videos = z43;
                                            tL_chatBannedRights26.send_stickers = z43;
                                            tL_chatBannedRights26.send_gifs = z43;
                                            tL_chatBannedRights26.send_games = z43;
                                            tL_chatBannedRights26.send_inline = z43;
                                            tL_chatBannedRights26.send_audios = z43;
                                            tL_chatBannedRights26.send_docs = z43;
                                            tL_chatBannedRights26.send_voices = z43;
                                            tL_chatBannedRights26.send_roundvideos = z43;
                                            tL_chatBannedRights26.embed_links = z43;
                                            tL_chatBannedRights26.send_polls = z43;
                                            tL_chatBannedRights26.send_reactions = z43;
                                            org.telegram.messenger.g0.a4(mpVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar2.getParentActivity());
                                            String M0 = org.telegram.messenger.hd.M0(2131743719, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                            t1Var.S = M0;
                                            t1Var.U = org.telegram.messenger.hd.M0(2131743717, null);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                            t1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (p8Var2.isEnabled()) {
                                        boolean z44 = p8Var2.d.h;
                                        p8Var2.setChecked(z44);
                                        mp mpVar3 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = mpVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        org.telegram.messenger.g0.a4(mpVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (p8Var2.isEnabled()) {
                                        boolean z46 = p8Var2.d.h;
                                        p8Var2.setChecked(z46);
                                        mp mpVar4 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = mpVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.g0.a4(mpVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.gms.internal.vision.e2.i(i53, "/3"), !mpVar.P0);
                } else if (i7 == mpVar.T0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = mpVar.N;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i55 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i55 = r52 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights40.delete_stories) {
                        i56 = i55 + 1;
                    }
                    p8Var.d(org.telegram.messenger.hd.L0(2131752381), i56 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final int i57 = 2;
                    p8Var.a(new Runnable(this) { // from class: org.telegram.ui.kp
                        public final /* synthetic */ lp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i522 = i57;
                            org.telegram.ui.Cells.p8 p8Var2 = p8Var;
                            lp lpVar = this.b;
                            switch (i522) {
                                case 0:
                                    mp mpVar2 = lpVar.e;
                                    if (p8Var2.isEnabled()) {
                                        if (!mp.q0(mpVar2)) {
                                            boolean z43 = p8Var2.d.h;
                                            p8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar2.P;
                                            tL_chatBannedRights26.send_media = z43;
                                            tL_chatBannedRights26.send_photos = z43;
                                            tL_chatBannedRights26.send_videos = z43;
                                            tL_chatBannedRights26.send_stickers = z43;
                                            tL_chatBannedRights26.send_gifs = z43;
                                            tL_chatBannedRights26.send_games = z43;
                                            tL_chatBannedRights26.send_inline = z43;
                                            tL_chatBannedRights26.send_audios = z43;
                                            tL_chatBannedRights26.send_docs = z43;
                                            tL_chatBannedRights26.send_voices = z43;
                                            tL_chatBannedRights26.send_roundvideos = z43;
                                            tL_chatBannedRights26.embed_links = z43;
                                            tL_chatBannedRights26.send_polls = z43;
                                            tL_chatBannedRights26.send_reactions = z43;
                                            org.telegram.messenger.g0.a4(mpVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar2.getParentActivity());
                                            String M0 = org.telegram.messenger.hd.M0(2131743719, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                            t1Var.S = M0;
                                            t1Var.U = org.telegram.messenger.hd.M0(2131743717, null);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                            t1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (p8Var2.isEnabled()) {
                                        boolean z44 = p8Var2.d.h;
                                        p8Var2.setChecked(z44);
                                        mp mpVar3 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = mpVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        org.telegram.messenger.g0.a4(mpVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (p8Var2.isEnabled()) {
                                        boolean z46 = p8Var2.d.h;
                                        p8Var2.setChecked(z46);
                                        mp mpVar4 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = mpVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.g0.a4(mpVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.gms.internal.vision.e2.i(i56, "/3"), !mpVar.U0);
                } else if (i7 == mpVar.X) {
                    p8Var.c(org.telegram.messenger.hd.L0(2131748696), mpVar.L, true);
                    tL_chatAdminRights38 = mpVar.O;
                    p8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i7 == mpVar.Y) {
                    i42 = mpVar.E;
                    if (i42 != 0) {
                        i44 = mpVar.E;
                        if (i44 != 2) {
                            i45 = mpVar.E;
                            if (i45 == 1) {
                                String L03 = org.telegram.messenger.hd.L0(z38 ? 2131751967 : 2131743716);
                                tL_chatBannedRights18 = mpVar.P;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = mpVar.Q;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        p8Var.c(L03, z36, mpVar.n0 == -1);
                                        tL_chatBannedRights19 = mpVar.Q;
                                        p8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                p8Var.c(L03, z36, mpVar.n0 == -1);
                                tL_chatBannedRights19 = mpVar.Q;
                                p8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String L04 = org.telegram.messenger.hd.L0(2131751967);
                        if (z41) {
                            tL_chatAdminRights37 = mpVar.N;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                p8Var.c(L04, z35, true);
                            }
                        }
                        z35 = false;
                        p8Var.c(L04, z35, true);
                    } else if (z39) {
                        String L05 = org.telegram.messenger.hd.L0(2131751324);
                        if (z41) {
                            tL_chatAdminRights35 = mpVar.N;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                p8Var.c(L05, z34, true);
                            }
                        }
                        z34 = false;
                        p8Var.c(L05, z34, true);
                    } else {
                        String L06 = org.telegram.messenger.hd.L0(2131751323);
                        if (z41) {
                            tL_chatAdminRights34 = mpVar.N;
                            break;
                        }
                        tL_chatBannedRights17 = mpVar.Q;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            p8Var.c(L06, z33, true);
                        }
                        z33 = true;
                        p8Var.c(L06, z33, true);
                    }
                    i43 = mpVar.E;
                    if (i43 == 2) {
                        tL_chatAdminRights36 = mpVar.O;
                        p8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == mpVar.Z) {
                    String L07 = org.telegram.messenger.hd.L0(2131751312);
                    if (z41) {
                        tL_chatAdminRights33 = mpVar.N;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            p8Var.c(L07, z32, true);
                            i41 = mpVar.E;
                            if (i41 == 2) {
                                tL_chatAdminRights32 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    p8Var.c(L07, z32, true);
                    i41 = mpVar.E;
                    if (i41 == 2) {
                    }
                } else if (i7 == mpVar.b0) {
                    user8 = mpVar.w;
                    if (org.telegram.messenger.q10.t(user8)) {
                        String L08 = org.telegram.messenger.hd.L0(z39 ? 2131751327 : 2131751326);
                        if (z41) {
                            tL_chatAdminRights31 = mpVar.N;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                p8Var.c(L08, z31, true);
                            }
                        }
                        z31 = false;
                        p8Var.c(L08, z31, true);
                    } else {
                        String L09 = org.telegram.messenger.hd.L0(2131751290);
                        if (z41) {
                            tL_chatAdminRights29 = mpVar.N;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                p8Var.c(L09, z30, true);
                            }
                        }
                        z30 = false;
                        p8Var.c(L09, z30, true);
                    }
                    i40 = mpVar.E;
                    if (i40 == 2) {
                        tL_chatAdminRights30 = mpVar.O;
                        p8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == mpVar.a0) {
                    String L010 = org.telegram.messenger.hd.L0(2131751314);
                    if (z41) {
                        tL_chatAdminRights28 = mpVar.N;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            p8Var.c(L010, z29, true);
                            i39 = mpVar.E;
                            if (i39 == 2) {
                                tL_chatAdminRights27 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    p8Var.c(L010, z29, true);
                    i39 = mpVar.E;
                    if (i39 == 2) {
                    }
                } else if (i7 == mpVar.c0) {
                    String L011 = org.telegram.messenger.hd.L0(2131751319);
                    if (z41) {
                        tL_chatAdminRights26 = mpVar.N;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            p8Var.c(L011, z28, true);
                            i38 = mpVar.E;
                            if (i38 == 2) {
                                tL_chatAdminRights25 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    p8Var.c(L011, z28, true);
                    i38 = mpVar.E;
                    if (i38 == 2) {
                    }
                } else if (i7 == mpVar.d0) {
                    if (z39) {
                        String L012 = org.telegram.messenger.hd.L0(2131751321);
                        if (z41) {
                            tL_chatAdminRights24 = mpVar.N;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                p8Var.c(L012, z27, true);
                            }
                        }
                        z27 = false;
                        p8Var.c(L012, z27, true);
                    } else {
                        String L013 = org.telegram.messenger.hd.L0(2131751316);
                        if (z41) {
                            tL_chatAdminRights22 = mpVar.N;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                p8Var.c(L013, z26, true);
                            }
                        }
                        z26 = false;
                        p8Var.c(L013, z26, true);
                    }
                    i37 = mpVar.E;
                    if (i37 == 2) {
                        tL_chatAdminRights23 = mpVar.O;
                        p8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == mpVar.e0) {
                    String L014 = org.telegram.messenger.hd.L0(2131751331);
                    if (z41) {
                        tL_chatAdminRights21 = mpVar.N;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            p8Var.c(L014, z25, (mpVar.g0 == -1 && z39) || mpVar.f0 != -1);
                            i36 = mpVar.E;
                            if (i36 == 2) {
                                tL_chatAdminRights20 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    p8Var.c(L014, z25, (mpVar.g0 == -1 && z39) || mpVar.f0 != -1);
                    i36 = mpVar.E;
                    if (i36 == 2) {
                    }
                } else if (i7 == mpVar.f0) {
                    String L015 = org.telegram.messenger.hd.L0(2131751303);
                    if (z41) {
                        tL_chatAdminRights19 = mpVar.N;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            p8Var.c(L015, z24, mpVar.n0 == -1 || z37);
                            i35 = mpVar.E;
                            if (i35 == 2) {
                                tL_chatAdminRights18 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    p8Var.c(L015, z24, mpVar.n0 == -1 || z37);
                    i35 = mpVar.E;
                    if (i35 == 2) {
                    }
                } else if (i7 == mpVar.l0) {
                    String L016 = org.telegram.messenger.hd.L0(2131751310);
                    if (mpVar.y != null) {
                        user6 = mpVar.w;
                        if (user6 != null) {
                            long j3 = mpVar.r ? mpVar.n : mpVar.y.guard_bot_id;
                            user7 = mpVar.w;
                            if (j3 == user7.id) {
                                z23 = true;
                                p8Var.c(L016, z23, false);
                                i34 = mpVar.E;
                                if (i34 == 2) {
                                    p8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    p8Var.c(L016, z23, false);
                    i34 = mpVar.E;
                    if (i34 == 2) {
                    }
                } else if (i7 == mpVar.g0) {
                    String L017 = org.telegram.messenger.hd.L0(z38 ? 2131751968 : 2131751328);
                    if (z41) {
                        tL_chatAdminRights17 = mpVar.N;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            p8Var.c(L017, z22, !z38);
                            i33 = mpVar.E;
                            if (i33 == 2) {
                                tL_chatAdminRights16 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    p8Var.c(L017, z22, !z38);
                    i33 = mpVar.E;
                    if (i33 == 2) {
                    }
                } else if (i7 == mpVar.o0) {
                    String L018 = org.telegram.messenger.hd.L0(2131751966);
                    if (z41) {
                        tL_chatAdminRights15 = mpVar.N;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            p8Var.c(L018, z21, true);
                            i32 = mpVar.E;
                            if (i32 == 2) {
                                tL_chatAdminRights14 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    p8Var.c(L018, z21, true);
                    i32 = mpVar.E;
                    if (i32 == 2) {
                    }
                } else if (i7 == mpVar.L0) {
                    String L019 = org.telegram.messenger.hd.L0(2131744901);
                    if (z41) {
                        tL_chatAdminRights13 = mpVar.N;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            p8Var.c(L019, z20, true);
                            i31 = mpVar.E;
                            if (i31 == 2) {
                                tL_chatAdminRights12 = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    p8Var.c(L019, z20, true);
                    i31 = mpVar.E;
                    if (i31 == 2) {
                    }
                } else if (i7 == mpVar.n0) {
                    i28 = mpVar.E;
                    if (i28 == 0) {
                        String L020 = org.telegram.messenger.hd.L0(2131748692);
                        if (z41) {
                            tL_chatAdminRights11 = mpVar.N;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                p8Var.c(L020, z19, z37);
                            }
                        }
                        z19 = false;
                        p8Var.c(L020, z19, z37);
                    } else {
                        i29 = mpVar.E;
                        if (i29 == 1) {
                            String L021 = org.telegram.messenger.hd.L0(2131751700);
                            tL_chatBannedRights14 = mpVar.P;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = mpVar.Q;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    p8Var.c(L021, z18, z37);
                                    tL_chatBannedRights15 = mpVar.Q;
                                    p8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            p8Var.c(L021, z18, z37);
                            tL_chatBannedRights15 = mpVar.Q;
                            p8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i30 = mpVar.E;
                            if (i30 == 2) {
                                String L022 = org.telegram.messenger.hd.L0(2131748692);
                                if (z41) {
                                    tL_chatAdminRights10 = mpVar.N;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        p8Var.c(L022, z17, z37);
                                        tL_chatAdminRights9 = mpVar.O;
                                        p8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                p8Var.c(L022, z17, z37);
                                tL_chatAdminRights9 = mpVar.O;
                                p8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i7 == mpVar.h0) {
                    i25 = mpVar.E;
                    if (i25 == 0) {
                        chat2 = mpVar.x;
                        if (org.telegram.messenger.t3.P(3, chat2)) {
                            String L023 = org.telegram.messenger.hd.L0(2131751330);
                            tL_chatAdminRights8 = mpVar.N;
                            p8Var.c(L023, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String L024 = org.telegram.messenger.hd.L0(2131751329);
                            tL_chatAdminRights7 = mpVar.N;
                            p8Var.c(L024, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i26 = mpVar.E;
                        if (i26 == 1) {
                            String L025 = org.telegram.messenger.hd.L0(2131743711);
                            tL_chatBannedRights11 = mpVar.P;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = mpVar.Q;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    p8Var.c(L025, z16, true);
                                    tL_chatBannedRights12 = mpVar.Q;
                                    p8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            p8Var.c(L025, z16, true);
                            tL_chatBannedRights12 = mpVar.Q;
                            p8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i27 = mpVar.E;
                            if (i27 == 2) {
                                String L026 = org.telegram.messenger.hd.L0(2131751329);
                                if (z41) {
                                    tL_chatAdminRights6 = mpVar.N;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        p8Var.c(L026, z15, true);
                                        tL_chatAdminRights5 = mpVar.O;
                                        p8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                p8Var.c(L026, z15, true);
                                tL_chatAdminRights5 = mpVar.O;
                                p8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i7 == mpVar.i0) {
                    i21 = mpVar.E;
                    if (i21 != 0) {
                        i23 = mpVar.E;
                        if (i23 != 2) {
                            i24 = mpVar.E;
                            if (i24 == 1) {
                                String L027 = org.telegram.messenger.hd.L0(2131743692);
                                tL_chatBannedRights8 = mpVar.P;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = mpVar.Q;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        p8Var.c(L027, z14, true);
                                        tL_chatBannedRights9 = mpVar.Q;
                                        p8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                p8Var.c(L027, z14, true);
                                tL_chatBannedRights9 = mpVar.Q;
                                p8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String L028 = org.telegram.messenger.hd.L0(2131751313);
                    if (z41) {
                        tL_chatAdminRights4 = mpVar.N;
                        break;
                    }
                    tL_chatBannedRights7 = mpVar.Q;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        p8Var.c(L028, z13, true);
                        i22 = mpVar.E;
                        if (i22 == 2) {
                            tL_chatAdminRights3 = mpVar.O;
                            p8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    p8Var.c(L028, z13, true);
                    i22 = mpVar.E;
                    if (i22 == 2) {
                    }
                } else if (i7 == mpVar.j0) {
                    i17 = mpVar.E;
                    if (i17 != 0) {
                        i19 = mpVar.E;
                        if (i19 != 2) {
                            i20 = mpVar.E;
                            if (i20 == 1) {
                                String L029 = org.telegram.messenger.hd.L0(2131743713);
                                tL_chatBannedRights4 = mpVar.P;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = mpVar.Q;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        p8Var.c(L029, z12, true);
                                        tL_chatBannedRights5 = mpVar.Q;
                                        p8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                p8Var.c(L029, z12, true);
                                tL_chatBannedRights5 = mpVar.Q;
                                p8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String L030 = org.telegram.messenger.hd.L0(2131751317);
                    if (z41) {
                        tL_chatAdminRights2 = mpVar.N;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            p8Var.c(L030, z11, true);
                            i18 = mpVar.E;
                            if (i18 == 2) {
                                tL_chatAdminRights = mpVar.O;
                                p8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    p8Var.c(L030, z11, true);
                    i18 = mpVar.E;
                    if (i18 == 2) {
                    }
                } else if (i7 == mpVar.z0) {
                    String L031 = org.telegram.messenger.hd.L0(2131743691);
                    tL_chatBannedRights = mpVar.P;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = mpVar.Q;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            p8Var.c(L031, z10, true);
                            tL_chatBannedRights2 = mpVar.Q;
                            p8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    p8Var.c(L031, z10, true);
                    tL_chatBannedRights2 = mpVar.Q;
                    p8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i46 = mpVar.E;
                if (i46 != 2 && i7 == mpVar.z0) {
                    tL_chatBannedRights21 = mpVar.P;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = mpVar.Q;
                        break;
                    }
                    z40 = false;
                    p8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                if (i47 != 2 || (i7 != mpVar.p0 && i7 != mpVar.x0)) {
                    x6Var.setAlpha(1.0f);
                    break;
                } else {
                    x6Var.setAlpha(mpVar.K);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                if (i7 == mpVar.N0) {
                    int i58 = mpVar.P.until_date;
                    w8Var.c(org.telegram.messenger.hd.M0(2131743714, null), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? org.telegram.messenger.hd.M0(2131743684, null) : org.telegram.messenger.hd.v(mpVar.P.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                String M0 = (org.telegram.messenger.q10.B(mpVar.w) && mpVar.x.creator) ? org.telegram.messenger.hd.M0(2131752423, null) : org.telegram.messenger.hd.M0(2131752520, null);
                this.d = true;
                z5Var.getTextView().setEnabled(mpVar.J || mpVar.x.creator);
                z5Var.getTextView().setSingleLine(true);
                z5Var.getTextView().setImeOptions(6);
                z5Var.o(mpVar.T, M0, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                boolean z43 = c2Var.getTag() != null && ((Integer) c2Var.getTag()).intValue() == i7;
                c2Var.setTag(Integer.valueOf(i7));
                if (i7 != mpVar.I0) {
                    if (i7 != mpVar.K0) {
                        if (i7 != mpVar.J0) {
                            if (i7 != mpVar.C0) {
                                if (i7 != mpVar.D0) {
                                    if (i7 != mpVar.k0) {
                                        if (i7 != mpVar.E0) {
                                            if (i7 != mpVar.F0) {
                                                if (i7 != mpVar.G0) {
                                                    if (i7 != mpVar.H0) {
                                                        if (i7 != mpVar.Q0) {
                                                            if (i7 != mpVar.R0) {
                                                                if (i7 != mpVar.S0) {
                                                                    if (i7 != mpVar.V0) {
                                                                        if (i7 != mpVar.W0) {
                                                                            if (i7 == mpVar.X0) {
                                                                                c2Var.e(org.telegram.messenger.hd.M0(2131751320, null), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            c2Var.e(org.telegram.messenger.hd.M0(2131751318, null), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        c2Var.e(org.telegram.messenger.hd.M0(2131751311, null), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c2Var.e(org.telegram.messenger.hd.M0(2131751321, null), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                c2Var.e(org.telegram.messenger.hd.M0(2131751319, null), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            c2Var.e(org.telegram.messenger.hd.M0(2131751312, null), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.hd.M0(2131745606, null), "", (mpVar.P.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        c2Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.hd.M0(2131745603, null), "", (mpVar.P.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    c2Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                c2Var.e(org.telegram.messenger.hd.M0(2131745609, null), "", (mpVar.P.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                c2Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.hd.M0(2131745608, null), "", (mpVar.P.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            c2Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.hd.M0(2131743687, null), "", (mpVar.P.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        c2Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.hd.M0(2131745604, null), "", (mpVar.P.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    c2Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.hd.M0(2131745607, null), "", (mpVar.P.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                c2Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.hd.M0(2131745602, null), "", (mpVar.P.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            c2Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String M02 = org.telegram.messenger.hd.M0(2131743712, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar.P;
                        c2Var.e(M02, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        c2Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.hd.M0(2131745605, null), "", (mpVar.P.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    c2Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.gy0) view).a(mpVar.w, mpVar.T, i47 == 0, false, new r3(this, 3));
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.c;
        mp mpVar = this.e;
        switch (i7) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, oaVar, null);
                view = oaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
            default:
                View v9Var = new org.telegram.ui.Cells.v9(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, v9Var, null);
                view = v9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, null);
                view = n4Var;
                break;
            case 4:
            case 9:
                View p8Var = new org.telegram.ui.Cells.p8(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, p8Var, null);
                view = p8Var;
                break;
            case 5:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(context, null, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, w8Var, null);
                view = w8Var;
                break;
            case 7:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, z5Var, null);
                z5Var.c(new m0(this, 5));
                view = z5Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                mpVar.d = frameLayout;
                int i11 = org.telegram.ui.ActionBar.j6.a7;
                org.telegram.ui.ActionBar.q6.h(i11, frameLayout, null);
                mpVar.e = new FrameLayout(context);
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
                mpVar.f = h6Var;
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                mpVar.f.setTextColor(-1);
                mpVar.f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                mpVar.f.setGravity(17);
                org.telegram.ui.Components.h6 h6Var2 = mpVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131754459, sb2, " ");
                sb2.append(org.telegram.messenger.hd.M0(mpVar.L ? 2131754458 : 2131754457, null));
                h6Var2.setText(sb2.toString());
                mpVar.e.addView(mpVar.f, c8.ja.e(-2, -2, 17));
                mpVar.e.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
                mpVar.e.setOnClickListener(new a(this, 14));
                mpVar.d.addView(mpVar.e, c8.ja.d(-1, 48.0f, org.telegram.messenger.ns.E1, 14.0f, 28.0f, 14.0f, 14.0f));
                mpVar.d.setLayoutParams(new v4.p0(-1, -2));
                View view2 = new View(context);
                org.telegram.ui.ActionBar.q6.h(i11, view2, null);
                mpVar.d.setClipChildren(false);
                mpVar.d.setClipToPadding(false);
                mpVar.d.addView(view2, c8.ja.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view = mpVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.c, 4, 21, false, mpVar.getResourceProvider());
                c2Var.setPad(1);
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                c2Var.setEnabled(true);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, c2Var, null);
                view = c2Var;
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.e2) mpVar).currentAccount;
                long j3 = -mpVar.s;
                e6Var = ((org.telegram.ui.ActionBar.e2) mpVar).resourceProvider;
                view = new org.telegram.ui.Components.gy0(i10, j3, this.c, e6Var);
                break;
        }
        return new org.telegram.ui.Components.cj0(view);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        int b10 = e1Var.b();
        mp mpVar = this.e;
        if (b10 == mpVar.v0) {
            mp.k0(mpVar, e1Var.a);
        }
    }

    @Override // v4.h0
    public final void z(v4.e1 e1Var) {
        int b10 = e1Var.b();
        mp mpVar = this.e;
        if (b10 != mpVar.w0 || mpVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(mpVar.getParentActivity().getCurrentFocus());
    }
}
