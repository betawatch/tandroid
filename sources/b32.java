// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b32 extends f12 implements snb, fn7, s84 {
    public boolean E;
    public final v22 F;
    public final x22 G;
    public final b34 H;
    public final m12 I;
    public final j12 J;
    public s22 K;
    public boolean L;
    public final fm0 n;
    public final FrameLayout r;
    public final gu s;
    public final q22 w;
    public final HashMap x;
    public final ArrayList y;

    public b32(n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        this.n = new fm0(0, this, k43.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new x22(this, context);
        m12 m12Var = new m12(aob.d6, vnbVar, context);
        this.I = m12Var;
        m12Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        j12 j12Var = new j12(this.b, vnbVar, context);
        this.J = j12Var;
        j12Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        String M0 = ob6.M0(2131745495, null);
        m7 m7Var = j12Var.r;
        m7Var.setHint(M0);
        byte b = 8;
        m7Var.addTextChangedListener(new c7(this, b));
        frameLayout.addView(m12Var, tre.g());
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += hl.m;
        frameLayout.addView(j12Var, d);
        b34 b34Var = new b34(context, vnbVar);
        this.H = b34Var;
        b34Var.c();
        b34Var.setText(ob6.M0(2131747954, null));
        addView(b34Var, tre.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        gu guVar = new gu(this, context, vnbVar, b);
        this.s = guVar;
        setBlur3Capture(guVar);
        this.d = guVar;
        this.h = true;
        this.f = true;
        guVar.s1();
        guVar.setClipToPadding(false);
        getContext();
        q22 q22Var = new q22(this, hl.L(9.0f), guVar, (byte) 0);
        this.w = q22Var;
        guVar.setLayoutManager(q22Var);
        q22Var.P = false;
        guVar.setHorizontalScrollBarEnabled(false);
        guVar.setVerticalScrollBarEnabled(false);
        guVar.setClipToPadding(false);
        addView(guVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        v22 v22Var = new v22(this, context);
        this.F = v22Var;
        guVar.setAdapter(v22Var);
        yob.l(guVar, 21, aob.A5, vnbVar);
        guVar.setOnItemClickListener(new l0(this, vnbVar, (byte) 9));
        guVar.setOnScrollListener(new y(this, (byte) 18));
        guVar.setOnItemLongClickListener(new n22(this));
        FrameLayout.LayoutParams e = tre.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += hl.m;
        addView(frameLayout, e);
        jn7.f(this.b.G3).b(this, jn7.N);
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        gu guVar = this.s;
        if (guVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        if (n69Var == null) {
            return -1000;
        }
        int paddingTop = guVar.getPaddingTop();
        if (n69Var.b() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    @Override // f12
    public final void C(int i, int i2) {
        int i3;
        n12 n12Var = this.b;
        if (n12Var.o3.Q() > hl.L(20.0f)) {
            i3 = hl.L(8.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    n12Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            n12Var.r0 = true;
        }
        this.s.r1(0, i3 + hl.m, 0, this.e);
    }

    @Override // f12
    public final void H(f12 f12Var) {
        this.w.g1(0, 0);
    }

    @Override // f12
    public final void J() {
        this.s.A0(0);
    }

    @Override // f12
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        HashMap hashMap = this.x;
        int i3 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(Q(hashMap.get((r22) obj)));
        }
        n12 n12Var = this.b;
        return jj.Y(n12Var.G3, n12Var.W0(), n12Var.S0() + arrayList.size(), new pcc() { // from class: o22
            @Override // pcc
            public final void a(Object obj2) {
                b32 b32Var = b32.this;
                s22 s22Var = b32Var.K;
                n12 n12Var2 = b32Var.b;
                String obj3 = n12Var2.V0().getText().toString();
                ((Long) obj2).getClass();
                s22Var.a(arrayList, obj3, z, i, j, z2);
                n12Var2.dismiss();
            }
        }, 0L);
    }

    public final void P(a32 a32Var, Object obj) {
        boolean z;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a0 = ob6.a0("AttachContactsSlowMode", null, 2131753971, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = ob6.M0(R.string.AppName, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = a0;
            c00.u(null, 2131747558, alertDialog$Builder, null);
            return;
        }
        r22 a = r22.a(obj);
        boolean containsKey = hashMap.containsKey(a);
        ArrayList arrayList = this.y;
        if (containsKey) {
            hashMap.remove(a);
            arrayList.remove(a);
            z = false;
        } else {
            hashMap.put(a, obj);
            arrayList.add(a);
            z = true;
        }
        og2 og2Var = a32Var.d;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, true);
        this.b.G1(z ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 Q(Object obj) {
        String str;
        iv2 iv2Var;
        String str2;
        ArrayList arrayList;
        ArrayList<TLRPC.RestrictionReason> arrayList2;
        int lastIndexOf;
        if (obj instanceof iv2) {
            iv2Var = (iv2) obj;
            TLRPC.User user = iv2Var.m;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = iv2Var.i;
                str2 = iv2Var.j;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            iv2 iv2Var2 = new iv2();
            str = user2.first_name;
            iv2Var2.i = str;
            String str3 = user2.last_name;
            iv2Var2.j = str3;
            iv2Var2.e.add(user2.phone);
            iv2Var2.m = user2;
            iv2Var = iv2Var2;
            str2 = str3;
        }
        String m = lv2.m(0, str, str2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str4 = iv2Var.b;
        if (str4 != null) {
            arrayList = hl.c2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.G3, true, arrayList3, m);
        } else {
            gl glVar = new gl();
            glVar.c = 0;
            String str5 = "TEL;MOBILE:+" + iv2Var.m.phone;
            glVar.b = str5;
            glVar.a.add(str5);
            arrayList4.add(glVar);
            arrayList = null;
        }
        TLRPC.User user3 = iv2Var.m;
        if (arrayList != null) {
            for (int i = 0; i < arrayList3.size(); i++) {
                gl glVar2 = (gl) arrayList3.get(i);
                if (glVar2.c == 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList4.size()) {
                            arrayList4.add(glVar2);
                            break;
                        }
                        if (((gl) arrayList4.get(i2)).c(false).equals(glVar2.c(false))) {
                            glVar2.d = false;
                            break;
                        }
                        i2++;
                    }
                } else {
                    arrayList5.add(glVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                TLRPC.User user4 = (TLRPC.User) arrayList.get(0);
                arrayList2 = user4.restriction_reason;
                if (TextUtils.isEmpty(str)) {
                    str = user4.first_name;
                    str2 = user4.last_name;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                if (user3 == null) {
                    tL_userContact_old2.id = user3.id;
                    tL_userContact_old2.access_hash = user3.access_hash;
                    tL_userContact_old2.photo = user3.photo;
                    tL_userContact_old2.status = user3.status;
                    tL_userContact_old2.first_name = user3.first_name;
                    tL_userContact_old2.last_name = user3.last_name;
                    tL_userContact_old2.phone = user3.phone;
                    if (arrayList2 != null) {
                        tL_userContact_old2.restriction_reason = arrayList2;
                    }
                } else {
                    tL_userContact_old2.first_name = str;
                    tL_userContact_old2.last_name = str2;
                }
                StringBuilder sb = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", lv2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                lastIndexOf = sb.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    for (int size = arrayList4.size() - 1; size >= 0; size--) {
                        gl glVar3 = (gl) arrayList4.get(size);
                        boolean z = glVar3.d;
                        ArrayList arrayList6 = glVar3.a;
                        if (z) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = glVar3.c(false);
                            }
                            for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                                sb.insert(lastIndexOf, ((String) arrayList6.get(i3)) + "\n");
                            }
                        }
                    }
                    for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                        gl glVar4 = (gl) arrayList5.get(size2);
                        boolean z2 = glVar4.d;
                        ArrayList arrayList7 = glVar4.a;
                        if (z2) {
                            for (int size3 = arrayList7.size() - 1; size3 >= 0; size3 += -1) {
                                sb.insert(lastIndexOf, ((String) arrayList7.get(size3)) + "\n");
                            }
                        }
                    }
                    tL_userContact_old2.restriction_reason.clear();
                    TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                    restrictionReason.text = sb.toString();
                    restrictionReason.reason = "";
                    restrictionReason.platform = "";
                    tL_userContact_old2.restriction_reason.add(restrictionReason);
                }
                return tL_userContact_old2;
            }
        }
        arrayList2 = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        if (user3 == null) {
        }
        if (tL_userContact_old22.restriction_reason.isEmpty()) {
        }
        lastIndexOf = sb.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
        }
        return tL_userContact_old22;
    }

    public final void R() {
        this.H.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        S();
    }

    public final void S() {
        View childAt;
        b34 b34Var = this.H;
        if (b34Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        b34Var.setTranslationY((childAt.getTop() + (b34Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.q5));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        v22 v22Var;
        if (i != jn7.N || (v22Var = this.F) == null) {
            return;
        }
        v22Var.f();
    }

    @Override // f12
    public int getCurrentItemTop() {
        gu guVar = this.s;
        if (guVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        int top = (childAt.getTop() - hl.m) - hl.L(8.0f);
        int i = (top <= 0 || n69Var == null || n69Var.b() != 0) ? 0 : top;
        fm0 fm0Var = this.n;
        if (top < 0 || n69Var == null || n69Var.b() != 0) {
            fm0Var.a(true, true);
            top = i;
        } else {
            fm0Var.a(false, true);
        }
        this.r.setTranslationY(top);
        return hl.L(12.0f) + top;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(4.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(Q(hashMap.get((r22) obj)));
        }
        return arrayList;
    }

    @Override // f12
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // f12
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        int i = aob.q5;
        arrayList.add(new apb(this.s, 0, new Class[]{a32.class}, new String[]{"nameTextView"}, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S();
    }

    @Override // f12
    public final void p() {
        jn7.f(this.b.G3).n(this, jn7.N);
    }

    public void setDelegate(s22 s22Var) {
        this.K = s22Var;
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.L = z;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(ll0 ll0Var) {
        j12 j12Var = this.J;
        if (j12Var != null) {
            j12Var.setupBlurredBackground(ll0Var.c(j12Var, dtd.a(this.a), false));
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            m12 m12Var = this.I;
            m12Var.setAlpha(f);
            m12Var.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // snb
    public final void updateColors() {
        try {
            j12 j12Var = this.J;
            if (j12Var != null) {
                j12Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
