// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bk6 extends c79 {
    public final Context c;
    public final /* synthetic */ ck6 d;

    public bk6(ck6 ck6Var, Context context) {
        this.d = ck6Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        ck6 ck6Var = this.d;
        if (ck6Var.R == b || ck6Var.y == b) {
            return true;
        }
        if (b >= ck6Var.E && b < ck6Var.F) {
            return true;
        }
        if ((b < ck6Var.I || b >= ck6Var.J) && b != ck6Var.O) {
            return b >= ck6Var.V && b < ck6Var.W;
        }
        return true;
    }

    @Override // j79
    public final int b() {
        return this.d.Y;
    }

    @Override // j79
    public final int d(int i) {
        ck6 ck6Var = this.d;
        if (i == ck6Var.r) {
            return 0;
        }
        if (i == ck6Var.s || i == ck6Var.M || i == ck6Var.T || i == ck6Var.Q) {
            return 1;
        }
        if (i == ck6Var.w) {
            return 2;
        }
        if (i == ck6Var.y) {
            return 3;
        }
        if (i == ck6Var.x || i == ck6Var.K || i == ck6Var.N || i == ck6Var.S || i == ck6Var.U) {
            return 4;
        }
        if (i >= ck6Var.E && i < ck6Var.F) {
            return 5;
        }
        if (i >= ck6Var.I && i < ck6Var.J) {
            return 5;
        }
        if (i == ck6Var.G) {
            return 6;
        }
        if (i == ck6Var.L) {
            return 7;
        }
        if (i == ck6Var.O) {
            return 8;
        }
        if (i == ck6Var.P) {
            return 9;
        }
        if (i == ck6Var.R) {
            return 10;
        }
        if (i < ck6Var.V || i >= ck6Var.W) {
            return i == ck6Var.H ? 11 : 1;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r15 == (r0.F - 1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (r15 == (r0.J - 1)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i2;
        TLRPC.User user;
        ck6 ck6Var = this.d;
        ArrayList arrayList = ck6Var.j0;
        long j = ck6Var.f;
        long j2 = ck6Var.n;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        if (i3 == 1) {
            mf5 mf5Var = (mf5) view;
            if (i == ck6Var.s) {
                if (ck6Var.p0 && j == yac.h(ck6Var.getAccountInstance().a).n) {
                    mf5Var.setText(ob6.M0(2131746318, null));
                    return;
                } else if (j == yac.h(ck6Var.getAccountInstance().a).n) {
                    mf5Var.setText(ob6.M0(2131752375, null));
                    return;
                } else {
                    mf5Var.setText(ob6.M0(2131747047, null));
                    return;
                }
            }
            if (i == ck6Var.M) {
                mf5Var.setText(ob6.M0(2131745740, null));
                return;
            } else if (i == ck6Var.Q) {
                mf5Var.setText(ob6.M0(2131748634, null));
                return;
            } else {
                if (i == ck6Var.T) {
                    mf5Var.setText(ob6.M0(2131748635, null));
                    return;
                }
                return;
            }
        }
        if (i3 == 2) {
            i56 i56Var = (i56) view;
            i56Var.setCanEdit(j == yac.h(ck6Var.getAccountInstance().a).n);
            if (ck6Var.p0 && j == yac.h(ck6Var.getAccountInstance().a).n) {
                if (ck6Var.d != null) {
                    i56Var.setLink("https://t.me/" + xc2.K(ck6Var.c, false));
                    i56Var.d(0, null, false);
                    i56Var.b(true);
                    return;
                }
                return;
            }
            i56Var.b(!ck6Var.q0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ck6Var.e;
            if (tL_chatInviteExported2 != null) {
                i56Var.setLink(tL_chatInviteExported2.link);
                i56Var.c(tL_chatInviteExported2, j2);
                return;
            } else {
                i56Var.setLink(null);
                i56Var.d(0, null, false);
                return;
            }
        }
        if (i3 == 3) {
            f23 f23Var = (f23) view;
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i4 = aob.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.x(f23Var, drawable, i4, null, mode);
            yob.x(f23Var, drawable2, aob.k7, null, mode);
            zm2 zm2Var = new zm2(drawable, drawable2);
            String M0 = ob6.M0(2131751678, null);
            boolean z2 = !arrayList.isEmpty();
            f23Var.a.l(M0, false);
            f23Var.b.setImageDrawable(zm2Var);
            f23Var.c = z2;
            return;
        }
        if (i3 == 5) {
            int i5 = ck6Var.E;
            if (i < i5 || i >= ck6Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) ck6Var.k0.get(i - ck6Var.I);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i - i5);
            }
            zj6 zj6Var = (zj6) view;
            zj6Var.b(tL_chatInviteExported, i - ck6Var.E);
            zj6Var.I = z;
            return;
        }
        switch (i3) {
            case 9:
                ilb ilbVar = (ilb) view;
                TLRPC.ChatFull N0 = ck6Var.getMessagesController().N0(j2);
                TLRPC.Chat M02 = ck6Var.getMessagesController().M0(Long.valueOf(j2));
                if (N0 == null || !N0.paid_media_allowed || !xc2.V(M02)) {
                    ilbVar.setText(ob6.M0(2131752356, null));
                    break;
                } else {
                    ilbVar.setText(ob6.M0(2131752355, null));
                    break;
                }
                break;
            case 10:
                lj6 lj6Var = (lj6) view;
                if (i != ck6Var.R) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) ck6Var.n0.get(i - ck6Var.V);
                    TLRPC.User user2 = (TLRPC.User) ck6Var.l0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                    int i6 = tL_chatAdminWithInvites.invites_count;
                    if (i != ck6Var.W - 1) {
                        i2 = i6;
                        user = user2;
                        if (user == null) {
                            lj6Var.c(user, lv2.m(0, user.first_name, user.last_name), ob6.G(i2, "InviteLinkCount", new Object[0]), z);
                            break;
                        }
                    } else {
                        i2 = i6;
                        user = user2;
                    }
                } else {
                    user = ck6Var.getMessagesController().X1(Long.valueOf(j));
                    i2 = ck6Var.g0;
                }
                z = false;
                if (user == null) {
                }
                break;
            case 11:
                ilb ilbVar2 = (ilb) view;
                if (i == ck6Var.H) {
                    TLRPC.ChatFull N02 = ck6Var.getMessagesController().N0(j2);
                    TLRPC.Chat M03 = ck6Var.getMessagesController().M0(Long.valueOf(j2));
                    if (N02 == null || !N02.paid_media_allowed || !xc2.V(M03)) {
                        ilbVar2.setText(ob6.M0(2131752356, null));
                        break;
                    } else {
                        ilbVar2.setText(ob6.M0(2131752355, null));
                        break;
                    }
                }
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        vnb vnbVar;
        vnb vnbVar2;
        ck6 ck6Var = this.d;
        Context context = this.c;
        switch (i) {
            case 1:
                view = new mf5(context, 23);
                break;
            case 2:
                i56 i56Var = new i56(this.c, ck6Var, null, true, ck6Var.h);
                i56Var.setPermanent(true);
                i56Var.setDelegate(new ak6(this, i56Var));
                view = i56Var;
                break;
            case 3:
                vnbVar = ((e) ck6Var).resourceProvider;
                view = new f23(64, vnbVar, context);
                break;
            case 4:
                view = new rca(context, (uh9) null);
                break;
            case 5:
                view = new zj6(ck6Var, context);
                break;
            case 6:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(9);
                tk4Var.x = false;
                view = tk4Var;
                break;
            case 7:
                view = new rca(context, (uh9) null);
                break;
            case 8:
                qmb qmbVar = new qmb(context);
                qmbVar.b(ob6.M0(2131751540, null), false);
                yob.X(qmbVar.getTextView(), aob.p7, null);
                view = qmbVar;
                break;
            case 9:
                view = new ilb(context);
                break;
            case 10:
                view = new lj6(this.c, 8, 6, false, null);
                break;
            case 11:
                vnbVar2 = ((e) ck6Var).resourceProvider;
                view = new ilb(context, vnbVar2);
                break;
            default:
                FrameLayout b6Var = new b6(context, (byte) 20);
                b6Var.addView(new vj6(context), tre.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                yob.X(textView, aob.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(ob6.M0(ck6Var.h ? 2131746599 : 2131746600, null));
                b6Var.addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                b6Var.setTag(-33024);
                view = b6Var;
                break;
        }
        return qu6.h(view, view, -1, -2);
    }
}
