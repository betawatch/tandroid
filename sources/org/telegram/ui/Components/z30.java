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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class z30 extends lm0 {
    public final Context c;
    public final hg.a2 d;
    public x30 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int v;
    public final /* synthetic */ a40 w;

    public z30(a40 a40Var, Context context) {
        this.w = a40Var;
        this.c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.a = new y30(this);
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
        View view = b1Var.a;
        return !((view instanceof org.telegram.ui.Cells.a5) && this.w.f0.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.f;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.r) {
            return 3;
        }
        return (i10 == this.v || i10 == this.s) ? 1 : 0;
    }

    @Override // s4.g0
    public final void l() {
        this.f = 1;
        hg.a2 a2Var = this.d;
        int size = a2Var.g.size();
        if (size != 0) {
            int i10 = this.f;
            this.s = i10;
            this.f = size + 1 + i10;
        } else {
            this.s = -1;
        }
        int size2 = a2Var.e.size();
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        TLObject tLObject;
        boolean z10;
        int i11;
        TLRPC.User user;
        int i12;
        int size;
        String str;
        boolean z11;
        int size2;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == this.s) {
                u3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            } else {
                if (i10 == this.v) {
                    u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                }
                return;
            }
        }
        int i14 = this.s;
        hg.a2 a2Var = this.d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i14 >= 0 && i10 > i14) {
            if (i10 < a2Var.g.size() + i14 + 1) {
                tLObject = (TLObject) a2Var.g.get((i10 - this.s) - 1);
                z10 = tLObject instanceof TLRPC.User;
                a40 a40Var = this.w;
                if (z10) {
                    user = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    i12 = ((org.telegram.ui.ActionBar.h3) a40Var).currentAccount;
                    user = MessagesController.getInstance(i12).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else {
                    if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                        return;
                    }
                    i11 = ((org.telegram.ui.ActionBar.h3) a40Var).currentAccount;
                    user = MessagesController.getInstance(i11).getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String publicUsername = UserObject.getPublicUsername(user);
                size = a2Var.g.size();
                if (size != 0) {
                    int i15 = size + 1;
                    if (i15 > i10) {
                        str = a2Var.n;
                        z11 = true;
                        if (!z11 || publicUsername == null || (size2 = a2Var.e.size()) == 0 || size2 + 1 <= i10) {
                            publicUsername = null;
                        } else {
                            String str2 = a2Var.c;
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
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.pg, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                                }
                                publicUsername = spannableStringBuilder2;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        if (str != null) {
                            String userName = UserObject.getUserName(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(userName);
                            int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(userName, str);
                            if (indexOfIgnoreCase2 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.pg, false)), indexOfIgnoreCase2, str.length() + indexOfIgnoreCase2, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                        a5Var.setTag(Integer.valueOf(i10));
                        a5Var.setCustomImageVisible(a40Var.f0.contains(Long.valueOf(user.id)));
                        a5Var.c(user, spannableStringBuilder, publicUsername, false);
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
                org.telegram.ui.Cells.a5 a5Var2 = (org.telegram.ui.Cells.a5) view;
                a5Var2.setTag(Integer.valueOf(i10));
                a5Var2.setCustomImageVisible(a40Var.f0.contains(Long.valueOf(user.id)));
                a5Var2.c(user, spannableStringBuilder, publicUsername, false);
            }
        }
        int i16 = this.v;
        if (i16 >= 0 && i10 > i16) {
            if (i10 < a2Var.e.size() + i16 + 1) {
                tLObject = (TLObject) a2Var.e.get((i10 - this.v) - 1);
                z10 = tLObject instanceof TLRPC.User;
                a40 a40Var2 = this.w;
                if (z10) {
                }
                String publicUsername2 = UserObject.getPublicUsername(user);
                size = a2Var.g.size();
                if (size != 0) {
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                publicUsername2 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.a5 a5Var22 = (org.telegram.ui.Cells.a5) view;
                a5Var22.setTag(Integer.valueOf(i10));
                a5Var22.setCustomImageVisible(a40Var2.f0.contains(Long.valueOf(user.id)));
                a5Var22.c(user, spannableStringBuilder, publicUsername2, false);
            }
        }
        tLObject = null;
        z10 = tLObject instanceof TLRPC.User;
        a40 a40Var22 = this.w;
        if (z10) {
        }
        String publicUsername22 = UserObject.getPublicUsername(user);
        size = a2Var.g.size();
        if (size != 0) {
        }
        str = null;
        z11 = false;
        if (z11) {
        }
        publicUsername22 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.a5 a5Var222 = (org.telegram.ui.Cells.a5) view;
        a5Var222.setTag(Integer.valueOf(i10));
        a5Var222.setCustomImageVisible(a40Var22.f0.contains(Long.valueOf(user.id)));
        a5Var222.c(user, spannableStringBuilder, publicUsername22, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, org.telegram.ui.Cells.u3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.jg, u3Var, null);
                u3Var.setTextColor(org.telegram.ui.ActionBar.k6.Qg);
                a5Var = u3Var;
            } else if (i10 != 2) {
                a5Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                a5Var = view;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(2, 2, this.c, null, false);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ng, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.pg, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.tg);
            a5Var = a5Var2;
        }
        return new wl0(a5Var);
    }
}
