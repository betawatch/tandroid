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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kq extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ lq e;

    public kq(lq lqVar, Context context) {
        this.e = lqVar;
        if (lqVar.y == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f;
        lq lqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = lqVar.P;
        int i11 = lqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = lqVar.N;
        if (!lqVar.w.creator || ((i11 != 0 && (i11 != 2 || !lqVar.K)) || i10 != 4 || c1Var.b() != lqVar.e0)) {
            if (!lqVar.I) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = c1Var.b();
                if (b10 == lqVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = lqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !lqVar.K) {
                        return false;
                    }
                    if (b10 == lqVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !lqVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == lqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == lqVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == lqVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == lqVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == lqVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == lqVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == lqVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == lqVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == lqVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == lqVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == lqVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == lqVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == lqVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == lqVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == lqVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == lqVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == lqVar.n0) {
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
        lq lqVar = this.e;
        if (lqVar.y != 2) {
            return -1L;
        }
        if (i10 == lqVar.W) {
            return 1L;
        }
        if (i10 == lqVar.X) {
            return 2L;
        }
        if (i10 == lqVar.Y) {
            return 3L;
        }
        if (i10 == lqVar.b0) {
            return 4L;
        }
        if (i10 == lqVar.c0) {
            return 5L;
        }
        if (i10 == lqVar.d0) {
            return 6L;
        }
        if (i10 == lqVar.e0) {
            return 7L;
        }
        if (i10 == lqVar.f0) {
            return 8L;
        }
        if (i10 == lqVar.g0) {
            return 9L;
        }
        if (i10 == lqVar.h0) {
            return 10L;
        }
        if (i10 == lqVar.o0) {
            return 11L;
        }
        if (i10 == lqVar.p0) {
            return 12L;
        }
        if (i10 == lqVar.q0) {
            return 13L;
        }
        if (i10 == lqVar.r0) {
            return 14L;
        }
        if (i10 == lqVar.s0) {
            return 15L;
        }
        if (i10 == lqVar.t0) {
            return 16L;
        }
        if (i10 == lqVar.u0) {
            return 17L;
        }
        if (i10 == lqVar.v0) {
            return 18L;
        }
        if (i10 == lqVar.w0) {
            return 19L;
        }
        if (i10 == lqVar.y0) {
            return 20L;
        }
        if (i10 == lqVar.B0) {
            return 21L;
        }
        if (i10 == lqVar.H0) {
            return 22L;
        }
        if (i10 == lqVar.I0) {
            return 23L;
        }
        if (i10 == lqVar.J0) {
            return 24L;
        }
        if (i10 == lqVar.K0) {
            return 25L;
        }
        if (i10 == lqVar.L0) {
            return 26L;
        }
        if (i10 == lqVar.M0) {
            return 27L;
        }
        if (i10 == lqVar.x0) {
            return 28L;
        }
        if (i10 == lqVar.m0) {
            return 29L;
        }
        if (i10 == lqVar.C0) {
            return 30L;
        }
        if (i10 == lqVar.E0) {
            return 31L;
        }
        if (i10 == lqVar.D0) {
            return 32L;
        }
        if (i10 == lqVar.F0) {
            return 33L;
        }
        if (i10 == lqVar.G0) {
            return 34L;
        }
        if (i10 == lqVar.z0) {
            return 35L;
        }
        if (i10 == lqVar.N0) {
            return 36L;
        }
        if (i10 == lqVar.P0) {
            return 37L;
        }
        if (i10 == lqVar.Q0) {
            return 38L;
        }
        if (i10 == lqVar.R0) {
            return 39L;
        }
        if (i10 == lqVar.S0) {
            return 40L;
        }
        if (i10 == lqVar.U0) {
            return 41L;
        }
        if (i10 == lqVar.V0) {
            return 42L;
        }
        if (i10 == lqVar.W0) {
            return 43L;
        }
        if (i10 == lqVar.Z) {
            return 44L;
        }
        if (i10 == lqVar.i0) {
            return 45L;
        }
        if (i10 == lqVar.j0) {
            return 46L;
        }
        if (i10 == lqVar.k0) {
            return 47L;
        }
        if (i10 == lqVar.l0) {
            return 48L;
        }
        if (i10 == lqVar.n0) {
            return 49L;
        }
        return i10 == lqVar.a0 ? 50L : 0L;
    }

    @Override // s4.h0
    public final int j(int i10) {
        lq lqVar = this.e;
        if (i10 == lqVar.H0 || i10 == lqVar.J0 || i10 == lqVar.I0 || i10 == lqVar.B0 || i10 == lqVar.C0 || i10 == lqVar.E0 || i10 == lqVar.D0 || i10 == lqVar.G0 || i10 == lqVar.F0 || i10 == lqVar.j0 || i10 == lqVar.P0 || i10 == lqVar.Q0 || i10 == lqVar.R0 || i10 == lqVar.U0 || i10 == lqVar.V0 || i10 == lqVar.W0) {
            return 10;
        }
        if (i10 == lqVar.z0 || i10 == lqVar.N0 || i10 == lqVar.S0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == lqVar.o0 || i10 == lqVar.q0 || i10 == lqVar.L0 || i10 == lqVar.s0) {
            return 5;
        }
        if (i10 == 2 || i10 == lqVar.u0) {
            return 3;
        }
        if (i10 == lqVar.X || i10 == lqVar.Y || i10 == lqVar.Z || i10 == lqVar.b0 || i10 == lqVar.c0 || i10 == lqVar.d0 || i10 == lqVar.f0 || i10 == lqVar.g0 || i10 == lqVar.h0 || i10 == lqVar.i0 || i10 == lqVar.y0 || i10 == lqVar.e0 || i10 == lqVar.K0 || i10 == lqVar.W || i10 == lqVar.m0 || i10 == lqVar.k0 || i10 == lqVar.n0 || i10 == lqVar.a0) {
            return 4;
        }
        if (i10 == lqVar.r0 || i10 == lqVar.w0 || i10 == lqVar.l0) {
            return 1;
        }
        if (i10 == lqVar.M0) {
            return 6;
        }
        if (i10 == lqVar.v0) {
            return 11;
        }
        return i10 == lqVar.x0 ? 8 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0a41, code lost:
    
        if (r2.view_messages == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0524, code lost:
    
        if (r6.change_info == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x095c, code lost:
    
        if (r6.pin_messages == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a60, code lost:
    
        if (r2.bot != false) goto L806;
     */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x0b50  */
    /* JADX WARN: Type inference failed for: r4v125, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v152, types: [boolean, int] */
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
        lq lqVar = this.e;
        int i48 = lqVar.y;
        boolean z37 = lqVar.U;
        boolean z38 = lqVar.F;
        boolean z39 = lqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = lqVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = lqVar.P;
        int i49 = c1Var.f;
        View view = c1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                i11 = lqVar.y;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = lqVar.v;
                abVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == lqVar.l0) {
                    f9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == lqVar.r0) {
                    f9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == lqVar.w0) {
                    user2 = lqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = lqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = lqVar.y;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = lqVar.v;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            f9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = lqVar.y;
                    if (i12 != 0) {
                    }
                    f9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                if (i10 != lqVar.p0) {
                    if (i10 == lqVar.t0) {
                        int i52 = org.telegram.ui.ActionBar.h6.G6;
                        faVar.setTextColor(org.telegram.ui.ActionBar.h6.u0(i52));
                        faVar.setTag(Integer.valueOf(i52));
                        if (!z39) {
                            faVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            faVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    int i53 = org.telegram.ui.ActionBar.h6.p7;
                    faVar.setTextColor(org.telegram.ui.ActionBar.h6.u0(i53));
                    faVar.setTag(Integer.valueOf(i53));
                    i13 = lqVar.y;
                    if (i13 != 0) {
                        i14 = lqVar.y;
                        if (i14 == 1) {
                            faVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        faVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != 2) {
                    if (i10 == lqVar.u0) {
                        m4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = lqVar.y;
                    if (i15 != 2) {
                        user4 = lqVar.v;
                        if (user4 != null) {
                            user5 = lqVar.v;
                            break;
                        }
                        i16 = lqVar.y;
                        if (i16 != 0) {
                            i17 = lqVar.y;
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
                boolean z40 = true;
                final org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                boolean z41 = i48 != 2 || lqVar.K;
                TLRPC.Chat chat3 = lqVar.w;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == lqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = lqVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = lqVar.O;
                    r12 = (tL_chatBannedRights25.send_photos || tL_chatBannedRights24.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights25.send_videos && !tL_chatBannedRights24.send_videos) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_stickers && !tL_chatBannedRights24.send_stickers) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_audios && !tL_chatBannedRights24.send_audios) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_docs && !tL_chatBannedRights24.send_docs) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_voices && !tL_chatBannedRights24.send_voices) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_roundvideos && !tL_chatBannedRights24.send_roundvideos) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.embed_links && !tL_chatBannedRights24.embed_links && !tL_chatBannedRights25.send_plain && !tL_chatBannedRights24.send_plain) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_polls && !tL_chatBannedRights24.send_polls) {
                        r12++;
                    }
                    if (!tL_chatBannedRights25.send_reactions && !tL_chatBannedRights24.send_reactions) {
                        r12++;
                    }
                    w8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r12 > 0, true, true);
                    Locale locale = Locale.US;
                    w8Var.a(new Runnable(this) { // from class: org.telegram.ui.jq
                        public final /* synthetic */ kq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i54) {
                                case 0:
                                    lq lqVar2 = this.b.e;
                                    org.telegram.ui.Cells.w8 w8Var2 = w8Var;
                                    if (w8Var2.isEnabled()) {
                                        if (!lq.l0(lqVar2)) {
                                            boolean z43 = w8Var2.d.h;
                                            w8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = lqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(lqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.w8 w8Var3 = w8Var;
                                    if (w8Var3.isEnabled()) {
                                        boolean z44 = w8Var3.d.h;
                                        w8Var3.setChecked(z44);
                                        lq lqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = lqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(lqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.w8 w8Var4 = w8Var;
                                    if (w8Var4.isEnabled()) {
                                        boolean z46 = w8Var4.d.h;
                                        w8Var4.setChecked(z46);
                                        lq lqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = lqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(lqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.n(r12, "/10"), !lqVar.A0);
                    w8Var.setIcon(lq.l0(lqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == lqVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i55 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i55 = r42 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights39.delete_messages) {
                        i56 = i55 + 1;
                    }
                    w8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i56 > 0, true, true);
                    Locale locale2 = Locale.US;
                    w8Var.a(new Runnable(this) { // from class: org.telegram.ui.jq
                        public final /* synthetic */ kq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    lq lqVar2 = this.b.e;
                                    org.telegram.ui.Cells.w8 w8Var2 = w8Var;
                                    if (w8Var2.isEnabled()) {
                                        if (!lq.l0(lqVar2)) {
                                            boolean z43 = w8Var2.d.h;
                                            w8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = lqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(lqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.w8 w8Var3 = w8Var;
                                    if (w8Var3.isEnabled()) {
                                        boolean z44 = w8Var3.d.h;
                                        w8Var3.setChecked(z44);
                                        lq lqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = lqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(lqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.w8 w8Var4 = w8Var;
                                    if (w8Var4.isEnabled()) {
                                        boolean z46 = w8Var4.d.h;
                                        w8Var4.setChecked(z46);
                                        lq lqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = lqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(lqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.n(i56, "/3"), !lqVar.O0);
                } else if (i10 == lqVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = lqVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i57 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i57 = r52 + 1;
                    }
                    int i58 = i57;
                    if (tL_chatAdminRights40.delete_stories) {
                        i58 = i57 + 1;
                    }
                    w8Var.d(LocaleController.getString(R.string.ChannelManageStories), i58 > 0, true, true);
                    Locale locale3 = Locale.US;
                    w8Var.a(new Runnable(this) { // from class: org.telegram.ui.jq
                        public final /* synthetic */ kq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    lq lqVar2 = this.b.e;
                                    org.telegram.ui.Cells.w8 w8Var2 = w8Var;
                                    if (w8Var2.isEnabled()) {
                                        if (!lq.l0(lqVar2)) {
                                            boolean z43 = w8Var2.d.h;
                                            w8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = lqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(lqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.w8 w8Var3 = w8Var;
                                    if (w8Var3.isEnabled()) {
                                        boolean z44 = w8Var3.d.h;
                                        w8Var3.setChecked(z44);
                                        lq lqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = lqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(lqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.w8 w8Var4 = w8Var;
                                    if (w8Var4.isEnabled()) {
                                        boolean z46 = w8Var4.d.h;
                                        w8Var4.setChecked(z46);
                                        lq lqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = lqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(lqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.n(i58, "/3"), !lqVar.T0);
                } else if (i10 == lqVar.W) {
                    w8Var.d(LocaleController.getString(R.string.ManageGroup), lqVar.K, true, false);
                    tL_chatAdminRights38 = lqVar.N;
                    w8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == lqVar.X) {
                    i43 = lqVar.y;
                    if (i43 != 0) {
                        i45 = lqVar.y;
                        if (i45 != 2) {
                            i46 = lqVar.y;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = lqVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = lqVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        w8Var.c(string3, z36, lqVar.m0 == -1);
                                        tL_chatBannedRights19 = lqVar.P;
                                        w8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                w8Var.c(string3, z36, lqVar.m0 == -1);
                                tL_chatBannedRights19 = lqVar.P;
                                w8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = lqVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                w8Var.c(string4, z35, true);
                            }
                        }
                        z35 = false;
                        w8Var.c(string4, z35, true);
                    } else if (z39) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z41) {
                            tL_chatAdminRights35 = lqVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                w8Var.c(string5, z34, true);
                            }
                        }
                        z34 = false;
                        w8Var.c(string5, z34, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z41) {
                            tL_chatAdminRights34 = lqVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = lqVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            w8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        w8Var.c(string6, z33, true);
                    }
                    i44 = lqVar.y;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = lqVar.N;
                        w8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == lqVar.Y) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = lqVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            w8Var.c(string7, z32, true);
                            i42 = lqVar.y;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    w8Var.c(string7, z32, true);
                    i42 = lqVar.y;
                    if (i42 == 2) {
                    }
                } else if (i10 == lqVar.a0) {
                    user8 = lqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = lqVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                w8Var.c(string8, z31, true);
                            }
                        }
                        z31 = false;
                        w8Var.c(string8, z31, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights29 = lqVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                w8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        w8Var.c(string9, z30, true);
                    }
                    i41 = lqVar.y;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = lqVar.N;
                        w8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == lqVar.Z) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = lqVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            w8Var.c(string10, z29, true);
                            i40 = lqVar.y;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    w8Var.c(string10, z29, true);
                    i40 = lqVar.y;
                    if (i40 == 2) {
                    }
                } else if (i10 == lqVar.b0) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = lqVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            w8Var.c(string11, z28, true);
                            i39 = lqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    w8Var.c(string11, z28, true);
                    i39 = lqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i10 == lqVar.c0) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = lqVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                w8Var.c(string12, z27, true);
                            }
                        }
                        z27 = false;
                        w8Var.c(string12, z27, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights22 = lqVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                w8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        w8Var.c(string13, z26, true);
                    }
                    i38 = lqVar.y;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = lqVar.N;
                        w8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == lqVar.d0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = lqVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            w8Var.c(string14, z25, (lqVar.f0 == -1 && z39) || lqVar.e0 != -1);
                            i37 = lqVar.y;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    w8Var.c(string14, z25, (lqVar.f0 == -1 && z39) || lqVar.e0 != -1);
                    i37 = lqVar.y;
                    if (i37 == 2) {
                    }
                } else if (i10 == lqVar.e0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = lqVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            w8Var.c(string15, z24, lqVar.m0 == -1 || z37);
                            i36 = lqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    w8Var.c(string15, z24, lqVar.m0 == -1 || z37);
                    i36 = lqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i10 == lqVar.k0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (lqVar.x != null) {
                        user6 = lqVar.v;
                        if (user6 != null) {
                            long j3 = lqVar.r ? lqVar.n : lqVar.x.guard_bot_id;
                            user7 = lqVar.v;
                            if (j3 == user7.id) {
                                z23 = true;
                                w8Var.c(string16, z23, false);
                                i35 = lqVar.y;
                                if (i35 == 2) {
                                    w8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    w8Var.c(string16, z23, false);
                    i35 = lqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i10 == lqVar.f0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = lqVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            w8Var.c(string17, z22, !z38);
                            i34 = lqVar.y;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    w8Var.c(string17, z22, !z38);
                    i34 = lqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i10 == lqVar.n0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = lqVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            w8Var.c(string18, z21, true);
                            i33 = lqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    w8Var.c(string18, z21, true);
                    i33 = lqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i10 == lqVar.K0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = lqVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            w8Var.c(string19, z20, true);
                            i32 = lqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    w8Var.c(string19, z20, true);
                    i32 = lqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i10 == lqVar.m0) {
                    i29 = lqVar.y;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = lqVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                w8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        w8Var.c(string20, z19, z37);
                    } else {
                        i30 = lqVar.y;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = lqVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = lqVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    w8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = lqVar.P;
                                    w8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            w8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = lqVar.P;
                            w8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = lqVar.y;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = lqVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        w8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = lqVar.N;
                                        w8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                w8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = lqVar.N;
                                w8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == lqVar.g0) {
                    i26 = lqVar.y;
                    if (i26 == 0) {
                        chat2 = lqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = lqVar.M;
                            w8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = lqVar.M;
                            w8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = lqVar.y;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = lqVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = lqVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    w8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = lqVar.P;
                                    w8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            w8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = lqVar.P;
                            w8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = lqVar.y;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = lqVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        w8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = lqVar.N;
                                        w8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                w8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = lqVar.N;
                                w8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == lqVar.h0) {
                    i22 = lqVar.y;
                    if (i22 != 0) {
                        i24 = lqVar.y;
                        if (i24 != 2) {
                            i25 = lqVar.y;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = lqVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = lqVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        w8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = lqVar.P;
                                        w8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                w8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = lqVar.P;
                                w8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = lqVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = lqVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        w8Var.c(string28, z13, true);
                        i23 = lqVar.y;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = lqVar.N;
                            w8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    w8Var.c(string28, z13, true);
                    i23 = lqVar.y;
                    if (i23 == 2) {
                    }
                } else if (i10 == lqVar.i0) {
                    i18 = lqVar.y;
                    if (i18 != 0) {
                        i20 = lqVar.y;
                        if (i20 != 2) {
                            i21 = lqVar.y;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = lqVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = lqVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        w8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = lqVar.P;
                                        w8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                w8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = lqVar.P;
                                w8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = lqVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            w8Var.c(string30, z11, true);
                            i19 = lqVar.y;
                            if (i19 == 2) {
                                tL_chatAdminRights = lqVar.N;
                                w8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    w8Var.c(string30, z11, true);
                    i19 = lqVar.y;
                    if (i19 == 2) {
                    }
                } else if (i10 == lqVar.y0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = lqVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = lqVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            w8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = lqVar.P;
                            w8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    w8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = lqVar.P;
                    w8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = lqVar.y;
                if (i47 != 2 && i10 == lqVar.y0) {
                    tL_chatBannedRights21 = lqVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = lqVar.P;
                        break;
                    }
                    z40 = false;
                    w8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                if (i48 != 2 || (i10 != lqVar.o0 && i10 != lqVar.w0)) {
                    a7Var.setAlpha(1.0f);
                    break;
                } else {
                    a7Var.setAlpha(lqVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (i10 == lqVar.M0) {
                    int i59 = lqVar.O.until_date;
                    d9Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i59 == 0 || Math.abs(((long) i59) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(lqVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                String string32 = (UserObject.isUserSelf(lqVar.v) && lqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                d6Var.getTextView().setEnabled(lqVar.I || lqVar.w.creator);
                d6Var.getTextView().setSingleLine(true);
                d6Var.getTextView().setImeOptions(6);
                d6Var.n(lqVar.S, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z43 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != lqVar.H0) {
                    if (i10 != lqVar.J0) {
                        if (i10 != lqVar.I0) {
                            if (i10 != lqVar.B0) {
                                if (i10 != lqVar.C0) {
                                    if (i10 != lqVar.j0) {
                                        if (i10 != lqVar.D0) {
                                            if (i10 != lqVar.E0) {
                                                if (i10 != lqVar.F0) {
                                                    if (i10 != lqVar.G0) {
                                                        if (i10 != lqVar.P0) {
                                                            if (i10 != lqVar.Q0) {
                                                                if (i10 != lqVar.R0) {
                                                                    if (i10 != lqVar.U0) {
                                                                        if (i10 != lqVar.V0) {
                                                                            if (i10 == lqVar.W0) {
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
                                                        z1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (lqVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        z1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (lqVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    z1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (lqVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                z1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (lqVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            z1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (lqVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        z1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (lqVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    z1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (lqVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                z1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (lqVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            z1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = lqVar.O;
                        z1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        z1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (lqVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    z1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.a01) view).a(lqVar.v, lqVar.S, i48 == 0, false, new t3(this, 3));
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.c;
        lq lqVar = this.e;
        switch (i10) {
            case 0:
                View abVar = new org.telegram.ui.Cells.ab(context, null);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = abVar;
                break;
            case 1:
                view2 = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
            default:
                View faVar = new org.telegram.ui.Cells.fa(context);
                faVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = faVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = m4Var;
                view2 = view;
                break;
            case 4:
            case 9:
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = w8Var;
                break;
            case 5:
                view2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 6:
                View d9Var = new org.telegram.ui.Cells.d9(context, null, false);
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = d9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var2 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                d6Var2.c(new m0(this, 4));
                view2 = d6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                lqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.h6.a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                lqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                lqVar.f = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                lqVar.f.setTextColor(-1);
                lqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                lqVar.f.setGravity(17);
                org.telegram.ui.Components.p6 p6Var2 = lqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.ul.m(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(lqVar.K ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                p6Var2.setText(sb2.toString());
                lqVar.e.addView(lqVar.f, w7.x5.e(-2, -2, 17));
                lqVar.e.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                lqVar.e.setOnClickListener(new a(this, 15));
                lqVar.d.addView(lqVar.e, w7.x5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                lqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view3 = new View(context);
                view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                lqVar.d.setClipChildren(false);
                lqVar.d.setClipToPadding(false);
                lqVar.d.addView(view3, w7.x5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view2 = lqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, lqVar.getResourceProvider(), false);
                z1Var.setPad(1);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                z1Var.setEnabled(true);
                z1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = z1Var;
                view2 = view;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.n2) lqVar).currentAccount;
                long j3 = -lqVar.s;
                d6Var = ((org.telegram.ui.ActionBar.n2) lqVar).resourceProvider;
                view2 = new org.telegram.ui.Components.a01(i11, j3, this.c, d6Var);
                break;
        }
        return new org.telegram.ui.Components.wk0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        lq lqVar = this.e;
        if (b10 == lqVar.u0) {
            lq.f0(lqVar, c1Var.a);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        lq lqVar = this.e;
        if (b10 != lqVar.v0 || lqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(lqVar.getParentActivity().getCurrentFocus());
    }
}
