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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class mp extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ np e;

    public mp(np npVar, Context context) {
        this.e = npVar;
        if (npVar.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        TLRPC.Chat chat;
        int i7 = f1Var.f;
        np npVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = npVar.Q;
        int i10 = npVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = npVar.O;
        if (!npVar.x.creator || ((i10 != 0 && (i10 != 2 || !npVar.L)) || i7 != 4 || f1Var.b() != npVar.f0)) {
            if (!npVar.J) {
                return false;
            }
            if ((i10 == 0 || i10 == 2) && i7 == 4) {
                int b10 = f1Var.b();
                if (b10 == npVar.X) {
                    if (!tL_chatAdminRights.add_admins && ((chat = npVar.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i10 == 2 && !npVar.L) {
                        return false;
                    }
                    if (b10 == npVar.Y) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !npVar.F) {
                            return false;
                        }
                    } else {
                        if (b10 == npVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == npVar.a0) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == npVar.b0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == npVar.c0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == npVar.d0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == npVar.L0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == npVar.e0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == npVar.f0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == npVar.g0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == npVar.h0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == npVar.i0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == npVar.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == npVar.n0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == npVar.V0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == npVar.W0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == npVar.X0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == npVar.o0) {
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

    @Override // v4.i0
    public final int b() {
        return this.e.W;
    }

    @Override // v4.i0
    public final long c(int i7) {
        np npVar = this.e;
        if (npVar.E != 2) {
            return -1L;
        }
        if (i7 == npVar.X) {
            return 1L;
        }
        if (i7 == npVar.Y) {
            return 2L;
        }
        if (i7 == npVar.Z) {
            return 3L;
        }
        if (i7 == npVar.c0) {
            return 4L;
        }
        if (i7 == npVar.d0) {
            return 5L;
        }
        if (i7 == npVar.e0) {
            return 6L;
        }
        if (i7 == npVar.f0) {
            return 7L;
        }
        if (i7 == npVar.g0) {
            return 8L;
        }
        if (i7 == npVar.h0) {
            return 9L;
        }
        if (i7 == npVar.i0) {
            return 10L;
        }
        if (i7 == npVar.p0) {
            return 11L;
        }
        if (i7 == npVar.q0) {
            return 12L;
        }
        if (i7 == npVar.r0) {
            return 13L;
        }
        if (i7 == npVar.s0) {
            return 14L;
        }
        if (i7 == npVar.t0) {
            return 15L;
        }
        if (i7 == npVar.u0) {
            return 16L;
        }
        if (i7 == npVar.v0) {
            return 17L;
        }
        if (i7 == npVar.w0) {
            return 18L;
        }
        if (i7 == npVar.x0) {
            return 19L;
        }
        if (i7 == npVar.z0) {
            return 20L;
        }
        if (i7 == npVar.C0) {
            return 21L;
        }
        if (i7 == npVar.I0) {
            return 22L;
        }
        if (i7 == npVar.J0) {
            return 23L;
        }
        if (i7 == npVar.K0) {
            return 24L;
        }
        if (i7 == npVar.L0) {
            return 25L;
        }
        if (i7 == npVar.M0) {
            return 26L;
        }
        if (i7 == npVar.N0) {
            return 27L;
        }
        if (i7 == npVar.y0) {
            return 28L;
        }
        if (i7 == npVar.n0) {
            return 29L;
        }
        if (i7 == npVar.D0) {
            return 30L;
        }
        if (i7 == npVar.F0) {
            return 31L;
        }
        if (i7 == npVar.E0) {
            return 32L;
        }
        if (i7 == npVar.G0) {
            return 33L;
        }
        if (i7 == npVar.H0) {
            return 34L;
        }
        if (i7 == npVar.A0) {
            return 35L;
        }
        if (i7 == npVar.O0) {
            return 36L;
        }
        if (i7 == npVar.Q0) {
            return 37L;
        }
        if (i7 == npVar.R0) {
            return 38L;
        }
        if (i7 == npVar.S0) {
            return 39L;
        }
        if (i7 == npVar.T0) {
            return 40L;
        }
        if (i7 == npVar.V0) {
            return 41L;
        }
        if (i7 == npVar.W0) {
            return 42L;
        }
        if (i7 == npVar.X0) {
            return 43L;
        }
        if (i7 == npVar.a0) {
            return 44L;
        }
        if (i7 == npVar.j0) {
            return 45L;
        }
        if (i7 == npVar.k0) {
            return 46L;
        }
        if (i7 == npVar.l0) {
            return 47L;
        }
        if (i7 == npVar.m0) {
            return 48L;
        }
        if (i7 == npVar.o0) {
            return 49L;
        }
        return i7 == npVar.b0 ? 50L : 0L;
    }

    @Override // v4.i0
    public final int d(int i7) {
        np npVar = this.e;
        if (i7 == npVar.I0 || i7 == npVar.K0 || i7 == npVar.J0 || i7 == npVar.C0 || i7 == npVar.D0 || i7 == npVar.F0 || i7 == npVar.E0 || i7 == npVar.H0 || i7 == npVar.G0 || i7 == npVar.k0 || i7 == npVar.Q0 || i7 == npVar.R0 || i7 == npVar.S0 || i7 == npVar.V0 || i7 == npVar.W0 || i7 == npVar.X0) {
            return 10;
        }
        if (i7 == npVar.A0 || i7 == npVar.O0 || i7 == npVar.T0) {
            return 9;
        }
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1 || i7 == npVar.p0 || i7 == npVar.r0 || i7 == npVar.M0 || i7 == npVar.t0) {
            return 5;
        }
        if (i7 == 2 || i7 == npVar.v0) {
            return 3;
        }
        if (i7 == npVar.Y || i7 == npVar.Z || i7 == npVar.a0 || i7 == npVar.c0 || i7 == npVar.d0 || i7 == npVar.e0 || i7 == npVar.g0 || i7 == npVar.h0 || i7 == npVar.i0 || i7 == npVar.j0 || i7 == npVar.z0 || i7 == npVar.f0 || i7 == npVar.L0 || i7 == npVar.X || i7 == npVar.n0 || i7 == npVar.l0 || i7 == npVar.o0 || i7 == npVar.b0) {
            return 4;
        }
        if (i7 == npVar.s0 || i7 == npVar.x0 || i7 == npVar.m0) {
            return 1;
        }
        if (i7 == npVar.N0) {
            return 6;
        }
        if (i7 == npVar.w0) {
            return 11;
        }
        return i7 == npVar.y0 ? 8 : 2;
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        String M0;
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
        np npVar = this.e;
        int i47 = npVar.E;
        boolean z37 = npVar.V;
        boolean z38 = npVar.G;
        boolean z39 = npVar.F;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = npVar.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = npVar.Q;
        int i48 = f1Var.f;
        View view = f1Var.a;
        switch (i48) {
            case 0:
                org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
                i10 = npVar.E;
                String M02 = i10 == 2 ? org.telegram.messenger.hd.M0(2131753153) : null;
                user = npVar.w;
                qaVar.a(M02, user);
                break;
            case 1:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 == npVar.m0) {
                    a9Var.setText(org.telegram.messenger.hd.M0(2131751297));
                    break;
                } else if (i7 == npVar.s0) {
                    a9Var.setText(org.telegram.messenger.hd.M0(2131751313));
                    break;
                } else if (i7 == npVar.x0) {
                    user2 = npVar.w;
                    if (org.telegram.messenger.p10.C(user2)) {
                        chat = npVar.x;
                        if (chat.creator) {
                            M0 = org.telegram.messenger.hd.M0(2131752411);
                            i11 = npVar.E;
                            if (i11 != 0) {
                                Z = org.telegram.messenger.hd.Z(2131751294, M0);
                            } else {
                                user3 = npVar.w;
                                Z = org.telegram.messenger.hd.Z(2131751264, org.telegram.messenger.p10.q(user3));
                            }
                            a9Var.setText(Z);
                            break;
                        }
                    }
                    M0 = org.telegram.messenger.hd.M0(2131752508);
                    i11 = npVar.E;
                    if (i11 != 0) {
                    }
                    a9Var.setText(Z);
                }
                break;
            case 2:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                if (i7 != npVar.q0) {
                    if (i7 == npVar.u0) {
                        TextView textView = x9Var.getTextView();
                        int i49 = org.telegram.ui.ActionBar.m6.G6;
                        org.telegram.ui.ActionBar.t6.U(textView, i49, null);
                        x9Var.setTag(Integer.valueOf(i49));
                        if (!z39) {
                            x9Var.b(org.telegram.messenger.hd.M0(2131751303), false);
                            break;
                        } else {
                            x9Var.b(org.telegram.messenger.hd.M0(2131751310), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = x9Var.getTextView();
                    int i50 = org.telegram.ui.ActionBar.m6.p7;
                    org.telegram.ui.ActionBar.t6.U(textView2, i50, null);
                    x9Var.setTag(Integer.valueOf(i50));
                    i12 = npVar.E;
                    if (i12 != 0) {
                        i13 = npVar.E;
                        if (i13 == 1) {
                            x9Var.b(org.telegram.messenger.hd.M0(2131743479), false);
                            break;
                        }
                    } else {
                        x9Var.b(org.telegram.messenger.hd.M0(2131751293), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 != 2) {
                    if (i7 == npVar.v0) {
                        o4Var.setText(org.telegram.messenger.hd.M0(2131751295));
                        break;
                    }
                } else {
                    i14 = npVar.E;
                    if (i14 != 2) {
                        user4 = npVar.w;
                        if (user4 != null) {
                            user5 = npVar.w;
                            break;
                        }
                        i15 = npVar.E;
                        if (i15 != 0) {
                            i16 = npVar.E;
                            if (i16 == 1) {
                                o4Var.setText(org.telegram.messenger.hd.M0(2131743478));
                                break;
                            }
                        } else {
                            o4Var.setText(org.telegram.messenger.hd.M0(2131751277));
                            break;
                        }
                    }
                    o4Var.setText(org.telegram.messenger.hd.M0(2131752977));
                    break;
                }
                break;
            case 4:
            case 9:
                boolean z40 = true;
                final org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                boolean z41 = i47 != 2 || npVar.L;
                TLRPC.Chat chat3 = npVar.x;
                boolean z42 = chat3 != null && chat3.creator;
                if (i7 == npVar.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = npVar.Q;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = npVar.P;
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
                    r8Var.d(org.telegram.messenger.hd.N0(2131743445, null), i51 > 0, true, true);
                    Locale locale = Locale.US;
                    r8Var.a(new Runnable(this) { // from class: org.telegram.ui.lp
                        public final /* synthetic */ mp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i52 = r3;
                            org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                            mp mpVar = this.b;
                            switch (i52) {
                                case 0:
                                    np npVar2 = mpVar.e;
                                    if (r8Var2.isEnabled()) {
                                        if (!np.q0(npVar2)) {
                                            boolean z43 = r8Var2.d.h;
                                            r8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = npVar2.P;
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
                                            org.telegram.messenger.g0.Z3(npVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar2.getParentActivity());
                                            String N0 = org.telegram.messenger.hd.N0(2131743474, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                            t1Var.S = N0;
                                            t1Var.U = org.telegram.messenger.hd.N0(2131743472, null);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                            t1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (r8Var2.isEnabled()) {
                                        boolean z44 = r8Var2.d.h;
                                        r8Var2.setChecked(z44);
                                        np npVar3 = mpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = npVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        org.telegram.messenger.g0.Z3(npVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (r8Var2.isEnabled()) {
                                        boolean z46 = r8Var2.d.h;
                                        r8Var2.setChecked(z46);
                                        np npVar4 = mpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = npVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.g0.Z3(npVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.gms.internal.vision.e2.i(i51, "/10"), !npVar.B0);
                    r8Var.setIcon(np.q0(npVar) ? R.drawable.permission_locked : 0);
                } else if (i7 == npVar.O0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i52 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i52 = r42 + 1;
                    }
                    int i53 = i52;
                    if (tL_chatAdminRights39.delete_messages) {
                        i53 = i52 + 1;
                    }
                    r8Var.d(org.telegram.messenger.hd.N0(2131752370, null), i53 > 0, true, true);
                    Locale locale2 = Locale.US;
                    final int i54 = 1;
                    r8Var.a(new Runnable(this) { // from class: org.telegram.ui.lp
                        public final /* synthetic */ mp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i522 = i54;
                            org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                            mp mpVar = this.b;
                            switch (i522) {
                                case 0:
                                    np npVar2 = mpVar.e;
                                    if (r8Var2.isEnabled()) {
                                        if (!np.q0(npVar2)) {
                                            boolean z43 = r8Var2.d.h;
                                            r8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = npVar2.P;
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
                                            org.telegram.messenger.g0.Z3(npVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar2.getParentActivity());
                                            String N0 = org.telegram.messenger.hd.N0(2131743474, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                            t1Var.S = N0;
                                            t1Var.U = org.telegram.messenger.hd.N0(2131743472, null);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                            t1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (r8Var2.isEnabled()) {
                                        boolean z44 = r8Var2.d.h;
                                        r8Var2.setChecked(z44);
                                        np npVar3 = mpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = npVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        org.telegram.messenger.g0.Z3(npVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (r8Var2.isEnabled()) {
                                        boolean z46 = r8Var2.d.h;
                                        r8Var2.setChecked(z46);
                                        np npVar4 = mpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = npVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.g0.Z3(npVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.gms.internal.vision.e2.i(i53, "/3"), !npVar.P0);
                } else if (i7 == npVar.T0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = npVar.N;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i55 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i55 = r52 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights40.delete_stories) {
                        i56 = i55 + 1;
                    }
                    r8Var.d(org.telegram.messenger.hd.M0(2131752369), i56 > 0, true, true);
                    Locale locale3 = Locale.US;
                    final int i57 = 2;
                    r8Var.a(new Runnable(this) { // from class: org.telegram.ui.lp
                        public final /* synthetic */ mp b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i522 = i57;
                            org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                            mp mpVar = this.b;
                            switch (i522) {
                                case 0:
                                    np npVar2 = mpVar.e;
                                    if (r8Var2.isEnabled()) {
                                        if (!np.q0(npVar2)) {
                                            boolean z43 = r8Var2.d.h;
                                            r8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = npVar2.P;
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
                                            org.telegram.messenger.g0.Z3(npVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar2.getParentActivity());
                                            String N0 = org.telegram.messenger.hd.N0(2131743474, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                            t1Var.S = N0;
                                            t1Var.U = org.telegram.messenger.hd.N0(2131743472, null);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                            t1Var.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    if (r8Var2.isEnabled()) {
                                        boolean z44 = r8Var2.d.h;
                                        r8Var2.setChecked(z44);
                                        np npVar3 = mpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = npVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        org.telegram.messenger.g0.Z3(npVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    if (r8Var2.isEnabled()) {
                                        boolean z46 = r8Var2.d.h;
                                        r8Var2.setChecked(z46);
                                        np npVar4 = mpVar.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = npVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        org.telegram.messenger.g0.Z3(npVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, com.google.android.gms.internal.vision.e2.i(i56, "/3"), !npVar.U0);
                } else if (i7 == npVar.X) {
                    r8Var.c(org.telegram.messenger.hd.M0(2131748503), npVar.L, true);
                    tL_chatAdminRights38 = npVar.O;
                    r8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i7 == npVar.Y) {
                    i42 = npVar.E;
                    if (i42 != 0) {
                        i44 = npVar.E;
                        if (i44 != 2) {
                            i45 = npVar.E;
                            if (i45 == 1) {
                                String M03 = org.telegram.messenger.hd.M0(z38 ? 2131751955 : 2131743471);
                                tL_chatBannedRights18 = npVar.P;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = npVar.Q;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        r8Var.c(M03, z36, npVar.n0 == -1);
                                        tL_chatBannedRights19 = npVar.Q;
                                        r8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                r8Var.c(M03, z36, npVar.n0 == -1);
                                tL_chatBannedRights19 = npVar.Q;
                                r8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String M04 = org.telegram.messenger.hd.M0(2131751955);
                        if (z41) {
                            tL_chatAdminRights37 = npVar.N;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                r8Var.c(M04, z35, true);
                            }
                        }
                        z35 = false;
                        r8Var.c(M04, z35, true);
                    } else if (z39) {
                        String M05 = org.telegram.messenger.hd.M0(2131751312);
                        if (z41) {
                            tL_chatAdminRights35 = npVar.N;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                r8Var.c(M05, z34, true);
                            }
                        }
                        z34 = false;
                        r8Var.c(M05, z34, true);
                    } else {
                        String M06 = org.telegram.messenger.hd.M0(2131751311);
                        if (z41) {
                            tL_chatAdminRights34 = npVar.N;
                            break;
                        }
                        tL_chatBannedRights17 = npVar.Q;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            r8Var.c(M06, z33, true);
                        }
                        z33 = true;
                        r8Var.c(M06, z33, true);
                    }
                    i43 = npVar.E;
                    if (i43 == 2) {
                        tL_chatAdminRights36 = npVar.O;
                        r8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == npVar.Z) {
                    String M07 = org.telegram.messenger.hd.M0(2131751300);
                    if (z41) {
                        tL_chatAdminRights33 = npVar.N;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            r8Var.c(M07, z32, true);
                            i41 = npVar.E;
                            if (i41 == 2) {
                                tL_chatAdminRights32 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    r8Var.c(M07, z32, true);
                    i41 = npVar.E;
                    if (i41 == 2) {
                    }
                } else if (i7 == npVar.b0) {
                    user8 = npVar.w;
                    if (org.telegram.messenger.p10.u(user8)) {
                        String M08 = org.telegram.messenger.hd.M0(z39 ? 2131751315 : 2131751314);
                        if (z41) {
                            tL_chatAdminRights31 = npVar.N;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                r8Var.c(M08, z31, true);
                            }
                        }
                        z31 = false;
                        r8Var.c(M08, z31, true);
                    } else {
                        String M09 = org.telegram.messenger.hd.M0(2131751278);
                        if (z41) {
                            tL_chatAdminRights29 = npVar.N;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                r8Var.c(M09, z30, true);
                            }
                        }
                        z30 = false;
                        r8Var.c(M09, z30, true);
                    }
                    i40 = npVar.E;
                    if (i40 == 2) {
                        tL_chatAdminRights30 = npVar.O;
                        r8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == npVar.a0) {
                    String M010 = org.telegram.messenger.hd.M0(2131751302);
                    if (z41) {
                        tL_chatAdminRights28 = npVar.N;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            r8Var.c(M010, z29, true);
                            i39 = npVar.E;
                            if (i39 == 2) {
                                tL_chatAdminRights27 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    r8Var.c(M010, z29, true);
                    i39 = npVar.E;
                    if (i39 == 2) {
                    }
                } else if (i7 == npVar.c0) {
                    String M011 = org.telegram.messenger.hd.M0(2131751307);
                    if (z41) {
                        tL_chatAdminRights26 = npVar.N;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            r8Var.c(M011, z28, true);
                            i38 = npVar.E;
                            if (i38 == 2) {
                                tL_chatAdminRights25 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    r8Var.c(M011, z28, true);
                    i38 = npVar.E;
                    if (i38 == 2) {
                    }
                } else if (i7 == npVar.d0) {
                    if (z39) {
                        String M012 = org.telegram.messenger.hd.M0(2131751309);
                        if (z41) {
                            tL_chatAdminRights24 = npVar.N;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                r8Var.c(M012, z27, true);
                            }
                        }
                        z27 = false;
                        r8Var.c(M012, z27, true);
                    } else {
                        String M013 = org.telegram.messenger.hd.M0(2131751304);
                        if (z41) {
                            tL_chatAdminRights22 = npVar.N;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                r8Var.c(M013, z26, true);
                            }
                        }
                        z26 = false;
                        r8Var.c(M013, z26, true);
                    }
                    i37 = npVar.E;
                    if (i37 == 2) {
                        tL_chatAdminRights23 = npVar.O;
                        r8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i7 == npVar.e0) {
                    String M014 = org.telegram.messenger.hd.M0(2131751319);
                    if (z41) {
                        tL_chatAdminRights21 = npVar.N;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            r8Var.c(M014, z25, (npVar.g0 == -1 && z39) || npVar.f0 != -1);
                            i36 = npVar.E;
                            if (i36 == 2) {
                                tL_chatAdminRights20 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    r8Var.c(M014, z25, (npVar.g0 == -1 && z39) || npVar.f0 != -1);
                    i36 = npVar.E;
                    if (i36 == 2) {
                    }
                } else if (i7 == npVar.f0) {
                    String M015 = org.telegram.messenger.hd.M0(2131751291);
                    if (z41) {
                        tL_chatAdminRights19 = npVar.N;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            r8Var.c(M015, z24, npVar.n0 == -1 || z37);
                            i35 = npVar.E;
                            if (i35 == 2) {
                                tL_chatAdminRights18 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    r8Var.c(M015, z24, npVar.n0 == -1 || z37);
                    i35 = npVar.E;
                    if (i35 == 2) {
                    }
                } else if (i7 == npVar.l0) {
                    String M016 = org.telegram.messenger.hd.M0(2131751298);
                    if (npVar.y != null) {
                        user6 = npVar.w;
                        if (user6 != null) {
                            long j3 = npVar.r ? npVar.n : npVar.y.guard_bot_id;
                            user7 = npVar.w;
                            if (j3 == user7.id) {
                                z23 = true;
                                r8Var.c(M016, z23, false);
                                i34 = npVar.E;
                                if (i34 == 2) {
                                    r8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    r8Var.c(M016, z23, false);
                    i34 = npVar.E;
                    if (i34 == 2) {
                    }
                } else if (i7 == npVar.g0) {
                    String M017 = org.telegram.messenger.hd.M0(z38 ? 2131751956 : 2131751316);
                    if (z41) {
                        tL_chatAdminRights17 = npVar.N;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            r8Var.c(M017, z22, !z38);
                            i33 = npVar.E;
                            if (i33 == 2) {
                                tL_chatAdminRights16 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    r8Var.c(M017, z22, !z38);
                    i33 = npVar.E;
                    if (i33 == 2) {
                    }
                } else if (i7 == npVar.o0) {
                    String M018 = org.telegram.messenger.hd.M0(2131751954);
                    if (z41) {
                        tL_chatAdminRights15 = npVar.N;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            r8Var.c(M018, z21, true);
                            i32 = npVar.E;
                            if (i32 == 2) {
                                tL_chatAdminRights14 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    r8Var.c(M018, z21, true);
                    i32 = npVar.E;
                    if (i32 == 2) {
                    }
                } else if (i7 == npVar.L0) {
                    String M019 = org.telegram.messenger.hd.M0(2131744658);
                    if (z41) {
                        tL_chatAdminRights13 = npVar.N;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            r8Var.c(M019, z20, true);
                            i31 = npVar.E;
                            if (i31 == 2) {
                                tL_chatAdminRights12 = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    r8Var.c(M019, z20, true);
                    i31 = npVar.E;
                    if (i31 == 2) {
                    }
                } else if (i7 == npVar.n0) {
                    i28 = npVar.E;
                    if (i28 == 0) {
                        String M020 = org.telegram.messenger.hd.M0(2131748499);
                        if (z41) {
                            tL_chatAdminRights11 = npVar.N;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                r8Var.c(M020, z19, z37);
                            }
                        }
                        z19 = false;
                        r8Var.c(M020, z19, z37);
                    } else {
                        i29 = npVar.E;
                        if (i29 == 1) {
                            String M021 = org.telegram.messenger.hd.M0(2131751688);
                            tL_chatBannedRights14 = npVar.P;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = npVar.Q;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    r8Var.c(M021, z18, z37);
                                    tL_chatBannedRights15 = npVar.Q;
                                    r8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            r8Var.c(M021, z18, z37);
                            tL_chatBannedRights15 = npVar.Q;
                            r8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i30 = npVar.E;
                            if (i30 == 2) {
                                String M022 = org.telegram.messenger.hd.M0(2131748499);
                                if (z41) {
                                    tL_chatAdminRights10 = npVar.N;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        r8Var.c(M022, z17, z37);
                                        tL_chatAdminRights9 = npVar.O;
                                        r8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                r8Var.c(M022, z17, z37);
                                tL_chatAdminRights9 = npVar.O;
                                r8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i7 == npVar.h0) {
                    i25 = npVar.E;
                    if (i25 == 0) {
                        chat2 = npVar.x;
                        if (org.telegram.messenger.v3.P(3, chat2)) {
                            String M023 = org.telegram.messenger.hd.M0(2131751318);
                            tL_chatAdminRights8 = npVar.N;
                            r8Var.c(M023, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String M024 = org.telegram.messenger.hd.M0(2131751317);
                            tL_chatAdminRights7 = npVar.N;
                            r8Var.c(M024, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i26 = npVar.E;
                        if (i26 == 1) {
                            String M025 = org.telegram.messenger.hd.M0(2131743466);
                            tL_chatBannedRights11 = npVar.P;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = npVar.Q;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    r8Var.c(M025, z16, true);
                                    tL_chatBannedRights12 = npVar.Q;
                                    r8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            r8Var.c(M025, z16, true);
                            tL_chatBannedRights12 = npVar.Q;
                            r8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i27 = npVar.E;
                            if (i27 == 2) {
                                String M026 = org.telegram.messenger.hd.M0(2131751317);
                                if (z41) {
                                    tL_chatAdminRights6 = npVar.N;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        r8Var.c(M026, z15, true);
                                        tL_chatAdminRights5 = npVar.O;
                                        r8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                r8Var.c(M026, z15, true);
                                tL_chatAdminRights5 = npVar.O;
                                r8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i7 == npVar.i0) {
                    i21 = npVar.E;
                    if (i21 != 0) {
                        i23 = npVar.E;
                        if (i23 != 2) {
                            i24 = npVar.E;
                            if (i24 == 1) {
                                String M027 = org.telegram.messenger.hd.M0(2131743447);
                                tL_chatBannedRights8 = npVar.P;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = npVar.Q;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        r8Var.c(M027, z14, true);
                                        tL_chatBannedRights9 = npVar.Q;
                                        r8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                r8Var.c(M027, z14, true);
                                tL_chatBannedRights9 = npVar.Q;
                                r8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String M028 = org.telegram.messenger.hd.M0(2131751301);
                    if (z41) {
                        tL_chatAdminRights4 = npVar.N;
                        break;
                    }
                    tL_chatBannedRights7 = npVar.Q;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        r8Var.c(M028, z13, true);
                        i22 = npVar.E;
                        if (i22 == 2) {
                            tL_chatAdminRights3 = npVar.O;
                            r8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    r8Var.c(M028, z13, true);
                    i22 = npVar.E;
                    if (i22 == 2) {
                    }
                } else if (i7 == npVar.j0) {
                    i17 = npVar.E;
                    if (i17 != 0) {
                        i19 = npVar.E;
                        if (i19 != 2) {
                            i20 = npVar.E;
                            if (i20 == 1) {
                                String M029 = org.telegram.messenger.hd.M0(2131743468);
                                tL_chatBannedRights4 = npVar.P;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = npVar.Q;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        r8Var.c(M029, z12, true);
                                        tL_chatBannedRights5 = npVar.Q;
                                        r8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                r8Var.c(M029, z12, true);
                                tL_chatBannedRights5 = npVar.Q;
                                r8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String M030 = org.telegram.messenger.hd.M0(2131751305);
                    if (z41) {
                        tL_chatAdminRights2 = npVar.N;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            r8Var.c(M030, z11, true);
                            i18 = npVar.E;
                            if (i18 == 2) {
                                tL_chatAdminRights = npVar.O;
                                r8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    r8Var.c(M030, z11, true);
                    i18 = npVar.E;
                    if (i18 == 2) {
                    }
                } else if (i7 == npVar.z0) {
                    String M031 = org.telegram.messenger.hd.M0(2131743446);
                    tL_chatBannedRights = npVar.P;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = npVar.Q;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            r8Var.c(M031, z10, true);
                            tL_chatBannedRights2 = npVar.Q;
                            r8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    r8Var.c(M031, z10, true);
                    tL_chatBannedRights2 = npVar.Q;
                    r8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i46 = npVar.E;
                if (i46 != 2 && i7 == npVar.z0) {
                    tL_chatBannedRights21 = npVar.P;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = npVar.Q;
                        break;
                    }
                    z40 = false;
                    r8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i47 != 2 || (i7 != npVar.p0 && i7 != npVar.x0)) {
                    z6Var.setAlpha(1.0f);
                    break;
                } else {
                    z6Var.setAlpha(npVar.K);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == npVar.N0) {
                    int i58 = npVar.P.until_date;
                    y8Var.c(org.telegram.messenger.hd.N0(2131743469, null), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? org.telegram.messenger.hd.N0(2131743439, null) : org.telegram.messenger.hd.v(npVar.P.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                String N0 = (org.telegram.messenger.p10.C(npVar.w) && npVar.x.creator) ? org.telegram.messenger.hd.N0(2131752411, null) : org.telegram.messenger.hd.N0(2131752508, null);
                this.d = true;
                b6Var.getTextView().setEnabled(npVar.J || npVar.x.creator);
                b6Var.getTextView().setSingleLine(true);
                b6Var.getTextView().setImeOptions(6);
                b6Var.o(npVar.T, N0, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                boolean z43 = d2Var.getTag() != null && ((Integer) d2Var.getTag()).intValue() == i7;
                d2Var.setTag(Integer.valueOf(i7));
                if (i7 != npVar.I0) {
                    if (i7 != npVar.K0) {
                        if (i7 != npVar.J0) {
                            if (i7 != npVar.C0) {
                                if (i7 != npVar.D0) {
                                    if (i7 != npVar.k0) {
                                        if (i7 != npVar.E0) {
                                            if (i7 != npVar.F0) {
                                                if (i7 != npVar.G0) {
                                                    if (i7 != npVar.H0) {
                                                        if (i7 != npVar.Q0) {
                                                            if (i7 != npVar.R0) {
                                                                if (i7 != npVar.S0) {
                                                                    if (i7 != npVar.V0) {
                                                                        if (i7 != npVar.W0) {
                                                                            if (i7 == npVar.X0) {
                                                                                d2Var.e(org.telegram.messenger.hd.N0(2131751308, null), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            d2Var.e(org.telegram.messenger.hd.N0(2131751306, null), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        d2Var.e(org.telegram.messenger.hd.N0(2131751299, null), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    d2Var.e(org.telegram.messenger.hd.N0(2131751309, null), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                d2Var.e(org.telegram.messenger.hd.N0(2131751307, null), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            d2Var.e(org.telegram.messenger.hd.N0(2131751300, null), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        d2Var.e(org.telegram.messenger.hd.N0(2131745410, null), "", (npVar.P.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        d2Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    d2Var.e(org.telegram.messenger.hd.N0(2131745407, null), "", (npVar.P.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    d2Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                d2Var.e(org.telegram.messenger.hd.N0(2131745413, null), "", (npVar.P.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                d2Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            d2Var.e(org.telegram.messenger.hd.N0(2131745412, null), "", (npVar.P.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            d2Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        d2Var.e(org.telegram.messenger.hd.N0(2131743442, null), "", (npVar.P.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        d2Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    d2Var.e(org.telegram.messenger.hd.N0(2131745408, null), "", (npVar.P.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    d2Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                d2Var.e(org.telegram.messenger.hd.N0(2131745411, null), "", (npVar.P.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                d2Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            d2Var.e(org.telegram.messenger.hd.N0(2131745406, null), "", (npVar.P.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            d2Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String N02 = org.telegram.messenger.hd.N0(2131743467, null);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = npVar.P;
                        d2Var.e(N02, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        d2Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    d2Var.e(org.telegram.messenger.hd.N0(2131745409, null), "", (npVar.P.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    d2Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.py0) view).a(npVar.w, npVar.T, i47 == 0, false, new r3(this, 3));
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        Context context = this.c;
        np npVar = this.e;
        switch (i7) {
            case 0:
                View qaVar = new org.telegram.ui.Cells.qa(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, qaVar, null);
                view = qaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
            default:
                View x9Var = new org.telegram.ui.Cells.x9(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, x9Var, null);
                view = x9Var;
                break;
            case 3:
                View o4Var = new org.telegram.ui.Cells.o4(this.c, org.telegram.ui.ActionBar.m6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, null);
                view = o4Var;
                break;
            case 4:
            case 9:
                View r8Var = new org.telegram.ui.Cells.r8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, r8Var, null);
                view = r8Var;
                break;
            case 5:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 6:
                View y8Var = new org.telegram.ui.Cells.y8(context, null, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, y8Var, null);
                view = y8Var;
                break;
            case 7:
                org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(context, 0, null, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, b6Var, null);
                b6Var.c(new m0(this, 5));
                view = b6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                npVar.d = frameLayout;
                int i11 = org.telegram.ui.ActionBar.m6.a7;
                org.telegram.ui.ActionBar.t6.h(i11, frameLayout, null);
                npVar.e = new FrameLayout(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                npVar.f = o6Var;
                o6Var.setTypeface(org.telegram.messenger.g0.o());
                npVar.f.setTextColor(-1);
                npVar.f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                npVar.f.setGravity(17);
                org.telegram.ui.Components.o6 o6Var2 = npVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131754456, sb2, " ");
                sb2.append(org.telegram.messenger.hd.N0(npVar.L ? 2131754455 : 2131754454, null));
                o6Var2.setText(sb2.toString());
                npVar.e.addView(npVar.f, c8.ma.e(-2, -2, 17));
                npVar.e.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
                npVar.e.setOnClickListener(new a(this, 14));
                npVar.d.addView(npVar.e, c8.ma.d(-1, 48.0f, org.telegram.messenger.ls.E1, 14.0f, 28.0f, 14.0f, 14.0f));
                npVar.d.setLayoutParams(new v4.q0(-1, -2));
                View view2 = new View(context);
                org.telegram.ui.ActionBar.t6.h(i11, view2, null);
                npVar.d.setClipChildren(false);
                npVar.d.setClipToPadding(false);
                npVar.d.addView(view2, c8.ma.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view = npVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.c, 4, 21, false, npVar.getResourceProvider());
                d2Var.setPad(1);
                d2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.k7);
                d2Var.setEnabled(true);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, d2Var, null);
                view = d2Var;
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.g2) npVar).currentAccount;
                long j3 = -npVar.s;
                h6Var = ((org.telegram.ui.ActionBar.g2) npVar).resourceProvider;
                view = new org.telegram.ui.Components.py0(i10, j3, this.c, h6Var);
                break;
        }
        return new org.telegram.ui.Components.mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int b10 = f1Var.b();
        np npVar = this.e;
        if (b10 == npVar.v0) {
            np.k0(npVar, f1Var.a);
        }
    }

    @Override // v4.i0
    public final void z(v4.f1 f1Var) {
        int b10 = f1Var.b();
        np npVar = this.e;
        if (b10 != npVar.w0 || npVar.getParentActivity() == null) {
            return;
        }
        org.telegram.messenger.g0.v1(npVar.getParentActivity().getCurrentFocus());
    }
}
