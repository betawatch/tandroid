package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class pq extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ qq e;

    public pq(qq qqVar, Context context) {
        this.e = qqVar;
        if (qqVar.y == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f;
        qq qqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = qqVar.P;
        int i11 = qqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = qqVar.N;
        if (!qqVar.w.creator || ((i11 != 0 && (i11 != 2 || !qqVar.K)) || i10 != 4 || c1Var.b() != qqVar.e0)) {
            if (!qqVar.I) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = c1Var.b();
                if (b10 == qqVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = qqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !qqVar.K) {
                        return false;
                    }
                    if (b10 == qqVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !qqVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == qqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == qqVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == qqVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == qqVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == qqVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == qqVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == qqVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == qqVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == qqVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == qqVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == qqVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == qqVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == qqVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == qqVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == qqVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == qqVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == qqVar.n0) {
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

    @Override // s4.h0
    public final int h() {
        return this.e.V;
    }

    @Override // s4.h0
    public final long i(int i10) {
        qq qqVar = this.e;
        if (qqVar.y != 2) {
            return -1L;
        }
        if (i10 == qqVar.W) {
            return 1L;
        }
        if (i10 == qqVar.X) {
            return 2L;
        }
        if (i10 == qqVar.Y) {
            return 3L;
        }
        if (i10 == qqVar.b0) {
            return 4L;
        }
        if (i10 == qqVar.c0) {
            return 5L;
        }
        if (i10 == qqVar.d0) {
            return 6L;
        }
        if (i10 == qqVar.e0) {
            return 7L;
        }
        if (i10 == qqVar.f0) {
            return 8L;
        }
        if (i10 == qqVar.g0) {
            return 9L;
        }
        if (i10 == qqVar.h0) {
            return 10L;
        }
        if (i10 == qqVar.o0) {
            return 11L;
        }
        if (i10 == qqVar.p0) {
            return 12L;
        }
        if (i10 == qqVar.q0) {
            return 13L;
        }
        if (i10 == qqVar.r0) {
            return 14L;
        }
        if (i10 == qqVar.s0) {
            return 15L;
        }
        if (i10 == qqVar.t0) {
            return 16L;
        }
        if (i10 == qqVar.u0) {
            return 17L;
        }
        if (i10 == qqVar.v0) {
            return 18L;
        }
        if (i10 == qqVar.w0) {
            return 19L;
        }
        if (i10 == qqVar.y0) {
            return 20L;
        }
        if (i10 == qqVar.B0) {
            return 21L;
        }
        if (i10 == qqVar.H0) {
            return 22L;
        }
        if (i10 == qqVar.I0) {
            return 23L;
        }
        if (i10 == qqVar.J0) {
            return 24L;
        }
        if (i10 == qqVar.K0) {
            return 25L;
        }
        if (i10 == qqVar.L0) {
            return 26L;
        }
        if (i10 == qqVar.M0) {
            return 27L;
        }
        if (i10 == qqVar.x0) {
            return 28L;
        }
        if (i10 == qqVar.m0) {
            return 29L;
        }
        if (i10 == qqVar.C0) {
            return 30L;
        }
        if (i10 == qqVar.E0) {
            return 31L;
        }
        if (i10 == qqVar.D0) {
            return 32L;
        }
        if (i10 == qqVar.F0) {
            return 33L;
        }
        if (i10 == qqVar.G0) {
            return 34L;
        }
        if (i10 == qqVar.z0) {
            return 35L;
        }
        if (i10 == qqVar.N0) {
            return 36L;
        }
        if (i10 == qqVar.P0) {
            return 37L;
        }
        if (i10 == qqVar.Q0) {
            return 38L;
        }
        if (i10 == qqVar.R0) {
            return 39L;
        }
        if (i10 == qqVar.S0) {
            return 40L;
        }
        if (i10 == qqVar.U0) {
            return 41L;
        }
        if (i10 == qqVar.V0) {
            return 42L;
        }
        if (i10 == qqVar.W0) {
            return 43L;
        }
        if (i10 == qqVar.Z) {
            return 44L;
        }
        if (i10 == qqVar.i0) {
            return 45L;
        }
        if (i10 == qqVar.j0) {
            return 46L;
        }
        if (i10 == qqVar.k0) {
            return 47L;
        }
        if (i10 == qqVar.l0) {
            return 48L;
        }
        if (i10 == qqVar.n0) {
            return 49L;
        }
        return i10 == qqVar.a0 ? 50L : 0L;
    }

    @Override // s4.h0
    public final int j(int i10) {
        qq qqVar = this.e;
        if (i10 == qqVar.H0 || i10 == qqVar.J0 || i10 == qqVar.I0 || i10 == qqVar.B0 || i10 == qqVar.C0 || i10 == qqVar.E0 || i10 == qqVar.D0 || i10 == qqVar.G0 || i10 == qqVar.F0 || i10 == qqVar.j0 || i10 == qqVar.P0 || i10 == qqVar.Q0 || i10 == qqVar.R0 || i10 == qqVar.U0 || i10 == qqVar.V0 || i10 == qqVar.W0) {
            return 10;
        }
        if (i10 == qqVar.z0 || i10 == qqVar.N0 || i10 == qqVar.S0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == qqVar.o0 || i10 == qqVar.q0 || i10 == qqVar.L0 || i10 == qqVar.s0) {
            return 5;
        }
        if (i10 == 2 || i10 == qqVar.u0) {
            return 3;
        }
        if (i10 == qqVar.X || i10 == qqVar.Y || i10 == qqVar.Z || i10 == qqVar.b0 || i10 == qqVar.c0 || i10 == qqVar.d0 || i10 == qqVar.f0 || i10 == qqVar.g0 || i10 == qqVar.h0 || i10 == qqVar.i0 || i10 == qqVar.y0 || i10 == qqVar.e0 || i10 == qqVar.K0 || i10 == qqVar.W || i10 == qqVar.m0 || i10 == qqVar.k0 || i10 == qqVar.n0 || i10 == qqVar.a0) {
            return 4;
        }
        if (i10 == qqVar.r0 || i10 == qqVar.w0 || i10 == qqVar.l0) {
            return 1;
        }
        if (i10 == qqVar.M0) {
            return 6;
        }
        if (i10 == qqVar.v0) {
            return 11;
        }
        return i10 == qqVar.x0 ? 8 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x0a3d, code lost:
    
        if (r2.view_messages == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x051f, code lost:
    
        if (r6.change_info == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0958, code lost:
    
        if (r6.pin_messages == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0a5c, code lost:
    
        if (r2.bot != false) goto L806;
     */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0b4c  */
    /* JADX WARN: Type inference failed for: r4v125, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v153, types: [boolean, int] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.User user2;
        String string;
        int i12;
        TLRPC.User user3;
        String formatString;
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
        qq qqVar = this.e;
        int i48 = qqVar.y;
        boolean z37 = qqVar.U;
        boolean z38 = qqVar.F;
        boolean z39 = qqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = qqVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = qqVar.P;
        int i49 = c1Var.f;
        View view = c1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) view;
                i11 = qqVar.y;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = qqVar.v;
                yaVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == qqVar.l0) {
                    e9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == qqVar.r0) {
                    e9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == qqVar.w0) {
                    user2 = qqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = qqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = qqVar.y;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = qqVar.v;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            e9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = qqVar.y;
                    if (i12 != 0) {
                    }
                    e9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                if (i10 != qqVar.p0) {
                    if (i10 == qqVar.t0) {
                        int i52 = org.telegram.ui.ActionBar.j6.G6;
                        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.u0(i52));
                        eaVar.setTag(Integer.valueOf(i52));
                        if (!z39) {
                            eaVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            eaVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    int i53 = org.telegram.ui.ActionBar.j6.p7;
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.u0(i53));
                    eaVar.setTag(Integer.valueOf(i53));
                    i13 = qqVar.y;
                    if (i13 != 0) {
                        i14 = qqVar.y;
                        if (i14 == 1) {
                            eaVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        eaVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != 2) {
                    if (i10 == qqVar.u0) {
                        l4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = qqVar.y;
                    if (i15 != 2) {
                        user4 = qqVar.v;
                        if (user4 != null) {
                            user5 = qqVar.v;
                            break;
                        }
                        i16 = qqVar.y;
                        if (i16 != 0) {
                            i17 = qqVar.y;
                            if (i17 == 1) {
                                l4Var.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                                break;
                            }
                        } else {
                            l4Var.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                            break;
                        }
                    }
                    l4Var.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                    break;
                }
                break;
            case 4:
            case 9:
                final int i54 = 0;
                boolean z40 = true;
                final org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                boolean z41 = i48 != 2 || qqVar.K;
                TLRPC.Chat chat3 = qqVar.w;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == qqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = qqVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = qqVar.O;
                    r11 = (tL_chatBannedRights25.send_photos || tL_chatBannedRights24.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights25.send_videos && !tL_chatBannedRights24.send_videos) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_stickers && !tL_chatBannedRights24.send_stickers) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_audios && !tL_chatBannedRights24.send_audios) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_docs && !tL_chatBannedRights24.send_docs) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_voices && !tL_chatBannedRights24.send_voices) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_roundvideos && !tL_chatBannedRights24.send_roundvideos) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.embed_links && !tL_chatBannedRights24.embed_links && !tL_chatBannedRights25.send_plain && !tL_chatBannedRights24.send_plain) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_polls && !tL_chatBannedRights24.send_polls) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_reactions && !tL_chatBannedRights24.send_reactions) {
                        r11++;
                    }
                    v8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r11 > 0, true, true);
                    Locale locale = Locale.US;
                    v8Var.a(new Runnable(this) { // from class: org.telegram.ui.oq
                        public final /* synthetic */ pq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i54) {
                                case 0:
                                    qq qqVar2 = this.b.e;
                                    org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                    if (v8Var2.isEnabled()) {
                                        if (!qq.l0(qqVar2)) {
                                            boolean z43 = v8Var2.d.h;
                                            v8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = qqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(qqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.v8 v8Var3 = v8Var;
                                    if (v8Var3.isEnabled()) {
                                        boolean z44 = v8Var3.d.h;
                                        v8Var3.setChecked(z44);
                                        qq qqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = qqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(qqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.v8 v8Var4 = v8Var;
                                    if (v8Var4.isEnabled()) {
                                        boolean z46 = v8Var4.d.h;
                                        v8Var4.setChecked(z46);
                                        qq qqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = qqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(qqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.m(r11, "/10"), !qqVar.A0);
                    v8Var.setIcon(qq.l0(qqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == qqVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i55 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i55 = r42 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights39.delete_messages) {
                        i56 = i55 + 1;
                    }
                    v8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i56 > 0, true, true);
                    Locale locale2 = Locale.US;
                    v8Var.a(new Runnable(this) { // from class: org.telegram.ui.oq
                        public final /* synthetic */ pq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    qq qqVar2 = this.b.e;
                                    org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                    if (v8Var2.isEnabled()) {
                                        if (!qq.l0(qqVar2)) {
                                            boolean z43 = v8Var2.d.h;
                                            v8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = qqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(qqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.v8 v8Var3 = v8Var;
                                    if (v8Var3.isEnabled()) {
                                        boolean z44 = v8Var3.d.h;
                                        v8Var3.setChecked(z44);
                                        qq qqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = qqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(qqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.v8 v8Var4 = v8Var;
                                    if (v8Var4.isEnabled()) {
                                        boolean z46 = v8Var4.d.h;
                                        v8Var4.setChecked(z46);
                                        qq qqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = qqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(qqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.m(i56, "/3"), !qqVar.O0);
                } else if (i10 == qqVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = qqVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i57 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i57 = r52 + 1;
                    }
                    int i58 = i57;
                    if (tL_chatAdminRights40.delete_stories) {
                        i58 = i57 + 1;
                    }
                    v8Var.d(LocaleController.getString(R.string.ChannelManageStories), i58 > 0, true, true);
                    Locale locale3 = Locale.US;
                    v8Var.a(new Runnable(this) { // from class: org.telegram.ui.oq
                        public final /* synthetic */ pq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    qq qqVar2 = this.b.e;
                                    org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                    if (v8Var2.isEnabled()) {
                                        if (!qq.l0(qqVar2)) {
                                            boolean z43 = v8Var2.d.h;
                                            v8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = qqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(qqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.v8 v8Var3 = v8Var;
                                    if (v8Var3.isEnabled()) {
                                        boolean z44 = v8Var3.d.h;
                                        v8Var3.setChecked(z44);
                                        qq qqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = qqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(qqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.v8 v8Var4 = v8Var;
                                    if (v8Var4.isEnabled()) {
                                        boolean z46 = v8Var4.d.h;
                                        v8Var4.setChecked(z46);
                                        qq qqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = qqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(qqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.m(i58, "/3"), !qqVar.T0);
                } else if (i10 == qqVar.W) {
                    v8Var.d(LocaleController.getString(R.string.ManageGroup), qqVar.K, true, false);
                    tL_chatAdminRights38 = qqVar.N;
                    v8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == qqVar.X) {
                    i43 = qqVar.y;
                    if (i43 != 0) {
                        i45 = qqVar.y;
                        if (i45 != 2) {
                            i46 = qqVar.y;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = qqVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = qqVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        v8Var.c(string3, z36, qqVar.m0 == -1);
                                        tL_chatBannedRights19 = qqVar.P;
                                        v8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                v8Var.c(string3, z36, qqVar.m0 == -1);
                                tL_chatBannedRights19 = qqVar.P;
                                v8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = qqVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                v8Var.c(string4, z35, true);
                            }
                        }
                        z35 = false;
                        v8Var.c(string4, z35, true);
                    } else if (z39) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z41) {
                            tL_chatAdminRights35 = qqVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                v8Var.c(string5, z34, true);
                            }
                        }
                        z34 = false;
                        v8Var.c(string5, z34, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z41) {
                            tL_chatAdminRights34 = qqVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = qqVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            v8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        v8Var.c(string6, z33, true);
                    }
                    i44 = qqVar.y;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = qqVar.N;
                        v8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == qqVar.Y) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = qqVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            v8Var.c(string7, z32, true);
                            i42 = qqVar.y;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    v8Var.c(string7, z32, true);
                    i42 = qqVar.y;
                    if (i42 == 2) {
                    }
                } else if (i10 == qqVar.a0) {
                    user8 = qqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = qqVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                v8Var.c(string8, z31, true);
                            }
                        }
                        z31 = false;
                        v8Var.c(string8, z31, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights29 = qqVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                v8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        v8Var.c(string9, z30, true);
                    }
                    i41 = qqVar.y;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = qqVar.N;
                        v8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == qqVar.Z) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = qqVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            v8Var.c(string10, z29, true);
                            i40 = qqVar.y;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    v8Var.c(string10, z29, true);
                    i40 = qqVar.y;
                    if (i40 == 2) {
                    }
                } else if (i10 == qqVar.b0) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = qqVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            v8Var.c(string11, z28, true);
                            i39 = qqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    v8Var.c(string11, z28, true);
                    i39 = qqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i10 == qqVar.c0) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = qqVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                v8Var.c(string12, z27, true);
                            }
                        }
                        z27 = false;
                        v8Var.c(string12, z27, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights22 = qqVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                v8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        v8Var.c(string13, z26, true);
                    }
                    i38 = qqVar.y;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = qqVar.N;
                        v8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == qqVar.d0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = qqVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            v8Var.c(string14, z25, (qqVar.f0 == -1 && z39) || qqVar.e0 != -1);
                            i37 = qqVar.y;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    v8Var.c(string14, z25, (qqVar.f0 == -1 && z39) || qqVar.e0 != -1);
                    i37 = qqVar.y;
                    if (i37 == 2) {
                    }
                } else if (i10 == qqVar.e0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = qqVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            v8Var.c(string15, z24, qqVar.m0 == -1 || z37);
                            i36 = qqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    v8Var.c(string15, z24, qqVar.m0 == -1 || z37);
                    i36 = qqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i10 == qqVar.k0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (qqVar.x != null) {
                        user6 = qqVar.v;
                        if (user6 != null) {
                            long j3 = qqVar.r ? qqVar.n : qqVar.x.guard_bot_id;
                            user7 = qqVar.v;
                            if (j3 == user7.id) {
                                z23 = true;
                                v8Var.c(string16, z23, false);
                                i35 = qqVar.y;
                                if (i35 == 2) {
                                    v8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    v8Var.c(string16, z23, false);
                    i35 = qqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i10 == qqVar.f0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = qqVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            v8Var.c(string17, z22, !z38);
                            i34 = qqVar.y;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    v8Var.c(string17, z22, !z38);
                    i34 = qqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i10 == qqVar.n0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = qqVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            v8Var.c(string18, z21, true);
                            i33 = qqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    v8Var.c(string18, z21, true);
                    i33 = qqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i10 == qqVar.K0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = qqVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            v8Var.c(string19, z20, true);
                            i32 = qqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    v8Var.c(string19, z20, true);
                    i32 = qqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i10 == qqVar.m0) {
                    i29 = qqVar.y;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = qqVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                v8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        v8Var.c(string20, z19, z37);
                    } else {
                        i30 = qqVar.y;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = qqVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = qqVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    v8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = qqVar.P;
                                    v8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            v8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = qqVar.P;
                            v8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = qqVar.y;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = qqVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        v8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = qqVar.N;
                                        v8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                v8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = qqVar.N;
                                v8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == qqVar.g0) {
                    i26 = qqVar.y;
                    if (i26 == 0) {
                        chat2 = qqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = qqVar.M;
                            v8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = qqVar.M;
                            v8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = qqVar.y;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = qqVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = qqVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    v8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = qqVar.P;
                                    v8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            v8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = qqVar.P;
                            v8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = qqVar.y;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = qqVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        v8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = qqVar.N;
                                        v8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                v8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = qqVar.N;
                                v8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == qqVar.h0) {
                    i22 = qqVar.y;
                    if (i22 != 0) {
                        i24 = qqVar.y;
                        if (i24 != 2) {
                            i25 = qqVar.y;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = qqVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = qqVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        v8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = qqVar.P;
                                        v8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                v8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = qqVar.P;
                                v8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = qqVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = qqVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        v8Var.c(string28, z13, true);
                        i23 = qqVar.y;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = qqVar.N;
                            v8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    v8Var.c(string28, z13, true);
                    i23 = qqVar.y;
                    if (i23 == 2) {
                    }
                } else if (i10 == qqVar.i0) {
                    i18 = qqVar.y;
                    if (i18 != 0) {
                        i20 = qqVar.y;
                        if (i20 != 2) {
                            i21 = qqVar.y;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = qqVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = qqVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        v8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = qqVar.P;
                                        v8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                v8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = qqVar.P;
                                v8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = qqVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            v8Var.c(string30, z11, true);
                            i19 = qqVar.y;
                            if (i19 == 2) {
                                tL_chatAdminRights = qqVar.N;
                                v8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    v8Var.c(string30, z11, true);
                    i19 = qqVar.y;
                    if (i19 == 2) {
                    }
                } else if (i10 == qqVar.y0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = qqVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = qqVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            v8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = qqVar.P;
                            v8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    v8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = qqVar.P;
                    v8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = qqVar.y;
                if (i47 != 2 && i10 == qqVar.y0) {
                    tL_chatBannedRights21 = qqVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = qqVar.P;
                        break;
                    }
                    z40 = false;
                    v8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                if (i48 != 2 || (i10 != qqVar.o0 && i10 != qqVar.w0)) {
                    a7Var.setAlpha(1.0f);
                    break;
                } else {
                    a7Var.setAlpha(qqVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                if (i10 == qqVar.M0) {
                    int i59 = qqVar.O.until_date;
                    c9Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i59 == 0 || Math.abs(((long) i59) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(qqVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                String string32 = (UserObject.isUserSelf(qqVar.v) && qqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                c6Var.getTextView().setEnabled(qqVar.I || qqVar.w.creator);
                c6Var.getTextView().setSingleLine(true);
                c6Var.getTextView().setImeOptions(6);
                c6Var.n(qqVar.S, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z43 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != qqVar.H0) {
                    if (i10 != qqVar.J0) {
                        if (i10 != qqVar.I0) {
                            if (i10 != qqVar.B0) {
                                if (i10 != qqVar.C0) {
                                    if (i10 != qqVar.j0) {
                                        if (i10 != qqVar.D0) {
                                            if (i10 != qqVar.E0) {
                                                if (i10 != qqVar.F0) {
                                                    if (i10 != qqVar.G0) {
                                                        if (i10 != qqVar.P0) {
                                                            if (i10 != qqVar.Q0) {
                                                                if (i10 != qqVar.R0) {
                                                                    if (i10 != qqVar.U0) {
                                                                        if (i10 != qqVar.V0) {
                                                                            if (i10 == qqVar.W0) {
                                                                                z1Var.e(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z1Var.e(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z1Var.e(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    z1Var.e(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                z1Var.e(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            z1Var.e(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        z1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (qqVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        z1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (qqVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    z1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (qqVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                z1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (qqVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            z1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (qqVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        z1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (qqVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    z1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (qqVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                z1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (qqVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            z1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = qqVar.O;
                        z1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        z1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (qqVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    z1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.a01) view).a(qqVar.v, qqVar.S, i48 == 0, false, new t3(this, 2));
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        qq qqVar = this.e;
        switch (i10) {
            case 0:
                View yaVar = new org.telegram.ui.Cells.ya(context, null);
                yaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = yaVar;
                break;
            case 1:
                view2 = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = eaVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = l4Var;
                view2 = view;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = v8Var;
                break;
            case 5:
                view2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                c6Var.b(new l0(this, 4));
                view2 = c6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                qqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.j6.a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                qqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                qqVar.f = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                qqVar.f.setTextColor(-1);
                qqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                qqVar.f.setGravity(17);
                org.telegram.ui.Components.q6 q6Var2 = qqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.vl.l(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(qqVar.K ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                q6Var2.setText(sb2.toString());
                qqVar.e.addView(qqVar.f, w7.x5.e(-2, -2, 17));
                qqVar.e.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                qqVar.e.setOnClickListener(new a(this, 15));
                qqVar.d.addView(qqVar.e, w7.x5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                qqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view3 = new View(context);
                view3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                qqVar.d.setClipChildren(false);
                qqVar.d.setClipToPadding(false);
                qqVar.d.addView(view3, w7.x5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view2 = qqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, qqVar.getResourceProvider(), false);
                z1Var.setPad(1);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                z1Var.setEnabled(true);
                z1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = z1Var;
                view2 = view;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.n2) qqVar).currentAccount;
                long j3 = -qqVar.s;
                f6Var = ((org.telegram.ui.ActionBar.n2) qqVar).resourceProvider;
                view2 = new org.telegram.ui.Components.a01(i11, j3, this.c, f6Var);
                break;
        }
        return new org.telegram.ui.Components.vk0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        qq qqVar = this.e;
        if (b10 == qqVar.u0) {
            qq.f0(qqVar, c1Var.a);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        qq qqVar = this.e;
        if (b10 != qqVar.v0 || qqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(qqVar.getParentActivity().getCurrentFocus());
    }
}
