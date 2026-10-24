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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lh0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ mh0 d;

    public lh0(mh0 mh0Var, Context context) {
        this.d = mh0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        mh0 mh0Var = this.d;
        if (mh0Var.Q == b10 || mh0Var.x == b10) {
            return true;
        }
        if (b10 >= mh0Var.y && b10 < mh0Var.E) {
            return true;
        }
        if ((b10 < mh0Var.H || b10 >= mh0Var.I) && b10 != mh0Var.N) {
            return b10 >= mh0Var.U && b10 < mh0Var.V;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.X;
    }

    @Override // s4.g0
    public final int j(int i10) {
        mh0 mh0Var = this.d;
        if (i10 == mh0Var.r) {
            return 0;
        }
        if (i10 == mh0Var.s || i10 == mh0Var.L || i10 == mh0Var.S || i10 == mh0Var.P) {
            return 1;
        }
        if (i10 == mh0Var.v) {
            return 2;
        }
        if (i10 == mh0Var.x) {
            return 3;
        }
        if (i10 == mh0Var.w || i10 == mh0Var.J || i10 == mh0Var.M || i10 == mh0Var.R || i10 == mh0Var.T) {
            return 4;
        }
        if (i10 >= mh0Var.y && i10 < mh0Var.E) {
            return 5;
        }
        if (i10 >= mh0Var.H && i10 < mh0Var.I) {
            return 5;
        }
        if (i10 == mh0Var.F) {
            return 6;
        }
        if (i10 == mh0Var.K) {
            return 7;
        }
        if (i10 == mh0Var.N) {
            return 8;
        }
        if (i10 == mh0Var.O) {
            return 9;
        }
        if (i10 == mh0Var.Q) {
            return 10;
        }
        if (i10 < mh0Var.U || i10 >= mh0Var.V) {
            return i10 == mh0Var.G ? 11 : 1;
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
    
        r14 = (org.telegram.ui.jh0) r14;
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
        mh0 mh0Var = this.d;
        ArrayList arrayList = mh0Var.i0;
        long j10 = mh0Var.f;
        long j11 = mh0Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == mh0Var.s) {
                if (mh0Var.o0 && j10 == mh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    l4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == mh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == mh0Var.L) {
                l4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == mh0Var.P) {
                l4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == mh0Var.S) {
                    l4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.r90 r90Var = (org.telegram.ui.Components.r90) view;
            r90Var.setCanEdit(j10 == mh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (mh0Var.o0 && j10 == mh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (mh0Var.d != null) {
                    r90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(mh0Var.c));
                    r90Var.d(0, null, false);
                    r90Var.b(true);
                    return;
                }
                return;
            }
            r90Var.b(!mh0Var.p0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mh0Var.e;
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
            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i13 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.z(f2Var, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.r6.z(f2Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            f2Var.a.l(string, false);
            f2Var.b.setImageDrawable(yqVar);
            f2Var.c = z11;
            return;
        }
        if (i12 != 5) {
            switch (i12) {
                case 9:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    TLRPC.ChatFull chatFull = mh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat = mh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull == null || !chatFull.paid_media_allowed || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                        break;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                    if (i10 != mh0Var.Q) {
                        TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) mh0Var.m0.get(i10 - mh0Var.U);
                        TLRPC.User user2 = (TLRPC.User) mh0Var.k0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                        int i14 = tL_chatAdminWithInvites.invites_count;
                        if (i10 != mh0Var.V - 1) {
                            i11 = i14;
                            user = user2;
                            if (user == null) {
                                a5Var.c(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                                break;
                            }
                        } else {
                            i11 = i14;
                            user = user2;
                        }
                    } else {
                        user = mh0Var.getMessagesController().getUser(Long.valueOf(j10));
                        i11 = mh0Var.f0;
                    }
                    z10 = false;
                    if (user == null) {
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
                    if (i10 == mh0Var.G) {
                        TLRPC.ChatFull chatFull2 = mh0Var.getMessagesController().getChatFull(j11);
                        TLRPC.Chat chat2 = mh0Var.getMessagesController().getChat(Long.valueOf(j11));
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
        int i15 = mh0Var.y;
        if (i10 < i15 || i10 >= mh0Var.E) {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) mh0Var.j0.get(i10 - mh0Var.H);
        } else {
            tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.b10 b10Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        mh0 mh0Var = this.d;
        Context context = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(this.c, mh0Var, null, true, mh0Var.h);
                r90Var.setPermanent(true);
                r90Var.setDelegate(new kh0(this, r90Var));
                view = r90Var;
                break;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.o2) mh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.f2(context, 64, g6Var);
                break;
            case 4:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 5:
                view = new jh0(mh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.b10 b10Var2 = new org.telegram.ui.Components.b10(context, null);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(9);
                b10Var2.w = false;
                b10Var = b10Var2;
                view = b10Var;
                break;
            case 7:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                b10Var = caVar;
                view = b10Var;
                break;
            case 9:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                view = new org.telegram.ui.Cells.a5(8, 6, this.c, null, false);
                break;
            case 11:
                g6Var2 = ((org.telegram.ui.ActionBar.o2) mh0Var).resourceProvider;
                view = new org.telegram.ui.Cells.e9(context, g6Var2);
                break;
            default:
                FrameLayout fh0Var = new fh0(context);
                fh0Var.addView(new eh0(context), w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(mh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                fh0Var.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                fh0Var.setTag(-33024);
                view = fh0Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
