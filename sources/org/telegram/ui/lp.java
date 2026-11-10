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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lp extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ mp e;

    public lp(mp mpVar, Context context) {
        this.e = mpVar;
        if (mpVar.D == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        TLRPC.Chat chat;
        int i7 = d1Var.f;
        mp mpVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = mpVar.P;
        int i10 = mpVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = mpVar.N;
        if (!mpVar.x.creator || ((i10 != 0 && (i10 != 2 || !mpVar.K)) || i7 != 4 || d1Var.b() != mpVar.e0)) {
            if (!mpVar.I) {
                return false;
            }
            if ((i10 == 0 || i10 == 2) && i7 == 4) {
                int b10 = d1Var.b();
                if (b10 == mpVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = mpVar.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i10 == 2 && !mpVar.K) {
                        return false;
                    }
                    if (b10 == mpVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !mpVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == mpVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == mpVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == mpVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == mpVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == mpVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == mpVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == mpVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == mpVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == mpVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == mpVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == mpVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == mpVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == mpVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == mpVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == mpVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == mpVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == mpVar.n0) {
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

    @Override // v4.g0
    public final int b() {
        return this.e.V;
    }

    @Override // v4.g0
    public final long c(int i7) {
        mp mpVar = this.e;
        if (mpVar.D != 2) {
            return -1L;
        }
        if (i7 == mpVar.W) {
            return 1L;
        }
        if (i7 == mpVar.X) {
            return 2L;
        }
        if (i7 == mpVar.Y) {
            return 3L;
        }
        if (i7 == mpVar.b0) {
            return 4L;
        }
        if (i7 == mpVar.c0) {
            return 5L;
        }
        if (i7 == mpVar.d0) {
            return 6L;
        }
        if (i7 == mpVar.e0) {
            return 7L;
        }
        if (i7 == mpVar.f0) {
            return 8L;
        }
        if (i7 == mpVar.g0) {
            return 9L;
        }
        if (i7 == mpVar.h0) {
            return 10L;
        }
        if (i7 == mpVar.o0) {
            return 11L;
        }
        if (i7 == mpVar.p0) {
            return 12L;
        }
        if (i7 == mpVar.q0) {
            return 13L;
        }
        if (i7 == mpVar.r0) {
            return 14L;
        }
        if (i7 == mpVar.s0) {
            return 15L;
        }
        if (i7 == mpVar.t0) {
            return 16L;
        }
        if (i7 == mpVar.u0) {
            return 17L;
        }
        if (i7 == mpVar.v0) {
            return 18L;
        }
        if (i7 == mpVar.w0) {
            return 19L;
        }
        if (i7 == mpVar.y0) {
            return 20L;
        }
        if (i7 == mpVar.B0) {
            return 21L;
        }
        if (i7 == mpVar.H0) {
            return 22L;
        }
        if (i7 == mpVar.I0) {
            return 23L;
        }
        if (i7 == mpVar.J0) {
            return 24L;
        }
        if (i7 == mpVar.K0) {
            return 25L;
        }
        if (i7 == mpVar.L0) {
            return 26L;
        }
        if (i7 == mpVar.M0) {
            return 27L;
        }
        if (i7 == mpVar.x0) {
            return 28L;
        }
        if (i7 == mpVar.m0) {
            return 29L;
        }
        if (i7 == mpVar.C0) {
            return 30L;
        }
        if (i7 == mpVar.E0) {
            return 31L;
        }
        if (i7 == mpVar.D0) {
            return 32L;
        }
        if (i7 == mpVar.F0) {
            return 33L;
        }
        if (i7 == mpVar.G0) {
            return 34L;
        }
        if (i7 == mpVar.z0) {
            return 35L;
        }
        if (i7 == mpVar.N0) {
            return 36L;
        }
        if (i7 == mpVar.P0) {
            return 37L;
        }
        if (i7 == mpVar.Q0) {
            return 38L;
        }
        if (i7 == mpVar.R0) {
            return 39L;
        }
        if (i7 == mpVar.S0) {
            return 40L;
        }
        if (i7 == mpVar.U0) {
            return 41L;
        }
        if (i7 == mpVar.V0) {
            return 42L;
        }
        if (i7 == mpVar.W0) {
            return 43L;
        }
        if (i7 == mpVar.Z) {
            return 44L;
        }
        if (i7 == mpVar.i0) {
            return 45L;
        }
        if (i7 == mpVar.j0) {
            return 46L;
        }
        if (i7 == mpVar.k0) {
            return 47L;
        }
        if (i7 == mpVar.l0) {
            return 48L;
        }
        if (i7 == mpVar.n0) {
            return 49L;
        }
        return i7 == mpVar.a0 ? 50L : 0L;
    }

    @Override // v4.g0
    public final int d(int i7) {
        mp mpVar = this.e;
        if (i7 == mpVar.H0 || i7 == mpVar.J0 || i7 == mpVar.I0 || i7 == mpVar.B0 || i7 == mpVar.C0 || i7 == mpVar.E0 || i7 == mpVar.D0 || i7 == mpVar.G0 || i7 == mpVar.F0 || i7 == mpVar.j0 || i7 == mpVar.P0 || i7 == mpVar.Q0 || i7 == mpVar.R0 || i7 == mpVar.U0 || i7 == mpVar.V0 || i7 == mpVar.W0) {
            return 10;
        }
        if (i7 == mpVar.z0 || i7 == mpVar.N0 || i7 == mpVar.S0) {
            return 9;
        }
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1 || i7 == mpVar.o0 || i7 == mpVar.q0 || i7 == mpVar.L0 || i7 == mpVar.s0) {
            return 5;
        }
        if (i7 == 2 || i7 == mpVar.u0) {
            return 3;
        }
        if (i7 == mpVar.X || i7 == mpVar.Y || i7 == mpVar.Z || i7 == mpVar.b0 || i7 == mpVar.c0 || i7 == mpVar.d0 || i7 == mpVar.f0 || i7 == mpVar.g0 || i7 == mpVar.h0 || i7 == mpVar.i0 || i7 == mpVar.y0 || i7 == mpVar.e0 || i7 == mpVar.K0 || i7 == mpVar.W || i7 == mpVar.m0 || i7 == mpVar.k0 || i7 == mpVar.n0 || i7 == mpVar.a0) {
            return 4;
        }
        if (i7 == mpVar.r0 || i7 == mpVar.w0 || i7 == mpVar.l0) {
            return 1;
        }
        if (i7 == mpVar.M0) {
            return 6;
        }
        if (i7 == mpVar.v0) {
            return 11;
        }
        return i7 == mpVar.x0 ? 8 : 2;
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
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
        boolean z9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        int i17;
        boolean z10;
        int i18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i19;
        int i20;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights6;
        int i21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights7;
        boolean z12;
        int i22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights4;
        int i23;
        int i24;
        TLRPC.TL_chatBannedRights tL_chatBannedRights8;
        boolean z13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights10;
        int i25;
        int i26;
        int i27;
        boolean z14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights5;
        TLRPC.TL_chatAdminRights tL_chatAdminRights6;
        TLRPC.TL_chatBannedRights tL_chatBannedRights11;
        boolean z15;
        TLRPC.TL_chatBannedRights tL_chatBannedRights12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights13;
        TLRPC.Chat chat2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights7;
        TLRPC.TL_chatAdminRights tL_chatAdminRights8;
        int i28;
        int i29;
        int i30;
        boolean z16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights9;
        TLRPC.TL_chatAdminRights tL_chatAdminRights10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights14;
        boolean z17;
        TLRPC.TL_chatBannedRights tL_chatBannedRights15;
        TLRPC.TL_chatBannedRights tL_chatBannedRights16;
        boolean z18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights11;
        boolean z19;
        int i31;
        TLRPC.TL_chatAdminRights tL_chatAdminRights12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights13;
        boolean z20;
        int i32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights15;
        boolean z21;
        int i33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights17;
        boolean z22;
        int i34;
        TLRPC.User user6;
        TLRPC.User user7;
        boolean z23;
        int i35;
        TLRPC.TL_chatAdminRights tL_chatAdminRights18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights19;
        boolean z24;
        int i36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights21;
        boolean z25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights22;
        int i37;
        TLRPC.TL_chatAdminRights tL_chatAdminRights23;
        boolean z26;
        TLRPC.TL_chatAdminRights tL_chatAdminRights24;
        boolean z27;
        int i38;
        TLRPC.TL_chatAdminRights tL_chatAdminRights25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights26;
        boolean z28;
        int i39;
        TLRPC.TL_chatAdminRights tL_chatAdminRights27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights28;
        TLRPC.User user8;
        boolean z29;
        TLRPC.TL_chatAdminRights tL_chatAdminRights29;
        int i40;
        TLRPC.TL_chatAdminRights tL_chatAdminRights30;
        boolean z30;
        TLRPC.TL_chatAdminRights tL_chatAdminRights31;
        boolean z31;
        int i41;
        TLRPC.TL_chatAdminRights tL_chatAdminRights32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights33;
        int i42;
        TLRPC.TL_chatBannedRights tL_chatBannedRights17;
        boolean z32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights34;
        boolean z33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights35;
        int i43;
        TLRPC.TL_chatAdminRights tL_chatAdminRights36;
        boolean z34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights37;
        int i44;
        int i45;
        TLRPC.TL_chatBannedRights tL_chatBannedRights18;
        boolean z35;
        TLRPC.TL_chatBannedRights tL_chatBannedRights19;
        TLRPC.TL_chatBannedRights tL_chatBannedRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights38;
        int i46;
        TLRPC.TL_chatBannedRights tL_chatBannedRights21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights22;
        mp mpVar = this.e;
        int i47 = mpVar.D;
        boolean z36 = mpVar.U;
        boolean z37 = mpVar.F;
        boolean z38 = mpVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = mpVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = mpVar.P;
        int i48 = d1Var.f;
        View view = d1Var.a;
        switch (i48) {
            case 0:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                i10 = mpVar.D;
                String L02 = i10 == 2 ? org.telegram.messenger.id.L0(2131753156) : null;
                user = mpVar.w;
                oaVar.a(L02, user);
                break;
            case 1:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == mpVar.l0) {
                    z8Var.setText(org.telegram.messenger.id.L0(2131751309));
                    break;
                } else if (i7 == mpVar.r0) {
                    z8Var.setText(org.telegram.messenger.id.L0(2131751325));
                    break;
                } else if (i7 == mpVar.w0) {
                    user2 = mpVar.w;
                    if (org.telegram.messenger.t10.B(user2)) {
                        chat = mpVar.x;
                        if (chat.creator) {
                            L0 = org.telegram.messenger.id.L0(2131752423);
                            i11 = mpVar.D;
                            if (i11 != 0) {
                                Z = org.telegram.messenger.id.Z(2131751306, L0);
                            } else {
                                user3 = mpVar.w;
                                Z = org.telegram.messenger.id.Z(2131751276, org.telegram.messenger.t10.p(user3));
                            }
                            z8Var.setText(Z);
                            break;
                        }
                    }
                    L0 = org.telegram.messenger.id.L0(2131752520);
                    i11 = mpVar.D;
                    if (i11 != 0) {
                    }
                    z8Var.setText(Z);
                }
                break;
            case 2:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                if (i7 != mpVar.p0) {
                    if (i7 == mpVar.t0) {
                        TextView textView = w9Var.getTextView();
                        int i49 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView, i49, null);
                        w9Var.setTag(Integer.valueOf(i49));
                        if (!z38) {
                            w9Var.b(org.telegram.messenger.id.L0(2131751315), false);
                            break;
                        } else {
                            w9Var.b(org.telegram.messenger.id.L0(2131751322), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = w9Var.getTextView();
                    int i50 = org.telegram.ui.ActionBar.m6.p7;
                    org.telegram.ui.ActionBar.t6.U(textView2, i50, null);
                    w9Var.setTag(Integer.valueOf(i50));
                    i12 = mpVar.D;
                    if (i12 != 0) {
                        i13 = mpVar.D;
                        if (i13 == 1) {
                            w9Var.b(org.telegram.messenger.id.L0(2131743724), false);
                            break;
                        }
                    } else {
                        w9Var.b(org.telegram.messenger.id.L0(2131751305), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != 2) {
                    if (i7 == mpVar.u0) {
                        n4Var.setText(org.telegram.messenger.id.L0(2131751307));
                        break;
                    }
                } else {
                    i14 = mpVar.D;
                    if (i14 != 2) {
                        user4 = mpVar.w;
                        if (user4 != null) {
                            user5 = mpVar.w;
                            break;
                        }
                        i15 = mpVar.D;
                        if (i15 != 0) {
                            i16 = mpVar.D;
                            if (i16 == 1) {
                                n4Var.setText(org.telegram.messenger.id.L0(2131743723));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.id.L0(2131751289));
                            break;
                        }
                    }
                    n4Var.setText(org.telegram.messenger.id.L0(2131752989));
                    break;
                }
                break;
            case 4:
            case 9:
                boolean z39 = true;
                final org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                boolean z40 = i47 != 2 || mpVar.K;
                TLRPC.Chat chat3 = mpVar.x;
                boolean z41 = chat3 != null && chat3.creator;
                if (i7 == mpVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = mpVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = mpVar.O;
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
                    q8Var.d(org.telegram.messenger.id.M0(2131743690, null), i51 > 0, true, true);
                    Locale locale = Locale.US;
                    q8Var.a(new Runnable(this) { // from class: org.telegram.ui.kp
                        public final /* synthetic */ lp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i52 = r3;
                            org.telegram.ui.Cells.q8 q8Var2 = q8Var;
                            lp lpVar = this.b;
                            switch (i52) {
                                case 0:
                                    mp mpVar2 = lpVar.e;
                                    if (q8Var2.isEnabled()) {
                                        if (!mp.q0(mpVar2)) {
                                            boolean z42 = q8Var2.d.h;
                                            q8Var2.setChecked(!z42);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar2.O;
                                            tL_chatBannedRights26.send_media = z42;
                                            tL_chatBannedRights26.send_photos = z42;
                                            tL_chatBannedRights26.send_videos = z42;
                                            tL_chatBannedRights26.send_stickers = z42;
                                            tL_chatBannedRights26.send_gifs = z42;
                                            tL_chatBannedRights26.send_games = z42;
                                            tL_chatBannedRights26.send_inline = z42;
                                            tL_chatBannedRights26.send_audios = z42;
                                            tL_chatBannedRights26.send_docs = z42;
                                            tL_chatBannedRights26.send_voices = z42;
                                            tL_chatBannedRights26.send_roundvideos = z42;
                                            tL_chatBannedRights26.embed_links = z42;
                                            tL_chatBannedRights26.send_polls = z42;
                                            tL_chatBannedRights26.send_reactions = z42;
                                            org.telegram.messenger.g0.b4(mpVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar2.getParentActivity());
                                            String M0 = org.telegram.messenger.id.M0(2131743719, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                            u1Var.R = M0;
                                            u1Var.T = org.telegram.messenger.id.M0(2131743717, null);
                                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                            u1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (q8Var2.isEnabled()) {
                                        boolean z43 = q8Var2.d.h;
                                        q8Var2.setChecked(z43);
                                        mp mpVar3 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = mpVar3.M;
                                        boolean z44 = !z43;
                                        tL_chatAdminRights40.post_messages = z44;
                                        tL_chatAdminRights40.edit_messages = z44;
                                        tL_chatAdminRights40.delete_messages = z44;
                                        org.telegram.messenger.g0.b4(mpVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (q8Var2.isEnabled()) {
                                        boolean z45 = q8Var2.d.h;
                                        q8Var2.setChecked(z45);
                                        mp mpVar4 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = mpVar4.M;
                                        boolean z46 = !z45;
                                        tL_chatAdminRights41.post_stories = z46;
                                        tL_chatAdminRights41.edit_stories = z46;
                                        tL_chatAdminRights41.delete_stories = z46;
                                        org.telegram.messenger.g0.b4(mpVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.recaptcha.internal.a.i(i51, "/10"), !mpVar.A0);
                    q8Var.setIcon(mp.q0(mpVar) ? R.drawable.permission_locked : 0);
                } else if (i7 == mpVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i52 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i52 = r42 + 1;
                    }
                    int i53 = i52;
                    if (tL_chatAdminRights39.delete_messages) {
                        i53 = i52 + 1;
                    }
                    q8Var.d(org.telegram.messenger.id.M0(2131752382, null), i53 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final int i54 = 1;
                    q8Var.a(new Runnable(this) { // from class: org.telegram.ui.kp
                        public final /* synthetic */ lp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i522 = i54;
                            org.telegram.ui.Cells.q8 q8Var2 = q8Var;
                            lp lpVar = this.b;
                            switch (i522) {
                                case 0:
                                    mp mpVar2 = lpVar.e;
                                    if (q8Var2.isEnabled()) {
                                        if (!mp.q0(mpVar2)) {
                                            boolean z42 = q8Var2.d.h;
                                            q8Var2.setChecked(!z42);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar2.O;
                                            tL_chatBannedRights26.send_media = z42;
                                            tL_chatBannedRights26.send_photos = z42;
                                            tL_chatBannedRights26.send_videos = z42;
                                            tL_chatBannedRights26.send_stickers = z42;
                                            tL_chatBannedRights26.send_gifs = z42;
                                            tL_chatBannedRights26.send_games = z42;
                                            tL_chatBannedRights26.send_inline = z42;
                                            tL_chatBannedRights26.send_audios = z42;
                                            tL_chatBannedRights26.send_docs = z42;
                                            tL_chatBannedRights26.send_voices = z42;
                                            tL_chatBannedRights26.send_roundvideos = z42;
                                            tL_chatBannedRights26.embed_links = z42;
                                            tL_chatBannedRights26.send_polls = z42;
                                            tL_chatBannedRights26.send_reactions = z42;
                                            org.telegram.messenger.g0.b4(mpVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar2.getParentActivity());
                                            String M0 = org.telegram.messenger.id.M0(2131743719, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                            u1Var.R = M0;
                                            u1Var.T = org.telegram.messenger.id.M0(2131743717, null);
                                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                            u1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (q8Var2.isEnabled()) {
                                        boolean z43 = q8Var2.d.h;
                                        q8Var2.setChecked(z43);
                                        mp mpVar3 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = mpVar3.M;
                                        boolean z44 = !z43;
                                        tL_chatAdminRights40.post_messages = z44;
                                        tL_chatAdminRights40.edit_messages = z44;
                                        tL_chatAdminRights40.delete_messages = z44;
                                        org.telegram.messenger.g0.b4(mpVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (q8Var2.isEnabled()) {
                                        boolean z45 = q8Var2.d.h;
                                        q8Var2.setChecked(z45);
                                        mp mpVar4 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = mpVar4.M;
                                        boolean z46 = !z45;
                                        tL_chatAdminRights41.post_stories = z46;
                                        tL_chatAdminRights41.edit_stories = z46;
                                        tL_chatAdminRights41.delete_stories = z46;
                                        org.telegram.messenger.g0.b4(mpVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.recaptcha.internal.a.i(i53, "/3"), !mpVar.O0);
                } else if (i7 == mpVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = mpVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i55 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i55 = r52 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights40.delete_stories) {
                        i56 = i55 + 1;
                    }
                    q8Var.d(org.telegram.messenger.id.L0(2131752381), i56 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final int i57 = 2;
                    q8Var.a(new Runnable(this) { // from class: org.telegram.ui.kp
                        public final /* synthetic */ lp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i522 = i57;
                            org.telegram.ui.Cells.q8 q8Var2 = q8Var;
                            lp lpVar = this.b;
                            switch (i522) {
                                case 0:
                                    mp mpVar2 = lpVar.e;
                                    if (q8Var2.isEnabled()) {
                                        if (!mp.q0(mpVar2)) {
                                            boolean z42 = q8Var2.d.h;
                                            q8Var2.setChecked(!z42);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar2.O;
                                            tL_chatBannedRights26.send_media = z42;
                                            tL_chatBannedRights26.send_photos = z42;
                                            tL_chatBannedRights26.send_videos = z42;
                                            tL_chatBannedRights26.send_stickers = z42;
                                            tL_chatBannedRights26.send_gifs = z42;
                                            tL_chatBannedRights26.send_games = z42;
                                            tL_chatBannedRights26.send_inline = z42;
                                            tL_chatBannedRights26.send_audios = z42;
                                            tL_chatBannedRights26.send_docs = z42;
                                            tL_chatBannedRights26.send_voices = z42;
                                            tL_chatBannedRights26.send_roundvideos = z42;
                                            tL_chatBannedRights26.embed_links = z42;
                                            tL_chatBannedRights26.send_polls = z42;
                                            tL_chatBannedRights26.send_reactions = z42;
                                            org.telegram.messenger.g0.b4(mpVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar2.getParentActivity());
                                            String M0 = org.telegram.messenger.id.M0(2131743719, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                            u1Var.R = M0;
                                            u1Var.T = org.telegram.messenger.id.M0(2131743717, null);
                                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                            u1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (q8Var2.isEnabled()) {
                                        boolean z43 = q8Var2.d.h;
                                        q8Var2.setChecked(z43);
                                        mp mpVar3 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = mpVar3.M;
                                        boolean z44 = !z43;
                                        tL_chatAdminRights402.post_messages = z44;
                                        tL_chatAdminRights402.edit_messages = z44;
                                        tL_chatAdminRights402.delete_messages = z44;
                                        org.telegram.messenger.g0.b4(mpVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (q8Var2.isEnabled()) {
                                        boolean z45 = q8Var2.d.h;
                                        q8Var2.setChecked(z45);
                                        mp mpVar4 = lpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = mpVar4.M;
                                        boolean z46 = !z45;
                                        tL_chatAdminRights41.post_stories = z46;
                                        tL_chatAdminRights41.edit_stories = z46;
                                        tL_chatAdminRights41.delete_stories = z46;
                                        org.telegram.messenger.g0.b4(mpVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.recaptcha.internal.a.i(i56, "/3"), !mpVar.T0);
                } else if (i7 == mpVar.W) {
                    q8Var.c(org.telegram.messenger.id.L0(2131748696), mpVar.K, true);
                    tL_chatAdminRights38 = mpVar.N;
                    q8Var.setIcon((tL_chatAdminRights38.add_admins || z41) ? 0 : R.drawable.permission_locked);
                } else if (i7 == mpVar.X) {
                    i42 = mpVar.D;
                    if (i42 != 0) {
                        i44 = mpVar.D;
                        if (i44 != 2) {
                            i45 = mpVar.D;
                            if (i45 == 1) {
                                String L03 = org.telegram.messenger.id.L0(z37 ? 2131751967 : 2131743716);
                                tL_chatBannedRights18 = mpVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = mpVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z35 = true;
                                        q8Var.c(L03, z35, mpVar.m0 == -1);
                                        tL_chatBannedRights19 = mpVar.P;
                                        q8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z35 = false;
                                q8Var.c(L03, z35, mpVar.m0 == -1);
                                tL_chatBannedRights19 = mpVar.P;
                                q8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z37) {
                        String L04 = org.telegram.messenger.id.L0(2131751967);
                        if (z40) {
                            tL_chatAdminRights37 = mpVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z34 = true;
                                q8Var.c(L04, z34, true);
                            }
                        }
                        z34 = false;
                        q8Var.c(L04, z34, true);
                    } else if (z38) {
                        String L05 = org.telegram.messenger.id.L0(2131751324);
                        if (z40) {
                            tL_chatAdminRights35 = mpVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z33 = true;
                                q8Var.c(L05, z33, true);
                            }
                        }
                        z33 = false;
                        q8Var.c(L05, z33, true);
                    } else {
                        String L06 = org.telegram.messenger.id.L0(2131751323);
                        if (z40) {
                            tL_chatAdminRights34 = mpVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = mpVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z32 = false;
                            q8Var.c(L06, z32, true);
                        }
                        z32 = true;
                        q8Var.c(L06, z32, true);
                    }
                    i43 = mpVar.D;
                    if (i43 == 2) {
                        tL_chatAdminRights36 = mpVar.N;
                        q8Var.setIcon((tL_chatAdminRights36.change_info || z41) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == mpVar.Y) {
                    String L07 = org.telegram.messenger.id.L0(2131751312);
                    if (z40) {
                        tL_chatAdminRights33 = mpVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z31 = true;
                            q8Var.c(L07, z31, true);
                            i41 = mpVar.D;
                            if (i41 == 2) {
                                tL_chatAdminRights32 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights32.post_messages || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z31 = false;
                    q8Var.c(L07, z31, true);
                    i41 = mpVar.D;
                    if (i41 == 2) {
                    }
                } else if (i7 == mpVar.a0) {
                    user8 = mpVar.w;
                    if (org.telegram.messenger.t10.t(user8)) {
                        String L08 = org.telegram.messenger.id.L0(z38 ? 2131751327 : 2131751326);
                        if (z40) {
                            tL_chatAdminRights31 = mpVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z30 = true;
                                q8Var.c(L08, z30, true);
                            }
                        }
                        z30 = false;
                        q8Var.c(L08, z30, true);
                    } else {
                        String L09 = org.telegram.messenger.id.L0(2131751290);
                        if (z40) {
                            tL_chatAdminRights29 = mpVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z29 = true;
                                q8Var.c(L09, z29, true);
                            }
                        }
                        z29 = false;
                        q8Var.c(L09, z29, true);
                    }
                    i40 = mpVar.D;
                    if (i40 == 2) {
                        tL_chatAdminRights30 = mpVar.N;
                        q8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z41) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == mpVar.Z) {
                    String L010 = org.telegram.messenger.id.L0(2131751314);
                    if (z40) {
                        tL_chatAdminRights28 = mpVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z28 = true;
                            q8Var.c(L010, z28, true);
                            i39 = mpVar.D;
                            if (i39 == 2) {
                                tL_chatAdminRights27 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    q8Var.c(L010, z28, true);
                    i39 = mpVar.D;
                    if (i39 == 2) {
                    }
                } else if (i7 == mpVar.b0) {
                    String L011 = org.telegram.messenger.id.L0(2131751319);
                    if (z40) {
                        tL_chatAdminRights26 = mpVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z27 = true;
                            q8Var.c(L011, z27, true);
                            i38 = mpVar.D;
                            if (i38 == 2) {
                                tL_chatAdminRights25 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights25.edit_messages || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z27 = false;
                    q8Var.c(L011, z27, true);
                    i38 = mpVar.D;
                    if (i38 == 2) {
                    }
                } else if (i7 == mpVar.c0) {
                    if (z38) {
                        String L012 = org.telegram.messenger.id.L0(2131751321);
                        if (z40) {
                            tL_chatAdminRights24 = mpVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z26 = true;
                                q8Var.c(L012, z26, true);
                            }
                        }
                        z26 = false;
                        q8Var.c(L012, z26, true);
                    } else {
                        String L013 = org.telegram.messenger.id.L0(2131751316);
                        if (z40) {
                            tL_chatAdminRights22 = mpVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z25 = true;
                                q8Var.c(L013, z25, true);
                            }
                        }
                        z25 = false;
                        q8Var.c(L013, z25, true);
                    }
                    i37 = mpVar.D;
                    if (i37 == 2) {
                        tL_chatAdminRights23 = mpVar.N;
                        q8Var.setIcon((tL_chatAdminRights23.delete_messages || z41) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == mpVar.d0) {
                    String L014 = org.telegram.messenger.id.L0(2131751331);
                    if (z40) {
                        tL_chatAdminRights21 = mpVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z24 = true;
                            q8Var.c(L014, z24, (mpVar.f0 == -1 && z38) || mpVar.e0 != -1);
                            i36 = mpVar.D;
                            if (i36 == 2) {
                                tL_chatAdminRights20 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights20.add_admins || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    q8Var.c(L014, z24, (mpVar.f0 == -1 && z38) || mpVar.e0 != -1);
                    i36 = mpVar.D;
                    if (i36 == 2) {
                    }
                } else if (i7 == mpVar.e0) {
                    String L015 = org.telegram.messenger.id.L0(2131751303);
                    if (z40) {
                        tL_chatAdminRights19 = mpVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z23 = true;
                            q8Var.c(L015, z23, mpVar.m0 == -1 || z36);
                            i35 = mpVar.D;
                            if (i35 == 2) {
                                tL_chatAdminRights18 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights18.anonymous || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z23 = false;
                    q8Var.c(L015, z23, mpVar.m0 == -1 || z36);
                    i35 = mpVar.D;
                    if (i35 == 2) {
                    }
                } else if (i7 == mpVar.k0) {
                    String L016 = org.telegram.messenger.id.L0(2131751310);
                    if (mpVar.y != null) {
                        user6 = mpVar.w;
                        if (user6 != null) {
                            long j3 = mpVar.r ? mpVar.n : mpVar.y.guard_bot_id;
                            user7 = mpVar.w;
                            if (j3 == user7.id) {
                                z22 = true;
                                q8Var.c(L016, z22, false);
                                i34 = mpVar.D;
                                if (i34 == 2) {
                                    q8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z22 = false;
                    q8Var.c(L016, z22, false);
                    i34 = mpVar.D;
                    if (i34 == 2) {
                    }
                } else if (i7 == mpVar.f0) {
                    String L017 = org.telegram.messenger.id.L0(z37 ? 2131751968 : 2131751328);
                    if (z40) {
                        tL_chatAdminRights17 = mpVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z21 = true;
                            q8Var.c(L017, z21, !z37);
                            i33 = mpVar.D;
                            if (i33 == 2) {
                                tL_chatAdminRights16 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights16.ban_users || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    q8Var.c(L017, z21, !z37);
                    i33 = mpVar.D;
                    if (i33 == 2) {
                    }
                } else if (i7 == mpVar.n0) {
                    String L018 = org.telegram.messenger.id.L0(2131751966);
                    if (z40) {
                        tL_chatAdminRights15 = mpVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z20 = true;
                            q8Var.c(L018, z20, true);
                            i32 = mpVar.D;
                            if (i32 == 2) {
                                tL_chatAdminRights14 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    q8Var.c(L018, z20, true);
                    i32 = mpVar.D;
                    if (i32 == 2) {
                    }
                } else if (i7 == mpVar.K0) {
                    String L019 = org.telegram.messenger.id.L0(2131744901);
                    if (z40) {
                        tL_chatAdminRights13 = mpVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z19 = true;
                            q8Var.c(L019, z19, true);
                            i31 = mpVar.D;
                            if (i31 == 2) {
                                tL_chatAdminRights12 = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights12.manage_call || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z19 = false;
                    q8Var.c(L019, z19, true);
                    i31 = mpVar.D;
                    if (i31 == 2) {
                    }
                } else if (i7 == mpVar.m0) {
                    i28 = mpVar.D;
                    if (i28 == 0) {
                        String L020 = org.telegram.messenger.id.L0(2131748692);
                        if (z40) {
                            tL_chatAdminRights11 = mpVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z18 = true;
                                q8Var.c(L020, z18, z36);
                            }
                        }
                        z18 = false;
                        q8Var.c(L020, z18, z36);
                    } else {
                        i29 = mpVar.D;
                        if (i29 == 1) {
                            String L021 = org.telegram.messenger.id.L0(2131751700);
                            tL_chatBannedRights14 = mpVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = mpVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z17 = true;
                                    q8Var.c(L021, z17, z36);
                                    tL_chatBannedRights15 = mpVar.P;
                                    q8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z17 = false;
                            q8Var.c(L021, z17, z36);
                            tL_chatBannedRights15 = mpVar.P;
                            q8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i30 = mpVar.D;
                            if (i30 == 2) {
                                String L022 = org.telegram.messenger.id.L0(2131748692);
                                if (z40) {
                                    tL_chatAdminRights10 = mpVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z16 = true;
                                        q8Var.c(L022, z16, z36);
                                        tL_chatAdminRights9 = mpVar.N;
                                        q8Var.setIcon((!tL_chatAdminRights9.manage_topics || z41) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z16 = false;
                                q8Var.c(L022, z16, z36);
                                tL_chatAdminRights9 = mpVar.N;
                                q8Var.setIcon((!tL_chatAdminRights9.manage_topics || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i7 == mpVar.g0) {
                    i25 = mpVar.D;
                    if (i25 == 0) {
                        chat2 = mpVar.x;
                        if (org.telegram.messenger.t3.P(3, chat2)) {
                            String L023 = org.telegram.messenger.id.L0(2131751330);
                            tL_chatAdminRights8 = mpVar.M;
                            q8Var.c(L023, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String L024 = org.telegram.messenger.id.L0(2131751329);
                            tL_chatAdminRights7 = mpVar.M;
                            q8Var.c(L024, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i26 = mpVar.D;
                        if (i26 == 1) {
                            String L025 = org.telegram.messenger.id.L0(2131743711);
                            tL_chatBannedRights11 = mpVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = mpVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z15 = true;
                                    q8Var.c(L025, z15, true);
                                    tL_chatBannedRights12 = mpVar.P;
                                    q8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z15 = false;
                            q8Var.c(L025, z15, true);
                            tL_chatBannedRights12 = mpVar.P;
                            q8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i27 = mpVar.D;
                            if (i27 == 2) {
                                String L026 = org.telegram.messenger.id.L0(2131751329);
                                if (z40) {
                                    tL_chatAdminRights6 = mpVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z14 = true;
                                        q8Var.c(L026, z14, true);
                                        tL_chatAdminRights5 = mpVar.N;
                                        q8Var.setIcon((!tL_chatAdminRights5.invite_users || z41) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z14 = false;
                                q8Var.c(L026, z14, true);
                                tL_chatAdminRights5 = mpVar.N;
                                q8Var.setIcon((!tL_chatAdminRights5.invite_users || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i7 == mpVar.h0) {
                    i21 = mpVar.D;
                    if (i21 != 0) {
                        i23 = mpVar.D;
                        if (i23 != 2) {
                            i24 = mpVar.D;
                            if (i24 == 1) {
                                String L027 = org.telegram.messenger.id.L0(2131743692);
                                tL_chatBannedRights8 = mpVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = mpVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z13 = true;
                                        q8Var.c(L027, z13, true);
                                        tL_chatBannedRights9 = mpVar.P;
                                        q8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z13 = false;
                                q8Var.c(L027, z13, true);
                                tL_chatBannedRights9 = mpVar.P;
                                q8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String L028 = org.telegram.messenger.id.L0(2131751313);
                    if (z40) {
                        tL_chatAdminRights4 = mpVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = mpVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z12 = false;
                        q8Var.c(L028, z12, true);
                        i22 = mpVar.D;
                        if (i22 == 2) {
                            tL_chatAdminRights3 = mpVar.N;
                            q8Var.setIcon((tL_chatAdminRights3.pin_messages || z41) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z12 = true;
                    q8Var.c(L028, z12, true);
                    i22 = mpVar.D;
                    if (i22 == 2) {
                    }
                } else if (i7 == mpVar.i0) {
                    i17 = mpVar.D;
                    if (i17 != 0) {
                        i19 = mpVar.D;
                        if (i19 != 2) {
                            i20 = mpVar.D;
                            if (i20 == 1) {
                                String L029 = org.telegram.messenger.id.L0(2131743713);
                                tL_chatBannedRights4 = mpVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = mpVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z11 = true;
                                        q8Var.c(L029, z11, true);
                                        tL_chatBannedRights5 = mpVar.P;
                                        q8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z11 = false;
                                q8Var.c(L029, z11, true);
                                tL_chatBannedRights5 = mpVar.P;
                                q8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String L030 = org.telegram.messenger.id.L0(2131751317);
                    if (z40) {
                        tL_chatAdminRights2 = mpVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z10 = true;
                            q8Var.c(L030, z10, true);
                            i18 = mpVar.D;
                            if (i18 == 2) {
                                tL_chatAdminRights = mpVar.N;
                                q8Var.setIcon((tL_chatAdminRights.manage_ranks || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z10 = false;
                    q8Var.c(L030, z10, true);
                    i18 = mpVar.D;
                    if (i18 == 2) {
                    }
                } else if (i7 == mpVar.y0) {
                    String L031 = org.telegram.messenger.id.L0(2131743691);
                    tL_chatBannedRights = mpVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = mpVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z9 = true;
                            q8Var.c(L031, z9, true);
                            tL_chatBannedRights2 = mpVar.P;
                            q8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z9 = false;
                    q8Var.c(L031, z9, true);
                    tL_chatBannedRights2 = mpVar.P;
                    q8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i46 = mpVar.D;
                if (i46 != 2 && i7 == mpVar.y0) {
                    tL_chatBannedRights21 = mpVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = mpVar.P;
                        break;
                    }
                    z39 = false;
                    q8Var.setEnabled(z39);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                if (i47 != 2 || (i7 != mpVar.o0 && i7 != mpVar.w0)) {
                    y6Var.setAlpha(1.0f);
                    break;
                } else {
                    y6Var.setAlpha(mpVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i7 == mpVar.M0) {
                    int i58 = mpVar.O.until_date;
                    x8Var.c(org.telegram.messenger.id.M0(2131743714, null), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? org.telegram.messenger.id.M0(2131743684, null) : org.telegram.messenger.id.v(mpVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                String M0 = (org.telegram.messenger.t10.B(mpVar.w) && mpVar.x.creator) ? org.telegram.messenger.id.M0(2131752423, null) : org.telegram.messenger.id.M0(2131752520, null);
                this.d = true;
                a6Var.getTextView().setEnabled(mpVar.I || mpVar.x.creator);
                a6Var.getTextView().setSingleLine(true);
                a6Var.getTextView().setImeOptions(6);
                a6Var.n(mpVar.S, M0, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                boolean z42 = c2Var.getTag() != null && ((Integer) c2Var.getTag()).intValue() == i7;
                c2Var.setTag(Integer.valueOf(i7));
                if (i7 != mpVar.H0) {
                    if (i7 != mpVar.J0) {
                        if (i7 != mpVar.I0) {
                            if (i7 != mpVar.B0) {
                                if (i7 != mpVar.C0) {
                                    if (i7 != mpVar.j0) {
                                        if (i7 != mpVar.D0) {
                                            if (i7 != mpVar.E0) {
                                                if (i7 != mpVar.F0) {
                                                    if (i7 != mpVar.G0) {
                                                        if (i7 != mpVar.P0) {
                                                            if (i7 != mpVar.Q0) {
                                                                if (i7 != mpVar.R0) {
                                                                    if (i7 != mpVar.U0) {
                                                                        if (i7 != mpVar.V0) {
                                                                            if (i7 == mpVar.W0) {
                                                                                c2Var.e(org.telegram.messenger.id.M0(2131751320, null), "", tL_chatAdminRights39.delete_stories, true, z42);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            c2Var.e(org.telegram.messenger.id.M0(2131751318, null), "", tL_chatAdminRights39.edit_stories, true, z42);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        c2Var.e(org.telegram.messenger.id.M0(2131751311, null), "", tL_chatAdminRights39.post_stories, true, z42);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c2Var.e(org.telegram.messenger.id.M0(2131751321, null), "", tL_chatAdminRights39.delete_messages, true, z42);
                                                                    break;
                                                                }
                                                            } else {
                                                                c2Var.e(org.telegram.messenger.id.M0(2131751319, null), "", tL_chatAdminRights39.edit_messages, true, z42);
                                                                break;
                                                            }
                                                        } else {
                                                            c2Var.e(org.telegram.messenger.id.M0(2131751312, null), "", tL_chatAdminRights39.post_messages, true, z42);
                                                            break;
                                                        }
                                                    } else {
                                                        c2Var.e(org.telegram.messenger.id.M0(2131745606, null), "", (mpVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z42);
                                                        c2Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    c2Var.e(org.telegram.messenger.id.M0(2131745603, null), "", (mpVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z42);
                                                    c2Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                c2Var.e(org.telegram.messenger.id.M0(2131745609, null), "", (mpVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z42);
                                                c2Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            c2Var.e(org.telegram.messenger.id.M0(2131745608, null), "", (mpVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z42);
                                            c2Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        c2Var.e(org.telegram.messenger.id.M0(2131743687, null), "", (mpVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        c2Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    c2Var.e(org.telegram.messenger.id.M0(2131745604, null), "", (mpVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z42);
                                    c2Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                c2Var.e(org.telegram.messenger.id.M0(2131745607, null), "", (mpVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z42);
                                c2Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            c2Var.e(org.telegram.messenger.id.M0(2131745602, null), "", (mpVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z42);
                            c2Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String M02 = org.telegram.messenger.id.M0(2131743712, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = mpVar.O;
                        c2Var.e(M02, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z42);
                        c2Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    c2Var.e(org.telegram.messenger.id.M0(2131745605, null), "", (mpVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z42);
                    c2Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.ey0) view).a(mpVar.w, mpVar.S, i47 == 0, false, new r3(this, 3));
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        Context context = this.c;
        mp mpVar = this.e;
        switch (i7) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, oaVar, null);
                view = oaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
            default:
                View w9Var = new org.telegram.ui.Cells.w9(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, w9Var, null);
                view = w9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.m6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, null);
                view = n4Var;
                break;
            case 4:
            case 9:
                View q8Var = new org.telegram.ui.Cells.q8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, q8Var, null);
                view = q8Var;
                break;
            case 5:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(context, null, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, x8Var, null);
                view = x8Var;
                break;
            case 7:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, a6Var, null);
                a6Var.b(new m0(this, 5));
                view = a6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                mpVar.d = frameLayout;
                int i11 = org.telegram.ui.ActionBar.m6.a7;
                org.telegram.ui.ActionBar.t6.h(i11, frameLayout, null);
                mpVar.e = new FrameLayout(context);
                org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, false, false);
                mpVar.f = i6Var;
                i6Var.setTypeface(org.telegram.messenger.g0.o());
                mpVar.f.setTextColor(-1);
                mpVar.f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                mpVar.f.setGravity(17);
                org.telegram.ui.Components.i6 i6Var2 = mpVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131754459, sb2, " ");
                sb2.append(org.telegram.messenger.id.M0(mpVar.K ? 2131754458 : 2131754457, null));
                i6Var2.setText(sb2.toString());
                mpVar.e.addView(mpVar.f, c8.ha.e(-2, -2, 17));
                mpVar.e.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                mpVar.e.setOnClickListener(new a(this, 14));
                mpVar.d.addView(mpVar.e, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 14.0f, 28.0f, 14.0f, 14.0f));
                mpVar.d.setLayoutParams(new v4.o0(-1, -2));
                View view2 = new View(context);
                org.telegram.ui.ActionBar.t6.h(i11, view2, null);
                mpVar.d.setClipChildren(false);
                mpVar.d.setClipToPadding(false);
                mpVar.d.addView(view2, c8.ha.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view = mpVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.c, 4, 21, false, mpVar.getResourceProvider());
                c2Var.setPad(1);
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.k7);
                c2Var.setEnabled(true);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, c2Var, null);
                view = c2Var;
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.f2) mpVar).currentAccount;
                long j3 = -mpVar.s;
                h6Var = ((org.telegram.ui.ActionBar.f2) mpVar).resourceProvider;
                view = new org.telegram.ui.Components.ey0(i10, j3, this.c, h6Var);
                break;
        }
        return new org.telegram.ui.Components.xi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        int b10 = d1Var.b();
        mp mpVar = this.e;
        if (b10 == mpVar.u0) {
            mp.k0(mpVar, d1Var.a);
        }
    }

    @Override // v4.g0
    public final void z(v4.d1 d1Var) {
        int b10 = d1Var.b();
        mp mpVar = this.e;
        if (b10 != mpVar.v0 || mpVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(mpVar.getParentActivity().getCurrentFocus());
    }
}
