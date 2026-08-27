package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f30 extends yk0 {
    public final Context c;
    public final pf.j1 d;
    public d30 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int v;
    public final /* synthetic */ g30 w;

    public f30(g30 g30Var, Context context) {
        this.w = g30Var;
        this.c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.d = j1Var;
        j1Var.a = new e30(this);
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
        View view = o1Var.a;
        return !((view instanceof org.telegram.ui.Cells.y4) && this.w.b0.contains(Long.valueOf(((org.telegram.ui.Cells.y4) view).getUserId()))) && o1Var.f == 0;
    }

    @Override // f2.q0
    public final int h() {
        return this.f;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.r) {
            return 3;
        }
        return (i10 == this.v || i10 == this.s) ? 1 : 0;
    }

    @Override // f2.q0
    public final void l() {
        this.f = 1;
        pf.j1 j1Var = this.d;
        int size = j1Var.g.size();
        if (size != 0) {
            int i10 = this.f;
            this.s = i10;
            this.f = size + 1 + i10;
        } else {
            this.s = -1;
        }
        int size2 = j1Var.e.size();
        if (size2 != 0) {
            int i11 = this.f;
            this.v = i11;
            this.f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f;
        this.f = i12 + 1;
        this.r = i12;
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0072  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        TLObject tLObject;
        boolean z10;
        int i11;
        TLRPC.User user;
        int i12;
        int size;
        String str;
        boolean z11;
        int size2;
        int i13 = o1Var.f;
        View view = o1Var.a;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == this.s) {
                s3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            } else {
                if (i10 == this.v) {
                    s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                }
                return;
            }
        }
        int i14 = this.s;
        pf.j1 j1Var = this.d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i14 >= 0 && i10 > i14) {
            if (i10 < j1Var.g.size() + i14 + 1) {
                tLObject = (TLObject) j1Var.g.get((i10 - this.s) - 1);
                z10 = tLObject instanceof TLRPC.User;
                g30 g30Var = this.w;
                if (z10) {
                    user = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    i12 = ((org.telegram.ui.ActionBar.e3) g30Var).currentAccount;
                    user = MessagesController.getInstance(i12).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else {
                    if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                        return;
                    }
                    i11 = ((org.telegram.ui.ActionBar.e3) g30Var).currentAccount;
                    user = MessagesController.getInstance(i11).getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String publicUsername = UserObject.getPublicUsername(user);
                size = j1Var.g.size();
                if (size != 0) {
                    int i15 = size + 1;
                    if (i15 > i10) {
                        str = j1Var.n;
                        z11 = true;
                        if (!z11 || publicUsername == null || (size2 = j1Var.e.size()) == 0 || size2 + 1 <= i10) {
                            publicUsername = null;
                        } else {
                            String str2 = j1Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) publicUsername);
                                int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str2);
                                if (indexOfIgnoreCase != -1) {
                                    int length = str2.length();
                                    if (indexOfIgnoreCase == 0) {
                                        length++;
                                    } else {
                                        indexOfIgnoreCase++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                                }
                                publicUsername = spannableStringBuilder2;
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                        if (str != null) {
                            String userName = UserObject.getUserName(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(userName);
                            int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(userName, str);
                            if (indexOfIgnoreCase2 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false)), indexOfIgnoreCase2, str.length() + indexOfIgnoreCase2, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                        y4Var.setTag(Integer.valueOf(i10));
                        y4Var.setCustomImageVisible(g30Var.b0.contains(Long.valueOf(user.id)));
                        y4Var.b(user, spannableStringBuilder, publicUsername, false);
                    }
                    i10 -= i15;
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                publicUsername = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.y4 y4Var2 = (org.telegram.ui.Cells.y4) view;
                y4Var2.setTag(Integer.valueOf(i10));
                y4Var2.setCustomImageVisible(g30Var.b0.contains(Long.valueOf(user.id)));
                y4Var2.b(user, spannableStringBuilder, publicUsername, false);
            }
        }
        int i16 = this.v;
        if (i16 >= 0 && i10 > i16) {
            if (i10 < j1Var.e.size() + i16 + 1) {
                tLObject = (TLObject) j1Var.e.get((i10 - this.v) - 1);
                z10 = tLObject instanceof TLRPC.User;
                g30 g30Var2 = this.w;
                if (z10) {
                }
                String publicUsername2 = UserObject.getPublicUsername(user);
                size = j1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                publicUsername2 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.y4 y4Var22 = (org.telegram.ui.Cells.y4) view;
                y4Var22.setTag(Integer.valueOf(i10));
                y4Var22.setCustomImageVisible(g30Var2.b0.contains(Long.valueOf(user.id)));
                y4Var22.b(user, spannableStringBuilder, publicUsername2, false);
            }
        }
        tLObject = null;
        z10 = tLObject instanceof TLRPC.User;
        g30 g30Var22 = this.w;
        if (z10) {
        }
        String publicUsername22 = UserObject.getPublicUsername(user);
        size = j1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z11 = false;
        if (z11) {
        }
        publicUsername22 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.y4 y4Var222 = (org.telegram.ui.Cells.y4) view;
        y4Var222.setTag(Integer.valueOf(i10));
        y4Var222.setCustomImageVisible(g30Var22.b0.contains(Long.valueOf(user.id)));
        y4Var222.b(user, spannableStringBuilder, publicUsername22, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, null);
                s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jg, false));
                s3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                view = s3Var;
            } else if (i10 != 2) {
                view = new View(context);
            } else {
                view = new View(context);
                view.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            }
        } else {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(2, 2, this.c, null, false);
            y4Var.setCustomRightImage(R.drawable.msg_invited);
            y4Var.setNameColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lg, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false);
            y4Var.D = w02;
            y4Var.E = w03;
            y4Var.setDividerColor(org.telegram.ui.ActionBar.g6.tg);
            view = y4Var;
        }
        return new lk0(view);
    }
}
