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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class oh0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ ph0 d;

    public oh0(ph0 ph0Var, Context context) {
        this.d = ph0Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        ph0 ph0Var = this.d;
        if (ph0Var.N == b10 || ph0Var.x == b10) {
            return true;
        }
        if (b10 >= ph0Var.y && b10 < ph0Var.B) {
            return true;
        }
        if ((b10 < ph0Var.E || b10 >= ph0Var.F) && b10 != ph0Var.K) {
            return b10 >= ph0Var.R && b10 < ph0Var.S;
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.U;
    }

    @Override // f2.o0
    public final int j(int i10) {
        ph0 ph0Var = this.d;
        if (i10 == ph0Var.r) {
            return 0;
        }
        if (i10 == ph0Var.s || i10 == ph0Var.I || i10 == ph0Var.P || i10 == ph0Var.M) {
            return 1;
        }
        if (i10 == ph0Var.v) {
            return 2;
        }
        if (i10 == ph0Var.x) {
            return 3;
        }
        if (i10 == ph0Var.w || i10 == ph0Var.G || i10 == ph0Var.J || i10 == ph0Var.O || i10 == ph0Var.Q) {
            return 4;
        }
        if (i10 >= ph0Var.y && i10 < ph0Var.B) {
            return 5;
        }
        if (i10 >= ph0Var.E && i10 < ph0Var.F) {
            return 5;
        }
        if (i10 == ph0Var.C) {
            return 6;
        }
        if (i10 == ph0Var.H) {
            return 7;
        }
        if (i10 == ph0Var.K) {
            return 8;
        }
        if (i10 == ph0Var.L) {
            return 9;
        }
        if (i10 == ph0Var.N) {
            return 10;
        }
        if (i10 < ph0Var.R || i10 >= ph0Var.S) {
            return i10 == ph0Var.D ? 11 : 1;
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
    
        r14 = (org.telegram.ui.mh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.E = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.F - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        ph0 ph0Var = this.d;
        ArrayList arrayList = ph0Var.f0;
        long j10 = ph0Var.f;
        long j11 = ph0Var.n;
        int i12 = l1Var.f;
        View view = l1Var.a;
        boolean z4 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == ph0Var.s) {
                if (ph0Var.l0 && j10 == ph0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == ph0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == ph0Var.I) {
                m4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == ph0Var.M) {
                m4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == ph0Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.x80 x80Var = (org.telegram.ui.Components.x80) view;
            x80Var.setCanEdit(j10 == ph0Var.getAccountInstance().getUserConfig().clientUserId);
            if (ph0Var.l0 && j10 == ph0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (ph0Var.d != null) {
                    x80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(ph0Var.c));
                    x80Var.d(0, null, false);
                    x80Var.b(true);
                    return;
                }
                return;
            }
            x80Var.b(!ph0Var.m0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ph0Var.e;
            if (tL_chatInviteExported2 != null) {
                x80Var.setLink(tL_chatInviteExported2.link);
                x80Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                x80Var.setLink(null);
                x80Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z10 = !arrayList.isEmpty();
            f2Var.a.l(string, false);
            f2Var.b.setImageDrawable(nqVar);
            f2Var.c = z10;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    TLRPC.ChatFull chatFull = ph0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = ph0Var.getMessagesController().getChat(Long.valueOf(j11));
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
                    if (i10 != ph0Var.N) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ph0Var.j0.get(i10 - ph0Var.R);
                        TLRPC.User user2 = (TLRPC.User) ph0Var.h0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != ph0Var.S - 1) {
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
                        user = ph0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = ph0Var.c0;
                    }
                    z4 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                    if (i10 == ph0Var.D) {
                        TLRPC.ChatFull chatFull2 = ph0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = ph0Var.getMessagesController().getChat(Long.valueOf(j11));
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
        int i14 = ph0Var.y;
        if (i10 < i14 || i10 >= ph0Var.B) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ph0Var.g0.get(i10 - ph0Var.E);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        ph0 ph0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(this.c, ph0Var, null, true, ph0Var.h);
                x80Var.setPermanent(true);
                x80Var.setDelegate(new nh0(this, x80Var));
                view = x80Var;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.p2) ph0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f2(context, 64, f6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 5:
                view = new mh0(ph0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(9);
                t00Var.w = false;
                view = t00Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 8:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                view = aaVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(8, 6, this.c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) ph0Var).resourceProvider;
                view = new org.telegram.ui.Cells.a9(context, f6Var2);
                break;
            default:
                FrameLayout ih0Var = new ih0(context);
                ih0Var.addView(new hh0(context), k7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(ph0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                ih0Var.addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                ih0Var.setTag(-33024);
                view = ih0Var;
                break;
        }
        return yh.o(view, view, -1, -2);
    }
}
