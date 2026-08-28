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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gh0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ hh0 d;

    public gh0(hh0 hh0Var, Context context) {
        this.d = hh0Var;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        hh0 hh0Var = this.d;
        if (hh0Var.M == b10 || hh0Var.x == b10) {
            return true;
        }
        if (b10 >= hh0Var.y && b10 < hh0Var.A) {
            return true;
        }
        if ((b10 < hh0Var.D || b10 >= hh0Var.E) && b10 != hh0Var.J) {
            return b10 >= hh0Var.Q && b10 < hh0Var.R;
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.T;
    }

    @Override // f2.r0
    public final int j(int i9) {
        hh0 hh0Var = this.d;
        if (i9 == hh0Var.r) {
            return 0;
        }
        if (i9 == hh0Var.s || i9 == hh0Var.H || i9 == hh0Var.O || i9 == hh0Var.L) {
            return 1;
        }
        if (i9 == hh0Var.v) {
            return 2;
        }
        if (i9 == hh0Var.x) {
            return 3;
        }
        if (i9 == hh0Var.w || i9 == hh0Var.F || i9 == hh0Var.I || i9 == hh0Var.N || i9 == hh0Var.P) {
            return 4;
        }
        if (i9 >= hh0Var.y && i9 < hh0Var.A) {
            return 5;
        }
        if (i9 >= hh0Var.D && i9 < hh0Var.E) {
            return 5;
        }
        if (i9 == hh0Var.B) {
            return 6;
        }
        if (i9 == hh0Var.G) {
            return 7;
        }
        if (i9 == hh0Var.J) {
            return 8;
        }
        if (i9 == hh0Var.K) {
            return 9;
        }
        if (i9 == hh0Var.M) {
            return 10;
        }
        if (i9 < hh0Var.Q || i9 >= hh0Var.R) {
            return i9 == hh0Var.C ? 11 : 1;
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
    
        r14 = (org.telegram.ui.eh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.D = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.E - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i10;
        TLRPC.User user;
        hh0 hh0Var = this.d;
        ArrayList arrayList = hh0Var.e0;
        long j10 = hh0Var.f;
        long j11 = hh0Var.n;
        int i11 = q1Var.f;
        View view = q1Var.a;
        boolean z10 = true;
        if (i11 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == hh0Var.s) {
                if (hh0Var.k0 && j10 == hh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == hh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i9 == hh0Var.H) {
                m4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i9 == hh0Var.L) {
                m4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i9 == hh0Var.O) {
                    m4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Components.e80 e80Var = (org.telegram.ui.Components.e80) view;
            e80Var.setCanEdit(j10 == hh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (hh0Var.k0 && j10 == hh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (hh0Var.d != null) {
                    e80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(hh0Var.c));
                    e80Var.d(0, null, false);
                    e80Var.b(true);
                    return;
                }
                return;
            }
            e80Var.b(!hh0Var.l0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var.e;
            if (tL_chatInviteExported2 != null) {
                e80Var.setLink(tL_chatInviteExported2.link);
                e80Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                e80Var.setLink(null);
                e80Var.d(0, null, false);
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k7, false), mode));
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            f2Var.a.l(string, false);
            f2Var.b.setImageDrawable(fqVar);
            f2Var.c = z11;
            return;
        }
        if (i11 != 5) {
            switch (i11) {
                case 9:
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    TLRPC.ChatFull chatFull = hh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = hh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        b9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        b9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (i9 != hh0Var.M) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) hh0Var.i0.get(i9 - hh0Var.Q);
                        TLRPC.User user2 = (TLRPC.User) hh0Var.g0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i12 = tL_chatAdminWithInvites.invites_count;
                        if (i9 != hh0Var.R - 1) {
                            i10 = i12;
                            user = user2;
                            if (user == null) {
                                b5Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i10, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i10 = i12;
                            user = user2;
                        }
                    } else {
                        user = hh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i10 = hh0Var.b0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.b9 b9Var2 = (org.telegram.ui.Cells.b9) view;
                    if (i9 == hh0Var.C) {
                        TLRPC.ChatFull chatFull2 = hh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = hh0Var.getMessagesController().getChat(Long.valueOf(j11));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            b9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            b9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i13 = hh0Var.y;
        if (i9 < i13 || i9 >= hh0Var.A) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) hh0Var.f0.get(i9 - hh0Var.D);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i9 - i13);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        hh0 hh0Var = this.d;
        Context context = this.c;
        switch (i9) {
            case 1:
                view = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(this.c, hh0Var, null, true, hh0Var.h);
                e80Var.setPermanent(true);
                e80Var.setDelegate(new fh0(this, e80Var));
                view = e80Var;
                break;
            case 3:
                b6Var = ((org.telegram.ui.ActionBar.o2) hh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f2(context, 64, b6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 5:
                view = new eh0(hh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(9);
                e00Var.w = false;
                view = e00Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 8:
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                baVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                view = baVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(8, 6, this.c, null, false);
                break;
            case 11:
                b6Var2 = ((org.telegram.ui.ActionBar.o2) hh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.b9(context, b6Var2);
                break;
            default:
                FrameLayout ah0Var = new ah0(context);
                ah0Var.addView(new zg0(context), g7.e6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(hh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                ah0Var.addView(textView, g7.e6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                ah0Var.setTag(-33024);
                view = ah0Var;
                break;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
