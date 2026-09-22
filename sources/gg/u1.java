package gg;

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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.zs;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class u1 extends xl0 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public c2 f;
    public a0.i h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        c2 c2Var = this.f;
        int size3 = c2Var.e.size();
        int size4 = c2Var.j.size();
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
            return c2Var.j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return c2Var.e.get(i12 - 1);
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
        timer2.schedule(new s1((zs) this, str, 0), 200L, 300L);
    }

    @Override // s4.h0
    public final int h() {
        c2 c2Var = this.f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = c2Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = c2Var.j.size();
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
                w3 w3Var = (w3) view;
                if (i10 == this.J) {
                    w3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i10) == null) {
                    w3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    w3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i10);
                ((j6) view).t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), rk.h(new StringBuilder("+"), contact.shortPhones.get(0), gf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            s8 s8Var = (s8) view;
            s8Var.e(-1, org.telegram.ui.ActionBar.j6.o6);
            s8Var.i(LocaleController.formatString(R.string.AddContactByPhone, gf.b.c().b("+" + str2)), false);
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
                            j6 j6Var = (j6) view;
                            if (z10) {
                                charSequence3 = LocaleController.getString(R.string.SavedMessages);
                            }
                            j6Var.t(tLObject, null, charSequence3, charSequence2, false, z10);
                            j6Var.s(this.h.h(j10) >= 0, false);
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
                        spannableStringBuilder.setSpan(new e10(org.telegram.ui.ActionBar.j6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            j6 j6Var2 = (j6) view;
            if (z10) {
            }
            j6Var2.t(tLObject, null, charSequence3, charSequence2, false, z10);
            j6Var2.s(this.h.h(j10) >= 0, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            j6 j6Var = new j6(context, null);
            j6Var.M0 = true;
            j6Var.E0 = true;
            view = j6Var;
        } else if (i10 == 1) {
            w3 w3Var = new w3(context, 26, null);
            w3Var.setNoBackground(true);
            view = w3Var;
        } else if (i10 == 3) {
            j6 j6Var2 = new j6(context, null);
            j6Var2.M0 = true;
            j6Var2.E0 = true;
            view = j6Var2;
        } else if (i10 == 4) {
            View knVar = new kn(context, 7);
            knVar.setId(9);
            knVar.setTag(-33024);
            view = knVar;
        } else if (i10 != 5) {
            view = new s8(16, context, false);
        } else {
            t00 t00Var = new t00(context, null);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(29);
            t00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = t00Var;
        }
        return new il0(view);
    }
}
