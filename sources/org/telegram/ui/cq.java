package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cq extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ dq e;

    public cq(dq dqVar, Context context) {
        this.e = dqVar;
        if (dqVar.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        TLRPC.Chat chat;
        int i10 = b1Var.f;
        dq dqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.Q;
        int i11 = dqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.O;
        if (!dqVar.x.creator || ((i11 != 0 && (i11 != 2 || !dqVar.L)) || i10 != 4 || b1Var.b() != dqVar.f0)) {
            if (!dqVar.J) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = b1Var.b();
                if (b10 == dqVar.X) {
                    if (!tL_chatAdminRights.add_admins && ((chat = dqVar.x) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !dqVar.L) {
                        return false;
                    }
                    if (b10 == dqVar.Y) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !dqVar.F) {
                            return false;
                        }
                    } else {
                        if (b10 == dqVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == dqVar.a0) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == dqVar.b0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == dqVar.c0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == dqVar.d0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == dqVar.L0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == dqVar.e0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == dqVar.f0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == dqVar.g0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == dqVar.h0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == dqVar.i0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == dqVar.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == dqVar.n0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == dqVar.V0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == dqVar.W0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == dqVar.X0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == dqVar.o0) {
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
        return this.e.W;
    }

    @Override // s4.g0
    public final long i(int i10) {
        dq dqVar = this.e;
        if (dqVar.E != 2) {
            return -1L;
        }
        if (i10 == dqVar.X) {
            return 1L;
        }
        if (i10 == dqVar.Y) {
            return 2L;
        }
        if (i10 == dqVar.Z) {
            return 3L;
        }
        if (i10 == dqVar.c0) {
            return 4L;
        }
        if (i10 == dqVar.d0) {
            return 5L;
        }
        if (i10 == dqVar.e0) {
            return 6L;
        }
        if (i10 == dqVar.f0) {
            return 7L;
        }
        if (i10 == dqVar.g0) {
            return 8L;
        }
        if (i10 == dqVar.h0) {
            return 9L;
        }
        if (i10 == dqVar.i0) {
            return 10L;
        }
        if (i10 == dqVar.p0) {
            return 11L;
        }
        if (i10 == dqVar.q0) {
            return 12L;
        }
        if (i10 == dqVar.r0) {
            return 13L;
        }
        if (i10 == dqVar.s0) {
            return 14L;
        }
        if (i10 == dqVar.t0) {
            return 15L;
        }
        if (i10 == dqVar.u0) {
            return 16L;
        }
        if (i10 == dqVar.v0) {
            return 17L;
        }
        if (i10 == dqVar.w0) {
            return 18L;
        }
        if (i10 == dqVar.x0) {
            return 19L;
        }
        if (i10 == dqVar.z0) {
            return 20L;
        }
        if (i10 == dqVar.C0) {
            return 21L;
        }
        if (i10 == dqVar.I0) {
            return 22L;
        }
        if (i10 == dqVar.J0) {
            return 23L;
        }
        if (i10 == dqVar.K0) {
            return 24L;
        }
        if (i10 == dqVar.L0) {
            return 25L;
        }
        if (i10 == dqVar.M0) {
            return 26L;
        }
        if (i10 == dqVar.N0) {
            return 27L;
        }
        if (i10 == dqVar.y0) {
            return 28L;
        }
        if (i10 == dqVar.n0) {
            return 29L;
        }
        if (i10 == dqVar.D0) {
            return 30L;
        }
        if (i10 == dqVar.F0) {
            return 31L;
        }
        if (i10 == dqVar.E0) {
            return 32L;
        }
        if (i10 == dqVar.G0) {
            return 33L;
        }
        if (i10 == dqVar.H0) {
            return 34L;
        }
        if (i10 == dqVar.A0) {
            return 35L;
        }
        if (i10 == dqVar.O0) {
            return 36L;
        }
        if (i10 == dqVar.Q0) {
            return 37L;
        }
        if (i10 == dqVar.R0) {
            return 38L;
        }
        if (i10 == dqVar.S0) {
            return 39L;
        }
        if (i10 == dqVar.T0) {
            return 40L;
        }
        if (i10 == dqVar.V0) {
            return 41L;
        }
        if (i10 == dqVar.W0) {
            return 42L;
        }
        if (i10 == dqVar.X0) {
            return 43L;
        }
        if (i10 == dqVar.a0) {
            return 44L;
        }
        if (i10 == dqVar.j0) {
            return 45L;
        }
        if (i10 == dqVar.k0) {
            return 46L;
        }
        if (i10 == dqVar.l0) {
            return 47L;
        }
        if (i10 == dqVar.m0) {
            return 48L;
        }
        if (i10 == dqVar.o0) {
            return 49L;
        }
        return i10 == dqVar.b0 ? 50L : 0L;
    }

    @Override // s4.g0
    public final int j(int i10) {
        dq dqVar = this.e;
        if (i10 == dqVar.I0 || i10 == dqVar.K0 || i10 == dqVar.J0 || i10 == dqVar.C0 || i10 == dqVar.D0 || i10 == dqVar.F0 || i10 == dqVar.E0 || i10 == dqVar.H0 || i10 == dqVar.G0 || i10 == dqVar.k0 || i10 == dqVar.Q0 || i10 == dqVar.R0 || i10 == dqVar.S0 || i10 == dqVar.V0 || i10 == dqVar.W0 || i10 == dqVar.X0) {
            return 10;
        }
        if (i10 == dqVar.A0 || i10 == dqVar.O0 || i10 == dqVar.T0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == dqVar.p0 || i10 == dqVar.r0 || i10 == dqVar.M0 || i10 == dqVar.t0) {
            return 5;
        }
        if (i10 == 2 || i10 == dqVar.v0) {
            return 3;
        }
        if (i10 == dqVar.Y || i10 == dqVar.Z || i10 == dqVar.a0 || i10 == dqVar.c0 || i10 == dqVar.d0 || i10 == dqVar.e0 || i10 == dqVar.g0 || i10 == dqVar.h0 || i10 == dqVar.i0 || i10 == dqVar.j0 || i10 == dqVar.z0 || i10 == dqVar.f0 || i10 == dqVar.L0 || i10 == dqVar.X || i10 == dqVar.n0 || i10 == dqVar.l0 || i10 == dqVar.o0 || i10 == dqVar.b0) {
            return 4;
        }
        if (i10 == dqVar.s0 || i10 == dqVar.x0 || i10 == dqVar.m0) {
            return 1;
        }
        if (i10 == dqVar.N0) {
            return 6;
        }
        if (i10 == dqVar.w0) {
            return 11;
        }
        return i10 == dqVar.y0 ? 8 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0a49, code lost:
    
        if (r2.view_messages == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x052b, code lost:
    
        if (r6.change_info == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0963, code lost:
    
        if (r6.pin_messages == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a69, code lost:
    
        if (r2.bot != false) goto L806;
     */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x0b5a  */
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
        dq dqVar = this.e;
        int i48 = dqVar.E;
        boolean z37 = dqVar.V;
        boolean z38 = dqVar.G;
        boolean z39 = dqVar.F;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = dqVar.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = dqVar.Q;
        int i49 = b1Var.f;
        View view = b1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                i11 = dqVar.E;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = dqVar.w;
                vaVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == dqVar.m0) {
                    e9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == dqVar.s0) {
                    e9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == dqVar.x0) {
                    user2 = dqVar.w;
                    if (UserObject.isUserSelf(user2)) {
                        chat = dqVar.x;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = dqVar.E;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = dqVar.w;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            e9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = dqVar.E;
                    if (i12 != 0) {
                    }
                    e9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i10 != dqVar.q0) {
                    if (i10 == dqVar.u0) {
                        TextView textView = caVar.getTextView();
                        int i52 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(textView, i52, null);
                        caVar.setTag(Integer.valueOf(i52));
                        if (!z39) {
                            caVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            caVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = caVar.getTextView();
                    int i53 = org.telegram.ui.ActionBar.k6.p7;
                    org.telegram.ui.ActionBar.r6.W(textView2, i53, null);
                    caVar.setTag(Integer.valueOf(i53));
                    i13 = dqVar.E;
                    if (i13 != 0) {
                        i14 = dqVar.E;
                        if (i14 == 1) {
                            caVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        caVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != 2) {
                    if (i10 == dqVar.v0) {
                        l4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = dqVar.E;
                    if (i15 != 2) {
                        user4 = dqVar.w;
                        if (user4 != null) {
                            user5 = dqVar.w;
                            break;
                        }
                        i16 = dqVar.E;
                        if (i16 != 0) {
                            i17 = dqVar.E;
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
                final org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                boolean z41 = i48 != 2 || dqVar.L;
                TLRPC.Chat chat3 = dqVar.x;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == dqVar.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = dqVar.Q;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = dqVar.P;
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
                    v8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r12 > 0, true, true);
                    Locale locale = Locale.US;
                    v8Var.a(new Runnable(this) { // from class: org.telegram.ui.bq
                        public final /* synthetic */ cq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    dq dqVar2 = this.b.e;
                                    org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                    if (v8Var2.isEnabled()) {
                                        if (!dq.l0(dqVar2)) {
                                            boolean z43 = v8Var2.d.h;
                                            v8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = dqVar2.P;
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
                                            AndroidUtilities.updateVisibleRows(dqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar2.getParentActivity());
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
                                        dq dqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = dqVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(dqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.v8 v8Var4 = v8Var;
                                    if (v8Var4.isEnabled()) {
                                        boolean z46 = v8Var4.d.h;
                                        v8Var4.setChecked(z46);
                                        dq dqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = dqVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(dqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.m(r12, "/10"), !dqVar.B0);
                    v8Var.setIcon(dq.l0(dqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.O0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i54 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i54 = r42 + 1;
                    }
                    int i55 = i54;
                    if (tL_chatAdminRights39.delete_messages) {
                        i55 = i54 + 1;
                    }
                    v8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i55 > 0, true, true);
                    Locale locale2 = Locale.US;
                    v8Var.a(new Runnable(this) { // from class: org.telegram.ui.bq
                        public final /* synthetic */ cq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    dq dqVar2 = this.b.e;
                                    org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                    if (v8Var2.isEnabled()) {
                                        if (!dq.l0(dqVar2)) {
                                            boolean z43 = v8Var2.d.h;
                                            v8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = dqVar2.P;
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
                                            AndroidUtilities.updateVisibleRows(dqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar2.getParentActivity());
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
                                        dq dqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = dqVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(dqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.v8 v8Var4 = v8Var;
                                    if (v8Var4.isEnabled()) {
                                        boolean z46 = v8Var4.d.h;
                                        v8Var4.setChecked(z46);
                                        dq dqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = dqVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(dqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.m(i55, "/3"), !dqVar.P0);
                } else if (i10 == dqVar.T0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = dqVar.N;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i56 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i56 = r52 + 1;
                    }
                    int i57 = i56;
                    if (tL_chatAdminRights40.delete_stories) {
                        i57 = i56 + 1;
                    }
                    v8Var.d(LocaleController.getString(R.string.ChannelManageStories), i57 > 0, true, true);
                    Locale locale3 = Locale.US;
                    v8Var.a(new Runnable(this) { // from class: org.telegram.ui.bq
                        public final /* synthetic */ cq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    dq dqVar2 = this.b.e;
                                    org.telegram.ui.Cells.v8 v8Var2 = v8Var;
                                    if (v8Var2.isEnabled()) {
                                        if (!dq.l0(dqVar2)) {
                                            boolean z43 = v8Var2.d.h;
                                            v8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = dqVar2.P;
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
                                            AndroidUtilities.updateVisibleRows(dqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar2.getParentActivity());
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
                                        dq dqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = dqVar3.N;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(dqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.v8 v8Var4 = v8Var;
                                    if (v8Var4.isEnabled()) {
                                        boolean z46 = v8Var4.d.h;
                                        v8Var4.setChecked(z46);
                                        dq dqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = dqVar4.N;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(dqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.m(i57, "/3"), !dqVar.U0);
                } else if (i10 == dqVar.X) {
                    v8Var.d(LocaleController.getString(R.string.ManageGroup), dqVar.L, true, false);
                    tL_chatAdminRights38 = dqVar.O;
                    v8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == dqVar.Y) {
                    i43 = dqVar.E;
                    if (i43 != 0) {
                        i45 = dqVar.E;
                        if (i45 != 2) {
                            i46 = dqVar.E;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = dqVar.P;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = dqVar.Q;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        v8Var.c(string3, z36, dqVar.n0 == -1);
                                        tL_chatBannedRights19 = dqVar.Q;
                                        v8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                v8Var.c(string3, z36, dqVar.n0 == -1);
                                tL_chatBannedRights19 = dqVar.Q;
                                v8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = dqVar.N;
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
                            tL_chatAdminRights35 = dqVar.N;
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
                            tL_chatAdminRights34 = dqVar.N;
                            break;
                        }
                        tL_chatBannedRights17 = dqVar.Q;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            v8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        v8Var.c(string6, z33, true);
                    }
                    i44 = dqVar.E;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = dqVar.O;
                        v8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.Z) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = dqVar.N;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            v8Var.c(string7, z32, true);
                            i42 = dqVar.E;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    v8Var.c(string7, z32, true);
                    i42 = dqVar.E;
                    if (i42 == 2) {
                    }
                } else if (i10 == dqVar.b0) {
                    user8 = dqVar.w;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = dqVar.N;
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
                            tL_chatAdminRights29 = dqVar.N;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                v8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        v8Var.c(string9, z30, true);
                    }
                    i41 = dqVar.E;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = dqVar.O;
                        v8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.a0) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = dqVar.N;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            v8Var.c(string10, z29, true);
                            i40 = dqVar.E;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    v8Var.c(string10, z29, true);
                    i40 = dqVar.E;
                    if (i40 == 2) {
                    }
                } else if (i10 == dqVar.c0) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = dqVar.N;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            v8Var.c(string11, z28, true);
                            i39 = dqVar.E;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    v8Var.c(string11, z28, true);
                    i39 = dqVar.E;
                    if (i39 == 2) {
                    }
                } else if (i10 == dqVar.d0) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = dqVar.N;
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
                            tL_chatAdminRights22 = dqVar.N;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                v8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        v8Var.c(string13, z26, true);
                    }
                    i38 = dqVar.E;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = dqVar.O;
                        v8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.e0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = dqVar.N;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            v8Var.c(string14, z25, (dqVar.g0 == -1 && z39) || dqVar.f0 != -1);
                            i37 = dqVar.E;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    v8Var.c(string14, z25, (dqVar.g0 == -1 && z39) || dqVar.f0 != -1);
                    i37 = dqVar.E;
                    if (i37 == 2) {
                    }
                } else if (i10 == dqVar.f0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = dqVar.N;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            v8Var.c(string15, z24, dqVar.n0 == -1 || z37);
                            i36 = dqVar.E;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    v8Var.c(string15, z24, dqVar.n0 == -1 || z37);
                    i36 = dqVar.E;
                    if (i36 == 2) {
                    }
                } else if (i10 == dqVar.l0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (dqVar.y != null) {
                        user6 = dqVar.w;
                        if (user6 != null) {
                            long j10 = dqVar.s ? dqVar.r : dqVar.y.guard_bot_id;
                            user7 = dqVar.w;
                            if (j10 == user7.id) {
                                z23 = true;
                                v8Var.c(string16, z23, false);
                                i35 = dqVar.E;
                                if (i35 == 2) {
                                    v8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    v8Var.c(string16, z23, false);
                    i35 = dqVar.E;
                    if (i35 == 2) {
                    }
                } else if (i10 == dqVar.g0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = dqVar.N;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            v8Var.c(string17, z22, !z38);
                            i34 = dqVar.E;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    v8Var.c(string17, z22, !z38);
                    i34 = dqVar.E;
                    if (i34 == 2) {
                    }
                } else if (i10 == dqVar.o0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = dqVar.N;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            v8Var.c(string18, z21, true);
                            i33 = dqVar.E;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    v8Var.c(string18, z21, true);
                    i33 = dqVar.E;
                    if (i33 == 2) {
                    }
                } else if (i10 == dqVar.L0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = dqVar.N;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            v8Var.c(string19, z20, true);
                            i32 = dqVar.E;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    v8Var.c(string19, z20, true);
                    i32 = dqVar.E;
                    if (i32 == 2) {
                    }
                } else if (i10 == dqVar.n0) {
                    i29 = dqVar.E;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = dqVar.N;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                v8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        v8Var.c(string20, z19, z37);
                    } else {
                        i30 = dqVar.E;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = dqVar.P;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = dqVar.Q;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    v8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = dqVar.Q;
                                    v8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            v8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = dqVar.Q;
                            v8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = dqVar.E;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = dqVar.N;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        v8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = dqVar.O;
                                        v8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                v8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = dqVar.O;
                                v8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == dqVar.h0) {
                    i26 = dqVar.E;
                    if (i26 == 0) {
                        chat2 = dqVar.x;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = dqVar.N;
                            v8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = dqVar.N;
                            v8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = dqVar.E;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = dqVar.P;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = dqVar.Q;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    v8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = dqVar.Q;
                                    v8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            v8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = dqVar.Q;
                            v8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = dqVar.E;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = dqVar.N;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        v8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = dqVar.O;
                                        v8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                v8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = dqVar.O;
                                v8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == dqVar.i0) {
                    i22 = dqVar.E;
                    if (i22 != 0) {
                        i24 = dqVar.E;
                        if (i24 != 2) {
                            i25 = dqVar.E;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = dqVar.P;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = dqVar.Q;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        v8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = dqVar.Q;
                                        v8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                v8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = dqVar.Q;
                                v8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = dqVar.N;
                        break;
                    }
                    tL_chatBannedRights7 = dqVar.Q;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        v8Var.c(string28, z13, true);
                        i23 = dqVar.E;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = dqVar.O;
                            v8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    v8Var.c(string28, z13, true);
                    i23 = dqVar.E;
                    if (i23 == 2) {
                    }
                } else if (i10 == dqVar.j0) {
                    i18 = dqVar.E;
                    if (i18 != 0) {
                        i20 = dqVar.E;
                        if (i20 != 2) {
                            i21 = dqVar.E;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = dqVar.P;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = dqVar.Q;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        v8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = dqVar.Q;
                                        v8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                v8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = dqVar.Q;
                                v8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = dqVar.N;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            v8Var.c(string30, z11, true);
                            i19 = dqVar.E;
                            if (i19 == 2) {
                                tL_chatAdminRights = dqVar.O;
                                v8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    v8Var.c(string30, z11, true);
                    i19 = dqVar.E;
                    if (i19 == 2) {
                    }
                } else if (i10 == dqVar.z0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = dqVar.P;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = dqVar.Q;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            v8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = dqVar.Q;
                            v8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    v8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = dqVar.Q;
                    v8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = dqVar.E;
                if (i47 != 2 && i10 == dqVar.z0) {
                    tL_chatBannedRights21 = dqVar.P;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = dqVar.Q;
                        break;
                    }
                    z40 = false;
                    v8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
                if (i48 != 2 || (i10 != dqVar.p0 && i10 != dqVar.x0)) {
                    b7Var.setAlpha(1.0f);
                    break;
                } else {
                    b7Var.setAlpha(dqVar.K);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                if (i10 == dqVar.N0) {
                    int i58 = dqVar.P.until_date;
                    c9Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(dqVar.P.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                String string32 = (UserObject.isUserSelf(dqVar.w) && dqVar.x.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                d6Var.getTextView().setEnabled(dqVar.J || dqVar.x.creator);
                d6Var.getTextView().setSingleLine(true);
                d6Var.getTextView().setImeOptions(6);
                d6Var.n(dqVar.T, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z43 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != dqVar.I0) {
                    if (i10 != dqVar.K0) {
                        if (i10 != dqVar.J0) {
                            if (i10 != dqVar.C0) {
                                if (i10 != dqVar.D0) {
                                    if (i10 != dqVar.k0) {
                                        if (i10 != dqVar.E0) {
                                            if (i10 != dqVar.F0) {
                                                if (i10 != dqVar.G0) {
                                                    if (i10 != dqVar.H0) {
                                                        if (i10 != dqVar.Q0) {
                                                            if (i10 != dqVar.R0) {
                                                                if (i10 != dqVar.S0) {
                                                                    if (i10 != dqVar.V0) {
                                                                        if (i10 != dqVar.W0) {
                                                                            if (i10 == dqVar.X0) {
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
                                                        z1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (dqVar.P.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        z1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (dqVar.P.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    z1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (dqVar.P.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                z1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (dqVar.P.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            z1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (dqVar.P.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        z1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (dqVar.P.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    z1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (dqVar.P.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                z1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (dqVar.P.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            z1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = dqVar.P;
                        z1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        z1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (dqVar.P.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    z1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.a11) view).a(dqVar.w, dqVar.T, i48 == 0, false, new u3(this, 3));
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.c;
        dq dqVar = this.e;
        switch (i10) {
            case 0:
                View vaVar = new org.telegram.ui.Cells.va(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, vaVar, null);
                view = vaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View caVar = new org.telegram.ui.Cells.ca(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, caVar, null);
                view = caVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, null);
                view = l4Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, v8Var, null);
                view = v8Var;
                break;
            case 5:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, c9Var, null);
                view = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(context, 0, null, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, d6Var, null);
                d6Var.b(new n0(this, 4));
                view = d6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                dqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.k6.a7;
                org.telegram.ui.ActionBar.r6.i(i12, frameLayout, null);
                dqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                dqVar.f = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                dqVar.f.setTextColor(-1);
                dqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                dqVar.f.setGravity(17);
                org.telegram.ui.Components.q6 q6Var2 = dqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(dqVar.L ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                q6Var2.setText(sb2.toString());
                dqVar.e.addView(dqVar.f, w7.z5.e(-2, -2, 17));
                dqVar.e.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                dqVar.e.setOnClickListener(new a(this, 15));
                dqVar.d.addView(dqVar.e, w7.z5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                dqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view2 = new View(context);
                org.telegram.ui.ActionBar.r6.i(i12, view2, null);
                dqVar.d.setClipChildren(false);
                dqVar.d.setClipToPadding(false);
                dqVar.d.addView(view2, w7.z5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view = dqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, dqVar.getResourceProvider(), false);
                z1Var.setPad(1);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                z1Var.setEnabled(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, z1Var, null);
                view = z1Var;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.o2) dqVar).currentAccount;
                long j10 = -dqVar.v;
                g6Var = ((org.telegram.ui.ActionBar.o2) dqVar).resourceProvider;
                view = new org.telegram.ui.Components.a11(i11, j10, this.c, g6Var);
                break;
        }
        return new org.telegram.ui.Components.wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dq dqVar = this.e;
        if (b10 == dqVar.v0) {
            dq.f0(dqVar, b1Var.a);
        }
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dq dqVar = this.e;
        if (b10 != dqVar.w0 || dqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(dqVar.getParentActivity().getCurrentFocus());
    }
}
