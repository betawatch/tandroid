package of;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class o1 extends vk0 {
    public int A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public String E;
    public int F;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public v1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 2 || i9 == 3;
    }

    public final Object E(int i9) {
        int size = this.d.size();
        int size2 = this.D.size();
        v1 v1Var = this.f;
        int size3 = v1Var.e.size();
        int size4 = v1Var.j.size();
        if (i9 >= 0 && i9 < size) {
            return this.d.get(i9);
        }
        int i10 = i9 - size;
        if (size2 > 0) {
            if (i10 == 0) {
                return null;
            }
            if (i10 > 0 && i10 <= size2) {
                return this.D.get(i10 - 1);
            }
            i10 -= size2 + 1;
        }
        if (i10 >= 0 && i10 < size4) {
            return v1Var.j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return v1Var.e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.d.clear();
        this.D.clear();
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
        timer2.schedule(new m1(this, str, 0), 200L, 300L);
    }

    @Override // f2.r0
    public final int h() {
        v1 v1Var = this.f;
        this.F = -1;
        int size = this.d.size();
        if (!this.D.isEmpty()) {
            this.F = size;
            size += this.D.size() + 1;
        }
        int size2 = v1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = v1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // f2.r0
    public final int j(int i9) {
        Object E = E(i9);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof ContactsController.Contact ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        long j10;
        String str;
        long j11;
        boolean z10;
        CharSequence charSequence;
        CharSequence charSequence2;
        int indexOfIgnoreCase;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                v3 v3Var = (v3) view;
                if (i9 == this.F) {
                    v3Var.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (E(i9) == null) {
                    v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    v3Var.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) E(i9);
                ((h6) view).t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), ll.g(new StringBuilder("+"), contact.shortPhones.get(0), ne.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i9);
            p8 p8Var = (p8) view;
            p8Var.e(-1, f6.o6);
            p8Var.i(LocaleController.formatString(R.string.AddContactByPhone, ne.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i9);
        if (tLObject != null) {
            CharSequence charSequence3 = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = UserObject.getPublicUsername(user);
                if (str != null && this.E != null && !str.toLowerCase().contains(this.E.toLowerCase()) && user.usernames != null) {
                    for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i11);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.E.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                long j12 = user.id;
                z10 = user.self;
                j11 = j12;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str = ChatObject.getPublicUsername(chat);
                    j10 = chat.id;
                } else {
                    j10 = 0;
                    str = null;
                }
                j11 = j10;
                z10 = false;
            }
            if (i9 < this.d.size()) {
                CharSequence charSequence4 = (CharSequence) this.e.get(i9);
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
                            h6Var.s(this.h.h(j11) >= 0, false);
                        }
                    }
                }
            } else if (i9 <= this.d.size() || str == null) {
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
                        spannableStringBuilder.setSpan(new p00(f6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = null;
                    charSequence3 = spannableStringBuilder;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    charSequence2 = str;
                }
            }
            charSequence2 = charSequence3;
            charSequence3 = charSequence;
            h6 h6Var2 = (h6) view;
            if (z10) {
            }
            h6Var2.t(tLObject, null, charSequence3, charSequence2, false, z10);
            h6Var2.s(this.h.h(j11) >= 0, false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = this.c;
        if (i9 == 0) {
            h6 h6Var = new h6(context, null);
            h6Var.I0 = true;
            h6Var.A0 = true;
            view = h6Var;
        } else if (i9 == 1) {
            v3 v3Var = new v3(context, 26, null);
            v3Var.setNoBackground(true);
            view = v3Var;
        } else if (i9 == 3) {
            h6 h6Var2 = new h6(context, null);
            h6Var2.I0 = true;
            h6Var2.A0 = true;
            view = h6Var2;
        } else if (i9 == 4) {
            View anVar = new an(context, 8);
            anVar.setId(9);
            anVar.setTag(-33024);
            view = anVar;
        } else if (i9 != 5) {
            view = new p8(16, context, false);
        } else {
            e00 e00Var = new e00(context, null);
            e00Var.setIsSingleCell(true);
            e00Var.setViewType(29);
            e00Var.setBackgroundColor(f6.w0(null, f6.d6, false));
            view = e00Var;
        }
        return new ik0(view);
    }
}
