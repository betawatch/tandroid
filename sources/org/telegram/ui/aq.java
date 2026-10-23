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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class aq extends org.telegram.ui.Components.im0 {
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

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        TLRPC.Chat chat;
        int i10 = b1Var.f;
        bq bqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.P;
        int i11 = bqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.N;
        if (!bqVar.w.creator || ((i11 != 0 && (i11 != 2 || !bqVar.K)) || i10 != 4 || b1Var.b() != bqVar.e0)) {
            if (!bqVar.I) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = b1Var.b();
                if (b10 == bqVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = bqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !bqVar.K) {
                        return false;
                    }
                    if (b10 == bqVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !bqVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == bqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == bqVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == bqVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == bqVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == bqVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == bqVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == bqVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == bqVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == bqVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == bqVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == bqVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == bqVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == bqVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == bqVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == bqVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == bqVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == bqVar.n0) {
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
    public final int h() {
        return this.e.V;
    }

    @Override // s4.g0
    public final long i(int i10) {
        bq bqVar = this.e;
        if (bqVar.y != 2) {
            return -1L;
        }
        if (i10 == bqVar.W) {
            return 1L;
        }
        if (i10 == bqVar.X) {
            return 2L;
        }
        if (i10 == bqVar.Y) {
            return 3L;
        }
        if (i10 == bqVar.b0) {
            return 4L;
        }
        if (i10 == bqVar.c0) {
            return 5L;
        }
        if (i10 == bqVar.d0) {
            return 6L;
        }
        if (i10 == bqVar.e0) {
            return 7L;
        }
        if (i10 == bqVar.f0) {
            return 8L;
        }
        if (i10 == bqVar.g0) {
            return 9L;
        }
        if (i10 == bqVar.h0) {
            return 10L;
        }
        if (i10 == bqVar.o0) {
            return 11L;
        }
        if (i10 == bqVar.p0) {
            return 12L;
        }
        if (i10 == bqVar.q0) {
            return 13L;
        }
        if (i10 == bqVar.r0) {
            return 14L;
        }
        if (i10 == bqVar.s0) {
            return 15L;
        }
        if (i10 == bqVar.t0) {
            return 16L;
        }
        if (i10 == bqVar.u0) {
            return 17L;
        }
        if (i10 == bqVar.v0) {
            return 18L;
        }
        if (i10 == bqVar.w0) {
            return 19L;
        }
        if (i10 == bqVar.y0) {
            return 20L;
        }
        if (i10 == bqVar.B0) {
            return 21L;
        }
        if (i10 == bqVar.H0) {
            return 22L;
        }
        if (i10 == bqVar.I0) {
            return 23L;
        }
        if (i10 == bqVar.J0) {
            return 24L;
        }
        if (i10 == bqVar.K0) {
            return 25L;
        }
        if (i10 == bqVar.L0) {
            return 26L;
        }
        if (i10 == bqVar.M0) {
            return 27L;
        }
        if (i10 == bqVar.x0) {
            return 28L;
        }
        if (i10 == bqVar.m0) {
            return 29L;
        }
        if (i10 == bqVar.C0) {
            return 30L;
        }
        if (i10 == bqVar.E0) {
            return 31L;
        }
        if (i10 == bqVar.D0) {
            return 32L;
        }
        if (i10 == bqVar.F0) {
            return 33L;
        }
        if (i10 == bqVar.G0) {
            return 34L;
        }
        if (i10 == bqVar.z0) {
            return 35L;
        }
        if (i10 == bqVar.N0) {
            return 36L;
        }
        if (i10 == bqVar.P0) {
            return 37L;
        }
        if (i10 == bqVar.Q0) {
            return 38L;
        }
        if (i10 == bqVar.R0) {
            return 39L;
        }
        if (i10 == bqVar.S0) {
            return 40L;
        }
        if (i10 == bqVar.U0) {
            return 41L;
        }
        if (i10 == bqVar.V0) {
            return 42L;
        }
        if (i10 == bqVar.W0) {
            return 43L;
        }
        if (i10 == bqVar.Z) {
            return 44L;
        }
        if (i10 == bqVar.i0) {
            return 45L;
        }
        if (i10 == bqVar.j0) {
            return 46L;
        }
        if (i10 == bqVar.k0) {
            return 47L;
        }
        if (i10 == bqVar.l0) {
            return 48L;
        }
        if (i10 == bqVar.n0) {
            return 49L;
        }
        return i10 == bqVar.a0 ? 50L : 0L;
    }

    @Override // s4.g0
    public final int j(int i10) {
        bq bqVar = this.e;
        if (i10 == bqVar.H0 || i10 == bqVar.J0 || i10 == bqVar.I0 || i10 == bqVar.B0 || i10 == bqVar.C0 || i10 == bqVar.E0 || i10 == bqVar.D0 || i10 == bqVar.G0 || i10 == bqVar.F0 || i10 == bqVar.j0 || i10 == bqVar.P0 || i10 == bqVar.Q0 || i10 == bqVar.R0 || i10 == bqVar.U0 || i10 == bqVar.V0 || i10 == bqVar.W0) {
            return 10;
        }
        if (i10 == bqVar.z0 || i10 == bqVar.N0 || i10 == bqVar.S0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == bqVar.o0 || i10 == bqVar.q0 || i10 == bqVar.L0 || i10 == bqVar.s0) {
            return 5;
        }
        if (i10 == 2 || i10 == bqVar.u0) {
            return 3;
        }
        if (i10 == bqVar.X || i10 == bqVar.Y || i10 == bqVar.Z || i10 == bqVar.b0 || i10 == bqVar.c0 || i10 == bqVar.d0 || i10 == bqVar.f0 || i10 == bqVar.g0 || i10 == bqVar.h0 || i10 == bqVar.i0 || i10 == bqVar.y0 || i10 == bqVar.e0 || i10 == bqVar.K0 || i10 == bqVar.W || i10 == bqVar.m0 || i10 == bqVar.k0 || i10 == bqVar.n0 || i10 == bqVar.a0) {
            return 4;
        }
        if (i10 == bqVar.r0 || i10 == bqVar.w0 || i10 == bqVar.l0) {
            return 1;
        }
        if (i10 == bqVar.M0) {
            return 6;
        }
        if (i10 == bqVar.v0) {
            return 11;
        }
        return i10 == bqVar.x0 ? 8 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0a48, code lost:
    
        if (r2.view_messages == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x052a, code lost:
    
        if (r6.change_info == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0962, code lost:
    
        if (r6.pin_messages == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a68, code lost:
    
        if (r2.bot != false) goto L806;
     */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x0b59  */
    /* JADX WARN: Type inference failed for: r4v125, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v153, types: [boolean, int] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
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
        bq bqVar = this.e;
        int i48 = bqVar.y;
        boolean z37 = bqVar.U;
        boolean z38 = bqVar.F;
        boolean z39 = bqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = bqVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = bqVar.P;
        int i49 = b1Var.f;
        View view = b1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                i11 = bqVar.y;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = bqVar.v;
                uaVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (i10 == bqVar.l0) {
                    d9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == bqVar.r0) {
                    d9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == bqVar.w0) {
                    user2 = bqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = bqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = bqVar.y;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = bqVar.v;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            d9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = bqVar.y;
                    if (i12 != 0) {
                    }
                    d9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                if (i10 != bqVar.p0) {
                    if (i10 == bqVar.t0) {
                        int i52 = org.telegram.ui.ActionBar.h6.G6;
                        baVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i52));
                        baVar.setTag(Integer.valueOf(i52));
                        if (!z39) {
                            baVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            baVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    int i53 = org.telegram.ui.ActionBar.h6.p7;
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i53));
                    baVar.setTag(Integer.valueOf(i53));
                    i13 = bqVar.y;
                    if (i13 != 0) {
                        i14 = bqVar.y;
                        if (i14 == 1) {
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
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != 2) {
                    if (i10 == bqVar.u0) {
                        l4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = bqVar.y;
                    if (i15 != 2) {
                        user4 = bqVar.v;
                        if (user4 != null) {
                            user5 = bqVar.v;
                            break;
                        }
                        i16 = bqVar.y;
                        if (i16 != 0) {
                            i17 = bqVar.y;
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
                boolean z40 = true;
                final org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
                boolean z41 = i48 != 2 || bqVar.K;
                TLRPC.Chat chat3 = bqVar.w;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == bqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = bqVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = bqVar.O;
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
                    u8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r12 > 0, true, true);
                    Locale locale = Locale.US;
                    u8Var.a(new Runnable(this) { // from class: org.telegram.ui.zp
                        public final /* synthetic */ aq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bq bqVar2 = this.b.e;
                                    org.telegram.ui.Cells.u8 u8Var2 = u8Var;
                                    if (u8Var2.isEnabled()) {
                                        if (!bq.l0(bqVar2)) {
                                            boolean z43 = u8Var2.d.h;
                                            u8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar2.O;
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
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.u8 u8Var3 = u8Var;
                                    if (u8Var3.isEnabled()) {
                                        boolean z44 = u8Var3.d.h;
                                        u8Var3.setChecked(z44);
                                        bq bqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = bqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(bqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.u8 u8Var4 = u8Var;
                                    if (u8Var4.isEnabled()) {
                                        boolean z46 = u8Var4.d.h;
                                        u8Var4.setChecked(z46);
                                        bq bqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = bqVar4.M;
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
                    }, a1.g.m(r12, "/10"), !bqVar.A0);
                    u8Var.setIcon(bq.l0(bqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == bqVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i54 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i54 = r42 + 1;
                    }
                    int i55 = i54;
                    if (tL_chatAdminRights39.delete_messages) {
                        i55 = i54 + 1;
                    }
                    u8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i55 > 0, true, true);
                    Locale locale2 = Locale.US;
                    u8Var.a(new Runnable(this) { // from class: org.telegram.ui.zp
                        public final /* synthetic */ aq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    bq bqVar2 = this.b.e;
                                    org.telegram.ui.Cells.u8 u8Var2 = u8Var;
                                    if (u8Var2.isEnabled()) {
                                        if (!bq.l0(bqVar2)) {
                                            boolean z43 = u8Var2.d.h;
                                            u8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar2.O;
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
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.u8 u8Var3 = u8Var;
                                    if (u8Var3.isEnabled()) {
                                        boolean z44 = u8Var3.d.h;
                                        u8Var3.setChecked(z44);
                                        bq bqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = bqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(bqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.u8 u8Var4 = u8Var;
                                    if (u8Var4.isEnabled()) {
                                        boolean z46 = u8Var4.d.h;
                                        u8Var4.setChecked(z46);
                                        bq bqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = bqVar4.M;
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
                    }, a1.g.m(i55, "/3"), !bqVar.O0);
                } else if (i10 == bqVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = bqVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i56 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i56 = r52 + 1;
                    }
                    int i57 = i56;
                    if (tL_chatAdminRights40.delete_stories) {
                        i57 = i56 + 1;
                    }
                    u8Var.d(LocaleController.getString(R.string.ChannelManageStories), i57 > 0, true, true);
                    Locale locale3 = Locale.US;
                    u8Var.a(new Runnable(this) { // from class: org.telegram.ui.zp
                        public final /* synthetic */ aq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    bq bqVar2 = this.b.e;
                                    org.telegram.ui.Cells.u8 u8Var2 = u8Var;
                                    if (u8Var2.isEnabled()) {
                                        if (!bq.l0(bqVar2)) {
                                            boolean z43 = u8Var2.d.h;
                                            u8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar2.O;
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
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.u8 u8Var3 = u8Var;
                                    if (u8Var3.isEnabled()) {
                                        boolean z44 = u8Var3.d.h;
                                        u8Var3.setChecked(z44);
                                        bq bqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = bqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(bqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.u8 u8Var4 = u8Var;
                                    if (u8Var4.isEnabled()) {
                                        boolean z46 = u8Var4.d.h;
                                        u8Var4.setChecked(z46);
                                        bq bqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = bqVar4.M;
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
                    }, a1.g.m(i57, "/3"), !bqVar.T0);
                } else if (i10 == bqVar.W) {
                    u8Var.d(LocaleController.getString(R.string.ManageGroup), bqVar.K, true, false);
                    tL_chatAdminRights38 = bqVar.N;
                    u8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == bqVar.X) {
                    i43 = bqVar.y;
                    if (i43 != 0) {
                        i45 = bqVar.y;
                        if (i45 != 2) {
                            i46 = bqVar.y;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = bqVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = bqVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        u8Var.c(string3, z36, bqVar.m0 == -1);
                                        tL_chatBannedRights19 = bqVar.P;
                                        u8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                u8Var.c(string3, z36, bqVar.m0 == -1);
                                tL_chatBannedRights19 = bqVar.P;
                                u8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = bqVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                u8Var.c(string4, z35, true);
                            }
                        }
                        z35 = false;
                        u8Var.c(string4, z35, true);
                    } else if (z39) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z41) {
                            tL_chatAdminRights35 = bqVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                u8Var.c(string5, z34, true);
                            }
                        }
                        z34 = false;
                        u8Var.c(string5, z34, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z41) {
                            tL_chatAdminRights34 = bqVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = bqVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            u8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        u8Var.c(string6, z33, true);
                    }
                    i44 = bqVar.y;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = bqVar.N;
                        u8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == bqVar.Y) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = bqVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            u8Var.c(string7, z32, true);
                            i42 = bqVar.y;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    u8Var.c(string7, z32, true);
                    i42 = bqVar.y;
                    if (i42 == 2) {
                    }
                } else if (i10 == bqVar.a0) {
                    user8 = bqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = bqVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                u8Var.c(string8, z31, true);
                            }
                        }
                        z31 = false;
                        u8Var.c(string8, z31, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights29 = bqVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                u8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        u8Var.c(string9, z30, true);
                    }
                    i41 = bqVar.y;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = bqVar.N;
                        u8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == bqVar.Z) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = bqVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            u8Var.c(string10, z29, true);
                            i40 = bqVar.y;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    u8Var.c(string10, z29, true);
                    i40 = bqVar.y;
                    if (i40 == 2) {
                    }
                } else if (i10 == bqVar.b0) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = bqVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            u8Var.c(string11, z28, true);
                            i39 = bqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    u8Var.c(string11, z28, true);
                    i39 = bqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i10 == bqVar.c0) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = bqVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                u8Var.c(string12, z27, true);
                            }
                        }
                        z27 = false;
                        u8Var.c(string12, z27, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights22 = bqVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                u8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        u8Var.c(string13, z26, true);
                    }
                    i38 = bqVar.y;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = bqVar.N;
                        u8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == bqVar.d0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = bqVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            u8Var.c(string14, z25, (bqVar.f0 == -1 && z39) || bqVar.e0 != -1);
                            i37 = bqVar.y;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    u8Var.c(string14, z25, (bqVar.f0 == -1 && z39) || bqVar.e0 != -1);
                    i37 = bqVar.y;
                    if (i37 == 2) {
                    }
                } else if (i10 == bqVar.e0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = bqVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            u8Var.c(string15, z24, bqVar.m0 == -1 || z37);
                            i36 = bqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    u8Var.c(string15, z24, bqVar.m0 == -1 || z37);
                    i36 = bqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i10 == bqVar.k0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (bqVar.x != null) {
                        user6 = bqVar.v;
                        if (user6 != null) {
                            long j10 = bqVar.r ? bqVar.n : bqVar.x.guard_bot_id;
                            user7 = bqVar.v;
                            if (j10 == user7.id) {
                                z23 = true;
                                u8Var.c(string16, z23, false);
                                i35 = bqVar.y;
                                if (i35 == 2) {
                                    u8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    u8Var.c(string16, z23, false);
                    i35 = bqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i10 == bqVar.f0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = bqVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            u8Var.c(string17, z22, !z38);
                            i34 = bqVar.y;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    u8Var.c(string17, z22, !z38);
                    i34 = bqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i10 == bqVar.n0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = bqVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            u8Var.c(string18, z21, true);
                            i33 = bqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    u8Var.c(string18, z21, true);
                    i33 = bqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i10 == bqVar.K0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = bqVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            u8Var.c(string19, z20, true);
                            i32 = bqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    u8Var.c(string19, z20, true);
                    i32 = bqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i10 == bqVar.m0) {
                    i29 = bqVar.y;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = bqVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                u8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        u8Var.c(string20, z19, z37);
                    } else {
                        i30 = bqVar.y;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = bqVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = bqVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    u8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = bqVar.P;
                                    u8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            u8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = bqVar.P;
                            u8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = bqVar.y;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = bqVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        u8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = bqVar.N;
                                        u8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                u8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = bqVar.N;
                                u8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == bqVar.g0) {
                    i26 = bqVar.y;
                    if (i26 == 0) {
                        chat2 = bqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = bqVar.M;
                            u8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = bqVar.M;
                            u8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = bqVar.y;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = bqVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = bqVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    u8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = bqVar.P;
                                    u8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            u8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = bqVar.P;
                            u8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = bqVar.y;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = bqVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        u8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = bqVar.N;
                                        u8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                u8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = bqVar.N;
                                u8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == bqVar.h0) {
                    i22 = bqVar.y;
                    if (i22 != 0) {
                        i24 = bqVar.y;
                        if (i24 != 2) {
                            i25 = bqVar.y;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = bqVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = bqVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        u8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = bqVar.P;
                                        u8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                u8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = bqVar.P;
                                u8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = bqVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = bqVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        u8Var.c(string28, z13, true);
                        i23 = bqVar.y;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = bqVar.N;
                            u8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    u8Var.c(string28, z13, true);
                    i23 = bqVar.y;
                    if (i23 == 2) {
                    }
                } else if (i10 == bqVar.i0) {
                    i18 = bqVar.y;
                    if (i18 != 0) {
                        i20 = bqVar.y;
                        if (i20 != 2) {
                            i21 = bqVar.y;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = bqVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = bqVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        u8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = bqVar.P;
                                        u8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                u8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = bqVar.P;
                                u8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = bqVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            u8Var.c(string30, z11, true);
                            i19 = bqVar.y;
                            if (i19 == 2) {
                                tL_chatAdminRights = bqVar.N;
                                u8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    u8Var.c(string30, z11, true);
                    i19 = bqVar.y;
                    if (i19 == 2) {
                    }
                } else if (i10 == bqVar.y0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = bqVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = bqVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            u8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = bqVar.P;
                            u8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    u8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = bqVar.P;
                    u8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = bqVar.y;
                if (i47 != 2 && i10 == bqVar.y0) {
                    tL_chatBannedRights21 = bqVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = bqVar.P;
                        break;
                    }
                    z40 = false;
                    u8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i48 != 2 || (i10 != bqVar.o0 && i10 != bqVar.w0)) {
                    z6Var.setAlpha(1.0f);
                    break;
                } else {
                    z6Var.setAlpha(bqVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i10 == bqVar.M0) {
                    int i58 = bqVar.O.until_date;
                    b9Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(bqVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                String string32 = (UserObject.isUserSelf(bqVar.v) && bqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                c6Var.getTextView().setEnabled(bqVar.I || bqVar.w.creator);
                c6Var.getTextView().setSingleLine(true);
                c6Var.getTextView().setImeOptions(6);
                c6Var.n(bqVar.S, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                boolean z43 = a2Var.getTag() != null && ((Integer) a2Var.getTag()).intValue() == i10;
                a2Var.setTag(Integer.valueOf(i10));
                if (i10 != bqVar.H0) {
                    if (i10 != bqVar.J0) {
                        if (i10 != bqVar.I0) {
                            if (i10 != bqVar.B0) {
                                if (i10 != bqVar.C0) {
                                    if (i10 != bqVar.j0) {
                                        if (i10 != bqVar.D0) {
                                            if (i10 != bqVar.E0) {
                                                if (i10 != bqVar.F0) {
                                                    if (i10 != bqVar.G0) {
                                                        if (i10 != bqVar.P0) {
                                                            if (i10 != bqVar.Q0) {
                                                                if (i10 != bqVar.R0) {
                                                                    if (i10 != bqVar.U0) {
                                                                        if (i10 != bqVar.V0) {
                                                                            if (i10 == bqVar.W0) {
                                                                                a2Var.e(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            a2Var.e(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        a2Var.e(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    a2Var.e(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                a2Var.e(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            a2Var.e(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        a2Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (bqVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        a2Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    a2Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (bqVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    a2Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                a2Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (bqVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                a2Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            a2Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (bqVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            a2Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        a2Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (bqVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        a2Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    a2Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (bqVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    a2Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                a2Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (bqVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                a2Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            a2Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (bqVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            a2Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = bqVar.O;
                        a2Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        a2Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    a2Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (bqVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    a2Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.x01) view).a(bqVar.v, bqVar.S, i48 == 0, false, new v3(this, 3));
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.c;
        bq bqVar = this.e;
        switch (i10) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = uaVar;
                break;
            case 1:
                view2 = new org.telegram.ui.Cells.d9(context);
                break;
            case 2:
            default:
                View baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = baVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = l4Var;
                view2 = view;
                break;
            case 4:
            case 9:
                View u8Var = new org.telegram.ui.Cells.u8(context);
                u8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = u8Var;
                break;
            case 5:
                view2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View b9Var = new org.telegram.ui.Cells.b9(context, null, false);
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view2 = b9Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                c6Var.c(new o0(this, 4));
                view2 = c6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                bqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.h6.a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                bqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                bqVar.f = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                bqVar.f.setTextColor(-1);
                bqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                bqVar.f.setGravity(17);
                org.telegram.ui.Components.q6 q6Var2 = bqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(bqVar.K ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                q6Var2.setText(sb2.toString());
                bqVar.e.addView(bqVar.f, w7.z5.e(-2, -2, 17));
                bqVar.e.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                bqVar.e.setOnClickListener(new a(this, 15));
                bqVar.d.addView(bqVar.e, w7.z5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                bqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view3 = new View(context);
                view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                bqVar.d.setClipChildren(false);
                bqVar.d.setClipToPadding(false);
                bqVar.d.addView(view3, w7.z5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view2 = bqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.c, bqVar.getResourceProvider(), false);
                a2Var.setPad(1);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.g7, org.telegram.ui.ActionBar.h6.k7);
                a2Var.setEnabled(true);
                a2Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                view = a2Var;
                view2 = view;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.n2) bqVar).currentAccount;
                long j10 = -bqVar.s;
                d6Var = ((org.telegram.ui.ActionBar.n2) bqVar).resourceProvider;
                view2 = new org.telegram.ui.Components.x01(i11, j10, this.c, d6Var);
                break;
        }
        return new org.telegram.ui.Components.tl0(view2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int b10 = b1Var.b();
        bq bqVar = this.e;
        if (b10 == bqVar.u0) {
            bq.f0(bqVar, b1Var.a);
        }
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int b10 = b1Var.b();
        bq bqVar = this.e;
        if (b10 != bqVar.v0 || bqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(bqVar.getParentActivity().getCurrentFocus());
    }
}
