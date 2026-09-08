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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class u1 extends kl0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public b2 f;
    public a0.i h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        b2 b2Var = this.f;
        int size3 = b2Var.e.size();
        int size4 = b2Var.j.size();
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
            return b2Var.j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return b2Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
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
        timer2.schedule(new s1(this, str, 0), 200L, 300L);
    }

    @Override // s4.h0
    public final int h() {
        b2 b2Var = this.f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = b2Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = b2Var.j.size();
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
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        long j3;
        String str;
        long j10;
        boolean z10;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        int i11 = c1Var.f;
        View view = c1Var.a;
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
                ((h6) view).t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), org.telegram.messenger.w1.j(new StringBuilder("+"), contact.shortPhones.get(0), gf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            r8 r8Var = (r8) view;
            r8Var.e(-1, j6.o6);
            r8Var.i(LocaleController.formatString(R.string.AddContactByPhone, gf.b.c().b("+" + str2)), false);
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
                long j11 = user.id;
                z10 = user.self;
                j10 = j11;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str = ChatObject.getPublicUsername(chat);
                    j3 = chat.id;
                } else {
                    j3 = 0;
                    str = null;
                }
                j10 = j3;
                z10 = false;
            }
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
                            h6Var.t(tLObject, null, charSequence3, charSequence2, false, z10);
                            h6Var.s(this.h.h(j10) >= 0, false);
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
                        spannableStringBuilder.setSpan(new e10(j6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = null;
                    charSequence3 = spannableStringBuilder;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    charSequence2 = str;
                }
            }
            charSequence2 = charSequence3;
            charSequence3 = charSequence;
            h6 h6Var2 = (h6) view;
            if (z10) {
            }
            h6Var2.t(tLObject, null, charSequence3, charSequence2, false, z10);
            h6Var2.s(this.h.h(j10) >= 0, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
            View jnVar = new jn(context, 7);
            jnVar.setId(9);
            jnVar.setTag(-33024);
            view = jnVar;
        } else if (i10 != 5) {
            view = new r8(16, context, false);
        } else {
            t00 t00Var = new t00(context, null);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(29);
            t00Var.setBackgroundColor(j6.w0(null, j6.d6, false));
            view = t00Var;
        }
        return new vk0(view);
    }
}
