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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kh0 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ lh0 d;

    public kh0(lh0 lh0Var, Context context) {
        this.d = lh0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        lh0 lh0Var = this.d;
        if (lh0Var.Q == b10 || lh0Var.x == b10) {
            return true;
        }
        if (b10 >= lh0Var.y && b10 < lh0Var.E) {
            return true;
        }
        if ((b10 < lh0Var.H || b10 >= lh0Var.I) && b10 != lh0Var.N) {
            return b10 >= lh0Var.U && b10 < lh0Var.V;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.h0
    public final int j(int i10) {
        lh0 lh0Var = this.d;
        if (i10 == lh0Var.r) {
            return 0;
        }
        if (i10 == lh0Var.s || i10 == lh0Var.L || i10 == lh0Var.S || i10 == lh0Var.P) {
            return 1;
        }
        if (i10 == lh0Var.v) {
            return 2;
        }
        if (i10 == lh0Var.x) {
            return 3;
        }
        if (i10 == lh0Var.w || i10 == lh0Var.J || i10 == lh0Var.M || i10 == lh0Var.R || i10 == lh0Var.T) {
            return 4;
        }
        if (i10 >= lh0Var.y && i10 < lh0Var.E) {
            return 5;
        }
        if (i10 >= lh0Var.H && i10 < lh0Var.I) {
            return 5;
        }
        if (i10 == lh0Var.F) {
            return 6;
        }
        if (i10 == lh0Var.K) {
            return 7;
        }
        if (i10 == lh0Var.N) {
            return 8;
        }
        if (i10 == lh0Var.O) {
            return 9;
        }
        if (i10 == lh0Var.Q) {
            return 10;
        }
        if (i10 < lh0Var.U || i10 >= lh0Var.V) {
            return i10 == lh0Var.G ? 11 : 1;
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
    
        r14 = (org.telegram.ui.ih0) r14;
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
        lh0 lh0Var = this.d;
        ArrayList arrayList = lh0Var.i0;
        long j10 = lh0Var.f;
        long j11 = lh0Var.n;
        int i12 = e1Var.f;
        View view = e1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == lh0Var.s) {
                if (lh0Var.o0 && j10 == lh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    q4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == lh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == lh0Var.L) {
                q4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == lh0Var.P) {
                q4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == lh0Var.S) {
                    q4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) view;
            s90Var.setCanEdit(j10 == lh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (lh0Var.o0 && j10 == lh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (lh0Var.d != null) {
                    s90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(lh0Var.c));
                    s90Var.d(0, null, false);
                    s90Var.b(true);
                    return;
                }
                return;
            }
            s90Var.b(!lh0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = lh0Var.e;
            if (tL_chatInviteExported2 != null) {
                s90Var.setLink(tL_chatInviteExported2.link);
                s90Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                s90Var.setLink(null);
                s90Var.d(0, null, false);
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
                    TLRPC.ChatFull chatFull = lh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = lh0Var.getMessagesController().getChat(Long.valueOf(j11));
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
                    if (i10 != lh0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) lh0Var.m0.get(i10 - lh0Var.U);
                        TLRPC.User user2 = (TLRPC.User) lh0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i14 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != lh0Var.V - 1) {
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
                        user = lh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = lh0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.i9 i9Var2 = (org.telegram.ui.Cells.i9) view;
                    if (i10 == lh0Var.G) {
                        TLRPC.ChatFull chatFull2 = lh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = lh0Var.getMessagesController().getChat(Long.valueOf(j11));
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
        int i15 = lh0Var.y;
        if (i10 < i15 || i10 >= lh0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) lh0Var.j0.get(i10 - lh0Var.H);
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
        lh0 lh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.q4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(this.c, lh0Var, null, true, lh0Var.h);
                s90Var.setPermanent(true);
                s90Var.setDelegate(new jh0(this, s90Var));
                view = s90Var;
                break;
            case 3:
                u6Var = ((org.telegram.ui.ActionBar.r2) lh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e2(context, 64, u6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 5:
                view = new ih0(lh0Var, context);
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
                u6Var2 = ((org.telegram.ui.ActionBar.r2) lh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.i9(context, u6Var2);
                break;
            default:
                FrameLayout eh0Var = new eh0(context);
                eh0Var.addView(new dh0(context), org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(lh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                eh0Var.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                eh0Var.setTag(-33024);
                view = eh0Var;
                break;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
