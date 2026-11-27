// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hea extends c79 {
    public int H;
    public gea I;
    public int K;
    public final /* synthetic */ kea L;
    public final Context c;
    public final fea e;
    public eea f;
    public eea h;
    public String n;
    public int r;
    public int s;
    public int w;
    public ArrayList d = new ArrayList();
    public int x = -1;
    public int y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public hea(kea keaVar, Context context) {
        this.L = keaVar;
        this.c = context;
        fea feaVar = new fea(false);
        this.e = feaVar;
        feaVar.a = new i09((Object) this, (byte) 12);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return (i == 1 || i == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            eea eeaVar = this.h;
            if (eeaVar != null) {
                hl.r(eeaVar);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.L.E0(true);
            byte b = 0;
            if (TextUtils.isEmpty(str)) {
                this.L.I0();
                this.r = -1;
                this.J = false;
            } else {
                this.J = true;
                int i = this.r + 1;
                this.r = i;
                this.L.L1.e(true, true);
                to3 to3Var = Utilities.g;
                eea eeaVar2 = new eea(this, str, i, b);
                this.f = eeaVar2;
                to3Var.d(eeaVar2, 300L);
            }
            this.L.E0(false);
        }
    }

    @Override // j79
    public final int b() {
        this.H = 0;
        this.x = -1;
        this.y = -1;
        this.F = -1;
        this.G = -1;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        int i = this.H;
        if (!isEmpty) {
            int i2 = i + 1;
            this.H = i2;
            this.E = i;
            int size = this.e.d.size() + this.d.size() + i2;
            this.H = size;
            if (size == 1) {
                this.E = -1;
                this.H = 0;
                this.K = 0;
                return 0;
            }
            int i3 = size + 1;
            this.H = i3;
            this.G = size;
            this.K = i3;
            return i3;
        }
        this.E = i;
        this.H = i + 2;
        this.x = i + 1;
        kea keaVar = this.L;
        if (keaVar.z2.size() > 0) {
            int i4 = this.H;
            int i5 = i4 + 1;
            this.H = i5;
            this.y = i4;
            this.F = i5;
            this.H = keaVar.z2.size() + i5;
        }
        int i6 = this.H;
        int i7 = i6 + 1;
        this.H = i7;
        this.G = i6;
        this.K = i7;
        return i7;
    }

    @Override // j79
    public final int d(int i) {
        if (i == this.G) {
            return 4;
        }
        if (i == this.E) {
            return 1;
        }
        if (i == this.x) {
            return 2;
        }
        if (i == this.y) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    @Override // j79
    public final void t(f89 f89Var, int i) {
        long j;
        String str;
        String str2;
        long j2;
        int y1;
        TLObject tLObject;
        CharSequence charSequence;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j3;
        int y12;
        kea keaVar = this.L;
        zh6 zh6Var = keaVar.P1;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0 && i2 != 5) {
            if (i2 == 2) {
                ((d79) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m = null;
        fea feaVar = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i3 = i - 1;
            int size = this.d.size();
            ArrayList arrayList = this.d;
            if (i3 < size) {
                zda zdaVar = (zda) arrayList.get(i3);
                j2 = zdaVar.a.id;
                str2 = zdaVar.d;
            } else {
                i3 -= arrayList.size();
                tLObject2 = (TLObject) feaVar.d.get(i3);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j = user.id;
                    str = lv2.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j = -chat.id;
                    str = chat.title;
                }
                String str3 = feaVar.c;
                if (TextUtils.isEmpty(str3) || str == null || (y1 = hl.y1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new ho4(aob.q6, keaVar.J0), y1, str3.length() + y1, 33);
                    str2 = spannableStringBuilder;
                }
                j2 = j;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof bv8) {
                bv8 bv8Var = (bv8) view;
                bv8Var.C(tLObject3, null, str2, null, false, false);
                bv8Var.N = i3 < b() + (-2);
                return;
            } else {
                String str4 = str2;
                if (view instanceof nea) {
                    ((nea) view).c(j2, zh6Var.h(j2) >= 0, str4);
                    return;
                }
                return;
            }
        }
        int i4 = this.F;
        if (i4 < 0 || i < i4) {
            tLObject = null;
            charSequence = null;
            tL_encryptedChat = null;
            j3 = 0;
        } else {
            TLObject tLObject4 = ((sl3) keaVar.z2.get(i - i4)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j3 = user2.id;
                m = lv2.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j3 = -chat2.id;
                m = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User X1 = uc7.s1(keaVar.a).X1(Long.valueOf(tL_encryptedChat2.user_id));
                    if (X1 != null) {
                        j3 = X1.id;
                        m = lv2.m(0, X1.first_name, X1.last_name);
                    }
                }
                j3 = 0;
            }
            String str5 = feaVar.c;
            if (TextUtils.isEmpty(str5) || m == null || (y12 = hl.y1(m.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m);
                spannableStringBuilder2.setSpan(new ho4(aob.q6, keaVar.J0), y12, str5.length() + y12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof bv8) {
            bv8 bv8Var2 = (bv8) view;
            bv8Var2.C(tLObject, tL_encryptedChat, charSequence, null, false, false);
            bv8Var2.N = i < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof nea) {
                ((nea) view).c(j3, zh6Var.h(j3) >= 0, charSequence2);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        kea keaVar = this.L;
        Context context = this.c;
        if (i == 0) {
            bv8 bv8Var = new bv8(context, keaVar.J0);
            bv8Var.G0 = true;
            bv8Var.n0 = true;
            view = bv8Var;
        } else if (i == 2) {
            qob qobVar = new qob(context, keaVar.J0, (byte) 11);
            qobVar.setItemAnimator(null);
            qobVar.setLayoutAnimation(null);
            as asVar = new as((byte) 17);
            asVar.i1(0);
            qobVar.setLayoutManager(asVar);
            gea geaVar = new gea(this, context, keaVar.a, keaVar.J0);
            this.I = geaVar;
            qobVar.setAdapter(geaVar);
            qobVar.setOnItemClickListener(new t39(this, (byte) 8));
            view = qobVar;
        } else if (i != 3) {
            byte b = 5;
            if (i == 4) {
                view = new nf9(b, context, this);
            } else if (i != 5) {
                View view2 = new View(context);
                view2.setLayoutParams(new r79(-1, hl.L((!keaVar.c2 || keaVar.j2[1] == null) ? 56.0f : 109.0f)));
                view = view2;
            } else {
                View neaVar = new nea(0, keaVar.J0, context);
                neaVar.setLayoutParams(new r79(-1, hl.L(100.0f)));
                view = neaVar;
            }
        } else {
            p55 p55Var = new p55(context, keaVar.J0);
            p55Var.setTextColor(aob.f7);
            yob.h(aob.e7, keaVar.J0, p55Var);
            p55Var.setText(ob6.M0(2131746097, null));
            view = p55Var;
        }
        return new n69(view);
    }
}
