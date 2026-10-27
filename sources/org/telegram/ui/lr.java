package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lr extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final ig.a2 h;
    public jr n;
    public boolean s;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ mr y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public lr(mr mrVar, Context context) {
        this.y = mrVar;
        this.c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.h = a2Var;
        a2Var.a = new kr(this);
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
        return e1Var.f != 1;
    }

    public final TLObject E(int i10) {
        ig.a2 a2Var = this.h;
        int size = a2Var.g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.g.get(i10 - 1);
            }
            i10 -= i11;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i12 = size2 + 1;
            if (i12 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i10 - 1);
            }
            i10 -= i12;
        }
        int size3 = a2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) a2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        if (this.n != null) {
            Utilities.searchQueue.cancelRunnable(this.n);
            this.n = null;
        }
        this.d.clear();
        this.e.b();
        this.f.clear();
        this.h.f(null, null);
        ig.a2 a2Var = this.h;
        mr mrVar = this.y;
        a2Var.g(null, mrVar.N != 0, false, true, false, ChatObject.isChannel(mrVar.n) ? this.y.M : 0L, false, this.y.N, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.y.b.e(true, true);
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        jr jrVar = new jr(this, str, 0);
        this.n = jrVar;
        dispatchQueue2.postRunnable(jrVar, 300L);
    }

    @Override // s4.h0
    public final int h() {
        return this.r;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return (i10 == this.x || i10 == this.v || i10 == this.w) ? 1 : 0;
    }

    @Override // s4.h0
    public final void l() {
        bi.r1 r1Var;
        this.r = 0;
        ig.a2 a2Var = this.h;
        int size = a2Var.g.size();
        if (size != 0) {
            this.v = 0;
            this.r = size + 1 + this.r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.r;
            this.w = i10;
            this.r = size2 + 1 + i10;
        } else {
            this.w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.r;
            this.x = i11;
            this.r = size3 + 1 + i11;
        } else {
            this.x = -1;
        }
        mr mrVar = this.y;
        if (mrVar.n1 && (r1Var = mrVar.c) != null) {
            s4.h0 adapter = r1Var.getAdapter();
            lr lrVar = mrVar.e;
            if (adapter != lrVar) {
                bi.r1 r1Var2 = mrVar.c;
                r1Var2.W1 = true;
                r1Var2.X1 = 0;
                r1Var2.setAdapter(lrVar);
                mrVar.c.setFastScrollVisible(false);
                mrVar.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        String publicUsername;
        TLObject tLObject;
        int size;
        String str;
        boolean z10;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        String str3;
        int indexOfIgnoreCase;
        int size2;
        int size3;
        int i11;
        String str4;
        int i12 = e1Var.f;
        View view = e1Var.a;
        mr mrVar = this.y;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 != this.v) {
                if (i10 == this.x) {
                    z3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i10 == this.w) {
                        z3Var.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            int i13 = mrVar.N;
            if (i13 == 0) {
                z3Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                return;
            }
            if (i13 == 3) {
                z3Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                return;
            } else if (mrVar.s) {
                z3Var.setText(LocaleController.getString(R.string.ChannelSubscribers));
                return;
            } else {
                z3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            }
        }
        TLObject E = E(i10);
        boolean z11 = E instanceof TLRPC.User;
        TLObject tLObject2 = E;
        if (!z11) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                if (peerId >= 0) {
                    TLRPC.User user = mrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    tLObject2 = user;
                    if (user != null) {
                        publicUsername = UserObject.getPublicUsername(user);
                        tLObject = user;
                        ig.a2 a2Var = this.h;
                        size = a2Var.g.size();
                        if (size != 0) {
                            int i14 = size + 1;
                            if (i14 > i10) {
                                str = a2Var.n;
                                z10 = true;
                                if (!z10 && (size3 = this.d.size()) != 0) {
                                    i11 = size3 + 1;
                                    if (i11 <= i10) {
                                        CharSequence charSequence = (CharSequence) this.f.get(i10 - 1);
                                        if (charSequence != 0 && !TextUtils.isEmpty(publicUsername)) {
                                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                                spannableStringBuilder = null;
                                                str4 = charSequence;
                                                z10 = true;
                                                str2 = str4;
                                                str3 = str2;
                                                str3 = str2;
                                                if (!z10 && publicUsername != null) {
                                                    size2 = a2Var.e.size();
                                                    str3 = str2;
                                                    if (size2 != 0) {
                                                        str3 = str2;
                                                        if (size2 + 1 > i10) {
                                                            String str5 = a2Var.c;
                                                            if (str5.startsWith("@")) {
                                                                str5 = str5.substring(1);
                                                            }
                                                            try {
                                                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                                spannableStringBuilder2.append((CharSequence) "@");
                                                                spannableStringBuilder2.append((CharSequence) publicUsername);
                                                                int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, str5);
                                                                str3 = spannableStringBuilder2;
                                                                if (indexOfIgnoreCase2 != -1) {
                                                                    int length = str5.length();
                                                                    if (indexOfIgnoreCase2 == 0) {
                                                                        length++;
                                                                    } else {
                                                                        indexOfIgnoreCase2++;
                                                                    }
                                                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.q6, null), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                                                    str3 = spannableStringBuilder2;
                                                                }
                                                            } catch (Exception e) {
                                                                FileLog.e(e);
                                                                str3 = publicUsername;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (str != null && publicUsername != null) {
                                                    spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                                    indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                                    if (indexOfIgnoreCase != -1) {
                                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.q6, null), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
                                                    }
                                                }
                                                org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
                                                f5Var.setTag(Integer.valueOf(i10));
                                                f5Var.c(tLObject, spannableStringBuilder, str3, false);
                                            }
                                        }
                                        str4 = null;
                                        spannableStringBuilder = charSequence;
                                        z10 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z10) {
                                            size2 = a2Var.e.size();
                                            str3 = str2;
                                            if (size2 != 0) {
                                            }
                                        }
                                        if (str != null) {
                                            spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                            if (indexOfIgnoreCase != -1) {
                                            }
                                        }
                                        org.telegram.ui.Cells.f5 f5Var2 = (org.telegram.ui.Cells.f5) view;
                                        f5Var2.setTag(Integer.valueOf(i10));
                                        f5Var2.c(tLObject, spannableStringBuilder, str3, false);
                                    }
                                    i10 -= i11;
                                }
                                str2 = null;
                                spannableStringBuilder = null;
                                str3 = str2;
                                str3 = str2;
                                if (!z10) {
                                }
                                if (str != null) {
                                }
                                org.telegram.ui.Cells.f5 f5Var22 = (org.telegram.ui.Cells.f5) view;
                                f5Var22.setTag(Integer.valueOf(i10));
                                f5Var22.c(tLObject, spannableStringBuilder, str3, false);
                            }
                            i10 -= i14;
                        }
                        str = null;
                        z10 = false;
                        if (!z10) {
                            i11 = size3 + 1;
                            if (i11 <= i10) {
                            }
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z10) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.f5 f5Var222 = (org.telegram.ui.Cells.f5) view;
                        f5Var222.setTag(Integer.valueOf(i10));
                        f5Var222.c(tLObject, spannableStringBuilder, str3, false);
                    }
                } else {
                    TLRPC.Chat chat = mrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    tLObject2 = chat;
                    if (chat != null) {
                        publicUsername = ChatObject.getPublicUsername(chat);
                        tLObject = chat;
                        ig.a2 a2Var2 = this.h;
                        size = a2Var2.g.size();
                        if (size != 0) {
                        }
                        str = null;
                        z10 = false;
                        if (!z10) {
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z10) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.f5 f5Var2222 = (org.telegram.ui.Cells.f5) view;
                        f5Var2222.setTag(Integer.valueOf(i10));
                        f5Var2222.c(tLObject, spannableStringBuilder, str3, false);
                    }
                }
            } else if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = mrVar.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        publicUsername = null;
        tLObject = tLObject2;
        ig.a2 a2Var22 = this.h;
        size = a2Var22.g.size();
        if (size != 0) {
        }
        str = null;
        z10 = false;
        if (!z10) {
        }
        str2 = null;
        spannableStringBuilder = null;
        str3 = str2;
        str3 = str2;
        if (!z10) {
        }
        if (str != null) {
        }
        org.telegram.ui.Cells.f5 f5Var22222 = (org.telegram.ui.Cells.f5) view;
        f5Var22222.setTag(Integer.valueOf(i10));
        f5Var22222.c(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        mr mrVar = this.y;
        if (i10 != 0) {
            u6Var = ((org.telegram.ui.ActionBar.r2) mrVar).resourceProvider;
            view = new org.telegram.ui.Cells.z3(this.c, 26, u6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(2, 2, this.c, null, mrVar.d1 == 0);
            f5Var.G = true;
            f5Var.setDelegate(new kr(this));
            view = f5Var;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
