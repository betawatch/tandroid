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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jq extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ kq e;

    public jq(kq kqVar, Context context) {
        this.e = kqVar;
        if (kqVar.y == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        TLRPC.Chat chat;
        int i10 = m1Var.f;
        kq kqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kqVar.M;
        int i11 = kqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.K;
        if (!kqVar.w.creator || ((i11 != 0 && (i11 != 2 || !kqVar.H)) || i10 != 4 || m1Var.b() != kqVar.b0)) {
            if (!kqVar.F) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = m1Var.b();
                if (b10 == kqVar.T) {
                    if (!tL_chatAdminRights.add_admins && ((chat = kqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !kqVar.H) {
                        return false;
                    }
                    if (b10 == kqVar.U) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !kqVar.B) {
                            return false;
                        }
                    } else {
                        if (b10 == kqVar.V) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == kqVar.W) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == kqVar.X) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == kqVar.Y) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == kqVar.Z) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == kqVar.H0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == kqVar.a0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == kqVar.b0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == kqVar.c0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == kqVar.d0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == kqVar.e0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == kqVar.f0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == kqVar.j0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == kqVar.R0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == kqVar.S0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == kqVar.T0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == kqVar.k0) {
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

    @Override // f2.p0
    public final int h() {
        return this.e.S;
    }

    @Override // f2.p0
    public final long i(int i10) {
        kq kqVar = this.e;
        if (kqVar.y != 2) {
            return -1L;
        }
        if (i10 == kqVar.T) {
            return 1L;
        }
        if (i10 == kqVar.U) {
            return 2L;
        }
        if (i10 == kqVar.V) {
            return 3L;
        }
        if (i10 == kqVar.Y) {
            return 4L;
        }
        if (i10 == kqVar.Z) {
            return 5L;
        }
        if (i10 == kqVar.a0) {
            return 6L;
        }
        if (i10 == kqVar.b0) {
            return 7L;
        }
        if (i10 == kqVar.c0) {
            return 8L;
        }
        if (i10 == kqVar.d0) {
            return 9L;
        }
        if (i10 == kqVar.e0) {
            return 10L;
        }
        if (i10 == kqVar.l0) {
            return 11L;
        }
        if (i10 == kqVar.m0) {
            return 12L;
        }
        if (i10 == kqVar.n0) {
            return 13L;
        }
        if (i10 == kqVar.o0) {
            return 14L;
        }
        if (i10 == kqVar.p0) {
            return 15L;
        }
        if (i10 == kqVar.q0) {
            return 16L;
        }
        if (i10 == kqVar.r0) {
            return 17L;
        }
        if (i10 == kqVar.s0) {
            return 18L;
        }
        if (i10 == kqVar.t0) {
            return 19L;
        }
        if (i10 == kqVar.v0) {
            return 20L;
        }
        if (i10 == kqVar.y0) {
            return 21L;
        }
        if (i10 == kqVar.E0) {
            return 22L;
        }
        if (i10 == kqVar.F0) {
            return 23L;
        }
        if (i10 == kqVar.G0) {
            return 24L;
        }
        if (i10 == kqVar.H0) {
            return 25L;
        }
        if (i10 == kqVar.I0) {
            return 26L;
        }
        if (i10 == kqVar.J0) {
            return 27L;
        }
        if (i10 == kqVar.u0) {
            return 28L;
        }
        if (i10 == kqVar.j0) {
            return 29L;
        }
        if (i10 == kqVar.z0) {
            return 30L;
        }
        if (i10 == kqVar.B0) {
            return 31L;
        }
        if (i10 == kqVar.A0) {
            return 32L;
        }
        if (i10 == kqVar.C0) {
            return 33L;
        }
        if (i10 == kqVar.D0) {
            return 34L;
        }
        if (i10 == kqVar.w0) {
            return 35L;
        }
        if (i10 == kqVar.K0) {
            return 36L;
        }
        if (i10 == kqVar.M0) {
            return 37L;
        }
        if (i10 == kqVar.N0) {
            return 38L;
        }
        if (i10 == kqVar.O0) {
            return 39L;
        }
        if (i10 == kqVar.P0) {
            return 40L;
        }
        if (i10 == kqVar.R0) {
            return 41L;
        }
        if (i10 == kqVar.S0) {
            return 42L;
        }
        if (i10 == kqVar.T0) {
            return 43L;
        }
        if (i10 == kqVar.W) {
            return 44L;
        }
        if (i10 == kqVar.f0) {
            return 45L;
        }
        if (i10 == kqVar.g0) {
            return 46L;
        }
        if (i10 == kqVar.h0) {
            return 47L;
        }
        if (i10 == kqVar.i0) {
            return 48L;
        }
        if (i10 == kqVar.k0) {
            return 49L;
        }
        return i10 == kqVar.X ? 50L : 0L;
    }

    @Override // f2.p0
    public final int j(int i10) {
        kq kqVar = this.e;
        if (i10 == kqVar.E0 || i10 == kqVar.G0 || i10 == kqVar.F0 || i10 == kqVar.y0 || i10 == kqVar.z0 || i10 == kqVar.B0 || i10 == kqVar.A0 || i10 == kqVar.D0 || i10 == kqVar.C0 || i10 == kqVar.g0 || i10 == kqVar.M0 || i10 == kqVar.N0 || i10 == kqVar.O0 || i10 == kqVar.R0 || i10 == kqVar.S0 || i10 == kqVar.T0) {
            return 10;
        }
        if (i10 == kqVar.w0 || i10 == kqVar.K0 || i10 == kqVar.P0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == kqVar.l0 || i10 == kqVar.n0 || i10 == kqVar.I0 || i10 == kqVar.p0) {
            return 5;
        }
        if (i10 == 2 || i10 == kqVar.r0) {
            return 3;
        }
        if (i10 == kqVar.U || i10 == kqVar.V || i10 == kqVar.W || i10 == kqVar.Y || i10 == kqVar.Z || i10 == kqVar.a0 || i10 == kqVar.c0 || i10 == kqVar.d0 || i10 == kqVar.e0 || i10 == kqVar.f0 || i10 == kqVar.v0 || i10 == kqVar.b0 || i10 == kqVar.H0 || i10 == kqVar.T || i10 == kqVar.j0 || i10 == kqVar.h0 || i10 == kqVar.k0 || i10 == kqVar.X) {
            return 4;
        }
        if (i10 == kqVar.o0 || i10 == kqVar.t0 || i10 == kqVar.i0) {
            return 1;
        }
        if (i10 == kqVar.J0) {
            return 6;
        }
        if (i10 == kqVar.s0) {
            return 11;
        }
        return i10 == kqVar.u0 ? 8 : 2;
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
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
        boolean z4;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        int i18;
        boolean z10;
        int i19;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i20;
        int i21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4;
        boolean z11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights6;
        int i22;
        TLRPC.TL_chatBannedRights tL_chatBannedRights7;
        boolean z12;
        int i23;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights4;
        int i24;
        int i25;
        TLRPC.TL_chatBannedRights tL_chatBannedRights8;
        boolean z13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights10;
        int i26;
        int i27;
        int i28;
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
        int i29;
        int i30;
        int i31;
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
        int i32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights13;
        boolean z20;
        int i33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights15;
        boolean z21;
        int i34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights17;
        boolean z22;
        int i35;
        TLRPC.User user6;
        TLRPC.User user7;
        boolean z23;
        int i36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights19;
        boolean z24;
        int i37;
        TLRPC.TL_chatAdminRights tL_chatAdminRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights21;
        boolean z25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights22;
        int i38;
        TLRPC.TL_chatAdminRights tL_chatAdminRights23;
        boolean z26;
        TLRPC.TL_chatAdminRights tL_chatAdminRights24;
        boolean z27;
        int i39;
        TLRPC.TL_chatAdminRights tL_chatAdminRights25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights26;
        boolean z28;
        int i40;
        TLRPC.TL_chatAdminRights tL_chatAdminRights27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights28;
        TLRPC.User user8;
        boolean z29;
        TLRPC.TL_chatAdminRights tL_chatAdminRights29;
        int i41;
        TLRPC.TL_chatAdminRights tL_chatAdminRights30;
        boolean z30;
        TLRPC.TL_chatAdminRights tL_chatAdminRights31;
        boolean z31;
        int i42;
        TLRPC.TL_chatAdminRights tL_chatAdminRights32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights33;
        int i43;
        TLRPC.TL_chatBannedRights tL_chatBannedRights17;
        boolean z32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights34;
        boolean z33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights35;
        int i44;
        TLRPC.TL_chatAdminRights tL_chatAdminRights36;
        boolean z34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights37;
        int i45;
        int i46;
        TLRPC.TL_chatBannedRights tL_chatBannedRights18;
        boolean z35;
        TLRPC.TL_chatBannedRights tL_chatBannedRights19;
        TLRPC.TL_chatBannedRights tL_chatBannedRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights38;
        int i47;
        TLRPC.TL_chatBannedRights tL_chatBannedRights21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights22;
        kq kqVar = this.e;
        int i48 = kqVar.y;
        boolean z36 = kqVar.R;
        boolean z37 = kqVar.C;
        boolean z38 = kqVar.B;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = kqVar.J;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = kqVar.M;
        int i49 = m1Var.f;
        View view = m1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                i11 = kqVar.y;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = kqVar.v;
                uaVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 == kqVar.i0) {
                    a9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == kqVar.o0) {
                    a9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == kqVar.t0) {
                    user2 = kqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = kqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = kqVar.y;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = kqVar.v;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            a9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = kqVar.y;
                    if (i12 != 0) {
                    }
                    a9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i10 != kqVar.m0) {
                    if (i10 == kqVar.q0) {
                        int i52 = org.telegram.ui.ActionBar.k6.G6;
                        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.u0(i52));
                        aaVar.setTag(Integer.valueOf(i52));
                        if (!z38) {
                            aaVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            aaVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    int i53 = org.telegram.ui.ActionBar.k6.p7;
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.u0(i53));
                    aaVar.setTag(Integer.valueOf(i53));
                    i13 = kqVar.y;
                    if (i13 != 0) {
                        i14 = kqVar.y;
                        if (i14 == 1) {
                            aaVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        aaVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != 2) {
                    if (i10 == kqVar.r0) {
                        m4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = kqVar.y;
                    if (i15 != 2) {
                        user4 = kqVar.v;
                        if (user4 != null) {
                            user5 = kqVar.v;
                            break;
                        }
                        i16 = kqVar.y;
                        if (i16 != 0) {
                            i17 = kqVar.y;
                            if (i17 == 1) {
                                m4Var.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                            break;
                        }
                    }
                    m4Var.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                    break;
                }
                break;
            case 4:
            case 9:
                final int i54 = 0;
                boolean z39 = true;
                final org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                boolean z40 = i48 != 2 || kqVar.H;
                TLRPC.Chat chat3 = kqVar.w;
                boolean z41 = chat3 != null && chat3.creator;
                if (i10 == kqVar.w0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = kqVar.M;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = kqVar.L;
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
                    r8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r11 > 0, true, true);
                    Locale locale = Locale.US;
                    r8Var.a(new Runnable(this) { // from class: org.telegram.ui.iq
                        public final /* synthetic */ jq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i54) {
                                case 0:
                                    kq kqVar2 = this.b.e;
                                    org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                                    if (r8Var2.isEnabled()) {
                                        if (!kq.l0(kqVar2)) {
                                            boolean z42 = r8Var2.d.h;
                                            r8Var2.setChecked(!z42);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = kqVar2.L;
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
                                            AndroidUtilities.updateVisibleRows(kqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar2.getParentActivity());
                                            alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.r8 r8Var3 = r8Var;
                                    if (r8Var3.isEnabled()) {
                                        boolean z43 = r8Var3.d.h;
                                        r8Var3.setChecked(z43);
                                        kq kqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = kqVar3.J;
                                        boolean z44 = !z43;
                                        tL_chatAdminRights40.post_messages = z44;
                                        tL_chatAdminRights40.edit_messages = z44;
                                        tL_chatAdminRights40.delete_messages = z44;
                                        AndroidUtilities.updateVisibleRows(kqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.r8 r8Var4 = r8Var;
                                    if (r8Var4.isEnabled()) {
                                        boolean z45 = r8Var4.d.h;
                                        r8Var4.setChecked(z45);
                                        kq kqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = kqVar4.J;
                                        boolean z46 = !z45;
                                        tL_chatAdminRights41.post_stories = z46;
                                        tL_chatAdminRights41.edit_stories = z46;
                                        tL_chatAdminRights41.delete_stories = z46;
                                        AndroidUtilities.updateVisibleRows(kqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, android.support.v4.media.a.l(r11, "/10"), !kqVar.x0);
                    r8Var.setIcon(kq.l0(kqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == kqVar.K0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i55 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i55 = r42 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights39.delete_messages) {
                        i56 = i55 + 1;
                    }
                    r8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i56 > 0, true, true);
                    Locale locale2 = Locale.US;
                    r8Var.a(new Runnable(this) { // from class: org.telegram.ui.iq
                        public final /* synthetic */ jq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    kq kqVar2 = this.b.e;
                                    org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                                    if (r8Var2.isEnabled()) {
                                        if (!kq.l0(kqVar2)) {
                                            boolean z42 = r8Var2.d.h;
                                            r8Var2.setChecked(!z42);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = kqVar2.L;
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
                                            AndroidUtilities.updateVisibleRows(kqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar2.getParentActivity());
                                            alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.r8 r8Var3 = r8Var;
                                    if (r8Var3.isEnabled()) {
                                        boolean z43 = r8Var3.d.h;
                                        r8Var3.setChecked(z43);
                                        kq kqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = kqVar3.J;
                                        boolean z44 = !z43;
                                        tL_chatAdminRights40.post_messages = z44;
                                        tL_chatAdminRights40.edit_messages = z44;
                                        tL_chatAdminRights40.delete_messages = z44;
                                        AndroidUtilities.updateVisibleRows(kqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.r8 r8Var4 = r8Var;
                                    if (r8Var4.isEnabled()) {
                                        boolean z45 = r8Var4.d.h;
                                        r8Var4.setChecked(z45);
                                        kq kqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = kqVar4.J;
                                        boolean z46 = !z45;
                                        tL_chatAdminRights41.post_stories = z46;
                                        tL_chatAdminRights41.edit_stories = z46;
                                        tL_chatAdminRights41.delete_stories = z46;
                                        AndroidUtilities.updateVisibleRows(kqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, android.support.v4.media.a.l(i56, "/3"), !kqVar.L0);
                } else if (i10 == kqVar.P0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = kqVar.J;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i57 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i57 = r52 + 1;
                    }
                    int i58 = i57;
                    if (tL_chatAdminRights40.delete_stories) {
                        i58 = i57 + 1;
                    }
                    r8Var.d(LocaleController.getString(R.string.ChannelManageStories), i58 > 0, true, true);
                    Locale locale3 = Locale.US;
                    r8Var.a(new Runnable(this) { // from class: org.telegram.ui.iq
                        public final /* synthetic */ jq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    kq kqVar2 = this.b.e;
                                    org.telegram.ui.Cells.r8 r8Var2 = r8Var;
                                    if (r8Var2.isEnabled()) {
                                        if (!kq.l0(kqVar2)) {
                                            boolean z42 = r8Var2.d.h;
                                            r8Var2.setChecked(!z42);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = kqVar2.L;
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
                                            AndroidUtilities.updateVisibleRows(kqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar2.getParentActivity());
                                            alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.r8 r8Var3 = r8Var;
                                    if (r8Var3.isEnabled()) {
                                        boolean z43 = r8Var3.d.h;
                                        r8Var3.setChecked(z43);
                                        kq kqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = kqVar3.J;
                                        boolean z44 = !z43;
                                        tL_chatAdminRights402.post_messages = z44;
                                        tL_chatAdminRights402.edit_messages = z44;
                                        tL_chatAdminRights402.delete_messages = z44;
                                        AndroidUtilities.updateVisibleRows(kqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.r8 r8Var4 = r8Var;
                                    if (r8Var4.isEnabled()) {
                                        boolean z45 = r8Var4.d.h;
                                        r8Var4.setChecked(z45);
                                        kq kqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = kqVar4.J;
                                        boolean z46 = !z45;
                                        tL_chatAdminRights41.post_stories = z46;
                                        tL_chatAdminRights41.edit_stories = z46;
                                        tL_chatAdminRights41.delete_stories = z46;
                                        AndroidUtilities.updateVisibleRows(kqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, android.support.v4.media.a.l(i58, "/3"), !kqVar.Q0);
                } else if (i10 == kqVar.T) {
                    r8Var.d(LocaleController.getString(R.string.ManageGroup), kqVar.H, true, false);
                    tL_chatAdminRights38 = kqVar.K;
                    r8Var.setIcon((tL_chatAdminRights38.add_admins || z41) ? 0 : R.drawable.permission_locked);
                } else if (i10 == kqVar.U) {
                    i43 = kqVar.y;
                    if (i43 != 0) {
                        i45 = kqVar.y;
                        if (i45 != 2) {
                            i46 = kqVar.y;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z37 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = kqVar.L;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = kqVar.M;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z35 = true;
                                        r8Var.c(string3, z35, kqVar.j0 == -1);
                                        tL_chatBannedRights19 = kqVar.M;
                                        r8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z35 = false;
                                r8Var.c(string3, z35, kqVar.j0 == -1);
                                tL_chatBannedRights19 = kqVar.M;
                                r8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z37) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z40) {
                            tL_chatAdminRights37 = kqVar.J;
                            if (tL_chatAdminRights37.change_info) {
                                z34 = true;
                                r8Var.c(string4, z34, true);
                            }
                        }
                        z34 = false;
                        r8Var.c(string4, z34, true);
                    } else if (z38) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z40) {
                            tL_chatAdminRights35 = kqVar.J;
                            if (tL_chatAdminRights35.change_info) {
                                z33 = true;
                                r8Var.c(string5, z33, true);
                            }
                        }
                        z33 = false;
                        r8Var.c(string5, z33, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z40) {
                            tL_chatAdminRights34 = kqVar.J;
                            break;
                        }
                        tL_chatBannedRights17 = kqVar.M;
                        if (tL_chatBannedRights17.change_info) {
                            z32 = false;
                            r8Var.c(string6, z32, true);
                        }
                        z32 = true;
                        r8Var.c(string6, z32, true);
                    }
                    i44 = kqVar.y;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = kqVar.K;
                        r8Var.setIcon((tL_chatAdminRights36.change_info || z41) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == kqVar.V) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z40) {
                        tL_chatAdminRights33 = kqVar.J;
                        if (tL_chatAdminRights33.post_messages) {
                            z31 = true;
                            r8Var.c(string7, z31, true);
                            i42 = kqVar.y;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights32.post_messages || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z31 = false;
                    r8Var.c(string7, z31, true);
                    i42 = kqVar.y;
                    if (i42 == 2) {
                    }
                } else if (i10 == kqVar.X) {
                    user8 = kqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z38 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z40) {
                            tL_chatAdminRights31 = kqVar.J;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z30 = true;
                                r8Var.c(string8, z30, true);
                            }
                        }
                        z30 = false;
                        r8Var.c(string8, z30, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z40) {
                            tL_chatAdminRights29 = kqVar.J;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z29 = true;
                                r8Var.c(string9, z29, true);
                            }
                        }
                        z29 = false;
                        r8Var.c(string9, z29, true);
                    }
                    i41 = kqVar.y;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = kqVar.K;
                        r8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z41) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == kqVar.W) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z40) {
                        tL_chatAdminRights28 = kqVar.J;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z28 = true;
                            r8Var.c(string10, z28, true);
                            i40 = kqVar.y;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    r8Var.c(string10, z28, true);
                    i40 = kqVar.y;
                    if (i40 == 2) {
                    }
                } else if (i10 == kqVar.Y) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z40) {
                        tL_chatAdminRights26 = kqVar.J;
                        if (tL_chatAdminRights26.edit_messages) {
                            z27 = true;
                            r8Var.c(string11, z27, true);
                            i39 = kqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights25.edit_messages || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z27 = false;
                    r8Var.c(string11, z27, true);
                    i39 = kqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i10 == kqVar.Z) {
                    if (z38) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z40) {
                            tL_chatAdminRights24 = kqVar.J;
                            if (tL_chatAdminRights24.delete_messages) {
                                z26 = true;
                                r8Var.c(string12, z26, true);
                            }
                        }
                        z26 = false;
                        r8Var.c(string12, z26, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z40) {
                            tL_chatAdminRights22 = kqVar.J;
                            if (tL_chatAdminRights22.delete_messages) {
                                z25 = true;
                                r8Var.c(string13, z25, true);
                            }
                        }
                        z25 = false;
                        r8Var.c(string13, z25, true);
                    }
                    i38 = kqVar.y;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = kqVar.K;
                        r8Var.setIcon((tL_chatAdminRights23.delete_messages || z41) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == kqVar.a0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z40) {
                        tL_chatAdminRights21 = kqVar.J;
                        if (tL_chatAdminRights21.add_admins) {
                            z24 = true;
                            r8Var.c(string14, z24, (kqVar.c0 == -1 && z38) || kqVar.b0 != -1);
                            i37 = kqVar.y;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights20.add_admins || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    r8Var.c(string14, z24, (kqVar.c0 == -1 && z38) || kqVar.b0 != -1);
                    i37 = kqVar.y;
                    if (i37 == 2) {
                    }
                } else if (i10 == kqVar.b0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z40) {
                        tL_chatAdminRights19 = kqVar.J;
                        if (tL_chatAdminRights19.anonymous) {
                            z23 = true;
                            r8Var.c(string15, z23, kqVar.j0 == -1 || z36);
                            i36 = kqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights18.anonymous || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z23 = false;
                    r8Var.c(string15, z23, kqVar.j0 == -1 || z36);
                    i36 = kqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i10 == kqVar.h0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (kqVar.x != null) {
                        user6 = kqVar.v;
                        if (user6 != null) {
                            long j10 = kqVar.r ? kqVar.n : kqVar.x.guard_bot_id;
                            user7 = kqVar.v;
                            if (j10 == user7.id) {
                                z22 = true;
                                r8Var.c(string16, z22, false);
                                i35 = kqVar.y;
                                if (i35 == 2) {
                                    r8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z22 = false;
                    r8Var.c(string16, z22, false);
                    i35 = kqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i10 == kqVar.c0) {
                    String string17 = LocaleController.getString(z37 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z40) {
                        tL_chatAdminRights17 = kqVar.J;
                        if (tL_chatAdminRights17.ban_users) {
                            z21 = true;
                            r8Var.c(string17, z21, !z37);
                            i34 = kqVar.y;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights16.ban_users || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    r8Var.c(string17, z21, !z37);
                    i34 = kqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i10 == kqVar.k0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z40) {
                        tL_chatAdminRights15 = kqVar.J;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z20 = true;
                            r8Var.c(string18, z20, true);
                            i33 = kqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    r8Var.c(string18, z20, true);
                    i33 = kqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i10 == kqVar.H0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z40) {
                        tL_chatAdminRights13 = kqVar.J;
                        if (tL_chatAdminRights13.manage_call) {
                            z19 = true;
                            r8Var.c(string19, z19, true);
                            i32 = kqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights12.manage_call || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z19 = false;
                    r8Var.c(string19, z19, true);
                    i32 = kqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i10 == kqVar.j0) {
                    i29 = kqVar.y;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z40) {
                            tL_chatAdminRights11 = kqVar.J;
                            if (tL_chatAdminRights11.manage_topics) {
                                z18 = true;
                                r8Var.c(string20, z18, z36);
                            }
                        }
                        z18 = false;
                        r8Var.c(string20, z18, z36);
                    } else {
                        i30 = kqVar.y;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = kqVar.L;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = kqVar.M;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z17 = true;
                                    r8Var.c(string21, z17, z36);
                                    tL_chatBannedRights15 = kqVar.M;
                                    r8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z17 = false;
                            r8Var.c(string21, z17, z36);
                            tL_chatBannedRights15 = kqVar.M;
                            r8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = kqVar.y;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z40) {
                                    tL_chatAdminRights10 = kqVar.J;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z16 = true;
                                        r8Var.c(string22, z16, z36);
                                        tL_chatAdminRights9 = kqVar.K;
                                        r8Var.setIcon((!tL_chatAdminRights9.manage_topics || z41) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z16 = false;
                                r8Var.c(string22, z16, z36);
                                tL_chatAdminRights9 = kqVar.K;
                                r8Var.setIcon((!tL_chatAdminRights9.manage_topics || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == kqVar.d0) {
                    i26 = kqVar.y;
                    if (i26 == 0) {
                        chat2 = kqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = kqVar.J;
                            r8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = kqVar.J;
                            r8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = kqVar.y;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = kqVar.L;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = kqVar.M;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z15 = true;
                                    r8Var.c(string25, z15, true);
                                    tL_chatBannedRights12 = kqVar.M;
                                    r8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z15 = false;
                            r8Var.c(string25, z15, true);
                            tL_chatBannedRights12 = kqVar.M;
                            r8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = kqVar.y;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z40) {
                                    tL_chatAdminRights6 = kqVar.J;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z14 = true;
                                        r8Var.c(string26, z14, true);
                                        tL_chatAdminRights5 = kqVar.K;
                                        r8Var.setIcon((!tL_chatAdminRights5.invite_users || z41) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z14 = false;
                                r8Var.c(string26, z14, true);
                                tL_chatAdminRights5 = kqVar.K;
                                r8Var.setIcon((!tL_chatAdminRights5.invite_users || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == kqVar.e0) {
                    i22 = kqVar.y;
                    if (i22 != 0) {
                        i24 = kqVar.y;
                        if (i24 != 2) {
                            i25 = kqVar.y;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = kqVar.L;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = kqVar.M;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z13 = true;
                                        r8Var.c(string27, z13, true);
                                        tL_chatBannedRights9 = kqVar.M;
                                        r8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z13 = false;
                                r8Var.c(string27, z13, true);
                                tL_chatBannedRights9 = kqVar.M;
                                r8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z40) {
                        tL_chatAdminRights4 = kqVar.J;
                        break;
                    }
                    tL_chatBannedRights7 = kqVar.M;
                    if (tL_chatBannedRights7.pin_messages) {
                        z12 = false;
                        r8Var.c(string28, z12, true);
                        i23 = kqVar.y;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = kqVar.K;
                            r8Var.setIcon((tL_chatAdminRights3.pin_messages || z41) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z12 = true;
                    r8Var.c(string28, z12, true);
                    i23 = kqVar.y;
                    if (i23 == 2) {
                    }
                } else if (i10 == kqVar.f0) {
                    i18 = kqVar.y;
                    if (i18 != 0) {
                        i20 = kqVar.y;
                        if (i20 != 2) {
                            i21 = kqVar.y;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = kqVar.L;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = kqVar.M;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z11 = true;
                                        r8Var.c(string29, z11, true);
                                        tL_chatBannedRights5 = kqVar.M;
                                        r8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z11 = false;
                                r8Var.c(string29, z11, true);
                                tL_chatBannedRights5 = kqVar.M;
                                r8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z40) {
                        tL_chatAdminRights2 = kqVar.J;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z10 = true;
                            r8Var.c(string30, z10, true);
                            i19 = kqVar.y;
                            if (i19 == 2) {
                                tL_chatAdminRights = kqVar.K;
                                r8Var.setIcon((tL_chatAdminRights.manage_ranks || z41) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z10 = false;
                    r8Var.c(string30, z10, true);
                    i19 = kqVar.y;
                    if (i19 == 2) {
                    }
                } else if (i10 == kqVar.v0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = kqVar.L;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = kqVar.M;
                        if (!tL_chatBannedRights3.send_plain) {
                            z4 = true;
                            r8Var.c(string31, z4, true);
                            tL_chatBannedRights2 = kqVar.M;
                            r8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z4 = false;
                    r8Var.c(string31, z4, true);
                    tL_chatBannedRights2 = kqVar.M;
                    r8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = kqVar.y;
                if (i47 != 2 && i10 == kqVar.v0) {
                    tL_chatBannedRights21 = kqVar.L;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = kqVar.M;
                        break;
                    }
                    z39 = false;
                    r8Var.setEnabled(z39);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i48 != 2 || (i10 != kqVar.l0 && i10 != kqVar.t0)) {
                    z6Var.setAlpha(1.0f);
                    break;
                } else {
                    z6Var.setAlpha(kqVar.G);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == kqVar.J0) {
                    int i59 = kqVar.L.until_date;
                    y8Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i59 == 0 || Math.abs(((long) i59) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(kqVar.L.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                String string32 = (UserObject.isUserSelf(kqVar.v) && kqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                c6Var.getTextView().setEnabled(kqVar.F || kqVar.w.creator);
                c6Var.getTextView().setSingleLine(true);
                c6Var.getTextView().setImeOptions(6);
                c6Var.n(kqVar.P, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z42 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != kqVar.E0) {
                    if (i10 != kqVar.G0) {
                        if (i10 != kqVar.F0) {
                            if (i10 != kqVar.y0) {
                                if (i10 != kqVar.z0) {
                                    if (i10 != kqVar.g0) {
                                        if (i10 != kqVar.A0) {
                                            if (i10 != kqVar.B0) {
                                                if (i10 != kqVar.C0) {
                                                    if (i10 != kqVar.D0) {
                                                        if (i10 != kqVar.M0) {
                                                            if (i10 != kqVar.N0) {
                                                                if (i10 != kqVar.O0) {
                                                                    if (i10 != kqVar.R0) {
                                                                        if (i10 != kqVar.S0) {
                                                                            if (i10 == kqVar.T0) {
                                                                                z1Var.e(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights39.delete_stories, true, z42);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z1Var.e(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights39.edit_stories, true, z42);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z1Var.e(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights39.post_stories, true, z42);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    z1Var.e(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights39.delete_messages, true, z42);
                                                                    break;
                                                                }
                                                            } else {
                                                                z1Var.e(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights39.edit_messages, true, z42);
                                                                break;
                                                            }
                                                        } else {
                                                            z1Var.e(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights39.post_messages, true, z42);
                                                            break;
                                                        }
                                                    } else {
                                                        z1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (kqVar.L.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z42);
                                                        z1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (kqVar.L.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z42);
                                                    z1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (kqVar.L.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z42);
                                                z1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (kqVar.L.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z42);
                                            z1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (kqVar.L.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        z1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (kqVar.L.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z42);
                                    z1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (kqVar.L.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z42);
                                z1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (kqVar.L.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z42);
                            z1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = kqVar.L;
                        z1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z42);
                        z1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (kqVar.L.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z42);
                    z1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.g01) view).a(kqVar.v, kqVar.P, i48 == 0, false, new w3(this, 2));
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.c;
        kq kqVar = this.e;
        switch (i10) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = uaVar;
                break;
            case 1:
                view2 = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
            default:
                View aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = aaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = m4Var;
                view2 = view;
                break;
            case 4:
            case 9:
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = r8Var;
                break;
            case 5:
                view2 = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 6:
                View y8Var = new org.telegram.ui.Cells.y8(context, null, false);
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = y8Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                c6Var.c(new n0(this, 4));
                view2 = c6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                kqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.k6.a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                kqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
                kqVar.f = k6Var;
                k6Var.setTypeface(AndroidUtilities.bold());
                kqVar.f.setTextColor(-1);
                kqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                kqVar.f.setGravity(17);
                org.telegram.ui.Components.k6 k6Var2 = kqVar.f;
                StringBuilder sb = new StringBuilder();
                b.i(R.string.AddBotButton, " ", sb);
                sb.append(LocaleController.getString(kqVar.H ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                k6Var2.setText(sb.toString());
                kqVar.e.addView(kqVar.f, k7.c6.e(-2, -2, 17));
                kqVar.e.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                kqVar.e.setOnClickListener(new a(this, 15));
                kqVar.d.addView(kqVar.e, k7.c6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                kqVar.d.setLayoutParams(new f2.x0(-1, -2));
                View view3 = new View(context);
                view3.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                kqVar.d.setClipChildren(false);
                kqVar.d.setClipToPadding(false);
                kqVar.d.addView(view3, k7.c6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view2 = kqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, kqVar.getResourceProvider(), false);
                z1Var.setPad(1);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                z1Var.setEnabled(true);
                z1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = z1Var;
                view2 = view;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.p2) kqVar).currentAccount;
                long j10 = -kqVar.s;
                g6Var = ((org.telegram.ui.ActionBar.p2) kqVar).resourceProvider;
                view2 = new org.telegram.ui.Components.g01(i11, j10, this.c, g6Var);
                break;
        }
        return new org.telegram.ui.Components.fl0(view2);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        int b10 = m1Var.b();
        kq kqVar = this.e;
        if (b10 == kqVar.r0) {
            kq.f0(kqVar, m1Var.a);
        }
    }

    @Override // f2.p0
    public final void z(f2.m1 m1Var) {
        int b10 = m1Var.b();
        kq kqVar = this.e;
        if (b10 != kqVar.s0 || kqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(kqVar.getParentActivity().getCurrentFocus());
    }
}
