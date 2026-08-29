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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ir extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final rf.k1 h;
    public gr n;
    public boolean s;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ jr y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public ir(jr jrVar, Context context) {
        this.y = jrVar;
        this.c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.h = k1Var;
        k1Var.a = new hr(this);
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f != 1;
    }

    public final TLObject E(int i10) {
        rf.k1 k1Var = this.h;
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
        rf.k1 k1Var = this.h;
        jr jrVar = this.y;
        k1Var.g(null, jrVar.K != 0, false, true, false, ChatObject.isChannel(jrVar.r) ? this.y.J : 0L, false, this.y.K, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.y.b.e(true, true);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        gr grVar = new gr(this, str, 0);
        this.n = grVar;
        dispatchQueue.postRunnable(grVar, 300L);
    }

    @Override // f2.p0
    public final int h() {
        return this.r;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return (i10 == this.x || i10 == this.v || i10 == this.w) ? 1 : 0;
    }

    @Override // f2.p0
    public final void l() {
        jh.e1 e1Var;
        this.r = 0;
        rf.k1 k1Var = this.h;
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
        jr jrVar = this.y;
        if (jrVar.k1 && (e1Var = jrVar.c) != null) {
            f2.p0 adapter = e1Var.getAdapter();
            ir irVar = jrVar.e;
            if (adapter != irVar) {
                jh.e1 e1Var2 = jrVar.c;
                e1Var2.U1 = true;
                e1Var2.V1 = 0;
                e1Var2.setAdapter(irVar);
                jrVar.c.setFastScrollVisible(false);
                jrVar.c.setVerticalScrollBarEnabled(true);
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
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
        int i12 = n1Var.f;
        View view = n1Var.a;
        jr jrVar = this.y;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 != this.v) {
                if (i10 == this.x) {
                    s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i10 == this.w) {
                        s3Var.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            int i13 = jrVar.K;
            if (i13 == 0) {
                s3Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                return;
            }
            if (i13 == 3) {
                s3Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                return;
            } else if (jrVar.v) {
                s3Var.setText(LocaleController.getString(R.string.ChannelSubscribers));
                return;
            } else {
                s3Var.setText(LocaleController.getString(R.string.ChannelMembers));
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
                    TLRPC.User user = jrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    tLObject2 = user;
                    if (user != null) {
                        publicUsername = UserObject.getPublicUsername(user);
                        tLObject = user;
                        rf.k1 k1Var = this.h;
                        size = k1Var.g.size();
                        if (size != 0) {
                            int i14 = size + 1;
                            if (i14 > i10) {
                                str = k1Var.n;
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
                                                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                                                    str3 = spannableStringBuilder2;
                                                                }
                                                            } catch (Exception e10) {
                                                                FileLog.e(e10);
                                                                str3 = publicUsername;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (str != null && publicUsername != null) {
                                                    spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                                    indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                                    if (indexOfIgnoreCase != -1) {
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
                                                    }
                                                }
                                                org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
                                                z4Var.setTag(Integer.valueOf(i10));
                                                z4Var.b(tLObject, spannableStringBuilder, str3, false);
                                            }
                                        }
                                        str4 = null;
                                        spannableStringBuilder = charSequence;
                                        z10 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z10) {
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
                                        org.telegram.ui.Cells.z4 z4Var2 = (org.telegram.ui.Cells.z4) view;
                                        z4Var2.setTag(Integer.valueOf(i10));
                                        z4Var2.b(tLObject, spannableStringBuilder, str3, false);
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
                                org.telegram.ui.Cells.z4 z4Var22 = (org.telegram.ui.Cells.z4) view;
                                z4Var22.setTag(Integer.valueOf(i10));
                                z4Var22.b(tLObject, spannableStringBuilder, str3, false);
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
                        org.telegram.ui.Cells.z4 z4Var222 = (org.telegram.ui.Cells.z4) view;
                        z4Var222.setTag(Integer.valueOf(i10));
                        z4Var222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                } else {
                    TLRPC.Chat chat = jrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    tLObject2 = chat;
                    if (chat != null) {
                        publicUsername = ChatObject.getPublicUsername(chat);
                        tLObject = chat;
                        rf.k1 k1Var2 = this.h;
                        size = k1Var2.g.size();
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
                        org.telegram.ui.Cells.z4 z4Var2222 = (org.telegram.ui.Cells.z4) view;
                        z4Var2222.setTag(Integer.valueOf(i10));
                        z4Var2222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                }
            } else if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = jrVar.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        publicUsername = null;
        tLObject = tLObject2;
        rf.k1 k1Var22 = this.h;
        size = k1Var22.g.size();
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
        org.telegram.ui.Cells.z4 z4Var22222 = (org.telegram.ui.Cells.z4) view;
        z4Var22222.setTag(Integer.valueOf(i10));
        z4Var22222.b(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        jr jrVar = this.y;
        if (i10 != 0) {
            c6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
            view = new org.telegram.ui.Cells.s3(this.c, 26, c6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(2, 2, this.c, null, jrVar.a1 == 0);
            z4Var.C = true;
            z4Var.setDelegate(new hr(this));
            view = z4Var;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
