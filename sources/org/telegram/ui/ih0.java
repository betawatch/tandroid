package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ih0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ jh0 d;

    public ih0(jh0 jh0Var, Context context) {
        this.d = jh0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        jh0 jh0Var = this.d;
        if (jh0Var.Q == b10 || jh0Var.x == b10) {
            return true;
        }
        if (b10 >= jh0Var.y && b10 < jh0Var.E) {
            return true;
        }
        if ((b10 < jh0Var.H || b10 >= jh0Var.I) && b10 != jh0Var.N) {
            return b10 >= jh0Var.U && b10 < jh0Var.V;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.h0
    public final int j(int i10) {
        jh0 jh0Var = this.d;
        if (i10 == jh0Var.r) {
            return 0;
        }
        if (i10 == jh0Var.s || i10 == jh0Var.L || i10 == jh0Var.S || i10 == jh0Var.P) {
            return 1;
        }
        if (i10 == jh0Var.v) {
            return 2;
        }
        if (i10 == jh0Var.x) {
            return 3;
        }
        if (i10 == jh0Var.w || i10 == jh0Var.J || i10 == jh0Var.M || i10 == jh0Var.R || i10 == jh0Var.T) {
            return 4;
        }
        if (i10 >= jh0Var.y && i10 < jh0Var.E) {
            return 5;
        }
        if (i10 >= jh0Var.H && i10 < jh0Var.I) {
            return 5;
        }
        if (i10 == jh0Var.F) {
            return 6;
        }
        if (i10 == jh0Var.K) {
            return 7;
        }
        if (i10 == jh0Var.N) {
            return 8;
        }
        if (i10 == jh0Var.O) {
            return 9;
        }
        if (i10 == jh0Var.Q) {
            return 10;
        }
        if (i10 < jh0Var.U || i10 >= jh0Var.V) {
            return i10 == jh0Var.G ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r15 == (r0.E - 1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        r14 = (org.telegram.ui.gh0) r14;
        r14.b(r1, r15 - r0.y);
        r14.H = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.I - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        jh0 jh0Var = this.d;
        ArrayList arrayList = jh0Var.i0;
        long j10 = jh0Var.f;
        long j11 = jh0Var.n;
        int i12 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == jh0Var.s) {
                if (jh0Var.o0 && j10 == jh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    q4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == jh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == jh0Var.L) {
                q4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == jh0Var.P) {
                q4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == jh0Var.S) {
                    q4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.r90 r90Var = (org.telegram.ui.Components.r90) view;
            r90Var.setCanEdit(j10 == jh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (jh0Var.o0 && j10 == jh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (jh0Var.d != null) {
                    r90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(jh0Var.c));
                    r90Var.d(0, null, false);
                    r90Var.b(true);
                    return;
                }
                return;
            }
            r90Var.b(!jh0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = jh0Var.e;
            if (tL_chatInviteExported2 != null) {
                r90Var.setLink(tL_chatInviteExported2.link);
                r90Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                r90Var.setLink(null);
                r90Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i13 = org.telegram.ui.ActionBar.y6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(e2Var, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.f7.y(e2Var, drawable2, org.telegram.ui.ActionBar.y6.k7, null, mode);
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            e2Var.a.l(string, false);
            e2Var.b.setImageDrawable(arVar);
            e2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                    TLRPC.ChatFull chatFull = jh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = jh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        i9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
                    if (i10 != jh0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) jh0Var.m0.get(i10 - jh0Var.U);
                        TLRPC.User user2 = (TLRPC.User) jh0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i14 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != jh0Var.V - 1) {
                            i11 = i14;
                            user = user2;
                            if (user == null) {
                                f5Var.c(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i14;
                            user = user2;
                        }
                    } else {
                        user = jh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = jh0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.i9 i9Var2 = (org.telegram.ui.Cells.i9) view;
                    if (i10 == jh0Var.G) {
                        TLRPC.ChatFull chatFull2 = jh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = jh0Var.getMessagesController().getChat(Long.valueOf(j11));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            i9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            i9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i15 = jh0Var.y;
        if (i10 < i15 || i10 >= jh0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) jh0Var.j0.get(i10 - jh0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Components.c10 c10Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        jh0 jh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.q4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(this.c, jh0Var, null, true, jh0Var.h);
                r90Var.setPermanent(true);
                r90Var.setDelegate(new hh0(this, r90Var));
                view = r90Var;
                break;
            case 3:
                u6Var = ((org.telegram.ui.ActionBar.r2) jh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e2(context, 64, u6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 5:
                view = new gh0(jh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(context, null);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(9);
                c10Var2.w = false;
                c10Var = c10Var2;
                view = c10Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 8:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
                c10Var = gaVar;
                view = c10Var;
                break;
            case 9:
                view = new org.telegram.ui.Cells.i9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.f5(8, 6, this.c, null, false);
                break;
            case 11:
                u6Var2 = ((org.telegram.ui.ActionBar.r2) jh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.i9(context, u6Var2);
                break;
            default:
                FrameLayout ch0Var = new ch0(context);
                ch0Var.addView(new bh0(context), org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(jh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                ch0Var.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                ch0Var.setTag(-33024);
                view = ch0Var;
                break;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
