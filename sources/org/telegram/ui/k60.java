package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k60 extends org.telegram.ui.Components.tk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ m60 E;
    public final Context c;
    public final rf.k1 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public k60(m60 m60Var, Context context) {
        TLRPC.Chat chat;
        TLRPC.User user;
        this.E = m60Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = m60Var.getContactsController();
        boolean z10 = m60Var.M;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = m60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.r.add(user2);
                hashSet.add(Long.valueOf(user2.id));
            }
        }
        if (m60Var.L || m60Var.K || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = m60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = m60Var.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                        this.r.add(user);
                        hashSet.add(Long.valueOf(user.id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.id) && (chat = m60Var.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.r.add(chat);
                    }
                }
            }
            Collections.sort(this.r, new g60());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i13);
                if (tLObject != null) {
                    String a2 = g60.a(tLObject);
                    String substring = TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1);
                    String a10 = g60.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1))) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.r;
                String a11 = g60.a(tLObject2);
                arrayList2.add(i13, new l60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        rf.k1 k1Var = new rf.k1(false);
        this.f = k1Var;
        k1Var.a = new xt(this, 11);
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.e4) {
            ((org.telegram.ui.Cells.e4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f == 0) {
            return false;
        }
        m60 m60Var = this.E;
        if (m60Var.F == null) {
            return true;
        }
        View view = n1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.e4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.e4) view).getObject();
        return !(object instanceof TLRPC.User) || m60Var.F.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        String str;
        String str2;
        if (this.n || i10 < this.A) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i11 = this.A;
        if (i10 >= size + i11) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
        if (tLObject instanceof l60) {
            return ((l60) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (LocaleController.nameDisplayOrder == 1) {
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
        }
        return "";
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = (int) (h() * f9);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        rf.k1 k1Var = this.f;
        m60 m60Var = this.E;
        k1Var.g(null, true, m60Var.K || m60Var.L, false, false, 0L, false, 0, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        j60 j60Var = new j60(this, str, 0);
        this.h = j60Var;
        dispatchQueue.postRunnable(j60Var, 300L);
    }

    @Override // f2.p0
    public final int h() {
        int i10;
        m60 m60Var = this.E;
        long j10 = m60Var.D;
        long j11 = m60Var.C;
        this.C = -1;
        this.s = -1;
        this.w = -1;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        if (this.n) {
            int size = this.d.size();
            rf.k1 k1Var = this.f;
            int size2 = k1Var.d.size();
            int size3 = k1Var.e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.D = i11;
            return i11;
        }
        if (m60Var.M) {
            this.w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (m60Var.R) {
            int i12 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.x = i12;
        } else if (m60Var.S) {
            int i13 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.y = i13;
        } else {
            this.v = i10;
        }
        this.A = i10;
        int size4 = this.r.size() + i10;
        if (m60Var.N) {
            if (j11 != 0) {
                this.B = ChatObject.canUserDoAdminAction(m60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = m60Var.getMessagesController().getChat(Long.valueOf(j10));
                this.B = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
            } else {
                this.B = 0;
            }
            if (this.B != 0) {
                this.A++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.C = 0;
            size4++;
        }
        this.D = size4;
        return size4;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (this.n) {
            return i10 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i10 == this.w) {
            return 2;
        }
        if (i10 == this.s) {
            return 0;
        }
        if (i10 == this.x || i10 == this.y) {
            return 1;
        }
        if (this.B != 0 && i10 == 0) {
            return 2;
        }
        if (this.C == i10) {
            return 3;
        }
        int i11 = i10 - this.A;
        if (i11 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i11 >= arrayList.size() || !(arrayList.get(i10 - this.A) instanceof l60)) ? 1 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        this.E.r0();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String publicUsername;
        int i11 = n1Var.f;
        View view = n1Var.a;
        ArrayList arrayList = this.r;
        m60 m60Var = this.E;
        if (i11 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (this.n) {
                s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
            } else if (i10 == this.s) {
                s3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
            } else {
                int i12 = i10 - this.A;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.A);
                    if (tLObject2 instanceof l60) {
                        s3Var.setText(((l60) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i10 == this.v) {
                s3Var.b((m60Var.T == null && m60Var.V.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new t50(this, 2));
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i10 == this.w) {
                m8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                m8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                return;
            } else if (this.B == 2) {
                m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                m8Var.e(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                return;
            } else {
                m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                m8Var.e(org.telegram.ui.ActionBar.g6.m6, org.telegram.ui.ActionBar.g6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
        CharSequence charSequence3 = null;
        if (this.n) {
            int size = this.d.size();
            rf.k1 k1Var = this.f;
            ArrayList arrayList2 = k1Var.e;
            ArrayList arrayList3 = k1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 > (size2 + size) + size3) ? null : (TLObject) k1Var.e.get(((i10 - size) - size3) - 1) : (TLObject) arrayList3.get(i10 - size) : (TLObject) this.d.get(i10);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    publicUsername = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                }
                if (i10 < size) {
                    charSequence2 = (CharSequence) this.e.get(i10);
                    if (charSequence2 != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence2.toString().startsWith("@" + publicUsername)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = k1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                        if (indexOfIgnoreCase != -1) {
                            int length = str.length();
                            if (indexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                indexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = publicUsername;
                    }
                }
                CharSequence charSequence4 = charSequence3;
                charSequence3 = charSequence2;
                charSequence = charSequence4;
            }
            charSequence2 = null;
            CharSequence charSequence42 = charSequence3;
            charSequence3 = charSequence2;
            charSequence = charSequence42;
        } else {
            if (i10 == this.x) {
                e4Var.r = true;
                e4Var.f = "premium";
                e4Var.a.setImageDrawable(org.telegram.ui.Cells.e4.b(e4Var.getContext(), false));
                e4Var.b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.h5 h5Var = e4Var.c;
                int i13 = org.telegram.ui.ActionBar.g6.y6;
                h5Var.setTag(Integer.valueOf(i13));
                if (e4Var.G) {
                    i13 = org.telegram.ui.ActionBar.g6.og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, e4Var.I));
                h5Var.setEmojiColor(h5Var.getTextColor());
                h5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                e4Var.c(m60Var.T != null, false);
                return;
            }
            if (i10 == this.y) {
                e4Var.s = true;
                e4Var.f = "miniapps";
                org.telegram.ui.Components.t9 t9Var = e4Var.a;
                e4Var.getContext();
                t9Var.setImageDrawable(org.telegram.ui.Cells.e4.a(false));
                e4Var.b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.h5 h5Var2 = e4Var.c;
                int i14 = org.telegram.ui.ActionBar.g6.y6;
                h5Var2.setTag(Integer.valueOf(i14));
                if (e4Var.G) {
                    i14 = org.telegram.ui.ActionBar.g6.og;
                }
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, e4Var.I));
                h5Var2.setEmojiColor(h5Var2.getTextColor());
                h5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                e4Var.c(m60Var.U != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i10 - this.A);
            charSequence = null;
        }
        e4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = m60Var.F;
            if (hVar == null || hVar.h(j10) < 0) {
                e4Var.c(m60Var.V.h(j10) >= 0, false);
                e4Var.setCheckBoxEnabled(true);
            } else {
                e4Var.c(true, false);
                e4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        Context context = this.c;
        if (i10 == 0) {
            s3Var = new org.telegram.ui.Cells.s3(context, null);
        } else if (i10 == 1) {
            s3Var = new org.telegram.ui.Cells.e4(context, 1, 0, false);
        } else if (i10 != 3) {
            s3Var = new org.telegram.ui.Cells.m8(context);
        } else {
            org.telegram.ui.Components.q60 q60Var = new org.telegram.ui.Components.q60(context, null, 0, null, 1);
            q60Var.setLayoutParams(new f2.x0(-1, -1));
            q60Var.e.setVisibility(8);
            q60Var.d.setText(LocaleController.getString(R.string.NoContacts));
            q60Var.setAnimateLayoutChange(true);
            s3Var = q60Var;
        }
        return new org.telegram.ui.Components.vk0(s3Var);
    }
}
