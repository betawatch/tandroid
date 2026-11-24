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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k22 extends p02 implements tjb, gk7, x74 {
    public boolean E;
    public final e22 F;
    public final g22 G;
    public final g24 H;
    public final w02 I;
    public final t02 J;
    public b22 K;
    public boolean L;
    public final fm0 n;
    public final FrameLayout r;
    public final fu s;
    public final z12 w;
    public final HashMap x;
    public final ArrayList y;

    public k22(x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        this.n = new fm0(0, this, s33.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new g22(this, context);
        w02 w02Var = new w02(bkb.c6, wjbVar, context);
        this.I = w02Var;
        w02Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        t02 t02Var = new t02(this.b, wjbVar, context);
        this.J = t02Var;
        t02Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        String M0 = k96.M0(2131745575, null);
        l7 l7Var = t02Var.r;
        l7Var.setHint(M0);
        byte b = 8;
        l7Var.addTextChangedListener(new b7(this, b));
        frameLayout.addView(w02Var, nme.g());
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gl.m;
        frameLayout.addView(t02Var, d);
        g24 g24Var = new g24(context, wjbVar);
        this.H = g24Var;
        g24Var.c();
        g24Var.setText(k96.M0(2131748031, null));
        addView(g24Var, nme.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        fu fuVar = new fu(this, context, wjbVar, b);
        this.s = fuVar;
        setBlur3Capture(fuVar);
        this.d = fuVar;
        this.h = true;
        this.f = true;
        fuVar.r1();
        fuVar.setClipToPadding(false);
        getContext();
        z12 z12Var = new z12(this, gl.L(9.0f), fuVar, (byte) 0);
        this.w = z12Var;
        fuVar.setLayoutManager(z12Var);
        z12Var.P = false;
        fuVar.setHorizontalScrollBarEnabled(false);
        fuVar.setVerticalScrollBarEnabled(false);
        fuVar.setClipToPadding(false);
        addView(fuVar, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e22 e22Var = new e22(this, context);
        this.F = e22Var;
        fuVar.setAdapter(e22Var);
        zkb.l(fuVar, 21, bkb.z5, wjbVar);
        fuVar.setOnItemClickListener(new k0(this, wjbVar, (byte) 9));
        fuVar.setOnScrollListener(new y(this, (byte) 18));
        fuVar.setOnItemLongClickListener(new w12(this));
        FrameLayout.LayoutParams e = nme.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += gl.m;
        addView(frameLayout, e);
        kk7.f(this.b.G3).b(this, kk7.N);
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        fu fuVar = this.s;
        if (fuVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        if (y29Var == null) {
            return -1000;
        }
        int paddingTop = fuVar.getPaddingTop();
        if (y29Var.b() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    @Override // p02
    public final void C(int i, int i2) {
        int i3;
        x02 x02Var = this.b;
        if (x02Var.o3.Q() > gl.L(20.0f)) {
            i3 = gl.L(8.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    x02Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            x02Var.r0 = true;
        }
        this.s.q1(0, i3 + gl.m, 0, this.e);
    }

    @Override // p02
    public final void I(p02 p02Var) {
        this.w.g1(0, 0);
    }

    @Override // p02
    public final void K() {
        this.s.z0(0);
    }

    @Override // p02
    public final boolean M(final boolean z, final int i, int i2, final long j, final boolean z2) {
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
            arrayList.add(R(hashMap.get((a22) obj)));
        }
        x02 x02Var = this.b;
        return ij.Y(x02Var.G3, x02Var.V0(), x02Var.R0() + arrayList.size(), new p8c() { // from class: x12
            @Override // p8c
            public final void a(Object obj2) {
                k22 k22Var = k22.this;
                b22 b22Var = k22Var.K;
                x02 x02Var2 = k22Var.b;
                String obj3 = x02Var2.U0().getText().toString();
                ((Long) obj2).getClass();
                b22Var.a(arrayList, obj3, z, i, j, z2);
                x02Var2.dismiss();
            }
        }, 0L);
    }

    public final void Q(j22 j22Var, Object obj) {
        boolean z;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a0 = k96.a0("AttachContactsSlowMode", null, 2131753975, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = k96.M0(R.string.AppName, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = a0;
            b00.t(null, 2131747638, alertDialog$Builder, null);
            return;
        }
        a22 a = a22.a(obj);
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
        wf2 wf2Var = j22Var.d;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, true);
        this.b.F1(z ? 1 : 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_userContact_old2 R(Object obj) {
        String str;
        nu2 nu2Var;
        String str2;
        ArrayList arrayList;
        ArrayList<TLRPC.RestrictionReason> arrayList2;
        int lastIndexOf;
        if (obj instanceof nu2) {
            nu2Var = (nu2) obj;
            TLRPC.User user = nu2Var.m;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = nu2Var.i;
                str2 = nu2Var.j;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            nu2 nu2Var2 = new nu2();
            str = user2.first_name;
            nu2Var2.i = str;
            String str3 = user2.last_name;
            nu2Var2.j = str3;
            nu2Var2.e.add(user2.phone);
            nu2Var2.m = user2;
            nu2Var = nu2Var2;
            str2 = str3;
        }
        String m = qu2.m(0, str, str2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String str4 = nu2Var.b;
        if (str4 != null) {
            arrayList = gl.c2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.b.G3, true, arrayList3, m);
        } else {
            fl flVar = new fl();
            flVar.c = 0;
            String str5 = "TEL;MOBILE:+" + nu2Var.m.phone;
            flVar.b = str5;
            flVar.a.add(str5);
            arrayList4.add(flVar);
            arrayList = null;
        }
        TLRPC.User user3 = nu2Var.m;
        if (arrayList != null) {
            for (int i = 0; i < arrayList3.size(); i++) {
                fl flVar2 = (fl) arrayList3.get(i);
                if (flVar2.c == 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList4.size()) {
                            arrayList4.add(flVar2);
                            break;
                        }
                        if (((fl) arrayList4.get(i2)).c(false).equals(flVar2.c(false))) {
                            flVar2.d = false;
                            break;
                        }
                        i2++;
                    }
                } else {
                    arrayList5.add(flVar2);
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
                StringBuilder sb = tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", qu2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
                lastIndexOf = sb.lastIndexOf("END:VCARD");
                if (lastIndexOf >= 0) {
                    tL_userContact_old2.phone = null;
                    for (int size = arrayList4.size() - 1; size >= 0; size--) {
                        fl flVar3 = (fl) arrayList4.get(size);
                        boolean z = flVar3.d;
                        ArrayList arrayList6 = flVar3.a;
                        if (z) {
                            if (tL_userContact_old2.phone == null) {
                                tL_userContact_old2.phone = flVar3.c(false);
                            }
                            for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                                sb.insert(lastIndexOf, ((String) arrayList6.get(i3)) + "\n");
                            }
                        }
                    }
                    for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                        fl flVar4 = (fl) arrayList5.get(size2);
                        boolean z2 = flVar4.d;
                        ArrayList arrayList7 = flVar4.a;
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

    public final void S() {
        this.H.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        T();
    }

    public final void T() {
        View childAt;
        g24 g24Var = this.H;
        if (g24Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        g24Var.setTranslationY((childAt.getTop() + (g24Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.p5));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        e22 e22Var;
        if (i != kk7.N || (e22Var = this.F) == null) {
            return;
        }
        e22Var.f();
    }

    @Override // p02
    public int getCurrentItemTop() {
        fu fuVar = this.s;
        if (fuVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        int top = (childAt.getTop() - gl.m) - gl.L(8.0f);
        int i = (top <= 0 || y29Var == null || y29Var.b() != 0) ? 0 : top;
        fm0 fm0Var = this.n;
        if (top < 0 || y29Var == null || y29Var.b() != 0) {
            fm0Var.a(true, true);
            top = i;
        } else {
            fm0Var.a(false, true);
        }
        this.r.setTranslationY(top);
        return gl.L(12.0f) + top;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(4.0f) + getListTopPadding();
    }

    @Override // p02
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
            arrayList.add(R(hashMap.get((a22) obj)));
        }
        return arrayList;
    }

    @Override // p02
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override // p02
    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        int i = bkb.p5;
        arrayList.add(new blb(this.s, 0, new Class[]{j22.class}, new String[]{"nameTextView"}, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        T();
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            w02 w02Var = this.I;
            w02Var.setAlpha(f);
            w02Var.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // p02
    public final void q() {
        kk7.f(this.b.G3).n(this, kk7.N);
    }

    public void setDelegate(b22 b22Var) {
        this.K = b22Var;
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.L = z;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(kl0 kl0Var) {
        t02 t02Var = this.J;
        if (t02Var != null) {
            t02Var.setupBlurredBackground(kl0Var.c(t02Var, nod.a(this.a), false));
        }
    }

    @Override // tjb
    public final void updateColors() {
        try {
            t02 t02Var = this.J;
            if (t02Var != null) {
                t02Var.updateColors();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
