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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s30 extends rl0 {
    public final Context c;
    public final tf.k1 d;
    public q30 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int v;
    public final /* synthetic */ t30 w;

    public s30(t30 t30Var, Context context) {
        this.w = t30Var;
        this.c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.d = k1Var;
        k1Var.a = new r30(this);
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
        View view = l1Var.a;
        return !((view instanceof org.telegram.ui.Cells.b5) && this.w.c0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.f;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.r) {
            return 3;
        }
        return (i10 == this.v || i10 == this.s) ? 1 : 0;
    }

    @Override // f2.o0
    public final void l() {
        this.f = 1;
        tf.k1 k1Var = this.d;
        int size = k1Var.g.size();
        if (size != 0) {
            int i10 = this.f;
            this.s = i10;
            this.f = size + 1 + i10;
        } else {
            this.s = -1;
        }
        int size2 = k1Var.e.size();
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
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLObject tLObject;
        boolean z4;
        int i11;
        TLRPC.User user;
        int i12;
        int size;
        String str;
        boolean z10;
        int size2;
        int i13 = l1Var.f;
        View view = l1Var.a;
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
        tf.k1 k1Var = this.d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i14 >= 0 && i10 > i14) {
            if (i10 < k1Var.g.size() + i14 + 1) {
                tLObject = (TLObject) k1Var.g.get((i10 - this.s) - 1);
                z4 = tLObject instanceof TLRPC.User;
                t30 t30Var = this.w;
                if (z4) {
                    user = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    i12 = ((org.telegram.ui.ActionBar.g3) t30Var).currentAccount;
                    user = MessagesController.getInstance(i12).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else {
                    if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                        return;
                    }
                    i11 = ((org.telegram.ui.ActionBar.g3) t30Var).currentAccount;
                    user = MessagesController.getInstance(i11).getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                String publicUsername = UserObject.getPublicUsername(user);
                size = k1Var.g.size();
                if (size != 0) {
                    int i15 = size + 1;
                    if (i15 > i10) {
                        str = k1Var.n;
                        z10 = true;
                        if (!z10 || publicUsername == null || (size2 = k1Var.e.size()) == 0 || size2 + 1 <= i10) {
                            publicUsername = null;
                        } else {
                            String str2 = k1Var.c;
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
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false)), indexOfIgnoreCase2, str.length() + indexOfIgnoreCase2, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                        b5Var.setTag(Integer.valueOf(i10));
                        b5Var.setCustomImageVisible(t30Var.c0.contains(Long.valueOf(user.id)));
                        b5Var.b(user, spannableStringBuilder, publicUsername, false);
                    }
                    i10 -= i15;
                }
                str = null;
                z10 = false;
                if (z10) {
                }
                publicUsername = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.b5 b5Var2 = (org.telegram.ui.Cells.b5) view;
                b5Var2.setTag(Integer.valueOf(i10));
                b5Var2.setCustomImageVisible(t30Var.c0.contains(Long.valueOf(user.id)));
                b5Var2.b(user, spannableStringBuilder, publicUsername, false);
            }
        }
        int i16 = this.v;
        if (i16 >= 0 && i10 > i16) {
            if (i10 < k1Var.e.size() + i16 + 1) {
                tLObject = (TLObject) k1Var.e.get((i10 - this.v) - 1);
                z4 = tLObject instanceof TLRPC.User;
                t30 t30Var2 = this.w;
                if (z4) {
                }
                String publicUsername2 = UserObject.getPublicUsername(user);
                size = k1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z10 = false;
                if (z10) {
                }
                publicUsername2 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.b5 b5Var22 = (org.telegram.ui.Cells.b5) view;
                b5Var22.setTag(Integer.valueOf(i10));
                b5Var22.setCustomImageVisible(t30Var2.c0.contains(Long.valueOf(user.id)));
                b5Var22.b(user, spannableStringBuilder, publicUsername2, false);
            }
        }
        tLObject = null;
        z4 = tLObject instanceof TLRPC.User;
        t30 t30Var22 = this.w;
        if (z4) {
        }
        String publicUsername22 = UserObject.getPublicUsername(user);
        size = k1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z10 = false;
        if (z10) {
        }
        publicUsername22 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.b5 b5Var222 = (org.telegram.ui.Cells.b5) view;
        b5Var222.setTag(Integer.valueOf(i10));
        b5Var222.setCustomImageVisible(t30Var22.c0.contains(Long.valueOf(user.id)));
        b5Var222.b(user, spannableStringBuilder, publicUsername22, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, null);
                u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jg, false));
                u3Var.setTextColor(org.telegram.ui.ActionBar.j6.Qg);
                view = u3Var;
            } else if (i10 != 2) {
                view = new View(context);
            } else {
                view = new View(context);
                view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.c, null, false);
            b5Var.setCustomRightImage(R.drawable.msg_invited);
            b5Var.setNameColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
            b5Var.E = w02;
            b5Var.F = w03;
            b5Var.setDividerColor(org.telegram.ui.ActionBar.j6.tg);
            view = b5Var;
        }
        return new el0(view);
    }
}
