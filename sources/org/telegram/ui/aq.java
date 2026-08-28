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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class aq extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ bq e;

    public aq(bq bqVar, Context context) {
        this.e = bqVar;
        if (bqVar.y == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        TLRPC.Chat chat;
        int i9 = q1Var.f;
        bq bqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.L;
        int i10 = bqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.J;
        if (!bqVar.w.creator || ((i10 != 0 && (i10 != 2 || !bqVar.G)) || i9 != 4 || q1Var.b() != bqVar.a0)) {
            if (!bqVar.E) {
                return false;
            }
            if ((i10 == 0 || i10 == 2) && i9 == 4) {
                int b10 = q1Var.b();
                if (b10 == bqVar.S) {
                    if (!tL_chatAdminRights.add_admins && ((chat = bqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i10 == 2 && !bqVar.G) {
                        return false;
                    }
                    if (b10 == bqVar.T) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !bqVar.A) {
                            return false;
                        }
                    } else {
                        if (b10 == bqVar.U) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == bqVar.V) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == bqVar.W) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == bqVar.X) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == bqVar.Y) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == bqVar.G0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == bqVar.Z) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == bqVar.a0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == bqVar.b0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == bqVar.c0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == bqVar.d0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == bqVar.e0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == bqVar.i0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == bqVar.Q0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == bqVar.R0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == bqVar.S0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == bqVar.j0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i9 == 3 || i9 == 1 || i9 == 5 || i9 == 8 || i9 == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.R;
    }

    @Override // f2.r0
    public final long i(int i9) {
        bq bqVar = this.e;
        if (bqVar.y != 2) {
            return -1L;
        }
        if (i9 == bqVar.S) {
            return 1L;
        }
        if (i9 == bqVar.T) {
            return 2L;
        }
        if (i9 == bqVar.U) {
            return 3L;
        }
        if (i9 == bqVar.X) {
            return 4L;
        }
        if (i9 == bqVar.Y) {
            return 5L;
        }
        if (i9 == bqVar.Z) {
            return 6L;
        }
        if (i9 == bqVar.a0) {
            return 7L;
        }
        if (i9 == bqVar.b0) {
            return 8L;
        }
        if (i9 == bqVar.c0) {
            return 9L;
        }
        if (i9 == bqVar.d0) {
            return 10L;
        }
        if (i9 == bqVar.k0) {
            return 11L;
        }
        if (i9 == bqVar.l0) {
            return 12L;
        }
        if (i9 == bqVar.m0) {
            return 13L;
        }
        if (i9 == bqVar.n0) {
            return 14L;
        }
        if (i9 == bqVar.o0) {
            return 15L;
        }
        if (i9 == bqVar.p0) {
            return 16L;
        }
        if (i9 == bqVar.q0) {
            return 17L;
        }
        if (i9 == bqVar.r0) {
            return 18L;
        }
        if (i9 == bqVar.s0) {
            return 19L;
        }
        if (i9 == bqVar.u0) {
            return 20L;
        }
        if (i9 == bqVar.x0) {
            return 21L;
        }
        if (i9 == bqVar.D0) {
            return 22L;
        }
        if (i9 == bqVar.E0) {
            return 23L;
        }
        if (i9 == bqVar.F0) {
            return 24L;
        }
        if (i9 == bqVar.G0) {
            return 25L;
        }
        if (i9 == bqVar.H0) {
            return 26L;
        }
        if (i9 == bqVar.I0) {
            return 27L;
        }
        if (i9 == bqVar.t0) {
            return 28L;
        }
        if (i9 == bqVar.i0) {
            return 29L;
        }
        if (i9 == bqVar.y0) {
            return 30L;
        }
        if (i9 == bqVar.A0) {
            return 31L;
        }
        if (i9 == bqVar.z0) {
            return 32L;
        }
        if (i9 == bqVar.B0) {
            return 33L;
        }
        if (i9 == bqVar.C0) {
            return 34L;
        }
        if (i9 == bqVar.v0) {
            return 35L;
        }
        if (i9 == bqVar.J0) {
            return 36L;
        }
        if (i9 == bqVar.L0) {
            return 37L;
        }
        if (i9 == bqVar.M0) {
            return 38L;
        }
        if (i9 == bqVar.N0) {
            return 39L;
        }
        if (i9 == bqVar.O0) {
            return 40L;
        }
        if (i9 == bqVar.Q0) {
            return 41L;
        }
        if (i9 == bqVar.R0) {
            return 42L;
        }
        if (i9 == bqVar.S0) {
            return 43L;
        }
        if (i9 == bqVar.V) {
            return 44L;
        }
        if (i9 == bqVar.e0) {
            return 45L;
        }
        if (i9 == bqVar.f0) {
            return 46L;
        }
        if (i9 == bqVar.g0) {
            return 47L;
        }
        if (i9 == bqVar.h0) {
            return 48L;
        }
        if (i9 == bqVar.j0) {
            return 49L;
        }
        return i9 == bqVar.W ? 50L : 0L;
    }

    @Override // f2.r0
    public final int j(int i9) {
        bq bqVar = this.e;
        if (i9 == bqVar.D0 || i9 == bqVar.F0 || i9 == bqVar.E0 || i9 == bqVar.x0 || i9 == bqVar.y0 || i9 == bqVar.A0 || i9 == bqVar.z0 || i9 == bqVar.C0 || i9 == bqVar.B0 || i9 == bqVar.f0 || i9 == bqVar.L0 || i9 == bqVar.M0 || i9 == bqVar.N0 || i9 == bqVar.Q0 || i9 == bqVar.R0 || i9 == bqVar.S0) {
            return 10;
        }
        if (i9 == bqVar.v0 || i9 == bqVar.J0 || i9 == bqVar.O0) {
            return 9;
        }
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1 || i9 == bqVar.k0 || i9 == bqVar.m0 || i9 == bqVar.H0 || i9 == bqVar.o0) {
            return 5;
        }
        if (i9 == 2 || i9 == bqVar.q0) {
            return 3;
        }
        if (i9 == bqVar.T || i9 == bqVar.U || i9 == bqVar.V || i9 == bqVar.X || i9 == bqVar.Y || i9 == bqVar.Z || i9 == bqVar.b0 || i9 == bqVar.c0 || i9 == bqVar.d0 || i9 == bqVar.e0 || i9 == bqVar.u0 || i9 == bqVar.a0 || i9 == bqVar.G0 || i9 == bqVar.S || i9 == bqVar.i0 || i9 == bqVar.g0 || i9 == bqVar.j0 || i9 == bqVar.W) {
            return 4;
        }
        if (i9 == bqVar.n0 || i9 == bqVar.s0 || i9 == bqVar.h0) {
            return 1;
        }
        if (i9 == bqVar.I0) {
            return 6;
        }
        if (i9 == bqVar.r0) {
            return 11;
        }
        return i9 == bqVar.t0 ? 8 : 2;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLRPC.User user;
        TLRPC.User user2;
        String string;
        int i11;
        TLRPC.User user3;
        String formatString;
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
        bq bqVar = this.e;
        int i47 = bqVar.y;
        boolean z37 = bqVar.Q;
        boolean z38 = bqVar.B;
        boolean z39 = bqVar.A;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = bqVar.I;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = bqVar.L;
        int i48 = q1Var.f;
        View view = q1Var.a;
        final int i49 = 2;
        switch (i48) {
            case 0:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                i10 = bqVar.y;
                String string2 = i10 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = bqVar.v;
                uaVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == bqVar.h0) {
                    b9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i9 == bqVar.n0) {
                    b9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i9 == bqVar.s0) {
                    user2 = bqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = bqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i11 = bqVar.y;
                            if (i11 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i50 = R.string.EditMemberRankInfo;
                                user3 = bqVar.v;
                                formatString = LocaleController.formatString(i50, UserObject.getUserName(user3));
                            }
                            b9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i11 = bqVar.y;
                    if (i11 != 0) {
                    }
                    b9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                if (i9 != bqVar.l0) {
                    if (i9 == bqVar.p0) {
                        int i51 = org.telegram.ui.ActionBar.f6.G6;
                        baVar.setTextColor(org.telegram.ui.ActionBar.f6.u0(i51));
                        baVar.setTag(Integer.valueOf(i51));
                        if (!z39) {
                            baVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            baVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    int i52 = org.telegram.ui.ActionBar.f6.p7;
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.u0(i52));
                    baVar.setTag(Integer.valueOf(i52));
                    i12 = bqVar.y;
                    if (i12 != 0) {
                        i13 = bqVar.y;
                        if (i13 == 1) {
                            baVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        baVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 != 2) {
                    if (i9 == bqVar.q0) {
                        m4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i14 = bqVar.y;
                    if (i14 != 2) {
                        user4 = bqVar.v;
                        if (user4 != null) {
                            user5 = bqVar.v;
                            break;
                        }
                        i15 = bqVar.y;
                        if (i15 != 0) {
                            i16 = bqVar.y;
                            if (i16 == 1) {
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
                final int i53 = 0;
                boolean z40 = true;
                final org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                boolean z41 = i47 != 2 || bqVar.G;
                TLRPC.Chat chat3 = bqVar.w;
                boolean z42 = chat3 != null && chat3.creator;
                if (i9 == bqVar.v0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = bqVar.L;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = bqVar.K;
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
                    s8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r11 > 0, true, true);
                    Locale locale = Locale.US;
                    s8Var.a(new Runnable(this) { // from class: org.telegram.ui.zp
                        public final /* synthetic */ aq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i53) {
                                case 0:
                                    bq bqVar2 = this.b.e;
                                    org.telegram.ui.Cells.s8 s8Var2 = s8Var;
                                    if (s8Var2.isEnabled()) {
                                        if (!bq.k0(bqVar2)) {
                                            boolean z43 = s8Var2.d.h;
                                            s8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar2.K;
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
                                            AndroidUtilities.updateVisibleRows(bqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar2.getParentActivity());
                                            alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.s8 s8Var3 = s8Var;
                                    if (s8Var3.isEnabled()) {
                                        boolean z44 = s8Var3.d.h;
                                        s8Var3.setChecked(z44);
                                        bq bqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = bqVar3.I;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(bqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.s8 s8Var4 = s8Var;
                                    if (s8Var4.isEnabled()) {
                                        boolean z46 = s8Var4.d.h;
                                        s8Var4.setChecked(z46);
                                        bq bqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = bqVar4.I;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(bqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, ta.b.c(r11, "/10"), !bqVar.w0);
                    s8Var.setIcon(bq.k0(bqVar) ? R.drawable.permission_locked : 0);
                } else if (i9 == bqVar.J0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i54 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i54 = r42 + 1;
                    }
                    int i55 = i54;
                    if (tL_chatAdminRights39.delete_messages) {
                        i55 = i54 + 1;
                    }
                    s8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i55 > 0, true, true);
                    Locale locale2 = Locale.US;
                    s8Var.a(new Runnable(this) { // from class: org.telegram.ui.zp
                        public final /* synthetic */ aq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bq bqVar2 = this.b.e;
                                    org.telegram.ui.Cells.s8 s8Var2 = s8Var;
                                    if (s8Var2.isEnabled()) {
                                        if (!bq.k0(bqVar2)) {
                                            boolean z43 = s8Var2.d.h;
                                            s8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar2.K;
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
                                            AndroidUtilities.updateVisibleRows(bqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar2.getParentActivity());
                                            alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.s8 s8Var3 = s8Var;
                                    if (s8Var3.isEnabled()) {
                                        boolean z44 = s8Var3.d.h;
                                        s8Var3.setChecked(z44);
                                        bq bqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = bqVar3.I;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(bqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.s8 s8Var4 = s8Var;
                                    if (s8Var4.isEnabled()) {
                                        boolean z46 = s8Var4.d.h;
                                        s8Var4.setChecked(z46);
                                        bq bqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = bqVar4.I;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(bqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, ta.b.c(i55, "/3"), !bqVar.K0);
                } else if (i9 == bqVar.O0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = bqVar.I;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i56 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i56 = r52 + 1;
                    }
                    int i57 = i56;
                    if (tL_chatAdminRights40.delete_stories) {
                        i57 = i56 + 1;
                    }
                    s8Var.d(LocaleController.getString(R.string.ChannelManageStories), i57 > 0, true, true);
                    Locale locale3 = Locale.US;
                    s8Var.a(new Runnable(this) { // from class: org.telegram.ui.zp
                        public final /* synthetic */ aq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i49) {
                                case 0:
                                    bq bqVar2 = this.b.e;
                                    org.telegram.ui.Cells.s8 s8Var2 = s8Var;
                                    if (s8Var2.isEnabled()) {
                                        if (!bq.k0(bqVar2)) {
                                            boolean z43 = s8Var2.d.h;
                                            s8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar2.K;
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
                                            AndroidUtilities.updateVisibleRows(bqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar2.getParentActivity());
                                            alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.s8 s8Var3 = s8Var;
                                    if (s8Var3.isEnabled()) {
                                        boolean z44 = s8Var3.d.h;
                                        s8Var3.setChecked(z44);
                                        bq bqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = bqVar3.I;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(bqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.s8 s8Var4 = s8Var;
                                    if (s8Var4.isEnabled()) {
                                        boolean z46 = s8Var4.d.h;
                                        s8Var4.setChecked(z46);
                                        bq bqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = bqVar4.I;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(bqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, ta.b.c(i57, "/3"), !bqVar.P0);
                } else if (i9 == bqVar.S) {
                    s8Var.d(LocaleController.getString(R.string.ManageGroup), bqVar.G, true, false);
                    tL_chatAdminRights38 = bqVar.J;
                    s8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i9 == bqVar.T) {
                    i42 = bqVar.y;
                    if (i42 != 0) {
                        i44 = bqVar.y;
                        if (i44 != 2) {
                            i45 = bqVar.y;
                            if (i45 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = bqVar.K;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = bqVar.L;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        s8Var.c(string3, z36, bqVar.i0 == -1);
                                        tL_chatBannedRights19 = bqVar.L;
                                        s8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                s8Var.c(string3, z36, bqVar.i0 == -1);
                                tL_chatBannedRights19 = bqVar.L;
                                s8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = bqVar.I;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                s8Var.c(string4, z35, true);
                            }
                        }
                        z35 = false;
                        s8Var.c(string4, z35, true);
                    } else if (z39) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z41) {
                            tL_chatAdminRights35 = bqVar.I;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                s8Var.c(string5, z34, true);
                            }
                        }
                        z34 = false;
                        s8Var.c(string5, z34, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z41) {
                            tL_chatAdminRights34 = bqVar.I;
                            break;
                        }
                        tL_chatBannedRights17 = bqVar.L;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            s8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        s8Var.c(string6, z33, true);
                    }
                    i43 = bqVar.y;
                    if (i43 == 2) {
                        tL_chatAdminRights36 = bqVar.J;
                        s8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i9 == bqVar.U) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = bqVar.I;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            s8Var.c(string7, z32, true);
                            i41 = bqVar.y;
                            if (i41 == 2) {
                                tL_chatAdminRights32 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    s8Var.c(string7, z32, true);
                    i41 = bqVar.y;
                    if (i41 == 2) {
                    }
                } else if (i9 == bqVar.W) {
                    user8 = bqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = bqVar.I;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                s8Var.c(string8, z31, true);
                            }
                        }
                        z31 = false;
                        s8Var.c(string8, z31, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights29 = bqVar.I;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                s8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        s8Var.c(string9, z30, true);
                    }
                    i40 = bqVar.y;
                    if (i40 == 2) {
                        tL_chatAdminRights30 = bqVar.J;
                        s8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i9 == bqVar.V) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = bqVar.I;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            s8Var.c(string10, z29, true);
                            i39 = bqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights27 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    s8Var.c(string10, z29, true);
                    i39 = bqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i9 == bqVar.X) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = bqVar.I;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            s8Var.c(string11, z28, true);
                            i38 = bqVar.y;
                            if (i38 == 2) {
                                tL_chatAdminRights25 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    s8Var.c(string11, z28, true);
                    i38 = bqVar.y;
                    if (i38 == 2) {
                    }
                } else if (i9 == bqVar.Y) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = bqVar.I;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                s8Var.c(string12, z27, true);
                            }
                        }
                        z27 = false;
                        s8Var.c(string12, z27, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights22 = bqVar.I;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                s8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        s8Var.c(string13, z26, true);
                    }
                    i37 = bqVar.y;
                    if (i37 == 2) {
                        tL_chatAdminRights23 = bqVar.J;
                        s8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i9 == bqVar.Z) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = bqVar.I;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            s8Var.c(string14, z25, (bqVar.b0 == -1 && z39) || bqVar.a0 != -1);
                            i36 = bqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights20 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    s8Var.c(string14, z25, (bqVar.b0 == -1 && z39) || bqVar.a0 != -1);
                    i36 = bqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i9 == bqVar.a0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = bqVar.I;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            s8Var.c(string15, z24, bqVar.i0 == -1 || z37);
                            i35 = bqVar.y;
                            if (i35 == 2) {
                                tL_chatAdminRights18 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    s8Var.c(string15, z24, bqVar.i0 == -1 || z37);
                    i35 = bqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i9 == bqVar.g0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (bqVar.x != null) {
                        user6 = bqVar.v;
                        if (user6 != null) {
                            long j10 = bqVar.r ? bqVar.n : bqVar.x.guard_bot_id;
                            user7 = bqVar.v;
                            if (j10 == user7.id) {
                                z23 = true;
                                s8Var.c(string16, z23, false);
                                i34 = bqVar.y;
                                if (i34 == 2) {
                                    s8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    s8Var.c(string16, z23, false);
                    i34 = bqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i9 == bqVar.b0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = bqVar.I;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            s8Var.c(string17, z22, !z38);
                            i33 = bqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights16 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    s8Var.c(string17, z22, !z38);
                    i33 = bqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i9 == bqVar.j0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = bqVar.I;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            s8Var.c(string18, z21, true);
                            i32 = bqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights14 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    s8Var.c(string18, z21, true);
                    i32 = bqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i9 == bqVar.G0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = bqVar.I;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            s8Var.c(string19, z20, true);
                            i31 = bqVar.y;
                            if (i31 == 2) {
                                tL_chatAdminRights12 = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    s8Var.c(string19, z20, true);
                    i31 = bqVar.y;
                    if (i31 == 2) {
                    }
                } else if (i9 == bqVar.i0) {
                    i28 = bqVar.y;
                    if (i28 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = bqVar.I;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                s8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        s8Var.c(string20, z19, z37);
                    } else {
                        i29 = bqVar.y;
                        if (i29 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = bqVar.K;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = bqVar.L;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    s8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = bqVar.L;
                                    s8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            s8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = bqVar.L;
                            s8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i30 = bqVar.y;
                            if (i30 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = bqVar.I;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        s8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = bqVar.J;
                                        s8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                s8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = bqVar.J;
                                s8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i9 == bqVar.c0) {
                    i25 = bqVar.y;
                    if (i25 == 0) {
                        chat2 = bqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = bqVar.I;
                            s8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = bqVar.I;
                            s8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i26 = bqVar.y;
                        if (i26 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = bqVar.K;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = bqVar.L;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    s8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = bqVar.L;
                                    s8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            s8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = bqVar.L;
                            s8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i27 = bqVar.y;
                            if (i27 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = bqVar.I;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        s8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = bqVar.J;
                                        s8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                s8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = bqVar.J;
                                s8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i9 == bqVar.d0) {
                    i21 = bqVar.y;
                    if (i21 != 0) {
                        i23 = bqVar.y;
                        if (i23 != 2) {
                            i24 = bqVar.y;
                            if (i24 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = bqVar.K;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = bqVar.L;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        s8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = bqVar.L;
                                        s8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                s8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = bqVar.L;
                                s8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = bqVar.I;
                        break;
                    }
                    tL_chatBannedRights7 = bqVar.L;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        s8Var.c(string28, z13, true);
                        i22 = bqVar.y;
                        if (i22 == 2) {
                            tL_chatAdminRights3 = bqVar.J;
                            s8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    s8Var.c(string28, z13, true);
                    i22 = bqVar.y;
                    if (i22 == 2) {
                    }
                } else if (i9 == bqVar.e0) {
                    i17 = bqVar.y;
                    if (i17 != 0) {
                        i19 = bqVar.y;
                        if (i19 != 2) {
                            i20 = bqVar.y;
                            if (i20 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = bqVar.K;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = bqVar.L;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        s8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = bqVar.L;
                                        s8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                s8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = bqVar.L;
                                s8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = bqVar.I;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            s8Var.c(string30, z11, true);
                            i18 = bqVar.y;
                            if (i18 == 2) {
                                tL_chatAdminRights = bqVar.J;
                                s8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    s8Var.c(string30, z11, true);
                    i18 = bqVar.y;
                    if (i18 == 2) {
                    }
                } else if (i9 == bqVar.u0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = bqVar.K;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = bqVar.L;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            s8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = bqVar.L;
                            s8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    s8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = bqVar.L;
                    s8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i46 = bqVar.y;
                if (i46 != 2 && i9 == bqVar.u0) {
                    tL_chatBannedRights21 = bqVar.K;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = bqVar.L;
                        break;
                    }
                    z40 = false;
                    s8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i47 != 2 || (i9 != bqVar.k0 && i9 != bqVar.s0)) {
                    z6Var.setAlpha(1.0f);
                    break;
                } else {
                    z6Var.setAlpha(bqVar.F);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i9 == bqVar.I0) {
                    int i58 = bqVar.K.until_date;
                    z8Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(bqVar.K.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                String string32 = (UserObject.isUserSelf(bqVar.v) && bqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                c6Var.getTextView().setEnabled(bqVar.E || bqVar.w.creator);
                c6Var.getTextView().setSingleLine(true);
                c6Var.getTextView().setImeOptions(6);
                c6Var.n(bqVar.O, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z43 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i9;
                z1Var.setTag(Integer.valueOf(i9));
                if (i9 != bqVar.D0) {
                    if (i9 != bqVar.F0) {
                        if (i9 != bqVar.E0) {
                            if (i9 != bqVar.x0) {
                                if (i9 != bqVar.y0) {
                                    if (i9 != bqVar.f0) {
                                        if (i9 != bqVar.z0) {
                                            if (i9 != bqVar.A0) {
                                                if (i9 != bqVar.B0) {
                                                    if (i9 != bqVar.C0) {
                                                        if (i9 != bqVar.L0) {
                                                            if (i9 != bqVar.M0) {
                                                                if (i9 != bqVar.N0) {
                                                                    if (i9 != bqVar.Q0) {
                                                                        if (i9 != bqVar.R0) {
                                                                            if (i9 == bqVar.S0) {
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
                                                        z1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (bqVar.K.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        z1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (bqVar.K.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    z1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (bqVar.K.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                z1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (bqVar.K.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            z1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (bqVar.K.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        z1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (bqVar.K.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    z1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (bqVar.K.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                z1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (bqVar.K.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            z1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar.K;
                        z1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        z1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (bqVar.K.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    z1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.iz0) view).a(bqVar.v, bqVar.O, i47 == 0, false, new w3(this, 2));
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.c;
        bq bqVar = this.e;
        switch (i9) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = uaVar;
                break;
            case 1:
                view2 = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
            default:
                View baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = baVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.f6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = m4Var;
                view2 = view;
                break;
            case 4:
            case 9:
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = s8Var;
                break;
            case 5:
                view2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 6:
                View z8Var = new org.telegram.ui.Cells.z8(context, null, false);
                z8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view2 = z8Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                c6Var.b(new o0(this, 4));
                view2 = c6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                bqVar.d = frameLayout;
                int i11 = org.telegram.ui.ActionBar.f6.a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                bqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
                bqVar.f = j6Var;
                j6Var.setTypeface(AndroidUtilities.bold());
                bqVar.f.setTextColor(-1);
                bqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                bqVar.f.setGravity(17);
                org.telegram.ui.Components.j6 j6Var2 = bqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(bqVar.G ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                j6Var2.setText(sb2.toString());
                bqVar.e.addView(bqVar.f, g7.e6.e(-2, -2, 17));
                bqVar.e.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                bqVar.e.setOnClickListener(new a(this, 15));
                bqVar.d.addView(bqVar.e, g7.e6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                bqVar.d.setLayoutParams(new f2.a1(-1, -2));
                View view3 = new View(context);
                view3.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                bqVar.d.setClipChildren(false);
                bqVar.d.setClipToPadding(false);
                bqVar.d.addView(view3, g7.e6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view2 = bqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, bqVar.getResourceProvider(), false);
                z1Var.setPad(1);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.f6.V6, org.telegram.ui.ActionBar.f6.g7, org.telegram.ui.ActionBar.f6.k7);
                z1Var.setEnabled(true);
                z1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                view = z1Var;
                view2 = view;
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.o2) bqVar).currentAccount;
                long j10 = -bqVar.s;
                b6Var = ((org.telegram.ui.ActionBar.o2) bqVar).resourceProvider;
                view2 = new org.telegram.ui.Components.iz0(i10, j10, this.c, b6Var);
                break;
        }
        return new org.telegram.ui.Components.ik0(view2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int b10 = q1Var.b();
        bq bqVar = this.e;
        if (b10 == bqVar.q0) {
            bq.e0(bqVar, q1Var.a);
        }
    }

    @Override // f2.r0
    public final void z(f2.q1 q1Var) {
        int b10 = q1Var.b();
        bq bqVar = this.e;
        if (b10 != bqVar.r0 || bqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(bqVar.getParentActivity().getCurrentFocus());
    }
}
