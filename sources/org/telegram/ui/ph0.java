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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ qh0 d;

    public ph0(qh0 qh0Var, Context context) {
        this.d = qh0Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        qh0 qh0Var = this.d;
        if (qh0Var.N == b10 || qh0Var.x == b10) {
            return true;
        }
        if (b10 >= qh0Var.y && b10 < qh0Var.B) {
            return true;
        }
        if ((b10 < qh0Var.E || b10 >= qh0Var.F) && b10 != qh0Var.K) {
            return b10 >= qh0Var.R && b10 < qh0Var.S;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.U;
    }

    @Override // f2.p0
    public final int j(int i10) {
        qh0 qh0Var = this.d;
        if (i10 == qh0Var.r) {
            return 0;
        }
        if (i10 == qh0Var.s || i10 == qh0Var.I || i10 == qh0Var.P || i10 == qh0Var.M) {
            return 1;
        }
        if (i10 == qh0Var.v) {
            return 2;
        }
        if (i10 == qh0Var.x) {
            return 3;
        }
        if (i10 == qh0Var.w || i10 == qh0Var.G || i10 == qh0Var.J || i10 == qh0Var.O || i10 == qh0Var.Q) {
            return 4;
        }
        if (i10 >= qh0Var.y && i10 < qh0Var.B) {
            return 5;
        }
        if (i10 >= qh0Var.E && i10 < qh0Var.F) {
            return 5;
        }
        if (i10 == qh0Var.C) {
            return 6;
        }
        if (i10 == qh0Var.H) {
            return 7;
        }
        if (i10 == qh0Var.K) {
            return 8;
        }
        if (i10 == qh0Var.L) {
            return 9;
        }
        if (i10 == qh0Var.N) {
            return 10;
        }
        if (i10 < qh0Var.R || i10 >= qh0Var.S) {
            return i10 == qh0Var.D ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r15 == (r0.B - 1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        r14 = (org.telegram.ui.nh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.E = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.F - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        qh0 qh0Var = this.d;
        ArrayList arrayList = qh0Var.f0;
        long j10 = qh0Var.f;
        long j11 = qh0Var.n;
        int i12 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == qh0Var.s) {
                if (qh0Var.l0 && j10 == qh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == qh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == qh0Var.I) {
                m4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == qh0Var.M) {
                m4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == qh0Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) view;
            y80Var.setCanEdit(j10 == qh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (qh0Var.l0 && j10 == qh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (qh0Var.d != null) {
                    y80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(qh0Var.c));
                    y80Var.d(0, null, false);
                    y80Var.b(true);
                    return;
                }
                return;
            }
            y80Var.b(!qh0Var.m0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qh0Var.e;
            if (tL_chatInviteExported2 != null) {
                y80Var.setLink(tL_chatInviteExported2.link);
                y80Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                y80Var.setLink(null);
                y80Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k7, false), mode));
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z10 = !arrayList.isEmpty();
            f2Var.a.l(string, false);
            f2Var.b.setImageDrawable(pqVar);
            f2Var.c = z10;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    TLRPC.ChatFull chatFull = qh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = qh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        a9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        a9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (i10 != qh0Var.N) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) qh0Var.j0.get(i10 - qh0Var.R);
                        TLRPC.User user2 = (TLRPC.User) qh0Var.h0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != qh0Var.S - 1) {
                            i11 = i13;
                            user = user2;
                            if (user == null) {
                                b5Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z4);
                                break;
                            }
                        } else {
                            i11 = i13;
                            user = user2;
                        }
                    } else {
                        user = qh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = qh0Var.c0;
                    }
                    z4 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                    if (i10 == qh0Var.D) {
                        TLRPC.ChatFull chatFull2 = qh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = qh0Var.getMessagesController().getChat(Long.valueOf(j11));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            a9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            a9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = qh0Var.y;
        if (i10 < i14 || i10 >= qh0Var.B) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) qh0Var.g0.get(i10 - qh0Var.E);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        qh0 qh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(this.c, qh0Var, null, true, qh0Var.h);
                y80Var.setPermanent(true);
                y80Var.setDelegate(new oh0(this, y80Var));
                view = y80Var;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.p2) qh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f2(context, 64, g6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 5:
                view = new nh0(qh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(9);
                u00Var.w = false;
                view = u00Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 8:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                view = aaVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(8, 6, this.c, null, false);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.p2) qh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.a9(context, g6Var2);
                break;
            default:
                FrameLayout jh0Var = new jh0(context);
                jh0Var.addView(new ih0(context), k7.c6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(qh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                jh0Var.addView(textView, k7.c6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                jh0Var.setTag(-33024);
                view = jh0Var;
                break;
        }
        return yh.o(view, view, -1, -2);
    }
}
