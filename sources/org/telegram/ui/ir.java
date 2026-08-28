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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ir extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final of.v1 h;
    public fr n;
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
        of.v1 v1Var = new of.v1(true);
        this.h = v1Var;
        v1Var.a = new gr(this);
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
        return q1Var.f != 1;
    }

    public final TLObject E(int i9) {
        of.v1 v1Var = this.h;
        int size = v1Var.g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i9) {
                if (i9 == 0) {
                    return null;
                }
                return (TLObject) v1Var.g.get(i9 - 1);
            }
            i9 -= i10;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i11 = size2 + 1;
            if (i11 > i9) {
                if (i9 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i9 - 1);
            }
            i9 -= i11;
        }
        int size3 = v1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i9 || i9 == 0) {
            return null;
        }
        return (TLObject) v1Var.e.get(i9 - 1);
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
        of.v1 v1Var = this.h;
        jr jrVar = this.y;
        v1Var.g(null, jrVar.K != 0, false, true, false, ChatObject.isChannel(jrVar.r) ? this.y.J : 0L, false, this.y.K, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.y.b.e(true, true);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        fr frVar = new fr(this, str, 0);
        this.n = frVar;
        dispatchQueue.postRunnable(frVar, 300L);
    }

    @Override // f2.r0
    public final int h() {
        return this.r;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return (i9 == this.x || i9 == this.v || i9 == this.w) ? 1 : 0;
    }

    @Override // f2.r0
    public final void l() {
        gh.f1 f1Var;
        this.r = 0;
        of.v1 v1Var = this.h;
        int size = v1Var.g.size();
        if (size != 0) {
            this.v = 0;
            this.r = size + 1 + this.r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i9 = this.r;
            this.w = i9;
            this.r = size2 + 1 + i9;
        } else {
            this.w = -1;
        }
        int size3 = v1Var.e.size();
        if (size3 != 0) {
            int i10 = this.r;
            this.x = i10;
            this.r = size3 + 1 + i10;
        } else {
            this.x = -1;
        }
        jr jrVar = this.y;
        if (jrVar.k1 && (f1Var = jrVar.c) != null) {
            f2.r0 adapter = f1Var.getAdapter();
            ir irVar = jrVar.e;
            if (adapter != irVar) {
                gh.f1 f1Var2 = jrVar.c;
                f1Var2.U1 = true;
                f1Var2.V1 = 0;
                f1Var2.setAdapter(irVar);
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
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
        int i10;
        String str4;
        int i11 = q1Var.f;
        View view = q1Var.a;
        jr jrVar = this.y;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 != this.v) {
                if (i9 == this.x) {
                    v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i9 == this.w) {
                        v3Var.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            int i12 = jrVar.K;
            if (i12 == 0) {
                v3Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                return;
            }
            if (i12 == 3) {
                v3Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                return;
            } else if (jrVar.v) {
                v3Var.setText(LocaleController.getString(R.string.ChannelSubscribers));
                return;
            } else {
                v3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            }
        }
        TLObject E = E(i9);
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
                        of.v1 v1Var = this.h;
                        size = v1Var.g.size();
                        if (size != 0) {
                            int i13 = size + 1;
                            if (i13 > i9) {
                                str = v1Var.n;
                                z10 = true;
                                if (!z10 && (size3 = this.d.size()) != 0) {
                                    i10 = size3 + 1;
                                    if (i10 <= i9) {
                                        CharSequence charSequence = (CharSequence) this.f.get(i9 - 1);
                                        if (charSequence != 0 && !TextUtils.isEmpty(publicUsername)) {
                                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                                spannableStringBuilder = null;
                                                str4 = charSequence;
                                                z10 = true;
                                                str2 = str4;
                                                str3 = str2;
                                                str3 = str2;
                                                if (!z10 && publicUsername != null) {
                                                    size2 = v1Var.e.size();
                                                    str3 = str2;
                                                    if (size2 != 0) {
                                                        str3 = str2;
                                                        if (size2 + 1 > i9) {
                                                            String str5 = v1Var.c;
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
                                                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false)), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
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
                                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
                                                    }
                                                }
                                                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                                                b5Var.setTag(Integer.valueOf(i9));
                                                b5Var.b(tLObject, spannableStringBuilder, str3, false);
                                            }
                                        }
                                        str4 = null;
                                        spannableStringBuilder = charSequence;
                                        z10 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z10) {
                                            size2 = v1Var.e.size();
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
                                        b5Var2.setTag(Integer.valueOf(i9));
                                        b5Var2.b(tLObject, spannableStringBuilder, str3, false);
                                    }
                                    i9 -= i10;
                                }
                                str2 = null;
                                spannableStringBuilder = null;
                                str3 = str2;
                                str3 = str2;
                                if (!z10) {
                                }
                                if (str != null) {
                                }
                                org.telegram.ui.Cells.b5 b5Var22 = (org.telegram.ui.Cells.b5) view;
                                b5Var22.setTag(Integer.valueOf(i9));
                                b5Var22.b(tLObject, spannableStringBuilder, str3, false);
                            }
                            i9 -= i13;
                        }
                        str = null;
                        z10 = false;
                        if (!z10) {
                            i10 = size3 + 1;
                            if (i10 <= i9) {
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
                        org.telegram.ui.Cells.b5 b5Var222 = (org.telegram.ui.Cells.b5) view;
                        b5Var222.setTag(Integer.valueOf(i9));
                        b5Var222.b(tLObject, spannableStringBuilder, str3, false);
                    }
                } else {
                    TLRPC.Chat chat = jrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    tLObject2 = chat;
                    if (chat != null) {
                        publicUsername = ChatObject.getPublicUsername(chat);
                        tLObject = chat;
                        of.v1 v1Var2 = this.h;
                        size = v1Var2.g.size();
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
                        org.telegram.ui.Cells.b5 b5Var2222 = (org.telegram.ui.Cells.b5) view;
                        b5Var2222.setTag(Integer.valueOf(i9));
                        b5Var2222.b(tLObject, spannableStringBuilder, str3, false);
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
        of.v1 v1Var22 = this.h;
        size = v1Var22.g.size();
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
        org.telegram.ui.Cells.b5 b5Var22222 = (org.telegram.ui.Cells.b5) view;
        b5Var22222.setTag(Integer.valueOf(i9));
        b5Var22222.b(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        jr jrVar = this.y;
        if (i9 != 0) {
            b6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.c, 26, b6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.c, null, jrVar.a1 == 0);
            b5Var.C = true;
            b5Var.setDelegate(new gr(this));
            view = b5Var;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
