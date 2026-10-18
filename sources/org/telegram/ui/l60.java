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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l60 extends org.telegram.ui.Components.ql0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final /* synthetic */ n60 I;
    public final Context c;
    public final hg.a2 f;
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

    public l60(n60 n60Var, Context context) {
        TLRPC.Chat chat;
        TLRPC.User user;
        this.I = n60Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = n60Var.getContactsController();
        boolean z10 = n60Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = n60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.r.add(user2);
                hashSet.add(Long.valueOf(user2.id));
            }
        }
        if (n60Var.P || n60Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = n60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (user = n60Var.getMessagesController().getUser(Long.valueOf(dialog.id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.id) && !MessagesController.isSupportUser(user)) {
                        this.r.add(user);
                        hashSet.add(Long.valueOf(user.id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.id) && (chat = n60Var.getMessagesController().getChat(Long.valueOf(-dialog2.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.r.add(chat);
                    }
                }
            }
            Collections.sort(this.r, new h60());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i13);
                if (tLObject != null) {
                    String a2 = h60.a(tLObject);
                    String substring = TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1);
                    String a10 = h60.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1))) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.r;
                String a11 = h60.a(tLObject2);
                arrayList2.add(i13, new m60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        hg.a2 a2Var = new hg.a2(false);
        this.f = a2Var;
        a2Var.a = new wt(this, 11);
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f == 0) {
            return false;
        }
        n60 n60Var = this.I;
        if (n60Var.J == null) {
            return true;
        }
        View view = b1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.f4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.f4) view).getObject();
        return !(object instanceof TLRPC.User) || n60Var.J.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.ql0
    public final String F(int i10) {
        String str;
        String str2;
        if (this.n || i10 < this.E) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i11 = this.E;
        if (i10 >= size + i11) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
        if (tLObject instanceof m60) {
            return ((m60) tLObject).a;
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

    @Override // org.telegram.ui.Components.ql0
    public final void G(org.telegram.ui.Components.im0 im0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
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
        hg.a2 a2Var = this.f;
        n60 n60Var = this.I;
        a2Var.g(null, true, n60Var.O || n60Var.P, false, false, 0L, false, 0, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        k60 k60Var = new k60(this, str, 0);
        this.h = k60Var;
        dispatchQueue.postRunnable(k60Var, 300L);
    }

    @Override // s4.g0
    public final int h() {
        int i10;
        n60 n60Var = this.I;
        long j10 = n60Var.H;
        long j11 = n60Var.G;
        this.G = -1;
        this.s = -1;
        this.w = -1;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        if (this.n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f;
            int size2 = a2Var.d.size();
            int size3 = a2Var.e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.H = i11;
            return i11;
        }
        if (n60Var.Q) {
            this.w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (n60Var.V) {
            int i12 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.x = i12;
        } else if (n60Var.W) {
            int i13 = i10 + 1;
            this.v = i10;
            this.s = i10;
            i10 += 2;
            this.y = i13;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.r.size() + i10;
        if (n60Var.R) {
            if (j11 != 0) {
                this.F = ChatObject.canUserDoAdminAction(n60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = n60Var.getMessagesController().getChat(Long.valueOf(j10));
                this.F = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override // s4.g0
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
        if (this.F != 0 && i10 == 0) {
            return 2;
        }
        if (this.G == i10) {
            return 3;
        }
        int i11 = i10 - this.E;
        if (i11 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i11 >= arrayList.size() || !(arrayList.get(i10 - this.E) instanceof m60)) ? 1 : 0;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        this.I.r0();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String publicUsername;
        int i11 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.r;
        n60 n60Var = this.I;
        if (i11 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (this.n) {
                u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
            } else if (i10 == this.s) {
                u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
            } else {
                int i12 = i10 - this.E;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                    if (tLObject2 instanceof m60) {
                        u3Var.setText(((m60) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i10 == this.v) {
                u3Var.b((n60Var.X == null && n60Var.Z.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new y50(this, 1));
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i10 == this.w) {
                q8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                q8Var.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                return;
            } else if (this.F == 2) {
                q8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                q8Var.e(org.telegram.ui.ActionBar.h6.m6, org.telegram.ui.ActionBar.h6.G6);
                return;
            } else {
                q8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                q8Var.e(org.telegram.ui.ActionBar.h6.m6, org.telegram.ui.ActionBar.h6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        CharSequence charSequence3 = null;
        if (this.n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f;
            ArrayList arrayList2 = a2Var.e;
            ArrayList arrayList3 = a2Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 > (size2 + size) + size3) ? null : (TLObject) a2Var.e.get(((i10 - size) - size3) - 1) : (TLObject) arrayList3.get(i10 - size) : (TLObject) this.d.get(i10);
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
                    String str = a2Var.c;
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
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
                f4Var.r = true;
                f4Var.f = "premium";
                f4Var.a.setImageDrawable(org.telegram.ui.Cells.f4.b(f4Var.getContext(), false));
                f4Var.b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.j5 j5Var = f4Var.c;
                int i13 = org.telegram.ui.ActionBar.h6.y6;
                j5Var.setTag(Integer.valueOf(i13));
                if (f4Var.K) {
                    i13 = org.telegram.ui.ActionBar.h6.og;
                }
                j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, f4Var.M));
                j5Var.setEmojiColor(j5Var.getTextColor());
                j5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                f4Var.c(n60Var.X != null, false);
                return;
            }
            if (i10 == this.y) {
                f4Var.s = true;
                f4Var.f = "miniapps";
                org.telegram.ui.Components.w9 w9Var = f4Var.a;
                f4Var.getContext();
                w9Var.setImageDrawable(org.telegram.ui.Cells.f4.a(false));
                f4Var.b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.j5 j5Var2 = f4Var.c;
                int i14 = org.telegram.ui.ActionBar.h6.y6;
                j5Var2.setTag(Integer.valueOf(i14));
                if (f4Var.K) {
                    i14 = org.telegram.ui.ActionBar.h6.og;
                }
                j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, f4Var.M));
                j5Var2.setEmojiColor(j5Var2.getTextColor());
                j5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                f4Var.c(n60Var.Y != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i10 - this.E);
            charSequence = null;
        }
        f4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = n60Var.J;
            if (hVar == null || hVar.h(j10) < 0) {
                f4Var.c(n60Var.Z.h(j10) >= 0, false);
                f4Var.setCheckBoxEnabled(true);
            } else {
                f4Var.c(true, false);
                f4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.c;
        if (i10 == 0) {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 == 1) {
            u3Var = new org.telegram.ui.Cells.f4(context, 1, 0, false);
        } else if (i10 != 3) {
            u3Var = new org.telegram.ui.Cells.q8(context);
        } else {
            org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(context, null, 0, null, 1);
            o70Var.setLayoutParams(new s4.o0(-1, -1));
            o70Var.e.setVisibility(8);
            o70Var.d.setText(LocaleController.getString(R.string.NoContacts));
            o70Var.setAnimateLayoutChange(true);
            u3Var = o70Var;
        }
        return new org.telegram.ui.Components.sl0(u3Var);
    }
}
