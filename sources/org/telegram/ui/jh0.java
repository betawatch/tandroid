package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jh0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ kh0 d;

    public jh0(kh0 kh0Var, Context context) {
        this.d = kh0Var;
        this.c = context;
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int b10 = o1Var.b();
        kh0 kh0Var = this.d;
        if (kh0Var.M == b10 || kh0Var.x == b10) {
            return true;
        }
        if (b10 >= kh0Var.y && b10 < kh0Var.A) {
            return true;
        }
        if ((b10 < kh0Var.D || b10 >= kh0Var.E) && b10 != kh0Var.J) {
            return b10 >= kh0Var.Q && b10 < kh0Var.R;
        }
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.T;
    }

    @Override // f2.q0
    public final int j(int i10) {
        kh0 kh0Var = this.d;
        if (i10 == kh0Var.r) {
            return 0;
        }
        if (i10 == kh0Var.s || i10 == kh0Var.H || i10 == kh0Var.O || i10 == kh0Var.L) {
            return 1;
        }
        if (i10 == kh0Var.v) {
            return 2;
        }
        if (i10 == kh0Var.x) {
            return 3;
        }
        if (i10 == kh0Var.w || i10 == kh0Var.F || i10 == kh0Var.I || i10 == kh0Var.N || i10 == kh0Var.P) {
            return 4;
        }
        if (i10 >= kh0Var.y && i10 < kh0Var.A) {
            return 5;
        }
        if (i10 >= kh0Var.D && i10 < kh0Var.E) {
            return 5;
        }
        if (i10 == kh0Var.B) {
            return 6;
        }
        if (i10 == kh0Var.G) {
            return 7;
        }
        if (i10 == kh0Var.J) {
            return 8;
        }
        if (i10 == kh0Var.K) {
            return 9;
        }
        if (i10 == kh0Var.M) {
            return 10;
        }
        if (i10 < kh0Var.Q || i10 >= kh0Var.R) {
            return i10 == kh0Var.C ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r15 == (r0.A - 1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        r14 = (org.telegram.ui.hh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.D = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.E - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        kh0 kh0Var = this.d;
        ArrayList arrayList = kh0Var.e0;
        long j10 = kh0Var.f;
        long j11 = kh0Var.n;
        int i12 = o1Var.f;
        View view = o1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == kh0Var.s) {
                if (kh0Var.k0 && j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    j4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    j4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == kh0Var.H) {
                j4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == kh0Var.L) {
                j4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == kh0Var.O) {
                    j4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) view;
            i80Var.setCanEdit(j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (kh0Var.k0 && j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (kh0Var.d != null) {
                    i80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(kh0Var.c));
                    i80Var.d(0, null, false);
                    i80Var.b(true);
                    return;
                }
                return;
            }
            i80Var.b(!kh0Var.l0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = kh0Var.e;
            if (tL_chatInviteExported2 != null) {
                i80Var.setLink(tL_chatInviteExported2.link);
                i80Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                i80Var.setLink(null);
                i80Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            e2Var.a.l(string, false);
            e2Var.b.setImageDrawable(dqVar);
            e2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    TLRPC.ChatFull chatFull = kh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = kh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        x8Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (i10 != kh0Var.M) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kh0Var.i0.get(i10 - kh0Var.Q);
                        TLRPC.User user2 = (TLRPC.User) kh0Var.g0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != kh0Var.R - 1) {
                            i11 = i13;
                            user = user2;
                            if (user == null) {
                                y4Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i13;
                            user = user2;
                        }
                    } else {
                        user = kh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = kh0Var.b0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                    if (i10 == kh0Var.C) {
                        TLRPC.ChatFull chatFull2 = kh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = kh0Var.getMessagesController().getChat(Long.valueOf(j11));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            x8Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            x8Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = kh0Var.y;
        if (i10 < i14 || i10 >= kh0Var.A) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kh0Var.f0.get(i10 - kh0Var.D);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        kh0 kh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.j4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(this.c, kh0Var, null, true, kh0Var.h);
                i80Var.setPermanent(true);
                i80Var.setDelegate(new ih0(this, i80Var));
                view = i80Var;
                break;
            case 3:
                c6Var = ((org.telegram.ui.ActionBar.n2) kh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e2(context, 64, c6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 5:
                view = new hh0(kh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(9);
                h00Var.w = false;
                view = h00Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                view = x9Var;
                break;
            case 9:
                view = new org.telegram.ui.Cells.x8(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.y4(8, 6, this.c, null, false);
                break;
            case 11:
                c6Var2 = ((org.telegram.ui.ActionBar.n2) kh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.x8(context, c6Var2);
                break;
            default:
                FrameLayout dh0Var = new dh0(context);
                dh0Var.addView(new ch0(context), h7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(kh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                dh0Var.addView(textView, h7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                dh0Var.setTag(-33024);
                view = dh0Var;
                break;
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
