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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i60 extends org.telegram.ui.Components.gk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ k60 E;
    public final Context c;
    public final of.v1 f;
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

    public i60(k60 k60Var, Context context) {
        TLRPC.Chat chat;
        TLRPC.User user;
        this.E = k60Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = k60Var.getContactsController();
        boolean z10 = k60Var.M;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.User user2 = k60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i9).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.r.add(user2);
                hashSet.add(Long.valueOf(user2.id));
            }
        }
        if (k60Var.L || k60Var.K || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = k60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = allDialogs.get(i10);
                    if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = k60Var.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                        this.r.add(user);
                        hashSet.add(Long.valueOf(user.id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i11);
                    if (DialogObject.isChatDialog(dialog2.id) && (chat = k60Var.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.r.add(chat);
                    }
                }
            }
            Collections.sort(this.r, new e60());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i12);
                if (tLObject != null) {
                    String a2 = e60.a(tLObject);
                    String substring = TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1);
                    String a3 = e60.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a3) ? "" : a3.substring(0, 1))) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.r;
                String a10 = e60.a(tLObject2);
                arrayList2.add(i12, new j60(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        of.v1 v1Var = new of.v1(false);
        this.f = v1Var;
        v1Var.a = new wt(this, 11);
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f == 0) {
            return false;
        }
        k60 k60Var = this.E;
        if (k60Var.F == null) {
            return true;
        }
        View view = q1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.g4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.g4) view).getObject();
        return !(object instanceof TLRPC.User) || k60Var.F.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        String str;
        String str2;
        if (this.n || i9 < this.A) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = this.A;
        if (i9 >= size + i10) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i9 - i10);
        if (tLObject instanceof j60) {
            return ((j60) tLObject).a;
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

    @Override // org.telegram.ui.Components.gk0
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
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
        of.v1 v1Var = this.f;
        k60 k60Var = this.E;
        v1Var.g(null, true, k60Var.K || k60Var.L, false, false, 0L, false, 0, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        h60 h60Var = new h60(this, str, 0);
        this.h = h60Var;
        dispatchQueue.postRunnable(h60Var, 300L);
    }

    @Override // f2.r0
    public final int h() {
        int i9;
        k60 k60Var = this.E;
        long j10 = k60Var.D;
        long j11 = k60Var.C;
        this.C = -1;
        this.s = -1;
        this.w = -1;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        if (this.n) {
            int size = this.d.size();
            of.v1 v1Var = this.f;
            int size2 = v1Var.d.size();
            int size3 = v1Var.e.size();
            int i10 = size + size2;
            if (size3 != 0) {
                i10 += size3 + 1;
            }
            this.D = i10;
            return i10;
        }
        if (k60Var.M) {
            this.w = 0;
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (k60Var.R) {
            int i11 = i9 + 1;
            this.v = i9;
            this.s = i9;
            i9 += 2;
            this.x = i11;
        } else if (k60Var.S) {
            int i12 = i9 + 1;
            this.v = i9;
            this.s = i9;
            i9 += 2;
            this.y = i12;
        } else {
            this.v = i9;
        }
        this.A = i9;
        int size4 = this.r.size() + i9;
        if (k60Var.N) {
            if (j11 != 0) {
                this.B = ChatObject.canUserDoAdminAction(k60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = k60Var.getMessagesController().getChat(Long.valueOf(j10));
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

    @Override // f2.r0
    public final int j(int i9) {
        if (this.n) {
            return i9 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i9 == this.w) {
            return 2;
        }
        if (i9 == this.s) {
            return 0;
        }
        if (i9 == this.x || i9 == this.y) {
            return 1;
        }
        if (this.B != 0 && i9 == 0) {
            return 2;
        }
        if (this.C == i9) {
            return 3;
        }
        int i10 = i9 - this.A;
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i10 >= arrayList.size() || !(arrayList.get(i9 - this.A) instanceof j60)) ? 1 : 0;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        this.E.q0();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String publicUsername;
        int i10 = q1Var.f;
        View view = q1Var.a;
        ArrayList arrayList = this.r;
        k60 k60Var = this.E;
        if (i10 == 0) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (this.n) {
                v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
            } else if (i9 == this.s) {
                v3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
            } else {
                int i11 = i9 - this.A;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i9 - this.A);
                    if (tLObject2 instanceof j60) {
                        v3Var.setText(((j60) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i9 == this.v) {
                v3Var.b((k60Var.T == null && k60Var.V.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new q50(this, 2));
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i9 == this.w) {
                p8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                p8Var.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                return;
            } else if (this.B == 2) {
                p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                p8Var.e(org.telegram.ui.ActionBar.f6.m6, org.telegram.ui.ActionBar.f6.G6);
                return;
            } else {
                p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                p8Var.e(org.telegram.ui.ActionBar.f6.m6, org.telegram.ui.ActionBar.f6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        CharSequence charSequence3 = null;
        if (this.n) {
            int size = this.d.size();
            of.v1 v1Var = this.f;
            ArrayList arrayList2 = v1Var.e;
            ArrayList arrayList3 = v1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i9 < 0 || i9 >= size) ? (i9 < size || i9 >= size3 + size) ? (i9 <= size + size3 || i9 > (size2 + size) + size3) ? null : (TLObject) v1Var.e.get(((i9 - size) - size3) - 1) : (TLObject) arrayList3.get(i9 - size) : (TLObject) this.d.get(i9);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    publicUsername = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                }
                if (i9 < size) {
                    charSequence2 = (CharSequence) this.e.get(i9);
                    if (charSequence2 != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence2.toString().startsWith("@" + publicUsername)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i9 > size && !TextUtils.isEmpty(publicUsername)) {
                    String str = v1Var.c;
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
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            if (i9 == this.x) {
                g4Var.r = true;
                g4Var.f = "premium";
                g4Var.a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.h5 h5Var = g4Var.c;
                int i12 = org.telegram.ui.ActionBar.f6.y6;
                h5Var.setTag(Integer.valueOf(i12));
                if (g4Var.G) {
                    i12 = org.telegram.ui.ActionBar.f6.og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, g4Var.I));
                h5Var.setEmojiColor(h5Var.getTextColor());
                h5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                g4Var.c(k60Var.T != null, false);
                return;
            }
            if (i9 == this.y) {
                g4Var.s = true;
                g4Var.f = "miniapps";
                org.telegram.ui.Components.o9 o9Var = g4Var.a;
                g4Var.getContext();
                o9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.h5 h5Var2 = g4Var.c;
                int i13 = org.telegram.ui.ActionBar.f6.y6;
                h5Var2.setTag(Integer.valueOf(i13));
                if (g4Var.G) {
                    i13 = org.telegram.ui.ActionBar.f6.og;
                }
                h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, g4Var.I));
                h5Var2.setEmojiColor(h5Var2.getTextColor());
                h5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                g4Var.c(k60Var.U != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i9 - this.A);
            charSequence = null;
        }
        g4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = k60Var.F;
            if (hVar == null || hVar.h(j10) < 0) {
                g4Var.c(k60Var.V.h(j10) >= 0, false);
                g4Var.setCheckBoxEnabled(true);
            } else {
                g4Var.c(true, false);
                g4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View v3Var;
        Context context = this.c;
        if (i9 == 0) {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        } else if (i9 == 1) {
            v3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        } else if (i9 != 3) {
            v3Var = new org.telegram.ui.Cells.p8(context);
        } else {
            org.telegram.ui.Components.d60 d60Var = new org.telegram.ui.Components.d60(context, null, 0, null, 1);
            d60Var.setLayoutParams(new f2.a1(-1, -1));
            d60Var.e.setVisibility(8);
            d60Var.d.setText(LocaleController.getString(R.string.NoContacts));
            d60Var.setAnimateLayoutChange(true);
            v3Var = d60Var;
        }
        return new org.telegram.ui.Components.ik0(v3Var);
    }
}
