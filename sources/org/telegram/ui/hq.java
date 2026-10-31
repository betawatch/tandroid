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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hq extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ iq e;

    public hq(iq iqVar, Context context) {
        this.e = iqVar;
        if (iqVar.D == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f;
        iq iqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = iqVar.P;
        int i11 = iqVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = iqVar.N;
        if (!iqVar.x.creator || ((i11 != 0 && (i11 != 2 || !iqVar.K)) || i10 != 4 || c1Var.b() != iqVar.e0)) {
            if (!iqVar.I) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = c1Var.b();
                if (b10 == iqVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = iqVar.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !iqVar.K) {
                        return false;
                    }
                    if (b10 == iqVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !iqVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == iqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == iqVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == iqVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == iqVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == iqVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == iqVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == iqVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == iqVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == iqVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == iqVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == iqVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == iqVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == iqVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == iqVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == iqVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == iqVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == iqVar.n0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i10 == 3 || i10 == 1 || i10 == 5 || i10 == 8 || i10 == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.V;
    }

    @Override // s4.g0
    public final long c(int i10) {
        iq iqVar = this.e;
        if (iqVar.D != 2) {
            return -1L;
        }
        if (i10 == iqVar.W) {
            return 1L;
        }
        if (i10 == iqVar.X) {
            return 2L;
        }
        if (i10 == iqVar.Y) {
            return 3L;
        }
        if (i10 == iqVar.b0) {
            return 4L;
        }
        if (i10 == iqVar.c0) {
            return 5L;
        }
        if (i10 == iqVar.d0) {
            return 6L;
        }
        if (i10 == iqVar.e0) {
            return 7L;
        }
        if (i10 == iqVar.f0) {
            return 8L;
        }
        if (i10 == iqVar.g0) {
            return 9L;
        }
        if (i10 == iqVar.h0) {
            return 10L;
        }
        if (i10 == iqVar.o0) {
            return 11L;
        }
        if (i10 == iqVar.p0) {
            return 12L;
        }
        if (i10 == iqVar.q0) {
            return 13L;
        }
        if (i10 == iqVar.r0) {
            return 14L;
        }
        if (i10 == iqVar.s0) {
            return 15L;
        }
        if (i10 == iqVar.t0) {
            return 16L;
        }
        if (i10 == iqVar.u0) {
            return 17L;
        }
        if (i10 == iqVar.v0) {
            return 18L;
        }
        if (i10 == iqVar.w0) {
            return 19L;
        }
        if (i10 == iqVar.y0) {
            return 20L;
        }
        if (i10 == iqVar.B0) {
            return 21L;
        }
        if (i10 == iqVar.H0) {
            return 22L;
        }
        if (i10 == iqVar.I0) {
            return 23L;
        }
        if (i10 == iqVar.J0) {
            return 24L;
        }
        if (i10 == iqVar.K0) {
            return 25L;
        }
        if (i10 == iqVar.L0) {
            return 26L;
        }
        if (i10 == iqVar.M0) {
            return 27L;
        }
        if (i10 == iqVar.x0) {
            return 28L;
        }
        if (i10 == iqVar.m0) {
            return 29L;
        }
        if (i10 == iqVar.C0) {
            return 30L;
        }
        if (i10 == iqVar.E0) {
            return 31L;
        }
        if (i10 == iqVar.D0) {
            return 32L;
        }
        if (i10 == iqVar.F0) {
            return 33L;
        }
        if (i10 == iqVar.G0) {
            return 34L;
        }
        if (i10 == iqVar.z0) {
            return 35L;
        }
        if (i10 == iqVar.N0) {
            return 36L;
        }
        if (i10 == iqVar.P0) {
            return 37L;
        }
        if (i10 == iqVar.Q0) {
            return 38L;
        }
        if (i10 == iqVar.R0) {
            return 39L;
        }
        if (i10 == iqVar.S0) {
            return 40L;
        }
        if (i10 == iqVar.U0) {
            return 41L;
        }
        if (i10 == iqVar.V0) {
            return 42L;
        }
        if (i10 == iqVar.W0) {
            return 43L;
        }
        if (i10 == iqVar.Z) {
            return 44L;
        }
        if (i10 == iqVar.i0) {
            return 45L;
        }
        if (i10 == iqVar.j0) {
            return 46L;
        }
        if (i10 == iqVar.k0) {
            return 47L;
        }
        if (i10 == iqVar.l0) {
            return 48L;
        }
        if (i10 == iqVar.n0) {
            return 49L;
        }
        return i10 == iqVar.a0 ? 50L : 0L;
    }

    @Override // s4.g0
    public final int d(int i10) {
        iq iqVar = this.e;
        if (i10 == iqVar.H0 || i10 == iqVar.J0 || i10 == iqVar.I0 || i10 == iqVar.B0 || i10 == iqVar.C0 || i10 == iqVar.E0 || i10 == iqVar.D0 || i10 == iqVar.G0 || i10 == iqVar.F0 || i10 == iqVar.j0 || i10 == iqVar.P0 || i10 == iqVar.Q0 || i10 == iqVar.R0 || i10 == iqVar.U0 || i10 == iqVar.V0 || i10 == iqVar.W0) {
            return 10;
        }
        if (i10 == iqVar.z0 || i10 == iqVar.N0 || i10 == iqVar.S0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == iqVar.o0 || i10 == iqVar.q0 || i10 == iqVar.L0 || i10 == iqVar.s0) {
            return 5;
        }
        if (i10 == 2 || i10 == iqVar.u0) {
            return 3;
        }
        if (i10 == iqVar.X || i10 == iqVar.Y || i10 == iqVar.Z || i10 == iqVar.b0 || i10 == iqVar.c0 || i10 == iqVar.d0 || i10 == iqVar.f0 || i10 == iqVar.g0 || i10 == iqVar.h0 || i10 == iqVar.i0 || i10 == iqVar.y0 || i10 == iqVar.e0 || i10 == iqVar.K0 || i10 == iqVar.W || i10 == iqVar.m0 || i10 == iqVar.k0 || i10 == iqVar.n0 || i10 == iqVar.a0) {
            return 4;
        }
        if (i10 == iqVar.r0 || i10 == iqVar.w0 || i10 == iqVar.l0) {
            return 1;
        }
        if (i10 == iqVar.M0) {
            return 6;
        }
        if (i10 == iqVar.v0) {
            return 11;
        }
        return i10 == iqVar.x0 ? 8 : 2;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.User user2;
        String K0;
        int i12;
        TLRPC.User user3;
        String Z;
        TLRPC.Chat chat;
        int i13;
        int i14;
        int i15;
        TLRPC.User user4;
        int i16;
        int i17;
        TLRPC.User user5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        int i18;
        boolean z11;
        int i19;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i20;
        int i21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights6;
        int i22;
        TLRPC.TL_chatBannedRights tL_chatBannedRights7;
        boolean z13;
        int i23;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights4;
        int i24;
        int i25;
        TLRPC.TL_chatBannedRights tL_chatBannedRights8;
        boolean z14;
        TLRPC.TL_chatBannedRights tL_chatBannedRights9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights10;
        int i26;
        int i27;
        int i28;
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
        int i29;
        int i30;
        int i31;
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
        int i32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights13;
        boolean z21;
        int i33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights15;
        boolean z22;
        int i34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights17;
        boolean z23;
        int i35;
        TLRPC.User user6;
        TLRPC.User user7;
        boolean z24;
        int i36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights19;
        boolean z25;
        int i37;
        TLRPC.TL_chatAdminRights tL_chatAdminRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights21;
        boolean z26;
        TLRPC.TL_chatAdminRights tL_chatAdminRights22;
        int i38;
        TLRPC.TL_chatAdminRights tL_chatAdminRights23;
        boolean z27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights24;
        boolean z28;
        int i39;
        TLRPC.TL_chatAdminRights tL_chatAdminRights25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights26;
        boolean z29;
        int i40;
        TLRPC.TL_chatAdminRights tL_chatAdminRights27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights28;
        TLRPC.User user8;
        boolean z30;
        TLRPC.TL_chatAdminRights tL_chatAdminRights29;
        int i41;
        TLRPC.TL_chatAdminRights tL_chatAdminRights30;
        boolean z31;
        TLRPC.TL_chatAdminRights tL_chatAdminRights31;
        boolean z32;
        int i42;
        TLRPC.TL_chatAdminRights tL_chatAdminRights32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights33;
        int i43;
        TLRPC.TL_chatBannedRights tL_chatBannedRights17;
        boolean z33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights34;
        boolean z34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights35;
        int i44;
        TLRPC.TL_chatAdminRights tL_chatAdminRights36;
        boolean z35;
        TLRPC.TL_chatAdminRights tL_chatAdminRights37;
        int i45;
        int i46;
        TLRPC.TL_chatBannedRights tL_chatBannedRights18;
        boolean z36;
        TLRPC.TL_chatBannedRights tL_chatBannedRights19;
        TLRPC.TL_chatBannedRights tL_chatBannedRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights38;
        int i47;
        TLRPC.TL_chatBannedRights tL_chatBannedRights21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights22;
        iq iqVar = this.e;
        int i48 = iqVar.D;
        boolean z37 = iqVar.U;
        boolean z38 = iqVar.F;
        boolean z39 = iqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = iqVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = iqVar.P;
        int i49 = c1Var.f;
        View view = c1Var.a;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                i11 = iqVar.D;
                String K02 = i11 == 2 ? org.telegram.messenger.cd.K0(2131753156) : null;
                user = iqVar.w;
                oaVar.a(K02, user);
                break;
            case 1:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i10 == iqVar.l0) {
                    b9Var.setText(org.telegram.messenger.cd.K0(2131751310));
                    break;
                } else if (i10 == iqVar.r0) {
                    b9Var.setText(org.telegram.messenger.cd.K0(2131751326));
                    break;
                } else if (i10 == iqVar.w0) {
                    user2 = iqVar.w;
                    if (org.telegram.messenger.h20.B(user2)) {
                        chat = iqVar.x;
                        if (chat.creator) {
                            K0 = org.telegram.messenger.cd.K0(2131752423);
                            i12 = iqVar.D;
                            if (i12 != 0) {
                                Z = org.telegram.messenger.cd.Z(2131751307, K0);
                            } else {
                                user3 = iqVar.w;
                                Z = org.telegram.messenger.cd.Z(2131751277, org.telegram.messenger.h20.p(user3));
                            }
                            b9Var.setText(Z);
                            break;
                        }
                    }
                    K0 = org.telegram.messenger.cd.K0(2131752520);
                    i12 = iqVar.D;
                    if (i12 != 0) {
                    }
                    b9Var.setText(Z);
                }
                break;
            case 2:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                if (i10 != iqVar.p0) {
                    if (i10 == iqVar.t0) {
                        TextView textView = x9Var.getTextView();
                        int i50 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(textView, i50, null);
                        x9Var.setTag(Integer.valueOf(i50));
                        if (!z39) {
                            x9Var.b(org.telegram.messenger.cd.K0(2131751316), false);
                            break;
                        } else {
                            x9Var.b(org.telegram.messenger.cd.K0(2131751323), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = x9Var.getTextView();
                    int i51 = org.telegram.ui.ActionBar.t6.p7;
                    org.telegram.ui.ActionBar.a7.V(textView2, i51, null);
                    x9Var.setTag(Integer.valueOf(i51));
                    i13 = iqVar.D;
                    if (i13 != 0) {
                        i14 = iqVar.D;
                        if (i14 == 1) {
                            x9Var.b(org.telegram.messenger.cd.K0(2131743750), false);
                            break;
                        }
                    } else {
                        x9Var.b(org.telegram.messenger.cd.K0(2131751306), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 != 2) {
                    if (i10 == iqVar.u0) {
                        p4Var.setText(org.telegram.messenger.cd.K0(2131751308));
                        break;
                    }
                } else {
                    i15 = iqVar.D;
                    if (i15 != 2) {
                        user4 = iqVar.w;
                        if (user4 != null) {
                            user5 = iqVar.w;
                            break;
                        }
                        i16 = iqVar.D;
                        if (i16 != 0) {
                            i17 = iqVar.D;
                            if (i17 == 1) {
                                p4Var.setText(org.telegram.messenger.cd.K0(2131743749));
                                break;
                            }
                        } else {
                            p4Var.setText(org.telegram.messenger.cd.K0(2131751290));
                            break;
                        }
                    }
                    p4Var.setText(org.telegram.messenger.cd.K0(2131752989));
                    break;
                }
                break;
            case 4:
            case 9:
                boolean z40 = true;
                final org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                boolean z41 = i48 != 2 || iqVar.K;
                TLRPC.Chat chat3 = iqVar.x;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == iqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = iqVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = iqVar.O;
                    int i52 = (tL_chatBannedRights25.send_photos || tL_chatBannedRights24.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights25.send_videos && !tL_chatBannedRights24.send_videos) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_stickers && !tL_chatBannedRights24.send_stickers) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_audios && !tL_chatBannedRights24.send_audios) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_docs && !tL_chatBannedRights24.send_docs) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_voices && !tL_chatBannedRights24.send_voices) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_roundvideos && !tL_chatBannedRights24.send_roundvideos) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.embed_links && !tL_chatBannedRights24.embed_links && !tL_chatBannedRights25.send_plain && !tL_chatBannedRights24.send_plain) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_polls && !tL_chatBannedRights24.send_polls) {
                        i52++;
                    }
                    if (!tL_chatBannedRights25.send_reactions && !tL_chatBannedRights24.send_reactions) {
                        i52++;
                    }
                    s8Var.d(org.telegram.messenger.cd.L0(2131743716, null), i52 > 0, true, true);
                    Locale locale = Locale.US;
                    s8Var.a(new Runnable(this) { // from class: org.telegram.ui.gq
                        public final /* synthetic */ hq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i53 = r3;
                            org.telegram.ui.Cells.s8 s8Var2 = s8Var;
                            hq hqVar = this.b;
                            switch (i53) {
                                case 0:
                                    iq iqVar2 = hqVar.e;
                                    if (s8Var2.isEnabled()) {
                                        if (!iq.p0(iqVar2)) {
                                            boolean z43 = s8Var2.d.h;
                                            s8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = iqVar2.O;
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
                                            org.telegram.messenger.i0.a4(iqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar2.getParentActivity());
                                            String L0 = org.telegram.messenger.cd.L0(2131743745, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                            x1Var.R = L0;
                                            x1Var.T = org.telegram.messenger.cd.L0(2131743743, null);
                                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                            x1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (s8Var2.isEnabled()) {
                                        boolean z44 = s8Var2.d.h;
                                        s8Var2.setChecked(z44);
                                        iq iqVar3 = hqVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = iqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        org.telegram.messenger.i0.a4(iqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (s8Var2.isEnabled()) {
                                        boolean z46 = s8Var2.d.h;
                                        s8Var2.setChecked(z46);
                                        iq iqVar4 = hqVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = iqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.i0.a4(iqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.k(i52, "/10"), !iqVar.A0);
                    s8Var.setIcon(iq.p0(iqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == iqVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i53 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i53 = r42 + 1;
                    }
                    int i54 = i53;
                    if (tL_chatAdminRights39.delete_messages) {
                        i54 = i53 + 1;
                    }
                    s8Var.d(org.telegram.messenger.cd.L0(2131752382, null), i54 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final int i55 = 1;
                    s8Var.a(new Runnable(this) { // from class: org.telegram.ui.gq
                        public final /* synthetic */ hq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i532 = i55;
                            org.telegram.ui.Cells.s8 s8Var2 = s8Var;
                            hq hqVar = this.b;
                            switch (i532) {
                                case 0:
                                    iq iqVar2 = hqVar.e;
                                    if (s8Var2.isEnabled()) {
                                        if (!iq.p0(iqVar2)) {
                                            boolean z43 = s8Var2.d.h;
                                            s8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = iqVar2.O;
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
                                            org.telegram.messenger.i0.a4(iqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar2.getParentActivity());
                                            String L0 = org.telegram.messenger.cd.L0(2131743745, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                            x1Var.R = L0;
                                            x1Var.T = org.telegram.messenger.cd.L0(2131743743, null);
                                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                            x1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (s8Var2.isEnabled()) {
                                        boolean z44 = s8Var2.d.h;
                                        s8Var2.setChecked(z44);
                                        iq iqVar3 = hqVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = iqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        org.telegram.messenger.i0.a4(iqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (s8Var2.isEnabled()) {
                                        boolean z46 = s8Var2.d.h;
                                        s8Var2.setChecked(z46);
                                        iq iqVar4 = hqVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = iqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.i0.a4(iqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.k(i54, "/3"), !iqVar.O0);
                } else if (i10 == iqVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = iqVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i56 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i56 = r52 + 1;
                    }
                    int i57 = i56;
                    if (tL_chatAdminRights40.delete_stories) {
                        i57 = i56 + 1;
                    }
                    s8Var.d(org.telegram.messenger.cd.K0(2131752381), i57 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final int i58 = 2;
                    s8Var.a(new Runnable(this) { // from class: org.telegram.ui.gq
                        public final /* synthetic */ hq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i532 = i58;
                            org.telegram.ui.Cells.s8 s8Var2 = s8Var;
                            hq hqVar = this.b;
                            switch (i532) {
                                case 0:
                                    iq iqVar2 = hqVar.e;
                                    if (s8Var2.isEnabled()) {
                                        if (!iq.p0(iqVar2)) {
                                            boolean z43 = s8Var2.d.h;
                                            s8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = iqVar2.O;
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
                                            org.telegram.messenger.i0.a4(iqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar2.getParentActivity());
                                            String L0 = org.telegram.messenger.cd.L0(2131743745, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                            x1Var.R = L0;
                                            x1Var.T = org.telegram.messenger.cd.L0(2131743743, null);
                                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                            x1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (s8Var2.isEnabled()) {
                                        boolean z44 = s8Var2.d.h;
                                        s8Var2.setChecked(z44);
                                        iq iqVar3 = hqVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = iqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        org.telegram.messenger.i0.a4(iqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (s8Var2.isEnabled()) {
                                        boolean z46 = s8Var2.d.h;
                                        s8Var2.setChecked(z46);
                                        iq iqVar4 = hqVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = iqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.i0.a4(iqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.k(i57, "/3"), !iqVar.T0);
                } else if (i10 == iqVar.W) {
                    s8Var.c(org.telegram.messenger.cd.K0(2131748711), iqVar.K, true);
                    tL_chatAdminRights38 = iqVar.N;
                    s8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == iqVar.X) {
                    i43 = iqVar.D;
                    if (i43 != 0) {
                        i45 = iqVar.D;
                        if (i45 != 2) {
                            i46 = iqVar.D;
                            if (i46 == 1) {
                                String K03 = org.telegram.messenger.cd.K0(z38 ? 2131751967 : 2131743742);
                                tL_chatBannedRights18 = iqVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = iqVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        s8Var.c(K03, z36, iqVar.m0 == -1);
                                        tL_chatBannedRights19 = iqVar.P;
                                        s8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                s8Var.c(K03, z36, iqVar.m0 == -1);
                                tL_chatBannedRights19 = iqVar.P;
                                s8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String K04 = org.telegram.messenger.cd.K0(2131751967);
                        if (z41) {
                            tL_chatAdminRights37 = iqVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                s8Var.c(K04, z35, true);
                            }
                        }
                        z35 = false;
                        s8Var.c(K04, z35, true);
                    } else if (z39) {
                        String K05 = org.telegram.messenger.cd.K0(2131751325);
                        if (z41) {
                            tL_chatAdminRights35 = iqVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                s8Var.c(K05, z34, true);
                            }
                        }
                        z34 = false;
                        s8Var.c(K05, z34, true);
                    } else {
                        String K06 = org.telegram.messenger.cd.K0(2131751324);
                        if (z41) {
                            tL_chatAdminRights34 = iqVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = iqVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            s8Var.c(K06, z33, true);
                        }
                        z33 = true;
                        s8Var.c(K06, z33, true);
                    }
                    i44 = iqVar.D;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = iqVar.N;
                        s8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == iqVar.Y) {
                    String K07 = org.telegram.messenger.cd.K0(2131751313);
                    if (z41) {
                        tL_chatAdminRights33 = iqVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            s8Var.c(K07, z32, true);
                            i42 = iqVar.D;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    s8Var.c(K07, z32, true);
                    i42 = iqVar.D;
                    if (i42 == 2) {
                    }
                } else if (i10 == iqVar.a0) {
                    user8 = iqVar.w;
                    if (org.telegram.messenger.h20.t(user8)) {
                        String K08 = org.telegram.messenger.cd.K0(z39 ? 2131751328 : 2131751327);
                        if (z41) {
                            tL_chatAdminRights31 = iqVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                s8Var.c(K08, z31, true);
                            }
                        }
                        z31 = false;
                        s8Var.c(K08, z31, true);
                    } else {
                        String K09 = org.telegram.messenger.cd.K0(2131751291);
                        if (z41) {
                            tL_chatAdminRights29 = iqVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                s8Var.c(K09, z30, true);
                            }
                        }
                        z30 = false;
                        s8Var.c(K09, z30, true);
                    }
                    i41 = iqVar.D;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = iqVar.N;
                        s8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == iqVar.Z) {
                    String K010 = org.telegram.messenger.cd.K0(2131751315);
                    if (z41) {
                        tL_chatAdminRights28 = iqVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            s8Var.c(K010, z29, true);
                            i40 = iqVar.D;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    s8Var.c(K010, z29, true);
                    i40 = iqVar.D;
                    if (i40 == 2) {
                    }
                } else if (i10 == iqVar.b0) {
                    String K011 = org.telegram.messenger.cd.K0(2131751320);
                    if (z41) {
                        tL_chatAdminRights26 = iqVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            s8Var.c(K011, z28, true);
                            i39 = iqVar.D;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    s8Var.c(K011, z28, true);
                    i39 = iqVar.D;
                    if (i39 == 2) {
                    }
                } else if (i10 == iqVar.c0) {
                    if (z39) {
                        String K012 = org.telegram.messenger.cd.K0(2131751322);
                        if (z41) {
                            tL_chatAdminRights24 = iqVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                s8Var.c(K012, z27, true);
                            }
                        }
                        z27 = false;
                        s8Var.c(K012, z27, true);
                    } else {
                        String K013 = org.telegram.messenger.cd.K0(2131751317);
                        if (z41) {
                            tL_chatAdminRights22 = iqVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                s8Var.c(K013, z26, true);
                            }
                        }
                        z26 = false;
                        s8Var.c(K013, z26, true);
                    }
                    i38 = iqVar.D;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = iqVar.N;
                        s8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == iqVar.d0) {
                    String K014 = org.telegram.messenger.cd.K0(2131751332);
                    if (z41) {
                        tL_chatAdminRights21 = iqVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            s8Var.c(K014, z25, (iqVar.f0 == -1 && z39) || iqVar.e0 != -1);
                            i37 = iqVar.D;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    s8Var.c(K014, z25, (iqVar.f0 == -1 && z39) || iqVar.e0 != -1);
                    i37 = iqVar.D;
                    if (i37 == 2) {
                    }
                } else if (i10 == iqVar.e0) {
                    String K015 = org.telegram.messenger.cd.K0(2131751304);
                    if (z41) {
                        tL_chatAdminRights19 = iqVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            s8Var.c(K015, z24, iqVar.m0 == -1 || z37);
                            i36 = iqVar.D;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    s8Var.c(K015, z24, iqVar.m0 == -1 || z37);
                    i36 = iqVar.D;
                    if (i36 == 2) {
                    }
                } else if (i10 == iqVar.k0) {
                    String K016 = org.telegram.messenger.cd.K0(2131751311);
                    if (iqVar.y != null) {
                        user6 = iqVar.w;
                        if (user6 != null) {
                            long j10 = iqVar.r ? iqVar.n : iqVar.y.guard_bot_id;
                            user7 = iqVar.w;
                            if (j10 == user7.id) {
                                z23 = true;
                                s8Var.c(K016, z23, false);
                                i35 = iqVar.D;
                                if (i35 == 2) {
                                    s8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    s8Var.c(K016, z23, false);
                    i35 = iqVar.D;
                    if (i35 == 2) {
                    }
                } else if (i10 == iqVar.f0) {
                    String K017 = org.telegram.messenger.cd.K0(z38 ? 2131751968 : 2131751329);
                    if (z41) {
                        tL_chatAdminRights17 = iqVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            s8Var.c(K017, z22, !z38);
                            i34 = iqVar.D;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    s8Var.c(K017, z22, !z38);
                    i34 = iqVar.D;
                    if (i34 == 2) {
                    }
                } else if (i10 == iqVar.n0) {
                    String K018 = org.telegram.messenger.cd.K0(2131751966);
                    if (z41) {
                        tL_chatAdminRights15 = iqVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            s8Var.c(K018, z21, true);
                            i33 = iqVar.D;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    s8Var.c(K018, z21, true);
                    i33 = iqVar.D;
                    if (i33 == 2) {
                    }
                } else if (i10 == iqVar.K0) {
                    String K019 = org.telegram.messenger.cd.K0(2131744919);
                    if (z41) {
                        tL_chatAdminRights13 = iqVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            s8Var.c(K019, z20, true);
                            i32 = iqVar.D;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    s8Var.c(K019, z20, true);
                    i32 = iqVar.D;
                    if (i32 == 2) {
                    }
                } else if (i10 == iqVar.m0) {
                    i29 = iqVar.D;
                    if (i29 == 0) {
                        String K020 = org.telegram.messenger.cd.K0(2131748707);
                        if (z41) {
                            tL_chatAdminRights11 = iqVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                s8Var.c(K020, z19, z37);
                            }
                        }
                        z19 = false;
                        s8Var.c(K020, z19, z37);
                    } else {
                        i30 = iqVar.D;
                        if (i30 == 1) {
                            String K021 = org.telegram.messenger.cd.K0(2131751701);
                            tL_chatBannedRights14 = iqVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = iqVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    s8Var.c(K021, z18, z37);
                                    tL_chatBannedRights15 = iqVar.P;
                                    s8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            s8Var.c(K021, z18, z37);
                            tL_chatBannedRights15 = iqVar.P;
                            s8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = iqVar.D;
                            if (i31 == 2) {
                                String K022 = org.telegram.messenger.cd.K0(2131748707);
                                if (z41) {
                                    tL_chatAdminRights10 = iqVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        s8Var.c(K022, z17, z37);
                                        tL_chatAdminRights9 = iqVar.N;
                                        s8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                s8Var.c(K022, z17, z37);
                                tL_chatAdminRights9 = iqVar.N;
                                s8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == iqVar.g0) {
                    i26 = iqVar.D;
                    if (i26 == 0) {
                        chat2 = iqVar.x;
                        if (org.telegram.messenger.w3.P(3, chat2)) {
                            String K023 = org.telegram.messenger.cd.K0(2131751331);
                            tL_chatAdminRights8 = iqVar.M;
                            s8Var.c(K023, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String K024 = org.telegram.messenger.cd.K0(2131751330);
                            tL_chatAdminRights7 = iqVar.M;
                            s8Var.c(K024, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = iqVar.D;
                        if (i27 == 1) {
                            String K025 = org.telegram.messenger.cd.K0(2131743737);
                            tL_chatBannedRights11 = iqVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = iqVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    s8Var.c(K025, z16, true);
                                    tL_chatBannedRights12 = iqVar.P;
                                    s8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            s8Var.c(K025, z16, true);
                            tL_chatBannedRights12 = iqVar.P;
                            s8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = iqVar.D;
                            if (i28 == 2) {
                                String K026 = org.telegram.messenger.cd.K0(2131751330);
                                if (z41) {
                                    tL_chatAdminRights6 = iqVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        s8Var.c(K026, z15, true);
                                        tL_chatAdminRights5 = iqVar.N;
                                        s8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                s8Var.c(K026, z15, true);
                                tL_chatAdminRights5 = iqVar.N;
                                s8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == iqVar.h0) {
                    i22 = iqVar.D;
                    if (i22 != 0) {
                        i24 = iqVar.D;
                        if (i24 != 2) {
                            i25 = iqVar.D;
                            if (i25 == 1) {
                                String K027 = org.telegram.messenger.cd.K0(2131743718);
                                tL_chatBannedRights8 = iqVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = iqVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        s8Var.c(K027, z14, true);
                                        tL_chatBannedRights9 = iqVar.P;
                                        s8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                s8Var.c(K027, z14, true);
                                tL_chatBannedRights9 = iqVar.P;
                                s8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String K028 = org.telegram.messenger.cd.K0(2131751314);
                    if (z41) {
                        tL_chatAdminRights4 = iqVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = iqVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        s8Var.c(K028, z13, true);
                        i23 = iqVar.D;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = iqVar.N;
                            s8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    s8Var.c(K028, z13, true);
                    i23 = iqVar.D;
                    if (i23 == 2) {
                    }
                } else if (i10 == iqVar.i0) {
                    i18 = iqVar.D;
                    if (i18 != 0) {
                        i20 = iqVar.D;
                        if (i20 != 2) {
                            i21 = iqVar.D;
                            if (i21 == 1) {
                                String K029 = org.telegram.messenger.cd.K0(2131743739);
                                tL_chatBannedRights4 = iqVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = iqVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        s8Var.c(K029, z12, true);
                                        tL_chatBannedRights5 = iqVar.P;
                                        s8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                s8Var.c(K029, z12, true);
                                tL_chatBannedRights5 = iqVar.P;
                                s8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String K030 = org.telegram.messenger.cd.K0(2131751318);
                    if (z41) {
                        tL_chatAdminRights2 = iqVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            s8Var.c(K030, z11, true);
                            i19 = iqVar.D;
                            if (i19 == 2) {
                                tL_chatAdminRights = iqVar.N;
                                s8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    s8Var.c(K030, z11, true);
                    i19 = iqVar.D;
                    if (i19 == 2) {
                    }
                } else if (i10 == iqVar.y0) {
                    String K031 = org.telegram.messenger.cd.K0(2131743717);
                    tL_chatBannedRights = iqVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = iqVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            s8Var.c(K031, z10, true);
                            tL_chatBannedRights2 = iqVar.P;
                            s8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    s8Var.c(K031, z10, true);
                    tL_chatBannedRights2 = iqVar.P;
                    s8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = iqVar.D;
                if (i47 != 2 && i10 == iqVar.y0) {
                    tL_chatBannedRights21 = iqVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = iqVar.P;
                        break;
                    }
                    z40 = false;
                    s8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                if (i48 != 2 || (i10 != iqVar.o0 && i10 != iqVar.w0)) {
                    c7Var.setAlpha(1.0f);
                    break;
                } else {
                    c7Var.setAlpha(iqVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 == iqVar.M0) {
                    int i59 = iqVar.O.until_date;
                    z8Var.d(org.telegram.messenger.cd.L0(2131743740, null), (i59 == 0 || Math.abs(((long) i59) - (System.currentTimeMillis() / 1000)) > 315360000) ? org.telegram.messenger.cd.L0(2131743710, null) : org.telegram.messenger.cd.v(iqVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                String L0 = (org.telegram.messenger.h20.B(iqVar.w) && iqVar.x.creator) ? org.telegram.messenger.cd.L0(2131752423, null) : org.telegram.messenger.cd.L0(2131752520, null);
                this.d = true;
                e6Var.getTextView().setEnabled(iqVar.I || iqVar.x.creator);
                e6Var.getTextView().setSingleLine(true);
                e6Var.getTextView().setImeOptions(6);
                e6Var.n(iqVar.S, L0, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                boolean z43 = c2Var.getTag() != null && ((Integer) c2Var.getTag()).intValue() == i10;
                c2Var.setTag(Integer.valueOf(i10));
                if (i10 != iqVar.H0) {
                    if (i10 != iqVar.J0) {
                        if (i10 != iqVar.I0) {
                            if (i10 != iqVar.B0) {
                                if (i10 != iqVar.C0) {
                                    if (i10 != iqVar.j0) {
                                        if (i10 != iqVar.D0) {
                                            if (i10 != iqVar.E0) {
                                                if (i10 != iqVar.F0) {
                                                    if (i10 != iqVar.G0) {
                                                        if (i10 != iqVar.P0) {
                                                            if (i10 != iqVar.Q0) {
                                                                if (i10 != iqVar.R0) {
                                                                    if (i10 != iqVar.U0) {
                                                                        if (i10 != iqVar.V0) {
                                                                            if (i10 == iqVar.W0) {
                                                                                c2Var.e(org.telegram.messenger.cd.L0(2131751321, null), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            c2Var.e(org.telegram.messenger.cd.L0(2131751319, null), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        c2Var.e(org.telegram.messenger.cd.L0(2131751312, null), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c2Var.e(org.telegram.messenger.cd.L0(2131751322, null), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                c2Var.e(org.telegram.messenger.cd.L0(2131751320, null), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            c2Var.e(org.telegram.messenger.cd.L0(2131751313, null), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.cd.L0(2131745623, null), "", (iqVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        c2Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.cd.L0(2131745620, null), "", (iqVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    c2Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                c2Var.e(org.telegram.messenger.cd.L0(2131745626, null), "", (iqVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                c2Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.cd.L0(2131745625, null), "", (iqVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            c2Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.cd.L0(2131743713, null), "", (iqVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        c2Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.cd.L0(2131745621, null), "", (iqVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    c2Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.cd.L0(2131745624, null), "", (iqVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                c2Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.cd.L0(2131745619, null), "", (iqVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            c2Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String L02 = org.telegram.messenger.cd.L0(2131743738, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = iqVar.O;
                        c2Var.e(L02, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        c2Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.cd.L0(2131745622, null), "", (iqVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    c2Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.iz0) view).a(iqVar.w, iqVar.S, i48 == 0, false, new s3(this, 3));
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        Context context = this.c;
        iq iqVar = this.e;
        switch (i10) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, oaVar, null);
                view = oaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
            default:
                View x9Var = new org.telegram.ui.Cells.x9(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, x9Var, null);
                view = x9Var;
                break;
            case 3:
                View p4Var = new org.telegram.ui.Cells.p4(this.c, org.telegram.ui.ActionBar.t6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, null);
                view = p4Var;
                break;
            case 4:
            case 9:
                View s8Var = new org.telegram.ui.Cells.s8(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, s8Var, null);
                view = s8Var;
                break;
            case 5:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                View z8Var = new org.telegram.ui.Cells.z8(context, null, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, z8Var, null);
                view = z8Var;
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, e6Var, null);
                e6Var.b(new n0(this, 5));
                view = e6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                iqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.t6.a7;
                org.telegram.ui.ActionBar.a7.i(i12, frameLayout, null);
                iqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, false, false);
                iqVar.f = f6Var;
                f6Var.setTypeface(org.telegram.messenger.i0.o());
                iqVar.f.setTextColor(-1);
                iqVar.f.setTextSize(org.telegram.messenger.i0.L(14.0f));
                iqVar.f.setGravity(17);
                org.telegram.ui.Components.f6 f6Var2 = iqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131754459, sb2, " ");
                sb2.append(org.telegram.messenger.cd.L0(iqVar.K ? 2131754458 : 2131754457, null));
                f6Var2.setText(sb2.toString());
                iqVar.e.addView(iqVar.f, w7.b6.e(-2, -2, 17));
                iqVar.e.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                iqVar.e.setOnClickListener(new a(this, 14));
                iqVar.d.addView(iqVar.e, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 14.0f, 28.0f, 14.0f, 14.0f));
                iqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view2 = new View(context);
                org.telegram.ui.ActionBar.a7.i(i12, view2, null);
                iqVar.d.setClipChildren(false);
                iqVar.d.setClipToPadding(false);
                iqVar.d.addView(view2, w7.b6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view = iqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(4, 21, this.c, iqVar.getResourceProvider(), false);
                c2Var.setPad(1);
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.k7);
                c2Var.setEnabled(true);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, c2Var, null);
                view = c2Var;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.k2) iqVar).currentAccount;
                long j10 = -iqVar.s;
                p6Var = ((org.telegram.ui.ActionBar.k2) iqVar).resourceProvider;
                view = new org.telegram.ui.Components.iz0(i11, j10, this.c, p6Var);
                break;
        }
        return new org.telegram.ui.Components.ck0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        iq iqVar = this.e;
        if (b10 == iqVar.u0) {
            iq.j0(iqVar, c1Var.a);
        }
    }

    @Override // s4.g0
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        iq iqVar = this.e;
        if (b10 != iqVar.v0 || iqVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.i0.v1(iqVar.getParentActivity().getCurrentFocus());
    }
}
