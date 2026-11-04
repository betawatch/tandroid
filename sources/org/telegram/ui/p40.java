package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p40 extends org.telegram.ui.Components.zi0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ r40 J;
    public final Context c;
    public final kg.v1 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public p40(r40 r40Var, Context context) {
        TLRPC.Chat M0;
        TLRPC.User a22;
        this.J = r40Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.g5 contactsController = r40Var.getContactsController();
        boolean z10 = r40Var.R;
        ArrayList arrayList = contactsController.f0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.User a23 = r40Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i3)).user_id));
            if (a23 != null && !a23.self && !a23.deleted) {
                this.r.add(a23);
                hashSet.add(Long.valueOf(a23.id));
            }
        }
        if (r40Var.Q || r40Var.P || z10) {
            ArrayList arrayList2 = r40Var.getMessagesController().y;
            if (z10) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.m5.E(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (a22 = r40Var.getMessagesController().a2(Long.valueOf(dialog.id))) != null && !org.telegram.messenger.l10.x(a22) && !org.telegram.messenger.l10.B(a22) && !org.telegram.messenger.l10.t(a22) && !org.telegram.messenger.l10.A(dialog.id) && !org.telegram.messenger.hp.F2(a22)) {
                        this.r.add(a22);
                        hashSet.add(Long.valueOf(a22.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.m5.z(dialog2.id) && (M0 = r40Var.getMessagesController().M0(Long.valueOf(-dialog2.id))) != null && M0.migrated_to == null && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                        this.r.add(M0);
                    }
                }
            }
            Collections.sort(this.r, new l40());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i12);
                if (tLObject != null) {
                    String a10 = l40.a(tLObject);
                    String substring = TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1);
                    String a11 = l40.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1))) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.r;
                String a12 = l40.a(tLObject2);
                arrayList3.add(i12, new q40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        kg.v1 v1Var = new kg.v1(false);
        this.f = v1Var;
        v1Var.a = new ur(this, 13);
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f == 0) {
            return false;
        }
        r40 r40Var = this.J;
        if (r40Var.K == null) {
            return true;
        }
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.h4) view).getObject();
        return !(object instanceof TLRPC.User) || r40Var.K.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        String str;
        String str2;
        if (this.n || i3 < this.F) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = this.F;
        if (i3 >= size + i10) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i3 - i10);
        if (tLObject instanceof q40) {
            return ((q40) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (org.telegram.messenger.bd.b0 == 1) {
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

    @Override // org.telegram.ui.Components.zi0
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        kg.v1 v1Var = this.f;
        r40 r40Var = this.J;
        v1Var.g(null, true, r40Var.P || r40Var.Q, false, false, 0L, false, 0, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.g;
        o40 o40Var = new o40(this, str, 0);
        this.h = o40Var;
        p5Var.e(o40Var, 300L);
    }

    @Override // u4.h0
    public final int b() {
        int i3;
        r40 r40Var = this.J;
        long j10 = r40Var.I;
        long j11 = r40Var.H;
        this.H = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        if (this.n) {
            int size = this.d.size();
            kg.v1 v1Var = this.f;
            int size2 = v1Var.d.size();
            int size3 = v1Var.e.size();
            int i10 = size + size2;
            if (size3 != 0) {
                i10 += size3 + 1;
            }
            this.I = i10;
            return i10;
        }
        if (r40Var.R) {
            this.x = 0;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (r40Var.W) {
            int i11 = i3 + 1;
            this.w = i3;
            this.s = i3;
            i3 += 2;
            this.y = i11;
        } else if (r40Var.X) {
            int i12 = i3 + 1;
            this.w = i3;
            this.s = i3;
            i3 += 2;
            this.E = i12;
        } else {
            this.w = i3;
        }
        this.F = i3;
        int size4 = this.r.size() + i3;
        if (r40Var.S) {
            if (j11 != 0) {
                this.G = org.telegram.messenger.t3.y(3, r40Var.getMessagesController().M0(Long.valueOf(j11))) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat M0 = r40Var.getMessagesController().M0(Long.valueOf(j10));
                this.G = (!org.telegram.messenger.t3.y(3, M0) || org.telegram.messenger.t3.t0(M0)) ? 0 : 2;
            } else {
                this.G = 0;
            }
            if (this.G != 0) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (this.n) {
            return i3 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i3 == this.x) {
            return 2;
        }
        if (i3 == this.s) {
            return 0;
        }
        if (i3 == this.y || i3 == this.E) {
            return 1;
        }
        if (this.G != 0 && i3 == 0) {
            return 2;
        }
        if (this.H == i3) {
            return 3;
        }
        int i10 = i3 - this.F;
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i10 >= arrayList.size() || !(arrayList.get(i3 - this.F) instanceof q40)) ? 1 : 0;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        this.J.w0();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String K;
        int i10 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.r;
        r40 r40Var = this.J;
        CharSequence charSequence3 = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (this.n) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131749543, null));
            } else if (i3 == this.s) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131746776, null));
            } else {
                int i11 = i3 - this.F;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i3 - this.F);
                    if (tLObject2 instanceof q40) {
                        x3Var.setText(((q40) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i3 == this.w) {
                x3Var.a((r40Var.Y == null && r40Var.a0.i()) ? "" : org.telegram.messenger.bd.M0(2131751458, null), new b40(this, r4 ? 1 : 0));
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i3 == this.x) {
                l8Var.o(R.drawable.menu_link_create2, org.telegram.messenger.bd.M0(2131749493, null), false);
                l8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                return;
            } else if (this.G == 2) {
                l8Var.o(R.drawable.msg_link2, org.telegram.messenger.bd.M0(2131752402, null), false);
                l8Var.g(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                return;
            } else {
                l8Var.o(R.drawable.msg_link2, org.telegram.messenger.bd.M0(2131749118, null), false);
                l8Var.g(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (this.n) {
            int size = this.d.size();
            kg.v1 v1Var = this.f;
            ArrayList arrayList2 = v1Var.e;
            ArrayList arrayList3 = v1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i3 < 0 || i3 >= size) ? (i3 < size || i3 >= size3 + size) ? (i3 <= size + size3 || i3 > (size2 + size) + size3) ? null : (TLObject) v1Var.e.get(((i3 - size) - size3) - 1) : (TLObject) arrayList3.get(i3 - size) : (TLObject) this.d.get(i3);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    K = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    K = org.telegram.messenger.t3.K((TLRPC.Chat) tLObject, false);
                }
                if (i3 < size) {
                    charSequence2 = (CharSequence) this.e.get(i3);
                    if (charSequence2 != null && !TextUtils.isEmpty(K)) {
                        if (charSequence2.toString().startsWith("@" + K)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i3 > size && !TextUtils.isEmpty(K)) {
                    String str = v1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) K);
                        int A1 = org.telegram.messenger.g0.A1(K, str);
                        if (A1 != -1) {
                            int length = str.length();
                            if (A1 == 0) {
                                length++;
                            } else {
                                A1++;
                            }
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.q6, null), A1, length + A1, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = K;
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
            if (i3 == this.y) {
                h4Var.r = true;
                h4Var.f = "premium";
                h4Var.a.setImageDrawable(org.telegram.ui.Cells.h4.b(h4Var.getContext(), false));
                h4Var.b.l(org.telegram.messenger.bd.M0(2131746788, null), false);
                org.telegram.ui.ActionBar.k5 k5Var = h4Var.c;
                int i12 = org.telegram.ui.ActionBar.k6.y6;
                k5Var.setTag(Integer.valueOf(i12));
                if (h4Var.L) {
                    i12 = org.telegram.ui.ActionBar.k6.ch;
                }
                org.telegram.ui.ActionBar.r6.Y(k5Var, i12, h4Var.N);
                k5Var.setEmojiColor(k5Var.getTextColor());
                k5Var.l(org.telegram.messenger.bd.M0(2131746786, null), false);
                h4Var.c(r40Var.Y != null, false);
                return;
            }
            if (i3 == this.E) {
                h4Var.s = true;
                h4Var.f = "miniapps";
                org.telegram.ui.Components.k9 k9Var = h4Var.a;
                h4Var.getContext();
                k9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.b.l(org.telegram.messenger.bd.M0(2131746814, null), false);
                org.telegram.ui.ActionBar.k5 k5Var2 = h4Var.c;
                int i13 = org.telegram.ui.ActionBar.k6.y6;
                k5Var2.setTag(Integer.valueOf(i13));
                if (h4Var.L) {
                    i13 = org.telegram.ui.ActionBar.k6.ch;
                }
                org.telegram.ui.ActionBar.r6.Y(k5Var2, i13, h4Var.N);
                k5Var2.setEmojiColor(k5Var2.getTextColor());
                k5Var2.l(org.telegram.messenger.bd.M0(2131746813, null), false);
                h4Var.c(r40Var.Z != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i3 - this.F);
            charSequence = null;
        }
        h4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = r40Var.K;
            if (hVar == null || hVar.h(j10) < 0) {
                h4Var.c(r40Var.a0.h(j10) >= 0, false);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View x3Var;
        Context context = this.c;
        if (i3 == 0) {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        } else if (i3 == 1) {
            x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        } else if (i3 != 3) {
            x3Var = new org.telegram.ui.Cells.l8(context);
        } else {
            org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(context, null, 0, null, 1);
            m50Var.setLayoutParams(new u4.p0(-1, -1));
            m50Var.e.setVisibility(8);
            m50Var.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
            m50Var.setAnimateLayoutChange(true);
            x3Var = m50Var;
        }
        return new org.telegram.ui.Components.bj0(x3Var);
    }
}
