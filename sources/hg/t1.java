package hg;

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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.un;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class t1 extends hm0 {
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

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
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

    @Override // s4.g0
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

    @Override // s4.g0
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        long j10;
        boolean z10;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                u3 u3Var = (u3) view;
                if (i10 == this.J) {
                    u3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i10) == null) {
                    u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    u3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i10);
                ((h6) view).u(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), kk.g(new StringBuilder("+"), contact.shortPhones.get(0), jf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            q8 q8Var = (q8) view;
            q8Var.e(-1, org.telegram.ui.ActionBar.h6.o6);
            q8Var.i(LocaleController.formatString(R.string.AddContactByPhone, jf.b.c().b("+" + str2)), false);
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
                            h6 h6Var = (h6) view;
                            if (z10) {
                                charSequence3 = LocaleController.getString(R.string.SavedMessages);
                            }
                            h6Var.u(tLObject, null, charSequence3, charSequence2, false, z10);
                            h6Var.t(this.h.h(j11) >= 0, false);
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
                        spannableStringBuilder.setSpan(new m10(org.telegram.ui.ActionBar.h6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            h6 h6Var2 = (h6) view;
            if (z10) {
            }
            h6Var2.u(tLObject, null, charSequence3, charSequence2, false, z10);
            h6Var2.t(this.h.h(j11) >= 0, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            h6 h6Var = new h6(context, null);
            h6Var.M0 = true;
            h6Var.E0 = true;
            view = h6Var;
        } else if (i10 == 1) {
            u3 u3Var = new u3(context, 26, null);
            u3Var.setNoBackground(true);
            view = u3Var;
        } else if (i10 == 3) {
            h6 h6Var2 = new h6(context, null);
            h6Var2.M0 = true;
            h6Var2.E0 = true;
            view = h6Var2;
        } else if (i10 == 4) {
            View unVar = new un(context, 7);
            unVar.setId(9);
            unVar.setTag(-33024);
            view = unVar;
        } else if (i10 != 5) {
            view = new q8(16, context, false);
        } else {
            b10 b10Var = new b10(context, null);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(29);
            b10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = b10Var;
        }
        return new sl0(view);
    }
}
