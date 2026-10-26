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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fq extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ gq e;

    public fq(gq gqVar, Context context) {
        this.e = gqVar;
        if (gqVar.y == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        TLRPC.Chat chat;
        int i10 = e1Var.f;
        gq gqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = gqVar.P;
        int i11 = gqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = gqVar.N;
        if (!gqVar.w.creator || ((i11 != 0 && (i11 != 2 || !gqVar.K)) || i10 != 4 || e1Var.b() != gqVar.e0)) {
            if (!gqVar.I) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = e1Var.b();
                if (b10 == gqVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = gqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !gqVar.K) {
                        return false;
                    }
                    if (b10 == gqVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !gqVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == gqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == gqVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == gqVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == gqVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == gqVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == gqVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == gqVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == gqVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == gqVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == gqVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == gqVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == gqVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == gqVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == gqVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == gqVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == gqVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == gqVar.n0) {
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
        gq gqVar = this.e;
        if (gqVar.y != 2) {
            return -1L;
        }
        if (i10 == gqVar.W) {
            return 1L;
        }
        if (i10 == gqVar.X) {
            return 2L;
        }
        if (i10 == gqVar.Y) {
            return 3L;
        }
        if (i10 == gqVar.b0) {
            return 4L;
        }
        if (i10 == gqVar.c0) {
            return 5L;
        }
        if (i10 == gqVar.d0) {
            return 6L;
        }
        if (i10 == gqVar.e0) {
            return 7L;
        }
        if (i10 == gqVar.f0) {
            return 8L;
        }
        if (i10 == gqVar.g0) {
            return 9L;
        }
        if (i10 == gqVar.h0) {
            return 10L;
        }
        if (i10 == gqVar.o0) {
            return 11L;
        }
        if (i10 == gqVar.p0) {
            return 12L;
        }
        if (i10 == gqVar.q0) {
            return 13L;
        }
        if (i10 == gqVar.r0) {
            return 14L;
        }
        if (i10 == gqVar.s0) {
            return 15L;
        }
        if (i10 == gqVar.t0) {
            return 16L;
        }
        if (i10 == gqVar.u0) {
            return 17L;
        }
        if (i10 == gqVar.v0) {
            return 18L;
        }
        if (i10 == gqVar.w0) {
            return 19L;
        }
        if (i10 == gqVar.y0) {
            return 20L;
        }
        if (i10 == gqVar.B0) {
            return 21L;
        }
        if (i10 == gqVar.H0) {
            return 22L;
        }
        if (i10 == gqVar.I0) {
            return 23L;
        }
        if (i10 == gqVar.J0) {
            return 24L;
        }
        if (i10 == gqVar.K0) {
            return 25L;
        }
        if (i10 == gqVar.L0) {
            return 26L;
        }
        if (i10 == gqVar.M0) {
            return 27L;
        }
        if (i10 == gqVar.x0) {
            return 28L;
        }
        if (i10 == gqVar.m0) {
            return 29L;
        }
        if (i10 == gqVar.C0) {
            return 30L;
        }
        if (i10 == gqVar.E0) {
            return 31L;
        }
        if (i10 == gqVar.D0) {
            return 32L;
        }
        if (i10 == gqVar.F0) {
            return 33L;
        }
        if (i10 == gqVar.G0) {
            return 34L;
        }
        if (i10 == gqVar.z0) {
            return 35L;
        }
        if (i10 == gqVar.N0) {
            return 36L;
        }
        if (i10 == gqVar.P0) {
            return 37L;
        }
        if (i10 == gqVar.Q0) {
            return 38L;
        }
        if (i10 == gqVar.R0) {
            return 39L;
        }
        if (i10 == gqVar.S0) {
            return 40L;
        }
        if (i10 == gqVar.U0) {
            return 41L;
        }
        if (i10 == gqVar.V0) {
            return 42L;
        }
        if (i10 == gqVar.W0) {
            return 43L;
        }
        if (i10 == gqVar.Z) {
            return 44L;
        }
        if (i10 == gqVar.i0) {
            return 45L;
        }
        if (i10 == gqVar.j0) {
            return 46L;
        }
        if (i10 == gqVar.k0) {
            return 47L;
        }
        if (i10 == gqVar.l0) {
            return 48L;
        }
        if (i10 == gqVar.n0) {
            return 49L;
        }
        return i10 == gqVar.a0 ? 50L : 0L;
    }

    @Override // s4.h0
    public final int j(int i10) {
        gq gqVar = this.e;
        if (i10 == gqVar.H0 || i10 == gqVar.J0 || i10 == gqVar.I0 || i10 == gqVar.B0 || i10 == gqVar.C0 || i10 == gqVar.E0 || i10 == gqVar.D0 || i10 == gqVar.G0 || i10 == gqVar.F0 || i10 == gqVar.j0 || i10 == gqVar.P0 || i10 == gqVar.Q0 || i10 == gqVar.R0 || i10 == gqVar.U0 || i10 == gqVar.V0 || i10 == gqVar.W0) {
            return 10;
        }
        if (i10 == gqVar.z0 || i10 == gqVar.N0 || i10 == gqVar.S0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == gqVar.o0 || i10 == gqVar.q0 || i10 == gqVar.L0 || i10 == gqVar.s0) {
            return 5;
        }
        if (i10 == 2 || i10 == gqVar.u0) {
            return 3;
        }
        if (i10 == gqVar.X || i10 == gqVar.Y || i10 == gqVar.Z || i10 == gqVar.b0 || i10 == gqVar.c0 || i10 == gqVar.d0 || i10 == gqVar.f0 || i10 == gqVar.g0 || i10 == gqVar.h0 || i10 == gqVar.i0 || i10 == gqVar.y0 || i10 == gqVar.e0 || i10 == gqVar.K0 || i10 == gqVar.W || i10 == gqVar.m0 || i10 == gqVar.k0 || i10 == gqVar.n0 || i10 == gqVar.a0) {
            return 4;
        }
        if (i10 == gqVar.r0 || i10 == gqVar.w0 || i10 == gqVar.l0) {
            return 1;
        }
        if (i10 == gqVar.M0) {
            return 6;
        }
        if (i10 == gqVar.v0) {
            return 11;
        }
        return i10 == gqVar.x0 ? 8 : 2;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
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
        gq gqVar = this.e;
        int i48 = gqVar.y;
        boolean z37 = gqVar.U;
        boolean z38 = gqVar.F;
        boolean z39 = gqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = gqVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = gqVar.P;
        int i49 = e1Var.f;
        View view = e1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                i11 = gqVar.y;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = gqVar.v;
                zaVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 == gqVar.l0) {
                    i9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == gqVar.r0) {
                    i9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == gqVar.w0) {
                    user2 = gqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = gqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = gqVar.y;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = gqVar.v;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            i9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = gqVar.y;
                    if (i12 != 0) {
                    }
                    i9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i10 != gqVar.p0) {
                    if (i10 == gqVar.t0) {
                        TextView textView = gaVar.getTextView();
                        int i52 = org.telegram.ui.ActionBar.y6.G6;
                        org.telegram.ui.ActionBar.f7.V(textView, i52, null);
                        gaVar.setTag(Integer.valueOf(i52));
                        if (!z39) {
                            gaVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            gaVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    TextView textView2 = gaVar.getTextView();
                    int i53 = org.telegram.ui.ActionBar.y6.p7;
                    org.telegram.ui.ActionBar.f7.V(textView2, i53, null);
                    gaVar.setTag(Integer.valueOf(i53));
                    i13 = gqVar.y;
                    if (i13 != 0) {
                        i14 = gqVar.y;
                        if (i14 == 1) {
                            gaVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        gaVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 != 2) {
                    if (i10 == gqVar.u0) {
                        q4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = gqVar.y;
                    if (i15 != 2) {
                        user4 = gqVar.v;
                        if (user4 != null) {
                            user5 = gqVar.v;
                            break;
                        }
                        i16 = gqVar.y;
                        if (i16 != 0) {
                            i17 = gqVar.y;
                            if (i17 == 1) {
                                q4Var.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                                break;
                            }
                        } else {
                            q4Var.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                            break;
                        }
                    }
                    q4Var.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                    break;
                }
                break;
            case 4:
            case 9:
                boolean z40 = true;
                final org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                boolean z41 = i48 != 2 || gqVar.K;
                TLRPC.Chat chat3 = gqVar.w;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == gqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = gqVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = gqVar.O;
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
                    z8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r12 > 0, true, true);
                    Locale locale = Locale.US;
                    z8Var.a(new Runnable(this) { // from class: org.telegram.ui.eq
                        public final /* synthetic */ fq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    gq gqVar2 = this.b.e;
                                    org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                    if (z8Var2.isEnabled()) {
                                        if (!gq.m0(gqVar2)) {
                                            boolean z43 = z8Var2.d.h;
                                            z8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = gqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(gqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.z8 z8Var3 = z8Var;
                                    if (z8Var3.isEnabled()) {
                                        boolean z44 = z8Var3.d.h;
                                        z8Var3.setChecked(z44);
                                        gq gqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = gqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(gqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.z8 z8Var4 = z8Var;
                                    if (z8Var4.isEnabled()) {
                                        boolean z46 = z8Var4.d.h;
                                        z8Var4.setChecked(z46);
                                        gq gqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = gqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(gqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.m(r12, "/10"), !gqVar.A0);
                    z8Var.setIcon(gq.m0(gqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == gqVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i54 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i54 = r42 + 1;
                    }
                    int i55 = i54;
                    if (tL_chatAdminRights39.delete_messages) {
                        i55 = i54 + 1;
                    }
                    z8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i55 > 0, true, true);
                    Locale locale2 = Locale.US;
                    z8Var.a(new Runnable(this) { // from class: org.telegram.ui.eq
                        public final /* synthetic */ fq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    gq gqVar2 = this.b.e;
                                    org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                    if (z8Var2.isEnabled()) {
                                        if (!gq.m0(gqVar2)) {
                                            boolean z43 = z8Var2.d.h;
                                            z8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = gqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(gqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.z8 z8Var3 = z8Var;
                                    if (z8Var3.isEnabled()) {
                                        boolean z44 = z8Var3.d.h;
                                        z8Var3.setChecked(z44);
                                        gq gqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = gqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(gqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.z8 z8Var4 = z8Var;
                                    if (z8Var4.isEnabled()) {
                                        boolean z46 = z8Var4.d.h;
                                        z8Var4.setChecked(z46);
                                        gq gqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = gqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(gqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.m(i55, "/3"), !gqVar.O0);
                } else if (i10 == gqVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = gqVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i56 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i56 = r52 + 1;
                    }
                    int i57 = i56;
                    if (tL_chatAdminRights40.delete_stories) {
                        i57 = i56 + 1;
                    }
                    z8Var.d(LocaleController.getString(R.string.ChannelManageStories), i57 > 0, true, true);
                    Locale locale3 = Locale.US;
                    z8Var.a(new Runnable(this) { // from class: org.telegram.ui.eq
                        public final /* synthetic */ fq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    gq gqVar2 = this.b.e;
                                    org.telegram.ui.Cells.z8 z8Var2 = z8Var;
                                    if (z8Var2.isEnabled()) {
                                        if (!gq.m0(gqVar2)) {
                                            boolean z43 = z8Var2.d.h;
                                            z8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = gqVar2.O;
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
                                            AndroidUtilities.updateVisibleRows(gqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.z8 z8Var3 = z8Var;
                                    if (z8Var3.isEnabled()) {
                                        boolean z44 = z8Var3.d.h;
                                        z8Var3.setChecked(z44);
                                        gq gqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = gqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(gqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.z8 z8Var4 = z8Var;
                                    if (z8Var4.isEnabled()) {
                                        boolean z46 = z8Var4.d.h;
                                        z8Var4.setChecked(z46);
                                        gq gqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = gqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(gqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a1.g.m(i57, "/3"), !gqVar.T0);
                } else if (i10 == gqVar.W) {
                    z8Var.d(LocaleController.getString(R.string.ManageGroup), gqVar.K, true, false);
                    tL_chatAdminRights38 = gqVar.N;
                    z8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == gqVar.X) {
                    i43 = gqVar.y;
                    if (i43 != 0) {
                        i45 = gqVar.y;
                        if (i45 != 2) {
                            i46 = gqVar.y;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = gqVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = gqVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        z8Var.c(string3, z36, gqVar.m0 == -1);
                                        tL_chatBannedRights19 = gqVar.P;
                                        z8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                z8Var.c(string3, z36, gqVar.m0 == -1);
                                tL_chatBannedRights19 = gqVar.P;
                                z8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = gqVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                z8Var.c(string4, z35, true);
                            }
                        }
                        z35 = false;
                        z8Var.c(string4, z35, true);
                    } else if (z39) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z41) {
                            tL_chatAdminRights35 = gqVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                z8Var.c(string5, z34, true);
                            }
                        }
                        z34 = false;
                        z8Var.c(string5, z34, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z41) {
                            tL_chatAdminRights34 = gqVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = gqVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            z8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        z8Var.c(string6, z33, true);
                    }
                    i44 = gqVar.y;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = gqVar.N;
                        z8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == gqVar.Y) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = gqVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            z8Var.c(string7, z32, true);
                            i42 = gqVar.y;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    z8Var.c(string7, z32, true);
                    i42 = gqVar.y;
                    if (i42 == 2) {
                    }
                } else if (i10 == gqVar.a0) {
                    user8 = gqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = gqVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                z8Var.c(string8, z31, true);
                            }
                        }
                        z31 = false;
                        z8Var.c(string8, z31, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights29 = gqVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                z8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        z8Var.c(string9, z30, true);
                    }
                    i41 = gqVar.y;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = gqVar.N;
                        z8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == gqVar.Z) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = gqVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            z8Var.c(string10, z29, true);
                            i40 = gqVar.y;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    z8Var.c(string10, z29, true);
                    i40 = gqVar.y;
                    if (i40 == 2) {
                    }
                } else if (i10 == gqVar.b0) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = gqVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            z8Var.c(string11, z28, true);
                            i39 = gqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    z8Var.c(string11, z28, true);
                    i39 = gqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i10 == gqVar.c0) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = gqVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                z8Var.c(string12, z27, true);
                            }
                        }
                        z27 = false;
                        z8Var.c(string12, z27, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights22 = gqVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                z8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        z8Var.c(string13, z26, true);
                    }
                    i38 = gqVar.y;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = gqVar.N;
                        z8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == gqVar.d0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = gqVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            z8Var.c(string14, z25, (gqVar.f0 == -1 && z39) || gqVar.e0 != -1);
                            i37 = gqVar.y;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    z8Var.c(string14, z25, (gqVar.f0 == -1 && z39) || gqVar.e0 != -1);
                    i37 = gqVar.y;
                    if (i37 == 2) {
                    }
                } else if (i10 == gqVar.e0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = gqVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            z8Var.c(string15, z24, gqVar.m0 == -1 || z37);
                            i36 = gqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    z8Var.c(string15, z24, gqVar.m0 == -1 || z37);
                    i36 = gqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i10 == gqVar.k0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (gqVar.x != null) {
                        user6 = gqVar.v;
                        if (user6 != null) {
                            long j10 = gqVar.r ? gqVar.n : gqVar.x.guard_bot_id;
                            user7 = gqVar.v;
                            if (j10 == user7.id) {
                                z23 = true;
                                z8Var.c(string16, z23, false);
                                i35 = gqVar.y;
                                if (i35 == 2) {
                                    z8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    z8Var.c(string16, z23, false);
                    i35 = gqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i10 == gqVar.f0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = gqVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            z8Var.c(string17, z22, !z38);
                            i34 = gqVar.y;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    z8Var.c(string17, z22, !z38);
                    i34 = gqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i10 == gqVar.n0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = gqVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            z8Var.c(string18, z21, true);
                            i33 = gqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    z8Var.c(string18, z21, true);
                    i33 = gqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i10 == gqVar.K0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = gqVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            z8Var.c(string19, z20, true);
                            i32 = gqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    z8Var.c(string19, z20, true);
                    i32 = gqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i10 == gqVar.m0) {
                    i29 = gqVar.y;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = gqVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                z8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        z8Var.c(string20, z19, z37);
                    } else {
                        i30 = gqVar.y;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = gqVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = gqVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    z8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = gqVar.P;
                                    z8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            z8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = gqVar.P;
                            z8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = gqVar.y;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = gqVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        z8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = gqVar.N;
                                        z8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                z8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = gqVar.N;
                                z8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == gqVar.g0) {
                    i26 = gqVar.y;
                    if (i26 == 0) {
                        chat2 = gqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = gqVar.M;
                            z8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = gqVar.M;
                            z8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = gqVar.y;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = gqVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = gqVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    z8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = gqVar.P;
                                    z8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            z8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = gqVar.P;
                            z8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = gqVar.y;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = gqVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        z8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = gqVar.N;
                                        z8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                z8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = gqVar.N;
                                z8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == gqVar.h0) {
                    i22 = gqVar.y;
                    if (i22 != 0) {
                        i24 = gqVar.y;
                        if (i24 != 2) {
                            i25 = gqVar.y;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = gqVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = gqVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        z8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = gqVar.P;
                                        z8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                z8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = gqVar.P;
                                z8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = gqVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = gqVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        z8Var.c(string28, z13, true);
                        i23 = gqVar.y;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = gqVar.N;
                            z8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    z8Var.c(string28, z13, true);
                    i23 = gqVar.y;
                    if (i23 == 2) {
                    }
                } else if (i10 == gqVar.i0) {
                    i18 = gqVar.y;
                    if (i18 != 0) {
                        i20 = gqVar.y;
                        if (i20 != 2) {
                            i21 = gqVar.y;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = gqVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = gqVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        z8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = gqVar.P;
                                        z8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                z8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = gqVar.P;
                                z8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = gqVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            z8Var.c(string30, z11, true);
                            i19 = gqVar.y;
                            if (i19 == 2) {
                                tL_chatAdminRights = gqVar.N;
                                z8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    z8Var.c(string30, z11, true);
                    i19 = gqVar.y;
                    if (i19 == 2) {
                    }
                } else if (i10 == gqVar.y0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = gqVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = gqVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            z8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = gqVar.P;
                            z8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    z8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = gqVar.P;
                    z8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = gqVar.y;
                if (i47 != 2 && i10 == gqVar.y0) {
                    tL_chatBannedRights21 = gqVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = gqVar.P;
                        break;
                    }
                    z40 = false;
                    z8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                if (i48 != 2 || (i10 != gqVar.o0 && i10 != gqVar.w0)) {
                    f7Var.setAlpha(1.0f);
                    break;
                } else {
                    f7Var.setAlpha(gqVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
                if (i10 == gqVar.M0) {
                    int i58 = gqVar.O.until_date;
                    g9Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i58 == 0 || Math.abs(((long) i58) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(gqVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                String string32 = (UserObject.isUserSelf(gqVar.v) && gqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                h6Var.getTextView().setEnabled(gqVar.I || gqVar.w.creator);
                h6Var.getTextView().setSingleLine(true);
                h6Var.getTextView().setImeOptions(6);
                h6Var.n(gqVar.S, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z43 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 != gqVar.H0) {
                    if (i10 != gqVar.J0) {
                        if (i10 != gqVar.I0) {
                            if (i10 != gqVar.B0) {
                                if (i10 != gqVar.C0) {
                                    if (i10 != gqVar.j0) {
                                        if (i10 != gqVar.D0) {
                                            if (i10 != gqVar.E0) {
                                                if (i10 != gqVar.F0) {
                                                    if (i10 != gqVar.G0) {
                                                        if (i10 != gqVar.P0) {
                                                            if (i10 != gqVar.Q0) {
                                                                if (i10 != gqVar.R0) {
                                                                    if (i10 != gqVar.U0) {
                                                                        if (i10 != gqVar.V0) {
                                                                            if (i10 == gqVar.W0) {
                                                                                y1Var.e(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            y1Var.e(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        y1Var.e(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    y1Var.e(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                y1Var.e(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            y1Var.e(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        y1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (gqVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        y1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (gqVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    y1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                y1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (gqVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                y1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            y1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (gqVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            y1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (gqVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        y1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (gqVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    y1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                y1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (gqVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                y1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            y1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (gqVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            y1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = gqVar.O;
                        y1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        y1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (gqVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    y1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.i11) view).a(gqVar.v, gqVar.S, i48 == 0, false, new t3(this, 3));
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = this.c;
        gq gqVar = this.e;
        switch (i10) {
            case 0:
                View zaVar = new org.telegram.ui.Cells.za(context, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, zaVar, null);
                view = zaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.i9(context);
                break;
            case 2:
            default:
                View gaVar = new org.telegram.ui.Cells.ga(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, gaVar, null);
                view = gaVar;
                break;
            case 3:
                View q4Var = new org.telegram.ui.Cells.q4(this.c, org.telegram.ui.ActionBar.y6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, null);
                view = q4Var;
                break;
            case 4:
            case 9:
                View z8Var = new org.telegram.ui.Cells.z8(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, z8Var, null);
                view = z8Var;
                break;
            case 5:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 6:
                View g9Var = new org.telegram.ui.Cells.g9(context, null, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, g9Var, null);
                view = g9Var;
                break;
            case 7:
                org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, 0, null, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, h6Var, null);
                h6Var.b(new m0(this, 4));
                view = h6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                gqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.y6.a7;
                org.telegram.ui.ActionBar.f7.i(i12, frameLayout, null);
                gqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
                gqVar.f = s6Var;
                s6Var.setTypeface(AndroidUtilities.bold());
                gqVar.f.setTextColor(-1);
                gqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                gqVar.f.setGravity(17);
                org.telegram.ui.Components.s6 s6Var2 = gqVar.f;
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(gqVar.K ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                s6Var2.setText(sb2.toString());
                gqVar.e.addView(gqVar.f, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                gqVar.e.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                gqVar.e.setOnClickListener(new a(this, 14));
                gqVar.d.addView(gqVar.e, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                gqVar.d.setLayoutParams(new s4.q0(-1, -2));
                View view2 = new View(context);
                org.telegram.ui.ActionBar.f7.i(i12, view2, null);
                gqVar.d.setClipChildren(false);
                gqVar.d.setClipToPadding(false);
                gqVar.d.addView(view2, org.telegram.ui.Components.gb1.h(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view = gqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.c, gqVar.getResourceProvider(), false);
                y1Var.setPad(1);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.k7);
                y1Var.setEnabled(true);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, y1Var, null);
                view = y1Var;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.r2) gqVar).currentAccount;
                long j10 = -gqVar.s;
                u6Var = ((org.telegram.ui.ActionBar.r2) gqVar).resourceProvider;
                view = new org.telegram.ui.Components.i11(i11, j10, this.c, u6Var);
                break;
        }
        return new org.telegram.ui.Components.vl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int b10 = e1Var.b();
        gq gqVar = this.e;
        if (b10 == gqVar.u0) {
            gq.g0(gqVar, e1Var.a);
        }
    }

    @Override // s4.h0
    public final void z(s4.e1 e1Var) {
        int b10 = e1Var.b();
        gq gqVar = this.e;
        if (b10 != gqVar.v0 || gqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(gqVar.getParentActivity().getCurrentFocus());
    }
}
