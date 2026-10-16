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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ci0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ di0 d;

    public ci0(di0 di0Var, Context context) {
        this.d = di0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        di0 di0Var = this.d;
        if (di0Var.Q == b10 || di0Var.x == b10) {
            return true;
        }
        if (b10 >= di0Var.y && b10 < di0Var.E) {
            return true;
        }
        if ((b10 < di0Var.H || b10 >= di0Var.I) && b10 != di0Var.N) {
            return b10 >= di0Var.U && b10 < di0Var.V;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.g0
    public final int j(int i10) {
        di0 di0Var = this.d;
        if (i10 == di0Var.r) {
            return 0;
        }
        if (i10 == di0Var.s || i10 == di0Var.L || i10 == di0Var.S || i10 == di0Var.P) {
            return 1;
        }
        if (i10 == di0Var.v) {
            return 2;
        }
        if (i10 == di0Var.x) {
            return 3;
        }
        if (i10 == di0Var.w || i10 == di0Var.J || i10 == di0Var.M || i10 == di0Var.R || i10 == di0Var.T) {
            return 4;
        }
        if (i10 >= di0Var.y && i10 < di0Var.E) {
            return 5;
        }
        if (i10 >= di0Var.H && i10 < di0Var.I) {
            return 5;
        }
        if (i10 == di0Var.F) {
            return 6;
        }
        if (i10 == di0Var.K) {
            return 7;
        }
        if (i10 == di0Var.N) {
            return 8;
        }
        if (i10 == di0Var.O) {
            return 9;
        }
        if (i10 == di0Var.Q) {
            return 10;
        }
        if (i10 < di0Var.U || i10 >= di0Var.V) {
            return i10 == di0Var.G ? 11 : 1;
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
    
        r14 = (org.telegram.ui.ai0) r14;
        r14.b(r1, r15 - r0.y);
        r14.H = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r15 == (r0.I - 1)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        di0 di0Var = this.d;
        ArrayList arrayList = di0Var.i0;
        long j10 = di0Var.f;
        long j11 = di0Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == di0Var.s) {
                if (di0Var.o0 && j10 == di0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == di0Var.getAccountInstance().getUserConfig().clientUserId) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == di0Var.L) {
                m4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == di0Var.P) {
                m4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == di0Var.S) {
                    m4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) view;
            w90Var.setCanEdit(j10 == di0Var.getAccountInstance().getUserConfig().clientUserId);
            if (di0Var.o0 && j10 == di0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (di0Var.d != null) {
                    w90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(di0Var.c));
                    w90Var.d(0, null, false);
                    w90Var.b(true);
                    return;
                }
                return;
            }
            w90Var.b(!di0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = di0Var.e;
            if (tL_chatInviteExported2 != null) {
                w90Var.setLink(tL_chatInviteExported2.link);
                w90Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                w90Var.setLink(null);
                w90Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            g2Var.a.l(string, false);
            g2Var.b.setImageDrawable(crVar);
            g2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    TLRPC.ChatFull chatFull = di0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = di0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (i10 != di0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) di0Var.m0.get(i10 - di0Var.U);
                        TLRPC.User user2 = (TLRPC.User) di0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i13 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != di0Var.V - 1) {
                            i11 = i13;
                            user = user2;
                            if (user == null) {
                                b5Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i13;
                            user = user2;
                        }
                    } else {
                        user = di0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = di0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
                    if (i10 == di0Var.G) {
                        TLRPC.ChatFull chatFull2 = di0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = di0Var.getMessagesController().getChat(Long.valueOf(j11));
                        if (chatFull2 == null || !chatFull2.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            e9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                            break;
                        } else {
                            e9Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        int i14 = di0Var.y;
        if (i10 < i14 || i10 >= di0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) di0Var.j0.get(i10 - di0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i14);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        di0 di0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(this.c, di0Var, null, true, di0Var.h);
                w90Var.setPermanent(true);
                w90Var.setDelegate(new bi0(this, w90Var));
                view = w90Var;
                break;
            case 3:
                c6Var = ((org.telegram.ui.ActionBar.m2) di0Var).resourceProvider;
                view = new org.telegram.ui.Cells.g2(context, 64, c6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                view = new ai0(di0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(9);
                f10Var.w = false;
                view = f10Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                view = caVar;
                break;
            case 9:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.b5(8, 6, this.c, null, false);
                break;
            case 11:
                c6Var2 = ((org.telegram.ui.ActionBar.m2) di0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e9(context, c6Var2);
                break;
            default:
                FrameLayout wh0Var = new wh0(context);
                wh0Var.addView(new vh0(context), w7.z5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(di0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                wh0Var.addView(textView, w7.z5.a(-2.0f, 52.0f, 143.0f, 52.0f, 18.0f, -1, 51));
                wh0Var.setTag(-33024);
                view = wh0Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
