package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class or extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final tf.k1 h;
    public mr n;
    public boolean s;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ pr y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public or(pr prVar, Context context) {
        this.y = prVar;
        this.c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.h = k1Var;
        k1Var.a = new nr(this);
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
        return l1Var.f != 1;
    }

    public final TLObject E(int i10) {
        tf.k1 k1Var = this.h;
        int size = k1Var.g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) k1Var.g.get(i10 - 1);
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
        int size3 = k1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) k1Var.e.get(i10 - 1);
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
        tf.k1 k1Var = this.h;
        pr prVar = this.y;
        k1Var.g(null, prVar.L != 0, false, true, false, ChatObject.isChannel(prVar.r) ? this.y.K : 0L, false, this.y.L, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.y.b.e(true, true);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        mr mrVar = new mr(this, str, 0);
        this.n = mrVar;
        dispatchQueue.postRunnable(mrVar, 300L);
    }

    @Override // f2.o0
    public final int h() {
        return this.r;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return (i10 == this.x || i10 == this.v || i10 == this.w) ? 1 : 0;
    }

    @Override // f2.o0
    public final void l() {
        lh.e1 e1Var;
        this.r = 0;
        tf.k1 k1Var = this.h;
        int size = k1Var.g.size();
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
        int size3 = k1Var.e.size();
        if (size3 != 0) {
            int i11 = this.r;
            this.x = i11;
            this.r = size3 + 1 + i11;
        } else {
            this.x = -1;
        }
        pr prVar = this.y;
        if (prVar.l1 && (e1Var = prVar.c) != null) {
            f2.o0 adapter = e1Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                lh.e1 e1Var2 = prVar.c;
                e1Var2.V1 = true;
                e1Var2.W1 = 0;
                e1Var2.setAdapter(orVar);
                prVar.c.setFastScrollVisible(false);
                prVar.c.setVerticalScrollBarEnabled(true);
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
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        String publicUsername;
        TLObject tLObject;
        int size;
        String str;
        boolean z4;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        String str3;
        int indexOfIgnoreCase;
        int size2;
        int size3;
        int i11;
        String str4;
        int i12 = l1Var.f;
        View view = l1Var.a;
        pr prVar = this.y;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 != this.v) {
                if (i10 == this.x) {
                    u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i10 == this.w) {
                        u3Var.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            int i13 = prVar.L;
            if (i13 == 0) {
                u3Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                return;
            }
            if (i13 == 3) {
                u3Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                return;
            } else if (prVar.v) {
                u3Var.setText(LocaleController.getString(R.string.ChannelSubscribers));
                return;
            } else {
                u3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            }
        }
        TLObject E = E(i10);
        boolean z10 = E instanceof TLRPC.User;
        TLObject tLObject2 = E;
        if (!z10) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                if (peerId >= 0) {
                    TLRPC.User user = prVar.getMessagesController().getUser(Long.valueOf(peerId));
                    tLObject2 = user;
                    if (user != null) {
                        publicUsername = UserObject.getPublicUsername(user);
                        tLObject = user;
                        tf.k1 k1Var = this.h;
                        size = k1Var.g.size();
                        if (size != 0) {
                            int i14 = size + 1;
                            if (i14 > i10) {
                                str = k1Var.n;
                                z4 = true;
                                if (!z4 && (size3 = this.d.size()) != 0) {
                                    i11 = size3 + 1;
                                    if (i11 <= i10) {
                                        CharSequence charSequence = (CharSequence) this.f.get(i10 - 1);
                                        if (charSequence != 0 && !TextUtils.isEmpty(publicUsername)) {
                                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                                spannableStringBuilder = null;
                                                str4 = charSequence;
                                                z4 = true;
                                                str2 = str4;
                                                str3 = str2;
                                                str3 = str2;
                                                if (!z4 && publicUsername != null) {
                                                    size2 = k1Var.e.size();
                                                    str3 = str2;
                                                    if (size2 != 0) {
                                                        str3 = str2;
                                                        if (size2 + 1 > i10) {
                                                            String str5 = k1Var.c;
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
                                                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
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
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
                                                    }
                                                }
                                                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                                                b5Var.setTag(Integer.valueOf(i10));
                                                b5Var.b(tLObject, spannableStringBuilder, str3, false);
                                            }
                                        }
                                        str4 = null;
                                        spannableStringBuilder = charSequence;
                                        z4 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z4) {
                                            size2 = k1Var.e.size();
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
                                        org.telegram.ui.Cells.b5 b5Var2 = (org.telegram.ui.Cells.b5) view;
                                        b5Var2.setTag(Integer.valueOf(i10));
                                        b5Var2.b(tLObject, spannableStringBuilder, str3, false);
                                    }
                                    i10 -= i11;
                                }
                                str2 = null;
                                spannableStringBuilder = null;
                                str3 = str2;
                                str3 = str2;
                                if (!z4) {
                                }
                                if (str != null) {
                                }
                                org.telegram.ui.Cells.b5 b5Var22 = (org.telegram.ui.Cells.b5) view;
                                b5Var22.setTag(Integer.valueOf(i10));
                                b5Var22.b(tLObject, spannableStringBuilder, str3, false);
                            }
                            i10 -= i14;
                        }
                        str = null;
                        z4 = false;
                        if (!z4) {
                            i11 = size3 + 1;
                            if (i11 <= i10) {
                            }
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z4) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.b5 b5Var222 = (org.telegram.ui.Cells.b5) view;
                        b5Var222.setTag(Integer.valueOf(i10));
                        b5Var222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                } else {
                    TLRPC.Chat chat = prVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    tLObject2 = chat;
                    if (chat != null) {
                        publicUsername = ChatObject.getPublicUsername(chat);
                        tLObject = chat;
                        tf.k1 k1Var2 = this.h;
                        size = k1Var2.g.size();
                        if (size != 0) {
                        }
                        str = null;
                        z4 = false;
                        if (!z4) {
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z4) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.b5 b5Var2222 = (org.telegram.ui.Cells.b5) view;
                        b5Var2222.setTag(Integer.valueOf(i10));
                        b5Var2222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                }
            } else if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = prVar.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        publicUsername = null;
        tLObject = tLObject2;
        tf.k1 k1Var22 = this.h;
        size = k1Var22.g.size();
        if (size != 0) {
        }
        str = null;
        z4 = false;
        if (!z4) {
        }
        str2 = null;
        spannableStringBuilder = null;
        str3 = str2;
        str3 = str2;
        if (!z4) {
        }
        if (str != null) {
        }
        org.telegram.ui.Cells.b5 b5Var22222 = (org.telegram.ui.Cells.b5) view;
        b5Var22222.setTag(Integer.valueOf(i10));
        b5Var22222.b(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        pr prVar = this.y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.p2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.c, 26, f6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.c, null, prVar.b1 == 0);
            b5Var.D = true;
            b5Var.setDelegate(new nr(this));
            view = b5Var;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
