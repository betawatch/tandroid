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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a30 extends vk0 {
    public final Context c;
    public final of.v1 d;
    public y20 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int v;
    public final /* synthetic */ b30 w;

    public a30(b30 b30Var, Context context) {
        this.w = b30Var;
        this.c = context;
        of.v1 v1Var = new of.v1(true);
        this.d = v1Var;
        v1Var.a = new z20(this);
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
        View view = q1Var.a;
        return !((view instanceof org.telegram.ui.Cells.b5) && this.w.b0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        return this.f;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 2;
        }
        if (i9 == this.r) {
            return 3;
        }
        return (i9 == this.v || i9 == this.s) ? 1 : 0;
    }

    @Override // f2.r0
    public final void l() {
        this.f = 1;
        of.v1 v1Var = this.d;
        int size = v1Var.g.size();
        if (size != 0) {
            int i9 = this.f;
            this.s = i9;
            this.f = size + 1 + i9;
        } else {
            this.s = -1;
        }
        int size2 = v1Var.e.size();
        if (size2 != 0) {
            int i10 = this.f;
            this.v = i10;
            this.f = size2 + 1 + i10;
        } else {
            this.v = -1;
        }
        int i11 = this.f;
        this.f = i11 + 1;
        this.r = i11;
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0072  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLObject tLObject;
        boolean z10;
        int i10;
        TLRPC.User user;
        int i11;
        int size;
        String str;
        boolean z11;
        int size2;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 == this.s) {
                v3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            } else {
                if (i9 == this.v) {
                    v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                }
                return;
            }
        }
        int i13 = this.s;
        of.v1 v1Var = this.d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i13 >= 0 && i9 > i13) {
            if (i9 < v1Var.g.size() + i13 + 1) {
                tLObject = (TLObject) v1Var.g.get((i9 - this.s) - 1);
                z10 = tLObject instanceof TLRPC.User;
                b30 b30Var = this.w;
                if (z10) {
                    user = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    i11 = ((org.telegram.ui.ActionBar.f3) b30Var).currentAccount;
                    user = MessagesController.getInstance(i11).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else {
                    if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                        return;
                    }
                    i10 = ((org.telegram.ui.ActionBar.f3) b30Var).currentAccount;
                    user = MessagesController.getInstance(i10).getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String publicUsername = UserObject.getPublicUsername(user);
                size = v1Var.g.size();
                if (size != 0) {
                    int i14 = size + 1;
                    if (i14 > i9) {
                        str = v1Var.n;
                        z11 = true;
                        if (!z11 || publicUsername == null || (size2 = v1Var.e.size()) == 0 || size2 + 1 <= i9) {
                            publicUsername = null;
                        } else {
                            String str2 = v1Var.c;
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
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                                }
                                publicUsername = spannableStringBuilder2;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                        if (str != null) {
                            String userName = UserObject.getUserName(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(userName);
                            int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(userName, str);
                            if (indexOfIgnoreCase2 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false)), indexOfIgnoreCase2, str.length() + indexOfIgnoreCase2, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                        b5Var.setTag(Integer.valueOf(i9));
                        b5Var.setCustomImageVisible(b30Var.b0.contains(Long.valueOf(user.id)));
                        b5Var.b(user, spannableStringBuilder, publicUsername, false);
                    }
                    i9 -= i14;
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                publicUsername = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.b5 b5Var2 = (org.telegram.ui.Cells.b5) view;
                b5Var2.setTag(Integer.valueOf(i9));
                b5Var2.setCustomImageVisible(b30Var.b0.contains(Long.valueOf(user.id)));
                b5Var2.b(user, spannableStringBuilder, publicUsername, false);
            }
        }
        int i15 = this.v;
        if (i15 >= 0 && i9 > i15) {
            if (i9 < v1Var.e.size() + i15 + 1) {
                tLObject = (TLObject) v1Var.e.get((i9 - this.v) - 1);
                z10 = tLObject instanceof TLRPC.User;
                b30 b30Var2 = this.w;
                if (z10) {
                }
                String publicUsername2 = UserObject.getPublicUsername(user);
                size = v1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                publicUsername2 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.b5 b5Var22 = (org.telegram.ui.Cells.b5) view;
                b5Var22.setTag(Integer.valueOf(i9));
                b5Var22.setCustomImageVisible(b30Var2.b0.contains(Long.valueOf(user.id)));
                b5Var22.b(user, spannableStringBuilder, publicUsername2, false);
            }
        }
        tLObject = null;
        z10 = tLObject instanceof TLRPC.User;
        b30 b30Var22 = this.w;
        if (z10) {
        }
        String publicUsername22 = UserObject.getPublicUsername(user);
        size = v1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z11 = false;
        if (z11) {
        }
        publicUsername22 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.b5 b5Var222 = (org.telegram.ui.Cells.b5) view;
        b5Var222.setTag(Integer.valueOf(i9));
        b5Var222.setCustomImageVisible(b30Var22.b0.contains(Long.valueOf(user.id)));
        b5Var222.b(user, spannableStringBuilder, publicUsername22, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        if (i9 != 0) {
            Context context = this.c;
            if (i9 == 1) {
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, null);
                v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jg, false));
                v3Var.setTextColor(org.telegram.ui.ActionBar.f6.Qg);
                view = v3Var;
            } else if (i9 != 2) {
                view = new View(context);
            } else {
                view = new View(context);
                view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lg, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false);
            b5Var.D = w02;
            b5Var.E = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.f6.tg);
            view = b5Var;
        }
        return new ik0(view);
    }
}
