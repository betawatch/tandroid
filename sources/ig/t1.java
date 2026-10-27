package ig;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class t1 extends mm0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public a2 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        a2 a2Var = this.f;
        int size3 = a2Var.e.size();
        int size4 = a2Var.j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.H.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return a2Var.j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return a2Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.r) {
            this.f.g(null, true, false, this.s, this.v, this.x, this.w, 0, 0);
        }
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.n = timer2;
        timer2.schedule(new r1(this, str, 0), 200L, 300L);
    }

    @Override // s4.h0
    public final int h() {
        a2 a2Var = this.f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = a2Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = a2Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof ContactsController.Contact ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        boolean z10;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                z3 z3Var = (z3) view;
                if (i10 == this.J) {
                    z3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i10) == null) {
                    z3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    z3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i10);
                ((m6) view).s(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), wh.g(new StringBuilder("+"), contact.shortPhones.get(0), kf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            v8 v8Var = (v8) view;
            v8Var.g(-1, y6.o6);
            v8Var.k(LocaleController.formatString(R.string.AddContactByPhone, kf.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i10);
        if (tLObject != null) {
            CharSequence charSequence3 = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = UserObject.getPublicUsername(user);
                if (str != null && this.I != null && !str.toLowerCase().contains(this.I.toLowerCase()) && user.usernames != null) {
                    for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i12);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.I.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j10 = user.id;
                z10 = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = ChatObject.getPublicUsername(chat);
                j10 = chat.id;
                z10 = false;
            } else {
                j10 = 0;
                z10 = false;
                str = null;
            }
            long j11 = j10;
            if (i10 < this.d.size()) {
                CharSequence charSequence4 = (CharSequence) this.e.get(i10);
                charSequence = charSequence4;
                charSequence = charSequence4;
                if (charSequence4 != null && str != null) {
                    charSequence = charSequence4;
                    if (str.length() > 0) {
                        boolean startsWith = charSequence4.toString().startsWith("@".concat(str));
                        charSequence = charSequence4;
                        if (startsWith) {
                            charSequence2 = charSequence4;
                            m6 m6Var = (m6) view;
                            if (z10) {
                                charSequence3 = LocaleController.getString(R.string.SavedMessages);
                            }
                            m6Var.s(tLObject, null, charSequence3, charSequence2, false, z10);
                            m6Var.r(this.h.h(j11) >= 0, false);
                        }
                    }
                }
            } else if (i10 <= this.d.size() || str == null) {
                charSequence = null;
            } else {
                String str3 = this.f.c;
                if (str3 != null && str3.startsWith("@")) {
                    str3 = str3.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) str);
                    if (str3 != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, str3)) != -1) {
                        int length = str3.length();
                        if (indexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            indexOfIgnoreCase++;
                        }
                        spannableStringBuilder.setSpan(new p10(y6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = null;
                    charSequence3 = spannableStringBuilder;
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence2 = str;
                }
            }
            charSequence2 = charSequence3;
            charSequence3 = charSequence;
            m6 m6Var2 = (m6) view;
            if (z10) {
            }
            m6Var2.s(tLObject, null, charSequence3, charSequence2, false, z10);
            m6Var2.r(this.h.h(j11) >= 0, false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            m6 m6Var = new m6(context, null);
            m6Var.M0 = true;
            m6Var.E0 = true;
            view = m6Var;
        } else if (i10 == 1) {
            z3 z3Var = new z3(context, 26, null);
            z3Var.setNoBackground(true);
            view = z3Var;
        } else if (i10 == 3) {
            m6 m6Var2 = new m6(context, null);
            m6Var2.M0 = true;
            m6Var2.E0 = true;
            view = m6Var2;
        } else if (i10 == 4) {
            View vnVar = new vn(context, 7);
            vnVar.setId(9);
            vnVar.setTag(-33024);
            view = vnVar;
        } else if (i10 != 5) {
            view = new v8(16, context, false);
        } else {
            c10 c10Var = new c10(context, null);
            c10Var.setIsSingleCell(true);
            c10Var.setViewType(29);
            f7.i(y6.d6, c10Var, null);
            view = c10Var;
        }
        return new wl0(view);
    }
}
